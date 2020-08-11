package life;

public class Algorithm {
    public static char N;
    public static char S;
    public static char E;
    public static char W;
    public static char NW;
    public static char NE;
    public static char SW;
    public static char SE;

    public static void Algo(char[][] array, char[][] next) {
        for(int i = 0; i < array.length; i++){
            int cnt = 0;
            for(int j = 0; j < array.length; j++) {
                Check(array, i, j);
                cnt = Decision();
                //System.out.print(cnt + " ");
                if(array[i][j] == 'O') {
                    if(cnt < 2 || cnt > 3) {
                        next[i][j] = ' ';
                    }
                    else {
                        next[i][j] = 'O';
                    }
                }
                else {
                    if(cnt == 3) {
                        next[i][j] = 'O';
                    }
                    else {
                        next[i][j] = ' ';
                    }
                }
            }
        }
    }

    public static void Check(char[][] array, int i, int j) {
        if(i == 0) {
            if(j == 0) {
                N = array[array.length - 1][0];
                NE = array[array.length - 1][1];
                E = array[0][1];
                S = array[1][0];
                SE = array[1][1];
                W = array[0][array.length - 1];
                SW = array[1][array.length - 1];
                NW = array[array.length - 1][array.length - 1];
            }
            else {
                if(j == array.length - 1) {
                    N = array[array.length - 1][array.length - 1];
                    NW = array[array.length - 1][array.length - 2];
                    NE = array[array.length -1][0];
                    E = array[0][0];
                    SE = array[1][0];
                    W = array[0][array.length - 2];
                    SW = array[1][array.length - 2];
                    S = array[1][array.length - 1];
                }
                else {
                    N = array[array.length - 1][j];
                    NW = array[array.length - 1][j -1];
                    NE = array[array.length - 1][j + 1];
                    W = array[i][j - 1];
                    E = array[i][j + 1];
                    SW = array[i + 1][j - 1];
                    S = array[i + 1][j];
                    SE = array[i + 1][j + 1];
                }
            }
        }
        else {
            if(i == array.length - 1) {
                if(j == 0) {
                    N = array[array.length - 2][0];
                    NE = array[array.length - 2][1];
                    E = array[array.length - 1][1];
                    W = array[array.length - 1][array.length - 1];
                    NW = array[array.length - 2][array.length - 1];
                    S = array[0][0];
                    SE = array[0][1];
                    SW = array[0][array.length - 1];
                }
                else {
                    if(j == array.length - 1) {
                        N = array[array.length - 2][array.length - 1];
                        NW = array[array.length - 2][array.length - 2];
                        W = array[array.length - 1][array.length - 2];
                        NE = array[array.length - 2][0];
                        E = array[array.length - 1][0];
                        SE = array[0][0];
                        SW = array[0][array.length - 2];
                        S = array[0][array.length - 1];
                    }
                    else {
                        NW = array[array.length - 2][j - 1];
                        N = array[array.length - 2][j];
                        NE = array[array.length - 2][j + 1];
                        W = array[array.length - 1][j - 1];
                        E = array[array.length - 1][j + 1];
                        SW = array[0][j - 1];
                        S = array[0][j];
                        SE = array[0][j + 1];
                    }
                }
            }
            else {
                if(j == 0) {
                    N = array[i - 1][j];
                    NE = array[i - 1][j + 1];
                    E = array[i][j + 1];
                    SE = array[i + 1][j + 1];
                    S = array[i + 1][j];
                    NW = array[i - 1][array.length - 1];
                    W = array[i][array.length - 1];
                    SW = array[i + 1][array.length - 1];
                }
                else {
                    if(j == array.length - 1) {
                        N = array[i - 1][j];
                        S = array[i + 1][j];
                        SW = array[i + 1][j - 1];
                        W = array[i][j - 1];
                        NW = array[i - 1][j - 1];
                        NE = array[i - 1][0];
                        E = array[i][0];
                        SE = array[i + 1][0];
                    }
                    else {
                        N = array[i - 1][j];
                        NE = array[i - 1][j + 1];
                        E = array[i][j + 1];
                        SE = array[i + 1][j + 1];
                        S = array[i + 1][j];
                        SW = array[i + 1][j - 1];
                        W = array[i][j - 1];
                        NW = array[i - 1][j - 1];
                    }
                }
            }
        }
    }

    public static int Decision() {
        int count = 0;
        if(N == 'O') {
            count++;
        }
        if(S == 'O') {
            count++;
        }
        if(E == 'O') {
            count++;
        }
        if(W == 'O') {
            count++;
        }
        if(NW == 'O') {
            count++;
        }
        if(NE == 'O') {
            count++;
        }
        if(SW == 'O') {
            count++;
        }
        if(SE == 'O') {
            count++;
        }
        return count;
    }

}
