import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

public class Main
{
    public static void main(String[] args)
    {
        try
        {
            String PASSWORD = "YOUR_PASSWORD_HERE";
            String PASSCODE = "YOUR_PASSCODE_HERE";
            
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            PBEKeySpec p = new PBEKeySpec(PASSCODE.toCharArray(), "samsung_sec_salt".getBytes(), 100, 128);
            SecretKey sk = new SecretKeySpec(SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(p).getEncoded(), "AES");
            cipher.init(2, sk, new IvParameterSpec(new byte[16]));
            System.out.println(new String(cipher.doFinal(Base64.getDecoder().decode(PASSWORD))));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
