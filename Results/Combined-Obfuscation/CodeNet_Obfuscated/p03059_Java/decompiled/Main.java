/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {
    private static int[] IIIIlllIIl;

    public Main() {
        Main IllIlIlllIll;
    }

    public static void main(String[] stringArray) {
        FastScanner llllIIlllIll = new FastScanner();
        int IlllIIlllIll = llllIIlllIll.nextInt();
        int lIllIIlllIll = llllIIlllIll.nextInt();
        int IIllIIlllIll = llllIIlllIll.nextInt();
        int llIlIIlllIll = IIIIlllIIl[0];
        float IlIlIIlllIll = IlllIIlllIll;
        while (Main.IlIlllIlIIIl(Main.IIIlllIlIIIl(IlIlIIlllIll, (float)IIllIIlllIll + 0.5f))) {
            llIlIIlllIll += lIllIIlllIll;
            IlIlIIlllIll += (float)IlllIIlllIll;
            "".length();
            if (" ".length() << (" ".length() << " ".length()) != 0) continue;
            return;
        }
        System.out.println(llIlIIlllIll);
    }

    static {
        Main.IllIllIlIIIl();
    }

    private static void IllIllIlIIIl() {
        IIIIlllIIl = new int[1];
        Main.IIIIlllIIl[0] = " ".length() << (" ".length() << " ".length()) & (" ".length() << (" ".length() << " ".length()) ^ -" ".length());
    }

    private static boolean IlIlllIlIIIl(int n) {
        return n < 0;
    }

    private static int IIIlllIlIIIl(float f, float f2) {
        return f == f2 ? 0 : (f < f2 ? -1 : 1);
    }

    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[IlIIlllIIl[0]];
        private int ptr = IlIIlllIIl[1];
        private int buflen = IlIIlllIIl[1];
        private static int[] IlIIlllIIl;

        FastScanner() {
            FastScanner IllIIIlllIll;
        }

        private boolean hasNextByte() {
            FastScanner llIIIIlllIll;
            if (FastScanner.lIIlllIlIIIl(llIIIIlllIll.ptr, llIIIIlllIll.buflen)) {
                return IlIIlllIIl[2];
            }
            llIIIIlllIll.ptr = IlIIlllIIl[1];
            try {
                llIIIIlllIll.buflen = llIIIIlllIll.in.read(llIIIIlllIll.buffer);
                "".length();
            }
            catch (IOException IlIIIIlllIll) {
                IlIIIIlllIll.printStackTrace();
            }
            if (" ".length() << " ".length() <= 0) {
                return ((4 ^ 0x43) & ~(0xEF ^ 0xA8)) != 0;
            }
            if (FastScanner.llIlllIlIIIl(llIIIIlllIll.buflen)) {
                return IlIIlllIIl[1];
            }
            return IlIIlllIIl[2];
        }

        private int readByte() {
            FastScanner IIIIIIlllIll;
            if (FastScanner.IIllllIlIIIl(IIIIIIlllIll.hasNextByte() ? 1 : 0)) {
                int n = IIIIIIlllIll.ptr;
                IIIIIIlllIll.ptr = n + IlIIlllIIl[2];
                return IIIIIIlllIll.buffer[n];
            }
            return IlIIlllIIl[3];
        }

        private static boolean isPrintableChar(int IlllllIllIll) {
            int n;
            if (FastScanner.lIllllIlIIIl(IlIIlllIIl[4], IlllllIllIll) && FastScanner.lIllllIlIIIl(IlllllIllIll, IlIIlllIIl[5])) {
                n = IlIIlllIIl[2];
                "".length();
                if (" ".length() << " ".length() == 0) {
                    return ((0xB9 ^ 0xA4 ^ (0x76 ^ 0x79) << (" ".length() << " ".length())) & (0x4C ^ 0x1D ^ (0x2E ^ 0x29) << (" ".length() << (" ".length() << " ".length())) ^ -" ".length())) != 0;
                }
            } else {
                n = IlIIlllIIl[1];
            }
            return n != 0;
        }

        public boolean hasNext() {
            FastScanner IIllllIllIll;
            while (FastScanner.IIllllIlIIIl(IIllllIllIll.hasNextByte() ? 1 : 0) && FastScanner.IlllllIlIIIl(FastScanner.isPrintableChar(IIllllIllIll.buffer[IIllllIllIll.ptr]) ? 1 : 0)) {
                IIllllIllIll.ptr += IlIIlllIIl[2];
                "".length();
                if ("   ".length() <= " ".length() << (" ".length() << " ".length())) continue;
                return (((0x23 ^ 0x7A) << " ".length() ^ 50 + 65 - 23 + 81) & (0xD ^ 0x7A ^ (0x54 ^ 0x59) << "   ".length() ^ -" ".length())) != 0;
            }
            return this.hasNextByte();
        }

        /*
         * WARNING - void declaration
         */
        public String next() {
            void var1_1;
            FastScanner IIIlllIllIll;
            if (FastScanner.IlllllIlIIIl(IIIlllIllIll.hasNext() ? 1 : 0)) {
                throw new NoSuchElementException();
            }
            StringBuilder lllIllIllIll = new StringBuilder();
            int IllIllIllIll = IIIlllIllIll.readByte();
            while (FastScanner.IIllllIlIIIl(FastScanner.isPrintableChar(IllIllIllIll) ? 1 : 0)) {
                lllIllIllIll.appendCodePoint(IllIllIllIll);
                "".length();
                IllIllIllIll = IIIlllIllIll.readByte();
                "".length();
                if (" ".length() << " ".length() >= " ".length()) continue;
                return null;
            }
            return String.valueOf(var1_1);
        }

        public long nextLong() {
            FastScanner lIIIllIllIll;
            if (FastScanner.IlllllIlIIIl(lIIIllIllIll.hasNext() ? 1 : 0)) {
                throw new NoSuchElementException();
            }
            long IIIIllIllIll = 0L;
            int llllIlIllIll = IlIIlllIIl[1];
            int IlllIlIllIll = lIIIllIllIll.readByte();
            if (FastScanner.llllllIlIIIl(IlllIlIllIll, IlIIlllIIl[6])) {
                llllIlIllIll = IlIIlllIIl[2];
                IlllIlIllIll = lIIIllIllIll.readByte();
            }
            if (!FastScanner.IIIIIIllIIIl(IlllIlIllIll, IlIIlllIIl[7]) || FastScanner.lIIlllIlIIIl(IlIIlllIIl[8], IlllIlIllIll)) {
                throw new NumberFormatException();
            }
            do {
                if (FastScanner.lIllllIlIIIl(IlIIlllIIl[7], IlllIlIllIll) && FastScanner.lIllllIlIIIl(IlllIlIllIll, IlIIlllIIl[8])) {
                    IIIIllIllIll *= 10L;
                    IIIIllIllIll += (long)(IlllIlIllIll - IlIIlllIIl[7]);
                    "".length();
                    if (null != null) {
                        return 0L;
                    }
                } else {
                    if (!FastScanner.lIIIIIllIIIl(IlllIlIllIll, IlIIlllIIl[3]) || FastScanner.IlllllIlIIIl(FastScanner.isPrintableChar(IlllIlIllIll) ? 1 : 0)) {
                        long l;
                        if (FastScanner.IIllllIlIIIl(llllIlIllIll)) {
                            l = -IIIIllIllIll;
                            "".length();
                            if (" ".length() >= " ".length() << " ".length()) {
                                return 0L;
                            }
                        } else {
                            l = IIIIllIllIll;
                        }
                        return l;
                    }
                    throw new NumberFormatException();
                }
                int n = this.readByte();
                "".length();
            } while ("   ".length() >= -" ".length());
            return 0L;
        }

        /*
         * WARNING - void declaration
         */
        public int nextInt() {
            void var1_1;
            FastScanner llIlIlIllIll;
            long IlIlIlIllIll = llIlIlIllIll.nextLong();
            if (!FastScanner.llIIIIllIIIl(FastScanner.IlIIIIllIIIl(IlIlIlIllIll, Integer.MIN_VALUE)) || FastScanner.IIlIIIllIIIl(FastScanner.IlIIIIllIIIl(IlIlIlIllIll, Integer.MAX_VALUE))) {
                throw new NumberFormatException();
            }
            return (int)var1_1;
        }

        public double nextDouble() {
            FastScanner IIIlIlIllIll;
            return Double.parseDouble(IIIlIlIllIll.next());
        }

        static {
            FastScanner.lllIllIlIIIl();
        }

        private static void lllIllIlIIIl() {
            IlIIlllIIl = new int[9];
            FastScanner.IlIIlllIIl[0] = " ".length() << ((0xA3 ^ 0xA6) << " ".length());
            FastScanner.IlIIlllIIl[1] = ((0x4D ^ 0x54) << "   ".length() ^ 69 + 56 - 56 + 84) & (0x99 ^ 0xB8 ^ (4 ^ 3) << (" ".length() << (" ".length() << " ".length())) ^ -" ".length());
            FastScanner.IlIIlllIIl[2] = " ".length();
            FastScanner.IlIIlllIIl[3] = -" ".length();
            FastScanner.IlIIlllIIl[4] = 162 + 160 - 105 + 8 ^ "   ".length() << ("   ".length() << " ".length());
            FastScanner.IlIIlllIIl[5] = (0x2B ^ 2 ^ (0x8B ^ 0x80) << " ".length()) << " ".length();
            FastScanner.IlIIlllIIl[6] = 0x45 ^ 0x7A ^ (0x6E ^ 0x67) << " ".length();
            FastScanner.IlIIlllIIl[7] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
            FastScanner.IlIIlllIIl[8] = " ".length() << (0x44 ^ 0x43) ^ 150 + 103 - 134 + 66;
        }

        private static boolean llllllIlIIIl(int n, int n2) {
            return n == n2;
        }

        private static boolean IIIIIIllIIIl(int n, int n2) {
            return n >= n2;
        }

        private static boolean lIIlllIlIIIl(int n, int n2) {
            return n < n2;
        }

        private static boolean lIllllIlIIIl(int n, int n2) {
            return n <= n2;
        }

        private static boolean IIllllIlIIIl(int n) {
            return n != 0;
        }

        private static boolean IlllllIlIIIl(int n) {
            return n == 0;
        }

        private static boolean llIIIIllIIIl(int n) {
            return n >= 0;
        }

        private static boolean llIlllIlIIIl(int n) {
            return n <= 0;
        }

        private static boolean IIlIIIllIIIl(int n) {
            return n > 0;
        }

        private static boolean lIIIIIllIIIl(int n, int n2) {
            return n != n2;
        }

        private static int IlIIIIllIIIl(long l, long l2) {
            return l == l2 ? 0 : (l < l2 ? -1 : 1);
        }
    }
}

