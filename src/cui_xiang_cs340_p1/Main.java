package cui_xiang_cs340_p1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;


public class Main extends Thread {
	
	public static int numOfStudent = 14;
	public static int classCapacity = 10;


	public static int getRandomNum(){
		Random random = new Random();
		int num = random.nextInt(2000+100);
		
		return num;
		
	}
	public void msg(String s){
		System.out.println("["+(System.currentTimeMillis()-Variable.time)+"]"+getName()+": "+s);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Here is for common line arguments
		 * 
		 * 
		if (args.length > 0 && args[0]=="set"){
			numOfStudent = Integer.parseInt(args[1]);
			classCapacity = Integer.parseInt(args[2]);
		}
		if(numOfStudent >20 || numOfStudent <=0){
			System.out.println("The number of students must be between 1 to 20.");
			System.out.println("Set it to default number of students: 14 .");
			numOfStudent = 14;
		}*/
		Variable v = new Variable();
		System.out.println("Starting the process!");
		try {
			sleep(getRandomNum());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(System.currentTimeMillis());
 
		Instructor instr =new Instructor();
		
		try {
			sleep(getRandomNum());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

				
	    Integer[] arr = new Integer[numOfStudent];
	    for (int i = 0; i < arr.length; i++) {
	        arr[i] = i+1;
	    }
	    Collections.shuffle(Arrays.asList(arr));
	    /*
	    System.out.print(arr[2]);
	    System.out.println(Arrays.toString(arr));*/
  		Students[] students = new Students[numOfStudent];	 
		for (int i=0; i<numOfStudent;i++){
			students[i] = new Students(arr[i]);
			//System.out.println("The name is " + students[i].name);
		}	
		
		instr.msg("Exam 1 starts! ");
		
		/*for(int i=0; i<classCapacity; i++){
			students[i].takeExam1(students[i]);
		}*/
		
		try {
			sleep(15000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		instr.msg("Exam 1 ended! ");
		try {
			sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		instr.msg("Exam 2 starts! ");
		try {
			sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		instr.msg("Exam 2 ended!");
		}
		


}
