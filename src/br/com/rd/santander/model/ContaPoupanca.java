package br.com.rd.santander.model;

public class ContaPoupanca extends Conta{
    private Double taxaDeJuros;

   public ContaPoupanca(){
       super();
   }

    public ContaPoupanca(Double saldo, Cliente cliente, Double taxaDeJuros) {
        super(saldo, cliente);
        this.taxaDeJuros = taxaDeJuros;
    }

    public void recolherJuros(){
        Double saldo = getSaldo();
        Double rendimento = (saldo * taxaDeJuros);
        saldo+=rendimento;
        setSaldo(saldo);
        System.out.println("A conta rendeu "+ rendimento + " de juros!");
    }

    public Double getTaxaDeJuros() {
        return taxaDeJuros;
    }

    public void setTaxaDeJuros(Double taxaDeJuros) {
        this.taxaDeJuros = taxaDeJuros;
    }
}
