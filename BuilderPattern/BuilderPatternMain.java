package Car.BuilderPattern;

public class BuilderPatternMain {
	public static void main(String[] args) {
		Car car = new Car();
		CarBuilder builder = new CarBuilder(car);
		CarDirector engineer = new CarDirector(builder);
		System.out.println(engineer.buildCar());
	}
}
