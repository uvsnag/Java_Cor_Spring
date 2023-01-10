package com.example.demo.design;

import java.util.ArrayList;
import java.util.List;

public class DesignPartern {

	public static void main(String[] args) {
		SortedList sortedList = new SortedList();
		sortedList.add(5);
		sortedList.add(2);
		sortedList.add(1);
		sortedList.add(110);
		sortedList.add(7);
		sortedList.add(9);

		sortedList.setSortStrategy(new QuickSort());
		sortedList.sort();

	}
}

interface SortStrategy {

	void sort(List<Integer> items);
}

class BubbleSort implements SortStrategy {

	@Override
	public void sort(List<Integer> items) {
		System.out.println("Bubble sort.");
		for (int i = 0; i < items.size() - 1; i++) {
			for (int j = i; j < (items.size() - 1); j++) {
				if (items.get(i) > items.get(j + 1)) {
					Integer temp = items.get(j + 1);
					items.set(j + 1, items.get(i));
					items.set(i, temp);
				}
			}
		}

		for (Integer item : items) {
			System.out.print(item + ", ");
		}
	}
}

class QuickSort implements SortStrategy {

	@Override
	public void sort(List<Integer> items) {
		System.out.println("Quick sort");
		quickSortProcess(items, 0, items.size() - 1);
		for (int js : items) {
			System.out.print(js + ",");
		}
	}

	private void quickSortProcess(List<Integer> items, int left, int right) {
		for (int js : items) {
			System.out.print(js + ",");
		}
		System.out.println();
		if (left >= right) {
			return;
		}
		int mid = left + (right - left) / 2;
		Integer pivot = items.get(mid);
		int iLeft = left;
		int iRight = right;

		System.out.println("pivot:" + pivot);
		while (iLeft <= iRight) {
			while (items.get(iLeft) < pivot) { // mid is not modified(constants)
				iLeft++;
			}
			while (items.get(iRight) > pivot) { // mid is not modified(constants)
				iRight--;
			}

			if (iLeft <= iRight) {

				int temp = items.get(iRight);
				items.set(iRight, items.get(iLeft));
				items.set(iLeft, temp);
				iLeft++;
				iRight--;
			}
		}

		if (iRight > left) {
			System.out.println("left:" + left + "-" + iRight);
			quickSortProcess(items, left, iRight);
		}

		if (iLeft < right) {
			System.out.println("right:" + iLeft + "-" + right);
			quickSortProcess(items, iLeft, right);
		}

	}
}

class MergeSort implements SortStrategy {

	@Override
	public void sort(List<Integer> items) {
		System.out.println("Merge sort");
	}
}

class SelectionSort implements SortStrategy {

	@Override
	public void sort(List<Integer> items) {
		System.out.println("Selection sort");
	}
}

class SortedList {

	private SortStrategy strategy;
	private List<Integer> items = new ArrayList<>();

	public void setSortStrategy(SortStrategy strategy) {
		this.strategy = strategy;
	}

	public void add(Integer value) {
		items.add(value);
	}

	public void sort() {
		strategy.sort(items);
	}
}