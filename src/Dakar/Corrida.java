package Dakar;

import java.util.List;

public class Corrida {

    private double distancia;
    private double premioEmDolares;
    private String nome;
    private int quantidadeVeiculosPermitidos;
    private List<Veiculo> listaDeVeiculos;

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getPremioEmDolares() {
        return premioEmDolares;
    }

    public void setPremioEmDolares(double premioEmDolares) {
        this.premioEmDolares = premioEmDolares;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeVeiculosPermitidos() {
        return quantidadeVeiculosPermitidos;
    }

    public void setQuantidadeVeiculosPermitidos(int quantidadeVeiculosPermitidos) {
        this.quantidadeVeiculosPermitidos = quantidadeVeiculosPermitidos;
    }

    public List<Veiculo> getListaDeVeiculos() {
        return listaDeVeiculos;
    }

    public void setListaDeVeiculos(List<Veiculo> listaDeVeiculos) {
        this.listaDeVeiculos = listaDeVeiculos;
    }

    public void registrarCarro(int velocidade, int aceleracao, int anguloDeGiro, String placa){
        if(this.listaDeVeiculos.size() < this.quantidadeVeiculosPermitidos) {
            this.listaDeVeiculos.add(new Carro(velocidade, aceleracao, anguloDeGiro, placa));
        } else {
            System.out.println("Quantidade máxima de veículos já atingida! Fica para próxima!");
        }
    }

    public void registrarMoto(int velocidade, int aceleracao, int anguloDeGiro, String placa){
        if(this.listaDeVeiculos.size() < this.quantidadeVeiculosPermitidos) {
            this.listaDeVeiculos.add(new Moto(velocidade, aceleracao, anguloDeGiro, placa));
        } else {
            System.out.println("Quantidade máxima de motos já atingida! Fica para próxima!");
        }
    }
}
