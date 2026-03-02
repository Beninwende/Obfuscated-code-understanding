/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[llIIIllIll[0]];
    private int ptr = llIIIllIll[1];
    private int buflen = llIIIllIll[1];
    private static int[] llIIIllIll;

    FastScanner() {
        FastScanner llllllIlIlIlIll;
    }

    private boolean hasNextByte() {
        FastScanner IIllllIlIlIlIll;
        if (FastScanner.IIllIllIIIll(IIllllIlIlIlIll.ptr, IIllllIlIlIlIll.buflen)) {
            return llIIIllIll[2];
        }
        IIllllIlIlIlIll.ptr = llIIIllIll[1];
        try {
            IIllllIlIlIlIll.buflen = IIllllIlIlIlIll.in.read(IIllllIlIlIlIll.buffer);
            "".length();
        }
        catch (IOException llIlllIlIlIlIll) {
            llIlllIlIlIlIll.printStackTrace();
        }
        if (" ".length() << " ".length() != " ".length() << " ".length()) {
            return ((" ".length() ^ " ".length() << (" ".length() << (" ".length() << " ".length()))) << (" ".length() << " ".length()) & (((0x6A ^ 0x7D) << "   ".length() ^ 2 + 146 - 6 + 27) << (" ".length() << " ".length()) ^ -" ".length())) != 0;
        }
        if (FastScanner.lIllIllIIIll(IIllllIlIlIlIll.buflen)) {
            return llIIIllIll[1];
        }
        return llIIIllIll[2];
    }

    private int readByte() {
        FastScanner lIIlllIlIlIlIll;
        if (FastScanner.IlllIllIIIll(lIIlllIlIlIlIll.hasNextByte() ? 1 : 0)) {
            int n = lIIlllIlIlIlIll.ptr;
            lIIlllIlIlIlIll.ptr = n + llIIIllIll[2];
            return lIIlllIlIlIlIll.buffer[n];
        }
        return llIIIllIll[3];
    }

    private boolean isPrintableChar(int lllIllIlIlIlIll) {
        int n;
        if (FastScanner.llllIllIIIll(llIIIllIll[4], lllIllIlIlIlIll) && FastScanner.llllIllIIIll(lllIllIlIlIlIll, llIIIllIll[5])) {
            n = llIIIllIll[2];
            "".length();
            if (null != null) {
                return ((0x32 ^ 0x21) & ~(0x1C ^ 0xF)) != 0;
            }
        } else {
            n = llIIIllIll[1];
        }
        return n != 0;
    }

    public boolean hasNext() {
        FastScanner lIlIllIlIlIlIll;
        while (FastScanner.IlllIllIIIll(lIlIllIlIlIlIll.hasNextByte() ? 1 : 0) && FastScanner.IIIIlllIIIll(lIlIllIlIlIlIll.isPrintableChar(lIlIllIlIlIlIll.buffer[lIlIllIlIlIlIll.ptr]) ? 1 : 0)) {
            lIlIllIlIlIlIll.ptr += llIIIllIll[2];
            "".length();
            if ("   ".length() != -" ".length()) continue;
            return ((146 + 29 - 174 + 220 ^ "   ".length() << ("   ".length() << " ".length())) & (0x72 ^ 0x1F ^ (0x30 ^ 0x37) << (" ".length() << (" ".length() << " ".length())) ^ -" ".length())) != 0;
        }
        return this.hasNextByte();
    }

    /*
     * WARNING - void declaration
     */
    public String next() {
        void var1_1;
        FastScanner lIIIllIlIlIlIll;
        if (FastScanner.IIIIlllIIIll(lIIIllIlIlIlIll.hasNext() ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        StringBuilder IIIIllIlIlIlIll = new StringBuilder();
        int llllIlIlIlIlIll = lIIIllIlIlIlIll.readByte();
        while (FastScanner.IlllIllIIIll(lIIIllIlIlIlIll.isPrintableChar(llllIlIlIlIlIll) ? 1 : 0)) {
            IIIIllIlIlIlIll.appendCodePoint(llllIlIlIlIlIll);
            "".length();
            llllIlIlIlIlIll = lIIIllIlIlIlIll.readByte();
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(var1_1);
    }

    public long nextLong() {
        FastScanner IlIlIlIlIlIlIll;
        if (FastScanner.IIIIlllIIIll(IlIlIlIlIlIlIll.hasNext() ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        long lIIlIlIlIlIlIll = 0L;
        int IIIlIlIlIlIlIll = llIIIllIll[1];
        int lllIIlIlIlIlIll = IlIlIlIlIlIlIll.readByte();
        if (FastScanner.lIIIlllIIIll(lllIIlIlIlIlIll, llIIIllIll[6])) {
            IIIlIlIlIlIlIll = llIIIllIll[2];
            lllIIlIlIlIlIll = IlIlIlIlIlIlIll.readByte();
        }
        if (!FastScanner.IlIIlllIIIll(lllIIlIlIlIlIll, llIIIllIll[7]) || FastScanner.IIllIllIIIll(llIIIllIll[8], lllIIlIlIlIlIll)) {
            throw new NumberFormatException();
        }
        do {
            if (FastScanner.llllIllIIIll(llIIIllIll[7], lllIIlIlIlIlIll) && FastScanner.llllIllIIIll(lllIIlIlIlIlIll, llIIIllIll[8])) {
                lIIlIlIlIlIlIll *= 10L;
                lIIlIlIlIlIlIll += (long)(lllIIlIlIlIlIll - llIIIllIll[7]);
                "".length();
                if (null != null) {
                    return 0L;
                }
            } else {
                if (!FastScanner.llIIlllIIIll(lllIIlIlIlIlIll, llIIIllIll[3]) || FastScanner.IIIIlllIIIll(IlIlIlIlIlIlIll.isPrintableChar(lllIIlIlIlIlIll) ? 1 : 0)) {
                    long l;
                    if (FastScanner.IlllIllIIIll(IIIlIlIlIlIlIll)) {
                        l = -lIIlIlIlIlIlIll;
                        "".length();
                        if (" ".length() << (" ".length() << " ".length()) < -" ".length()) {
                            return 0L;
                        }
                    } else {
                        l = lIIlIlIlIlIlIll;
                    }
                    return l;
                }
                throw new NumberFormatException();
            }
            int n = this.readByte();
            "".length();
        } while (" ".length() >= " ".length());
        return 0L;
    }

    /*
     * WARNING - void declaration
     */
    public int nextInt() {
        void var1_1;
        FastScanner IIlIIlIlIlIlIll;
        long llIIIlIlIlIlIll = IIlIIlIlIlIlIll.nextLong();
        if (!FastScanner.lIlIlllIIIll(FastScanner.IIlIlllIIIll(llIIIlIlIlIlIll, Integer.MIN_VALUE)) || FastScanner.IllIlllIIIll(FastScanner.IIlIlllIIIll(llIIIlIlIlIlIll, Integer.MAX_VALUE))) {
            throw new NumberFormatException();
        }
        return (int)var1_1;
    }

    public double nextDouble() {
        FastScanner lIIIIlIlIlIlIll;
        return Double.parseDouble(lIIIIlIlIlIlIll.next());
    }

    static {
        FastScanner.IlIlIllIIIll();
    }

    private static void IlIlIllIIIll() {
        llIIIllIll = new int[9];
        FastScanner.llIIIllIll[0] = " ".length() << ((0x2E ^ 0x77 ^ (0xAA ^ 0xBD) << (" ".length() << " ".length())) << " ".length());
        FastScanner.llIIIllIll[1] = ((0xA9 ^ 0x82) << " ".length() ^ (0xFC ^ 0xBD)) & ("   ".length() << (" ".length() << (" ".length() << " ".length())) ^ (0x4F ^ 0x68) ^ -" ".length());
        FastScanner.llIIIllIll[2] = " ".length();
        FastScanner.llIIIllIll[3] = -" ".length();
        FastScanner.llIIIllIll[4] = 0x4D ^ 0x6C;
        FastScanner.llIIIllIll[5] = (0xFF ^ 0xC0) << " ".length();
        FastScanner.llIIIllIll[6] = 127 + 20 - 129 + 117 ^ (0xFF ^ 0xAA) << " ".length();
        FastScanner.llIIIllIll[7] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
        FastScanner.llIIIllIll[8] = 0x23 ^ 0x1A;
    }

    private static boolean lIIIlllIIIll(int n, int n2) {
        return n == n2;
    }

    private static boolean IlIIlllIIIll(int n, int n2) {
        return n >= n2;
    }

    private static boolean IIllIllIIIll(int n, int n2) {
        return n < n2;
    }

    private static boolean llllIllIIIll(int n, int n2) {
        return n <= n2;
    }

    private static boolean IlllIllIIIll(int n) {
        return n != 0;
    }

    private static boolean IIIIlllIIIll(int n) {
        return n == 0;
    }

    private static boolean lIlIlllIIIll(int n) {
        return n >= 0;
    }

    private static boolean lIllIllIIIll(int n) {
        return n <= 0;
    }

    private static boolean IllIlllIIIll(int n) {
        return n > 0;
    }

    private static boolean llIIlllIIIll(int n, int n2) {
        return n != n2;
    }

    private static int IIlIlllIIIll(long l, long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }
}

