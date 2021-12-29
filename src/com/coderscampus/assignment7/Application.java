package com.coderscampus.assignment7;

public class Application {

	public static void main(String[] args) {

		CustomArrayList<Integer> elements = new CustomArrayList<>();
		Application.populateNumbers(elements);
		Application.displayValues(elements);
		System.out.println("Size is " + elements.getSize());
	}

	private static void displayValues(CustomArrayList<Integer> elements) {
		for (int i = 1; i < elements.getSize(); i++) {
			System.out.println(elements.get(i));
		}
	}

	private static void populateNumbers(CustomList<Integer> elements) {
		for (int i = 0; i <= 10; i++) {
			elements.add(i);
		}
		elements.add(13);
		elements.add(0,1000);
		
		System.out.println("********** Array re-sized **********");
	}

}
