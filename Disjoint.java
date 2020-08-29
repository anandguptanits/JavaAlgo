

class Disjoint{
static int find(int arr[],int x)
    {
        if(arr[x]<0)
        {
            return x;
        }else{
           int a= find(arr, arr[x]);
           arr[x]=a;
           return a;
        }
    }
    static void Union(int arr[],int  x, int y)
    {
        if(Math.abs(arr[x])>Math.abs(arr[y]))
        {
            arr[x]=arr[y]+arr[x];
            arr[y]=x;
        }else{
            arr[y]=arr[y]+arr[x];
            arr[x]=y;
        }
    }
}