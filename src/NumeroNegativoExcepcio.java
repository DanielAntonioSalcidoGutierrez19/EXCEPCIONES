import java.util.Scanner;

public class NumeroNegativoExcepcio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un Numero Positivo: ");
        double rs = scanner.nextDouble();
        try {
            if (rs < 0) {
                throw new NumeroNegativoExcepcion();
            } else {
                double sqrtt = Math.sqrt(rs);
                System.out.println("La raíz cuadrada del numero " + rs + " es: " + sqrtt);
            }} catch (NumeroNegativoExcepcion e) {
            System.out.println("Error: " + e.getMessage());}}}
class NumeroNegativoExcepcion extends Exception {

    //CONSTRUCTORES APLICADOS A MI PROGRAMA
    public NumeroNegativoExcepcion() {
        super("El número ingresado es negativo por tanto no puedo obtener la raiz cuadrada");
    }

    public NumeroNegativoExcepcion(String mensaje) {
        super(mensaje);
    }
}