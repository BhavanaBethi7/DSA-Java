
import java.util.*;
class maxElement {
    public int maxOfArray(int[] arr)
    {
        int n = arr.length;
        int maxElement = arr[0];
        for(int i=1;i<n;i++)
        {
             maxElement = Math.max(arr[i],maxElement);
        }
        return maxElement;
    }
    public static void main(String[] args) 
    {
        int[] arr = {2,3,4,10,8,6};
        maxElement main = new maxElement();
        int result = main.maxOfArray(arr);
        System.out.println("Max Element=" + result);
    }
}