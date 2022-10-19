package programs;

 class Vechile {
	private String name;
	private String platform;
	public Vechile(String name, String platform) {
		super();
		this.name = name;
		this.platform = platform;
	}
	
	public void getDetails() {
		System.out.println("The Vehicle Name is: "+this.name);
		
		System.out.println("The Platform is: "+this.platform);
		
	}
}

class Car extends Vechile{
	private String company;
	private float cost;
	public Car(String name, String platform, String company, float cost) {
		super(name, platform);
		this.company = company;
		this.cost = cost;
	}
	public void getDetails() {
		super.getDetails();
		System.out.println("The Car Company is: "+this.company);
		System.out.println("The Car Cost in Lakhs is: "+this.cost);
		
	
}
	

class Sportcar extends Car{
	private String directionsensor;

	public Sportcar(String name, String platform, String company, float cost, String directionsensor) {
		super(name, platform, company, cost);
		this.directionsensor = directionsensor;
	}
	
	public void getDetails() {
		super.getDetails();
		System.out.println("The Sports Car directionSensor is enabled: "+this.directionsensor);
	}
	}
