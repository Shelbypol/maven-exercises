import java.util.Scanner;

import static org.apache.commons.lang3.StringUtils.*;

public class Practice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NUM");
        String userInput = sc.nextLine();
        //isNumeric
        System.out.println(isNumeric(userInput));
        //Flips the case of the string
        System.out.println("ENTER SENTENCE");
        System.out.println(swapCase(userInput));
        //Reverses the string
        System.out.println("ENTER REVERSE");
        System.out.println(reverse(userInput));
    }
}
