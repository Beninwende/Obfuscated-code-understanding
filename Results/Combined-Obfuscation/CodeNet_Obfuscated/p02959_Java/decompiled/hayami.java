/*
 * Decompiled with CFR 0.152.
 */
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

class hayami
implements Closeable {
    private final InputStream in = System.in;
    private final byte[] hayami = new byte[llIIlIIll[0]];
    private int Hayami = llIIlIIll[1];
    private int saori = llIIlIIll[1];
    private static int[] llIIlIIll;

    hayami() {
        hayami lIllIlIlllIlIl;
    }

    private boolean HayamiSaori() {
        hayami IlIlIlIlllIlIl;
        if (hayami.lIlllllIlIl(IlIlIlIlllIlIl.Hayami, IlIlIlIlllIlIl.saori)) {
            return llIIlIIll[2];
        }
        IlIlIlIlllIlIl.Hayami = llIIlIIll[1];
        try {
            IlIlIlIlllIlIl.saori = IlIlIlIlllIlIl.in.read(IlIlIlIlllIlIl.hayami);
            "".length();
        }
        catch (IOException lIIlIlIlllIlIl) {
            lIIlIlIlllIlIl.printStackTrace();
        }
        if (" ".length() << (" ".length() << " ".length()) <= 0) {
            return ((0x91 ^ 0xC6) & ~(0xF7 ^ 0xA0)) != 0;
        }
        if (hayami.IllllllIlIl(IlIlIlIlllIlIl.saori)) {
            return llIIlIIll[1];
        }
        return llIIlIIll[2];
    }

    private int SaoriHayami() {
        hayami lllIIlIlllIlIl;
        if (hayami.lllllllIlIl(lllIIlIlllIlIl.HayamiSaori() ? 1 : 0)) {
            int n = lllIIlIlllIlIl.Hayami;
            lllIIlIlllIlIl.Hayami = n + llIIlIIll[2];
            return lllIIlIlllIlIl.hayami[n];
        }
        return llIIlIIll[3];
    }

    private static boolean hayami_saori(int lIlIIlIlllIlIl) {
        int n;
        if (hayami.IIIIIIIllIl(llIIlIIll[4], lIlIIlIlllIlIl) && hayami.IIIIIIIllIl(lIlIIlIlllIlIl, llIIlIIll[5])) {
            n = llIIlIIll[2];
            "".length();
            if ("   ".length() < " ".length() << " ".length()) {
                return (("   ".length() << (" ".length() << (" ".length() << " ".length())) ^ (0x92 ^ 0xB3)) & ("   ".length() ^ (0x2A ^ 0x23) << " ".length() ^ -" ".length())) != 0;
            }
        } else {
            n = llIIlIIll[1];
        }
        return n != 0;
    }

    public boolean hayamisaori() {
        hayami llIIIlIlllIlIl;
        while (hayami.lllllllIlIl(llIIIlIlllIlIl.HayamiSaori() ? 1 : 0) && hayami.lIIIIIIllIl(hayami.hayami_saori(llIIIlIlllIlIl.hayami[llIIIlIlllIlIl.Hayami]) ? 1 : 0)) {
            llIIIlIlllIlIl.Hayami += llIIlIIll[2];
            "".length();
            if (" ".length() << (" ".length() << " ".length()) >= -" ".length()) continue;
            return (" ".length() << " ".length() & ~(" ".length() << " ".length())) != 0;
        }
        return this.HayamiSaori();
    }

    /*
     * WARNING - void declaration
     */
    public String nextHayami() {
        void var1_1;
        hayami lllllIIlllIlIl;
        if (hayami.lIIIIIIllIl(lllllIIlllIlIl.hayamisaori() ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        StringBuilder IllllIIlllIlIl = new StringBuilder();
        int lIlllIIlllIlIl = lllllIIlllIlIl.SaoriHayami();
        while (hayami.lllllllIlIl(hayami.hayami_saori(lIlllIIlllIlIl) ? 1 : 0)) {
            IllllIIlllIlIl.appendCodePoint(lIlllIIlllIlIl);
            "".length();
            lIlllIIlllIlIl = lllllIIlllIlIl.SaoriHayami();
            "".length();
            if (((1 + 70 - 32 + 142 ^ (0x67 ^ 0x3E) << " ".length()) << " ".length() & ((158 + 112 - 106 + 33 ^ (0x61 ^ 0) << " ".length()) << " ".length() ^ -" ".length())) <= " ".length() << " ".length()) continue;
            return null;
        }
        return String.valueOf(var1_1);
    }

    public long saorihayami() {
        hayami IIIllIIlllIlIl;
        if (hayami.lIIIIIIllIl(IIIllIIlllIlIl.hayamisaori() ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        long lllIlIIlllIlIl = 0L;
        int IllIlIIlllIlIl = llIIlIIll[1];
        int lIlIlIIlllIlIl = IIIllIIlllIlIl.SaoriHayami();
        if (hayami.IlIIIIIllIl(lIlIlIIlllIlIl, llIIlIIll[6])) {
            IllIlIIlllIlIl = llIIlIIll[2];
            lIlIlIIlllIlIl = IIIllIIlllIlIl.SaoriHayami();
        }
        if (!hayami.llIIIIIllIl(lIlIlIIlllIlIl, llIIlIIll[7]) || hayami.lIlllllIlIl(llIIlIIll[8], lIlIlIIlllIlIl)) {
            throw new NumberFormatException();
        }
        do {
            if (hayami.IIIIIIIllIl(llIIlIIll[7], lIlIlIIlllIlIl) && hayami.IIIIIIIllIl(lIlIlIIlllIlIl, llIIlIIll[8])) {
                lllIlIIlllIlIl *= 10L;
                lllIlIIlllIlIl += (long)(lIlIlIIlllIlIl - llIIlIIll[7]);
                "".length();
                if (" ".length() << (" ".length() << " ".length()) == " ".length()) {
                    return 0L;
                }
            } else {
                if (!hayami.IIlIIIIllIl(lIlIlIIlllIlIl, llIIlIIll[3]) || hayami.lIIIIIIllIl(hayami.hayami_saori(lIlIlIIlllIlIl) ? 1 : 0)) {
                    long l;
                    if (hayami.lllllllIlIl(IllIlIIlllIlIl)) {
                        l = -lllIlIIlllIlIl;
                        "".length();
                        if (-"   ".length() >= 0) {
                            return 0L;
                        }
                    } else {
                        l = lllIlIIlllIlIl;
                    }
                    return l;
                }
                throw new NumberFormatException();
            }
            int n = this.SaoriHayami();
            "".length();
        } while (" ".length() << " ".length() >= " ".length());
        return 0L;
    }

    /*
     * WARNING - void declaration
     */
    public int saori_hayami() {
        void var1_1;
        hayami IlIIlIIlllIlIl;
        long lIIIlIIlllIlIl = IlIIlIIlllIlIl.saorihayami();
        if (!hayami.IllIIIIllIl(hayami.lIlIIIIllIl(lIIIlIIlllIlIl, Integer.MIN_VALUE)) || hayami.lllIIIIllIl(hayami.lIlIIIIllIl(lIIIlIIlllIlIl, Integer.MAX_VALUE))) {
            throw new NumberFormatException();
        }
        return (int)var1_1;
    }

    public double Hayamin() {
        hayami llllIIIlllIlIl;
        return Double.parseDouble(llllIIIlllIlIl.nextHayami());
    }

    @Override
    public void close() {
        try {
            hayami IIllIIIlllIlIl;
            IIllIIIlllIlIl.in.close();
            "".length();
        }
        catch (IOException iOException) {
            // empty catch block
        }
        if (" ".length() == 0) {
            return;
        }
    }

    static {
        hayami.IIlllllIlIl();
    }

    private static void IIlllllIlIl() {
        llIIlIIll = new int[9];
        hayami.llIIlIIll[0] = " ".length() << ((0xA5 ^ 0xA0) << " ".length());
        hayami.llIIlIIll[1] = (0xF0 ^ 0xB5) & ~(0xE ^ 0x4B);
        hayami.llIIlIIll[2] = " ".length();
        hayami.llIIlIIll[3] = -" ".length();
        hayami.llIIlIIll[4] = (0xA9 ^ 0xA6) << (" ".length() << " ".length()) ^ (0 ^ 0x1D);
        hayami.llIIlIIll[5] = (0xEB ^ 0xB8 ^ (0x49 ^ 0x52) << (" ".length() << " ".length())) << " ".length();
        hayami.llIIlIIll[6] = 0xB9 ^ 0xB6 ^ (0x69 ^ 0x78) << " ".length();
        hayami.llIIlIIll[7] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
        hayami.llIIlIIll[8] = 0x29 ^ 0x10;
    }

    private static boolean IlIIIIIllIl(int n, int n2) {
        return n == n2;
    }

    private static boolean llIIIIIllIl(int n, int n2) {
        return n >= n2;
    }

    private static boolean lIlllllIlIl(int n, int n2) {
        return n < n2;
    }

    private static boolean IIIIIIIllIl(int n, int n2) {
        return n <= n2;
    }

    private static boolean lllllllIlIl(int n) {
        return n != 0;
    }

    private static boolean lIIIIIIllIl(int n) {
        return n == 0;
    }

    private static boolean IllIIIIllIl(int n) {
        return n >= 0;
    }

    private static boolean IllllllIlIl(int n) {
        return n <= 0;
    }

    private static boolean lllIIIIllIl(int n) {
        return n > 0;
    }

    private static boolean IIlIIIIllIl(int n, int n2) {
        return n != n2;
    }

    private static int lIlIIIIllIl(long l, long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }
}

