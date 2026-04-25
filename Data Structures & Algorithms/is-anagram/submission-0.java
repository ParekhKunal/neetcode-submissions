class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> S1 = new HashMap();
        Map<Character,Integer> T1 = new HashMap();

        if(s.length() != t.length()){
            return false;
        }

        for(int i = 0; i < s.length(); i++){
            char Sch = s.charAt(i);
            char Tch = t.charAt(i);
            S1.put(Sch, S1.getOrDefault(Sch, 0) + 1);
            T1.put(Tch, T1.getOrDefault(Tch, 0) + 1);
        }

        return S1.equals(T1);
    }
}
