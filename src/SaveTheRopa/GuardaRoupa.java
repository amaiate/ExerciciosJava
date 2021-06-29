package SaveTheRopa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GuardaRoupa {

    private List <Vestuario> vestuarios = new ArrayList<>();

    private int contador = 0;

    private HashMap<Integer, List<Vestuario>> dicionario = new HashMap<>();

    public List<Vestuario> getVestuarios() {
        return vestuarios;
    }

    public void setVestuarios(List<Vestuario> vestuarios) {
        this.vestuarios = vestuarios;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public HashMap<Integer, List<Vestuario>> getDicionario() {
        return dicionario;
    }

    public void setDicionario(HashMap<Integer, List<Vestuario>> dicionario) {
        this.dicionario = dicionario;
    }

    public Integer guardarVestuarios(List<Vestuario> listaDeVestuario){
        this.setContador(this.getContador() + 1);
        dicionario.put(this.getContador(), listaDeVestuario);
        System.out.println("Obrigada por usar nosso serviço, seu código é: " + this.getContador());
        return this.getContador();

    }

    public void mostrarVestuarios(int identificador){
        try {
            System.out.println("Bem vindo a SaveTheRoupa, segue sua lista de roupas: "
                    + dicionario.get(identificador).toString());
        }catch (Exception e){
            System.out.println("Número não localizado.");
        }
    }

    public List<Vestuario> devolverVestuarios(Integer identificador){
        try {
            System.out.println("Bem vindo a SaveTheRoupa, segue sua lista de roupas devolvidas: "
                    + dicionario.get(identificador).toString());

            dicionario.remove(identificador);

        }catch (Exception e){
            System.out.println("Número não localizado.");
        }
        return dicionario.get(identificador);
    }

    @Override
    public String toString() {
        return "GuardaRoupa{" +
                "vestuarios=" + vestuarios +
                ", contador=" + contador +
                ", dicionario=" + dicionario +
                '}';
    }
}
