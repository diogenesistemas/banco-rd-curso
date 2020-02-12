package br.com.rd.santander.view;

import br.com.rd.santander.model.Cliente;
import br.com.rd.santander.model.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        ContaPoupanca poupanca1 = new ContaPoupanca(100.0, 0.05);
        Cliente cliente1 = new Cliente(1, "Silva", "654321", "12345678900");
        cliente1.setConta(poupanca1);

        poupanca1.consultarSaldo();
        poupanca1.depositar(200.0);
        poupanca1.consultarSaldo();
        poupanca1.recolherJuros();
        poupanca1.consultarSaldo();




    }
}
