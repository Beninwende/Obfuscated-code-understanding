/*
 * Decompiled with CFR 0.152.
 */
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Main {
    private static String[] IIlllIlIll;
    private static int[] lllllIlIll;

    public Main() {
        Main IlllIIIIllIlIll;
    }

    public static void main(String[] stringArray) {
        String string;
        FastScanner llIlIIIIllIlIll = new FastScanner();
        String IlIlIIIIllIlIll = llIlIIIIllIlIll.next();
        if (Main.lllIIllIIIll(IlIlIIIIllIlIll.contains(IIlllIlIll[lllllIlIll[0]]) ? 1 : 0)) {
            string = IIlllIlIll[lllllIlIll[1]];
            "".length();
            if (" ".length() << " ".length() < 0) {
                return;
            }
        } else {
            string = IIlllIlIll[lllllIlIll[2]];
        }
        System.out.println(string);
    }

    static {
        Main.IllIIllIIIll();
        Main.lllllIlIIIll();
    }

    private static void lllllIlIIIll() {
        IIlllIlIll = new String[lllllIlIll[3]];
        Main.IIlllIlIll[Main.lllllIlIll[0]] = Main.lllIlIlIIIll("KE5COvhcoNM=", "BgzSM");
        Main.IIlllIlIll[Main.lllllIlIll[1]] = Main.lIlllIlIIIll("ERIn", "HwTtv");
        Main.IIlllIlIll[Main.lllllIlIll[2]] = Main.lllIlIlIIIll("GYL0rwl9ZgU=", "ovMxa");
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String lIlllIlIIIll(String IIIIIIIIllIlIll, String llllllllIlIlIll) {
        IIIIIIIIllIlIll = new String(Base64.getDecoder().decode(IIIIIIIIllIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder IlllllllIlIlIll = new StringBuilder();
        char[] lIllllllIlIlIll = llllllllIlIlIll.toCharArray();
        int IIllllllIlIlIll = lllllIlIll[0];
        char[] IlIIllllIlIlIll = IIIIIIIIllIlIll.toCharArray();
        int llIIllllIlIlIll = IlIIllllIlIlIll.length;
        int IIlIllllIlIlIll = lllllIlIll[0];
        "".length();
        while (!Main.IIIlIllIIIll(IIlIllllIlIlIll, llIIllllIlIlIll)) {
            char llIlllllIlIlIll = IlIIllllIlIlIll[IIlIllllIlIlIll];
            IlllllllIlIlIll.append((char)(llIlllllIlIlIll ^ lIllllllIlIlIll[IIllllllIlIlIll % lIllllllIlIlIll.length]));
            "".length();
            ++IIllllllIlIlIll;
            ++IIlIllllIlIlIll;
        }
        return String.valueOf(IlllllllIlIlIll);
    }

    private static String lllIlIlIIIll(String lIllIlllIlIlIll, String IIllIlllIlIlIll) {
        try {
            SecretKeySpec llIlIlllIlIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IIllIlllIlIlIll.getBytes(StandardCharsets.UTF_8)), lllllIlIll[4]), "DES");
            Cipher IlIlIlllIlIlIll = Cipher.getInstance("DES");
            IlIlIlllIlIlIll.init(lllllIlIll[2], llIlIlllIlIlIll);
            return new String(IlIlIlllIlIlIll.doFinal(Base64.getDecoder().decode(lIllIlllIlIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIlIlllIlIlIll) {
            lIIlIlllIlIlIll.printStackTrace();
            return null;
        }
    }

    private static void IllIIllIIIll() {
        lllllIlIll = new int[5];
        Main.lllllIlIll[0] = ((0x71 ^ 0x20) << " ".length() ^ 114 + 14 - 100 + 145) & (0x2D ^ 0x1A ^ (0x50 ^ 0x57) << "   ".length() ^ -" ".length());
        Main.lllllIlIll[1] = " ".length();
        Main.lllllIlIll[2] = " ".length() << " ".length();
        Main.lllllIlIll[3] = "   ".length();
        Main.lllllIlIll[4] = " ".length() << "   ".length();
    }

    private static boolean IIIlIllIIIll(int n, int n2) {
        return n >= n2;
    }

    private static boolean lllIIllIIIll(int n) {
        return n != 0;
    }
}

