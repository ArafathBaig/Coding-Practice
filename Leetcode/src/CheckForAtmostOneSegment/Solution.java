package CheckForAtmostOneSegment;

class Solution {
    public boolean checkOnesSegment(String s) {
        if(s.length() == 1 && s.charAt(0) == '1')
            return true;

        int count = 0;

        for(int i = 0 ; i < s.length() ;i++){
            char c= s.charAt(i);

            if( c == '1'){

                if(count == -1)
                    return false;

                count++;
            }else{

                if(count > 0)
                    count= -1;
            }
        }

        return true ;
    }
}