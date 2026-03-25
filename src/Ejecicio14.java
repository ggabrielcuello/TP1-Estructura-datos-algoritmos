void main() {
    // Historial de entrenamientos
    int nDay = 5; // Cantidad de días de entrenamiento

    double[][] historial = {
            {30, 90}, // 30 km en 90 min
            {50, 120}, // 50 km en 120 min
            {20, 80}, // 20 km en 80 min
            {45, 100}, // 45 km en 100 min
            {60, 130} // 60 km en 130 min
    };

    // Fórmulas:
    //  - Velocidad (km/h) = km / (minutos / 60)
    //  - Ritmo MODERADO (< 20 km/h): 400 cal/hora
    //  - Ritmo RÁPIDO  (≥ 20 km/h): 700 cal/hora
    //  - Calorías = tasa_calórica * (minutos / 60)

    double[] calorias = new double[nDay];

    // 1er Bucle (i): Recorre cada día de entrenamiento
    for (int i = 0; i < nDay; i++) {
        double km = historial[i][0];
        double minutos = historial[i][1];
        double horas = minutos / 60.0;
        double velocidad = km / horas;

        double tasaCalorica;
        if (velocidad < 20.0) {
            tasaCalorica = 400; // cal/hora = ritmo moderado
        } else {
            tasaCalorica = 700; // cal/hora = ritmo rápido
        }

        calorias[i] = tasaCalorica * horas;
    }

    System.out.println("1. Historial de entrenamientos | Ciclista");
    // Generar espacios printf (formato)
    // Usar el formato "%-[cantidad]s" ->
    //      "-" = Alineación (- para izquierda y sin - para derecha)
    //      Cantidad = Ancho en caracteres
    //      "s" = Tipo: string
    // Tipos: "s" String (Texto) | "d": int (números) | "f": double (decimales de un número) | "n":	salto de línea
    System.out.printf("%-6s %-10s %-12s %-10s %-10s%n", "Día", "Km", "Tiempo(min)", "Vel(km/h)", "Calorías");

    // 2do Bucle (i): Recorre cada día para imprimir su fila
    for (int i = 0; i < nDay; i++) {
        double km = historial[i][0];
        double minutos = historial[i][1];
        double horas = minutos / 60.0;
        double velocidad = km / horas;
        String ritmo = (velocidad < 20.0) ? "moderado" : "rápido";

        System.out.printf("%-6d %-10.1f %-12.0f %-10.1f %.2f (%s)%n",
                (i + 1), km, minutos, velocidad, calorias[i], ritmo);
    }

    // Mejor entrenamiento
    int mejorDia = 0;
    double maxCalorias = calorias[0];

    // 3er Bucle (i): Recorre todos los días buscando el máximo
    for (int i = 1; i < nDay; i++) {
        if (calorias[i] > maxCalorias) {
            maxCalorias = calorias[i];
            mejorDia = i;
        }
    }

    System.out.println("\n2. Mejor entrenamiento:");
    System.out.printf("Día %d → %.2f calorías quemadas (%.1f km en %.0f min)%n",
            (mejorDia + 1),
            maxCalorias,
            historial[mejorDia][0],
            historial[mejorDia][1]);
}