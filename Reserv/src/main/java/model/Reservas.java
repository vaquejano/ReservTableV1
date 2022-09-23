package model;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;
//@Entity
//@Table(name="reservas")
public class Reservas {
   
   private int CodUsuario;
   
   private int CodEmpresa;
   
   private String nome_Usuario;
   
   private String email_usuario;

   public Reservas(int CodUsuario, int CodEmpresa, String nome_Usuario, String email_usuario) {
        this.CodUsuario = CodUsuario;
        this.CodEmpresa = CodEmpresa;
        this.nome_Usuario = nome_Usuario;
        this.email_usuario = email_usuario;
    }

    public int getCodUsuario() {
        return CodUsuario;
    }

    public void setCodUsuario(int CodUsuario) {
        this.CodUsuario = CodUsuario;
    }
    
    public int getCodEmpresa() {
        return CodEmpresa;
    }

    public void setCodEmpresa(int CodEmpresa) {
        this.CodEmpresa = CodEmpresa;
    }
    
    public String getNome_Usuario() {
        return nome_Usuario;
    }

    public void setNome_Usuario(String nome_Usuario) {
        this.nome_Usuario = nome_Usuario;
    }

        public String getEmail_usuario() {
        return email_usuario;
    }

    public void setEmail_usuario(String email_usuario) {
        this.email_usuario = email_usuario;
    }

}
