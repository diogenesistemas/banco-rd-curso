package br.com.rd.santander.model;

public class ContaCorrente extends Conta{

    private Double limiteChequeEspecial;

    public ContaCorrente(){
        super();
    }

    public ContaCorrente(Double saldo, Cliente cliente, Double limiteChequeEspecial) {
        super(saldo, cliente);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void sacar(Double valorDeSaque) {
        Double saldo = getSaldo();
        if(valorDeSaque<=saldo){
            saldo+=valorDeSaque;
            setSaldo(saldo);
            System.out.println("Saque no valor de: "+ valorDeSaque + " realizado com sucesso!!");
        }else if (valorDeSaque <= (saldo + this.limiteChequeEspecial)){
            double diferenca =  valorDeSaque - saldo;
            this.limiteChequeEspecial -= diferenca;
            setSaldo(saldo-valorDeSaque);
            System.out.println("Saque no valor de: "+ valorDeSaque + " realizado com sucesso!!");
            System.out.println("Limite do cheque especial atualizado para: "+ limiteChequeEspecial);
        }else{
            System.out.println("Não é possível realizar o saque, valor maior que o limite");
        }
    }

    public void depositarCheque(Cheque cheque){
        depositar(cheque.getValor());
    }

    public Double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(Double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }
}
