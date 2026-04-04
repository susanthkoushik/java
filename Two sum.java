public class Main{
    public static void main(String[]args){
        int arr[] = {1,4,6,8,9,10,16};
        int target = 15;
        int i =0;
        int j=arr.length-1;
        while(i<j){
              int sum = arr[i]+arr[j];
            if(sum == target){
                System.out.println(arr[i] + " " + arr[j]);
                break;
            }
            else if(sum<target){
                i++;
            }
            else{
                j--;
            }
        }
    }
}