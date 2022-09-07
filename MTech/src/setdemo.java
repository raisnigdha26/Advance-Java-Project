import java.util.HashSet;
import java.util.Iterator;
public class setdemo {
public static void main(String[] args) {
	HashSet<String> s=new HashSet<>();
	s.add("Snigdha");
	s.add("Khushi");
	s.add("Rashi");
	s.add("Vinayak");
	s.add("Khushi");
	s.add("Utkarsh");
	s.add("Vaidehi");
	s.add("Samarth");
	s.add("Praful");
	s.add("Prachi");
	s.add("Ananya");
	s.add("Aryika");
	s.add("Shaswat");
	s.add("Rishabh");
	s.add("Sambhavi");
	s.add("Anant");
	s.add("Chiya");
	s.add("Virat");
	s.add("Rohit");
	s.add("Ritu");
	//System.out.println(s);
	Iterator<String> itr= s.iterator();
    while(itr.hasNext())
    {
        System.out.println(itr.next());
    }
	
}
}
