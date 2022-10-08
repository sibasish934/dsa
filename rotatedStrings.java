class solution{
    public static void main (String args[]){
        String str = "abcd";
        String str1 = "dcba";
        
        if(findRotate(str, str1)){
            System.out.println("rotated");
        }else{

            System.out.println("not rotated");
        }
    }
    
    public static boolean findRotated(String str, String str1){
        String add = str + str;
        return str.length == str1.length && add.indexOf(str1) != -1;
    }
}
