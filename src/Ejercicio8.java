import java.util.Scanner;

void main() {
    Scanner teclado = new Scanner(System.in);
    System.out.print("Ingrese el monto a invertir: ");
    double capital = teclado.nextLong();
    System.out.print("Ingrese el interes anual: ");
    double interes = teclado.nextInt();
    System.out.print("Ingrese la cantidad de años: ");
    int anios = teclado.nextInt();
    for (int i = 1; i <= anios; i++) {
        double gananciaDelAno = capital * (interes / 100);
        capital = capital + gananciaDelAno;
        System.out.println("En el año " + i + " el capital sera: $" + capital);
    }
}