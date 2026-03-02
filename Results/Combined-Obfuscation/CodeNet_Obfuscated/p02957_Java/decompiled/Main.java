/*
 * Decompiled with CFR 0.152.
 */
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

class Main {
    static final long MOD = 1000000007L;
    static final int MAX;
    static final int INF;
    private static String[] lllIlIlIIl;
    private static int[] lIIllIlIIl;

    Main() {
        Main IllIIIlllIIIl;
    }

    public static void main(String[] stringArray) throws Exception {
        hayami lIIIIIlllIIIl = new hayami();
        int IIIIIIlllIIIl = lIIIIIlllIIIl.saori_hayami();
        int llllllIllIIIl = lIIIIIlllIIIl.saori_hayami();
        int IlllllIllIIIl = lIIllIlIIl[0];
        if (Main.IIIlIllIIIIl(IIIIIIlllIIIl, llllllIllIIIl)) {
            IlllllIllIIIl = llllllIllIIIl;
            llllllIllIIIl = IIIIIIlllIIIl;
            IIIIIIlllIIIl = IlllllIllIIIl;
        }
        if (Main.lIIlIllIIIIl((IIIIIIlllIIIl + llllllIllIIIl) % lIIllIlIIl[1])) {
            IlllllIllIIIl = (llllllIllIIIl - IIIIIIlllIIIl) / lIIllIlIIl[1];
            System.out.println(IlllllIllIIIl + IIIIIIlllIIIl);
            "".length();
            if (-"   ".length() > 0) {
                return;
            }
        } else {
            System.out.println(lllIlIlIIl[lIIllIlIIl[0]]);
        }
        lIIIIIlllIIIl.close();
    }

    static {
        Main.lllIIllIIIIl();
        Main.IllIIllIIIIl();
        MAX = lIIllIlIIl[2];
        INF = lIIllIlIIl[3];
    }

    private static void IllIIllIIIIl() {
        lllIlIlIIl = new String[lIIllIlIIl[4]];
        Main.lllIlIlIIl[Main.lIIllIlIIl[0]] = Main.lIIllIlIIIIl("RLMsxJAhH5d0+SLz21GA3Q==", "AEmSE");
    }

    private static String lIIllIlIIIIl(String lIIlllIllIIIl, String IIIlllIllIIIl) {
        try {
            SecretKeySpec lllIllIllIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IIIlllIllIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher IllIllIllIIIl = Cipher.getInstance("Blowfish");
            IllIllIllIIIl.init(lIIllIlIIl[1], lllIllIllIIIl);
            return new String(IllIllIllIIIl.doFinal(Base64.getDecoder().decode(lIIlllIllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIllIllIIIl) {
            lIlIllIllIIIl.printStackTrace();
            return null;
        }
    }

    private static void lllIIllIIIIl() {
        lIIllIlIIl = new int[5];
        Main.lIIllIlIIl[0] = (0x2D ^ 0x24) << " ".length() & ~((9 ^ 0) << " ".length());
        Main.lIIllIlIIl[1] = " ".length() << " ".length();
        Main.lIIllIlIIl[2] = (101017328 + 292945477 - 102158312 + 31840342 << " ".length()) + (423659870 + 133975112 - 316002652 + 264757201 << " ".length()) - (525053222 + 1327987922 - 1054219986 + 618321517) + (47114602 + 375784587 - 350842150 + 343350844 << " ".length()) << " ".length();
        Main.lIIllIlIIl[3] = 79475 + 191312 - -22835 + 208359 + (81260 + 200055 - 261917 + 203919) - -(1006620 + 702370 - 859214 + 296270) + (36480 + 69539 - 50320 + 26082) << ((0xB7 ^ 0xB0) << "   ".length() ^ (0x97 ^ 0xA6));
        Main.lIIllIlIIl[4] = " ".length();
    }

    private static boolean IIIlIllIIIIl(int n, int n2) {
        return n > n2;
    }

    private static boolean lIIlIllIIIIl(int n) {
        return n == 0;
    }
}

