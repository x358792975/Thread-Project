package cui_xiang_cs340_p1;
import java.util.Random;
public class Students extends Thread{
	public static int id=0;
	public static String name;
	String exams[]= {"Exam1", "Exam2", "Exam3"};
	
	
	public Students(int sid){
		setName(sid);
		start();
	}
	
	public void setName(int sid){
		Students.name = "Student--"+sid+" " ;
	
	}
	public String getName(Students stu){
		return stu.name;
	}
	
}
