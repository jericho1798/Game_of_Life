package life;
import java.io.IOException;
import java.util.*;

public class Main {
    public static int N;
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner in = new Scanner(System.in);
        Random seed = new Random();
        N = 19;
        int S = seed.nextInt();
        //int num = in.nextInt();
        Universe universe = new Universe(N, S);
        universe.CreateUniverse(N, S);
        universe.loop(11);
    }
}
