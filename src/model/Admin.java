package model;

import org.json.JSONArray;
import org.json.JSONObject;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.json.JSONTokener;

public class Admin {

// --- Atributos ---
    public String nome;
    public String sobrenome;
    public String cpf;
    public String rg;
    public String genero;
    public String dataNasc;
    public String telefone;
    public String endereco;
    public boolean estaLogado;
    public String usuarioConta;
    public String senhaConta;
    // Alterado para salvar no diretório raiz do projeto para simplificar a execução
    private static final String DB_PATH = "desbravadores.json"; 
    public Path path = Paths.get(DB_PATH);
    

// --- Construtor ---
    public Admin(String nome, String sobrenome, String cpf, String rg, String genero, String dataNasc, String telefone, String endereco, String usuario, String senha) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.rg = rg;
        this.genero = genero;
        this.dataNasc = dataNasc;
        this.telefone = telefone;
        this.endereco = endereco;
        this.usuarioConta = usuario;
        this.senhaConta = senha;
        this.estaLogado = false;
    }

    public Admin() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

// --- Métodos (Comportamentos) ---
    public boolean adminLogin(String usuario, String senha) {
        if (this.usuarioConta.equals(usuario) && this.senhaConta.equals(senha)) {
            this.estaLogado = true;
            System.out.println("Admin " + this.nome + " logado com sucesso.");
            return true;
        } else {
            System.out.println("Erro de login: Usuário ou senha incorretos.");
            return false;
        }
    }

    public void adminLogout() {
        this.estaLogado = false;
        System.out.println("Admin " + this.nome + " deslogado com sucesso.");
    }

    public void cadastrarDesbravador(Desbravador desbravador) {
       
        try {
            String dadosDb;
            JSONArray listaDesbravadores;

            // Lógica para inicializar a lista, lendo o arquivo existente ou criando um novo array vazio.
            if (Files.exists(this.path)) {
                dadosDb = Files.readString(this.path);
                listaDesbravadores = dadosDb.trim().isEmpty() ? new JSONArray() : new JSONArray(new JSONTokener(dadosDb));
            } else {
                listaDesbravadores = new JSONArray();
                System.out.println("Arquivo de banco de dados não encontrado. Criando novo arquivo: " + DB_PATH);
            }

            // Verifica se Desbravador com o mesmo CPF já existe
            Boolean usuarioExiste = false;
            String cpfNovoDesbravador = desbravador.getCpf();

            for (int i = 0; i < listaDesbravadores.length(); i++) {
                JSONObject d = listaDesbravadores.getJSONObject(i);
                if (d.has("cpf") && d.getString("cpf").equals(cpfNovoDesbravador)) {
                    usuarioExiste = true;
                    break;
                }
            }

            if (usuarioExiste) {
                System.out.println("Erro: Desbravador com o CPF " + desbravador.getCpf() + " já está cadastrado.");
                return;
            }

            // Cria objeto json do desbravador com todos os dados
            JSONObject obj = new JSONObject();
            obj.put("nome", desbravador.getNome());
            obj.put("sobrenome", desbravador.getSobrenome());
            obj.put("idade", desbravador.getIdade());
            obj.put("genero", String.valueOf(desbravador.getSexo())); // Salvando char como String
            obj.put("cpf", desbravador.getCpf());
            obj.put("rg", desbravador.getRg());

            // Adiciona obj na lista
            listaDesbravadores.put(obj);

            // Grava no arquivo com FileWriter
            try (FileWriter writer = new FileWriter(this.path.toFile())) {
                writer.write(listaDesbravadores.toString(2));
            }
            System.out.println("Desbravador salvo com sucesso: " + desbravador.getNome() + "!");

        } catch (IOException e) {
            System.err.println("Erro de IO ao manipular o arquivo JSON.");
            e.printStackTrace();
        } catch (org.json.JSONException e) {
             System.err.println("Erro ao processar o arquivo JSON. O arquivo pode estar corrompido ou vazio.");
             e.printStackTrace();
        }
    }

   public void editarDesbravador(Desbravador novosDados) {
    if (!estaLogado) {
        System.out.println("Erro: Admin não logado.");
        return;
    }

  

    try {
        if (!Files.exists(this.path)) {
            System.out.println("Erro: Banco de dados não encontrado.");
            return;
        }

         //Ler o conteúdo atual do arquivo JSON
        String dadosDb = Files.readString(this.path);
        JSONArray listaDesbravadores = new JSONArray(new JSONTokener(dadosDb));

        boolean encontrado = false;

        //Procurar o desbravador pelo CPF
        for (int i = 0; i < listaDesbravadores.length(); i++) {
            JSONObject d = listaDesbravadores.getJSONObject(i);

            if (d.has("cpf") && d.getString("cpf").equals(novosDados.getCpf())) {
                // Atualizar os dados
                d.put("nome", novosDados.getNome());
                d.put("sobrenome", novosDados.getSobrenome());
                d.put("idade", novosDados.getIdade());
                d.put("genero",novosDados.getSexo());
                d.put("cpf", novosDados.getCpf());
                d.put("rg", novosDados.getRg());
                encontrado = true;
                break;
            }
        }

         // Gravar novamente o JSON atualizado
        if (encontrado) {
            try (FileWriter writer = new FileWriter(this.path.toFile())) {
                writer.write(listaDesbravadores.toString(2));
            }
            System.out.println("✅ Desbravador com CPF " + novosDados.getCpf() + " editado com sucesso!");
        } else {
            System.out.println("⚠️ Nenhum desbravador encontrado com o CPF " + novosDados.getCpf() + ".");
        }

    } catch (IOException e) {
        System.err.println("Erro ao acessar o arquivo JSON.");
        e.printStackTrace();
    } catch (org.json.JSONException e) {
        System.err.println("Erro ao processar o arquivo JSON. O arquivo pode estar corrompido.");
        e.printStackTrace();
    }
}

   //começo o método e recebo como parâmetro o CPF do desbravador que quero excluir do arquivo JSON.
   public void deletarDesbravador(String cpfDesbravador) {
    
       //verifico se o administrador está logado.
       //Se não estiver, o método mostra uma mensagem de erro e para por aqui, sem fazer nada.
       if (!estaLogado) {
        System.out.println("Erro: Admin não logado.");
        return;
    }
  
 

    // Aqui verifico se o arquivo existe mesmo no projeto.
    //Se não existir, mostro a mensagem de erro e interrompo o processo.
    try {
        if (!Files.exists(this.path)) {
            System.out.println("Erro: Banco de dados não encontrado.");
            return;
        }

        // Leio todo o conteúdo do arquivo JSON como uma string (dadosDb).
        //Depois, converto essa string em um array JSON chamado listaDesbravadores.
        //Esse array contém todos os cadastros de desbravadores.
        String dadosDb = Files.readString(this.path);
        JSONArray listaDesbravadores = new JSONArray(new JSONTokener(dadosDb));
        
        
        // Crio uma variável booleana para saber se o desbravador foi encontrado ou não
        boolean encontrado = false;
        
        

        //Aqui começo um loop que vai passar por cada desbravador dentro do arquivo JSON.
        //Cada um é transformado em um objeto JSONObject (ou seja, um desbravador individual).
        for (int i = 0; i < listaDesbravadores.length(); i++) {
            JSONObject d = listaDesbravadores.getJSONObject(i);
            
            
            
            //Dentro do loop, verifico se aquele objeto tem o campo "cpf"
            //e se o valor é igual ao CPF que recebi como parâmetro.
    //Se for, eu removo esse desbravador da lista, marco encontrado = true e paro o loop com o break.
            if (d.has("cpf") && d.getString("cpf").equals(cpfDesbravador)) {
                listaDesbravadores.remove(i); // remove o desbravador
                encontrado = true;
                break;
            }
        }

        // Se o desbravador foi encontrado, eu reescrevo o arquivo JSON com a lista atualizada (ou seja, sem o desbravador deletado).
        // Depois, mostro uma mensagem dizendo que a exclusão foi feita com sucesso.
        if (encontrado) {
            try (FileWriter writer = new FileWriter(this.path.toFile())) {
                writer.write(listaDesbravadores.toString(2)); // salva com indentação
            }
            System.out.println(" Desbravador com CPF " + cpfDesbravador + " deletado com sucesso!");
        } 
        
        
        
        //Caso o CPF não tenha sido encontrado no arquivo
        //mostro um aviso informando que nenhum registro foi localizado.
        else {
            System.out.println("️ Nenhum desbravador encontrado com o CPF " + cpfDesbravador + ".");
        }

        
    //E aqui temos o tratamento de erros.
    //Se der algum problema ao ler ou gravar o arquivo, ou se o JSON estiver com erro,
    //essas mensagens são mostradas para facilitar a identificação do problema.     
        
    } catch (IOException e) {
        System.err.println("Erro ao acessar o arquivo JSON.");
        e.printStackTrace();
    } catch (org.json.JSONException e) {
        System.err.println("Erro ao processar o arquivo JSON. O arquivo pode estar corrompido.");
        e.printStackTrace();
    }
}


    public void mostrarUmDesbravador(String nomeDesbravador) {
    if (!estaLogado) {
        System.out.println("Erro: Admin não logado.");
        return;
    }

    

    try {
        if (!Files.exists(this.path)) {
            System.out.println("Erro: Banco de dados não encontrado.");
            return;
        }

        String dadosDb = Files.readString(this.path);
        if (dadosDb.trim().isEmpty()) {
            System.out.println("Banco de dados vazio.");
            return;
        }

        JSONArray listaDesbravadores = new JSONArray(new JSONTokener(dadosDb));
        boolean encontrado = false;

        for (int i = 0; i < listaDesbravadores.length(); i++) {
            JSONObject d = listaDesbravadores.getJSONObject(i);

            // compara o nome ignorando maiúsculas/minúsculas
            if (d.has("nome") && d.getString("nome").equalsIgnoreCase(nomeDesbravador)) {
                System.out.println("\n=== Dados do Desbravador ===");
                System.out.println("Nome: " + d.getString("nome"));
                System.out.println("Sobrenome: " + d.getString("sobrenome"));
                System.out.println("Idade: " + d.getInt("idade"));
                System.out.println("Gênero: " + String.valueOf(d.get("genero")));
                System.out.println("CPF: " + d.getString("cpf"));
                System.out.println("RG: " + d.getString("rg"));
                System.out.println("\n");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Nenhum desbravador encontrado com o nome: " + nomeDesbravador);
        }

    } catch (IOException e) {
        System.err.println("Erro ao acessar o arquivo JSON.");
        e.printStackTrace();
    } catch (org.json.JSONException e) {
        System.err.println("Erro ao processar o arquivo JSON. O arquivo pode estar corrompido.");
        e.printStackTrace();
    }
}


          public void mostrarDesbravadores() {
    if (!estaLogado) {
        System.out.println("Erro: Admin não logado.");
        return;
    }

    

    try {
        if (!Files.exists(this.path)) {
            System.out.println("Erro: Banco de dados não encontrado.");
            return;
        }

        String dadosDb = Files.readString(this.path);
        if (dadosDb.trim().isEmpty()) {
            System.out.println("Banco de dados vazio.");
            return;
        }

        JSONArray listaDesbravadores = new JSONArray(new JSONTokener(dadosDb));

        System.out.println("\n=== Lista Completa de Desbravadores ===");
        for (int i = 0; i < listaDesbravadores.length(); i++) {
            JSONObject d = listaDesbravadores.getJSONObject(i);

            System.out.println("\n--- Desbravador " + (i + 1) + " ---");
            System.out.println("Nome: " + d.getString("nome"));
            System.out.println("Sobrenome: " + d.getString("sobrenome"));
            System.out.println("Idade: " + d.getInt("idade"));
            System.out.println("Gênero: " + d.get("genero"));
            System.out.println("CPF: " + d.getString("cpf"));
            System.out.println("RG: " + d.getString("rg"));
        }

        System.out.println("\nTotal de desbravadores: " + listaDesbravadores.length());

    } catch (IOException e) {
        System.err.println("Erro ao acessar o arquivo JSON.");
        e.printStackTrace();
    } catch (org.json.JSONException e) {
        System.err.println("Erro ao processar o arquivo JSON. O arquivo pode estar corrompido.");
        e.printStackTrace();
    }
}


}
