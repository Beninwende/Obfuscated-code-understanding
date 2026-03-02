/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

class FastScanner {
    Reader input;
    private static String[] IllIlIllIl;
    private static int[] lllIlIllIl;

    FastScanner() {
        IIIIIIl(System.in);
        FastScanner IIIIIIl;
    }

    /*
     * WARNING - void declaration
     */
    FastScanner(InputStream IIllll) {
        void var1_1;
        FastScanner lIllll;
        this.input = new BufferedReader(new InputStreamReader((InputStream)var1_1));
    }

    int nextInt() {
        FastScanner IlIlll;
        return (int)IlIlll.nextLong();
    }

    long nextLong() {
        try {
            FastScanner lIlIll;
            int IIlIll = lllIlIllIl[0];
            int llIIll = lIlIll.input.read();
            while ((!FastScanner.lIlIIIlIIlIl(llIIll, lllIlIllIl[1]) || FastScanner.IllIIIlIIlIl(lllIlIllIl[2], llIIll)) && FastScanner.lllIIIlIIlIl(llIIll, lllIlIllIl[3]) && FastScanner.lllIIIlIIlIl(llIIll, lllIlIllIl[4])) {
                llIIll = lIlIll.input.read();
                "".length();
                if (null == null) continue;
                return 0L;
            }
            if (FastScanner.IIIlIIlIIlIl(llIIll, lllIlIllIl[3])) {
                IIlIll = lllIlIllIl[5];
                llIIll = lIlIll.input.read();
                "".length();
                if (-" ".length() >= ((0xCE ^ 0x81 ^ (0x6F ^ 0x42) << " ".length()) << (" ".length() << " ".length()) & (((0xB7 ^ 0x96) << (" ".length() << " ".length()) ^ 85 + 8 - 46 + 98) << (" ".length() << " ".length()) ^ -" ".length()))) {
                    return 0L;
                }
            } else if (FastScanner.IIIlIIlIIlIl(llIIll, lllIlIllIl[4])) {
                llIIll = lIlIll.input.read();
            }
            long IlIIll = llIIll - lllIlIllIl[1];
            do {
                if (!FastScanner.lIlIIIlIIlIl(llIIll = lIlIll.input.read(), lllIlIllIl[1]) || FastScanner.IllIIIlIIlIl(lllIlIllIl[2], llIIll)) {
                    return IlIIll * (long)IIlIll;
                }
                IlIIll *= 10L;
                IlIIll += (long)(llIIll - lllIlIllIl[1]);
                "".length();
            } while (" ".length() << (" ".length() << " ".length()) != "   ".length());
            return 0L;
        }
        catch (IOException IIlIll) {
            IIlIll.printStackTrace();
            return -1L;
        }
    }

    double nextDouble() {
        try {
            FastScanner IIllIl;
            double llIlIl = 1.0;
            int IlIlIl = IIllIl.input.read();
            while ((!FastScanner.lIlIIIlIIlIl(IlIlIl, lllIlIllIl[1]) || FastScanner.IllIIIlIIlIl(lllIlIllIl[2], IlIlIl)) && FastScanner.lllIIIlIIlIl(IlIlIl, lllIlIllIl[3]) && FastScanner.lllIIIlIIlIl(IlIlIl, lllIlIllIl[4])) {
                IlIlIl = IIllIl.input.read();
                "".length();
                if (((0x97 ^ 0x90) << (" ".length() << " ".length()) & ~((0xB1 ^ 0xB6) << (" ".length() << " ".length()))) == 0) continue;
                return 0.0;
            }
            if (FastScanner.IIIlIIlIIlIl(IlIlIl, lllIlIllIl[3])) {
                llIlIl = -1.0;
                IlIlIl = IIllIl.input.read();
                "".length();
                if (null != null) {
                    return 0.0;
                }
            } else if (FastScanner.IIIlIIlIIlIl(IlIlIl, lllIlIllIl[4])) {
                IlIlIl = IIllIl.input.read();
            }
            double lIIlIl = IlIlIl - lllIlIllIl[1];
            while (FastScanner.lIlIIIlIIlIl(IlIlIl = IIllIl.input.read(), lllIlIllIl[1])) {
                if (FastScanner.IllIIIlIIlIl(lllIlIllIl[2], IlIlIl)) {
                    "".length();
                    if (null == null) break;
                    return 0.0;
                }
                lIIlIl *= 10.0;
                lIIlIl += (double)(IlIlIl - lllIlIllIl[1]);
                "".length();
                if ((((0x86 ^ 0xBB) << " ".length() ^ (0x1C ^ 0x4F)) << " ".length() & ((0xB8 ^ 0xA1 ^ "   ".length() << (" ".length() << (" ".length() << " ".length()))) << " ".length() ^ -" ".length())) == 0) continue;
                return 0.0;
            }
            if (FastScanner.lllIIIlIIlIl(IlIlIl, lllIlIllIl[6])) {
                return llIlIl * lIIlIl;
            }
            double IIIlIl = 1.0;
            IlIlIl = IIllIl.input.read();
            while (FastScanner.lIIlIIlIIlIl(lllIlIllIl[1], IlIlIl) && FastScanner.lIIlIIlIIlIl(IlIlIl, lllIlIllIl[2])) {
                lIIlIl *= 10.0;
                lIIlIl += (double)(IlIlIl - lllIlIllIl[1]);
                IIIlIl *= 10.0;
                IlIlIl = IIllIl.input.read();
                "".length();
                if (null == null) continue;
                return 0.0;
            }
            return llIlIl * lIIlIl / IIIlIl;
        }
        catch (IOException llIlIl) {
            llIlIl.printStackTrace();
            return Double.NaN;
        }
    }

