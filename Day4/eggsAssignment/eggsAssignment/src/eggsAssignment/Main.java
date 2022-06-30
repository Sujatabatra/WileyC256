package eggsAssignment;

public class Main {
	
	public static void main(String[] args) {
		Eggs eggs = new Eggs();
//		EggsQuantity eggsQuantity = new EggsQuantity();
		eggs.setInput(144*5 + 12*11 + 10);
		EggsQuantity eggsQuantity = eggs.getEggsQuantity();
		System.out.println("Eggs have " + eggsQuantity.getGross() + " Gross, " + eggsQuantity.getDozen() + " Dozens & " + eggsQuantity.getRemainder() + " Remainder");
	}

}
