package com.integration.general.helpers.utils;

import com.integration.general.helpers.configs.LoggerConfig;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import java.io.*;
import java.nio.file.Paths;
import java.security.Key;
import java.security.SecureRandom;
import java.util.Base64;
/********************************************************************************************************
 * PURPOSE : Class for encrypting/ decrypting strings like User password using
 * Sun's JCE
 *******************************************************************************************************/

public class CryptoAlgoUtil {
    Key key;
    Cipher cipher;
    final String pathName;


    public CryptoAlgoUtil(String fileName) throws Exception {
        String userDirectory = Paths.get("").toAbsolutePath().toString();
        this.pathName = userDirectory+fileName;
        //this.pathName = pathName;
        System.out.println("pathName out = "+this.pathName);
        LoggerConfig.logger.info("pathName log = "+this.pathName);
        //this.pathName = pathName;
        initProcess();
    }

    public void initProcess() throws Exception {
        try {

            ObjectInputStream in = new ObjectInputStream(new FileInputStream(
                    new File(pathName)));
            key = (Key) in.readObject(); // reads key from the key file
            in.close();
        } catch (FileNotFoundException fnfe) {
            KeyGenerator generator = KeyGenerator.getInstance("DES");
            generator.init(new SecureRandom());
            key = generator.generateKey();
            ObjectOutputStream out = new ObjectOutputStream(
                    new FileOutputStream(new File(pathName)));
            out.writeObject(key);
            out.close();
        }
        cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
    }

    public String encrypt(String clearStr) throws Exception {
        if (clearStr.length() < 1)
            return "";
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] clearText = clearStr.getBytes();
        byte[] cipherText = cipher.doFinal(clearText);
        return Base64.getEncoder().encodeToString(cipherText);
    }

    public String decrypt(String cipherStr) throws Exception {
        cipher.init(Cipher.DECRYPT_MODE, key);
        byte[] raw = Base64.getDecoder().decode(cipherStr);
        byte[] stringBytes = cipher.doFinal(raw);
        return new String(stringBytes);
    }
}
