
///pick the min element and bring it at start



public class SortSelection {
   
    void swap(int a,int b,int[] arr)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    public void SelectionSort(int arr[])
    {
       for(int i=0;i<arr.length;i++)
       {  
           int index=-1;
           int min=Integer.MAX_VALUE;
          for(int j=i;j<arr.length;j++)
          {
             if(arr[j]<min)
             {
                 min=arr[j];
                 index=j;
             }
          }

          swap(i,index,arr);

       }
      

    }
    
}