/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[IIIIlIIlll[0]];
    private int ptr = IIIIlIIlll[1];
    private int buflen = IIIIlIIlll[1];
    private static int[] IIIIlIIlll;

    FastScanner() {
        FastScanner lllIIlIIllIIIll;
    }

    private boolean hasNextByte() {
        FastScanner IIlIIlIIllIIIll;
        if (FastScanner.IlIIllIIlIll(IIlIIlIIllIIIll.ptr, IIlIIlIIllIIIll.buflen)) {
            return IIIIlIIlll[2];
        }
        IIlIIlIIllIIIll.ptr = IIIIlIIlll[1];
        try {
            IIlIIlIIllIIIll.buflen = IIlIIlIIllIIIll.in.read(IIlIIlIIllIIIll.buffer);
            "".length();
        }
        catch (IOException llIIIlIIllIIIll) {
            llIIIlIIllIIIll.printStackTrace();
        }
        if ("   ".length() <= 0) {
            return ((0x42 ^ 0x39 ^ (0x86 ^ 0x9B) << (" ".length() << " ".length())) << (" ".length() << " ".length()) & (((0xC ^ 0x3B) << " ".length() ^ (0xE5 ^ 0x84)) << (" ".length() << " ".length()) ^ -" ".length())) != 0;
        }
        if (FastScanner.llIIllIIlIll(IIlIIlIIllIIIll.buflen)) {
            return IIIIlIIlll[1];
        }
        return IIIIlIIlll[2];
    }

    private int readByte() {
        FastScanner lIIIIlIIllIIIll;
        if (FastScanner.IIlIllIIlIll(lIIIIlIIllIIIll.hasNextByte() ? 1 : 0)) {
            int n = lIIIIlIIllIIIll.ptr;
            lIIIIlIIllIIIll.ptr = n + IIIIlIIlll[2];
            return lIIIIlIIllIIIll.buffer[n];
        }
        return IIIIlIIlll[3];
    }

    private static boolean isPrintableChar(int lllllIIIllIIIll) {
        int n;
        if (FastScanner.lIlIllIIlIll(IIIIlIIlll[4], lllllIIIllIIIll) && FastScanner.lIlIllIIlIll(lllllIIIllIIIll, IIIIlIIlll[5])) {
            n = IIIIlIIlll[2];
            "".length();
            if (" ".length() > "   ".length()) {
                return ((0x2E ^ 0x63) & ~(0x39 ^ 0x74)) != 0;
            }
        } else {
            n = IIIIlIIlll[1];
        }
        return n != 0;
    }

    public boolean hasNext() {
        FastScanner lIlllIIIllIIIll;
        while (FastScanner.IIlIllIIlIll(lIlllIIIllIIIll.hasNextByte() ? 1 : 0) && FastScanner.IllIllIIlIll(FastScanner.isPrintableChar(lIlllIIIllIIIll.buffer[lIlllIIIllIIIll.ptr]) ? 1 : 0)) {
            lIlllIIIllIIIll.ptr += IIIIlIIlll[2];
            "".length();
            if (" ".length() << (" ".length() << " ".length()) > ((0x74 ^ 0x7B) << (" ".length() << " ".length()) & ~((0xA4 ^ 0xAB) << (" ".length() << " ".length())))) continue;
            return (" ".length() << (" ".length() << (" ".length() << " ".length())) & ~(" ".length() << (" ".length() << (" ".length() << " ".length())))) != 0;
        }
        return this.hasNextByte();
    }

    /*
     * WARNING - void declaration
     */
    public String next() {
        void var1_1;
        FastScanner lIIllIIIllIIIll;
        if (FastScanner.IllIllIIlIll(lIIllIIIllIIIll.hasNext() ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        StringBuilder IIIllIIIllIIIll = new StringBuilder();
        int lllIlIIIllIIIll = lIIllIIIllIIIll.readByte();
        while (FastScanner.IIlIllIIlIll(FastScanner.isPrintableChar(lllIlIIIllIIIll) ? 1 : 0)) {
            IIIllIIIllIIIll.appendCodePoint(lllIlIIIllIIIll);
            "".length();
            lllIlIIIllIIIll = lIIllIIIllIIIll.readByte();
            "".length();
            if (-"  ".length() < 0) continue;
            return null;
        }
        return String.valueOf(var1_1);
    }

    public long nextLong() {
        FastScanner IlIIlIIIllIIIll;
        if (FastScanner.IllIllIIlIll(IlIIlIIIllIIIll.hasNext() ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        long lIIIlIIIllIIIll = 0L;
        int IIIIlIIIllIIIll = IIIIlIIlll[1];
        int llllIIIIllIIIll = IlIIlIIIllIIIll.readByte();
        if (FastScanner.lllIllIIlIll(llllIIIIllIIIll, IIIIlIIlll[6])) {
            IIIIlIIIllIIIll = IIIIlIIlll[2];
            llllIIIIllIIIll = IlIIlIIIllIIIll.readByte();
        }
        if (!FastScanner.IIIlllIIlIll(llllIIIIllIIIll, IIIIlIIlll[7]) || FastScanner.IlIIllIIlIll(IIIIlIIlll[8], llllIIIIllIIIll)) {
            throw new NumberFormatException();
        }
        do {
            if (FastScanner.lIlIllIIlIll(IIIIlIIlll[7], llllIIIIllIIIll) && FastScanner.lIlIllIIlIll(llllIIIIllIIIll, IIIIlIIlll[8])) {
                lIIIlIIIllIIIll *= 10L;
                lIIIlIIIllIIIll += (long)(llllIIIIllIIIll - IIIIlIIlll[7]);
                "".length();
                if (null != null) {
                    return 0L;
                }
            } else {
                if (!FastScanner.lIIlllIIlIll(llllIIIIllIIIll, IIIIlIIlll[3]) || FastScanner.IllIllIIlIll(FastScanner.isPrintableChar(llllIIIIllIIIll) ? 1 : 0)) {
                    long l;
                    if (FastScanner.IIlIllIIlIll(IIIIlIIIllIIIll)) {
                        l = -lIIIlIIIllIIIll;
                        "".length();
                        if (" ".length() < 0) {
                            return 0L;
                        }
                    } else {
                        l = lIIIlIIIllIIIll;
                    }
                    return l;
                }
                throw new NumberFormatException();
            }
            int n = this.readByte();
            "".length();
        } while (((0xE ^ 0x6F ^ (0x97 ^ 0x9A) << (" ".length() << " ".length())) & ((0xAB ^ 0xB0) << " ".length() ^ (0x64 ^ 7) ^ -" ".length())) <= 0);
        return 0L;
    }

    /*
     * WARNING - void declaration
     */
    public int nextInt() {
        void var1_1;
        FastScanner IIllIIIIllIIIll;
        long llIlIIIIllIIIll = IIllIIIIllIIIll.nextLong();
        if (!FastScanner.llIlllIIlIll(FastScanner.IlIlllIIlIll(llIlIIIIllIIIll, Integer.MIN_VALUE)) || FastScanner.IIllllIIlIll(FastScanner.IlIlllIIlIll(llIlIIIIllIIIll, Integer.MAX_VALUE))) {
            throw new NumberFormatException();
        }
        return (int)var1_1;
    }

    public double nextDouble() {
        FastScanner lIIlIIIIllIIIll;
        return Double.parseDouble(lIIlIIIIllIIIll.next());
    }

    /*
     * WARNING - void declaration
     */
    public int[] nextIntsN(int llIIIIIIllIIIll) {
        void var2_2;
        int[] IlIIIIIIllIIIll = new int[llIIIIIIllIIIll];
        int lIIIIIIIllIIIll = IIIIlIIlll[1];
        while (FastScanner.IlIIllIIlIll(lIIIIIIIllIIIll, llIIIIIIllIIIll)) {
            FastScanner IIlIIIIIllIIIll;
            IlIIIIIIllIIIll[lIIIIIIIllIIIll] = IIlIIIIIllIIIll.nextInt();
            ++lIIIIIIIllIIIll;
            "".length();
            if (" ".length() << (" ".length() << " ".length()) != "   ".length()) continue;
            return null;
        }
        return var2_2;
    }

    /*
     * WARNING - void declaration
     */
    public long[] nextLongsN(int llIlllllIlIIIll) {
        void var2_2;
        long[] IlIlllllIlIIIll = new long[llIlllllIlIIIll];
        int lIIlllllIlIIIll = IIIIlIIlll[1];
        while (FastScanner.IlIIllIIlIll(lIIlllllIlIIIll, llIlllllIlIIIll)) {
            FastScanner IIllllllIlIIIll;
            IlIlllllIlIIIll[lIIlllllIlIIIll] = IIllllllIlIIIll.nextLong();
            ++lIIlllllIlIIIll;
            "".length();
            if ((" ".length() & (" ".length() ^ -" ".length())) == 0) continue;
            return null;
        }
        return var2_2;
    }

    /*
     * WARNING - void declaration
     */
    public char[] nextCharsN(int IlIIllllIlIIIll) {
        void var2_2;
        FastScanner llIIllllIlIIIll;
        char[] lIIIllllIlIIIll = new char[IlIIllllIlIIIll];
        String IIIIllllIlIIIll = llIIllllIlIIIll.next();
        int llllIlllIlIIIll = IIIIlIIlll[1];
        while (FastScanner.IlIIllIIlIll(llllIlllIlIIIll, IlIIllllIlIIIll)) {
            lIIIllllIlIIIll[llllIlllIlIIIll] = IIIIllllIlIIIll.charAt(llllIlllIlIIIll);
            ++llllIlllIlIIIll;
            "".length();
            if (" ".length() << " ".length() != 0) continue;
            return null;
        }
        return var2_2;
    }

    /*
     * WARNING - void declaration
     */
    public char[][] nextCharsHW(int IllIIlllIlIIIll, int lIlIIlllIlIIIll) {
        void var3_3;
        char[][] IIlIIlllIlIIIll = new char[IllIIlllIlIIIll][lIlIIlllIlIIIll];
        int llIIIlllIlIIIll = IIIIlIIlll[1];
        while (FastScanner.IlIIllIIlIll(llIIIlllIlIIIll, IllIIlllIlIIIll)) {
            FastScanner lllIIlllIlIIIll;
            String IlIIIlllIlIIIll = lllIIlllIlIIIll.next();
            int lIIIIlllIlIIIll = IIIIlIIlll[1];
            while (FastScanner.IlIIllIIlIll(lIIIIlllIlIIIll, lIlIIlllIlIIIll)) {
                IIlIIlllIlIIIll[llIIIlllIlIIIll][lIIIIlllIlIIIll] = IlIIIlllIlIIIll.charAt(lIIIIlllIlIIIll);
                ++lIIIIlllIlIIIll;
                "".length();
                if (((0xB9 ^ 0xA2) & ~(0xB3 ^ 0xA8)) == 0) continue;
                return null;
            }
            ++llIIIlllIlIIIll;
            "".length();
            if (null == null) continue;
            return null;
        }
        return var3_3;
    }

    /*
     * WARNING - void declaration
     */
    public int[][] nextIntsNM(int lIIllIllIlIIIll, int IIIllIllIlIIIll) {
        void var3_3;
        int[][] lllIlIllIlIIIll = new int[lIIllIllIlIIIll][IIIllIllIlIIIll];
        int IllIlIllIlIIIll = IIIIlIIlll[1];
        while (FastScanner.IlIIllIIlIll(IllIlIllIlIIIll, lIIllIllIlIIIll)) {
            int lIlIlIllIlIIIll = IIIIlIIlll[1];
            while (FastScanner.IlIIllIIlIll(lIlIlIllIlIIIll, IIIllIllIlIIIll)) {
                FastScanner IlIllIllIlIIIll;
                lllIlIllIlIIIll[IllIlIllIlIIIll][lIlIlIllIlIIIll] = IlIllIllIlIIIll.nextInt();
                ++lIlIlIllIlIIIll;
                "".length();
                if (" ".length() << (" ".length() << " ".length()) >= 0) continue;
                return null;
            }
            ++IllIlIllIlIIIll;
            "".length();
            if (-" ".length() < 0) continue;
            return null;
        }
        return var3_3;
    }

    static {
        FastScanner.lIIIllIIlIll();
    }

    private static void lIIIllIIlIll() {
        IIIIlIIlll = new int[9];
        FastScanner.IIIIlIIlll[0] = " ".length() << ((0x7B ^ 0x10 ^ (0x7C ^ 0x4B) << " ".length()) << " ".length());
        FastScanner.IIIIlIIlll[1] = (0x47 ^ 0x62) << " ".length() & ~((0x9C ^ 0xB9) << " ".length());
        FastScanner.IIIIlIIlll[2] = " ".length();
        FastScanner.IIIIlIIlll[3] = -" ".length();
        FastScanner.IIIIlIIlll[4] = 0xE2 ^ 0xB1 ^ (5 ^ 0x3C) << " ".length();
        FastScanner.IIIIlIIlll[5] = (164 + 106 - 140 + 59 ^ (0xC2 ^ 0x83) << " ".length()) << " ".length();
        FastScanner.IIIIlIIlll[6] = 0x59 ^ 0x74;
        FastScanner.IIIIlIIlll[7] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
        FastScanner.IIIIlIIlll[8] = 14 + 117 - 2 + 4 ^ (0x57 ^ 0x78) << (" ".length() << " ".length());
    }

    private static boolean lllIllIIlIll(int n, int n2) {
        return n == n2;
    }

    private static boolean IIIlllIIlIll(int n, int n2) {
        return n >= n2;
    }

    private static boolean IlIIllIIlIll(int n, int n2) {
        return n < n2;
    }

    private static boolean lIlIllIIlIll(int n, int n2) {
        return n <= n2;
    }

    private static boolean IIlIllIIlIll(int n) {
        return n != 0;
    }

    private static boolean IllIllIIlIll(int n) {
        return n == 0;
    }

    private static boolean llIlllIIlIll(int n) {
        return n >= 0;
    }

    private static boolean llIIllIIlIll(int n) {
        return n <= 0;
    }

    private static boolean IIllllIIlIll(int n) {
        return n > 0;
    }

    private static boolean lIIlllIIlIll(int n, int n2) {
        return n != n2;
    }

    private static int IlIlllIIlIll(long l, long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }
}

