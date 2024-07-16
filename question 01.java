package question01;

public class Welcome{
  public static void main(String[] args){
    String FirstName, LastName;
    java.util.Scanner myKey = new java.util.Scanner(System.in);

    System.out.print("Enter First Name");
    FirstName = myKey.nextLine();
    System.out.print("Enter Last Name");
    LastName = myKey.nextLine();
    System.out.println("Welcome to the Second Year" + FirstName + LastName);	
  }
}