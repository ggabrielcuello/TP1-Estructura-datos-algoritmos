import java.util.Scanner;

void main() {
    int intentos = 3;
    final String CONTRASENA_CORRECTA = "Contraseña";
    Scanner teclado = new Scanner(System.in);
    while (intentos > 0){
        System.out.print("Por favor, ingrese su contraseña: ");
        String passwordIngresada = teclado.nextLine();

        if (passwordIngresada.equals(CONTRASENA_CORRECTA)){
            IO.println("Acceso Concedido");
            break;
        } else {
            intentos = intentos - 1;
            IO.println("Accesos Denegado. Intentos: " + intentos);
        }
    }
}