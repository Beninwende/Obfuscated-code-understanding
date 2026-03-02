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
    private static String[] IlIlllIIl;
    private static int[] llIlllIIl;

    FastScanner() {
        IlllllIIIllIll(System.in);
        FastScanner IlllllIIIllIll;
    }

    /*
     * WARNING - void declaration
     */
    FastScanner(InputStream IlIlllIIIllIll) {
        void var1_1;
        FastScanner llIlllIIIllIll;
        this.input = new BufferedReader(new InputStreamReader((InputStream)var1_1));
    }

    int nextInt() {
        FastScanner IIIlllIIIllIll;
        return (int)IIIlllIIIllIll.nextLong();
    }

    long nextLong() {
        try {
            FastScanner llIIllIIIllIll;
            int IlIIllIIIllIll = llIlllIIl[0];
            int lIIIllIIIllIll = llIIllIIIllIll.input.read();
            while ((!FastScanner.lIllIlIIIIl(lIIIllIIIllIll, llIlllIIl[1]) || FastScanner.IlllIlIIIIl(llIlllIIl[2], lIIIllIIIllIll)) && FastScanner.llllIlIIIIl(lIIIllIIIllIll, llIlllIIl[3]) && FastScanner.llllIlIIIIl(lIIIllIIIllIll, llIlllIIl[4])) {
                lIIIllIIIllIll = llIIllIIIllIll.input.read();
                "".length();
                if (((175 + 200 - 212 + 78 ^ (0xBB ^ 0x8A) << (" ".length() << " ".length())) & (0x63 ^ 6 ^ (7 ^ 2) << (" ".length() << (" ".length() << " ".length())) ^ -" ".length())) < " ".length() << " ".length()) continue;
                return 0L;
            }
            if (FastScanner.IIIIllIIIIl(lIIIllIIIllIll, llIlllIIl[3])) {
                IlIIllIIIllIll = llIlllIIl[5];
                lIIIllIIIllIll = llIIllIIIllIll.input.read();
                "".length();
                if (((0xB8 ^ 0xB1) << " ".length() & ~((0x7B ^ 0x72) << " ".length())) != 0) {
                    return 0L;
                }
            } else if (FastScanner.IIIIllIIIIl(lIIIllIIIllIll, llIlllIIl[4])) {
                lIIIllIIIllIll = llIIllIIIllIll.input.read();
            }
            long IIIIllIIIllIll = lIIIllIIIllIll - llIlllIIl[1];
            do {
                if (!FastScanner.lIllIlIIIIl(lIIIllIIIllIll = llIIllIIIllIll.input.read(), llIlllIIl[1]) || FastScanner.IlllIlIIIIl(llIlllIIl[2], lIIIllIIIllIll)) {
                    return IIIIllIIIllIll * (long)IlIIllIIIllIll;
                }
                IIIIllIIIllIll *= 10L;
                IIIIllIIIllIll += (long)(lIIIllIIIllIll - llIlllIIl[1]);
                "".length();
            } while (" ".length() << (" ".length() << " ".length()) > ((214 + 54 - 219 + 188 ^ (0x68 ^ 0x7D) << "   ".length()) & (0x3D ^ 0x34 ^ (0x7F ^ 0x6C) << (" ".length() << " ".length()) ^ -" ".length())));
            return 0L;
        }
        catch (IOException IlIIllIIIllIll) {
            IlIIllIIIllIll.printStackTrace();
            return -1L;
        }
    }

    double nextDouble() {
        try {
            FastScanner IlIlIlIIIllIll;
            double lIIlIlIIIllIll = 1.0;
            int IIIlIlIIIllIll = IlIlIlIIIllIll.input.read();
            while ((!FastScanner.lIllIlIIIIl(IIIlIlIIIllIll, llIlllIIl[1]) || FastScanner.IlllIlIIIIl(llIlllIIl[2], IIIlIlIIIllIll)) && FastScanner.llllIlIIIIl(IIIlIlIIIllIll, llIlllIIl[3]) && FastScanner.llllIlIIIIl(IIIlIlIIIllIll, llIlllIIl[4])) {
                IIIlIlIIIllIll = IlIlIlIIIllIll.input.read();
                "".length();
                if (" ".length() << " ".length() > 0) continue;
                return 0.0;
            }
            if (FastScanner.IIIIllIIIIl(IIIlIlIIIllIll, llIlllIIl[3])) {
                lIIlIlIIIllIll = -1.0;
                IIIlIlIIIllIll = IlIlIlIIIllIll.input.read();
                "".length();
                if (" ".length() << (" ".length() << " ".length()) > " ".length() << (" ".length() << " ".length())) {
                    return 0.0;
                }
            } else if (FastScanner.IIIIllIIIIl(IIIlIlIIIllIll, llIlllIIl[4])) {
                IIIlIlIIIllIll = IlIlIlIIIllIll.input.read();
            }
            double lllIIlIIIllIll = IIIlIlIIIllIll - llIlllIIl[1];
            while (FastScanner.lIllIlIIIIl(IIIlIlIIIllIll = IlIlIlIIIllIll.input.read(), llIlllIIl[1])) {
                if (FastScanner.IlllIlIIIIl(llIlllIIl[2], IIIlIlIIIllIll)) {
                    "".length();
                    if (("   ".length() << "   ".length() & ("   ".length() << "   ".length() ^ -" ".length())) <= " ".length() << (" ".length() << " ".length())) break;
                    return 0.0;
                }
                lllIIlIIIllIll *= 10.0;
                lllIIlIIIllIll += (double)(IIIlIlIIIllIll - llIlllIIl[1]);
                "".length();
                if (" ".length() > -" ".length()) continue;
                return 0.0;
            }
            if (FastScanner.llllIlIIIIl(IIIlIlIIIllIll, llIlllIIl[6])) {
                return lIIlIlIIIllIll * lllIIlIIIllIll;
            }
            double IllIIlIIIllIll = 1.0;
            IIIlIlIIIllIll = IlIlIlIIIllIll.input.read();
            while (FastScanner.lIIIllIIIIl(llIlllIIl[1], IIIlIlIIIllIll) && FastScanner.lIIIllIIIIl(IIIlIlIIIllIll, llIlllIIl[2])) {
                lllIIlIIIllIll *= 10.0;
                lllIIlIIIllIll += (double)(IIIlIlIIIllIll - llIlllIIl[1]);
                IllIIlIIIllIll *= 10.0;
                IIIlIlIIIllIll = IlIlIlIIIllIll.input.read();
                "".length();
                if ("   ".length() != 0) continue;
                return 0.0;
            }
            return lIIlIlIIIllIll * lllIIlIIIllIll / IllIIlIIIllIll;
        }
        catch (IOException lIIlIlIIIllIll) {
            lIIlIlIIIllIll.printStackTrace();
            return Double.NaN;
        }
    }

    char nextChar() {
        try {
            FastScanner llIIIlIIIllIll;
            int IlIIIlIIIllIll = llIIIlIIIllIll.input.read();
            while (FastScanner.IlIIllIIIIl(Character.isWhitespace(IlIIIlIIIllIll) ? 1 : 0)) {
                IlIIIlIIIllIll = llIIIlIIIllIll.input.read();
                "".length();
                if (-"  ".length() <= 0) continue;
                return (char)(" ".length() << " ".length() & ~(" ".length() << " ".length()));
            }
            return (char)IlIIIlIIIllIll;
        }
        catch (IOException IlIIIlIIIllIll) {
            IlIIIlIIIllIll.printStackTrace();
            return llIlllIIl[7];
        }
    }

    String nextStr() {
        try {
            FastScanner IllllIIIIllIll;
            StringBuilder lIlllIIIIllIll = new StringBuilder();
            int IIlllIIIIllIll = IllllIIIIllIll.input.read();
            while (FastScanner.IlIIllIIIIl(Character.isWhitespace(IIlllIIIIllIll) ? 1 : 0)) {
                IIlllIIIIllIll = IllllIIIIllIll.input.read();
                "".length();
                if ((" ".length() << (" ".length() << " ".length()) & (" ".length() << (" ".length() << " ".length()) ^ -" ".length())) == 0) continue;
                return null;
            }
            while (FastScanner.llllIlIIIIl(IIlllIIIIllIll, llIlllIIl[5]) && FastScanner.llIIllIIIIl(Character.isWhitespace(IIlllIIIIllIll) ? 1 : 0)) {
                lIlllIIIIllIll.append((char)IIlllIIIIllIll);
                "".length();
                IIlllIIIIllIll = IllllIIIIllIll.input.read();
                "".length();
                if (-" ".length() <= ((0x3F ^ 0x64) & ~(0xFB ^ 0xA0))) continue;
                return null;
            }
            return String.valueOf(lIlllIIIIllIll);
        }
        catch (IOException lIlllIIIIllIll) {
            lIlllIIIIllIll.printStackTrace();
            return IlIlllIIl[llIlllIIl[7]];
        }
    }

    static {
        FastScanner.IIllIlIIIIl();
        FastScanner.llIlIlIIIIl();
    }

    private static void llIlIlIIIIl() {
        IlIlllIIl = new String[llIlllIIl[0]];
        FastScanner.IlIlllIIl[FastScanner.llIlllIIl[7]] = FastScanner.IlIlIlIIIIl("IAyg7C5dVC4=", "lfKXY");
    }

    private static String IlIlIlIIIIl(String lllIlIIIIllIll, String IllIlIIIIllIll) {
        try {
            SecretKeySpec lIlIlIIIIllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IllIlIIIIllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher IIlIlIIIIllIll = Cipher.getInstance("Blowfish");
            IIlIlIIIIllIll.init(llIlllIIl[8], lIlIlIIIIllIll);
            return new String(IIlIlIIIIllIll.doFinal(Base64.getDecoder().decode(lllIlIIIIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIlIIIIllIll) {
            llIIlIIIIllIll.printStackTrace();
            return null;
        }
    }

    private static void IIllIlIIIIl() {
        llIlllIIl = new int[9];
        FastScanner.llIlllIIl[0] = " ".length();
        FastScanner.llIlllIIl[1] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
        FastScanner.llIlllIIl[2] = (0x92 ^ 0xBF) << (" ".length() << " ".length()) ^ 42 + 91 - 98 + 106;
        FastScanner.llIlllIIl[3] = 0x99 ^ 0xB4;
        FastScanner.llIlllIIl[4] = " ".length() << (" ".length() << (" ".length() << " ".length())) ^ (0x5B ^ 0x60);
        FastScanner.llIlllIIl[5] = -" ".length();
        FastScanner.llIlllIIl[6] = ((0x39 ^ 0x62) << " ".length() ^ 32 + 7 - -91 + 31) << " ".length();
        FastScanner.llIlllIIl[7] = (0x2B ^ 0x7C ^ (0x2A ^ 0x27) << " ".length()) & ((0x29 ^ 0x32) << " ".length() ^ (0x7F ^ 4) ^ -" ".length());
        FastScanner.llIlllIIl[8] = " ".length() << " ".length();
    }

    private static boolean IIIIllIIIIl(int n, int n2) {
        return n == n2;
    }

    private static boolean lIllIlIIIIl(int n, int n2) {
        return n >= n2;
    }

    private static boolean IlllIlIIIIl(int n, int n2) {
        return n < n2;
    }

    private static boolean lIIIllIIIIl(int n, int n2) {
        return n <= n2;
    }

    private static boolean IlIIllIIIIl(int n) {
        return n != 0;
    }

    private static boolean llIIllIIIIl(int n) {
        return n == 0;
    }

    private static boolean llllIlIIIIl(int n, int n2) {
        return n != n2;
    }
}

