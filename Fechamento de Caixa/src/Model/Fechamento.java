/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author lucas
 */
public class Fechamento {
    
    int id;
    double aprazo;
    double recebido;
    double saida;
    double cartao;
    double caixaAtual;
    double caixaAnterior;
    double venda;
    double sobra;
    String data;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAprazo() {
        return aprazo;
    }

    public void setAprazo(float aprazo) {
        this.aprazo = aprazo;
    }

    public double getRecebido() {
        return recebido;
    }

    public void setRecebido(float recebido) {
        this.recebido = recebido;
    }

    public double getSaida() {
        return saida;
    }

    public void setSaida(float saida) {
        this.saida = saida;
    }

    public double getCartao() {
        return cartao;
    }

    public void setCartao(float cartao) {
        this.cartao = cartao;
    }

    public double getCaixaAtual() {
        return caixaAtual;
    }

    public void setCaixaAtual(float caixaAtual) {
        this.caixaAtual = caixaAtual;
    }

    public double getCaixaAnterior() {
        return caixaAnterior;
    }

    public void setCaixaAnterior(float caixaAnterior) {
        this.caixaAnterior = caixaAnterior;
    }

    public double getVenda() {
        return venda;
    }

    public void setVenda(float venda) {
        this.venda = venda;
    }

    public double getSobra() {
        return sobra;
    }

    public void setSobra(float sobra) {
        this.sobra = sobra;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    
}
