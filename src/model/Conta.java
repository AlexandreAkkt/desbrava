package model;

public class Conta {

    private String email;
    private String senha;
    private String usuario;

// public criarConta(){
// }
    public Conta(String email, String senha, String usuario) {
        this.email = email;
        this.senha = senha;
        this.usuario = usuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getUsuario() {
        return this.usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    public void criarConta(String email, String senha){
        // Falta criar a conta do adm 
    
    
    }
    
}
