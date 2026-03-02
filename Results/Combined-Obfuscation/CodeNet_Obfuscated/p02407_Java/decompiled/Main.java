/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Main$Solver
 */
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

class Main {
    Main() {
        Main llIIIIlIllIIll;
    }

    public static void main(String[] stringArray) {
        FastScanner IlllllIIllIIll = new FastScanner();
        PrintWriter lIllllIIllIIll = new PrintWriter(System.out);
        try {
            new Solver(IlllllIIllIIll, lIllllIIllIIll).run();
            lIllllIIllIIll.flush();
            lIllllIIllIIll.close();
            "".length();
        }
        catch (Throwable IIllllIIllIIll) {
            try {
                lIllllIIllIIll.close();
                "".length();
            }
            catch (Throwable llIlllIIllIIll) {
                IIllllIIllIIll.addSuppressed(llIlllIIllIIll);
            }
            if (" ".length() << (" ".length() << " ".length()) < " ".length()) {
                return;
            }
            throw IIllllIIllIIll;
        }
        if ("   ".length() < 0) {
            return;
        }
    }

    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[lIlIlIlIl[0]];
        private int ptr = lIlIlIlIl[1];
        private int buflen = lIlIlIlIl[1];
        private static int[] lIlIlIlIl;

        public FastScanner() {
            FastScanner lIIlllIIllIIll;
        }

        private boolean hasNextByte() {
            FastScanner IllIllIIllIIll;
            if (FastScanner.llIlIIIlIIl(IllIllIIllIIll.ptr, IllIllIIllIIll.buflen)) {
                return lIlIlIlIl[2];
            }
            IllIllIIllIIll.ptr = lIlIlIlIl[1];
            try {
                IllIllIIllIIll.buflen = IllIllIIllIIll.in.read(IllIllIIllIIll.buffer);
                "".length();
            }
            catch (IOException lIlIllIIllIIll) {
                lIlIllIIllIIll.printStackTrace();
            }
            if (-" ".length() == " ".length()) {
                return ((0x1A ^ 0x31) & ~(0x50 ^ 0x7B)) != 0;
            }
            if (FastScanner.IIllIIIlIIl(IllIllIIllIIll.buflen)) {
                return lIlIlIlIl[1];
            }
            return lIlIlIlIl[2];
        }

        private int readByte() {
            FastScanner llIIllIIllIIll;
            if (FastScanner.lIllIIIlIIl(llIIllIIllIIll.hasNextByte() ? 1 : 0)) {
                int n = llIIllIIllIIll.ptr;
                llIIllIIllIIll.ptr = n + lIlIlIlIl[2];
                return llIIllIIllIIll.buffer[n];
            }
            return lIlIlIlIl[3];
        }

        private boolean isPrintableChar(int lIIIllIIllIIll) {
            int n;
            if (FastScanner.IlllIIIlIIl(lIlIlIlIl[4], lIIIllIIllIIll) && FastScanner.IlllIIIlIIl(lIIIllIIllIIll, lIlIlIlIl[5])) {
                n = lIlIlIlIl[2];
                "".length();
                if (" ".length() << (" ".length() << " ".length()) == 0) {
                    return ((0xC2 ^ 0xC7) << " ".length() & ~((0x75 ^ 0x70) << " ".length())) != 0;
                }
            } else {
                n = lIlIlIlIl[1];
            }
            return n != 0;
        }

        public boolean hasNext() {
            FastScanner llllIlIIllIIll;
            while (FastScanner.lIllIIIlIIl(llllIlIIllIIll.hasNextByte() ? 1 : 0) && FastScanner.llllIIIlIIl(llllIlIIllIIll.isPrintableChar(llllIlIIllIIll.buffer[llllIlIIllIIll.ptr]) ? 1 : 0)) {
                llllIlIIllIIll.ptr += lIlIlIlIl[2];
                "".length();
                if (" ".length() != " ".length() << (" ".length() << " ".length())) continue;
                return ((45 + 1 - -20 + 63 ^ (0x32 ^ 0x13) << (" ".length() << " ".length())) << (" ".length() << (" ".length() << " ".length())) & (((0x3D ^ 0x38) << " ".length() ^ (0x68 ^ 0x67)) << (" ".length() << (" ".length() << " ".length())) ^ -" ".length())) != 0;
            }
            return this.hasNextByte();
        }

