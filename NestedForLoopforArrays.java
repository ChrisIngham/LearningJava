import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


public class NestedForLoopforArrays{
    public static void main(String[] args){

        List<List<Integer>> allGrades = new ArrayList<List<Integer>>();

        allGrades.add(Arrays.asList(4,26,1,2));
        allGrades.add(Arrays.asList(3,21,52,6));
        allGrades.add(Arrays.asList(10,20,30,40,50,80));


        for (List<Integer> grades : allGrades){
            for (int grade : grades){
                System.out.print(grade + " ");
                
            }
            System.out.println();
        }

  
    }
}