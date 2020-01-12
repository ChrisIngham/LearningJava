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
        
        //Shows the index of where the array is in the list
        System.out.println(User.findUser(users, you));
        //Searching for the values of james and Dean then making them a string as fullname
        System.out.println(User.searchList(users, "James", "Dean"));
    }
   
}