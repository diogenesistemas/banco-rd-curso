package br.com.rd.santander.model;

public class ContaPoupanca extends Conta{
    private Double taxaDeJuros;

    public ContaPoupanca(Double saldo, Double taxaDeJuros) {
        super(saldo);
        this.taxaDeJuros = taxaDeJuros;
    }

    //    public void depositarDinheiro(Double valor){
//        depositar(valor);
//    }

//    public void sacarDinhiero(Double valor){
//        sacar(valor);
//    }

    public void recolherJuros(){
        Double saldo = getSaldo();
        Double rendimento = (saldo * taxaDeJuros);
        saldo+=rendimento;
        setSaldo(saldo);
        System.out.println("A conta rendeu "+ rendimento + " de juros!");
    }




}
