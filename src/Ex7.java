

import java.util.ArrayList;

public class Ex7 {
	
	public class Produto {
		int storage;
		float price;
		
		public Produto(int storage, float price) {
			this.storage = storage;
			this.price = price;
		}
		
	}
	
	public static class Item {
		Produto product;
		int amt;
		
		public Item(Produto product, int amt) {
			this.product = product;
			this.amt = amt;
		}
	}
	
	public enum PaymentMethod {
		DINHEIRO,
		CHEQUE,
		CARTAO
	}
	
	public class Pedido {
		ArrayList<Item> items;
		PaymentMethod paymentMethod;
		
		public Pedido(PaymentMethod paymentMethod) {
			items = new ArrayList<Item>();
			this.paymentMethod = paymentMethod;
		}
		
		public void addItem(Item item) {
			items.add(item);
		}
	}
}
