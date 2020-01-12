import java.util.List;

public class User{
    private String firstName; 
    private String lastName;

    public String output(){
        return "Hi, my name is " + getFirstName() + " " + getLastName() + ".";
       
    }

    public String output(boolean nice){
        if (nice){
            return "You are nice";
        }
        return "you are a freak. - " + getFullName() + ".";
    }
    // Getting value from OOPINTRO for First Name
    public String getFirstName(){
        return firstName;
    }
    
    // Setting value from OOPINTRO for First Name
    public void setFirstName(String fn){
        firstName = fn.strip();
    }
    
    // Getting value from OOPINTRO for Last Name
    public String getLastName(){
        return lastName;
    }
   
    // Setting value from OOPINTRO for Last Name
    public void setLastName(String ln){
        lastName = ln.strip();
    }
   
    // returns fullname
    public String getFullName(){
        return getFirstName() + " " + getLastName();
    }
   
    // Prints full user
    public static void printUsers(List<User> users){
        for (User u : users){
            System.out.println(u.getFullName());
        }
    }

    public static int searchList (List<User> users, String fn, String ln){
        return searchList(users, fn + " " + ln);
    }
    public static int searchList (List<User> users, String fullName){
        for (int i = 0; i < users.size(); i++){
            if (users.get(i).getFullName().equals(fullName) ){
                return i; 
            }
        }
        return -1;
    }
}