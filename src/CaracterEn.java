import com.sun.tools.javac.Main;

import java.util.Scanner;
// EN ESTE PROGRAMA SE ENCUNTRAN JUNTOS EL EJERCICIO 1 Y 2 ///
public class CaracterEn{
    public static void main(String[] args) {
        int psc;
        //String cdn = "DesarrolloDeSistemas3";
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa una cadena de caracteres: ");
        String lectTeclado = sc.nextLine();


        System.out.println("Introduce cualquiero numero para determinar si estamos dentro del rango de la palabra: ");
         psc= sc.nextInt();


        System.out.println("Programa 1 y 2");




         try {
            char rs = caracterEn(lectTeclado, psc);
            System.out.println("#1 El carácter en la posición " + psc + " es: " + rs);
            System.out.print(" ");
            System.out.print("Por tanto estamos dentro del rango");

            //Programa 2
             char resultado = caracterEn(lectTeclado, 7);

             System.out.println(" ");
             System.out.println(" ");
             System.out.println("#2 El carácter en la posición 7 es: " + resultado);




        } catch (Exception e) {
             System.out.println(" ");
             System.out.println(" ");
            System.out.println("Error: " + e.getMessage());

            //programa 2
             System.out.print("En nuestro segundo progra has intentado recuperar una posición de la cadena de caracteres que no existe la cual es la 7ma posicion;");
        }


    }
    public static char caracterEn(String cadena, int posicion) throws Exception {
        int lng = cadena.length();
        if (posicion >= 0 && posicion < lng) {
            return cadena.charAt(posicion);
        } else {
            throw new Exception("Posición fuera del alcance de caracteres"); }}}

////PROGRAMA DE LA RAIZ CUADRADA EN LA SIGUEINTE CLASE////////
