package total_mark;

public class temperature {
	public void temp(){
	int tem=50;
	if(tem>=0 && tem<10) {
		System.out.println("very cold weather:"+tem);
	}else if(tem>=10 && tem<20) {
		System.out.println("cold weather:"+tem);
	}else if (tem>=20 && tem<30){
		System.out.println("normal weather:"+tem);
	}else if (tem>=30 && tem<40){
		System.out.println("hot weather:"+tem);
	}else {
		System.out.println("very hot:"+tem);
	}
	}
	
 public static void main(String[]agrs) {
	 temperature obj=new temperature();
	obj.temp();
 }


}
