
import java.io.*;
import java.lang.*;
import java.util.*;

class LinearSearch {

	static int countRotations(int arr[], int n)
	{
		int min = arr[0], min_index = 0;
		for (int i = 0; i < n; i++) {
			if (min > arr[i]) {
				min = arr[i];
				min_index = i;
			}
		}
		return min_index;
	}

	public static void main(String[] args)
	{
		int arr[] = { 15, 18, 2, 3, 6, 12 };
		int n = arr.length;

		System.out.println(countRotations(arr, n));
	}
}
