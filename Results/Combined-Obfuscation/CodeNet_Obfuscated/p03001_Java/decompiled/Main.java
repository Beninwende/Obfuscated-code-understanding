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
    String fileName = IIIlllIIl[lIIlllIIl[0]];
    final boolean isDebug = lIIlllIIl[0];
    FastScanner in = new FastScanner(System.in);
    PrintWriter out = new PrintWriter(System.out);
    final int MOD = lIIlllIIl[1];
    final long INF = 0x3FFFFFFFFFFFFFFFL;
    private static String[] IIIlllIIl;
    private static int[] lIIlllIIl;

    public Main() {
        Main IIIlIllIIllIll;
    }

    void solve() throws Exception {
        String string;
        Main IlIIIllIIllIll;
        double lIIIIllIIllIll = IlIIIllIIllIll.in.nextDouble();
        double IIIIIllIIllIll = IlIIIllIIllIll.in.nextDouble();
        int lllllIlIIllIll = IlIIIllIIllIll.in.nextInt();
        int IllllIlIIllIll = IlIIIllIIllIll.in.nextInt();
        PrintWriter printWriter = IlIIIllIIllIll.out;
        double d = lIIIIllIIllIll * IIIIIllIIllIll / 2.0;
        if (Main.lIIlIlIIIIl(Main.IIIlIlIIIIl(lllllIlIIllIll * lIIlllIIl[2], lIIIIllIIllIll)) && Main.lIIlIlIIIIl(Main.IIIlIlIIIIl(IllllIlIIllIll * lIIlllIIl[2], IIIIIllIIllIll))) {
            string = IIIlllIIl[lIIlllIIl[3]];
            "".length();
            if (" ".length() << " ".length() < 0) {
                return;
            }
        } else {
            string = IIIlllIIl[lIIlllIIl[2]];
        }
        printWriter.println(d + " " + string);
    }

    public static void main(String[] stringArray) throws Exception {
        new Main().m();
    }

    void m() throws Exception {
        Main IIlllIlIIllIll;
        IIlllIlIIllIll.solve();
        IIlllIlIIllIll.out.flush();
    }

    static {
        Main.lllIIlIIIIl();
        Main.IllIIlIIIIl();
    }

    private static void IllIIlIIIIl() {
        IIIlllIIl = new String[lIIlllIIl[4]];
        Main.IIIlllIIl[Main.lIIlllIIl[0]] = Main.IIlIIlIIIIl("opLZ5M3XMGyrV9DNxV0W3w==", "EYiig");
        Main.IIIlllIIl[Main.lIIlllIIl[3]] = Main.IIlIIlIIIIl("2QK9+Mts6o4=", "EYeJg");
        Main.IIIlllIIl[Main.lIIlllIIl[2]] = Main.lIlIIlIIIIl("3U9AMT5DDl4=", "umymt");
    }

    private static String lIlIIlIIIIl(String lllIlIlIIllIll, String IllIlIlIIllIll) {
        try {
            SecretKeySpec lIlIlIlIIllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IllIlIlIIllIll.getBytes(StandardCharsets.UTF_8)), lIIlllIIl[5]), "DES");
            Cipher IIlIlIlIIllIll = Cipher.getInstance("DES");
            IIlIlIlIIllIll.init(lIIlllIIl[2], lIlIlIlIIllIll);
            return new String(IIlIlIlIIllIll.doFinal(Base64.getDecoder().decode(lllIlIlIIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIlIlIIllIll) {
            llIIlIlIIllIll.printStackTrace();
            return null;
        }
    }

    private static String IIlIIlIIIIl(String IlIlIIlIIllIll, String lIIlIIlIIllIll) {
        try {
            SecretKeySpec IIIlIIlIIllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIlIIlIIllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllIIIlIIllIll = Cipher.getInstance("Blowfish");
            lllIIIlIIllIll.init(lIIlllIIl[2], IIIlIIlIIllIll);
            return new String(lllIIIlIIllIll.doFinal(Base64.getDecoder().decode(IlIlIIlIIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IllIIIlIIllIll) {
            IllIIIlIIllIll.printStackTrace();
            return null;
        }
    }

    private static void lllIIlIIIIl() {
        lIIlllIIl = new int[6];
        Main.lIIlllIIl[0] = (0x19 ^ 0x30) & ~(0x4A ^ 0x63);
        Main.lIIlllIIl[1] = 413868289 + 70766699 - 390980462 + 906345481;
        Main.lIIlllIIl[2] = " ".length() << " ".length();
        Main.lIIlllIIl[3] = " ".length();
        Main.lIIlllIIl[4] = "   ".length();
        Main.lIIlllIIl[5] = " ".length() << "   ".length();
    }

    private static boolean lIIlIlIIIIl(int n) {
        return n == 0;
    }

    private static int IIIlIlIIIIl(double d, double d2) {
        return d == d2 ? 0 : (d > d2 ? 1 : -1);
    }
}

