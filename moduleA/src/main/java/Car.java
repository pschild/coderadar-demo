public class Car {
  private int wheelsCount = 4;
	private int topSpeed;
	private int currentSpeed = 0;
		
	public void accelerate() {
		if (currentSpeed < topSpeed) {
			currentSpeed++;
		}
	}
}
