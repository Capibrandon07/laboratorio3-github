public class fibonacci {

    // Versión recursiva (Desarrollador 2)
    static int fibRecursivo(int n) {
        if (n <= 1) {
            return n;
        }
        return fibRecursivo(n - 1) + fibRecursivo(n - 2);
    }

    // Versión iterativa (Desarrollador 1)
    static void fibIterativo(int n) {
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int siguiente = a + b;
            a = b;
            b = siguiente;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 10; // cantidad de términos a generar

        System.out.println("Fibonacci iterativo (" + n + " términos):");
        fibIterativo(n);

        System.out.println("Fibonacci recursivo (" + n + " términos):");
        for (int i = 0; i < n; i++) {
            System.out.print(fibRecursivo(i) + " ");
        }
        System.out.println();
    }
}