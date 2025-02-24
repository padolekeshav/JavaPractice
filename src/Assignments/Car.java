package Assignments;

public class Car {
	
	String name;
	int price;
	String model;
	static int wheels = 4;
	public static void main(String[] args) {
	
		Car c1 = new Car();
		c1.name = "BMW";
		c1.price = 50;
		c1.model = "X3";
		
		Car c2 = new Car();
		c2.name = "Audi";
		c2.price = 60;
		c2.model = "Q3";
		
		Car c3 = new Car();
		c3.name = "Hundai";
		c3.price = 30;
		c3.model = "city";
		
		System.out.println(c1.name+" :"+c1.price+" :"+c1.model+" :"+Car.wheels);//B
		System.out.println(c2.name+" :"+c2.price+" :"+c2.model+" :"+Car.wheels);//A
		System.out.println(c3.name+" :"+c3.price+" :"+c3.model+" :"+Car.wheels);//H
		System.out.println("----------------------");
		
		c1=c2;
		System.out.println(c1.name+" :"+c1.price+" :"+c1.model+" :"+Car.wheels); //A
		System.out.println(c2.name+" :"+c2.price+" :"+c2.model+" :"+Car.wheels); //A
		System.out.println(c3.name+" :"+c3.price+" :"+c3.model+" :"+Car.wheels); //H
		System.out.println("----------------------");
			
		
		
	}

	
	
	
}
