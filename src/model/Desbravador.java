/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package model;

//import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import org.json.JSONObject;

//import java.io.FileWriter;
//import java.io.IOException;



//public void slavarEmJson(){

    //JSONObject json = new JSONObject();
    
    //json.put("nomeCompleto", this.nomeCompleto);



//}

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

    
    public void salvarEmJson() {

    JSONObject json = new JSONObject();

    json.put("nomeCompleto", this.nomeCompleto);
    json.put("email", this.email);
    json.put("dataNascimento", this.dataNascimento);
    json.put("cpf", this.cpf);
    json.put("rg", this.rg);
    json.put("nomePai", this.nomePai);
    json.put("nomeMae", this.nomeMae);

    try (FileWriter file = new FileWriter("desbravador.json")) {
        file.write(json.toString(4));
        System.out.println(" salvo com sucesso!");
    } catch (IOException e) {
        e.printStackTrace();
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



   
