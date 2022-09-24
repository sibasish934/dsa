public class MergeSortedArrays {
    public static void main(String[] args) {
        int []arr1 = {1,2,3,4,5,6};
        int []arr2 = {7, 8,9,10};
        int n = arr1.length;
        int m = arr2.length;
        getMerge(arr1, arr2, n, m);
    }

    private static void getMerge(int[] nums1, int[] nums2, int n, int m) {
        int i= 0, j = 0, k= 0;
        int[]res = new int[n + m];
        while(i<n && j < m){
            if(nums1[i] < nums2[j]){
                res[k++] = nums1[i];
                i++;
            }else{
                res[k++] = nums2[j];
                j++;
            }
        }

        while(i< n){
            res[k] = nums1[i];
            k++; i++;
        }

        while(j < m){
            res[k] = nums2[j];
            k++; j++;
        }

        for(int num : res){
            System.out.println(num);
        }
    }
}
