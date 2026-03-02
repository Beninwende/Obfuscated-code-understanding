/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[llIlllIll[0]];
    private int ptr = llIlllIll[1];
    private int buflen = llIlllIll[1];
    private static int[] llIlllIll;

    FastScanner() {
        FastScanner lIllIllIlIlIIl;
    }

    private boolean hasNextByte() {
        FastScanner IlIlIllIlIlIIl;
        if (FastScanner.IllllIIIIll(IlIlIllIlIlIIl.ptr, IlIlIllIlIlIIl.buflen)) {
            return llIlllIll[2];
        }
        IlIlIllIlIlIIl.ptr = llIlllIll[1];
        try {
            IlIlIllIlIlIIl.buflen = IlIlIllIlIlIIl.in.read(IlIlIllIlIlIIl.buffer);
            "".length();
        }
        catch (IOException lIIlIllIlIlIIl) {
            lIIlIllIlIlIIl.printStackTrace();
        }
        if ("   ".length() <= 0) {
            return ((169 + 88 - 142 + 64 ^ (0x1E ^ 0x33) << (" ".length() << " ".length())) << (" ".length() << " ".length()) & (("   ".length() << "   ".length() ^ (0x48 ^ 0x57)) << (" ".length() << " ".length()) ^ -" ".length())) != 0;
        }
        if (FastScanner.lllllIIIIll(IlIlIllIlIlIIl.buflen)) {
            return llIlllIll[1];
        }
        return llIlllIll[2];
    }

    private int readByte() {
        FastScanner lllIIllIlIlIIl;
        if (FastScanner.IIIIIlIIIll(lllIIllIlIlIIl.hasNextByte() ? 1 : 0)) {
            int n = lllIIllIlIlIIl.ptr;
            lllIIllIlIlIIl.ptr = n + llIlllIll[2];
            return lllIIllIlIlIIl.buffer[n];
        }
        return llIlllIll[3];
    }

    private static boolean isPrintableChar(int lIlIIllIlIlIIl) {
        int n;
        if (FastScanner.lIIIIlIIIll(llIlllIll[4], lIlIIllIlIlIIl) && FastScanner.lIIIIlIIIll(lIlIIllIlIlIIl, llIlllIll[5])) {
            n = llIlllIll[2];
            "".length();
            if ("   ".length() <= -" ".length()) {
                return (((0x48 ^ 0x45) << (" ".length() << " ".length()) ^ (0x95 ^ 0xB0)) << " ".length() & (((0x4A ^ 0x69) << " ".length() ^ (0 ^ 0x57)) << " ".length() ^ -" ".length())) != 0;
            }
        } else {
            n = llIlllIll[1];
        }
        return n != 0;
    }

    public boolean hasNext() {
        FastScanner llIIIllIlIlIIl;
        while (FastScanner.IIIIIlIIIll(llIIIllIlIlIIl.hasNextByte() ? 1 : 0) && FastScanner.IlIIIlIIIll(FastScanner.isPrintableChar(llIIIllIlIlIIl.buffer[llIIIllIlIlIIl.ptr]) ? 1 : 0)) {
            llIIIllIlIlIIl.ptr += llIlllIll[2];
            "".length();
            if (null == null) continue;
            return ((0x6F ^ 0x66) & ~(0xBD ^ 0xB4)) != 0;
        }
        return this.hasNextByte();
    }

    /*
     * WARNING - void declaration
     */
    public String next() {
        void var1_1;
        FastScanner lllllIlIlIlIIl;
        if (FastScanner.IlIIIlIIIll(lllllIlIlIlIIl.hasNext() ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        StringBuilder IllllIlIlIlIIl = new StringBuilder();
        int lIlllIlIlIlIIl = lllllIlIlIlIIl.readByte();
        while (FastScanner.IIIIIlIIIll(FastScanner.isPrintableChar(lIlllIlIlIlIIl) ? 1 : 0)) {
            IllllIlIlIlIIl.appendCodePoint(lIlllIlIlIlIIl);
            "".length();
            lIlllIlIlIlIIl = lllllIlIlIlIIl.readByte();
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(var1_1);
    }

    public long nextLong() {
        FastScanner IIIllIlIlIlIIl;
        if (FastScanner.IlIIIlIIIll(IIIllIlIlIlIIl.hasNext() ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        long lllIlIlIlIlIIl = 0L;
        int IllIlIlIlIlIIl = llIlllIll[1];
        int lIlIlIlIlIlIIl = IIIllIlIlIlIIl.readByte();
        if (FastScanner.llIIIlIIIll(lIlIlIlIlIlIIl, llIlllIll[6])) {
            IllIlIlIlIlIIl = llIlllIll[2];
            lIlIlIlIlIlIIl = IIIllIlIlIlIIl.readByte();
        }
        if (!FastScanner.IIlIIlIIIll(lIlIlIlIlIlIIl, llIlllIll[7]) || FastScanner.IllllIIIIll(llIlllIll[8], lIlIlIlIlIlIIl)) {
            throw new NumberFormatException();
        }
        do {
            if (FastScanner.lIIIIlIIIll(llIlllIll[7], lIlIlIlIlIlIIl) && FastScanner.lIIIIlIIIll(lIlIlIlIlIlIIl, llIlllIll[8])) {
                lllIlIlIlIlIIl *= 10L;
                lllIlIlIlIlIIl += (long)(lIlIlIlIlIlIIl - llIlllIll[7]);
                "".length();
                if (((0xB7 ^ 0x98) << " ".length() & ~((0x35 ^ 0x1A) << " ".length())) != 0) {
                    return 0L;
                }
            } else {
                if (!FastScanner.lIlIIlIIIll(lIlIlIlIlIlIIl, llIlllIll[3]) || FastScanner.IlIIIlIIIll(FastScanner.isPrintableChar(lIlIlIlIlIlIIl) ? 1 : 0)) {
                    long l;
                    if (FastScanner.IIIIIlIIIll(IllIlIlIlIlIIl)) {
                        l = -lllIlIlIlIlIIl;
                        "".length();
                        if (-(0x26 ^ 0x22) >= 0) {
                            return 0L;
                        }
                    } else {
                        l = lllIlIlIlIlIIl;
                    }
                    return l;
                }
                throw new NumberFormatException();
            }
            int n = this.readByte();
            "".length();
        } while (((0xC9 ^ 0xC4) << " ".length() ^ (0x12 ^ 0xD)) > 0);
        return 0L;
    }

    /*
     * WARNING - void declaration
     */
    public int nextInt() {
        void var1_1;
        FastScanner IlIIlIlIlIlIIl;
        long lIIIlIlIlIlIIl = IlIIlIlIlIlIIl.nextLong();
        if (!FastScanner.lllIIlIIIll(FastScanner.IllIIlIIIll(lIIIlIlIlIlIIl, Integer.MIN_VALUE)) || FastScanner.IIIlIlIIIll(FastScanner.IllIIlIIIll(lIIIlIlIlIlIIl, Integer.MAX_VALUE))) {
            throw new NumberFormatException();
        }
        return (int)var1_1;
    }

    public double nextDouble() {
        FastScanner llllIIlIlIlIIl;
        return Double.parseDouble(llllIIlIlIlIIl.next());
    }

    static {
        FastScanner.lIlllIIIIll();
    }

    private static void lIlllIIIIll() {
        llIlllIll = new int[9];
        FastScanner.llIlllIll[0] = " ".length() << ((5 ^ 0) << " ".length());
        FastScanner.llIlllIll[1] = (102 + 36 - 14 + 7 ^ (0xD7 ^ 0x94) << " ".length()) << " ".length() & (((0x47 ^ 0x48) << " ".length() ^ (0x22 ^ 0x39)) << " ".length() ^ -" ".length());
        FastScanner.llIlllIll[2] = " ".length();
        FastScanner.llIlllIll[3] = -" ".length();
        FastScanner.llIlllIll[4] = 67 + 124 - 160 + 102 ^ (0x7C ^ 0x55) << (" ".length() << " ".length());
        FastScanner.llIlllIll[5] = (0x18 ^ 0x27) << " ".length();
        FastScanner.llIlllIll[6] = (0x41 ^ 6) << " ".length() ^ 141 + 40 - 56 + 38;
        FastScanner.llIlllIll[7] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
        FastScanner.llIlllIll[8] = 0xBE ^ 0xB7 ^ "   ".length() << (" ".length() << (" ".length() << " ".length()));
    }

    private static boolean llIIIlIIIll(int n, int n2) {
        return n == n2;
    }

    private static boolean IIlIIlIIIll(int n, int n2) {
        return n >= n2;
    }

    private static boolean IllllIIIIll(int n, int n2) {
        return n < n2;
    }

    private static boolean lIIIIlIIIll(int n, int n2) {
        return n <= n2;
    }

    private static boolean IIIIIlIIIll(int n) {
        return n != 0;
    }

    private static boolean IlIIIlIIIll(int n) {
        return n == 0;
    }

    private static boolean lllIIlIIIll(int n) {
        return n >= 0;
    }

    private static boolean lllllIIIIll(int n) {
        return n <= 0;
    }

    private static boolean IIIlIlIIIll(int n) {
        return n > 0;
    }

    private static boolean lIlIIlIIIll(int n, int n2) {
        return n != n2;
    }

    private static int IllIIlIIIll(long l, long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }
}

