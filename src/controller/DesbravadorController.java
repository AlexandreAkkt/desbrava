package controller;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.function.BooleanSupplier;
import org.json.JSONArray;
import org.json.JSONObject;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public class DesbravadorController {

    private static final String DB_PATH = "desbravadores.json";

    public static JSONObject buscarUsuario(String cpf) {
        try {
            File file = new File(DB_PATH);

            if (!file.exists()) {
                Files.write(Paths.get(DB_PATH), "[]".getBytes());
                System.out.println("DB não existe. Criando um novo...");
            }

            String content = new String(Files.readAllBytes(Paths.get(DB_PATH)));
            JSONArray lista = new JSONArray(content);

            // 2 e 3. CORREÇÃO: Percorrer e converter para JSONObject
            for (Object item : lista) {
                JSONObject user = (JSONObject) item; // Cast para JSONObject

                // Compara Strings usando .equals()
                if (user.getString("cpf").equals(cpf)) {
                    return user; // Usuário encontrado!
                }
            }

        } catch (IOException e) {
            System.err.println("Erro ao ler JSON: " + e.getMessage());
        }

        return null;
    }

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

    public static void deletarUsuario(String cpf) {
        try {
            JSONArray usuarios = mostrarUsuarios();

            for (int i = 0; i < usuarios.length(); i++) {
                JSONObject user = usuarios.getJSONObject(i);

                if (user.getString("cpf").equals(cpf)) {
                    usuarios.remove(i);
                    break;
                }
            }

            Files.write(Paths.get(DB_PATH), usuarios.toString(4).getBytes());

            System.out.println("Desbravador deletado com sucesso!!");

        } catch (IOException e) {
            System.err.println("Erro ao deletar: " + e.getMessage());
        }
    }

    public static Boolean editarUsuario(String cpf, JSONObject novosDados) {

        JSONObject usuarioExistente = buscarUsuario(cpf);

        try {

            String content = new String(Files.readAllBytes(Paths.get(DB_PATH)));
            JSONArray lista = new JSONArray(content);
            for (int i = 0; i < lista.length(); i++) {
                JSONObject user = lista.getJSONObject(i);

                // Compara para achar a posição dele na lista do arquivo
                if (user.getString("cpf").equals(cpf)) {
                    // Atualiza os dados com o que veio da tela
                    user.put("nomeCompleto", novosDados.getString("nomeCompleto"));
                    // Grava a lista atualizada de volta no arquivo

                    try {
                        Files.write(Paths.get(DB_PATH), lista.toString(4).getBytes());
                    } catch (IOException e) {
                        System.out.print("Hello");
                    }

                    return true;
                }
            }
        } catch (IOException e) {
            System.out.print("Hello");
        }
        
        return false;

    }

}
