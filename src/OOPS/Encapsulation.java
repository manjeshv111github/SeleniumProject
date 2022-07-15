package OOPS;

public class Encapsulation implements Interface{
	//data binding,
	//will be using get and set methods
	
	private String name = "Java";
	private int i;
	boolean booleanStr =false;
	
	public void getName() {
		String fetch = name;
		System.out.println(fetch);
	}
	
	public void setVal(int j) {
		this.i=j;
		System.out.println(i);
	}
	
	@Override
	public void absName() {
		System.out.println(name);		
	}

	@Override
	public void absInt() {
		System.out.println(i);		
	}

	@Override
	public void absBoolean() {		
		System.out.println(booleanStr);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Encapsulation obj = new Encapsulation();
		obj.getName();
		obj.setVal(10);
		obj.absBoolean();
		obj.absInt();
		obj.absName();

	}
}
