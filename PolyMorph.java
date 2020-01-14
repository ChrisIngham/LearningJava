import java.util.ArrayList;
import java.util.List;

public class PolyMorph {
    public static void main (String [] args){

        Student s = new Student();
        s.firstName = "John";
        s.lastName = "Deer";
        s.major = "Farmer";
        //s.sayHello();
   
    
        Teacher t = new Teacher();
        t.firstName = "Mr.";
        t.lastName = "Brown";

        List<User2> users = new ArrayList<User2>();
        users.add(s);
        users.add(t);

        for (User2 u : users){
            u.sayHello();
        }
    }
}