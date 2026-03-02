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
    private static String[] llIIllIIll;
    private static int[] IIlIllIIll;

    public Main() {
        Main llIIlIIIIlIIlll;
    }

    public static void main(String[] stringArray) throws IOException {
        BufferedReader IIllIIIIIlIIlll = new BufferedReader(new InputStreamReader(System.in));
        String llIlIIIIIlIIlll = IIllIIIIIlIIlll.readLine();
        String IlIlIIIIIlIIlll = IIllIIIIIlIIlll.readLine();
        int lIIlIIIIIlIIlll = IIlIllIIll[0];
        if (Main.llIlIlIlllIl(IlIlIIIIIlIIlll.length(), IIlIllIIll[1])) {
            int IIIlIIIIIlIIlll = IIlIllIIll[0];
            while (Main.IIllIlIlllIl(IIIlIIIIIlIIlll, llIlIIIIIlIIlll.length())) {
                if (Main.llIlIlIlllIl(llIlIIIIIlIIlll.charAt(IIIlIIIIIlIIlll), IlIlIIIIIlIIlll.charAt(IIlIllIIll[0]))) {
                    lIIlIIIIIlIIlll = IIlIllIIll[1];
                    "".length();
                    if (-" ".length() < " ".length() << (" ".length() << " ".length())) break;
                    return;
                }
                ++IIIlIIIIIlIIlll;
                "".length();
                if (-"   ".length() <= 0) continue;
                return;
            }
            "".length();
            if (((0x1D ^ 0xC) & ~(0xE ^ 0x1F) & ~((0x25 ^ 0x36) & ~(0x57 ^ 0x44))) >= " ".length() << (" ".length() << " ".length())) {
                return;
            }
        } else {
            int IIIlIIIIIlIIlll = IIlIllIIll[0];
            while (Main.IIllIlIlllIl(IIIlIIIIIlIIlll, llIlIIIIIlIIlll.length())) {
                if (Main.llIlIlIlllIl(llIlIIIIIlIIlll.charAt(IIIlIIIIIlIIlll), IlIlIIIIIlIIlll.charAt(IIlIllIIll[0]))) {
                    int lllIIIIIIlIIlll = IIlIllIIll[1];
                    while (Main.IIllIlIlllIl(lllIIIIIIlIIlll, IlIlIIIIIlIIlll.length())) {
                        if (Main.IIllIlIlllIl(lllIIIIIIlIIlll + IIIlIIIIIlIIlll, llIlIIIIIlIIlll.length())) {
                            if (Main.lIllIlIlllIl(llIlIIIIIlIIlll.charAt(lllIIIIIIlIIlll + IIIlIIIIIlIIlll), IlIlIIIIIlIIlll.charAt(lllIIIIIIlIIlll))) {
                                "".length();
                                if (null == null) break;
                                return;
                            }
                        } else if (Main.IlllIlIlllIl(lllIIIIIIlIIlll + IIIlIIIIIlIIlll, llIlIIIIIlIIlll.length()) && Main.lIllIlIlllIl(llIlIIIIIlIIlll.charAt(lllIIIIIIlIIlll + IIIlIIIIIlIIlll - llIlIIIIIlIIlll.length()), IlIlIIIIIlIIlll.charAt(lllIIIIIIlIIlll))) {
                            "".length();
                            if (" ".length() <= " ".length() << " ".length()) break;
                            return;
                        }
                        if (Main.llIlIlIlllIl(lllIIIIIIlIIlll + IIlIllIIll[1], IlIlIIIIIlIIlll.length())) {
                            lIIlIIIIIlIIlll = IIlIllIIll[1];
                        }
                        ++lllIIIIIIlIIlll;
                        "".length();
                        if (null == null) continue;
                        return;
                    }
                }
                ++IIIlIIIIIlIIlll;
                "".length();
                if (null == null) continue;
                return;
            }
        }
        if (Main.llllIlIlllIl(lIIlIIIIIlIIlll)) {
            System.out.println(llIIllIIll[IIlIllIIll[0]]);
            "".length();
            if (" ".length() < 0) {
                return;
            }
        } else {
            System.out.println(llIIllIIll[IIlIllIIll[1]]);
        }
    }

    static {
        Main.IlIlIlIlllIl();
        Main.lIIlIlIlllIl();
    }

    private static void lIIlIlIlllIl() {
        llIIllIIll = new String[IIlIllIIll[2]];
        Main.llIIllIIll[Main.IIlIllIIll[0]] = Main.lllIIlIlllIl("KA95ohJgL8E=", "JPtHy");
        Main.llIIllIIll[Main.IIlIllIIll[1]] = Main.IIIlIlIlllIl("siCwS0NpWyU=", "HaZHQ");
    }

    private static String lllIIlIlllIl(String IlIIIIIIIlIIlll, String lIIIIIIIIlIIlll) {
        try {
            SecretKeySpec IIIIIIIIIlIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIIIIIIIlIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllIIIlll = Cipher.getInstance("Blowfish");
            lllllllllIIIlll.init(IIlIllIIll[2], IIIIIIIIIlIIlll);
            return new String(lllllllllIIIlll.doFinal(Base64.getDecoder().decode(IlIIIIIIIlIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IllllllllIIIlll) {
            IllllllllIIIlll.printStackTrace();
            return null;
        }
    }

    private static String IIIlIlIlllIl(String lIlIlllllIIIlll, String IIlIlllllIIIlll) {
        try {
            SecretKeySpec llIIlllllIIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IIlIlllllIIIlll.getBytes(StandardCharsets.UTF_8)), IIlIllIIll[3]), "DES");
            Cipher IlIIlllllIIIlll = Cipher.getInstance("DES");
            IlIIlllllIIIlll.init(IIlIllIIll[2], llIIlllllIIIlll);
            return new String(IlIIlllllIIIlll.doFinal(Base64.getDecoder().decode(lIlIlllllIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIIlllllIIIlll) {
            lIIIlllllIIIlll.printStackTrace();
            return null;
        }
    }

    private static void IlIlIlIlllIl() {
        IIlIllIIll = new int[4];
        Main.IIlIllIIll[0] = ((0x56 ^ 0xF) << " ".length() ^ 44 + 64 - 88 + 141) & ((0x7E ^ 0x4F) << " ".length() ^ (0x3A ^ 0x4B) ^ -" ".length());
        Main.IIlIllIIll[1] = " ".length();
        Main.IIlIllIIll[2] = " ".length() << " ".length();
        Main.IIlIllIIll[3] = " ".length() << "   ".length();
    }

    private static boolean llIlIlIlllIl(int n, int n2) {
        return n == n2;
    }

    private static boolean IlllIlIlllIl(int n, int n2) {
        return n >= n2;
    }

    private static boolean IIllIlIlllIl(int n, int n2) {
        return n < n2;
    }

    private static boolean llllIlIlllIl(int n) {
        return n != 0;
    }

    private static boolean lIllIlIlllIl(int n, int n2) {
        return n != n2;
    }
}

