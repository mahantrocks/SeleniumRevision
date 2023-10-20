package Interface;

public class ICICIBANK implements RBI,USBank{
	
	public void trending() {
		System.out.println("Trending");
	}

	public static void main(String[] args) {
		
		
		//ICICIBANK icici = new ICICIBANK();
		
		USBank usb = new ICICIBANK();
		usb.homeloan();
		usb.carloan();
		usb.education();
		
		
	}

	//UsBank methods
	@Override
	public void education() {
		System.out.println("USBank Education");
		
	}

	@Override
	public void carloan() {
		System.out.println("USBank Carloan");
		
	}

	@Override
	public void homeloan() {
		System.out.println("USBank Education");
		
	}

	//RBI interface methods
	@Override
	public void credet() {
		System.out.println("ICICI credit");
		
	}

	@Override
	public void debit() {
		System.out.println("ICICI debit");
		
	}

	@Override
	public void transferMoney() {
		System.out.println("ICICI Transfer Money");
		
	}

}
