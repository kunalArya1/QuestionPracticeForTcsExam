import java.util.Arrays;
import java.util.HashMap;

public class StringsQuestions {

/*

        -: String Question :-

1. Character is a vowel or consonant using java                     --> done
2. Finding Length of string without using length() method           --> done
3. Check whether a String is Palindrome                             --> done
4. Program to reverse the string                                    --> done
5. Check Frequency of Characters in a string                        --> done
6. Check Two Strings are Anagram or Not



*/
//1. Character is a vowel or consonant using java
    public static String  isVowelOrConsonant(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'|| ch == 'O' || ch == 'U'){
            return "Vowel";
        }
        return "Consonant";
    }

// 2.  Finding Length of string without using length() method
    public static int stringLength(String str){
        char [] charArray = str.toCharArray();
        return  charArray.length;
    }
//3. Check whether a String is Palindrome
    public static boolean isPalindrome(String str){
        String reverseStr = "";
        for (int i = str.length() -1 ; i >= 0 ; i--) {
            reverseStr += str.charAt(i);

        }

        // We can use char array and swapping for this using while loop
//        System.out.println(reverseStr);
        return str.equals(reverseStr);
    }
//4. Program to reverse the string
    public static String reverseString(String str ){
        // Method 1 using loop
        String reversedString = "";
        for (int i = str.length() -1;  i >=0 ; i--) {
            reversedString += str.charAt(i);
        }

        // Method 2 using char array
        char [] revrseStirngs = str.toCharArray();

        int left =0;
        int right = revrseStirngs.length -1 ;
        while (right > left){
            char temp = revrseStirngs[left];
            revrseStirngs[left] = revrseStirngs[right];
            revrseStirngs[right]= temp;
            left++;
            right--;
        }

//        return reversedString;
        return new String(revrseStirngs);
    }
//5. Check Frequency of Characters in a string
    public static String frequencyOfCharactersInString(String str){
        HashMap<Character,Integer> map = new HashMap<>();

        char [] charString = str.toCharArray();
        for (int i = 0; i < charString.length; i++) {
            if(map.containsKey(charString[i])){
                map.put(charString[i], map.get(charString[i])+1);
            }else{
                map.put(charString[i],1);
            }

        }
        return  map.toString();
    }
//6. Check Two Strings are Anagram or Not
    public static boolean isAnagramOrNot(String str1 ,String str2){
        if (str1.length() != str2.length()){
            return false;
        }
        char [] charArray1 = str1.toCharArray();
        char [] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        for (int i = 0; i < charArray1.length; i++) {
            if(charArray1[i] != charArray2[i]){
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println( "Character is Vowel or Consonants:-  "+isVowelOrConsonant('t'));
        System.out.println("String Length without Length Method :- " + stringLength("kunal"));
        System.out.println("String is Palindrome or Not :- " + isPalindrome("chhc"));
        System.out.println("Reversed String is :- "+ reverseString("Kunal"));
        System.out.println("Frequency of characters in string :- "+ frequencyOfCharactersInString("kunaal"));
        System.out.println("String is Anagram or not :- " + isAnagramOrNot("heart","earth"));
    }
}
