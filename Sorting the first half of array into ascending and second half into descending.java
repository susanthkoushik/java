public class Main{
    public static void main(String[]args){
        int i;
        int j;
        int temp = 0;
        int arr[]={31,2,4,66};
        int n=arr.length;
        int mid=n/2;
        System.out.print("original array" + " ");
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(i=0;i<mid;i++){
            for(j=i+1;j<mid;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(i=mid;i<n;i++){
            for(j=i+1;j<n;j++){
                if(arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.print("resulted array" +" ");
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}