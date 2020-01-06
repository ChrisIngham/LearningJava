/*

Compared to a 1D array you can only store values in {x, x, x, x}

You can store for many rows. So if it is just grades like we did before we can now get grades of the whole class
with each row being a different students grades


A 2D array is written as:

    int [] [] name = new int [x] [y];

with the x being rows and y being columns. 

When adding values you do not need to make all the rows of arrays equal in number of values. ex row 1 can have 2, while rows 2 and 3 have 5

when calling the array when you put:
    grades - this is the whole 2D array
    grades [2] - this calls the whole row at index 2 or the 3rd row
    grades [2][0] - this will get the value at 2,0 so the 3rd row and the first column in normal terms
*/

import java.util.Arrays;

public class TwoDArrays{

    public static void main(String[] args){
        int [] [] grades = {
            {1,4,6},
            {2,3,7,13,6,8,17},
            {5,8,9},
        
        }; 
        // Specific 
        System.out.println(grades[0][2]);
        // Whole Array
        System.out.println(Arrays.deepToString(grades));

        //for loops to print the values of the array 
        for (int i = 0; i < grades.length; i++){
            for (int j = 0; j < grades[i].length; j++){
                System.out.print(grades[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}