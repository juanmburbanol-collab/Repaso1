package Ejercicios;

public class Repaso3 {

    public static void main(String[] args) {

        int numero= 5;
        int suma = 0;

        for (int i = 1; i <= numero; i++) {
            if (i % 2 != 0) {
                suma = suma + i;
            }
        }

        System.out.println( suma);
    }

}
