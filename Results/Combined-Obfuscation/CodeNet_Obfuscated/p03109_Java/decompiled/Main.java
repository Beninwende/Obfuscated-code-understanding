/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Main$FastScanner
 */
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Main {
    FastScanner in;
    PrintWriter out;
    static final int MOD;
    static final long INF = 0x3FFFFFFFFFFFFFFFL;
    private static String[] IllIIIIIl;
    private static int[] IIIlIIIIl;
    private static int[] lIIlIIIIl;

    public Main() {
        Main lIlIIIIIIIllll;
    }

    void solve() {
        String string;
        Main lIllllllllIlll;
        int IIllllllllIlll = lIllllllllIlll.in.nextInt();
        int llIlllllllIlll = lIllllllllIlll.in.nextInt();
        long IlIlllllllIlll = 0L;
        int[] lIIlllllllIlll = lIllllllllIlll.in.nextIntArray(IIllllllllIlll);
        int IIIlllllllIlll = IIIlIIIIl[lIIlIIIIl[0]];
        while (Main.IllIIIIlll(Main.IlIIIIIlll((int)IIIlllllllIlll, (int)IIllllllllIlll) ? 1 : 0)) {
            IlIlllllllIlll += (long)lIIlllllllIlll[IIIlllllllIlll];
            ++IIIlllllllIlll;
            "".length();
            "".length();
            if (!Main.lllIIIIlll("   ".length())) continue;
            return;
        }
        IIIlllllllIlll = IIIlIIIIl[lIIlIIIIl[0]];
        int lllIllllllIlll = IIIlIIIIl[lIIlIIIIl[0]];
        while (Main.IllIIIIlll(Main.IlIIIIIlll((int)lllIllllllIlll, (int)IIllllllllIlll) ? 1 : 0)) {
            if (Main.IllIIIIlll(Main.llIIIIIlll((int)Main.lIIIIIIlll((long)lIllllllllIlll.ceil(IlIlllllllIlll, IIIlIIIIl[lIIlIIIIl[1]] * llIlllllllIlll), (long)lIIlllllllIlll[lllIllllllIlll])) ? 1 : 0)) {
                ++IIIlllllllIlll;
            }
            ++lllIllllllIlll;
            "".length();
            "".length();
            if (!Main.IIIlIIIlll(null)) continue;
            return;
        }
        PrintWriter printWriter = lIllllllllIlll.out;
        if (Main.IllIIIIlll(Main.IIlIIIIlll((int)IIIlllllllIlll, (int)llIlllllllIlll) ? 1 : 0)) {
            string = IllIIIIIl[IIIlIIIIl[lIIlIIIIl[0]]];
            "".length();
            "".length();
            if (Main.lllIIIIlll("   ".length())) {
                return;
            }
        } else {
            string = IllIIIIIl[IIIlIIIIl[lIIlIIIIl[2]]];
        }
        printWriter.println(string);
    }

    /*
     * WARNING - void declaration
     */
    long ceil(long IIlIllllllIlll, long llIIllllllIlll) {
        void var3_2;
        return (IIlIllllllIlll + var3_2 - 1L) / var3_2;
    }

    public static void main(String[] stringArray) {
        new Main().m();
    }

    private void m() {
        Main lIIIllllllIlll;
        lIIIllllllIlll.in = new FastScanner(System.in);
        lIIIllllllIlll.out = new PrintWriter(System.out);
        lIIIllllllIlll.solve();
        lIIIllllllIlll.out.flush();
        lIIIllllllIlll.in.close();
        lIIIllllllIlll.out.close();
    }

    static {
        Main.lIlIIIIlll();
        Main.IIIIIIIlll();
        Main.lllllllIll();
        MOD = IIIlIIIIl[lIIlIIIIl[3]];
    }

    private static void lllllllIll() {
        IIIlIIIIl = new int[lIIlIIIIl[4]];
        Main.IIIlIIIIl[Main.lIIlIIIIl[0]] = ((lIIlIIIIl[5] ^ lIIlIIIIl[6]) << "   ".length() ^ lIIlIIIIl[7] + lIIlIIIIl[8] - lIIlIIIIl[9] + lIIlIIIIl[10]) << (" ".length() << " ".length()) & ((" ".length() << "   ".length() ^ (lIIlIIIIl[11] ^ lIIlIIIIl[12])) << (" ".length() << " ".length()) ^ -" ".length());
        Main.IIIlIIIIl[Main.lIIlIIIIl[1]] = " ".length() << (" ".length() << " ".length());
        Main.IIIlIIIIl[Main.lIIlIIIIl[2]] = " ".length();
        Main.IIIlIIIIl[Main.lIIlIIIIl[3]] = lIIlIIIIl[13] + lIIlIIIIl[14] - lIIlIIIIl[15] + lIIlIIIIl[16];
    }

    private static void IIIIIIIlll() {
        IllIIIIIl = new String[lIIlIIIIl[2]];
        Main.IllIIIIIl[Main.lIIlIIIIl[0]] = Main.IIlllllIll("cmH2l9Lr5mg=", "iwjka");
        Main.IllIIIIIl[Main.lIIlIIIIl[1]] = Main.IIlllllIll("kAPIYgQPCMo=", "lDgmN");
    }

    private static String IIlllllIll(String IIllIlllllIlll, String llIlIlllllIlll) {
        try {
            SecretKeySpec IlIlIlllllIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIlIlllllIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIlIlllllIlll = Cipher.getInstance("Blowfish");
            lIIlIlllllIlll.init(lIIlIIIIl[2], IlIlIlllllIlll);
            return new String(lIIlIlllllIlll.doFinal(Base64.getDecoder().decode(IIllIlllllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIIlIlllllIlll) {
            IIIlIlllllIlll.printStackTrace();
            return null;
        }
    }

    private static void lIlIIIIlll() {
        lIIlIIIIl = new int[17];
        Main.lIIlIIIIl[0] = (0xA6 ^ 0x89) << " ".length() & ~((0x46 ^ 0x69) << " ".length());
        Main.lIIlIIIIl[1] = " ".length();
        Main.lIIlIIIIl[2] = " ".length() << " ".length();
        Main.lIIlIIIIl[3] = "   ".length();
        Main.lIIlIIIIl[4] = " ".length() << (" ".length() << " ".length());
        Main.lIIlIIIIl[5] = 0xF ^ 0x66;
        Main.lIIlIIIIl[6] = ((0x23 ^ 0x36) << (" ".length() << " ".length()) ^ (0xCB ^ 0xA2)) << " ".length();
        Main.lIIlIIIIl[7] = (0x46 ^ 0x65) << (" ".length() << " ".length());
        Main.lIIlIIIIl[8] = 0xA ^ 0x6D;
        Main.lIIlIIIIl[9] = (0xEB ^ 0x9E) << " ".length();
        Main.lIIlIIIIl[10] = (0x67 ^ 0x46) << (" ".length() << " ".length());
        Main.lIIlIIIIl[11] = ((0x5D ^ 0x7A) << " ".length() ^ (0x3F ^ 0x66)) << (" ".length() << " ".length());
        Main.lIIlIIIIl[12] = 76 + 54 - 86 + 87 ^ (0x25 ^ 0x44) << " ".length();
        Main.lIIlIIIIl[13] = 1708237 + 30046427 - 16862999 + 21910764 << (" ".length() << (" ".length() << " ".length()));
        Main.lIIlIIIIl[14] = 55470512 + 42146789 - 25290821 + 118851271 << " ".length();
        Main.lIIlIIIIl[15] = (7772 + 157353 - 58658 + 274934 << (" ".length() << (" ".length() << " ".length()))) + (68292 + 89542 - 152636 + 650305 << (" ".length() << " ".length())) - (827208 + 610233 - 1253253 + 1002099) + (745336 + 597806 - 461116 + 163229 << " ".length()) << ("   ".length() << " ".length());
        Main.lIIlIIIIl[16] = 249590168 + 273434022 - 306790264 + 81545201 + (6371974 + 4121748 - 8611199 + 7680108 << ("   ".length() << " ".length())) - (831453 + 14490527 - -121182089 + 5949672 << (" ".length() << " ".length())) + (124955056 + 29746772 - 153379688 + 151211239 << " ".length());
    }

    private static boolean IIIlIIIlll(Object object) {
        return object != null;
    }

    private static boolean IllIIIIlll(int n) {
        return n != 0;
    }

    private static boolean lllIIIIlll(int n) {
        return n <= 0;
    }
}

