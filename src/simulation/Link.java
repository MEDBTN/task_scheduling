package simulation;

public class Link {
	
	Task InitTask;
	Task finalTask;
	int property; // le debut en kb
	
	public Link(Task initTask, Task finalTask, int property) {
		
		InitTask = initTask;
		this.finalTask = finalTask;
		this.property = property;
	}
	
	
}
