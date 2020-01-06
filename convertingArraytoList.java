import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class convertingArraytoList{
    public static void main (String[] args){

        

        List<Integer> grades = Arrays.asList(5,3,2,8,9);

        // Way to output it another way but it longer than the last line of code we have
        for (int i = 0; i < grades.size(); i++){

            // We can modify with .get to change the values of the List
            grades.set(i, grades.get(i)*4);
            System.out.print(grades.get(i) + " ");
        }
        //Lazy formatting
        for (int i = 0; i < 2; i++){  System.out.println();}
    
        /* Quicker and cleaner way of doing the above for loop, with for each.
        this is done by setting a variable as the same type, then the colon means for each value in the array
        so it goes one element at a time till we reach the end. */
        for (int grade : grades){
            System.out.println(grade);
        }



        //lazy formatting 
        System.out.println("");
        // convert a list back to an array so we can print it out as a String
        System.out.println(Arrays.toString(grades.toArray()));

    }

}