import java.util.Scanner;

public class SalidaNoche {
    public static void main(String[] args) {
        System.out.println("Vamos a tomar el aire. Bienvenido");
        //
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombreUsuario = sc.nextLine();
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
        System.out.println("Introduzca su edad");
        int edad = sc.nextInt();
        if (edad < 18){
            System.out.println("Denegada la entrada");
        }else {
            System.out.println("El cliente es mayor de edad");
        }
        int nivelAlcohol = sc.nextInt();
        if (nivelAlcohol > 1.2){
            System.out.println("El cliente no está en condiciones de entrar");
            }
        }

    }

}
