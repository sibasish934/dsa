class Solution {
    void zigZag(int arr[], int n) {
        boolean indicator =true;
        for(int i = 0; i<arr.length-1; i++){
            int j = i + 1;
            if(indicator){
                if(arr[i] > arr[j]){
                    swap(arr, i, j);
                }
            }else{
                if(arr[i] < arr[j]){
                    swap(arr, i, j);
                }
            }
            indicator = !indicator;
        }
    }
    
    void swap(int []arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
