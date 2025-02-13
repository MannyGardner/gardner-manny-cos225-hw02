package hw02;
	
public class Grove {
	public Tree treeArray[];
	public String groveName;
	
	public Grove() {
		treeArray = new Tree[16];
	}
	
	public Grove(int groveSize, String groveName) {
		treeArray = new Tree[groveSize];
		this.groveName=groveName;
	}
	
	public int addTree(Tree tree) {
		for(int i = 0; i < treeArray.length; i++) {
			if(treeArray[i] == null) {
				treeArray[i] = tree;
				return i;
			}
		}
		return -1;
	}
		
	public Tree removeTree(int spot) {
		for(int i=0; i < treeArray.length; i++) {
			if(treeArray[i] != null) {
				if(treeArray[i] == treeArray[spot]) {
					Tree treeGone = treeArray[i];
					treeArray[i] = null;
					return treeGone;
					}
				} 
			
		}
		return null;
	}
	
	@Override
	public String toString() {
		int treeCount=0;
		for (int i=0; i < treeArray.length; i++) {
			if(treeArray[i] != null) {
				treeCount += 1;
			}
		}
		String strTreeCount = String.valueOf(treeCount);
		return strTreeCount;
	
		
	}
}
