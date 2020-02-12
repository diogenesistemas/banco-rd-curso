package br.com.rd.santander.model;

public class Cheque {
    private Double valor;
    private Double bancoEmissor;
    private Double dataPagamento;

    public Cheque(Double valor, Double bancoEmissor, Double dataPagamento) {
        this.valor = valor;
        this.bancoEmissor = bancoEmissor;
        this.dataPagamento = dataPagamento;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double getBancoEmissor() {
        return bancoEmissor;
    }

    public void setBancoEmissor(Double bancoEmissor) {
        this.bancoEmissor = bancoEmissor;
    }

    public Double getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Double dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
}
