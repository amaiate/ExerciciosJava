package Exercicios04POOIndividual.Exercicio05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {

        Scanner dataDigitada = new Scanner(System.in);
        String n = dataDigitada.next();

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date dataFormatada = formato.parse(n);

        Data dt = new Data(dataFormatada);
        dt.validaData(n);


        dt.acrescentadata();
        dt.acrescentadata();





    }
}
