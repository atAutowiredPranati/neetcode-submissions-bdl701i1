class Solution {
    public boolean isAnagram(String s, String t) {

        char[] arrayS = s.toCharArray();
        char[] arrayT = t.toCharArray();
        int lengthOfS = arrayS.length;
        int lengthOfT = arrayT.length;
        if(lengthOfS != lengthOfT){
            return false;
        }
        Arrays.sort(arrayS);
        Arrays.sort(arrayT);
        if(Arrays.equals(arrayS, arrayT)){
            return true;
        }
        return false;

        // char[] arr1 = s.toCharArray();
        // char[] arr2 = t.toCharArray();

        // if(arr1.length != arr2.length){
        //     return false;
        // }

        // for(int i = 0 ; i < arr1.length; i++){
        //     for(int j = i+1 ; j< arr2.length; j++){
        //         if(arr1[i] == arr2[j]){
        //             return true;
        //         }
        //     }
        // }
        // return false;
    }
}
