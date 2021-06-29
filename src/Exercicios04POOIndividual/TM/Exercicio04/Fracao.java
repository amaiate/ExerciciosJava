package Exercicios04POOIndividual.TM.Exercicio04;

public class Fracao {

    /* Crie uma classe Fracao com métodos necessários para adicionar,
    subtrair, multiplicar e dividir frações. Todos os métodos devem ser
    sobrecarregados para que também possam ser usados para operar
    entre frações e números inteiros (por exemplo: ⅗ + 2 ou ⅝ * 4).
     */
    private int numerador;

    private int denominador;

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }


    public Fracao(int numerador, int denominador) {

        this.numerador = numerador;
        this.denominador = denominador;

    }

    public Fracao(int numerador) {

        this.numerador = numerador;
        this.denominador = 1;

    }

    public void Soma(Fracao f2){

        if(denominador != f2.denominador){
            int denominadorComum = denominador * f2.denominador;
            denominador = denominadorComum / denominador;
            f2.denominador = denominadorComum / f2.denominador;
            numerador = denominador * numerador;
            f2.numerador = f2.denominador * f2.numerador;
            this.numerador = numerador + f2.numerador;
            this.denominador = denominadorComum;
            Simplificar(this.numerador, this.denominador);

        }else{
            numerador = numerador + f2.numerador;
            denominador = denominador;
        }


    }

    public void Subtracao(Fracao f2){

        if(denominador != f2.denominador){
            int denominadorComum = denominador * f2.denominador;
            denominador = denominadorComum / denominador;
            f2.denominador = denominadorComum / f2.denominador;
            numerador = denominador * numerador;
            f2.numerador = f2.denominador * f2.numerador;
            this.numerador = numerador - f2.numerador;
            this.denominador = denominadorComum;
            Simplificar(this.numerador, this.denominador);

        }else{
            numerador = numerador - f2.numerador;
            denominador = denominador;
        }

    }

    public void Multiplicacao(Fracao f2){
        this.numerador = numerador * f2.numerador;
        this.denominador = denominador * f2.denominador;
        Simplificar(this.numerador, this.denominador);
    }

    public void Divisao(Fracao f2){
        this.numerador = numerador * f2.denominador;
        this.denominador = denominador * f2.numerador;
        Simplificar(this.numerador, this.denominador);
    }

    public void Simplificar(int n1, int n2){
        if(n1 % n2 == 0){
            this.numerador = n1 / n2;
             this.denominador = 0;

        }
    }

    @Override
    public String toString() {
        if(denominador == 0 || denominador == 1){
            return "Resultado Fracao{" +
                    numerador +
                    '}';
        } else{
            return "Resultado Fracao{" +
                    numerador + "/"
                    + denominador +
                    '}';

        }

    }
}
