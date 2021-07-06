package eg1;

public class Product implements Comparable<Product>{
	
	
	private int productId;
	private String manufacturerName;
	private String productName;
	private double cost;
	private float ratings;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(int productId, String manufacturerName,String productName, double cost, float ratings) {
		super();
		this.productId = productId;
		this.manufacturerName = manufacturerName;
		this.productName = productName;
		this.cost = cost;
		this.ratings = ratings;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getManufacturerName() {
		return manufacturerName;
	}
	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public float getRatings() {
		return ratings;
	}
	public void setRatings(float ratings) {
		this.ratings = ratings;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Product [productId=" + productId + ", manufacturerName=" + manufacturerName + ", productName=" + productName + " cost=" + cost + ", ratings=" + ratings + "]";
	}
	
	@Override
	public int compareTo(Product o) {
		Integer i1=this.productId;
		Integer i2=o.productId;
		return i2.compareTo(i1);
	}
	
}
