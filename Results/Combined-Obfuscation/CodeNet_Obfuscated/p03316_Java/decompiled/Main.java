/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.NoSuchElementException;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Main {
    static FastScanner sc;
    static PrintStream out;
    static PrintWriter pw;
    static final int[] dx;
    static final int[] dy;
    static final long MOD = 1000000007L;
    static final long INF = 0x3FFFFFFFFFFFFFFFL;
    private static int[] lIllIlIlIl;

    public Main() {
        Main lllIllIIIIIl;
    }

    public static void main(String[] stringArray) {
        new Solver();
        "".length();
    }

    static {
        Main.IIIIIIIllIIl();
        sc = new FastScanner();
        out = System.out;
        pw = new PrintWriter(out);
        int[] nArray = new int[lIllIlIlIl[0]];
        nArray[Main.lIllIlIlIl[1]] = lIllIlIlIl[1];
        nArray[Main.lIllIlIlIl[2]] = lIllIlIlIl[2];
        nArray[Main.lIllIlIlIl[3]] = lIllIlIlIl[1];
        nArray[Main.lIllIlIlIl[4]] = lIllIlIlIl[5];
        dx = nArray;
        int[] nArray2 = new int[lIllIlIlIl[0]];
        nArray2[Main.lIllIlIlIl[1]] = lIllIlIlIl[5];
        nArray2[Main.lIllIlIlIl[2]] = lIllIlIlIl[1];
        nArray2[Main.lIllIlIlIl[3]] = lIllIlIlIl[2];
        nArray2[Main.lIllIlIlIl[4]] = lIllIlIlIl[1];
        dy = nArray2;
    }

    private static void IIIIIIIllIIl() {
        lIllIlIlIl = new int[6];
        Main.lIllIlIlIl[0] = " ".length() << (" ".length() << " ".length());
        Main.lIllIlIlIl[1] = (0x95 ^ 0x80) << (" ".length() << " ".length()) & ~((0x12 ^ 7) << (" ".length() << " ".length()));
        Main.lIllIlIlIl[2] = " ".length();
        Main.lIllIlIlIl[3] = " ".length() << " ".length();
        Main.lIllIlIlIl[4] = "   ".length();
        Main.lIllIlIlIl[5] = -" ".length();
    }

    public static class Solver {
        private static String[] IlllIlIlIl;
        private static int[] llllIlIlIl;

        public Solver() {
            String string;
            Solver lIIIllIIIIIl;
            int IIIIllIIIIIl = sc.nextInt();
            int llllIlIIIIIl = llllIlIlIl[0];
            String IlllIlIIIIIl = Integer.toString(IIIIllIIIIIl);
            int lIllIlIIIIIl = llllIlIlIl[0];
            while (Solver.IIlIIIIllIIl(lIllIlIIIIIl, IlllIlIIIIIl.length())) {
                llllIlIIIIIl += IlllIlIIIIIl.charAt(lIllIlIIIIIl) - llllIlIlIl[1];
                ++lIllIlIIIIIl;
                "".length();
                if ((" ".length() << (" ".length() << (" ".length() << " ".length())) & (" ".length() << (" ".length() << (" ".length() << " ".length())) ^ -" ".length())) >= 0) continue;
                throw null;
            }
            if (Solver.lIlIIIIllIIl(IIIIllIIIIIl % llllIlIIIIIl)) {
                string = IlllIlIlIl[llllIlIlIl[0]];
                "".length();
                if ((((0x6D ^ 0x64) << " ".length() ^ "   ".length()) << (" ".length() << " ".length()) & (("   ".length() << "   ".length() ^ (0xBC ^ 0xB5)) << (" ".length() << " ".length()) ^ -" ".length())) <= -" ".length()) {
                    throw null;
                }
            } else {
                string = IlllIlIlIl[llllIlIlIl[2]];
            }
            out.println(string);
        }

        static {
            Solver.llIIIIIllIIl();
            Solver.IlIIIIIllIIl();
        }

        private static void IlIIIIIllIIl() {
            IlllIlIlIl = new String[llllIlIlIl[3]];
            Solver.IlllIlIlIl[Solver.llllIlIlIl[0]] = Solver.lIIIIIIllIIl("MUnsQekGyzQ=", "ytTaU");
            Solver.IlllIlIlIl[Solver.llllIlIlIl[2]] = Solver.lIIIIIIllIIl("S497DAgSE6Y=", "xqcVK");
        }

        private static String lIIIIIIllIIl(String IIIlIlIIIIIl, String lllIIlIIIIIl) {
            try {
                SecretKeySpec IllIIlIIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIIlIIIIIl.getBytes(StandardCharsets.UTF_8)), llllIlIlIl[4]), "DES");
                Cipher lIlIIlIIIIIl = Cipher.getInstance("DES");
                lIlIIlIIIIIl.init(llllIlIlIl[3], IllIIlIIIIIl);
                return new String(lIlIIlIIIIIl.doFinal(Base64.getDecoder().decode(IIIlIlIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception IIlIIlIIIIIl) {
                IIlIIlIIIIIl.printStackTrace();
                return null;
            }
        }

        private static void llIIIIIllIIl() {
            llllIlIlIl = new int[5];
            Solver.llllIlIlIl[0] = (20 + 148 - -9 + 44 ^ (0x27 ^ 0x16) << (" ".length() << " ".length())) << " ".length() & ((142 + 10 - 68 + 83 ^ (0xFA ^ 0xA5) << " ".length()) << " ".length() ^ -" ".length());
            Solver.llllIlIlIl[1] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
            Solver.llllIlIlIl[2] = " ".length();
            Solver.llllIlIlIl[3] = " ".length() << " ".length();
            Solver.llllIlIlIl[4] = " ".length() << "   ".length();
        }

        private static boolean IIlIIIIllIIl(int n, int n2) {
            return n < n2;
        }

        private static boolean lIlIIIIllIIl(int n) {
            return n == 0;
        }
    }

    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[IIlIllIlIl[0]];
        private int ptr = IIlIllIlIl[1];
        private int buflen = IIlIllIlIl[1];
        private static int[] IIlIllIlIl;

        FastScanner() {
            FastScanner IIIllIIIIIIl;
        }

        private boolean hasNextByte() {
            FastScanner lIlIlIIIIIIl;
            if (FastScanner.IlIlIIIllIIl(lIlIlIIIIIIl.ptr, lIlIlIIIIIIl.buflen)) {
                return IIlIllIlIl[2];
            }
            lIlIlIIIIIIl.ptr = IIlIllIlIl[1];
            try {
                lIlIlIIIIIIl.buflen = lIlIlIIIIIIl.in.read(lIlIlIIIIIIl.buffer);
                "".length();
            }
            catch (IOException IIlIlIIIIIIl) {
                IIlIlIIIIIIl.printStackTrace();
            }
            if ((0x3B ^ 0x3E) == 0) {
                return ((0xDA ^ 0x89) & ~(0x51 ^ 2)) != 0;
            }
            if (FastScanner.llIlIIIllIIl(lIlIlIIIIIIl.buflen)) {
                return IIlIllIlIl[1];
            }
            return IIlIllIlIl[2];
        }

        private int readByte() {
            FastScanner IlIIlIIIIIIl;
            if (FastScanner.IIllIIIllIIl(IlIIlIIIIIIl.hasNextByte() ? 1 : 0)) {
                int n = IlIIlIIIIIIl.ptr;
                IlIIlIIIIIIl.ptr = n + IIlIllIlIl[2];
                return IlIIlIIIIIIl.buffer[n];
            }
            return IIlIllIlIl[3];
        }

        private static boolean isPrintableChar(int IIIIlIIIIIIl) {
            int n;
            if (FastScanner.lIllIIIllIIl(IIlIllIlIl[4], IIIIlIIIIIIl) && FastScanner.lIllIIIllIIl(IIIIlIIIIIIl, IIlIllIlIl[5])) {
                n = IIlIllIlIl[2];
                "".length();
                if (" ".length() << " ".length() < 0) {
                    return ((0x2B ^ 0x62) & ~(0x8B ^ 0xC2)) != 0;
                }
            } else {
                n = IIlIllIlIl[1];
            }
            return n != 0;
        }

        private void skipUnprintable() {
            FastScanner IlllIIIIIIIl;
            while (FastScanner.IIllIIIllIIl(IlllIIIIIIIl.hasNextByte() ? 1 : 0) && FastScanner.IlllIIIllIIl(FastScanner.isPrintableChar(IlllIIIIIIIl.buffer[IlllIIIIIIIl.ptr]) ? 1 : 0)) {
                IlllIIIIIIIl.ptr += IIlIllIlIl[2];
                "".length();
                if (" ".length() << (" ".length() << " ".length()) > " ".length()) continue;
                return;
            }
        }

        public boolean hasNext() {
            FastScanner IIllIIIIIIIl;
            IIllIIIIIIIl.skipUnprintable();
            return this.hasNextByte();
        }

        /*
         * WARNING - void declaration
         */
        public String next() {
            void var1_1;
            FastScanner IIIlIIIIIIIl;
            if (FastScanner.IlllIIIllIIl(IIIlIIIIIIIl.hasNext() ? 1 : 0)) {
                throw new NoSuchElementException();
            }
            StringBuilder lllIIIIIIIIl = new StringBuilder();
            int IllIIIIIIIIl = IIIlIIIIIIIl.readByte();
            while (FastScanner.IIllIIIllIIl(FastScanner.isPrintableChar(IllIIIIIIIIl) ? 1 : 0)) {
                lllIIIIIIIIl.appendCodePoint(IllIIIIIIIIl);
                "".length();
                IllIIIIIIIIl = IIIlIIIIIIIl.readByte();
                "".length();
                if (((" ".length() << "   ".length() ^ (1 ^ 6)) << " ".length() & (((0xB ^ 0x2C) << " ".length() ^ (0x53 ^ 0x12)) << " ".length() ^ -" ".length())) <= "   ".length()) continue;
                return null;
            }
            return String.valueOf(var1_1);
        }

        public long nextLong() {
            FastScanner lIIIIIIIIIIl;
            if (FastScanner.IlllIIIllIIl(lIIIIIIIIIIl.hasNext() ? 1 : 0)) {
                throw new NoSuchElementException();
            }
            long IIIIIIIIIIIl = 0L;
            int lllllllllll = IIlIllIlIl[1];
            int Illllllllll = lIIIIIIIIIIl.readByte();
            if (FastScanner.llllIIIllIIl(Illllllllll, IIlIllIlIl[6])) {
                lllllllllll = IIlIllIlIl[2];
                Illllllllll = lIIIIIIIIIIl.readByte();
            }
            if (!FastScanner.IIIIlIIllIIl(Illllllllll, IIlIllIlIl[7]) || FastScanner.IlIlIIIllIIl(IIlIllIlIl[8], Illllllllll)) {
                throw new NumberFormatException();
            }
            do {
                if (FastScanner.lIllIIIllIIl(IIlIllIlIl[7], Illllllllll) && FastScanner.lIllIIIllIIl(Illllllllll, IIlIllIlIl[8])) {
                    IIIIIIIIIIIl *= 10L;
                    IIIIIIIIIIIl += (long)(Illllllllll - IIlIllIlIl[7]);
                    "".length();
                    if (((0x67 ^ 0x5C ^ "   ".length() << "   ".length()) & (0x70 ^ 0x5F ^ "   ".length() << (" ".length() << " ".length()) ^ -" ".length())) != 0) {
                        return 0L;
                    }
                } else {
                    if (!FastScanner.lIIIlIIllIIl(Illllllllll, IIlIllIlIl[3]) || FastScanner.IlllIIIllIIl(FastScanner.isPrintableChar(Illllllllll) ? 1 : 0)) {
                        long l;
                        if (FastScanner.IIllIIIllIIl(lllllllllll)) {
                            l = -IIIIIIIIIIIl;
                            "".length();
                            if (((0x87 ^ 0x94) << " ".length() & ~((0x84 ^ 0x97) << " ".length())) <= -" ".length()) {
                                return 0L;
                            }
                        } else {
                            l = IIIIIIIIIIIl;
                        }
                        return l;
                    }
                    throw new NumberFormatException();
                }
                int n = this.readByte();
                "".length();
            } while (" ".length() << " ".length() > " ".length());
            return 0L;
        }

        public int nextInt() {
            FastScanner IIlllllllll;
            return (int)IIlllllllll.nextLong();
        }

        /*
         * WARNING - void declaration
         */
        public int[] nextIntArray(int lllIlllllll, boolean IllIlllllll) {
            void var3_4;
            if (FastScanner.IIllIIIllIIl(IllIlllllll ? 1 : 0)) {
                int[] lIlIlllllll = new int[lllIlllllll + IIlIllIlIl[2]];
                int IIlIlllllll = IIlIllIlIl[2];
                while (FastScanner.lIllIIIllIIl(IIlIlllllll, lllIlllllll)) {
                    lIlIlllllll[IIlIlllllll] = sc.nextInt();
                    ++IIlIlllllll;
                    "".length();
                    if (" ".length() << (" ".length() << " ".length()) > 0) continue;
                    return null;
                }
                return lIlIlllllll;
            }
            int[] lIlIlllllll = new int[lllIlllllll];
            int IIlIlllllll = IIlIllIlIl[1];
            while (FastScanner.IlIlIIIllIIl(IIlIlllllll, lllIlllllll)) {
                lIlIlllllll[IIlIlllllll] = sc.nextInt();
                ++IIlIlllllll;
                "".length();
                if ("   ".length() == "   ".length()) continue;
                return null;
            }
            return var3_4;
        }

        /*
         * WARNING - void declaration
         */
        public long[] nextLongArray(int llllIllllll, boolean IlllIllllll) {
            void var3_4;
            if (FastScanner.IIllIIIllIIl(IlllIllllll ? 1 : 0)) {
                long[] lIllIllllll = new long[llllIllllll + IIlIllIlIl[2]];
                int IIllIllllll = IIlIllIlIl[2];
                while (FastScanner.lIllIIIllIIl(IIllIllllll, llllIllllll)) {
                    lIllIllllll[IIllIllllll] = sc.nextLong();
                    ++IIllIllllll;
                    "".length();
                    if (((0x22 ^ 0x25) & ~(0xC ^ 0xB)) == 0) continue;
                    return null;
                }
                return lIllIllllll;
            }
            long[] lIllIllllll = new long[llllIllllll];
            int IIllIllllll = IIlIllIlIl[1];
            while (FastScanner.IlIlIIIllIIl(IIllIllllll, llllIllllll)) {
                lIllIllllll[IIllIllllll] = sc.nextLong();
                ++IIllIllllll;
                "".length();
                if (((0x78 ^ 0x69) & ~(0x16 ^ 7)) >= 0) continue;
                return null;
            }
            return var3_4;
        }

        static {
            FastScanner.lIIlIIIllIIl();
        }

        private static void lIIlIIIllIIl() {
            IIlIllIlIl = new int[9];
            FastScanner.IIlIllIlIl[0] = " ".length() << ((0x68 ^ 0x6D) << " ".length());
            FastScanner.IIlIllIlIl[1] = ((0x5D ^ 0x72) << (" ".length() << " ".length()) ^ 107 + 59 - 23 + 12) & ((0x20 ^ 0x17) << " ".length() ^ (1 ^ 0x48) ^ -" ".length());
            FastScanner.IIlIllIlIl[2] = " ".length();
            FastScanner.IIlIllIlIl[3] = -" ".length();
            FastScanner.IIlIllIlIl[4] = (0x4C ^ 0x6F) << " ".length() ^ (0x7C ^ 0x1B);
            FastScanner.IIlIllIlIl[5] = ((0x92 ^ 0xBF) << (" ".length() << " ".length()) ^ 32 + 23 - 11 + 95) << " ".length();
            FastScanner.IIlIllIlIl[6] = 0x61 ^ 0x38 ^ (0x98 ^ 0x85) << (" ".length() << " ".length());
            FastScanner.IIlIllIlIl[7] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
            FastScanner.IIlIllIlIl[8] = " ".length() << ("   ".length() << " ".length()) ^ (0xDF ^ 0xA6);
        }

        private static boolean llllIIIllIIl(int n, int n2) {
            return n == n2;
        }

        private static boolean IIIIlIIllIIl(int n, int n2) {
            return n >= n2;
        }

        private static boolean IlIlIIIllIIl(int n, int n2) {
            return n < n2;
        }

        private static boolean lIllIIIllIIl(int n, int n2) {
            return n <= n2;
        }

        private static boolean IIllIIIllIIl(int n) {
            return n != 0;
        }

        private static boolean IlllIIIllIIl(int n) {
            return n == 0;
        }

        private static boolean llIlIIIllIIl(int n) {
            return n <= 0;
        }

        private static boolean lIIIlIIllIIl(int n, int n2) {
            return n != n2;
        }
    }
}

