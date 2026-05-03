class Solution {
    public boolean isAnagram(String s, String t) {
        //first check the legnth and mismatch return false
        if(s ==null || t == null){
            return false;
        }else if(s.length() != t.length()) {
            return false;
        } 
        Map< Character, Integer> countInS = new HashMap< Character, Integer> ();
        Map<Character , Integer> countInt = new HashMap< Character, Integer> ();
        for(int i =0 ; i< s.length();i++){
            if(countInS.containsKey(s.charAt(i))){
                countInS.put(s.charAt(i),countInS.get(s.charAt(i))+1);
            }else{
                countInS.put(s.charAt(i),1);
            }
            if(countInt.containsKey(t.charAt(i))){
                countInt.put(t.charAt(i),countInt.get(t.charAt(i))+1);
            }else{
                countInt.put(t.charAt(i),1);
            }
        }
        for(Map.Entry< Character, Integer> e : countInS.entrySet()){
            Character c = e.getKey();
            Integer count  = e.getValue();
            if (!count.equals(countInt.get(c))) {
                return false;
            }
        }
         
         return true;
    }
}
