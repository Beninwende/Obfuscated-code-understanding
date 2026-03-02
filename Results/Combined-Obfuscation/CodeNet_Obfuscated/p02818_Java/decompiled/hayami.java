/*
 * Decompiled with CFR 0.152.
 */
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.NoSuchElementException;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

class hayami
implements Closeable {
    private final InputStream in = System.in;
    private final byte[] hayami = new byte[IlIlIIlIll[IlIIlIlIll[0]]];
    private int Hayami = IlIlIIlIll[IlIIlIlIll[1]];
    private int saori = IlIlIIlIll[IlIIlIlIll[1]];
    private static int[] IlIlIIlIll;
    private static String[] lIllIIlIll;
    private static int[] IlIIlIlIll;

    hayami() {
        hayami IIlllIIllIllIll;
    }

    private boolean HayamiSaori() {
        hayami IIIllIIllIllIll;
        if (hayami.lIlIIlIIIIll(hayami.lIllllllllIl(IIIllIIllIllIll.Hayami, IIIllIIllIllIll.saori) ? 1 : 0)) {
            return IlIlIIlIll[IlIIlIlIll[2]];
        }
        IIIllIIllIllIll.Hayami = IlIlIIlIll[IlIIlIlIll[1]];
        try {
            IIIllIIllIllIll.saori = IIIllIIllIllIll.in.read(IIIllIIllIllIll.hayami);
            lIllIIlIll[IlIIlIlIll[0]].length();
            "".length();
        }
        catch (IOException lllIlIIllIllIll) {
            lllIlIIllIllIll.printStackTrace();
        }
        if (hayami.IllIIlIIIIll(-lIllIIlIll[IlIIlIlIll[1]].length(), lIllIIlIll[IlIIlIlIll[2]].length())) {
            return ((IlIIlIlIll[3] ^ IlIIlIlIll[4] ^ lIllIIlIll[IlIIlIlIll[5]].length() << lIllIIlIll[IlIIlIlIll[6]].length()) << lIllIIlIll[IlIIlIlIll[7]].length() & ((IlIIlIlIll[8] ^ IlIIlIlIll[9] ^ lIllIIlIll[IlIIlIlIll[10]].length() << (IlIIlIlIll[11] ^ IlIIlIlIll[12])) << lIllIIlIll[IlIIlIlIll[13]].length() ^ -lIllIIlIll[IlIIlIlIll[14]].length())) != 0;
        }
        if (hayami.lIlIIlIIIIll(hayami.IlllllllllIl(IIIllIIllIllIll.saori) ? 1 : 0)) {
            return IlIlIIlIll[IlIIlIlIll[1]];
        }
        return IlIlIIlIll[IlIIlIlIll[2]];
    }

    private int SaoriHayami() {
        hayami llIIlIIllIllIll;
        if (hayami.lIlIIlIIIIll(hayami.llllllllllIl(llIIlIIllIllIll.HayamiSaori() ? 1 : 0) ? 1 : 0)) {
            int n = llIIlIIllIllIll.Hayami;
            llIIlIIllIllIll.Hayami = n + IlIlIIlIll[IlIIlIlIll[2]];
            return llIIlIIllIllIll.hayami[n];
        }
        return IlIlIIlIll[IlIIlIlIll[5]];
    }

    private static boolean hayami_saori(int IIIIlIIllIllIll) {
        int n;
        if (hayami.lIlIIlIIIIll(hayami.IIIIIIIIIIll(IlIlIIlIll[IlIIlIlIll[6]], IIIIlIIllIllIll) ? 1 : 0) && hayami.lIlIIlIIIIll(hayami.IIIIIIIIIIll(IIIIlIIllIllIll, IlIlIIlIll[IlIIlIlIll[7]]) ? 1 : 0)) {
            n = IlIlIIlIll[IlIIlIlIll[2]];
            lIllIIlIll[IlIIlIlIll[15]].length();
            "".length();
            if (hayami.lllIIlIIIIll(null)) {
                return (((IlIIlIlIll[16] ^ IlIIlIlIll[17]) << (lIllIIlIll[IlIIlIlIll[18]].length() << (lIllIIlIll[IlIIlIlIll[19]].length() << lIllIIlIll[IlIIlIlIll[20]].length())) ^ IlIIlIlIll[21] + IlIIlIlIll[22] - IlIIlIlIll[23] + IlIIlIlIll[24]) << lIllIIlIll[IlIIlIlIll[25]].length() & ((IlIIlIlIll[26] ^ IlIIlIlIll[27] ^ (IlIIlIlIll[28] ^ IlIIlIlIll[29]) << lIllIIlIll[IlIIlIlIll[30]].length()) << lIllIIlIll[IlIIlIlIll[31]].length() ^ -lIllIIlIll[IlIIlIlIll[32]].length())) != 0;
            }
        } else {
            n = IlIlIIlIll[IlIIlIlIll[1]];
        }
        return n != 0;
    }

    public boolean hayamisaori() {
        hayami lIllIIIllIllIll;
        while (hayami.lIlIIlIIIIll(hayami.llllllllllIl(lIllIIIllIllIll.HayamiSaori() ? 1 : 0) ? 1 : 0) && hayami.lIlIIlIIIIll(hayami.lIIIIIIIIIll(hayami.hayami_saori(lIllIIIllIllIll.hayami[lIllIIIllIllIll.Hayami]) ? 1 : 0) ? 1 : 0)) {
            lIllIIIllIllIll.Hayami += IlIlIIlIll[IlIIlIlIll[2]];
            lIllIIlIll[IlIIlIlIll[11]].length();
            "".length();
            if (!hayami.lllIIlIIIIll(null)) continue;
            return ((IlIIlIlIll[33] ^ IlIIlIlIll[34] ^ (IlIIlIlIll[35] ^ IlIIlIlIll[36]) << lIllIIlIll[IlIIlIlIll[37]].length()) & (lIllIIlIll[IlIIlIlIll[38]].length() << (lIllIIlIll[IlIIlIlIll[12]].length() << lIllIIlIll[IlIIlIlIll[39]].length()) ^ (IlIIlIlIll[40] ^ IlIIlIlIll[41]) ^ -lIllIIlIll[IlIIlIlIll[42]].length())) != 0;
        }
        return this.HayamiSaori();
    }

    /*
     * WARNING - void declaration
     */
    public String nextHayami() {
        void var1_1;
        hayami IIIlIIIllIllIll;
        if (hayami.lIlIIlIIIIll(hayami.lIIIIIIIIIll(IIIlIIIllIllIll.hayamisaori() ? 1 : 0) ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        StringBuilder lllIIIIllIllIll = new StringBuilder();
        int IllIIIIllIllIll = IIIlIIIllIllIll.SaoriHayami();
        while (hayami.lIlIIlIIIIll(hayami.llllllllllIl(hayami.hayami_saori(IllIIIIllIllIll) ? 1 : 0) ? 1 : 0)) {
            lllIIIIllIllIll.appendCodePoint(IllIIIIllIllIll);
            lIllIIlIll[IlIIlIlIll[43]].length();
            IllIIIIllIllIll = IIIlIIIllIllIll.SaoriHayami();
            lIllIIlIll[IlIIlIlIll[44]].length();
            "".length();
            if (!hayami.IIIlIlIIIIll(lIllIIlIll[IlIIlIlIll[45]].length() << lIllIIlIll[IlIIlIlIll[24]].length())) continue;
            return null;
        }
        return String.valueOf(var1_1);
    }

    public long saorihayami() {
        hayami IllllllIlIllIll;
        if (hayami.lIlIIlIIIIll(hayami.lIIIIIIIIIll(IllllllIlIllIll.hayamisaori() ? 1 : 0) ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        long lIlllllIlIllIll = 0L;
        int IIlllllIlIllIll = IlIlIIlIll[IlIIlIlIll[1]];
        int llIllllIlIllIll = IllllllIlIllIll.SaoriHayami();
        if (hayami.lIlIIlIIIIll(hayami.IlIIIIIIIIll(llIllllIlIllIll, IlIlIIlIll[IlIIlIlIll[10]]) ? 1 : 0)) {
            IIlllllIlIllIll = IlIlIIlIll[IlIIlIlIll[2]];
            llIllllIlIllIll = IllllllIlIllIll.SaoriHayami();
        }
        if (!hayami.lIlIIlIIIIll(hayami.llIIIIIIIIll(llIllllIlIllIll, IlIlIIlIll[IlIIlIlIll[13]]) ? 1 : 0) || hayami.lIlIIlIIIIll(hayami.lIllllllllIl(IlIlIIlIll[IlIIlIlIll[14]], llIllllIlIllIll) ? 1 : 0)) {
            throw new NumberFormatException();
        }
        do {
            if (hayami.lIlIIlIIIIll(hayami.IIIIIIIIIIll(IlIlIIlIll[IlIIlIlIll[13]], llIllllIlIllIll) ? 1 : 0) && hayami.lIlIIlIIIIll(hayami.IIIIIIIIIIll(llIllllIlIllIll, IlIlIIlIll[IlIIlIlIll[14]]) ? 1 : 0)) {
                lIlllllIlIllIll *= 10L;
                lIlllllIlIllIll += (long)(llIllllIlIllIll - IlIlIIlIll[IlIIlIlIll[13]]);
                lIllIIlIll[IlIIlIlIll[46]].length();
                "".length();
                if (hayami.lIIlIlIIIIll(lIllIIlIll[IlIIlIlIll[22]].length() << lIllIIlIll[IlIIlIlIll[47]].length() & (lIllIIlIll[IlIIlIlIll[48]].length() << lIllIIlIll[IlIIlIlIll[49]].length() ^ IlIIlIlIll[50]), -lIllIIlIll[IlIIlIlIll[51]].length())) {
                    return 0L;
                }
            } else {
                if (!hayami.lIlIIlIIIIll(hayami.IIlIIIIIIIll(llIllllIlIllIll, IlIlIIlIll[IlIIlIlIll[5]]) ? 1 : 0) || hayami.lIlIIlIIIIll(hayami.lIIIIIIIIIll(hayami.hayami_saori(llIllllIlIllIll) ? 1 : 0) ? 1 : 0)) {
                    long l;
                    if (hayami.lIlIIlIIIIll(hayami.llllllllllIl(IIlllllIlIllIll) ? 1 : 0)) {
                        l = -lIlllllIlIllIll;
                        lIllIIlIll[IlIIlIlIll[23]].length();
                        "".length();
                        if (hayami.IlIlIlIIIIll((IlIIlIlIll[52] ^ IlIIlIlIll[53]) << (lIllIIlIll[IlIIlIlIll[54]].length() << (lIllIIlIll[IlIIlIlIll[55]].length() << lIllIIlIll[IlIIlIlIll[56]].length())) & ((IlIIlIlIll[57] ^ IlIIlIlIll[58]) << (lIllIIlIll[IlIIlIlIll[59]].length() << (lIllIIlIll[IlIIlIlIll[60]].length() << lIllIIlIll[IlIIlIlIll[61]].length())) ^ IlIIlIlIll[50]))) {
                            return 0L;
                        }
                    } else {
                        l = lIlllllIlIllIll;
                    }
                    return l;
                }
                throw new NumberFormatException();
            }
            int n = this.SaoriHayami();
            lIllIIlIll[IlIIlIlIll[62]].length();
            "".length();
        } while (!hayami.llIlIlIIIIll(-lIllIIlIll[IlIIlIlIll[8]].length()));
        return 0L;
    }

    /*
     * WARNING - void declaration
     */
    public int saori_hayami() {
        void var1_1;
        hayami IIlIlllIlIllIll;
        long llIIlllIlIllIll = IIlIlllIlIllIll.saorihayami();
        if (!hayami.lIlIIlIIIIll(hayami.IllIIIIIIIll(hayami.lIlIIIIIIIll(llIIlllIlIllIll, Integer.MIN_VALUE)) ? 1 : 0) || hayami.lIlIIlIIIIll(hayami.lllIIIIIIIll(hayami.lIlIIIIIIIll(llIIlllIlIllIll, Integer.MAX_VALUE)) ? 1 : 0)) {
            throw new NumberFormatException();
        }
        return (int)var1_1;
    }

    public double Hayamin() {
        hayami llllIllIlIllIll;
        return Double.parseDouble(llllIllIlIllIll.nextHayami());
    }

    @Override
    public void close() {
        try {
            hayami llIlIllIlIllIll;
            llIlIllIlIllIll.in.close();
            lIllIIlIll[IlIIlIlIll[63]].length();
            "".length();
        }
        catch (IOException iOException) {
            // empty catch block
        }
        if (hayami.llIlIlIIIIll(-(IlIIlIlIll[4] + IlIIlIlIll[64] - IlIIlIlIll[64] + IlIIlIlIll[16] ^ IlIIlIlIll[65] + IlIIlIlIll[61] - IlIIlIlIll[58] + IlIIlIlIll[66]))) {
            return;
        }
    }

    static {
        hayami.IIlIIlIIIIll();
        hayami.llIIIlIIIIll();
        hayami.IIllllllllIl();
    }

    private static void IIllllllllIl() {
        IlIlIIlIll = new int[IlIIlIlIll[15]];
        hayami.IlIlIIlIll[hayami.IlIIlIlIll[0]] = lIllIIlIll[IlIIlIlIll[67]].length() << ((IlIIlIlIll[68] ^ IlIIlIlIll[69]) << lIllIIlIll[IlIIlIlIll[70]].length());
        hayami.IlIlIIlIll[hayami.IlIIlIlIll[1]] = ((IlIIlIlIll[71] ^ IlIIlIlIll[72]) << (lIllIIlIll[IlIIlIlIll[73]].length() << lIllIIlIll[IlIIlIlIll[74]].length()) ^ IlIIlIlIll[62] + IlIIlIlIll[75] - IlIIlIlIll[76] + IlIIlIlIll[46]) & (IlIIlIlIll[20] ^ IlIIlIlIll[77] ^ lIllIIlIll[IlIIlIlIll[75]].length() << (IlIIlIlIll[44] ^ IlIIlIlIll[47]) ^ -lIllIIlIll[IlIIlIlIll[78]].length());
        hayami.IlIlIIlIll[hayami.IlIIlIlIll[2]] = lIllIIlIll[IlIIlIlIll[79]].length();
        hayami.IlIlIIlIll[hayami.IlIIlIlIll[5]] = -lIllIIlIll[IlIIlIlIll[80]].length();
        hayami.IlIlIIlIll[hayami.IlIIlIlIll[6]] = IlIIlIlIll[81] + IlIIlIlIll[82] - IlIIlIlIll[83] + IlIIlIlIll[24] ^ (IlIIlIlIll[84] ^ IlIIlIlIll[85]) << lIllIIlIll[IlIIlIlIll[86]].length();
        hayami.IlIlIIlIll[hayami.IlIIlIlIll[7]] = (lIllIIlIll[IlIIlIlIll[33]].length() << lIllIIlIll[IlIIlIlIll[87]].length() ^ (IlIIlIlIll[88] ^ IlIIlIlIll[9])) << lIllIIlIll[IlIIlIlIll[81]].length();
        hayami.IlIlIIlIll[hayami.IlIIlIlIll[10]] = IlIIlIlIll[89] ^ IlIIlIlIll[90];
        hayami.IlIlIIlIll[hayami.IlIIlIlIll[13]] = lIllIIlIll[IlIIlIlIll[91]].length() << (lIllIIlIll[IlIIlIlIll[92]].length() << (lIllIIlIll[IlIIlIlIll[93]].length() << lIllIIlIll[IlIIlIlIll[94]].length()));
        hayami.IlIlIIlIll[hayami.IlIIlIlIll[14]] = (IlIIlIlIll[95] ^ IlIIlIlIll[96]) << lIllIIlIll[IlIIlIlIll[97]].length() ^ IlIIlIlIll[98] + IlIIlIlIll[70] - IlIIlIlIll[99] + IlIIlIlIll[0];
    }

    private static boolean IlIIIIIIIIll(int n, int n2) {
        boolean bl;
        if (hayami.IIllIlIIIIll(n, n2)) {
            bl = IlIIlIlIll[1];
            "".length();
            if (((0x89 ^ 0xBC) & ~(0x26 ^ 0x13)) != 0) {
                return ((0x70 ^ 0x7B) & ~(0x1B ^ 0x10)) != 0;
            }
        } else {
            bl = IlIIlIlIll[0];
        }
        return bl;
    }

    private static boolean llIIIIIIIIll(int n, int n2) {
        boolean bl;
        if (hayami.lIllIlIIIIll(n, n2)) {
            bl = IlIIlIlIll[1];
            "".length();
            if (((0x64 ^ 0x27) & ~(0xCD ^ 0x8E)) != 0) {
                return (" ".length() << "   ".length() & ~(" ".length() << "   ".length())) != 0;
            }
        } else {
            bl = IlIIlIlIll[0];
        }
        return bl;
    }

    private static boolean lIllllllllIl(int n, int n2) {
        boolean bl;
        if (hayami.IlllIlIIIIll(n, n2)) {
            bl = IlIIlIlIll[1];
            "".length();
            if (-" ".length() >= ((0xBC ^ 0xC5 ^ (0x8C ^ 0xA5) << " ".length()) << " ".length() & ((0x7A ^ 0x39 ^ (0xA1 ^ 0xAC) << "   ".length()) << " ".length() ^ -" ".length()))) {
                return (("   ".length() << (0x68 ^ 0x6D) ^ (2 ^ 0x53)) << " ".length() & ((0xEA ^ 0x81 ^ (0x5B ^ 0x76) << " ".length()) << " ".length() ^ -" ".length())) != 0;
            }
        } else {
            bl = IlIIlIlIll[0];
        }
        return bl;
    }

    private static boolean IIIIIIIIIIll(int n, int n2) {
        boolean bl;
        if (hayami.lIIlIlIIIIll(n, n2)) {
            bl = IlIIlIlIll[1];
            "".length();
            if (-(0xF0 ^ 0xB5 ^ " ".length() << ("   ".length() << " ".length())) >= 0) {
                return (((0x6B ^ 0x60) << " ".length() ^ (0x8E ^ 0x9F)) << " ".length() & ((" ".length() << " ".length() ^ (0xBE ^ 0xBB)) << " ".length() ^ -" ".length())) != 0;
            }
        } else {
            bl = IlIIlIlIll[0];
        }
        return bl;
    }

    private static boolean llllllllllIl(int n) {
        boolean bl;
        if (hayami.lIlIIlIIIIll(n)) {
            bl = IlIIlIlIll[1];
            "".length();
            if (((0xA6 ^ 0xA1) << "   ".length() & ~((7 ^ 0) << "   ".length())) >= " ".length() << (" ".length() << " ".length())) {
                return ((0x18 ^ 9) << (" ".length() << " ".length()) & ~((0xAE ^ 0xBF) << (" ".length() << " ".length()))) != 0;
            }
        } else {
            bl = IlIIlIlIll[0];
        }
        return bl;
    }

    private static boolean lIIIIIIIIIll(int n) {
        boolean bl;
        if (hayami.llllIlIIIIll(n)) {
            bl = IlIIlIlIll[1];
            "".length();
            if ((" ".length() << (" ".length() << " ".length()) & ~(" ".length() << (" ".length() << " ".length()))) != 0) {
                return ("   ".length() << "   ".length() & ~("   ".length() << "   ".length())) != 0;
            }
        } else {
            bl = IlIIlIlIll[0];
        }
        return bl;
    }

    private static boolean IllIIIIIIIll(int n) {
        boolean bl;
        if (hayami.llIlIlIIIIll(n)) {
            bl = IlIIlIlIll[1];
            "".length();
            if (" ".length() <= -" ".length()) {
                return ((0x31 ^ 0x64) & ~(0x22 ^ 0x77)) != 0;
            }
        } else {
            bl = IlIIlIlIll[0];
        }
        return bl;
    }

    private static boolean IlllllllllIl(int n) {
        boolean bl;
        if (hayami.IIIIllIIIIll(n)) {
            bl = IlIIlIlIll[1];
            "".length();
            if ((0xBA ^ 0xBF) <= 0) {
                return (" ".length() << (" ".length() << (" ".length() << " ".length())) & ~(" ".length() << (" ".length() << (" ".length() << " ".length())))) != 0;
            }
        } else {
            bl = IlIIlIlIll[0];
        }
        return bl;
    }

    private static boolean lllIIIIIIIll(int n) {
        boolean bl;
        if (hayami.IlIlIlIIIIll(n)) {
            bl = IlIIlIlIll[1];
            "".length();
            if ("   ".length() <= 0) {
                return (((0x3D ^ 0x2A) << "   ".length() ^ 75 + 56 - 66 + 90) << " ".length() & (((0x4B ^ 0x78) << " ".length() ^ (0xCD ^ 0x88)) << " ".length() ^ -" ".length())) != 0;
            }
        } else {
            bl = IlIIlIlIll[0];
        }
        return bl;
    }

    private static boolean IIlIIIIIIIll(int n, int n2) {
        boolean bl;
        if (hayami.lIIIllIIIIll(n, n2)) {
            bl = IlIIlIlIll[1];
            "".length();
            if (-" ".length() >= 0) {
                return (((0xF1 ^ 0xC2) << " ".length() ^ (0xF6 ^ 0xB3)) & (0x3A ^ 0x63 ^ (0x97 ^ 0xAA) << " ".length() ^ -" ".length())) != 0;
            }
        } else {
            bl = IlIIlIlIll[0];
        }
        return bl;
    }

    private static int lIlIIIIIIIll(long l, long l2) {
        return hayami.IlIIllIIIIll(l, l2);
    }

    private static void llIIIlIIIIll() {
        lIllIIlIll = new String[IlIIlIlIll[100]];
        hayami.lIllIIlIll[hayami.IlIIlIlIll[0]] = hayami.IlllIIIIIIll("", "eDkoY");
        hayami.lIllIIlIll[hayami.IlIIlIlIll[1]] = hayami.llllIIIIIIll("2RTt1a9XYPQ=", "Exavj");
        hayami.lIllIIlIll[hayami.IlIIlIlIll[2]] = hayami.IlllIIIIIIll("RQ==", "efrYD");
        hayami.lIllIIlIll[hayami.IlIIlIlIll[5]] = hayami.llllIIIIIIll("M6L9ffU8SCA=", "rNlpH");
        hayami.lIllIIlIll[hayami.IlIIlIlIll[6]] = hayami.llllIIIIIIll("KmT1iQwa9HI=", "hVLJX");
        hayami.lIllIIlIll[hayami.IlIIlIlIll[7]] = hayami.llllIIIIIIll("jG7QwLP5bBc=", "iVdQj");
        hayami.lIllIIlIll[hayami.IlIIlIlIll[10]] = hayami.IlllIIIIIIll("Z2dO", "GGnaG");
        hayami.lIllIIlIll[hayami.IlIIlIlIll[13]] = hayami.llllIIIIIIll("8Hrq2G0rNY8=", "VtXPx");
        hayami.lIllIIlIll[hayami.IlIIlIlIll[14]] = hayami.lIIIlIIIIIll("ARFCgpTxH+o=", "oTIOu");
        hayami.lIllIIlIll[hayami.IlIIlIlIll[15]] = hayami.lIIIlIIIIIll("FampV/CVYkU=", "hPmJr");
        hayami.lIllIIlIll[hayami.IlIIlIlIll[18]] = hayami.IlllIIIIIIll("WA==", "xPPQj");
        hayami.lIllIIlIll[hayami.IlIIlIlIll[19]] = hayami.IlllIIIIIIll("cg==", "RSmBQ");
        hayami.lIllIIlIll[hayami.IlIIlIlIll[20]] = hayami.IlllIIIIIIll("Sg==", "jvgaU");
        hayami.lIllIIlIll[hayami.IlIIlIlIll[25]] = hayami.lIIIlIIIIIll("nfY8Fy+/4Mw=", "WNsgu");
        hayami.lIllIIlIll[hayami.IlIIlIlIll[30]] = hayami.IlllIIIIIIll("ZWJJ", "EBiTW");
        hayami.lIllIIlIll[hayami.IlIIlIlIll[31]] = hayami.IlllIIIIIIll("YQ==", "AjjjJ");
        hayami.lIllIIlIll[hayami.IlIIlIlIll[32]] = hayami.IlllIIIIIIll("dQ==", "UZJHk");
        hayami.lIllIIlIll[hayami.IlIIlIlIll[11]] = hayami.lIIIlIIIIIll("asuTMmV0s+A=", "aOBcc");
        hayami.lIllIIlIll[hayami.IlIIlIlIll[37]] = hayami.IlllIIIIIIll("anRx", "JTQsM");
        hayami.lIllIIlIll[hayami.IlIIlIlIll[38]] = hayami.llllIIIIIIll("iCdGOvAffhw=", "Eefai");
        hayami.lIllIIlIll[hayami.IlIIlIlIll[12]] = hayami.lIIIlIIIIIll("3bBQJrFbiTo=", "hRAOk");
        hayami.lIllIIlIll[hayami.IlIIlIlIll[39]] = hayami.lIIIlIIIIIll("yVrOn4Embk0=", "jrrKk");
        hayami.lIllIIlIll[hayami.IlIIlIlIll[42]] = hayami.lIIIlIIIIIll("o0tBQweRpq8=", "pCtex");
        hayami.lIllIIlIll[hayami.IlIIlIlIll[43]] = hayami.lIIIlIIIIIll("sJiSGlrPPx8=", "QPzNc");
        hayami.lIllIIlIll[hayami.IlIIlIlIll[44]] = hayami.IlllIIIIIIll("", "hPBnB");
        hayami.lIllIIlIll[hayami.IlIIlIlIll[45]] = hayami.lIIIlIIIIIll("W7BpRo27UOo=", "ptqYm");
        hayami.lIllIIlIll[hayami.IlIIlIlIll[24]] = hayami.lIIIlIIIIIll("dhcdxIpdfeA=", "VAvWL");
        hayami.lIllIIlIll[hayami.IlIIlIlIll[46]] = hayami.llllIIIIIIll("/CQzpvjs3sI=", "dOenm");
        hayami.lIllIIlIll[hayami.IlIIlIlIll[22]] = hayami.IlllIIIIIIll("dg==", "VCSCh");
        hayami.lIllIIlIll[hayami.IlIIlIlIll[47]] = hayami.IlllIIIIIIll("WEtG", "xkfpD");
        hayami.lIllIIlIll[hayami.IlIIlIlIll[48]] = hayami.IlllIIIIIIll("aA==", "HPaMt");
        hayami.lIllIIlIll[hayami.IlIIlIlIll[49]] = hayami.lIIIlIIIIIll("LaOXqQT9TxM=", "GJKXR");
        hayami.lIllIIlIll[hayami.IlIIlIlIll[51]] = hayami.IlllIIIIIIll("bw==", "OBmYS");
        hayami.lIllIIlIll[hayami.IlIIlIlIll[23]] = hayami.IlllIIIIIIll("", "nfBmF");
        hayami.lIllIIlIll[hayami.IlIIlIlIll[54]] = hayami.llllIIIIIIll("2fzXK1KRZf8=", "tJjDS");
        hayami.lIllIIlIll[hayami.IlIIlIlIll[55]] = hayami.lIIIlIIIIIll("1wZeFHsy/rA=", "pjsPS");
        hayami.lIllIIlIll[hayami.IlIIlIlIll[56]] = hayami.IlllIIIIIIll("RQ==", "eruNC");
        hayami.lIllIIlIll[hayami.IlIIlIlIll[59]] = hayami.IlllIIIIIIll("VQ==", "ureBA");
        hayami.lIllIIlIll[hayami.IlIIlIlIll[60]] = hayami.llllIIIIIIll("8Bw/uwcnNbw=", "bEQeA");
        hayami.lIllIIlIll[hayami.IlIIlIlIll[61]] = hayami.IlllIIIIIIll("Tg==", "npFBG");
        hayami.lIllIIlIll[hayami.IlIIlIlIll[62]] = hayami.llllIIIIIIll("Dmy/uqBJs4Y=", "ngmMn");
        hayami.lIllIIlIll[hayami.IlIIlIlIll[8]] = hayami.IlllIIIIIIll("TQ==", "miWzk");
        hayami.lIllIIlIll[hayami.IlIIlIlIll[63]] = hayami.IlllIIIIIIll("", "VKhBk");
        hayami.lIllIIlIll[hayami.IlIIlIlIll[67]] = hayami.lIIIlIIIIIll("LIMfn+LyZmg=", "vRqMV");
        hayami.lIllIIlIll[hayami.IlIIlIlIll[70]] = hayami.llllIIIIIIll("qpQNkUebhmA=", "phfoX");
        hayami.lIllIIlIll[hayami.IlIIlIlIll[73]] = hayami.IlllIIIIIIll("TA==", "lXlmR");
        hayami.lIllIIlIll[hayami.IlIIlIlIll[74]] = hayami.lIIIlIIIIIll("FuY/XMj8tJc=", "VVhba");
        hayami.lIllIIlIll[hayami.IlIIlIlIll[75]] = hayami.IlllIIIIIIll("cG1S", "PMrEJ");
        hayami.lIllIIlIll[hayami.IlIIlIlIll[78]] = hayami.IlllIIIIIIll("ag==", "JQrjA");
        hayami.lIllIIlIll[hayami.IlIIlIlIll[79]] = hayami.llllIIIIIIll("8r3TFJbvzVI=", "PLwsk");
        hayami.lIllIIlIll[hayami.IlIIlIlIll[80]] = hayami.llllIIIIIIll("ap1Clo/7o2E=", "bFwng");
        hayami.lIllIIlIll[hayami.IlIIlIlIll[86]] = hayami.llllIIIIIIll("NWOhKDcmQ58=", "kSIEy");
        hayami.lIllIIlIll[hayami.IlIIlIlIll[33]] = hayami.IlllIIIIIIll("ZElO", "DinVR");
        hayami.lIllIIlIll[hayami.IlIIlIlIll[87]] = hayami.IlllIIIIIIll("YldN", "BwmHu");
        hayami.lIllIIlIll[hayami.IlIIlIlIll[81]] = hayami.lIIIlIIIIIll("icUfDEYHXlU=", "BvNuQ");
        hayami.lIllIIlIll[hayami.IlIIlIlIll[91]] = hayami.llllIIIIIIll("hh2ryAqKNgM=", "ptIeM");
        hayami.lIllIIlIll[hayami.IlIIlIlIll[92]] = hayami.IlllIIIIIIll("UA==", "pjJDs");
        hayami.lIllIIlIll[hayami.IlIIlIlIll[93]] = hayami.lIIIlIIIIIll("x84KtGmM2Vw=", "RXkxJ");
        hayami.lIllIIlIll[hayami.IlIIlIlIll[94]] = hayami.lIIIlIIIIIll("3TjJxNI3mis=", "LWBIT");
        hayami.lIllIIlIll[hayami.IlIIlIlIll[97]] = hayami.IlllIIIIIIll("bA==", "LOOwE");
    }

    /*
     * Unable to fully structure code
     */
    private static String IlllIIIIIIll(String lIIIllIIlIllIll, String IIIIllIIlIllIll) {
        lIIIllIIlIllIll = new String(Base64.getDecoder().decode(lIIIllIIlIllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        llllIlIIlIllIll = new StringBuilder();
        IlllIlIIlIllIll = IIIIllIIlIllIll.toCharArray();
        lIllIlIIlIllIll = hayami.IlIIlIlIll[0];
        llIIIlIIlIllIll = lIIIllIIlIllIll.toCharArray();
        IIlIIlIIlIllIll = llIIIlIIlIllIll.length;
        lIlIIlIIlIllIll = hayami.IlIIlIlIll[0];
        "".length();
        if (-" ".length() < 0) ** GOTO lbl19
        return null;
lbl-1000:
        // 1 sources

        {
            IIllIlIIlIllIll = llIIIlIIlIllIll[lIlIIlIIlIllIll];
            llllIlIIlIllIll.append((char)(IIllIlIIlIllIll ^ IlllIlIIlIllIll[lIllIlIIlIllIll % IlllIlIIlIllIll.length]));
            "".length();
            ++lIllIlIIlIllIll;
            ++lIlIIlIIlIllIll;
lbl19:
            // 2 sources

            ** while (!hayami.lIllIlIIIIll((int)lIlIIlIIlIllIll, (int)IIlIIlIIlIllIll))
        }
lbl20:
        // 1 sources

        return String.valueOf(llllIlIIlIllIll);
    }

    private static String llllIIIIIIll(String IllllIIIlIllIll, String lIlllIIIlIllIll) {
        try {
            SecretKeySpec IIlllIIIlIllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlllIIIlIllIll.getBytes(StandardCharsets.UTF_8)), IlIIlIlIll[14]), "DES");
            Cipher llIllIIIlIllIll = Cipher.getInstance("DES");
            llIllIIIlIllIll.init(IlIIlIlIll[2], IIlllIIIlIllIll);
            return new String(llIllIIIlIllIll.doFinal(Base64.getDecoder().decode(IllllIIIlIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IlIllIIIlIllIll) {
            IlIllIIIlIllIll.printStackTrace();
            return null;
        }
    }

    private static String lIIIlIIIIIll(String lIIIlIIIlIllIll, String IIIIlIIIlIllIll) {
        try {
            SecretKeySpec llllIIIIlIllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IIIIlIIIlIllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher IlllIIIIlIllIll = Cipher.getInstance("Blowfish");
            IlllIIIIlIllIll.init(IlIIlIlIll[2], llllIIIIlIllIll);
            return new String(IlllIIIIlIllIll.doFinal(Base64.getDecoder().decode(lIIIlIIIlIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIllIIIIlIllIll) {
            lIllIIIIlIllIll.printStackTrace();
            return null;
        }
    }

    private static void IIlIIlIIIIll() {
        IlIIlIlIll = new int[101];
        hayami.IlIIlIlIll[0] = ((0x68 ^ 0x63) << "   ".length() ^ (0xD0 ^ 0xA5)) << " ".length() & (((0x12 ^ 0x17) << (" ".length() << (" ".length() << " ".length())) ^ (0xFF ^ 0x82)) << " ".length() ^ -" ".length());
        hayami.IlIIlIlIll[1] = " ".length();
        hayami.IlIIlIlIll[2] = " ".length() << " ".length();
        hayami.IlIIlIlIll[3] = 54 + 123 - 63 + 13;
        hayami.IlIIlIlIll[4] = (0x4A ^ 0x67) << " ".length();
        hayami.IlIIlIlIll[5] = "   ".length();
        hayami.IlIIlIlIll[6] = " ".length() << (" ".length() << " ".length());
        hayami.IlIIlIlIll[7] = 0xA2 ^ 0xA7;
        hayami.IlIIlIlIll[8] = (0x79 ^ 0x6C) << "   ".length() ^ 78 + 56 - 91 + 86;
        hayami.IlIIlIlIll[9] = (0x93 ^ 0xAE ^ (0x84 ^ 0x81) << " ".length()) << " ".length();
        hayami.IlIIlIlIll[10] = "   ".length() << " ".length();
        hayami.IlIIlIlIll[11] = 0xB8 ^ 0xA9;
        hayami.IlIIlIlIll[12] = (0x49 ^ 0x2E ^ (0xD ^ 0x3C) << " ".length()) << (" ".length() << " ".length());
        hayami.IlIIlIlIll[13] = (0x92 ^ 0x89) << " ".length() ^ (0xBA ^ 0x8B);
        hayami.IlIIlIlIll[14] = " ".length() << "   ".length();
        hayami.IlIIlIlIll[15] = 111 + 15 - 115 + 116 ^ (0x96 ^ 0xAD) << " ".length();
        hayami.IlIIlIlIll[16] = 0x86 ^ 0xC7;
        hayami.IlIIlIlIll[17] = (0x3E ^ 0x37) << "   ".length();
        hayami.IlIIlIlIll[18] = ("   ".length() << "   ".length() ^ (0x68 ^ 0x75)) << " ".length();
        hayami.IlIIlIlIll[19] = 0x55 ^ 0x26 ^ (0xA5 ^ 0xAA) << "   ".length();
        hayami.IlIIlIlIll[20] = "   ".length() << (" ".length() << " ".length());
        hayami.IlIIlIlIll[21] = (0xC3 ^ 0x90) << " ".length();
        hayami.IlIIlIlIll[22] = (72 + 13 - 64 + 116 ^ (0x55 ^ 0x12) << " ".length()) << (" ".length() << " ".length());
        hayami.IlIIlIlIll[23] = 0x5B ^ 0x7A;
        hayami.IlIIlIlIll[24] = ((0xA2 ^ 0xB5) << "   ".length() ^ 16 + 128 - 115 + 152) << " ".length();
        hayami.IlIIlIlIll[25] = 0x4E ^ 0x43;
        hayami.IlIIlIlIll[26] = (0xA2 ^ 0x95) << (" ".length() << " ".length());
        hayami.IlIIlIlIll[27] = (0x30 ^ 0x69) + (0xC8 ^ 0xC3) - (0x95 ^ 0xA6) + ((0xA8 ^ 0x9F) << " ".length());
        hayami.IlIIlIlIll[28] = (0xA0 ^ 0xB1) + (4 + 115 - 118 + 136) - (54 + 97 - 118 + 116) + ((0x90 ^ 0xC7) << " ".length());
        hayami.IlIIlIlIll[29] = ((0x5C ^ 0x3B) << " ".length() ^ 115 + 54 - 60 + 36) << " ".length();
        hayami.IlIIlIlIll[30] = (0x3D ^ 0x24 ^ (0x63 ^ 0x6C) << " ".length()) << " ".length();
        hayami.IlIIlIlIll[31] = 0x4A ^ 0x45;
        hayami.IlIIlIlIll[32] = " ".length() << (" ".length() << (" ".length() << " ".length()));
        hayami.IlIIlIlIll[33] = ((0x10 ^ 0x15) << (" ".length() << (" ".length() << " ".length())) ^ (0x1B ^ 0x46)) << (" ".length() << " ".length());
        hayami.IlIIlIlIll[34] = 0 ^ 0x43 ^ (0x91 ^ 0x9C) << " ".length();
        hayami.IlIIlIlIll[35] = 52 + 9 - 1 + 121;
        hayami.IlIIlIlIll[36] = (0xE8 ^ 0xB1) << " ".length();
        hayami.IlIIlIlIll[37] = (0x9F ^ 0x96) << " ".length();
        hayami.IlIIlIlIll[38] = 0x54 ^ 0x47;
        hayami.IlIIlIlIll[39] = 0xBA ^ 0xAF;
        hayami.IlIIlIlIll[40] = (0x1E ^ 0x53) << " ".length();
        hayami.IlIIlIlIll[41] = ((0x44 ^ 0x25) << " ".length()) + ((0xC9 ^ 0x98) << " ".length()) - (147 + 217 - 308 + 179) + ((0x33 ^ 0x16) << " ".length());
        hayami.IlIIlIlIll[42] = (0x4B ^ 0x40) << " ".length();
        hayami.IlIIlIlIll[43] = 6 ^ 0x65 ^ (0xB ^ 0x16) << (" ".length() << " ".length());
        hayami.IlIIlIlIll[44] = "   ".length() << "   ".length();
        hayami.IlIIlIlIll[45] = 0x8F ^ 0x96;
        hayami.IlIIlIlIll[46] = 0x16 ^ 0xD;
        hayami.IlIIlIlIll[47] = 0x5B ^ 0x46;
        hayami.IlIIlIlIll[48] = (0x6C ^ 0x39 ^ (0x3B ^ 0x16) << " ".length()) << " ".length();
        hayami.IlIIlIlIll[49] = 0x6B ^ 0x4A ^ (0x4D ^ 0x52) << " ".length();
        hayami.IlIIlIlIll[50] = -" ".length();
        hayami.IlIIlIlIll[51] = " ".length() << ((0x77 ^ 0x7E) << "   ".length() ^ (9 ^ 0x44));
        hayami.IlIIlIlIll[52] = 91 + 130 - 162 + 140;
        hayami.IlIIlIlIll[53] = (0x5D ^ 0x3C) << " ".length();
        hayami.IlIIlIlIll[54] = (0x83 ^ 0x92) << " ".length();
        hayami.IlIIlIlIll[55] = 0xB4 ^ 0xC1 ^ (0x9D ^ 0xB6) << " ".length();
        hayami.IlIIlIlIll[56] = ((0xB7 ^ 0x86) << " ".length() ^ (0xEA ^ 0x81)) << (" ".length() << " ".length());
        hayami.IlIIlIlIll[57] = (0xCA ^ 0x81 ^ "   ".length() << (" ".length() << " ".length())) << " ".length();
        hayami.IlIIlIlIll[58] = 60 + 57 - 110 + 132;
        hayami.IlIIlIlIll[59] = 0x2C ^ 9;
        hayami.IlIIlIlIll[60] = (121 + 90 - 201 + 149 ^ (0x6B ^ 0x48) << (" ".length() << " ".length())) << " ".length();
        hayami.IlIIlIlIll[61] = (0xDF ^ 0x8E) << " ".length() ^ 5 + 25 - -6 + 97;
        hayami.IlIIlIlIll[62] = (0xF6 ^ 0xAF ^ (2 ^ 0x15) << (" ".length() << " ".length())) << "   ".length();
        hayami.IlIIlIlIll[63] = ((0xAB ^ 0x96) << " ".length() ^ (1 ^ 0x6E)) << " ".length();
        hayami.IlIIlIlIll[64] = ((0x94 ^ 0x85) << "   ".length() ^ 57 + 74 - 105 + 125) << " ".length();
        hayami.IlIIlIlIll[65] = 0xDE ^ 0xA9;
        hayami.IlIIlIlIll[66] = (0x6A ^ 0x49) << (" ".length() << " ".length());
        hayami.IlIIlIlIll[67] = 0xEF ^ 0xC0 ^ " ".length() << (" ".length() << " ".length());
        hayami.IlIIlIlIll[68] = ((0x7C ^ 0x35) << " ".length() ^ 29 + 80 - 55 + 119) << " ".length();
        hayami.IlIIlIlIll[69] = 0xE2 ^ 0x99;
        hayami.IlIIlIlIll[70] = ((0xAB ^ 0xB2) << "   ".length() ^ 122 + 8 - 53 + 118) << (" ".length() << " ".length());
        hayami.IlIIlIlIll[71] = ((0xB ^ 0x6A) << " ".length() ^ 14 + 64 - -78 + 3) << " ".length();
        hayami.IlIIlIlIll[72] = (" ".length() << "   ".length()) + ((0xD7 ^ 0xC6) << (" ".length() << " ".length())) - -(4 ^ 0x49) + ((0xCF ^ 0xC6) << (" ".length() << " ".length()) & ~((0xE ^ 7) << (" ".length() << " ".length())));
        hayami.IlIIlIlIll[73] = 0x76 ^ 0x5B;
        hayami.IlIIlIlIll[74] = ((0xF3 ^ 0xAC) << " ".length() ^ 100 + 65 - 69 + 73) << " ".length();
        hayami.IlIIlIlIll[75] = (0x60 ^ 0x6B) << (" ".length() << (" ".length() << " ".length())) ^ 147 + 30 - 54 + 36;
        hayami.IlIIlIlIll[76] = -(0x4A ^ 0x3B ^ (0x86 ^ 0x97) << (" ".length() << " ".length()));
        hayami.IlIIlIlIll[77] = 0x57 ^ 0x10;
        hayami.IlIIlIlIll[78] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
        hayami.IlIIlIlIll[79] = 0x72 ^ 0x43;
        hayami.IlIIlIlIll[80] = (0x9A ^ 0x83) << " ".length();
        hayami.IlIIlIlIll[81] = (105 + 84 - 139 + 139 ^ (0xFA ^ 0xA9) << " ".length()) << " ".length();
        hayami.IlIIlIlIll[82] = 0xD ^ 0x74;
        hayami.IlIIlIlIll[83] = " ".length() << ("   ".length() << " ".length());
        hayami.IlIIlIlIll[84] = ((0x28 ^ 0x15) << " ".length() ^ (0x59 ^ 0x32)) << (" ".length() << " ".length());
        hayami.IlIIlIlIll[85] = 0x14 ^ 0x45;
        hayami.IlIIlIlIll[86] = (0x7B ^ 0x40) << " ".length() ^ (0x76 ^ 0x33);
        hayami.IlIIlIlIll[87] = 0x15 ^ 0x20;
        hayami.IlIIlIlIll[88] = (0x89 ^ 0x92) << "   ".length() ^ 63 + 129 - 93 + 46;
        hayami.IlIIlIlIll[89] = (0xB9 ^ 0xBE ^ (0x83 ^ 0x94) << " ".length()) << (" ".length() << " ".length());
        hayami.IlIIlIlIll[90] = ((0x14 ^ 9) << " ".length()) + ("   ".length() << (" ".length() << " ".length())) - -(0x9C ^ 0x9A) + (0x47 ^ 0x7A);
        hayami.IlIIlIlIll[91] = 0x7B ^ 0x4C;
        hayami.IlIIlIlIll[92] = (0x93 ^ 0x94) << "   ".length();
        hayami.IlIIlIlIll[93] = 0x82 ^ 0xBB;
        hayami.IlIIlIlIll[94] = (40 + 24 - -5 + 58 ^ (0x3F ^ 0xE) << " ".length()) << " ".length();
        hayami.IlIIlIlIll[95] = (0xD2 ^ 0xBF) << " ".length();
        hayami.IlIIlIlIll[96] = ((0x6D ^ 0x78) << (" ".length() << " ".length())) + (0xC5 ^ 0xB8) - ((4 ^ 1) << (" ".length() << (" ".length() << " ".length()))) + ((0xF0 ^ 0xAF) & ~(0x26 ^ 0x79));
        hayami.IlIIlIlIll[97] = 0x59 ^ 0x62;
        hayami.IlIIlIlIll[98] = (0x58 ^ 0x5D) << "   ".length() ^ (0x40 ^ 9);
        hayami.IlIIlIlIll[99] = -"  ".length();
        hayami.IlIIlIlIll[100] = (0x37 ^ 0x38) << (" ".length() << " ".length());
    }

    private static boolean IIllIlIIIIll(int n, int n2) {
        return n == n2;
    }

    private static boolean lIllIlIIIIll(int n, int n2) {
        return n >= n2;
    }

    private static boolean IlllIlIIIIll(int n, int n2) {
        return n < n2;
    }

    private static boolean lIIlIlIIIIll(int n, int n2) {
        return n <= n2;
    }

    private static boolean IllIIlIIIIll(int n, int n2) {
        return n > n2;
    }

    private static boolean lllIIlIIIIll(Object object) {
        return object != null;
    }

    private static boolean lIlIIlIIIIll(int n) {
        return n != 0;
    }

    private static boolean llllIlIIIIll(int n) {
        return n == 0;
    }

    private static boolean llIlIlIIIIll(int n) {
        return n >= 0;
    }

    private static boolean IIIlIlIIIIll(int n) {
        return n < 0;
    }

    private static boolean IIIIllIIIIll(int n) {
        return n <= 0;
    }

    private static boolean IlIlIlIIIIll(int n) {
        return n > 0;
    }

    private static boolean lIIIllIIIIll(int n, int n2) {
        return n != n2;
    }

    private static int IlIIllIIIIll(long l, long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }
}

