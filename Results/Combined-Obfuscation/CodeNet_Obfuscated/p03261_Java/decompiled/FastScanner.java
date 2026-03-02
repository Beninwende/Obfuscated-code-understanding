/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[lIIlllll[0]];
    private int ptr = lIIlllll[1];
    private int buflen = lIIlllll[1];
    private static int[] lIIlllll;

    FastScanner() {
        FastScanner lIIIIlIllIllll;
    }

    private boolean hasNextByte() {
        FastScanner IllllIIllIllll;
        if (FastScanner.IlIIIIlIll(IllllIIllIllll.ptr, IllllIIllIllll.buflen)) {
            return lIIlllll[2];
        }
        IllllIIllIllll.ptr = lIIlllll[1];
        try {
            IllllIIllIllll.buflen = IllllIIllIllll.in.read(IllllIIllIllll.buffer);
            "".length();
        }
        catch (IOException lIlllIIllIllll) {
            lIlllIIllIllll.printStackTrace();
        }
        if (((" ".length() << " ".length() ^ (8 ^ 5)) << (" ".length() << " ".length()) & ((0x7B ^ 0x7E ^ (0xAB ^ 0xAE) << " ".length()) << (" ".length() << " ".length()) ^ -" ".length())) <= -" ".length()) {
            return (((0x33 ^ 0x26) << (" ".length() << " ".length()) ^ 114 + 43 - 65 + 35) << " ".length() & (((3 ^ 0xC) << (" ".length() << " ".length()) ^ (0xAA ^ 0xBD)) << " ".length() ^ -" ".length())) != 0;
        }
        if (FastScanner.llIIIIlIll(IllllIIllIllll.buflen)) {
            return lIIlllll[1];
        }
        return lIIlllll[2];
    }

    private int readByte() {
        FastScanner llIllIIllIllll;
        if (FastScanner.IIlIIIlIll(llIllIIllIllll.hasNextByte() ? 1 : 0)) {
            int n = llIllIIllIllll.ptr;
            llIllIIllIllll.ptr = n + lIIlllll[2];
            return llIllIIllIllll.buffer[n];
        }
        return lIIlllll[3];
    }

    private static boolean isPrintableChar(int lIIllIIllIllll) {
        int n;
        if (FastScanner.lIlIIIlIll(lIIlllll[4], lIIllIIllIllll) && FastScanner.lIlIIIlIll(lIIllIIllIllll, lIIlllll[5])) {
            n = lIIlllll[2];
            "".length();
            if (" ".length() != " ".length()) {
                return (" ".length() << (0x22 ^ 0x7F ^ (0xC9 ^ 0xC2) << "   ".length()) & (" ".length() << ((0x51 ^ 0x4E) << " ".length() ^ (0x80 ^ 0xBB)) ^ -" ".length())) != 0;
            }
        } else {
            n = lIIlllll[1];
        }
        return n != 0;
    }

    public boolean hasNext() {
        FastScanner lllIlIIllIllll;
        while (FastScanner.IIlIIIlIll(lllIlIIllIllll.hasNextByte() ? 1 : 0) && FastScanner.IllIIIlIll(FastScanner.isPrintableChar(lllIlIIllIllll.buffer[lllIlIIllIllll.ptr]) ? 1 : 0)) {
            lllIlIIllIllll.ptr += lIIlllll[2];
            "".length();
            if (" ".length() << " ".length() != (((0xBE ^ 0xB9) << (" ".length() << (" ".length() << " ".length())) ^ (0x3E ^ 0x5F)) & (0x67 ^ 0x1A ^ (0x6F ^ 0x74) << (" ".length() << " ".length()) ^ -" ".length()))) continue;
            return (" ".length() << "   ".length() & (" ".length() << "   ".length() ^ -" ".length())) != 0;
        }
        return this.hasNextByte();
    }

    /*
     * WARNING - void declaration
     */
    public String next() {
        void var1_1;
        FastScanner llIIlIIllIllll;
        if (FastScanner.IllIIIlIll(llIIlIIllIllll.hasNext() ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        StringBuilder IlIIlIIllIllll = new StringBuilder();
        int lIIIlIIllIllll = llIIlIIllIllll.readByte();
        while (FastScanner.IIlIIIlIll(FastScanner.isPrintableChar(lIIIlIIllIllll) ? 1 : 0)) {
            IlIIlIIllIllll.appendCodePoint(lIIIlIIllIllll);
            "".length();
            lIIIlIIllIllll = llIIlIIllIllll.readByte();
            "".length();
            if ("   ".length() == "   ".length()) continue;
            return null;
        }
        return String.valueOf(var1_1);
    }

    public long nextLong() {
        FastScanner IIllIIIllIllll;
        if (FastScanner.IllIIIlIll(IIllIIIllIllll.hasNext() ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        long llIlIIIllIllll = 0L;
        int IlIlIIIllIllll = lIIlllll[1];
        int lIIlIIIllIllll = IIllIIIllIllll.readByte();
        if (FastScanner.lllIIIlIll(lIIlIIIllIllll, lIIlllll[6])) {
            IlIlIIIllIllll = lIIlllll[2];
            lIIlIIIllIllll = IIllIIIllIllll.readByte();
        }
        if (!FastScanner.IIIlIIlIll(lIIlIIIllIllll, lIIlllll[7]) || FastScanner.IlIIIIlIll(lIIlllll[8], lIIlIIIllIllll)) {
            throw new NumberFormatException();
        }
        do {
            if (FastScanner.lIlIIIlIll(lIIlllll[7], lIIlIIIllIllll) && FastScanner.lIlIIIlIll(lIIlIIIllIllll, lIIlllll[8])) {
                llIlIIIllIllll *= 10L;
                llIlIIIllIllll += (long)(lIIlIIIllIllll - lIIlllll[7]);
                "".length();
                if ("   ".length() < " ".length()) {
                    return 0L;
                }
            } else {
                if (!FastScanner.lIIlIIlIll(lIIlIIIllIllll, lIIlllll[3]) || FastScanner.IllIIIlIll(FastScanner.isPrintableChar(lIIlIIIllIllll) ? 1 : 0)) {
                    long l;
                    if (FastScanner.IIlIIIlIll(IlIlIIIllIllll)) {
                        l = -llIlIIIllIllll;
                        "".length();
                        if ("   ".length() > " ".length() << (" ".length() << " ".length())) {
                            return 0L;
                        }
                    } else {
                        l = llIlIIIllIllll;
                    }
                    return l;
                }
                throw new NumberFormatException();
            }
            int n = this.readByte();
            "".length();
        } while (((164 + 88 - 127 + 40 ^ (1 ^ 0xA) << (" ".length() << (" ".length() << " ".length()))) & ((0x5F ^ 0x7E) << (" ".length() << " ".length()) ^ 80 + 113 - 119 + 71 ^ -" ".length())) < "   ".length());
        return 0L;
    }

    /*
     * WARNING - void declaration
     */
    public int nextInt() {
        void var1_1;
        FastScanner IllIIIIllIllll;
        long lIlIIIIllIllll = IllIIIIllIllll.nextLong();
        if (!FastScanner.llIlIIlIll(FastScanner.IlIlIIlIll(lIlIIIIllIllll, Integer.MIN_VALUE)) || FastScanner.IIllIIlIll(FastScanner.IlIlIIlIll(lIlIIIIllIllll, Integer.MAX_VALUE))) {
            throw new NumberFormatException();
        }
        return (int)var1_1;
    }

    public double nextDouble() {
        FastScanner llIIIIIllIllll;
        return Double.parseDouble(llIIIIIllIllll.next());
    }

    static {
        FastScanner.lIIIIIlIll();
    }

    private static void lIIIIIlIll() {
        lIIlllll = new int[9];
        FastScanner.lIIlllll[0] = " ".length() << ((0x45 ^ 0x40) << " ".length());
        FastScanner.lIIlllll[1] = (0xB ^ 0x26) & ~(0x60 ^ 0x4D);
        FastScanner.lIIlllll[2] = " ".length();
        FastScanner.lIIlllll[3] = -" ".length();
        FastScanner.lIIlllll[4] = 0x71 ^ 0x50;
        FastScanner.lIIlllll[5] = (0xA9 ^ 0x96) << " ".length();
        FastScanner.lIIlllll[6] = (0xB0 ^ 0xBB) << (" ".length() << (" ".length() << " ".length())) ^ 35 + 147 - 30 + 5;
        FastScanner.lIIlllll[7] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
        FastScanner.lIIlllll[8] = 0x5E ^ 0x67;
    }

    private static boolean lllIIIlIll(int n, int n2) {
        return n == n2;
    }

    private static boolean IIIlIIlIll(int n, int n2) {
        return n >= n2;
    }

    private static boolean IlIIIIlIll(int n, int n2) {
        return n < n2;
    }

    private static boolean lIlIIIlIll(int n, int n2) {
        return n <= n2;
    }

    private static boolean IIlIIIlIll(int n) {
        return n != 0;
    }

    private static boolean IllIIIlIll(int n) {
        return n == 0;
    }

    private static boolean llIlIIlIll(int n) {
        return n >= 0;
    }

    private static boolean llIIIIlIll(int n) {
        return n <= 0;
    }

    private static boolean IIllIIlIll(int n) {
        return n > 0;
    }

    private static boolean lIIlIIlIll(int n, int n2) {
        return n != n2;
    }

    private static int IlIlIIlIll(long l, long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }
}

