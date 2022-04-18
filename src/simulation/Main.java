package simulation;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Task t1 = new Task(1, 2000, "T1", TYPE.init);
		Task t2 = new Task(2, 43455, "T2", TYPE.normale);
		Task t3 = new Task(3, 53563, "T3", TYPE.normale);
		Task t4 = new Task(4, 35462, "T4", TYPE.normale);
		Task t5 = new Task(5, 47643, "T5", TYPE.finale);
		
		Link l1 = new Link(t1, t2, 1024);
		Link l2 = new Link(t1, t3, 5048);
		Link l3 = new Link(t2, t4, 54532);
		Link l4 = new Link(t3, t4, 46463);
		Link l5 = new Link(t4, t5, 64632);
		
		ArrayList<Workflow> workflows = new ArrayList<>();
		
		Workflow w1 = new Workflow(t1);
		w1.links.add(l1);
		w1.links.add(l2);
		workflows.add(w1);
		
		Workflow w2 = new Workflow(t2);
		w2.links.add(l1);
		w2.links.add(l3);
		workflows.add(w2);

		Workflow w3 = new Workflow(t3);
		w3.links.add(l2);
		w3.links.add(l4);
		workflows.add(w3);

		Workflow w4 = new Workflow(t4);
		w4.links.add(l3);
		w4.links.add(l4);
		workflows.add(w4);

		
		Workflow w5 = new Workflow(t5);
		w5.links.add(l5);
		workflows.add(w5);

		
		for (Workflow workflow : workflows) {
			
			System.out.println("id = " + workflow.getId());
			System.out.println("name = " + workflow.getName());
			System.out.println("size = " + workflow.getSize());
			System.out.println("Type = " + workflow.getType());
			System.out.println("-------- Links ----------");
			
			for (int i=0; i<workflow.links.size();i++) {
				System.out.println("link initTask = "+ workflow.links.get(i).InitTask.getName());
				System.out.println("link property = "+ workflow.links.get(i).property);
				System.out.println("link FinalTask = "+workflow.links.get(i).finalTask.getName());
				System.out.println("---------------------------------");
			}

			System.out.println("---------------------------------");

		}
		
	}

}
