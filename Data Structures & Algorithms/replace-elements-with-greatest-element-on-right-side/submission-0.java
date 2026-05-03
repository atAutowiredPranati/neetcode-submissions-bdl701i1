class Solution {
    public int[] replaceElements(int[] arr) {

        int n = arr.length;
        int[] res = new int[n];
        for(int i = 0 ; i < n ; i++){
            int greatestElement = -1;
            for(int j = i+1 ; j < n ; j++){
                if(arr[j] > greatestElement){
                    greatestElement = Math.max(greatestElement , arr[j]);
                }
            }
            res[i] = greatestElement;
            if(i == (n -1)){
                res[i] = -1;
            }
        }
        return res;
    }
}