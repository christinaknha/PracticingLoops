import java.util.Scanner;
public class PositiveNumbers {
    public static void main(String[] args){
//      Create scanner to detect user input
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Enter a number: ");
            int userNum = Integer.valueOf(scanner.nextLine());

            if (userNum == 0) {
                break;
            }

            if (userNum < 0) {
                System.out.println("Please enter a number larger than 0.");
                continue;
            }

            System.out.println("Number is " + userNum);

        }
    }
}
