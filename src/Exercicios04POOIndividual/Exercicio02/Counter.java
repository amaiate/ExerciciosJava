package Exercicios04POOIndividual.Exercicio02;

public class Counter {

    public int getValorIncial() {
        return valorInicial;
    }

    public void setValorIncial(int valorIncial) {
        this.valorInicial = valorIncial;
    }

    public int getIncremento() {
        return incremento;
    }

    public void setIncremento(int incremento) {
        this.incremento = incremento;
    }

    public int getContar() {
        return contar;
    }

    public void setContar(int contar) {
        this.contar = contar;
    }

    public int getValor() {
        return valor;
    }


    public Counter() {

    }

    public Counter(int valorInicial, int incremento, int contar) {
        this.valorInicial = valorInicial;
        this.incremento = incremento;
        this.contar = contar;
        this.valor = valorInicial;
    }

    private int valorInicial;

    private int incremento;

    private  int contar;

    private int valor;


    public void Adicionar(){
        this.valor += incremento;
    }

    public void Contar(){


        System.out.println("Iniciando contagem...iniciada em: " + valor +
                " contando de... " + incremento + " em " + incremento +
                " durante " + contar + " vezes." );
        for(int i = 0; i < this.contar; i ++){

            System.out.println("Estamos contando..." + getValor());
            this.Adicionar();
        }
    }






}
