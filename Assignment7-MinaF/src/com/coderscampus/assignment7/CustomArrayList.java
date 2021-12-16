package com.coderscampus.assignment7;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {

	Object[] currentItems = new Object[10];
	int sizeOfArray = 0;

	@Override
	public boolean add(T item) {
		if (sizeOfArray == currentItems.length) {
			System.out.println("");
			System.out.println("I will resize the Array - NOW!");
			currentItems = Arrays.copyOf(currentItems, currentItems.length * 2);
		}
		currentItems[sizeOfArray] = item;
		sizeOfArray++;
		return true;
	}

	@Override
	public int getSize() {
		return sizeOfArray;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) throws IndexOutOfBoundsException {
		if (index >= sizeOfArray) {
			throw new IndexOutOfBoundsException("The array is out of beyond");
		}

		return (T) currentItems[index];
	}
}
