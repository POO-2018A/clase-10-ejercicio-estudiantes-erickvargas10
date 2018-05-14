package Informacion_Estudiantes;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        int con1 = 0;
        int con2 = 0;
        int con3 = 0;
        int con4 = 0;

        Scanner scan = new Scanner(System.in);
        Estudiante[] estudiante = new Estudiante[4];//registro estudiantes para 5
        System.out.println("INFORMACION ESTUDIANTES");

        System.out.println("ESTUDIANTE 1 :");
        estudiante[0] = new Estudiante("ERICK VARGAS", "1722067855");
        System.out.print("Nombre Completo: " + estudiante[0].getNombreCompleto());
        System.out.println();
        System.out.print("Cedula : " + estudiante[0].getCedula());
        System.out.println();
        System.out.println("Materias :");
        String[] a = {"_Arquitectura", "_fisica"};//a me sirve c omo contador parasaber que materias cogio
        estudiante[0].setMaterias(a);
        String[] materias = estudiante[0].getMaterias();

        for (int i = 0; i < materias.length; i++) {
            System.out.println(materias[i]);
        }
        System.out.println();

        System.out.println("ESTUDIANTE 2 :");
        estudiante[1] = new Estudiante("YARIXA VARGAS", "1722067863");
        System.out.print("Nombre Completo: " + estudiante[1].getNombreCompleto());
        System.out.println();
        System.out.print("Cedula : " + estudiante[1].getCedula());
        System.out.println();
        System.out.println("Materias :");
        String[] b = {"_Psicologia"};
        estudiante[1].setMaterias(b);
        String[] materias1 = estudiante[1].getMaterias();
        for (int i = 0; i < materias.length; i++) {
            System.out.println(materias[i]);
        }
        System.out.println();
        System.out.println("ESTUDIANTE 3 :");
        estudiante[2] = new Estudiante("GRACIELA ALBAN", "1710009873");
        System.out.print("Nombre Completo: " + estudiante[2].getNombreCompleto());
        System.out.println();
        System.out.print("Cedula : " + estudiante[2].getCedula());
        System.out.println();
        System.out.println("Materias :");
        String[] c = {"_Arquitectura", "_quimica"};
        estudiante[2].setMaterias(c);
        String[] materias2 = estudiante[2].getMaterias();
        for (int i = 0; i < materias.length; i++) {
            System.out.println(materias[i]);
        }
        System.out.println();

        System.out.println("ESTUDIANTE 4 :");
        estudiante[3] = new Estudiante("SANTIAGO BONIFAZ", "171290879");
        System.out.print("Nombre Completo: " + estudiante[3].getNombreCompleto());
        System.out.println();
        System.out.print("Cedula : " + estudiante[3].getCedula());
        System.out.println();
        System.out.println("Materias :");
        String[] d = {"_fisica", "_quimica"};
        estudiante[3].setMaterias(d);
        String[] materias3 = estudiante[3].getMaterias();
        for (int i = 0; i < materias.length; i++) {
            System.out.println(materias[i]);
        }
        System.out.println();

        for (int i = 0; i < materias.length; i++) {
            if (materias[i].equals("fisica")) {
                con1++;
            } else if (materias[i].equals("Arquitectura")) {
                con2++;
            } else if (materias[i].equals("Psicologia")) {
                con3++;
            } else if (materias[i].equals("quimica")) {
                con4++;
            }
        }

        System.out.println();
        System.out.println("\t\tResumen Materias");

        System.out.println("fisica : " + con1);
        System.out.println("Arquitectura :" + con2);
        System.out.println("Psicologia :" + con3);
        System.out.println("quimica : " + con4);

    }
}