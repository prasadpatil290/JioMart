package Keywords;

public class Super1 extends Super {
	int a=876;
	
	public void Test() {
		int a=8;                        //Local variable
		System.out.println(a);          //8
		System.out.println(this.a);     //876
		System.out.println(super.a);    //23 from super class
	}
	public static void main(String[] args) {
		Super1 x = new Super1();
		x.Test();
	}
}
