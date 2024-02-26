import java.util.Scanner;

public class NumberGame
{
    public static void main(String[] args)
    {
        int Actual = 45;
        System.out.println("Welcome To Number Game!\n");
        System.out.println("You have 3 choices to guess the correct number\n");
        int count = 3 ;
        while(count>0)
        {
            System.out.println("Enter a number between 1 and 100:");
            Scanner Guess = new Scanner(System.in);
            int guessnum = Guess.nextInt();
            if(guessnum < Actual)
            {
                System.out.println("Your guess is small");
                int res1 = count-1;
                System.out.println("You have "+res1+" chance left\n");
            }
            else if(guessnum > Actual)
            {
                System.out.println("Your guess is high");
                int res2 = count-1;
                System.out.println("You have "+res2+" chance left\n");
            }
            else if(guessnum == Actual && count==3)
            {
                System.out.println("Perfect! You've found the number in first attempt.\n");
                System.out.println("Respect++.\n");
                break;
            }
            else if(guessnum == Actual && count==2)
            {
                System.out.println("Nice! You've found the number in second attempt.\n");
                System.out.println("Misson Accomplished.\n");
                break;
            }
            else if(guessnum == Actual && count==1)
            {
                System.out.println("Bravo!You've found the number in last attempt.\n");
                System.out.println("Good Try.\n");
                break;
            }
            count--;
            if(count == 0)
            {
                System.out.println("You failed to guess the correct number.\n");
                System.out.println("The guess number is "+Actual+"!\n");
                System.out.println("Failure is the learning experience for success.\n");
                System.out.println("Better luck next time!\n");
            }
        }
    }
}
