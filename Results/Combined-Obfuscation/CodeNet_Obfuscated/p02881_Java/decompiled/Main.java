/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.InputMismatchException;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Main {
    public Main() {
        Main IllIlIIllllllll;
    }

    public static void main(String[] stringArray) {
        InputStream lIllIIIllllllll = System.in;
        PrintStream IIllIIIllllllll = System.out;
        FastReader llIlIIIllllllll = new FastReader(lIllIIIllllllll);
        PrintWriter IlIlIIIllllllll = new PrintWriter(IIllIIIllllllll);
        long lllIIIIllllllll = 0L;
        long lIIlIIIllllllll = llIlIIIllllllll.nextLong();
        long IllIIIIllllllll = lIIlIIIllllllll - 1L;
        long IIIlIIIllllllll = 1L;
        while (Main.llIllIlIIlIl(Main.IlIllIlIIlIl(IIIlIIIllllllll, (int)Math.pow(lIIlIIIllllllll, 0.5)))) {
            lllIIIIllllllll = lIIlIIIllllllll / IIIlIIIllllllll;
            if (Main.IIlllIlIIlIl(Main.IlIllIlIIlIl(lIIlIIIllllllll, lllIIIIllllllll * IIIlIIIllllllll)) && Main.lIlllIlIIlIl(Main.IlIllIlIIlIl(IllIIIIllllllll, IIIlIIIllllllll + lllIIIIllllllll - 2L))) {
                IllIIIIllllllll = IIIlIIIllllllll + lllIIIIllllllll - 2L;
            }
            ++IIIlIIIllllllll;
            "".length();
            if (" ".length() >= -" ".length()) continue;
            return;
        }
        IlIlIIIllllllll.println(IllIIIIllllllll);
        IlIlIIIllllllll.close();
    }

    private static boolean IIlllIlIIlIl(int n) {
        return n == 0;
    }

    private static boolean llIllIlIIlIl(int n) {
        return n <= 0;
    }

    private static boolean lIlllIlIIlIl(int n) {
        return n > 0;
    }

    private static int IlIllIlIIlIl(long l, long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    public static class FastReader {
        private InputStream stream;
        private byte[] buf = new byte[IIIIIlllIl[0]];
        private int curChar;
        private int numChars;
        private SpaceCharFilter filter;
        private static String[] lllllIllIl;
        private static int[] IIIIIlllIl;

        public FastReader(InputStream IIlllllIlllllll) {
            FastReader lIlllllIlllllll;
            lIlllllIlllllll.stream = IIlllllIlllllll;
        }

        public int read() {
            block5: {
                FastReader lIIllllIlllllll;
                if (FastReader.IIlIIllIIlIl(lIIllllIlllllll.numChars, IIIIIlllIl[1])) {
                    throw new InputMismatchException();
                }
                if (!FastReader.lIlIIllIIlIl(lIIllllIlllllll.curChar, lIIllllIlllllll.numChars)) break block5;
                lIIllllIlllllll.curChar = IIIIIlllIl[2];
                try {
                    lIIllllIlllllll.numChars = lIIllllIlllllll.stream.read(lIIllllIlllllll.buf);
                    "".length();
                }
                catch (IOException IIIllllIlllllll) {
                    throw new InputMismatchException();
                }
                if (" ".length() << (" ".length() << " ".length()) == 0) {
                    return ((0x12 ^ 0x17) << " ".length() ^ (0xB9 ^ 0xAE)) & (51 + 112 - 157 + 161 ^ (0x44 ^ 0x19) << " ".length() ^ -" ".length());
                }
                if (FastReader.IllIIllIIlIl(lIIllllIlllllll.numChars)) {
                    return IIIIIlllIl[1];
                }
            }
            int n = this.curChar;
            this.curChar = n + IIIIIlllIl[3];
            return this.buf[n];
        }

        /*
         * WARNING - void declaration
         */
        public String nextLine() {
            void var2_2;
            BufferedReader IIlIlllIlllllll = new BufferedReader(new InputStreamReader(System.in));
            String llIIlllIlllllll = lllllIllIl[IIIIIlllIl[2]];
            try {
                llIIlllIlllllll = IIlIlllIlllllll.readLine();
                "".length();
            }
            catch (IOException IlIIlllIlllllll) {
                IlIIlllIlllllll.printStackTrace();
            }
            if (-(0x5F ^ 0x5B) > 0) {
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        public int nextInt() {
            void var2_2;
            void var3_3;
            FastReader lIllIllIlllllll;
            int IIllIllIlllllll = lIllIllIlllllll.read();
            while (FastReader.lllIIllIIlIl(lIllIllIlllllll.isSpaceChar(IIllIllIlllllll) ? 1 : 0)) {
                IIllIllIlllllll = lIllIllIlllllll.read();
                "".length();
                if (null == null) continue;
                return ("   ".length() << (" ".length() << (" ".length() << " ".length())) ^ (0x50 ^ 0x65)) & ((0xB7 ^ 0xA0) << (" ".length() << " ".length()) ^ (0xC0 ^ 0x99) ^ -" ".length());
            }
            int llIlIllIlllllll = IIIIIlllIl[3];
            if (FastReader.IIlIIllIIlIl(IIllIllIlllllll, IIIIIlllIl[4])) {
                llIlIllIlllllll = IIIIIlllIl[1];
                IIllIllIlllllll = lIllIllIlllllll.read();
            }
            int IlIlIllIlllllll = IIIIIlllIl[2];
            do {
                if (!FastReader.lIlIIllIIlIl(IIllIllIlllllll, IIIIIlllIl[5]) || FastReader.IIIlIllIIlIl(IIllIllIlllllll, IIIIIlllIl[6])) {
                    throw new InputMismatchException();
                }
                IlIlIllIlllllll *= IIIIIlllIl[7];
                IlIlIllIlllllll += IIllIllIlllllll - IIIIIlllIl[5];
            } while (!FastReader.lllIIllIIlIl(lIllIllIlllllll.isSpaceChar(IIllIllIlllllll = lIllIllIlllllll.read()) ? 1 : 0));
            return (int)(var3_3 * var2_2);
        }

        /*
         * WARNING - void declaration
         */
        public long nextLong() {
            void var2_2;
            void var3_3;
            FastReader lIlIIllIlllllll;
            int IIlIIllIlllllll = lIlIIllIlllllll.read();
            while (FastReader.lllIIllIIlIl(lIlIIllIlllllll.isSpaceChar(IIlIIllIlllllll) ? 1 : 0)) {
                IIlIIllIlllllll = lIlIIllIlllllll.read();
                "".length();
                if (-"   ".length() <= 0) continue;
                return 0L;
            }
            int llIIIllIlllllll = IIIIIlllIl[3];
            if (FastReader.IIlIIllIIlIl(IIlIIllIlllllll, IIIIIlllIl[4])) {
                llIIIllIlllllll = IIIIIlllIl[1];
                IIlIIllIlllllll = lIlIIllIlllllll.read();
            }
            long IlIIIllIlllllll = 0L;
            do {
                if (!FastReader.lIlIIllIIlIl(IIlIIllIlllllll, IIIIIlllIl[5]) || FastReader.IIIlIllIIlIl(IIlIIllIlllllll, IIIIIlllIl[6])) {
                    throw new InputMismatchException();
                }
                IlIIIllIlllllll *= 10L;
                IlIIIllIlllllll += (long)(IIlIIllIlllllll - IIIIIlllIl[5]);
            } while (!FastReader.lllIIllIIlIl(lIlIIllIlllllll.isSpaceChar(IIlIIllIlllllll = lIlIIllIlllllll.read()) ? 1 : 0));
            return (long)(var3_3 * (long)var2_2);
        }

        /*
         * WARNING - void declaration
         */
        public double nextDouble() {
            void var2_2;
            void var3_3;
            FastReader IIlllIlIlllllll;
            int llIllIlIlllllll = IIlllIlIlllllll.read();
            while (FastReader.lllIIllIIlIl(IIlllIlIlllllll.isSpaceChar(llIllIlIlllllll) ? 1 : 0)) {
                llIllIlIlllllll = IIlllIlIlllllll.read();
                "".length();
                if (-"   ".length() < 0) continue;
                return 0.0;
            }
            int IlIllIlIlllllll = IIIIIlllIl[3];
            if (FastReader.IIlIIllIIlIl(llIllIlIlllllll, IIIIIlllIl[4])) {
                IlIllIlIlllllll = IIIIIlllIl[1];
                llIllIlIlllllll = IIlllIlIlllllll.read();
            }
            double lIIllIlIlllllll = 0.0;
            while (FastReader.lIIlIllIIlIl(IIlllIlIlllllll.isSpaceChar(llIllIlIlllllll) ? 1 : 0) && FastReader.IlIlIllIIlIl(llIllIlIlllllll, IIIIIlllIl[8])) {
                if (!FastReader.IlIlIllIIlIl(llIllIlIlllllll, IIIIIlllIl[9]) || FastReader.IIlIIllIIlIl(llIllIlIlllllll, IIIIIlllIl[10])) {
                    return lIIllIlIlllllll * Math.pow(10.0, IIlllIlIlllllll.nextInt());
                }
                if (!FastReader.lIlIIllIIlIl(llIllIlIlllllll, IIIIIlllIl[5]) || FastReader.IIIlIllIIlIl(llIllIlIlllllll, IIIIIlllIl[6])) {
                    throw new InputMismatchException();
                }
                lIIllIlIlllllll *= 10.0;
                lIIllIlIlllllll += (double)(llIllIlIlllllll - IIIIIlllIl[5]);
                llIllIlIlllllll = IIlllIlIlllllll.read();
                "".length();
                if (-(0x93 ^ 0x97) <= 0) continue;
                return 0.0;
            }
            if (FastReader.IIlIIllIIlIl(llIllIlIlllllll, IIIIIlllIl[8])) {
                llIllIlIlllllll = IIlllIlIlllllll.read();
                double IIIllIlIlllllll = 1.0;
                while (FastReader.lIIlIllIIlIl(IIlllIlIlllllll.isSpaceChar(llIllIlIlllllll) ? 1 : 0)) {
                    if (!FastReader.IlIlIllIIlIl(llIllIlIlllllll, IIIIIlllIl[9]) || FastReader.IIlIIllIIlIl(llIllIlIlllllll, IIIIIlllIl[10])) {
                        return lIIllIlIlllllll * Math.pow(10.0, IIlllIlIlllllll.nextInt());
                    }
                    if (!FastReader.lIlIIllIIlIl(llIllIlIlllllll, IIIIIlllIl[5]) || FastReader.IIIlIllIIlIl(llIllIlIlllllll, IIIIIlllIl[6])) {
                        throw new InputMismatchException();
                    }
                    lIIllIlIlllllll += (double)(llIllIlIlllllll - IIIIIlllIl[5]) * (IIIllIlIlllllll /= 10.0);
                    llIllIlIlllllll = IIlllIlIlllllll.read();
                    "".length();
                    if (" ".length() << " ".length() == " ".length() << " ".length()) continue;
                    return 0.0;
                }
            }
            return (double)(var3_3 * (double)var2_2);
        }

        /*
         * WARNING - void declaration
         */
        public char nextChar() {
            void var1_1;
            FastReader lIlIlIlIlllllll;
            int IIlIlIlIlllllll = lIlIlIlIlllllll.read();
            while (FastReader.lllIIllIIlIl(lIlIlIlIlllllll.isSpaceChar(IIlIlIlIlllllll) ? 1 : 0)) {
                IIlIlIlIlllllll = lIlIlIlIlllllll.read();
                "".length();
                if (-"  ".length() <= 0) continue;
                return (char)((0x9F ^ 0xB4) << " ".length() & ~((0xAB ^ 0x80) << " ".length()));
            }
            return (char)var1_1;
        }

        /*
         * WARNING - void declaration
         */
        public String next() {
            void var2_2;
            FastReader IIIIlIlIlllllll;
            int llllIIlIlllllll = IIIIlIlIlllllll.read();
            while (FastReader.lllIIllIIlIl(IIIIlIlIlllllll.isSpaceChar(llllIIlIlllllll) ? 1 : 0)) {
                llllIIlIlllllll = IIIIlIlIlllllll.read();
                "".length();
                if ("   ".length() >= 0) continue;
                return null;
            }
            StringBuilder IlllIIlIlllllll = new StringBuilder();
            do {
                IlllIIlIlllllll.appendCodePoint(llllIIlIlllllll);
                "".length();
            } while (!FastReader.lllIIllIIlIl(IIIIlIlIlllllll.isSpaceChar(llllIIlIlllllll = IIIIlIlIlllllll.read()) ? 1 : 0));
            return String.valueOf(var2_2);
        }

        public boolean isSpaceChar(int IlIlIIlIlllllll) {
            int n;
            FastReader llIlIIlIlllllll;
            if (FastReader.llIlIllIIlIl(llIlIIlIlllllll.filter)) {
                return llIlIIlIlllllll.filter.isSpaceChar(IlIlIIlIlllllll);
            }
            if (!(FastReader.IlIlIllIIlIl(IlIlIIlIlllllll, IIIIIlllIl[11]) && FastReader.IlIlIllIIlIl(IlIlIIlIlllllll, IIIIIlllIl[7]) && FastReader.IlIlIllIIlIl(IlIlIIlIlllllll, IIIIIlllIl[12]) && FastReader.IlIlIllIIlIl(IlIlIIlIlllllll, IIIIIlllIl[13]) && !FastReader.IIlIIllIIlIl(IlIlIIlIlllllll, IIIIIlllIl[1]))) {
                n = IIIIIlllIl[3];
                "".length();
                if (null != null) {
                    return ((0x35 ^ 0x5C ^ (0x8B ^ 0x90) << (" ".length() << " ".length())) << "   ".length() & (((0x2D ^ 0xC) << " ".length() ^ (0xE ^ 0x49)) << "   ".length() ^ -" ".length())) != 0;
                }
            } else {
                n = IIIIIlllIl[2];
            }
            return n != 0;
        }

        static {
            FastReader.llIIIllIIlIl();
            FastReader.IlIIIllIIlIl();
        }

        private static void IlIIIllIIlIl() {
            lllllIllIl = new String[IIIIIlllIl[3]];
            FastReader.lllllIllIl[FastReader.IIIIIlllIl[2]] = FastReader.lIIIIllIIlIl("zF0hqTm0fYw=", "kuoQB");
        }

        private static String lIIIIllIIlIl(String lIlIIIlIlllllll, String IIlIIIlIlllllll) {
            try {
                SecretKeySpec llIIIIlIlllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IIlIIIlIlllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                Cipher IlIIIIlIlllllll = Cipher.getInstance("Blowfish");
                IlIIIIlIlllllll.init(IIIIIlllIl[14], llIIIIlIlllllll);
                return new String(IlIIIIlIlllllll.doFinal(Base64.getDecoder().decode(lIlIIIlIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lIIIIIlIlllllll) {
                lIIIIIlIlllllll.printStackTrace();
                return null;
            }
        }

        private static void llIIIllIIlIl() {
            IIIIIlllIl = new int[15];
            FastReader.IIIIIlllIl[0] = " ".length() << ((0x4D ^ 0x48) << " ".length());
            FastReader.IIIIIlllIl[1] = -" ".length();
            FastReader.IIIIIlllIl[2] = (39 + 76 - -48 + 20 ^ (0x38 ^ 0x11) << (" ".length() << " ".length())) << " ".length() & ((207 + 27 - 144 + 125 ^ (0x33 ^ 2) << (" ".length() << " ".length())) << " ".length() ^ -" ".length());
            FastReader.IIIIIlllIl[3] = " ".length();
            FastReader.IIIIIlllIl[4] = 0x1F ^ 0x32;
            FastReader.IIIIIlllIl[5] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
            FastReader.IIIIIlllIl[6] = 0x6D ^ 0x22 ^ (0x87 ^ 0xBC) << " ".length();
            FastReader.IIIIIlllIl[7] = (0x74 ^ 0x71) << " ".length();
            FastReader.IIIIIlllIl[8] = (0x5D ^ 0x42 ^ " ".length() << "   ".length()) << " ".length();
            FastReader.IIIIIlllIl[9] = 0x75 ^ 0x3C ^ (0x72 ^ 0x79) << (" ".length() << " ".length());
            FastReader.IIIIIlllIl[10] = (0x79 ^ 2) << " ".length() ^ 92 + 118 - 133 + 102;
            FastReader.IIIIIlllIl[11] = " ".length() << (0x24 ^ 0x21);
            FastReader.IIIIIlllIl[12] = 0x78 ^ 0x75;
            FastReader.IIIIIlllIl[13] = 15 + 107 - 78 + 135 ^ (0xF3 ^ 0xAE) << " ".length();
            FastReader.IIIIIlllIl[14] = " ".length() << " ".length();
        }

        private static boolean IIlIIllIIlIl(int n, int n2) {
            return n == n2;
        }

        private static boolean lIlIIllIIlIl(int n, int n2) {
            return n >= n2;
        }

        private static boolean IIIlIllIIlIl(int n, int n2) {
            return n > n2;
        }

        private static boolean llIlIllIIlIl(Object object) {
            return object != null;
        }

        private static boolean lllIIllIIlIl(int n) {
            return n != 0;
        }

        private static boolean lIIlIllIIlIl(int n) {
            return n == 0;
        }

        private static boolean IllIIllIIlIl(int n) {
            return n <= 0;
        }

        private static boolean IlIlIllIIlIl(int n, int n2) {
            return n != n2;
        }

        public static interface SpaceCharFilter {
            public boolean isSpaceChar(int var1);
        }
    }
}

