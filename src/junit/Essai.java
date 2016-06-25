package junit;

public class Essai {
	private int val;
	
	public Essai(int valeur){
		this.val = valeur;
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}
	
	public double inv() throws ArithmeticException{
		return 1/val;
	}

}
