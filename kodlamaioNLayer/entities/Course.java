package kodlamaioNLayer.entities;

public class Course extends BaseEntity{
	
	public double price;

	public Course() {}
	
	public Course(int id,String name) {}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}	
}
