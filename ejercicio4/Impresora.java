package ejercicio4;

// Clase Impresora que implementa a la interfaz Imprimible
public class Impresora implements Imprimible {
    @Override // Palabra clave que indica que estamos sobreescribiendo el método
    public void imprimir() { // Implementación del método imprimir()
        System.out.println("Impresora imprimiendo");
    }
}
