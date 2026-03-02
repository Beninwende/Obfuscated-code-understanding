/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Main {
    static final FastScanner sc;
    static PrintWriter writer;
    private static int[] IIIlIIIll;

    public Main() {
        Main IIlIlllIIIllIl;
    }

    public static void main(String[] stringArray) {
        int lIllIllIIIllIl = sc.nextInt();
        int IIllIllIIIllIl = sc.nextInt();
        int[] llIlIllIIIllIl = new int[lIllIllIIIllIl];
        int IlIlIllIIIllIl = IIIlIIIll[0];
        while (Main.lIlllIlIlIl(IlIlIllIIIllIl, lIllIllIIIllIl)) {
            llIlIllIIIllIl[IlIlIllIIIllIl] = sc.nextInt();
            ++IlIlIllIIIllIl;
            "".length();
            if (" ".length() > -" ".length()) continue;
            return;
        }
        IlIlIllIIIllIl = IIIlIIIll[0];
        int lIIlIllIIIllIl = IIIlIIIll[1];
        int IIIlIllIIIllIl = IIIlIIIll[0];
        while (Main.lIlllIlIlIl(IIIlIllIIIllIl, lIllIllIIIllIl)) {
            if (Main.IllllIlIlIl(IlIlIllIIIllIl += llIlIllIIIllIl[IIIlIllIIIllIl], IIllIllIIIllIl)) {
                "".length();
                if (" ".length() << (" ".length() << " ".length()) > 0) break;
                return;
            }
            ++lIIlIllIIIllIl;
            ++IIIlIllIIIllIl;
            "".length();
            if (null == null) continue;
            return;
        }
        writer.println(lIIlIllIIIllIl);
        writer.flush();
    }

    static {
        Main.IIlllIlIlIl();
        sc = new FastScanner(System.in);
        writer = new PrintWriter(System.out);
    }

    private static void IIlllIlIlIl() {
        IIIlIIIll = new int[2];
        Main.IIIlIIIll[0] = (0xF ^ 0x32) & ~(0x5D ^ 0x60);
        Main.IIIlIIIll[1] = " ".length();
    }

    private static boolean lIlllIlIlIl(int n, int n2) {
        return n < n2;
    }

    private static boolean IllllIlIlIl(int n, int n2) {
        return n > n2;
    }

    static class FastScanner {
        Reader input;
        private static String[] lIIlIIIll;
        private static int[] IlIlIIIll;

        FastScanner() {
            IllllIlIIIllIl(System.in);
            FastScanner IllllIlIIIllIl;
        }

        FastScanner(InputStream IlIllIlIIIllIl) {
            FastScanner llIllIlIIIllIl;
            llIllIlIIIllIl.input = new BufferedReader(new InputStreamReader(IlIllIlIIIllIl));
        }

        int nextInt() {
            FastScanner IIIllIlIIIllIl;
            return (int)IIIllIlIIIllIl.nextLong();
        }

        long nextLong() {
            try {
                FastScanner llIIlIlIIIllIl;
                int IlIIlIlIIIllIl = IlIlIIIll[0];
                int lIIIlIlIIIllIl = llIIlIlIIIllIl.input.read();
                while ((!FastScanner.IlIIIllIlIl(lIIIlIlIIIllIl, IlIlIIIll[1]) || FastScanner.llIIIllIlIl(IlIlIIIll[2], lIIIlIlIIIllIl)) && FastScanner.IIlIIllIlIl(lIIIlIlIIIllIl, IlIlIIIll[3]) && FastScanner.IIlIIllIlIl(lIIIlIlIIIllIl, IlIlIIIll[4])) {
                    lIIIlIlIIIllIl = llIIlIlIIIllIl.input.read();
                    "".length();
                    if (((0xBB ^ 0x84 ^ (0x9F ^ 0x86) << " ".length()) << " ".length() & ((0x97 ^ 0xAA ^ "   ".length() << (" ".length() << (" ".length() << " ".length()))) << " ".length() ^ -" ".length())) == 0) continue;
                    return 0L;
                }
                if (FastScanner.lIlIIllIlIl(lIIIlIlIIIllIl, IlIlIIIll[3])) {
                    IlIIlIlIIIllIl = IlIlIIIll[5];
                    lIIIlIlIIIllIl = llIIlIlIIIllIl.input.read();
                    "".length();
                    if ("   ".length() < 0) {
                        return 0L;
                    }
                } else if (FastScanner.lIlIIllIlIl(lIIIlIlIIIllIl, IlIlIIIll[4])) {
                    lIIIlIlIIIllIl = llIIlIlIIIllIl.input.read();
                }
                long IIIIlIlIIIllIl = lIIIlIlIIIllIl - IlIlIIIll[1];
                do {
                    if (!FastScanner.IlIIIllIlIl(lIIIlIlIIIllIl = llIIlIlIIIllIl.input.read(), IlIlIIIll[1]) || FastScanner.llIIIllIlIl(IlIlIIIll[2], lIIIlIlIIIllIl)) {
                        return IIIIlIlIIIllIl * (long)IlIIlIlIIIllIl;
                    }
                    IIIIlIlIIIllIl *= 10L;
                    IIIIlIlIIIllIl += (long)(lIIIlIlIIIllIl - IlIlIIIll[1]);
                    "".length();
                } while (" ".length() << (" ".length() << " ".length()) == " ".length() << (" ".length() << " ".length()));
                return 0L;
            }
            catch (IOException IlIIlIlIIIllIl) {
                IlIIlIlIIIllIl.printStackTrace();
                return -1L;
            }
        }

        double nextDouble() {
            try {
                FastScanner IlIlIIlIIIllIl;
                double lIIlIIlIIIllIl = 1.0;
                int IIIlIIlIIIllIl = IlIlIIlIIIllIl.input.read();
                while ((!FastScanner.IlIIIllIlIl(IIIlIIlIIIllIl, IlIlIIIll[1]) || FastScanner.llIIIllIlIl(IlIlIIIll[2], IIIlIIlIIIllIl)) && FastScanner.IIlIIllIlIl(IIIlIIlIIIllIl, IlIlIIIll[3]) && FastScanner.IIlIIllIlIl(IIIlIIlIIIllIl, IlIlIIIll[4])) {
                    IIIlIIlIIIllIl = IlIlIIlIIIllIl.input.read();
                    "".length();
                    if ("   ".length() != 0) continue;
                    return 0.0;
                }
                if (FastScanner.lIlIIllIlIl(IIIlIIlIIIllIl, IlIlIIIll[3])) {
                    lIIlIIlIIIllIl = -1.0;
                    IIIlIIlIIIllIl = IlIlIIlIIIllIl.input.read();
                    "".length();
                    if (" ".length() << (" ".length() << " ".length()) != " ".length() << (" ".length() << " ".length())) {
                        return 0.0;
                    }
                } else if (FastScanner.lIlIIllIlIl(IIIlIIlIIIllIl, IlIlIIIll[4])) {
                    IIIlIIlIIIllIl = IlIlIIlIIIllIl.input.read();
                }
                double lllIIIlIIIllIl = IIIlIIlIIIllIl - IlIlIIIll[1];
                while (FastScanner.IlIIIllIlIl(IIIlIIlIIIllIl = IlIlIIlIIIllIl.input.read(), IlIlIIIll[1])) {
                    if (FastScanner.llIIIllIlIl(IlIlIIIll[2], IIIlIIlIIIllIl)) {
                        "".length();
                        if (" ".length() <= " ".length() << " ".length()) break;
                        return 0.0;
                    }
                    lllIIIlIIIllIl *= 10.0;
                    lllIIIlIIIllIl += (double)(IIIlIIlIIIllIl - IlIlIIIll[1]);
                    "".length();
                    if (-" ".length() <= 0) continue;
                    return 0.0;
                }
                if (FastScanner.IIlIIllIlIl(IIIlIIlIIIllIl, IlIlIIIll[6])) {
                    return lIIlIIlIIIllIl * lllIIIlIIIllIl;
                }
                double IllIIIlIIIllIl = 1.0;
                IIIlIIlIIIllIl = IlIlIIlIIIllIl.input.read();
                while (FastScanner.IllIIllIlIl(IlIlIIIll[1], IIIlIIlIIIllIl) && FastScanner.IllIIllIlIl(IIIlIIlIIIllIl, IlIlIIIll[2])) {
                    lllIIIlIIIllIl *= 10.0;
                    lllIIIlIIIllIl += (double)(IIIlIIlIIIllIl - IlIlIIIll[1]);
                    IllIIIlIIIllIl *= 10.0;
                    IIIlIIlIIIllIl = IlIlIIlIIIllIl.input.read();
                    "".length();
                    if ("   ".length() <= " ".length() << (" ".length() << " ".length())) continue;
                    return 0.0;
                }
                return lIIlIIlIIIllIl * lllIIIlIIIllIl / IllIIIlIIIllIl;
            }
            catch (IOException lIIlIIlIIIllIl) {
                lIIlIIlIIIllIl.printStackTrace();
                return Double.NaN;
            }
        }

        char nextChar() {
            try {
                FastScanner llIIIIlIIIllIl;
                int IlIIIIlIIIllIl = llIIIIlIIIllIl.input.read();
                while (FastScanner.lllIIllIlIl(Character.isWhitespace(IlIIIIlIIIllIl) ? 1 : 0)) {
                    IlIIIIlIIIllIl = llIIIIlIIIllIl.input.read();
                    "".length();
                    if ("   ".length() >= 0) continue;
                    return (char)(((0x16 ^ 0x2F) << " ".length() ^ (0x1C ^ 0x73)) & (162 + 53 - 123 + 79 ^ (0x1F ^ 0x44) << " ".length() ^ -" ".length()));
                }
                return (char)IlIIIIlIIIllIl;
            }
            catch (IOException IlIIIIlIIIllIl) {
                IlIIIIlIIIllIl.printStackTrace();
                return IlIlIIIll[7];
            }
        }

        String nextStr() {
            try {
                FastScanner IlllllIIIIllIl;
                StringBuilder lIllllIIIIllIl = new StringBuilder();
                int IIllllIIIIllIl = IlllllIIIIllIl.input.read();
                while (FastScanner.lllIIllIlIl(Character.isWhitespace(IIllllIIIIllIl) ? 1 : 0)) {
                    IIllllIIIIllIl = IlllllIIIIllIl.input.read();
                    "".length();
                    if ("   ".length() > 0) continue;
                    return null;
                }
                while (FastScanner.IIlIIllIlIl(IIllllIIIIllIl, IlIlIIIll[5]) && FastScanner.IIIlIllIlIl(Character.isWhitespace(IIllllIIIIllIl) ? 1 : 0)) {
                    lIllllIIIIllIl.append((char)IIllllIIIIllIl);
                    "".length();
                    IIllllIIIIllIl = IlllllIIIIllIl.input.read();
                    "".length();
                    if (((0xA7 ^ 0x8E ^ (0x98 ^ 0x83) << (" ".length() << " ".length())) & (69 + 152 - 52 + 34 ^ (0x47 ^ 0) << " ".length() ^ -" ".length())) == 0) continue;
                    return null;
                }
                return String.valueOf(lIllllIIIIllIl);
            }
            catch (IOException lIllllIIIIllIl) {
                lIllllIIIIllIl.printStackTrace();
                return lIIlIIIll[IlIlIIIll[7]];
            }
        }

        static {
            FastScanner.lIIIIllIlIl();
            FastScanner.IIIIIllIlIl();
        }

        private static void IIIIIllIlIl() {
            lIIlIIIll = new String[IlIlIIIll[0]];
            FastScanner.lIIlIIIll[FastScanner.IlIlIIIll[7]] = FastScanner.lllllIlIlIl("kMJChAeaXVk=", "aeTOt");
        }

        private static String lllllIlIlIl(String lllIllIIIIllIl, String IllIllIIIIllIl) {
            try {
                SecretKeySpec lIlIllIIIIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IllIllIIIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                Cipher IIlIllIIIIllIl = Cipher.getInstance("Blowfish");
                IIlIllIIIIllIl.init(IlIlIIIll[8], lIlIllIIIIllIl);
                return new String(IIlIllIIIIllIl.doFinal(Base64.getDecoder().decode(lllIllIIIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llIIllIIIIllIl) {
                llIIllIIIIllIl.printStackTrace();
                return null;
            }
        }

        private static void lIIIIllIlIl() {
            IlIlIIIll = new int[9];
            FastScanner.IlIlIIIll[0] = " ".length();
            FastScanner.IlIlIIIll[1] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
            FastScanner.IlIlIIIll[2] = 0xB9 ^ 0x80;
            FastScanner.IlIlIIIll[3] = (0x3C ^ 0x3B) << "   ".length() ^ (0x68 ^ 0x7D);
            FastScanner.IlIlIIIll[4] = 0x3C ^ 0x17;
            FastScanner.IlIlIIIll[5] = -" ".length();
            FastScanner.IlIlIIIll[6] = (0xB8 ^ 0xAF) << " ".length();
            FastScanner.IlIlIIIll[7] = "   ".length() << (" ".length() << " ".length()) & ("   ".length() << (" ".length() << " ".length()) ^ -" ".length());
            FastScanner.IlIlIIIll[8] = " ".length() << " ".length();
        }

        private static boolean lIlIIllIlIl(int n, int n2) {
            return n == n2;
        }

        private static boolean IlIIIllIlIl(int n, int n2) {
            return n >= n2;
        }

        private static boolean llIIIllIlIl(int n, int n2) {
            return n < n2;
        }

        private static boolean IllIIllIlIl(int n, int n2) {
            return n <= n2;
        }

        private static boolean lllIIllIlIl(int n) {
            return n != 0;
        }

        private static boolean IIIlIllIlIl(int n) {
            return n == 0;
        }

        private static boolean IIlIIllIlIl(int n, int n2) {
            return n != n2;
        }
    }
}

