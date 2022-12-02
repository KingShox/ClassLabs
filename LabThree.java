package ClassExercise.Labs;
import java.util.Scanner;

public class LabThree {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please input a word or sentence?");
        String lowercaseword = scanner.nextLine();
        String word = lowercaseword.toLowerCase();


        
        //System.out.println("Which leter do you want to remove?");
        //char letter = scanner.next().charAt(0);
        //System.out.print(removeChar(word, letter));
        //System.out.println("Here is your word without duplicated letter " + removeDuplicate(word));
        displayNonRepeatedChar(word);
        //countVowelsAndConsonats(word);

        scanner.close();

        
    }

    /*  1. Write a method to remove a given character from a string.
     E.g. remove all 'Aa' from Average should return verge (core logic only, no .replace or .replaceAll)*/
     public static String removeChar(String word, char letter){

        String removedCharWord = "";
        for(int i = 0;i < word.length();i++){
            if(word.charAt(i)==letter){
                removedCharWord+="";
            }
            else{
                removedCharWord = removedCharWord+word.charAt(i);
            }
        }
        System.out.println("Your word without " + letter + " is " + removedCharWord);
        return removedCharWord;
     }
     
     /* 2. Write a method to remove duplicate characters from a string.*/
     public static String removeDuplicate(String word){
        for(int i = 0;i < word.length();i++){
            for( int j = i +1;j < word.length();j++){
                if(word.charAt(i) == word.charAt(j)){
                    word = word.replaceAll(Character.toString(word.charAt(i)), "");
                }
            }
        }
      return word;
     }

        
     
     /* 3. Write a method to count the number of vowels and consonants in a string. E.g. if the input is Java the result should be 2 vowels and 2 consonants */
     public static void countVowelsAndConsonats(String word){
        int vowelCount = 0; int consonantsCount = 0;

        
        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u' ){
                vowelCount++;

            }
            else if( word.charAt(i)>= 'a' && word.charAt(i)<= 'z' ){
                consonantsCount++;
            }
            
        }
        System.out.println("Your input has " + vowelCount + " vowels " + " and has " + consonantsCount + " consonants");

     }

     
     /* 4. Write a method to display first non repeated character of a string then the repeating characters. E.g. input morning should display morignn */
     public static void displayNonRepeatedChar(String word){
        
        char[] charOfWord = word.toCharArray();
        for (int i= 0; i < charOfWord.length; i++) {
            System.out.println(charOfWord[i]);
        }
        
        for(int j = 0; j < charOfWord.length;j++){
            for(int k = j +1; k < charOfWord.length;k++){
                if(charOfWord[j] == (charOfWord[k])){
                
                   //char removedLetters = charOfWord.replace(charOfWord[k], ' ');

                }
            }
        }
     }

     /*  Bonus: Make a big, beautiful Menu, using a Switch Case and a Do While or a While loop that will allow a user to access each method, depending on the number selected.
         Allow for the program to repeat and quit when requested.*/

}
