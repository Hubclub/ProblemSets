import java.util.Scanner;

public class BinarySearchTree {
	
	
	private static Scanner sc; // Scanner, used to read from console
	private static Vertex root; // The root of the the tree
	private static int cost; // Variable, used to save the integer read from the console
	private static int noOfVertexes; // The number of Vertexes
	private static Vertex foundVertex; // Variable used to save the adress of the last root
	
	public static void main(String[] args){
		
		sc = new Scanner(System.in);
		
		System.out.println("Give the number of vertexes");
		if(sc.hasNext()) {
			noOfVertexes = sc.nextInt();
		}
		
		System.out.println("Give the costs");
		if(sc.hasNext()) {
			cost = sc.nextInt();
			root = new Vertex();
			root.setCost(cost);
		}
		int i = 2;
		while(i<=noOfVertexes) {
			cost = sc.nextInt();
			crossTree(foundVertex, cost);
			addVertex(foundVertex, cost);
			i++;
			System.out.println(foundVertex.getCost());
		}
		showTree(root);
		
	}// END OF main METHOD
	
	// Method to cross the entire tree
	// depending on the cost
	private static void crossTree(Vertex root, int cost) {
		foundVertex = root;
		if(foundVertex.getCost()<cost&&foundVertex.getRightSon()!=null) crossTree(foundVertex.getRightSon(), cost);
		else if(foundVertex.getCost()>cost&&foundVertex.getLeftSon()!=null) crossTree(foundVertex.getLeftSon(), cost);
	}// END OF crossTree METHOD
	
	// Method to add vertex to left or to right 
	// depending on the cost
	private static void addVertex(Vertex vertex, int cost) {
		if(vertex.getCost()<cost) {
			Vertex newVertex = new Vertex();
			newVertex.setCost(cost);
			vertex.setRightSon(newVertex);
		}
		else if(vertex.getCost()>cost) {
			Vertex newVertex = new Vertex();
			newVertex.setCost(cost);
			vertex.setLeftSon(newVertex);
		}
	}// END OF addVertex METHOD
	
	// Method to display the tree (RSD function)
	private static void showTree(Vertex showVertex) {
		if(showVertex!=null) {
			System.out.print(showVertex.getCost() + " ");
			showTree(showVertex.getLeftSon());
			showTree(showVertex.getRightSon());
		}
	}// END OF showTree METHOD
}
