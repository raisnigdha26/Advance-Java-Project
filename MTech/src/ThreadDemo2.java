class MyThreadImp implements Runnable{
    Thread t;
    MyThreadImp(String n)
    {
        t=new Thread(this,n);
        System.out.println("Child Thread = "+t);
        t.start();
    }
    public void run()
    {
        try{
            for (int i=5;i>0;i--)
            {
                System.out.println(t.getName()+" "+i);
                Thread.sleep(500);
            }
        }
        catch (InterruptedException e)
        {
            System.out.println("Child Interrupted");
        }
        System.out.println("Terminate child thread");
    }
}
public class ThreadDemo2 {

	public static void main(String[] args) {
		new MyThreadImp("Snigdha");
		new MyThreadImp("Khushi");
        try{
            for (int i=5;i>0;i--)
            {
                System.out.println("Main Thread "+i);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e)
        {
            System.out.println("Main Interrupted");
        }
        System.out.println("Main Thread Finished");
    }

	}

