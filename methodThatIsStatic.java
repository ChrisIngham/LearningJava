import java.util.ArrayList;
import java.util.List;

public class methodThatIsStatic {
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
        
        User.printUsers(users);
    }
   
}