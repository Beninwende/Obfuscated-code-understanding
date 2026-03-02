/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[IIIIIlIIll[0]];
    private int ptr = IIIIIlIIll[1];
    private int buflen = IIIIIlIIll[1];
    private static int[] IIIIIlIIll;

    FastScanner() {
        FastScanner IIlIlllIIIlIlll;
    }

    private boolean hasNextByte() {
        FastScanner lIIIlllIIIlIlll;
        if (FastScanner.IllllIlIllIl(lIIIlllIIIlIlll.ptr, lIIIlllIIIlIlll.buflen)) {
            return IIIIIlIIll[2];
        }
        lIIIlllIIIlIlll.ptr = IIIIIlIIll[1];
        try {
            lIIIlllIIIlIlll.buflen = lIIIlllIIIlIlll.in.read(lIIIlllIIIlIlll.buffer);
            "".length();
        }
        catch (IOException IIIIlllIIIlIlll) {
            IIIIlllIIIlIlll.printStackTrace();
        }
        if (null != null) {
            return ((0x6B ^ 0x70 ^ (0x86 ^ 0x95) << " ".length()) & (0x5D ^ 0x40 ^ " ".length() << (0xBA ^ 0xBF) ^ -" ".length())) != 0;
        }
        if (FastScanner.lllllIlIllIl(lIIIlllIIIlIlll.buflen)) {
            return IIIIIlIIll[1];
        }
        return IIIIIlIIll[2];
    }

    private int readByte() {
        FastScanner IlllIllIIIlIlll;
        if (FastScanner.IIIIIllIllIl(IlllIllIIIlIlll.hasNextByte() ? 1 : 0)) {
            int n = IlllIllIIIlIlll.ptr;
            IlllIllIIIlIlll.ptr = n + IIIIIlIIll[2];
            return IlllIllIIIlIlll.buffer[n];
        }
        return IIIIIlIIll[3];
    }

    private static boolean isPrintableChar(int IIllIllIIIlIlll) {
        int n;
        if (FastScanner.lIIIIllIllIl(IIIIIlIIll[4], IIllIllIIIlIlll) && FastScanner.lIIIIllIllIl(IIllIllIIIlIlll, IIIIIlIIll[5])) {
            n = IIIIIlIIll[2];
            "".length();
            if (" ".length() <= 0) {
                return (((0x13 ^ 0x1A) << "   ".length() ^ 71 + 102 - 127 + 81) & (44 + 70 - 77 + 154 ^ (0xD5 ^ 0xC4) << "   ".length() ^ -" ".length())) != 0;
            }
        } else {
            n = IIIIIlIIll[1];
        }
        return n != 0;
    }

    public boolean hasNext() {
        FastScanner IlIlIllIIIlIlll;
        while (FastScanner.IIIIIllIllIl(IlIlIllIIIlIlll.hasNextByte() ? 1 : 0) && FastScanner.IlIIIllIllIl(FastScanner.isPrintableChar(IlIlIllIIIlIlll.buffer[IlIlIllIIIlIlll.ptr]) ? 1 : 0)) {
            IlIlIllIIIlIlll.ptr += IIIIIlIIll[2];
            "".length();
            if (((0xBA ^ 0x8D) & ~(0x75 ^ 0x42)) == 0) continue;
            return ((0x3C ^ 0x39) << " ".length() & ~((0xBC ^ 0xB9) << " ".length())) != 0;
        }
        return this.hasNextByte();
    }

    /*
     * WARNING - void declaration
     */
    public String next() {
        void var1_1;
        FastScanner IllIIllIIIlIlll;
        if (FastScanner.IlIIIllIllIl(IllIIllIIIlIlll.hasNext() ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        StringBuilder lIlIIllIIIlIlll = new StringBuilder();
        int IIlIIllIIIlIlll = IllIIllIIIlIlll.readByte();
        while (FastScanner.IIIIIllIllIl(FastScanner.isPrintableChar(IIlIIllIIIlIlll) ? 1 : 0)) {
            lIlIIllIIIlIlll.appendCodePoint(IIlIIllIIIlIlll);
            "".length();
            IIlIIllIIIlIlll = IllIIllIIIlIlll.readByte();
            "".length();
            if (-" ".length() <= 0) continue;
            return null;
        }
        return String.valueOf(var1_1);
    }

    public long nextLong() {
        FastScanner lllllIlIIIlIlll;
        if (FastScanner.IlIIIllIllIl(lllllIlIIIlIlll.hasNext() ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        long IllllIlIIIlIlll = 0L;
        int lIlllIlIIIlIlll = IIIIIlIIll[1];
        int IIlllIlIIIlIlll = lllllIlIIIlIlll.readByte();
        if (FastScanner.llIIIllIllIl(IIlllIlIIIlIlll, IIIIIlIIll[6])) {
            lIlllIlIIIlIlll = IIIIIlIIll[2];
            IIlllIlIIIlIlll = lllllIlIIIlIlll.readByte();
        }
        if (!FastScanner.IIlIIllIllIl(IIlllIlIIIlIlll, IIIIIlIIll[7]) || FastScanner.IllllIlIllIl(IIIIIlIIll[8], IIlllIlIIIlIlll)) {
            throw new NumberFormatException();
        }
        do {
            if (FastScanner.lIIIIllIllIl(IIIIIlIIll[7], IIlllIlIIIlIlll) && FastScanner.lIIIIllIllIl(IIlllIlIIIlIlll, IIIIIlIIll[8])) {
                IllllIlIIIlIlll *= 10L;
                IllllIlIIIlIlll += (long)(IIlllIlIIIlIlll - IIIIIlIIll[7]);
                "".length();
                if (((0x49 ^ 0x46) << (" ".length() << " ".length()) & ~((0x7B ^ 0x74) << (" ".length() << " ".length()))) != 0) {
                    return 0L;
                }
            } else {
                if (!FastScanner.lIlIIllIllIl(IIlllIlIIIlIlll, IIIIIlIIll[3]) || FastScanner.IlIIIllIllIl(FastScanner.isPrintableChar(IIlllIlIIIlIlll) ? 1 : 0)) {
                    long l;
                    if (FastScanner.IIIIIllIllIl(lIlllIlIIIlIlll)) {
                        l = -IllllIlIIIlIlll;
                        "".length();
                        if (" ".length() << (" ".length() << " ".length()) == 0) {
                            return 0L;
                        }
                    } else {
                        l = IllllIlIIIlIlll;
                    }
                    return l;
                }
                throw new NumberFormatException();
            }
            int n = this.readByte();
            "".length();
        } while (((0x46 ^ 7) & ~(0x73 ^ 0x32) & ~((0x2A ^ 0x63) & ~(0x24 ^ 0x6D))) != " ".length());
        return 0L;
    }

    /*
     * WARNING - void declaration
     */
    public int nextInt() {
        void var1_1;
        FastScanner lIIllIlIIIlIlll;
        long IIIllIlIIIlIlll = lIIllIlIIIlIlll.nextLong();
        if (!FastScanner.lllIIllIllIl(FastScanner.IllIIllIllIl(IIIllIlIIIlIlll, Integer.MIN_VALUE)) || FastScanner.IIIlIllIllIl(FastScanner.IllIIllIllIl(IIIllIlIIIlIlll, Integer.MAX_VALUE))) {
            throw new NumberFormatException();
        }
        return (int)var1_1;
    }

    public double nextDouble() {
        FastScanner IllIlIlIIIlIlll;
        return Double.parseDouble(IllIlIlIIIlIlll.next());
    }

    static {
        FastScanner.lIlllIlIllIl();
    }

    private static void lIlllIlIllIl() {
        IIIIIlIIll = new int[9];
        FastScanner.IIIIIlIIll[0] = " ".length() << ((0xBF ^ 0xBA) << " ".length());
        FastScanner.IIIIIlIIll[1] = (0x7C ^ 0xB ^ " ".length() << (0x9F ^ 0x9A)) & ((0x3C ^ 0x51) << " ".length() ^ 59 + 3 - -36 + 43 ^ -" ".length());
        FastScanner.IIIIIlIIll[2] = " ".length();
        FastScanner.IIIIIlIIll[3] = -" ".length();
        FastScanner.IIIIIlIIll[4] = 0x7B ^ 0x5A;
        FastScanner.IIIIIlIIll[5] = ((0x3B ^ 0x2C) << " ".length() ^ (0xD3 ^ 0xC2)) << " ".length();
        FastScanner.IIIIIlIIll[6] = 0xAD ^ 0x80;
        FastScanner.IIIIIlIIll[7] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
        FastScanner.IIIIIlIIll[8] = 135 + 6 - 61 + 69 ^ (0x99 ^ 0xB2) << (" ".length() << " ".length());
    }

    private static boolean llIIIllIllIl(int n, int n2) {
        return n == n2;
    }

    private static boolean IIlIIllIllIl(int n, int n2) {
        return n >= n2;
    }

    private static boolean IllllIlIllIl(int n, int n2) {
        return n < n2;
    }

    private static boolean lIIIIllIllIl(int n, int n2) {
        return n <= n2;
    }

    private static boolean IIIIIllIllIl(int n) {
        return n != 0;
    }

    private static boolean IlIIIllIllIl(int n) {
        return n == 0;
    }

    private static boolean lllIIllIllIl(int n) {
        return n >= 0;
    }

    private static boolean lllllIlIllIl(int n) {
        return n <= 0;
    }

    private static boolean IIIlIllIllIl(int n) {
        return n > 0;
    }

    private static boolean lIlIIllIllIl(int n, int n2) {
        return n != n2;
    }

    private static int IllIIllIllIl(long l, long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }
}

