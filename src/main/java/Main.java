import java.util.Scanner;

public class Main {	
	
	public static Rectangle get_input() {
    Scanner scanner = new Scanner(System.in);
	System.out.println("pls enter the length");
	int l=scanner.nextInt();
	System.out.println("pls enter the width");
	int w=scanner.nextInt();
	Rectangle rec=new Rectangle(l,w);
	return rec;
	}
	
	
	public static void main(String[] args) {
        String shelly = "Shelly";
		BankAccount acct1 = new BankAccount(30,20,shelly);
		System.out.println("bank account class:");
		  System.out.println("the balance of the account is "+acct1.getBalance());
		  System.out.println("this account should have more than " +acct1.getminBalance());
		System.out.println("balance after the set func = "+acct1.setBalance(40));
		acct1.deposite(200);
		acct1.withdraw(200);
		String target_ac="target";
		BankAccount target = new BankAccount(29, 12,target_ac);
	    boolean result = acct1.transfer(target, 500);
	    System.out.println(" transfer result: " + result);
	    String Lisa_a="lisa";
	    BankAccount Lisa = new BankAccount(1000, -1000,Lisa_a);
	    System.out.println("Lisa's balance  " + Lisa.getBalance()); 
	    String Bob_a="Bob";
	    BankAccount Bob = new BankAccount(1000, -1000,Bob_a);
        System.out.println("Bob's balance " + Bob.getBalance());
	    boolean result2 = Lisa.transfer(Bob, 500);
	    System.out.println(" transfer result: " + result2);
	    if (result2==true) {
	        System.out.println("Lisa's balance after transfer: " + Lisa.getBalance());
	        System.out.println("Bob's balance after transfer: " + Bob.getBalance());
	    }
	    System.out.println();
	    System.out.println("rectangle class:");
	    System.out.println("first rectangle: ");
		Rectangle rec=get_input();
	    System.out.println("second rectangle: ");
		Rectangle rec2=get_input();
		String first=rec.toString();
		String second=rec2.toString();
		System.out.println("the first rec "+first);
		System.out.println("the second rec "+second);
		System.out.println();
		rec.draw();
		System.out.println();
		rec2.draw();
		System.out.println();
		rec.scale(2);
		System.out.println("the first rectangle after scale func");
		rec.draw();
		int area=rec.calcArea();
		System.out.println("the area of the first rectangle after the scale func " +area);
		int parimeter=rec.calcPerimeter();
		System.out.println("the parimeter of the first rectangle after the scale func " + parimeter);
		int area2=rec2.calcArea();
		System.out.println("the area of the second rectangle  " +area2);
		int parimeter2=rec2.calcPerimeter();
		System.out.println("the parimeter of the second rectangle " + parimeter2);
	}
}
