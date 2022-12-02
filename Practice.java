package ClassExercise.Labs;
import java.util.Arrays;

public class Practice{

     public static void main(String[] args) {
        int [] statues = {6, 3};
        // The output should be 3! since its requires three numbers to make the array in sequantional order by 1///
        Arrays.sort(statues);

        System.out.println(Arrays.toString(statues));
       
        int count = 0;

        for(int i = 0;i < statues.length-1;i++){
            if(statues[i]+1 != statues[i]){
                count++;

            }
            else if(statues[i]+1 == statues[i]){
                return;
            }
        }
        System.out.println(count);



        
    }

}
