import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class ArrayMethods{

    public static void main(String[] args){

        int [] grades1 = {1,2,3,72,5};
        int [] grades2 = {1,6,3,72,5};

        if(Arrays.equals(grades1, grades2)){
            System.out.println("equal");
        }else{
            Arrays.fill(grades2, 0);
            System.out.println("System has reset second set of grades to default(0)");
        }
        String [] grades3 = {"a","b","c"};
        List<String> tests = Arrays.asList(grades3);
        System.out.println(tests);
    }
}