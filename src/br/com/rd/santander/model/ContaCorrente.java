package br.com.rd.santander.model;

public class ContaCorrente extends Conta{

    private Double limiteChequeEspecial;

    public ContaCorrente(Double saldo, Double limiteChequeEspecial) {
        super(saldo);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }


    //    public void depositarDinheiro(Double valor){
//        depositar(valor);
//    }

//    public void sacarDinheiro(Double valor){
//
//
//    }


    @Override
    public void sacar(Double valor) {
        Double saldo = getSaldo();
        if(valor<=saldo){
            saldo+=valor;
            setSaldo(saldo);
            System.out.println("Saque no valor de: "+ valor + " realizado com sucesso!!");
        }else if (valor <=this.limiteChequeEspecial){
            this.limiteChequeEspecial-=valor;
            System.out.println("Saque no valor de: "+ valor + " realizado com sucesso!!");
            System.out.println("Limite do cheque especial atualizado para: "+ limiteChequeEspecial);
        }else{
            System.out.println("Não é possível realizar o saque, valor maior que o limite");
        }
    }

    public void depositarCheque(Cheque cheque){
        setSaldo(getSaldo()+cheque.getValor());
        System.out.println("Depósito  de Cheque no valor de: "+ cheque.getValor() + " realizado com sucesso!!");
    }

    public Double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(Double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }
}
