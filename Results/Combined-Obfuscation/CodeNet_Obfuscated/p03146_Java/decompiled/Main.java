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
import java.util.HashSet;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Main {
    static int N;
    static final FastScanner sc;
    static PrintWriter writer;
    private static int[] IlIlIIIIIl;

    public Main() {
        Main IllIIIIIlIlll;
    }

    public static void main(String[] stringArray) {
        int llIIIIIIlIlll;
        block4: {
            N = sc.nextInt();
            llIIIIIIlIlll = IlIlIIIIIl[0];
            HashSet<Integer> IlIIIIIIlIlll = new HashSet<Integer>();
            while (true) {
                if (Main.llIlIlIIlll(IlIIIIIIlIlll.contains(N) ? 1 : 0)) {
                    "".length();
                    if (" ".length() << " ".length() <= 0) {
                        return;
                    }
                    break block4;
                }
                IlIIIIIIlIlll.add(N);
                "".length();
                ++llIIIIIIlIlll;
                if (Main.IIllIlIIlll(N % IlIlIIIIIl[1])) {
                    N /= IlIlIIIIIl[1];
                    "".length();
                    if ((((0 ^ 0x39) << " ".length() ^ (0xBD ^ 0xC6)) & ((0x63 ^ 0x3E) << " ".length() ^ 141 + 88 - 200 + 150 ^ -" ".length())) < "   ".length()) continue;
                    return;
                }
                N = IlIlIIIIIl[2] * N + IlIlIIIIIl[0];
                "".length();
                if (" ".length() >= "   ".length()) break;
            }
            return;
        }
        writer.println(llIIIIIIlIlll);
        writer.flush();
    }

    static {
        Main.IlIlIlIIlll();
        sc = new FastScanner(System.in);
        writer = new PrintWriter(System.out);
    }

    private static void IlIlIlIIlll() {
        IlIlIIIIIl = new int[3];
        Main.IlIlIIIIIl[0] = " ".length();
        Main.IlIlIIIIIl[1] = " ".length() << " ".length();
        Main.IlIlIIIIIl[2] = "   ".length();
    }

    private static boolean llIlIlIIlll(int n) {
        return n != 0;
    }

    private static boolean IIllIlIIlll(int n) {
        return n == 0;
    }

    static class FastScanner {
        Reader input;
        private static String[] llIlIIIIIl;
        private static int[] IIllIIIIIl;

        FastScanner() {
            IIllllllIIlll(System.in);
            FastScanner IIllllllIIlll;
        }

        FastScanner(InputStream IIIlllllIIlll) {
            FastScanner lIIlllllIIlll;
            lIIlllllIIlll.input = new BufferedReader(new InputStreamReader(IIIlllllIIlll));
        }

        int nextInt() {
            FastScanner IllIllllIIlll;
            return (int)IllIllllIIlll.nextLong();
        }

        long nextLong() {
            try {
                FastScanner lIIIllllIIlll;
                int IIIIllllIIlll = IIllIIIIIl[0];
                int llllIlllIIlll = lIIIllllIIlll.input.read();
                while ((!FastScanner.IIIIllIIlll(llllIlllIIlll, IIllIIIIIl[1]) || FastScanner.lIIIllIIlll(IIllIIIIIl[2], llllIlllIIlll)) && FastScanner.IlIIllIIlll(llllIlllIIlll, IIllIIIIIl[3]) && FastScanner.IlIIllIIlll(llllIlllIIlll, IIllIIIIIl[4])) {
                    llllIlllIIlll = lIIIllllIIlll.input.read();
                    "".length();
                    if (null == null) continue;
                    return 0L;
                }
                if (FastScanner.llIIllIIlll(llllIlllIIlll, IIllIIIIIl[3])) {
                    IIIIllllIIlll = IIllIIIIIl[5];
                    llllIlllIIlll = lIIIllllIIlll.input.read();
                    "".length();
                    if (-"  ".length() >= 0) {
                        return 0L;
                    }
                } else if (FastScanner.llIIllIIlll(llllIlllIIlll, IIllIIIIIl[4])) {
                    llllIlllIIlll = lIIIllllIIlll.input.read();
                }
                long IlllIlllIIlll = llllIlllIIlll - IIllIIIIIl[1];
                do {
                    if (!FastScanner.IIIIllIIlll(llllIlllIIlll = lIIIllllIIlll.input.read(), IIllIIIIIl[1]) || FastScanner.lIIIllIIlll(IIllIIIIIl[2], llllIlllIIlll)) {
                        return IlllIlllIIlll * (long)IIIIllllIIlll;
                    }
                    IlllIlllIIlll *= 10L;
                    IlllIlllIIlll += (long)(llllIlllIIlll - IIllIIIIIl[1]);
                    "".length();
                } while (-" ".length() == -" ".length());
                return 0L;
            }
            catch (IOException IIIIllllIIlll) {
                IIIIllllIIlll.printStackTrace();
                return -1L;
            }
        }

        double nextDouble() {
            try {
                FastScanner IIIlIlllIIlll;
                double lllIIlllIIlll = 1.0;
                int IllIIlllIIlll = IIIlIlllIIlll.input.read();
                while ((!FastScanner.IIIIllIIlll(IllIIlllIIlll, IIllIIIIIl[1]) || FastScanner.lIIIllIIlll(IIllIIIIIl[2], IllIIlllIIlll)) && FastScanner.IlIIllIIlll(IllIIlllIIlll, IIllIIIIIl[3]) && FastScanner.IlIIllIIlll(IllIIlllIIlll, IIllIIIIIl[4])) {
                    IllIIlllIIlll = IIIlIlllIIlll.input.read();
                    "".length();
                    if (null == null) continue;
                    return 0.0;
                }
                if (FastScanner.llIIllIIlll(IllIIlllIIlll, IIllIIIIIl[3])) {
                    lllIIlllIIlll = -1.0;
                    IllIIlllIIlll = IIIlIlllIIlll.input.read();
                    "".length();
                    if (null != null) {
                        return 0.0;
                    }
                } else if (FastScanner.llIIllIIlll(IllIIlllIIlll, IIllIIIIIl[4])) {
                    IllIIlllIIlll = IIIlIlllIIlll.input.read();
                }
                double lIlIIlllIIlll = IllIIlllIIlll - IIllIIIIIl[1];
                while (FastScanner.IIIIllIIlll(IllIIlllIIlll = IIIlIlllIIlll.input.read(), IIllIIIIIl[1])) {
                    if (FastScanner.lIIIllIIlll(IIllIIIIIl[2], IllIIlllIIlll)) {
                        "".length();
                        if (-" ".length() <= " ".length() << " ".length()) break;
                        return 0.0;
                    }
                    lIlIIlllIIlll *= 10.0;
                    lIlIIlllIIlll += (double)(IllIIlllIIlll - IIllIIIIIl[1]);
                    "".length();
                    if (" ".length() << (" ".length() << " ".length()) != 0) continue;
                    return 0.0;
                }
                if (FastScanner.IlIIllIIlll(IllIIlllIIlll, IIllIIIIIl[6])) {
                    return lllIIlllIIlll * lIlIIlllIIlll;
                }
                double IIlIIlllIIlll = 1.0;
                IllIIlllIIlll = IIIlIlllIIlll.input.read();
                while (FastScanner.IIlIllIIlll(IIllIIIIIl[1], IllIIlllIIlll) && FastScanner.IIlIllIIlll(IllIIlllIIlll, IIllIIIIIl[2])) {
                    lIlIIlllIIlll *= 10.0;
                    lIlIIlllIIlll += (double)(IllIIlllIIlll - IIllIIIIIl[1]);
                    IIlIIlllIIlll *= 10.0;
                    IllIIlllIIlll = IIIlIlllIIlll.input.read();
                    "".length();
                    if ("   ".length() != " ".length()) continue;
                    return 0.0;
                }
                return lllIIlllIIlll * lIlIIlllIIlll / IIlIIlllIIlll;
            }
            catch (IOException lllIIlllIIlll) {
                lllIIlllIIlll.printStackTrace();
                return Double.NaN;
            }
        }

        char nextChar() {
            try {
                FastScanner lIIIIlllIIlll;
                int IIIIIlllIIlll = lIIIIlllIIlll.input.read();
                while (FastScanner.lIlIllIIlll(Character.isWhitespace(IIIIIlllIIlll) ? 1 : 0)) {
                    IIIIIlllIIlll = lIIIIlllIIlll.input.read();
                    "".length();
                    if ((" ".length() << "   ".length() & (" ".length() << "   ".length() ^ -" ".length())) == 0) continue;
                    return (char)(((0x35 ^ 0x64) << " ".length() ^ 137 + 111 - 220 + 155) << " ".length() & (((0x2C ^ 0x23) << "   ".length() ^ (0xE7 ^ 0x8A)) << " ".length() ^ -" ".length()));
                }
                return (char)IIIIIlllIIlll;
            }
            catch (IOException IIIIIlllIIlll) {
                IIIIIlllIIlll.printStackTrace();
                return IIllIIIIIl[7];
            }
        }

        String nextStr() {
            try {
                FastScanner IIlllIllIIlll;
                StringBuilder llIllIllIIlll = new StringBuilder();
                int IlIllIllIIlll = IIlllIllIIlll.input.read();
                while (FastScanner.lIlIllIIlll(Character.isWhitespace(IlIllIllIIlll) ? 1 : 0)) {
                    IlIllIllIIlll = IIlllIllIIlll.input.read();
                    "".length();
                    if (" ".length() << (" ".length() << " ".length()) == " ".length() << (" ".length() << " ".length())) continue;
                    return null;
                }
                while (FastScanner.IlIIllIIlll(IlIllIllIIlll, IIllIIIIIl[5]) && FastScanner.IllIllIIlll(Character.isWhitespace(IlIllIllIIlll) ? 1 : 0)) {
                    llIllIllIIlll.append((char)IlIllIllIIlll);
                    "".length();
                    IlIllIllIIlll = IIlllIllIIlll.input.read();
                    "".length();
                    if (" ".length() > (((0x70 ^ 0x63) << "   ".length() ^ 59 + 124 - 179 + 155) & (0x1F ^ 0x6C ^ (0x8F ^ 0x92) << (" ".length() << " ".length()) ^ -" ".length()))) continue;
                    return null;
                }
                return String.valueOf(llIllIllIIlll);
            }
            catch (IOException llIllIllIIlll) {
                llIllIllIIlll.printStackTrace();
                return llIlIIIIIl[IIllIIIIIl[7]];
            }
        }

        static {
            FastScanner.llllIlIIlll();
            FastScanner.IlllIlIIlll();
        }

        private static void IlllIlIIlll() {
            llIlIIIIIl = new String[IIllIIIIIl[0]];
            FastScanner.llIlIIIIIl[FastScanner.IIllIIIIIl[7]] = FastScanner.lIllIlIIlll("cbISnsMcVLk=", "kgLKH");
        }

        private static String lIllIlIIlll(String lIlIlIllIIlll, String IIlIlIllIIlll) {
            try {
                SecretKeySpec llIIlIllIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IIlIlIllIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                Cipher IlIIlIllIIlll = Cipher.getInstance("Blowfish");
                IlIIlIllIIlll.init(IIllIIIIIl[8], llIIlIllIIlll);
                return new String(IlIIlIllIIlll.doFinal(Base64.getDecoder().decode(lIlIlIllIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lIIIlIllIIlll) {
                lIIIlIllIIlll.printStackTrace();
                return null;
            }
        }

        private static void llllIlIIlll() {
            IIllIIIIIl = new int[9];
            FastScanner.IIllIIIIIl[0] = " ".length();
            FastScanner.IIllIIIIIl[1] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
            FastScanner.IIllIIIIIl[2] = 0x87 ^ 0xBE;
            FastScanner.IIllIIIIIl[3] = (0x87 ^ 0xA2) << " ".length() ^ (0x61 ^ 6);
            FastScanner.IIllIIIIIl[4] = (0xBE ^ 0x95) << " ".length() ^ (2 ^ 0x7F);
            FastScanner.IIllIIIIIl[5] = -" ".length();
            FastScanner.IIllIIIIIl[6] = ((0x85 ^ 0x9C) << (" ".length() << " ".length()) ^ (0x39 ^ 0x4A)) << " ".length();
            FastScanner.IIllIIIIIl[7] = "   ".length() << (" ".length() << " ".length()) & ("   ".length() << (" ".length() << " ".length()) ^ -" ".length());
            FastScanner.IIllIIIIIl[8] = " ".length() << " ".length();
        }

        private static boolean llIIllIIlll(int n, int n2) {
            return n == n2;
        }

        private static boolean IIIIllIIlll(int n, int n2) {
            return n >= n2;
        }

        private static boolean lIIIllIIlll(int n, int n2) {
            return n < n2;
        }

        private static boolean IIlIllIIlll(int n, int n2) {
            return n <= n2;
        }

        private static boolean lIlIllIIlll(int n) {
            return n != 0;
        }

        private static boolean IllIllIIlll(int n) {
            return n == 0;
        }

        private static boolean IlIIllIIlll(int n, int n2) {
            return n != n2;
        }
    }
}

