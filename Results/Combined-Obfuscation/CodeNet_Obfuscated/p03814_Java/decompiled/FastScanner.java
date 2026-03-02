/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[lIIIlIllIl[0]];
    private int ptr = lIIIlIllIl[1];
    private int buflen = lIIIlIllIl[1];
    private static int[] lIIIlIllIl;

    FastScanner() {
        FastScanner llIlIIlIl;
    }

    private boolean hasNextByte() {
        FastScanner IIIlIIlIl;
        if (FastScanner.llIIIlIIIlIl(IIIlIIlIl.ptr, IIIlIIlIl.buflen)) {
            return lIIIlIllIl[2];
        }
        IIIlIIlIl.ptr = lIIIlIllIl[1];
        try {
            IIIlIIlIl.buflen = IIIlIIlIl.in.read(IIIlIIlIl.buffer);
            "".length();
        }
        catch (IOException lllIIIlIl) {
            lllIIIlIl.printStackTrace();
        }
        if (" ".length() << (" ".length() << " ".length()) == 0) {
            return (((0x87 ^ 0xA6) << " ".length() ^ (0x97 ^ 0xC6)) & ((0x3D ^ 0x3A) << (" ".length() << " ".length()) ^ (0xC9 ^ 0xC6) ^ -" ".length())) != 0;
        }
        if (FastScanner.IIlIIlIIIlIl(IIIlIIlIl.buflen)) {
            return lIIIlIllIl[1];
        }
        return lIIIlIllIl[2];
    }

    private int readByte() {
        FastScanner lIlIIIlIl;
        if (FastScanner.lIlIIlIIIlIl(lIlIIIlIl.hasNextByte() ? 1 : 0)) {
            int n = lIlIIIlIl.ptr;
            lIlIIIlIl.ptr = n + lIIIlIllIl[2];
            return lIlIIIlIl.buffer[n];
        }
        return lIIIlIllIl[3];
    }

    private static boolean isPrintableChar(int llIIIIlIl) {
        int n;
        if (FastScanner.IllIIlIIIlIl(lIIIlIllIl[4], llIIIIlIl) && FastScanner.IllIIlIIIlIl(llIIIIlIl, lIIIlIllIl[5])) {
            n = lIIIlIllIl[2];
            "".length();
            if (-" ".length() >= " ".length()) {
                return (((0x38 ^ 0x35) << " ".length() ^ (0xC3 ^ 0x82)) & (0x45 ^ 0x7C ^ (0x10 ^ 0x21) << " ".length() ^ -" ".length())) != 0;
            }
        } else {
            n = lIIIlIllIl[1];
        }
        return n != 0;
    }

    public boolean hasNext() {
        FastScanner lIIIIIlIl;
        while (FastScanner.lIlIIlIIIlIl(lIIIIIlIl.hasNextByte() ? 1 : 0) && FastScanner.lllIIlIIIlIl(FastScanner.isPrintableChar(lIIIIIlIl.buffer[lIIIIIlIl.ptr]) ? 1 : 0)) {
            lIIIIIlIl.ptr += lIIIlIllIl[2];
            "".length();
            if (-(0x30 ^ 0x34) <= 0) continue;
            return (" ".length() << (0x2D ^ 0x28) & ~(" ".length() << (0x6E ^ 0x6B))) != 0;
        }
        return this.hasNextByte();
    }

    /*
     * WARNING - void declaration
     */
    public String next() {
        void var1_1;
        FastScanner lIllllIIl;
        if (FastScanner.lllIIlIIIlIl(lIllllIIl.hasNext() ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        StringBuilder IIllllIIl = new StringBuilder();
        int llIlllIIl = lIllllIIl.readByte();
        while (FastScanner.lIlIIlIIIlIl(FastScanner.isPrintableChar(llIlllIIl) ? 1 : 0)) {
            IIllllIIl.appendCodePoint(llIlllIIl);
            "".length();
            llIlllIIl = lIllllIIl.readByte();
            "".length();
            if (-"  ".length() < 0) continue;
            return null;
        }
        return String.valueOf(var1_1);
    }

    public long nextLong() {
        FastScanner IllIllIIl;
        if (FastScanner.lllIIlIIIlIl(IllIllIIl.hasNext() ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        long lIlIllIIl = 0L;
        int IIlIllIIl = lIIIlIllIl[1];
        int llIIllIIl = IllIllIIl.readByte();
        if (FastScanner.IIIlIlIIIlIl(llIIllIIl, lIIIlIllIl[6])) {
            IIlIllIIl = lIIIlIllIl[2];
            llIIllIIl = IllIllIIl.readByte();
        }
        if (!FastScanner.lIIlIlIIIlIl(llIIllIIl, lIIIlIllIl[7]) || FastScanner.llIIIlIIIlIl(lIIIlIllIl[8], llIIllIIl)) {
            throw new NumberFormatException();
        }
        do {
            if (FastScanner.IllIIlIIIlIl(lIIIlIllIl[7], llIIllIIl) && FastScanner.IllIIlIIIlIl(llIIllIIl, lIIIlIllIl[8])) {
                lIlIllIIl *= 10L;
                lIlIllIIl += (long)(llIIllIIl - lIIIlIllIl[7]);
                "".length();
                if (" ".length() != " ".length()) {
                    return 0L;
                }
            } else {
                if (!FastScanner.IlIlIlIIIlIl(llIIllIIl, lIIIlIllIl[3]) || FastScanner.lllIIlIIIlIl(FastScanner.isPrintableChar(llIIllIIl) ? 1 : 0)) {
                    long l;
                    if (FastScanner.lIlIIlIIIlIl(IIlIllIIl)) {
                        l = -lIlIllIIl;
                        "".length();
                        if (-"  ".length() >= 0) {
                            return 0L;
                        }
                    } else {
                        l = lIlIllIIl;
                    }
                    return l;
                }
                throw new NumberFormatException();
            }
            int n = this.readByte();
            "".length();
        } while (((0x35 ^ 0x54) & ~(0x1F ^ 0x7E)) == 0);
        return 0L;
    }

    /*
     * WARNING - void declaration
     */
    public int nextInt() {
        void var1_1;
        FastScanner IIIIllIIl;
        long llllIlIIl = IIIIllIIl.nextLong();
        if (!FastScanner.IIllIlIIIlIl(FastScanner.llIlIlIIIlIl(llllIlIIl, Integer.MIN_VALUE)) || FastScanner.lIllIlIIIlIl(FastScanner.llIlIlIIIlIl(llllIlIIl, Integer.MAX_VALUE))) {
            throw new NumberFormatException();
        }
        return (int)var1_1;
    }

    public double nextDouble() {
        FastScanner lIllIlIIl;
        return Double.parseDouble(lIllIlIIl.next());
    }

    static {
        FastScanner.IlIIIlIIIlIl();
    }

    private static void IlIIIlIIIlIl() {
        lIIIlIllIl = new int[9];
        FastScanner.lIIIlIllIl[0] = " ".length() << ((94 + 32 - 92 + 149 ^ (6 ^ 0x5F) << " ".length()) << " ".length());
        FastScanner.lIIIlIllIl[1] = " ".length() << ("   ".length() << " ".length()) & (" ".length() << ("   ".length() << " ".length()) ^ -" ".length());
        FastScanner.lIIIlIllIl[2] = " ".length();
        FastScanner.lIIIlIllIl[3] = -" ".length();
        FastScanner.lIIIlIllIl[4] = (0x59 ^ 0x46) << " ".length() ^ (8 ^ 0x17);
        FastScanner.lIIIlIllIl[5] = (0xAD ^ 0x92) << " ".length();
        FastScanner.lIIIlIllIl[6] = 0xA7 ^ 0x8A;
        FastScanner.lIIIlIllIl[7] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
        FastScanner.lIIIlIllIl[8] = 63 + 44 - -29 + 1 ^ (0xB7 ^ 0xBC) << (" ".length() << (" ".length() << " ".length()));
    }

    private static boolean IIIlIlIIIlIl(int n, int n2) {
        return n == n2;
    }

    private static boolean lIIlIlIIIlIl(int n, int n2) {
        return n >= n2;
    }

    private static boolean llIIIlIIIlIl(int n, int n2) {
        return n < n2;
    }

    private static boolean IllIIlIIIlIl(int n, int n2) {
        return n <= n2;
    }

    private static boolean lIlIIlIIIlIl(int n) {
        return n != 0;
    }

    private static boolean lllIIlIIIlIl(int n) {
        return n == 0;
    }

    private static boolean IIllIlIIIlIl(int n) {
        return n >= 0;
    }

    private static boolean IIlIIlIIIlIl(int n) {
        return n <= 0;
    }

    private static boolean lIllIlIIIlIl(int n) {
        return n > 0;
    }

    private static boolean IlIlIlIIIlIl(int n, int n2) {
        return n != n2;
    }

    private static int llIlIlIIIlIl(long l, long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }
}

