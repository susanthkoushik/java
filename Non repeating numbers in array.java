import java.util.HashMap;
public class Main{
    public static void main(String[]args){
        HashMap<Integer,Integer> hm=new HashMap<>();
        int i;
        int arr[] = {9,9,8,7,7};
        for(i=0;i<arr.length;i++){
            int n = arr[i];
            if(hm.containsKey(n)){
                int prev = hm.get(n);
                hm.put(n,prev+1);
            }
            else{
                hm.put(n,0);
            }
        }
        System.out.println("non repeting elements :");
        for(int key : hm.keySet()){
            if(hm.get(key)==0){
                System.out.println(key);
            }
        }
    }
}