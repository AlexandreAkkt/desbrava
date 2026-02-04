package desbrava;

import view.Menu;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
         // Cria a janela (moldura)
        JFrame janela = new JFrame("Meu App Desbrava");
        
        //  Cria o seu painel 
        Menu menu = new Menu();
        
        // Configurações básicas da janela
        janela.add(menu); // Adiciona seu painel à janela
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fecha o programa ao clicar no X
        janela.setSize(400, 600); // Defina um tamanho para a janela
        janela.setLocationRelativeTo(null); // Centraliza na tela
        
        // Torna a janela visível
        janela.setVisible(true);
       
    }
}