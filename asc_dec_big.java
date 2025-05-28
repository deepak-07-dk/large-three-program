package total_mark;

public class asc_dec_big {
	public static void big() {
		int a=10;
		int b=40;
		int c=35;
		if(a>=b && a>=c) {
			System.out.println("a is bigger");
		}else if(b>=a && b>=c){
			System.out.println("b is bigger");
		}else {
			System.out.println("c is bigger");
		}
	}
	public static void dec() {
		int a=20,b=30,c=50;
		if(a>b && a>c) {
			 System.out.println("a is greater");
			if(b>c) { 
			System.out.println(a+":"+b+":"+c);
			}else {
				System.out.println(a+":"+c+":"+b);
				 
			}}else if(b>a && b>c){
				 System.out.println("b is greater");
				if(a>c) {
					System.out.println(b+":"+a+":"+c);
				}else {
					System.out.println(b+":"+c+":"+a);
				}}else if (c>a && c>b) {
					System.out.println("c is greater");
					if(a>b) {
						System.out.println(c+":"+a+":"+b);
					}else {
						System.out.println(c+":"+b+":"+a);
					}
				}
		}
	public static void asc() {
		int a=20,b=30,c=50;
		if(a<b && a<c) {
			 System.out.println("a is lesser");
			if(b<c) { 
			System.out.println(a+":"+b+":"+c);
			}else {
				System.out.println(a+":"+c+":"+b);
				 
			}}else if(b<a && b<c){
				 System.out.println("b is lesser");
				if(a<c) {
					System.out.println(b+":"+a+":"+c);
				}else {
					System.out.println(b+":"+c+":"+a);
				}}else if (c<a && c<b) {
					System.out.println("c is lesser");
					if(a<b) {
						System.out.println(c+":"+a+":"+b);
					}else {
						System.out.println(c+":"+b+":"+a);
					}
				}
		}

 public static void main(String[]agrs) {
	 
	 //asc_dec_big.big();
	 //asc_dec_big.dec();
	 asc_dec_big.asc();
	
}	
}