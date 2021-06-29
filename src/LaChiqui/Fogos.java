package LaChiqui;

import java.util.*;

public class Fogos {

    private String barulho;

    private HashMap<Integer, List<Fogos> > fogos = new HashMap<>();

    private int contador = 0;

    public String getBarulho() {
        return barulho;
    }

    public void setBarulho(String barulho) {
        this.barulho = barulho;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public HashMap<Integer, List<Fogos>> getFogos() {
        return fogos;
    }

    public void setFogos(HashMap<Integer, List<Fogos>> fogos) {
        this.fogos = fogos;
    }

    public Fogos(String barulho) {
        this.barulho = barulho;
    }

    public void inserirPacoteFogos(List<Fogos> fogosArtificio) {
        this.fogos.put(this.contador, fogosArtificio);
        this.contador++;
    }
    public void soltarFogos(){

        System.out.println("Vamos para os fogos!!!");
        for(Map.Entry<Integer, List<Fogos>> mapFogos : this.fogos.entrySet()) {
            List<Fogos> fogosArtificio = mapFogos.getValue();

            fogosArtificio.forEach(System.out::println);
        }


    }

    @Override
    public String toString() {
        return "Fogos{" +
                "barulho='" + barulho + '}';
    }
}
