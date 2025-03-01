import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nom = "";
        int ed = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduzca su nombre: ");
        nom = sc.nextLine();
        
        System.out.print("Ingrese su edad: ");
        ed = sc.nextInt();
        sc.nextLine();

        Persona p1 = new Persona(nom, ed);

        System.out.print("Ingrese su país de nacimiento: ");
        String pais = sc.nextLine();
        p1.setPaisNacimiento(pais);

        System.out.print("Ingrese su género (H/M): ");
        char gen = sc.next().charAt(0);
        p1.setGenero(gen);

        p1.decidir();
        System.out.println("\nInformación completa:");
        p1.imprimir();
        
        sc.close();
    }
}


public class Persona {
    private int edad;
    private String nombre;
    private String paisNacimiento;
    private char genero;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.paisNacimiento = "";
        this.genero = ' ';
    }

    public void setEdad(int e) {
        edad = e;
    }

    public void setNombre(String n) {
        nombre = n;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPaisNacimiento() {
        return paisNacimiento;
    }

    public void setPaisNacimiento(String pais) {
        this.paisNacimiento = pais;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public void decidir() {
        if (edad >= 18) {
            System.out.println(nombre + " es mayor de edad");
        } else {
            System.out.println(nombre + " es menor de edad");
        }
    }

    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("País de nacimiento: " + paisNacimiento);
        System.out.println("Género: " + genero);
    }
}
