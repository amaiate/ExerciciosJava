package Dakar;

import java.util.ArrayList;
import java.util.List;

public class Corrida {

    private double distancia;
    private double premioEmDolares;
    private String nome;
    private int quantidadeVeiculosPermitidos;
    private List<Veiculo> listaDeVeiculos;
    private SocorrendoCarro socorristaCarro;
    private SocorrendoMoto socorristaMoto;

    public Corrida(double distancia, double premioEmDolares, String nome, int quantidadeVeiculosPermitidos) {
        this.distancia = distancia;
        this.premioEmDolares = premioEmDolares;
        this.nome = nome;
        this.quantidadeVeiculosPermitidos = quantidadeVeiculosPermitidos;

    }

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

    public void removerVeiculo(Veiculo veiculo){
        this.listaDeVeiculos.remove(veiculo);
    }

    public void removerVeiculoPorPlaca(String placa){
       this.listaDeVeiculos.remove(this.listaDeVeiculos.contains(placa));
    }

    public Veiculo vencedorCorrida(){

        int maior = 0;
        List<Double> velocidade = new ArrayList<>();

        for(Veiculo veiculo : this.listaDeVeiculos) {
            double valor = (veiculo.getVelocidade() * veiculo.getAceleracao()) / (veiculo.getAnguloDeGiro() * (veiculo.getPeso() - veiculo.getRodas() * 100));
            velocidade.add(valor);
        }

        for(int i = 1; i <= velocidade.size() - 1; i++) {
            if(velocidade.get(maior) < velocidade.get(i)) {
                maior = i;
            }
        }
        System.out.println("O grande vencedor da corrida foiiii.... " + this.listaDeVeiculos.get(maior));
        return this.listaDeVeiculos.size() > 0 ? this.listaDeVeiculos.get(maior) : null;
    }

    public void socorrerCarro(String documento) {
        int index = procuraIndexPlaca(documento);

        if(index != -1) {
            this.socorristaCarro.socorristaCarro((Carro) this.listaDeVeiculos.get(index));
        } else {
            System.out.println("Carro não inscrito na corrida!");
        }
    }

    public void socorrerMoto(String documento) {
        int index = procuraIndexPlaca(documento);

        if(index != -1) {
            this.socorristaMoto.SocorristaMoto((Moto) this.listaDeVeiculos.get(index));
        } else {
            System.out.println("Moto não inscrito na corrida!");
        }
    }

    private int procuraIndexPlaca(String placa) {
        int index = -1;

        for(int i = 0; i < this.listaDeVeiculos.size(); i++) {
            if(this.listaDeVeiculos.get(i).getPlaca().equals(placa)) {
                index = i;
            }
        }

        return index;
    }

    @Override
    public String toString() {
        return "Corrida{" +
                "distancia=" + distancia +
                ", premioEmDolares=" + premioEmDolares +
                ", nome='" + nome + '\'' +
                ", quantidadeVeiculosPermitidos=" + quantidadeVeiculosPermitidos +
                ", listaDeVeiculos=" + listaDeVeiculos +
                ", socorristaCarro=" + socorristaCarro +
                ", socorristaMoto=" + socorristaMoto +
                '}';
    }
}

