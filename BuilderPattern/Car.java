package Car.BuilderPattern;

public class Car {
	private int numberOfWheels;
	private int engineHorsePower;
	public String carColor;
	private String engineType;
	
	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}
	
	public int getNumberOfWheels() {
		return numberOfWheels;
	}
	
	public void setCarEngine(String engineType) {
		this.engineType = engineType;
	}
	
	public String getCarEngine() {
		return engineType;
	}
	
	public void setEngineHorsePower(int engineHorsePower) {
		this.engineHorsePower = engineHorsePower;
	}
	
	public int getEngineHorsePower() {
		return engineHorsePower;
	}
	
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	
	public String getCarColor() {
		return carColor;
	}
	
	@Override
	public String toString() {
		return String.format("%s%s%d\n\t%s%d\n\t%4s%s\n\t%s%s%s", "Car {", "Number of wheels: ", numberOfWheels, "Engine horse power: ", engineHorsePower,
		 "Car color: ", carColor, "Engine type: ", engineType, "}");
	}
	
}
