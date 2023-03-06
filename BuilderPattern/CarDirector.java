package Car.BuilderPattern;

public class CarDirector {
	
	private final CarBuilder builder;
	
	public CarDirector(CarBuilder builder){
		this.builder = builder;
	}
	public Car buildCar(){
		builder.setCarWheel(4);
		builder.setCarEnginePower(350);
		builder.setCarColor("Red");
		builder.setCarEngine("V8");
		return builder.getCar();
	}
	
	@Override
	public String toString() {
		return "CarDirector{" +
				       "builder=" + builder +
				       '}';
	}
}
