package simulation;

import java.util.ArrayList;

public class Workflow extends Task{

	ArrayList<Link> links = new ArrayList<>();
		
	public Workflow(Task t) {
		
		super(t.getId(), t.getSize(), t.getName(), t.getType());
	}
	
}
