package inheritance;
import java.util.Scanner;
public class ArrayReverse {

	

	
		static Scanner sc=new Scanner(System.in);
		static void arrayReverse(int [] arr){
	        System.out.println("Array in reverse order: ");    
	        for (int i = arr.length-1; i >= 0; i--) {  
	            System.out.print(arr[i] + " ");  
	        }  
		}
		static int[] initializeArray() {
			int[] arr;
			int size,i;
			System.out.println("Enter size:");
			size= sc.nextInt();
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
			System.out.println("Array elements before reversing:");
			printArray(arr);
			arrayReverse(arr);
			
		}

	}