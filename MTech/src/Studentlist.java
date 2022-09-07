import java.util.ArrayList;
import java.util.Scanner;

class StudentData{
    private String name;
    private int roll;
    private int phy;
    private int chem;
    private int maths;

    public void setName(String a,int b,int c,int d,int e) {
        this.name = a;
        this.roll=b;
        this.phy= c;
        this.chem=d;
        this.maths=e;
    }

    @Override
    public String toString() {
        return name+"\t\t"+String.valueOf(roll)+"\t\t"+String.valueOf(phy)+"\t\t"+String.valueOf(chem)+"\t\t"+String.valueOf(maths);
    }
}
public class Studentlist {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        ArrayList<StudentData> arr =new ArrayList<>();
        boolean itr=true;

        try {
            while (itr == true) {
                System.out.println("Choose:- \n 1 for add \t 2 to remove \t 3 for displaying list one at a time \t 4 to add at particular index \t 5 to update value of any index \t 6 to see total no. of students currently studing \t 7 to search \t 8 to exit");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("enter details  to be added");
                        System.out.print("Name:- ");
                        String name= sc.next();
                        System.out.print("Roll Number:- ");
                        int roll= sc.nextInt();
                        System.out.print("Physics Marks:- ");
                        int phy=sc.nextInt();
                        System.out.print("Chemistry Marks:- ");
                        int chem = sc.nextInt();
                        System.out.print("Maths Marks:- ");
                        int maths = sc.nextInt();
                        StudentData e=new StudentData();
                        e.setName(name,roll,phy,chem,maths);
                        arr.add(e);
                        break;

                    case 2:
                        System.out.println("Enter index");
                        int index2 = sc.nextInt();
                        arr.remove(index2);
                        break;

                    case 3:
                        arr.forEach(System.out::println);
                        break;
                    case 4:
                        System.out.println("enter details  to be added");
                        System.out.print("Name:- ");
                        String name1= sc.next();
                        System.out.print("Roll Number:- ");
                        int roll1= sc.nextInt();
                        System.out.print("Physics Marks:- ");
                        int phy1=sc.nextInt();
                        System.out.print("Chemistry Marks:- ");
                        int chem1 = sc.nextInt();
                        System.out.print("Maths Marks:- ");
                        int maths1 = sc.nextInt();
                        StudentData e1=new StudentData();
                        e1.setName(name1,roll1,phy1,chem1,maths1);
                        System.out.println("Enter index");
                        int index1= sc.nextInt();
                        arr.add(index1,e1);
                        break;
                    case 5:
                        System.out.println("Enter index to be updated");
                        int index3= sc.nextInt();
                        System.out.println("enter details  to be added");
                        System.out.print("Name:- ");
                        String name2= sc.next();
                        System.out.print("Roll Number:- ");
                        int roll2= sc.nextInt();
                        System.out.print("Physics Marks:- ");
                        int phy2=sc.nextInt();
                        System.out.print("Chemistry Marks:- ");
                        int chem2 = sc.nextInt();
                        System.out.print("Maths Marks:- ");
                        int maths2 = sc.nextInt();
                        StudentData e2=new StudentData();
                        e2.setName(name2,roll2,phy2,chem2,maths2);                        
                        arr.set(index3,e2);
                        break;
                    case 6:
                        System.out.println(arr.size());
                        break;
                    case 7:
                        System.out.println("Enter roll");
                       // String name3= sc.next();
                        String roll3=sc.next();
                        for(StudentData d : arr){
                            if(d.toString() != null && d.toString().contains(roll3)) {
                                System.out.println("found");
                                System.out.println(d.toString());
                            }
                            else
                                System.out.println("not found");
                        }
                        break;
                    case 8:
                        System.exit(0);
                        break;

                }
            }
            sc.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

	}

}
