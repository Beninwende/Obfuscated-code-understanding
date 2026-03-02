/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {
    private static int[] IllIIlll;

    public Main() {
        Main lllIIIIIllllll;
    }

    public static void main(String[] stringArray) {
        FastScanner IIlIIIIIllllll = new FastScanner();
        int llIIIIIIllllll = IIlIIIIIllllll.nextInt();
        System.out.println((double)(llIIIIIIllllll * IllIIlll[0]) * 3.141592);
    }

    /*
     * WARNING - void declaration
     */
    private static int gcd(int lIllllllIlllll, int IIllllllIlllll) {
        void var3_3;
        int lIIlllllIlllll;
        int IlIlllllIlllll;
        int llIlllllIlllll;
        if (Main.IllIIIIIll(lIllllllIlllll, IIllllllIlllll)) {
            llIlllllIlllll = lIllllllIlllll;
            IlIlllllIlllll = IIllllllIlllll;
            "".length();
            if (-" ".length() >= ("   ".length() << " ".length() & ~("   ".length() << " ".length()))) {
                return (0x7F ^ 0x38) & ~(0x83 ^ 0xC4);
            }
        } else {
            llIlllllIlllll = IIllllllIlllll;
            IlIlllllIlllll = lIllllllIlllll;
        }
        while (Main.lllIIIIIll(lIIlllllIlllll = llIlllllIlllll % IlIlllllIlllll)) {
            llIlllllIlllll = IlIlllllIlllll;
            IlIlllllIlllll = lIIlllllIlllll;
            "".length();
            if ("   ".length() != 0) continue;
            return (0x67 ^ 0x4C) & ~(0x85 ^ 0xAE);
        }
        return (int)var3_3;
    }

    static {
        Main.lIlIIIIIll();
    }

    private static void lIlIIIIIll() {
        IllIIlll = new int[1];
        Main.IllIIlll[0] = " ".length() << " ".length();
    }

    private static boolean IllIIIIIll(int n, int n2) {
        return n > n2;
    }

    private static boolean lllIIIIIll(int n) {
        return n != 0;
    }

    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[IIIlIlll[0]];
        private int ptr = IIIlIlll[1];
        private int bufferLength = IIIlIlll[1];
        private static int[] IIIlIlll;

        FastScanner() {
            FastScanner lIIIllllIlllll;
        }

        private boolean hasNextByte() {
            boolean bl;
            FastScanner IlllIlllIlllll;
            if (FastScanner.lIIlIIIIll(IlllIlllIlllll.ptr, IlllIlllIlllll.bufferLength)) {
                return IIIlIlll[2];
            }
            IlllIlllIlllll.ptr = IIIlIlll[1];
            try {
                IlllIlllIlllll.bufferLength = IlllIlllIlllll.in.read(IlllIlllIlllll.buffer);
                "".length();
            }
            catch (IOException lIllIlllIlllll) {
                lIllIlllIlllll.printStackTrace();
            }
            if (-" ".length() > 0) {
                return ((0x34 ^ 0x1D) & ~(0xA7 ^ 0x8E)) != 0;
            }
            if (FastScanner.IlIlIIIIll(IlllIlllIlllll.bufferLength)) {
                bl = IIIlIlll[2];
                "".length();
                if (null != null) {
                    return ((6 ^ 9) & ~(0x23 ^ 0x2C)) != 0;
                }
            } else {
                bl = IIIlIlll[1];
            }
            return bl;
        }

        private int readByte() {
            FastScanner llIlIlllIlllll;
            if (FastScanner.llIlIIIIll(llIlIlllIlllll.hasNextByte() ? 1 : 0)) {
                int n = llIlIlllIlllll.ptr;
                llIlIlllIlllll.ptr = n + IIIlIlll[2];
                return llIlIlllIlllll.buffer[n];
            }
            return IIIlIlll[3];
        }

        private static boolean isPrintableChar(int lIIlIlllIlllll) {
            int n;
            if (FastScanner.IIllIIIIll(IIIlIlll[4], lIIlIlllIlllll) && FastScanner.IIllIIIIll(lIIlIlllIlllll, IIIlIlll[5])) {
                n = IIIlIlll[2];
                "".length();
                if (((" ".length() << (0x64 ^ 0x63) ^ 117 + 79 - 177 + 122) << " ".length() & ((0x74 ^ 0x6F ^ (0x2B ^ 0x20) << " ".length()) << " ".length() ^ -" ".length())) != 0) {
                    return (" ".length() << (" ".length() << " ".length()) & (" ".length() << (" ".length() << " ".length()) ^ -" ".length())) != 0;
                }
            } else {
                n = IIIlIlll[1];
            }
            return n != 0;
        }

        boolean hasNext() {
            FastScanner lllIIlllIlllll;
            while (FastScanner.llIlIIIIll(lllIIlllIlllll.hasNextByte() ? 1 : 0) && FastScanner.lIllIIIIll(FastScanner.isPrintableChar(lllIIlllIlllll.buffer[lllIIlllIlllll.ptr]) ? 1 : 0)) {
                lllIIlllIlllll.ptr += IIIlIlll[2];
                "".length();
                if (((0xAD ^ 0xA8) << "   ".length() & ~((0xBC ^ 0xB9) << "   ".length())) >= -" ".length()) continue;
                return ((0x56 ^ 0x79) << " ".length() & ~((0x52 ^ 0x7D) << " ".length())) != 0;
            }
            return this.hasNextByte();
        }

        /*
         * WARNING - void declaration
         */
        String next() {
            void var1_1;
            FastScanner llIIIlllIlllll;
            if (FastScanner.lIllIIIIll(llIIIlllIlllll.hasNext() ? 1 : 0)) {
                throw new NoSuchElementException();
            }
            StringBuilder IlIIIlllIlllll = new StringBuilder();
            int lIIIIlllIlllll = llIIIlllIlllll.readByte();
            while (FastScanner.llIlIIIIll(FastScanner.isPrintableChar(lIIIIlllIlllll) ? 1 : 0)) {
                IlIIIlllIlllll.appendCodePoint(lIIIIlllIlllll);
                "".length();
                lIIIIlllIlllll = llIIIlllIlllll.readByte();
                "".length();
                if (-"  ".length() <= 0) continue;
                return null;
            }
            return String.valueOf(var1_1);
        }

        long nextLong() {
            FastScanner IIlllIllIlllll;
            if (FastScanner.lIllIIIIll(IIlllIllIlllll.hasNext() ? 1 : 0)) {
                throw new NoSuchElementException();
            }
            long llIllIllIlllll = 0L;
            int IlIllIllIlllll = IIIlIlll[1];
            int lIIllIllIlllll = IIlllIllIlllll.readByte();
            if (FastScanner.IlllIIIIll(lIIllIllIlllll, IIIlIlll[6])) {
                IlIllIllIlllll = IIIlIlll[2];
                lIIllIllIlllll = IIlllIllIlllll.readByte();
            }
            if (!FastScanner.llllIIIIll(lIIllIllIlllll, IIIlIlll[7]) || FastScanner.lIIlIIIIll(IIIlIlll[8], lIIllIllIlllll)) {
                throw new NumberFormatException();
            }
            do {
                if (FastScanner.IIllIIIIll(IIIlIlll[7], lIIllIllIlllll) && FastScanner.IIllIIIIll(lIIllIllIlllll, IIIlIlll[8])) {
                    llIllIllIlllll *= 10L;
                    llIllIllIlllll += (long)(lIIllIllIlllll - IIIlIlll[7]);
                    "".length();
                    if ((((0x12 ^ 0x2B) << " ".length() ^ (0xB5 ^ 0xA6)) & (212 + 8 - 168 + 175 ^ (0x33 ^ 0x72) << " ".length() ^ -" ".length())) > 0) {
                        return 0L;
                    }
                } else {
                    if (!FastScanner.IIIIlIIIll(lIIllIllIlllll, IIIlIlll[3]) || FastScanner.lIllIIIIll(FastScanner.isPrintableChar(lIIllIllIlllll) ? 1 : 0)) {
                        long l;
                        if (FastScanner.llIlIIIIll(IlIllIllIlllll)) {
                            l = -llIllIllIlllll;
                            "".length();
                            if (null != null) {
                                return 0L;
                            }
                        } else {
                            l = llIllIllIlllll;
                        }
                        return l;
                    }
                    throw new NumberFormatException();
                }
                int n = this.readByte();
                "".length();
            } while (" ".length() != (((0x6D ^ 0x7A) << "   ".length() ^ 17 + 43 - -94 + 13) << " ".length() & ((0x82 ^ 0x85 ^ "   ".length() << "   ".length()) << " ".length() ^ -" ".length())));
            return 0L;
        }

        /*
         * WARNING - void declaration
         */
        public int nextInt() {
            void var1_1;
            FastScanner IllIlIllIlllll;
            long lIlIlIllIlllll = IllIlIllIlllll.nextLong();
            if (!FastScanner.IlIIlIIIll(FastScanner.lIIIlIIIll(lIlIlIllIlllll, Integer.MIN_VALUE)) || FastScanner.IlIlIIIIll(FastScanner.lIIIlIIIll(lIlIlIllIlllll, Integer.MAX_VALUE))) {
                throw new NumberFormatException();
            }
            return (int)var1_1;
        }

        public double nextDouble() {
            FastScanner llIIlIllIlllll;
            return Double.parseDouble(llIIlIllIlllll.next());
        }

        static {
            FastScanner.IIIlIIIIll();
        }

        private static void IIIlIIIIll() {
            IIIlIlll = new int[9];
            FastScanner.IIIlIlll[0] = " ".length() << ((0x49 ^ 0x4C) << " ".length());
            FastScanner.IIIlIlll[1] = (0x3D ^ 0x1A ^ (0x33 ^ 0x2A) << " ".length()) & ((0x88 ^ 0xA9) << (" ".length() << " ".length()) ^ 143 + 97 - 130 + 35 ^ -" ".length());
            FastScanner.IIIlIlll[2] = " ".length();
            FastScanner.IIIlIlll[3] = -" ".length();
            FastScanner.IIIlIlll[4] = 0x85 ^ 0xA4;
            FastScanner.IIIlIlll[5] = (" ".length() << (0x6C ^ 0x6B) ^ 6 + 81 - -83 + 21) << " ".length();
            FastScanner.IIIlIlll[6] = 0x59 ^ 0x74;
            FastScanner.IIIlIlll[7] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
            FastScanner.IIIlIlll[8] = 0x3B ^ 2;
        }

        private static boolean IlllIIIIll(int n, int n2) {
            return n == n2;
        }

        private static boolean llllIIIIll(int n, int n2) {
            return n >= n2;
        }

        private static boolean lIIlIIIIll(int n, int n2) {
            return n < n2;
        }

        private static boolean IIllIIIIll(int n, int n2) {
            return n <= n2;
        }

        private static boolean llIlIIIIll(int n) {
            return n != 0;
        }

        private static boolean lIllIIIIll(int n) {
            return n == 0;
        }

        private static boolean IlIIlIIIll(int n) {
            return n >= 0;
        }

        private static boolean IlIlIIIIll(int n) {
            return n > 0;
        }

        private static boolean IIIIlIIIll(int n, int n2) {
            return n != n2;
        }

        private static int lIIIlIIIll(long l, long l2) {
            return l == l2 ? 0 : (l < l2 ? -1 : 1);
        }
    }
}

