import java.util.*;

// merge sort in java
public class mergeSortDemo{
	void merge(int array[],int p,int q,int r){
		int n1=q-p+1;
		int n2=r-q;
		int L[]=new int[n1];
		int M[]=new int[n2];
		// fill the left and right array
		for(int i=0;i<n1;i++)
			L[i]=array[p+i];
		for(int j=0;j<n2;j++)
			M[j]=array[q+1+j];
		int i,j,k;
		i=0;
		j=0;
		k=p;
		//until we reach either end of either L or M,pick larger among
		//elements L and M and place them in the correct position 
		while(i<n1&&j<n2){
			if(L[i]<=M[j]){
				array[k]=L[i];
				i++;
			}
			else{
				array[k]=M[j];
				j++;
			}
			k++;
		}
		
		//when we run out of elements in either L or M
		// pick up the remaining elements and put in array 
		while(i<n1){
			array[k]=L[i];
			i++;
			k++;
		}
		while(j<n2){
			array[k]=M[j];
			j++;
			k++;
		}
	}
	
	// Divide the array into two subarrays,sort them and merge them
	void mergeSort(int array[],int left,int right){
		if(left<right){

			//m is the point where the array is divided into two subarrays
			int mid=(left+right)/2;
			
			//recursive call to each sub arrays
			mergeSort(array,left,mid);
			mergeSort(array,mid+1,right);
			
			//merge the sorted sub arrays
			merge(array,left,mid,right);
		}
	}
	public static void main(String args[]){
		//created an unsorted array
		int[] array={6,5,12,10,9,1};
		mergeSortDemo ob=new mergeSortDemo();
		System.out.println("Before sorting array is:");
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();
		
		//call the method mergeSort()
		//pass argument:array,first index and last index
		
		ob.mergeSort(array,0,array.length-1);
		System.out.println("after sorting Array is:");
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
	}
}
