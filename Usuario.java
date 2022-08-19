package model;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;
//@Entity
//@Table(name="usuario")
public class Usuario {
    //@Id
    //@Column(name="CodUsuario")
   private int Cod_Usuario;
    //@Column(name="nome_Usuario")
   private String nome_Usuario;
    //@Column(name="cpf_Uduario")
   private String cpf_Usuario;
    //@Column(name="senha_usuario")
   private String senha_usuario;
    //@Column(name="Email_usuario")
   private String email_usuario;

    public Usuario(int Cod_Usuario, String nome_Usuario, String cpf_Usuario, String senha_usuario, String email_usuario) {
        this.Cod_Usuario = Cod_Usuario;
        this.nome_Usuario = nome_Usuario;
        this.cpf_Usuario = cpf_Usuario;
        this.senha_usuario = senha_usuario;
        this.email_usuario = email_usuario;
    }

    public int getCod_Usuario() {
        return Cod_Usuario;
    }

    public void setCod_Usuario(int Cod_Usuario) {
        this.Cod_Usuario = Cod_Usuario;
    }

    public String getNome_Usuario() {
        return nome_Usuario;
    }

    public void setNome_Usuario(String nome_Usuario) {
        this.nome_Usuario = nome_Usuario;
    }

    public String getCpf_Usuario() {
        return cpf_Usuario;
    }

    public void setCpf_Usuario(String cpf_Usuario) {
        this.cpf_Usuario = cpf_Usuario;
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
