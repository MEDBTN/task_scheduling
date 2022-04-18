package simulation;


public class Task {
	
	private int id ;
	private double size; // nbr d'instruction
	private String name;
	private TYPE type;
	
	public Task(int id, double size, String name, TYPE type) {
		this.id = id;
		this.size = size;
		this.name = name;
		this.type = type;
	}
	
	public int getId() { return id; }
	public void setId(int id) { this.id = id; }
	
	public double getSize() { return size; }
	public void setSize(double size) { this.size = size; }
	
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }

	public TYPE getType() { return type; }
	public void setType(TYPE type) { this.type = type; }
	
	
	
	
	

	
}
