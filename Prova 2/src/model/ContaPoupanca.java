package model;

public class ContaPoupanca extends Conta {

    public ContaPoupanca() {

    }
    public ContaPoupanca(Integer id, double saldo) {
        this.id = id;
        this.saldo = saldo;
    }

    @Override
    public double saca(double valor) {
        double valorTemp = this.saldo - valor;
        if(valorTemp < 0) {
            System.out.println("Não há saldo suficiente para esse saque. Saldo= " + this.saldo);
        }
        this.saldo -= valor;
        System.out.println("\nSaque realizado com sucesso. Saldo atual= " + this.saldo);
        return valorTemp;
    }

    @Override
    public void atualiza(double taxa) {
        this.saldo += this.saldo * (taxa/100);
        System.out.println("Saldo atualizado pela taxa. Saldo atual=" + this.saldo);
    }

    @Override
    public String toString() {
        return "\nContaPoupança: " + this.id + "  [Saldo=" + this.saldo + "]";
    }
}
