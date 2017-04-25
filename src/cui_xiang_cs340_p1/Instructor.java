package cui_xiang_cs340_p1;

public class Instructor extends Thread {

	public static boolean  entered = false;
	static long[] examTime = {10000,30000,50000};
	
	
	public Instructor(){
		setName("Instructor");
		start();

	}
	
	public void msg(String ms){
		try {
			sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("["+(currentTime())+"] "+getName()+" : "+ms);
	}
	
	public long currentTime(){
		return System.currentTimeMillis() - Variable.time;
		
	}
	
	public void run(){
		try {
			sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		entered = true;	
		//System.out.println(System.currentTimeMillis());
		//System.out.println(Variable.time);
		if(entered == true)
			msg("The instructor enters into the classroom.");
		else 
			msg("Please wait for the instructor.");
	}

	
	
}
