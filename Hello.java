import java.util.Scanner;
class Hello{
    void display(){
        System.out.println("This is function");
    }

public static void main(String args[])
{
    Hello h=new Hello();
    h.display();
    Scanner in=new Scanner(System.in);
    System.out.println("Enter your name ");
    String name=in.next();
    System.out.println("Welcome to Java Class, My name is "+name);

}
}
