public class Main{
    public static void main(String[]args){
        int arr[]={2,80,3,46,52};
        int min=arr[0];
        int i;
        for(i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
