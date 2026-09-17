package Ejercicios;

public class Repaso1 {

    public static void main(String [] args){

        int numero= 12345;

        int numeroInvertido= invertirNumero(numero);

        System.out.println("el numero es: "+ numeroInvertido);

    }

    public static int invertirNumero(int num){

        int numeroInvertido=0;
        int digito=0;
        for(int i=num; i>0; i/=10){

            digito = i%10;

            numeroInvertido= numeroInvertido*10+digito;

        }

        return numeroInvertido;

    }

}
