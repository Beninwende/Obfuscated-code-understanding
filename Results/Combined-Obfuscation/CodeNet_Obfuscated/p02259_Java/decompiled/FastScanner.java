/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[llllIIIlIl[0]];
    private int ptr = llllIIIlIl[1];
    private int buflen = llllIIIlIl[1];
    private static int[] llllIIIlIl;

    FastScanner() {
        FastScanner IlIIIIllIlIl;
    }

    private boolean hasNextByte() {
        FastScanner llllllIlIlIl;
        if (FastScanner.IllllIIIlIIl(llllllIlIlIl.ptr, llllllIlIlIl.buflen)) {
            return llllIIIlIl[2];
        }
        llllllIlIlIl.ptr = llllIIIlIl[1];
        try {
            llllllIlIlIl.buflen = llllllIlIlIl.in.read(llllllIlIlIl.buffer);
            "".length();
        }
        catch (IOException IlllllIlIlIl) {
            IlllllIlIlIl.printStackTrace();
        }
        if (((0x62 ^ 0x73) & ~(0x85 ^ 0x94)) != 0) {
            return ((0x62 ^ 0x6B) << "   ".length() & ~((6 ^ 0xF) << "   ".length())) != 0;
        }
        if (FastScanner.lllllIIIlIIl(llllllIlIlIl.buflen)) {
            return llllIIIlIl[1];
        }
        return llllIIIlIl[2];
    }

    private int readByte() {
        FastScanner IIllllIlIlIl;
        if (FastScanner.IIIIIlIIlIIl(IIllllIlIlIl.hasNextByte() ? 1 : 0)) {
            int n = IIllllIlIlIl.ptr;
            IIllllIlIlIl.ptr = n + llllIIIlIl[2];
            return IIllllIlIlIl.buffer[n];
        }
        return llllIIIlIl[3];
    }

    private static boolean isPrintableChar(int IlIlllIlIlIl) {
        int n;
        if (FastScanner.lIIIIlIIlIIl(llllIIIlIl[4], IlIlllIlIlIl) && FastScanner.lIIIIlIIlIIl(IlIlllIlIlIl, llllIIIlIl[5])) {
            n = llllIIIlIl[2];
            "".length();
            if ("   ".length() >= " ".length() << (" ".length() << " ".length())) {
                return ("   ".length() << ((0x2B ^ 0x3A) << "   ".length() ^ 132 + 33 - 151 + 127) & ("   ".length() << ((0x20 ^ 0x1B) << " ".length() ^ (0x76 ^ 5)) ^ -" ".length())) != 0;
            }
        } else {
            n = llllIIIlIl[1];
        }
        return n != 0;
    }

    public boolean hasNext() {
        FastScanner IIIlllIlIlIl;
        while (FastScanner.IIIIIlIIlIIl(IIIlllIlIlIl.hasNextByte() ? 1 : 0) && FastScanner.IlIIIlIIlIIl(FastScanner.isPrintableChar(IIIlllIlIlIl.buffer[IIIlllIlIlIl.ptr]) ? 1 : 0)) {
            IIIlllIlIlIl.ptr += llllIIIlIl[2];
            "".length();
            if (-" ".length() <= -" ".length()) continue;
            return ((0xC0 ^ 0x9B) & ~(0x43 ^ 0x18)) != 0;
        }
        return this.hasNextByte();
    }

    /*
     * WARNING - void declaration
     */
    public String next() {
        void var1_1;
        FastScanner IIlIllIlIlIl;
        if (FastScanner.IlIIIlIIlIIl(IIlIllIlIlIl.hasNext() ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        StringBuilder llIIllIlIlIl = new StringBuilder();
        int IlIIllIlIlIl = IIlIllIlIlIl.readByte();
        while (FastScanner.IIIIIlIIlIIl(FastScanner.isPrintableChar(IlIIllIlIlIl) ? 1 : 0)) {
            llIIllIlIlIl.appendCodePoint(IlIIllIlIlIl);
            "".length();
            IlIIllIlIlIl = IIlIllIlIlIl.readByte();
            "".length();
            if (" ".length() != 0) continue;
            return null;
        }
        return String.valueOf(var1_1);
    }

    public long nextLong() {
        FastScanner lIllIlIlIlIl;
        if (FastScanner.IlIIIlIIlIIl(lIllIlIlIlIl.hasNext() ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        long IIllIlIlIlIl = 0L;
        int llIlIlIlIlIl = llllIIIlIl[1];
        int IlIlIlIlIlIl = lIllIlIlIlIl.readByte();
        if (FastScanner.llIIIlIIlIIl(IlIlIlIlIlIl, llllIIIlIl[6])) {
            llIlIlIlIlIl = llllIIIlIl[2];
            IlIlIlIlIlIl = lIllIlIlIlIl.readByte();
        }
        if (!FastScanner.IIlIIlIIlIIl(IlIlIlIlIlIl, llllIIIlIl[7]) || FastScanner.IllllIIIlIIl(llllIIIlIl[8], IlIlIlIlIlIl)) {
            throw new NumberFormatException();
        }
        do {
            if (FastScanner.lIIIIlIIlIIl(llllIIIlIl[7], IlIlIlIlIlIl) && FastScanner.lIIIIlIIlIIl(IlIlIlIlIlIl, llllIIIlIl[8])) {
                IIllIlIlIlIl *= 10L;
                IIllIlIlIlIl += (long)(IlIlIlIlIlIl - llllIIIlIl[7]);
                "".length();
                if (((0xA6 ^ 0xB7) & ~(0x6A ^ 0x7B)) != 0) {
                    return 0L;
                }
            } else {
                if (!FastScanner.lIlIIlIIlIIl(IlIlIlIlIlIl, llllIIIlIl[3]) || FastScanner.IlIIIlIIlIIl(FastScanner.isPrintableChar(IlIlIlIlIlIl) ? 1 : 0)) {
                    long l;
                    if (FastScanner.IIIIIlIIlIIl(llIlIlIlIlIl)) {
                        l = -IIllIlIlIlIl;
                        "".length();
                        if (" ".length() << (" ".length() << " ".length()) == 0) {
                            return 0L;
                        }
                    } else {
                        l = IIllIlIlIlIl;
                    }
                    return l;
                }
                throw new NumberFormatException();
            }
            int n = this.readByte();
            "".length();
        } while (((0x70 ^ 0x7D ^ (0x34 ^ 0x3F) << (" ".length() << " ".length())) << " ".length() & (((0x9E ^ 0x8B) << "   ".length() ^ 63 + 13 - 69 + 130) << " ".length() ^ -" ".length())) == (((0x78 ^ 0x4B) << " ".length() ^ (0x9D ^ 0x98)) & (0xF9 ^ 0xC6 ^ (0x3F ^ 0x28) << (" ".length() << " ".length()) ^ -" ".length()) & ((0x9A ^ 0x83 ^ (0x42 ^ 0x45) << "   ".length()) & ((0x6E ^ 0x43) << " ".length() ^ (0xF ^ 0x74) ^ -" ".length()) ^ -" ".length())));
        return 0L;
    }

    /*
     * WARNING - void declaration
     */
    public int nextInt() {
        void var1_1;
        FastScanner lllIIlIlIlIl;
        long IllIIlIlIlIl = lllIIlIlIlIl.nextLong();
        if (!FastScanner.IIIlIlIIlIIl(FastScanner.lllIIlIIlIIl(IllIIlIlIlIl, Integer.MIN_VALUE)) || FastScanner.lIIlIlIIlIIl(FastScanner.lllIIlIIlIIl(Integer.MAX_VALUE, IllIIlIlIlIl))) {
            throw new NumberFormatException();
        }
        return (int)var1_1;
    }

    public double nextDouble() {
        FastScanner IIlIIlIlIlIl;
        return Double.parseDouble(IIlIIlIlIlIl.next());
    }

    static {
        FastScanner.lIlllIIIlIIl();
    }

    private static void lIlllIIIlIIl() {
        llllIIIlIl = new int[9];
        FastScanner.llllIIIlIl[0] = " ".length() << ((0x98 ^ 0x9D) << " ".length());
        FastScanner.llllIIIlIl[1] = (0x17 ^ 0) & ~(0x3F ^ 0x28);
        FastScanner.llllIIIlIl[2] = " ".length();
        FastScanner.llllIIIlIl[3] = -" ".length();
        FastScanner.llllIIIlIl[4] = 44 + 2 - 2 + 185 ^ (0x69 ^ 0x58) << (" ".length() << " ".length());
        FastScanner.llllIIIlIl[5] = (0x52 ^ 0x6F ^ " ".length() << " ".length()) << " ".length();
        FastScanner.llllIIIlIl[6] = 0xEA ^ 0xC7;
        FastScanner.llllIIIlIl[7] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
        FastScanner.llllIIIlIl[8] = 0x7B ^ 0x42;
    }

    private static boolean llIIIlIIlIIl(int n, int n2) {
        return n == n2;
    }

    private static boolean IIlIIlIIlIIl(int n, int n2) {
        return n >= n2;
    }

    private static boolean IllllIIIlIIl(int n, int n2) {
        return n < n2;
    }

    private static boolean lIIIIlIIlIIl(int n, int n2) {
        return n <= n2;
    }

    private static boolean IIIIIlIIlIIl(int n) {
        return n != 0;
    }

    private static boolean IlIIIlIIlIIl(int n) {
        return n == 0;
    }

    private static boolean IIIlIlIIlIIl(int n) {
        return n >= 0;
    }

    private static boolean lIIlIlIIlIIl(int n) {
        return n < 0;
    }

    private static boolean lllllIIIlIIl(int n) {
        return n <= 0;
    }

    private static boolean lIlIIlIIlIIl(int n, int n2) {
        return n != n2;
    }

    private static int lllIIlIIlIIl(long l, long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }
}

