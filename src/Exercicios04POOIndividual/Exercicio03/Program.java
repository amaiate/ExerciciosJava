package Exercicios04POOIndividual.Exercicio03;

import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Program {

    public static void main(String[] args) {

        Book b1 = new Book("Harry Potter", "Rowling, J. K.", "25466" );
        Book b2 = new Book("Harry Potter2", "Rowling, J. K.", "25469" );
        Book b3 = new Book("Harry Potter3", "Rowling, J. K.", "25468" );

        Date x = new Date();


        Calendar c = Calendar.getInstance();

        b1.Emprestimo(c);
        b2.Emprestimo(c);
        b3.Emprestimo(c);


        b1.Devolver(c);
        b2.Devolver(c);
        b3.Devolver(c);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

    }
}
