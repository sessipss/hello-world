
public class Start_01 {
	public static void main(String[] args){
		D dp = new D();
		System.out.println("a="+dp.cp.bp.ap.a);
	}
}

class A{
	int a = 100;
}

class B{
	A ap = new A();
	int b=200;
}

class C{
	B bp=new B();
	int c =300;
}
class D{
	C cp = new C();
	int d=400;
	
}