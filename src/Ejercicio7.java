import java.util.Scanner;

void main() {
    System.out.print("Por favor, ingrese la temperatura: ");
    Scanner teclado = new Scanner(System.in);
    int temperaturaIngresada = teclado.nextInt();
    if (temperaturaIngresada < 10) {
        IO.println("Frio");
    } else if (temperaturaIngresada <= 20) {
        IO.println("Nublado");
    } else if (temperaturaIngresada <= 30) {
        IO.println("Calor");
    } else {
        IO.println("Tropical");
    }
}