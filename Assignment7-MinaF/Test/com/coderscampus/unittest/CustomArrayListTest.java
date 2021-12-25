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
	private CustomList<Integer> systemUnderTest = new CustomArrayList<>();
	private Integer expectedResult = null;
	private Integer expectedSize = null;

	@Test // ANNOTATION GIVES EXTRA INSTRUCTION ON HOW
	// TO TREAT THIS METHOD
	void should_add_some_items_to_list() {

		// Act
		for (int addCtr = 1; addCtr <= 20; addCtr++) {
			systemUnderTest.add(addCtr);
		}
		// Assert - Actual
		if (expectedSize == null) {
			for (int showResultCtr = 0; showResultCtr < 19; showResultCtr++) {
				expectedResult = systemUnderTest.get(showResultCtr);
				assertEquals(showResultCtr + 1, expectedResult);
				System.out.println("HAS" + expectedResult);
			}
			expectedSize = systemUnderTest.getSize();
			assertEquals(20, expectedSize);
			System.out.println("\nexpectedSize " + expectedSize);
		}
	}

	@Test
	void should_add_item_at_specific_index() {

		CustomArrayList<Integer> sut = new CustomArrayList<Integer>();

		int expectedResult = 0, addCtr = 16;
		sut.add(0, 45);
		for (int i = 1; i < 10; i++) {
			addCtr++;
			System.out.println(sut.add(addCtr));
		}
		int a = sut.getSize();
		System.out.println("List size= " + a);
		try {
			expectedResult = sut.get(2);
			System.out.println("Index: " + expectedResult);
		} catch (IndexOutOfBoundsException e) {
			System.err.println("There isn't index at " + expectedResult);
		}
	}
}
