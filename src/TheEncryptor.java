import java.text.SimpleDateFormat;

import java.util.Date;

public class TheEncryptor {

    private final String alphabet = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM1234567890";
    private final String deAlphabet = "mnbvcxzlkjhgfdsapoiuytrewqMNBVCXZLKJHGFDSAPOIUYTREWQ6457893201";

    public String transformation(String text, String alphabet, String deAlphabet) {
        StringBuilder sb = new StringBuilder();
        for (char c : text.toCharArray()) {
            int s = alphabet.indexOf(c);
            if (s == -1) {
                sb.append(c);
            } else {
                sb.append(deAlphabet.charAt(s));
            }
        }
        return sb.toString();
    }

    public String encrypt(String text) {
        return transformation(text, alphabet, deAlphabet);
    }

    public String deAlphabet(String text) {
        return transformation(text, deAlphabet, alphabet);
    }

    public String timeEncrypt() {
        SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = simple.format(new Date());
        return encrypt(time);
    }

    public String timeDecrypt(String timeTime) {
        return deAlphabet(timeTime);
    }

}