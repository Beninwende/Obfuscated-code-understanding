/*
 * Decompiled with CFR 0.152.
 */
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Scanner;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

class Main {
    private static String[] IllIllIIl;
    private static int[] lllIllIIl;

    Main() {
        Main IIllllllIllIll;
    }

    public static void main(String[] stringArray) {
        Scanner lllIllllIllIll = new Scanner(System.in);
        String IllIllllIllIll = lllIllllIllIll.next();
        long lIlIllllIllIll = lllIllllIllIll.nextLong();
        int IIlIllllIllIll = lllIllIIl[0];
        while (Main.IllllIIIIIl(IIlIllllIllIll, IllIllllIllIll.length())) {
            switch (IllIllllIllIll.charAt(IIlIllllIllIll)) {
                case '1': {
                    if (Main.lllllIIIIIl(Main.lIlllIIIIIl(--lIlIllllIllIll, 0L))) {
                        "".length();
                        if (" ".length() << (" ".length() << " ".length()) != 0) break;
                        return;
                    }
                    Main.println(lllIllIIl[1]);
                    return;
                }
                default: {
                    Main.println(IllIllllIllIll.charAt(IIlIllllIllIll));
                    return;
                }
            }
            ++IIlIllllIllIll;
            "".length();
            if ((" ".length() << ("   ".length() << " ".length()) & ~(" ".length() << ("   ".length() << " ".length()))) == ("   ".length() << (0x2B ^ 0x2E) & ~("   ".length() << (0x15 ^ 0x10)))) continue;
            return;
        }
    }

    public static void print(byte IlIIllllIllIll) {
        byte by;
        System.out.print(by);
        System.out.flush();
    }

    public static void print(boolean IIIIllllIllIll) {
        boolean bl;
        System.out.print(bl);
        System.out.flush();
    }

    public static void print(char IlllIlllIllIll) {
        char c;
        System.out.print(c);
        System.out.flush();
    }

    public static void print(int IIllIlllIllIll) {
        int n;
        System.out.print(n);
        System.out.flush();
    }

    public static void print(long IlIlIlllIllIll) {
        long l;
        System.out.print(l);
        System.out.flush();
    }

    public static void print(float IIIlIlllIllIll) {
        float f;
        System.out.print(f);
        System.out.flush();
    }

    public static void print(double IllIIlllIllIll) {
        double d;
        System.out.print(d);
        System.out.flush();
    }

    public static void print(String IIlIIlllIllIll) {
        String string;
        System.out.print(string);
        System.out.flush();
    }

    /*
     * WARNING - void declaration
     */
    public static void print(Object ... lIlllIllIllIll) {
        void var1_1;
        StringBuilder IIlllIllIllIll = new StringBuilder();
        Object[] llIllIllIllIll = lIlllIllIllIll;
        int IlIllIllIllIll = llIllIllIllIll.length;
        int lIIllIllIllIll = lllIllIIl[0];
        while (Main.IllllIIIIIl(lIIllIllIllIll, IlIllIllIllIll)) {
            Object IIIllIllIllIll = llIllIllIllIll[lIIllIllIllIll];
            if (Main.IIIIIlIIIIl(IIlllIllIllIll.length())) {
                IIlllIllIllIll.append(IllIllIIl[lllIllIIl[0]]);
                "".length();
            }
            if (Main.lIIIIlIIIIl(IIIllIllIllIll)) {
                IIlllIllIllIll.append(IllIllIIl[lllIllIIl[2]]);
                "".length();
                "".length();
                if (" ".length() << (" ".length() << " ".length()) <= "   ".length()) {
                    return;
                }
            } else {
                IIlllIllIllIll.append(IIIllIllIllIll.toString());
                "".length();
            }
            ++lIIllIllIllIll;
            "".length();
            if (-"   ".length() <= 0) continue;
            return;
        }
        System.out.print(String.valueOf(var1_1));
    }

    public static void println() {
        System.out.println();
    }

    public static void println(byte IllIlIllIllIll) {
        byte by;
        System.out.println(by);
        System.out.flush();
    }

    public static void println(boolean IIlIlIllIllIll) {
        boolean bl;
        System.out.println(bl);
        System.out.flush();
    }

    public static void println(char IlIIlIllIllIll) {
        char c;
        System.out.println(c);
        System.out.flush();
    }

    public static void println(int IIIIlIllIllIll) {
        int n;
        System.out.println(n);
        System.out.flush();
    }

    public static void println(long IlllIIllIllIll) {
        long l;
        System.out.println(l);
        System.out.flush();
    }

