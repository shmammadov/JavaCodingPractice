package day0515;

public class House {
	private double price;
	private int bedrooms;
	private int sqft;
	private String type;
	
	public House()	{
		System.out.println("constractor no args");
	}
	
	public House(double price, String type){
		this();
		this.price = price;
		this.type = type;
		System.out.println("two params constractor");
	}

	public House(double price, int bedrooms, String type) {
		this(100000,"Condo");
		this.price = price;
		this.bedrooms = bedrooms;
		//this.sqft = sqft;
		this.type = type;
		System.out.println("constractor with all params");
	}

	@Override
	public String toString() {
		return "House [price=" + price + ", bedrooms=" + bedrooms + ", sqft=" + sqft + ", type=" + type + "]";
	}
	
	

}
