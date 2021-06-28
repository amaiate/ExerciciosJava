package Exercicios04POOIndividual.Exercicio05;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.Calendar;
import java.util.Date;

public class Data extends Date {

    public Data(Date date) {
        this.data = date;
    }

    private Date data;


    public boolean validaData(String date) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate d = LocalDate.parse(date, formatter);
            System.out.println("Data correta: " + d);
            return true;
        } catch (DateTimeParseException e) {
            System.out.println("Essa data está inválida: " + e);
            return false;

        }
    }


    public void acrescentadata(){
        Calendar c = Calendar.getInstance();
        c.setTime(this.data);
        c.add(Calendar.DATE, 1);
        this.data = c.getTime();
        System.out.println("Acrescentando um dia: "+ this.data);
    }

    @Override
    public String toString() {
        return "Data{" +
                "data= " + data +
                '}';
    }
}
