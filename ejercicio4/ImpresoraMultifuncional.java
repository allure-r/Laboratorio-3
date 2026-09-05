package ejercicio4;

// Clase ImpresoraMultifuncional que implementa a las interfaces Imprimible y Escanear 
// y por lo tanto debe usar los métodos de las interfaces
public class ImpresoraMultifuncional implements Imprimible, Escanear {
    @Override // Palabra clave que indica que estamos sobreescribiendo el método
    public void imprimir() { // Implementación del método imprimir()
        System.out.println("Impresora imprimiendo");
    }

    @Override // Palabra clave que indica que estamos sobreescribiendo el método
    public void escanear() { // Implementación del método escanear()
        System.out.println("Escaneando documento");
    }
}
