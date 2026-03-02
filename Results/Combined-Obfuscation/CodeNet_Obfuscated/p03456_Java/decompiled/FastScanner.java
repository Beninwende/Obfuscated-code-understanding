/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[lIllIlll[0]];
    private int ptr = lIllIlll[1];
    private int buflen = lIllIlll[1];
    private static int[] lIllIlll;

    FastScanner() {
        FastScanner lIIlIIIlIlllll;
    }

    private boolean hasNextByte() {
        FastScanner IllIIIIlIlllll;
        if (FastScanner.IIlllIIIll(IllIIIIlIlllll.ptr, IllIIIIlIlllll.buflen)) {
            return lIllIlll[2];
        }
        IllIIIIlIlllll.ptr = lIllIlll[1];
        try {
            IllIIIIlIlllll.buflen = IllIIIIlIlllll.in.read(IllIIIIlIlllll.buffer);
            "".length();
        }
        catch (IOException lIlIIIIlIlllll) {
            lIlIIIIlIlllll.printStackTrace();
        }
        if (" ".length() << (" ".length() << " ".length()) > " ".length() << (" ".length() << " ".length())) {
            return ((0 ^ 0x1B) & ~(0x46 ^ 0x5D)) != 0;
        }
        if (FastScanner.lIlllIIIll(IllIIIIlIlllll.buflen)) {
            return lIllIlll[1];
        }
        return lIllIlll[2];
    }

    private int readByte() {
        FastScanner llIIIIIlIlllll;
        if (FastScanner.IllllIIIll(llIIIIIlIlllll.hasNextByte() ? 1 : 0)) {
            int n = llIIIIIlIlllll.ptr;
            llIIIIIlIlllll.ptr = n + lIllIlll[2];
            return llIIIIIlIlllll.buffer[n];
        }
        return lIllIlll[3];
    }

    private static boolean isPrintableChar(int lIIIIIIlIlllll) {
        int n;
        if (FastScanner.lllllIIIll(lIllIlll[4], lIIIIIIlIlllll) && FastScanner.lllllIIIll(lIIIIIIlIlllll, lIllIlll[5])) {
            n = lIllIlll[2];
            "".length();
            if (" ".length() << (" ".length() << " ".length()) == 0) {
                return ((110 + 224 - 115 + 26 ^ (0xCC ^ 0x95) << " ".length()) & ((0xA6 ^ 0xB3) << (" ".length() << " ".length()) ^ (0x37 ^ 0x24) ^ -" ".length())) != 0;
            }
        } else {
            n = lIllIlll[1];
        }
        return n != 0;
    }

    public boolean hasNext() {
        FastScanner lllllllIIlllll;
        while (FastScanner.IllllIIIll(lllllllIIlllll.hasNextByte() ? 1 : 0) && FastScanner.IIIIIlIIll(FastScanner.isPrintableChar(lllllllIIlllll.buffer[lllllllIIlllll.ptr]) ? 1 : 0)) {
            lllllllIIlllll.ptr += lIllIlll[2];
            "".length();
            if ((" ".length() << (" ".length() << (" ".length() << " ".length())) & (" ".length() << (" ".length() << (" ".length() << " ".length())) ^ -" ".length())) <= 0) continue;
            return ((0x64 ^ 0x6B ^ (0x23 ^ 0x2E) << " ".length()) & ((0x51 ^ 0x7A) << " ".length() ^ (0xF8 ^ 0xBB) ^ -" ".length())) != 0;
        }
        return this.hasNextByte();
    }

    /*
     * WARNING - void declaration
     */
    public String next() {
        void var1_1;
        FastScanner llIllllIIlllll;
        if (FastScanner.IIIIIlIIll(llIllllIIlllll.hasNext() ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        StringBuilder IlIllllIIlllll = new StringBuilder();
        int lIIllllIIlllll = llIllllIIlllll.readByte();
        while (FastScanner.IllllIIIll(FastScanner.isPrintableChar(lIIllllIIlllll) ? 1 : 0)) {
            IlIllllIIlllll.appendCodePoint(lIIllllIIlllll);
            "".length();
            lIIllllIIlllll = llIllllIIlllll.readByte();
            "".length();
            if (" ".length() << (" ".length() << " ".length()) >= 0) continue;
            return null;
        }
        return String.valueOf(var1_1);
    }

    public long nextLong() {
        FastScanner IIlIlllIIlllll;
        if (FastScanner.IIIIIlIIll(IIlIlllIIlllll.hasNext() ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        long llIIlllIIlllll = 0L;
        int IlIIlllIIlllll = lIllIlll[1];
        int lIIIlllIIlllll = IIlIlllIIlllll.readByte();
        if (FastScanner.lIIIIlIIll(lIIIlllIIlllll, lIllIlll[6])) {
            IlIIlllIIlllll = lIllIlll[2];
            lIIIlllIIlllll = IIlIlllIIlllll.readByte();
        }
        if (!FastScanner.IlIIIlIIll(lIIIlllIIlllll, lIllIlll[7]) || FastScanner.IIlllIIIll(lIllIlll[8], lIIIlllIIlllll)) {
            throw new NumberFormatException();
        }
        do {
            if (FastScanner.lllllIIIll(lIllIlll[7], lIIIlllIIlllll) && FastScanner.lllllIIIll(lIIIlllIIlllll, lIllIlll[8])) {
                llIIlllIIlllll *= 10L;
                llIIlllIIlllll += (long)(lIIIlllIIlllll - lIllIlll[7]);
                "".length();
                if (((0x5C ^ 0x59) << "   ".length() ^ (0x68 ^ 0x45)) <= 0) {
                    return 0L;
                }
            } else {
                if (!FastScanner.llIIIlIIll(lIIIlllIIlllll, lIllIlll[3]) || FastScanner.IIIIIlIIll(FastScanner.isPrintableChar(lIIIlllIIlllll) ? 1 : 0)) {
                    long l;
                    if (FastScanner.IllllIIIll(IlIIlllIIlllll)) {
                        l = -llIIlllIIlllll;
                        "".length();
                        if (" ".length() << (" ".length() << " ".length()) == 0) {
                            return 0L;
                        }
                    } else {
                        l = llIIlllIIlllll;
                    }
                    return l;
                }
                throw new NumberFormatException();
            }
            int n = this.readByte();
            "".length();
        } while (-"   ".length() < 0);
        return 0L;
    }

    /*
     * WARNING - void declaration
     */
    public int nextInt() {
        void var1_1;
        FastScanner IlllIllIIlllll;
        long lIllIllIIlllll = IlllIllIIlllll.nextLong();
        if (!FastScanner.lIlIIlIIll(FastScanner.IIlIIlIIll(lIllIllIIlllll, Integer.MIN_VALUE)) || FastScanner.IllIIlIIll(FastScanner.IIlIIlIIll(lIllIllIIlllll, Integer.MAX_VALUE))) {
            throw new NumberFormatException();
        }
        return (int)var1_1;
    }

    public double nextDouble() {
        FastScanner llIlIllIIlllll;
        return Double.parseDouble(llIlIllIIlllll.next());
    }

    static {
        FastScanner.llIllIIIll();
    }

    private static void llIllIIIll() {
        lIllIlll = new int[9];
        FastScanner.lIllIlll[0] = " ".length() << ((0x88 ^ 0x8D) << " ".length());
        FastScanner.lIllIlll[1] = (0x4C ^ 0x63) & ~(0x10 ^ 0x3F);
        FastScanner.lIllIlll[2] = " ".length();
        FastScanner.lIllIlll[3] = -" ".length();
        FastScanner.lIllIlll[4] = 28 + 141 - 64 + 46 ^ (0x30 ^ 0x6B) << " ".length();
        FastScanner.lIllIlll[5] = (0x41 ^ 0x7E) << " ".length();
        FastScanner.lIllIlll[6] = 0x42 ^ 0x6F;
        FastScanner.lIllIlll[7] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
        FastScanner.lIllIlll[8] = (5 ^ 2) << "   ".length() ^ " ".length();
    }

    private static boolean lIIIIlIIll(int n, int n2) {
        return n == n2;
    }

    private static boolean IlIIIlIIll(int n, int n2) {
        return n >= n2;
    }

    private static boolean IIlllIIIll(int n, int n2) {
        return n < n2;
    }

    private static boolean lllllIIIll(int n, int n2) {
        return n <= n2;
    }

    private static boolean IllllIIIll(int n) {
        return n != 0;
    }

    private static boolean IIIIIlIIll(int n) {
        return n == 0;
    }

    private static boolean lIlIIlIIll(int n) {
        return n >= 0;
    }

    private static boolean lIlllIIIll(int n) {
        return n <= 0;
    }

    private static boolean IllIIlIIll(int n) {
        return n > 0;
    }

    private static boolean llIIIlIIll(int n, int n2) {
        return n != n2;
    }

    private static int IIlIIlIIll(long l, long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }
}

