import java.util.Random;
import java.util.Scanner;

public class UpAndDownGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int max = 50;

        System.out.println("숫자를 입력하세요.");
        int input = Integer.parseInt(scanner.nextLine());

        int randomNumber = random.nextInt(max);
        int chance = 8;

        while (chance > 1) {
            if (input <= 0 || input > max) {
                System.out.printf("0보다 작거나 %d보다 커서는 안됩니다.\n", max);

                System.out.println("숫자를 입력하세요.");
                input = Integer.parseInt(scanner.nextLine());

            } else {
                if (input == randomNumber) {
                    System.out.println("정답입니다!");
                    break;
                }

                else if (input < randomNumber) {
                    System.out.println("입력받은 숫자가 임의의 숫자보다 작습니다.");

                    chance--;
                    System.out.printf("기회가 %d번 남았습니다.\n", chance);

                    System.out.println("숫자를 입력하세요.");
                    input = Integer.parseInt(scanner.nextLine());
                }

                else if (input > randomNumber) {
                    System.out.println("입력받은 숫자가 임의의 숫자보다 큽니다.");

                    chance--;
                    System.out.printf("기회가 %d번 남았습니다.\n", chance);

                    System.out.println("숫자를 입력하세요.");
                    input = Integer.parseInt(scanner.nextLine());
                }

                else {
                    System.out.println("Impossible");
                }
            }

        }

        scanner.close();

        if (chance == 1) {
            System.out.println("당신은 패배하였습니다.");

            return;
        }
        System.out.println("상금이 지급됩니다.");
    }
}
