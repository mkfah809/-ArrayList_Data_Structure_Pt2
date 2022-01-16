package com.coderscampus.unittest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.coderscampus.assignment7.CustomArrayList;
import com.coderscampus.assignment7.CustomList;

class CustomArrayListTest {
	private CustomList<Integer> sut = new CustomArrayList<>();
	private int valueAdded = 1;

	@Test
	void should_add_some_items_to_list() {
		Integer expectedSize = null;
		for (int i = 1; i <= 20; i++) {
			sut.add(i);
		}
		if (expectedSize == null) {
			for (int showResultCtr = 0; showResultCtr < 19; showResultCtr++) {
				assertEquals(showResultCtr + 1, sut.get(showResultCtr));
			}

			assertEquals(20, sut.getSize());
		}
	}

	@Test
	void should_add_item_at_2nd_index() {

		for (int i = 0; i < 10; i++) {
			sut.add(valueAdded++);
		}

		sut.add(1, 45);

		assertEquals(11, sut.getSize());
		assertEquals(8, sut.get(8));
	}

	@Test
	void should_add_item_at_500th_index() {

		for (int i = 0; i < 1000; i++) {
			sut.add(valueAdded++);
		}

		sut.add(500, 111111);
		assertEquals(1001, sut.getSize());
		assertEquals(111111, sut.get(500));
	}

	@Test
	void should_add_item_at_30th_index() {
		for (int i = 0; i < 50; i++) {
			sut.add(valueAdded++);
			// System.out.println(sut.get(i));
		}

		sut.add(0, 1000);
		sut.add(0, 55);
		sut.add(30, 31);
		assertEquals(29, sut.get(31));
		assertEquals(53, sut.getSize());
	}

	@Test
	void should_add_item_at_0th_index() {
		for (int i = 0; i <= 10; i++) {
			sut.add(valueAdded);
		}

		sut.add(0, 1000);
		sut.add(6, 133);
	}

	@Test
	void should_remove_item_at_10000th_index() {
		for (int i = 1; i <= 10000; i++) {
			sut.add(valueAdded++);
		}

		sut.remove(9999);
		sut.remove(4);

		assertEquals(9998, sut.getSize());
		assertEquals(6, sut.get(4));

	}

	@Test
	void should_remove_item_at_4th_index() {

		for (int i = 1; i <= 10; i++) {
			sut.add(valueAdded++);
		}
		for (int showResultCtr = 0; showResultCtr <= 3; showResultCtr++) {
			assertEquals(showResultCtr + 1, sut.get(showResultCtr));
			System.out.println(sut.get(showResultCtr));
		}
		sut.add(501);
		sut.add(917);
		sut.remove(4);
		assertEquals(11, sut.getSize());
		assertEquals(6, sut.get(4));
	}

	@Test
	void should_add_and_remove_item_at_flex_index() {
		sut.add(1); // 0
		sut.add(2); // 1
		sut.add(3); // 2
		sut.add(4); // 3

		sut.add(2, 35);
		sut.remove(3);
		sut.remove(0);
		assertEquals(35, sut.get(1));
		assertEquals(3, sut.getSize());
	}
	@Test
	void shoud_throw_exception() {
		assertThrows(IndexOutOfBoundsException.class, 
				() -> sut.add(100000, 100));
	}
}
