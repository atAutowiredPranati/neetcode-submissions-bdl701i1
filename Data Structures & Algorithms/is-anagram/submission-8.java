class Solution {
    public boolean isAnagram(String s, String t) {

        //in my mind
        //convert each string to array
        //sort both the array
        //if both arrays are equal then rerun true
        
        char[]  sArray =  s.toCharArray();
        char[]  tArray =  t.toCharArray();
        if(sArray.length != tArray.length){
            return false;
        }
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        if(Arrays.equals(sArray, tArray)){
            return true;
        
        }else{
        return false;
        }

    }
}
