
import java.util.*;

public class InsertionSort {
	
	void insertionSort(int arr[]){ 
        int n = arr.length; 
        for (int i = 1; i < n; ++i){ 
            int key = arr[i]; 
            int j = i - 1; 
            while (j >= 0 && arr[j] > key){ 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = key; 
        } 
    } 

	void printArray(int arr[]){
        int size = arr.length;
        for (int i=0; i<size; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    } 
	
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        int arr[]=new int[n];
	        for (int i=0;i<n;i++){
	            arr[i]=sc.nextInt();
	        }
	        InsertionSort obj = new InsertionSort();
	        System.out.println("You Entered");
	        obj.printArray(arr);
	        obj.insertionSort(arr);
	        System.out.println("Sorted Output");
	        obj.printArray(arr);
	}

}
