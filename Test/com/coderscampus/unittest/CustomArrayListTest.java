package com.coderscampus.unittest;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.coderscampus.assignment7.CustomArrayList;
import com.coderscampus.assignment7.CustomList;

class CustomArrayListTest {
	private CustomList<Integer> sut = new CustomArrayList<>();

	@Test
	void should_add_some_items_to_list() {
		Integer expectedSize = null;
		for (int addCtr = 1; addCtr <= 20; addCtr++) {
			sut.add(addCtr);
		}
		if (expectedSize == null) {
			for (int showResultCtr = 0; showResultCtr < 19; showResultCtr++) {
				assertEquals(showResultCtr + 1, sut.get(showResultCtr));
			}
			assertEquals(20, sut.getSize());
		}
	}

	@Test
	void should_add_item_at_second_index() {
		int valueAdded = 1;
		for (int i = 0; i < 10; i++) {
			sut.add(valueAdded++);
		}
		
		sut.add(1, 45);
		
		assertEquals(11, sut.getSize());
		assertEquals(8, sut.get(8));
	}
	
	@Test
	void should_add_item_at_500_index() {
		int valueAdded = 1;
		for (int i= 0; i <1000; i++) {
			sut.add(valueAdded++);
		}
		
		sut.add(500, 111111);
		assertEquals(1001,sut.getSize());
		assertEquals(111111,sut.get(500));
	}

	@Test
	void should_remove_item_from_list() {
		int addCtr = 1;
		for (int i = 1; i < 10; i++) {
			addCtr++;
			sut.add(addCtr);
		}
		Integer elementDeleted = sut.remove(4);
		System.out.println("element at Index 4 is : " + elementDeleted);
	}
}
