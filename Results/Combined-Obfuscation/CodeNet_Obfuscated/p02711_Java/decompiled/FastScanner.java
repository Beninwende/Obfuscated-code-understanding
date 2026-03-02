/*
 * Decompiled with CFR 0.152.
 */
import java.io.InputStream;
import java.util.NoSuchElementException;

class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[IllllIlIll[0]];
    private int ptr = IllllIlIll[1];
    private int buflen = IllllIlIll[1];
    private static int[] IllllIlIll;

    FastScanner() {
        FastScanner IIllIIlIllIlIll;
    }

    private boolean hasNextByte() {
        FastScanner lIIlIIlIllIlIll;
        if (FastScanner.lIIllIlIIIll(lIIlIIlIllIlIll.ptr, lIIlIIlIllIlIll.buflen)) {
            return IllllIlIll[2];
        }
        lIIlIIlIllIlIll.ptr = IllllIlIll[1];
        try {
            lIIlIIlIllIlIll.buflen = lIIlIIlIllIlIll.in.read(lIIlIIlIllIlIll.buffer);
            "".length();
        }
        catch (Exception IIIlIIlIllIlIll) {
            IIIlIIlIllIlIll.printStackTrace();
        }
        if ((("   ".length() << (" ".length() << " ".length()) ^ (0 ^ 0x27)) << " ".length() & ((0xD6 ^ 0xBD ^ " ".length() << ("   ".length() << " ".length())) << " ".length() ^ -" ".length())) != 0) {
            return ((50 + 126 - 40 + 11 ^ (0x5D ^ 0x1E) << " ".length()) << (" ".length() << " ".length()) & (((0x51 ^ 0xE) << " ".length() ^ 53 + 9 - -71 + 38) << (" ".length() << " ".length()) ^ -" ".length())) != 0;
        }
        if (FastScanner.IlIllIlIIIll(lIIlIIlIllIlIll.buflen)) {
            return IllllIlIll[1];
        }
        return IllllIlIll[2];
    }

    private int readByte() {
        FastScanner IllIIIlIllIlIll;
        if (FastScanner.llIllIlIIIll(IllIIIlIllIlIll.hasNextByte() ? 1 : 0)) {
            int n = IllIIIlIllIlIll.ptr;
            IllIIIlIllIlIll.ptr = n + IllllIlIll[2];
            return IllIIIlIllIlIll.buffer[n];
        }
        return IllllIlIll[3];
    }

    private static boolean isPrintableChar(int IIlIIIlIllIlIll) {
        int n;
        if (FastScanner.IIlllIlIIIll(IllllIlIll[4], IIlIIIlIllIlIll) && FastScanner.IIlllIlIIIll(IIlIIIlIllIlIll, IllllIlIll[5])) {
            n = IllllIlIll[2];
            "".length();
            if (null != null) {
                return (((0x82 ^ 0x9F) << " ".length() ^ (0xAC ^ 0x99)) & ((0x21 ^ 0xA) << (" ".length() << " ".length()) ^ 96 + 74 - 20 + 13 ^ -" ".length())) != 0;
            }
        } else {
            n = IllllIlIll[1];
        }
        return n != 0;
    }

    public boolean hasNext() {
        FastScanner IlIIIIlIllIlIll;
        while (FastScanner.llIllIlIIIll(IlIIIIlIllIlIll.hasNextByte() ? 1 : 0) && FastScanner.IllllIlIIIll(FastScanner.isPrintableChar(IlIIIIlIllIlIll.buffer[IlIIIIlIllIlIll.ptr]) ? 1 : 0)) {
            IlIIIIlIllIlIll.ptr += IllllIlIll[2];
            "".length();
            if (((0x98 ^ 0xB1) << " ".length() ^ (0xE2 ^ 0xB5)) != 0) continue;
            return (" ".length() << (" ".length() << (" ".length() << " ".length())) & (" ".length() << (" ".length() << (" ".length() << " ".length())) ^ -" ".length())) != 0;
        }
        return this.hasNextByte();
    }

    /*
     * WARNING - void declaration
     */
    public String next() {
        void var1_1;
        FastScanner IlllllIIllIlIll;
        if (FastScanner.IllllIlIIIll(IlllllIIllIlIll.hasNext() ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        StringBuilder lIllllIIllIlIll = new StringBuilder();
        int IIllllIIllIlIll = IlllllIIllIlIll.readByte();
        while (FastScanner.llIllIlIIIll(FastScanner.isPrintableChar(IIllllIIllIlIll) ? 1 : 0)) {
            lIllllIIllIlIll.appendCodePoint(IIllllIIllIlIll);
            "".length();
            IIllllIIllIlIll = IlllllIIllIlIll.readByte();
            "".length();
            if (" ".length() != 0) continue;
            return null;
        }
        return String.valueOf(var1_1);
    }

    public long nextLong() {
        FastScanner lllIllIIllIlIll;
        if (FastScanner.IllllIlIIIll(lllIllIIllIlIll.hasNext() ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        long IllIllIIllIlIll = 0L;
        int lIlIllIIllIlIll = IllllIlIll[1];
        int IIlIllIIllIlIll = lllIllIIllIlIll.readByte();
        if (FastScanner.IIIIIllIIIll(IIlIllIIllIlIll, IllllIlIll[6])) {
            lIlIllIIllIlIll = IllllIlIll[2];
            IIlIllIIllIlIll = lllIllIIllIlIll.readByte();
        }
        if (!FastScanner.lIIIIllIIIll(IIlIllIIllIlIll, IllllIlIll[7]) || FastScanner.lIIllIlIIIll(IllllIlIll[8], IIlIllIIllIlIll)) {
            throw new NumberFormatException();
        }
        do {
            if (FastScanner.IIlllIlIIIll(IllllIlIll[7], IIlIllIIllIlIll) && FastScanner.IIlllIlIIIll(IIlIllIIllIlIll, IllllIlIll[8])) {
                IllIllIIllIlIll *= 10L;
                IllIllIIllIlIll += (long)(IIlIllIIllIlIll - IllllIlIll[7]);
                "".length();
                if ("   ".length() > " ".length() << (" ".length() << " ".length())) {
                    return 0L;
                }
            } else {
                if (!FastScanner.IlIIIllIIIll(IIlIllIIllIlIll, IllllIlIll[3]) || FastScanner.IllllIlIIIll(FastScanner.isPrintableChar(IIlIllIIllIlIll) ? 1 : 0)) {
                    long l;
                    if (FastScanner.llIllIlIIIll(lIlIllIIllIlIll)) {
                        l = -IllIllIIllIlIll;
                        "".length();
                        if (" ".length() << (" ".length() << " ".length()) < 0) {
                            return 0L;
                        }
                    } else {
                        l = IllIllIIllIlIll;
                    }
                    return l;
                }
                throw new NumberFormatException();
            }
            int n = this.readByte();
            "".length();
        } while (-" ".length() < " ".length() << " ".length());
        return 0L;
    }

    /*
     * WARNING - void declaration
     */
    public int nextInt() {
        void var1_1;
        FastScanner lIIIllIIllIlIll;
        long IIIIllIIllIlIll = lIIIllIIllIlIll.nextLong();
        if (!FastScanner.IIlIIllIIIll(FastScanner.llIIIllIIIll(IIIIllIIllIlIll, Integer.MIN_VALUE)) || FastScanner.lIlIIllIIIll(FastScanner.llIIIllIIIll(IIIIllIIllIlIll, Integer.MAX_VALUE))) {
            throw new NumberFormatException();
        }
        return (int)var1_1;
    }

    public double nextDouble() {
        FastScanner IlllIlIIllIlIll;
        return Double.parseDouble(IlllIlIIllIlIll.next());
    }

    static {
        FastScanner.IIIllIlIIIll();
    }

    private static void IIIllIlIIIll() {
        IllllIlIll = new int[9];
        FastScanner.IllllIlIll[0] = " ".length() << ((0x54 ^ 0x51) << " ".length());
        FastScanner.IllllIlIll[1] = (0x92 ^ 0xC1 ^ "   ".length() << (" ".length() << " ".length())) & (122 + 57 - 44 + 18 ^ (0xC0 ^ 0xA3) << " ".length() ^ -" ".length());
        FastScanner.IllllIlIll[2] = " ".length();
        FastScanner.IllllIlIll[3] = -" ".length();
        FastScanner.IllllIlIll[4] = (0x53 ^ 0x78) << (" ".length() << " ".length()) ^ 67 + 133 - 78 + 19;
        FastScanner.IllllIlIll[5] = ((0xA4 ^ 0x83) << " ".length() ^ (0x17 ^ 0x66)) << " ".length();
        FastScanner.IllllIlIll[6] = 0xA4 ^ 0x91 ^ "   ".length() << "   ".length();
        FastScanner.IllllIlIll[7] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
        FastScanner.IllllIlIll[8] = 0x14 ^ 0x33 ^ (0x3D ^ 0x32) << " ".length();
    }

    private static boolean IIIIIllIIIll(int n, int n2) {
        return n == n2;
    }

    private static boolean lIIIIllIIIll(int n, int n2) {
        return n >= n2;
    }

    private static boolean lIIllIlIIIll(int n, int n2) {
        return n < n2;
    }

    private static boolean IIlllIlIIIll(int n, int n2) {
        return n <= n2;
    }

    private static boolean llIllIlIIIll(int n) {
        return n != 0;
    }

    private static boolean IllllIlIIIll(int n) {
        return n == 0;
    }

    private static boolean IIlIIllIIIll(int n) {
        return n >= 0;
    }

    private static boolean IlIllIlIIIll(int n) {
        return n <= 0;
    }

    private static boolean lIlIIllIIIll(int n) {
        return n > 0;
    }

    private static boolean IlIIIllIIIll(int n, int n2) {
        return n != n2;
    }

    private static int llIIIllIIIll(long l, long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }
}

