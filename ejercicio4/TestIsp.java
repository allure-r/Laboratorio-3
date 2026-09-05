package ejercicio4;

// Clase principal para probar el funcionamiento de las interfaces 
// y las clases que las implementan
public class TestIsp {

    public static void main(String[] args) {
        // Creamos un objeto de la clase Impresora
        // que solo tiene la capacidad de imprimir
        Impresora impresoraBasica = new Impresora();
        // Creamos un objeto de la clase ImpresoraMultifuncional
        // que tiene la capacidad de imprimir y escanear
        ImpresoraMultifuncional impresoraAvanzada = new ImpresoraMultifuncional();
        System.out.println("Impresora Basica: ");
        // Llamamos al método imprimir de la impresora básica
        impresoraBasica.imprimir();
        System.out.println("Impresora Avanzada: ");
        // Llamamos al método escanear de la impresora multifuncional
        impresoraAvanzada.escanear();
        // Llamamos al método imprimir de la impresora multifuncional
        impresoraAvanzada.imprimir();
    }
}
