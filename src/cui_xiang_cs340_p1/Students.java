package cui_xiang_cs340_p1;

import java.util.Random;

public class Students extends Thread{
	
	
	public static String name;
	public boolean takingExam1 = false;
	public boolean takingExam2 = false;
	public boolean getIntoClass = false;
	public boolean arrived = false;
	public boolean doneTheDay = false;
	boolean[] exams = {false, false};
	public boolean ready = false;


	
	public  void msg(String ms){
		System.out.println("["+(currentTime())+"] "+getName()+" : "+ms);
	}
	
	public long currentTime(){
		return System.currentTimeMillis() - Variable.time;
		
	}

	public Students(int sid){
		try {
			sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setName(sid);


	    //boolean arrived = false;
		//msg(Students.name+" is outside of the classroom.");
		try {
			sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		start();
	}
	
	public void setName(int sid){
		Students.name = "Student--"+sid+" " ;
		//System.out.println(name);
	
	}
	public int getRandomNum(){
		Random random = new Random();
		int num = random.nextInt(3000+100);
		
		return num;
		
	}
	public String getName(Students stu){
		return stu.name;
	}
	public void run(){

		if(Instructor.entered == true){
			gotoClass(this);
		}
		try {
			sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(getIntoClass==true && ready == true){
			takeExam1(this);
		} else
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		if(exams[1]==true){
			//takeExam2(this);
		}
		
	}
	public synchronized void takeExam1(Students stu){
			takingExam1 = true;
			msg(getName()+" is taking exam1.");
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			exams[1]=true;
					
	}	public synchronized void takeExam2(Students stu){
		takingExam2 = true;
		msg(getName()+" is taking exam2.");
		try {
			sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		exams[2]=true;
				
}
	public void getIntoClass() {
		setPriority(10);
		try {
			sleep(getRandomNum());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setPriority(5);
		
	}
	
	public synchronized void gotoClass(Students stu){
		
		ready = true;
		//boolean flag = true;
		stu.getIntoClass = true;
		msg(stu.name + " enters into the class");
		try {
			sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}

	
}
