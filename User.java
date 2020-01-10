
public class User{
    private String firstName; 
    public String lastName;

    public String output(){
       
        return "Hi, my name is " + firstName + " " + lastName + ".";
       
    }

    // Getting value from OOPINTRO for First Name
    public String getFirstName(){
        return firstName.toUpperCase();
    }
    // Setting value from OOPINTRO for First Name

    public void setFirstName(String fn){
        firstName = fn;
    }
    // Getting value from OOPINTRO for Last Name

    public String getLastName(){
        return lastName.toUpperCase();
    }
    // Setting value from OOPINTRO for Last Name
    public void setLastName(String ln){
        lastName = ln;
    }
}