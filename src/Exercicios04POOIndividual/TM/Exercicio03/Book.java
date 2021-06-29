package Exercicios04POOIndividual.TM.Exercicio03;

import java.util.Calendar;

public class Book {



    private String titulo;

    private String autor;

    private String codigo;

    private Calendar reserva;

    private Calendar devolucao;

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

    public Calendar getReserva() {
        return reserva;
    }

    public void setReserva(Calendar reserva) {
        this.reserva = reserva;
    }

    public Calendar getDevolucao() {
        return devolucao;
    }

    public void setDevolucao(Calendar devolucao) {
        this.devolucao = devolucao;
    }

    public void Emprestimo(Calendar data){
        this.reserva = data;

    }

    public void Devolver (Calendar data){
        this.devolucao = data;
    }


    @Override
    public String toString() {
        return "Book {" +
                "titulo= '" + titulo + '\'' +
                ", autor= '" + autor + '\'' +
                ", codigo= '" + codigo + '\'' +
                ", reserva= " + reserva.getTime() +
                ", devolucao= " + devolucao.getTime() +
                '}';
    }

    //Quando efetuamos a troca de toString para tostring ele dá um erro pois,
    //Override deve ser usado para sobrescrever métodos.
    //Usamos para estender ou modificar a implementação
    //de um método.

}
