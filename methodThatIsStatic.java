import java.util.ArrayList;
import java.util.List;

public class methodThatIsStatic {
    public static void main (String [] args){

        User u = new User();
        u.setFirstName("David");
        u.setLastName("Jones");

        User.printUser(u);
    }
   
}