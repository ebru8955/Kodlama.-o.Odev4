package Concrate;

public class Campaign {
	

	public Campaign(int id, String name,int order, String discount) {
		super();
		this.id = id;
		this.name = name;
		this.order = order;
		this.discount = discount;
	}
	private int id;
	private String name;
	private int order;
	private String discount;
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getOrder() {
		return order;
	}
	public String getDiscount() {
		return discount;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setOrder(int order) {
		this.order = order;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
}
	
	
