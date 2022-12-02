package ClassExercise.Labs;
import java.util.Scanner;

public class LabFive {
    public static void main(String[] args) {
        //countChar();
        //removeAllWhiteSpace();
        //findingDuplicates();
        //reverseOrder();
    
    }

    //1. Write a method to count the number of occurrences of the letter ‘a’ in a char array?
    public static void countChar (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a word that has letter 'a' ?");
        String charOFOccuranence = scanner.nextLine();
        charOFOccuranence.toCharArray();

        int countChar = 0;

        for (int i = 0; i < charOFOccuranence.length(); i++) {
            if(charOFOccuranence.charAt(i)== 'a'){
                countChar++;
            }

            
        }
        System.out.println(countChar);
        scanner.close();
    }

    // 2.Write a method to remove all white spaces from a char array//
    public static void removeAllWhiteSpace(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a sentence?");
        String input = scanner.nextLine();
        System.out.println(input.replaceAll("\\s", ""));

        scanner.close();
    }

    //3. Write a method to find duplicate characters in a char array?//

    public static void findingDuplicates(){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String newInput = input.replaceAll("\\s", "");
        newInput.toCharArray();
        


        for (int i = 0; i < newInput.length(); i++) {
            for (int j = i +1; j < newInput.length(); j++) {
                if(newInput.charAt(i) == newInput.charAt(j)){
                    System.out.println(newInput.charAt(j));
                    break;
                    

                }
                
            }
            
        }
        scanner.close();
    }


    //4. Write a method to display the words in reverse order.  “How are you” should be displayed “you are How”//

    public static void reverseOrder(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a sentence?");
        String[] reverseWord = scanner.nextLine().split(" "); 
        String emptyString = ""; 
        for (int i = reverseWord.length - 1; i >= 0; i--) { 
            emptyString += reverseWord[i] + " "; 
        } 
          System.out.println("Reversed String: " + emptyString); 
        scanner.close();  
    }
        
}
