/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author SOARES
 */
public class Desbravador {

    private String nomeCompleto;
    private String email;
    private String dataNascimento;
    private String cpf;
    private String rg;
    private String nomePai;
    private String nomeMae;

    // Construtor
  public Desbravador(String nomeCompleto){
  
  
  
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


}



   