        /*
         * WARNING - void declaration
         */
        public String next() {
            void var1_1;
            FastScanner llIlIlIIllIIll;
            if (FastScanner.llllIIIlIIl(llIlIlIIllIIll.hasNext() ? 1 : 0)) {
                throw new NoSuchElementException();
            }
            StringBuilder IlIlIlIIllIIll = new StringBuilder();
            int lIIlIlIIllIIll = llIlIlIIllIIll.readByte();
            while (FastScanner.lIllIIIlIIl(llIlIlIIllIIll.isPrintableChar(lIIlIlIIllIIll) ? 1 : 0)) {
                IlIlIlIIllIIll.appendCodePoint(lIIlIlIIllIIll);
                "".length();
                lIIlIlIIllIIll = llIlIlIIllIIll.readByte();
                "".length();
                if (" ".length() << " ".length() == " ".length() << " ".length()) continue;
                return null;
            }
            return String.valueOf(var1_1);
        }

        public long nextLong() {
            FastScanner IIlIIlIIllIIll;
            if (FastScanner.llllIIIlIIl(IIlIIlIIllIIll.hasNext() ? 1 : 0)) {
                throw new NoSuchElementException();
            }
            long llIIIlIIllIIll = 0L;
            int IlIIIlIIllIIll = lIlIlIlIl[1];
            int lIIIIlIIllIIll = IIlIIlIIllIIll.readByte();
            if (FastScanner.IIIIlIIlIIl(lIIIIlIIllIIll, lIlIlIlIl[6])) {
                IlIIIlIIllIIll = lIlIlIlIl[2];
                lIIIIlIIllIIll = IIlIIlIIllIIll.readByte();
            }
            if (!FastScanner.lIIIlIIlIIl(lIIIIlIIllIIll, lIlIlIlIl[7]) || FastScanner.llIlIIIlIIl(lIlIlIlIl[8], lIIIIlIIllIIll)) {
                throw new NumberFormatException();
            }
            do {
                if (FastScanner.IlllIIIlIIl(lIlIlIlIl[7], lIIIIlIIllIIll) && FastScanner.IlllIIIlIIl(lIIIIlIIllIIll, lIlIlIlIl[8])) {
                    llIIIlIIllIIll *= 10L;
                    llIIIlIIllIIll += (long)(lIIIIlIIllIIll - lIlIlIlIl[7]);
                    "".length();
                    if (null != null) {
                        return 0L;
                    }
                } else {
                    if (!FastScanner.IlIIlIIlIIl(lIIIIlIIllIIll, lIlIlIlIl[3]) || FastScanner.llllIIIlIIl(IIlIIlIIllIIll.isPrintableChar(lIIIIlIIllIIll) ? 1 : 0)) {
                        long l;
                        if (FastScanner.lIllIIIlIIl(IlIIIlIIllIIll)) {
                            l = -llIIIlIIllIIll;
                            "".length();
                            if (" ".length() << (" ".length() << " ".length()) == ((0x32 ^ 0x35) << (" ".length() << " ".length()) & ~((0x8D ^ 0x8A) << (" ".length() << " ".length())))) {
                                return 0L;
                            }
                        } else {
                            l = llIIIlIIllIIll;
                        }
                        return l;
                    }
                    throw new NumberFormatException();
                }
                int n = this.readByte();
                "".length();
            } while (((72 + 25 - -39 + 7 ^ (0x39 ^ 0x76) << " ".length()) << (" ".length() << " ".length()) & ((118 + 23 - 56 + 98 ^ (4 ^ 0x57) << " ".length()) << (" ".length() << " ".length()) ^ -" ".length())) == 0);
            return 0L;
        }