    char nextChar() {
        try {
            FastScanner lIlIIl;
            int IIlIIl = lIlIIl.input.read();
            while (FastScanner.IlIlIIlIIlIl(Character.isWhitespace(IIlIIl) ? 1 : 0)) {
                IIlIIl = lIlIIl.input.read();
                "".length();
                if (" ".length() << (" ".length() << " ".length()) == " ".length() << (" ".length() << " ".length())) continue;
                return (char)("   ".length() << " ".length() & ~("   ".length() << " ".length()));
            }
            return (char)IIlIIl;
        }
        catch (IOException IIlIIl) {
            IIlIIl.printStackTrace();
            return lllIlIllIl[7];
        }
    }

    String nextStr() {
        try {
            FastScanner IIIIIl;
            StringBuilder lllll = new StringBuilder();
            int Illll = IIIIIl.input.read();
            while (FastScanner.IlIlIIlIIlIl(Character.isWhitespace(Illll) ? 1 : 0)) {
                Illll = IIIIIl.input.read();
                "".length();
                if ("   ".length() < " ".length() << (" ".length() << " ".length())) continue;
                return null;
            }
            while (FastScanner.lllIIIlIIlIl(Illll, lllIlIllIl[5]) && FastScanner.llIlIIlIIlIl(Character.isWhitespace(Illll) ? 1 : 0)) {
                lllll.append((char)Illll);
                "".length();
                Illll = IIIIIl.input.read();
                "".length();
                if (-" ".length() <= -" ".length()) continue;
                return null;
            }
            return String.valueOf(lllll);
        }
        catch (IOException lllll) {
            lllll.printStackTrace();
            return IllIlIllIl[lllIlIllIl[7]];
        }
    }

    static {
        FastScanner.IIlIIIlIIlIl();
        FastScanner.llIIIIlIIlIl();
    }

    private static void llIIIIlIIlIl() {
        IllIlIllIl = new String[lllIlIllIl[0]];
        FastScanner.IllIlIllIl[FastScanner.lllIlIllIl[7]] = FastScanner.IlIIIIlIIlIl("x8Xgds97nv4=", "sckTx");
    }

    private static String IlIIIIlIIlIl(String lIIll, String IIIll) {
        try {
            SecretKeySpec lllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher IllIl = Cipher.getInstance("Blowfish");
            IllIl.init(lllIlIllIl[8], lllIl);
            return new String(IllIl.doFinal(Base64.getDecoder().decode(lIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIl) {
            lIlIl.printStackTrace();
            return null;
        }
    }

    private static void IIlIIIlIIlIl() {
        lllIlIllIl = new int[9];
        FastScanner.lllIlIllIl[0] = " ".length();
        FastScanner.lllIlIllIl[1] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
        FastScanner.lllIlIllIl[2] = 0x4A ^ 0x59 ^ (0x46 ^ 0x53) << " ".length();
        FastScanner.lllIlIllIl[3] = "   ".length() << "   ".length() ^ (0x37 ^ 2);
        FastScanner.lllIlIllIl[4] = 0x6C ^ 0x69 ^ (0xBC ^ 0xAB) << " ".length();
        FastScanner.lllIlIllIl[5] = -" ".length();
        FastScanner.lllIlIllIl[6] = ((0x7F ^ 0x14) << " ".length() ^ 182 + 86 - 186 + 111) << " ".length();
        FastScanner.lllIlIllIl[7] = ((0x74 ^ 0x41) << " ".length() ^ (0x63 ^ 0x42)) & (89 + 6 - -21 + 27 ^ (0x3C ^ 0xD) << (" ".length() << " ".length()) ^ -" ".length());
        FastScanner.lllIlIllIl[8] = " ".length() << " ".length();
    }

    private static boolean IIIlIIlIIlIl(int n, int n2) {
        return n == n2;
    }

    private static boolean lIlIIIlIIlIl(int n, int n2) {
        return n >= n2;
    }

    private static boolean IllIIIlIIlIl(int n, int n2) {
        return n < n2;
    }

    private static boolean lIIlIIlIIlIl(int n, int n2) {
        return n <= n2;
    }

    private static boolean IlIlIIlIIlIl(int n) {
        return n != 0;
    }

    private static boolean llIlIIlIIlIl(int n) {
        return n == 0;
    }

    private static boolean lllIIIlIIlIl(int n, int n2) {
        return n != n2;
    }
}

