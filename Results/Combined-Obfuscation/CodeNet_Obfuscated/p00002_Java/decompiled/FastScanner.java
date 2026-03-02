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
    private final byte[] buffer = new byte[llIIIllIll[lllIIllIll[0]]];
    private int ptr = llIIIllIll[lllIIllIll[1]];
    private int buflen = llIIIllIll[lllIIllIll[1]];
    private static int[] llIIIllIll;
    private static String[] IIlIIllIll;
    private static int[] lllIIllIll;

    FastScanner() {
        FastScanner lllIllIIIlIlIll;
    }

    private boolean hasNextByte() {
        FastScanner llIIllIIIlIlIll;
        if (FastScanner.lIlIIIIlIIll(FastScanner.IIllIllIIIll(llIIllIIIlIlIll.ptr, llIIllIIIlIlIll.buflen) ? 1 : 0)) {
            return llIIIllIll[lllIIllIll[2]];
        }
        llIIllIIIlIlIll.ptr = llIIIllIll[lllIIllIll[1]];
        try {
            llIIllIIIlIlIll.buflen = llIIllIIIlIlIll.in.read(llIIllIIIlIlIll.buffer);
            IIlIIllIll[lllIIllIll[0]].length();
            "".length();
        }
        catch (IOException IlIIllIIIlIlIll) {
            IlIIllIIIlIlIll.printStackTrace();
        }
        if (FastScanner.IllIIIIlIIll(IIlIIllIll[lllIIllIll[1]].length() << IIlIIllIll[lllIIllIll[2]].length(), IIlIIllIll[lllIIllIll[3]].length() << IIlIIllIll[lllIIllIll[4]].length())) {
            return ((IIlIIllIll[lllIIllIll[5]].length() ^ IIlIIllIll[lllIIllIll[6]].length() << (IIlIIllIll[lllIIllIll[7]].length() << (IIlIIllIll[lllIIllIll[8]].length() << IIlIIllIll[lllIIllIll[9]].length()))) << (IIlIIllIll[lllIIllIll[10]].length() << IIlIIllIll[lllIIllIll[11]].length()) & (((lllIIllIll[12] ^ lllIIllIll[13]) << IIlIIllIll[lllIIllIll[14]].length() ^ lllIIllIll[2] + lllIIllIll[15] - lllIIllIll[6] + lllIIllIll[16]) << (IIlIIllIll[lllIIllIll[17]].length() << IIlIIllIll[lllIIllIll[18]].length()) ^ -IIlIIllIll[lllIIllIll[19]].length())) != 0;
        }
        if (FastScanner.lIlIIIIlIIll(FastScanner.lIllIllIIIll(llIIllIIIlIlIll.buflen) ? 1 : 0)) {
            return llIIIllIll[lllIIllIll[1]];
        }
        return llIIIllIll[lllIIllIll[2]];
    }

    private int readByte() {
        FastScanner IlllIlIIIlIlIll;
        if (FastScanner.lIlIIIIlIIll(FastScanner.IlllIllIIIll(IlllIlIIIlIlIll.hasNextByte() ? 1 : 0) ? 1 : 0)) {
            int n = IlllIlIIIlIlIll.ptr;
            IlllIlIIIlIlIll.ptr = n + llIIIllIll[lllIIllIll[2]];
            return IlllIlIIIlIlIll.buffer[n];
        }
        return llIIIllIll[lllIIllIll[3]];
    }

    private boolean isPrintableChar(int llIlIlIIIlIlIll) {
        int n;
        if (FastScanner.lIlIIIIlIIll(FastScanner.llllIllIIIll(llIIIllIll[lllIIllIll[4]], llIlIlIIIlIlIll) ? 1 : 0) && FastScanner.lIlIIIIlIIll(FastScanner.llllIllIIIll(llIlIlIIIlIlIll, llIIIllIll[lllIIllIll[5]]) ? 1 : 0)) {
            n = llIIIllIll[lllIIllIll[2]];
            IIlIIllIll[lllIIllIll[20]].length();
            "".length();
            if (FastScanner.lllIIIIlIIll(null)) {
                return ((lllIIllIll[21] ^ lllIIllIll[22]) & (lllIIllIll[23] ^ lllIIllIll[19] ^ lllIIllIll[24])) != 0;
            }
        } else {
            n = llIIIllIll[lllIIllIll[1]];
        }
        return n != 0;
    }

    public boolean hasNext() {
        FastScanner IIIlIlIIIlIlIll;
        while (FastScanner.lIlIIIIlIIll(FastScanner.IlllIllIIIll(IIIlIlIIIlIlIll.hasNextByte() ? 1 : 0) ? 1 : 0) && FastScanner.lIlIIIIlIIll(FastScanner.IIIIlllIIIll(IIIlIlIIIlIlIll.isPrintableChar(IIIlIlIIIlIlIll.buffer[IIIlIlIIIlIlIll.ptr]) ? 1 : 0) ? 1 : 0)) {
            IIIlIlIIIlIlIll.ptr += llIIIllIll[lllIIllIll[2]];
            IIlIIllIll[lllIIllIll[25]].length();
            "".length();
            if (!FastScanner.IIIlIIIlIIll(IIlIIllIll[lllIIllIll[26]].length(), -IIlIIllIll[lllIIllIll[27]].length())) continue;
            return ((lllIIllIll[15] + lllIIllIll[28] - lllIIllIll[29] + lllIIllIll[30] ^ IIlIIllIll[lllIIllIll[31]].length() << (IIlIIllIll[lllIIllIll[32]].length() << IIlIIllIll[lllIIllIll[33]].length())) & (lllIIllIll[34] ^ lllIIllIll[35] ^ (lllIIllIll[36] ^ lllIIllIll[37]) << (IIlIIllIll[lllIIllIll[38]].length() << (IIlIIllIll[lllIIllIll[39]].length() << IIlIIllIll[lllIIllIll[40]].length())) ^ -IIlIIllIll[lllIIllIll[41]].length())) != 0;
        }
        return this.hasNextByte();
    }

    /*
     * WARNING - void declaration
     */
    public String next() {
        void var1_1;
        FastScanner llIIIlIIIlIlIll;
        if (FastScanner.lIlIIIIlIIll(FastScanner.IIIIlllIIIll(llIIIlIIIlIlIll.hasNext() ? 1 : 0) ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        StringBuilder IlIIIlIIIlIlIll = new StringBuilder();
        int lIIIIlIIIlIlIll = llIIIlIIIlIlIll.readByte();
        while (FastScanner.lIlIIIIlIIll(FastScanner.IlllIllIIIll(llIIIlIIIlIlIll.isPrintableChar(lIIIIlIIIlIlIll) ? 1 : 0) ? 1 : 0)) {
            IlIIIlIIIlIlIll.appendCodePoint(lIIIIlIIIlIlIll);
            IIlIIllIll[lllIIllIll[16]].length();
            lIIIIlIIIlIlIll = llIIIlIIIlIlIll.readByte();
            IIlIIllIll[lllIIllIll[23]].length();
            "".length();
            if (!FastScanner.lllIIIIlIIll(null)) continue;
            return null;
        }
        return String.valueOf(var1_1);
    }

    public long nextLong() {
        FastScanner lIIllIIIIlIlIll;
        if (FastScanner.lIlIIIIlIIll(FastScanner.IIIIlllIIIll(lIIllIIIIlIlIll.hasNext() ? 1 : 0) ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        long IIIllIIIIlIlIll = 0L;
        int lllIlIIIIlIlIll = llIIIllIll[lllIIllIll[1]];
        int IllIlIIIIlIlIll = lIIllIIIIlIlIll.readByte();
        if (FastScanner.lIlIIIIlIIll(FastScanner.lIIIlllIIIll(IllIlIIIIlIlIll, llIIIllIll[lllIIllIll[6]]) ? 1 : 0)) {
            lllIlIIIIlIlIll = llIIIllIll[lllIIllIll[2]];
            IllIlIIIIlIlIll = lIIllIIIIlIlIll.readByte();
        }
        if (!FastScanner.lIlIIIIlIIll(FastScanner.IlIIlllIIIll(IllIlIIIIlIlIll, llIIIllIll[lllIIllIll[7]]) ? 1 : 0) || FastScanner.lIlIIIIlIIll(FastScanner.IIllIllIIIll(llIIIllIll[lllIIllIll[8]], IllIlIIIIlIlIll) ? 1 : 0)) {
            throw new NumberFormatException();
        }
        do {
            if (FastScanner.lIlIIIIlIIll(FastScanner.llllIllIIIll(llIIIllIll[lllIIllIll[7]], IllIlIIIIlIlIll) ? 1 : 0) && FastScanner.lIlIIIIlIIll(FastScanner.llllIllIIIll(IllIlIIIIlIlIll, llIIIllIll[lllIIllIll[8]]) ? 1 : 0)) {
                IIIllIIIIlIlIll *= 10L;
                IIIllIIIIlIlIll += (long)(IllIlIIIIlIlIll - llIIIllIll[lllIIllIll[7]]);
                IIlIIllIll[lllIIllIll[28]].length();
                "".length();
                if (FastScanner.lllIIIIlIIll(null)) {
                    return 0L;
                }
            } else {
                if (!FastScanner.lIlIIIIlIIll(FastScanner.llIIlllIIIll(IllIlIIIIlIlIll, llIIIllIll[lllIIllIll[3]]) ? 1 : 0) || FastScanner.lIlIIIIlIIll(FastScanner.IIIIlllIIIll(lIIllIIIIlIlIll.isPrintableChar(IllIlIIIIlIlIll) ? 1 : 0) ? 1 : 0)) {
                    long l;
                    if (FastScanner.lIlIIIIlIIll(FastScanner.IlllIllIIIll(lllIlIIIIlIlIll) ? 1 : 0)) {
                        l = -IIIllIIIIlIlIll;
                        IIlIIllIll[lllIIllIll[42]].length();
                        "".length();
                        if (FastScanner.lIIlIIIlIIll(IIlIIllIll[lllIIllIll[35]].length() << (IIlIIllIll[lllIIllIll[43]].length() << IIlIIllIll[lllIIllIll[22]].length()), -IIlIIllIll[lllIIllIll[44]].length())) {
                            return 0L;
                        }
                    } else {
                        l = IIIllIIIIlIlIll;
                    }
                    return l;
                }
                throw new NumberFormatException();
            }
            int n = this.readByte();
            IIlIIllIll[lllIIllIll[45]].length();
            "".length();
        } while (!FastScanner.lIIlIIIlIIll(IIlIIllIll[lllIIllIll[46]].length(), IIlIIllIll[lllIIllIll[47]].length()));
        return 0L;
    }

    /*
     * WARNING - void declaration
     */
    public int nextInt() {
        void var1_1;
        FastScanner llllIIIIIlIlIll;
        long IlllIIIIIlIlIll = llllIIIIIlIlIll.nextLong();
        if (!FastScanner.lIlIIIIlIIll(FastScanner.lIlIlllIIIll(FastScanner.IIlIlllIIIll(IlllIIIIIlIlIll, Integer.MIN_VALUE)) ? 1 : 0) || FastScanner.lIlIIIIlIIll(FastScanner.IllIlllIIIll(FastScanner.IIlIlllIIIll(IlllIIIIIlIlIll, Integer.MAX_VALUE)) ? 1 : 0)) {
            throw new NumberFormatException();
        }
        return (int)var1_1;
    }

    public double nextDouble() {
        FastScanner IlIlIIIIIlIlIll;
        return Double.parseDouble(IlIlIIIIIlIlIll.next());
    }

    static {
        FastScanner.IIlIIIIlIIll();
        FastScanner.llIIIIIlIIll();
        FastScanner.IlIlIllIIIll();
    }

    private static void IlIlIllIIIll() {
        llIIIllIll = new int[lllIIllIll[9]];
        FastScanner.llIIIllIll[FastScanner.lllIIllIll[0]] = IIlIIllIll[lllIIllIll[48]].length() << ((lllIIllIll[49] ^ lllIIllIll[50] ^ (lllIIllIll[51] ^ lllIIllIll[52]) << (IIlIIllIll[lllIIllIll[53]].length() << IIlIIllIll[lllIIllIll[54]].length())) << IIlIIllIll[lllIIllIll[55]].length());
        FastScanner.llIIIllIll[FastScanner.lllIIllIll[1]] = ((lllIIllIll[56] ^ lllIIllIll[57]) << IIlIIllIll[lllIIllIll[58]].length() ^ (lllIIllIll[59] ^ lllIIllIll[52])) & (IIlIIllIll[lllIIllIll[60]].length() << (IIlIIllIll[lllIIllIll[61]].length() << (IIlIIllIll[lllIIllIll[62]].length() << IIlIIllIll[lllIIllIll[49]].length())) ^ (lllIIllIll[63] ^ lllIIllIll[64]) ^ -IIlIIllIll[lllIIllIll[65]].length());
        FastScanner.llIIIllIll[FastScanner.lllIIllIll[2]] = IIlIIllIll[lllIIllIll[36]].length();
        FastScanner.llIIIllIll[FastScanner.lllIIllIll[3]] = -IIlIIllIll[lllIIllIll[66]].length();
        FastScanner.llIIIllIll[FastScanner.lllIIllIll[4]] = lllIIllIll[67] ^ lllIIllIll[68];
        FastScanner.llIIIllIll[FastScanner.lllIIllIll[5]] = (lllIIllIll[69] ^ lllIIllIll[70]) << IIlIIllIll[lllIIllIll[21]].length();
        FastScanner.llIIIllIll[FastScanner.lllIIllIll[6]] = lllIIllIll[71] + lllIIllIll[31] - lllIIllIll[72] + lllIIllIll[73] ^ (lllIIllIll[69] ^ lllIIllIll[51]) << IIlIIllIll[lllIIllIll[74]].length();
        FastScanner.llIIIllIll[FastScanner.lllIIllIll[7]] = IIlIIllIll[lllIIllIll[75]].length() << (IIlIIllIll[lllIIllIll[76]].length() << (IIlIIllIll[lllIIllIll[77]].length() << IIlIIllIll[lllIIllIll[37]].length()));
        FastScanner.llIIIllIll[FastScanner.lllIIllIll[8]] = lllIIllIll[45] ^ lllIIllIll[41];
    }

    private static boolean lIIIlllIIIll(int n, int n2) {
        boolean bl;
        if (FastScanner.IIIlIIIlIIll(n, n2)) {
            bl = lllIIllIll[1];
            "".length();
            if (" ".length() < " ".length()) {
                return (((0x42 ^ 0x61) << (" ".length() << " ".length()) ^ 28 + 1 - -89 + 47) << " ".length() & (((0xCF ^ 0xC6) << " ".length() ^ (0x49 ^ 0x72)) << " ".length() ^ -" ".length())) != 0;
            }
        } else {
            bl = lllIIllIll[0];
        }
        return bl;
    }

    private static boolean IlIIlllIIIll(int n, int n2) {
        boolean bl;
        if (FastScanner.IlIlIIIlIIll(n, n2)) {
            bl = lllIIllIll[1];
            "".length();
            if (" ".length() << (" ".length() << " ".length()) <= 0) {
                return ((0x7C ^ 0x5B) << " ".length() & ~((0xE1 ^ 0xC6) << " ".length())) != 0;
            }
        } else {
            bl = lllIIllIll[0];
        }
        return bl;
    }

    private static boolean IIllIllIIIll(int n, int n2) {
        boolean bl;
        if (FastScanner.lIIlIIIlIIll(n, n2)) {
            bl = lllIIllIll[1];
            "".length();
            if (" ".length() << " ".length() < " ".length() << " ".length()) {
                return ((0xEB ^ 0xAC) & ~(0x60 ^ 0x27)) != 0;
            }
        } else {
            bl = lllIIllIll[0];
        }
        return bl;
    }

    private static boolean llllIllIIIll(int n, int n2) {
        boolean bl;
        if (FastScanner.llIlIIIlIIll(n, n2)) {
            bl = lllIIllIll[1];
            "".length();
            if (" ".length() < 0) {
                return (" ".length() << (0x45 ^ 0xA ^ (0x57 ^ 0x72) << " ".length()) & (" ".length() << ((3 ^ 0x60) << " ".length() ^ 188 + 145 - 165 + 27) ^ -" ".length())) != 0;
            }
        } else {
            bl = lllIIllIll[0];
        }
        return bl;
    }

    private static boolean IlllIllIIIll(int n) {
        boolean bl;
        if (FastScanner.lIlIIIIlIIll(n)) {
            bl = lllIIllIll[1];
            "".length();
            if (" ".length() << " ".length() < ((59 + 1 - 46 + 119 ^ (9 ^ 0x40) << " ".length()) << (" ".length() << " ".length()) & ((90 + 65 - -43 + 13 ^ (0x9B ^ 0xAA) << (" ".length() << " ".length())) << (" ".length() << " ".length()) ^ -" ".length()))) {
                return ((63 + 34 - -48 + 10 ^ (0x33 ^ 0x38) << (" ".length() << (" ".length() << " ".length()))) << " ".length() & (((0xAE ^ 0x89) << (" ".length() << " ".length()) ^ 139 + 87 - 183 + 140) << " ".length() ^ -" ".length())) != 0;
            }
        } else {
            bl = lllIIllIll[0];
        }
        return bl;
    }

    private static boolean IIIIlllIIIll(int n) {
        boolean bl;
        if (FastScanner.IIllIIIlIIll(n)) {
            bl = lllIIllIll[1];
            "".length();
            if (((0x52 ^ 0x41) << " ".length() & ~((0x7C ^ 0x6F) << " ".length())) >= " ".length() << " ".length()) {
                return ((0x61 ^ 0x3E) & ~(0xD6 ^ 0x89)) != 0;
            }
        } else {
            bl = lllIIllIll[0];
        }
        return bl;
    }

    private static boolean lIlIlllIIIll(int n) {
        boolean bl;
        if (FastScanner.lIllIIIlIIll(n)) {
            bl = lllIIllIll[1];
            "".length();
            if (" ".length() << (" ".length() << " ".length()) < 0) {
                return ((0x54 ^ 0x47) << (" ".length() << " ".length()) & ~((0x30 ^ 0x23) << (" ".length() << " ".length()))) != 0;
            }
        } else {
            bl = lllIIllIll[0];
        }
        return bl;
    }

    private static boolean lIllIllIIIll(int n) {
        boolean bl;
        if (FastScanner.IlllIIIlIIll(n)) {
            bl = lllIIllIll[1];
            "".length();
            if (-" ".length() >= " ".length() << " ".length()) {
                return ((0xC7 ^ 0x9E) & ~(0xE ^ 0x57)) != 0;
            }
        } else {
            bl = lllIIllIll[0];
        }
        return bl;
    }

    private static boolean IllIlllIIIll(int n) {
        boolean bl;
        if (FastScanner.llllIIIlIIll(n)) {
            bl = lllIIllIll[1];
            "".length();
            if (" ".length() << " ".length() <= 0) {
                return (((0x3E ^ 0x1B) << (" ".length() << " ".length()) ^ 171 + 147 - 288 + 151) & ((0x72 ^ 0x7B) << (" ".length() << (" ".length() << " ".length())) ^ 156 + 100 - 109 + 30 ^ -" ".length())) != 0;
            }
        } else {
            bl = lllIIllIll[0];
        }
        return bl;
    }

    private static boolean llIIlllIIIll(int n, int n2) {
        boolean bl;
        if (FastScanner.IllIIIIlIIll(n, n2)) {
            bl = lllIIllIll[1];
            "".length();
            if (-" ".length() >= " ".length()) {
                return ((0x56 ^ 0x67) & ~(0x46 ^ 0x77)) != 0;
            }
        } else {
            bl = lllIIllIll[0];
        }
        return bl;
    }

    private static int IIlIlllIIIll(long l, long l2) {
        return FastScanner.IIIIlIIlIIll(l, l2);
    }

    private static void llIIIIIlIIll() {
        IIlIIllIll = new String[lllIIllIll[78]];
        FastScanner.IIlIIllIll[FastScanner.lllIIllIll[0]] = FastScanner.lllIlllIIIll("", "AFKMu");
        FastScanner.IIlIIllIll[FastScanner.lllIIllIll[1]] = FastScanner.lllIlllIIIll("ZA==", "DXRmU");
        FastScanner.IIlIIllIll[FastScanner.lllIIllIll[2]] = FastScanner.lllIlllIIIll("RA==", "dhDrq");
        FastScanner.IIlIIllIll[FastScanner.lllIIllIll[3]] = FastScanner.IIIllllIIIll("cGlZQPHMGA4=", "UPVLD");
        FastScanner.IIlIIllIll[FastScanner.lllIIllIll[4]] = FastScanner.IIIllllIIIll("UOSWK7jkfQE=", "ayNfG");
        FastScanner.IIlIIllIll[FastScanner.lllIIllIll[5]] = FastScanner.lllIlllIIIll("RQ==", "ekyOa");
        FastScanner.IIlIIllIll[FastScanner.lllIIllIll[6]] = FastScanner.llIllllIIIll("gwB1eDBgceM=", "OMqlI");
        FastScanner.IIlIIllIll[FastScanner.lllIIllIll[7]] = FastScanner.lllIlllIIIll("Zw==", "GWFmo");
        FastScanner.IIlIIllIll[FastScanner.lllIIllIll[8]] = FastScanner.IIIllllIIIll("sPnGSpkWn5o=", "eVveZ");
        FastScanner.IIlIIllIll[FastScanner.lllIIllIll[9]] = FastScanner.IIIllllIIIll("GP5ERu7c1Rs=", "orNls");
        FastScanner.IIlIIllIll[FastScanner.lllIIllIll[10]] = FastScanner.llIllllIIIll("1urAtwiLtpk=", "UWlIc");
        FastScanner.IIlIIllIll[FastScanner.lllIIllIll[11]] = FastScanner.llIllllIIIll("UKO41bWTWz8=", "RSOqS");
        FastScanner.IIlIIllIll[FastScanner.lllIIllIll[14]] = FastScanner.IIIllllIIIll("kw/AXPChL2g=", "lHUze");
        FastScanner.IIlIIllIll[FastScanner.lllIIllIll[17]] = FastScanner.llIllllIIIll("hn/grJd94bE=", "lboHE");
        FastScanner.IIlIIllIll[FastScanner.lllIIllIll[18]] = FastScanner.IIIllllIIIll("s1RubkiQv2g=", "IlZvB");
        FastScanner.IIlIIllIll[FastScanner.lllIIllIll[19]] = FastScanner.llIllllIIIll("YR8ZJQEQTB4=", "zqaYx");
        FastScanner.IIlIIllIll[FastScanner.lllIIllIll[20]] = FastScanner.IIIllllIIIll("J1qoKvqGzKY=", "RfcPI");
        FastScanner.IIlIIllIll[FastScanner.lllIIllIll[25]] = FastScanner.llIllllIIIll("Vz5bF9i5eUE=", "qxKxz");
        FastScanner.IIlIIllIll[FastScanner.lllIIllIll[26]] = FastScanner.IIIllllIIIll("F6WcNbBREdc=", "RfMrE");
        FastScanner.IIlIIllIll[FastScanner.lllIIllIll[27]] = FastScanner.lllIlllIIIll("SQ==", "inLUL");
        FastScanner.IIlIIllIll[FastScanner.lllIIllIll[31]] = FastScanner.IIIllllIIIll("rVhT4sYp8xI=", "QuDjk");
        FastScanner.IIlIIllIll[FastScanner.lllIIllIll[32]] = FastScanner.llIllllIIIll("IarSuJxPFTI=", "zaVBq");
        FastScanner.IIlIIllIll[FastScanner.lllIIllIll[33]] = FastScanner.lllIlllIIIll("eQ==", "YxjvX");
        FastScanner.IIlIIllIll[FastScanner.lllIIllIll[38]] = FastScanner.IIIllllIIIll("2U5Xc2iy0Bo=", "ncErB");
        FastScanner.IIlIIllIll[FastScanner.lllIIllIll[39]] = FastScanner.lllIlllIIIll("aA==", "HVViR");
        FastScanner.IIlIIllIll[FastScanner.lllIIllIll[40]] = FastScanner.llIllllIIIll("2WHrKiThR00=", "rKrDn");
        FastScanner.IIlIIllIll[FastScanner.lllIIllIll[41]] = FastScanner.lllIlllIIIll("Zw==", "GYEWk");
        FastScanner.IIlIIllIll[FastScanner.lllIIllIll[16]] = FastScanner.llIllllIIIll("LhwzF6TrN8g=", "EasMn");
        FastScanner.IIlIIllIll[FastScanner.lllIIllIll[23]] = FastScanner.IIIllllIIIll("hm0muFioQQs=", "aQcUJ");
        FastScanner.IIlIIllIll[FastScanner.lllIIllIll[28]] = FastScanner.lllIlllIIIll("", "DwPiW");
        FastScanner.IIlIIllIll[FastScanner.lllIIllIll[42]] = FastScanner.llIllllIIIll("GuTj0qhG2nE=", "BNtYd");
        FastScanner.IIlIIllIll[FastScanner.lllIIllIll[35]] = FastScanner.IIIllllIIIll("J3AhF11Cj9o=", "Pepti");
        FastScanner.IIlIIllIll[FastScanner.lllIIllIll[43]] = FastScanner.IIIllllIIIll("tUJIDA8RYm8=", "wYPwN");
        FastScanner.IIlIIllIll[FastScanner.lllIIllIll[22]] = FastScanner.IIIllllIIIll("9em4LnQIIEQ=", "LHsaE");
        FastScanner.IIlIIllIll[FastScanner.lllIIllIll[44]] = FastScanner.llIllllIIIll("W/18vJJlWtU=", "SYHOT");
        FastScanner.IIlIIllIll[FastScanner.lllIIllIll[45]] = FastScanner.lllIlllIIIll("", "EmuKM");
        FastScanner.IIlIIllIll[FastScanner.lllIIllIll[46]] = FastScanner.IIIllllIIIll("WoEycpyqX64=", "GcOKw");
        FastScanner.IIlIIllIll[FastScanner.lllIIllIll[47]] = FastScanner.IIIllllIIIll("DgERMpRe5Rk=", "uXShj");
        FastScanner.IIlIIllIll[FastScanner.lllIIllIll[48]] = FastScanner.llIllllIIIll("4qugHsOQ/Nw=", "Fnqqs");
        FastScanner.IIlIIllIll[FastScanner.lllIIllIll[53]] = FastScanner.lllIlllIIIll("WQ==", "yNmtn");
        FastScanner.IIlIIllIll[FastScanner.lllIIllIll[54]] = FastScanner.IIIllllIIIll("MFKTB0nwjlA=", "FitEN");
        FastScanner.IIlIIllIll[FastScanner.lllIIllIll[55]] = FastScanner.llIllllIIIll("jJO9NDITE5U=", "StXiQ");
        FastScanner.IIlIIllIll[FastScanner.lllIIllIll[58]] = FastScanner.lllIlllIIIll("Tg==", "npciF");
        FastScanner.IIlIIllIll[FastScanner.lllIIllIll[60]] = FastScanner.llIllllIIIll("VF5RFyf465I=", "sjxDF");
        FastScanner.IIlIIllIll[FastScanner.lllIIllIll[61]] = FastScanner.lllIlllIIIll("bA==", "LGuqt");
        FastScanner.IIlIIllIll[FastScanner.lllIIllIll[62]] = FastScanner.llIllllIIIll("VA6g16ZlrJc=", "SRDxf");
        FastScanner.IIlIIllIll[FastScanner.lllIIllIll[49]] = FastScanner.IIIllllIIIll("AeX6lSBj+oQ=", "gZCHJ");
        FastScanner.IIlIIllIll[FastScanner.lllIIllIll[65]] = FastScanner.IIIllllIIIll("0wBt+eAMUTs=", "JRJvH");
        FastScanner.IIlIIllIll[FastScanner.lllIIllIll[36]] = FastScanner.llIllllIIIll("3ixBLL5iyL0=", "CqsSH");
        FastScanner.IIlIIllIll[FastScanner.lllIIllIll[66]] = FastScanner.IIIllllIIIll("rWRYZHsPYeU=", "XPTbw");
        FastScanner.IIlIIllIll[FastScanner.lllIIllIll[21]] = FastScanner.llIllllIIIll("IkGFvs1Ksg0=", "vrkut");
        FastScanner.IIlIIllIll[FastScanner.lllIIllIll[74]] = FastScanner.IIIllllIIIll("vflYXicK910=", "DqWBv");
        FastScanner.IIlIIllIll[FastScanner.lllIIllIll[75]] = FastScanner.lllIlllIIIll("SFFJ", "hqiTp");
        FastScanner.IIlIIllIll[FastScanner.lllIIllIll[76]] = FastScanner.IIIllllIIIll("96VD/YAG0rs=", "RpMNX");
        FastScanner.IIlIIllIll[FastScanner.lllIIllIll[77]] = FastScanner.llIllllIIIll("eL5mXZhfm/A=", "vKFXs");
        FastScanner.IIlIIllIll[FastScanner.lllIIllIll[37]] = FastScanner.llIllllIIIll("ewr9AObd+pg=", "MZkNg");
    }

    private static String IIIllllIIIll(String lllIlIlllIIlIll, String IllIlIlllIIlIll) {
        try {
            SecretKeySpec lIlIlIlllIIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IllIlIlllIIlIll.getBytes(StandardCharsets.UTF_8)), lllIIllIll[8]), "DES");
            Cipher IIlIlIlllIIlIll = Cipher.getInstance("DES");
            IIlIlIlllIIlIll.init(lllIIllIll[2], lIlIlIlllIIlIll);
            return new String(IIlIlIlllIIlIll.doFinal(Base64.getDecoder().decode(lllIlIlllIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIlIlllIIlIll) {
            llIIlIlllIIlIll.printStackTrace();
            return null;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static String lllIlllIIIll(String lIlIIIlllIIlIll, String IIlIIIlllIIlIll) {
        lIlIIIlllIIlIll = new String(Base64.getDecoder().decode(lIlIIIlllIIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        llIIIIlllIIlIll = new StringBuilder();
        IlIIIIlllIIlIll = IIlIIIlllIIlIll.toCharArray();
        lIIIIIlllIIlIll = FastScanner.lllIIllIll[0];
        lllIllIllIIlIll = lIlIIIlllIIlIll.toCharArray();
        IIIlllIllIIlIll = lllIllIllIIlIll.length;
        lIIlllIllIIlIll = FastScanner.lllIIllIll[0];
        "".length();
        if (" ".length() != 0) ** GOTO lbl19
        return null;
lbl-1000:
        // 1 sources

        {
            IIIIIIlllIIlIll = lllIllIllIIlIll[lIIlllIllIIlIll];
            llIIIIlllIIlIll.append((char)(IIIIIIlllIIlIll ^ IlIIIIlllIIlIll[lIIIIIlllIIlIll % IlIIIIlllIIlIll.length]));
            "".length();
            ++lIIIIIlllIIlIll;
            ++lIIlllIllIIlIll;
lbl19:
            // 2 sources

            ** while (!FastScanner.IlIlIIIlIIll((int)lIIlllIllIIlIll, (int)IIIlllIllIIlIll))
        }
lbl20:
        // 1 sources

        return String.valueOf(llIIIIlllIIlIll);
    }

    private static String llIllllIIIll(String IlIIllIllIIlIll, String lIIIllIllIIlIll) {
        try {
            SecretKeySpec IIIIllIllIIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIIllIllIIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllIlIllIIlIll = Cipher.getInstance("Blowfish");
            llllIlIllIIlIll.init(lllIIllIll[2], IIIIllIllIIlIll);
            return new String(llllIlIllIIlIll.doFinal(Base64.getDecoder().decode(IlIIllIllIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IlllIlIllIIlIll) {
            IlllIlIllIIlIll.printStackTrace();
            return null;
        }
    }

    private static void IIlIIIIlIIll() {
        lllIIllIll = new int[79];
        FastScanner.lllIIllIll[0] = " ".length() & ~" ".length();
        FastScanner.lllIIllIll[1] = " ".length();
        FastScanner.lllIIllIll[2] = " ".length() << " ".length();
        FastScanner.lllIIllIll[3] = "   ".length();
        FastScanner.lllIIllIll[4] = " ".length() << (" ".length() << " ".length());
        FastScanner.lllIIllIll[5] = 0x27 ^ 0x22;
        FastScanner.lllIIllIll[6] = "   ".length() << " ".length();
        FastScanner.lllIIllIll[7] = 0x43 ^ 0x44;
        FastScanner.lllIIllIll[8] = " ".length() << "   ".length();
        FastScanner.lllIIllIll[9] = 0x12 ^ 0x1B;
        FastScanner.lllIIllIll[10] = ((0x73 ^ 0x40) << " ".length() ^ (0x24 ^ 0x47)) << " ".length();
        FastScanner.lllIIllIll[11] = "   ".length() & ~"   ".length() ^ (0x57 ^ 0x5C);
        FastScanner.lllIIllIll[12] = (0x1D ^ 0x28) << " ".length();
        FastScanner.lllIIllIll[13] = 0xC0 ^ 0xBD;
        FastScanner.lllIIllIll[14] = "   ".length() << (" ".length() << " ".length());
        FastScanner.lllIIllIll[15] = (0xF5 ^ 0xBC) << " ".length();
        FastScanner.lllIIllIll[16] = 0x6E ^ 0x13 ^ (0x3F ^ 0xC) << " ".length();
        FastScanner.lllIIllIll[17] = 0xB4 ^ 0xB9;
        FastScanner.lllIIllIll[18] = ((0x60 ^ 0x7B) << (" ".length() << " ".length()) ^ (0xED ^ 0x86)) << " ".length();
        FastScanner.lllIIllIll[19] = 0xC8 ^ 0xC7;
        FastScanner.lllIIllIll[20] = " ".length() << (" ".length() << (" ".length() << " ".length()));
        FastScanner.lllIIllIll[21] = (0xB1 ^ 0xA8) << " ".length();
        FastScanner.lllIIllIll[22] = 0x4F ^ 0x6E;
        FastScanner.lllIIllIll[23] = (0x6F ^ 0x36 ^ (0x4B ^ 0x64) << " ".length()) << (" ".length() << " ".length());
        FastScanner.lllIIllIll[24] = -" ".length();
        FastScanner.lllIIllIll[25] = 0x7F ^ 0x6E;
        FastScanner.lllIIllIll[26] = ((0x5F ^ 0x4C) << (" ".length() << " ".length()) ^ (0x4E ^ 0xB)) << " ".length();
        FastScanner.lllIIllIll[27] = 0x5D ^ 0x66 ^ (0x7A ^ 0x7F) << "   ".length();
        FastScanner.lllIIllIll[28] = 0x34 ^ 0x29;
        FastScanner.lllIIllIll[29] = (0x72 ^ 0x25) << " ".length();
        FastScanner.lllIIllIll[30] = (0x72 ^ 0x35 ^ (0xE ^ 9) << (" ".length() << (" ".length() << " ".length()))) << (" ".length() << " ".length());
        FastScanner.lllIIllIll[31] = (81 + 64 - 16 + 8 ^ (0x93 ^ 0xB0) << (" ".length() << " ".length())) << (" ".length() << " ".length());
        FastScanner.lllIIllIll[32] = 0xA0 ^ 0xB5;
        FastScanner.lllIIllIll[33] = ((0x55 ^ 0x70) << " ".length() ^ (7 ^ 0x46)) << " ".length();
        FastScanner.lllIIllIll[34] = (0x12 ^ 0x2B) << " ".length();
        FastScanner.lllIIllIll[35] = 0xD ^ 0x2E ^ (0x40 ^ 0x4F) << (" ".length() << " ".length());
        FastScanner.lllIIllIll[36] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
        FastScanner.lllIIllIll[37] = (0x26 ^ 0xB) << (" ".length() << " ".length()) ^ 3 + 54 - -43 + 31;
        FastScanner.lllIIllIll[38] = 0xCE ^ 0x99 ^ " ".length() << ("   ".length() << " ".length());
        FastScanner.lllIIllIll[39] = "   ".length() << "   ".length();
        FastScanner.lllIIllIll[40] = (0x50 ^ 0x45) << " ".length() ^ (0x38 ^ 0xB);
        FastScanner.lllIIllIll[41] = (0x87 ^ 0x8A) << " ".length();
        FastScanner.lllIIllIll[42] = (0x6A ^ 0x65) << " ".length();
        FastScanner.lllIIllIll[43] = " ".length() << (0xA0 ^ 0xA5);
        FastScanner.lllIIllIll[44] = (0x9D ^ 0x8C) << " ".length();
        FastScanner.lllIIllIll[45] = (0x83 ^ 0xA4) << " ".length() ^ (0xC2 ^ 0xAF);
        FastScanner.lllIIllIll[46] = (3 ^ 0xA) << (" ".length() << " ".length());
        FastScanner.lllIIllIll[47] = 0x47 ^ 0x62;
        FastScanner.lllIIllIll[48] = (0x9A ^ 0x89) << " ".length();
        FastScanner.lllIIllIll[49] = (0x7C ^ 0x6B) << " ".length();
        FastScanner.lllIIllIll[50] = 0x24 ^ 0x53;
        FastScanner.lllIIllIll[51] = (0x43 ^ 0x16) << " ".length();
        FastScanner.lllIIllIll[52] = ((0x7B ^ 0x38) << " ".length()) + ((0xA3 ^ 0xB2) << "   ".length()) - (116 + 8 - 19 + 86) + ((0x30 ^ 7) << " ".length());
        FastScanner.lllIIllIll[53] = (0xA6 ^ 0xB7) << (" ".length() << " ".length()) ^ (0x65 ^ 6);
        FastScanner.lllIIllIll[54] = ((0x57 ^ 0x42) << " ".length() ^ (0x9D ^ 0xB2)) << "   ".length();
        FastScanner.lllIIllIll[55] = 0xF ^ 0x26;
        FastScanner.lllIIllIll[56] = 156 + 7 - 107 + 113;
        FastScanner.lllIIllIll[57] = (0x11 ^ 0x52 ^ " ".length() << " ".length()) << " ".length();
        FastScanner.lllIIllIll[58] = (0x4D ^ 0x58) << " ".length();
        FastScanner.lllIIllIll[59] = (0x82 ^ 0xBD) << (" ".length() << " ".length());
        FastScanner.lllIIllIll[60] = 0x80 ^ 0xAB;
        FastScanner.lllIIllIll[61] = (0x1F ^ 0x14) << (" ".length() << " ".length());
        FastScanner.lllIIllIll[62] = 0x57 ^ 0x7A;
        FastScanner.lllIIllIll[63] = 0xC7 ^ 0x88;
        FastScanner.lllIIllIll[64] = ((0x5E ^ 0x65) << " ".length() ^ (0xDF ^ 0xA4)) << "   ".length();
        FastScanner.lllIIllIll[65] = 0xEE ^ 0xC1;
        FastScanner.lllIIllIll[66] = 0x6D ^ 0x4A ^ (0x7D ^ 0x76) << " ".length();
        FastScanner.lllIIllIll[67] = 0x42 ^ 0xF;
        FastScanner.lllIIllIll[68] = (0xA6 ^ 0xBD) << (" ".length() << " ".length());
        FastScanner.lllIIllIll[69] = 76 + 54 - -2 + 123;
        FastScanner.lllIIllIll[70] = "   ".length() << ("   ".length() << " ".length());
        FastScanner.lllIIllIll[71] = ((0xAC ^ 0xBD) << (" ".length() << " ".length())) + ((0x1A ^ 5) << (" ".length() << " ".length())) - (27 + 96 - -10 + 36) + ((0x25 ^ 0x28) << "   ".length());
        FastScanner.lllIIllIll[72] = ((0x9C ^ 0x93) << (" ".length() << " ".length())) + (0x6F ^ 0x12) - ((0x76 ^ 0x5F) << (" ".length() << " ".length())) + ((0x6A ^ 0x71) << (" ".length() << " ".length()));
        FastScanner.lllIIllIll[73] = 0x7A ^ 0xF;
        FastScanner.lllIIllIll[74] = 0x1A ^ 0x29;
        FastScanner.lllIIllIll[75] = (0xC ^ 1) << (" ".length() << " ".length());
        FastScanner.lllIIllIll[76] = 0x9D ^ 0xA8;
        FastScanner.lllIIllIll[77] = (" ".length() << (" ".length() << (" ".length() << " ".length())) ^ (0x53 ^ 0x58)) << " ".length();
        FastScanner.lllIIllIll[78] = (2 ^ 5) << "   ".length();
    }

    private static boolean IIIlIIIlIIll(int n, int n2) {
        return n == n2;
    }

    private static boolean IlIlIIIlIIll(int n, int n2) {
        return n >= n2;
    }

    private static boolean lIIlIIIlIIll(int n, int n2) {
        return n < n2;
    }

    private static boolean llIlIIIlIIll(int n, int n2) {
        return n <= n2;
    }

    private static boolean lllIIIIlIIll(Object object) {
        return object != null;
    }

    private static boolean lIlIIIIlIIll(int n) {
        return n != 0;
    }

    private static boolean IIllIIIlIIll(int n) {
        return n == 0;
    }

    private static boolean lIllIIIlIIll(int n) {
        return n >= 0;
    }

    private static boolean IlllIIIlIIll(int n) {
        return n <= 0;
    }

    private static boolean llllIIIlIIll(int n) {
        return n > 0;
    }

    private static boolean IllIIIIlIIll(int n, int n2) {
        return n != n2;
    }

    private static int IIIIlIIlIIll(long l, long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }
}

