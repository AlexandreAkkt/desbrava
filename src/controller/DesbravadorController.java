package controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.json.JSONArray;
import org.json.JSONObject;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class DesbravadorController {

    private static final String DB_PATH = "desbravadores.json";

    public static JSONArray mostrarUsuarios() {
        try {
            File file = new File(DB_PATH);

            // Se o arquivo não existir, cria um com array vazio
            if (!file.exists()) {
                Files.write(Paths.get(DB_PATH), "{}".getBytes());
                System.out.print("DB não existe. Criando um novo");
            }

            String content = new String(Files.readAllBytes(Paths.get(DB_PATH)));

            // Validação simples: se o conteúdo estiver vazio ou não começar com '[', retorna array vazio
            if (content.trim().isEmpty() || !content.trim().startsWith("[")) {
                return new JSONArray("[]");
            }
            
            return new JSONArray(content);
        } catch (IOException e) {
            System.err.println("Erro ao ler JSON: " + e.getMessage());
            return new JSONArray("[]"); // Retorna vazio em caso de qualquer erro
        }
    }
    
    public static void editarUsuario(){
    
    }
    
    public static void excluirUsuario(){
    
    }
    
    public static void criarUsuario(){
    
    }

}
