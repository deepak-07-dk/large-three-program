package total_mark;

public class height_in_java {
	public void height(){
	int hei=50;
	if(hei<150) {
		System.out.println("Small:"+hei);
	}else if(hei>=165 && hei<165) {
		System.out.println("Average height:"+hei);
	}else if (hei>=165 && hei<195){
		System.out.println("taller:"+hei);
	}else {
		System.out.println("abnormal height:"+hei);
	}
	}
	
 public static void main(String[]agrs) {
	 height_in_java obj=new height_in_java();
	obj.height();
 }

}
