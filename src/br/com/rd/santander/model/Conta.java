package br.com.rd.santander.model;

public class Conta {
    private Double saldo;

    public Conta(Double saldo) {
        this.saldo = saldo;
    }

    public void depositar(Double valor){
        if(valor>0){
            this.saldo+=valor;
            System.out.println("Depósito no valor de: "+ valor + " realizado com sucesso!!");
        }else{
            System.out.println("Valor inválido");
        }
    }

    public void sacar(Double valor){
        if(valor<=saldo){
            this.saldo-=valor;
            System.out.println("Saque no valor de: " + valor + " realizado com sucesso!!");
        }else{
            System.out.println("Saldo insuficiente!!");
        }

    }

    public void consultarSaldo(){
        System.out.println("O saldo da conta é: "+getSaldo());
    }


    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getSaldo() {
        return saldo;
    }
}
