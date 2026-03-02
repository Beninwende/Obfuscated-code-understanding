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
    private final byte[] hayami = new byte[IlIlIlllIl[0]];
    private int Hayami = IlIlIlllIl[1];
    private int saori = IlIlIlllIl[1];
    private static int[] IlIlIlllIl;

    hayami() {
        hayami lIlIllIIIllllll;
    }

    private boolean HayamiSaori() {
        hayami IlIIllIIIllllll;
        if (hayami.IlIIIIIlIlIl(IlIIllIIIllllll.Hayami, IlIIllIIIllllll.saori)) {
            return IlIlIlllIl[2];
        }
        IlIIllIIIllllll.Hayami = IlIlIlllIl[1];
        try {
            IlIIllIIIllllll.saori = IlIIllIIIllllll.in.read(IlIIllIIIllllll.hayami);
            "".length();
        }
        catch (IOException lIIIllIIIllllll) {
            lIIIllIIIllllll.printStackTrace();
        }
        if (-"  ".length() >= 0) {
            return ((0xAC ^ 0x9D) & ~(0xF1 ^ 0xC0)) != 0;
        }
        if (hayami.llIIIIIlIlIl(IlIIllIIIllllll.saori)) {
            return IlIlIlllIl[1];
        }
        return IlIlIlllIl[2];
    }

    private int SaoriHayami() {
        hayami llllIlIIIllllll;
        if (hayami.IIlIIIIlIlIl(llllIlIIIllllll.HayamiSaori() ? 1 : 0)) {
            int n = llllIlIIIllllll.Hayami;
            llllIlIIIllllll.Hayami = n + IlIlIlllIl[2];
            return llllIlIIIllllll.hayami[n];
        }
        return IlIlIlllIl[3];
    }

    private static boolean hayami_saori(int lIllIlIIIllllll) {
        int n;
        if (hayami.lIlIIIIlIlIl(IlIlIlllIl[4], lIllIlIIIllllll) && hayami.lIlIIIIlIlIl(lIllIlIIIllllll, IlIlIlllIl[5])) {
            n = IlIlIlllIl[2];
            "".length();
            if ((((0x87 ^ 0x90) << (" ".length() << " ".length()) ^ (0xA ^ 0x43)) << " ".length() & ((0x53 ^ 0x62 ^ (0xA2 ^ 0xAB) << (" ".length() << " ".length())) << " ".length() ^ -" ".length())) == " ".length()) {
                return (" ".length() << "   ".length() & (" ".length() << "   ".length() ^ -" ".length())) != 0;
            }
        } else {
            n = IlIlIlllIl[1];
        }
        return n != 0;
    }

    public boolean hayamisaori() {
        hayami llIlIlIIIllllll;
        while (hayami.IIlIIIIlIlIl(llIlIlIIIllllll.HayamiSaori() ? 1 : 0) && hayami.IllIIIIlIlIl(hayami.hayami_saori(llIlIlIIIllllll.hayami[llIlIlIIIllllll.Hayami]) ? 1 : 0)) {
            llIlIlIIIllllll.Hayami += IlIlIlllIl[2];
            "".length();
            if (-"   ".length() <= 0) continue;
            return (((0x76 ^ 0x15) << " ".length() ^ 105 + 15 - 73 + 120) & ((0xA3 ^ 0xB0) << (" ".length() << " ".length()) ^ (0x95 ^ 0xB8) ^ -" ".length())) != 0;
        }
        return this.HayamiSaori();
    }

    /*
     * WARNING - void declaration
     */
    public String nextHayami() {
        void var1_1;
        hayami lllIIlIIIllllll;
        if (hayami.IllIIIIlIlIl(lllIIlIIIllllll.hayamisaori() ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        StringBuilder IllIIlIIIllllll = new StringBuilder();
        int lIlIIlIIIllllll = lllIIlIIIllllll.SaoriHayami();
        while (hayami.IIlIIIIlIlIl(hayami.hayami_saori(lIlIIlIIIllllll) ? 1 : 0)) {
            IllIIlIIIllllll.appendCodePoint(lIlIIlIIIllllll);
            "".length();
            lIlIIlIIIllllll = lllIIlIIIllllll.SaoriHayami();
            "".length();
            if ("   ".length() >= 0) continue;
            return null;
        }
        return String.valueOf(var1_1);
    }

    public long saorihayami() {
        hayami IIIIIlIIIllllll;
        if (hayami.IllIIIIlIlIl(IIIIIlIIIllllll.hayamisaori() ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        long lllllIIIIllllll = 0L;
        int IllllIIIIllllll = IlIlIlllIl[1];
        int lIlllIIIIllllll = IIIIIlIIIllllll.SaoriHayami();
        if (hayami.lllIIIIlIlIl(lIlllIIIIllllll, IlIlIlllIl[6])) {
            IllllIIIIllllll = IlIlIlllIl[2];
            lIlllIIIIllllll = IIIIIlIIIllllll.SaoriHayami();
        }
        if (!hayami.IIIlIIIlIlIl(lIlllIIIIllllll, IlIlIlllIl[7]) || hayami.IlIIIIIlIlIl(IlIlIlllIl[8], lIlllIIIIllllll)) {
            throw new NumberFormatException();
        }
        do {
            if (hayami.lIlIIIIlIlIl(IlIlIlllIl[7], lIlllIIIIllllll) && hayami.lIlIIIIlIlIl(lIlllIIIIllllll, IlIlIlllIl[8])) {
                lllllIIIIllllll *= 10L;
                lllllIIIIllllll += (long)(lIlllIIIIllllll - IlIlIlllIl[7]);
                "".length();
                if (-" ".length() >= 0) {
                    return 0L;
                }
            } else {
                if (!hayami.lIIlIIIlIlIl(lIlllIIIIllllll, IlIlIlllIl[3]) || hayami.IllIIIIlIlIl(hayami.hayami_saori(lIlllIIIIllllll) ? 1 : 0)) {
                    long l;
                    if (hayami.IIlIIIIlIlIl(IllllIIIIllllll)) {
                        l = -lllllIIIIllllll;
                        "".length();
                        if (null != null) {
                            return 0L;
                        }
                    } else {
                        l = lllllIIIIllllll;
                    }
                    return l;
                }
                throw new NumberFormatException();
            }
            int n = this.SaoriHayami();
            "".length();
        } while (" ".length() != 0);
        return 0L;
    }

    /*
     * WARNING - void declaration
     */
    public int saori_hayami() {
        void var1_1;
        hayami IlIllIIIIllllll;
        long lIIllIIIIllllll = IlIllIIIIllllll.saorihayami();
        if (!hayami.llIlIIIlIlIl(hayami.IlIlIIIlIlIl(lIIllIIIIllllll, Integer.MIN_VALUE)) || hayami.IIllIIIlIlIl(hayami.IlIlIIIlIlIl(lIIllIIIIllllll, Integer.MAX_VALUE))) {
            throw new NumberFormatException();
        }
        return (int)var1_1;
    }

    public double Hayamin() {
        hayami lllIlIIIIllllll;
        return Double.parseDouble(lllIlIIIIllllll.nextHayami());
    }

    @Override
    public void close() {
        try {
            hayami IIlIlIIIIllllll;
            IIlIlIIIIllllll.in.close();
            "".length();
        }
        catch (IOException iOException) {
            // empty catch block
        }
        if (null != null) {
            return;
        }
    }

    static {
        hayami.lIIIIIIlIlIl();
    }

    private static void lIIIIIIlIlIl() {
        IlIlIlllIl = new int[9];
        hayami.IlIlIlllIl[0] = " ".length() << (((0xD4 ^ 0xC7) << "   ".length() ^ 32 + 94 - 97 + 128) << " ".length());
        hayami.IlIlIlllIl[1] = "   ".length() << "   ".length() & ~("   ".length() << "   ".length());
        hayami.IlIlIlllIl[2] = " ".length();
        hayami.IlIlIlllIl[3] = -" ".length();
        hayami.IlIlIlllIl[4] = (0x50 ^ 0x7D) << " ".length() ^ (0xDB ^ 0xA0);
        hayami.IlIlIlllIl[5] = ((0x95 ^ 0x86) << " ".length() ^ (0x73 ^ 0x6A)) << " ".length();
        hayami.IlIlIlllIl[6] = 0x84 ^ 0xA9;
        hayami.IlIlIlllIl[7] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
        hayami.IlIlIlllIl[8] = 157 + 186 - 198 + 46 ^ (0xFF ^ 0xBC) << " ".length();
    }

    private static boolean lllIIIIlIlIl(int n, int n2) {
        return n == n2;
    }

    private static boolean IIIlIIIlIlIl(int n, int n2) {
        return n >= n2;
    }

    private static boolean IlIIIIIlIlIl(int n, int n2) {
        return n < n2;
    }

    private static boolean lIlIIIIlIlIl(int n, int n2) {
        return n <= n2;
    }

    private static boolean IIlIIIIlIlIl(int n) {
        return n != 0;
    }

    private static boolean IllIIIIlIlIl(int n) {
        return n == 0;
    }

    private static boolean llIlIIIlIlIl(int n) {
        return n >= 0;
    }

    private static boolean llIIIIIlIlIl(int n) {
        return n <= 0;
    }

    private static boolean IIllIIIlIlIl(int n) {
        return n > 0;
    }

    private static boolean lIIlIIIlIlIl(int n, int n2) {
        return n != n2;
    }

    private static int IlIlIIIlIlIl(long l, long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }
}

