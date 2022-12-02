package ClassExercise.Labs;
import java.util.Scanner;

public class LabFour {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        sumOfTwo(0, 0);
        willSquarrellsPlay(0, false);
        lotteryTickets(0, 0, 0);
        numberOfxx();
        repeatedString();
       


        

       
       


        scanner.close();
    }

    // 1. Given 2 non-negative ints, a and b, return their sum, so long as the sum has the same number of digits as a. 
    //If the sum has more digits than a, just return a without b.

    public static int sumOfTwo (int a, int b){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input a positive number?");
        a = scanner.nextInt();
        System.out.println("Another positive number?");
        b = scanner.nextInt();
        
        


        int sum = a + b;

        if(sum > a ){
            System.out.println(a);
        }
        //else if() {
            System.out.println(sum);
        //}

        
        
        return sum;



        
    }

    /* 2. The squirrels in Palo Alto spend most of the day playing. In particular, they play if the temperature is between 60 and 90 (inclusive). 
    Unless it is summer, then the upper limit is 100 instead of 90. Given an int temperature and a boolean isSummer, return true if the squirrels play and false otherwise.*/


    public static boolean willSquarrellsPlay (int temp, boolean isSummer){
        Scanner scanner = new Scanner(System.in);


        System.out.println("Is it summeer? true or false?");
        isSummer = scanner.nextBoolean();
        System.out.println("What is the temperature ?");
        temp = scanner.nextInt();
        if(isSummer == true){
            if( temp <= 100 && temp >= 60){
                return true;
            }
        }
        else if(isSummer == false){
            if(temp <= 90 && temp >= 60){
                return true;
            }
        }
        return false;
        

    }

    // 3. You have a green lottery ticket, with ints a, b, and c on it. If the numbers are all different from each other, the result is 0. 
    //If all of the numbers are the same, the result is 20. If two of the numbers are the same, the result is 10.
    //greenTicket(1, 2, 3) → 0
    //greenTicket(2, 2, 2) → 20
    //greenTicket(1, 1, 2) → 10

    public static void lotteryTickets(int num1, int num2, int num3){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number?");
        num1 = scanner.nextInt();
        System.out.println("Input another?");
        num2 = scanner.nextInt();
        System.out.println("Input last number?");
        num3 = scanner.nextInt();

        if(num1 != num2 && num1 != num3 && num2 != num3){
            System.out.println("0");
        }
        else if(num1 == num2 && num1 == num3 && num2 == num3){
            System.out.println("20");
        }
        else{
            System.out.println("10");
        }

    }

    //4. Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".//

    public static void numberOfxx(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input words that contians  'x' ?");
        String numberOfxx = scanner.nextLine();
       
        int countX = 0;
        for(int i = 0; i < numberOfxx.length()-1;i++){
            if(numberOfxx.charAt(i) == 'x' && numberOfxx.charAt(i+1) == 'x'){
                countX++;
            }

        }
        System.out.println(countX );
    }



    //5. Given a string and a non-negative int n, return a larger string that is n copies of the original string.
    //stringTimes("Hi", 2) → "HiHi"
    //stringTimes("Hi", 3) → "HiHiHi"
    //stringTimes("Hi", 1) → "Hi"

    public static void repeatedString(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a word?");
        String repeatedWord = scanner.nextLine();
        System.out.println("How mant times to you want to repeat the word?");
        int num = scanner.nextInt();

        String wordsToPrint = repeatedWord.repeat(num);
        System.out.println(wordsToPrint);

    }


    
}
