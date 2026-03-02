/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

class FastScanner {
    private final InputStream in;
    private final byte[] buffer = new byte[lllIIIl[0]];
    private int ptr = lllIIIl[1];
    private int buflen = lllIIIl[1];
    private static int[] lllIIIl;

    public FastScanner(InputStream llIIIIlllIlIlIl) {
        FastScanner IIlIIIlllIlIlIl;
        IIlIIIlllIlIlIl.in = llIIIIlllIlIlIl;
    }

    private boolean hasNextByte() {
        FastScanner IIIIIIlllIlIlIl;
        if (FastScanner.lIIlllIl(IIIIIIlllIlIlIl.ptr, IIIIIIlllIlIlIl.buflen)) {
            return lllIIIl[2];
        }
        IIIIIIlllIlIlIl.ptr = lllIIIl[1];
        try {
            IIIIIIlllIlIlIl.buflen = IIIIIIlllIlIlIl.in.read(IIIIIIlllIlIlIl.buffer);
            "".length();
        }
        catch (IOException llllllIllIlIlIl) {
            llllllIllIlIlIl.printStackTrace();
        }
        if (-" ".length() > 0) {
            return ((0x68 ^ 0x61) & ~(0x1C ^ 0x15)) != 0;
        }
        if (FastScanner.IlIlllIl(IIIIIIlllIlIlIl.buflen)) {
            return lllIIIl[1];
        }
        return lllIIIl[2];
    }

    private int readByte() {
        FastScanner lIllllIllIlIlIl;
        if (FastScanner.llIlllIl(lIllllIllIlIlIl.hasNextByte() ? 1 : 0)) {
            int n = lIllllIllIlIlIl.ptr;
            lIllllIllIlIlIl.ptr = n + lllIIIl[2];
            return lIllllIllIlIlIl.buffer[n];
        }
        return lllIIIl[3];
    }

    private static boolean isPrintableChar(int llIlllIllIlIlIl) {
        int n;
        if (FastScanner.IIllllIl(lllIIIl[4], llIlllIllIlIlIl) && FastScanner.IIllllIl(llIlllIllIlIlIl, lllIIIl[5])) {
            n = lllIIIl[2];
            "".length();
            if (" ".length() << " ".length() < " ".length() << " ".length()) {
                return ((0x91 ^ 0xA2 ^ (0x66 ^ 0x61) << (" ".length() << " ".length())) << " ".length() & ((6 + 109 - 105 + 143 ^ (7 ^ 0x5C) << " ".length()) << " ".length() ^ -" ".length())) != 0;
            }
        } else {
            n = lllIIIl[1];
        }
        return n != 0;
    }

    public boolean hasNext() {
        FastScanner lIIlllIllIlIlIl;
        while (FastScanner.llIlllIl(lIIlllIllIlIlIl.hasNextByte() ? 1 : 0) && FastScanner.lIllllIl(FastScanner.isPrintableChar(lIIlllIllIlIlIl.buffer[lIIlllIllIlIlIl.ptr]) ? 1 : 0)) {
            lIIlllIllIlIlIl.ptr += lllIIIl[2];
            "".length();
            if (-" ".length() != ((0xB5 ^ 0xBE) << (" ".length() << " ".length()) & ~((0x60 ^ 0x6B) << (" ".length() << " ".length())))) continue;
            return ((0x2F ^ 0x16) & ~(0x86 ^ 0xBF)) != 0;
        }
        return this.hasNextByte();
    }

