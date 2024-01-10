package com.oopsproject.in;

import java.util.Scanner;

public class Showroom implements Utility {

	String showroom_name;

	String showroom_address;

	int total_employee;

	int total_car_in_stock;

	String Manager_name;

	@Override
	public void getDetails() {
		System.out.println("Showroom name: " + showroom_name);
		System.out.println("Showroom address: " + showroom_address);
		System.out.println("Total employee: " + total_employee);
		System.out.println("Total car in stock: " + total_car_in_stock);
		System.out.println("Manager name: " + Manager_name);
	}

	@Override
	public void setDetails() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("========================= ** Enter showroom details ** =========================");
		System.out.println("Enter showroom name: ");
		showroom_name = scanner.nextLine();
		System.out.println("Enter Showroom address: ");
		showroom_address = scanner.nextLine();
		System.out.println("Enter total Employee: ");
		total_employee = scanner.nextInt();
		System.out.println("Enter manager name: ");
		Manager_name = scanner.nextLine();
	}
}
