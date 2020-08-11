package life;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.Random;
import java.lang.Thread;
class Universe {
    protected int N;
    protected int S;
    public static char[][] arr_curr;
    public static char[][] arr_next;
    public static int Alive = 0;
    public static int gen = 1;

    public Universe(int N, int S) {
        this.N = N;
        this.S = S;
    }

    public void CreateUniverse(int N, int S) {
        Random random = new Random(S);
        arr_curr = new char[N][N];
        arr_next = new char[N][N];
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(random.nextBoolean()) {
                    arr_curr[i][j] = 'O';
                }
                else {
                    arr_curr[i][j] = ' ';
                }
            }
        }
    }

    public void printUniverse(char[][] arr) {
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    public void loop (int n) throws IOException, InterruptedException {
        System.out.println(gen);
        GameOfLife gameOfLife = new GameOfLife();
        if (n == 0) {
            printUniverse(arr_curr);
            aliveCounter();
        }
        else {
            for (int i = 0; i < n; i++) {
                Algorithm.Algo(arr_curr, arr_next);
                swap();
                Alive = 0;
                aliveCounter();
                gameOfLife.update();
                gen++;
                Thread.sleep(1000);
            }
        }
    }

    public void swap(){
        for(int i = 0; i < N; i++) {
            System.arraycopy(arr_next[i], 0, arr_curr[i], 0, N);
        }
    }

    public static void aliveCounter() {
        for (char[] chars : arr_curr) {
            for (int j = 0; j < arr_curr.length; j++) {
                if (chars[j] == 'O') {
                    Alive++;
                }
            }
        }
    }
}