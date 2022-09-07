class Share{
	public void printName(String name){
		synchronized(this) {
			for(int i=5;i>0;i--) {
			System.out.print("..[");
			System.out.print(name);
			System.out.println("]..");
			try {
				Thread.sleep(200);
			}
			catch(Exception e){
				System.out.println(e);	
			}
		}
	}
}
}
class MyThread extends Thread{
	Share s;
	MyThread(Share s2,String name){
		super(name);
		this.s=s2;
		start();
		
	}
	public void run() {
		s.printName(Thread.currentThread().getName());
	}
}
public class SyncThread {
	public static void main(String[] args) {
		Share s2= new Share();
		new MyThread(s2,"Snigdha");
		new MyThread(s2,"Vinayak");
		}
	}
