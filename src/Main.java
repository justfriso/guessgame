import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//creating scanner object.

        int RandomNumber = (int) (Math.random() * 10);//generating a number between 0 and 1000.

        System.out.println(RandomNumber);//printing the number.

        int attempts = 10;//the amount of attempts to guess the number.

        int i, guess;

        System.out.println("You have 10 attempts to guess a number between 0-1000");

        for (i = 0; i < attempts; i++) {//making sure we haven't exceeded 10 attempts and adding +1 to the attempts.
            System.out.println("Enter your guess:");

            guess = input.nextInt();

            if (RandomNumber == guess) {
                System.out.println("Correct!");
                break;
            } else if (RandomNumber > guess && i != attempts - 1) {
                System.out.println("Too low, try again.");
            } else if (RandomNumber < guess && i != attempts - 1) {
                System.out.println("Too high, try again.");
            }
        }
        if (i == attempts) {
            System.out.println("You have used all your attempts");
            System.out.printf("The number was: "+ RandomNumber);
        }
    }
}