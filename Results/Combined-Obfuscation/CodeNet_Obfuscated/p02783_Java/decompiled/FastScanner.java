/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[IlIIlIlIIl[0]];
    private int ptr = IlIIlIlIIl[1];
    private int buflen = IlIIlIlIIl[1];
    private static int[] IlIIlIlIIl;

    FastScanner() {
        FastScanner lIlllIIlIlIIl;
    }

    private boolean hasNextByte() {
        FastScanner IlIllIIlIlIIl;
        if (FastScanner.IlIIIIlIIIIl(IlIllIIlIlIIl.ptr, IlIllIIlIlIIl.buflen)) {
            return IlIIlIlIIl[2];
        }
        IlIllIIlIlIIl.ptr = IlIIlIlIIl[1];
        try {
            IlIllIIlIlIIl.buflen = IlIllIIlIlIIl.in.read(IlIllIIlIlIIl.buffer);
            "".length();
        }
        catch (IOException lIIllIIlIlIIl) {
            lIIllIIlIlIIl.printStackTrace();
        }
        if (-" ".length() > -" ".length()) {
            return (((0xC ^ 3) << "   ".length() ^ (0x3D ^ 0x4A)) & ((0x67 ^ 0x36) << " ".length() ^ 107 + 34 - 129 + 161 ^ -" ".length()) & ((7 + 58 - 48 + 138 ^ (0xCD ^ 0x84) << " ".length()) << (" ".length() << " ".length()) & (((0x1C ^ 0x19) << (" ".length() << (" ".length() << " ".length())) ^ (0xC8 ^ 0x91)) << (" ".length() << " ".length()) ^ -" ".length()) ^ -" ".length())) != 0;
        }
        if (FastScanner.llIIIIlIIIIl(IlIllIIlIlIIl.buflen)) {
            return IlIIlIlIIl[1];
        }
        return IlIIlIlIIl[2];
    }

    private int readByte() {
        FastScanner lllIlIIlIlIIl;
        if (FastScanner.IIlIIIlIIIIl(lllIlIIlIlIIl.hasNextByte() ? 1 : 0)) {
            int n = lllIlIIlIlIIl.ptr;
            lllIlIIlIlIIl.ptr = n + IlIIlIlIIl[2];
            return lllIlIIlIlIIl.buffer[n];
        }
        return IlIIlIlIIl[3];
    }

    private static boolean isPrintableChar(int lIlIlIIlIlIIl) {
        int n;
        if (FastScanner.lIlIIIlIIIIl(IlIIlIlIIl[4], lIlIlIIlIlIIl) && FastScanner.lIlIIIlIIIIl(lIlIlIIlIlIIl, IlIIlIlIIl[5])) {
            n = IlIIlIlIIl[2];
            "".length();
            if (null != null) {
                return ((0x15 ^ 0x1C) << " ".length() & ~((0x4D ^ 0x44) << " ".length())) != 0;
            }
        } else {
            n = IlIIlIlIIl[1];
        }
        return n != 0;
    }

    public boolean hasNext() {
        FastScanner llIIlIIlIlIIl;
        while (FastScanner.IIlIIIlIIIIl(llIIlIIlIlIIl.hasNextByte() ? 1 : 0) && FastScanner.IllIIIlIIIIl(FastScanner.isPrintableChar(llIIlIIlIlIIl.buffer[llIIlIIlIlIIl.ptr]) ? 1 : 0)) {
            llIIlIIlIlIIl.ptr += IlIIlIlIIl[2];
            "".length();
            if (" ".length() < " ".length() << (" ".length() << " ".length())) continue;
            return (((0x60 ^ 0x6F) << (" ".length() << " ".length()) ^ (0x35 ^ 2)) << "   ".length() & ((165 + 58 - 208 + 152 ^ (0xEE ^ 0xC5) << (" ".length() << " ".length())) << "   ".length() ^ -" ".length())) != 0;
        }
        return this.hasNextByte();
    }

    /*
     * WARNING - void declaration
     */
    public String next() {
        void var1_1;
        FastScanner llllIIIlIlIIl;
        if (FastScanner.IllIIIlIIIIl(llllIIIlIlIIl.hasNext() ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        StringBuilder IlllIIIlIlIIl = new StringBuilder();
        int lIllIIIlIlIIl = llllIIIlIlIIl.readByte();
        while (FastScanner.IIlIIIlIIIIl(FastScanner.isPrintableChar(lIllIIIlIlIIl) ? 1 : 0)) {
            IlllIIIlIlIIl.appendCodePoint(lIllIIIlIlIIl);
            "".length();
            lIllIIIlIlIIl = llllIIIlIlIIl.readByte();
            "".length();
            if (" ".length() > 0) continue;
            return null;
        }
        return String.valueOf(var1_1);
    }

    public long nextLong() {
        FastScanner IIIlIIIlIlIIl;
        if (FastScanner.IllIIIlIIIIl(IIIlIIIlIlIIl.hasNext() ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        long lllIIIIlIlIIl = 0L;
        int IllIIIIlIlIIl = IlIIlIlIIl[1];
        int lIlIIIIlIlIIl = IIIlIIIlIlIIl.readByte();
        if (FastScanner.lllIIIlIIIIl(lIlIIIIlIlIIl, IlIIlIlIIl[6])) {
            IllIIIIlIlIIl = IlIIlIlIIl[2];
            lIlIIIIlIlIIl = IIIlIIIlIlIIl.readByte();
        }
        if (!FastScanner.IIIlIIlIIIIl(lIlIIIIlIlIIl, IlIIlIlIIl[7]) || FastScanner.IlIIIIlIIIIl(IlIIlIlIIl[8], lIlIIIIlIlIIl)) {
            throw new NumberFormatException();
        }
        do {
            if (FastScanner.lIlIIIlIIIIl(IlIIlIlIIl[7], lIlIIIIlIlIIl) && FastScanner.lIlIIIlIIIIl(lIlIIIIlIlIIl, IlIIlIlIIl[8])) {
                lllIIIIlIlIIl *= 10L;
                lllIIIIlIlIIl += (long)(lIlIIIIlIlIIl - IlIIlIlIIl[7]);
                "".length();
                if (-"  ".length() >= 0) {
                    return 0L;
                }
            } else {
                if (!FastScanner.lIIlIIlIIIIl(lIlIIIIlIlIIl, IlIIlIlIIl[3]) || FastScanner.IllIIIlIIIIl(FastScanner.isPrintableChar(lIlIIIIlIlIIl) ? 1 : 0)) {
                    long l;
                    if (FastScanner.IIlIIIlIIIIl(IllIIIIlIlIIl)) {
                        l = -lllIIIIlIlIIl;
                        "".length();
                        if (" ".length() << (" ".length() << " ".length()) < ((6 ^ 0x6D ^ (0x8B ^ 0x9A) << (" ".length() << " ".length())) & (" ".length() << (" ".length() << " ".length()) ^ (0x6D ^ 0x46) ^ -" ".length()))) {
                            return 0L;
                        }
                    } else {
                        l = lllIIIIlIlIIl;
                    }
                    return l;
                }
                throw new NumberFormatException();
            }
            int n = this.readByte();
            "".length();
        } while (-"  ".length() < 0);
        return 0L;
    }

    /*
     * WARNING - void declaration
     */
    public int nextInt() {
        void var1_1;
        FastScanner IlIIIIIlIlIIl;
        long lIIIIIIlIlIIl = IlIIIIIlIlIIl.nextLong();
        if (!FastScanner.llIlIIlIIIIl(FastScanner.IlIlIIlIIIIl(lIIIIIIlIlIIl, Integer.MIN_VALUE)) || FastScanner.IIllIIlIIIIl(FastScanner.IlIlIIlIIIIl(lIIIIIIlIlIIl, Integer.MAX_VALUE))) {
            throw new NumberFormatException();
        }
        return (int)var1_1;
    }

    public double nextDouble() {
        FastScanner lllllllIIlIIl;
        return Double.parseDouble(lllllllIIlIIl.next());
    }

    static {
        FastScanner.lIIIIIlIIIIl();
    }

    private static void lIIIIIlIIIIl() {
        IlIIlIlIIl = new int[9];
        FastScanner.IlIIlIlIIl[0] = " ".length() << ((0x25 ^ 0x20) << " ".length());
        FastScanner.IlIIlIlIIl[1] = (0x3F ^ 0x3A) << " ".length() & ~((0x75 ^ 0x70) << " ".length());
        FastScanner.IlIIlIlIIl[2] = " ".length();
        FastScanner.IlIIlIlIIl[3] = -" ".length();
        FastScanner.IlIIlIlIIl[4] = 8 ^ 0x29;
        FastScanner.IlIIlIlIIl[5] = ((0x1B ^ 0x22) << " ".length() ^ (0x7D ^ 0x30)) << " ".length();
        FastScanner.IlIIlIlIIl[6] = 0x89 ^ 0xA4;
        FastScanner.IlIIlIlIIl[7] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
        FastScanner.IlIIlIlIIl[8] = 0xFA ^ 0xAB ^ (0x76 ^ 0x7B) << "   ".length();
    }

    private static boolean lllIIIlIIIIl(int n, int n2) {
        return n == n2;
    }

    private static boolean IIIlIIlIIIIl(int n, int n2) {
        return n >= n2;
    }

    private static boolean IlIIIIlIIIIl(int n, int n2) {
        return n < n2;
    }

    private static boolean lIlIIIlIIIIl(int n, int n2) {
        return n <= n2;
    }

    private static boolean IIlIIIlIIIIl(int n) {
        return n != 0;
    }

    private static boolean IllIIIlIIIIl(int n) {
        return n == 0;
    }

    private static boolean llIlIIlIIIIl(int n) {
        return n >= 0;
    }

    private static boolean llIIIIlIIIIl(int n) {
        return n <= 0;
    }

    private static boolean IIllIIlIIIIl(int n) {
        return n > 0;
    }

    private static boolean lIIlIIlIIIIl(int n, int n2) {
        return n != n2;
    }

    private static int IlIlIIlIIIIl(long l, long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }
}

