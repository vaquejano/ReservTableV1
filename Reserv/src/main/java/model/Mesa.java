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

   