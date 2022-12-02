package ClassExercise.Labs;
import java.util.Scanner;


public class LabTwo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int radius = scanner.nextInt();
        //int width = scanner.nextInt();
        //int height = scanner.nextInt();
        int num1 = scanner.nextInt();
        //char letter = scanner.next().charAt(0);
        //double decimalNum = scanner.nextDouble();
        //int year = scanner.nextInt();
        //areaOfRadius(radius);
        //areaOfTriangle(width, height);
        //evenOrOdd(num1);
        System.out.println(convertToDecimal(num1));
        //letterToAsciiValue(letter); 
        //decimalToInteger(decimalNum);  
        //isLeapYear(year); 
        scanner.close();    
    }
    /*1. Write a method to prompt the user to enter the radius of the circle 
        then calculate the area and circumference of the circle.*/

    public static void areaOfRadius(int radius){
        double area = 3.14 *(radius * radius);
        double circumference = 2 * 3.14 * radius;
        System.out.println( "The area of radius is " + area);
        System.out.println("The circumference of the radius is " + circumference);

    } 
    /* 2. Write a method to prompt the user for base-width and height of a triangle,
     then calculate the area of the Triangle.*/
     
    public static void areaOfTriangle(int width, int height){
        double area = (width * height)/2;
        System.out.println(" the Area of the trianlge is " + area);
    }
    
    /* 3. Write a method to prompt the user for a number then display check if the number is Even or Odd.*/

    public static void evenOrOdd(int num1){
        if(num1 % 2 == 0){
            System.out.println("Your number is Even!");
        }
        else{
            System.out.println("Your number is Odd!");
        }
    }

    /* 4. Write a method to prompt the user for an Integer 
    then display the same value with one decimal place. 
    eg user enter "15 " result is: "You entered 15, the new value is 15.0". */
    
    public static double convertToDecimal(int num1 ){
        double decimal = (num1 * 100)/100;
        return decimal;
    }

    // 5. Write a method to prompt the user for a letter of the alphabet and display it's ascii value.

    public static void letterToAsciiValue(char letter){
        int asciiNum = letter;
        System.out.println(asciiNum);
    }

    /*6. Write a method to prompt the user for a double then display the value as a whole number. 
    eg user enter "15 .8" result is: "You entered 15.8, the new value is 16". 
    eg user enter "15 .4" result is: "You entered 15.4, the new value is 15" */

    public static void decimalToInteger(double decimalNum){
        int wholeNum = (int) Math.round(decimalNum);
        System.out.println(wholeNum);

    }

    /* 7. Write a method to prompt the user for 4 digits representing a year. Then determine If Year Is a Leap Year.
     * 
     * How to determine whether a year is a leap year! *

     * 1. If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
     * 2. If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
     * 3 .If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
     * 4. The year is a leap year (it has 366 days).
     * 5. The year is not a leap year (it has 365 days).
    */

    public static void isLeapYear(int year){
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.println("The year IS a leap year!");
                }
                else{
                    System.out.println("The year IS NOT a leap year!");
                }
            }
            else{
                System.out.println("The year IS a leap year!");
            }
        }
        else{
            System.out.println("The year IS NOT a leap year!");
        }
    }
    

}
