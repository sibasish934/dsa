public class OneZeroArray {
    public static void main(String[] args) {
        int []arr = {0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1};
        int start = 0;
        int end = 1;

        while(arr[end] == 0){
            start = end;
            end = 2 * end;
        }
        System.out.println(start + " "+ end);
        int ans = getFirstIndex(arr, start, end);
        System.out.println(ans);
    }

    private static int getFirstIndex(int[] arr, int start, int end) {
        while(start < end){
            int mid = start + (end - start)/2;
            if( arr[mid] == 1){
                end = mid;
            }else {
                start = mid + 1;
            }
        }
        return start;
    }
}
