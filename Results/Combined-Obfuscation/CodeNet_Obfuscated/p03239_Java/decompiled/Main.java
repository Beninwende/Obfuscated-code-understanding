/*
 * Decompiled with CFR 0.152.
 */
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.NoSuchElementException;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Main {
    private static int[] IIIlIlIIIl;

    public Main() {
        Main llIllIIlIIIll;
    }

    public static void main(String[] stringArray) {
        InputStream lIlIlIIlIIIll = System.in;
        PrintStream IIlIlIIlIIIll = System.out;
        FastScanner llIIlIIlIIIll = new FastScanner(lIlIlIIlIIIll);
        PrintWriter IlIIlIIlIIIll = new PrintWriter(IIlIlIIlIIIll);
        BTimeLimitExceeded lIIIlIIlIIIll = new BTimeLimitExceeded();
        lIIIlIIlIIIll.solve(IIIlIlIIIl[0], llIIlIIlIIIll, IlIIlIIlIIIll);
        IlIIlIIlIIIll.close();
    }

    static {
        Main.lIIllIIllll();
    }

    private static void lIIllIIllll() {
        IIIlIlIIIl = new int[1];
        Main.IIIlIlIIIl[0] = " ".length();
    }

    static class FastScanner
    implements Closeable {
        private final InputStream in;
        private final byte[] buffer = new byte[llIlIlIIIl[0]];
        private int ptr = llIlIlIIIl[1];
        private int buflen = llIlIlIIIl[1];
        private static int[] llIlIlIIIl;

        public FastScanner(InputStream lIllIIIlIIIll) {
            FastScanner IlllIIIlIIIll;
            IlllIIIlIIIll.in = lIllIIIlIIIll;
        }

        private boolean hasNextByte() {
            FastScanner IlIlIIIlIIIll;
            if (FastScanner.IIlllIIllll(IlIlIIIlIIIll.ptr, IlIlIIIlIIIll.buflen)) {
                return llIlIlIIIl[2];
            }
            IlIlIIIlIIIll.ptr = llIlIlIIIl[1];
            try {
                IlIlIIIlIIIll.buflen = IlIlIIIlIIIll.in.read(IlIlIIIlIIIll.buffer);
                "".length();
            }
            catch (IOException lIIlIIIlIIIll) {
                lIIlIIIlIIIll.printStackTrace();
            }
            if (-(0x3B ^ 0x3F) >= 0) {
                return ((0x1D ^ 0xC) << " ".length() & ~((0x2C ^ 0x3D) << " ".length())) != 0;
            }
            if (FastScanner.lIlllIIllll(IlIlIIIlIIIll.buflen)) {
                return llIlIlIIIl[1];
            }
            return llIlIlIIIl[2];
        }

        private int readByte() {
            FastScanner lllIIIIlIIIll;
            if (FastScanner.IllllIIllll(lllIIIIlIIIll.hasNextByte() ? 1 : 0)) {
                int n = lllIIIIlIIIll.ptr;
                lllIIIIlIIIll.ptr = n + llIlIlIIIl[2];
                return lllIIIIlIIIll.buffer[n];
            }
            return llIlIlIIIl[3];
        }

        private static boolean isPrintableChar(int lIlIIIIlIIIll) {
            int n;
            if (FastScanner.lllllIIllll(llIlIlIIIl[4], lIlIIIIlIIIll) && FastScanner.lllllIIllll(lIlIIIIlIIIll, llIlIlIIIl[5])) {
                n = llIlIlIIIl[2];
                "".length();
                if (" ".length() << " ".length() < " ".length()) {
                    return ((0x67 ^ 0x42) << " ".length() & ~((7 ^ 0x22) << " ".length())) != 0;
                }
            } else {
                n = llIlIlIIIl[1];
            }
            return n != 0;
        }

        public boolean hasNext() {
            FastScanner llIIIIIlIIIll;
            while (FastScanner.IllllIIllll(llIIIIIlIIIll.hasNextByte() ? 1 : 0) && FastScanner.IIIIIlIllll(FastScanner.isPrintableChar(llIIIIIlIIIll.buffer[llIIIIIlIIIll.ptr]) ? 1 : 0)) {
                llIIIIIlIIIll.ptr += llIlIlIIIl[2];
                "".length();
                if ("   ".length() > -" ".length()) continue;
                return ("   ".length() << (" ".length() << " ".length()) & ~("   ".length() << (" ".length() << " ".length()))) != 0;
            }
            return this.hasNextByte();
        }

        public long nextLong() {
            FastScanner IllllllIIIIll;
            if (FastScanner.IIIIIlIllll(IllllllIIIIll.hasNext() ? 1 : 0)) {
                throw new NoSuchElementException();
            }
            long lIlllllIIIIll = 0L;
            int IIlllllIIIIll = llIlIlIIIl[1];
            int llIllllIIIIll = IllllllIIIIll.readByte();
            if (FastScanner.lIIIIlIllll(llIllllIIIIll, llIlIlIIIl[6])) {
                IIlllllIIIIll = llIlIlIIIl[2];
                llIllllIIIIll = IllllllIIIIll.readByte();
            }
            if (!FastScanner.IlIIIlIllll(llIllllIIIIll, llIlIlIIIl[7]) || FastScanner.IIlllIIllll(llIlIlIIIl[8], llIllllIIIIll)) {
                throw new NumberFormatException();
            }
            do {
                if (FastScanner.lllllIIllll(llIlIlIIIl[7], llIllllIIIIll) && FastScanner.lllllIIllll(llIllllIIIIll, llIlIlIIIl[8])) {
                    lIlllllIIIIll *= 10L;
                    lIlllllIIIIll += (long)(llIllllIIIIll - llIlIlIIIl[7]);
                    "".length();
                    if ("   ".length() < 0) {
                        return 0L;
                    }
                } else {
                    if (!FastScanner.llIIIlIllll(llIllllIIIIll, llIlIlIIIl[3]) || FastScanner.IIIIIlIllll(FastScanner.isPrintableChar(llIllllIIIIll) ? 1 : 0)) {
                        long l;
                        if (FastScanner.IllllIIllll(IIlllllIIIIll)) {
                            l = -lIlllllIIIIll;
                            "".length();
                            if (" ".length() << (" ".length() << " ".length()) <= 0) {
                                return 0L;
                            }
                        } else {
                            l = lIlllllIIIIll;
                        }
                        return l;
                    }
                    throw new NumberFormatException();
                }
                int n = this.readByte();
                "".length();
            } while (null == null);
            return 0L;
        }

        /*
         * WARNING - void declaration
         */
        public int nextInt() {
            void var1_1;
            FastScanner IIIllllIIIIll;
            long lllIlllIIIIll = IIIllllIIIIll.nextLong();
            if (!FastScanner.lIlIIlIllll(FastScanner.IIlIIlIllll(lllIlllIIIIll, Integer.MIN_VALUE)) || FastScanner.IllIIlIllll(FastScanner.IIlIIlIllll(lllIlllIIIIll, Integer.MAX_VALUE))) {
                throw new NumberFormatException();
            }
            return (int)var1_1;
        }

        @Override
        public void close() {
            try {
                FastScanner IIlIlllIIIIll;
                IIlIlllIIIIll.in.close();
                "".length();
            }
            catch (IOException llIIlllIIIIll) {
                llIIlllIIIIll.printStackTrace();
            }
            if (((0x33 ^ 0x10) << " ".length() & ~((0xAF ^ 0x8C) << " ".length())) != 0) {
                return;
            }
        }

        static {
            FastScanner.llIllIIllll();
        }

        private static void llIllIIllll() {
            llIlIlIIIl = new int[9];
            FastScanner.llIlIlIIIl[0] = " ".length() << ((0x8A ^ 0x8F) << " ".length());
            FastScanner.llIlIlIIIl[1] = (0x5B ^ 0x7E) & ~(0x69 ^ 0x4C);
            FastScanner.llIlIlIIIl[2] = " ".length();
            FastScanner.llIlIlIIIl[3] = -" ".length();
            FastScanner.llIlIlIIIl[4] = 0x5C ^ 0x5B ^ (0x44 ^ 0x57) << " ".length();
            FastScanner.llIlIlIIIl[5] = (0x9C ^ 0xA3) << " ".length();
            FastScanner.llIlIlIIIl[6] = 2 ^ 0x2F;
            FastScanner.llIlIlIIIl[7] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
            FastScanner.llIlIlIIIl[8] = 0x4C ^ 0x75;
        }

        private static boolean lIIIIlIllll(int n, int n2) {
            return n == n2;
        }

        private static boolean IlIIIlIllll(int n, int n2) {
            return n >= n2;
        }

        private static boolean IIlllIIllll(int n, int n2) {
            return n < n2;
        }

        private static boolean lllllIIllll(int n, int n2) {
            return n <= n2;
        }

        private static boolean IllllIIllll(int n) {
            return n != 0;
        }

        private static boolean IIIIIlIllll(int n) {
            return n == 0;
        }

        private static boolean lIlIIlIllll(int n) {
            return n >= 0;
        }

        private static boolean lIlllIIllll(int n) {
            return n <= 0;
        }

        private static boolean IllIIlIllll(int n) {
            return n > 0;
        }

        private static boolean llIIIlIllll(int n, int n2) {
            return n != n2;
        }

        private static int IIlIIlIllll(long l, long l2) {
            return l == l2 ? 0 : (l < l2 ? -1 : 1);
        }
    }

    static class BTimeLimitExceeded {
        private static String[] lIIlIlIIIl;
        private static int[] IIllIlIIIl;

        BTimeLimitExceeded() {
            BTimeLimitExceeded llIIlIlIIIIll;
        }

        public void solve(int n, FastScanner IlIlIIlIIIIll, PrintWriter lIIlIIlIIIIll) {
            int IIIlIIlIIIIll = IlIlIIlIIIIll.nextInt();
            int lllIIIlIIIIll = IlIlIIlIIIIll.nextInt();
            int IllIIIlIIIIll = IIllIlIIIl[0];
            int lIlIIIlIIIIll = IIllIlIIIl[1];
            while (BTimeLimitExceeded.lIIlIlIllll(lIlIIIlIIIIll, IIIlIIlIIIIll)) {
                int IIlIIIlIIIIll = IlIlIIlIIIIll.nextInt();
                int llIIIIlIIIIll = IlIlIIlIIIIll.nextInt();
                if (BTimeLimitExceeded.IlIlIlIllll(llIIIIlIIIIll, lllIIIlIIIIll)) {
                    IllIIIlIIIIll = Math.min(IllIIIlIIIIll, IIlIIIlIIIIll);
                }
                ++lIlIIIlIIIIll;
                "".length();
                if ((("   ".length() << (0x1A ^ 0x1F) ^ (0x36 ^ 0x5F)) << " ".length() & ((0x5A ^ 0x57 ^ " ".length() << (" ".length() << " ".length())) << " ".length() ^ -" ".length())) <= (("   ".length() << " ".length() ^ (0x39 ^ 0x68)) & (7 ^ 0x3C ^ (0xA4 ^ 0xBF) << (" ".length() << " ".length()) ^ -" ".length()))) continue;
                return;
            }
            if (BTimeLimitExceeded.llIlIlIllll(IllIIIlIIIIll, IIllIlIIIl[2])) {
                lIIlIIlIIIIll.println(lIIlIlIIIl[IIllIlIIIl[1]]);
                "".length();
                if ("   ".length() > " ".length() << (" ".length() << " ".length())) {
                    return;
                }
            } else {
                lIIlIIlIIIIll.println(IllIIIlIIIIll);
            }
        }

        static {
            BTimeLimitExceeded.IIIlIlIllll();
            BTimeLimitExceeded.lllIIlIllll();
        }

        private static void lllIIlIllll() {
            lIIlIlIIIl = new String[IIllIlIIIl[3]];
            BTimeLimitExceeded.lIIlIlIIIl[BTimeLimitExceeded.IIllIlIIIl[1]] = BTimeLimitExceeded.IlIllIIllll("+jvqZcxglGM=", "UZjVI");
        }

        private static String IlIllIIllll(String IlllllIIIIIll, String lIllllIIIIIll) {
            try {
                SecretKeySpec IIllllIIIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIllllIIIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                Cipher llIlllIIIIIll = Cipher.getInstance("Blowfish");
                llIlllIIIIIll.init(IIllIlIIIl[4], IIllllIIIIIll);
                return new String(llIlllIIIIIll.doFinal(Base64.getDecoder().decode(IlllllIIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception IlIlllIIIIIll) {
                IlIlllIIIIIll.printStackTrace();
                return null;
            }
        }

        private static void IIIlIlIllll() {
            IIllIlIIIl = new int[5];
            BTimeLimitExceeded.IIllIlIIIl[0] = 5283 + 2056 - 1875 + 4537;
            BTimeLimitExceeded.IIllIlIIIl[1] = (0x6A ^ 0x6D) << (" ".length() << " ".length()) & ~((0x13 ^ 0x14) << (" ".length() << " ".length()));
            BTimeLimitExceeded.IIllIlIIIl[2] = (0xB9 ^ 0xC4) << "   ".length();
            BTimeLimitExceeded.IIllIlIIIl[3] = " ".length();
            BTimeLimitExceeded.IIllIlIIIl[4] = " ".length() << " ".length();
        }

        private static boolean lIIlIlIllll(int n, int n2) {
            return n < n2;
        }

        private static boolean IlIlIlIllll(int n, int n2) {
            return n <= n2;
        }

        private static boolean llIlIlIllll(int n, int n2) {
            return n > n2;
        }
    }
}

