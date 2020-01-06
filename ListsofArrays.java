/*

ArrayList<Integer> grades = new ArrayList <Integer>();

between < > there needs to be a type value known as the generic type

grades.isEmpty() can be used at the start of your code to check if the array contains any values, to avoid errors if nothing is

Size of Arraylist
    grades.size();

CLear a List
    grades.clear();
*/
import java.util.ArrayList;
import java.util.List;

public class ListsofArrays{
    public static void main(String[] args){
        
        List<Integer> grades = new ArrayList<Integer>();
        // Add value into List
        grades.add(10);
      
        // Change the value at given index, then the value you want to replace it with
        grades.set(0,15);
        
        
        if (grades.isEmpty() == false){       
            System.out.println(grades.get(0));

            grades.add(0,50);
            System.out.println(grades);
            // Uses index of to find the value of where it stands, but if we wanted a boolean for a loop we could use grades.contains
            System.out.println("index of the value 50 is: " + grades.indexOf(50));

        }else{
            System.out.println("You must add values to the List");
        }    

    
    
    }
}