package com.coderscampus.assignment7;

public class Application {

	public static void main(String[] args) {

		CustomArrayList<Integer> elements = new CustomArrayList<>();
		Application.populateNumbers(elements);
		Application.displayValues(elements);
		System.out.println("********** Array re-sized **********");
	}

	private static void displayValues(CustomArrayList<Integer> elements) {
		for (int i = 1; i < elements.getSize(); i++) {
			System.out.println(elements.get(i));
		}
	}

	private static void populateNumbers(CustomList<Integer> elements) {
		for (int i = 0; i < 10; i++) {
			elements.add(i);
		}
	
		elements.add(0, 1000);
		elements.add(6, 133);
		elements.remove(6);
		elements.remove(0);
	}
}
