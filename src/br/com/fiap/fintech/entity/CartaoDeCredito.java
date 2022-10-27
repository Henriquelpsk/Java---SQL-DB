package br.com.fiap.fintech.entity;

import java.util.Calendar;

public class CartaoDeCredito {
    private int codigo;
    private String nome;
    private String numero;
    private String bandeira;
    private Calendar dataFechamento;
    private double limite;
    private double usado;
    private Calendar vencimento;
    private int codigoUsuario;
    private int codigoConta;

    public CartaoDeCredito(int codigo, String nome, String numero, String bandeira, Calendar dataFechamento, double limite, double usado, Calendar vencimento, int codigoUsuario, int codigoConta) {
        super();
        this.codigo = codigo;
        this.nome = nome;
        this.numero = numero;
        this.bandeira = bandeira;
        this.dataFechamento = dataFechamento;
        this.limite = limite;
        this.usado = usado;
        this.vencimento = vencimento;
        this.codigoUsuario = codigoUsuario;
        this.codigoConta = codigoConta;
    }

    public CartaoDeCredito(String nome, String numero, String bandeira, Calendar dataFechamento, double limite, double usado, Calendar vencimento, int codigoUsuario, int codigoConta) {
        super();
        this.nome = nome;
        this.numero = numero;
        this.bandeira = bandeira;
        this.dataFechamento = dataFechamento;
        this.limite = limite;
        this.usado = usado;
        this.vencimento = vencimento;
        this.codigoUsuario = codigoUsuario;
        this.codigoConta = codigoConta;
    }

    public CartaoDeCredito() { super();};

    public int getCodigo() {
        return codigo;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public Calendar getDataFechamento() {
        return dataFechamento;
    }

    public void setDataFechamento(Calendar dataFechamento) {
        this.dataFechamento = dataFechamento;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getUsado() {
        return usado;
    }

    public void setUsado(double usado) {
        this.usado = usado;
    }

    public Calendar getVencimento() {
        return vencimento;
    }

    public void setVencimento(Calendar vencimento) {
        this.vencimento = vencimento;
    }

    public int getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(int codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public int getCodigoConta() {
        return codigoConta;
    }

    public void setCodigoConta(int codigoConta) {
        this.codigoConta = codigoConta;
    }
}
