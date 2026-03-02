/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.NoSuchElementException;

class Main {
    static Scnr sc;
    static PrintWriter out;
    private static int[] llIlIIlIl;

    Main() {
        Main lllIIIlIIIlIll;
    }

    public static void main(String[] stringArray) {
        int IlIIIIlIIIlIll = sc.nextInt();
        int lIIIIIlIIIlIll = sc.nextInt();
        Object[] IIIIIIlIIIlIll = new String[IlIIIIlIIIlIll];
        int llllllIIIIlIll = llIlIIlIl[0];
        while (Main.IlIlIllIIIl(llllllIIIIlIll, IlIIIIlIIIlIll)) {
            IIIIIIlIIIlIll[llllllIIIIlIll] = sc.next();
            ++llllllIIIIlIll;
            "".length();
            if (" ".length() < "   ".length()) continue;
            return;
        }
        Arrays.sort(IIIIIIlIIIlIll);
        llllllIIIIlIll = llIlIIlIl[0];
        while (Main.IlIlIllIIIl(llllllIIIIlIll, IlIIIIlIIIlIll)) {
            out.print((String)IIIIIIlIIIlIll[llllllIIIIlIll]);
            ++llllllIIIIlIll;
            "".length();
            if (((0x57 ^ 0x62) & ~(0x53 ^ 0x66)) <= " ".length() << " ".length()) continue;
            return;
        }
        out.println();
        out.flush();
    }

    static {
        Main.lIIlIllIIIl();
        sc = new Scnr();
        out = new PrintWriter(System.out);
    }

    private static void lIIlIllIIIl() {
        llIlIIlIl = new int[1];
        Main.llIlIIlIl[0] = " ".length() << (" ".length() << " ".length()) & ~(" ".length() << (" ".length() << " ".length()));
    }

    private static boolean IlIlIllIIIl(int n, int n2) {
        return n < n2;
    }

    static class Scnr {
        private final InputStream ins;
        private final byte[] buffer = new byte[lIllIIlIl[0]];
        private int ptr = lIllIIlIl[1];
        private int buflen = lIllIIlIl[1];
        private static int[] lIllIIlIl;

        Scnr() {
            lIIlllIIIIlIll(System.in);
            Scnr lIIlllIIIIlIll;
        }

        Scnr(InputStream lIlIllIIIIlIll) {
            Scnr IllIllIIIIlIll;
            IllIllIIIIlIll.ins = lIlIllIIIIlIll;
        }

        private boolean hasNextByte() {
            Scnr IlIIllIIIIlIll;
            if (Scnr.IIllIllIIIl(IlIIllIIIIlIll.ptr, IlIIllIIIIlIll.buflen)) {
                return lIllIIlIl[2];
            }
            IlIIllIIIIlIll.ptr = lIllIIlIl[1];
            try {
                IlIIllIIIIlIll.buflen = IlIIllIIIIlIll.ins.read(IlIIllIIIIlIll.buffer);
                "".length();
            }
            catch (IOException lIIIllIIIIlIll) {
                lIIIllIIIIlIll.printStackTrace();
            }
            if (null != null) {
                return ("   ".length() & ~"   ".length()) != 0;
            }
            if (Scnr.lIllIllIIIl(IlIIllIIIIlIll.buflen)) {
                return lIllIIlIl[1];
            }
            return lIllIIlIl[2];
        }

        private int readByte() {
            Scnr llllIlIIIIlIll;
            if (Scnr.IlllIllIIIl(llllIlIIIIlIll.hasNextByte() ? 1 : 0)) {
                int n = llllIlIIIIlIll.ptr;
                llllIlIIIIlIll.ptr = n + lIllIIlIl[2];
                return llllIlIIIIlIll.buffer[n];
            }
            return lIllIIlIl[3];
        }

        private static boolean isPrintableChar(int lIllIlIIIIlIll) {
            int n;
            if (Scnr.llllIllIIIl(lIllIIlIl[4], lIllIlIIIIlIll) && Scnr.llllIllIIIl(lIllIlIIIIlIll, lIllIIlIl[5])) {
                n = lIllIIlIl[2];
                "".length();
                if (-" ".length() > " ".length() << (" ".length() << " ".length())) {
                    return ((0x20 ^ 0x27) << " ".length() & ~((0x34 ^ 0x33) << " ".length())) != 0;
                }
            } else {
                n = lIllIIlIl[1];
            }
            return n != 0;
        }

        public boolean hasNext() {
            Scnr llIlIlIIIIlIll;
            while (Scnr.IlllIllIIIl(llIlIlIIIIlIll.hasNextByte() ? 1 : 0) && Scnr.IIIIlllIIIl(Scnr.isPrintableChar(llIlIlIIIIlIll.buffer[llIlIlIIIIlIll.ptr]) ? 1 : 0)) {
                llIlIlIIIIlIll.ptr += lIllIIlIl[2];
                "".length();
                if (((0x85 ^ 0xAE) & ~(0x8F ^ 0xA4)) == 0) continue;
                return ((0xDD ^ 0x86) & ~(0x21 ^ 0x7A)) != 0;
            }
            return this.hasNextByte();
        }

