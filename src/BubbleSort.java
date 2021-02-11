
import java.util.*;

public class BubbleSort {

	void bubbleSort(int arr[]){
        int size = arr.length;
        for (int i = 0; i < size-1; i++) {
            for (int j = 0; j < size-i-1; j++) {
                if (arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
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
	        BubbleSort obj = new BubbleSort();
	        System.out.println("You Entered");
	        obj.printArray(arr);
	        obj.bubbleSort(arr);
	        System.out.println("Sorted Output");
	        obj.printArray(arr);
	}

}
