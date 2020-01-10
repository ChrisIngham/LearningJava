
public class OOPIntro{
    public static void main(String[] args){
        User user = new User();

        user.setFirstName("David");
        user.setLastName("Jones");
    
        // Making full name
        String fullName = (user.getFirstName() + " " + user.getLastName());

        System.out.println(fullName);

        
    }
}