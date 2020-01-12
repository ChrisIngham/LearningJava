import java.util.List;

public class User{
    private String firstName; 
    private String lastName;

    public String output(){
        return "Hi, my name is " + firstName + " " + lastName + ".";
       
    }

    // Getting value from OOPINTRO for First Name
    public String getFirstName(){
        return firstName.toUpperCase();
    }
    
    // Setting value from OOPINTRO for First Name
    public void setFirstName(String fn){
        firstName = fn.strip();
    }
    
    // Getting value from OOPINTRO for Last Name
    public String getLastName(){
        return lastName.toUpperCase();
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
}