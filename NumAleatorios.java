public class NumAleatorios {

    public static void main(String[] args) {
        int cantidadNumeros = 500;
        long sumaTotal = 0; 
        int minimo = 10;
        int maximo = 1000;

        // Generar los 500 números y sumarlos
        for (int i = 0; i < cantidadNumeros; i++) {
            // Fórmula para rango: (Math.random() * (maximo - minimo + 1)) + minimo
            int numeroAleatorio = (int) (Math.random() * (maximo - minimo + 1)) + minimo;
            sumaTotal += numeroAleatorio;
        }

        // Calcular el promedio (usamos double para no perder los decimales)
        double promedio = (double) sumaTotal / cantidadNumeros;

        // Mostrar los resultados en la consola
        System.out.println("Suma Total: " + sumaTotal);
        System.out.println("Promedio: " + String.format("%.2f", promedio));
    }
}