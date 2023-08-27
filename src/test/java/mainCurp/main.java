package mainCurp;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        String primerNombre = "JOSE";
        String segundoNombre = "BRAULIO";
        String apellidoPaterno = "VILLARREAL";
        String apellidoMaterno = "BARRON";
        String fechaNacimiento = "26/03/1995";

        String a =  apellidoPaterno.substring(0,2);
        String b = apellidoMaterno.substring(0,1);
        String c = primerNombre.substring(0,1);
        String d = fechaNacimiento.substring(8,10);
        String e = fechaNacimiento.substring(3,5);
        String f = fechaNacimiento.substring(0,2);

         System.out.println("Mi Curp es: " + a+b+c+d+e+f);
    }

}
