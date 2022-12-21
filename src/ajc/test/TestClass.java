package ajc.test;

public class TestClass {
	String name = null;

	TestClass(String name) {
		
		this.name = name;
	}
	
	@Override
	public String toString() {
		
		return "Object TestClass : " + name;
	}
}
