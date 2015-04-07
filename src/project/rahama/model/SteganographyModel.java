/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project.rahama.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 *
 * @author root
 */
public class SteganographyModel {

    private String encryptionKey;
    private String tempString;
    private String decryptedMessage;
    private File temporaryFile;
    private String fileName;

    private String embededFilename;

    public void setEmbededFilename(String embededFilename) {
        this.embededFilename = embededFilename;
    }

    public String getEmbededFilename() {
        return embededFilename;
    }

    public void setEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
    }

    public String getEncryptionKey() {
        return encryptionKey;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setTemporaryFile(File temporaryFile) {
        this.temporaryFile = temporaryFile;
    }

    public File getTemporaryFile() {
        return temporaryFile;
    }

    public void setDecryptedMessage(String decryptedMessage) {
        this.decryptedMessage = decryptedMessage;
    }

    public String getDecryptedMessage() {
        return decryptedMessage;
    }

    public void embedFile(String messageToEmbedStringS, File file, int encryption_keyI)
            throws Exception {
        
        StringBuilder messageToEmbedString = new StringBuilder(messageToEmbedStringS);
       
        
        byte b[] = new byte[1];
        BigInteger bigIntegerStorage, bigIntForMovingByteBigInteger;
//        tempString = messageToEmbedString;
        int k, k1;
        InputStream inputStream = new FileInputStream(file);
        OutputStream outputStream = new FileOutputStream(new File(getEmbededFilename()));
//        File f = new File("word.txt");
//        FileOutputStream fos = new FileOutputStream(f);
//        fos.write(tempString.getBytes());
//        fos.flush();
//        fos.close();

        for (int c = 0; c < encryption_keyI; c++) {
            int ch = inputStream.read();
            outputStream.write(ch);
        }

        int length_of_message = messageToEmbedString.length();
        byte mess[] = new byte[1];
        char charInMessage[] = new char[length_of_message + 1];
        k = k1 = 0;
        for (int i = 0; i <= length_of_message; i++) {
            messageToEmbedString.getChars(0, length_of_message, charInMessage, 0);
            if (i == 0) {
                BigDecimal bigDecimal = new BigDecimal(length_of_message);
                BigInteger byteIntStorage = bigDecimal.toBigInteger();
                String storage_length = byteIntStorage.toString(2);
                char Clen[] = new char[byteIntStorage.bitLength()];
                storage_length.getChars(0, byteIntStorage.bitLength(), Clen, 0);
                for (int j = 0; j <= 7; j++) {
                    if (j == 0) {
                        for (k = 0; k < 8 - byteIntStorage.bitLength(); k++) {
                            int n = inputStream.read(b);
                            bigIntegerStorage = new BigInteger(b);
                            String shiftByteBytwo = bigIntegerStorage.toString(2);
                            int length_of_storage = bigIntegerStorage.bitLength();
                            if (b[0] < 0) {
                                length_of_storage++;
                            }
                            char getCharRange[] = new char[length_of_storage + 1];
                            shiftByteBytwo.getChars(0, length_of_storage, getCharRange, 0);

                            if (b[0] == 0) {
                            } else {
                                if (getCharRange[length_of_storage - 1] == '1') {
                                    if (length_of_storage == bigIntegerStorage.bitLength()) {
                                        BigInteger bi = new BigInteger(
                                                "11111110", 2);
                                        BigInteger big = bigIntegerStorage.and(bi);
                                        b = big.toByteArray();
                                    } else {
                                        BigInteger bi = new BigInteger("-1", 2);
                                        BigInteger big = bigIntegerStorage.subtract(bi);
                                        b = big.toByteArray();
                                    }
                                }
                                outputStream.write(b);
                            }
                        } // for loop k
                        j = j + k - 1;
                    } // if of j
                    else {
                        int n = inputStream.read(b);
                        bigIntegerStorage = new BigInteger(b);
                        String Aby = bigIntegerStorage.toString(2);
                        int Alen = bigIntegerStorage.bitLength();
                        if (b[0] < 0) {
                            Alen++;
                        }
                        char Ach[] = new char[Alen + 1];
                        Aby.getChars(0, Alen, Ach, 0);
                        if (b[0] == 0) {
                            Alen = 1;
                        }
                        if (Clen[j - k] == '0' && Ach[Alen - 1] == '1') {
                            if (Alen == bigIntegerStorage.bitLength()) {
                                BigInteger bi = new BigInteger("11111110", 2);
                                BigInteger big = bigIntegerStorage.and(bi);
                                b = big.toByteArray();
                            } else {
                                BigInteger bi = new BigInteger("-1", 2);
                                BigInteger big = bigIntegerStorage.subtract(bi);
                                b = big.toByteArray();
                            }
                        } else if (Clen[j - k] == '1' && Ach[Alen - 1] == '0') {
                            if (Alen == bigIntegerStorage.bitLength()) {
                                BigInteger bi = new BigInteger("1", 2);
                                BigInteger big = bigIntegerStorage.add(bi);
                                b = big.toByteArray();
                            } else {
                                BigInteger bi = new BigInteger("-1", 2);
                                BigInteger big = bigIntegerStorage.add(bi);
                                b = big.toByteArray();
                            }

                        }
                        outputStream.write(b);
                    } // end else

                } // for loop j

            } // end of if
            else {
                String messageSize = String.valueOf(charInMessage[i - 1]);
                byte blen[] = messageSize.getBytes();
                BigInteger Blen = new BigInteger(blen);
                String Slen = Blen.toString(2);
                char Clen[] = new char[Blen.bitLength()];
                Slen.getChars(0, Blen.bitLength(), Clen, 0);
                for (int j = 0; j <= 7; j++) {
                    if (j == 0) {
                        for (k1 = 0; k1 < 8 - Blen.bitLength(); k1++) {
                            int n = inputStream.read(b);
                            bigIntegerStorage = new BigInteger(b);
                            String Aby = bigIntegerStorage.toString(2);
                            int msglegth = bigIntegerStorage.bitLength();
                            if (b[0] < 0) {
                                msglegth++;
                            }
                            char Ach[] = new char[msglegth + 1];
                            Aby.getChars(0, msglegth, Ach, 0);
                            if (b[0] == 0) {
                            } else {
                                if (Ach[msglegth - 1] == '1') {
                                    if (msglegth == bigIntegerStorage.bitLength()) {
                                        BigInteger bi = new BigInteger(
                                                "11111110", 2);
                                        BigInteger big = bigIntegerStorage.and(bi);
                                        b = big.toByteArray();
                                    } else {
                                        BigInteger bi = new BigInteger("-1", 2);
                                        BigInteger big = bigIntegerStorage.subtract(bi);
                                        b = big.toByteArray();
                                    }
                                }
                            }
                            outputStream.write(b);

                        } // for loop k

                        j = j + k1 - 1;

                    } // if of j
                    else {
                        int n = inputStream.read(b);
                        bigIntegerStorage = new BigInteger(b);
                        String Aby = bigIntegerStorage.toString(2);
                        int Alen = bigIntegerStorage.bitLength();
                        if (b[0] < 0) {
                            Alen++;
                        }
                        char Ach[] = new char[Alen + 1];
                        Aby.getChars(0, Alen, Ach, 0);
                        if (b[0] == 0) {
                            Alen = 1;
                        }

                        if (Clen[j - k1] == '0' && Ach[Alen - 1] == '1') {
                            if (Alen == bigIntegerStorage.bitLength()) {
                                BigInteger bi = new BigInteger("11111110", 2);
                                BigInteger big = bigIntegerStorage.and(bi);
                                b = big.toByteArray();
                            } else {
                                BigInteger bi = new BigInteger("-1", 2);
                                BigInteger big = bigIntegerStorage.subtract(bi);
                                b = big.toByteArray();
                            }
                        } else if (Clen[j - k1] == '1' && Ach[Alen - 1] == '0') {
                            if (Alen == bigIntegerStorage.bitLength()) {
                                BigInteger bi = new BigInteger("1", 2);
                                BigInteger big = bigIntegerStorage.add(bi);
                                b = big.toByteArray();
                            } else {
                                BigInteger bi = new BigInteger("-1", 2);
                                BigInteger big = bigIntegerStorage.add(bi);
                                b = big.toByteArray();
                            }
                        }
                        outputStream.write(b);
                    } // end else

                } // for loop j
            } // end of else

        } // for loop i

        // while(true)
        // {
        int i = inputStream.read();
        // if(i==-1)
        outputStream.write(i);
        inputStream.close();

    }

    public void retriveFile(File filename, int private_key) throws Exception {
        InputStream inputstream = new FileInputStream(filename);
        byte b[] = new byte[1];
        BigInteger bigInteger;
        char embdedMessage[] = new char[8];
        int c = 0;
        for (int i = 0; i < private_key; i++) {
            int n = inputstream.read();
        }
        for (int i = 0; i < 8; i++) {
            inputstream.read(b);
            bigInteger = new BigInteger(b);
            String str = bigInteger.toString(2);
            int len = bigInteger.bitLength();
            if (b[0] < 0) {
                len++;
            }
            char ch[] = new char[len + 1];
            str.getChars(0, len, ch, 0);
            if (b[0] == 0) {
                embdedMessage[i] = '0';
            } else {
                embdedMessage[i] = ch[len - 1];
            }
        }
        String dd = new String(embdedMessage);
        BigInteger bb = new BigInteger(dd, 2);
        String s = bb.toString(2);
        int l = bb.intValue();

        char me[] = new char[l];
        int count = 0;

        for (int m = 0; m < l; m++) {
            for (int i = 0; i < 8; i++) {
                inputstream.read(b);
                bigInteger = new BigInteger(b);
                String str = bigInteger.toString(2);
                int len = bigInteger.bitLength();
                if (b[0] < 0) {
                    len++;
                }
                char ch[] = new char[len + 1];
                str.getChars(0, len, ch, 0);
                if (b[0] == 0) {
                    embdedMessage[i] = '0';
                } else {
                    embdedMessage[i] = ch[len - 1];
                }
            }
            String dd1 = new String(embdedMessage);
            BigInteger bb2 = new BigInteger(dd1, 2);
            String s1 = bb2.toString(2);
            int l1 = bb2.intValue();
            me[count] = (char) l1;
            count++;
        }
        String message = "";

//        File f = new File("word.txt");
//
//        if (!f.exists() && f.length() < 0) {
//            message = "The message could not be decrypted.";
//        } else {
//            FileInputStream fis = new FileInputStream(f);
//            byte byt = 0;
//
//            while (byt != -1) {
//                byt = (byte) fis.read();
//                message = message + (char) byt;
//            }
//            System.out.println("Message " + message);
//            fis.close();
//        }

        message = new String(me);
       
//        message = message.substring(0, message.length() - 1);
        setDecryptedMessage(message);
        inputstream.close();

    }
}
