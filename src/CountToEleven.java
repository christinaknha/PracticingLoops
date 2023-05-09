import java.util.Scanner;
public class CountToEleven {
    public static void main(String[] args){
//      Create scanner that looks for user input
        Scanner scanner = new Scanner(System.in);

//      Ask user for a number less than 11
        System.out.println("Please enter a number less than 11.");

//      Save user input
        int userNum = Integer.valueOf(scanner.nextLine());

        while (true) {
            System.out.println(userNum);
            if (userNum >= 11) {
//                System.out.println("Please enter a number less than 11.");
                break;
            }
            userNum = userNum + 1;
        }
    }
}
