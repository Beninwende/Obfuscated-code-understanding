/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[lIIllIIIll[0]];
    private int ptr = lIIllIIIll[1];
    private int buflen = lIIllIIIll[1];
    private static int[] lIIllIIIll;

    FastScanner() {
        FastScanner lllllIIIlIlIlll;
    }

    private boolean hasNextByte() {
        FastScanner IIlllIIIlIlIlll;
        if (FastScanner.lllIIIlIllIl(IIlllIIIlIlIlll.ptr, IIlllIIIlIlIlll.buflen)) {
            return lIIllIIIll[2];
        }
        IIlllIIIlIlIlll.ptr = lIIllIIIll[1];
        try {
            IIlllIIIlIlIlll.buflen = IIlllIIIlIlIlll.in.read(IIlllIIIlIlIlll.buffer);
            "".length();
        }
        catch (IOException llIllIIIlIlIlll) {
            llIllIIIlIlIlll.printStackTrace();
        }
        if (null != null) {
            return ((0x67 ^ 0x68) & ~(0x19 ^ 0x16)) != 0;
        }
        if (FastScanner.IIIlIIlIllIl(IIlllIIIlIlIlll.buflen)) {
            return lIIllIIIll[1];
        }
        return lIIllIIIll[2];
    }

    private int readByte() {
        FastScanner lIIllIIIlIlIlll;
        if (FastScanner.lIIlIIlIllIl(lIIllIIIlIlIlll.hasNextByte() ? 1 : 0)) {
            int n = lIIllIIIlIlIlll.ptr;
            lIIllIIIlIlIlll.ptr = n + lIIllIIIll[2];
            return lIIllIIIlIlIlll.buffer[n];
        }
        return lIIllIIIll[3];
    }

    private static boolean isPrintableChar(int lllIlIIIlIlIlll) {
        int n;
        if (FastScanner.IlIlIIlIllIl(lIIllIIIll[4], lllIlIIIlIlIlll) && FastScanner.IlIlIIlIllIl(lllIlIIIlIlIlll, lIIllIIIll[5])) {
            n = lIIllIIIll[2];
            "".length();
            if (" ".length() << " ".length() <= (((0x2F ^ 0x28) << (" ".length() << " ".length()) ^ (0x2F ^ 0x36)) << (" ".length() << (" ".length() << " ".length())) & ((0xBC ^ 0xC1 ^ (0x57 ^ 0x58) << "   ".length()) << (" ".length() << (" ".length() << " ".length())) ^ -" ".length()))) {
                return ((0x3B ^ 0x1E ^ (0x26 ^ 0x23) << "   ".length()) & (99 + 121 - 156 + 91 ^ (0xCD ^ 0x86) << " ".length() ^ -" ".length())) != 0;
            }
        } else {
            n = lIIllIIIll[1];
        }
        return n != 0;
    }

    public boolean hasNext() {
        FastScanner lIlIlIIIlIlIlll;
        while (FastScanner.lIIlIIlIllIl(lIlIlIIIlIlIlll.hasNextByte() ? 1 : 0) && FastScanner.llIlIIlIllIl(FastScanner.isPrintableChar(lIlIlIIIlIlIlll.buffer[lIlIlIIIlIlIlll.ptr]) ? 1 : 0)) {
            lIlIlIIIlIlIlll.ptr += lIIllIIIll[2];
            "".length();
            if ("   ".length() != 0) continue;
            return ((0xFF ^ 0xB6) & ~(0x5D ^ 0x14)) != 0;
        }
        return this.hasNextByte();
    }

    /*
     * WARNING - void declaration
     */
    public String next() {
        void var1_1;
        FastScanner lIIIlIIIlIlIlll;
        if (FastScanner.llIlIIlIllIl(lIIIlIIIlIlIlll.hasNext() ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        StringBuilder IIIIlIIIlIlIlll = new StringBuilder();
        int llllIIIIlIlIlll = lIIIlIIIlIlIlll.readByte();
        while (FastScanner.lIIlIIlIllIl(FastScanner.isPrintableChar(llllIIIIlIlIlll) ? 1 : 0)) {
            IIIIlIIIlIlIlll.appendCodePoint(llllIIIIlIlIlll);
            "".length();
            llllIIIIlIlIlll = lIIIlIIIlIlIlll.readByte();
            "".length();
            if (" ".length() == " ".length()) continue;
            return null;
        }
        return String.valueOf(var1_1);
    }

    public long nextLong() {
        FastScanner IlIlIIIIlIlIlll;
        if (FastScanner.llIlIIlIllIl(IlIlIIIIlIlIlll.hasNext() ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        long lIIlIIIIlIlIlll = 0L;
        int IIIlIIIIlIlIlll = lIIllIIIll[1];
        int lllIIIIIlIlIlll = IlIlIIIIlIlIlll.readByte();
        if (FastScanner.IIllIIlIllIl(lllIIIIIlIlIlll, lIIllIIIll[6])) {
            IIIlIIIIlIlIlll = lIIllIIIll[2];
            lllIIIIIlIlIlll = IlIlIIIIlIlIlll.readByte();
        }
        if (!FastScanner.lIllIIlIllIl(lllIIIIIlIlIlll, lIIllIIIll[7]) || FastScanner.lllIIIlIllIl(lIIllIIIll[8], lllIIIIIlIlIlll)) {
            throw new NumberFormatException();
        }
        do {
            if (FastScanner.IlIlIIlIllIl(lIIllIIIll[7], lllIIIIIlIlIlll) && FastScanner.IlIlIIlIllIl(lllIIIIIlIlIlll, lIIllIIIll[8])) {
                lIIlIIIIlIlIlll *= 10L;
                lIIlIIIIlIlIlll += (long)(lllIIIIIlIlIlll - lIIllIIIll[7]);
                "".length();
                if (" ".length() << (" ".length() << " ".length()) < -" ".length()) {
                    return 0L;
                }
            } else {
                if (!FastScanner.IlllIIlIllIl(lllIIIIIlIlIlll, lIIllIIIll[3]) || FastScanner.llIlIIlIllIl(FastScanner.isPrintableChar(lllIIIIIlIlIlll) ? 1 : 0)) {
                    long l;
                    if (FastScanner.lIIlIIlIllIl(IIIlIIIIlIlIlll)) {
                        l = -lIIlIIIIlIlIlll;
                        "".length();
                        if (" ".length() == -" ".length()) {
                            return 0L;
                        }
                    } else {
                        l = lIIlIIIIlIlIlll;
                    }
                    return l;
                }
                throw new NumberFormatException();
            }
            int n = this.readByte();
            "".length();
        } while ("   ".length() > 0);
        return 0L;
    }

    /*
     * WARNING - void declaration
     */
    public int nextInt() {
        void var1_1;
        FastScanner IIlIIIIIlIlIlll;
        long llIIIIIIlIlIlll = IIlIIIIIlIlIlll.nextLong();
        if (!FastScanner.IIIIlIlIllIl(FastScanner.llllIIlIllIl(llIIIIIIlIlIlll, Integer.MIN_VALUE)) || FastScanner.lIIIlIlIllIl(FastScanner.llllIIlIllIl(llIIIIIIlIlIlll, Integer.MAX_VALUE))) {
            throw new NumberFormatException();
        }
        return (int)var1_1;
    }

    public double nextDouble() {
        FastScanner lIIIIIIIlIlIlll;
        return Double.parseDouble(lIIIIIIIlIlIlll.next());
    }

    static {
        FastScanner.IllIIIlIllIl();
    }

    private static void IllIIIlIllIl() {
        lIIllIIIll = new int[9];
        FastScanner.lIIllIIIll[0] = " ".length() << (((0x78 ^ 0x51) << " ".length() ^ (0xEB ^ 0xBC)) << " ".length());
        FastScanner.lIIllIIIll[1] = (0x72 ^ 0x61) << " ".length() & ~((0xB ^ 0x18) << " ".length());
        FastScanner.lIIllIIIll[2] = " ".length();
        FastScanner.lIIllIIIll[3] = -" ".length();
        FastScanner.lIIllIIIll[4] = 0 ^ 0x21;
        FastScanner.lIIllIIIll[5] = (0xF ^ 0x30) << " ".length();
        FastScanner.lIIllIIIll[6] = (0x53 ^ 0x1C) << " ".length() ^ 53 + 97 - 28 + 57;
        FastScanner.lIIllIIIll[7] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
        FastScanner.lIIllIIIll[8] = 0x6D ^ 0 ^ (0x72 ^ 0x67) << (" ".length() << " ".length());
    }

    private static boolean IIllIIlIllIl(int n, int n2) {
        return n == n2;
    }

    private static boolean lIllIIlIllIl(int n, int n2) {
        return n >= n2;
    }

    private static boolean lllIIIlIllIl(int n, int n2) {
        return n < n2;
    }

    private static boolean IlIlIIlIllIl(int n, int n2) {
        return n <= n2;
    }

    private static boolean lIIlIIlIllIl(int n) {
        return n != 0;
    }

    private static boolean llIlIIlIllIl(int n) {
        return n == 0;
    }

    private static boolean IIIIlIlIllIl(int n) {
        return n >= 0;
    }

    private static boolean IIIlIIlIllIl(int n) {
        return n <= 0;
    }

    private static boolean lIIIlIlIllIl(int n) {
        return n > 0;
    }

    private static boolean IlllIIlIllIl(int n, int n2) {
        return n != n2;
    }

    private static int llllIIlIllIl(long l, long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }
}

