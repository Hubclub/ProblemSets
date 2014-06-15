import java.util.ArrayList;

public class DisjointSet {
	
	private ArrayList<Integer> father = new ArrayList<Integer>(); //the forest
	private ArrayList<Integer> rank = new ArrayList<Integer>(); //stores rank of tree in order to maintain the balance at union
	
	
	//constructor
	public DisjointSet(int size) {
		
		for(int i = 0; i<size; i++)
		{
			father.add(new Integer(i));
			rank.add(new Integer(0));
		}
	}
	
	//sets father
	public void setFather(int tree, int fatherOfTree) {
		father.set(tree, new Integer(fatherOfTree));
	}
	
	//returns the father
	public int find(int value) {
		if(father.get(value) == value) {
			return value;
		} 
		else {
			return find(father.get(value));
		}
	}
	
	//get value
	public int get(int tree) {
		return father.get(tree);
	}
	
	//union of two trees, optimised with rank array
	public void union(int a, int b) {
		
		int rootX = find(a);
	    int rootY = find(b);

	    if(rootX == rootY)
	        return;
	    if(rank.get(rootX) > rank.get(rootY))
	        father.set(rootY, rootX);
	    else if(rank.get(rootX) < rank.get(rootY))
	        father.set(rootX, rootY);
	    else
	    father.set(rootX, rootY);
	    rank.set(rootY, new Integer(rank.get(rootY))); //just another basic increment in java
		
	}
	
	

}
