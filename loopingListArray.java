import java.util.ArrayList;
import java.util.List;

public class loopingListArray{
    public static void main(String[] args){
        String[] firstNames = {"Stephanie", "Steven", "Mark",  "Joe"};
        String[] lastNames = {"Smith", "Wilson", "Kraft", "Goldberg"};
        
        List<User> users = new ArrayList<User>();

        for (int i = 0; i < firstNames.length; i++){
            User u = new User();
            u.setFirstName(firstNames[i]);
            u.setLastName(lastNames[i]);    
            users.add(u);
        }
        for (User u : users){
            System.out.println(u.getFullName());
        }

        loopingListArray m = new loopingListArray();
        m.printUser(users.get(2));
    }

    public void printUser(User u){
        System.out.println(u.getFullName());
    }

}