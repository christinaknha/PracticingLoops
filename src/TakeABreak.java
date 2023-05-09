import java.util.Scanner;
public class TakeABreak {
    public static void main(String[] args){
//      Create scanner for user input
        Scanner scanner = new Scanner(System.in);

//      Ask user if they want to take a break until they say yes
        while (true){
            System.out.println("Do you want to take a break? (if yes, enter yes)");
            String userInput = scanner.nextLine().toLowerCase();
            if (userInput.equals("yes")){
                break;
            }
        }
        System.out.println("Please enjoy your break.");
    }
}
