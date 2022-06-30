package eggsAssignment;

public class Eggs {
	
	private int input;
	private EggsQuantity eggsQuantity;
	
	public void setInput(int input) {
		this.input = input;
	}
	
	private void convertEggs() {
		
		int temp = input;
		int gross,dozen,remainder;
		
		gross =  temp / 144;
		temp = input % 144;
		
		dozen =  temp / 12;
		temp = input % 12;
		
		remainder =  temp;
		
		if(dozen < 0)
			dozen = 0;
		if(remainder < 0)
			remainder = 0;
		
		eggsQuantity = new EggsQuantity();
		eggsQuantity.setDozen(dozen);
		eggsQuantity.setGross(gross);
		eggsQuantity.setRemainder(remainder);
	}

	public EggsQuantity getEggsQuantity() {
		convertEggs();
		return eggsQuantity;
	}
}
