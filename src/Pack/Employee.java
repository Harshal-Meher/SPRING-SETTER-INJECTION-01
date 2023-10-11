package Pack;

public class Employee 
{
	int id;
	String name,dept,city;
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", city=" + city + "]";
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}


	public void setCity(String city) {
		this.city = city;
	}
	
}
