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
   private boolean situacao;
           
   public Reservas(int codusuario, int codempresa, String nome_usuario, String email_usuario, boolean situacao ) {
        this.codusuario = codusuario;
        this.codempresa = codempresa;
        this.nome_usuario = nome_usuario;
        this.email_usuario = email_usuario;
        this.situacao = situacao;
   }

    public int getcodusuario() {
        return codusuario;
    }

    public void setcodusuario(int codusuario) {
        this.codusuario = codusuario;
    }
    
    public int getcodempresa() {
        return codempresa;
    }

    public void setcodempresa(int codempresa) {
        this.codempresa = codempresa;
    }
    
    public String getnome_usuario() {
        return nome_usuario;
    }

    public void setnome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }

        public String getEmail_usuario() {
        return email_usuario;
    }

    public void setEmail_usuario(String email_usuario) {
        this.email_usuario = email_usuario;
    }
    
         public String getsituacao() {
        return situacao;
    }

    public void setsituacao(String situacao) {
        this.situacao = situacao;
    }
}
