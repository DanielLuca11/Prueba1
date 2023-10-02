import java.util.Scanner;

public class Utilidades {
    public static void main(String[] args) {
        String textoIngresado = pideDatoTexto("Por favor, ingrese un texto: ");
        System.out.println("Texto ingresado: " + textoIngresado);
    }

    public static String pideDatoTexto(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensaje);
        String input = scanner.nextLine();
        scanner.close(); // Cierra el scanner cuando hayas terminado de usarlo
        return input;
    }
}
