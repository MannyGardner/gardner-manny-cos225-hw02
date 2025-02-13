package hw02;

public class Tree {
	public int age;
	public int numID;
	public String speciesName;
	
	
	public Tree(int age, int numID, String speciesName) {
		this.age=age;
		this.numID=numID;
		this.speciesName=speciesName;
	}
	void treeStats() {
		System.out.println("Age: " + age + " ID: " + numID + " Type: " + speciesName);
	}
}
