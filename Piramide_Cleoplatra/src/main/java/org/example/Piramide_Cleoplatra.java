import java.util.Scanner;
public class Piramide_Cleoplatra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numCases = scanner.nextInt();

        for (int i = 0; i < numCases; i++) {
            int A = scanner.nextInt();// lee los numeros
            int B = scanner.nextInt();
            int C = scanner.nextInt();
            int distanciaA = Math.abs(A - B);//lo calcula
            int distanciaC = Math.abs(C - B);
            if (distanciaA < distanciaC) {
                System.out.println(A);
            } else if (distanciaC < distanciaA) {
                System.out.println(C);
            } else {// verfica si es empate
                System.out.println("EMPATE");
            }
        }

        scanner.close();
    }
}
