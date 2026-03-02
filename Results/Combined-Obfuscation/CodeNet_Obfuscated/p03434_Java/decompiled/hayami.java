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
    private final byte[] hayami = new byte[IIIIIIIIll[0]];
    private int Hayami = IIIIIIIIll[1];
    private int saori = IIIIIIIIll[1];
    private static int[] IIIIIIIIll;

    hayami() {
        hayami lIlIlllIllIllll;
    }

    private boolean HayamiSaori() {
        hayami IlIIlllIllIllll;
        if (hayami.IlIlIIllIlIl(IlIIlllIllIllll.Hayami, IlIIlllIllIllll.saori)) {
            return IIIIIIIIll[2];
        }
        IlIIlllIllIllll.Hayami = IIIIIIIIll[1];
        try {
            IlIIlllIllIllll.saori = IlIIlllIllIllll.in.read(IlIIlllIllIllll.hayami);
            "".length();
        }
        catch (IOException lIIIlllIllIllll) {
            lIIIlllIllIllll.printStackTrace();
        }
        if (-" ".length() > " ".length() << (" ".length() << " ".length())) {
            return ((0xBC ^ 0xB5) << " ".length() & ~((0x11 ^ 0x18) << " ".length())) != 0;
        }
        if (hayami.llIlIIllIlIl(IlIIlllIllIllll.saori)) {
            return IIIIIIIIll[1];
        }
        return IIIIIIIIll[2];
    }

    private int SaoriHayami() {
        hayami llllIllIllIllll;
        if (hayami.IIllIIllIlIl(llllIllIllIllll.HayamiSaori() ? 1 : 0)) {
            int n = llllIllIllIllll.Hayami;
            llllIllIllIllll.Hayami = n + IIIIIIIIll[2];
            return llllIllIllIllll.hayami[n];
        }
        return IIIIIIIIll[3];
    }

    private static boolean hayami_saori(int lIllIllIllIllll) {
        int n;
        if (hayami.lIllIIllIlIl(IIIIIIIIll[4], lIllIllIllIllll) && hayami.lIllIIllIlIl(lIllIllIllIllll, IIIIIIIIll[5])) {
            n = IIIIIIIIll[2];
            "".length();
            if (((0x8C ^ 0x91) << " ".length() & ~((0x67 ^ 0x7A) << " ".length())) != 0) {
                return ((0x5A ^ 0x71) & ~(0x6D ^ 0x46)) != 0;
            }
        } else {
            n = IIIIIIIIll[1];
        }
        return n != 0;
    }

    public boolean hayamisaori() {
        hayami llIlIllIllIllll;
        while (hayami.IIllIIllIlIl(llIlIllIllIllll.HayamiSaori() ? 1 : 0) && hayami.IlllIIllIlIl(hayami.hayami_saori(llIlIllIllIllll.hayami[llIlIllIllIllll.Hayami]) ? 1 : 0)) {
            llIlIllIllIllll.Hayami += IIIIIIIIll[2];
            "".length();
            if (((0x6A ^ 0x47) << " ".length() & ~((2 ^ 0x2F) << " ".length())) == ((0x16 ^ 0xD) << " ".length() & ~((4 ^ 0x1F) << " ".length()))) continue;
            return ((0x7C ^ 0x53) << " ".length() & ~((0x5E ^ 0x71) << " ".length())) != 0;
        }
        return this.HayamiSaori();
    }

    /*
     * WARNING - void declaration
     */
    public String nextHayami() {
        void var1_1;
        hayami lllIIllIllIllll;
        if (hayami.IlllIIllIlIl(lllIIllIllIllll.hayamisaori() ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        StringBuilder IllIIllIllIllll = new StringBuilder();
        int lIlIIllIllIllll = lllIIllIllIllll.SaoriHayami();
        while (hayami.IIllIIllIlIl(hayami.hayami_saori(lIlIIllIllIllll) ? 1 : 0)) {
            IllIIllIllIllll.appendCodePoint(lIlIIllIllIllll);
            "".length();
            lIlIIllIllIllll = lllIIllIllIllll.SaoriHayami();
            "".length();
            if ((0x53 ^ 0x56) > 0) continue;
            return null;
        }
        return String.valueOf(var1_1);
    }

    public long saorihayami() {
        hayami IIIIIllIllIllll;
        if (hayami.IlllIIllIlIl(IIIIIllIllIllll.hayamisaori() ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        long lllllIlIllIllll = 0L;
        int IllllIlIllIllll = IIIIIIIIll[1];
        int lIlllIlIllIllll = IIIIIllIllIllll.SaoriHayami();
        if (hayami.llllIIllIlIl(lIlllIlIllIllll, IIIIIIIIll[6])) {
            IllllIlIllIllll = IIIIIIIIll[2];
            lIlllIlIllIllll = IIIIIllIllIllll.SaoriHayami();
        }
        if (!hayami.IIIIlIllIlIl(lIlllIlIllIllll, IIIIIIIIll[7]) || hayami.IlIlIIllIlIl(IIIIIIIIll[8], lIlllIlIllIllll)) {
            throw new NumberFormatException();
        }
        do {
            if (hayami.lIllIIllIlIl(IIIIIIIIll[7], lIlllIlIllIllll) && hayami.lIllIIllIlIl(lIlllIlIllIllll, IIIIIIIIll[8])) {
                lllllIlIllIllll *= 10L;
                lllllIlIllIllll += (long)(lIlllIlIllIllll - IIIIIIIIll[7]);
                "".length();
                if (" ".length() << (" ".length() << " ".length()) < 0) {
                    return 0L;
                }
            } else {
                if (!hayami.lIIIlIllIlIl(lIlllIlIllIllll, IIIIIIIIll[3]) || hayami.IlllIIllIlIl(hayami.hayami_saori(lIlllIlIllIllll) ? 1 : 0)) {
                    long l;
                    if (hayami.IIllIIllIlIl(IllllIlIllIllll)) {
                        l = -lllllIlIllIllll;
                        "".length();
                        if (null != null) {
                            return 0L;
                        }
                    } else {
                        l = lllllIlIllIllll;
                    }
                    return l;
                }
                throw new NumberFormatException();
            }
            int n = this.SaoriHayami();
            "".length();
        } while (null == null);
        return 0L;
    }

    /*
     * WARNING - void declaration
     */
    public int saori_hayami() {
        void var1_1;
        hayami IlIllIlIllIllll;
        long lIIllIlIllIllll = IlIllIlIllIllll.saorihayami();
        if (!hayami.llIIlIllIlIl(hayami.IlIIlIllIlIl(lIIllIlIllIllll, Integer.MIN_VALUE)) || hayami.IIlIlIllIlIl(hayami.IlIIlIllIlIl(lIIllIlIllIllll, Integer.MAX_VALUE))) {
            throw new NumberFormatException();
        }
        return (int)var1_1;
    }

    public double Hayamin() {
        hayami lllIlIlIllIllll;
        return Double.parseDouble(lllIlIlIllIllll.nextHayami());
    }

    @Override
    public void close() {
        try {
            hayami IIlIlIlIllIllll;
            IIlIlIlIllIllll.in.close();
            "".length();
        }
        catch (IOException iOException) {
            // empty catch block
        }
        if ("   ".length() == " ".length()) {
            return;
        }
    }

    static {
        hayami.lIIlIIllIlIl();
    }

    private static void lIIlIIllIlIl() {
        IIIIIIIIll = new int[9];
        hayami.IIIIIIIIll[0] = " ".length() << ((0x96 ^ 0x93) << " ".length());
        hayami.IIIIIIIIll[1] = (0x58 ^ 1 ^ (0x8C ^ 0x9D) << (" ".length() << " ".length())) << " ".length() & (((0x4B ^ 0x40) << " ".length() & ~((0x3B ^ 0x30) << " ".length()) ^ (0x73 ^ 0x6E)) << " ".length() ^ -" ".length());
        hayami.IIIIIIIIll[2] = " ".length();
        hayami.IIIIIIIIll[3] = -" ".length();
        hayami.IIIIIIIIll[4] = 140 + 161 - 137 + 1 ^ (0xA8 ^ 0x89) << (" ".length() << " ".length());
        hayami.IIIIIIIIll[5] = (0x4A ^ 0x75) << " ".length();
        hayami.IIIIIIIIll[6] = (0x94 ^ 0x9D) << (" ".length() << " ".length()) ^ (3 ^ 0xA);
        hayami.IIIIIIIIll[7] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
        hayami.IIIIIIIIll[8] = 0x93 ^ 0xAA;
    }

    private static boolean llllIIllIlIl(int n, int n2) {
        return n == n2;
    }

    private static boolean IIIIlIllIlIl(int n, int n2) {
        return n >= n2;
    }

    private static boolean IlIlIIllIlIl(int n, int n2) {
        return n < n2;
    }

    private static boolean lIllIIllIlIl(int n, int n2) {
        return n <= n2;
    }

    private static boolean IIllIIllIlIl(int n) {
        return n != 0;
    }

    private static boolean IlllIIllIlIl(int n) {
        return n == 0;
    }

    private static boolean llIIlIllIlIl(int n) {
        return n >= 0;
    }

    private static boolean llIlIIllIlIl(int n) {
        return n <= 0;
    }

    private static boolean IIlIlIllIlIl(int n) {
        return n > 0;
    }

    private static boolean lIIIlIllIlIl(int n, int n2) {
        return n != n2;
    }

    private static int IlIIlIllIlIl(long l, long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }
}

