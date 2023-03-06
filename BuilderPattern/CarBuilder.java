package Car.BuilderPattern;

public class CarBuilder {
	private Car car;
	
	public CarBuilder(Car car) {
		this.car = car;
	}
	
	public void setCarWheel(int numberOfWheels){
		this.car.setNumberOfWheels(numberOfWheels);
	}
	public int getCarWheel(){
		return car.getNumberOfWheels();
	}
	
	public void setCarEngine(String engineType){
		this.car.setCarEngine(engineType);
	}
	
	public String getCarEngine(){
		return car.getCarEngine();
	}
	
	public void setCarEnginePower(int horsePower){
		this.car.setEngineHorsePower(horsePower);
	}
	
	public int getCarEnginePower(){
		return car.getEngineHorsePower();
	}
	
	public void setCarColor(String carColor){
		this.car.setCarColor(carColor);
	}
	
	public String getColor(){
		return car.getCarColor();
	}
	
	public Car getCar(){
		return car;
	}
	
	@Override
	public String toString() {
		return "CarBuilder{" +
				       "car=" + car +
				       '}';
	}
}
