import java.util.Scanner;

public class Mesada_Sobrinho {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int entrada = leitor.nextInt();
        int mesada = 50;
        int resultado = 0;

        resultado = entrada * mesada;

        System.out.println(resultado);
    }
}