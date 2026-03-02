/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[IlIlIllIl[0]];
    private int ptr = IlIlIllIl[1];
    private int buflen = IlIlIllIl[1];
    private static int[] IlIlIllIl;

    FastScanner() {
        FastScanner IIlIIlIIIIIIll;
    }

    private boolean hasNextByte() {
        FastScanner lIIIIlIIIIIIll;
        if (FastScanner.lIllIlllIIl(lIIIIlIIIIIIll.ptr, lIIIIlIIIIIIll.buflen)) {
            return IlIlIllIl[2];
        }
        lIIIIlIIIIIIll.ptr = IlIlIllIl[1];
        try {
            lIIIIlIIIIIIll.buflen = lIIIIlIIIIIIll.in.read(lIIIIlIIIIIIll.buffer);
            "".length();
        }
        catch (IOException IIIIIlIIIIIIll) {
            IIIIIlIIIIIIll.printStackTrace();
        }
        if (null != null) {
            return ((0x17 ^ 0x20) & ~(0x8B ^ 0xBC)) != 0;
        }
        if (FastScanner.IlllIlllIIl(lIIIIlIIIIIIll.buflen)) {
            return IlIlIllIl[1];
        }
        return IlIlIllIl[2];
    }

    private int readByte() {
        FastScanner IllllIIIIIIIll;
        if (FastScanner.llllIlllIIl(IllllIIIIIIIll.hasNextByte() ? 1 : 0)) {
            int n = IllllIIIIIIIll.ptr;
            IllllIIIIIIIll.ptr = n + IlIlIllIl[2];
            return IllllIIIIIIIll.buffer[n];
        }
        return IlIlIllIl[3];
    }

    private static boolean isPrintableChar(int IIlllIIIIIIIll) {
        int n;
        if (FastScanner.IIIIllllIIl(IlIlIllIl[4], IIlllIIIIIIIll) && FastScanner.IIIIllllIIl(IIlllIIIIIIIll, IlIlIllIl[5])) {
            n = IlIlIllIl[2];
            "".length();
            if ("   ".length() <= 0) {
                return ((139 + 115 - 219 + 108 ^ (0x41 ^ 0x52) << "   ".length()) << (" ".length() << " ".length()) & ((" ".length() << ("   ".length() << " ".length()) ^ (0x76 ^ 0x21)) << (" ".length() << " ".length()) ^ -" ".length())) != 0;
            }
        } else {
            n = IlIlIllIl[1];
        }
        return n != 0;
    }

    private void skipUnprintable() {
        FastScanner IlIllIIIIIIIll;
        while (FastScanner.llllIlllIIl(IlIllIIIIIIIll.hasNextByte() ? 1 : 0) && FastScanner.lIIIllllIIl(FastScanner.isPrintableChar(IlIllIIIIIIIll.buffer[IlIllIIIIIIIll.ptr]) ? 1 : 0)) {
            IlIllIIIIIIIll.ptr += IlIlIllIl[2];
            "".length();
            if (null == null) continue;
            return;
        }
    }

    public boolean hasNext() {
        FastScanner IIIllIIIIIIIll;
        IIIllIIIIIIIll.skipUnprintable();
        return this.hasNextByte();
    }

    /*
     * WARNING - void declaration
     */
    public String next() {
        void var1_1;
        FastScanner IIlIlIIIIIIIll;
        if (FastScanner.lIIIllllIIl(IIlIlIIIIIIIll.hasNext() ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        StringBuilder llIIlIIIIIIIll = new StringBuilder();
        int IlIIlIIIIIIIll = IIlIlIIIIIIIll.readByte();
        while (FastScanner.llllIlllIIl(FastScanner.isPrintableChar(IlIIlIIIIIIIll) ? 1 : 0)) {
            llIIlIIIIIIIll.appendCodePoint(IlIIlIIIIIIIll);
            "".length();
            IlIIlIIIIIIIll = IIlIlIIIIIIIll.readByte();
            "".length();
            if (" ".length() << " ".length() != "   ".length()) continue;
            return null;
        }
        return String.valueOf(var1_1);
    }

    public int nextInt() {
        FastScanner lIllIIIIIIIIll;
        if (FastScanner.lIIIllllIIl(lIllIIIIIIIIll.hasNext() ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        int IIllIIIIIIIIll = IlIlIllIl[1];
        int llIlIIIIIIIIll = IlIlIllIl[1];
        int IlIlIIIIIIIIll = lIllIIIIIIIIll.readByte();
        if (FastScanner.IlIIllllIIl(IlIlIIIIIIIIll, IlIlIllIl[6])) {
            llIlIIIIIIIIll = IlIlIllIl[2];
            IlIlIIIIIIIIll = lIllIIIIIIIIll.readByte();
        }
        if (!FastScanner.llIIllllIIl(IlIlIIIIIIIIll, IlIlIllIl[7]) || FastScanner.lIllIlllIIl(IlIlIllIl[8], IlIlIIIIIIIIll)) {
            throw new NumberFormatException();
        }
        do {
            if (FastScanner.IIIIllllIIl(IlIlIllIl[7], IlIlIIIIIIIIll) && FastScanner.IIIIllllIIl(IlIlIIIIIIIIll, IlIlIllIl[8])) {
                IIllIIIIIIIIll *= IlIlIllIl[9];
                IIllIIIIIIIIll += IlIlIIIIIIIIll - IlIlIllIl[7];
                "".length();
                if ((" ".length() << (" ".length() << (" ".length() << " ".length())) & ~(" ".length() << (" ".length() << (" ".length() << " ".length())))) > " ".length() << (" ".length() << " ".length())) {
                    return (0x22 ^ 0x75) & ~(0xDA ^ 0x8D);
                }
            } else {
                if (!FastScanner.lIlIllllIIl(IlIlIIIIIIIIll, IlIlIllIl[3]) || FastScanner.lIIIllllIIl(FastScanner.isPrintableChar(IlIlIIIIIIIIll) ? 1 : 0)) {
                    int n;
                    if (FastScanner.llllIlllIIl(llIlIIIIIIIIll)) {
                        n = -IIllIIIIIIIIll;
                        "".length();
                        if (" ".length() << (" ".length() << " ".length()) == "   ".length()) {
                            return (0x4F ^ 4) & ~(0x8B ^ 0xC0);
                        }
                    } else {
                        n = IIllIIIIIIIIll;
                    }
                    return n;
                }
                throw new NumberFormatException();
            }
            int n = this.readByte();
            "".length();
        } while ("   ".length() == "   ".length());
        return (51 + 119 - 133 + 92 ^ (8 ^ 1) << (" ".length() << (" ".length() << " ".length()))) << (" ".length() << " ".length()) & (((0xFC ^ 0xC1) << " ".length() ^ (0xCE ^ 0xA5)) << (" ".length() << " ".length()) ^ -" ".length());
    }

    public long nextLong() {
        FastScanner lIlIIIIIIIIIll;
        if (FastScanner.lIIIllllIIl(lIlIIIIIIIIIll.hasNext() ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        long IIlIIIIIIIIIll = 0L;
        int llIIIIIIIIIIll = IlIlIllIl[1];
        int IlIIIIIIIIIIll = lIlIIIIIIIIIll.readByte();
        if (FastScanner.IlIIllllIIl(IlIIIIIIIIIIll, IlIlIllIl[6])) {
            llIIIIIIIIIIll = IlIlIllIl[2];
            IlIIIIIIIIIIll = lIlIIIIIIIIIll.readByte();
        }
        if (!FastScanner.llIIllllIIl(IlIIIIIIIIIIll, IlIlIllIl[7]) || FastScanner.lIllIlllIIl(IlIlIllIl[8], IlIIIIIIIIIIll)) {
            throw new NumberFormatException();
        }
        do {
            if (FastScanner.IIIIllllIIl(IlIlIllIl[7], IlIIIIIIIIIIll) && FastScanner.IIIIllllIIl(IlIIIIIIIIIIll, IlIlIllIl[8])) {
                IIlIIIIIIIIIll *= 10L;
                IIlIIIIIIIIIll += (long)(IlIIIIIIIIIIll - IlIlIllIl[7]);
                "".length();
                if (-"  ".length() > 0) {
                    return 0L;
                }
            } else {
                if (!FastScanner.lIlIllllIIl(IlIIIIIIIIIIll, IlIlIllIl[3]) || FastScanner.lIIIllllIIl(FastScanner.isPrintableChar(IlIIIIIIIIIIll) ? 1 : 0)) {
                    long l;
                    if (FastScanner.llllIlllIIl(llIIIIIIIIIIll)) {
                        l = -IIlIIIIIIIIIll;
                        "".length();
                        if (((1 ^ 0x40) & ~(0xF9 ^ 0xB8)) == -" ".length()) {
                            return 0L;
                        }
                    } else {
                        l = IIlIIIIIIIIIll;
                    }
                    return l;
                }
                throw new NumberFormatException();
            }
            int n = this.readByte();
            "".length();
        } while (" ".length() << (" ".length() << " ".length()) >= "   ".length());
        return 0L;
    }

    static {
        FastScanner.IIllIlllIIl();
    }

    private static void IIllIlllIIl() {
        IlIlIllIl = new int[10];
        FastScanner.IlIlIllIl[0] = " ".length() << ((0x5D ^ 0x58) << " ".length());
        FastScanner.IlIlIllIl[1] = ("   ".length() << "   ".length() ^ (0x18 ^ 0x41)) & (186 + 113 - 276 + 172 ^ (0x3A ^ 0x7B) << " ".length() ^ -" ".length());
        FastScanner.IlIlIllIl[2] = " ".length();
        FastScanner.IlIlIllIl[3] = -" ".length();
        FastScanner.IlIlIllIl[4] = 91 + 48 - 9 + 17 ^ (0x2D ^ 0x74) << " ".length();
        FastScanner.IlIlIllIl[5] = (0x44 ^ 0x7B) << " ".length();
        FastScanner.IlIlIllIl[6] = 0x72 ^ 0x5F;
        FastScanner.IlIlIllIl[7] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
        FastScanner.IlIlIllIl[8] = 0xE4 ^ 0x95 ^ (0x4F ^ 0x46) << "   ".length();
        FastScanner.IlIlIllIl[9] = ((0x16 ^ 0x11) << " ".length() ^ (0xCA ^ 0xC1)) << " ".length();
    }

    private static boolean IlIIllllIIl(int n, int n2) {
        return n == n2;
    }

    private static boolean llIIllllIIl(int n, int n2) {
        return n >= n2;
    }

    private static boolean lIllIlllIIl(int n, int n2) {
        return n < n2;
    }

    private static boolean IIIIllllIIl(int n, int n2) {
        return n <= n2;
    }

    private static boolean llllIlllIIl(int n) {
        return n != 0;
    }

    private static boolean lIIIllllIIl(int n) {
        return n == 0;
    }

    private static boolean IlllIlllIIl(int n) {
        return n <= 0;
    }

    private static boolean lIlIllllIIl(int n, int n2) {
        return n != n2;
    }
}

