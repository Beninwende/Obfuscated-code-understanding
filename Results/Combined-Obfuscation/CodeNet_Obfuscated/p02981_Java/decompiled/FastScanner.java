/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[lIlIIIlIl[0]];
    private int ptr = lIlIIIlIl[1];
    private int buflen = lIlIIIlIl[1];
    private static int[] lIlIIIlIl;

    FastScanner() {
        FastScanner llIlIlllIIlIll;
    }

    private boolean hasNextByte() {
        FastScanner IIIlIlllIIlIll;
        if (FastScanner.IIIIlIlIIIl(IIIlIlllIIlIll.ptr, IIIlIlllIIlIll.buflen)) {
            return lIlIIIlIl[2];
        }
        IIIlIlllIIlIll.ptr = lIlIIIlIl[1];
        try {
            IIIlIlllIIlIll.buflen = IIIlIlllIIlIll.in.read(IIIlIlllIIlIll.buffer);
            "".length();
        }
        catch (IOException lllIIlllIIlIll) {
            lllIIlllIIlIll.printStackTrace();
        }
        if (" ".length() << " ".length() < -" ".length()) {
            return ((0xB1 ^ 0xBA ^ (0x38 ^ 0x3D) << (" ".length() << (" ".length() << " ".length()))) & ((0xF ^ 0x16) << " ".length() ^ (0x45 ^ 0x2C) ^ -" ".length())) != 0;
        }
        if (FastScanner.lIIIlIlIIIl(IIIlIlllIIlIll.buflen)) {
            return lIlIIIlIl[1];
        }
        return lIlIIIlIl[2];
    }

    private int readByte() {
        FastScanner lIlIIlllIIlIll;
        if (FastScanner.IlIIlIlIIIl(lIlIIlllIIlIll.hasNextByte() ? 1 : 0)) {
            int n = lIlIIlllIIlIll.ptr;
            lIlIIlllIIlIll.ptr = n + lIlIIIlIl[2];
            return lIlIIlllIIlIll.buffer[n];
        }
        return lIlIIIlIl[3];
    }

    private static boolean isPrintableChar(int llIIIlllIIlIll) {
        int n;
        if (FastScanner.llIIlIlIIIl(lIlIIIlIl[4], llIIIlllIIlIll) && FastScanner.llIIlIlIIIl(llIIIlllIIlIll, lIlIIIlIl[5])) {
            n = lIlIIIlIl[2];
            "".length();
            if (null != null) {
                return ((0xCC ^ 0xC1) << " ".length() & ~((0x24 ^ 0x29) << " ".length())) != 0;
            }
        } else {
            n = lIlIIIlIl[1];
        }
        return n != 0;
    }

    public boolean hasNext() {
        FastScanner lIIIIlllIIlIll;
        while (FastScanner.IlIIlIlIIIl(lIIIIlllIIlIll.hasNextByte() ? 1 : 0) && FastScanner.IIlIlIlIIIl(FastScanner.isPrintableChar(lIIIIlllIIlIll.buffer[lIIIIlllIIlIll.ptr]) ? 1 : 0)) {
            lIIIIlllIIlIll.ptr += lIlIIIlIl[2];
            "".length();
            if (-"   ".length() < 0) continue;
            return ((0xC6 ^ 0x93) & ~(0x47 ^ 0x12)) != 0;
        }
        return this.hasNextByte();
    }

    /*
     * WARNING - void declaration
     */
    public String next() {
        void var1_1;
        FastScanner lIlllIllIIlIll;
        if (FastScanner.IIlIlIlIIIl(lIlllIllIIlIll.hasNext() ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        StringBuilder IIlllIllIIlIll = new StringBuilder();
        int llIllIllIIlIll = lIlllIllIIlIll.readByte();
        while (FastScanner.IlIIlIlIIIl(FastScanner.isPrintableChar(llIllIllIIlIll) ? 1 : 0)) {
            IIlllIllIIlIll.appendCodePoint(llIllIllIIlIll);
            "".length();
            llIllIllIIlIll = lIlllIllIIlIll.readByte();
            "".length();
            if (-" ".length() < 0) continue;
            return null;
        }
        return String.valueOf(var1_1);
    }

    public long nextLong() {
        FastScanner IllIlIllIIlIll;
        if (FastScanner.IIlIlIlIIIl(IllIlIllIIlIll.hasNext() ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        long lIlIlIllIIlIll = 0L;
        int IIlIlIllIIlIll = lIlIIIlIl[1];
        int llIIlIllIIlIll = IllIlIllIIlIll.readByte();
        if (FastScanner.lIlIlIlIIIl(llIIlIllIIlIll, lIlIIIlIl[6])) {
            IIlIlIllIIlIll = lIlIIIlIl[2];
            llIIlIllIIlIll = IllIlIllIIlIll.readByte();
        }
        if (!FastScanner.IllIlIlIIIl(llIIlIllIIlIll, lIlIIIlIl[7]) || FastScanner.IIIIlIlIIIl(lIlIIIlIl[8], llIIlIllIIlIll)) {
            throw new NumberFormatException();
        }
        do {
            if (FastScanner.llIIlIlIIIl(lIlIIIlIl[7], llIIlIllIIlIll) && FastScanner.llIIlIlIIIl(llIIlIllIIlIll, lIlIIIlIl[8])) {
                lIlIlIllIIlIll *= 10L;
                lIlIlIllIIlIll += (long)(llIIlIllIIlIll - lIlIIIlIl[7]);
                "".length();
                if (-" ".length() >= " ".length() << " ".length()) {
                    return 0L;
                }
            } else {
                if (!FastScanner.lllIlIlIIIl(llIIlIllIIlIll, lIlIIIlIl[3]) || FastScanner.IIlIlIlIIIl(FastScanner.isPrintableChar(llIIlIllIIlIll) ? 1 : 0)) {
                    long l;
                    if (FastScanner.IlIIlIlIIIl(IIlIlIllIIlIll)) {
                        l = -lIlIlIllIIlIll;
                        "".length();
                        if (-" ".length() > " ".length()) {
                            return 0L;
                        }
                    } else {
                        l = lIlIlIllIIlIll;
                    }
                    return l;
                }
                throw new NumberFormatException();
            }
            int n = this.readByte();
            "".length();
        } while (-" ".length() < 0);
        return 0L;
    }

    /*
     * WARNING - void declaration
     */
    public int nextInt() {
        void var1_1;
        FastScanner IIIIlIllIIlIll;
        long llllIIllIIlIll = IIIIlIllIIlIll.nextLong();
        if (!FastScanner.lIIllIlIIIl(FastScanner.IIIllIlIIIl(llllIIllIIlIll, Integer.MIN_VALUE)) || FastScanner.IlIllIlIIIl(FastScanner.IIIllIlIIIl(llllIIllIIlIll, Integer.MAX_VALUE))) {
            throw new NumberFormatException();
        }
        return (int)var1_1;
    }

    public double nextDouble() {
        FastScanner lIllIIllIIlIll;
        return Double.parseDouble(lIllIIllIIlIll.next());
    }

    /*
     * WARNING - void declaration
     */
    public char[][] nextCharsHW(int IIlIIIllIIlIll, int llIIIIllIIlIll) {
        void var3_3;
        char[][] IlIIIIllIIlIll = new char[IIlIIIllIIlIll][llIIIIllIIlIll];
        int lIIIIIllIIlIll = lIlIIIlIl[1];
        while (FastScanner.IIIIlIlIIIl(lIIIIIllIIlIll, IIlIIIllIIlIll)) {
            FastScanner lIlIIIllIIlIll;
            String IIIIIIllIIlIll = lIlIIIllIIlIll.next();
            int llllllIlIIlIll = lIlIIIlIl[1];
            while (FastScanner.IIIIlIlIIIl(llllllIlIIlIll, llIIIIllIIlIll)) {
                IlIIIIllIIlIll[lIIIIIllIIlIll][llllllIlIIlIll] = IIIIIIllIIlIll.charAt(llllllIlIIlIll);
                ++llllllIlIIlIll;
                "".length();
                if (null == null) continue;
                return null;
            }
            ++lIIIIIllIIlIll;
            "".length();
            if (" ".length() == " ".length()) continue;
            return null;
        }
        return var3_3;
    }

    /*
     * WARNING - void declaration
     */
    public int[][] nextIntsNM(int lllIllIlIIlIll, int IllIllIlIIlIll) {
        void var3_3;
        int[][] lIlIllIlIIlIll = new int[lllIllIlIIlIll][IllIllIlIIlIll];
        int IIlIllIlIIlIll = lIlIIIlIl[1];
        while (FastScanner.IIIIlIlIIIl(IIlIllIlIIlIll, lllIllIlIIlIll)) {
            int llIIllIlIIlIll = lIlIIIlIl[1];
            while (FastScanner.IIIIlIlIIIl(llIIllIlIIlIll, IllIllIlIIlIll)) {
                FastScanner IIIlllIlIIlIll;
                lIlIllIlIIlIll[IIlIllIlIIlIll][llIIllIlIIlIll] = IIIlllIlIIlIll.nextInt();
                ++llIIllIlIIlIll;
                "".length();
                if ((0xA0 ^ 0x8B ^ (0x2B ^ 0x3C) << " ".length()) > 0) continue;
                return null;
            }
            ++IIlIllIlIIlIll;
            "".length();
            if (" ".length() != "   ".length()) continue;
            return null;
        }
        return var3_3;
    }

    static {
        FastScanner.llllIIlIIIl();
    }

    private static void llllIIlIIIl() {
        lIlIIIlIl = new int[9];
        FastScanner.lIlIIIlIl[0] = " ".length() << ((0xA5 ^ 0x82 ^ (0xA4 ^ 0xB5) << " ".length()) << " ".length());
        FastScanner.lIlIIIlIl[1] = (0xBE ^ 0xAB) & ~(0xB ^ 0x1E);
        FastScanner.lIlIIIlIl[2] = " ".length();
        FastScanner.lIlIIIlIl[3] = -" ".length();
        FastScanner.lIlIIIlIl[4] = 0x5D ^ 0x38 ^ (0x2A ^ 0x3B) << (" ".length() << " ".length());
        FastScanner.lIlIIIlIl[5] = (0x14 ^ 0x2B) << " ".length();
        FastScanner.lIlIIIlIl[6] = 0xCF ^ 0xA0 ^ (0xB ^ 0x2A) << " ".length();
        FastScanner.lIlIIIlIl[7] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
        FastScanner.lIlIIIlIl[8] = 0xA2 ^ 0x9B;
    }

    private static boolean lIlIlIlIIIl(int n, int n2) {
        return n == n2;
    }

    private static boolean IllIlIlIIIl(int n, int n2) {
        return n >= n2;
    }

    private static boolean IIIIlIlIIIl(int n, int n2) {
        return n < n2;
    }

    private static boolean llIIlIlIIIl(int n, int n2) {
        return n <= n2;
    }

    private static boolean IlIIlIlIIIl(int n) {
        return n != 0;
    }

    private static boolean IIlIlIlIIIl(int n) {
        return n == 0;
    }

    private static boolean lIIllIlIIIl(int n) {
        return n >= 0;
    }

    private static boolean lIIIlIlIIIl(int n) {
        return n <= 0;
    }

    private static boolean IlIllIlIIIl(int n) {
        return n > 0;
    }

    private static boolean lllIlIlIIIl(int n, int n2) {
        return n != n2;
    }

    private static int IIIllIlIIIl(long l, long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }
}

