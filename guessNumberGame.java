import java.util.Scanner;

public class guessNumberGame {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int myNumber = (int) (Math.random() *100 );
        int userNumber = 0;

            do{
                System.out.println("Guess My Number (1 to 100)");

                userNumber = scan.nextInt();

                if (userNumber == myNumber){
                    System.out.println("Good! Correct Number... ");
                    break;

                }else if (userNumber > myNumber) {
                    System.out.println("Number is Large ");

                } else{
                    System.out.println("Your Number Is Small ");
                }
                
                } while (userNumber >=0);
                System.out.println("My Number Was...");

                System.out.println();
        }
        }
        


        

    

