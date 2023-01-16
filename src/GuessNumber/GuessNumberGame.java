package GuessNumber;
import java.sql.SQLOutput;
import java.util.Scanner;
public class GuessNumberGame {

        public static void main(String[] args){
            Scanner scan =new Scanner(System.in);
            int myNumber = (int)(Math.random()*100);

            int userNumber = 0;
            int guessNumber = 0;
            do {
                if(userNumber > 100){
                    System.out.println("Beta tera number out of range ho gya");
                }
                System.out.println("Number Guess karlo(1 - 100)ke Bichme :");
                userNumber = scan.nextInt();

                if(userNumber < myNumber){
                    System.out.println("Beta Tumhara Number Bahut Chota Hai");

                }
                else if(userNumber > myNumber){
                    System.out.println("Beta Tumhara Number Bahut Bada Hai");

                }
                else if(userNumber == myNumber){

                    System.out.println("Tum To Patel Nikle!!!");
                    break;
                }else
                {
                    System.out.println("you attemped in"+ guessNumber);

                } guessNumber++;


            } while(userNumber >= 0);

            System.out.println("My Number was :");
            System.out.println(myNumber);
        }
    }