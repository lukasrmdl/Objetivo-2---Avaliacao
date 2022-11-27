package controller;

import model.Associado;
import model.ContaPoupanca;
import model.ContaCorrente;

import java.util.*;

public class ContaController {

    public static void main(String[] args) {
        ContaPoupanca conta1 = new ContaPoupanca();
        ContaPoupanca conta2 = new ContaPoupanca(2, 1500.00);
        ContaPoupanca conta3 = new ContaPoupanca(3, 1700.00);

        ContaCorrente conta4 = new ContaCorrente();
        ContaCorrente conta5 = new ContaCorrente(5, 5000.00);
        ContaCorrente conta6 = new ContaCorrente(6, 4300.00);

        Associado assoc1 = new Associado();
        Associado assoc2 = new Associado();
        Associado assoc3 = new Associado();
        Associado assoc4 = new Associado();
        Associado assoc5 = new Associado();
        Associado assoc6 = new Associado();

        //setters
        conta1.setId(1);
        conta1.deposita(900.00);

        conta4.setId(4);
        conta4.deposita(1800.00);

        assoc1.setNome("lukas Raphael");
        assoc1.setQdeCotas(100);
        assoc1.setValorCota(50);

        assoc2.setNome("João gabriel");
        assoc2.setQdeCotas(200);
        assoc2.setValorCota(40);

        assoc3.setNome("Eduardo Farias");
        assoc3.setQdeCotas(300);
        assoc3.setValorCota(30);

        assoc4.setNome("Bill Monroe");
        assoc4.setQdeCotas(400);
        assoc4.setValorCota(20);

        assoc5.setNome("Esther Manilla");
        assoc5.setQdeCotas(500);
        assoc5.setValorCota(10);

        assoc6.setNome("Bob Sents");
        assoc6.setQdeCotas(600);
        assoc6.setValorCota(15);

        //impressoes

        System.out.println(conta1);
        System.out.println(conta2);
        System.out.println(conta3);
        System.out.println(conta4);
        System.out.println(conta5);
        System.out.println(conta6);

        //Movimentação conta Poupança

        System.out.println(conta2);
        conta2.deposita(1000.80);
        conta2.atualiza(5);
        conta2.saca(50.00);
        System.out.println(conta2);

        //Movimentação conta Corrente
        System.out.println(conta4);
        conta4.deposita(500.00);
        conta4.saca(400.00);
        System.out.println(conta4);

        //coleção Conta poupança list

        List<ContaPoupanca> contasPoupancas = new ArrayList<>();
        contasPoupancas.add(conta1);
        contasPoupancas.add(conta2);
        contasPoupancas.add(conta3);

        System.out.println(contasPoupancas);

        //coleção Conta poupança list ordenando
        System.out.println(contasPoupancas);
        contasPoupancas.sort(Comparator.comparing(ContaPoupanca::getSaldo).reversed());
        System.out.println("\nColeção de contas poupanças do tipo List em ordem decrescente, pelo saldo");
        System.out.println(contasPoupancas);

        //coleção Conta Corrente list

        System.out.println("\nColeção de contas Correntes do tipo List");

        List<ContaCorrente> contasCorrentes = new ArrayList<>();
        contasCorrentes.add(conta4);
        contasCorrentes.add(conta5);
        contasCorrentes.add(conta6);

        System.out.println(contasCorrentes);

        //coleção de Contas Correntes list ordenando
        System.out.println(contasCorrentes);
        contasCorrentes.sort(Comparator.comparing(ContaCorrente::getSaldo).reversed());
        System.out.println("\nColeção de contas correntes do tipo List em ordem decrescente, pelo saldo");
        System.out.println(contasCorrentes);

        //coleção Associado list


        List<Associado> associados = new ArrayList<>();
        associados.add(assoc1);
        associados.add(assoc2);
        associados.add(assoc3);
        associados.add(assoc4);
        associados.add(assoc5);
        associados.add(assoc6);

        System.out.println(associados);

        //coleção dos associados list ordenando
        System.out.println(associados);
        associados.sort(Comparator.comparing(Associado::getQdeCotas).reversed());
        System.out.println("\nColeção do tipo List em ordem decrescente, pela qDeCotas");
        System.out.println(associados);


        //coleção Conta poupança map
        Map<Double, ContaPoupanca> contasPmap = new HashMap<>();
        contasPmap.put(conta1.getSaldo(), conta1);
        contasPmap.put(conta2.getSaldo(), conta2);
        contasPmap.put(conta3.getSaldo(), conta3);
        System.out.println(contasPmap);

        //coleção Conta Corrente map
        Map<Double, ContaPoupanca> contasCmap = new HashMap<>();
        contasCmap.put(conta4.getSaldo(), conta1);
        contasCmap.put(conta5.getSaldo(), conta2);
        contasCmap.put(conta6.getSaldo(), conta3);
        System.out.println(contasCmap);

        //coleção Associados map
        Map<Integer, Associado> associadosMap = new HashMap<>();
        associadosMap.put(assoc1.getQdeCotas(), assoc1);
        associadosMap.put(assoc2.getQdeCotas(), assoc2);
        associadosMap.put(assoc3.getQdeCotas(), assoc3);
        associadosMap.put(assoc4.getQdeCotas(), assoc4);
        associadosMap.put(assoc5.getQdeCotas(), assoc5);
        associadosMap.put(assoc6.getQdeCotas(), assoc6);

        System.out.println(associadosMap);

    }
}
