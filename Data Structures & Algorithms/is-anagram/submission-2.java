class Solution {
    public boolean isAnagram(String s, String t) {

        // char[] arrayS = s.toCharArray();
        // char[] arrayT = t.toCharArray();

        // Arrays.sort(arrayS);
        // Arrays.sort(arrayT);

        // if(Arrays.equals(arrayT, arrayS)){
        //     return true;
        // }
        // return false;

        // if(s.length() != t.length()){
        //     return false;
        // }
        // HashMap <Character, Integer> mapS = new HashMap<>();
        // HashMap <Character, Integer> mapT = new HashMap<>();

        // for(int i = 0; i < s.length(); i++){
        //     mapS.put(s.charAt(i), mapS.getOrDefault(s.charAt(i), 0) + 1);
        //     mapT.put(t.charAt(i), mapT.getOrDefault(t.charAt(i),0) + 1);
        // }
        // if (mapS.equals(mapT)){
        //     return true;
        // }
        // return false;

        //brutes->

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

//smart brutes ->

    char[] arr1 = s.toCharArray();
    char[] arr2 = t.toCharArray();

    Arrays.sort(arr1);
    Arrays.sort(arr2);

    if(Arrays.equals(arr1, arr2)){
        return true;
    }
    return false;

    }
}
