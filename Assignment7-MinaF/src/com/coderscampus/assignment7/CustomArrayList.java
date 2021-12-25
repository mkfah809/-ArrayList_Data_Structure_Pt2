package com.coderscampus.assignment7;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {

	Object[] currentItems = new Object[10];
	int sizeOfArray = 0;

	@Override
	public boolean add(T item) {
		if (sizeOfArray == currentItems.length) {
			currentItems = Arrays.copyOf(currentItems, currentItems.length * 2);
		}
		currentItems[sizeOfArray++] = item;
		return true;
	}

	@Override
	public boolean add(int index, T item) throws IndexOutOfBoundsException {
		if (sizeOfArray == currentItems.length) {
			currentItems = Arrays.copyOf(currentItems, currentItems.length * 2);
			if (currentItems == null) {
				int invalidIndex = currentItems.length + 1;
				System.err.println("Cannot add element at index position " + invalidIndex);
			}
			return false;
		} else {
			currentItems[sizeOfArray++] = item;
			return true;
		}
	}

	@Override
	public int getSize() {
		return sizeOfArray;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) throws IndexOutOfBoundsException {
		if (index >= sizeOfArray) {
			throw new IndexOutOfBoundsException(
					"The index at " + index + " is greater than or equal to the size of " + sizeOfArray);
		}

		return (T) currentItems[index];
	}

	@SuppressWarnings("unchecked")
	@Override
	public T remove(int index) throws IndexOutOfBoundsException {
return null;
	}
	
}
