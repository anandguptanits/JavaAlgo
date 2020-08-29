
////pivot decide krna h either first, last element or  middle one
///uska bad pivot element ko shi jagah dalna in partition method , uska index return krna h(better if for loop)

//it is unstable algo
//Time complexity is O(nlogn)
 //Worst case time complexity is O(n2) ,When the elemrnt are already sorted 
public class SortQuick {
      
    public void  swap(int a,int b,int arr[])
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
        
    }
      public void QuickSort(int arr[],int low,int high)
      {   
          if(low<high)
          {
          int pivot=partition(arr,low,high);
          QuickSort(arr,low,pivot-1);
          QuickSort(arr,pivot+1,high);
          }     
      }

      int partition(int arr[],int low,int high)
      {   

         int pivot=arr[low];
         int j=low;
         for(int i=low+1;i<=high;i++)
         {

               if(arr[i]<pivot)
               {   
                   j++;  
                   swap(i,j,arr);
               }
         }

         swap(j,low,arr);
         return j;

      }


    
}