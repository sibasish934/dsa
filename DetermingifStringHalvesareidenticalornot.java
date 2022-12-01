class Solution {
    public boolean halvesAreAlike(String s) {
        s = s.toLowerCase();
        ArrayList<Character> array1 = new ArrayList<>();
        char []arr = s.toCharArray();
        ArrayList<Character> array2 = new ArrayList<>();

        for(int i = 0; i< arr.length/2; i++){
             array1.add(arr[i]);
        }

        for(int i=arr.length/2; i<arr.length; i++){
            array2.add(arr[i]);
        }

        int lefthalfVowel = getVowelCount(array1);
        int righthalfVowel = getVowelCount(array2);

        if(lefthalfVowel == righthalfVowel){
            return true;
        }
        return false;
    }
    public int getVowelCount(ArrayList<Character> arr){
        int count = 0;
        for(int i = 0; i<arr.size(); i++){
            if(arr.get(i) == 'a' || arr.get(i) == 'e' || arr.get(i) == 'i' || arr.get(i) == 'o' || arr.get(i) == 'u'){
           count ++;     
            }
        }
        return count;
    }
}
