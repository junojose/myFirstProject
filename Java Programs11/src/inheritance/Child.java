package inheritance;

public class Child extends Parent{
	public void print()
	{
		
		System.out.println("Juno");
	}
	public static void main(String args[])
	{
		Child obj=new Child();
		obj.print();
		obj.display();
	}

}
