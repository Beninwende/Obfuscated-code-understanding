/*
 * Decompiled with CFR 0.152.
 */
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Main {
    private static String[] lIllIIIlIl;
    private static int[] IIIIlIIlIl;

    public Main() {
        Main IIlIIIIlIlIl;
    }

    public static void main(String[] stringArray) {
        int lllIlllIIlIl;
        FastScanner IIlllllIIlIl = new FastScanner();
        int llIllllIIlIl = IIlllllIIlIl.nextInt();
        int[] IlIllllIIlIl = new int[llIllllIIlIl];
        int lIIllllIIlIl = IIIIlIIlIl[0];
        while (Main.llIlIlIIlIIl(lIIllllIIlIl, llIllllIIlIl)) {
            IlIllllIIlIl[lIIllllIIlIl] = IIlllllIIlIl.nextInt();
            ++lIIllllIIlIl;
            "".length();
            if (-" ".length() < 0) continue;
            return;
        }
        lIIllllIIlIl = IIIIlIIlIl[1];
        int IIIllllIIlIl = IIIIlIIlIl[0];
        while (Main.IIllIlIIlIIl(lIIllllIIlIl)) {
            lIIllllIIlIl = IIIIlIIlIl[0];
            lllIlllIIlIl = llIllllIIlIl - IIIIlIIlIl[1];
            while (Main.lIllIlIIlIIl(lllIlllIIlIl)) {
                if (Main.llIlIlIIlIIl(IlIllllIIlIl[lllIlllIIlIl], IlIllllIIlIl[lllIlllIIlIl - IIIIlIIlIl[1]])) {
                    int IllIlllIIlIl = IlIllllIIlIl[lllIlllIIlIl];
                    IlIllllIIlIl[lllIlllIIlIl] = IlIllllIIlIl[lllIlllIIlIl - IIIIlIIlIl[1]];
                    IlIllllIIlIl[lllIlllIIlIl - Main.IIIIlIIlIl[1]] = IllIlllIIlIl;
                    lIIllllIIlIl = IIIIlIIlIl[1];
                    ++IIIllllIIlIl;
                }
                --lllIlllIIlIl;
                "".length();
                if (null == null) continue;
                return;
            }
            "".length();
            if (((0x51 ^ 0x30) & ~(0xCA ^ 0xAB)) == 0) continue;
            return;
        }
        lllIlllIIlIl = IIIIlIIlIl[0];
        while (Main.llIlIlIIlIIl(lllIlllIIlIl, llIllllIIlIl)) {
            System.out.print(IlIllllIIlIl[lllIlllIIlIl]);
            if (Main.llIlIlIIlIIl(lllIlllIIlIl, llIllllIIlIl - IIIIlIIlIl[1])) {
                System.out.print(lIllIIIlIl[IIIIlIIlIl[0]]);
                "".length();
                if (" ".length() > " ".length()) {
                    return;
                }
            } else {
                System.out.println();
            }
            ++lllIlllIIlIl;
            "".length();
            if (" ".length() << " ".length() <= " ".length() << (" ".length() << " ".length())) continue;
            return;
        }
        System.out.println(IIIllllIIlIl);
    }

    static {
        Main.IlIlIlIIlIIl();
        Main.IllIIlIIlIIl();
    }

    private static void IllIIlIIlIIl() {
        lIllIIIlIl = new String[IIIIlIIlIl[1]];
        Main.lIllIIIlIl[Main.IIIIlIIlIl[0]] = Main.IIlllIIIlIIl("II1Xn/OvUcs=", "VnMaG");
    }

    private static String IIlllIIIlIIl(String lIIIlllIIlIl, String IIIIlllIIlIl) {
        try {
            SecretKeySpec llllIllIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IIIIlllIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher IlllIllIIlIl = Cipher.getInstance("Blowfish");
            IlllIllIIlIl.init(IIIIlIIlIl[2], llllIllIIlIl);
            return new String(IlllIllIIlIl.doFinal(Base64.getDecoder().decode(lIIIlllIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIllIllIIlIl) {
            lIllIllIIlIl.printStackTrace();
            return null;
        }
    }

    private static void IlIlIlIIlIIl() {
        IIIIlIIlIl = new int[3];
        Main.IIIIlIIlIl[0] = (0x14 ^ 0xF ^ (0x96 ^ 0x93) << (" ".length() << (" ".length() << " ".length()))) & ((0x91 ^ 0xB0) << " ".length() ^ (0x5D ^ 0x54) ^ -" ".length());
        Main.IIIIlIIlIl[1] = " ".length();
        Main.IIIIlIIlIl[2] = " ".length() << " ".length();
    }

    private static boolean llIlIlIIlIIl(int n, int n2) {
        return n < n2;
    }

    private static boolean IIllIlIIlIIl(int n) {
        return n != 0;
    }

    private static boolean lIllIlIIlIIl(int n) {
        return n > 0;
    }
}

