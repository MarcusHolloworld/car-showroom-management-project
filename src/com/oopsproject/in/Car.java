package com.oopsproject.in;

import java.util.Scanner;

public class Car extends Showroom implements Utility {
	String carName;

	String car_color;

	String car_fuel_type;

	double car_price;

	String car_type;

	String carTransmission;

	@Override
	public void getDetails() {
		System.out.println("Car Name: " + carName);
		System.out.println("Car color: " + car_color);
		System.out.println("Car fuel type: " + car_fuel_type);
		System.out.println("Car price: " + car_price);
		System.out.println("Car type: " + car_type);
		System.out.println("Car transmission: " + carTransmission);

	}

	@Override
	public void setDetails() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("========================= ** Enter car details ** =========================");
		System.out.println();
		System.out.println("Enter car name: ");
		carName = scanner.nextLine();
		System.out.println("Enter car color: ");
		car_color = scanner.nextLine();
		System.out.println("Enter car fuel type(petrol/diesel");
		car_fuel_type = scanner.nextLine();
		System.out.println("Enter Car price:");
		car_price = scanner.nextDouble();
		System.out.println("Enter car type: ");
		car_type = scanner.nextLine();
		System.out.println("Enter transmission type: ");
		carTransmission = scanner.nextLine();
		total_car_in_stock++;
	}
}
