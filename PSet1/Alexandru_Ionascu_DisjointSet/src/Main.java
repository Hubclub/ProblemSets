
public class Main {
	
	public static void main(String[] args) {
		
		//Basic example 
		DisjointSet dj = new DisjointSet(10);
		dj.union(3, 4);
		dj.union(2, 8);
		dj.union(3, 8);
		
		System.out.println(dj.find(4));
		
	}
}
