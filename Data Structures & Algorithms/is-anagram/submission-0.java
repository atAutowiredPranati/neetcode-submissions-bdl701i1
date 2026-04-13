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

        if(s.length() != t.length()){
            return false;
        }
        HashMap <Character, Integer> mapS = new HashMap<>();
        HashMap <Character, Integer> mapT = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            mapS.put(s.charAt(i), mapS.getOrDefault(s.charAt(i), 0) + 1);
            mapT.put(t.charAt(i), mapT.getOrDefault(t.charAt(i),0) + 1);
        }
        if (mapS.equals(mapT)){
            return true;
        }
        return false;


    }
}
