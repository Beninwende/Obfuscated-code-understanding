/*
 * Decompiled with CFR 0.152.
 */
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

class Main {
    private static String[] lllIIIlIll;
    private static int[] IIIlIIlIll;

    Main() {
        Main llIIlIllIlllIll;
    }

    public static void main(String[] stringArray) throws Exception {
        hayami lIllIIllIlllIll = new hayami();
        int IIllIIllIlllIll = lIllIIllIlllIll.saori_hayami();
        int[] llIlIIllIlllIll = new int[IIllIIllIlllIll];
        int IlIlIIllIlllIll = IIIlIIlIll[0];
        while (Main.IlIlllllllIl(IlIlIIllIlllIll, IIllIIllIlllIll)) {
            llIlIIllIlllIll[IlIlIIllIlllIll] = lIllIIllIlllIll.saori_hayami();
            ++IlIlIIllIlllIll;
            "".length();
            if (-" ".length() == -" ".length()) continue;
            return;
        }
        Arrays.sort(llIlIIllIlllIll);
        IlIlIIllIlllIll = IIIlIIlIll[0];
        int lIIlIIllIlllIll = IIIlIIlIll[0];
        while (Main.IlIlllllllIl(lIIlIIllIlllIll, IIllIIllIlllIll - IIIlIIlIll[1])) {
            IlIlIIllIlllIll += llIlIIllIlllIll[lIIlIIllIlllIll];
            ++lIIlIIllIlllIll;
            "".length();
            if (" ".length() << " ".length() > 0) continue;
            return;
        }
        if (Main.llIlllllllIl(IlIlIIllIlllIll, llIlIIllIlllIll[IIllIIllIlllIll - IIIlIIlIll[1]])) {
            System.out.println(lllIIIlIll[IIIlIIlIll[0]]);
            "".length();
            if (" ".length() << (" ".length() << " ".length()) < " ".length() << " ".length()) {
                return;
            }
        } else {
            System.out.println(lllIIIlIll[IIIlIIlIll[1]]);
        }
    }

    static {
        Main.lIIlllllllIl();
        Main.IIIlllllllIl();
    }

    private static void IIIlllllllIl() {
        lllIIIlIll = new String[IIIlIIlIll[2]];
        Main.lllIIIlIll[Main.IIIlIIlIll[0]] = Main.lllIllllllIl("E3yI5jHOsbs=", "qrNRS");
        Main.lllIIIlIll[Main.IIIlIIlIll[1]] = Main.lllIllllllIl("E56htxXKj2w=", "snSiz");
    }

    private static String lllIllllllIl(String IIlIIIllIlllIll, String llIIIIllIlllIll) {
        try {
            SecretKeySpec IlIIIIllIlllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIIIllIlllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIIIIllIlllIll = Cipher.getInstance("Blowfish");
            lIIIIIllIlllIll.init(IIIlIIlIll[2], IlIIIIllIlllIll);
            return new String(lIIIIIllIlllIll.doFinal(Base64.getDecoder().decode(IIlIIIllIlllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIIIIIllIlllIll) {
            IIIIIIllIlllIll.printStackTrace();
            return null;
        }
    }

    private static void lIIlllllllIl() {
        IIIlIIlIll = new int[3];
        Main.IIIlIIlIll[0] = (0x71 ^ 0x2A) & ~(0x76 ^ 0x2D);
        Main.IIIlIIlIll[1] = " ".length();
        Main.IIIlIIlIll[2] = " ".length() << " ".length();
    }

    private static boolean IlIlllllllIl(int n, int n2) {
        return n < n2;
    }

    private static boolean llIlllllllIl(int n, int n2) {
        return n > n2;
    }
}

