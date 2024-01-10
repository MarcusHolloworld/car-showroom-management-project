package com.oopsproject.in;

import java.util.Scanner;
import java.util.UUID;

public class Employee extends Showroom implements Utility{

	String emp_name;

	String emp_id;

	String emp_address;

	int emp_phoneNumber;

	@Override
	public void getDetails() {
		System.out.println("Employee ID: " + emp_id);
		System.out.println("Employee Name: " + emp_name);
		System.out.println("Employee phone number : " + emp_phoneNumber);
		System.out.println("Employee address: " + emp_address);
		System.out.println("Showroom name: " + showroom_name);
	}

	@Override
	public void setDetails() {
		Scanner scanner = new Scanner(System.in);
		UUID uuid = UUID.randomUUID();
		emp_id = String.valueOf(uuid);
		System.out.println("========================= ** Enter employee details ** =========================");
		System.out.println("Enter employee name: ");
		emp_name = scanner.nextLine();
		System.out.println("Enter employee address: ");
		emp_address = scanner.nextLine();
		System.out.println("Enter employee phone number: ");
		emp_phoneNumber = scanner.nextInt();
		System.out.println("Enter showroom name: ");
		showroom_name = scanner.nextLine();
	}
}
