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
    private final byte[] buffer = new byte[IllIIlIlIl[IllIllIlIl[0]]];
    private int ptr = IllIIlIlIl[IllIllIlIl[1]];
    private int buflen = IllIIlIlIl[IllIllIlIl[1]];
    private static int[] IllIIlIlIl;
    private static String[] IIIIllIlIl;
    private static int[] IllIllIlIl;

    FastScanner() {
        FastScanner lIIIIIlIlll;
    }

    private boolean hasNextByte() {
        FastScanner lIllllIIlll;
        if (FastScanner.lIIIIlIllIIl(FastScanner.llllIllIlIIl(lIllllIIlll.ptr, lIllllIIlll.buflen) ? 1 : 0)) {
            return IllIIlIlIl[IllIllIlIl[2]];
        }
        lIllllIIlll.ptr = IllIIlIlIl[IllIllIlIl[1]];
        try {
            lIllllIIlll.buflen = lIllllIIlll.in.read(lIllllIIlll.buffer);
            IIIIllIlIl[IllIllIlIl[0]].length();
            "".length();
        }
        catch (IOException IIllllIIlll) {
            IIllllIIlll.printStackTrace();
        }
        if (FastScanner.IlIIIlIllIIl(-(IllIllIlIl[3] ^ IllIllIlIl[4]))) {
            return ((IllIllIlIl[5] ^ IllIllIlIl[6]) << IIIIllIlIl[IllIllIlIl[1]].length() & ((IllIllIlIl[7] ^ IllIllIlIl[8]) << IIIIllIlIl[IllIllIlIl[2]].length() ^ IllIllIlIl[9])) != 0;
        }
        if (FastScanner.lIIIIlIllIIl(FastScanner.lIIIlllIlIIl(lIllllIIlll.buflen) ? 1 : 0)) {
            return IllIIlIlIl[IllIllIlIl[1]];
        }
        return IllIIlIlIl[IllIllIlIl[2]];
    }

    private int readByte() {
        FastScanner IIIlllIIlll;
        if (FastScanner.lIIIIlIllIIl(FastScanner.IlIIlllIlIIl(IIIlllIIlll.hasNextByte() ? 1 : 0) ? 1 : 0)) {
            int n = IIIlllIIlll.ptr;
            IIIlllIIlll.ptr = n + IllIIlIlIl[IllIllIlIl[2]];
            return IIIlllIIlll.buffer[n];
        }
        return IllIIlIlIl[IllIllIlIl[10]];
    }

    private static boolean isPrintableChar(int lIlIllIIlll) {
        int n;
        if (FastScanner.lIIIIlIllIIl(FastScanner.llIIlllIlIIl(IllIIlIlIl[IllIllIlIl[11]], lIlIllIIlll) ? 1 : 0) && FastScanner.lIIIIlIllIIl(FastScanner.llIIlllIlIIl(lIlIllIIlll, IllIIlIlIl[IllIllIlIl[12]]) ? 1 : 0)) {
            n = IllIIlIlIl[IllIllIlIl[2]];
            IIIIllIlIl[IllIllIlIl[10]].length();
            "".length();
            if (FastScanner.lIIIIlIllIIl(((IllIllIlIl[13] ^ IllIllIlIl[14]) << (IIIIllIlIl[IllIllIlIl[11]].length() << IIIIllIlIl[IllIllIlIl[12]].length()) ^ (IllIllIlIl[15] ^ IllIllIlIl[16])) & ((IllIllIlIl[17] ^ IllIllIlIl[5]) << IIIIllIlIl[IllIllIlIl[18]].length() ^ IllIllIlIl[19] + IllIllIlIl[20] - IllIllIlIl[21] + IllIllIlIl[22] ^ -IIIIllIlIl[IllIllIlIl[23]].length()))) {
                return (IIIIllIlIl[IllIllIlIl[24]].length() & (IIIIllIlIl[IllIllIlIl[25]].length() ^ -IIIIllIlIl[IllIllIlIl[26]].length())) != 0;
            }
        } else {
            n = IllIIlIlIl[IllIllIlIl[1]];
        }
        return n != 0;
    }

    public boolean hasNext() {
        FastScanner IlIIllIIlll;
        while (FastScanner.lIIIIlIllIIl(FastScanner.IlIIlllIlIIl(IlIIllIIlll.hasNextByte() ? 1 : 0) ? 1 : 0) && FastScanner.lIIIIlIllIIl(FastScanner.IIlIlllIlIIl(FastScanner.isPrintableChar(IlIIllIIlll.buffer[IlIIllIIlll.ptr]) ? 1 : 0) ? 1 : 0)) {
            IlIIllIIlll.ptr += IllIIlIlIl[IllIllIlIl[2]];
            IIIIllIlIl[IllIllIlIl[27]].length();
            "".length();
            if (!FastScanner.llIIIlIllIIl(IIIIllIlIl[IllIllIlIl[28]].length(), IIIIllIlIl[IllIllIlIl[29]].length() << (IIIIllIlIl[IllIllIlIl[30]].length() << IIIIllIlIl[IllIllIlIl[31]].length()))) continue;
            return ((IllIllIlIl[32] ^ IllIllIlIl[33] ^ (IllIllIlIl[34] ^ IllIllIlIl[35]) << IIIIllIlIl[IllIllIlIl[36]].length()) << (IIIIllIlIl[IllIllIlIl[37]].length() << IIIIllIlIl[IllIllIlIl[38]].length()) & (((IllIllIlIl[39] ^ IllIllIlIl[40]) << IIIIllIlIl[IllIllIlIl[41]].length() ^ (IllIllIlIl[42] ^ IllIllIlIl[43])) << (IIIIllIlIl[IllIllIlIl[44]].length() << IIIIllIlIl[IllIllIlIl[45]].length()) ^ -IIIIllIlIl[IllIllIlIl[46]].length())) != 0;
        }
        return this.hasNextByte();
    }

    /*
     * WARNING - void declaration
     */
    public String next() {
        void var1_1;
        FastScanner lIllIlIIlll;
        if (FastScanner.lIIIIlIllIIl(FastScanner.IIlIlllIlIIl(lIllIlIIlll.hasNext() ? 1 : 0) ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        StringBuilder IIllIlIIlll = new StringBuilder();
        int llIlIlIIlll = lIllIlIIlll.readByte();
        while (FastScanner.lIIIIlIllIIl(FastScanner.IlIIlllIlIIl(FastScanner.isPrintableChar(llIlIlIIlll) ? 1 : 0) ? 1 : 0)) {
            IIllIlIIlll.appendCodePoint(llIlIlIIlll);
            IIIIllIlIl[IllIllIlIl[47]].length();
            llIlIlIIlll = lIllIlIIlll.readByte();
            IIIIllIlIl[IllIllIlIl[48]].length();
            "".length();
            if (!FastScanner.IIlIIlIllIIl(IIIIllIlIl[IllIllIlIl[49]].length() << IIIIllIlIl[IllIllIlIl[50]].length())) continue;
            return null;
        }
        return String.valueOf(var1_1);
    }

    public long nextLong() {
        FastScanner llIIIlIIlll;
        if (FastScanner.lIIIIlIllIIl(FastScanner.IIlIlllIlIIl(llIIIlIIlll.hasNext() ? 1 : 0) ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        long IlIIIlIIlll = 0L;
        int lIIIIlIIlll = IllIIlIlIl[IllIllIlIl[1]];
        int IIIIIlIIlll = llIIIlIIlll.readByte();
        if (FastScanner.lIIIIlIllIIl(FastScanner.lIlIlllIlIIl(IIIIIlIIlll, IllIIlIlIl[IllIllIlIl[18]]) ? 1 : 0)) {
            lIIIIlIIlll = IllIIlIlIl[IllIllIlIl[2]];
            IIIIIlIIlll = llIIIlIIlll.readByte();
        }
        if (!FastScanner.lIIIIlIllIIl(FastScanner.IllIlllIlIIl(IIIIIlIIlll, IllIIlIlIl[IllIllIlIl[23]]) ? 1 : 0) || FastScanner.lIIIIlIllIIl(FastScanner.llllIllIlIIl(IllIIlIlIl[IllIllIlIl[24]], IIIIIlIIlll) ? 1 : 0)) {
            throw new NumberFormatException();
        }
        do {
            if (FastScanner.lIIIIlIllIIl(FastScanner.llIIlllIlIIl(IllIIlIlIl[IllIllIlIl[23]], IIIIIlIIlll) ? 1 : 0) && FastScanner.lIIIIlIllIIl(FastScanner.llIIlllIlIIl(IIIIIlIIlll, IllIIlIlIl[IllIllIlIl[24]]) ? 1 : 0)) {
                IlIIIlIIlll *= 10L;
                IlIIIlIIlll += (long)(IIIIIlIIlll - IllIIlIlIl[IllIllIlIl[23]]);
                IIIIllIlIl[IllIllIlIl[15]].length();
                "".length();
                if (FastScanner.lIlIIlIllIIl((IllIllIlIl[51] + IllIllIlIl[7] - IllIllIlIl[52] + IllIllIlIl[20] ^ (IllIllIlIl[53] ^ IllIllIlIl[37]) << IIIIllIlIl[IllIllIlIl[16]].length()) & (IllIllIlIl[54] ^ IllIllIlIl[55] ^ (IllIllIlIl[56] ^ IllIllIlIl[57]) << IIIIllIlIl[IllIllIlIl[58]].length() ^ -IIIIllIlIl[IllIllIlIl[59]].length()))) {
                    return 0L;
                }
            } else {
                if (!FastScanner.lIIIIlIllIIl(FastScanner.lllIlllIlIIl(IIIIIlIIlll, IllIIlIlIl[IllIllIlIl[10]]) ? 1 : 0) || FastScanner.lIIIIlIllIIl(FastScanner.IIlIlllIlIIl(FastScanner.isPrintableChar(IIIIIlIIlll) ? 1 : 0) ? 1 : 0)) {
                    long l;
                    if (FastScanner.lIIIIlIllIIl(FastScanner.IlIIlllIlIIl(lIIIIlIIlll) ? 1 : 0)) {
                        l = -IlIIIlIIlll;
                        IIIIllIlIl[IllIllIlIl[60]].length();
                        "".length();
                        if (FastScanner.lIlIIlIllIIl(IIIIllIlIl[IllIllIlIl[61]].length() << (IIIIllIlIl[IllIllIlIl[62]].length() << (IIIIllIlIl[IllIllIlIl[63]].length() << IIIIllIlIl[IllIllIlIl[64]].length())) & (IIIIllIlIl[IllIllIlIl[65]].length() << (IIIIllIlIl[IllIllIlIl[66]].length() << (IIIIllIlIl[IllIllIlIl[67]].length() << IIIIllIlIl[IllIllIlIl[68]].length())) ^ IllIllIlIl[9]))) {
                            return 0L;
                        }
                    } else {
                        l = IlIIIlIIlll;
                    }
                    return l;
                }
                throw new NumberFormatException();
            }
            int n = this.readByte();
            IIIIllIlIl[IllIllIlIl[69]].length();
            "".length();
        } while (!FastScanner.lIIIIlIllIIl((IIIIllIlIl[IllIllIlIl[70]].length() << (IllIllIlIl[71] ^ IllIllIlIl[72]) ^ (IllIllIlIl[73] ^ IllIllIlIl[74])) << (IIIIllIlIl[IllIllIlIl[22]].length() << (IIIIllIlIl[IllIllIlIl[4]].length() << IIIIllIlIl[IllIllIlIl[75]].length())) & (((IllIllIlIl[76] ^ IllIllIlIl[77]) << IIIIllIlIl[IllIllIlIl[78]].length() ^ (IllIllIlIl[79] ^ IllIllIlIl[80])) << (IIIIllIlIl[IllIllIlIl[81]].length() << (IIIIllIlIl[IllIllIlIl[3]].length() << IIIIllIlIl[IllIllIlIl[82]].length())) ^ -IIIIllIlIl[IllIllIlIl[83]].length())));
        return 0L;
    }

    /*
     * WARNING - void declaration
     */
    public int nextInt() {
        void var1_1;
        FastScanner lIIllIIIlll;
        long IIIllIIIlll = lIIllIIIlll.nextLong();
        if (!FastScanner.lIIIIlIllIIl(FastScanner.IlIllllIlIIl(FastScanner.lIIllllIlIIl(IIIllIIIlll, Integer.MIN_VALUE)) ? 1 : 0) || FastScanner.lIIIIlIllIIl(FastScanner.llIllllIlIIl(FastScanner.lIIllllIlIIl(IIIllIIIlll, Integer.MAX_VALUE)) ? 1 : 0)) {
            throw new NumberFormatException();
        }
        return (int)var1_1;
    }

    public double nextDouble() {
        FastScanner IIlIlIIIlll;
        return Double.parseDouble(IIlIlIIIlll.next());
    }

    static {
        FastScanner.IIIIIlIllIIl();
        FastScanner.lllllIIllIIl();
        FastScanner.IlllIllIlIIl();
    }

    private static void IlllIllIlIIl() {
        IllIIlIlIl = new int[IllIllIlIl[25]];
        FastScanner.IllIIlIlIl[FastScanner.IllIllIlIl[0]] = IIIIllIlIl[IllIllIlIl[84]].length() << ((IllIllIlIl[22] ^ IllIllIlIl[3]) << IIIIllIlIl[IllIllIlIl[85]].length());
        FastScanner.IllIIlIlIl[FastScanner.IllIllIlIl[1]] = IIIIllIlIl[IllIllIlIl[86]].length() << IIIIllIlIl[IllIllIlIl[87]].length() & (IIIIllIlIl[IllIllIlIl[88]].length() << IIIIllIlIl[IllIllIlIl[89]].length() ^ -IIIIllIlIl[IllIllIlIl[90]].length());
        FastScanner.IllIIlIlIl[FastScanner.IllIllIlIl[2]] = IIIIllIlIl[IllIllIlIl[80]].length();
        FastScanner.IllIIlIlIl[FastScanner.IllIllIlIl[10]] = -IIIIllIlIl[IllIllIlIl[91]].length();
        FastScanner.IllIIlIlIl[FastScanner.IllIllIlIl[11]] = IllIllIlIl[87] ^ IllIllIlIl[44];
        FastScanner.IllIIlIlIl[FastScanner.IllIllIlIl[12]] = (IllIllIlIl[36] ^ IllIllIlIl[3]) << IIIIllIlIl[IllIllIlIl[92]].length();
        FastScanner.IllIIlIlIl[FastScanner.IllIllIlIl[18]] = IllIllIlIl[10] ^ IllIllIlIl[81];
        FastScanner.IllIIlIlIl[FastScanner.IllIllIlIl[23]] = IIIIllIlIl[IllIllIlIl[93]].length() << (IIIIllIlIl[IllIllIlIl[94]].length() << (IIIIllIlIl[IllIllIlIl[95]].length() << IIIIllIlIl[IllIllIlIl[96]].length()));
        FastScanner.IllIIlIlIl[FastScanner.IllIllIlIl[24]] = IllIllIlIl[97] ^ IllIllIlIl[73];
    }

    private static boolean lIlIlllIlIIl(int n, int n2) {
        boolean bl;
        if (FastScanner.IllIIlIllIIl(n, n2)) {
            bl = IllIllIlIl[1];
            "".length();
            if (" ".length() << (" ".length() << " ".length()) != " ".length() << (" ".length() << " ".length())) {
                return ((0xF2 ^ 0xBD) & ~(0x36 ^ 0x79)) != 0;
            }
        } else {
            bl = IllIllIlIl[0];
        }
        return bl;
    }

    private static boolean IllIlllIlIIl(int n, int n2) {
        boolean bl;
        if (FastScanner.lllIIlIllIIl(n, n2)) {
            bl = IllIllIlIl[1];
            "".length();
            if (-((0x4A ^ 0x51) << (" ".length() << " ".length()) ^ (0xB0 ^ 0xBD) << "   ".length()) >= 0) {
                return ((" ".length() << " ".length() ^ (0x8B ^ 0xB0)) & (0xF3 ^ 0xAE ^ (0x69 ^ 0x70) << (" ".length() << " ".length()) ^ -" ".length())) != 0;
            }
        } else {
            bl = IllIllIlIl[0];
        }
        return bl;
    }

    private static boolean llllIllIlIIl(int n, int n2) {
        boolean bl;
        if (FastScanner.IIIlIlIllIIl(n, n2)) {
            bl = IllIllIlIl[1];
            "".length();
            if ("   ".length() <= 0) {
                return ((0x9B ^ 0xB8) << " ".length() & ~((0x81 ^ 0xA2) << " ".length())) != 0;
            }
        } else {
            bl = IllIllIlIl[0];
        }
        return bl;
    }

    private static boolean llIIlllIlIIl(int n, int n2) {
        boolean bl;
        if (FastScanner.lIIlIlIllIIl(n, n2)) {
            bl = IllIllIlIl[1];
            "".length();
            if (-((0x73 ^ 0x30) << " ".length() ^ 58 + 18 - 73 + 128) >= 0) {
                return ((99 + 96 - 112 + 62 ^ (0xAD ^ 0x8C) << (" ".length() << " ".length())) & (66 + 149 - 30 + 24 ^ (3 ^ 0x32) << (" ".length() << " ".length()) ^ -" ".length())) != 0;
            }
        } else {
            bl = IllIllIlIl[0];
        }
        return bl;
    }

    private static boolean IlIIlllIlIIl(int n) {
        boolean bl;
        if (FastScanner.lIIIIlIllIIl(n)) {
            bl = IllIllIlIl[1];
            "".length();
            if (-"  ".length() >= 0) {
                return (((0x71 ^ 0x44) << (" ".length() << " ".length()) ^ 64 + 95 - 110 + 98) & ((0x4A ^ 0x4F) << " ".length() ^ (0x52 ^ 0x1F) ^ -" ".length())) != 0;
            }
        } else {
            bl = IllIllIlIl[0];
        }
        return bl;
    }

    private static boolean IIlIlllIlIIl(int n) {
        boolean bl;
        if (FastScanner.IIlIIlIllIIl(n)) {
            bl = IllIllIlIl[1];
            "".length();
            if (" ".length() << (" ".length() << " ".length()) < " ".length() << " ".length()) {
                return ((0x45 ^ 0x1C) & ~(0xF8 ^ 0xA1)) != 0;
            }
        } else {
            bl = IllIllIlIl[0];
        }
        return bl;
    }

    private static boolean IlIllllIlIIl(int n) {
        boolean bl;
        if (FastScanner.IlIIIlIllIIl(n)) {
            bl = IllIllIlIl[1];
            "".length();
            if ((" ".length() << (" ".length() << " ".length()) & ~(" ".length() << (" ".length() << " ".length())) & ~("   ".length() << " ".length() & ~("   ".length() << " ".length()))) >= "   ".length()) {
                return ((0x7A ^ 0x27) & ~(0x53 ^ 0xE)) != 0;
            }
        } else {
            bl = IllIllIlIl[0];
        }
        return bl;
    }

    private static boolean lIIIlllIlIIl(int n) {
        boolean bl;
        if (FastScanner.IlIlIlIllIIl(n)) {
            bl = IllIllIlIl[1];
            "".length();
            if (-" ".length() > "   ".length()) {
                return (" ".length() & ~" ".length()) != 0;
            }
        } else {
            bl = IllIllIlIl[0];
        }
        return bl;
    }

    private static boolean llIllllIlIIl(int n) {
        boolean bl;
        if (FastScanner.llIlIlIllIIl(n)) {
            bl = IllIllIlIl[1];
            "".length();
            if (" ".length() << " ".length() < 0) {
                return ((0x82 ^ 0x89) & ~(8 ^ 3)) != 0;
            }
        } else {
            bl = IllIllIlIl[0];
        }
        return bl;
    }

    private static boolean lllIlllIlIIl(int n, int n2) {
        boolean bl;
        if (FastScanner.IIllIlIllIIl(n, n2)) {
            bl = IllIllIlIl[1];
            "".length();
            if (" ".length() << (" ".length() << " ".length()) < 0) {
                return ((0x93 ^ 0xB0) << " ".length() & ~((0x83 ^ 0xA0) << " ".length())) != 0;
            }
        } else {
            bl = IllIllIlIl[0];
        }
        return bl;
    }

    private static int lIIllllIlIIl(long l, long l2) {
        return FastScanner.lIllIlIllIIl(l, l2);
    }

    private static void lllllIIllIIl() {
        IIIIllIlIl = new String[IllIllIlIl[98]];
        FastScanner.IIIIllIlIl[FastScanner.IllIllIlIl[0]] = FastScanner.IllIIIIllIIl("VmNR2tofw5c=", "IVhuL");
        FastScanner.IIIIllIlIl[FastScanner.IllIllIlIl[1]] = FastScanner.IIIlIIIllIIl("ttUX0rKMaJU=", "JOEPL");
        FastScanner.IIIIllIlIl[FastScanner.IllIllIlIl[2]] = FastScanner.IllIIIIllIIl("przeflClXhk=", "vIRKT");
        FastScanner.IIIIllIlIl[FastScanner.IllIllIlIl[10]] = FastScanner.IIIlIIIllIIl("8/ZE6L1IETE=", "KecJZ");
        FastScanner.IIIIllIlIl[FastScanner.IllIllIlIl[11]] = FastScanner.IIIlIIIllIIl("kiC7fciHz1g=", "FWjuR");
        FastScanner.IIIIllIlIl[FastScanner.IllIllIlIl[12]] = FastScanner.IIIlIIIllIIl("AsQr/HGxEjc=", "rRRVa");
        FastScanner.IIIIllIlIl[FastScanner.IllIllIlIl[18]] = FastScanner.IIIlIIIllIIl("9OfBfNG3ikI=", "dLSvh");
        FastScanner.IIIIllIlIl[FastScanner.IllIllIlIl[23]] = FastScanner.IIIlIIIllIIl("ZY5QfeYNxZE=", "PYDZD");
        FastScanner.IIIIllIlIl[FastScanner.IllIllIlIl[24]] = FastScanner.IIIlIIIllIIl("KxENGAOGkn8=", "obrLX");
        FastScanner.IIIIllIlIl[FastScanner.IllIllIlIl[25]] = FastScanner.IllIIIIllIIl("20CeoVGqPVE=", "DxkeL");
        FastScanner.IIIIllIlIl[FastScanner.IllIllIlIl[26]] = FastScanner.IIIlIIIllIIl("8q6INlknabo=", "trybS");
        FastScanner.IIIIllIlIl[FastScanner.IllIllIlIl[27]] = FastScanner.IllIIIIllIIl("ypyk1qtOl3g=", "RyJSH");
        FastScanner.IIIIllIlIl[FastScanner.IllIllIlIl[28]] = FastScanner.IIIlIIIllIIl("yDbIeZbLsLg=", "foSfN");
        FastScanner.IIIIllIlIl[FastScanner.IllIllIlIl[29]] = FastScanner.IIIlIIIllIIl("846BLV3jQdM=", "JYbaC");
        FastScanner.IIIIllIlIl[FastScanner.IllIllIlIl[30]] = FastScanner.IIIlIIIllIIl("MTWmuRqbNAw=", "jyCtY");
        FastScanner.IIIIllIlIl[FastScanner.IllIllIlIl[31]] = FastScanner.IIIlIIIllIIl("xaRTxZWS3jU=", "dyNyH");
        FastScanner.IIIIllIlIl[FastScanner.IllIllIlIl[36]] = FastScanner.IllIIIIllIIl("JGcg/BVQTPE=", "FCmXI");
        FastScanner.IIIIllIlIl[FastScanner.IllIllIlIl[37]] = FastScanner.IllIIIIllIIl("f7s/IrQI6u4=", "QfQyv");
        FastScanner.IIIIllIlIl[FastScanner.IllIllIlIl[38]] = FastScanner.IllIIIIllIIl("fzrNj4Ogg/s=", "VVvpv");
        FastScanner.IIIIllIlIl[FastScanner.IllIllIlIl[41]] = FastScanner.IllIIIIllIIl("wobEQj+gNGg=", "OxXKH");
        FastScanner.IIIIllIlIl[FastScanner.IllIllIlIl[44]] = FastScanner.IllIIIIllIIl("mKn35siCelA=", "cVVgq");
        FastScanner.IIIIllIlIl[FastScanner.IllIllIlIl[45]] = FastScanner.IIIlIIIllIIl("NSw46mFIfvI=", "kMYgb");
        FastScanner.IIIIllIlIl[FastScanner.IllIllIlIl[46]] = FastScanner.IllIIIIllIIl("f1QBFIzB4uo=", "DOpSw");
        FastScanner.IIIIllIlIl[FastScanner.IllIllIlIl[47]] = FastScanner.IIlIlIIllIIl("", "kLiMn");
        FastScanner.IIIIllIlIl[FastScanner.IllIllIlIl[48]] = FastScanner.IIIlIIIllIIl("RZc6zhEfrTE=", "Ycttg");
        FastScanner.IIIIllIlIl[FastScanner.IllIllIlIl[49]] = FastScanner.IIIlIIIllIIl("eYzxYTwOLgY=", "Edfbl");
        FastScanner.IIIIllIlIl[FastScanner.IllIllIlIl[50]] = FastScanner.IIIlIIIllIIl("Dz7902kcbVA=", "ZztMa");
        FastScanner.IIIIllIlIl[FastScanner.IllIllIlIl[15]] = FastScanner.IIIlIIIllIIl("5LjaTSj6QJk=", "EWdXW");
        FastScanner.IIIIllIlIl[FastScanner.IllIllIlIl[16]] = FastScanner.IllIIIIllIIl("ZbyO3cMqO6M=", "BWuzS");
        FastScanner.IIIIllIlIl[FastScanner.IllIllIlIl[58]] = FastScanner.IllIIIIllIIl("exQAiMgebW4=", "MMjKD");
        FastScanner.IIIIllIlIl[FastScanner.IllIllIlIl[59]] = FastScanner.IllIIIIllIIl("SjRyGm4pc9A=", "WQdlp");
        FastScanner.IIIIllIlIl[FastScanner.IllIllIlIl[60]] = FastScanner.IIIlIIIllIIl("c8kmcA4e1kw=", "oodDL");
        FastScanner.IIIIllIlIl[FastScanner.IllIllIlIl[61]] = FastScanner.IllIIIIllIIl("DFVgnMkKt7k=", "NuoQp");
        FastScanner.IIIIllIlIl[FastScanner.IllIllIlIl[62]] = FastScanner.IIlIlIIllIIl("WA==", "xQZVu");
        FastScanner.IIIIllIlIl[FastScanner.IllIllIlIl[63]] = FastScanner.IllIIIIllIIl("kG0PBY1UOrQ=", "JCegX");
        FastScanner.IIIIllIlIl[FastScanner.IllIllIlIl[64]] = FastScanner.IllIIIIllIIl("g1ll/cYTFWU=", "ABvjh");
        FastScanner.IIIIllIlIl[FastScanner.IllIllIlIl[65]] = FastScanner.IllIIIIllIIl("TJGfoet7pM4=", "psbek");
        FastScanner.IIIIllIlIl[FastScanner.IllIllIlIl[66]] = FastScanner.IIlIlIIllIIl("ZQ==", "EUBZJ");
        FastScanner.IIIIllIlIl[FastScanner.IllIllIlIl[67]] = FastScanner.IllIIIIllIIl("39VUNJmV+7c=", "nQjOa");
        FastScanner.IIIIllIlIl[FastScanner.IllIllIlIl[68]] = FastScanner.IIIlIIIllIIl("iQCv6SBWn2E=", "ObCax");
        FastScanner.IIIIllIlIl[FastScanner.IllIllIlIl[69]] = FastScanner.IIlIlIIllIIl("", "bJOiT");
        FastScanner.IIIIllIlIl[FastScanner.IllIllIlIl[70]] = FastScanner.IIlIlIIllIIl("cA==", "PPWCu");
        FastScanner.IIIIllIlIl[FastScanner.IllIllIlIl[22]] = FastScanner.IllIIIIllIIl("H0LKWavo5C8=", "AZDDn");
        FastScanner.IIIIllIlIl[FastScanner.IllIllIlIl[4]] = FastScanner.IllIIIIllIIl("ndYMBNThnfM=", "xbgRw");
        FastScanner.IIIIllIlIl[FastScanner.IllIllIlIl[75]] = FastScanner.IIlIlIIllIIl("bw==", "OxOsB");
        FastScanner.IIIIllIlIl[FastScanner.IllIllIlIl[78]] = FastScanner.IIlIlIIllIIl("RA==", "drVOE");
        FastScanner.IIIIllIlIl[FastScanner.IllIllIlIl[81]] = FastScanner.IIlIlIIllIIl("eQ==", "YMXLg");
        FastScanner.IIIIllIlIl[FastScanner.IllIllIlIl[3]] = FastScanner.IIIlIIIllIIl("MYdFpfXM+a0=", "LqkFs");
        FastScanner.IIIIllIlIl[FastScanner.IllIllIlIl[82]] = FastScanner.IllIIIIllIIl("ZD/xxRL0gew=", "TtfEM");
        FastScanner.IIIIllIlIl[FastScanner.IllIllIlIl[83]] = FastScanner.IIlIlIIllIIl("Qw==", "ckplV");
        FastScanner.IIIIllIlIl[FastScanner.IllIllIlIl[84]] = FastScanner.IIIlIIIllIIl("UJHVByvP/Nw=", "trzAo");
        FastScanner.IIIIllIlIl[FastScanner.IllIllIlIl[85]] = FastScanner.IIIlIIIllIIl("HOgdwQ3vrvE=", "MchBA");
        FastScanner.IIIIllIlIl[FastScanner.IllIllIlIl[86]] = FastScanner.IIlIlIIllIIl("bw==", "OCTOB");
        FastScanner.IIIIllIlIl[FastScanner.IllIllIlIl[87]] = FastScanner.IIlIlIIllIIl("YQ==", "AThfe");
        FastScanner.IIIIllIlIl[FastScanner.IllIllIlIl[88]] = FastScanner.IIlIlIIllIIl("ag==", "JpFsU");
        FastScanner.IIIIllIlIl[FastScanner.IllIllIlIl[89]] = FastScanner.IIIlIIIllIIl("5ojUcBLmkjs=", "QUMFN");
        FastScanner.IIIIllIlIl[FastScanner.IllIllIlIl[90]] = FastScanner.IIlIlIIllIIl("Sg==", "jzkNB");
        FastScanner.IIIIllIlIl[FastScanner.IllIllIlIl[80]] = FastScanner.IllIIIIllIIl("7+J/RVSWPPg=", "yNXvo");
        FastScanner.IIIIllIlIl[FastScanner.IllIllIlIl[91]] = FastScanner.IIIlIIIllIIl("d4dZUdqp/cw=", "WjrQO");
        FastScanner.IIIIllIlIl[FastScanner.IllIllIlIl[92]] = FastScanner.IllIIIIllIIl("MM6W7ukGIgw=", "KYsnY");
        FastScanner.IIIIllIlIl[FastScanner.IllIllIlIl[93]] = FastScanner.IIlIlIIllIIl("WWNy", "yCRya");
        FastScanner.IIIIllIlIl[FastScanner.IllIllIlIl[94]] = FastScanner.IIIlIIIllIIl("WVUT8RwPwwY=", "XqmnC");
        FastScanner.IIIIllIlIl[FastScanner.IllIllIlIl[95]] = FastScanner.IIlIlIIllIIl("aA==", "HaYuh");
        FastScanner.IIIIllIlIl[FastScanner.IllIllIlIl[96]] = FastScanner.IIlIlIIllIIl("Rg==", "figGD");
    }

    private static String IIIlIIIllIIl(String lIIIIlllIll, String IIIIIlllIll) {
        try {
            SecretKeySpec lllllIllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IIIIIlllIll.getBytes(StandardCharsets.UTF_8)), IllIllIlIl[24]), "DES");
            Cipher IllllIllIll = Cipher.getInstance("DES");
            IllllIllIll.init(IllIllIlIl[2], lllllIllIll);
            return new String(IllllIllIll.doFinal(Base64.getDecoder().decode(lIIIIlllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlllIllIll) {
            lIlllIllIll.printStackTrace();
            return null;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static String IIlIlIIllIIl(String llllIIllIll, String IlllIIllIll) {
        llllIIllIll = new String(Base64.getDecoder().decode(llllIIllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        lIllIIllIll = new StringBuilder();
        IIllIIllIll = IlllIIllIll.toCharArray();
        llIlIIllIll = FastScanner.IllIllIlIl[0];
        lIIIIIllIll = llllIIllIll.toCharArray();
        IlIIIIllIll = lIIIIIllIll.length;
        llIIIIllIll = FastScanner.IllIllIlIl[0];
        "".length();
        if (" ".length() << (" ".length() << " ".length()) >= 0) ** GOTO lbl19
        return null;
lbl-1000:
        // 1 sources

        {
            IlIlIIllIll = lIIIIIllIll[llIIIIllIll];
            lIllIIllIll.append((char)(IlIlIIllIll ^ IIllIIllIll[llIlIIllIll % IIllIIllIll.length]));
            "".length();
            ++llIlIIllIll;
            ++llIIIIllIll;
lbl19:
            // 2 sources

            ** while (!FastScanner.lllIIlIllIIl((int)llIIIIllIll, (int)IlIIIIllIll))
        }
lbl20:
        // 1 sources

        return String.valueOf(lIllIIllIll);
    }

    private static String IllIIIIllIIl(String IIllllIlIll, String llIlllIlIll) {
        try {
            SecretKeySpec IlIlllIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIlllIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIlllIlIll = Cipher.getInstance("Blowfish");
            lIIlllIlIll.init(IllIllIlIl[2], IlIlllIlIll);
            return new String(lIIlllIlIll.doFinal(Base64.getDecoder().decode(IIllllIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIIlllIlIll) {
            IIIlllIlIll.printStackTrace();
            return null;
        }
    }

    private static void IIIIIlIllIIl() {
        IllIllIlIl = new int[99];
        FastScanner.IllIllIlIl[0] = (0x73 ^ 0x7C ^ "   ".length() << " ".length()) & (0x7B ^ 0x3A ^ (0x12 ^ 0x1B) << "   ".length() ^ -" ".length()) & (((0x54 ^ 0x5F) << "   ".length() ^ (0xDE ^ 0x81)) << (" ".length() << " ".length()) & (("   ".length() << ("   ".length() << " ".length()) ^ 32 + 162 - 128 + 133) << (" ".length() << " ".length()) ^ -" ".length()) ^ -" ".length());
        FastScanner.IllIllIlIl[1] = " ".length();
        FastScanner.IllIllIlIl[2] = " ".length() << " ".length();
        FastScanner.IllIllIlIl[3] = 0xA ^ 0x47 ^ (0x7B ^ 0x4A) << " ".length();
        FastScanner.IllIllIlIl[4] = 0x2F ^ 4;
        FastScanner.IllIllIlIl[5] = (0x8C ^ 0xAF) << " ".length();
        FastScanner.IllIllIlIl[6] = 0xC ^ 0x6F;
        FastScanner.IllIllIlIl[7] = "   ".length() << (0xC5 ^ 0xC0);
        FastScanner.IllIllIlIl[8] = 0x39 ^ 0x7C;
        FastScanner.IllIllIlIl[9] = -" ".length();
        FastScanner.IllIllIlIl[10] = "   ".length();
        FastScanner.IllIllIlIl[11] = " ".length() << (" ".length() << " ".length());
        FastScanner.IllIllIlIl[12] = 0xE2 ^ 0x9F ^ (0xB0 ^ 0xBF) << "   ".length();
        FastScanner.IllIllIlIl[13] = ((0x2D ^ 0x2A) << (" ".length() << (" ".length() << " ".length()))) + ((0xA7 ^ 0x96) << " ".length()) - (0x76 ^ 3) + ("   ".length() << (" ".length() << (" ".length() << " ".length())));
        FastScanner.IllIllIlIl[14] = (0x2F ^ 0x6A) << " ".length();
        FastScanner.IllIllIlIl[15] = 43 + 140 - 158 + 118 ^ (0x43 ^ 0x66) << (" ".length() << " ".length());
        FastScanner.IllIllIlIl[16] = ((0x46 ^ 0x79) << " ".length() ^ (0x35 ^ 0x4C)) << (" ".length() << " ".length());
        FastScanner.IllIllIlIl[17] = 0x3E ^ 0x63;
        FastScanner.IllIllIlIl[18] = "   ".length() << " ".length();
        FastScanner.IllIllIlIl[19] = (0xA0 ^ 0xB5) << "   ".length();
        FastScanner.IllIllIlIl[20] = ((0x1F ^ 0x64) << " ".length() ^ 96 + 71 - 112 + 122) << " ".length();
        FastScanner.IllIllIlIl[21] = 136 + 18 - 113 + 116;
        FastScanner.IllIllIlIl[22] = (0x7B ^ 0x6E) << " ".length();
        FastScanner.IllIllIlIl[23] = 101 + 25 - 1 + 22 ^ (0x1F ^ 0x3A) << (" ".length() << " ".length());
        FastScanner.IllIllIlIl[24] = " ".length() << "   ".length();
        FastScanner.IllIllIlIl[25] = 0x4B ^ 0x4E ^ "   ".length() << (" ".length() << " ".length());
        FastScanner.IllIllIlIl[26] = (0x81 ^ 0x86 ^ " ".length() << " ".length()) << " ".length();
        FastScanner.IllIllIlIl[27] = 0x56 ^ 0x5D;
        FastScanner.IllIllIlIl[28] = "   ".length() << (" ".length() << " ".length());
        FastScanner.IllIllIlIl[29] = 0x58 ^ 0x55;
        FastScanner.IllIllIlIl[30] = ((0xAF ^ 0xA6) << (" ".length() << " ".length()) ^ (0x2C ^ 0xF)) << " ".length();
        FastScanner.IllIllIlIl[31] = (9 ^ 0x1C) << " ".length() ^ (0x21 ^ 4);
        FastScanner.IllIllIlIl[32] = ((0x13 ^ 0x14) << (0x46 ^ 0x43) ^ 154 + 152 - 125 + 14) << (" ".length() << " ".length());
        FastScanner.IllIllIlIl[33] = (" ".length() << (" ".length() << (" ".length() << " ".length()))) + (79 + 34 - -32 + 26) - ((4 ^ 0x2D) << (" ".length() << " ".length())) + ((0x16 ^ 0x1D) << (" ".length() << (" ".length() << " ".length())));
        FastScanner.IllIllIlIl[34] = ((0x71 ^ 0x66) << " ".length() ^ " ".length()) << (" ".length() << " ".length());
        FastScanner.IllIllIlIl[35] = 128 + 62 - 139 + 92 + (0x42 ^ 0x37) - (194 + 58 - 164 + 109) + ((0x73 ^ 0x5A) << " ".length());
        FastScanner.IllIllIlIl[36] = " ".length() << (" ".length() << (" ".length() << " ".length()));
        FastScanner.IllIllIlIl[37] = 0x46 ^ 0x57;
        FastScanner.IllIllIlIl[38] = (0x15 ^ 0x1C) << " ".length();
        FastScanner.IllIllIlIl[39] = " ".length() << (0x56 ^ 0x51);
        FastScanner.IllIllIlIl[40] = (0x14 ^ 0x25) + (" ".length() << "   ".length()) - -(0xC4 ^ 0x80) + ((0x2A ^ 0x25) << (" ".length() << " ".length()));
        FastScanner.IllIllIlIl[41] = 0x42 ^ 0x51;
        FastScanner.IllIllIlIl[42] = (0xEA ^ 0x89) << " ".length();
        FastScanner.IllIllIlIl[43] = ((0xB1 ^ 0xBC) << " ".length()) + ((0x5C ^ 0x55) << "   ".length()) - -(0x6A ^ 0x40) + (0x7A ^ 0x63);
        FastScanner.IllIllIlIl[44] = (0x44 ^ 0x41) << (" ".length() << " ".length());
        FastScanner.IllIllIlIl[45] = 0x54 ^ 0x41;
        FastScanner.IllIllIlIl[46] = ((7 ^ 0x5C) << " ".length() ^ 75 + 186 - 219 + 147) << " ".length();
        FastScanner.IllIllIlIl[47] = 115 + 127 - 146 + 47 ^ (0x68 ^ 0x7B) << "   ".length();
        FastScanner.IllIllIlIl[48] = "   ".length() << "   ".length();
        FastScanner.IllIllIlIl[49] = 0xB3 ^ 0xAA;
        FastScanner.IllIllIlIl[50] = (0x1C ^ 0x11) << " ".length();
        FastScanner.IllIllIlIl[51] = (0x1C ^ 0xB) << (" ".length() << " ".length());
        FastScanner.IllIllIlIl[52] = ("   ".length() << " ".length()) + (0xF1 ^ 0x8C) - (0x6C ^ 0x37) + (3 ^ 0x78);
        FastScanner.IllIllIlIl[53] = (0x26 ^ 0x2D) << "   ".length();
        FastScanner.IllIllIlIl[54] = (0x16 ^ 0x39 ^ (0x8E ^ 0xAD) << " ".length()) << " ".length();
        FastScanner.IllIllIlIl[55] = ((0x25 ^ 0x20) << "   ".length()) + (0x56 ^ 0x49) - -(0x90 ^ 0xC6) + (" ".length() << " ".length());
        FastScanner.IllIllIlIl[56] = (" ".length() << (" ".length() << (" ".length() << " ".length())) ^ (0x9C ^ 0xA7)) << " ".length();
        FastScanner.IllIllIlIl[57] = 0x30 ^ 0x2F ^ (0x41 ^ 0x62) << " ".length();
        FastScanner.IllIllIlIl[58] = 101 + 42 - 67 + 57 ^ (0x6E ^ 0x7D) << "   ".length();
        FastScanner.IllIllIlIl[59] = ("   ".length() << " ".length() ^ (0x99 ^ 0x90)) << " ".length();
        FastScanner.IllIllIlIl[60] = (0x86 ^ 0x8F) << (" ".length() << (" ".length() << " ".length())) ^ 130 + 77 - 109 + 45;
        FastScanner.IllIllIlIl[61] = " ".length() << (0x77 ^ 0x60 ^ (0xA9 ^ 0xA0) << " ".length());
        FastScanner.IllIllIlIl[62] = 0xA0 ^ 0x81;
        FastScanner.IllIllIlIl[63] = (0x85 ^ 0x94) << " ".length();
        FastScanner.IllIllIlIl[64] = 0xA5 ^ 0x86;
        FastScanner.IllIllIlIl[65] = (0x26 ^ 0x41 ^ (0xBD ^ 0x8A) << " ".length()) << (" ".length() << " ".length());
        FastScanner.IllIllIlIl[66] = 0x60 ^ 0x45;
        FastScanner.IllIllIlIl[67] = (0x62 ^ 0x71) << " ".length();
        FastScanner.IllIllIlIl[68] = (0x25 ^ 0x7E) << " ".length() ^ 100 + 109 - 101 + 37;
        FastScanner.IllIllIlIl[69] = (0x4B ^ 0x4E) << "   ".length();
        FastScanner.IllIllIlIl[70] = 5 ^ 0x46 ^ (0x35 ^ 0) << " ".length();
        FastScanner.IllIllIlIl[71] = 0xC5 ^ 0xA2;
        FastScanner.IllIllIlIl[72] = (0x74 ^ 0x45) << " ".length();
        FastScanner.IllIllIlIl[73] = (" ".length() << (0x54 ^ 0x53)) + ((0xB9 ^ 0x94) << " ".length() & ~((0x43 ^ 0x6E) << " ".length())) - ((0xCC ^ 0xC1) << (" ".length() << " ".length())) + (0xDE ^ 0x9D);
        FastScanner.IllIllIlIl[74] = (0x57 ^ 2) << " ".length();
        FastScanner.IllIllIlIl[75] = (6 ^ 0xD) << (" ".length() << " ".length());
        FastScanner.IllIllIlIl[76] = (0x7A ^ 0x4D) + ((0x82 ^ 0xA1) << (" ".length() << " ".length())) - ((0xA8 ^ 0x81) << " ".length()) + ((6 ^ 0x23) << " ".length());
        FastScanner.IllIllIlIl[77] = (0x56 ^ 0x45) << "   ".length();
        FastScanner.IllIllIlIl[78] = 0x47 ^ 0x6A;
        FastScanner.IllIllIlIl[79] = (0x35 ^ 0 ^ " ".length() << "   ".length()) << " ".length();
        FastScanner.IllIllIlIl[80] = 116 + 85 - 134 + 184 ^ (0x39 ^ 0x58) << " ".length();
        FastScanner.IllIllIlIl[81] = ((0x70 ^ 0x69) << (" ".length() << " ".length()) ^ (0x42 ^ 0x31)) << " ".length();
        FastScanner.IllIllIlIl[82] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
        FastScanner.IllIllIlIl[83] = 0x7D ^ 0x4C;
        FastScanner.IllIllIlIl[84] = (0x61 ^ 0x78) << " ".length();
        FastScanner.IllIllIlIl[85] = 0x4F ^ 0x7C;
        FastScanner.IllIllIlIl[86] = (4 ^ 9) << (" ".length() << " ".length());
        FastScanner.IllIllIlIl[87] = 0x6A ^ 0xB ^ (0x93 ^ 0x86) << (" ".length() << " ".length());
        FastScanner.IllIllIlIl[88] = (0xD8 ^ 0xC3) << " ".length();
        FastScanner.IllIllIlIl[89] = 0xA5 ^ 0x92;
        FastScanner.IllIllIlIl[90] = (0xE8 ^ 0xB3 ^ (0xAF ^ 0xB8) << (" ".length() << " ".length())) << "   ".length();
        FastScanner.IllIllIlIl[91] = ((0x76 ^ 0x71) << "   ".length() ^ (0x4E ^ 0x6B)) << " ".length();
        FastScanner.IllIllIlIl[92] = 0x42 ^ 0x79;
        FastScanner.IllIllIlIl[93] = (0x86 ^ 0x89) << (" ".length() << " ".length());
        FastScanner.IllIllIlIl[94] = 125 + 28 - 92 + 66 ^ (0x27 ^ 6) << " ".length();
        FastScanner.IllIllIlIl[95] = (0xCC ^ 0x9B ^ (0x5C ^ 0x55) << "   ".length()) << " ".length();
        FastScanner.IllIllIlIl[96] = 0x8C ^ 0xB3;
        FastScanner.IllIllIlIl[97] = (0x5E ^ 5) << " ".length();
        FastScanner.IllIllIlIl[98] = " ".length() << ("   ".length() << " ".length());
    }

    private static boolean IllIIlIllIIl(int n, int n2) {
        return n == n2;
    }

    private static boolean lllIIlIllIIl(int n, int n2) {
        return n >= n2;
    }

    private static boolean IIIlIlIllIIl(int n, int n2) {
        return n < n2;
    }

    private static boolean lIIlIlIllIIl(int n, int n2) {
        return n <= n2;
    }

    private static boolean llIIIlIllIIl(int n, int n2) {
        return n > n2;
    }

    private static boolean lIIIIlIllIIl(int n) {
        return n != 0;
    }

    private static boolean IIlIIlIllIIl(int n) {
        return n == 0;
    }

    private static boolean IlIIIlIllIIl(int n) {
        return n >= 0;
    }

    private static boolean lIlIIlIllIIl(int n) {
        return n < 0;
    }

    private static boolean IlIlIlIllIIl(int n) {
        return n <= 0;
    }

    private static boolean llIlIlIllIIl(int n) {
        return n > 0;
    }

    private static boolean IIllIlIllIIl(int n, int n2) {
        return n != n2;
    }

    private static int lIllIlIllIIl(long l, long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }
}

