package functionalInterface;

public class DiamandProblemClass implements DiamandProblem1,DiamandProblem2{
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		DiamandProblem1.super.print();
	}
	public static void main(String[] args) {
		DiamandProblemClass ob=new DiamandProblemClass();

		ob.print();
	}
	
	
}
