import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args){
//      Create scanner to find user input
        Scanner scanner = new Scanner(System.in);

//      Ask user to input a number
        System.out.println("Enter a number: ");

//      Save user input into a variable
        int userNum = Integer.valueOf(scanner.nextLine());

        System.out.println("You entered the number: " + userNum);

        for (int i = 1;  i < 11; i++){
            int timesI = userNum * i;
            System.out.println(userNum + " x " + i + " = " + timesI);
        }
    }
}
