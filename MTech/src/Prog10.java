import java.util.Scanner;

class bankaccount
{
	private String customername;
	private String accno;
	private float balanceamt;
	Scanner sc=new Scanner(System.in);
	 public void openAccount() { 
		 	System.out.print("Enter Account No: ");  
	        accno = sc.next(); 
	        System.out.print("Enter Name: ");  
	        customername = sc.next();  
	        System.out.print("Enter Balance: ");  
	        balanceamt = sc.nextFloat();  
	    }  
	 public void showAccount() {  
	        System.out.println("Name of account holder: " + customername);  
	        System.out.println("Account no.: " + accno); 
	        System.out.println("Balance: " + balanceamt);  
	    }  
	 public void deposit() {  
	        float amt;  
	        System.out.println("Enter the amount you want to deposit: ");  
	        amt = sc.nextFloat();  
	        balanceamt = balanceamt + amt;  
	    }  
	 public void withdrawal() {  
	        float amt;  
	        System.out.println("Enter the amount you want to withdraw: ");  
	        amt = sc.nextFloat();  
	        if (balanceamt >= amt) {  
	            balanceamt = balanceamt - amt;  
	            System.out.println("Balance after withdrawal: " + balanceamt);  
	        } else {  
	            System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!" );  
	        }  
	    }  
}
public class Prog10 {
public static void main(String[] args)
{
	bankaccount bj=new bankaccount();
	bj.openAccount();
	bj.showAccount();
	bj.deposit();
	bj.withdrawal();
}
}
