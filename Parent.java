package AooP5;

public class Parent{
	private String Name;
	private String NIM;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getNIM() {
		return NIM;
	}
	public void setNIM(String nIM) {
		NIM = nIM;
	}
	public Parent(String name, String nIM) {
		super();
		Name = name;
		NIM = nIM;
	}
	
}
