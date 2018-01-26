package LinklistERDiagrm;

public class Order {
	String[] fooditems;
	OrderStatus currentOrderStatus;
	int orderId;
	public Order(int orderId){
		this.orderId = orderId;
		fooditems = new String[10];
	}
}
