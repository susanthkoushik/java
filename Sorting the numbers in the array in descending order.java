public class Main{
    public static void main(String[]args){
        int i;
        int j;
        int temp = 0;
        int arr[]={2,54,34,22,15};
         System.out.print("originalarray" +" ");
        for(i=0;i<arr.length;i++){
           System.out.print(arr[i] + " ");
        }
        for(i=0;i<arr.length;i++){
            for(j=i+1;j<arr.length;j++){
               if(arr[i]<arr[j]){
                   temp = arr[i];
                   arr[i] =arr[j];
                   arr[j] = temp;
               } 
            }
        }
        System.out.println();
        System.out.print("sortedarray"+ " ");
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}