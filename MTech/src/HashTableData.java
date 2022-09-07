import java.util.Hashtable;

class StuData{
    private String name;
    private int rollno;
    public StuData(String name,int no){

        this.name = name;
        this.rollno=no;

    }

    @Override
    public String toString() {
        return name+"\t\t"+String.valueOf(rollno);
    }
}
public class HashTableData {

	public static void main(String[] args) {
		Hashtable<Integer, StuData> ht=new Hashtable<Integer, StuData>();
        StuData e1=new StuData("Snigdha",59);
        StuData e2=new StuData("Vinayak",72);
        StuData e3=new StuData("Utkarsh",68);
        StuData e4=new StuData("Samarth",51);
        StuData e5=new StuData("Anant",1);
        ht.put(1,e1);
        ht.put(2,e2);
        ht.put(3,e3);
        ht.put(4,e4);
        ht.put(5,e5);
        System.out.println(ht);
        
            if(ht.toString() != null && ht.toString().contains("59")) {
                System.out.println("found");
                System.out.println(ht.get(1));
            }
            else
                System.out.println("not found");
        
	}

}
