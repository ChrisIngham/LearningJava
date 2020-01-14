public class Student extends User2{
    public boolean verified = true;
    public String major;

    @Override
    public void sayHello(){
        System.out.println("Hi my major is " + major + ". My name is " + firstName + " " + lastName);
    }

}