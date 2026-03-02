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
    private static String[] lllIllll;
    private static int[] IlIlllll;

    public Main() {
        Main llIIIllIlIllll;
    }

    public static void main(String[] stringArray) {
        FastScanner lIlllIlIlIllll = new FastScanner();
        int IIlllIlIlIllll = lIlllIlIlIllll.nextInt();
        Object[] llIllIlIlIllll = new String[IIlllIlIlIllll];
        int IlIllIlIlIllll = IlIlllll[0];
        while (Main.llllIIlIll(IlIllIlIlIllll, IIlllIlIlIllll)) {
            llIllIlIlIllll[IlIllIlIlIllll] = lIlllIlIlIllll.next();
            ++IlIllIlIlIllll;
            "".length();
            if ("   ".length() != 0) continue;
            return;
        }
        IlIllIlIlIllll = IlIlllll[0];
        int lIIllIlIlIllll = IlIlllll[0];
        while (Main.llllIIlIll(lIIllIlIlIllll, IIlllIlIlIllll - IlIlllll[1])) {
            if (Main.IIIIlIlIll(((String)llIllIlIlIllll[lIIllIlIlIllll]).charAt(((String)llIllIlIlIllll[lIIllIlIlIllll]).length() - IlIlllll[1]), ((String)llIllIlIlIllll[lIIllIlIlIllll + IlIlllll[1]]).charAt(IlIlllll[0]))) {
                IlIllIlIlIllll = IlIlllll[1];
            }
            ++lIIllIlIlIllll;
            "".length();
            if (" ".length() << " ".length() == " ".length() << " ".length()) continue;
            return;
        }
        Arrays.sort(llIllIlIlIllll);
        lIIllIlIlIllll = IlIlllll[0];
        while (Main.llllIIlIll(lIIllIlIlIllll, IIlllIlIlIllll - IlIlllll[1])) {
            if (Main.lIIIlIlIll(((String)llIllIlIlIllll[lIIllIlIlIllll]).equals(llIllIlIlIllll[lIIllIlIlIllll + IlIlllll[1]]) ? 1 : 0)) {
                IlIllIlIlIllll = IlIlllll[1];
            }
            ++lIIllIlIlIllll;
            "".length();
            if (null == null) continue;
            return;
        }
        if (Main.lIIIlIlIll(IlIllIlIlIllll)) {
            System.out.println(lllIllll[IlIlllll[0]]);
            "".length();
            if ((((0xB0 ^ 0x87) << (" ".length() << " ".length()) ^ 138 + 18 - 43 + 78) & (182 + 67 - 196 + 162 ^ (0x86 ^ 0xAB) << (" ".length() << " ".length()) ^ -" ".length())) != 0) {
                return;
            }
        } else {
            System.out.println(lllIllll[IlIlllll[1]]);
        }
    }

    /*
     * WARNING - void declaration
     */
    public static long gcd(long lIlIlIlIlIllll, long IIlIlIlIlIllll) {
        void var4_2;
        void var2_1;
        if (Main.llIIlIlIll(Main.IlIIlIlIll(lIlIlIlIlIllll, IIlIlIlIlIllll))) {
            return Main.gcd(IIlIlIlIlIllll, lIlIlIlIlIllll);
        }
        long llIIlIlIlIllll = 0L;
        llIIlIlIlIllll = lIlIlIlIlIllll % IIlIlIlIlIllll;
        if (Main.IIlIlIlIll(Main.IlIIlIlIll(llIIlIlIlIllll, 0L))) {
            return IIlIlIlIlIllll;
        }
        return Main.gcd((long)var2_1, (long)var4_2);
    }

    /*
     * WARNING - void declaration
     */
    public static long lcm(long IIIIlIlIlIllll, long llllIIlIlIllll) {
        long l;
        void var2_1;
        return IIIIlIlIlIllll * var2_1 / Main.gcd(l, (long)var2_1);
    }

    public static boolean isPrime(int IIllIIlIlIllll) {
        if (Main.llllIIlIll(IIllIIlIlIllll, IlIlllll[2])) {
            return IlIlllll[0];
        }
        if (Main.lIlIlIlIll(IIllIIlIlIllll, IlIlllll[2])) {
            return IlIlllll[1];
        }
        if (Main.IIlIlIlIll(IIllIIlIlIllll % IlIlllll[2])) {
            return IlIlllll[0];
        }
        int llIlIIlIlIllll = IlIlllll[3];
        while (Main.IllIlIlIll(llIlIIlIlIllll * llIlIIlIlIllll, IIllIIlIlIllll)) {
            if (Main.IIlIlIlIll(IIllIIlIlIllll % llIlIIlIlIllll)) {
                return IlIlllll[0];
            }
            llIlIIlIlIllll += 2;
            "".length();
            if (" ".length() << " ".length() != 0) continue;
            return (" ".length() << (" ".length() << (" ".length() << " ".length())) & (" ".length() << (" ".length() << (" ".length() << " ".length())) ^ -" ".length())) != 0;
        }
        return IlIlllll[1];
    }

    static {
        Main.IlllIIlIll();
        Main.lIllIIlIll();
    }

    private static void lIllIIlIll() {
        lllIllll = new String[IlIlllll[2]];
        Main.lllIllll[Main.IlIlllll[0]] = Main.llllllIIll("KDw=", "fSXYo");
        Main.lllIllll[Main.IlIlllll[1]] = Main.IIIIIIlIll("/BCVsdCRIVU=", "gIhLc");
    }

    /*
     * Unable to fully structure code
     */
    private static String llllllIIll(String lIIIIIlIlIllll, String IIIIIIlIlIllll) {
        lIIIIIlIlIllll = new String(Base64.getDecoder().decode(lIIIIIlIlIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        llllllIIlIllll = new StringBuilder();
        IlllllIIlIllll = IIIIIIlIlIllll.toCharArray();
        lIllllIIlIllll = Main.IlIlllll[0];
        llIIllIIlIllll = lIIIIIlIlIllll.toCharArray();
        IIlIllIIlIllll = llIIllIIlIllll.length;
        lIlIllIIlIllll = Main.IlIlllll[0];
        "".length();
        if (" ".length() != " ".length() << " ".length()) ** GOTO lbl19
        return null;
lbl-1000:
        // 1 sources

        {
            IIllllIIlIllll = llIIllIIlIllll[lIlIllIIlIllll];
            llllllIIlIllll.append((char)(IIllllIIlIllll ^ IlllllIIlIllll[lIllllIIlIllll % IlllllIIlIllll.length]));
            "".length();
            ++lIllllIIlIllll;
            ++lIlIllIIlIllll;
lbl19:
            // 2 sources

            ** while (!Main.lllIlIlIll((int)lIlIllIIlIllll, (int)IIlIllIIlIllll))
        }
lbl20:
        // 1 sources

        return String.valueOf(llllllIIlIllll);
    }

    private static String IIIIIIlIll(String IlllIlIIlIllll, String lIllIlIIlIllll) {
        try {
            SecretKeySpec IIllIlIIlIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIllIlIIlIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIlIlIIlIllll = Cipher.getInstance("Blowfish");
            llIlIlIIlIllll.init(IlIlllll[2], IIllIlIIlIllll);
            return new String(llIlIlIIlIllll.doFinal(Base64.getDecoder().decode(IlllIlIIlIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IlIlIlIIlIllll) {
            IlIlIlIIlIllll.printStackTrace();
            return null;
        }
    }

    private static void IlllIIlIll() {
        IlIlllll = new int[4];
        Main.IlIlllll[0] = (0x74 ^ 0x17) & ~(0x13 ^ 0x70);
        Main.IlIlllll[1] = " ".length();
        Main.IlIlllll[2] = " ".length() << " ".length();
        Main.IlIlllll[3] = "   ".length();
    }

    private static boolean lIlIlIlIll(int n, int n2) {
        return n == n2;
    }

    private static boolean lllIlIlIll(int n, int n2) {
        return n >= n2;
    }

    private static boolean llllIIlIll(int n, int n2) {
        return n < n2;
    }

    private static boolean IllIlIlIll(int n, int n2) {
        return n <= n2;
    }

    private static boolean lIIIlIlIll(int n) {
        return n != 0;
    }

    private static boolean IIlIlIlIll(int n) {
        return n == 0;
    }

    private static boolean llIIlIlIll(int n) {
        return n < 0;
    }

    private static boolean IIIIlIlIll(int n, int n2) {
        return n != n2;
    }

    private static int IlIIlIlIll(long l, long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }
}

