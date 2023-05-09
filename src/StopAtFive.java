import java.util.Scanner;
public class StopAtFive {
    public static void main(String[] args){
//      Create scanner to look for user input
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Give a number: ");
            int userNum = Integer.valueOf(scanner.nextLine());

            if (userNum == 5){
                break;
            }

//            if (userNum < 0){
//                System.out.println("Please enter numbers larger than 0.");
//                continue;
//            }
        }
    }
}
