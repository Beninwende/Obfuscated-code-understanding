/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[IIIlIIIlll[0]];
    private int ptr = IIIlIIIlll[1];
    private int buflen = IIIlIIIlll[1];
    private static int[] IIIlIIIlll;

    FastScanner() {
        FastScanner lIlIlIIIIIlIIll;
    }

    private boolean hasNextByte() {
        FastScanner IlIIlIIIIIlIIll;
        if (FastScanner.lIlIlIIIlIll(IlIIlIIIIIlIIll.ptr, IlIIlIIIIIlIIll.buflen)) {
            return IIIlIIIlll[2];
        }
        IlIIlIIIIIlIIll.ptr = IIIlIIIlll[1];
        try {
            IlIIlIIIIIlIIll.buflen = IlIIlIIIIIlIIll.in.read(IlIIlIIIIIlIIll.buffer);
            "".length();
        }
        catch (IOException lIIIlIIIIIlIIll) {
            lIIIlIIIIIlIIll.printStackTrace();
        }
        if ((0xB7 ^ 0xB8 ^ (0x5E ^ 0x5B) << " ".length()) == 0) {
            return ("   ".length() & ("   ".length() ^ -" ".length())) != 0;
        }
        if (FastScanner.IllIlIIIlIll(IlIIlIIIIIlIIll.buflen)) {
            return IIIlIIIlll[1];
        }
        return IIIlIIIlll[2];
    }

    private int readByte() {
        FastScanner llllIIIIIIlIIll;
        if (FastScanner.lllIlIIIlIll(llllIIIIIIlIIll.hasNextByte() ? 1 : 0)) {
            int n = llllIIIIIIlIIll.ptr;
            llllIIIIIIlIIll.ptr = n + IIIlIIIlll[2];
            return llllIIIIIIlIIll.buffer[n];
        }
        return IIIlIIIlll[3];
    }

    private static boolean isPrintableChar(int lIllIIIIIIlIIll) {
        int n;
        if (FastScanner.IIIllIIIlIll(IIIlIIIlll[4], lIllIIIIIIlIIll) && FastScanner.IIIllIIIlIll(lIllIIIIIIlIIll, IIIlIIIlll[5])) {
            n = IIIlIIIlll[2];
            "".length();
            if (-" ".length() >= " ".length() << (" ".length() << " ".length())) {
                return (" ".length() & (" ".length() ^ -" ".length())) != 0;
            }
        } else {
            n = IIIlIIIlll[1];
        }
        return n != 0;
    }

    public boolean hasNext() {
        FastScanner llIlIIIIIIlIIll;
        while (FastScanner.lllIlIIIlIll(llIlIIIIIIlIIll.hasNextByte() ? 1 : 0) && FastScanner.lIIllIIIlIll(FastScanner.isPrintableChar(llIlIIIIIIlIIll.buffer[llIlIIIIIIlIIll.ptr]) ? 1 : 0)) {
            llIlIIIIIIlIIll.ptr += IIIlIIIlll[2];
            "".length();
            if (" ".length() < " ".length() << (" ".length() << " ".length())) continue;
            return ((0x4B ^ 0xE ^ (0x3F ^ 8) << " ".length()) & (0x55 ^ 0x4E ^ "   ".length() << (" ".length() << (" ".length() << " ".length())) ^ -" ".length())) != 0;
        }
        return this.hasNextByte();
    }

    /*
     * WARNING - void declaration
     */
    public String next() {
        void var1_1;
        FastScanner lllIIIIIIIlIIll;
        if (FastScanner.lIIllIIIlIll(lllIIIIIIIlIIll.hasNext() ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        StringBuilder IllIIIIIIIlIIll = new StringBuilder();
        int lIlIIIIIIIlIIll = lllIIIIIIIlIIll.readByte();
        while (FastScanner.lllIlIIIlIll(FastScanner.isPrintableChar(lIlIIIIIIIlIIll) ? 1 : 0)) {
            IllIIIIIIIlIIll.appendCodePoint(lIlIIIIIIIlIIll);
            "".length();
            lIlIIIIIIIlIIll = lllIIIIIIIlIIll.readByte();
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(var1_1);
    }

    public long nextLong() {
        FastScanner IIIIIIIIIIlIIll;
        if (FastScanner.lIIllIIIlIll(IIIIIIIIIIlIIll.hasNext() ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        long llllllllllIIIll = 0L;
        int IlllllllllIIIll = IIIlIIIlll[1];
        int lIllllllllIIIll = IIIIIIIIIIlIIll.readByte();
        if (FastScanner.IlIllIIIlIll(lIllllllllIIIll, IIIlIIIlll[6])) {
            IlllllllllIIIll = IIIlIIIlll[2];
            lIllllllllIIIll = IIIIIIIIIIlIIll.readByte();
        }
        if (!FastScanner.llIllIIIlIll(lIllllllllIIIll, IIIlIIIlll[7]) || FastScanner.lIlIlIIIlIll(IIIlIIIlll[8], lIllllllllIIIll)) {
            throw new NumberFormatException();
        }
        do {
            if (FastScanner.IIIllIIIlIll(IIIlIIIlll[7], lIllllllllIIIll) && FastScanner.IIIllIIIlIll(lIllllllllIIIll, IIIlIIIlll[8])) {
                llllllllllIIIll *= 10L;
                llllllllllIIIll += (long)(lIllllllllIIIll - IIIlIIIlll[7]);
                "".length();
                if (-"   ".length() >= 0) {
                    return 0L;
                }
            } else {
                if (!FastScanner.IIlllIIIlIll(lIllllllllIIIll, IIIlIIIlll[3]) || FastScanner.lIIllIIIlIll(FastScanner.isPrintableChar(lIllllllllIIIll) ? 1 : 0)) {
                    long l;
                    if (FastScanner.lllIlIIIlIll(IlllllllllIIIll)) {
                        l = -llllllllllIIIll;
                        "".length();
                        if (((0x4D ^ 0xC ^ (0x34 ^ 0x31) << (" ".length() << " ".length())) & (" ".length() << (" ".length() << " ".length()) ^ (0x44 ^ 0x15) ^ -" ".length())) != 0) {
                            return 0L;
                        }
                    } else {
                        l = llllllllllIIIll;
                    }
                    return l;
                }
                throw new NumberFormatException();
            }
            int n = this.readByte();
            "".length();
        } while (-" ".length() < "   ".length());
        return 0L;
    }

    /*
     * WARNING - void declaration
     */
    public int nextInt() {
        void var1_1;
        FastScanner IlIlllllllIIIll;
        long lIIlllllllIIIll = IlIlllllllIIIll.nextLong();
        if (!FastScanner.IllllIIIlIll(FastScanner.lIlllIIIlIll(lIIlllllllIIIll, Integer.MIN_VALUE)) || FastScanner.lllllIIIlIll(FastScanner.lIlllIIIlIll(lIIlllllllIIIll, Integer.MAX_VALUE))) {
            throw new NumberFormatException();
        }
        return (int)var1_1;
    }

    public double nextDouble() {
        FastScanner lllIllllllIIIll;
        return Double.parseDouble(lllIllllllIIIll.next());
    }

    static {
        FastScanner.IIlIlIIIlIll();
    }

    private static void IIlIlIIIlIll() {
        IIIlIIIlll = new int[9];
        FastScanner.IIIlIIIlll[0] = " ".length() << ((0x11 ^ 0x14) << " ".length());
        FastScanner.IIIlIIIlll[1] = (0x80 ^ 0x85) << " ".length() & ~((0x4B ^ 0x4E) << " ".length());
        FastScanner.IIIlIIIlll[2] = " ".length();
        FastScanner.IIIlIIIlll[3] = -" ".length();
        FastScanner.IIIlIIIlll[4] = 0x97 ^ 0xB6;
        FastScanner.IIIlIIIlll[5] = (83 + 173 - 192 + 113 ^ (0xEF ^ 0xA8) << " ".length()) << " ".length();
        FastScanner.IIIlIIIlll[6] = 0xBB ^ 0x96;
        FastScanner.IIIlIIIlll[7] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
        FastScanner.IIIlIIIlll[8] = 60 + 26 - 71 + 112 << " ".length() ^ 133 + 115 - 160 + 111;
    }

    private static boolean IlIllIIIlIll(int n, int n2) {
        return n == n2;
    }

    private static boolean llIllIIIlIll(int n, int n2) {
        return n >= n2;
    }

    private static boolean lIlIlIIIlIll(int n, int n2) {
        return n < n2;
    }

    private static boolean IIIllIIIlIll(int n, int n2) {
        return n <= n2;
    }

    private static boolean lllIlIIIlIll(int n) {
        return n != 0;
    }

    private static boolean lIIllIIIlIll(int n) {
        return n == 0;
    }

    private static boolean IllllIIIlIll(int n) {
        return n >= 0;
    }

    private static boolean IllIlIIIlIll(int n) {
        return n <= 0;
    }

    private static boolean lllllIIIlIll(int n) {
        return n > 0;
    }

    private static boolean IIlllIIIlIll(int n, int n2) {
        return n != n2;
    }

    private static int lIlllIIIlIll(long l, long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }
}

