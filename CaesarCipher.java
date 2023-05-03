/**
 *
 * @author Aharon's PC
 */
public class CaesarCipher {
    
    // Decrypts cipher using shift
    public static StringBuffer decrypt(String cipher, int shift) {
        StringBuffer result = new StringBuffer();
 
        for (int i = 0; i < cipher.length(); i++) {
            if (Character.isUpperCase(cipher.charAt(i))) {
                char ch = (char) (((int) cipher.charAt(i) +
                        shift - 65) % 26 + 65);
                result.append(ch);
            } else {
                char ch = (char) (((int) cipher.charAt(i) +
                        shift - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result;
    }
 
    public static void main(String[] args) {
        String originalText = "PHHWPHDIWHUWKHWRJDSDUWB";
        for(int i=25;i>0;i--){
        int shiftCount = i;
        String cipher = decrypt(originalText, shiftCount).toString();
        System.out.println("Possible outcome: " + cipher);
        }
    }   
}
