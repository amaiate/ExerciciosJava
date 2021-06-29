package SaveTheRopa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {
       Vestuario v1 = new Vestuario("chanel", "bolsa");
       Vestuario v2 = new Vestuario("adidas", "tenis");

        Vestuario v3 = new Vestuario("zara", "blusa");
        Vestuario v4 = new Vestuario("adidas", "camiseta");


        List<Vestuario> l1 = new ArrayList<>();
        l1.add(v1);
        l1.add(v2);

        List<Vestuario> l2 = new ArrayList<>();
        l2.add(v3);
        l2.add(v4);

       GuardaRoupa g1 = new GuardaRoupa();


       g1.guardarVestuarios(l1);
       g1.guardarVestuarios(l2);

       g1.mostrarVestuarios(1);

       g1.devolverVestuarios(1);

       g1.mostrarVestuarios(1);

       g1.mostrarVestuarios(2);




    }
}
