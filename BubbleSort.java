package inheritance;
import java.util.Scanner;
public class BubbleSort {


	
	
		static Scanner sc=new Scanner(System.in);
		public static int[] bubbleSort(int[] arr) {
			int temp,i,j;
			for(i=0;i<arr.length-1;i++) {
				for(j=i+1;j<arr.length;j++) {
					if(arr[i]>arr[j]) {
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
			return arr;
		}
		static int[] initializeArray() {
			int[] arr;
			int size,i;
			System.out.println("Enter size:");
			size=sc.nextInt();
			arr=new int[size];
			System.out.println("Enter " +size+" elements in an array");
			for(i=0;i<size;i++) {
				arr[i]=sc.nextInt();
				
			}
			return arr;
		}
		static void printArray(int[] arr) {
			for (int i=0;i<arr.length;i++) {
				System.out.println(arr[i] + " ");
			}
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int[] arr= initializeArray();
			System.out.println("Array elements before sorting:");
			printArray(arr);
			bubbleSort(arr);
			System.out.println("Array elements after sorting:");
			printArray(arr);
		}

	}


