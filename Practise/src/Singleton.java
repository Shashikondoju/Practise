
public class Singleton {
	public static Singleton instance=null;
	String str;
	private Singleton() {
		str="shashi";
	}
	public static Singleton getInstance() {
		if (instance==null) 
			instance=new Singleton();
		return instance;
	}
	
	public static void main(String[] args) {
		Singleton e=Singleton.getInstance();
		System.out.println(e.str);
		e.str=e.str.toUpperCase();
		
		Singleton e2=Singleton.getInstance();
		System.out.println(e2.str);
		System.out.println(e.str);
		
		System.out.println(e==e2);
	}
}
