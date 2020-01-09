
public class OOPIntro{
    public static void main(String[] args){
        User user = new User();

        user.firstName = "David";
        user.lastName = "Jones";
    
        String message = user.output();

        System.out.println(message);
    }
}