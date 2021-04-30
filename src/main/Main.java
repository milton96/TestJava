package main;

public class Main {
    private static final int TOTALTABLAS = 10;
    private static final int MULTIPLICADOR = 15;

    public static void main(String[] args) {
        System.out.println("Hola mundo");

        System.out.println("Tablas de multiplicar");
        String texto = "";
        for(int i = 1; i <= TOTALTABLAS; i++) {
            System.out.println("Tabla del: " + i);
            for (int j = 1; j <= MULTIPLICADOR; j++) {
                int result = i * j;
                texto = String.format("%dx%d = %d", i, j, result);
                System.out.println(texto);
            }
            System.out.println();
        }
    }
}
