/*
 * Decompiled with CFR 0.152.
 */
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Main {
    String fileName = IIlIlIllIl[lIlIlIllIl[0]];
    final boolean isDebug = lIlIlIllIl[0];
    FastScanner in = new FastScanner(System.in);
    PrintWriter out = new PrintWriter(System.out);
    final int MOD = lIlIlIllIl[1];
    final long INF = 0x3FFFFFFFFFFFFFFFL;
    private static String[] IIlIlIllIl;
    private static int[] lIlIlIllIl;

    public Main() {
        Main IIIlIIIl;
    }

    void solve() throws Exception {
        Main IIlIIIIl;
        String llIIIIIl = IIlIIIIl.in.nextStr();
        int IlIIIIIl = lIlIlIllIl[2];
        while (Main.llllllIIIlIl(IlIIIIIl, llIIIIIl.length())) {
            if (Main.IIIIIIlIIlIl(llIIIIIl.charAt(IlIIIIIl - lIlIlIllIl[2]), llIIIIIl.charAt(IlIIIIIl))) {
                IIlIIIIl.out.println(IIlIlIllIl[lIlIlIllIl[2]]);
                return;
            }
            ++IlIIIIIl;
            "".length();
            if ((((1 ^ 0x24) << " ".length() ^ (0x38 ^ 0x11)) & (0xC ^ 0x23 ^ (0x28 ^ 0x3B) << (" ".length() << " ".length()) ^ -" ".length())) > -" ".length()) continue;
            return;
        }
        IIlIIIIl.out.println(IIlIlIllIl[lIlIlIllIl[3]]);
    }

    public static void main(String[] stringArray) throws Exception {
        new Main().m();
    }

    void m() throws Exception {
        Main IIIIIIIl;
        IIIIIIIl.solve();
        IIIIIIIl.out.flush();
    }

    static {
        Main.IlllllIIIlIl();
        Main.lIllllIIIlIl();
    }

    private static void lIllllIIIlIl() {
        IIlIlIllIl = new String[lIlIlIllIl[4]];
        Main.IIlIlIllIl[Main.lIlIlIllIl[0]] = Main.IlIlllIIIlIl("uT9KsD3oqvRLYD06y0MvhQ==", "DNvzJ");
        Main.IIlIlIllIl[Main.lIlIlIllIl[2]] = Main.llIlllIIIlIl("GgAR", "Xaufw");
        Main.IIlIlIllIl[Main.lIlIlIllIl[3]] = Main.IIllllIIIlIl("fU+aEKRKoEE=", "dcdUw");
    }

    /*
     * Unable to fully structure code
     */
    private static String llIlllIIIlIl(String IllIlll, String lIlIlll) {
        IllIlll = new String(Base64.getDecoder().decode(IllIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        IIlIlll = new StringBuilder();
        llIIlll = lIlIlll.toCharArray();
        IlIIlll = Main.lIlIlIllIl[0];
        IIIlIll = IllIlll.toCharArray();
        lIIlIll = IIIlIll.length;
        IlIlIll = Main.lIlIlIllIl[0];
        "".length();
        if (((8 ^ 23) << " ".length() & ~((183 ^ 168) << " ".length())) == ((20 ^ 95) & ~(76 ^ 7))) ** GOTO lbl19
        return null;
lbl-1000:
        // 1 sources

        {
            lIIIlll = IIIlIll[IlIlIll];
            IIlIlll.append((char)(lIIIlll ^ llIIlll[IlIIlll % llIIlll.length]));
            "".length();
            ++IlIIlll;
            ++IlIlIll;
lbl19:
            // 2 sources

            ** while (!Main.lIIIIIlIIlIl((int)IlIlIll, (int)lIIlIll))
        }
lbl20:
        // 1 sources

        return String.valueOf(IIlIlll);
    }

    private static String IIllllIIIlIl(String llIIIll, String IlIIIll) {
        try {
            SecretKeySpec lIIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IlIIIll.getBytes(StandardCharsets.UTF_8)), lIlIlIllIl[5]), "DES");
            Cipher IIIIIll = Cipher.getInstance("DES");
            IIIIIll.init(lIlIlIllIl[3], lIIIIll);
            return new String(IIIIIll.doFinal(Base64.getDecoder().decode(llIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllIl) {
            lllllIl.printStackTrace();
            return null;
        }
    }

    private static String IlIlllIIIlIl(String IllIlIl, String lIlIlIl) {
        try {
            SecretKeySpec IIlIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIIlIl = Cipher.getInstance("Blowfish");
            llIIlIl.init(lIlIlIllIl[3], IIlIlIl);
            return new String(llIIlIl.doFinal(Base64.getDecoder().decode(IllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IlIIlIl) {
            IlIIlIl.printStackTrace();
            return null;
        }
    }

    private static void IlllllIIIlIl() {
        lIlIlIllIl = new int[6];
        Main.lIlIlIllIl[0] = (0x7B ^ 0x30) & ~(0x30 ^ 0x7B);
        Main.lIlIlIllIl[1] = (13531898 + 15650256 - 20961208 + 10713579 << (" ".length() << (" ".length() << " ".length()))) + (46593370 + 42103901 - -33349470 + 277197764) - -(61025973 + 6281456 - 52751259 + 87942708) + (3827275 + 1802033 - 5495220 + 0x5B1511 << (0x95 ^ 0x90));
        Main.lIlIlIllIl[2] = " ".length();
        Main.lIlIlIllIl[3] = " ".length() << " ".length();
        Main.lIlIlIllIl[4] = "   ".length();
        Main.lIlIlIllIl[5] = " ".length() << "   ".length();
    }

    private static boolean IIIIIIlIIlIl(int n, int n2) {
        return n == n2;
    }

    private static boolean lIIIIIlIIlIl(int n, int n2) {
        return n >= n2;
    }

    private static boolean llllllIIIlIl(int n, int n2) {
        return n < n2;
    }
}

