package ClassExercise.Labs;
import java.util.Scanner;

public class LabOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        max3(num1, num2, num3);
        min3(num1, num2, num3);
        middle3(num1, num2, num3);
        boolean a = true;
        boolean b = false;
        System.out.println(isXOR(a, b));
        System.out.println(isFactor(n, k));
        System.out.println(isPerfect(n));
        System.out.println(isPrime(k));
        scanner.close();

    } 

    //1. Write a method called "max3" that finds the largest of THREE integers
    public static void max3(int num1, int num2, int num3){
        if(num1 > num2 &&num1 > num3){
            System.out.println(num1);
        }
        else if(num2 > num3 && num2 > num1){
            System.out.println(num2);
        }
        else{
            System.out.println(num3);
        }
    }

    //2. Write a method called "min3" that finds the smallest of THREE Integers.
    public static void min3(int num1, int num2, int num3){
        if(num1 < num2 &&num1 < num3){
            System.out.println(num1);
        }
        else if(num2 < num3 && num2 < num1){
            System.out.println(num2);
        }
        else{
            System.out.println(num3);
        }
        
    }

    /* 3. Write a method called "middle3" that computes the MIDDLE value of THREE integers.
     Hint: for the case of three numbers, 
     the middle is the value that is NOT the maximum NOR the minimum,
     so add the three values and subtract out the min and max,
     using the methods you wrote for problems #1 and #2.
 */
    public static void middle3(int num1, int num2, int num3){
        System.out.println((num1 + num2 + num3)/3);
    
    }

    /*4. Write a method called "xor" that takes two boolean values (either true or false)
    and returns a boolean value which is true if EITHER of the values is true BUT NOT BOTH of them.
    This is called the "xor" function, or "eXclusive OR" (where we are excluding the case where both values are true).*/
    
    public static boolean isXOR(boolean a , boolean b){
        boolean resultXOR = false;
        if(a == false || b == true){
            resultXOR = true;
        }
        if (a == true || b == false){
            resultXOR = true;
        }
        return resultXOR;
    }
    
   //5. Write a method "isFactor" which takes two integers (k and n) and returns true if ("if and only if") k is a factor of n.

    public static boolean isFactor(int n, int k){
        boolean factor = (n % k == 0);
        return factor;
    }

    /*6. Write a method "isPerfect" which takes an integer and 
    returns true if that integer is a perfect number Your method MUST call 
    the "isFactor" method you wrote for problem #5.*/ 

    public static boolean isPerfect(int n){
        int sum = 0;
        for(int i =1; i < n; i++) {
            if(isFactor(n, i)) {
                sum+=i;
            }


        }
        if(sum == n){
            return true;

        }
        else{
            
            return false;
        }
    }

    /*7. Write a method "isPrime" which takes an integer and 
    returns true if it is a prime number. 
    Your method MUST call the "isFactor" method you wrote for problem #5.*/
    public static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }

        }
        return true;
    }    
            
}


            

    




