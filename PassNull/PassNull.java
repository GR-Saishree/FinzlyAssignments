
public class PassNull {
	
	void show(String p) {
		System.out.println(111);
	}
	void show(Object p) {
		System.out.println(222);
	}
	
	public static void main(String[] args) {
		PassNull pn=new PassNull();
		pn.show((Object)null);
	}

}
