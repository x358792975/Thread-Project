package cui_xiang_cs340_p1;

public class Instructor extends Thread {

	public Instructor(){
		setName("Instructor");
		start();
		msg("The instructor enters into the classroom.");
	}
	
	public void msg(String ms){
		System.out.println("["+(currentTime())+"] "+getName()+" : "+ms);
	}
	
	public long currentTime(){
		return System.currentTimeMillis() - Variable.time;
		
	}
	
	public void run(){
		while(Variable.ClassStatus[Students.Classes.length-1]!="Done"){
			for(int i=0; i<Students.Classes.length;i++){
				if(currentTime() >= ClassSched[i] && currentTime() <=ClassSched[i]+classlength)
					if(ClassStarted[i] == "No")
						msg(" started "+ Students.Class[i]+".");
					ClassStarted[i]="Yes";
					Variable.ClassStatus[i]="On";
					Variable.InstructorArrives.instructorArrivedToClass();
					
				if(currentTime() > ClassSched[i] + classlength) {
					if(ClassStarted[i] == "Yes")
						msg(" ended "+Students.Classes[i] + ".");
					
					ClassStarted[i] = "Done";
					Variable.ClassStatus[i]="Over;"
				}
				
			}
			if(currentTime() >=ClassSched[1] + classlength && currentTime() <= ClassSched[2]){
				if()
			}
		}
	}
	
}
