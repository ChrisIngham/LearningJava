import java.util.ArrayList;
import java.util.List;

public class searchingArrayMethod {
    public static void main (String [] args){

        User me = new User();
        me.setFirstName("David");
        me.setLastName("Jones");

        User you = new User();
        you.setFirstName("James");
        you.setLastName("Dean");
        
        List<User> users = new ArrayList<User>();
        users.add(me);
        users.add(you);
        
       
    
        System.out.println(User.searchList(users, "James", "Dean"));
    }
   
}