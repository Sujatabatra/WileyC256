package eggsAssignment;
//POJO - Plain Old Java Object
public class EggsQuantity {
	
	private int gross,dozen,remainder;
	
	public void setGross(int gross) {
		this.gross = gross;
	}

	public void setDozen(int dozen) {
		this.dozen = dozen;
	}

	public void setRemainder(int remainder) {
		this.remainder = remainder;
	}

	public int getGross() {
		return gross;
	}

	public int getDozen() {
		return dozen;
	}

	public int getRemainder() {
		return remainder;
	}
}
