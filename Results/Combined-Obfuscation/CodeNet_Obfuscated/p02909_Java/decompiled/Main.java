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
    private static String[] lIIllll;
    private static int[] IlIllll;

    Main() {
        Main lIIlllIlllIlIIl;
    }

    public static void main(String[] stringArray) {
        FastScanner IllIllIlllIlIIl = new FastScanner();
        String lIlIllIlllIlIIl = IllIllIlllIlIIl.next();
        if (Main.IIlIIlIll(lIlIllIlllIlIIl.equals(lIIllll[IlIllll[0]]) ? 1 : 0)) {
            Main.p(lIIllll[IlIllll[1]]);
            "".length();
            if (" ".length() << " ".length() >= " ".length() << (" ".length() << " ".length())) {
                return;
            }
        } else if (Main.IIlIIlIll(lIlIllIlllIlIIl.equals(lIIllll[IlIllll[2]]) ? 1 : 0)) {
            Main.p(lIIllll[IlIllll[3]]);
            "".length();
            if (((0xA ^ 0x43) & ~(0x5B ^ 0x12)) < 0) {
                return;
            }
        } else {
            Main.p(lIIllll[IlIllll[4]]);
        }
    }

    /*
     * WARNING - void declaration
     */
    public static String stringCopy(String IlIIllIlllIlIIl) {
        void var1_1;
        StringBuilder lIIIllIlllIlIIl = new StringBuilder();
        lIIIllIlllIlIIl.append(IlIIllIlllIlIIl.toCharArray());
        "".length();
        return String.valueOf(var1_1);
    }

    public static <T> void p(T llllIlIlllIlIIl) {
        System.out.println(llllIlIlllIlIIl);
    }

    public static <T> void pp(T lIllIlIlllIlIIl) {
        System.out.print(lIllIlIlllIlIIl);
    }

    public static int min(int IIIlIlIlllIlIIl, int lllIIlIlllIlIIl, int IllIIlIlllIlIIl) {
        int lIlIIlIlllIlIIl = Math.min(IIIlIlIlllIlIIl, lllIIlIlllIlIIl);
        int n = Math.min(lIlIIlIlllIlIIl, IllIIlIlllIlIIl);
        return n;
    }

    public static int max(int IIIIIlIlllIlIIl, int lllllIIlllIlIIl, int IllllIIlllIlIIl) {
        int lIlllIIlllIlIIl = Math.max(IIIIIlIlllIlIIl, lllllIIlllIlIIl);
        int n = Math.max(lIlllIIlllIlIIl, IllllIIlllIlIIl);
        return n;
    }

    static {
        Main.llIIIlIll();
        Main.IlIIIlIll();
    }

    private static void IlIIIlIll() {
        lIIllll = new String[IlIllll[5]];
        Main.lIIllll[Main.IlIllll[0]] = Main.lllllIIll("rOxrVzo6RcE=", "fuUVK");
        Main.lIIllll[Main.IlIllll[1]] = Main.lllllIIll("NXBpckWryII=", "McnqI");
        Main.lIIllll[Main.IlIllll[2]] = Main.IIIIIlIll("KCEJGQMS", "kMflg");
        Main.lIIllll[Main.IlIllll[3]] = Main.lllllIIll("c6yHCB/lSbo=", "wvclf");
        Main.lIIllll[Main.IlIllll[4]] = Main.lIIIIlIll("1xeA+SC0RA4=", "bmGht");
    }

    private static String lIIIIlIll(String IIIllIIlllIlIIl, String lllIlIIlllIlIIl) {
        try {
            SecretKeySpec IllIlIIlllIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIlIIlllIlIIl.getBytes(StandardCharsets.UTF_8)), IlIllll[6]), "DES");
            Cipher lIlIlIIlllIlIIl = Cipher.getInstance("DES");
            lIlIlIIlllIlIIl.init(IlIllll[2], IllIlIIlllIlIIl);
            return new String(lIlIlIIlllIlIIl.doFinal(Base64.getDecoder().decode(IIIllIIlllIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIlIlIIlllIlIIl) {
            IIlIlIIlllIlIIl.printStackTrace();
            return null;
        }
    }

    private static String lllllIIll(String llIlIIIlllIlIIl, String IlIlIIIlllIlIIl) {
        try {
            SecretKeySpec lIIlIIIlllIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IlIlIIIlllIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher IIIlIIIlllIlIIl = Cipher.getInstance("Blowfish");
            IIIlIIIlllIlIIl.init(IlIllll[2], lIIlIIIlllIlIIl);
            return new String(IIIlIIIlllIlIIl.doFinal(Base64.getDecoder().decode(llIlIIIlllIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIIIIlllIlIIl) {
            lllIIIIlllIlIIl.printStackTrace();
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IIIIIlIll(String lIIllllIllIlIIl, String IIIllllIllIlIIl) {
        lIIllllIllIlIIl = new String(Base64.getDecoder().decode(lIIllllIllIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllIlllIllIlIIl = new StringBuilder();
        char[] IllIlllIllIlIIl = IIIllllIllIlIIl.toCharArray();
        int lIlIlllIllIlIIl = IlIllll[0];
        char[] llIlIllIllIlIIl = lIIllllIllIlIIl.toCharArray();
        int IIllIllIllIlIIl = llIlIllIllIlIIl.length;
        int lIllIllIllIlIIl = IlIllll[0];
        "".length();
        while (!Main.lIlIIlIll(lIllIllIllIlIIl, IIllIllIllIlIIl)) {
            char IIlIlllIllIlIIl = llIlIllIllIlIIl[lIllIllIllIlIIl];
            lllIlllIllIlIIl.append((char)(IIlIlllIllIlIIl ^ IllIlllIllIlIIl[lIlIlllIllIlIIl % IllIlllIllIlIIl.length]));
            "".length();
            ++lIlIlllIllIlIIl;
            ++lIllIllIllIlIIl;
        }
        return String.valueOf(lllIlllIllIlIIl);
    }

    private static void llIIIlIll() {
        IlIllll = new int[7];
        Main.IlIllll[0] = (0xC3 ^ 0xAE ^ (0x97 ^ 0x9C) << "   ".length()) & ((0x1D ^ 0x20) << (" ".length() << " ".length()) ^ 4 + 169 - 44 + 64 ^ -" ".length());
        Main.IlIllll[1] = " ".length();
        Main.IlIllll[2] = " ".length() << " ".length();
        Main.IlIllll[3] = "   ".length();
        Main.IlIllll[4] = " ".length() << (" ".length() << " ".length());
        Main.IlIllll[5] = 122 + 75 - 81 + 39 ^ (0x8A ^ 0xC5) << " ".length();
        Main.IlIllll[6] = " ".length() << "   ".length();
    }

    private static boolean lIlIIlIll(int n, int n2) {
        return n >= n2;
    }

    private static boolean IIlIIlIll(int n) {
        return n != 0;
    }
}

