
  ////Time complexity O(nlogn), Space complexty=O(n)+recursive stack
  ////pros
  //=> Large size list sorting
  //=>Sorting of linked list O(1) space complecity
  //=>External Sorting Large size disk data into the ram
  //=>Stable (order of dupicate emements preserve)
  
  ////Cons
  // Extra Space
  //Slower than insertion sort which is O(n2) for small array, since recursion is used.
  //No smaller sub problem
  //Recursive


public class SortMerge {
   
    
    public void MergeSort(int arr[],int low,int high)
    {
         
        if(low<high)
        {
            int mid=(low+high)/2;
            MergeSort(arr, low, mid);  //T(n/2)
            MergeSort(arr, mid+1, high);  //T(n/2)
            Merge(low,mid,high,arr);     //n 
        }
    }
    
    public void Merge(int low,int mid, int high,int arr[])
    {   
        int len=high-low+1;
        int merge[]=new int[len];

        int k=0;
        int i=low;
        int j=mid+1;

        while(i<=mid && j<=high)
        {
            if(arr[i]>=arr[j])
            {
                merge[k]=arr[j];
                k++;
                j++;
            }else if(arr[i]<arr[j])
            {
                merge[k]=arr[i];
                k++;
                i++;
            }
        }

        for(int x=i;x<=mid;x++)
        {
            merge[k]=arr[x];
            k++;
        }
        for(int y=j;y<=high;y++)
        {
            merge[k]=arr[y];
            k++;
        }
       
        int m=0;
        for(int t=low;t<=high;t++)
        {
            arr[t]=merge[m];
            m++;
        }

    }




}