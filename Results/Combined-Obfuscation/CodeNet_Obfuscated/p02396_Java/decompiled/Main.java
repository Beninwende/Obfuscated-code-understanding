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
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Main {
    private static String[] IllIllIl;
    private static int[] lllIllIl;

    public Main() {
        Main lllIllIllIlIIIl;
    }

    public static void main(String[] stringArray) {
        BufferedReader IlIIllIllIlIIIl = new BufferedReader(new InputStreamReader(System.in));
        int lIIIllIllIlIIIl = lllIllIl[0];
        String[] IIIIllIllIlIIIl = new String[lllIllIl[1]];
        try {
            while (Main.lllIlIlIIl(lIIIllIllIlIIIl, lllIllIl[1])) {
                IIIIllIllIlIIIl[lIIIllIllIlIIIl] = IlIIllIllIlIIIl.readLine();
                if (Main.IIIllIlIIl(IIIIllIllIlIIIl[lIIIllIllIlIIIl].equals(IllIllIl[lllIllIl[0]]) ? 1 : 0)) {
                    "".length();
                    if (-(0xBD ^ 0xB8) < 0) break;
                    return;
                }
                ++lIIIllIllIlIIIl;
                "".length();
                if (null == null) continue;
                return;
            }
            lIIIllIllIlIIIl = lllIllIl[0];
            while (Main.lllIlIlIIl(lIIIllIllIlIIIl, lllIllIl[1])) {
                if (Main.IIIllIlIIl(IIIIllIllIlIIIl[lIIIllIllIlIIIl].equals(IllIllIl[lllIllIl[2]]) ? 1 : 0)) {
                    "".length();
                    if (" ".length() << " ".length() != 0) break;
                    return;
                }
                System.out.println("Case " + (lIIIllIllIlIIIl + lllIllIl[2]) + ": " + IIIIllIllIlIIIl[lIIIllIllIlIIIl]);
                ++lIIIllIllIlIIIl;
                "".length();
                if (" ".length() > 0) continue;
                return;
            }
        }
        catch (IOException llllIlIllIlIIIl) {
            System.out.println(llllIlIllIlIIIl);
            "".length();
            if (" ".length() << " ".length() <= 0) {
                return;
            }
        }
        catch (NumberFormatException llllIlIllIlIIIl) {
            System.out.println(llllIlIllIlIIIl);
        }
        "".length();
        if (-"  ".length() >= 0) {
            return;
        }
    }

    static {
        Main.IllIlIlIIl();
        Main.lIlIlIlIIl();
    }

    private static void lIlIlIlIIl() {
        IllIllIl = new String[lllIllIl[3]];
        Main.IllIllIl[Main.lllIllIl[0]] = Main.IIlIlIlIIl("XRW9S4TvpeA=", "aXfnx");
        Main.IllIllIl[Main.lllIllIl[2]] = Main.IIlIlIlIIl("XBT/gMXAxJ8=", "IKvOh");
    }

    private static String IIlIlIlIIl(String IlIlIlIllIlIIIl, String lIIlIlIllIlIIIl) {
        try {
            SecretKeySpec IIIlIlIllIlIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIlIlIllIlIIIl.getBytes(StandardCharsets.UTF_8)), lllIllIl[4]), "DES");
            Cipher lllIIlIllIlIIIl = Cipher.getInstance("DES");
            lllIIlIllIlIIIl.init(lllIllIl[3], IIIlIlIllIlIIIl);
            return new String(lllIIlIllIlIIIl.doFinal(Base64.getDecoder().decode(IlIlIlIllIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IllIIlIllIlIIIl) {
            IllIIlIllIlIIIl.printStackTrace();
            return null;
        }
    }

    private static void IllIlIlIIl() {
        lllIllIl = new int[5];
        Main.lllIllIl[0] = ((0xBF ^ 0xA4) << (" ".length() << " ".length()) ^ (0x11 ^ 0x22)) & (0xA ^ 0x37 ^ (0x50 ^ 0x61) << " ".length() ^ -" ".length());
        Main.lllIllIl[1] = (113 + 26 - 112 + 150 << " ".length()) + (42 + 138 - -11 + 194) - (132 + 254 - 139 + 220) + (152 + 309 - 231 + 123) << (" ".length() << (" ".length() << " ".length()));
        Main.lllIllIl[2] = " ".length();
        Main.lllIllIl[3] = " ".length() << " ".length();
        Main.lllIllIl[4] = " ".length() << "   ".length();
    }

    private static boolean lllIlIlIIl(int n, int n2) {
        return n < n2;
    }

    private static boolean IIIllIlIIl(int n) {
        return n != 0;
    }
}

