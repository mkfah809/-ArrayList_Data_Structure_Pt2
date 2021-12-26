package com.coderscampus.unittest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.coderscampus.assignment7.CustomArrayList;
import com.coderscampus.assignment7.CustomList;

class CustomArrayListTest {

	// Step1 : write a failing test
	// Step2 : Write the business logic to make the test pass.
	// Step3 : Refactor the code

	// Arrange

	@Test // ANNOTATION GIVES EXTRA INSTRUCTION ON HOW
	// TO TREAT THIS METHOD
	void should_add_some_items_to_list() {
		CustomList<Integer> sut = new CustomArrayList<>();
		Integer expectedResult = null;
		Integer expectedSize = null;
		// Act
		for (int addCtr = 1; addCtr <= 20; addCtr++) {
			sut.add(addCtr);
		}
		// Assert - Actual
		if (expectedSize == null) {
			for (int showResultCtr = 0; showResultCtr < 19; showResultCtr++) {
				expectedResult = sut.get(showResultCtr);
				assertEquals(showResultCtr + 1, expectedResult);
				System.out.println("HAS" + expectedResult);
			}
			expectedSize = sut.getSize();
			assertEquals(20, expectedSize);
			System.out.println("\nexpectedSize " + expectedSize);
		}
	}

	@Test
	void should_add_item_at_specific_index() {
		CustomArrayList<Integer> sut = new CustomArrayList<Integer>();
		int expectedResult = 0, addCtr = 1;
		sut.add(0, 45);
		for (int i = 1; i < 10; i++) {
			addCtr++;
			sut.add(addCtr);
		}
		int expectedSize = sut.getSize();
		System.out.println("List size= " + expectedSize);
		try {
			expectedResult = sut.get(5);
			System.out.println("Index: " + expectedResult);
			assertEquals(6, expectedResult);
		} catch (IndexOutOfBoundsException e) {
			System.err.println("There isn't index at " + expectedResult);
		}
	}

	@Test
	void should_remove_item_from_list() {
		CustomArrayList<Integer> sut = new CustomArrayList<Integer>();
		int addCtr = 1;
		for (int i = 1; i < 10; i++) {
			addCtr++;
			sut.add(addCtr);
		}
		Integer removeElement = sut.remove(4);
		System.out.println("element at Index 4 is : " + removeElement);
	}
}
