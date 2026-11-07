class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        StringBuilder str = new StringBuilder(magazine);

        for(int i = 0; i < ransomNote.length(); i++) {

            boolean found = false;

            for(int j = 0; j < str.length(); j++) {

                if(ransomNote.charAt(i) == str.charAt(j)) {

                    str.deleteCharAt(j);
                    found = true;
                    break;
                }
            }

            if(!found) {
                return false;
            }
        }

        return true;
    }
}