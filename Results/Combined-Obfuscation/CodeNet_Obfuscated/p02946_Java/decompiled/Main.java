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
    private static String[] IIlIIIllIl;
    private static int[] lIlIIIllIl;

    Main() {
        Main llIlIIlIIl;
    }

    public static void main(String[] stringArray) throws Exception {
        int IlIIIIlIIl;
        hayami lIlIIIlIIl = new hayami();
        int IIlIIIlIIl = lIlIIIlIIl.saori_hayami();
        int llIIIIlIIl = lIlIIIlIIl.saori_hayami();
        int lIIIIIlIIl = IlIIIIlIIl = llIIIIlIIl - IIlIIIlIIl + lIlIIIllIl[0];
        while (Main.IIIIIIIIIlIl(lIIIIIlIIl, llIIIIlIIl + IIlIIIlIIl)) {
            System.out.print(lIIIIIlIIl);
            System.out.print(IIlIIIllIl[lIlIIIllIl[1]]);
            ++lIIIIIlIIl;
            "".length();
            if ((((0x46 ^ 0x5F) << " ".length() ^ (0x17 ^ 0x30)) << " ".length() & ((133 + 95 - 93 + 16 ^ (0xC4 ^ 0x85) << " ".length()) << " ".length() ^ -" ".length())) == ((0x95 ^ 0xA0 ^ "   ".length() << (" ".length() << (" ".length() << " ".length()))) << (" ".length() << " ".length()) & (((0x4C ^ 0x5B) << (" ".length() << " ".length()) ^ (0x4A ^ 0x13)) << (" ".length() << " ".length()) ^ -" ".length()))) continue;
            return;
        }
        System.out.println(IIlIIIllIl[lIlIIIllIl[0]]);
        lIlIIIlIIl.close();
    }

    static {
        Main.lllllllllIIl();
        Main.IllllllllIIl();
        INF = lIlIIIllIl[2];
        MAX = lIlIIIllIl[3];
    }

    private static void IllllllllIIl() {
        IIlIIIllIl = new String[lIlIIIllIl[4]];
        Main.IIlIIIllIl[Main.lIlIIIllIl[1]] = Main.lIlllllllIIl("6apkmWEIrLY=", "EepRI");
        Main.IIlIIIllIl[Main.lIlIIIllIl[0]] = Main.lIlllllllIIl("LaIsDqzOojI=", "vMbfj");
    }

    private static String lIlllllllIIl(String IIllllIIIl, String llIlllIIIl) {
        try {
            SecretKeySpec IlIlllIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIlllIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIlllIIIl = Cipher.getInstance("Blowfish");
            lIIlllIIIl.init(lIlIIIllIl[4], IlIlllIIIl);
            return new String(lIIlllIIIl.doFinal(Base64.getDecoder().decode(IIllllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIIlllIIIl) {
            IIIlllIIIl.printStackTrace();
            return null;
        }
    }

    private static void lllllllllIIl() {
        lIlIIIllIl = new int[5];
        Main.lIlIIIllIl[0] = " ".length();
        Main.lIlIIIllIl[1] = (0x33 ^ 0x38) << "   ".length() & ~((0x2C ^ 0x27) << "   ".length());
        Main.lIlIIIllIl[2] = 1359044 + 633459 - 490132 + 450754 << (4 ^ 0xD);
        Main.lIlIIIllIl[3] = 496045718 + 335715927 - 565680710 + 807660888 << " ".length();
        Main.lIlIIIllIl[4] = " ".length() << " ".length();
    }

    private static boolean IIIIIIIIIlIl(int n, int n2) {
        return n < n2;
    }
}

