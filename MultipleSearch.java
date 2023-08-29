package inheritance;

import java.util.Scanner;
public class MultipleSearch {
		static Scanner sc=new Scanner(System.in);
		
		//searching for multiple values in  an array
		static int[] linearsearchMultiElement(int[] newarr) {
			
			System.out.println("Enter key to search : ");
			int key=sc.nextInt();
			//array for storing the found index
			int[] pos = new int[newarr.length];
			
			int count=0;
			int i,j=0;
			
			//setting value to -1
			for (i=0;i<pos.length;i++) {
				pos[i]=-1;
			}
			
			//traversing the array
			for (i=0;i<newarr.length;i++) 
			{
				count=j;
				if(newarr[i]==key) 
				{
					//storing the index in another array
					for(j=count;j<count+1;j++) 
					{
						pos[j]=i+1;
						
					}
				}
			}
			return pos;
			
		}
		
		public static int[] initializeArray()
		{
			System.out.println("Enter size:");
			int size=sc.nextInt();
			int[] arr=new int[size];
			
			//input array values
			System.out.println("Enter " +size+" elements:");
			for (int i=0;i<size;i++) {
				arr[i]=sc.nextInt();
			}
			
			return arr;
		}
		
		public static void printArray(int[] arr) {
			//printing values of array
			for (int i=0;i<arr.length;i++) {
				System.out.println("arr["+i+"]="+arr[i]);
			}
		}
		
		public static void printFoundPosition(int[] pos) {
			
			for (int i=0;i<pos.length;i++) {
				//prints when index will have value other than -1
				if(!(pos[i]==-1) ) {
					System.out.println("Key is present at index "+pos[i]);
				}
				else if(pos[0]==-1) {
					System.out.println("Key not found");
					break;
				}
					
				
			}
		}

		public static void main(String[] args) {
			
			int[] arr=initializeArray();
		
			int[] pos=linearsearchMultiElement(arr);
			
			printFoundPosition(pos);
			
		}

	}


