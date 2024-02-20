import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int numero;

        System.out.println("Ingrese un numero por favor entre 1 y 100: ");
        numero = num.nextInt();

        if(numero >=1 && numero <= 100 ){
            if(numero % 2 == 0){
                if(numero >=2 && numero <= 5){
                    System.out.println("No Quipux");
                } else if (numero >= 6 && numero <=20){
                    System.out.println("Quipux");

                }else {
                    System.out.println("No Quipux");
                }
            }
            else {
                System.out.printf("Quipux");
            }

        }
        else {
            System.out.println("EL Numero No se encuentra en el Rango");
        }
    }
}