package model;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;
//@Entity
//@Table(name="nome_fantasia")
public class Cadastro_Empresa {
         private int cod_empresa;
    //@Column(name="nome_fantasia")
   private String nome_fantasia;
    //@Column(name="cpf_Empresa")
   private String cnpj_empresa;
    //@Column(name="senha_empresa")
   private String senha_empresa;
    //@Column(name="endereco_empresa")
   private String endereco_empresa;
   private String ramo_empresa;
   private  String porte_empresa;

   
   
    public Cadastro_Empresa(int cod_empresa, String nome_fantasia, String cnpj_Usuario, String endereco_empresa, String senha_empresa, String ramo_empresa, String porte_empresa) {
        this.cod_empresa = cod_empresa;
        this.nome_fantasia = nome_fantasia;
        this.cnpj_empresa= cnpj_empresa;
        this.senha_empresa = senha_empresa;
        this.endereco_empresa = endereco_empresa;
        this.ramo_empresa = ramo_empresa;
        this.porte_empresa = porte_empresa;
}

    public int getCod_empresa() {
        return cod_empresa;
    }

    public void setCod_empresa(int cod_empresa) {
        this.cod_empresa = cod_empresa;
    }

    public String getnome_fantasia() {
        return nome_fantasia;
    }

    public void setnome_fantasia(String nome_fantasia) {
        this.nome_fantasia = nome_fantasia;
    }

    public String getCnpj_empresa() {
        return cnpj_empresa;
    }

    public void setCnpj_empresa(String cnpj_empresa) {
        this.cnpj_empresa = cnpj_empresa;
    }

    public String getSenha_empresa() {
        return senha_empresa;
    }

    public void setSenha_empresa(String senha_empresa) {
        this.senha_empresa = senha_empresa;
    }

    public String getEndereco_empresa() {
        return endereco_empresa;
    }

    public void setEndereco_empresa(String endereco_empresa) {
        this.endereco_empresa = endereco_empresa;
    }

    public String getRamo_empresa() {
        return ramo_empresa;
    }

    public void setRamo_empresa(String ramo_empresa) {
        this.ramo_empresa = ramo_empresa;
    }

    public String getPorte_empresa() {
        return porte_empresa;
    }

    public void setPorte_empresa(String porte_empresa) {
        this.porte_empresa = porte_empresa;
    }
}
