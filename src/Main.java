import java.util.Scanner;
class Main {
    public static void main(String[] args){
        int RandomNumber = (int) (Math.random() * 1001);
        System.out.println(RandomNumber);//for a random number between 0 and 1000.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter guess: ");
        int Guess1 = input.nextInt();
        if (Guess1 > RandomNumber){
            System.out.println("Too high, try again.");}
        else if (Guess1 < RandomNumber){
            System.out.println("Too low, try again.");}
        else {
            System.out.println("Correct!");}
    }
}