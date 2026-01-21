package desbrava;

import view.Menu;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
         // 1. Cria a janela (moldura)
        JFrame janela = new JFrame("Meu App Desbrava");
        
        // 2. Cria o seu painel (o conteúdo que você desenhou)
        Menu menu = new Menu();
        
        // 3. Configurações básicas da janela
        janela.add(menu); // Adiciona seu painel à janela
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fecha o programa ao clicar no X
        janela.setSize(400, 600); // Defina um tamanho para a janela
        janela.setLocationRelativeTo(null); // Centraliza na tela
        
        // 4. Torna a janela visível
        janela.setVisible(true);
       
    }
}