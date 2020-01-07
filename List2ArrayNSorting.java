import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class List2ArrayNSorting{
    public static void main (String[] args){

        // makes a list that contains the array of 5,7,2,3,1 in it
        List<Integer> allGrades = Arrays.asList(5,7,2,3,1);
        // sort the list. You can also reverse with swapping "sort" to "reverse"
        Collections.sort(allGrades);
        // make new array that we will then convert the list into the array
        int [] grades = new int[allGrades.size()];

        // for all values in allGrades
        for (int i=0; i < allGrades.size(); i++){
            
            // set the array grades =  the allGrades List. Basically just setting allGrades = grades
            grades[i] = allGrades.get(i);
        }
        System.out.println(Arrays.toString(grades));
   
        

    }
 }