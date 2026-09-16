import java.util.Scanner;
public class Ejercicio3 {

        public static void main(String[] args) {
            int dias= ingresarDias("ingrese el numero de dias de consumo: ");
            int kwh= ingresarKwh("ingrese la cantidad de kWh consumidos por dia: ");
            int porcentaje= ingresarPorcent("ingrese el porcentaje destinado a electrodomesticos (1-100): ");
            int total= consumoTotal(dias, kwh);
            double destinado= consumoDestinado(total, porcentaje);
            String mensaje= organizarMensaje(total, destinado);
            mostrarMensaje (mensaje);

        }

        public static int  ingresarDias(String mensaje){
            Scanner scanner= new Scanner(System.in);
            System.out.print(mensaje);
            return scanner.nextInt();

        }

        public static int ingresarKwh(String mensaje){
            Scanner scanner= new Scanner(System.in);
            System.out.print(mensaje);
            return scanner.nextInt();
        }

        public static int ingresarPorcent(String mensaje){
            Scanner scanner= new Scanner(System.in);
            System.out.print(mensaje);
            return scanner.nextInt();
        }

        public static int  consumoTotal(int dias, int kwh){
            int Total= dias*kwh;
            return Total;

        }

        public static double consumoDestinado(int Total, int porcentaje){
            double Destinado= Total*porcentaje/100;
            return Destinado;

        }
        public static String organizarMensaje(int Total, double Destinado){
            return "consumo total de energia: "+Total+" kWh\nconsumo destinado a electrodomesticos. "+Destinado+" kWh";

        }

        public static void mostrarMensaje(String mensaje){
            System.out.println(mensaje);



        }
    }