    /*
     * WARNING - void declaration
     */
    public String next() {
        void var1_1;
        FastScanner lIlIllIllIlIlIl;
        if (FastScanner.lIllllIl(lIlIllIllIlIlIl.hasNext() ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        StringBuilder IIlIllIllIlIlIl = new StringBuilder();
        int llIIllIllIlIlIl = lIlIllIllIlIlIl.readByte();
        while (FastScanner.llIlllIl(FastScanner.isPrintableChar(llIIllIllIlIlIl) ? 1 : 0)) {
            IIlIllIllIlIlIl.appendCodePoint(llIIllIllIlIlIl);
            "".length();
            llIIllIllIlIlIl = lIlIllIllIlIlIl.readByte();
            "".length();
            if (" ".length() << (" ".length() << " ".length()) >= -" ".length()) continue;
            return null;
        }
        return String.valueOf(var1_1);
    }

    public long nextLong() {
        FastScanner IlllIlIllIlIlIl;
        if (FastScanner.lIllllIl(IlllIlIllIlIlIl.hasNext() ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        long lIllIlIllIlIlIl = 0L;
        int IIllIlIllIlIlIl = lllIIIl[1];
        int llIlIlIllIlIlIl = IlllIlIllIlIlIl.readByte();
        if (FastScanner.IlllllIl(llIlIlIllIlIlIl, lllIIIl[6])) {
            IIllIlIllIlIlIl = lllIIIl[2];
            llIlIlIllIlIlIl = IlllIlIllIlIlIl.readByte();
        }
        if (!FastScanner.llllllIl(llIlIlIllIlIlIl, lllIIIl[7]) || FastScanner.lIIlllIl(lllIIIl[8], llIlIlIllIlIlIl)) {
            throw new NumberFormatException();
        }
        do {
            if (FastScanner.IIllllIl(lllIIIl[7], llIlIlIllIlIlIl) && FastScanner.IIllllIl(llIlIlIllIlIlIl, lllIIIl[8])) {
                lIllIlIllIlIlIl *= 10L;
                lIllIlIllIlIlIl += (long)(llIlIlIllIlIlIl - lllIIIl[7]);
                "".length();
                if (null != null) {
                    return 0L;
                }
            } else {
                if (!FastScanner.IIIIIIll(llIlIlIllIlIlIl, lllIIIl[3]) || FastScanner.lIllllIl(FastScanner.isPrintableChar(llIlIlIllIlIlIl) ? 1 : 0)) {
                    long l;
                    if (FastScanner.llIlllIl(IIllIlIllIlIlIl)) {
                        l = -lIllIlIllIlIlIl;
                        "".length();
                        if (((3 ^ 0x6A ^ (0x77 ^ 0x46) << " ".length()) & (0x93 ^ 0x86 ^ (0x92 ^ 0x9D) << " ".length() ^ -" ".length())) != 0) {
                            return 0L;
                        }
                    } else {
                        l = lIllIlIllIlIlIl;
                    }
                    return l;
                }
                throw new NumberFormatException();
            }
            int n = this.readByte();
            "".length();
        } while (" ".length() << " ".length() > ("   ".length() << (0xC ^ 9) & ~("   ".length() << (0x8F ^ 0x8A))));
        return 0L;
    }

    /*
     * WARNING - void declaration
     */
    public int nextInt() {
        void var1_1;
        FastScanner IIIlIlIllIlIlIl;
        long lllIIlIllIlIlIl = IIIlIlIllIlIlIl.nextLong();
        if (!FastScanner.IlIIIIll(FastScanner.lIIIIIll(lllIIlIllIlIlIl, Integer.MIN_VALUE)) || FastScanner.llIIIIll(FastScanner.lIIIIIll(lllIIlIllIlIlIl, Integer.MAX_VALUE))) {
            throw new NumberFormatException();
        }
        return (int)var1_1;
    }

    public double nextDouble() {
        FastScanner lIlIIlIllIlIlIl;
        return Double.parseDouble(lIlIIlIllIlIlIl.next());
    }

    static {
        FastScanner.IIIlllIl();
    }

    private static void IIIlllIl() {
        lllIIIl = new int[9];
        FastScanner.lllIIIl[0] = " ".length() << ((0xBB ^ 0xBE) << " ".length());
        FastScanner.lllIIIl[1] = (0x10 ^ 0x2B ^ "   ".length() << "   ".length()) << " ".length() & ((0x3B ^ 0x40 ^ (0x5E ^ 0x55) << "   ".length()) << " ".length() ^ -" ".length());
        FastScanner.lllIIIl[2] = " ".length();
        FastScanner.lllIIIl[3] = -" ".length();
        FastScanner.lllIIIl[4] = 60 + 100 - 42 + 67 ^ (0x5F ^ 0x4C) << "   ".length();
        FastScanner.lllIIIl[5] = ((0x64 ^ 0x6F) << " ".length() ^ (0xEC ^ 0xC5)) << " ".length();
        FastScanner.lllIIIl[6] = 0x23 ^ 0x10 ^ (0xB2 ^ 0xBD) << " ".length();
        FastScanner.lllIIIl[7] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
        FastScanner.lllIIIl[8] = 0xA7 ^ 0x9E;
    }

    private static boolean IlllllIl(int n, int n2) {
        return n == n2;
    }

    private static boolean llllllIl(int n, int n2) {
        return n >= n2;
    }

    private static boolean lIIlllIl(int n, int n2) {
        return n < n2;
    }

    private static boolean IIllllIl(int n, int n2) {
        return n <= n2;
    }

    private static boolean llIlllIl(int n) {
        return n != 0;
    }

    private static boolean lIllllIl(int n) {
        return n == 0;
    }

    private static boolean IlIIIIll(int n) {
        return n >= 0;
    }

    private static boolean IlIlllIl(int n) {
        return n <= 0;
    }

    private static boolean llIIIIll(int n) {
        return n > 0;
    }

    private static boolean IIIIIIll(int n, int n2) {
        return n != n2;
    }

    private static int lIIIIIll(long l, long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }
}

