import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        again dinges = new again();
        Scanner input = new Scanner(System.in);

        int RandomNumber = (int) (Math.random() * 1001);//generating a number between 0 and 1000.

        System.out.println(RandomNumber);//printing the number to make testing easier.

        int attempts = 10;//the amount of attempts to guess the number.

        int i, guess;

        System.out.println("You have 10 attempts to guess a number between 0-1000");

        for (i = 0; i < attempts; i++) {
            System.out.println("Enter your guess: ");

            guess = input.nextInt();

            if (RandomNumber == guess) {
                System.out.println("Correct!");
                System.out.println();
                System.out.println("Would you like to play again?(1 for yes): ");//It's not perfect yet because I still have to implement a different way to say yes and no.
                int answer = input.nextInt();
                if(answer == 1){
                    again.playagain();}
                else {break;}
            } else if (RandomNumber > guess && i != attempts - 1) {
                System.out.println("Too low, try again.");
            } else if (RandomNumber < guess && i != attempts - 1) {
                System.out.println("Too high, try again.");
            }
        }
        if (i == attempts) {
            System.out.println("You have used all your attempts");
            System.out.printf("The number was: "+ RandomNumber);
            System.out.println();
            System.out.println("Would you like to play again?(1 for yes): ");
            int answer = input.nextInt();
            if(answer == 1){
                again.playagain();
            }else {
                return;}
        }

    }
}