    public static void println(float IIllIIllIllIll) {
        float f;
        System.out.println(f);
        System.out.flush();
    }

    public static void println(double IlIlIIllIllIll) {
        double d;
        System.out.println(d);
        System.out.flush();
    }

    public static void println(String IIIlIIllIllIll) {
        String string;
        System.out.println(string);
        System.out.flush();
    }

    public static void println(Object ... IllIIIllIllIll) {
        Main.print(IllIIIllIllIll);
        Main.println();
    }

    public static void println(Object IIlIIIllIllIll) {
        if (Main.lIIIIlIIIIl(IIlIIIllIllIll)) {
            System.out.println(IllIllIIl[lllIllIIl[3]]);
            "".length();
            if (" ".length() << (" ".length() << " ".length()) <= 0) {
                return;
            }
        } else if (Main.IIIIIlIIIIl(IIlIIIllIllIll.getClass().isArray() ? 1 : 0)) {
            Main.printArray(IIlIIIllIllIll);
            "".length();
            if (" ".length() << (" ".length() << " ".length()) <= 0) {
                return;
            }
        } else {
            System.out.println(IIlIIIllIllIll.toString());
            System.out.flush();
        }
    }

    public static void printArray(Object IIIlllIlIllIll) {
        block34: {
            block35: {
                block33: {
                    if (!Main.lIIIIlIIIIl(IIIlllIlIllIll)) break block33;
                    System.out.println(IllIllIIl[lllIllIIl[4]]);
                    "".length();
                    if (((0x7D ^ 0x5A) << " ".length() & ~((0xB6 ^ 0x91) << " ".length())) != 0) {
                        return;
                    }
                    break block34;
                }
                String lllIllIlIllIll = IIIlllIlIllIll.getClass().getName();
                if (!Main.IlIIIlIIIIl(lllIllIlIllIll.charAt(lllIllIIl[0]), lllIllIIl[5])) break block35;
                switch (lllIllIlIllIll.charAt(lllIllIIl[2])) {
                    case '[': {
                        System.out.println(IIIlllIlIllIll);
                        "".length();
                        if (null != null) {
                            return;
                        }
                        break block34;
                    }
                    case 'L': {
                        Object[] IllIllIlIllIll = (Object[])IIIlllIlIllIll;
                        int lIlIllIlIllIll = lllIllIIl[0];
                        while (Main.IllllIIIIIl(lIlIllIlIllIll, IllIllIlIllIll.length)) {
                            if (Main.IIIIIlIIIIl(IllIllIlIllIll[lIlIllIlIllIll] instanceof String)) {
                                System.out.println("[" + lIlIllIlIllIll + "] \"" + String.valueOf(IllIllIlIllIll[lIlIllIlIllIll]) + "\"");
                                "".length();
                                if (" ".length() == 0) {
                                    return;
                                }
                            } else {
                                System.out.println("[" + lIlIllIlIllIll + "] " + String.valueOf(IllIllIlIllIll[lIlIllIlIllIll]));
                            }
                            ++lIlIllIlIllIll;
                            "".length();
                            if (" ".length() << (" ".length() << " ".length()) >= " ".length() << " ".length()) continue;
                            return;
                        }
                        "".length();
                        if (" ".length() << (" ".length() << " ".length()) == -" ".length()) {
                            return;
                        }
                        break block34;
                    }
                    case 'Z': {
                        boolean[] lIlIllIlIllIll = (boolean[])IIIlllIlIllIll;
                        int IIlIllIlIllIll = lllIllIIl[0];
                        while (Main.IllllIIIIIl(IIlIllIlIllIll, lIlIllIlIllIll.length)) {
                            System.out.println("[" + IIlIllIlIllIll + "] " + lIlIllIlIllIll[IIlIllIlIllIll]);
                            ++IIlIllIlIllIll;
                            "".length();
                            if (null == null) continue;
                            return;
                        }
                        "".length();
                        if ("   ".length() <= " ".length()) {
                            return;
                        }
                        break block34;
                    }
                    case 'B': {
                        byte[] IIlIllIlIllIll = (byte[])IIIlllIlIllIll;
                        int llIIllIlIllIll = lllIllIIl[0];
                        while (Main.IllllIIIIIl(llIIllIlIllIll, IIlIllIlIllIll.length)) {
                            System.out.println("[" + llIIllIlIllIll + "] " + IIlIllIlIllIll[llIIllIlIllIll]);
                            ++llIIllIlIllIll;
                            "".length();
                            if (" ".length() >= 0) continue;
                            return;
                        }
                        "".length();
                        if (((0xAC ^ 0x99) & ~(0x4A ^ 0x7F)) == " ".length() << " ".length()) {
                            return;
                        }
                        break block34;
                    }
                    case 'C': {
                        char[] llIIllIlIllIll = (char[])IIIlllIlIllIll;
                        int IlIIllIlIllIll = lllIllIIl[0];
                        while (Main.IllllIIIIIl(IlIIllIlIllIll, llIIllIlIllIll.length)) {
                            System.out.println("[" + IlIIllIlIllIll + "] '" + llIIllIlIllIll[IlIIllIlIllIll] + "'");
                            ++IlIIllIlIllIll;
                            "".length();
                            if (" ".length() << (" ".length() << " ".length()) != 0) continue;
                            return;
                        }
                        "".length();
                        if ("   ".length() < " ".length()) {
                            return;
                        }
                        break block34;
                    }
                    case 'I': {
                        int[] IlIIllIlIllIll = (int[])IIIlllIlIllIll;
                        int lIIIllIlIllIll = lllIllIIl[0];
                        while (Main.IllllIIIIIl(lIIIllIlIllIll, IlIIllIlIllIll.length)) {
                            System.out.println("[" + lIIIllIlIllIll + "] " + IlIIllIlIllIll[lIIIllIlIllIll]);
                            ++lIIIllIlIllIll;
                            "".length();
                            if (-" ".length() <= 0) continue;
                            return;
                        }
                        "".length();
                        if ((0x1B ^ 0x1E) <= 0) {
                            return;
                        }
                        break block34;
                    }
                    case 'J': {
                        long[] lIIIllIlIllIll = (long[])IIIlllIlIllIll;
                        int IIIIllIlIllIll = lllIllIIl[0];
                        while (Main.IllllIIIIIl(IIIIllIlIllIll, lIIIllIlIllIll.length)) {
                            System.out.println("[" + IIIIllIlIllIll + "] " + lIIIllIlIllIll[IIIIllIlIllIll]);
                            ++IIIIllIlIllIll;
                            "".length();
                            if (-" ".length() < " ".length() << " ".length()) continue;
                            return;
                        }
                        "".length();
                        if (" ".length() << " ".length() <= 0) {
                            return;
                        }
                        break block34;
                    }
                    case 'F': {
                        float[] IIIIllIlIllIll = (float[])IIIlllIlIllIll;
                        int llllIlIlIllIll = lllIllIIl[0];
                        while (Main.IllllIIIIIl(llllIlIlIllIll, IIIIllIlIllIll.length)) {
                            System.out.println("[" + llllIlIlIllIll + "] " + IIIIllIlIllIll[llllIlIlIllIll]);
                            ++llllIlIlIllIll;
                            "".length();
                            if (" ".length() << (" ".length() << " ".length()) > ((0xBC ^ 0x97) << " ".length() & ~((0x19 ^ 0x32) << " ".length()))) continue;
                            return;
                        }
                        "".length();
                        if (-(0x77 ^ 0x73) > 0) {
                            return;
                        }
                        break block34;
                    }
                    case 'D': {
                        double[] llllIlIlIllIll = (double[])IIIlllIlIllIll;
                        int IlllIlIlIllIll = lllIllIIl[0];
                        while (Main.IllllIIIIIl(IlllIlIlIllIll, llllIlIlIllIll.length)) {
                            System.out.println("[" + IlllIlIlIllIll + "] " + llllIlIlIllIll[IlllIlIlIllIll]);
                            ++IlllIlIlIllIll;
                            "".length();
                            if (-" ".length() <= 0) continue;
                            return;
                        }
                        "".length();
                        if (-" ".length() > "   ".length()) {
                            return;
                        }
                        break block34;
                    }
                    default: {
                        System.out.println(IIIlllIlIllIll);
                        "".length();
                        if (-((0x12 ^ 0x49) << " ".length() ^ 13 + 162 - 169 + 173) >= 0) {
                            return;
                        }
                        break block34;
                    }
                }
            }
            System.out.println(IIIlllIlIllIll);
        }
        System.out.flush();
    }

