package ACD4_TP5;

public class BoiteBlanche {
	
	int x, y = 0;
	
	public BoiteBlanche(int a, int b){
		x = a;
		y = b;
	}
	
	public int execute(){
		int signe = 1;
		int z = 0;
		System.out.println("Noeud 1");
		
		if(x < 0){
			System.out.println("Noeud 2");
			signe = -1;
			x = -x;
			System.out.println("Noeud 3");
		}
		if(y < 0){
			System.out.println("Noeud 4");
			signe = -signe;
			y = -y;
			System.out.println("Noeud 5");
		}
		
		while(x>=y){
			System.out.println("Noeud 6");
			x = x - y;
			z = z + 1;
			System.out.println("Noeud 7");
		}
		System.out.println("Noeud 8");
		z = z * signe;	
		System.out.println("Noeud 9");
		return z;
	}
	
	
}
