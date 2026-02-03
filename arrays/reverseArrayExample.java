

class reverseArrayExample {
    public int[] reverseArray(int[] arr)
    {
        int n = arr.length;
        int i=0, j =n-1;
        while(i<=j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }
    public static void main(String[] args) 
    {
        int[] arr = {1,4,5,7,6,9};
        Main main = new Main();
        int[] reversed = main.reverseArray(arr);
        for(int i=0; i<reversed.length; i++)
        {
            System.out.print(reversed[i] + " ");
        }
    }
}