package model;


public class Desbravador {
    private String nome;
    private String sobrenome;
    private int idade;
    private char sexo;
    private String cpf;
    private String rg;

    // CORREÇÃO ESSENCIAL: O construtor estava atribuindo os campos a eles mesmos (ex: this.sexo = sexo),
    // o que significa que eles não recebiam os valores dos parâmetros de entrada.
    // Os parâmetros genéricos foram renomeados para clareza e mapeados para seus respectivos atributos.
    public Desbravador(String nome, String sobrenome, int idade, String sexoInput, String cpfInput, String rgInput) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        
        // O campo 'sexo' é do tipo char, mas o parâmetro de entrada na Main é uma String (ex: "M"). 
        // Pegamos o primeiro caractere da String de entrada.
        if (sexoInput != null && !sexoInput.isEmpty()) {
            this.sexo = sexoInput.charAt(0);
        } else {
            this.sexo = ' ';
        }

        this.cpf = cpfInput;
        this.rg = rgInput;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void apresentar() {
        System.out.println("--- Dados do Desbravador ---");
        System.out.println("Nome: " + nome);
        System.out.println("Sobrenome: " + sobrenome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
        System.out.println("CPF: " + cpf);
        System.out.println("RG: " + rg);
        System.out.println("----------------------------");
    }


}