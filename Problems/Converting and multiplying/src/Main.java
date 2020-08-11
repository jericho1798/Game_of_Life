import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] arr = new String[20];
        int i = 0;
        String n;
        while (!(n = in.nextLine()).equals("0")) {
            arr[i] = n;
            i++;
        }
        for (int j = 0; j < i; j++) {
            try {
                System.out.println(Integer.parseInt(arr[j]) * 10);
            } catch (Exception e) {
                System.out.println("Invalid user input: " + arr[j]);
            }
        }
    }
}
