package total_mark;

public class total_mark {
	public void student() {
		String name="sive";
		int rollnumber=123456;
		int tam=60,eng=85,mat=78;
		int tot=(tam+eng+mat)/3;
		System.out.println("Student name:"+name);
		System.out.println("student rol number:"+rollnumber);
		if(tot>90) {
			System.out.println("student first class:"+tot);
		}else if(tot>80) {
			System.out.println("student second class:"+tot);
		}else if (tot>60){
			System.out.println("student third class:"+tot);
		}else if (tot>=35){
			System.out.println("student is average:"+tot);
		}else {
			System.out.println("student is fail:"+tot);
		}
	}	
	 public static void main(String[]agrs) {
		 total_mark obj=new total_mark();
		obj.student();
	 }

}
