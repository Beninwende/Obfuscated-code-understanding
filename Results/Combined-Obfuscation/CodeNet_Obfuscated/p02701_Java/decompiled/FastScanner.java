/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[IllIllIIIl[0]];
    private int ptr = IllIllIIIl[1];
    private int buflen = IllIllIIIl[1];
    private static int[] IllIllIIIl;

    FastScanner() {
        FastScanner IllllIllIllIl;
    }

    private boolean hasNextByte() {
        FastScanner llIllIllIllIl;
        if (FastScanner.lIllIIlllll(llIllIllIllIl.ptr, llIllIllIllIl.buflen)) {
            return IllIllIIIl[2];
        }
        llIllIllIllIl.ptr = IllIllIIIl[1];
        try {
            llIllIllIllIl.buflen = llIllIllIllIl.in.read(llIllIllIllIl.buffer);
            "".length();
        }
        catch (IOException IlIllIllIllIl) {
            IlIllIllIllIl.printStackTrace();
        }
        if (" ".length() > " ".length() << " ".length()) {
            return ((0x76 ^ 0x4F ^ (0x39 ^ 0xC) << " ".length()) & ((0x66 ^ 0x6F) << (" ".length() << " ".length()) ^ (0xE7 ^ 0x90) ^ -" ".length())) != 0;
        }
        if (FastScanner.IlllIIlllll(llIllIllIllIl.buflen)) {
            return IllIllIIIl[1];
        }
        return IllIllIIIl[2];
    }

    private int readByte() {
        FastScanner IIIllIllIllIl;
        if (FastScanner.llllIIlllll(IIIllIllIllIl.hasNextByte() ? 1 : 0)) {
            int n = IIIllIllIllIl.ptr;
            IIIllIllIllIl.ptr = n + IllIllIIIl[2];
            return IIIllIllIllIl.buffer[n];
        }
        return IllIllIIIl[3];
    }

    private static boolean isPrintableChar(int IllIlIllIllIl) {
        int n;
        if (FastScanner.IIIIlIlllll(IllIllIIIl[4], IllIlIllIllIl) && FastScanner.IIIIlIlllll(IllIlIllIllIl, IllIllIIIl[5])) {
            n = IllIllIIIl[2];
            "".length();
            if ("   ".length() <= " ".length() << " ".length()) {
                return ((0x24 ^ 0x23) << (" ".length() << " ".length()) & ~((0x7E ^ 0x79) << (" ".length() << " ".length()))) != 0;
            }
        } else {
            n = IllIllIIIl[1];
        }
        return n != 0;
    }

    public boolean hasNext() {
        FastScanner IIlIlIllIllIl;
        while (FastScanner.llllIIlllll(IIlIlIllIllIl.hasNextByte() ? 1 : 0) && FastScanner.lIIIlIlllll(FastScanner.isPrintableChar(IIlIlIllIllIl.buffer[IIlIlIllIllIl.ptr]) ? 1 : 0)) {
            IIlIlIllIllIl.ptr += IllIllIIIl[2];
            "".length();
            if (" ".length() != 0) continue;
            return ((0x51 ^ 0x46 ^ (4 ^ 0xB) << (" ".length() << " ".length())) & ((0x44 ^ 0x71) << " ".length() ^ (0x69 ^ 0x28) ^ -" ".length())) != 0;
        }
        return this.hasNextByte();
    }

    /*
     * WARNING - void declaration
     */
    public String next() {
        void var1_1;
        FastScanner IIIIlIllIllIl;
        if (FastScanner.lIIIlIlllll(IIIIlIllIllIl.hasNext() ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        StringBuilder llllIIllIllIl = new StringBuilder();
        int IlllIIllIllIl = IIIIlIllIllIl.readByte();
        while (FastScanner.llllIIlllll(FastScanner.isPrintableChar(IlllIIllIllIl) ? 1 : 0)) {
            llllIIllIllIl.appendCodePoint(IlllIIllIllIl);
            "".length();
            IlllIIllIllIl = IIIIlIllIllIl.readByte();
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(var1_1);
    }

    public long nextLong() {
        FastScanner lIIlIIllIllIl;
        if (FastScanner.lIIIlIlllll(lIIlIIllIllIl.hasNext() ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        long IIIlIIllIllIl = 0L;
        int lllIIIllIllIl = IllIllIIIl[1];
        int IllIIIllIllIl = lIIlIIllIllIl.readByte();
        if (FastScanner.IlIIlIlllll(IllIIIllIllIl, IllIllIIIl[6])) {
            lllIIIllIllIl = IllIllIIIl[2];
            IllIIIllIllIl = lIIlIIllIllIl.readByte();
        }
        if (!FastScanner.llIIlIlllll(IllIIIllIllIl, IllIllIIIl[7]) || FastScanner.lIllIIlllll(IllIllIIIl[8], IllIIIllIllIl)) {
            throw new NumberFormatException();
        }
        do {
            if (FastScanner.IIIIlIlllll(IllIllIIIl[7], IllIIIllIllIl) && FastScanner.IIIIlIlllll(IllIIIllIllIl, IllIllIIIl[8])) {
                IIIlIIllIllIl *= 10L;
                IIIlIIllIllIl += (long)(IllIIIllIllIl - IllIllIIIl[7]);
                "".length();
                if ((((0x5F ^ 0x4E) << " ".length() ^ (0x90 ^ 0xBD)) & ((0x84 ^ 0x9D) << " ".length() ^ (0x82 ^ 0xBF) ^ -" ".length())) > " ".length() << " ".length()) {
                    return 0L;
                }
            } else {
                if (!FastScanner.IIlIlIlllll(IllIIIllIllIl, IllIllIIIl[3]) || FastScanner.lIIIlIlllll(FastScanner.isPrintableChar(IllIIIllIllIl) ? 1 : 0)) {
                    long l;
                    if (FastScanner.llllIIlllll(lllIIIllIllIl)) {
                        l = -IIIlIIllIllIl;
                        "".length();
                        if (" ".length() > "   ".length()) {
                            return 0L;
                        }
                    } else {
                        l = IIIlIIllIllIl;
                    }
                    return l;
                }
                throw new NumberFormatException();
            }
            int n = this.readByte();
            "".length();
        } while (((0x2A ^ 0xF) << " ".length() & ~((0x4B ^ 0x6E) << " ".length())) == 0);
        return 0L;
    }

    /*
     * WARNING - void declaration
     */
    public int nextInt() {
        void var1_1;
        FastScanner llIIIIllIllIl;
        long IlIIIIllIllIl = llIIIIllIllIl.nextLong();
        if (!FastScanner.IllIlIlllll(FastScanner.lIlIlIlllll(IlIIIIllIllIl, Integer.MIN_VALUE)) || FastScanner.lllIlIlllll(FastScanner.lIlIlIlllll(IlIIIIllIllIl, Integer.MAX_VALUE))) {
            throw new NumberFormatException();
        }
        return (int)var1_1;
    }

    public double nextDouble() {
        FastScanner IIIIIIllIllIl;
        return Double.parseDouble(IIIIIIllIllIl.next());
    }

    static {
        FastScanner.IIllIIlllll();
    }

    private static void IIllIIlllll() {
        IllIllIIIl = new int[9];
        FastScanner.IllIllIIIl[0] = " ".length() << ((0x8D ^ 0x88) << " ".length());
        FastScanner.IllIllIIIl[1] = (0 ^ 0x41) & ~(0xD0 ^ 0x91);
        FastScanner.IllIllIIIl[2] = " ".length();
        FastScanner.IllIllIIIl[3] = -" ".length();
        FastScanner.IllIllIIIl[4] = (0xAB ^ 0xB8) << " ".length() ^ (0x55 ^ 0x52);
        FastScanner.IllIllIIIl[5] = ((0x30 ^ 0x1F) << " ".length() ^ (0xF8 ^ 0x99)) << " ".length();
        FastScanner.IllIllIIIl[6] = 0x5D ^ 0x70;
        FastScanner.IllIllIIIl[7] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
        FastScanner.IllIllIIIl[8] = 0x2B ^ 0x32 ^ " ".length() << (0x2F ^ 0x2A);
    }

    private static boolean IlIIlIlllll(int n, int n2) {
        return n == n2;
    }

    private static boolean llIIlIlllll(int n, int n2) {
        return n >= n2;
    }

    private static boolean lIllIIlllll(int n, int n2) {
        return n < n2;
    }

    private static boolean IIIIlIlllll(int n, int n2) {
        return n <= n2;
    }

    private static boolean llllIIlllll(int n) {
        return n != 0;
    }

    private static boolean lIIIlIlllll(int n) {
        return n == 0;
    }

    private static boolean IllIlIlllll(int n) {
        return n >= 0;
    }

    private static boolean IlllIIlllll(int n) {
        return n <= 0;
    }

    private static boolean lllIlIlllll(int n) {
        return n > 0;
    }

    private static boolean IIlIlIlllll(int n, int n2) {
        return n != n2;
    }

    private static int lIlIlIlllll(long l, long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }
}

