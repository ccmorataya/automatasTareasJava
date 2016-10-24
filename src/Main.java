import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        String cadena;

        System.out.println("Ingresa la cadena a validar:");
        cadena = datos.nextLine();
        if (automata.imparesCerosUnos())
            System.out.println("La cadena " + cadena + " es valida.");
        else
            System.out.println("La cadena " + cadena + " es invalida");
    }
}