        /*
         * WARNING - void declaration
         */
        public int nextInt() {
            void var1_1;
            FastScanner IllllIIIllIIll;
            long lIlllIIIllIIll = IllllIIIllIIll.nextLong();
            if (!FastScanner.IIlIlIIlIIl(FastScanner.llIIlIIlIIl(lIlllIIIllIIll, Integer.MIN_VALUE)) || FastScanner.lIlIlIIlIIl(FastScanner.llIIlIIlIIl(lIlllIIIllIIll, Integer.MAX_VALUE))) {
                throw new NumberFormatException();
            }
            return (int)var1_1;
        }

        public double nextDouble() {
            FastScanner llIllIIIllIIll;
            return Double.parseDouble(llIllIIIllIIll.next());
        }

        /*
         * WARNING - void declaration
         */
        public int[] nextIntArray(int lIlIlIIIllIIll) {
            void var2_2;
            int[] IIlIlIIIllIIll = new int[lIlIlIIIllIIll];
            int llIIlIIIllIIll = lIlIlIlIl[1];
            while (FastScanner.llIlIIIlIIl(llIIlIIIllIIll, lIlIlIIIllIIll)) {
                FastScanner IllIlIIIllIIll;
                IIlIlIIIllIIll[llIIlIIIllIIll] = IllIlIIIllIIll.nextInt();
                ++llIIlIIIllIIll;
                "".length();
                if (-(1 ^ 5) < 0) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        public long[] nextLongArray(int lIllIIIIllIIll) {
            void var2_2;
            long[] IIllIIIIllIIll = new long[lIllIIIIllIIll];
            int llIlIIIIllIIll = lIlIlIlIl[1];
            while (FastScanner.llIlIIIlIIl(llIlIIIIllIIll, lIllIIIIllIIll)) {
                FastScanner IlllIIIIllIIll;
                IIllIIIIllIIll[llIlIIIIllIIll] = IlllIIIIllIIll.nextLong();
                ++llIlIIIIllIIll;
                "".length();
                if (null == null) continue;
                return null;
            }
            return var2_2;
        }

        static {
            FastScanner.IlIlIIIlIIl();
        }

        private static void IlIlIIIlIIl() {
            lIlIlIlIl = new int[9];
            FastScanner.lIlIlIlIl[0] = " ".length() << ((0x35 ^ 0x30) << " ".length());
            FastScanner.lIlIlIlIl[1] = (0xD0 ^ 0xC7) & ~(0x5C ^ 0x4B);
            FastScanner.lIlIlIlIl[2] = " ".length();
            FastScanner.lIlIlIlIl[3] = -" ".length();
            FastScanner.lIlIlIlIl[4] = 0x9E ^ 0xBF;
            FastScanner.lIlIlIlIl[5] = (0x26 ^ 0x19) << " ".length();
            FastScanner.lIlIlIlIl[6] = 0x9C ^ 0xB1;
            FastScanner.lIlIlIlIl[7] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
            FastScanner.lIlIlIlIl[8] = 149 + 28 - 28 + 14 ^ (0xE7 ^ 0xAA) << " ".length();
        }

        private static boolean IIIIlIIlIIl(int n, int n2) {
            return n == n2;
        }

        private static boolean lIIIlIIlIIl(int n, int n2) {
            return n >= n2;
        }

        private static boolean llIlIIIlIIl(int n, int n2) {
            return n < n2;
        }

        private static boolean IlllIIIlIIl(int n, int n2) {
            return n <= n2;
        }

        private static boolean lIllIIIlIIl(int n) {
            return n != 0;
        }

        private static boolean llllIIIlIIl(int n) {
            return n == 0;
        }

        private static boolean IIlIlIIlIIl(int n) {
            return n >= 0;
        }

        private static boolean IIllIIIlIIl(int n) {
            return n <= 0;
        }

        private static boolean lIlIlIIlIIl(int n) {
            return n > 0;
        }

        private static boolean IlIIlIIlIIl(int n, int n2) {
            return n != n2;
        }

        private static int llIIlIIlIIl(long l, long l2) {
            return l == l2 ? 0 : (l < l2 ? -1 : 1);
        }
    }
}

