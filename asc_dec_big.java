package total_mark;

public class asc_dec_big {
	public void big() {
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


 public static void main(String[]agrs) {
	 asc_dec_big obj=new asc_dec_big();
	 obj.big();
	
}	
}