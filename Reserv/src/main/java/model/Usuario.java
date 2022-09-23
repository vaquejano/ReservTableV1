package model;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;
//@Entity
//@Table(name="usuario")
public class Usuario {
    //@Id
    //@Column(name="cod_usuario")
   private int cod_usuario;
    //@Column(name="nome_usuario")
   private String nome_usuario;
    //@Column(name="cpf_usuario")
   private String cpf_usuario;
    //@Column(name="senha_usuario")
   private String senha_usuario;
    //@Column(name="email_usuario")
   private String email_usuario;

    public Usuario(int cod_usuario, String nome_usuario, String cpf_usuario, String senha_usuario, String email_usuario) {
        this.cod_usuario = cod_usuario;
        this.nome_usuario = nome_usuario;
        this.cpf_usuario = cpf_usuario;
        this.senha_usuario = senha_usuario;
        this.email_usuario = email_usuario;
    }

    public int getcod_usuario() {
        return cod_usuario;
    }

    public void setcod_usuario(int cod_usuario) {
        this.cod_usuario = cod_usuario;
    }

    public String getnome_usuario() {
        return nome_usuario;
    }

    public void setnome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }

    public String getcpf_usuario() {
        return cpf_usuario;
    }

    public void setcpf_usuario(String cpf_usuario) {
        this.cpf_usuario = cpf_usuario;
    }

    public String getSenha_usuario() {
        return senha_usuario;
    }

    public void setSenha_usuario(String senha_usuario) {
        this.senha_usuario = senha_usuario;
    }

    public String getEmail_usuario() {
        return email_usuario;
    }

    public void setEmail_usuario(String email_usuario) {
        this.email_usuario = email_usuario;
    }

}