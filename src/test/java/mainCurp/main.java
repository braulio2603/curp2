package mainCurp;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        String primerNombre;
        String segundoNombre;
        String apellidoPaterno;
        String apellidoMaterno;
        String fechNac;

        Scanner sc = new Scanner(System.in);

        System.out.println("Esbribe tu primer nombre: ");
        primerNombre = sc.nextLine();

        System.out.println("Esbribe tu segundo nombre: ");
        segundoNombre = sc.nextLine();

        System.out.println("Esbribe tu apellido paterno: ");
        apellidoPaterno = sc.nextLine();

        System.out.println("Esbribe tu apellido materno: ");
        apellidoMaterno = sc.nextLine();

        System.out.println("Esbribe tu feccha de nacimiento en formato dd/mm/aaaa: ");
        fechNac = sc.nextLine();


        String a = apellidoPaterno.substring(0,2);
        String b = apellidoMaterno.substring(0,1);
        String c = primerNombre.substring(0,1);
        String d = fechNac.substring(8,10);
        String e = fechNac.substring(3,5);
        String f = fechNac.substring(0,2);

         System.out.println("Mi Curp es: " + a+b+c+d+e+f);
    }

}
