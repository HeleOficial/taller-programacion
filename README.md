Taller de nivelación PI a PII 
1. ¿Cuáles son los tipos de datos primitivos en Java? 
Los tipos de datos primitivos en Java son ocho: 
 Enteros: byte, short, int, long 
 Decimales: float, double 
 Carácter: char 
 Booleano: boolean (puede tener solo true o false) 
2. ¿Cómo funcionan las estructuras de control de flujo como if, else, switch 
y bucles en Java? 
 if y else: Permiten ejecutar código basado en una condición booleana.
public class EjemploIfElse {
    public static void main(String[] args) {
        int edad = 18;

        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }
    }
}

 switch: Se usa cuando hay múltiples opciones posibles. 

public class EjemploSwitch {
    public static void main(String[] args) {
        int dia = 3;
        switch (dia) {
            case 1: System.out.println("Lunes"); break;
            case 2: System.out.println("Martes"); break;
            case 3: System.out.println("Miércoles"); break;
            default: System.out.println("Día no válido");
        }
    }
}

 Bucles (for, while, do-while): Se utilizan para repetir instrucciones. 

public class EjemploFor {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Número: " + i);
        }
    }
}

public class EjemploWhile {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            System.out.println("Número: " + i);
            i++;
        }
    }
}

public class EjemploDoWhile {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println("Número: " + i);
            i++;
        } while (i <= 5);
    }
}

3. ¿Por qué es importante usar nombres significativos para variables y 
métodos? 
 Facilita la lectura y mantenimiento del código. 
 Ayuda a otros programadores a entender la funcionalidad sin 
necesidad de comentarios excesivos. 
 Mejora la depuración y evita errores en el futuro. 
Ejemplo de mal nombre vs buen nombre:

int x = 10; // ¿Qué representa "x"?

int edadUsuario = 10; // Se entiende que almacena la edad del usuario

4. ¿Qué es la Programación Orientada a Objetos (POO)? 
Es un paradigma de programación basado en objetos, que encapsulan datos y 
comportamientos. Facilita la reutilización del código y su mantenimiento 
mediante conceptos como clases, objetos, herencia, polimorfismo y 
encapsulamiento.

class Animal {
    String nombre;
    void hacerSonido() {
        System.out.println("Sonido genérico de un animal.");
    }
}

public class EjemploPOO {
    public static void main(String[] args) {
        Animal miAnimal = new Animal();
        miAnimal.nombre = "Firulais";
        miAnimal.hacerSonido();
    }
}

5. ¿Cuáles son los cuatro pilares de la Programación Orientada a Objetos? 
1. Encapsulamiento: Restringe el acceso a los datos y métodos. 
class Persona {
    private String nombre;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
2. Herencia: Permite que una clase derive de otra. 
class Animal {
    void hacerSonido() {
        System.out.println("Sonido genérico de un animal.");
    }
}

class Perro extends Animal {
    void hacerSonido() {
        System.out.println("¡Guau, guau!");
    }
}

3. Polimorfismo: Permite tratar objetos de diferentes tipos de forma 
uniforme. 
class Animal {
    void hacerSonido() {
        System.out.println("Sonido genérico");
    }
}

class Perro extends Animal {
    void hacerSonido() {
        System.out.println("Guau!");
    }
}

public class EjemploPolimorfismo {
    public static void main(String[] args) {
        Animal miAnimal = new Perro();
        miAnimal.hacerSonido(); // Salida: Guau!
    }
}

4. Abstracción: Oculta los detalles de implementación y muestra solo lo 
esencial.
abstract class Vehiculo {
    abstract void encender();
}

class Carro extends Vehiculo {
    void encender() {
        System.out.println("Encendiendo el carro...");
    }
}


6. ¿Qué es la herencia en POO y cómo se utiliza en Java? 
La herencia es un mecanismo que permite que una clase (subclase) herede 
atributos y métodos de otra (superclase). Se usa con la palabra clave extends. 
7. ¿Qué son los modificadores de acceso y cuáles son los más comunes en 
Java? 
Los modificadores de acceso controlan la visibilidad de las clases, métodos y 
atributos: 
 public: Accesible desde cualquier parte. 
 private: Solo accesible dentro de la misma clase. 
 protected: Accesible dentro del mismo paquete y por subclases. 
 (Sin modificador – "default"): Accesible solo dentro del mismo 
paquete. 
Ejemplo:
class Persona {
    public String nombre; // Accesible desde cualquier parte
    private int edad; // Solo accesible dentro de la clase
    protected String direccion; // Accesible desde la misma clase, subclases y el mismo paquete

    void establecerEdad(int edad) {
        this.edad = edad;
    }
}

8. ¿Qué es una variable de entorno y por qué son importantes para Java o 
la programación en general? 
Una variable de entorno es una configuración del sistema que almacena 
valores utilizados por programas. Son importantes en Java porque: 
 Se usan para definir la ubicación del JDK (JAVA_HOME). 
 Permiten configurar credenciales y API keys sin exponerlas en el 
código. 
 Facilitan la configuración en entornos de desarrollo y producción. 
Ejemplo de cómo acceder a una variable de entorno en Java:

public class VariablesEntorno {
    public static void main(String[] args) {
        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("La ruta del JDK es: " + javaHome);
    }
}

