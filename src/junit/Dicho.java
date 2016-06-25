package junit;

public class Dicho {
	int n;
	int[] tab = new int[10];
	
	public Dicho(){
	}
	public int cherche(int x){
		boolean trouve = false;
		int ifin = tab.length;
		int id = 0;
		int im = 0;
		while(!trouve){
			im = (int) (id + ifin)/2;
			trouve = (tab[im] == x);
			if(tab[im] > x) 
				ifin = im;
			else 
		    	id = im;
		}
		
		if(tab[id] == x) 
			return(id);
		else 
			return(-1);
	}
	
}