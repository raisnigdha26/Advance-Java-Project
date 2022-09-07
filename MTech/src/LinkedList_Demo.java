import java.util.LinkedList;

public class LinkedList_Demo {

	public static void main(String[] args) {
		
	        LinkedList<Integer> l1=new LinkedList<>();
	        l1.add(10);
	        l1.add(20);
	        l1.add(30);
	        l1.add(10);
	        l1.add(50);
	        l1.addFirst(2);
	        l1.add(3,5);
	        l1.addLast(70);
	        System.out.println(l1);
	        System.out.print("Getting element at index 3 :- ");
	        System.out.println(l1.get(3));
	        l1.set(1,100);
	        System.out.println("updated list is "+l1);
	        System.out.print("Getting last index of element 10 :- ");
	        System.out.println(l1.lastIndexOf(10));
	        System.out.print("updated list after removing element at index 2 :- ");
	        l1.remove(2);
	        System.out.println(l1);
	        System.out.print("Getting last index of element 50 :- ");
	        System.out.println(l1.indexOf(50));
	        if(l1.contains(30))
	            System.out.println("l1 contains 30");
	        else
	            System.out.println("l1 does not contains 30");
	        l1.remove(3);
	        System.out.println("updated list is "+l1);
	   
	}

}
