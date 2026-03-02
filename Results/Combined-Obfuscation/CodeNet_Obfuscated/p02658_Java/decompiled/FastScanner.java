/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.NoSuchElementException;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[IIIIIlIIll[IlIlIlIIll[0]]];
    private int ptr = IIIIIlIIll[IlIlIlIIll[1]];
    private int buflen = IIIIIlIIll[IlIlIlIIll[1]];
    private static int[] IIIIIlIIll;
    private static String[] lIlIIlIIll;
    private static int[] IlIlIlIIll;

    FastScanner() {
        FastScanner IlIlIIllllIIlll;
    }

    private boolean hasNextByte() {
        FastScanner IllIIIllllIIlll;
        if (FastScanner.lIlllllIllIl(FastScanner.IllllIlIllIl(IllIIIllllIIlll.ptr, IllIIIllllIIlll.buflen) ? 1 : 0)) {
            return IIIIIlIIll[IlIlIlIIll[2]];
        }
        IllIIIllllIIlll.ptr = IIIIIlIIll[IlIlIlIIll[1]];
        try {
            IllIIIllllIIlll.buflen = IllIIIllllIIlll.in.read(IllIIIllllIIlll.buffer);
            lIlIIlIIll[IlIlIlIIll[0]].length();
            "".length();
        }
        catch (IOException lIlIIIllllIIlll) {
            lIlIIIllllIIlll.printStackTrace();
        }
        if (FastScanner.IllllllIllIl(null)) {
            return ((IlIlIlIIll[3] ^ IlIlIlIIll[4] ^ (IlIlIlIIll[5] ^ IlIlIlIIll[6]) << lIlIIlIIll[IlIlIlIIll[1]].length()) & (IlIlIlIIll[7] ^ IlIlIlIIll[8] ^ lIlIIlIIll[IlIlIlIIll[2]].length() << (IlIlIlIIll[9] ^ IlIlIlIIll[10]) ^ -lIlIIlIIll[IlIlIlIIll[11]].length())) != 0;
        }
        if (FastScanner.lIlllllIllIl(FastScanner.lllllIlIllIl(IllIIIllllIIlll.buflen) ? 1 : 0)) {
            return IIIIIlIIll[IlIlIlIIll[1]];
        }
        return IIIIIlIIll[IlIlIlIIll[2]];
    }

    private int readByte() {
        FastScanner lIIIIIllllIIlll;
        if (FastScanner.lIlllllIllIl(FastScanner.IIIIIllIllIl(lIIIIIllllIIlll.hasNextByte() ? 1 : 0) ? 1 : 0)) {
            int n = lIIIIIllllIIlll.ptr;
            lIIIIIllllIIlll.ptr = n + IIIIIlIIll[IlIlIlIIll[2]];
            return lIIIIIllllIIlll.buffer[n];
        }
        return IIIIIlIIll[IlIlIlIIll[11]];
    }

    private static boolean isPrintableChar(int IlllllIlllIIlll) {
        int n;
        if (FastScanner.lIlllllIllIl(FastScanner.lIIIIllIllIl(IIIIIlIIll[IlIlIlIIll[12]], IlllllIlllIIlll) ? 1 : 0) && FastScanner.lIlllllIllIl(FastScanner.lIIIIllIllIl(IlllllIlllIIlll, IIIIIlIIll[IlIlIlIIll[13]]) ? 1 : 0)) {
            n = IIIIIlIIll[IlIlIlIIll[2]];
            lIlIIlIIll[IlIlIlIIll[12]].length();
            "".length();
            if (FastScanner.lllllllIllIl(lIlIIlIIll[IlIlIlIIll[13]].length())) {
                return (((IlIlIlIIll[14] ^ IlIlIlIIll[15]) << lIlIIlIIll[IlIlIlIIll[16]].length() ^ IlIlIlIIll[17] + IlIlIlIIll[18] - IlIlIlIIll[19] + IlIlIlIIll[20]) & (IlIlIlIIll[21] + IlIlIlIIll[22] - IlIlIlIIll[23] + IlIlIlIIll[24] ^ (IlIlIlIIll[25] ^ IlIlIlIIll[26]) << lIlIIlIIll[IlIlIlIIll[27]].length() ^ -lIlIIlIIll[IlIlIlIIll[28]].length())) != 0;
            }
        } else {
            n = IIIIIlIIll[IlIlIlIIll[1]];
        }
        return n != 0;
    }

    public boolean hasNext() {
        FastScanner llIlllIlllIIlll;
        while (FastScanner.lIlllllIllIl(FastScanner.IIIIIllIllIl(llIlllIlllIIlll.hasNextByte() ? 1 : 0) ? 1 : 0) && FastScanner.lIlllllIllIl(FastScanner.IlIIIllIllIl(FastScanner.isPrintableChar(llIlllIlllIIlll.buffer[llIlllIlllIIlll.ptr]) ? 1 : 0) ? 1 : 0)) {
            llIlllIlllIIlll.ptr += IIIIIlIIll[IlIlIlIIll[2]];
            lIlIIlIIll[IlIlIlIIll[29]].length();
            "".length();
            if (!FastScanner.lIlllllIllIl((IlIlIlIIll[9] ^ IlIlIlIIll[30]) & (IlIlIlIIll[31] ^ IlIlIlIIll[32] ^ IlIlIlIIll[33]))) continue;
            return ((IlIlIlIIll[34] ^ IlIlIlIIll[35]) << lIlIIlIIll[IlIlIlIIll[36]].length() & ((IlIlIlIIll[37] ^ IlIlIlIIll[38]) << lIlIIlIIll[IlIlIlIIll[39]].length() ^ IlIlIlIIll[33])) != 0;
        }
        return this.hasNextByte();
    }

    /*
     * WARNING - void declaration
     */
    public String next() {
        void var1_1;
        FastScanner IllIllIlllIIlll;
        if (FastScanner.lIlllllIllIl(FastScanner.IlIIIllIllIl(IllIllIlllIIlll.hasNext() ? 1 : 0) ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        StringBuilder lIlIllIlllIIlll = new StringBuilder();
        int IIlIllIlllIIlll = IllIllIlllIIlll.readByte();
        while (FastScanner.lIlllllIllIl(FastScanner.IIIIIllIllIl(FastScanner.isPrintableChar(IIlIllIlllIIlll) ? 1 : 0) ? 1 : 0)) {
            lIlIllIlllIIlll.appendCodePoint(IIlIllIlllIIlll);
            lIlIIlIIll[IlIlIlIIll[40]].length();
            IIlIllIlllIIlll = IllIllIlllIIlll.readByte();
            lIlIIlIIll[IlIlIlIIll[41]].length();
            "".length();
            if (!FastScanner.IIIIIIIlllIl(-lIlIIlIIll[IlIlIlIIll[42]].length())) continue;
            return null;
        }
        return String.valueOf(var1_1);
    }

    public long nextLong() {
        FastScanner IIllIlIlllIIlll;
        if (FastScanner.lIlllllIllIl(FastScanner.IlIIIllIllIl(IIllIlIlllIIlll.hasNext() ? 1 : 0) ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        long llIlIlIlllIIlll = 0L;
        int IlIlIlIlllIIlll = IIIIIlIIll[IlIlIlIIll[1]];
        int lIIlIlIlllIIlll = IIllIlIlllIIlll.readByte();
        if (FastScanner.lIlllllIllIl(FastScanner.llIIIllIllIl(lIIlIlIlllIIlll, IIIIIlIIll[IlIlIlIIll[16]]) ? 1 : 0)) {
            IlIlIlIlllIIlll = IIIIIlIIll[IlIlIlIIll[2]];
            lIIlIlIlllIIlll = IIllIlIlllIIlll.readByte();
        }
        if (!FastScanner.lIlllllIllIl(FastScanner.IIlIIllIllIl(lIIlIlIlllIIlll, IIIIIlIIll[IlIlIlIIll[27]]) ? 1 : 0) || FastScanner.lIlllllIllIl(FastScanner.IllllIlIllIl(IIIIIlIIll[IlIlIlIIll[28]], lIIlIlIlllIIlll) ? 1 : 0)) {
            throw new NumberFormatException();
        }
        do {
            if (FastScanner.lIlllllIllIl(FastScanner.lIIIIllIllIl(IIIIIlIIll[IlIlIlIIll[27]], lIIlIlIlllIIlll) ? 1 : 0) && FastScanner.lIlllllIllIl(FastScanner.lIIIIllIllIl(lIIlIlIlllIIlll, IIIIIlIIll[IlIlIlIIll[28]]) ? 1 : 0)) {
                llIlIlIlllIIlll *= 10L;
                llIlIlIlllIIlll += (long)(lIIlIlIlllIIlll - IIIIIlIIll[IlIlIlIIll[27]]);
                lIlIIlIIll[IlIlIlIIll[43]].length();
                "".length();
                if (FastScanner.lIlllllIllIl((IlIlIlIIll[44] ^ IlIlIlIIll[22]) << (lIlIIlIIll[IlIlIlIIll[45]].length() << lIlIIlIIll[IlIlIlIIll[46]].length()) & ((IlIlIlIIll[47] ^ IlIlIlIIll[48]) << (lIlIIlIIll[IlIlIlIIll[49]].length() << lIlIIlIIll[IlIlIlIIll[14]].length()) ^ IlIlIlIIll[33]))) {
                    return 0L;
                }
            } else {
                if (!FastScanner.lIlllllIllIl(FastScanner.lIlIIllIllIl(lIIlIlIlllIIlll, IIIIIlIIll[IlIlIlIIll[11]]) ? 1 : 0) || FastScanner.lIlllllIllIl(FastScanner.IlIIIllIllIl(FastScanner.isPrintableChar(lIIlIlIlllIIlll) ? 1 : 0) ? 1 : 0)) {
                    long l;
                    if (FastScanner.lIlllllIllIl(FastScanner.IIIIIllIllIl(IlIlIlIlllIIlll) ? 1 : 0)) {
                        l = -llIlIlIlllIIlll;
                        lIlIIlIIll[IlIlIlIIll[50]].length();
                        "".length();
                        if (FastScanner.lIIIIIIlllIl(lIlIIlIIll[IlIlIlIIll[51]].length() << (lIlIIlIIll[IlIlIlIIll[52]].length() << lIlIIlIIll[IlIlIlIIll[53]].length()))) {
                            return 0L;
                        }
                    } else {
                        l = llIlIlIlllIIlll;
                    }
                    return l;
                }
                throw new NumberFormatException();
            }
            int n = this.readByte();
            lIlIIlIIll[IlIlIlIIll[54]].length();
            "".length();
        } while (!FastScanner.IlIIIIIlllIl((IlIlIlIIll[22] ^ IlIlIlIIll[27]) & (IlIlIlIIll[55] ^ IlIlIlIIll[56] ^ IlIlIlIIll[33]) & ((IlIlIlIIll[57] ^ IlIlIlIIll[58]) & (IlIlIlIIll[59] ^ IlIlIlIIll[60] ^ IlIlIlIIll[33]) ^ IlIlIlIIll[33]), lIlIIlIIll[IlIlIlIIll[61]].length()));
        return 0L;
    }

    /*
     * WARNING - void declaration
     */
    public int nextInt() {
        void var1_1;
        FastScanner IlIIIlIlllIIlll;
        long lIIIIlIlllIIlll = IlIIIlIlllIIlll.nextLong();
        if (!FastScanner.lIlllllIllIl(FastScanner.lllIIllIllIl(FastScanner.IllIIllIllIl(lIIIIlIlllIIlll, Integer.MIN_VALUE)) ? 1 : 0) || FastScanner.lIlllllIllIl(FastScanner.IIIlIllIllIl(FastScanner.IllIIllIllIl(lIIIIlIlllIIlll, Integer.MAX_VALUE)) ? 1 : 0)) {
            throw new NumberFormatException();
        }
        return (int)var1_1;
    }

    public double nextDouble() {
        FastScanner lIlllIIlllIIlll;
        return Double.parseDouble(lIlllIIlllIIlll.next());
    }

    static {
        FastScanner.IIlllllIllIl();
        FastScanner.llIllllIllIl();
        FastScanner.lIlllIlIllIl();
    }

    private static void lIlllIlIllIl() {
        IIIIIlIIll = new int[IlIlIlIIll[29]];
        FastScanner.IIIIIlIIll[FastScanner.IlIlIlIIll[0]] = lIlIIlIIll[IlIlIlIIll[15]].length() << ((IlIlIlIIll[10] ^ IlIlIlIIll[9]) << lIlIIlIIll[IlIlIlIIll[62]].length());
        FastScanner.IIIIIlIIll[FastScanner.IlIlIlIIll[1]] = (IlIlIlIIll[63] ^ IlIlIlIIll[39] ^ lIlIIlIIll[IlIlIlIIll[64]].length() << (IlIlIlIIll[65] ^ IlIlIlIIll[24])) & ((IlIlIlIIll[34] ^ IlIlIlIIll[20]) << lIlIIlIIll[IlIlIlIIll[66]].length() ^ IlIlIlIIll[67] + IlIlIlIIll[11] - IlIlIlIIll[68] + IlIlIlIIll[69] ^ -lIlIIlIIll[IlIlIlIIll[70]].length());
        FastScanner.IIIIIlIIll[FastScanner.IlIlIlIIll[2]] = lIlIIlIIll[IlIlIlIIll[71]].length();
        FastScanner.IIIIIlIIll[FastScanner.IlIlIlIIll[11]] = -lIlIIlIIll[IlIlIlIIll[72]].length();
        FastScanner.IIIIIlIIll[FastScanner.IlIlIlIIll[12]] = IlIlIlIIll[47] ^ IlIlIlIIll[73];
        FastScanner.IIIIIlIIll[FastScanner.IlIlIlIIll[13]] = ((IlIlIlIIll[67] ^ IlIlIlIIll[21]) << lIlIIlIIll[IlIlIlIIll[74]].length() ^ (IlIlIlIIll[75] ^ IlIlIlIIll[76])) << lIlIIlIIll[IlIlIlIIll[77]].length();
        FastScanner.IIIIIlIIll[FastScanner.IlIlIlIIll[16]] = IlIlIlIIll[78] ^ IlIlIlIIll[79];
        FastScanner.IIIIIlIIll[FastScanner.IlIlIlIIll[27]] = lIlIIlIIll[IlIlIlIIll[80]].length() << (lIlIIlIIll[IlIlIlIIll[59]].length() << (lIlIIlIIll[IlIlIlIIll[81]].length() << lIlIIlIIll[IlIlIlIIll[82]].length()));
        FastScanner.IIIIIlIIll[FastScanner.IlIlIlIIll[28]] = IlIlIlIIll[83] + IlIlIlIIll[16] - IlIlIlIIll[84] + IlIlIlIIll[85] ^ (IlIlIlIIll[86] ^ IlIlIlIIll[87]) << (lIlIIlIIll[IlIlIlIIll[88]].length() << lIlIIlIIll[IlIlIlIIll[89]].length());
    }

    private static boolean llIIIllIllIl(int n, int n2) {
        boolean bl;
        if (FastScanner.IlIIIIIlllIl(n, n2)) {
            bl = IlIlIlIIll[1];
            "".length();
            if (" ".length() << (" ".length() << " ".length()) <= " ".length()) {
                return ((0x7B ^ 0x2E) & ~(0xD3 ^ 0x86)) != 0;
            }
        } else {
            bl = IlIlIlIIll[0];
        }
        return bl;
    }

    private static boolean IIlIIllIllIl(int n, int n2) {
        boolean bl;
        if (FastScanner.llIIIIIlllIl(n, n2)) {
            bl = IlIlIlIIll[1];
            "".length();
            if ("   ".length() == (((0xE8 ^ 0xB7) << " ".length() ^ 142 + 15 - 11 + 9) & ((0x48 ^ 0x47) << "   ".length() ^ (0xDE ^ 0x83) ^ -" ".length()))) {
                return ((8 + 65 - -19 + 65 ^ (0x9E ^ 0x97) << (" ".length() << (" ".length() << " ".length()))) << (" ".length() << " ".length()) & ((113 + 23 - 87 + 78 ^ (0xFF ^ 0xC6) << " ".length()) << (" ".length() << " ".length()) ^ -" ".length())) != 0;
            }
        } else {
            bl = IlIlIlIIll[0];
        }
        return bl;
    }

    private static boolean IllllIlIllIl(int n, int n2) {
        boolean bl;
        if (FastScanner.IIlIIIIlllIl(n, n2)) {
            bl = IlIlIlIIll[1];
            "".length();
            if (-" ".length() > 0) {
                return (((0xE ^ 0x27) << " ".length() ^ (0xFD ^ 0xA6)) << " ".length() & (((0x62 ^ 0x71) << "   ".length() ^ 58 + 1 - -44 + 42) << " ".length() ^ -" ".length())) != 0;
            }
        } else {
            bl = IlIlIlIIll[0];
        }
        return bl;
    }

    private static boolean lIIIIllIllIl(int n, int n2) {
        boolean bl;
        if (FastScanner.lIlIIIIlllIl(n, n2)) {
            bl = IlIlIlIIll[1];
            "".length();
            if (null != null) {
                return ((0x50 ^ 0x61) & ~(2 ^ 0x33)) != 0;
            }
        } else {
            bl = IlIlIlIIll[0];
        }
        return bl;
    }

    private static boolean IIIIIllIllIl(int n) {
        boolean bl;
        if (FastScanner.lIlllllIllIl(n)) {
            bl = IlIlIlIIll[1];
            "".length();
            if (" ".length() << " ".length() <= -" ".length()) {
                return ((6 ^ 0x3F) & ~(0x22 ^ 0x1B)) != 0;
            }
        } else {
            bl = IlIlIlIIll[0];
        }
        return bl;
    }

    private static boolean IlIIIllIllIl(int n) {
        boolean bl;
        if (FastScanner.lIIIIIIlllIl(n)) {
            bl = IlIlIlIIll[1];
            "".length();
            if ("   ".length() < "   ".length()) {
                return (((0xFE ^ 0xC1) << " ".length() ^ (0x60 ^ 0xD)) << " ".length() & (((0x2F ^ 4) << " ".length() ^ (0x2B ^ 0x6E)) << " ".length() ^ -" ".length())) != 0;
            }
        } else {
            bl = IlIlIlIIll[0];
        }
        return bl;
    }

    private static boolean lllIIllIllIl(int n) {
        boolean bl;
        if (FastScanner.IllIIIIlllIl(n)) {
            bl = IlIlIlIIll[1];
            "".length();
            if (((0x3A ^ 0x19 ^ (0x58 ^ 0x4F) << " ".length()) << " ".length() & ((81 + 112 - 171 + 123 ^ (0x14 ^ 0x33) << (" ".length() << " ".length())) << " ".length() ^ -" ".length())) != 0) {
                return ((0xE ^ 0x5F ^ (0xB1 ^ 0x9C) << " ".length()) << "   ".length() & (((0xEA ^ 0xB7) << " ".length() ^ 162 + 126 - 197 + 86) << "   ".length() ^ -" ".length())) != 0;
            }
        } else {
            bl = IlIlIlIIll[0];
        }
        return bl;
    }

    private static boolean lllllIlIllIl(int n) {
        boolean bl;
        if (FastScanner.lllllllIllIl(n)) {
            bl = IlIlIlIIll[1];
            "".length();
            if (" ".length() >= " ".length() << (" ".length() << " ".length())) {
                return (((0x4A ^ 0x57) << (" ".length() << " ".length()) ^ (0xC ^ 0x19)) & (69 + 22 - -120 + 12 ^ (0xDF ^ 0x80) << " ".length() ^ -" ".length())) != 0;
            }
        } else {
            bl = IlIlIlIIll[0];
        }
        return bl;
    }

    private static boolean IIIlIllIllIl(int n) {
        boolean bl;
        if (FastScanner.IIIIIIIlllIl(n)) {
            bl = IlIlIlIIll[1];
            "".length();
            if (null != null) {
                return ((0x51 ^ 0x1E) & ~(0x74 ^ 0x3B)) != 0;
            }
        } else {
            bl = IlIlIlIIll[0];
        }
        return bl;
    }

    private static boolean lIlIIllIllIl(int n, int n2) {
        boolean bl;
        if (FastScanner.lllIIIIlllIl(n, n2)) {
            bl = IlIlIlIIll[1];
            "".length();
            if (null != null) {
                return ((0x93 ^ 0xA8 ^ (0x20 ^ 0x3B) << " ".length()) << (" ".length() << " ".length()) & ((122 + 169 - 238 + 118 ^ (0x33 ^ 0x60) << " ".length()) << (" ".length() << " ".length()) ^ -" ".length())) != 0;
            }
        } else {
            bl = IlIlIlIIll[0];
        }
        return bl;
    }

    private static int IllIIllIllIl(long l, long l2) {
        return FastScanner.IIIlIIIlllIl(l, l2);
    }

    private static void llIllllIllIl() {
        lIlIIlIIll = new String[IlIlIlIIll[90]];
        FastScanner.lIlIIlIIll[FastScanner.IlIlIlIIll[0]] = FastScanner.llllIllIllIl("", "dQUKN");
        FastScanner.lIlIIlIIll[FastScanner.IlIlIlIIll[1]] = FastScanner.IIIIlllIllIl("aHfcYrNyfYA=", "MPutc");
        FastScanner.lIlIIlIIll[FastScanner.IlIlIlIIll[2]] = FastScanner.IIIIlllIllIl("i71E9qaP+/c=", "KnprQ");
        FastScanner.lIlIIlIIll[FastScanner.IlIlIlIIll[11]] = FastScanner.IIIIlllIllIl("OR8l+SPptIg=", "FMAHe");
        FastScanner.lIlIIlIIll[FastScanner.IlIlIlIIll[12]] = FastScanner.IIIIlllIllIl("SCJYX7foK00=", "JbnlE");
        FastScanner.lIlIIlIIll[FastScanner.IlIlIlIIll[13]] = FastScanner.IIIIlllIllIl("5P64h37kjC8=", "BHDmz");
        FastScanner.lIlIIlIIll[FastScanner.IlIlIlIIll[16]] = FastScanner.IIIIlllIllIl("METkU006uAg=", "lToIo");
        FastScanner.lIlIIlIIll[FastScanner.IlIlIlIIll[27]] = FastScanner.IllIlllIllIl("keyBDoR3xXY=", "sowMC");
        FastScanner.lIlIIlIIll[FastScanner.IlIlIlIIll[28]] = FastScanner.IllIlllIllIl("EuL4JrMAcgM=", "rwPRr");
        FastScanner.lIlIIlIIll[FastScanner.IlIlIlIIll[29]] = FastScanner.IllIlllIllIl("sbrXERn8UP8=", "PnmXw");
        FastScanner.lIlIIlIIll[FastScanner.IlIlIlIIll[36]] = FastScanner.IIIIlllIllIl("S+35Yt5WvFs=", "hhKDZ");
        FastScanner.lIlIIlIIll[FastScanner.IlIlIlIIll[39]] = FastScanner.IIIIlllIllIl("B1pLtV7AcxQ=", "tlWMn");
        FastScanner.lIlIIlIIll[FastScanner.IlIlIlIIll[40]] = FastScanner.IllIlllIllIl("E5qsIbkRcJU=", "OAHFe");
        FastScanner.lIlIIlIIll[FastScanner.IlIlIlIIll[41]] = FastScanner.llllIllIllIl("", "JhFmp");
        FastScanner.lIlIIlIIll[FastScanner.IlIlIlIIll[42]] = FastScanner.llllIllIllIl("cg==", "RvFbd");
        FastScanner.lIlIIlIIll[FastScanner.IlIlIlIIll[43]] = FastScanner.IllIlllIllIl("JZg9rIMcOEA=", "NZSfy");
        FastScanner.lIlIIlIIll[FastScanner.IlIlIlIIll[45]] = FastScanner.llllIllIllIl("WA==", "xveit");
        FastScanner.lIlIIlIIll[FastScanner.IlIlIlIIll[46]] = FastScanner.IllIlllIllIl("i5bLu0lS7qY=", "CxDeQ");
        FastScanner.lIlIIlIIll[FastScanner.IlIlIlIIll[49]] = FastScanner.llllIllIllIl("Tw==", "ovgiM");
        FastScanner.lIlIIlIIll[FastScanner.IlIlIlIIll[14]] = FastScanner.IIIIlllIllIl("69dl9Ltk+Uo=", "GkPuP");
        FastScanner.lIlIIlIIll[FastScanner.IlIlIlIIll[50]] = FastScanner.IllIlllIllIl("RrZvA4LQxps=", "WkIgB");
        FastScanner.lIlIIlIIll[FastScanner.IlIlIlIIll[51]] = FastScanner.IIIIlllIllIl("V7JjvMdda88=", "QMyfA");
        FastScanner.lIlIIlIIll[FastScanner.IlIlIlIIll[52]] = FastScanner.IllIlllIllIl("eHZ2BHtmrqI=", "GHtBB");
        FastScanner.lIlIIlIIll[FastScanner.IlIlIlIIll[53]] = FastScanner.IllIlllIllIl("DeTTfDEfDhg=", "qAFtV");
        FastScanner.lIlIIlIIll[FastScanner.IlIlIlIIll[54]] = FastScanner.IllIlllIllIl("lY1EqikZXe8=", "FtUyP");
        FastScanner.lIlIIlIIll[FastScanner.IlIlIlIIll[61]] = FastScanner.llllIllIllIl("Tw==", "oucHy");
        FastScanner.lIlIIlIIll[FastScanner.IlIlIlIIll[15]] = FastScanner.IIIIlllIllIl("fwoc0iFr598=", "MuZgK");
        FastScanner.lIlIIlIIll[FastScanner.IlIlIlIIll[62]] = FastScanner.IIIIlllIllIl("C+Yv2u/0PFQ=", "aubJn");
        FastScanner.lIlIIlIIll[FastScanner.IlIlIlIIll[64]] = FastScanner.IllIlllIllIl("gwI5Yv6nA7Q=", "RsVqc");
        FastScanner.lIlIIlIIll[FastScanner.IlIlIlIIll[66]] = FastScanner.IllIlllIllIl("Pnhp+VovVSE=", "WuvHb");
        FastScanner.lIlIIlIIll[FastScanner.IlIlIlIIll[70]] = FastScanner.llllIllIllIl("QQ==", "aQcmj");
        FastScanner.lIlIIlIIll[FastScanner.IlIlIlIIll[71]] = FastScanner.IIIIlllIllIl("FcJ2CMKN5aw=", "skffl");
        FastScanner.lIlIIlIIll[FastScanner.IlIlIlIIll[72]] = FastScanner.llllIllIllIl("QQ==", "aaKoa");
        FastScanner.lIlIIlIIll[FastScanner.IlIlIlIIll[74]] = FastScanner.llllIllIllIl("bg==", "NHlkA");
        FastScanner.lIlIIlIIll[FastScanner.IlIlIlIIll[77]] = FastScanner.IIIIlllIllIl("KenUh1WDev4=", "gnOKk");
        FastScanner.lIlIIlIIll[FastScanner.IlIlIlIIll[80]] = FastScanner.IllIlllIllIl("mSNrFazXV/A=", "ukiiA");
        FastScanner.lIlIIlIIll[FastScanner.IlIlIlIIll[59]] = FastScanner.IIIIlllIllIl("6D3zBKQvVzU=", "LRIrm");
        FastScanner.lIlIIlIIll[FastScanner.IlIlIlIIll[81]] = FastScanner.IIIIlllIllIl("ntxUgSSuk5U=", "MOVmO");
        FastScanner.lIlIIlIIll[FastScanner.IlIlIlIIll[82]] = FastScanner.IllIlllIllIl("UigkzZeMATU=", "NClrh");
        FastScanner.lIlIIlIIll[FastScanner.IlIlIlIIll[88]] = FastScanner.llllIllIllIl("Wg==", "zysnQ");
        FastScanner.lIlIIlIIll[FastScanner.IlIlIlIIll[89]] = FastScanner.IIIIlllIllIl("naFZx8uxoMs=", "jGjfr");
    }

    private static String IIIIlllIllIl(String IlIlIllIllIIlll, String lIIlIllIllIIlll) {
        try {
            SecretKeySpec IIIlIllIllIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIlIllIllIIlll.getBytes(StandardCharsets.UTF_8)), IlIlIlIIll[28]), "DES");
            Cipher lllIIllIllIIlll = Cipher.getInstance("DES");
            lllIIllIllIIlll.init(IlIlIlIIll[2], IIIlIllIllIIlll);
            return new String(lllIIllIllIIlll.doFinal(Base64.getDecoder().decode(IlIlIllIllIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IllIIllIllIIlll) {
            IllIIllIllIIlll.printStackTrace();
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String llllIllIllIl(String IIIllIlIllIIlll, String lllIlIlIllIIlll) {
        IIIllIlIllIIlll = new String(Base64.getDecoder().decode(IIIllIlIllIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder IllIlIlIllIIlll = new StringBuilder();
        char[] lIlIlIlIllIIlll = lllIlIlIllIIlll.toCharArray();
        int IIlIlIlIllIIlll = IlIlIlIIll[0];
        char[] IlIlIIlIllIIlll = IIIllIlIllIIlll.toCharArray();
        int llIlIIlIllIIlll = IlIlIIlIllIIlll.length;
        int IIllIIlIllIIlll = IlIlIlIIll[0];
        "".length();
        while (!FastScanner.llIIIIIlllIl(IIllIIlIllIIlll, llIlIIlIllIIlll)) {
            char llIIlIlIllIIlll = IlIlIIlIllIIlll[IIllIIlIllIIlll];
            IllIlIlIllIIlll.append((char)(llIIlIlIllIIlll ^ lIlIlIlIllIIlll[IIlIlIlIllIIlll % lIlIlIlIllIIlll.length]));
            "".length();
            ++IIlIlIlIllIIlll;
            ++IIllIIlIllIIlll;
        }
        return String.valueOf(IllIlIlIllIIlll);
    }

    private static String IllIlllIllIl(String lIlIIIlIllIIlll, String IIlIIIlIllIIlll) {
        try {
            SecretKeySpec llIIIIlIllIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IIlIIIlIllIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher IlIIIIlIllIIlll = Cipher.getInstance("Blowfish");
            IlIIIIlIllIIlll.init(IlIlIlIIll[2], llIIIIlIllIIlll);
            return new String(IlIIIIlIllIIlll.doFinal(Base64.getDecoder().decode(lIlIIIlIllIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIIIIlIllIIlll) {
            lIIIIIlIllIIlll.printStackTrace();
            return null;
        }
    }

    private static void IIlllllIllIl() {
        IlIlIlIIll = new int[91];
        FastScanner.IlIlIlIIll[0] = (0x56 ^ 0x7B) & ~(0x37 ^ 0x1A);
        FastScanner.IlIlIlIIll[1] = " ".length();
        FastScanner.IlIlIlIIll[2] = " ".length() << " ".length();
        FastScanner.IlIlIlIIll[3] = (6 ^ 0x25) << " ".length() ^ (0x5A ^ 0x77);
        FastScanner.IlIlIlIIll[4] = (0x13 ^ 0x14) << (" ".length() << (" ".length() << " ".length()));
        FastScanner.IlIlIlIIll[5] = (0x57 ^ 0x14) << " ".length();
        FastScanner.IlIlIlIIll[6] = ((0xAE ^ 0x91) << " ".length()) + ((0x81 ^ 0x84) << (" ".length() << " ".length())) - ((0x43 ^ 0x5C) << (" ".length() << " ".length())) + (120 + 33 - 71 + 45);
        FastScanner.IlIlIlIIll[7] = " ".length() << (0x52 ^ 0x57) ^ (0x57 ^ 0x2A);
        FastScanner.IlIlIlIIll[8] = " ".length() << ("   ".length() << " ".length());
        FastScanner.IlIlIlIIll[9] = (0xEE ^ 0xB3) << " ".length();
        FastScanner.IlIlIlIIll[10] = 112 + 104 - 60 + 35;
        FastScanner.IlIlIlIIll[11] = "   ".length();
        FastScanner.IlIlIlIIll[12] = " ".length() << (" ".length() << " ".length());
        FastScanner.IlIlIlIIll[13] = (0xA8 ^ 0x81) << (" ".length() << " ".length()) ^ 127 + 20 - 108 + 122;
        FastScanner.IlIlIlIIll[14] = 0x37 ^ 0x24;
        FastScanner.IlIlIlIIll[15] = (0xB ^ 6) << " ".length();
        FastScanner.IlIlIlIIll[16] = "   ".length() << " ".length();
        FastScanner.IlIlIlIIll[17] = 0x33 ^ 0xC ^ (0xCD ^ 0xC2) << "   ".length();
        FastScanner.IlIlIlIIll[18] = (0x1E ^ 0x6F ^ (0x57 ^ 0x76) << " ".length()) << " ".length();
        FastScanner.IlIlIlIIll[19] = (0x36 ^ 0xF) + (0xFB ^ 0x8C) - (0x4A ^ 0x7B) + ((0x5E ^ 0x7F) & ~(0x87 ^ 0xA6));
        FastScanner.IlIlIlIIll[20] = (0xEE ^ 0x8D) << " ".length() ^ 133 + 37 - 100 + 81;
        FastScanner.IlIlIlIIll[21] = (0x16 ^ 0x77 ^ (0x86 ^ 0xB3) << " ".length()) << (" ".length() << " ".length());
        FastScanner.IlIlIlIIll[22] = (0x72 ^ 0x51) << " ".length();
        FastScanner.IlIlIlIIll[23] = 0x57 ^ 0x1A;
        FastScanner.IlIlIlIIll[24] = (0x4D ^ 0x54 ^ (0xA ^ 0x1F) << (" ".length() << " ".length())) << " ".length();
        FastScanner.IlIlIlIIll[25] = 122 + 178 - 298 + 211;
        FastScanner.IlIlIlIIll[26] = (0x86 ^ 0xB7) << (" ".length() << " ".length());
        FastScanner.IlIlIlIIll[27] = 0x1F ^ 0x10 ^ " ".length() << "   ".length();
        FastScanner.IlIlIlIIll[28] = " ".length() << "   ".length();
        FastScanner.IlIlIlIIll[29] = 0x5F ^ 0x56;
        FastScanner.IlIlIlIIll[30] = 69 + 129 - 96 + 39;
        FastScanner.IlIlIlIIll[31] = 0x64 ^ 0x11;
        FastScanner.IlIlIlIIll[32] = (" ".length() << (0xC2 ^ 0xC7) ^ " ".length()) << " ".length();
        FastScanner.IlIlIlIIll[33] = -" ".length();
        FastScanner.IlIlIlIIll[34] = (0x5B ^ 0x54) << (" ".length() << " ".length());
        FastScanner.IlIlIlIIll[35] = 0xE7 ^ 0x94 ^ (0xB ^ 0x2E) << " ".length();
        FastScanner.IlIlIlIIll[36] = ((0xFA ^ 0xAD) << " ".length() ^ 31 + 35 - -28 + 77) << " ".length();
        FastScanner.IlIlIlIIll[37] = (0xCF ^ 0x8C ^ (6 ^ 0x1D) << (" ".length() << " ".length())) << (" ".length() << " ".length());
        FastScanner.IlIlIlIIll[38] = 76 + 86 - 127 + 150;
        FastScanner.IlIlIlIIll[39] = (0x1B ^ 0xA) << "   ".length() ^ 30 + 48 - 35 + 88;
        FastScanner.IlIlIlIIll[40] = "   ".length() << (" ".length() << " ".length());
        FastScanner.IlIlIlIIll[41] = 0xB ^ 6;
        FastScanner.IlIlIlIIll[42] = (0x92 ^ 0xBF ^ (0x94 ^ 0x81) << " ".length()) << " ".length();
        FastScanner.IlIlIlIIll[43] = 0x42 ^ 0x4D;
        FastScanner.IlIlIlIIll[44] = (0x74 ^ 0x15) << " ".length() ^ 78 + 67 - 117 + 111;
        FastScanner.IlIlIlIIll[45] = " ".length() << (" ".length() << (" ".length() << " ".length()));
        FastScanner.IlIlIlIIll[46] = 74 + 94 - 156 + 117 ^ (0xD ^ 4) << (" ".length() << (" ".length() << " ".length()));
        FastScanner.IlIlIlIIll[47] = 0x36 ^ 0x4D;
        FastScanner.IlIlIlIIll[48] = (0x5B ^ 0x56 ^ " ".length() << (" ".length() << (" ".length() << " ".length()))) << (" ".length() << " ".length());
        FastScanner.IlIlIlIIll[49] = (0x43 ^ 0x4A) << " ".length();
        FastScanner.IlIlIlIIll[50] = ((0x73 ^ 0x7E) << (" ".length() << " ".length()) ^ (0x51 ^ 0x60)) << (" ".length() << " ".length());
        FastScanner.IlIlIlIIll[51] = 0x2F ^ 0x3A;
        FastScanner.IlIlIlIIll[52] = (63 + 134 - 48 + 10 ^ (0x5F ^ 0x7A) << (" ".length() << " ".length())) << " ".length();
        FastScanner.IlIlIlIIll[53] = 0xB ^ 0x1C;
        FastScanner.IlIlIlIIll[54] = "   ".length() << "   ".length();
        FastScanner.IlIlIlIIll[55] = 0x46 ^ 9 ^ (0x42 ^ 0x4D) << (" ".length() << " ".length());
        FastScanner.IlIlIlIIll[56] = ((0x35 ^ 0x7E) << " ".length() ^ 80 + 30 - 94 + 127) << " ".length();
        FastScanner.IlIlIlIIll[57] = (0xA5 ^ 0xB0) << " ".length();
        FastScanner.IlIlIlIIll[58] = 132 + 14 - 87 + 154 ^ (0x9F ^ 0xC4) << " ".length();
        FastScanner.IlIlIlIIll[59] = (0x32 ^ 0x29 ^ (0x41 ^ 0x48) << " ".length()) << (" ".length() << " ".length());
        FastScanner.IlIlIlIIll[60] = 0xF5 ^ 0x98;
        FastScanner.IlIlIlIIll[61] = 0x1F ^ 6;
        FastScanner.IlIlIlIIll[62] = 3 ^ 0x18;
        FastScanner.IlIlIlIIll[63] = (0x48 ^ 0x57) << (" ".length() << " ".length());
        FastScanner.IlIlIlIIll[64] = (0x36 ^ 0x31) << (" ".length() << " ".length());
        FastScanner.IlIlIlIIll[65] = (0xDC ^ 0x91) + ((0x6A ^ 0x2F) << " ".length()) - ((0x47 ^ 0x5C) << (" ".length() << " ".length())) + ((0xD ^ 0) << (" ".length() << " ".length()));
        FastScanner.IlIlIlIIll[66] = 5 ^ 0x12 ^ (0x17 ^ 0x12) << " ".length();
        FastScanner.IlIlIlIIll[67] = (0xB2 ^ 0xA9) << " ".length() ^ (1 ^ 0xC);
        FastScanner.IlIlIlIIll[68] = -(0x23 ^ 7);
        FastScanner.IlIlIlIIll[69] = 0x54 ^ 0x7F;
        FastScanner.IlIlIlIIll[70] = (0xAE ^ 0xA1) << " ".length();
        FastScanner.IlIlIlIIll[71] = 0xF ^ 0x10;
        FastScanner.IlIlIlIIll[72] = " ".length() << ((0xB ^ 0x5A) << " ".length() ^ 113 + 45 - 71 + 80);
        FastScanner.IlIlIlIIll[73] = ((0x5E ^ 0x6F) << " ".length() ^ (0x73 ^ 0x3C)) << " ".length();
        FastScanner.IlIlIlIIll[74] = 84 + 121 - 89 + 21 ^ (0xB5 ^ 0xA0) << "   ".length();
        FastScanner.IlIlIlIIll[75] = ("   ".length() << (6 ^ 3)) + (39 + 24 - -39 + 77) - (0x57 ^ 0x20) + (0x17 ^ 0x20);
        FastScanner.IlIlIlIIll[76] = (0xA0 ^ 0xC1) << " ".length();
        FastScanner.IlIlIlIIll[77] = (0xF9 ^ 0x98 ^ (0x6F ^ 0x68) << (" ".length() << (" ".length() << " ".length()))) << " ".length();
        FastScanner.IlIlIlIIll[78] = 13 + 43 - 16 + 133;
        FastScanner.IlIlIlIIll[79] = " ".length() << (0xCA ^ 0xAD ^ "   ".length() << (0x32 ^ 0x37));
        FastScanner.IlIlIlIIll[80] = 0x82 ^ 0xA1;
        FastScanner.IlIlIlIIll[81] = 0x14 ^ 0x31;
        FastScanner.IlIlIlIIll[82] = (0x55 ^ 0x46) << " ".length();
        FastScanner.IlIlIlIIll[83] = 1 + 18 - -68 + 48;
        FastScanner.IlIlIlIIll[84] = 0x2A ^ 9 ^ (0x81 ^ 0x8E) << " ".length();
        FastScanner.IlIlIlIIll[85] = (5 ^ 0xA) << "   ".length() ^ (0x76 ^ 0x4B);
        FastScanner.IlIlIlIIll[86] = 136 + 9 - 110 + 118;
        FastScanner.IlIlIlIIll[87] = (0x66 ^ 0x3F) << " ".length();
        FastScanner.IlIlIlIIll[88] = 6 ^ 0x21;
        FastScanner.IlIlIlIIll[89] = (2 ^ 0x63 ^ (0x46 ^ 0x5F) << (" ".length() << " ".length())) << "   ".length();
        FastScanner.IlIlIlIIll[90] = (0x51 ^ 0x40) << (" ".length() << " ".length()) ^ (0x57 ^ 0x3A);
    }

    private static boolean IlIIIIIlllIl(int n, int n2) {
        return n == n2;
    }

    private static boolean llIIIIIlllIl(int n, int n2) {
        return n >= n2;
    }

    private static boolean IIlIIIIlllIl(int n, int n2) {
        return n < n2;
    }

    private static boolean lIlIIIIlllIl(int n, int n2) {
        return n <= n2;
    }

    private static boolean IllllllIllIl(Object object) {
        return object != null;
    }

    private static boolean lIlllllIllIl(int n) {
        return n != 0;
    }

    private static boolean lIIIIIIlllIl(int n) {
        return n == 0;
    }

    private static boolean IllIIIIlllIl(int n) {
        return n >= 0;
    }

    private static boolean lllllllIllIl(int n) {
        return n <= 0;
    }

    private static boolean IIIIIIIlllIl(int n) {
        return n > 0;
    }

    private static boolean lllIIIIlllIl(int n, int n2) {
        return n != n2;
    }

    private static int IIIlIIIlllIl(long l, long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }
}

