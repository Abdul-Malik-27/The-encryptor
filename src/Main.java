

public class Main {
    public static void main(String[] args) {

        TheEncryptor program = new TheEncryptor();

        String original = "Hello my friend !";
        String encryptText = program.encrypt(original);
        String encryptTime = program.timeEncrypt();

        String deEncryptText = program.deAlphabet(encryptText);
        String deEncryptTime = program.timeDecrypt(encryptTime);

        System.out.println("Оригинальный текст: " + original + "\n");
        System.out.println("Зашифрованный текст: " + encryptText);
        System.out.println("Время шифровки: " + encryptTime + "\n");
        System.out.println("Дешифрованный текст: " + deEncryptText);
        System.out.println("Время дешифровки: " + deEncryptTime);



    }
}
