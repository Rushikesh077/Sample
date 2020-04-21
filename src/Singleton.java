
public class Singleton {
	private static Singleton singleton=new Singleton();
	
	private Singleton(){}
	
	public static Singleton getInstance()
	{
		return singleton;
	}
	public void demomethod()
	{
		System.out.println("this is demo method");
	}

}
