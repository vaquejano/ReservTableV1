package model;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;
//@Entity
//@Table(name="mesa")
public class Mesa {
    //@Id
    //@Column(name="codmesa")
   private int codmesa;
    //@Column(name="codempresa")
   private int codempresa;
    //@Column(name="quantidadelugar")
   private int quantidadelugar;
 

    public Mesa(int codmesa, int codempresa, int quantidadelugar) {
        this.codmesa = codmesa;
        this.codempresa = codempresa;
        this.quantidadelugar = quantidadelugar;
        
    }

    public int getCodmesa() {
        return codmesa;
    }

    public void setCodmesa(int codmesa) {
        this.codmesa = codmesa;
    }

    public int getCodempresa() {
        return codempresa;
    }

    public void setCodempresa(int codempresa) {
        this.codempresa = codempresa;
    }

    public int getQuantidadelugar() {
        return quantidadelugar;
    }

    public void setQuantidadelugar(int quantidadelugar) {
        this.quantidadelugar = quantidadelugar;
    }

   