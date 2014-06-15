// Vertex class
public class Vertex {
	
	private int cost;
	private Vertex rightSon;
	private Vertex leftSon;
	
	// The constructor initializes the cost, rightSon and leftSon
	public Vertex() {
		cost = 0;
		rightSon = null;
		leftSon = null;
	}// END OF CONSTRUCTOR
	
	// Method to set the cost
	public void setCost(int cost) {
		this.cost = cost;
	}// END OF setCost METHOD
	
	// Method to get the cost
	public int getCost() {
		return cost;
	}// END OF getCost METHOD
	
	// Method to set the right son
	public void setRightSon(Vertex rightSon) {
		this.rightSon = rightSon;
	}// END OF setRightSon METHOD
	
	// Method to get the right son
	public Vertex getRightSon() {
		return rightSon;
	}// END OF getRightSon METHOD
	
	// Method to set the left son
	public void setLeftSon(Vertex leftSon) {
		this.leftSon = leftSon;
	}// END OF setLeftSon METHOD
	
	// Method to get the left son
	public Vertex getLeftSon() {
		return leftSon;
	}// END OF getLeftSon METHOD
	
}// END OF Vertex CLASS
