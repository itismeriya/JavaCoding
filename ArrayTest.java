package inheritance;

import java.util.Scanner;
public class ArrayTest {
	static void searchElement(int []arr, int key) {
		int pos=-1;
		for(int i=0;i<arr.length;i++) {
		if(arr[i]==key) {
			pos=i;
			break;
			
		}	
		}
		if(pos!=-1) {
				System.out.println("Elemnt found at:"+(pos+1));
		}
		else {
			System.out.println("Elemnt not found");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr;
		int size, key;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		size= sc.nextInt();
		arr=new int[size];
		System.out.println("Enter " +size+" elements in an array");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
			
		}
		System.out.println("Array elements are:");
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]+" ");
		}
			System.out.println("Enter elements to search:");
			key=sc.nextInt();
			searchElement(arr,key);
		}
	}