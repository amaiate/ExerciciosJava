package Dakar;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Veiculo v1 = new Carro(80, 20, 10, "DFR4565");
        Veiculo v2 = new Carro(120, 20, 50, "DFR4568");
        Veiculo v3 = new Carro(120, 20, 50, "DFH4568");
        Corrida c1 = new Corrida(150, 45000, "Altitude Master", 2);

        List<Veiculo> l1 = new ArrayList<>();
        l1.add(v1);
        l1.add(v2);


        c1.setListaDeVeiculos(l1);
        c1.registrarCarro(80, 20, 10, "DFR4565");
        c1.registrarCarro(120, 20, 10, "DFR5565");
        c1.registrarCarro(60, 20, 10, "DFR9565");
        System.out.println(c1);



    }
}
