import java.util.HashMap;
public class Main{
    public static void main(String[]args){
        HashMap<Integer,Integer> hm=new HashMap<>();
        int i;
        int arr[] = {2,4,1,2,4,5};
        for(i=0;i<arr.length;i++){
            int n=arr[i];
            if(hm.containsKey(n)){
                hm.get(n);
            }
            else{
                hm.put(n,0);
            }
        }
        for(int key : hm.keySet()){
            System.out.println(key +" "+ hm.get(key));
        }
    }
}