package br.com.fiap.fintech.entity;

import java.util.Calendar;

public class LancamentoCartao {
    private int codigo;
    private String tipo;
    private double valor;
    private String descricao;
    private Calendar data;
    private String categoria;
    private int codigoCartao;

    public LancamentoCartao(int codigo, String tipo, double valor, String descricao, Calendar data, String categoria, int codigoCartao) {
        super();
        this.codigo = codigo;
        this.tipo = tipo;
        this.valor = valor;
        this.descricao = descricao;
        this.data = data;
        this.categoria = categoria;
        this.codigoCartao = codigoCartao;
    }

    public LancamentoCartao(String tipo, double valor, String descricao, Calendar data, String categoria, int codigoCartao) {
        super();
        this.tipo = tipo;
        this.valor = valor;
        this.descricao = descricao;
        this.data = data;
        this.categoria = categoria;
        this.codigoCartao = codigoCartao;
    }

    public LancamentoCartao(){
        super();
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCodigoCartao() {
        return codigoCartao;
    }

}
