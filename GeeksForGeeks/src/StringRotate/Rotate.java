package StringRotate;


class Rotate{

    /*  Function to check if two strings are rotations of each other
     *   s1, s2: are the input strings
     */
    public static boolean areRotations(String s1, String s2 )
    {
        // Your code here
        int m = s1.length(), n = s2.length();


        return (m == n) && ((s1+s1).indexOf(s2) != -1) ;

    }

}