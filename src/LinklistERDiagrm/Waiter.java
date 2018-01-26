package LinklistERDiagrm;

public class Waiter {
	String name;
	int waiterId;
	public void prepareOrder(Order order){
		for(int i=0; i<order.fooditems.length;i++){
			if(order.fooditems[i]==null){
				break;
			}
			prepareDish(order.fooditems[i]);
		}
		System.out.println("Order is prepared");
		order.currentOrderStatus = OrderStatus.Prepared;
	}
	private void prepareDish(String dish){
		System.out.println("Dish "+dish+" is ready. ");
	}
	public void servedOrder(Order order){
		System.out.println("order is served.");
		order.currentOrderStatus = OrderStatus.Served;
	}

}
