package com.coderscampus.assignment7;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {

	Object[] currentItems = new Object[10];
	Integer sizeOfArray = 0;

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
		System.out.println();
		if (index > sizeOfArray) {
			throw new IndexOutOfBoundsException("Cannot add element at this current index position ");
		}
		if (sizeOfArray == currentItems.length) {
			currentItems = Arrays.copyOf(currentItems, currentItems.length * 2);
			currentItems[index] = item;
		}
		for (int i = sizeOfArray + 1; i >= index; i--) {
			currentItems[i + 1] = currentItems[i];
		}
		currentItems[index] = item;
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
			throw new IndexOutOfBoundsException(
					"The index at " + index + " is greater than the size of " + sizeOfArray);
		}
		return (T) currentItems[index];
	}

	@Override
	public T remove(int index) throws IndexOutOfBoundsException {
		@SuppressWarnings("unchecked")
		T item = (T) currentItems[index];
		for (int i = index; i < sizeOfArray - 1; i++) {
			currentItems[i] = currentItems[i + 1];
		}

		if (index >= sizeOfArray) {
			throw new IndexOutOfBoundsException("Can't add an element at this current index position ");
		}
		sizeOfArray--;
	
		return item;
	}

}
