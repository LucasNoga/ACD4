package ACD4_TP5;

public class Triangle {
	
	public int a, b, c = 0;
	
	public Triangle(int x, int y, int z){
		this.a=x;
		this.b=y;
		this.c=z;
	}

	
	public int triangleM(int a, int b, int c){
		
		if(a <= 0 || b <= 0 || c <= 0)
			return 0;
		if(c == Integer.MAX_VALUE && b == Integer.MAX_VALUE && a == Integer.MAX_VALUE)
			return 1;
		if (c >= Integer.MAX_VALUE || b >= Integer.MAX_VALUE || a >= Integer.MAX_VALUE){
			if(a-b>c)
				return 0;
			else if(a-c>b)
				return 0;
			else if(b-c>a)
				return 0;
			else if (a == b){
				if (a == c)
					return 1;
				else if (a == b){
					return 2;
				}
				else if (b == c)
					return 2;
			}
			if (a == c)
				return 2;
		}
		if(a+b<c)
			return 0;
		else if(a+c<b)
			return 0;
		else if(b+c<a)
			return 0;
		
		if (a == b){
			if (a == c)
				return 1;
			else if (a == b){
				return 2;
			}
			else if (b == c)
				return 2;
		}
		if (a == c)
			return 2;
		return 3;
		}

}
