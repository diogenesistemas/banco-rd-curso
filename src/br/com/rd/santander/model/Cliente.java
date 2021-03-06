package br.com.rd.santander.model;

public class Cliente {
    private Integer numeroDeCliente;
    private String sobrenome;
    private String rg;
    private String cpf;
    private Conta conta;

    public Cliente(Integer numeroDeCliente, String sobrenome, String rg, String cpf) {
        this.numeroDeCliente = numeroDeCliente;
        this.sobrenome = sobrenome;
        this.rg = rg;
        this.cpf = cpf;
    }

    public Integer getNumeroDeCliente() {
        return numeroDeCliente;
    }

//    public void setNumeroDeCliente(Integer numeroDeCliente) {
//        this.numeroDeCliente = numeroDeCliente;
//    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
}
