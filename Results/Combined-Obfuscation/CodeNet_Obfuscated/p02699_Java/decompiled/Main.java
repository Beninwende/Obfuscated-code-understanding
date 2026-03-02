/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Main$FastScanner
 */
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Main {
    private static int[] lIlllIIl;
    private static String[] IllllIIl;
    private static int[] lllllIIl;

    public Main() {
        Main IIIIllIIIIIlIIl;
    }

    public static void main(String[] stringArray) {
        FastScanner llIlIlIIIIIlIIl = new FastScanner();
        int IlIlIlIIIIIlIIl = llIlIlIIIIIlIIl.nextInt();
        String lIIlIlIIIIIlIIl = llIlIlIIIIIlIIl.next();
        if (Main.IllIlIIIIl(Main.lIIIlIIIIl(lIIlIlIIIIIlIIl.length(), IlIlIlIIIIIlIIl) ? 1 : 0)) {
            System.out.println(lIIlIlIIIIIlIIl);
            IllllIIl[lllllIIl[0]].length();
            "".length();
            if (Main.lllIlIIIIl(IllllIIl[lllllIIl[1]].length(), -IllllIIl[lllllIIl[2]].length())) {
                return;
            }
        } else {
            System.out.println(lIIlIlIIIIIlIIl.substring(lIlllIIl[lllllIIl[0]], IlIlIlIIIIIlIIl) + "...");
        }
    }

    static {
        Main.lIlIlIIIIl();
        Main.IIlIlIIIIl();
        Main.IIIIlIIIIl();
    }

    private static void IIIIlIIIIl() {
        lIlllIIl = new int[lllllIIl[1]];
        Main.lIlllIIl[Main.lllllIIl[0]] = (lllllIIl[3] ^ lllllIIl[4]) & (lllllIIl[5] ^ lllllIIl[6] ^ lllllIIl[7]);
    }

    private static boolean lIIIlIIIIl(int n, int n2) {
        boolean bl;
        if (Main.IIIllIIIIl(n, n2)) {
            bl = lllllIIl[1];
            "".length();
            if (-"   ".length() > 0) {
                return (" ".length() << (0x2F ^ 0x2A) & ~(" ".length() << (0x8D ^ 0x88))) != 0;
            }
        } else {
            bl = lllllIIl[0];
        }
        return bl;
    }

    private static void IIlIlIIIIl() {
        IllllIIl = new String[lllllIIl[8]];
        Main.IllllIIl[Main.lllllIIl[0]] = Main.IlIIlIIIIl("wfVYOQeTdqU=", "rVCCc");
        Main.IllllIIl[Main.lllllIIl[1]] = Main.llIIlIIIIl("cQ==", "QAslI");
        Main.IllllIIl[Main.lllllIIl[2]] = Main.IlIIlIIIIl("NnYuHhxns58=", "XdcVX");
    }

    private static String IlIIlIIIIl(String llIllIIIIIIlIIl, String IlIllIIIIIIlIIl) {
        try {
            SecretKeySpec lIIllIIIIIIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IlIllIIIIIIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher IIIllIIIIIIlIIl = Cipher.getInstance("Blowfish");
            IIIllIIIIIIlIIl.init(lllllIIl[2], lIIllIIIIIIlIIl);
            return new String(IIIllIIIIIIlIIl.doFinal(Base64.getDecoder().decode(llIllIIIIIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIlIIIIIIlIIl) {
            lllIlIIIIIIlIIl.printStackTrace();
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String llIIlIIIIl(String lIIlIIIIIIIlIIl, String IIIlIIIIIIIlIIl) {
        lIIlIIIIIIIlIIl = new String(Base64.getDecoder().decode(lIIlIIIIIIIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllIIIIIIIIlIIl = new StringBuilder();
        char[] IllIIIIIIIIlIIl = IIIlIIIIIIIlIIl.toCharArray();
        int lIlIIIIIIIIlIIl = lllllIIl[0];
        char[] llIllllllllIIIl = lIIlIIIIIIIlIIl.toCharArray();
        int IIlllllllllIIIl = llIllllllllIIIl.length;
        int lIlllllllllIIIl = lllllIIl[0];
        "".length();
        while (!Main.lIIllIIIIl(lIlllllllllIIIl, IIlllllllllIIIl)) {
            char IIlIIIIIIIIlIIl = llIllllllllIIIl[lIlllllllllIIIl];
            lllIIIIIIIIlIIl.append((char)(IIlIIIIIIIIlIIl ^ IllIIIIIIIIlIIl[lIlIIIIIIIIlIIl % IllIIIIIIIIlIIl.length]));
            "".length();
            ++lIlIIIIIIIIlIIl;
            ++lIlllllllllIIIl;
        }
        return String.valueOf(lllIIIIIIIIlIIl);
    }

    private static void lIlIlIIIIl() {
        lllllIIl = new int[9];
        Main.lllllIIl[0] = ((0x61 ^ 0x46) << (" ".length() << " ".length()) ^ 144 + 66 - 129 + 68) << "   ".length() & ((" ".length() ^ " ".length() << "   ".length()) << "   ".length() ^ -" ".length());
        Main.lllllIIl[1] = " ".length();
        Main.lllllIIl[2] = " ".length() << " ".length();
        Main.lllllIIl[3] = ((9 ^ 0xC) << (" ".length() << (" ".length() << " ".length())) ^ (0x13 ^ 0x2C)) << " ".length();
        Main.lllllIIl[4] = 111 + 28 - 41 + 33 + (0x97 ^ 0xA4) - (0x30 ^ 0x73) + ((0x5A ^ 0x4F) << " ".length());
        Main.lllllIIl[5] = (0x58 ^ 0x4F) << "   ".length() ^ 143 + 23 - 24 + 21;
        Main.lllllIIl[6] = (0x7A ^ 0x71) << "   ".length();
        Main.lllllIIl[7] = -" ".length();
        Main.lllllIIl[8] = "   ".length();
    }

    private static boolean lllIlIIIIl(int n, int n2) {
        return n == n2;
    }

    private static boolean lIIllIIIIl(int n, int n2) {
        return n >= n2;
    }

    private static boolean IIIllIIIIl(int n, int n2) {
        return n <= n2;
    }

    private static boolean IllIlIIIIl(int n) {
        return n != 0;
    }
}

