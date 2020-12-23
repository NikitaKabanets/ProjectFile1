import java.util.Scanner;

public class Ex41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float amount = scanner.nextFloat();
        float percent = scanner.nextFloat();

        double answer1 = amount*(percent/100);
        double answer2 = Math.ceil(amount*(percent/100));

        double answer3 = answer2-answer1;

        System.out.printf("%.2f", answer3);

    }
}
