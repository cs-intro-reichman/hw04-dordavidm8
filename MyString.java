public class MyString {
    public static void main(String[] args) {
         System.out.println("HEllo TEST!!!!!!!!");
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        String  newStr = "" ;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
    
            if (c >= 'A' && c <= 'Z') {
                newStr += (char) (c + 32);
             } else {
              newStr += (char) (c);
             }
        }
            
        
        return newStr;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
    if (str2.length() == 0) {
        return true; 
    }
    if (str2.length() > str1.length()) {
        return false;
    }
    char[] arr1 = str1.toCharArray();
    char[] arr2 = str2.toCharArray();
    for (int i = 0; i <= arr1.length - arr2.length; i++) {
        boolean matchFound = true;
    for (int j = 0; j < arr2.length; j++) {
        if (arr1[i + j] != arr2[j]) {
                matchFound = false; 
                break; 
            }
            }
            if (matchFound) {
            return true;
        }
        }

        
    

        return false;
    }
}
