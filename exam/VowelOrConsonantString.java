package exam;

public class VowelOrConsonantString {
    public static void main(String args[]) {
        String s = "ones";
        int vcount = 0, ccount = 0;
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'  ) {
                vcount++;
            } else
            {
                ccount++;
            }
        }
            System.out.println("Number of vowels are:" + vcount);
            System.out.println("Number of consonants are:" + ccount);
        }
    }