        /*
         * WARNING - void declaration
         */
        public String next() {
            void var1_1;
            Scnr lllIIlIIIIlIll;
            if (Scnr.IIIIlllIIIl(lllIIlIIIIlIll.hasNext() ? 1 : 0)) {
                throw new NoSuchElementException();
            }
            StringBuilder IllIIlIIIIlIll = new StringBuilder();
            int lIlIIlIIIIlIll = lllIIlIIIIlIll.readByte();
            while (Scnr.IlllIllIIIl(Scnr.isPrintableChar(lIlIIlIIIIlIll) ? 1 : 0)) {
                IllIIlIIIIlIll.appendCodePoint(lIlIIlIIIIlIll);
                "".length();
                lIlIIlIIIIlIll = lllIIlIIIIlIll.readByte();
                "".length();
                if (" ".length() << " ".length() != 0) continue;
                return null;
            }
            return String.valueOf(var1_1);
        }

        /*
         * WARNING - void declaration
         */
        public StringBuilder nextBuilder() {
            void var1_1;
            Scnr lIIIIlIIIIlIll;
            if (Scnr.IIIIlllIIIl(lIIIIlIIIIlIll.hasNext() ? 1 : 0)) {
                throw new NoSuchElementException();
            }
            StringBuilder IIIIIlIIIIlIll = new StringBuilder();
            int lllllIIIIIlIll = lIIIIlIIIIlIll.readByte();
            while (Scnr.IlllIllIIIl(Scnr.isPrintableChar(lllllIIIIIlIll) ? 1 : 0)) {
                IIIIIlIIIIlIll.appendCodePoint(lllllIIIIIlIll);
                "".length();
                lllllIIIIIlIll = lIIIIlIIIIlIll.readByte();
                "".length();
                if (null == null) continue;
                return null;
            }
            return var1_1;
        }

        public double nextDouble() {
            Scnr lIlllIIIIIlIll;
            return Double.parseDouble(lIlllIIIIIlIll.next());
        }

        public long nextLong() {
            Scnr IIIllIIIIIlIll;
            if (Scnr.IIIIlllIIIl(IIIllIIIIIlIll.hasNext() ? 1 : 0)) {
                throw new NoSuchElementException();
            }
            long lllIlIIIIIlIll = 0L;
            int IllIlIIIIIlIll = lIllIIlIl[1];
            int lIlIlIIIIIlIll = IIIllIIIIIlIll.readByte();
            if (Scnr.lIIIlllIIIl(lIlIlIIIIIlIll, lIllIIlIl[6])) {
                IllIlIIIIIlIll = lIllIIlIl[2];
                lIlIlIIIIIlIll = IIIllIIIIIlIll.readByte();
            }
            if (!Scnr.IlIIlllIIIl(lIlIlIIIIIlIll, lIllIIlIl[7]) || Scnr.IIllIllIIIl(lIllIIlIl[8], lIlIlIIIIIlIll)) {
                throw new NumberFormatException();
            }
            do {
                if (Scnr.llllIllIIIl(lIllIIlIl[7], lIlIlIIIIIlIll) && Scnr.llllIllIIIl(lIlIlIIIIIlIll, lIllIIlIl[8])) {
                    lllIlIIIIIlIll *= 10L;
                    lllIlIIIIIlIll += (long)(lIlIlIIIIIlIll - lIllIIlIl[7]);
                    "".length();
                    if (-"   ".length() > 0) {
                        return 0L;
                    }
                } else {
                    if (!Scnr.llIIlllIIIl(lIlIlIIIIIlIll, lIllIIlIl[3]) || Scnr.IIIIlllIIIl(Scnr.isPrintableChar(lIlIlIIIIIlIll) ? 1 : 0)) {
                        long l;
                        if (Scnr.IlllIllIIIl(IllIlIIIIIlIll)) {
                            l = -lllIlIIIIIlIll;
                            "".length();
                            if (null != null) {
                                return 0L;
                            }
                        } else {
                            l = lllIlIIIIIlIll;
                        }
                        return l;
                    }
                    throw new NumberFormatException();
                }
                int n = this.readByte();
                "".length();
            } while ("   ".length() <= " ".length() << (" ".length() << " ".length()));
            return 0L;
        }

        /*
         * WARNING - void declaration
         */
        public int nextInt() {
            void var1_1;
            Scnr IlIIlIIIIIlIll;
            long lIIIlIIIIIlIll = IlIIlIIIIIlIll.nextLong();
            if (!Scnr.lIlIlllIIIl(Scnr.IIlIlllIIIl(lIIIlIIIIIlIll, Integer.MIN_VALUE)) || Scnr.IllIlllIIIl(Scnr.IIlIlllIIIl(Integer.MAX_VALUE, lIIIlIIIIIlIll))) {
                throw new NumberFormatException();
            }
            return (int)var1_1;
        }

