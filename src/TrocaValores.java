import java.util.Scanner;

public class TrocaValores {

    public static void main(String[] args){

        int a, b, aux;

        Scanner leia = new Scanner(System.in);

        System.out.println(" entre com o valor de a:");
        a = leia.nextInt();

        System.out.println(" entre com valor de b: ");
        b = leia.nextInt();

        // Rotina de troca de valores

        aux = a;
        a = b;
        b = aux;

        System.out.println(" a agora vale: " + a + "\n");
        System.out.println(" b agora vale: " + b + "\n");
    }





}
