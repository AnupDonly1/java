package LinklistERDiagrm;

public class Customer {
	String name;
	long phoneNumber;
	Customer(String name , long phoneNumber){
		this.name = name;   
		this.phoneNumber= phoneNumber;
		System.out.println("Customer Detailed Is Collected");
	}
	public void PlaceOrder(Order order){
		order.fooditems[0] = "";
		order.fooditems[1] = " Dosa ";
		order.fooditems[2] = " Idli" ;
		order.fooditems[3] = " ShahiPaneer";
		System.out.println("Order is placed ");
		order.currentOrderStatus = OrderStatus.placed;
	}

}
