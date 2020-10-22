package multiplicacion_eficiente;
import java.util.Scanner;

public class Multiplicacion_eficiente {

    public static void main(String[] args) {

	Scanner entrada_numero = new Scanner(System.in);
        int num, p;

        System.out.print("Ingrese el numero: ");
        num = entrada_numero.nextInt();

        for(p = 1; p <= 10; p++) {

        System.out.println(num + " X " + p + " = " + num*p);
        }
    }

}
