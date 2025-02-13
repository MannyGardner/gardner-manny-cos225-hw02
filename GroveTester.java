package hw02;

public class GroveTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Grove grove1 = new Grove();
		
		
		
		
		System.out.println(grove1);
		
		Tree tree1 = new Tree(37,1,"Spruce");
		Tree tree2 = new Tree(37,2,"Spruce");
		Tree tree3 = new Tree(37,3,"Spruce");
		Tree tree4 = new Tree(37,4,"Spruce");
		Tree tree5 = new Tree(37,5,"Spruce");
		Tree tree6 = new Tree(37,6,"Spruce");

		grove1.addTree(tree1);
		grove1.addTree(tree2);
		grove1.addTree(tree3);
		grove1.addTree(tree4);
		grove1.addTree(tree5);
		grove1.addTree(tree6);
		
		System.out.println(grove1);
		
		grove1.removeTree(3);
		grove1.removeTree(5);
		
		System.out.println(grove1);
		
		Tree tree7 = new Tree(13,7,"Maple");
		grove1.addTree(tree7);
		
		System.out.println(grove1);
		
	
		

		
		
		
		
	
	}

}
