import java.util.Random;
import java.util.Scanner;
public class Matriz {

    public int[][] leerMatriz(int n, int m) {
        Random random = new Random();
        int[][] numeros = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                numeros[i][j] = random.nextInt(90) + 10;
                System.out.println(numeros[i][j]+"  ");
            }
        }
        return numeros;
    }
}
