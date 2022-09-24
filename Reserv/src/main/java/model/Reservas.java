package model;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;
//@Entity
//@Table(name="reservas")
public class Reservas {
       //@Column(name="codusuario")
   private int codusuario;
       //@Column(name="codempresa")
   private int codempresa;
       //@Column(name="nome_usuario")
   private String nome_usuario;
       //@Column(name="email_usuario")
   private String email_usuario;
       //@Column(name="situacao")
   private int reservado_sim = 1;
   //@Column(name="reservasim")
   private int reservado_nao = 0;
       //@Column(name="reservanao")    

    public Reservas(int codusuario, int codempresa, String nome_usuario, String email_usuario) {
        this.codusuario = codusuario;
        this.codempresa = codempresa;
        this.nome_usuario = nome_usuario;
        this.email_usuario = email_usuario;
    }

    public int getCodusuario() {
        return codusuario;
    }

    public void setCodusuario(int codusuario) {
        this.codusuario = codusuario;
    }

    public int getCodempresa() {
        return codempresa;
    }

    public void setCodempresa(int codempresa) {
        this.codempresa = codempresa;
    }

    public String getNome_usuario() {
        return nome_usuario;
    }

    public void setNome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }

    public String getEmail_usuario() {
        return email_usuario;
    }

    public void setEmail_usuario(String email_usuario) {
        this.email_usuario = email_usuario;
    }

    public int getReservado_sim() {
        return reservado_sim;
    }

    public void setReservado_sim(int reservado_sim) {
        this.reservado_sim = reservado_sim;
    }

    public int getReservado_nao() {
        return reservado_nao;
    }

    public void setReservado_nao(int reservado_nao) {
        this.reservado_nao = reservado_nao;
    }
   
   
}
