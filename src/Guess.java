import java.util.Scanner;

public class Guess {

    public static void main(String[] args) {

        // Create a Scanner object to be able to ask for information in the console
        Scanner scanner = new Scanner(System.in);

        // Create a random number from 1 to 10
        double randomValue = Math.random() * 9 + 1;

        // "Cast"/Change the double to an int
        int numberImThinkingOf = (int)randomValue;


        // Prompt the user to type something into the console
        System.out.println("I'm thinking of a number between 1 and 10, can you guess what it is?");

        // Create a loop to repeat guesses until they get it correct
        while(true){
            
            // Record the value from the User as lowercase letters
            String userGuessStr = scanner.nextLine().toLowerCase();

            // Convert the letters to an int
            int userGuessInt = Integer.parseInt(userGuessStr);

            // Compare the users guess int with the random int

            // If the number is correct, tell them congratulations!
            if (userGuessInt == numberImThinkingOf) {

                System.out.println("That's right, I was thinking of " + numberImThinkingOf + "!");

            // If the number is too low, give them a hint
            } else if(numberImThinkingOf < userGuessInt ){

                System.out.println("Sorry, " + userGuessInt + " is not the number I was thinking of! Try LOWER!");

            // If the number is too high, give them a hint
            } else if(numberImThinkingOf > userGuessInt ){
                
                System.out.println("Sorry, " + userGuessInt + " is not the number I was thinking of! Try HIGHER!");

            }

        }

        //scanner.close();
    }
    
}