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
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Main {
    FastScanner in;
    PrintWriter out;
    int MOD = IlllIIl[0];
    HashMap<Long, Long> map = new HashMap();
    private static int[] IlllIIl;

    public Main() {
        Main llIIlIllIlIIlIl;
    }

    /*
     * WARNING - void declaration
     */
    long ceil(long IIIIlIllIlIIlIl, long llllIIllIlIIlIl) {
        void var3_2;
        return (IIIIlIllIlIIlIl + var3_2 - 1L) / var3_2;
    }

    long gcd(long IlIlIIllIlIIlIl, long lIIlIIllIlIIlIl) {
        long l;
        if (Main.lIllIlll(Main.llIlIlll(lIIlIIllIlIIlIl, 0L))) {
            l = IlIlIIllIlIIlIl;
            "".length();
            if ("   ".length() == " ".length()) {
                return 0L;
            }
        } else {
            Main llIlIIllIlIIlIl;
            l = llIlIIllIlIIlIl.gcd(lIIlIIllIlIIlIl, IlIlIIllIlIIlIl % lIIlIIllIlIIlIl);
        }
        return l;
    }

    /*
     * WARNING - void declaration
     */
    long lcm(long IIlIIIllIlIIlIl, long llIIIIllIlIIlIl) {
        void var3_2;
        void var1_1;
        return IIlIIIllIlIIlIl / this.gcd((long)var1_1, (long)var3_2) * var3_2;
    }

    void solve() {
        Main IIIIIIllIlIIlIl;
        long llllllIlIlIIlIl = IIIIIIllIlIIlIl.in.nextLong();
        IIIIIIllIlIIlIl.map.put(1L, 1L);
        "".length();
        IIIIIIllIlIIlIl.out.println(IIIIIIllIlIIlIl.dfs(llllllIlIlIIlIl));
    }

    /*
     * WARNING - void declaration
     */
    long dfs(long IlIlllIlIlIIlIl) {
        void var3_2;
        Main llIlllIlIlIIlIl;
        if (Main.IlllIlll(llIlllIlIlIIlIl.map.containsKey(IlIlllIlIlIIlIl) ? 1 : 0)) {
            return llIlllIlIlIIlIl.map.get(IlIlllIlIlIIlIl);
        }
        long lIIlllIlIlIIlIl = llIlllIlIlIIlIl.dfs(IlIlllIlIlIIlIl / 2L) * 2L + 1L;
        llIlllIlIlIIlIl.map.put(IlIlllIlIlIIlIl, lIIlllIlIlIIlIl);
        "".length();
        return (long)var3_2;
    }

    public static void main(String[] stringArray) {
        new Main().m();
    }

    private void m() {
        Main lllIllIlIlIIlIl;
        lllIllIlIlIIlIl.in = new FastScanner(System.in);
        lllIllIlIlIIlIl.out = new PrintWriter(System.out);
        lllIllIlIlIIlIl.solve();
        lllIllIlIlIIlIl.out.flush();
        lllIllIlIlIIlIl.in.close();
        lllIllIlIlIIlIl.out.close();
    }

    static {
        Main.lIIlIlll();
    }

    private static void lIIlIlll() {
        IlllIIl = new int[1];
        Main.IlllIIl[0] = 137864086 + 28872556 - 3528855 + 205420926 + (312863821 + 429144391 - 423568319 + 179201752) - (83269804 + 2459848 - -22364339 + 106068242 << " ".length()) + (273131731 + 420003032 - 438705521 + 307624873);
    }

    private static boolean IlllIlll(int n) {
        return n != 0;
    }

    private static boolean lIllIlll(int n) {
        return n == 0;
    }

    private static int llIlIlll(long l, long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    static class FastScanner {
        private Reader input;
        private static String[] lIllIIl;
        private static int[] llllIIl;

        public FastScanner() {
            lIIIllIlIlIIlIl(System.in);
            FastScanner lIIIllIlIlIIlIl;
        }

        /*
         * WARNING - void declaration
         */
        public FastScanner(InputStream lIllIlIlIlIIlIl) {
            void var1_1;
            FastScanner IlllIlIlIlIIlIl;
            this.input = new BufferedReader(new InputStreamReader((InputStream)var1_1));
        }

        public void close() {
            try {
                FastScanner IlIlIlIlIlIIlIl;
                IlIlIlIlIlIIlIl.input.close();
                "".length();
            }
            catch (IOException lIIlIlIlIlIIlIl) {
                lIIlIlIlIlIIlIl.printStackTrace();
            }
            if (((0xA9 ^ 0xA0) << (" ".length() << " ".length()) & ~((0x57 ^ 0x5E) << (" ".length() << " ".length()))) != 0) {
                return;
            }
        }

        public int nextInt() {
            FastScanner lllIIlIlIlIIlIl;
            return (int)lllIIlIlIlIIlIl.nextLong();
        }

        public long nextLong() {
            try {
                FastScanner IlIIIlIlIlIIlIl;
                int lIIIIlIlIlIIlIl = llllIIl[0];
                int IIIIIlIlIlIIlIl = IlIIIlIlIlIIlIl.input.read();
                while ((!FastScanner.IIIIllll(IIIIIlIlIlIIlIl, llllIIl[1]) || FastScanner.lIIIllll(llllIIl[2], IIIIIlIlIlIIlIl)) && FastScanner.IlIIllll(IIIIIlIlIlIIlIl, llllIIl[3]) && FastScanner.IlIIllll(IIIIIlIlIlIIlIl, llllIIl[4])) {
                    IIIIIlIlIlIIlIl = IlIIIlIlIlIIlIl.input.read();
                    "".length();
                    if (null == null) continue;
                    return 0L;
                }
                if (FastScanner.llIIllll(IIIIIlIlIlIIlIl, llllIIl[3])) {
                    lIIIIlIlIlIIlIl = llllIIl[5];
                    IIIIIlIlIlIIlIl = IlIIIlIlIlIIlIl.input.read();
                    "".length();
                    if (" ".length() << " ".length() <= 0) {
                        return 0L;
                    }
                } else if (FastScanner.llIIllll(IIIIIlIlIlIIlIl, llllIIl[4])) {
                    IIIIIlIlIlIIlIl = IlIIIlIlIlIIlIl.input.read();
                }
                long lllllIIlIlIIlIl = IIIIIlIlIlIIlIl - llllIIl[1];
                do {
                    if (!FastScanner.IIIIllll(IIIIIlIlIlIIlIl = IlIIIlIlIlIIlIl.input.read(), llllIIl[1]) || FastScanner.lIIIllll(llllIIl[2], IIIIIlIlIlIIlIl)) {
                        return lllllIIlIlIIlIl * (long)lIIIIlIlIlIIlIl;
                    }
                    lllllIIlIlIIlIl *= 10L;
                    lllllIIlIlIIlIl += (long)(IIIIIlIlIlIIlIl - llllIIl[1]);
                    "".length();
                } while (" ".length() << " ".length() == " ".length() << " ".length());
                return 0L;
            }
            catch (IOException lIIIIlIlIlIIlIl) {
                lIIIIlIlIlIIlIl.printStackTrace();
                return -1L;
            }
        }

        public double nextDouble() {
            try {
                FastScanner lIIllIIlIlIIlIl;
                double IIIllIIlIlIIlIl = 1.0;
                int lllIlIIlIlIIlIl = lIIllIIlIlIIlIl.input.read();
                while ((!FastScanner.IIIIllll(lllIlIIlIlIIlIl, llllIIl[1]) || FastScanner.lIIIllll(llllIIl[2], lllIlIIlIlIIlIl)) && FastScanner.IlIIllll(lllIlIIlIlIIlIl, llllIIl[3]) && FastScanner.IlIIllll(lllIlIIlIlIIlIl, llllIIl[4])) {
                    lllIlIIlIlIIlIl = lIIllIIlIlIIlIl.input.read();
                    "".length();
                    if (("   ".length() << (" ".length() << (" ".length() << " ".length())) & ("   ".length() << (" ".length() << (" ".length() << " ".length())) ^ -" ".length())) < " ".length()) continue;
                    return 0.0;
                }
                if (FastScanner.llIIllll(lllIlIIlIlIIlIl, llllIIl[3])) {
                    IIIllIIlIlIIlIl = -1.0;
                    lllIlIIlIlIIlIl = lIIllIIlIlIIlIl.input.read();
                    "".length();
                    if (" ".length() << (" ".length() << " ".length()) == " ".length()) {
                        return 0.0;
                    }
                } else if (FastScanner.llIIllll(lllIlIIlIlIIlIl, llllIIl[4])) {
                    lllIlIIlIlIIlIl = lIIllIIlIlIIlIl.input.read();
                }
                double IllIlIIlIlIIlIl = lllIlIIlIlIIlIl - llllIIl[1];
                while (FastScanner.IIIIllll(lllIlIIlIlIIlIl = lIIllIIlIlIIlIl.input.read(), llllIIl[1])) {
                    if (FastScanner.lIIIllll(llllIIl[2], lllIlIIlIlIIlIl)) {
                        "".length();
                        if (" ".length() << (" ".length() << " ".length()) != 0) break;
                        return 0.0;
                    }
                    IllIlIIlIlIIlIl *= 10.0;
                    IllIlIIlIlIIlIl += (double)(lllIlIIlIlIIlIl - llllIIl[1]);
                    "".length();
                    if (-"   ".length() <= 0) continue;
                    return 0.0;
                }
                if (FastScanner.IlIIllll(lllIlIIlIlIIlIl, llllIIl[6])) {
                    return IIIllIIlIlIIlIl * IllIlIIlIlIIlIl;
                }
                double lIlIlIIlIlIIlIl = 1.0;
                lllIlIIlIlIIlIl = lIIllIIlIlIIlIl.input.read();
                while (FastScanner.IIlIllll(llllIIl[1], lllIlIIlIlIIlIl) && FastScanner.IIlIllll(lllIlIIlIlIIlIl, llllIIl[2])) {
                    IllIlIIlIlIIlIl *= 10.0;
                    IllIlIIlIlIIlIl += (double)(lllIlIIlIlIIlIl - llllIIl[1]);
                    lIlIlIIlIlIIlIl *= 10.0;
                    lllIlIIlIlIIlIl = lIIllIIlIlIIlIl.input.read();
                    "".length();
                    if ((" ".length() << (" ".length() << " ".length()) & ~(" ".length() << (" ".length() << " ".length()))) != " ".length() << " ".length()) continue;
                    return 0.0;
                }
                return IIIllIIlIlIIlIl * IllIlIIlIlIIlIl / lIlIlIIlIlIIlIl;
            }
            catch (IOException IIIllIIlIlIIlIl) {
                IIIllIIlIlIIlIl.printStackTrace();
                return Double.NaN;
            }
        }

        public char nextChar() {
            try {
                FastScanner IlIIlIIlIlIIlIl;
                int lIIIlIIlIlIIlIl = IlIIlIIlIlIIlIl.input.read();
                while (FastScanner.lIlIllll(Character.isWhitespace(lIIIlIIlIlIIlIl) ? 1 : 0)) {
                    lIIIlIIlIlIIlIl = IlIIlIIlIlIIlIl.input.read();
                    "".length();
                    if (null == null) continue;
                    return (char)((0x7D ^ 0xE ^ (0x9E ^ 0xA3) << " ".length()) & ((0xA3 ^ 0xA6) << (0xC3 ^ 0xC6) ^ 25 + 96 - 65 + 113 ^ -" ".length()));
                }
                return (char)lIIIlIIlIlIIlIl;
            }
            catch (IOException lIIIlIIlIlIIlIl) {
                lIIIlIIlIlIIlIl.printStackTrace();
                return llllIIl[7];
            }
        }

        public String nextStr() {
            try {
                FastScanner lIllIIIlIlIIlIl;
                StringBuilder IIllIIIlIlIIlIl = new StringBuilder();
                int llIlIIIlIlIIlIl = lIllIIIlIlIIlIl.input.read();
                while (FastScanner.lIlIllll(Character.isWhitespace(llIlIIIlIlIIlIl) ? 1 : 0)) {
                    llIlIIIlIlIIlIl = lIllIIIlIlIIlIl.input.read();
                    "".length();
                    if ("   ".length() >= 0) continue;
                    return null;
                }
                while (FastScanner.IlIIllll(llIlIIIlIlIIlIl, llllIIl[5]) && FastScanner.IllIllll(Character.isWhitespace(llIlIIIlIlIIlIl) ? 1 : 0)) {
                    IIllIIIlIlIIlIl.append((char)llIlIIIlIlIIlIl);
                    "".length();
                    llIlIIIlIlIIlIl = lIllIIIlIlIIlIl.input.read();
                    "".length();
                    if (" ".length() << (" ".length() << " ".length()) != 0) continue;
                    return null;
                }
                return String.valueOf(IIllIIIlIlIIlIl);
            }
            catch (IOException IIllIIIlIlIIlIl) {
                IIllIIIlIlIIlIl.printStackTrace();
                return lIllIIl[llllIIl[7]];
            }
        }

        public String nextLine() {
            try {
                FastScanner lllIIIIlIlIIlIl;
                StringBuilder IllIIIIlIlIIlIl = new StringBuilder();
                int lIlIIIIlIlIIlIl = lllIIIIlIlIIlIl.input.read();
                while (FastScanner.IlIIllll(lIlIIIIlIlIIlIl, llllIIl[5]) && FastScanner.IlIIllll(lIlIIIIlIlIIlIl, llllIIl[8])) {
                    IllIIIIlIlIIlIl.append((char)lIlIIIIlIlIIlIl);
                    "".length();
                    lIlIIIIlIlIIlIl = lllIIIIlIlIIlIl.input.read();
                    "".length();
                    if (-" ".length() <= " ".length() << (" ".length() << " ".length())) continue;
                    return null;
                }
                return String.valueOf(IllIIIIlIlIIlIl);
            }
            catch (IOException IllIIIIlIlIIlIl) {
                IllIIIIlIlIIlIl.printStackTrace();
                return lIllIIl[llllIIl[0]];
            }
        }

        /*
         * WARNING - void declaration
         */
        public int[] nextIntArray(int lllllllIIlIIlIl) {
            void var2_2;
            int[] IllllllIIlIIlIl = new int[lllllllIIlIIlIl];
            int lIlllllIIlIIlIl = llllIIl[7];
            while (FastScanner.lIIIllll(lIlllllIIlIIlIl, lllllllIIlIIlIl)) {
                FastScanner IIIIIIIlIlIIlIl;
                IllllllIIlIIlIl[lIlllllIIlIIlIl] = IIIIIIIlIlIIlIl.nextInt();
                ++lIlllllIIlIIlIl;
                "".length();
                if (" ".length() > 0) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        public int[] nextIntArrayDec(int lllIlllIIlIIlIl) {
            void var2_2;
            int[] IllIlllIIlIIlIl = new int[lllIlllIIlIIlIl];
            int lIlIlllIIlIIlIl = llllIIl[7];
            while (FastScanner.lIIIllll(lIlIlllIIlIIlIl, lllIlllIIlIIlIl)) {
                FastScanner IIIllllIIlIIlIl;
                IllIlllIIlIIlIl[lIlIlllIIlIIlIl] = IIIllllIIlIIlIl.nextInt() - llllIIl[0];
                ++lIlIlllIIlIIlIl;
                "".length();
                if (" ".length() < "   ".length()) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        public int[] nextIntArray1Index(int llllIllIIlIIlIl) {
            void var2_2;
            int[] IlllIllIIlIIlIl = new int[llllIllIIlIIlIl + llllIIl[0]];
            int lIllIllIIlIIlIl = llllIIl[7];
            while (FastScanner.lIIIllll(lIllIllIIlIIlIl, llllIllIIlIIlIl)) {
                FastScanner IIIIlllIIlIIlIl;
                IlllIllIIlIIlIl[lIllIllIIlIIlIl + FastScanner.llllIIl[0]] = IIIIlllIIlIIlIl.nextInt();
                ++lIllIllIIlIIlIl;
                "".length();
                if (" ".length() < " ".length() << " ".length()) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        public long[] nextLongArray(int lllIIllIIlIIlIl) {
            void var2_2;
            long[] IllIIllIIlIIlIl = new long[lllIIllIIlIIlIl];
            int lIlIIllIIlIIlIl = llllIIl[7];
            while (FastScanner.lIIIllll(lIlIIllIIlIIlIl, lllIIllIIlIIlIl)) {
                FastScanner IIIlIllIIlIIlIl;
                IllIIllIIlIIlIl[lIlIIllIIlIIlIl] = IIIlIllIIlIIlIl.nextLong();
                ++lIlIIllIIlIIlIl;
                "".length();
                if ((((0x53 ^ 0x14) << " ".length() ^ 98 + 39 - 44 + 66) << " ".length() & (((0x72 ^ 0x4D) << " ".length() ^ (0xFA ^ 0x95)) << " ".length() ^ -" ".length())) == 0) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        public long[] nextLongArrayDec(int lllllIlIIlIIlIl) {
            void var2_2;
            long[] IllllIlIIlIIlIl = new long[lllllIlIIlIIlIl];
            int lIlllIlIIlIIlIl = llllIIl[7];
            while (FastScanner.lIIIllll(lIlllIlIIlIIlIl, lllllIlIIlIIlIl)) {
                FastScanner IIIIIllIIlIIlIl;
                IllllIlIIlIIlIl[lIlllIlIIlIIlIl] = IIIIIllIIlIIlIl.nextLong() - 1L;
                ++lIlllIlIIlIIlIl;
                "".length();
                if (-" ".length() <= -" ".length()) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        public long[] nextLongArray1Index(int lllIlIlIIlIIlIl) {
            void var2_2;
            long[] IllIlIlIIlIIlIl = new long[lllIlIlIIlIIlIl + llllIIl[0]];
            int lIlIlIlIIlIIlIl = llllIIl[7];
            while (FastScanner.lIIIllll(lIlIlIlIIlIIlIl, lllIlIlIIlIIlIl)) {
                FastScanner IIIllIlIIlIIlIl;
                IllIlIlIIlIIlIl[lIlIlIlIIlIIlIl + FastScanner.llllIIl[0]] = IIIllIlIIlIIlIl.nextLong();
                ++lIlIlIlIIlIIlIl;
                "".length();
                if (" ".length() << (" ".length() << " ".length()) > " ".length() << " ".length()) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        public double[] nextDoubleArray(int llllIIlIIlIIlIl) {
            void var2_2;
            double[] IlllIIlIIlIIlIl = new double[llllIIlIIlIIlIl];
            int lIllIIlIIlIIlIl = llllIIl[7];
            while (FastScanner.lIIIllll(lIllIIlIIlIIlIl, llllIIlIIlIIlIl)) {
                FastScanner IIIIlIlIIlIIlIl;
                IlllIIlIIlIIlIl[lIllIIlIIlIIlIl] = IIIIlIlIIlIIlIl.nextDouble();
                ++lIllIIlIIlIIlIl;
                "".length();
                if (-(0x49 ^ 0x4C) < 0) continue;
                return null;
            }
            return var2_2;
        }

        static {
            FastScanner.llllIlll();
            FastScanner.IIllIlll();
        }

        private static void IIllIlll() {
            lIllIIl = new String[llllIIl[9]];
            FastScanner.lIllIIl[FastScanner.llllIIl[7]] = FastScanner.IIIlIlll("eyal2b7VIbc=", "wacBD");
            FastScanner.lIllIIl[FastScanner.llllIIl[0]] = FastScanner.IlIlIlll("", "oZzir");
        }

        private static String IIIlIlll(String IIIlIIlIIlIIlIl, String lllIIIlIIlIIlIl) {
            try {
                SecretKeySpec IllIIIlIIlIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIIIlIIlIIlIl.getBytes(StandardCharsets.UTF_8)), llllIIl[10]), "DES");
                Cipher lIlIIIlIIlIIlIl = Cipher.getInstance("DES");
                lIlIIIlIIlIIlIl.init(llllIIl[9], IllIIIlIIlIIlIl);
                return new String(lIlIIIlIIlIIlIl.doFinal(Base64.getDecoder().decode(IIIlIIlIIlIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception IIlIIIlIIlIIlIl) {
                IIlIIIlIIlIIlIl.printStackTrace();
                return null;
            }
        }

        /*
         * Unable to fully structure code
         */
        private static String IlIlIlll(String IllIllIIIlIIlIl, String lIlIllIIIlIIlIl) {
            IllIllIIIlIIlIl = new String(Base64.getDecoder().decode(IllIllIIIlIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            IIlIllIIIlIIlIl = new StringBuilder();
            llIIllIIIlIIlIl = lIlIllIIIlIIlIl.toCharArray();
            IlIIllIIIlIIlIl = FastScanner.llllIIl[7];
            IIIlIlIIIlIIlIl = IllIllIIIlIIlIl.toCharArray();
            lIIlIlIIIlIIlIl = IIIlIlIIIlIIlIl.length;
            IlIlIlIIIlIIlIl = FastScanner.llllIIl[7];
            "".length();
            if ((((105 ^ 6) << " ".length() ^ 163 + 152 - 267 + 151) & ((15 ^ 80) << " ".length() ^ 103 + 144 - 175 + 95 ^ -" ".length())) >= 0) ** GOTO lbl19
            return null;
lbl-1000:
            // 1 sources

            {
                lIIIllIIIlIIlIl = IIIlIlIIIlIIlIl[IlIlIlIIIlIIlIl];
                IIlIllIIIlIIlIl.append((char)(lIIIllIIIlIIlIl ^ llIIllIIIlIIlIl[IlIIllIIIlIIlIl % llIIllIIIlIIlIl.length]));
                "".length();
                ++IlIIllIIIlIIlIl;
                ++IlIlIlIIIlIIlIl;
lbl19:
                // 2 sources

                ** while (!FastScanner.IIIIllll((int)IlIlIlIIIlIIlIl, (int)lIIlIlIIIlIIlIl))
            }
lbl20:
            // 1 sources

            return String.valueOf(IIlIllIIIlIIlIl);
        }

        private static void llllIlll() {
            llllIIl = new int[11];
            FastScanner.llllIIl[0] = " ".length();
            FastScanner.llllIIl[1] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
            FastScanner.llllIIl[2] = 111 + 0 - 105 + 125 ^ (0x51 ^ 0xC) << " ".length();
            FastScanner.llllIIl[3] = 0x5C ^ 0x25 ^ (0xC ^ 0x19) << (" ".length() << " ".length());
            FastScanner.llllIIl[4] = 0xB ^ 0x20;
            FastScanner.llllIIl[5] = -" ".length();
            FastScanner.llllIIl[6] = ((0x37 ^ 0x2E) << (" ".length() << " ".length()) ^ (0xEC ^ 0x9F)) << " ".length();
            FastScanner.llllIIl[7] = "   ".length() << " ".length() & ("   ".length() << " ".length() ^ -" ".length());
            FastScanner.llllIIl[8] = (0x72 ^ 0x77) << " ".length();
            FastScanner.llllIIl[9] = " ".length() << " ".length();
            FastScanner.llllIIl[10] = " ".length() << "   ".length();
        }

        private static boolean llIIllll(int n, int n2) {
            return n == n2;
        }

        private static boolean IIIIllll(int n, int n2) {
            return n >= n2;
        }

        private static boolean lIIIllll(int n, int n2) {
            return n < n2;
        }

        private static boolean IIlIllll(int n, int n2) {
            return n <= n2;
        }

        private static boolean lIlIllll(int n) {
            return n != 0;
        }

        private static boolean IllIllll(int n) {
            return n == 0;
        }

        private static boolean IlIIllll(int n, int n2) {
            return n != n2;
        }
    }
}