    static {
        Main.IIlllIIIIIl();
        Main.llIllIIIIIl();
    }

    private static void llIllIIIIIl() {
        IllIllIIl = new String[lllIllIIl[6]];
        Main.IllIllIIl[Main.lllIllIIl[0]] = Main.IIIllIIIIIl("QQ==", "abHoX");
        Main.IllIllIIl[Main.lllIllIIl[2]] = Main.lIIllIIIIIl("vTX3hEtQphg=", "uzZkW");
        Main.IllIllIIl[Main.lllIllIIl[3]] = Main.IlIllIIIIIl("GQR/lfSCyaQ=", "pteGY");
        Main.IllIllIIl[Main.lllIllIIl[4]] = Main.IlIllIIIIIl("zKO3f/5cn7M=", "yMkjb");
    }

    /*
     * Unable to fully structure code
     */
    private static String IIIllIIIIIl(String IIlIIlIlIllIll, String llIIIlIlIllIll) {
        IIlIIlIlIllIll = new String(Base64.getDecoder().decode(IIlIIlIlIllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        IlIIIlIlIllIll = new StringBuilder();
        lIIIIlIlIllIll = llIIIlIlIllIll.toCharArray();
        IIIIIlIlIllIll = Main.lllIllIIl[0];
        IllIlIIlIllIll = IIlIIlIlIllIll.toCharArray();
        lllIlIIlIllIll = IllIlIIlIllIll.length;
        IIIllIIlIllIll = Main.lllIllIIl[0];
        "".length();
        if ("   ".length() > " ".length() << " ".length()) ** GOTO lbl19
        return null;
lbl-1000:
        // 1 sources

        {
            lllllIIlIllIll = IllIlIIlIllIll[IIIllIIlIllIll];
            IlIIIlIlIllIll.append((char)(lllllIIlIllIll ^ lIIIIlIlIllIll[IIIIIlIlIllIll % lIIIIlIlIllIll.length]));
            "".length();
            ++IIIIIlIlIllIll;
            ++IIIllIIlIllIll;
lbl19:
            // 2 sources

            ** while (!Main.llIIIlIIIIl((int)IIIllIIlIllIll, (int)lllIlIIlIllIll))
        }
lbl20:
        // 1 sources

        return String.valueOf(IlIIIlIlIllIll);
    }

    private static String IlIllIIIIIl(String lIIIlIIlIllIll, String IIIIlIIlIllIll) {
        try {
            SecretKeySpec llllIIIlIllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IIIIlIIlIllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher IlllIIIlIllIll = Cipher.getInstance("Blowfish");
            IlllIIIlIllIll.init(lllIllIIl[3], llllIIIlIllIll);
            return new String(IlllIIIlIllIll.doFinal(Base64.getDecoder().decode(lIIIlIIlIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIllIIIlIllIll) {
            lIllIIIlIllIll.printStackTrace();
            return null;
        }
    }

    private static String lIIllIIIIIl(String IIlIIIIlIllIll, String llIIIIIlIllIll) {
        try {
            SecretKeySpec IlIIIIIlIllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIIIIlIllIll.getBytes(StandardCharsets.UTF_8)), lllIllIIl[7]), "DES");
            Cipher lIIIIIIlIllIll = Cipher.getInstance("DES");
            lIIIIIIlIllIll.init(lllIllIIl[3], IlIIIIIlIllIll);
            return new String(lIIIIIIlIllIll.doFinal(Base64.getDecoder().decode(IIlIIIIlIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIIIIIIlIllIll) {
            IIIIIIIlIllIll.printStackTrace();
            return null;
        }
    }

    private static void IIlllIIIIIl() {
        lllIllIIl = new int[8];
        Main.lllIllIIl[0] = (194 + 20 - 58 + 51 ^ "   ".length() << ("   ".length() << " ".length())) << (" ".length() << " ".length()) & (((0xED ^ 0xC0) << " ".length() ^ (0x31 ^ 0x64)) << (" ".length() << " ".length()) ^ -" ".length());
        Main.lllIllIIl[1] = 0x5B ^ 0x6A;
        Main.lllIllIIl[2] = " ".length();
        Main.lllIllIIl[3] = " ".length() << " ".length();
        Main.lllIllIIl[4] = "   ".length();
        Main.lllIllIIl[5] = 0x50 ^ 0x41 ^ (0x90 ^ 0xB5) << " ".length();
        Main.lllIllIIl[6] = " ".length() << (" ".length() << " ".length());
        Main.lllIllIIl[7] = " ".length() << "   ".length();
    }

    private static boolean IlIIIlIIIIl(int n, int n2) {
        return n == n2;
    }

    private static boolean llIIIlIIIIl(int n, int n2) {
        return n >= n2;
    }

    private static boolean IllllIIIIIl(int n, int n2) {
        return n < n2;
    }

    private static boolean lIIIIlIIIIl(Object object) {
        return object == null;
    }

    private static boolean IIIIIlIIIIl(int n) {
        return n != 0;
    }

    private static boolean lllllIIIIIl(int n) {
        return n > 0;
    }

    private static int lIlllIIIIIl(long l, long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }
}

