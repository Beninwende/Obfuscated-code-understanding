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
    static int N;
    static int Y;
    static final FastScanner sc;
    static PrintWriter writer;
    private static String[] IIlIIlIIl;
    private static int[] IllIIlIIl;

    public Main() {
        Main IIllllIlIIIlll;
    }

    public static void main(String[] stringArray) {
        N = sc.nextInt();
        Y = sc.nextInt();
        int IllIllIlIIIlll = Y / IllIIlIIl[0];
        int lIlIllIlIIIlll = IllIIlIIl[1];
        int IIlIllIlIIIlll = IllIIlIIl[1];
        while (Main.IIlIIlllll(IIlIllIlIIIlll, N)) {
            if (Main.lIlIIlllll(lIlIllIlIIIlll)) {
                "".length();
                if ("   ".length() >= 0) break;
                return;
            }
            int llIIllIlIIIlll = IllIIlIIl[1];
            while (Main.IIlIIlllll(llIIllIlIIIlll, N)) {
                if (Main.lIlIIlllll(lIlIllIlIIIlll)) {
                    "".length();
                    if (" ".length() << " ".length() != " ".length() << (" ".length() << " ".length())) break;
                    return;
                }
                int IlIIllIlIIIlll = IllIIlIIl[2] * IIlIllIlIIIlll + IllIIlIIl[3] * llIIllIlIIIlll;
                if (Main.IllIIlllll(IlIIllIlIIIlll, IllIllIlIIIlll - N)) {
                    "".length();
                    if ((0x96 ^ 0x93) <= 0) {
                        return;
                    }
                } else if (Main.lllIIlllll(IIlIllIlIIIlll + llIIllIlIIIlll, N)) {
                    "".length();
                    if (null != null) {
                        return;
                    }
                } else {
                    lIlIllIlIIIlll = IllIIlIIl[4];
                    writer.print(IIlIllIlIIIlll);
                    writer.print(IIlIIlIIl[IllIIlIIl[1]]);
                    writer.print(llIIllIlIIIlll);
                    writer.print(IIlIIlIIl[IllIIlIIl[4]]);
                    writer.println(N - IIlIllIlIIIlll - llIIllIlIIIlll);
                }
                ++llIIllIlIIIlll;
                "".length();
                if (" ".length() != " ".length() << (" ".length() << " ".length())) continue;
                return;
            }
            ++IIlIllIlIIIlll;
            "".length();
            if (" ".length() << (" ".length() << " ".length()) == " ".length() << (" ".length() << " ".length())) continue;
            return;
        }
        if (Main.IIIlIlllll(lIlIllIlIIIlll)) {
            writer.println(IIlIIlIIl[IllIIlIIl[5]]);
        }
        writer.flush();
    }

    static {
        Main.llIIIlllll();
        Main.llIllIllll();
        sc = new FastScanner(System.in);
        writer = new PrintWriter(System.out);
    }

    private static void llIllIllll() {
        IIlIIlIIl = new String[IllIIlIIl[6]];
        Main.IIlIIlIIl[Main.IllIIlIIl[1]] = Main.lllIlIllll("XVJ+cfhoYBw=", "REOCd");
        Main.IIlIIlIIl[Main.IllIIlIIl[4]] = Main.lIIllIllll("dw==", "WrNXH");
        Main.IIlIIlIIl[Main.IllIIlIIl[5]] = Main.lllIlIllll("I186GQBp2ORK5qjAo1O15g==", "KMbUd");
    }

    private static String lllIlIllll(String lIllIlIlIIIlll, String IIllIlIlIIIlll) {
        try {
            SecretKeySpec llIlIlIlIIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IIllIlIlIIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher IlIlIlIlIIIlll = Cipher.getInstance("Blowfish");
            IlIlIlIlIIIlll.init(IllIIlIIl[5], llIlIlIlIIIlll);
            return new String(IlIlIlIlIIIlll.doFinal(Base64.getDecoder().decode(lIllIlIlIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIlIlIlIIIlll) {
            lIIlIlIlIIIlll.printStackTrace();
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String lIIllIllll(String llIllIIlIIIlll, String IlIllIIlIIIlll) {
        llIllIIlIIIlll = new String(Base64.getDecoder().decode(llIllIIlIIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIllIIlIIIlll = new StringBuilder();
        char[] IIIllIIlIIIlll = IlIllIIlIIIlll.toCharArray();
        int lllIlIIlIIIlll = IllIIlIIl[1];
        char[] lIllIIIlIIIlll = llIllIIlIIIlll.toCharArray();
        int IlllIIIlIIIlll = lIllIIIlIIIlll.length;
        int llllIIIlIIIlll = IllIIlIIl[1];
        "".length();
        while (!Main.lIIlIlllll(llllIIIlIIIlll, IlllIIIlIIIlll)) {
            char IllIlIIlIIIlll = lIllIIIlIIIlll[llllIIIlIIIlll];
            lIIllIIlIIIlll.append((char)(IllIlIIlIIIlll ^ IIIllIIlIIIlll[lllIlIIlIIIlll % IIIllIIlIIIlll.length]));
            "".length();
            ++lllIlIIlIIIlll;
            ++llllIIIlIIIlll;
        }
        return String.valueOf(lIIllIIlIIIlll);
    }

    private static void llIIIlllll() {
        IllIIlIIl = new int[7];
        Main.IllIIlIIl[0] = (0x14 ^ 0x69) << "   ".length();
        Main.IllIIlIIl[1] = " ".length() << "   ".length() & (" ".length() << "   ".length() ^ -" ".length());
        Main.IllIIlIIl[2] = 0x69 ^ 0x60;
        Main.IllIIlIIl[3] = " ".length() << (" ".length() << " ".length());
        Main.IllIIlIIl[4] = " ".length();
        Main.IllIIlIIl[5] = " ".length() << " ".length();
        Main.IllIIlIIl[6] = "   ".length();
    }

    private static boolean lIIlIlllll(int n, int n2) {
        return n >= n2;
    }

    private static boolean IIlIIlllll(int n, int n2) {
        return n <= n2;
    }

    private static boolean lllIIlllll(int n, int n2) {
        return n > n2;
    }

    private static boolean lIlIIlllll(int n) {
        return n != 0;
    }

    private static boolean IIIlIlllll(int n) {
        return n == 0;
    }

    private static boolean IllIIlllll(int n, int n2) {
        return n != n2;
    }

    static class FastScanner {
        Reader input;
        private static String[] llIIIlIIl;
        private static int[] lIlIIlIIl;

        FastScanner() {
            lIlIIIIIlIIlll(System.in);
            FastScanner lIlIIIIIlIIlll;
        }

        FastScanner(InputStream lIIIIIIIlIIlll) {
            FastScanner IlIIIIIIlIIlll;
            IlIIIIIIlIIlll.input = new BufferedReader(new InputStreamReader(lIIIIIIIlIIlll));
        }

        int nextInt() {
            FastScanner llllllllIIIlll;
            return (int)llllllllIIIlll.nextLong();
        }

        long nextLong() {
            try {
                FastScanner IlIlllllIIIlll;
                int lIIlllllIIIlll = lIlIIlIIl[0];
                int IIIlllllIIIlll = IlIlllllIIIlll.input.read();
                while ((!FastScanner.IIlllIllll(IIIlllllIIIlll, lIlIIlIIl[1]) || FastScanner.lIlllIllll(lIlIIlIIl[2], IIIlllllIIIlll)) && FastScanner.IllllIllll(IIIlllllIIIlll, lIlIIlIIl[3]) && FastScanner.IllllIllll(IIIlllllIIIlll, lIlIIlIIl[4])) {
                    IIIlllllIIIlll = IlIlllllIIIlll.input.read();
                    "".length();
                    if ((0x2D ^ 0x28) != 0) continue;
                    return 0L;
                }
                if (FastScanner.lllllIllll(IIIlllllIIIlll, lIlIIlIIl[3])) {
                    lIIlllllIIIlll = lIlIIlIIl[5];
                    IIIlllllIIIlll = IlIlllllIIIlll.input.read();
                    "".length();
                    if (((0xD4 ^ 0x9D) & ~(0x60 ^ 0x29)) != 0) {
                        return 0L;
                    }
                } else if (FastScanner.lllllIllll(IIIlllllIIIlll, lIlIIlIIl[4])) {
                    IIIlllllIIIlll = IlIlllllIIIlll.input.read();
                }
                long lllIllllIIIlll = IIIlllllIIIlll - lIlIIlIIl[1];
                do {
                    if (!FastScanner.IIlllIllll(IIIlllllIIIlll = IlIlllllIIIlll.input.read(), lIlIIlIIl[1]) || FastScanner.lIlllIllll(lIlIIlIIl[2], IIIlllllIIIlll)) {
                        return lllIllllIIIlll * (long)lIIlllllIIIlll;
                    }
                    lllIllllIIIlll *= 10L;
                    lllIllllIIIlll += (long)(IIIlllllIIIlll - lIlIIlIIl[1]);
                    "".length();
                } while (" ".length() << " ".length() > " ".length());
                return 0L;
            }
            catch (IOException lIIlllllIIIlll) {
                lIIlllllIIIlll.printStackTrace();
                return -1L;
            }
        }

        double nextDouble() {
            try {
                FastScanner lIIIllllIIIlll;
                double IIIIllllIIIlll = 1.0;
                int llllIlllIIIlll = lIIIllllIIIlll.input.read();
                while ((!FastScanner.IIlllIllll(llllIlllIIIlll, lIlIIlIIl[1]) || FastScanner.lIlllIllll(lIlIIlIIl[2], llllIlllIIIlll)) && FastScanner.IllllIllll(llllIlllIIIlll, lIlIIlIIl[3]) && FastScanner.IllllIllll(llllIlllIIIlll, lIlIIlIIl[4])) {
                    llllIlllIIIlll = lIIIllllIIIlll.input.read();
                    "".length();
                    if ("   ".length() >= " ".length() << " ".length()) continue;
                    return 0.0;
                }
                if (FastScanner.lllllIllll(llllIlllIIIlll, lIlIIlIIl[3])) {
                    IIIIllllIIIlll = -1.0;
                    llllIlllIIIlll = lIIIllllIIIlll.input.read();
                    "".length();
                    if (" ".length() << " ".length() > " ".length() << (" ".length() << " ".length())) {
                        return 0.0;
                    }
                } else if (FastScanner.lllllIllll(llllIlllIIIlll, lIlIIlIIl[4])) {
                    llllIlllIIIlll = lIIIllllIIIlll.input.read();
                }
                double IlllIlllIIIlll = llllIlllIIIlll - lIlIIlIIl[1];
                while (FastScanner.IIlllIllll(llllIlllIIIlll = lIIIllllIIIlll.input.read(), lIlIIlIIl[1])) {
                    if (FastScanner.lIlllIllll(lIlIIlIIl[2], llllIlllIIIlll)) {
                        "".length();
                        if (-" ".length() <= 0) break;
                        return 0.0;
                    }
                    IlllIlllIIIlll *= 10.0;
                    IlllIlllIIIlll += (double)(llllIlllIIIlll - lIlIIlIIl[1]);
                    "".length();
                    if (null == null) continue;
                    return 0.0;
                }
                if (FastScanner.IllllIllll(llllIlllIIIlll, lIlIIlIIl[6])) {
                    return IIIIllllIIIlll * IlllIlllIIIlll;
                }
                double lIllIlllIIIlll = 1.0;
                llllIlllIIIlll = lIIIllllIIIlll.input.read();
                while (FastScanner.IIIIIlllll(lIlIIlIIl[1], llllIlllIIIlll) && FastScanner.IIIIIlllll(llllIlllIIIlll, lIlIIlIIl[2])) {
                    IlllIlllIIIlll *= 10.0;
                    IlllIlllIIIlll += (double)(llllIlllIIIlll - lIlIIlIIl[1]);
                    lIllIlllIIIlll *= 10.0;
                    llllIlllIIIlll = lIIIllllIIIlll.input.read();
                    "".length();
                    if (" ".length() != 0) continue;
                    return 0.0;
                }
                return IIIIllllIIIlll * IlllIlllIIIlll / lIllIlllIIIlll;
            }
            catch (IOException IIIIllllIIIlll) {
                IIIIllllIIIlll.printStackTrace();
                return Double.NaN;
            }
        }

        char nextChar() {
            try {
                FastScanner IlIlIlllIIIlll;
                int lIIlIlllIIIlll = IlIlIlllIIIlll.input.read();
                while (FastScanner.lIIIIlllll(Character.isWhitespace(lIIlIlllIIIlll) ? 1 : 0)) {
                    lIIlIlllIIIlll = IlIlIlllIIIlll.input.read();
                    "".length();
                    if ("   ".length() == "   ".length()) continue;
                    return (char)(" ".length() << (0x4A ^ 0x59 ^ (0xE ^ 5) << " ".length()) & (" ".length() << ((0x9E ^ 0x97) << (" ".length() << " ".length()) ^ (3 ^ 0x22)) ^ -" ".length()));
                }
                return (char)lIIlIlllIIIlll;
            }
            catch (IOException lIIlIlllIIIlll) {
                lIIlIlllIIIlll.printStackTrace();
                return lIlIIlIIl[7];
            }
        }

        String nextStr() {
            try {
                FastScanner lIlIIlllIIIlll;
                StringBuilder IIlIIlllIIIlll = new StringBuilder();
                int llIIIlllIIIlll = lIlIIlllIIIlll.input.read();
                while (FastScanner.lIIIIlllll(Character.isWhitespace(llIIIlllIIIlll) ? 1 : 0)) {
                    llIIIlllIIIlll = lIlIIlllIIIlll.input.read();
                    "".length();
                    if (" ".length() << " ".length() == " ".length() << " ".length()) continue;
                    return null;
                }
                while (FastScanner.IllllIllll(llIIIlllIIIlll, lIlIIlIIl[5]) && FastScanner.IlIIIlllll(Character.isWhitespace(llIIIlllIIIlll) ? 1 : 0)) {
                    IIlIIlllIIIlll.append((char)llIIIlllIIIlll);
                    "".length();
                    llIIIlllIIIlll = lIlIIlllIIIlll.input.read();
                    "".length();
                    if ((((0xE ^ 0x19) << " ".length() ^ (0x5A ^ 0x7F)) & (18 + 25 - -55 + 77 ^ (0x80 ^ 0xA9) << (" ".length() << " ".length()) ^ -" ".length())) <= "   ".length()) continue;
                    return null;
                }
                return String.valueOf(IIlIIlllIIIlll);
            }
            catch (IOException IIlIIlllIIIlll) {
                IIlIIlllIIIlll.printStackTrace();
                return llIIIlIIl[lIlIIlIIl[7]];
            }
        }

        static {
            FastScanner.IlIllIllll();
            FastScanner.IIIllIllll();
        }

        private static void IIIllIllll() {
            llIIIlIIl = new String[lIlIIlIIl[0]];
            FastScanner.llIIIlIIl[FastScanner.lIlIIlIIl[7]] = FastScanner.IllIlIllll("woAaEEjGLPg=", "ArYkJ");
        }

        private static String IllIlIllll(String IllllIllIIIlll, String lIlllIllIIIlll) {
            try {
                SecretKeySpec IIlllIllIIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlllIllIIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                Cipher llIllIllIIIlll = Cipher.getInstance("Blowfish");
                llIllIllIIIlll.init(lIlIIlIIl[8], IIlllIllIIIlll);
                return new String(llIllIllIIIlll.doFinal(Base64.getDecoder().decode(IllllIllIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception IlIllIllIIIlll) {
                IlIllIllIIIlll.printStackTrace();
                return null;
            }
        }

        private static void IlIllIllll() {
            lIlIIlIIl = new int[9];
            FastScanner.lIlIIlIIl[0] = " ".length();
            FastScanner.lIlIIlIIl[1] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
            FastScanner.lIlIIlIIl[2] = 0x5F ^ 0x10 ^ (0xBC ^ 0x87) << " ".length();
            FastScanner.lIlIIlIIl[3] = (0xA9 ^ 0xAC) << (" ".length() << (" ".length() << " ".length())) ^ (0x68 ^ 0x15);
            FastScanner.lIlIIlIIl[4] = 0x21 ^ 0xA;
            FastScanner.lIlIIlIIl[5] = -" ".length();
            FastScanner.lIlIIlIIl[6] = (0x26 ^ 0x31) << " ".length();
            FastScanner.lIlIIlIIl[7] = (59 + 183 - 144 + 97 ^ (0x77 ^ 0x46) << (" ".length() << " ".length())) << " ".length() & (((0x60 ^ 0x69) << (" ".length() << (" ".length() << " ".length())) ^ 79 + 136 - 84 + 20) << " ".length() ^ -" ".length());
            FastScanner.lIlIIlIIl[8] = " ".length() << " ".length();
        }

        private static boolean lllllIllll(int n, int n2) {
            return n == n2;
        }

        private static boolean IIlllIllll(int n, int n2) {
            return n >= n2;
        }

        private static boolean lIlllIllll(int n, int n2) {
            return n < n2;
        }

        private static boolean IIIIIlllll(int n, int n2) {
            return n <= n2;
        }

        private static boolean lIIIIlllll(int n) {
            return n != 0;
        }

        private static boolean IlIIIlllll(int n) {
            return n == 0;
        }

        private static boolean IllllIllll(int n, int n2) {
            return n != n2;
        }
    }
}

