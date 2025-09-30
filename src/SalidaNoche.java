import java.util.Scanner;

public class SalidaNoche {
    public static void main(String[] args) {
        System.out.println("Vamos a tomar el aire. Bienvenido");
        //
        int nivelAlcohol = 0.0;
        int precioChupito = 3;
        int precioCaña = 1.8;
        int precioCombinado = 8;
        int nivelChupito = 0.25;
        int nivelCaña = 0.1;
        int nivelCombinado = 0.4;
        //
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombreCliente = sc.nextLine();
        //
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca su edad");
        int edadCliente = sc.nextInt();
        //
        int dineroCliente = 15;
        //
        System.out.println("El cliente" + nombreCliente + "con edad" + edadCliente + "," + "tiene 15 euros");
        //
        System.out.println("Comprobación de edad del cliente");
        if (edadCliente < 18){
            System.out.println("Denegada la entrada");
        }else {
            System.out.println("El cliente es mayor de edad");
        }
        int nivelAlcohol = sc.nextInt();
        if (nivelAlcohol < 1.2){
            System.out.println("El cliente puede entrar");
        } else {
            System.out.println("El cliente no está en condiciones de entrar");
        }
        //
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca lo que quiere beber");
        int sumaAlcohol = nivelAlcohol + nivelChupito + nivelCaña + nivelCombinado;
        System.out.println("Se incrementa el alcohol en " + sumaAlcohol);
        //
        int restaDinero = precioChupito - precioCaña - precioCombinado;
        System.out.println("El resultado de la resta es: " + resultadoResta);
        }

    }

}
