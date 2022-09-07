class MyThreadExt extends Thread{
    MyThreadExt(String n)
    {
        super(n);
        System.out.println("Child Thread "+super.getName());
        start();
    }
    public void run()
    {
        try{
            for (int i=5;i>0;i--)
            {
                System.out.println(super.getName()+" "+i);
                Thread.sleep(500);
            }
        }
        catch (InterruptedException e)
        {
            System.out.println("Child Interrupted");
        }
        System.out.println("Child finished");
    }
}
public class ThreadDemo1 {

	public static void main(String[] args) {
		new MyThreadExt("Snigdha");
        new MyThreadExt("Khushi");
        try {
            for (int i=5;i>0;i--)
            {
                System.out.println("Main Thread "+i);
                Thread.sleep(1200);
            }
        }
        catch (InterruptedException e)
        {
            System.out.println("Main Terminated");
        }
        System.out.println("Main Thread Finished");
	}

}
