package LaChiqui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Convidados c1 = new Convidados("Adriana", Empresa.STANDART);
        Convidados c2= new Convidados("Diego", Empresa.MELI);
        Convidados c3 = new Convidados("Estela", Empresa.MELI);

        List<Convidados> l1 = new ArrayList<>();
        l1.add(c1);
        l1.add(c2);
        l1.add(c3);

        c2.guardarLista(l1);

        Fogos f1 = new Fogos("bommmmm");
        Fogos f2 = new Fogos("bommmmm");
        Fogos f3 = new Fogos("cabummm");
        Fogos f4 = new Fogos("bommmmm");

        List<Fogos> pacoteExplosao = Arrays.asList(new Fogos[]{new Fogos("bommmm"), new Fogos("ximmmmmm")});
        List<Fogos> pacoteFuinha = Arrays.asList(new Fogos[]{new Fogos("caimmmm"), new Fogos("ahsuahsuash")});


        List<Fogos> total = Arrays.asList(f1,f2, f3, f4);

        List<Fogos> total2 = Stream.concat(total.stream(), pacoteExplosao.stream()).collect(Collectors.toList());



        f1.inserirPacoteFogos(total2);

        f1.soltarFogos();
        c2.cortarBolo(l1);


    }
}
