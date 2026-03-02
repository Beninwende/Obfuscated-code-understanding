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
    private final byte[] hayami = new byte[IlIlIIlIll[0]];
    private int Hayami = IlIlIIlIll[1];
    private int saori = IlIlIIlIll[1];
    private static int[] IlIlIIlIll;

    hayami() {
        hayami IlIIllIlIlllIll;
    }

    private boolean HayamiSaori() {
        hayami llllIlIlIlllIll;
        if (hayami.lIllllllllIl(llllIlIlIlllIll.Hayami, llllIlIlIlllIll.saori)) {
            return IlIlIIlIll[2];
        }
        llllIlIlIlllIll.Hayami = IlIlIIlIll[1];
        try {
            llllIlIlIlllIll.saori = llllIlIlIlllIll.in.read(llllIlIlIlllIll.hayami);
            "".length();
        }
        catch (IOException IlllIlIlIlllIll) {
            IlllIlIlIlllIll.printStackTrace();
        }
        if (-" ".length() > " ".length()) {
            return ((0x7F ^ 0x5A ^ " ".length() << " ".length()) << " ".length() & ((0x29 ^ 0x6E ^ "   ".length() << (0x11 ^ 0x14)) << " ".length() ^ -" ".length())) != 0;
        }
        if (hayami.IlllllllllIl(llllIlIlIlllIll.saori)) {
            return IlIlIIlIll[1];
        }
        return IlIlIIlIll[2];
    }

    private int SaoriHayami() {
        hayami IIllIlIlIlllIll;
        if (hayami.llllllllllIl(IIllIlIlIlllIll.HayamiSaori() ? 1 : 0)) {
            int n = IIllIlIlIlllIll.Hayami;
            IIllIlIlIlllIll.Hayami = n + IlIlIIlIll[2];
            return IIllIlIlIlllIll.hayami[n];
        }
        return IlIlIIlIll[3];
    }

    private static boolean hayami_saori(int IlIlIlIlIlllIll) {
        int n;
        if (hayami.IIIIIIIIIIll(IlIlIIlIll[4], IlIlIlIlIlllIll) && hayami.IIIIIIIIIIll(IlIlIlIlIlllIll, IlIlIIlIll[5])) {
            n = IlIlIIlIll[2];
            "".length();
            if (null != null) {
                return (((0x41 ^ 0x48) << (" ".length() << (" ".length() << " ".length())) ^ 166 + 28 - 33 + 26) << " ".length() & ((0xDC ^ 0x9F ^ (0xB3 ^ 0xBE) << "   ".length()) << " ".length() ^ -" ".length())) != 0;
            }
        } else {
            n = IlIlIIlIll[1];
        }
        return n != 0;
    }

    public boolean hayamisaori() {
        hayami IIIlIlIlIlllIll;
        while (hayami.llllllllllIl(IIIlIlIlIlllIll.HayamiSaori() ? 1 : 0) && hayami.lIIIIIIIIIll(hayami.hayami_saori(IIIlIlIlIlllIll.hayami[IIIlIlIlIlllIll.Hayami]) ? 1 : 0)) {
            IIIlIlIlIlllIll.Hayami += IlIlIIlIll[2];
            "".length();
            if (null == null) continue;
            return ((0x34 ^ 0x59 ^ (0xB5 ^ 0xB2) << "   ".length()) & ("   ".length() << (" ".length() << " ".length()) ^ (0x9A ^ 0xC3) ^ -" ".length())) != 0;
        }
        return this.HayamiSaori();
    }

    /*
     * WARNING - void declaration
     */
    public String nextHayami() {
        void var1_1;
        hayami IIlIIlIlIlllIll;
        if (hayami.lIIIIIIIIIll(IIlIIlIlIlllIll.hayamisaori() ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        StringBuilder llIIIlIlIlllIll = new StringBuilder();
        int IlIIIlIlIlllIll = IIlIIlIlIlllIll.SaoriHayami();
        while (hayami.llllllllllIl(hayami.hayami_saori(IlIIIlIlIlllIll) ? 1 : 0)) {
            llIIIlIlIlllIll.appendCodePoint(IlIIIlIlIlllIll);
            "".length();
            IlIIIlIlIlllIll = IIlIIlIlIlllIll.SaoriHayami();
            "".length();
            if (" ".length() << " ".length() >= 0) continue;
            return null;
        }
        return String.valueOf(var1_1);
    }

    public long saorihayami() {
        hayami lIlllIIlIlllIll;
        if (hayami.lIIIIIIIIIll(lIlllIIlIlllIll.hayamisaori() ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        long IIlllIIlIlllIll = 0L;
        int llIllIIlIlllIll = IlIlIIlIll[1];
        int IlIllIIlIlllIll = lIlllIIlIlllIll.SaoriHayami();
        if (hayami.IlIIIIIIIIll(IlIllIIlIlllIll, IlIlIIlIll[6])) {
            llIllIIlIlllIll = IlIlIIlIll[2];
            IlIllIIlIlllIll = lIlllIIlIlllIll.SaoriHayami();
        }
        if (!hayami.llIIIIIIIIll(IlIllIIlIlllIll, IlIlIIlIll[7]) || hayami.lIllllllllIl(IlIlIIlIll[8], IlIllIIlIlllIll)) {
            throw new NumberFormatException();
        }
        do {
            if (hayami.IIIIIIIIIIll(IlIlIIlIll[7], IlIllIIlIlllIll) && hayami.IIIIIIIIIIll(IlIllIIlIlllIll, IlIlIIlIll[8])) {
                IIlllIIlIlllIll *= 10L;
                IIlllIIlIlllIll += (long)(IlIllIIlIlllIll - IlIlIIlIll[7]);
                "".length();
                if ((" ".length() << "   ".length() & ~(" ".length() << "   ".length())) <= -" ".length()) {
                    return 0L;
                }
            } else {
                if (!hayami.IIlIIIIIIIll(IlIllIIlIlllIll, IlIlIIlIll[3]) || hayami.lIIIIIIIIIll(hayami.hayami_saori(IlIllIIlIlllIll) ? 1 : 0)) {
                    long l;
                    if (hayami.llllllllllIl(llIllIIlIlllIll)) {
                        l = -IIlllIIlIlllIll;
                        "".length();
                        if (((0xC7 ^ 0xC2) << (" ".length() << (" ".length() << " ".length())) & ~((0x8E ^ 0x8B) << (" ".length() << (" ".length() << " ".length())))) > 0) {
                            return 0L;
                        }
                    } else {
                        l = IIlllIIlIlllIll;
                    }
                    return l;
                }
                throw new NumberFormatException();
            }
            int n = this.SaoriHayami();
            "".length();
        } while (-" ".length() < 0);
        return 0L;
    }

    /*
     * WARNING - void declaration
     */
    public int saori_hayami() {
        void var1_1;
        hayami lllIlIIlIlllIll;
        long IllIlIIlIlllIll = lllIlIIlIlllIll.saorihayami();
        if (!hayami.IllIIIIIIIll(hayami.lIlIIIIIIIll(IllIlIIlIlllIll, Integer.MIN_VALUE)) || hayami.lllIIIIIIIll(hayami.lIlIIIIIIIll(IllIlIIlIlllIll, Integer.MAX_VALUE))) {
            throw new NumberFormatException();
        }
        return (int)var1_1;
    }

    public double Hayamin() {
        hayami IIlIlIIlIlllIll;
        return Double.parseDouble(IIlIlIIlIlllIll.nextHayami());
    }

    @Override
    public void close() {
        try {
            hayami lIIIlIIlIlllIll;
            lIIIlIIlIlllIll.in.close();
            "".length();
        }
        catch (IOException iOException) {
            // empty catch block
        }
        if (-(90 + 62 - 62 + 65 ^ 119 + 39 - 139 + 140) >= 0) {
            return;
        }
    }

    static {
        hayami.IIllllllllIl();
    }

    private static void IIllllllllIl() {
        IlIlIIlIll = new int[9];
        hayami.IlIlIIlIll[0] = " ".length() << ((0x7E ^ 0x7B) << " ".length());
        hayami.IlIlIIlIll[1] = ((0xBA ^ 0x99) << (" ".length() << " ".length()) ^ 40 + 47 - -53 + 27) & (0xC ^ 0x47 ^ "   ".length() << (0x18 ^ 0x1D) ^ -" ".length());
        hayami.IlIlIIlIll[2] = " ".length();
        hayami.IlIlIIlIll[3] = -" ".length();
        hayami.IlIlIIlIll[4] = 54 + 121 - 64 + 26 ^ (0x44 ^ 0x51) << "   ".length();
        hayami.IlIlIIlIll[5] = ("   ".length() << "   ".length() ^ (0x49 ^ 0x6E)) << " ".length();
        hayami.IlIlIIlIll[6] = 0xA4 ^ 0x89;
        hayami.IlIlIIlIll[7] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
        hayami.IlIlIIlIll[8] = (0xDA ^ 0x81) << " ".length() ^ 97 + 44 - -2 + 0;
    }

    private static boolean IlIIIIIIIIll(int n, int n2) {
        return n == n2;
    }

    private static boolean llIIIIIIIIll(int n, int n2) {
        return n >= n2;
    }

    private static boolean lIllllllllIl(int n, int n2) {
        return n < n2;
    }

    private static boolean IIIIIIIIIIll(int n, int n2) {
        return n <= n2;
    }

    private static boolean llllllllllIl(int n) {
        return n != 0;
    }

    private static boolean lIIIIIIIIIll(int n) {
        return n == 0;
    }

    private static boolean IllIIIIIIIll(int n) {
        return n >= 0;
    }

    private static boolean IlllllllllIl(int n) {
        return n <= 0;
    }

    private static boolean lllIIIIIIIll(int n) {
        return n > 0;
    }

    private static boolean IIlIIIIIIIll(int n, int n2) {
        return n != n2;
    }

    private static int lIlIIIIIIIll(long l, long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }
}

