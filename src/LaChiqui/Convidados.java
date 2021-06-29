package LaChiqui;

import SaveTheRopa.Vestuario;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Convidados {

    private HashMap<Empresa, List<Convidados>> convidados = new HashMap<>();

    private List<Fogos> fogos = new ArrayList<>();

    private String convidado;

    private Empresa tipo;

    public Convidados(String convidado, Empresa tipo) {
        this.convidado = convidado;
        this.tipo = tipo;

    }

    public HashMap<Empresa, List<Convidados>> getConvidados() {
        return convidados;
    }

    public void setConvidados(HashMap<Empresa, List<Convidados>> convidados) {
        this.convidados = convidados;
    }

    public List<Fogos> getFogos() {
        return fogos;
    }

    public void setFogos(List<Fogos> fogos) {
        this.fogos = fogos;
    }

    public String getConvidado() {
        return convidado;
    }

    public void setConvidado(String convidado) {
        this.convidado = convidado;
    }

    public Empresa getTipo() {
        return tipo;
    }

    public void setTipo(Empresa tipo) {
        this.tipo = tipo;
    }

    public void guardarLista(List<Convidados> listaDeConvidados){

        convidados.put(Empresa.MELI, listaDeConvidados);
        System.out.println("Lista de convidados: " + convidados.get(Empresa.MELI).toString());

    }

    public void cortarBolo (List<Convidados> listaDeConvidados){
        System.out.println("O bolo será cortado...pegue sua fatia...");
        for (Convidados l : listaDeConvidados
             ) {
            if(l.tipo == Empresa.MELI){
                System.out.println( l.getConvidado() +  " está comendo bolo... Viva la Chiqui !!");
            }
            else{
                System.out.println( l.getConvidado() +  " está comendo bolo.");
            }

        }

    }

    @Override
    public String toString() {
        return "Convidados{" +
                "convidado='" + convidado + '\'' +
                ", tipo=" + tipo +
                '}';
    }
}
