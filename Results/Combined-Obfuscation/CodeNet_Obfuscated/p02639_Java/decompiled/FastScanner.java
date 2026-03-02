/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[IIllIIIlll[0]];
    private int ptr = IIllIIIlll[1];
    private int buflen = IIllIIIlll[1];
    private static int[] IIllIIIlll;

    FastScanner() {
        FastScanner lIlIIIllllIIIll;
    }

    private boolean hasNextByte() {
        FastScanner IlIIIIllllIIIll;
        if (FastScanner.IIlIIlIIlIll(IlIIIIllllIIIll.ptr, IlIIIIllllIIIll.buflen)) {
            return IIllIIIlll[2];
        }
        IlIIIIllllIIIll.ptr = IIllIIIlll[1];
        try {
            IlIIIIllllIIIll.buflen = IlIIIIllllIIIll.in.read(IlIIIIllllIIIll.buffer);
            "".length();
        }
        catch (IOException lIIIIIllllIIIll) {
            lIIIIIllllIIIll.printStackTrace();
        }
        if (" ".length() << " ".length() < -" ".length()) {
            return (" ".length() << (" ".length() << " ".length()) & (" ".length() << (" ".length() << " ".length()) ^ -" ".length()) & (((0x49 ^ 0x60) << (" ".length() << " ".length()) ^ 6 + 4 - -108 + 29) & ((0x27 ^ 0x1A) << " ".length() ^ (0x6F ^ 0x22) ^ -" ".length()) ^ -" ".length())) != 0;
        }
        if (FastScanner.lIlIIlIIlIll(IlIIIIllllIIIll.buflen)) {
            return IIllIIIlll[1];
        }
        return IIllIIIlll[2];
    }

    private int readByte() {
        FastScanner llllllIlllIIIll;
        if (FastScanner.IllIIlIIlIll(llllllIlllIIIll.hasNextByte() ? 1 : 0)) {
            int n = llllllIlllIIIll.ptr;
            llllllIlllIIIll.ptr = n + IIllIIIlll[2];
            return llllllIlllIIIll.buffer[n];
        }
        return IIllIIIlll[3];
    }

    private static boolean isPrintableChar(int lIllllIlllIIIll) {
        int n;
        if (FastScanner.lllIIlIIlIll(IIllIIIlll[4], lIllllIlllIIIll) && FastScanner.lllIIlIIlIll(lIllllIlllIIIll, IIllIIIlll[5])) {
            n = IIllIIIlll[2];
            "".length();
            if ("   ".length() >= " ".length() << (" ".length() << " ".length())) {
                return ((0x6B ^ 0x78 ^ (0x46 ^ 0x4D) << " ".length()) << (" ".length() << (" ".length() << " ".length())) & ((0xC1 ^ 0x8A ^ (0x3F ^ 0x18) << " ".length()) << (" ".length() << (" ".length() << " ".length())) ^ -" ".length())) != 0;
            }
        } else {
            n = IIllIIIlll[1];
        }
        return n != 0;
    }

    public boolean hasNext() {
        FastScanner llIlllIlllIIIll;
        while (FastScanner.IllIIlIIlIll(llIlllIlllIIIll.hasNextByte() ? 1 : 0) && FastScanner.IIIlIlIIlIll(FastScanner.isPrintableChar(llIlllIlllIIIll.buffer[llIlllIlllIIIll.ptr]) ? 1 : 0)) {
            llIlllIlllIIIll.ptr += IIllIIIlll[2];
            "".length();
            if ("   ".length() >= ((0x73 ^ 0x76) & ~(1 ^ 4))) continue;
            return ((0xD5 ^ 0x8C) & ~(0xE7 ^ 0xBE)) != 0;
        }
        return this.hasNextByte();
    }

    /*
     * WARNING - void declaration
     */
    public String next() {
        void var1_1;
        FastScanner lllIllIlllIIIll;
        if (FastScanner.IIIlIlIIlIll(lllIllIlllIIIll.hasNext() ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        StringBuilder IllIllIlllIIIll = new StringBuilder();
        int lIlIllIlllIIIll = lllIllIlllIIIll.readByte();
        while (FastScanner.IllIIlIIlIll(FastScanner.isPrintableChar(lIlIllIlllIIIll) ? 1 : 0)) {
            IllIllIlllIIIll.appendCodePoint(lIlIllIlllIIIll);
            "".length();
            lIlIllIlllIIIll = lllIllIlllIIIll.readByte();
            "".length();
            if ("   ".length() > " ".length()) continue;
            return null;
        }
        return String.valueOf(var1_1);
    }

    public long nextLong() {
        FastScanner IIIIllIlllIIIll;
        if (FastScanner.IIIlIlIIlIll(IIIIllIlllIIIll.hasNext() ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        long llllIlIlllIIIll = 0L;
        int IlllIlIlllIIIll = IIllIIIlll[1];
        int lIllIlIlllIIIll = IIIIllIlllIIIll.readByte();
        if (FastScanner.lIIlIlIIlIll(lIllIlIlllIIIll, IIllIIIlll[6])) {
            IlllIlIlllIIIll = IIllIIIlll[2];
            lIllIlIlllIIIll = IIIIllIlllIIIll.readByte();
        }
        if (!FastScanner.IlIlIlIIlIll(lIllIlIlllIIIll, IIllIIIlll[7]) || FastScanner.IIlIIlIIlIll(IIllIIIlll[8], lIllIlIlllIIIll)) {
            throw new NumberFormatException();
        }
        do {
            if (FastScanner.lllIIlIIlIll(IIllIIIlll[7], lIllIlIlllIIIll) && FastScanner.lllIIlIIlIll(lIllIlIlllIIIll, IIllIIIlll[8])) {
                llllIlIlllIIIll *= 10L;
                llllIlIlllIIIll += (long)(lIllIlIlllIIIll - IIllIIIlll[7]);
                "".length();
                if ("   ".length() <= 0) {
                    return 0L;
                }
            } else {
                if (!FastScanner.llIlIlIIlIll(lIllIlIlllIIIll, IIllIIIlll[3]) || FastScanner.IIIlIlIIlIll(FastScanner.isPrintableChar(lIllIlIlllIIIll) ? 1 : 0)) {
                    long l;
                    if (FastScanner.IllIIlIIlIll(IlllIlIlllIIIll)) {
                        l = -llllIlIlllIIIll;
                        "".length();
                        if (-" ".length() >= 0) {
                            return 0L;
                        }
                    } else {
                        l = llllIlIlllIIIll;
                    }
                    return l;
                }
                throw new NumberFormatException();
            }
            int n = this.readByte();
            "".length();
        } while (" ".length() << (" ".length() << " ".length()) != -" ".length());
        return 0L;
    }

    /*
     * WARNING - void declaration
     */
    public int nextInt() {
        void var1_1;
        FastScanner IlIlIlIlllIIIll;
        long lIIlIlIlllIIIll = IlIlIlIlllIIIll.nextLong();
        if (!FastScanner.lIllIlIIlIll(FastScanner.IIllIlIIlIll(lIIlIlIlllIIIll, Integer.MIN_VALUE)) || FastScanner.IlllIlIIlIll(FastScanner.IIllIlIIlIll(lIIlIlIlllIIIll, Integer.MAX_VALUE))) {
            throw new NumberFormatException();
        }
        return (int)var1_1;
    }

    public double nextDouble() {
        FastScanner lllIIlIlllIIIll;
        return Double.parseDouble(lllIIlIlllIIIll.next());
    }

    /*
     * WARNING - void declaration
     */
    public int[] nextIntsN(int lIIIIlIlllIIIll) {
        void var2_2;
        int[] IIIIIlIlllIIIll = new int[lIIIIlIlllIIIll];
        int lllllIIlllIIIll = IIllIIIlll[1];
        while (FastScanner.IIlIIlIIlIll(lllllIIlllIIIll, lIIIIlIlllIIIll)) {
            FastScanner IlIIIlIlllIIIll;
            IIIIIlIlllIIIll[lllllIIlllIIIll] = IlIIIlIlllIIIll.nextInt();
            ++lllllIIlllIIIll;
            "".length();
            if (" ".length() << " ".length() >= " ".length()) continue;
            return null;
        }
        return var2_2;
    }

    /*
     * WARNING - void declaration
     */
    public long[] nextLongsN(int lIIllIIlllIIIll) {
        void var2_2;
        long[] IIIllIIlllIIIll = new long[lIIllIIlllIIIll];
        int lllIlIIlllIIIll = IIllIIIlll[1];
        while (FastScanner.IIlIIlIIlIll(lllIlIIlllIIIll, lIIllIIlllIIIll)) {
            FastScanner IlIllIIlllIIIll;
            IIIllIIlllIIIll[lllIlIIlllIIIll] = IlIllIIlllIIIll.nextLong();
            ++lllIlIIlllIIIll;
            "".length();
            if (" ".length() <= " ".length() << (" ".length() << " ".length())) continue;
            return null;
        }
        return var2_2;
    }

    /*
     * WARNING - void declaration
     */
    public char[] nextCharsN(int IIIIlIIlllIIIll) {
        void var2_2;
        FastScanner lIIIlIIlllIIIll;
        char[] llllIIIlllIIIll = new char[IIIIlIIlllIIIll];
        String IlllIIIlllIIIll = lIIIlIIlllIIIll.next();
        int lIllIIIlllIIIll = IIllIIIlll[1];
        while (FastScanner.IIlIIlIIlIll(lIllIIIlllIIIll, IIIIlIIlllIIIll)) {
            llllIIIlllIIIll[lIllIIIlllIIIll] = IlllIIIlllIIIll.charAt(lIllIIIlllIIIll);
            ++lIllIIIlllIIIll;
            "".length();
            if (" ".length() >= -" ".length()) continue;
            return null;
        }
        return var2_2;
    }

    /*
     * WARNING - void declaration
     */
    public char[][] nextCharsHW(int IIlIIIIlllIIIll, int llIIIIIlllIIIll) {
        void var3_3;
        char[][] IlIIIIIlllIIIll = new char[IIlIIIIlllIIIll][llIIIIIlllIIIll];
        int lIIIIIIlllIIIll = IIllIIIlll[1];
        while (FastScanner.IIlIIlIIlIll(lIIIIIIlllIIIll, IIlIIIIlllIIIll)) {
            FastScanner lIlIIIIlllIIIll;
            String IIIIIIIlllIIIll = lIlIIIIlllIIIll.next();
            int lllllllIllIIIll = IIllIIIlll[1];
            while (FastScanner.IIlIIlIIlIll(lllllllIllIIIll, llIIIIIlllIIIll)) {
                IlIIIIIlllIIIll[lIIIIIIlllIIIll][lllllllIllIIIll] = IIIIIIIlllIIIll.charAt(lllllllIllIIIll);
                ++lllllllIllIIIll;
                "".length();
                if (-"  ".length() <= 0) continue;
                return null;
            }
            ++lIIIIIIlllIIIll;
            "".length();
            if ((((0x7D ^ 0x7A) << " ".length() ^ (0xA ^ 0x1B)) << " ".length() & (((0xC3 ^ 0x88) << " ".length() ^ 133 + 26 - 45 + 23) << " ".length() ^ -" ".length())) < "   ".length()) continue;
            return null;
        }
        return var3_3;
    }

    /*
     * WARNING - void declaration
     */
    public int[][] nextIntsNM(int lllIlllIllIIIll, int IllIlllIllIIIll) {
        void var3_3;
        int[][] lIlIlllIllIIIll = new int[lllIlllIllIIIll][IllIlllIllIIIll];
        int IIlIlllIllIIIll = IIllIIIlll[1];
        while (FastScanner.IIlIIlIIlIll(IIlIlllIllIIIll, lllIlllIllIIIll)) {
            int llIIlllIllIIIll = IIllIIIlll[1];
            while (FastScanner.IIlIIlIIlIll(llIIlllIllIIIll, IllIlllIllIIIll)) {
                FastScanner IIIllllIllIIIll;
                lIlIlllIllIIIll[IIlIlllIllIIIll][llIIlllIllIIIll] = IIIllllIllIIIll.nextInt();
                ++llIIlllIllIIIll;
                "".length();
                if (((0x51 ^ 0x7A) & ~(0x5F ^ 0x74)) >= 0) continue;
                return null;
            }
            ++IIlIlllIllIIIll;
            "".length();
            if ("   ".length() >= 0) continue;
            return null;
        }
        return var3_3;
    }

    /*
     * WARNING - void declaration
     */
    public List<Integer> nextArrayIntsN(int lIllIllIllIIIll) {
        void var2_2;
        ArrayList<Integer> IIllIllIllIIIll = new ArrayList<Integer>(lIllIllIllIIIll);
        int llIlIllIllIIIll = IIllIIIlll[1];
        while (FastScanner.IIlIIlIIlIll(llIlIllIllIIIll, lIllIllIllIIIll)) {
            FastScanner IlllIllIllIIIll;
            IIllIllIllIIIll.add(IlllIllIllIIIll.nextInt());
            "".length();
            ++llIlIllIllIIIll;
            "".length();
            if ("   ".length() > " ".length() << " ".length()) continue;
            return null;
        }
        return var2_2;
    }

    /*
     * WARNING - void declaration
     */
    public List<Long> nextArrayLongsN(int lIlIIllIllIIIll) {
        void var2_2;
        ArrayList<Long> IIlIIllIllIIIll = new ArrayList<Long>(lIlIIllIllIIIll);
        int llIIIllIllIIIll = IIllIIIlll[1];
        while (FastScanner.IIlIIlIIlIll(llIIIllIllIIIll, lIlIIllIllIIIll)) {
            FastScanner IllIIllIllIIIll;
            IIlIIllIllIIIll.add(IllIIllIllIIIll.nextLong());
            "".length();
            ++llIIIllIllIIIll;
            "".length();
            if (((66 + 36 - 27 + 66 ^ (0x35 ^ 0x70) << " ".length()) & ((0xE1 ^ 0xC2) << (" ".length() << " ".length()) ^ 78 + 126 - 68 + 3 ^ -" ".length())) == 0) continue;
            return null;
        }
        return var2_2;
    }

    /*
     * WARNING - void declaration
     */
    public List<List<Long>> nextArrayLongsNM(int llIllIlIllIIIll, int IlIllIlIllIIIll) {
        void var3_3;
        ArrayList<List<Long>> lIIllIlIllIIIll = new ArrayList<List<Long>>(IlIllIlIllIIIll);
        int IIIllIlIllIIIll = IIllIIIlll[1];
        while (FastScanner.IIlIIlIIlIll(IIIllIlIllIIIll, IlIllIlIllIIIll)) {
            FastScanner IIlllIlIllIIIll;
            List<Long> lllIlIlIllIIIll = IIlllIlIllIIIll.nextArrayLongsN(llIllIlIllIIIll);
            lIIllIlIllIIIll.add(lllIlIlIllIIIll);
            "".length();
            ++IIIllIlIllIIIll;
            "".length();
            if (" ".length() << " ".length() > 0) continue;
            return null;
        }
        return var3_3;
    }

    static {
        FastScanner.llIIIlIIlIll();
    }

    private static void llIIIlIIlIll() {
        IIllIIIlll = new int[9];
        FastScanner.IIllIIIlll[0] = " ".length() << ((0x71 ^ 0x3C ^ (0x4D ^ 0x44) << "   ".length()) << " ".length());
        FastScanner.IIllIIIlll[1] = (0x8A ^ 0x8D) << "   ".length() & ~((0xA1 ^ 0xA6) << "   ".length());
        FastScanner.IIllIIIlll[2] = " ".length();
        FastScanner.IIllIIIlll[3] = -" ".length();
        FastScanner.IIllIIIlll[4] = 0x74 ^ 0x55;
        FastScanner.IIllIIIlll[5] = (0x72 ^ 0x4D) << " ".length();
        FastScanner.IIllIIIlll[6] = 0xB9 ^ 0x94;
        FastScanner.IIllIIIlll[7] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
        FastScanner.IIllIIIlll[8] = (0x2E ^ 0x35) << (" ".length() << " ".length()) ^ (9 ^ 0x5C);
    }

    private static boolean lIIlIlIIlIll(int n, int n2) {
        return n == n2;
    }

    private static boolean IlIlIlIIlIll(int n, int n2) {
        return n >= n2;
    }

    private static boolean IIlIIlIIlIll(int n, int n2) {
        return n < n2;
    }

    private static boolean lllIIlIIlIll(int n, int n2) {
        return n <= n2;
    }

    private static boolean IllIIlIIlIll(int n) {
        return n != 0;
    }

    private static boolean IIIlIlIIlIll(int n) {
        return n == 0;
    }

    private static boolean lIllIlIIlIll(int n) {
        return n >= 0;
    }

    private static boolean lIlIIlIIlIll(int n) {
        return n <= 0;
    }

    private static boolean IlllIlIIlIll(int n) {
        return n > 0;
    }

    private static boolean llIlIlIIlIll(int n, int n2) {
        return n != n2;
    }

    private static int IIllIlIIlIll(long l, long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }
}