        /*
         * WARNING - void declaration
         */
        public int[] nextAInt(int IIllIIIIIIlIll) {
            void var2_2;
            Scnr lIllIIIIIIlIll;
            int[] llIlIIIIIIlIll = new int[IIllIIIIIIlIll];
            lIllIIIIIIlIll.nextAInt(llIlIIIIIIlIll, IIllIIIIIIlIll);
            return var2_2;
        }

        public void nextAInt(int[] lIlIIIIIIIlIll, int IIlIIIIIIIlIll) {
            int llIIIIIIIIlIll = lIllIIlIl[1];
            while (Scnr.IIllIllIIIl(llIIIIIIIIlIll, IIlIIIIIIIlIll)) {
                Scnr IllIIIIIIIlIll;
                lIlIIIIIIIlIll[llIIIIIIIIlIll] = IllIIIIIIIlIll.nextInt();
                ++llIIIIIIIIlIll;
                "".length();
                if (" ".length() << " ".length() != "   ".length()) continue;
                return;
            }
        }

        /*
         * WARNING - void declaration
         */
        public long[] nextALong(int IlllllllllIIll) {
            void var2_2;
            Scnr llllllllllIIll;
            long[] lIllllllllIIll = new long[IlllllllllIIll];
            llllllllllIIll.nextALong(lIllllllllIIll, IlllllllllIIll);
            return var2_2;
        }

        public void nextALong(long[] lllIllllllIIll, int IllIllllllIIll) {
            int lIlIllllllIIll = lIllIIlIl[1];
            while (Scnr.IIllIllIIIl(lIlIllllllIIll, IllIllllllIIll)) {
                Scnr IIIlllllllIIll;
                lllIllllllIIll[lIlIllllllIIll] = IIIlllllllIIll.nextLong();
                ++lIlIllllllIIll;
                "".length();
                if (-" ".length() <= -" ".length()) continue;
                return;
            }
        }

        /*
         * WARNING - void declaration
         */
        public double[] nextADouble(int llllIlllllIIll) {
            void var2_2;
            double[] IlllIlllllIIll = new double[llllIlllllIIll];
            int lIllIlllllIIll = lIllIIlIl[1];
            while (Scnr.IIllIllIIIl(lIllIlllllIIll, llllIlllllIIll)) {
                Scnr IIIIllllllIIll;
                IlllIlllllIIll[lIllIlllllIIll] = IIIIllllllIIll.nextDouble();
                ++lIllIlllllIIll;
                "".length();
                if (-" ".length() <= 0) continue;
                return null;
            }
            return var2_2;
        }

        public void nextADouble(double[] lllIIlllllIIll, int IllIIlllllIIll) {
            int lIlIIlllllIIll = lIllIIlIl[1];
            while (Scnr.IIllIllIIIl(lIlIIlllllIIll, IllIIlllllIIll)) {
                Scnr IIIlIlllllIIll;
                lllIIlllllIIll[lIlIIlllllIIll] = IIIlIlllllIIll.nextDouble();
                ++lIlIIlllllIIll;
                "".length();
                if (null == null) continue;
                return;
            }
        }

        static {
            Scnr.llIlIllIIIl();
        }

        private static void llIlIllIIIl() {
            lIllIIlIl = new int[9];
            Scnr.lIllIIlIl[0] = " ".length() << ((" ".length() << (0xC6 ^ 0xC1) ^ 34 + 100 - 1 + 0) << " ".length());
            Scnr.lIllIIlIl[1] = (0x4D ^ 0x5A) << " ".length() & ~((0xB7 ^ 0xA0) << " ".length());
            Scnr.lIllIIlIl[2] = " ".length();
            Scnr.lIllIIlIl[3] = -" ".length();
            Scnr.lIllIIlIl[4] = 0x37 ^ 0x16;
            Scnr.lIllIIlIl[5] = (0x93 ^ 0xAC) << " ".length();
            Scnr.lIllIIlIl[6] = 0x7E ^ 0x53;
            Scnr.lIllIIlIl[7] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
            Scnr.lIllIIlIl[8] = 0xFD ^ 0xC4;
        }

        private static boolean lIIIlllIIIl(int n, int n2) {
            return n == n2;
        }

        private static boolean IlIIlllIIIl(int n, int n2) {
            return n >= n2;
        }

        private static boolean IIllIllIIIl(int n, int n2) {
            return n < n2;
        }

        private static boolean llllIllIIIl(int n, int n2) {
            return n <= n2;
        }

        private static boolean IlllIllIIIl(int n) {
            return n != 0;
        }

        private static boolean IIIIlllIIIl(int n) {
            return n == 0;
        }

        private static boolean lIlIlllIIIl(int n) {
            return n >= 0;
        }

        private static boolean IllIlllIIIl(int n) {
            return n < 0;
        }

        private static boolean lIllIllIIIl(int n) {
            return n <= 0;
        }

        private static boolean llIIlllIIIl(int n, int n2) {
            return n != n2;
        }

        private static int IIlIlllIIIl(long l, long l2) {
            return l == l2 ? 0 : (l < l2 ? -1 : 1);
        }
    }
}

