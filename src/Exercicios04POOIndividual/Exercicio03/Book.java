package Exercicios04POOIndividual.Exercicio03;

import java.util.Date;

public class Book {



    private String titulo;

    private String autor;

    private String codigo;

    private Date reserva;

    private Date devolucao;

    public Book() {

    }

    public Book(String titulo, String autor, String codigo) {
        this.titulo = titulo;
        this.autor = autor;
        this.codigo = codigo;

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getReserva() {
        return reserva;
    }

    public void setReserva(Date reserva) {
        this.reserva = reserva;
    }

    public Date getDevolucao() {
        return devolucao;
    }

    public void setDevolucao(Date devolucao) {
        this.devolucao = devolucao;
    }


    @Override
    public String toString() {
        return "Book {" +
                "titulo= '" + titulo + '\'' +
                ", autor= '" + autor + '\'' +
                ", codigo= '" + codigo + '\'' +
                ", reserva= " + reserva +
                ", devolucao= " + devolucao +
                '}';
    }
}
