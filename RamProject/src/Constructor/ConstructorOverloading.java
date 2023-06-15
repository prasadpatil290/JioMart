package Constructor;

public class ConstructorOverloading {
	int u,v,z;
	String Name;
	String Place;
	
	ConstructorOverloading() { //user defined const. with zero Argument
		u=25;
		v=21;
	}
	ConstructorOverloading(int x,int y){ //user defined const. with Argument
		u=x;
		v=y;
	}
	ConstructorOverloading(int x,int y,int w){
		u=x;
		v=y;
		z=w;
	}
	ConstructorOverloading(String A,String B){  //user defined const. with Argument
		Name=A;
		Place=B;
	}
	public void add() {
		System.out.println("Addition of u and v is " + (u+v+z));
		System.out.println("z is " + (z));
		System.out.println(" ");
	}
	public void string() {
		System.out.println(Name);
		System.out.println(Place);
	}
	public static void main(String[] args) {
		
		ConstructorOverloading p=new ConstructorOverloading();
		p.add();
		p.string();
		
		ConstructorOverloading q=new ConstructorOverloading(20,4);
		q.add();
		
		ConstructorOverloading r=new ConstructorOverloading(10,12,5);
		r.add();	
		
		ConstructorOverloading s =new ConstructorOverloading("Ram","Ambajogai");
		s.string();
	}
}
