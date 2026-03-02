/*
 * Decompiled with CFR 0.152.
 */
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {
    private static int[] IIIllllIIl;

    public Main() {
        Main IlIIllIIlIll;
    }

    public static void main(String[] stringArray) {
        InputStream IIllIlIIlIll = System.in;
        PrintStream llIlIlIIlIll = System.out;
        FastScanner IlIlIlIIlIll = new FastScanner(IIllIlIIlIll);
        PrintWriter lIIlIlIIlIll = new PrintWriter(llIlIlIIlIll);
        BBitterAlchemy IIIlIlIIlIll = new BBitterAlchemy();
        IIIlIlIIlIll.solve(IIIllllIIl[0], IlIlIlIIlIll, lIIlIlIIlIll);
        lIIlIlIIlIll.close();
    }

    static {
        Main.llIIlIllIIIl();
    }

    private static void llIIlIllIIIl() {
        IIIllllIIl = new int[1];
        Main.IIIllllIIl[0] = " ".length();
    }

    static class FastScanner
    implements Closeable {
        private final InputStream in;
        private final byte[] buffer = new byte[IIlllllIIl[0]];
        private int ptr = IIlllllIIl[1];
        private int buflen = IIlllllIIl[1];
        private static int[] IIlllllIIl;

        public FastScanner(InputStream IIlIlIIIlIll) {
            FastScanner lIlIlIIIlIll;
            lIlIlIIIlIll.in = IIlIlIIIlIll;
        }

        private boolean hasNextByte() {
            FastScanner lIIIlIIIlIll;
            if (FastScanner.IllIlIllIIIl(lIIIlIIIlIll.ptr, lIIIlIIIlIll.buflen)) {
                return IIlllllIIl[2];
            }
            lIIIlIIIlIll.ptr = IIlllllIIl[1];
            try {
                lIIIlIIIlIll.buflen = lIIIlIIIlIll.in.read(lIIIlIIIlIll.buffer);
                "".length();
            }
            catch (IOException IIIIlIIIlIll) {
                IIIIlIIIlIll.printStackTrace();
            }
            if (" ".length() >= " ".length() << " ".length()) {
                return ((0x5F ^ 0x54) << "   ".length() & ~((0x77 ^ 0x7C) << "   ".length())) != 0;
            }
            if (FastScanner.lllIlIllIIIl(lIIIlIIIlIll.buflen)) {
                return IIlllllIIl[1];
            }
            return IIlllllIIl[2];
        }

        private int readByte() {
            FastScanner IlllIIIIlIll;
            if (FastScanner.IIIllIllIIIl(IlllIIIIlIll.hasNextByte() ? 1 : 0)) {
                int n = IlllIIIIlIll.ptr;
                IlllIIIIlIll.ptr = n + IIlllllIIl[2];
                return IlllIIIIlIll.buffer[n];
            }
            return IIlllllIIl[3];
        }

        private static boolean isPrintableChar(int IIllIIIIlIll) {
            int n;
            if (FastScanner.lIIllIllIIIl(IIlllllIIl[4], IIllIIIIlIll) && FastScanner.lIIllIllIIIl(IIllIIIIlIll, IIlllllIIl[5])) {
                n = IIlllllIIl[2];
                "".length();
                if (" ".length() << (" ".length() << " ".length()) < ((0x62 ^ 0x67) << (" ".length() << " ".length()) & ~((0xAF ^ 0xAA) << (" ".length() << " ".length())))) {
                    return ((0x18 ^ 0x47) & ~(0xE4 ^ 0xBB)) != 0;
                }
            } else {
                n = IIlllllIIl[1];
            }
            return n != 0;
        }

        public boolean hasNext() {
            FastScanner IlIlIIIIlIll;
            while (FastScanner.IIIllIllIIIl(IlIlIIIIlIll.hasNextByte() ? 1 : 0) && FastScanner.IlIllIllIIIl(FastScanner.isPrintableChar(IlIlIIIIlIll.buffer[IlIlIIIIlIll.ptr]) ? 1 : 0)) {
                IlIlIIIIlIll.ptr += IIlllllIIl[2];
                "".length();
                if ("   ".length() > 0) continue;
                return ((0x36 ^ 0x53 ^ (7 ^ 0xA) << "   ".length()) & ((0x54 ^ 0x51) << "   ".length() ^ (0x9D ^ 0xB8) ^ -" ".length())) != 0;
            }
            return this.hasNextByte();
        }

        public long nextLong() {
            FastScanner lIlIIIIIlIll;
            if (FastScanner.IlIllIllIIIl(lIlIIIIIlIll.hasNext() ? 1 : 0)) {
                throw new NoSuchElementException();
            }
            long IIlIIIIIlIll = 0L;
            int llIIIIIIlIll = IIlllllIIl[1];
            int IlIIIIIIlIll = lIlIIIIIlIll.readByte();
            if (FastScanner.llIllIllIIIl(IlIIIIIIlIll, IIlllllIIl[6])) {
                llIIIIIIlIll = IIlllllIIl[2];
                IlIIIIIIlIll = lIlIIIIIlIll.readByte();
            }
            if (!FastScanner.IIlllIllIIIl(IlIIIIIIlIll, IIlllllIIl[7]) || FastScanner.IllIlIllIIIl(IIlllllIIl[8], IlIIIIIIlIll)) {
                throw new NumberFormatException();
            }
            do {
                if (FastScanner.lIIllIllIIIl(IIlllllIIl[7], IlIIIIIIlIll) && FastScanner.lIIllIllIIIl(IlIIIIIIlIll, IIlllllIIl[8])) {
                    IIlIIIIIlIll *= 10L;
                    IIlIIIIIlIll += (long)(IlIIIIIIlIll - IIlllllIIl[7]);
                    "".length();
                    if ("   ".length() > "   ".length()) {
                        return 0L;
                    }
                } else {
                    if (!FastScanner.lIlllIllIIIl(IlIIIIIIlIll, IIlllllIIl[3]) || FastScanner.IlIllIllIIIl(FastScanner.isPrintableChar(IlIIIIIIlIll) ? 1 : 0)) {
                        long l;
                        if (FastScanner.IIIllIllIIIl(llIIIIIIlIll)) {
                            l = -IIlIIIIIlIll;
                            "".length();
                            if (-"  ".length() > 0) {
                                return 0L;
                            }
                        } else {
                            l = IIlIIIIIlIll;
                        }
                        return l;
                    }
                    throw new NumberFormatException();
                }
                int n = this.readByte();
                "".length();
            } while ("   ".length() >= (((0x84 ^ 0xA9) << " ".length() ^ (0xE8 ^ 0xB7)) & ((0x26 ^ 0x35) << " ".length() ^ (0x43 ^ 0x60) ^ -" ".length())));
            return 0L;
        }

        /*
         * WARNING - void declaration
         */
        public int nextInt() {
            void var1_1;
            FastScanner llllllllIIll;
            long IlllllllIIll = llllllllIIll.nextLong();
            if (!FastScanner.lllllIllIIIl(FastScanner.IllllIllIIIl(IlllllllIIll, Integer.MIN_VALUE)) || FastScanner.IIIIIlllIIIl(FastScanner.IllllIllIIIl(IlllllllIIll, Integer.MAX_VALUE))) {
                throw new NumberFormatException();
            }
            return (int)var1_1;
        }

        /*
         * WARNING - void declaration
         */
        public int[] nextIntArray(int IIIlllllIIll) {
            void var2_2;
            int[] lllIllllIIll = new int[IIIlllllIIll];
            int IllIllllIIll = IIlllllIIl[1];
            while (FastScanner.IllIlIllIIIl(IllIllllIIll, IIIlllllIIll)) {
                FastScanner lIIlllllIIll;
                lllIllllIIll[IllIllllIIll] = lIIlllllIIll.nextInt();
                ++IllIllllIIll;
                "".length();
                if ("   ".length() < " ".length() << (" ".length() << " ".length())) continue;
                return null;
            }
            return var2_2;
        }

        @Override
        public void close() {
            try {
                FastScanner llIIllllIIll;
                llIIllllIIll.in.close();
                "".length();
            }
            catch (IOException IlIIllllIIll) {
                IlIIllllIIll.printStackTrace();
            }
            if (" ".length() << (" ".length() << " ".length()) <= " ".length()) {
                return;
            }
        }

        static {
            FastScanner.lIlIlIllIIIl();
        }

        private static void lIlIlIllIIIl() {
            IIlllllIIl = new int[9];
            FastScanner.IIlllllIIl[0] = " ".length() << ((0x76 ^ 0x73) << " ".length());
            FastScanner.IIlllllIIl[1] = (3 ^ 0x6A ^ (0xA7 ^ 0xAE) << "   ".length()) << " ".length() & ((153 + 75 - 227 + 154 ^ (0xCE ^ 0x93) << " ".length()) << " ".length() ^ -" ".length());
            FastScanner.IIlllllIIl[2] = " ".length();
            FastScanner.IIlllllIIl[3] = -" ".length();
            FastScanner.IIlllllIIl[4] = 0x4A ^ 0x6B;
            FastScanner.IIlllllIIl[5] = (0x75 ^ 0x4A) << " ".length();
            FastScanner.IIlllllIIl[6] = 0x29 ^ 4;
            FastScanner.IIlllllIIl[7] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
            FastScanner.IIlllllIIl[8] = (0x2E ^ 0x2B) << (0x92 ^ 0x97) ^ 78 + 136 - 135 + 74;
        }

        private static boolean llIllIllIIIl(int n, int n2) {
            return n == n2;
        }

        private static boolean IIlllIllIIIl(int n, int n2) {
            return n >= n2;
        }

        private static boolean IllIlIllIIIl(int n, int n2) {
            return n < n2;
        }

        private static boolean lIIllIllIIIl(int n, int n2) {
            return n <= n2;
        }

        private static boolean IIIllIllIIIl(int n) {
            return n != 0;
        }

        private static boolean IlIllIllIIIl(int n) {
            return n == 0;
        }

        private static boolean lllllIllIIIl(int n) {
            return n >= 0;
        }

        private static boolean lllIlIllIIIl(int n) {
            return n <= 0;
        }

        private static boolean IIIIIlllIIIl(int n) {
            return n > 0;
        }

        private static boolean lIlllIllIIIl(int n, int n2) {
            return n != n2;
        }

        private static int IllllIllIIIl(long l, long l2) {
            return l == l2 ? 0 : (l < l2 ? -1 : 1);
        }
    }

    static class BBitterAlchemy {
        private static int[] IlIllllIIl;

        BBitterAlchemy() {
            BBitterAlchemy IllIIlIIlIll;
        }

        public void solve(int n, FastScanner IllllIIIlIll, PrintWriter lIlllIIIlIll) {
            int IIlllIIIlIll = IllllIIIlIll.nextInt();
            int llIllIIIlIll = IllllIIIlIll.nextInt();
            int[] IlIllIIIlIll = IllllIIIlIll.nextIntArray(IIlllIIIlIll);
            Arrays.sort(IlIllIIIlIll);
            long lIIllIIIlIll = Arrays.stream(IlIllIIIlIll).sum();
            long IIIllIIIlIll = (long)IIlllIIIlIll + ((long)llIllIIIlIll - lIIllIIIlIll) / (long)IlIllIIIlIll[IlIllllIIl[0]];
            lIlllIIIlIll.println(IIIllIIIlIll);
        }

        static {
            BBitterAlchemy.IIlIlIllIIIl();
        }

        private static void IIlIlIllIIIl() {
            IlIllllIIl = new int[1];
            BBitterAlchemy.IlIllllIIl[0] = (0xF5 ^ 0xC4) << " ".length() & ~((0x71 ^ 0x40) << " ".length());
        }
    }
}

