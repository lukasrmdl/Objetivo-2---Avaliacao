package model;

public abstract class Conta {
    protected Integer id;
    protected double saldo;

    public void setId(Integer id) {
        this.id = id;
    }

    public void deposita(double valor) {
        this.saldo = valor + this.saldo;
        System.out.println("\nDeposito de " + valor + "  realizado com sucesso. Saldo atual= " + this.saldo);
    }

    public double getSaldo() {
        return saldo;
    }

    public abstract double saca(double valor);

    public abstract void atualiza(double taxa);

}