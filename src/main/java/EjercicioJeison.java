import java.util.Scanner;

public class EjercicioJeison {
        /*La constructora Baru S.A. lo contrata para crear un programa que les ayude a los diseñadores
         a calcular el espacio físico en metros necesarios (un decimal)
          para parquear una cantidad determinada de vehículos de un ancho estándar dado en metros.
        El programa debe considerar, además del espacio para los vehículos,
        un espacio de 1.30 metros entre los vehículos, así como antes del primero y después del último vehículo en el parqueadero.

        1 ingresar decimal del ancho del carro
        2 cantidad determinada de vehiculos (4)
        3 espacio entre vehiculos de 1.30 metros
        4 sumar el ancho del carro con la cantidad de vehiculos (4)
        5 multiplicar el resultado anterior por 1.30m
        */
        public static void main (String[]args){

            Double anchoEstandar=ingresarDecimal("ingrese el valor del ancho del carro");
            Double cantidadCarros=ingresarDecimal("ingrese la cantidad de carros");
            Double espacioEntreCarros=ingresarDecimal("ingrese el valor entre el espacio de los carros");
            Double valorFinal=calcularValor(anchoEstandar,cantidadCarros,espacioEntreCarros);
            String mensajeFinal=valorTotal(valorFinal);
            mostrarMensaje(mensajeFinal);
        }
        public static Double ingresarDecimal(String texto){
            Scanner scanner =new Scanner(System.in);
            System.out.println(texto);
            double valor=scanner.nextDouble();
            scanner=null;
            return valor;
        }
        public static Double calcularValor(Double anchoEstandar, Double cantidadCarros, Double espacioEntreCarros){
            Double resultado=(anchoEstandar*cantidadCarros)+((cantidadCarros+1)*espacioEntreCarros);
            return resultado;
        }
        public static String valorTotal(Double valorFinal){
            String mensajeFinal="EL ESPACIO FISICO DEL PARQUEADERO SERIA EN TOTAL EL VALOR DE:"+valorFinal;
            return mensajeFinal;
        }
        public static void mostrarMensaje(String mensaje){
            System.out.println(mensaje);
        }

    }







