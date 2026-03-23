void main() {
    int numero = 3;
    int auxwhile = numero;
    int auxfor = numero;
    long factorial = 1;
    if (numero <= 1) {
        System.out.print("El factorial de " + numero + " es: " + factorial);
    } else {
        //Con while
        while (auxwhile > 0){
            factorial = factorial * auxwhile;
            auxwhile--;
        }
        System.out.print("El factorial hecho con while de " + numero + " es: " + factorial);
        //Con for
        for (int i = 0; i == auxfor; i++) {
            factorial = factorial * auxfor;
        }
        System.out.print("\nEl factorial hecho con for de " + numero + " es: " + factorial);
    }
}