package ejercicio3;

// Clase principal para probar el funcionamiento de la clase Vehiculo
// y las clases que heredan de ella
public class TestLSP {

    public static void main(String[] args) {
        // Creamos un objeto de la clase Coche
        Coche coche = new Coche();
        // Creamos un objeto de la clase Bicicleta
        Bicicleta bicicleta = new Bicicleta();
        System.out.println("Coche:");
        // Llamamos al método acelerar del coche
        coche.acelerar();
        System.out.println("Bicicleta:");
        // Llamamos al método acelerar de la bicicleta
        bicicleta.acelerar();
        System.out.println();
        System.out.println("Probando la sustitución:");
        // Creamos una referencia de tipo Vehiculo
        // pero le asignamos un objeto de tipo Coche
        Vehiculo vehiculo1 = new Coche();
        // La subclase Coche puede sustituir a la clase base Vehiculo
        vehiculo1.acelerar();
        // Creamos una referencia de tipo Vehiculo
        // pero le asignamos un objeto de tipo Bicicleta
        Vehiculo vehiculo2 = new Bicicleta();
        // La subclase Bicicleta también puede sustituir a la clase base Vehiculo
        vehiculo2.acelerar();
    }
}
