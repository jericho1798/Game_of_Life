import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int jop = 1;
        int arr[][] = new int[n][n];
        int j = 0;
        while(jop <= n * n) {
            for (int i = j; i < n - j; i++) {
                arr[j][i] = jop;
                jop++;
            }
            for (int i = j + 1; i < n - j; i++) {
                arr[i][n - j - 1] = jop;
                jop++;
            }
            for (int i = n - j - 1; i > j; i--) {
                arr[n - j - 1][i-1] = jop;
                jop++;
            }
            for (int i = n - j - 1; i > j+1; i--) {
                arr[i - 1][j] = jop;
                jop++;
            }
            j++;
        }

        for(int i = 0; i < n; i++) {
            for(int k = 0; k < n; k++) {
                System.out.print(arr[i][k] + " ");
            }
            System.out.println();
        }
    }

}