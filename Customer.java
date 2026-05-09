package CSCProj;

public class Customer implements Discountable{
	
	private int customerId;
	private String name ;
	private String membershipType;
	public Customer(int customerId, String name, String membershipType) {
		super();
		this.customerId = customerId;		this.name = name;
		this.membershipType = membershipType;
	}
	public  double applyDiscount(double price ){
		if(membershipType.equalsIgnoreCase("Gold")) {
			return price*0.80;
		}else if(membershipType.equalsIgnoreCase("silver")) {
				return price*0.90;

			}
		return price ;
		}
		
	
public void printCustomerInfo() {
	System.out.println("Customer ID: " + customerId + " | Name: " + name + " | Membership: " + membershipType);	
	
}

}