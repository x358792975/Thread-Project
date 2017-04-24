package cui_xiang_cs340_p1;

import java.util.Random;

public class Main extends Thread {
	
	public static int numOfStudent = 14;
	public static int classCapacity = 10;
	public static int[] StudentSequence = new int[14];
	
	public void msg(String s){
		System.out.println("["+(System.currentTimeMillis()-Variable.time)+"]"+getName()+": "+s);
	}
	
	public static void initialThread(){
		Instructor instr = new Instructor();
		instr.start();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length > 0 && args[0]=="set"){
			numOfStudent = Integer.parseInt(args[1]);
			classCapacity = Integer.parseInt(args[2]);
		}
		if(numOfStudent >20 || numOfStudent <=0){
			System.out.println("The number of students must be between 1 to 20.");
			System.out.println("Set it to default number of students: 14 .");
			numOfStudent = 14;
		}
		
		Instructor prof = new Instructor();
		Students[] students = new Students[numOfStudent];
		Random rand= new Random();
		
		for (int i=1; i<=numOfStudent;i++){
			students[i] = new Students(i);
		}

	}

}
