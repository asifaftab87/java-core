package org.liferayasif.codility;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class FindLeastPositiveNumArr {

	public static void main(String[] args) {

		FindLeastPositiveNumArr fo = new FindLeastPositiveNumArr();
		//unique_array(new int[]{1, 2, 2, 3, 5, 3, 5, 1, 1, 7, 4, 1});
		//fo.fun(new int[]{2, 2, 3, 5, 3, 5, 1, 1, 7, 4});
		
		int[] nuniq = {1, 2, 2, 3, 5, 3, 5, 1, 1, 7, 4, 1};
		
		int[] uniq = fo.retUniq(new int[]{1, 2, 2, 3, 5, 3, 5, 1, 1, 7, 4, 1});
		
		Set mySet = new HashSet();
		mySet.addAll(Arrays.asList(nuniq));

		Iterator it = mySet.iterator();

		while(it.hasNext()){
			System.out.println("id: "+it.next());
		}
		
		/*System.out.print("original: ");
		for(int i=0 ; i<nuniq.length ; i++){
			System.out.print(nuniq[i]);
		}
		System.out.print("\nunique: ");
		for(int i=0 ; i<uniq.length ; i++){
			System.out.print(uniq[i]);
		}*/
	}
	
	public int[] retUniq(int[] a){
		
		int une = a.length;
		
		for(int i=0 ; i<une ; i++){
			for(int j=i+1 ; j<une ; j++){
				if(a[i]==a[j]){
					a[j] = a[une-1];
					une--;
					j--;
				}
			}
		}
		
		return Arrays.copyOf(a, une);
	}
	
	
	public int fun(int []a){
		
		int[] u = new int[a.length];
		int n=0;
		for(int i=0 ; i<a.length ; i++){
			
			for(int j=i+1 ; j<a.length ; j++){
				if(a[j]!=-1){
					if(a[i]==a[j]){
						a[j]=-10000000;
					}
				}
			}
		}
		
		for(int i=0 ; i<a.length ; i++){
			if(a[i]!=-10000000){
				u[n++]=a[i];
			}
		}
		
		for(int i=0 ; i<u.length ; i++){
			System.out.println(i +"  :  "+u[i]);
		}
		
		for(int i=0 ; i<u.length ; i++){
			
			for(int j=0 ; j<(u.length -(i+1)) ; j++){
				if(u[j]>u[j+1]){
					int t = u[j];
					u[j] = u[j+1];
					u[j+1] = t;
				}
			}
		}
		
		int d = 0;
		
		for(int i=0 ; i<a.length ; i++){
			if(i<a.length-1){
				if(a[i+1]-a[i] > 1){
					d = a[i]+1;
				}
			}
		}
		
		System.out.println("d: "+d);
		
		for(int i=0 ; i<u.length ; i++){
			System.out.println(i +"  :  "+u[i]);
		}
		
		return 0;
	}

	static void unique_array(int[] my_array)
    {
        System.out.println("Original Array : ");
         
        for (int i = 0; i < my_array.length; i++)
        {
            System.out.print(my_array[i]+"\t");
        }
         
        //Assuming all elements in input array are unique
         
        int no_unique_elements = my_array.length;
         
        //Comparing each element with all other elements
         
        for (int i = 0; i < no_unique_elements; i++) 
        {
            for (int j = i+1; j < no_unique_elements; j++)
            {
                //If any two elements are found equal
                 
                if(my_array[i] == my_array[j])
                {
                    //Replace duplicate element with last unique element
                     
                    my_array[j] = my_array[no_unique_elements-1];
                     
                    no_unique_elements--;
                     
                    j--;
                }
            }
        }
         
        //Copying only unique elements of my_array into array1
         
        int[] array1 = Arrays.copyOf(my_array, no_unique_elements);
         
        //Printing arrayWithoutDuplicates
         
        System.out.println();
         
        System.out.println("Array with unique values : ");
         
        for (int i = 0; i < array1.length; i++)
        {
            System.out.print(array1[i]+"\t");
        }
         
        System.out.println();
         
        System.out.println("---------------------------");
    }
	
}
