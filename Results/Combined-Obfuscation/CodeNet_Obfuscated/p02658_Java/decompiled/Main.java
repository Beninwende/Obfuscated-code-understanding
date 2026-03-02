/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {
    static FastScanner sc;
    static PrintWriter out;
    static int n;
    static String s;
    static final long lim = 1000000000000000000L;
    private static int[] IIlIIlIIll;

    public Main() {
        Main IllIllIIIIlIlll;
    }

    public static void main(String[] stringArray) {
        n = sc.nextInt();
        long[] IIIIllIIIIlIlll = sc.nextLongArray(n, IIlIIlIIll[0]);
        Arrays.sort(IIIIllIIIIlIlll);
        if (Main.llIlIllIllIl(Main.IlIlIllIllIl(IIIIllIIIIlIlll[IIlIIlIIll[0]], 0L))) {
            out.println(IIlIIlIIll[0]);
            "".length();
            if ((((0x90 ^ 0x8D) << " ".length() ^ (0xE9 ^ 0xC2)) << " ".length() & (((0x72 ^ 0x5D) << " ".length() ^ (0x5E ^ 0x11)) << " ".length() ^ -" ".length())) >= " ".length() << (" ".length() << " ".length())) {
                return;
            }
        } else {
            long llllIlIIIIlIlll = IIIIllIIIIlIlll[IIlIIlIIll[0]];
            int IlllIlIIIIlIlll = IIlIIlIIll[1];
            int lIllIlIIIIlIlll = IIlIIlIIll[1];
            while (Main.IIllIllIllIl(lIllIlIIIIlIlll, n)) {
                long IIllIlIIIIlIlll = IIIIllIIIIlIlll[lIllIlIIIIlIlll];
                if (Main.lIllIllIllIl(Main.IlIlIllIllIl(IIllIlIIIIlIlll, 1000000000000000000L / llllIlIIIIlIlll))) {
                    llllIlIIIIlIlll *= IIllIlIIIIlIlll;
                    "".length();
                    if (null != null) {
                        return;
                    }
                } else {
                    IlllIlIIIIlIlll = IIlIIlIIll[0];
                    "".length();
                    if (-(0x7F ^ 0x7A) < 0) break;
                    return;
                }
                ++lIllIlIIIIlIlll;
                "".length();
                if (-(0xAD ^ 0xA9) <= 0) continue;
                return;
            }
            if (Main.IlllIllIllIl(IlllIlIIIIlIlll)) {
                out.println(llllIlIIIIlIlll);
                "".length();
                if (((0xAF ^ 0x90) & ~(0xBA ^ 0x85)) >= " ".length()) {
                    return;
                }
            } else {
                out.println(IIlIIlIIll[2]);
            }
        }
        out.flush();
    }

    static {
        Main.lIIlIllIllIl();
        sc = new FastScanner();
        out = new PrintWriter(System.out);
    }

    private static void lIIlIllIllIl() {
        IIlIIlIIll = new int[3];
        Main.IIlIIlIIll[0] = (0xC ^ 0x1D) << (" ".length() << " ".length()) & ~((0xE ^ 0x1F) << (" ".length() << " ".length()));
        Main.IIlIIlIIll[1] = " ".length();
        Main.IIlIIlIIll[2] = -" ".length();
    }

    private static boolean IIllIllIllIl(int n, int n2) {
        return n < n2;
    }

    private static boolean IlllIllIllIl(int n) {
        return n != 0;
    }

    private static boolean llIlIllIllIl(int n) {
        return n == 0;
    }

    private static boolean lIllIllIllIl(int n) {
        return n <= 0;
    }

    private static int IlIlIllIllIl(long l, long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[lIIlIlIIll[0]];
        private int ptr = lIIlIlIIll[1];
        private int buflen = lIIlIlIIll[1];
        private static int[] lIIlIlIIll;

        FastScanner() {
            FastScanner IIlIlIIIIIlIlll;
        }

        private boolean hasNextByte() {
            FastScanner lIIIlIIIIIlIlll;
            if (FastScanner.IlIIlllIllIl(lIIIlIIIIIlIlll.ptr, lIIIlIIIIIlIlll.buflen)) {
                return lIIlIlIIll[2];
            }
            lIIIlIIIIIlIlll.ptr = lIIlIlIIll[1];
            try {
                lIIIlIIIIIlIlll.buflen = lIIIlIIIIIlIlll.in.read(lIIIlIIIIIlIlll.buffer);
                "".length();
            }
            catch (IOException IIIIlIIIIIlIlll) {
                IIIIlIIIIIlIlll.printStackTrace();
            }
            if (null != null) {
                return (((0x29 ^ 0x2C) << (0xA0 ^ 0xA5) ^ 127 + 63 - 122 + 101) & (98 + 142 - 165 + 98 ^ (0x5F ^ 0x76) << (" ".length() << " ".length()) ^ -" ".length())) != 0;
            }
            if (FastScanner.llIIlllIllIl(lIIIlIIIIIlIlll.buflen)) {
                return lIIlIlIIll[1];
            }
            return lIIlIlIIll[2];
        }

        private int readByte() {
            FastScanner IlllIIIIIIlIlll;
            if (FastScanner.IIlIlllIllIl(IlllIIIIIIlIlll.hasNextByte() ? 1 : 0)) {
                int n = IlllIIIIIIlIlll.ptr;
                IlllIIIIIIlIlll.ptr = n + lIIlIlIIll[2];
                return IlllIIIIIIlIlll.buffer[n];
            }
            return lIIlIlIIll[3];
        }

        private static boolean isPrintableChar(int IIllIIIIIIlIlll) {
            int n;
            if (FastScanner.lIlIlllIllIl(lIIlIlIIll[4], IIllIIIIIIlIlll) && FastScanner.lIlIlllIllIl(IIllIIIIIIlIlll, lIIlIlIIll[5])) {
                n = lIIlIlIIll[2];
                "".length();
                if (((0x57 ^ 0x1A ^ (0xD3 ^ 0xC2) << (" ".length() << " ".length())) & (62 + 92 - 59 + 46 ^ (0x88 ^ 0xA9) << (" ".length() << " ".length()) ^ -" ".length())) >= " ".length()) {
                    return ((0x55 ^ 0x7A ^ (0x54 ^ 0x4F) << " ".length()) & (12 + 120 - 107 + 112 ^ (0x90 ^ 0x99) << (" ".length() << (" ".length() << " ".length())) ^ -" ".length())) != 0;
                }
            } else {
                n = lIIlIlIIll[1];
            }
            return n != 0;
        }

        private void skipUnprintable() {
            FastScanner IlIlIIIIIIlIlll;
            while (FastScanner.IIlIlllIllIl(IlIlIIIIIIlIlll.hasNextByte() ? 1 : 0) && FastScanner.lllIlllIllIl(FastScanner.isPrintableChar(IlIlIIIIIIlIlll.buffer[IlIlIIIIIIlIlll.ptr]) ? 1 : 0)) {
                IlIlIIIIIIlIlll.ptr += lIIlIlIIll[2];
                "".length();
                if (" ".length() << " ".length() < "   ".length()) continue;
                return;
            }
        }

        public boolean hasNext() {
            FastScanner IIIlIIIIIIlIlll;
            IIIlIIIIIIlIlll.skipUnprintable();
            return this.hasNextByte();
        }

        /*
         * WARNING - void declaration
         */
        public String next() {
            void var1_1;
            FastScanner IIlIIIIIIIlIlll;
            if (FastScanner.lllIlllIllIl(IIlIIIIIIIlIlll.hasNext() ? 1 : 0)) {
                throw new NoSuchElementException();
            }
            StringBuilder llIIIIIIIIlIlll = new StringBuilder();
            int IlIIIIIIIIlIlll = IIlIIIIIIIlIlll.readByte();
            while (FastScanner.IIlIlllIllIl(FastScanner.isPrintableChar(IlIIIIIIIIlIlll) ? 1 : 0)) {
                llIIIIIIIIlIlll.appendCodePoint(IlIIIIIIIIlIlll);
                "".length();
                IlIIIIIIIIlIlll = IIlIIIIIIIlIlll.readByte();
                "".length();
                if (" ".length() == " ".length()) continue;
                return null;
            }
            return String.valueOf(var1_1);
        }

        public long nextLong() {
            FastScanner lIllllllllIIlll;
            if (FastScanner.lllIlllIllIl(lIllllllllIIlll.hasNext() ? 1 : 0)) {
                throw new NoSuchElementException();
            }
            long IIllllllllIIlll = 0L;
            int llIlllllllIIlll = lIIlIlIIll[1];
            int IlIlllllllIIlll = lIllllllllIIlll.readByte();
            if (FastScanner.IIIllllIllIl(IlIlllllllIIlll, lIIlIlIIll[6])) {
                llIlllllllIIlll = lIIlIlIIll[2];
                IlIlllllllIIlll = lIllllllllIIlll.readByte();
            }
            if (!FastScanner.lIIllllIllIl(IlIlllllllIIlll, lIIlIlIIll[7]) || FastScanner.IlIIlllIllIl(lIIlIlIIll[8], IlIlllllllIIlll)) {
                throw new NumberFormatException();
            }
            do {
                if (FastScanner.lIlIlllIllIl(lIIlIlIIll[7], IlIlllllllIIlll) && FastScanner.lIlIlllIllIl(IlIlllllllIIlll, lIIlIlIIll[8])) {
                    IIllllllllIIlll *= 10L;
                    IIllllllllIIlll += (long)(IlIlllllllIIlll - lIIlIlIIll[7]);
                    "".length();
                    if (-" ".length() >= 0) {
                        return 0L;
                    }
                } else {
                    if (!FastScanner.IlIllllIllIl(IlIlllllllIIlll, lIIlIlIIll[3]) || FastScanner.lllIlllIllIl(FastScanner.isPrintableChar(IlIlllllllIIlll) ? 1 : 0)) {
                        long l;
                        if (FastScanner.IIlIlllIllIl(llIlllllllIIlll)) {
                            l = -IIllllllllIIlll;
                            "".length();
                            if (-"  ".length() > 0) {
                                return 0L;
                            }
                        } else {
                            l = IIllllllllIIlll;
                        }
                        return l;
                    }
                    throw new NumberFormatException();
                }
                int n = this.readByte();
                "".length();
            } while (null == null);
            return 0L;
        }

        public int nextInt() {
            FastScanner IIIlllllllIIlll;
            return (int)IIIlllllllIIlll.nextLong();
        }

        public double nextDouble() {
            FastScanner IllIllllllIIlll;
            return Double.parseDouble(IllIllllllIIlll.next());
        }

        /*
         * WARNING - void declaration
         */
        public int[] nextIntArray(int lIIIllllllIIlll, boolean IIIIllllllIIlll) {
            void var3_4;
            if (FastScanner.IIlIlllIllIl(IIIIllllllIIlll ? 1 : 0)) {
                int[] llllIlllllIIlll = new int[lIIIllllllIIlll + lIIlIlIIll[2]];
                int IlllIlllllIIlll = lIIlIlIIll[2];
                while (FastScanner.lIlIlllIllIl(IlllIlllllIIlll, lIIIllllllIIlll)) {
                    llllIlllllIIlll[IlllIlllllIIlll] = sc.nextInt();
                    ++IlllIlllllIIlll;
                    "".length();
                    if (" ".length() << (" ".length() << " ".length()) >= 0) continue;
                    return null;
                }
                return llllIlllllIIlll;
            }
            int[] llllIlllllIIlll = new int[lIIIllllllIIlll];
            int IlllIlllllIIlll = lIIlIlIIll[1];
            while (FastScanner.IlIIlllIllIl(IlllIlllllIIlll, lIIIllllllIIlll)) {
                llllIlllllIIlll[IlllIlllllIIlll] = sc.nextInt();
                ++IlllIlllllIIlll;
                "".length();
                if (((0xF9 ^ 0xB2) & ~(0x51 ^ 0x1A)) == 0) continue;
                return null;
            }
            return var3_4;
        }

        /*
         * WARNING - void declaration
         */
        public long[] nextLongArray(int lIIlIlllllIIlll, boolean IIIlIlllllIIlll) {
            void var3_4;
            if (FastScanner.IIlIlllIllIl(IIIlIlllllIIlll ? 1 : 0)) {
                long[] lllIIlllllIIlll = new long[lIIlIlllllIIlll + lIIlIlIIll[2]];
                int IllIIlllllIIlll = lIIlIlIIll[2];
                while (FastScanner.lIlIlllIllIl(IllIIlllllIIlll, lIIlIlllllIIlll)) {
                    lllIIlllllIIlll[IllIIlllllIIlll] = sc.nextLong();
                    ++IllIIlllllIIlll;
                    "".length();
                    if (((0x42 ^ 0x5F) & ~(0x15 ^ 8)) <= " ".length() << (" ".length() << " ".length())) continue;
                    return null;
                }
                return lllIIlllllIIlll;
            }
            long[] lllIIlllllIIlll = new long[lIIlIlllllIIlll];
            int IllIIlllllIIlll = lIIlIlIIll[1];
            while (FastScanner.IlIIlllIllIl(IllIIlllllIIlll, lIIlIlllllIIlll)) {
                lllIIlllllIIlll[IllIIlllllIIlll] = sc.nextLong();
                ++IllIIlllllIIlll;
                "".length();
                if (" ".length() << (" ".length() << " ".length()) > 0) continue;
                return null;
            }
            return var3_4;
        }

        static {
            FastScanner.lIIIlllIllIl();
        }

        private static void lIIIlllIllIl() {
            lIIlIlIIll = new int[9];
            FastScanner.lIIlIlIIll[0] = " ".length() << ((121 + 135 - 108 + 25 ^ (0xA6 ^ 0xB3) << "   ".length()) << " ".length());
            FastScanner.lIIlIlIIll[1] = (0xC ^ 0x13) << " ".length() & ~((0x84 ^ 0x9B) << " ".length());
            FastScanner.lIIlIlIIll[2] = " ".length();
            FastScanner.lIIlIlIIll[3] = -" ".length();
            FastScanner.lIIlIlIIll[4] = " ".length() << (" ".length() << (" ".length() << " ".length())) ^ (0x25 ^ 0x14);
            FastScanner.lIIlIlIIll[5] = (0xA3 ^ 0x9C) << " ".length();
            FastScanner.lIIlIlIIll[6] = 0x75 ^ 0x58;
            FastScanner.lIIlIlIIll[7] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
            FastScanner.lIIlIlIIll[8] = 0x23 ^ 0x12 ^ " ".length() << "   ".length();
        }

        private static boolean IIIllllIllIl(int n, int n2) {
            return n == n2;
        }

        private static boolean lIIllllIllIl(int n, int n2) {
            return n >= n2;
        }

        private static boolean IlIIlllIllIl(int n, int n2) {
            return n < n2;
        }

        private static boolean lIlIlllIllIl(int n, int n2) {
            return n <= n2;
        }

        private static boolean IIlIlllIllIl(int n) {
            return n != 0;
        }

        private static boolean lllIlllIllIl(int n) {
            return n == 0;
        }

        private static boolean llIIlllIllIl(int n) {
            return n <= 0;
        }

        private static boolean IlIllllIllIl(int n, int n2) {
            return n != n2;
        }
    }
}

