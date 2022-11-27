package model;

public class Associado implements AssociadoVip{
    private String nome;
     Integer qdeCotas;
     double valorCota;

     Integer lucro;

    public Associado() {
        super();
    }

    public Associado(String nome, Integer qdeCotas, double valorCota) {
        super();
        this.nome = nome;
        this.qdeCotas = qdeCotas;
        this.valorCota = valorCota;
    }
    public String getNome() {
        return nome;
    }
    public Integer getQdeCotas() {
        return qdeCotas;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setQdeCotas(int qdeCotas) {
        this.qdeCotas = qdeCotas;
    }
    public void setValorCota(int valorCota) {
        this.valorCota = valorCota;
    }


    @Override
    public double getLucros(Integer qdeCotas, double valorCota) {
        double lucro = qdeCotas * valorCota;
        return lucro;
    }
    @Override
    public String toString() {
        return "\nAssociado: " + this.nome + "  [Lucro=" + qdeCotas + "]";
    }
}
