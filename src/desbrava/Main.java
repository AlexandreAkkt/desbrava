package desbrava;

import model.Desbravador;
import model.Admin;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        // Criar o admin com todos os dados
        Admin admin = new Admin(
            "AdminMaster", "DosAnjos", "00000000000", "000000000", 
            "NaoInformado", "01/01/2000", "11999999999", "Rua Principal, 1", 
            "adminUser", "senha123"
        );

        // Fazer login
        if (admin.adminLogin("adminUser", "senha123")) {
            System.out.println("Login realizado com sucesso!");
        } else {
            System.out.println("Não foi possível realizar o login. Encerrando programa.");
            return;
        }

        // Criar o desbravador original
        Desbravador d = new Desbravador("Thiago", "Silva", 16, "M", "11122233344", "441779989");
        System.out.println("\n--- Cadastrando desbravador ---");
        d.apresentar();
        admin.cadastrarDesbravador(d);

        // Criar o novo desbravador com os dados atualizados
        Desbravador novosDados = new Desbravador("Márcio", "Anjos", 17, "M", "11122233344", "449887766");

        // Editar o desbravador
        System.out.println(" Editando desbravador ");
        admin.editarDesbravador(novosDados);

        // Exibir o desbravador atualizado
        System.out.println(" Exibindo um desbravador ");
        admin.mostrarUmDesbravador("Márcio");

        // Deletar o desbravador usando o CPF
        System.out.println(" Deletando desbravador ");
        admin.deletarDesbravador("11122233344");

        // Mostrar todos os desbravadores do JSON
        System.out.println(" Exibindo lista completa");
        admin.mostrarDesbravadores();

        // Logout
        admin.adminLogout();
        
        //  AQUI entra a tela gráfica
        System.out.println("\nAbrindo tela gráfica...");
        new view.CadastroDesbravador().setVisible(true);
    }
}

