/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Scanner;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Main {
    private static String[] llIlIIll;
    private static int[] lIllIIll;

    public Main() {
        Main IIlIlIIIllIIIIl;
    }

    public static void main(String[] stringArray) {
        BufferedReader lIllIIIIllIIIIl = new BufferedReader(new InputStreamReader(System.in));
        try {
            block32: {
                Scanner IIllIIIIllIIIIl = new Scanner(System.in);
                do {
                    String llIlIIIIllIIIIl;
                    if (Main.lllIIlIlIl((llIlIIIIllIIIIl = lIllIIIIllIIIIl.readLine()).equals(llIlIIll[lIllIIll[0]]) ? 1 : 0)) {
                        "".length();
                        if (-" ".length() > 0) {
                            return;
                        }
                        break block32;
                    }
                    int IlIlIIIIllIIIIl = lIllIIll[0];
                    int lIIlIIIIllIIIIl = lIllIIll[0];
                    while (Main.IIIlIlIlIl(lIIlIIIIllIIIIl, llIlIIIIllIIIIl.length())) {
                        char IIIlIIIIllIIIIl = llIlIIIIllIIIIl.charAt(lIIlIIIIllIIIIl);
                        if (Main.lIIlIlIlIl(IIIlIIIIllIIIIl, lIllIIll[1])) {
                            IlIlIIIIllIIIIl += lIllIIll[2];
                            "".length();
                            if (null != null) {
                                return;
                            }
                        } else if (Main.lIIlIlIlIl(IIIlIIIIllIIIIl, lIllIIll[3])) {
                            IlIlIIIIllIIIIl += lIllIIll[4];
                            "".length();
                            if (" ".length() << " ".length() >= " ".length() << (" ".length() << " ".length())) {
                                return;
                            }
                        } else if (Main.lIIlIlIlIl(IIIlIIIIllIIIIl, lIllIIll[5])) {
                            IlIlIIIIllIIIIl += lIllIIll[6];
                            "".length();
                            if (null != null) {
                                return;
                            }
                        } else if (Main.lIIlIlIlIl(IIIlIIIIllIIIIl, lIllIIll[7])) {
                            IlIlIIIIllIIIIl += lIllIIll[8];
                            "".length();
                            if (" ".length() << (" ".length() << " ".length()) <= 0) {
                                return;
                            }
                        } else if (Main.lIIlIlIlIl(IIIlIIIIllIIIIl, lIllIIll[9])) {
                            IlIlIIIIllIIIIl += lIllIIll[10];
                            "".length();
                            if (-"  ".length() > 0) {
                                return;
                            }
                        } else if (Main.lIIlIlIlIl(IIIlIIIIllIIIIl, lIllIIll[11])) {
                            IlIlIIIIllIIIIl += lIllIIll[12];
                            "".length();
                            if (-"  ".length() > 0) {
                                return;
                            }
                        } else if (Main.lIIlIlIlIl(IIIlIIIIllIIIIl, lIllIIll[13])) {
                            IlIlIIIIllIIIIl += lIllIIll[14];
                            "".length();
                            if (" ".length() <= 0) {
                                return;
                            }
                        } else if (Main.lIIlIlIlIl(IIIlIIIIllIIIIl, lIllIIll[15])) {
                            IlIlIIIIllIIIIl += lIllIIll[16];
                            "".length();
                            if ("   ".length() == " ".length() << " ".length()) {
                                return;
                            }
                        } else if (Main.lIIlIlIlIl(IIIlIIIIllIIIIl, lIllIIll[17])) {
                            IlIlIIIIllIIIIl += lIllIIll[18];
                        }
                        ++lIIlIIIIllIIIIl;
                        "".length();
                        if (" ".length() << " ".length() <= " ".length() << (" ".length() << " ".length())) continue;
                        return;
                    }
                    System.out.println(IlIlIIIIllIIIIl);
                    "".length();
                } while (" ".length() << " ".length() > " ".length());
                return;
            }
            "".length();
        }
        catch (IOException IIllIIIIllIIIIl) {
            System.out.println(IIllIIIIllIIIIl);
        }
        if (" ".length() == 0) {
            return;
        }
    }

    static {
        Main.IllIIlIlIl();
        Main.IlIIIlIlIl();
    }

    private static void IlIIIlIlIl() {
        llIlIIll = new String[lIllIIll[2]];
        Main.llIlIIll[Main.lIllIIll[0]] = Main.lIIIIlIlIl("sFZf2OqZo8c=", "ZWwcE");
    }

    private static String lIIIIlIlIl(String llIIIIIIllIIIIl, String IlIIIIIIllIIIIl) {
        try {
            SecretKeySpec lIIIIIIIllIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IlIIIIIIllIIIIl.getBytes(StandardCharsets.UTF_8)), lIllIIll[16]), "DES");
            Cipher IIIIIIIIllIIIIl = Cipher.getInstance("DES");
            IIIIIIIIllIIIIl.init(lIllIIll[4], lIIIIIIIllIIIIl);
            return new String(IIIIIIIIllIIIIl.doFinal(Base64.getDecoder().decode(llIIIIIIllIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllIlIIIIl) {
            llllllllIlIIIIl.printStackTrace();
            return null;
        }
    }

    private static void IllIIlIlIl() {
        lIllIIll = new int[19];
        Main.lIllIIll[0] = (0xB3 ^ 0xA4) & ~(0x81 ^ 0x96);
        Main.lIllIIll[1] = 0x48 ^ 0x61 ^ "   ".length() << "   ".length();
        Main.lIllIIll[2] = " ".length();
        Main.lIllIIll[3] = ((0xA ^ 0x65) << " ".length() ^ 119 + 169 - 125 + 36) << " ".length();
        Main.lIllIIll[4] = " ".length() << " ".length();
        Main.lIllIIll[5] = (0x8C ^ 0x83) << (" ".length() << (" ".length() << " ".length())) ^ 193 + 97 - 277 + 182;
        Main.lIllIIll[6] = "   ".length();
        Main.lIllIIll[7] = (0x8D ^ 0xC6 ^ (0x9D ^ 0xBE) << " ".length()) << (" ".length() << " ".length());
        Main.lIllIIll[8] = " ".length() << (" ".length() << " ".length());
        Main.lIllIIll[9] = 133 + 151 - 174 + 77 ^ (0xD3 ^ 0x94) << " ".length();
        Main.lIllIIll[10] = 0x6A ^ 0x6F;
        Main.lIllIIll[11] = (0x59 ^ 0x42) << " ".length();
        Main.lIllIIll[12] = "   ".length() << " ".length();
        Main.lIllIIll[13] = 0xB ^ 0x3C;
        Main.lIllIIll[14] = (0x41 ^ 0x46) << "   ".length() ^ (0x9D ^ 0xA2);
        Main.lIllIIll[15] = (0x74 ^ 0x73) << "   ".length();
        Main.lIllIIll[16] = " ".length() << "   ".length();
        Main.lIllIIll[17] = 0x96 ^ 0xAF;
        Main.lIllIIll[18] = 0x36 ^ 0x3F;
    }

    private static boolean lIIlIlIlIl(int n, int n2) {
        return n == n2;
    }

    private static boolean IIIlIlIlIl(int n, int n2) {
        return n < n2;
    }

    private static boolean lllIIlIlIl(int n) {
        return n != 0;
    }
}

