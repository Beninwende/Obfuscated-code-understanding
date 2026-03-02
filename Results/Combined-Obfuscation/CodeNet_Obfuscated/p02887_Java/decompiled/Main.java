/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class Main {
    static FastScanner sc;
    static PrintWriter out;
    private static int[] IlIIlIIIIl;

    public Main() {
        Main lllIlIIlIIlll;
    }

    public static void main(String[] stringArray) {
        int IIIIlIIlIIlll = sc.nextInt();
        String llllIIIlIIlll = sc.next();
        int IlllIIIlIIlll = IlIIlIIIIl[0];
        char lIllIIIlIIlll = llllIIIlIIlll.charAt(IlIIlIIIIl[1]);
        int IIllIIIlIIlll = IlIIlIIIIl[0];
        while (Main.lIllllIIlll(IIllIIIlIIlll, IIIIlIIlIIlll)) {
            char llIlIIIlIIlll = llllIIIlIIlll.charAt(IIllIIIlIIlll);
            if (Main.IlllllIIlll(lIllIIIlIIlll, llIlIIIlIIlll)) {
                ++IlllIIIlIIlll;
            }
            lIllIIIlIIlll = llIlIIIlIIlll;
            ++IIllIIIlIIlll;
            "".length();
            if (" ".length() << (" ".length() << " ".length()) == " ".length() << (" ".length() << " ".length())) continue;
            return;
        }
        out.println(IlllIIIlIIlll);
        out.flush();
    }

    static {
        Main.IIllllIIlll();
        sc = new FastScanner();
        out = new PrintWriter(System.out);
    }

    private static void IIllllIIlll() {
        IlIIlIIIIl = new int[2];
        Main.IlIIlIIIIl[0] = " ".length();
        Main.IlIIlIIIIl[1] = (0x2F ^ 0xA) & ~(0x80 ^ 0xA5);
    }

    private static boolean lIllllIIlll(int n, int n2) {
        return n < n2;
    }

    private static boolean IlllllIIlll(int n, int n2) {
        return n != n2;
    }

    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[lIlIlIIIIl[0]];
        private int ptr = lIlIlIIIIl[1];
        private int buflen = lIlIlIIIIl[1];
        private static int[] lIlIlIIIIl;

        FastScanner() {
            FastScanner lIIIIIIlIIlll;
        }

        private boolean hasNextByte() {
            FastScanner IllllllIIIlll;
            if (FastScanner.IIlIIIlIlll(IllllllIIIlll.ptr, IllllllIIIlll.buflen)) {
                return lIlIlIIIIl[2];
            }
            IllllllIIIlll.ptr = lIlIlIIIIl[1];
            try {
                IllllllIIIlll.buflen = IllllllIIIlll.in.read(IllllllIIIlll.buffer);
                "".length();
            }
            catch (IOException lIlllllIIIlll) {
                lIlllllIIIlll.printStackTrace();
            }
            if (-" ".length() > 0) {
                return ((0x54 ^ 0x5D) << "   ".length() & ~((0x44 ^ 0x4D) << "   ".length())) != 0;
            }
            if (FastScanner.lIlIIIlIlll(IllllllIIIlll.buflen)) {
                return lIlIlIIIIl[1];
            }
            return lIlIlIIIIl[2];
        }

        private int readByte() {
            FastScanner llIllllIIIlll;
            if (FastScanner.IllIIIlIlll(llIllllIIIlll.hasNextByte() ? 1 : 0)) {
                int n = llIllllIIIlll.ptr;
                llIllllIIIlll.ptr = n + lIlIlIIIIl[2];
                return llIllllIIIlll.buffer[n];
            }
            return lIlIlIIIIl[3];
        }

        private static boolean isPrintableChar(int lIIllllIIIlll) {
            int n;
            if (FastScanner.lllIIIlIlll(lIlIlIIIIl[4], lIIllllIIIlll) && FastScanner.lllIIIlIlll(lIIllllIIIlll, lIlIlIIIIl[5])) {
                n = lIlIlIIIIl[2];
                "".length();
                if (null != null) {
                    return (" ".length() << " ".length() & ~(" ".length() << " ".length())) != 0;
                }
            } else {
                n = lIlIlIIIIl[1];
            }
            return n != 0;
        }

        private void skipUnprintable() {
            FastScanner lllIlllIIIlll;
            while (FastScanner.IllIIIlIlll(lllIlllIIIlll.hasNextByte() ? 1 : 0) && FastScanner.IIIlIIlIlll(FastScanner.isPrintableChar(lllIlllIIIlll.buffer[lllIlllIIIlll.ptr]) ? 1 : 0)) {
                lllIlllIIIlll.ptr += lIlIlIIIIl[2];
                "".length();
                if (" ".length() << (" ".length() << " ".length()) >= 0) continue;
                return;
            }
        }

        public boolean hasNext() {
            FastScanner lIlIlllIIIlll;
            lIlIlllIIIlll.skipUnprintable();
            return this.hasNextByte();
        }

        /*
         * WARNING - void declaration
         */
        public String next() {
            void var1_1;
            FastScanner lIIIlllIIIlll;
            if (FastScanner.IIIlIIlIlll(lIIIlllIIIlll.hasNext() ? 1 : 0)) {
                throw new NoSuchElementException();
            }
            StringBuilder IIIIlllIIIlll = new StringBuilder();
            int llllIllIIIlll = lIIIlllIIIlll.readByte();
            while (FastScanner.IllIIIlIlll(FastScanner.isPrintableChar(llllIllIIIlll) ? 1 : 0)) {
                IIIIlllIIIlll.appendCodePoint(llllIllIIIlll);
                "".length();
                llllIllIIIlll = lIIIlllIIIlll.readByte();
                "".length();
                if (-((0x23 ^ 0x40) << " ".length() ^ (0xFA ^ 0x9B) << " ".length()) <= 0) continue;
                return null;
            }
            return String.valueOf(var1_1);
        }

        public long nextLong() {
            FastScanner IlIlIllIIIlll;
            if (FastScanner.IIIlIIlIlll(IlIlIllIIIlll.hasNext() ? 1 : 0)) {
                throw new NoSuchElementException();
            }
            long lIIlIllIIIlll = 0L;
            int IIIlIllIIIlll = lIlIlIIIIl[1];
            int lllIIllIIIlll = IlIlIllIIIlll.readByte();
            if (FastScanner.lIIlIIlIlll(lllIIllIIIlll, lIlIlIIIIl[6])) {
                IIIlIllIIIlll = lIlIlIIIIl[2];
                lllIIllIIIlll = IlIlIllIIIlll.readByte();
            }
            if (!FastScanner.IlIlIIlIlll(lllIIllIIIlll, lIlIlIIIIl[7]) || FastScanner.IIlIIIlIlll(lIlIlIIIIl[8], lllIIllIIIlll)) {
                throw new NumberFormatException();
            }
            do {
                if (FastScanner.lllIIIlIlll(lIlIlIIIIl[7], lllIIllIIIlll) && FastScanner.lllIIIlIlll(lllIIllIIIlll, lIlIlIIIIl[8])) {
                    lIIlIllIIIlll *= 10L;
                    lIIlIllIIIlll += (long)(lllIIllIIIlll - lIlIlIIIIl[7]);
                    "".length();
                    if ("   ".length() == " ".length()) {
                        return 0L;
                    }
                } else {
                    if (!FastScanner.llIlIIlIlll(lllIIllIIIlll, lIlIlIIIIl[3]) || FastScanner.IIIlIIlIlll(FastScanner.isPrintableChar(lllIIllIIIlll) ? 1 : 0)) {
                        long l;
                        if (FastScanner.IllIIIlIlll(IIIlIllIIIlll)) {
                            l = -lIIlIllIIIlll;
                            "".length();
                            if (null != null) {
                                return 0L;
                            }
                        } else {
                            l = lIIlIllIIIlll;
                        }
                        return l;
                    }
                    throw new NumberFormatException();
                }
                int n = this.readByte();
                "".length();
            } while (" ".length() >= 0);
            return 0L;
        }

        public int nextInt() {
            FastScanner lIlIIllIIIlll;
            return (int)lIlIIllIIIlll.nextLong();
        }

        /*
         * WARNING - void declaration
         */
        public int[] nextIntArray(int IIIIIllIIIlll, boolean lllllIlIIIlll) {
            void var3_4;
            if (FastScanner.IllIIIlIlll(lllllIlIIIlll ? 1 : 0)) {
                int[] IllllIlIIIlll = new int[IIIIIllIIIlll + lIlIlIIIIl[2]];
                int lIlllIlIIIlll = lIlIlIIIIl[2];
                while (FastScanner.lllIIIlIlll(lIlllIlIIIlll, IIIIIllIIIlll)) {
                    IllllIlIIIlll[lIlllIlIIIlll] = sc.nextInt();
                    ++lIlllIlIIIlll;
                    "".length();
                    if (" ".length() << (" ".length() << " ".length()) != 0) continue;
                    return null;
                }
                return IllllIlIIIlll;
            }
            int[] IllllIlIIIlll = new int[IIIIIllIIIlll];
            int lIlllIlIIIlll = lIlIlIIIIl[1];
            while (FastScanner.IIlIIIlIlll(lIlllIlIIIlll, IIIIIllIIIlll)) {
                IllllIlIIIlll[lIlllIlIIIlll] = sc.nextInt();
                ++lIlllIlIIIlll;
                "".length();
                if (-" ".length() < " ".length() << (" ".length() << " ".length())) continue;
                return null;
            }
            return var3_4;
        }

        /*
         * WARNING - void declaration
         */
        public long[] nextLongArray(int IIIllIlIIIlll, boolean lllIlIlIIIlll) {
            void var3_4;
            if (FastScanner.IllIIIlIlll(lllIlIlIIIlll ? 1 : 0)) {
                long[] IllIlIlIIIlll = new long[IIIllIlIIIlll + lIlIlIIIIl[2]];
                int lIlIlIlIIIlll = lIlIlIIIIl[2];
                while (FastScanner.lllIIIlIlll(lIlIlIlIIIlll, IIIllIlIIIlll)) {
                    IllIlIlIIIlll[lIlIlIlIIIlll] = sc.nextLong();
                    ++lIlIlIlIIIlll;
                    "".length();
                    if (-" ".length() != "   ".length()) continue;
                    return null;
                }
                return IllIlIlIIIlll;
            }
            long[] IllIlIlIIIlll = new long[IIIllIlIIIlll];
            int lIlIlIlIIIlll = lIlIlIIIIl[1];
            while (FastScanner.IIlIIIlIlll(lIlIlIlIIIlll, IIIllIlIIIlll)) {
                IllIlIlIIIlll[lIlIlIlIIIlll] = sc.nextLong();
                ++lIlIlIlIIIlll;
                "".length();
                if (((0x7C ^ 0x75) << "   ".length() & ~((0x94 ^ 0x9D) << "   ".length())) == 0) continue;
                return null;
            }
            return var3_4;
        }

        static {
            FastScanner.llIIIIlIlll();
        }

        private static void llIIIIlIlll() {
            lIlIlIIIIl = new int[9];
            FastScanner.lIlIlIIIIl[0] = " ".length() << ((0xF0 ^ 0xB3 ^ (0x55 ^ 0x76) << " ".length()) << " ".length());
            FastScanner.lIlIlIIIIl[1] = " ".length() << (" ".length() << (" ".length() << " ".length())) & ~(" ".length() << (" ".length() << (" ".length() << " ".length())));
            FastScanner.lIlIlIIIIl[2] = " ".length();
            FastScanner.lIlIlIIIIl[3] = -" ".length();
            FastScanner.lIlIlIIIIl[4] = 0xAB ^ 0x8A;
            FastScanner.lIlIlIIIIl[5] = (0xF ^ 0x30) << " ".length();
            FastScanner.lIlIlIIIIl[6] = (0xB3 ^ 0x9A) << (" ".length() << " ".length()) ^ 47 + 91 - 49 + 48;
            FastScanner.lIlIlIIIIl[7] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
            FastScanner.lIlIlIIIIl[8] = 0x90 ^ 0xA9;
        }

        private static boolean lIIlIIlIlll(int n, int n2) {
            return n == n2;
        }

        private static boolean IlIlIIlIlll(int n, int n2) {
            return n >= n2;
        }

        private static boolean IIlIIIlIlll(int n, int n2) {
            return n < n2;
        }

        private static boolean lllIIIlIlll(int n, int n2) {
            return n <= n2;
        }

        private static boolean IllIIIlIlll(int n) {
            return n != 0;
        }

        private static boolean IIIlIIlIlll(int n) {
            return n == 0;
        }

        private static boolean lIlIIIlIlll(int n) {
            return n <= 0;
        }

        private static boolean llIlIIlIlll(int n, int n2) {
            return n != n2;
        }
    }
}

