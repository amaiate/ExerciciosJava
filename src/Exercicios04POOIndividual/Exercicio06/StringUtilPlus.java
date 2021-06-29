package Exercicios04POOIndividual.Exercicio06;


public class StringUtilPlus {

    public static String rpad(String s, char c, int n) {
        String s1 = new String();
        s1 = s;

        for (int i = 0; i < n; i++) {
        s1 = s1 + c;

        }
        return s1;

    }

    public static String ltrim (String s){
        String s1 = "";

        boolean inicioPalavra = true;
        for (char c:s.toCharArray()
             ) {
            if (!(c == ' ')){
                inicioPalavra = false;
                s1 += c;
            }else {
                if (!inicioPalavra){
                    s1 += c;
                }
            }
        }

        return s1;
    }

    public static String rtrim (String s){
        String s1 = "";
        char[] c1 = s.toCharArray();

        for (int i = s.length()-1; i >=0; i--){
                s1 += c1[i];

        }
        String s2 = ltrim(s1);

        c1 = s2.toCharArray();

        s2 = "";
        for (int i = c1.length - 1; i >=0; i--){
            s2 += c1[i];

        }

        return s2;
    }

    public static String trim(String s){
        s = ltrim(s);
        s = rtrim(s);
        return s;
    }

    public static int indexOfN (String s, char c, int n){
        int posicao = -1;
        int contador = 0;

        char[] c1 = s.toCharArray();

        for (int i = 0; i < c1.length; i++
        ) {
            if(c1[i] == c){
                contador ++;
                posicao = i;
            }
            if(contador == n){
                break;
            }
        }

        return posicao;

    }


}
