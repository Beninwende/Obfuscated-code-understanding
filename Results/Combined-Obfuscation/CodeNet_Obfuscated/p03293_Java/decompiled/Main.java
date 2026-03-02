/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Main {
    static String S;
    static String T;
    static final FastScanner sc;
    static PrintWriter writer;
    private static String[] lIIIlIll;
    private static int[] IIlIlIll;

    public Main() {
        Main IIlIIllIlIIIIIl;
    }

    public static void main(String[] stringArray) {
        S = sc.nextStr();
        T = sc.nextStr();
        if (Main.lllIIIllIl(Main.solve() ? 1 : 0)) {
            writer.println(lIIIlIll[IIlIlIll[0]]);
            "".length();
            if (" ".length() >= " ".length() << " ".length()) {
                return;
            }
        } else {
            writer.println(lIIIlIll[IIlIlIll[1]]);
        }
        writer.flush();
    }

    static boolean solve() {
        int lIIIIllIlIIIIIl = IIlIlIll[0];
        while (Main.IIIlIIllIl(lIIIIllIlIIIIIl, S.length())) {
            int IIIIIllIlIIIIIl = Main.match(lIIIIllIlIIIIIl) ? 1 : 0;
            if (Main.lllIIIllIl(IIIIIllIlIIIIIl)) {
                return IIlIlIll[1];
            }
            ++lIIIIllIlIIIIIl;
            "".length();
            if (" ".length() << " ".length() < " ".length() << (" ".length() << " ".length())) continue;
            return ("   ".length() << (" ".length() << (" ".length() << " ".length())) & ~("   ".length() << (" ".length() << (" ".length() << " ".length())))) != 0;
        }
        return IIlIlIll[0];
    }

    static boolean match(int llIllIlIlIIIIIl) {
        int IlIllIlIlIIIIIl = S.length();
        int lIIllIlIlIIIIIl = IIlIlIll[0];
        while (Main.IIIlIIllIl(lIIllIlIlIIIIIl, IlIllIlIlIIIIIl)) {
            int IIIllIlIlIIIIIl = (llIllIlIlIIIIIl + lIIllIlIlIIIIIl) % IlIllIlIlIIIIIl;
            if (Main.lIIlIIllIl(S.charAt(IIIllIlIlIIIIIl), T.charAt(lIIllIlIlIIIIIl))) {
                return IIlIlIll[0];
            }
            ++lIIllIlIlIIIIIl;
            "".length();
            if ((((0xAC ^ 0xA5) << (" ".length() << (" ".length() << " ".length())) ^ 18 + 84 - -40 + 1) & (34 + 130 - 135 + 130 ^ " ".length() << (6 ^ 1) ^ -" ".length())) <= " ".length() << (" ".length() << " ".length())) continue;
            return ("   ".length() & ("   ".length() ^ -" ".length())) != 0;
        }
        return IIlIlIll[1];
    }

    static {
        Main.IllIIIllIl();
        Main.lIlIIIllIl();
        sc = new FastScanner(System.in);
        writer = new PrintWriter(System.out);
    }

    private static void lIlIIIllIl() {
        lIIIlIll = new String[IIlIlIll[2]];
        Main.lIIIlIll[Main.IIlIlIll[0]] = Main.lIIlllIlIl("BYbr2/aceus=", "UoiKI");
        Main.lIIIlIll[Main.IIlIlIll[1]] = Main.IIlIIIllIl("FgQ=", "XkMDm");
    }

    private static String lIIlllIlIl(String llIIlIlIlIIIIIl, String IlIIlIlIlIIIIIl) {
        try {
            SecretKeySpec lIIIlIlIlIIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IlIIlIlIlIIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher IIIIlIlIlIIIIIl = Cipher.getInstance("Blowfish");
            IIIIlIlIlIIIIIl.init(IIlIlIll[2], lIIIlIlIlIIIIIl);
            return new String(IIIIlIlIlIIIIIl.doFinal(Base64.getDecoder().decode(llIIlIlIlIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllIIlIlIIIIIl) {
            llllIIlIlIIIIIl.printStackTrace();
            return null;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static String IIlIIIllIl(String lIIIIIlIlIIIIIl, String IIIIIIlIlIIIIIl) {
        lIIIIIlIlIIIIIl = new String(Base64.getDecoder().decode(lIIIIIlIlIIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        llllllIIlIIIIIl = new StringBuilder();
        IlllllIIlIIIIIl = IIIIIIlIlIIIIIl.toCharArray();
        lIllllIIlIIIIIl = Main.IIlIlIll[0];
        llIIllIIlIIIIIl = lIIIIIlIlIIIIIl.toCharArray();
        IIlIllIIlIIIIIl = llIIllIIlIIIIIl.length;
        lIlIllIIlIIIIIl = Main.IIlIlIll[0];
        "".length();
        if (" ".length() << (" ".length() << " ".length()) >= 0) ** GOTO lbl19
        return null;
lbl-1000:
        // 1 sources

        {
            IIllllIIlIIIIIl = llIIllIIlIIIIIl[lIlIllIIlIIIIIl];
            llllllIIlIIIIIl.append((char)(IIllllIIlIIIIIl ^ IlllllIIlIIIIIl[lIllllIIlIIIIIl % IlllllIIlIIIIIl.length]));
            "".length();
            ++lIllllIIlIIIIIl;
            ++lIlIllIIlIIIIIl;
lbl19:
            // 2 sources

            ** while (!Main.IlIlIIllIl((int)lIlIllIIlIIIIIl, (int)IIlIllIIlIIIIIl))
        }
lbl20:
        // 1 sources

        return String.valueOf(llllllIIlIIIIIl);
    }

    private static void IllIIIllIl() {
        IIlIlIll = new int[3];
        Main.IIlIlIll[0] = ((0xD7 ^ 0x92) << " ".length() ^ 13 + 108 - 106 + 118) << " ".length() & ((0x34 ^ 0x47 ^ (0xA2 ^ 0xBD) << (" ".length() << " ".length())) << " ".length() ^ -" ".length());
        Main.IIlIlIll[1] = " ".length();
        Main.IIlIlIll[2] = " ".length() << " ".length();
    }

    private static boolean IlIlIIllIl(int n, int n2) {
        return n >= n2;
    }

    private static boolean IIIlIIllIl(int n, int n2) {
        return n < n2;
    }

    private static boolean lllIIIllIl(int n) {
        return n != 0;
    }

    private static boolean lIIlIIllIl(int n, int n2) {
        return n != n2;
    }

    static class FastScanner {
        Reader input;
        private static String[] IlIIlIll;
        private static int[] llIIlIll;

        FastScanner() {
            IIIlllIllIIIIIl(System.in);
            FastScanner IIIlllIllIIIIIl;
        }

        FastScanner(InputStream IIlIllIllIIIIIl) {
            FastScanner lIlIllIllIIIIIl;
            lIlIllIllIIIIIl.input = new BufferedReader(new InputStreamReader(IIlIllIllIIIIIl));
        }

        int nextInt() {
            FastScanner IlIIllIllIIIIIl;
            return (int)IlIIllIllIIIIIl.nextLong();
        }

        long nextLong() {
            try {
                FastScanner lIllIlIllIIIIIl;
                int IIllIlIllIIIIIl = llIIlIll[0];
                int llIlIlIllIIIIIl = lIllIlIllIIIIIl.input.read();
                while ((!FastScanner.lIllllIlIl(llIlIlIllIIIIIl, llIIlIll[1]) || FastScanner.IlllllIlIl(llIIlIll[2], llIlIlIllIIIIIl)) && FastScanner.llllllIlIl(llIlIlIllIIIIIl, llIIlIll[3]) && FastScanner.llllllIlIl(llIlIlIllIIIIIl, llIIlIll[4])) {
                    llIlIlIllIIIIIl = lIllIlIllIIIIIl.input.read();
                    "".length();
                    if (" ".length() >= 0) continue;
                    return 0L;
                }
                if (FastScanner.IIIIIIllIl(llIlIlIllIIIIIl, llIIlIll[3])) {
                    IIllIlIllIIIIIl = llIIlIll[5];
                    llIlIlIllIIIIIl = lIllIlIllIIIIIl.input.read();
                    "".length();
                    if (" ".length() << (" ".length() << " ".length()) != " ".length() << (" ".length() << " ".length())) {
                        return 0L;
                    }
                } else if (FastScanner.IIIIIIllIl(llIlIlIllIIIIIl, llIIlIll[4])) {
                    llIlIlIllIIIIIl = lIllIlIllIIIIIl.input.read();
                }
                long IlIlIlIllIIIIIl = llIlIlIllIIIIIl - llIIlIll[1];
                do {
                    if (!FastScanner.lIllllIlIl(llIlIlIllIIIIIl = lIllIlIllIIIIIl.input.read(), llIIlIll[1]) || FastScanner.IlllllIlIl(llIIlIll[2], llIlIlIllIIIIIl)) {
                        return IlIlIlIllIIIIIl * (long)IIllIlIllIIIIIl;
                    }
                    IlIlIlIllIIIIIl *= 10L;
                    IlIlIlIllIIIIIl += (long)(llIlIlIllIIIIIl - llIIlIll[1]);
                    "".length();
                } while (-" ".length() < 0);
                return 0L;
            }
            catch (IOException IIllIlIllIIIIIl) {
                IIllIlIllIIIIIl.printStackTrace();
                return -1L;
            }
        }

        double nextDouble() {
            try {
                FastScanner IIlIIlIllIIIIIl;
                double llIIIlIllIIIIIl = 1.0;
                int IlIIIlIllIIIIIl = IIlIIlIllIIIIIl.input.read();
                while ((!FastScanner.lIllllIlIl(IlIIIlIllIIIIIl, llIIlIll[1]) || FastScanner.IlllllIlIl(llIIlIll[2], IlIIIlIllIIIIIl)) && FastScanner.llllllIlIl(IlIIIlIllIIIIIl, llIIlIll[3]) && FastScanner.llllllIlIl(IlIIIlIllIIIIIl, llIIlIll[4])) {
                    IlIIIlIllIIIIIl = IIlIIlIllIIIIIl.input.read();
                    "".length();
                    if (-" ".length() < 0) continue;
                    return 0.0;
                }
                if (FastScanner.IIIIIIllIl(IlIIIlIllIIIIIl, llIIlIll[3])) {
                    llIIIlIllIIIIIl = -1.0;
                    IlIIIlIllIIIIIl = IIlIIlIllIIIIIl.input.read();
                    "".length();
                    if (" ".length() << (" ".length() << " ".length()) < 0) {
                        return 0.0;
                    }
                } else if (FastScanner.IIIIIIllIl(IlIIIlIllIIIIIl, llIIlIll[4])) {
                    IlIIIlIllIIIIIl = IIlIIlIllIIIIIl.input.read();
                }
                double lIIIIlIllIIIIIl = IlIIIlIllIIIIIl - llIIlIll[1];
                while (FastScanner.lIllllIlIl(IlIIIlIllIIIIIl = IIlIIlIllIIIIIl.input.read(), llIIlIll[1])) {
                    if (FastScanner.IlllllIlIl(llIIlIll[2], IlIIIlIllIIIIIl)) {
                        "".length();
                        if (-" ".length() < 0) break;
                        return 0.0;
                    }
                    lIIIIlIllIIIIIl *= 10.0;
                    lIIIIlIllIIIIIl += (double)(IlIIIlIllIIIIIl - llIIlIll[1]);
                    "".length();
                    if (-"   ".length() < 0) continue;
                    return 0.0;
                }
                if (FastScanner.llllllIlIl(IlIIIlIllIIIIIl, llIIlIll[6])) {
                    return llIIIlIllIIIIIl * lIIIIlIllIIIIIl;
                }
                double IIIIIlIllIIIIIl = 1.0;
                IlIIIlIllIIIIIl = IIlIIlIllIIIIIl.input.read();
                while (FastScanner.lIIIIIllIl(llIIlIll[1], IlIIIlIllIIIIIl) && FastScanner.lIIIIIllIl(IlIIIlIllIIIIIl, llIIlIll[2])) {
                    lIIIIlIllIIIIIl *= 10.0;
                    lIIIIlIllIIIIIl += (double)(IlIIIlIllIIIIIl - llIIlIll[1]);
                    IIIIIlIllIIIIIl *= 10.0;
                    IlIIIlIllIIIIIl = IIlIIlIllIIIIIl.input.read();
                    "".length();
                    if (" ".length() != -" ".length()) continue;
                    return 0.0;
                }
                return llIIIlIllIIIIIl * lIIIIlIllIIIIIl / IIIIIlIllIIIIIl;
            }
            catch (IOException llIIIlIllIIIIIl) {
                llIIIlIllIIIIIl.printStackTrace();
                return Double.NaN;
            }
        }

        char nextChar() {
            try {
                FastScanner lIlllIIllIIIIIl;
                int IIlllIIllIIIIIl = lIlllIIllIIIIIl.input.read();
                while (FastScanner.IlIIIIllIl(Character.isWhitespace(IIlllIIllIIIIIl) ? 1 : 0)) {
                    IIlllIIllIIIIIl = lIlllIIllIIIIIl.input.read();
                    "".length();
                    if (-" ".length() != " ".length() << " ".length()) continue;
                    return (char)((0x6F ^ 0xC ^ (0x4D ^ 0x6E) << " ".length()) << " ".length() & (((0x85 ^ 0x9E) << (" ".length() << " ".length()) ^ (0x3E ^ 0x77)) << " ".length() ^ -" ".length()));
                }
                return (char)IIlllIIllIIIIIl;
            }
            catch (IOException IIlllIIllIIIIIl) {
                IIlllIIllIIIIIl.printStackTrace();
                return llIIlIll[7];
            }
        }

        String nextStr() {
            try {
                FastScanner IIIllIIllIIIIIl;
                StringBuilder lllIlIIllIIIIIl = new StringBuilder();
                int IllIlIIllIIIIIl = IIIllIIllIIIIIl.input.read();
                while (FastScanner.IlIIIIllIl(Character.isWhitespace(IllIlIIllIIIIIl) ? 1 : 0)) {
                    IllIlIIllIIIIIl = IIIllIIllIIIIIl.input.read();
                    "".length();
                    if (null == null) continue;
                    return null;
                }
                while (FastScanner.llllllIlIl(IllIlIIllIIIIIl, llIIlIll[5]) && FastScanner.llIIIIllIl(Character.isWhitespace(IllIlIIllIIIIIl) ? 1 : 0)) {
                    lllIlIIllIIIIIl.append((char)IllIlIIllIIIIIl);
                    "".length();
                    IllIlIIllIIIIIl = IIIllIIllIIIIIl.input.read();
                    "".length();
                    if (-" ".length() < " ".length() << (" ".length() << " ".length())) continue;
                    return null;
                }
                return String.valueOf(lllIlIIllIIIIIl);
            }
            catch (IOException lllIlIIllIIIIIl) {
                lllIlIIllIIIIIl.printStackTrace();
                return IlIIlIll[llIIlIll[7]];
            }
        }

        static {
            FastScanner.IIllllIlIl();
            FastScanner.llIlllIlIl();
        }

        private static void llIlllIlIl() {
            IlIIlIll = new String[llIIlIll[0]];
            FastScanner.IlIIlIll[FastScanner.llIIlIll[7]] = FastScanner.IlIlllIlIl("", "Tfktb");
        }

        /*
         * Unable to fully structure code
         */
        private static String IlIlllIlIl(String IIllIIIllIIIIIl, String llIlIIIllIIIIIl) {
            IIllIIIllIIIIIl = new String(Base64.getDecoder().decode(IIllIIIllIIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            IlIlIIIllIIIIIl = new StringBuilder();
            lIIlIIIllIIIIIl = llIlIIIllIIIIIl.toCharArray();
            IIIlIIIllIIIIIl = FastScanner.llIIlIll[7];
            IllllllIlIIIIIl = IIllIIIllIIIIIl.toCharArray();
            lllllllIlIIIIIl = IllllllIlIIIIIl.length;
            IIIIIIIllIIIIIl = FastScanner.llIIlIll[7];
            "".length();
            if (-(37 + 35 - 65 + 132 ^ (2 ^ 69) << " ".length()) < 0) ** GOTO lbl19
            return null;
lbl-1000:
            // 1 sources

            {
                lllIIIIllIIIIIl = IllllllIlIIIIIl[IIIIIIIllIIIIIl];
                IlIlIIIllIIIIIl.append((char)(lllIIIIllIIIIIl ^ lIIlIIIllIIIIIl[IIIlIIIllIIIIIl % lIIlIIIllIIIIIl.length]));
                "".length();
                ++IIIlIIIllIIIIIl;
                ++IIIIIIIllIIIIIl;
lbl19:
                // 2 sources

                ** while (!FastScanner.lIllllIlIl((int)IIIIIIIllIIIIIl, (int)lllllllIlIIIIIl))
            }
lbl20:
            // 1 sources

            return String.valueOf(IlIlIIIllIIIIIl);
        }

        private static void IIllllIlIl() {
            llIIlIll = new int[8];
            FastScanner.llIIlIll[0] = " ".length();
            FastScanner.llIIlIll[1] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
            FastScanner.llIIlIll[2] = 0x2B ^ 0x3E ^ (0x21 ^ 0x2A) << (" ".length() << " ".length());
            FastScanner.llIIlIll[3] = 0x1C ^ 0x31;
            FastScanner.llIIlIll[4] = 0x7E ^ 0x55;
            FastScanner.llIIlIll[5] = -" ".length();
            FastScanner.llIIlIll[6] = ("   ".length() << " ".length() ^ (0x19 ^ 8)) << " ".length();
            FastScanner.llIIlIll[7] = ((0x68 ^ 0x2F) << " ".length() ^ 54 + 142 - 73 + 76) & (0x76 ^ 0x49 ^ (0xB9 ^ 0x82) << " ".length() ^ -" ".length());
        }

        private static boolean IIIIIIllIl(int n, int n2) {
            return n == n2;
        }

        private static boolean lIllllIlIl(int n, int n2) {
            return n >= n2;
        }

        private static boolean IlllllIlIl(int n, int n2) {
            return n < n2;
        }

        private static boolean lIIIIIllIl(int n, int n2) {
            return n <= n2;
        }

        private static boolean IlIIIIllIl(int n) {
            return n != 0;
        }

        private static boolean llIIIIllIl(int n) {
            return n == 0;
        }

        private static boolean llllllIlIl(int n, int n2) {
            return n != n2;
        }
    }
}

