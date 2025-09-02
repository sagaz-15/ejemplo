import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //instanciando matriz
        Matriz matrices = new Matriz();

        //definir variables
        int n, m;

        //ingreso de datos
        System.out.print("cuantas filas tiene la matriz: ");
        n=sc.nextInt();
        System.out.print("Cuantas columnas tiene la matriz: ");
        m=sc.nextInt();

        int[][] numeros = new int[n][m];

        //llenar matriz
        numeros= matrices.leerMatriz(n,m);

    }
}
