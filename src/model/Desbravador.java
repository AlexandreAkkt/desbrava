/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

//import org.json.JSONObject;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author SOARES
 */
public class Desbravador {

    public String nomeCompleto;
    public String email;
    public String dataNascimento;
    public String cpf;
    public String rg;
    public String nomePai;
    public String nomeMae;
    private static final String DB_PATH = "desbravadores.json";

    public void cpfCadastrado(String cpf) throws IOException {

        try {

            String conteudo = new String(Files.readAllBytes(Paths.get(DB_PATH)));
            JSONObject usuarios = new JSONObject(conteudo);
            Iterator<String> keys = usuarios.keys();
            System.out.print(keys);
        } catch (IOException e) {
            throw new RuntimeException("Erro ao cadastrar", e);
        }

    }

    public void cadastrarDesbravador() {

        try {
            //verificar se o db existe
            String desbravadores = new String(Files.readAllBytes(Paths.get(DB_PATH)));

            //converter pra json array, que é uma lista
            JSONArray desbravadoresJSONArray = new JSONArray(desbravadores); 
            //[1,2]

            //cria novo usuário como json object
            JSONObject desbravador = new JSONObject();

            //popular os valores do desbravador dentro do json object
            desbravador.put("nomeCompleto", this.nomeCompleto);
            desbravador.put("email", this.email);
            desbravador.put("dataNascimento", this.dataNascimento);
            desbravador.put("cpf", this.cpf);
            desbravador.put("rg", this.rg);
            desbravador.put("nomePai", this.nomePai);
            desbravador.put("nomeMae", this.nomeMae);

            //salvar o desbravador populado dentro da lista de desbravadores
            desbravadoresJSONArray.put(desbravador);
            //[1,2,3]
            
            //cadastrar nova lista
            try (FileWriter file = new FileWriter("desbravadores.json")) {
                file.write(desbravadoresJSONArray.toString(4));

            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (IOException e) {
            System.err.println("DB não existe: " + e.getMessage());

        }

    }

    // Construtor
    public Desbravador(String nomeCompleto, String email, String dataNascimento,
            String cpf, String rg, String nomePai, String nomeMae) {

    }

    public String getNomeCompleto() {
        return this.nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataNascimento() {
        return this.dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return this.rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNomePai() {
        return this.nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getNomeMae() {
        return this.nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public void apresentar() {
        System.out.println("--- Dados do Desbravador ---");
        System.out.println("Nome: " + nomeCompleto);
        System.out.println("Email: " + email);
        System.out.println("Data Nascimento: " + dataNascimento);
        System.out.println("CPF: " + cpf);
        System.out.println("RG: " + rg);
        System.out.println("Nome do Pai: " + nomePai);
        System.out.println("Nome da Mãe: " + nomeMae);
        System.out.println("----------------------------");

    }

    public boolean getNome() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
