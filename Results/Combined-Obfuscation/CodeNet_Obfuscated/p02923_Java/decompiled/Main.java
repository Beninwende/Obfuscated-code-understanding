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
    static int[] h;
    static final FastScanner sc;
    static PrintWriter writer;
    private static int[] IIllllll;

    public Main() {
        Main IlIlIIIIlIllll;
    }

    public static void main(String[] stringArray) {
        N = sc.nextInt();
        h = new int[N];
        int IllIIIIIlIllll = IIllllll[0];
        while (Main.lIIllIlIll(IllIIIIIlIllll, N)) {
            Main.h[IllIIIIIlIllll] = sc.nextInt();
            ++IllIIIIIlIllll;
            "".length();
            if (" ".length() << " ".length() >= ((0x8C ^ 0x87) & ~(8 ^ 3))) continue;
            return;
        }
        IllIIIIIlIllll = IIllllll[0];
        int lIlIIIIIlIllll = IIllllll[0];
        int IIlIIIIIlIllll = IIllllll[0];
        while (Main.lIIllIlIll(IIlIIIIIlIllll, N - IIllllll[1])) {
            if (Main.IlIllIlIll(h[IIlIIIIIlIllll], h[IIlIIIIIlIllll + IIllllll[1]])) {
                ++lIlIIIIIlIllll;
                "".length();
                if (-" ".length() < -" ".length()) {
                    return;
                }
            } else {
                IllIIIIIlIllll = Math.max(lIlIIIIIlIllll, IllIIIIIlIllll);
                lIlIIIIIlIllll = IIllllll[0];
            }
            ++IIlIIIIIlIllll;
            "".length();
            if (-"   ".length() < 0) continue;
            return;
        }
        IllIIIIIlIllll = Math.max(lIlIIIIIlIllll, IllIIIIIlIllll);
        writer.println(IllIIIIIlIllll);
        writer.flush();
    }

    static {
        Main.IIIllIlIll();
        sc = new FastScanner(System.in);
        writer = new PrintWriter(System.out);
    }

    private static void IIIllIlIll() {
        IIllllll = new int[2];
        Main.IIllllll[0] = (0xC6 ^ 0xB7 ^ (0x36 ^ 0x39) << (" ".length() << " ".length())) & (0x49 ^ 0x34 ^ "   ".length() << (" ".length() << (" ".length() << " ".length())) ^ -" ".length());
        Main.IIllllll[1] = " ".length();
    }

    private static boolean IlIllIlIll(int n, int n2) {
        return n >= n2;
    }

    private static boolean lIIllIlIll(int n, int n2) {
        return n < n2;
    }

    static class FastScanner {
        Reader input;
        private static String[] lIllllll;
        private static int[] Illlllll;

        FastScanner() {
            IlIlllllIIllll(System.in);
            FastScanner IlIlllllIIllll;
        }

        FastScanner(InputStream IllIllllIIllll) {
            FastScanner lllIllllIIllll;
            lllIllllIIllll.input = new BufferedReader(new InputStreamReader(IllIllllIIllll));
        }

        int nextInt() {
            FastScanner IIlIllllIIllll;
            return (int)IIlIllllIIllll.nextLong();
        }

        long nextLong() {
            try {
                FastScanner llllIlllIIllll;
                int IlllIlllIIllll = Illlllll[0];
                int lIllIlllIIllll = llllIlllIIllll.input.read();
                while ((!FastScanner.IllllIlIll(lIllIlllIIllll, Illlllll[1]) || FastScanner.lllllIlIll(Illlllll[2], lIllIlllIIllll)) && FastScanner.IIIIIllIll(lIllIlllIIllll, Illlllll[3]) && FastScanner.IIIIIllIll(lIllIlllIIllll, Illlllll[4])) {
                    lIllIlllIIllll = llllIlllIIllll.input.read();
                    "".length();
                    if (null == null) continue;
                    return 0L;
                }
                if (FastScanner.lIIIIllIll(lIllIlllIIllll, Illlllll[3])) {
                    IlllIlllIIllll = Illlllll[5];
                    lIllIlllIIllll = llllIlllIIllll.input.read();
                    "".length();
                    if (" ".length() << (" ".length() << " ".length()) != " ".length() << (" ".length() << " ".length())) {
                        return 0L;
                    }
                } else if (FastScanner.lIIIIllIll(lIllIlllIIllll, Illlllll[4])) {
                    lIllIlllIIllll = llllIlllIIllll.input.read();
                }
                long IIllIlllIIllll = lIllIlllIIllll - Illlllll[1];
                do {
                    if (!FastScanner.IllllIlIll(lIllIlllIIllll = llllIlllIIllll.input.read(), Illlllll[1]) || FastScanner.lllllIlIll(Illlllll[2], lIllIlllIIllll)) {
                        return IIllIlllIIllll * (long)IlllIlllIIllll;
                    }
                    IIllIlllIIllll *= 10L;
                    IIllIlllIIllll += (long)(lIllIlllIIllll - Illlllll[1]);
                    "".length();
                } while (" ".length() << " ".length() > 0);
                return 0L;
            }
            catch (IOException IlllIlllIIllll) {
                IlllIlllIIllll.printStackTrace();
                return -1L;
            }
        }

        double nextDouble() {
            try {
                FastScanner IllIIlllIIllll;
                double lIlIIlllIIllll = 1.0;
                int IIlIIlllIIllll = IllIIlllIIllll.input.read();
                while ((!FastScanner.IllllIlIll(IIlIIlllIIllll, Illlllll[1]) || FastScanner.lllllIlIll(Illlllll[2], IIlIIlllIIllll)) && FastScanner.IIIIIllIll(IIlIIlllIIllll, Illlllll[3]) && FastScanner.IIIIIllIll(IIlIIlllIIllll, Illlllll[4])) {
                    IIlIIlllIIllll = IllIIlllIIllll.input.read();
                    "".length();
                    if (-(0x3D ^ 0x54 ^ (0x8C ^ 0x97) << (" ".length() << " ".length())) < 0) continue;
                    return 0.0;
                }
                if (FastScanner.lIIIIllIll(IIlIIlllIIllll, Illlllll[3])) {
                    lIlIIlllIIllll = -1.0;
                    IIlIIlllIIllll = IllIIlllIIllll.input.read();
                    "".length();
                    if (-" ".length() >= 0) {
                        return 0.0;
                    }
                } else if (FastScanner.lIIIIllIll(IIlIIlllIIllll, Illlllll[4])) {
                    IIlIIlllIIllll = IllIIlllIIllll.input.read();
                }
                double llIIIlllIIllll = IIlIIlllIIllll - Illlllll[1];
                while (FastScanner.IllllIlIll(IIlIIlllIIllll = IllIIlllIIllll.input.read(), Illlllll[1])) {
                    if (FastScanner.lllllIlIll(Illlllll[2], IIlIIlllIIllll)) {
                        "".length();
                        if (" ".length() > 0) break;
                        return 0.0;
                    }
                    llIIIlllIIllll *= 10.0;
                    llIIIlllIIllll += (double)(IIlIIlllIIllll - Illlllll[1]);
                    "".length();
                    if (-" ".length() <= " ".length()) continue;
                    return 0.0;
                }
                if (FastScanner.IIIIIllIll(IIlIIlllIIllll, Illlllll[6])) {
                    return lIlIIlllIIllll * llIIIlllIIllll;
                }
                double IlIIIlllIIllll = 1.0;
                IIlIIlllIIllll = IllIIlllIIllll.input.read();
                while (FastScanner.IlIIIllIll(Illlllll[1], IIlIIlllIIllll) && FastScanner.IlIIIllIll(IIlIIlllIIllll, Illlllll[2])) {
                    llIIIlllIIllll *= 10.0;
                    llIIIlllIIllll += (double)(IIlIIlllIIllll - Illlllll[1]);
                    IlIIIlllIIllll *= 10.0;
                    IIlIIlllIIllll = IllIIlllIIllll.input.read();
                    "".length();
                    if ("   ".length() > " ".length()) continue;
                    return 0.0;
                }
                return lIlIIlllIIllll * llIIIlllIIllll / IlIIIlllIIllll;
            }
            catch (IOException lIlIIlllIIllll) {
                lIlIIlllIIllll.printStackTrace();
                return Double.NaN;
            }
        }

        char nextChar() {
            try {
                FastScanner lllllIllIIllll;
                int IllllIllIIllll = lllllIllIIllll.input.read();
                while (FastScanner.llIIIllIll(Character.isWhitespace(IllllIllIIllll) ? 1 : 0)) {
                    IllllIllIIllll = lllllIllIIllll.input.read();
                    "".length();
                    if (-"   ".length() < 0) continue;
                    return (char)((0x32 ^ 0x75) & ~(0xEB ^ 0xAC));
                }
                return (char)IllllIllIIllll;
            }
            catch (IOException IllllIllIIllll) {
                IllllIllIIllll.printStackTrace();
                return Illlllll[7];
            }
        }

        String nextStr() {
            try {
                FastScanner IlIllIllIIllll;
                StringBuilder lIIllIllIIllll = new StringBuilder();
                int IIIllIllIIllll = IlIllIllIIllll.input.read();
                while (FastScanner.llIIIllIll(Character.isWhitespace(IIIllIllIIllll) ? 1 : 0)) {
                    IIIllIllIIllll = IlIllIllIIllll.input.read();
                    "".length();
                    if ("   ".length() >= 0) continue;
                    return null;
                }
                while (FastScanner.IIIIIllIll(IIIllIllIIllll, Illlllll[5]) && FastScanner.IIlIIllIll(Character.isWhitespace(IIIllIllIIllll) ? 1 : 0)) {
                    lIIllIllIIllll.append((char)IIIllIllIIllll);
                    "".length();
                    IIIllIllIIllll = IlIllIllIIllll.input.read();
                    "".length();
                    if ((0x30 ^ 0x35) != 0) continue;
                    return null;
                }
                return String.valueOf(lIIllIllIIllll);
            }
            catch (IOException lIIllIllIIllll) {
                lIIllIllIIllll.printStackTrace();
                return lIllllll[Illlllll[7]];
            }
        }

        static {
            FastScanner.lIlllIlIll();
            FastScanner.IIlllIlIll();
        }

        private static void IIlllIlIll() {
            lIllllll = new String[Illlllll[0]];
            FastScanner.lIllllll[FastScanner.Illlllll[7]] = FastScanner.llIllIlIll("4wLBZGeAkHM=", "EljuQ");
        }

        private static String llIllIlIll(String llIIlIllIIllll, String IlIIlIllIIllll) {
            try {
                SecretKeySpec lIIIlIllIIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IlIIlIllIIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                Cipher IIIIlIllIIllll = Cipher.getInstance("Blowfish");
                IIIIlIllIIllll.init(Illlllll[8], lIIIlIllIIllll);
                return new String(IIIIlIllIIllll.doFinal(Base64.getDecoder().decode(llIIlIllIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllIIllIIllll) {
                llllIIllIIllll.printStackTrace();
                return null;
            }
        }

        private static void lIlllIlIll() {
            Illlllll = new int[9];
            FastScanner.Illlllll[0] = " ".length();
            FastScanner.Illlllll[1] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
            FastScanner.Illlllll[2] = 0xB5 ^ 0x8C;
            FastScanner.Illlllll[3] = 0x7C ^ 0x51;
            FastScanner.Illlllll[4] = 122 + 105 - 174 + 114 ^ (0x94 ^ 0xB7) << (" ".length() << " ".length());
            FastScanner.Illlllll[5] = -" ".length();
            FastScanner.Illlllll[6] = (0x5D ^ 0x4A) << " ".length();
            FastScanner.Illlllll[7] = (0x1D ^ 0xC ^ (0x6F ^ 0x7A) << (" ".length() << " ".length())) & ((0x3D ^ 0x5C) << " ".length() ^ 119 + 123 - 145 + 38 ^ -" ".length());
            FastScanner.Illlllll[8] = " ".length() << " ".length();
        }

        private static boolean lIIIIllIll(int n, int n2) {
            return n == n2;
        }

        private static boolean IllllIlIll(int n, int n2) {
            return n >= n2;
        }

        private static boolean lllllIlIll(int n, int n2) {
            return n < n2;
        }

        private static boolean IlIIIllIll(int n, int n2) {
            return n <= n2;
        }

        private static boolean llIIIllIll(int n) {
            return n != 0;
        }

        private static boolean IIlIIllIll(int n) {
            return n == 0;
        }

        private static boolean IIIIIllIll(int n, int n2) {
            return n != n2;
        }
    }
}

