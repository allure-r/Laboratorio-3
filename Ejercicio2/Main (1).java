public class Main { // Clase principal del programa
    public static void main(String[] args) { // Método principal
        Forma circulo = new Circulo(); // Crea un objeto círculo
        Forma rectangulo = new Rectangulo(); // Crea un objeto rectángulo
        Forma triangulo = new Triangulo(); // Crea un objeto triángulo
        circulo.dibujar(); // Dibuja el círculo
        rectangulo.dibujar(); // Dibuja el rectángulo
        triangulo.dibujar(); // Dibuja el triángulo
    }
}