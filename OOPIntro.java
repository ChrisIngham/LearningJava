import java.util.ArrayList;
import java.util.List;

public class OOPIntro{
    public static void main(String[] args){
        User you = new User();
        you.setFirstName("David");
        you.setLastName("Jones");
    
        User me = new User();
        me.setFirstName("Jack");
        me.setLastName("Sparrow");


        List<User> users = new ArrayList<User>();
        users.add(you);
        users.add(me);
    
        System.out.println(users.get(1).getFullName());
    }
}