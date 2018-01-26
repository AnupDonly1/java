package LinklistERDiagrm;

public class FrontDesk {
	static int orderId =0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c= new Customer("amit",527654928); 
		Order order = new Order(++orderId);
		order.currentOrderStatus = OrderStatus .Start;
		c.PlaceOrder(order);
		if(order.currentOrderStatus == OrderStatus.Cancel){
			return;
		}
		Waiter w  = new Waiter();
		w.prepareOrder(order);
		w.servedOrder(order);

	}
    
}
