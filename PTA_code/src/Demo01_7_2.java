import java.util.Scanner;

public class Demo01_7_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        scanner.close();

        int sum = 0;
        int start = (A % 11 == 0) ? A : A + (11 - A % 11);
        int end = (B % 11 == 0) ? B : B - (B % 11);

        if (start <= end) {
            for (int i = start; i <= end; i += 11) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
