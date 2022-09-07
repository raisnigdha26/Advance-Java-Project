import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;


class Users_Details{
 private String name;
 void setname(String name){
     this.name=name;
 }
    public String toString() {
        return name;
    }
}
public class KBC_Game {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        ArrayList<Users_Details> arr=new ArrayList<>();
        ArrayList<Users_Details> correct=new ArrayList<>();
        int b=1;
        try {
            while (b <= 5) {
                System.out.println("Your Question is:-\n What is the capital of India?\n 1) Mumbai\n 2) New Delhi\n 3) Kolkata");
                System.out.println("Enter User Name");
                String name = sc.next();
                System.out.println("Enter your answer");
                int num = sc.nextInt();
                Users_Details u = new Users_Details();
                u.setname(name);
                arr.add(u);
                if (num == 2) {
                    correct.add(u);
                }
                b++;
            }
        }
        catch (Exception E)
        {
            System.out.println("Error occured\n Try again");
        }
        System.out.println(arr);
        System.out.println(correct);
        Collections.shuffle(correct);
        if(correct.size()==0)
        {
            System.out.println("No one gave the correct answer");
        }
       else if(correct.size()==1 || correct.size()==2)
        {
            Iterator<Users_Details> ir = correct.iterator();
            for (int i = 1; i <= correct.size(); i++) {
                System.out.println(ir.next());
            }
        }
        else {
            Iterator<Users_Details> ir = correct.iterator();
            for (int i = 1; i <= 3; i++) {
                System.out.println(ir.next());
            }
        }
        sc.close();
        
	}

}
