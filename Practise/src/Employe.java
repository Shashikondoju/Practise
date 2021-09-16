
public class Employe {
	
	double sal;
	String name;
	
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employe(String nam, double sal) {
		this.sal=sal;
		this.name=nam;
	}
	@Override
	public String toString() {
		return "Employe [sal=" + sal + ", name=" + name + "]";
	}
	
}
