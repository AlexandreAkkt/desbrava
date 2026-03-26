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

    private static final String DB_PATH = "desbravadores.json";
    public Path path = Paths.get(DB_PATH);

    // --- Construtor ---
    public Admin(String nome, String sobrenome, String cpf, String rg, String genero,
                 String dataNasc, String telefone, String endereco,
                 String usuario, String senha) {

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

    // ✅ CORRIGIDO (sem erro)
    public Admin() {
    }

    // --- LOGIN ---
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

    // --- CADASTRAR ---
    public void cadastrarDesbravador(Desbravador desbravador) {
        try {
            String dadosDb;
            JSONArray listaDesbravadores;

            if (Files.exists(this.path)) {
                dadosDb = Files.readString(this.path);
                listaDesbravadores = dadosDb.trim().isEmpty()
                        ? new JSONArray()
                        : new JSONArray(new JSONTokener(dadosDb));
            } else {
                listaDesbravadores = new JSONArray();
            }

            boolean usuarioExiste = false;
            String cpfNovo = desbravador.getCpf();

            for (int i = 0; i < listaDesbravadores.length(); i++) {
                JSONObject d = listaDesbravadores.getJSONObject(i);
                if (d.has("cpf") && d.getString("cpf").equals(cpfNovo)) {
                    usuarioExiste = true;
                    break;
                }
            }

            if (usuarioExiste) {
                System.out.println("CPF já cadastrado.");
                return;
            }

            JSONObject obj = new JSONObject();
            obj.put("nomeCompleto", desbravador.getNomeCompleto());
            obj.put("email", desbravador.getEmail());
            obj.put("dataNascimento", desbravador.getDataNascimento());
            obj.put("cpf", desbravador.getCpf());
            obj.put("rg", desbravador.getRg());
            obj.put("nomePai", desbravador.getNomePai());
            obj.put("nomeMae", desbravador.getNomeMae());

            listaDesbravadores.put(obj);

            try (FileWriter writer = new FileWriter(this.path.toFile())) {
                writer.write(listaDesbradores.toString(2));
            }

            System.out.println("Desbravador salvo: " + desbravador.getNomeCompleto());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // --- EDITAR ---
    public void editarDesbravador(Desbravador novosDados) {
        if (!estaLogado) {
            System.out.println("Admin não logado.");
            return;
        }

        try {
            String dadosDb = Files.readString(this.path);
            JSONArray lista = new JSONArray(new JSONTokener(dadosDb));

            for (int i = 0; i < lista.length(); i++) {
                JSONObject d = lista.getJSONObject(i);

                if (d.getString("cpf").equals(novosDados.getCpf())) {

                    d.put("nomeCompleto", novosDados.getNomeCompleto());
                    d.put("email", novosDados.getEmail());
                    d.put("dataNascimento", novosDados.getDataNascimento());
                    d.put("cpf", novosDados.getCpf());
                    d.put("rg", novosDados.getRg());
                    d.put("nomePai", novosDados.getNomePai());
                    d.put("nomeMae", novosDados.getNomeMae());

                    try (FileWriter writer = new FileWriter(this.path.toFile())) {
                        writer.write(lista.toString(2));
                    }

                    System.out.println("Editado com sucesso!");
                    return;
                }
            }

            System.out.println("CPF não encontrado.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // --- DELETAR ---
    public void deletarDesbravador(String cpf) {
        if (!estaLogado) return;

        try {
            String dadosDb = Files.readString(this.path);
            JSONArray lista = new JSONArray(new JSONTokener(dadosDb));

            for (int i = 0; i < lista.length(); i++) {
                if (lista.getJSONObject(i).getString("cpf").equals(cpf)) {
                    lista.remove(i);

                    try (FileWriter writer = new FileWriter(this.path.toFile())) {
                        writer.write(lista.toString(2));
                    }

                    System.out.println("Deletado com sucesso!");
                    return;
                }
            }

            System.out.println("CPF não encontrado.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // --- MOSTRAR UM ---
    public void mostrarUmDesbravador(String nome) {
        if (!estaLogado) return;

        try {
            String dadosDb = Files.readString(this.path);
            JSONArray lista = new JSONArray(new JSONTokener(dadosDb));

            for (int i = 0; i < lista.length(); i++) {
                JSONObject d = lista.getJSONObject(i);

                if (d.getString("nomeCompleto").equalsIgnoreCase(nome)) {

                    System.out.println("Nome: " + d.getString("nomeCompleto"));
                    System.out.println("Email: " + d.getString("email"));
                    System.out.println("Data: " + d.getString("dataNascimento"));
                    System.out.println("CPF: " + d.getString("cpf"));
                    System.out.println("RG: " + d.getString("rg"));
                    System.out.println("Pai: " + d.getString("nomePai"));
                    System.out.println("Mãe: " + d.getString("nomeMae"));
                    return;
                }
            }

            System.out.println("Não encontrado.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // --- LISTAR TODOS ---
    public void mostrarDesbravadores() {
        if (!estaLogado) return;

        try {
            String dadosDb = Files.readString(this.path);
            JSONArray lista = new JSONArray(new JSONTokener(dadosDb));

            for (int i = 0; i < lista.length(); i++) {
                JSONObject d = lista.getJSONObject(i);

                System.out.println("\n---");
                System.out.println("Nome: " + d.getString("nomeCompleto"));
                System.out.println("Email: " + d.getString("email"));
                System.out.println("Data: " + d.getString("dataNascimento"));
                System.out.println("CPF: " + d.getString("cpf"));
                System.out.println("RG: " + d.getString("rg"));
                System.out.println("Pai: " + d.getString("nomePai"));
                System.out.println("Mãe: " + d.getString("nomeMae"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static class listaDesbradores {

        private static char[] toString(int i) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public listaDesbradores() {
        }
    }
}
