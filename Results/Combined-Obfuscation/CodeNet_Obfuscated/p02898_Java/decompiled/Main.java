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

class Main {
    private static int[] IlIIIlIl;

    Main() {
        Main IlIIllIIlllIIIl;
    }

    public static void main(String[] stringArray) {
        InputStream IIIlIlIIlllIIIl = System.in;
        PrintStream lllIIlIIlllIIIl = System.out;
        FastReader IllIIlIIlllIIIl = new FastReader(IIIlIlIIlllIIIl);
        PrintWriter lIlIIlIIlllIIIl = new PrintWriter(lllIIlIIlllIIIl);
        int lIIIIlIIlllIIIl = IlIIIlIl[0];
        int IIlIIlIIlllIIIl = IllIIlIIlllIIIl.nextInt();
        int llIIIlIIlllIIIl = IllIIlIIlllIIIl.nextInt();
        int[] IIIIIlIIlllIIIl = new int[IIlIIlIIlllIIIl];
        int IlIIIlIIlllIIIl = IlIIIlIl[0];
        while (Main.lllIIlIIIl(IlIIIlIIlllIIIl, IIlIIlIIlllIIIl)) {
            IIIIIlIIlllIIIl[IlIIIlIIlllIIIl] = IllIIlIIlllIIIl.nextInt();
            if (Main.IIIlIlIIIl(IIIIIlIIlllIIIl[IlIIIlIIlllIIIl], llIIIlIIlllIIIl)) {
                ++lIIIIlIIlllIIIl;
            }
            ++IlIIIlIIlllIIIl;
            "".length();
            if (null == null) continue;
            return;
        }
        System.out.println(lIIIIlIIlllIIIl);
        lIlIIlIIlllIIIl.close();
    }

    static {
        Main.IllIIlIIIl();
    }

    private static void IllIIlIIIl() {
        IlIIIlIl = new int[1];
        Main.IlIIIlIl[0] = (0x71 ^ 0x64) & ~(0x46 ^ 0x53);
    }

    private static boolean IIIlIlIIIl(int n, int n2) {
        return n >= n2;
    }

    private static boolean lllIIlIIIl(int n, int n2) {
        return n < n2;
    }

    public static class FastReader {
        private InputStream stream;
        private byte[] buf = new byte[lIlIIlIl[0]];
        private int curChar;
        private int numChars;
        private SpaceCharFilter filter;
        private static String[] IIlIIlIl;
        private static int[] lIlIIlIl;

        public FastReader(InputStream IIlIlIIIlllIIIl) {
            FastReader lIlIlIIIlllIIIl;
            lIlIlIIIlllIIIl.stream = IIlIlIIIlllIIIl;
        }

        public int read() {
            block5: {
                FastReader lIIIlIIIlllIIIl;
                if (FastReader.IIllIlIIIl(lIIIlIIIlllIIIl.numChars, lIlIIlIl[1])) {
                    throw new InputMismatchException();
                }
                if (!FastReader.lIllIlIIIl(lIIIlIIIlllIIIl.curChar, lIIIlIIIlllIIIl.numChars)) break block5;
                lIIIlIIIlllIIIl.curChar = lIlIIlIl[2];
                try {
                    lIIIlIIIlllIIIl.numChars = lIIIlIIIlllIIIl.stream.read(lIIIlIIIlllIIIl.buf);
                    "".length();
                }
                catch (IOException IIIIlIIIlllIIIl) {
                    throw new InputMismatchException();
                }
                if (" ".length() << (" ".length() << " ".length()) < -" ".length()) {
                    return (0x22 ^ 3 ^ "   ".length() << " ".length()) & (0x99 ^ 0x92 ^ (0x95 ^ 0x9E) << (" ".length() << " ".length()) ^ -" ".length());
                }
                if (FastReader.IlllIlIIIl(lIIIlIIIlllIIIl.numChars)) {
                    return lIlIIlIl[1];
                }
            }
            int n = this.curChar;
            this.curChar = n + lIlIIlIl[3];
            return this.buf[n];
        }

        /*
         * WARNING - void declaration
         */
        public String nextLine() {
            void var2_2;
            BufferedReader IIllIIIIlllIIIl = new BufferedReader(new InputStreamReader(System.in));
            String llIlIIIIlllIIIl = IIlIIlIl[lIlIIlIl[2]];
            try {
                llIlIIIIlllIIIl = IIllIIIIlllIIIl.readLine();
                "".length();
            }
            catch (IOException IlIlIIIIlllIIIl) {
                IlIlIIIIlllIIIl.printStackTrace();
            }
            if ((((0x27 ^ 0x7A) << " ".length() ^ 92 + 70 - 53 + 30) & (35 + 24 - 1 + 87 ^ (0xB9 ^ 0xBC) << (0x8F ^ 0x8A) ^ -" ".length())) != 0) {
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
            FastReader lIlIIIIIlllIIIl;
            int IIlIIIIIlllIIIl = lIlIIIIIlllIIIl.read();
            while (FastReader.llllIlIIIl(lIlIIIIIlllIIIl.isSpaceChar(IIlIIIIIlllIIIl) ? 1 : 0)) {
                IIlIIIIIlllIIIl = lIlIIIIIlllIIIl.read();
                "".length();
                if (" ".length() << (" ".length() << " ".length()) != ((0x64 ^ 0x45) << " ".length() & ~((0xE0 ^ 0xC1) << " ".length()))) continue;
                return (0x65 ^ 0x68) << (" ".length() << " ".length()) & ~((0xCB ^ 0xC6) << (" ".length() << " ".length()));
            }
            int llIIIIIIlllIIIl = lIlIIlIl[3];
            if (FastReader.IIllIlIIIl(IIlIIIIIlllIIIl, lIlIIlIl[4])) {
                llIIIIIIlllIIIl = lIlIIlIl[1];
                IIlIIIIIlllIIIl = lIlIIIIIlllIIIl.read();
            }
            int IlIIIIIIlllIIIl = lIlIIlIl[2];
            do {
                if (!FastReader.lIllIlIIIl(IIlIIIIIlllIIIl, lIlIIlIl[5]) || FastReader.IIIIllIIIl(IIlIIIIIlllIIIl, lIlIIlIl[6])) {
                    throw new InputMismatchException();
                }
                IlIIIIIIlllIIIl *= lIlIIlIl[7];
                IlIIIIIIlllIIIl += IIlIIIIIlllIIIl - lIlIIlIl[5];
            } while (!FastReader.llllIlIIIl(lIlIIIIIlllIIIl.isSpaceChar(IIlIIIIIlllIIIl = lIlIIIIIlllIIIl.read()) ? 1 : 0));
            return (int)(var3_3 * var2_2);
        }

        /*
         * WARNING - void declaration
         */
        public long nextLong() {
            void var2_2;
            void var3_3;
            FastReader lIllllllIllIIIl;
            int IIllllllIllIIIl = lIllllllIllIIIl.read();
            while (FastReader.llllIlIIIl(lIllllllIllIIIl.isSpaceChar(IIllllllIllIIIl) ? 1 : 0)) {
                IIllllllIllIIIl = lIllllllIllIIIl.read();
                "".length();
                if (-" ".length() < (((0x53 ^ 0x44) << " ".length() ^ (0x2A ^ 3)) << "   ".length() & (((0x7A ^ 0x5B) << " ".length() ^ (0x79 ^ 0x3C)) << "   ".length() ^ -" ".length()))) continue;
                return 0L;
            }
            int llIlllllIllIIIl = lIlIIlIl[3];
            if (FastReader.IIllIlIIIl(IIllllllIllIIIl, lIlIIlIl[4])) {
                llIlllllIllIIIl = lIlIIlIl[1];
                IIllllllIllIIIl = lIllllllIllIIIl.read();
            }
            long IlIlllllIllIIIl = 0L;
            do {
                if (!FastReader.lIllIlIIIl(IIllllllIllIIIl, lIlIIlIl[5]) || FastReader.IIIIllIIIl(IIllllllIllIIIl, lIlIIlIl[6])) {
                    throw new InputMismatchException();
                }
                IlIlllllIllIIIl *= 10L;
                IlIlllllIllIIIl += (long)(IIllllllIllIIIl - lIlIIlIl[5]);
            } while (!FastReader.llllIlIIIl(lIllllllIllIIIl.isSpaceChar(IIllllllIllIIIl = lIllllllIllIIIl.read()) ? 1 : 0));
            return (long)(var3_3 * (long)var2_2);
        }

        /*
         * WARNING - void declaration
         */
        public double nextDouble() {
            void var2_2;
            void var3_3;
            FastReader IIlIllllIllIIIl;
            int llIIllllIllIIIl = IIlIllllIllIIIl.read();
            while (FastReader.llllIlIIIl(IIlIllllIllIIIl.isSpaceChar(llIIllllIllIIIl) ? 1 : 0)) {
                llIIllllIllIIIl = IIlIllllIllIIIl.read();
                "".length();
                if (" ".length() >= 0) continue;
                return 0.0;
            }
            int IlIIllllIllIIIl = lIlIIlIl[3];
            if (FastReader.IIllIlIIIl(llIIllllIllIIIl, lIlIIlIl[4])) {
                IlIIllllIllIIIl = lIlIIlIl[1];
                llIIllllIllIIIl = IIlIllllIllIIIl.read();
            }
            double lIIIllllIllIIIl = 0.0;
            while (FastReader.lIIIllIIIl(IIlIllllIllIIIl.isSpaceChar(llIIllllIllIIIl) ? 1 : 0) && FastReader.IlIIllIIIl(llIIllllIllIIIl, lIlIIlIl[8])) {
                if (!FastReader.IlIIllIIIl(llIIllllIllIIIl, lIlIIlIl[9]) || FastReader.IIllIlIIIl(llIIllllIllIIIl, lIlIIlIl[10])) {
                    return lIIIllllIllIIIl * Math.pow(10.0, IIlIllllIllIIIl.nextInt());
                }
                if (!FastReader.lIllIlIIIl(llIIllllIllIIIl, lIlIIlIl[5]) || FastReader.IIIIllIIIl(llIIllllIllIIIl, lIlIIlIl[6])) {
                    throw new InputMismatchException();
                }
                lIIIllllIllIIIl *= 10.0;
                lIIIllllIllIIIl += (double)(llIIllllIllIIIl - lIlIIlIl[5]);
                llIIllllIllIIIl = IIlIllllIllIIIl.read();
                "".length();
                if (" ".length() << " ".length() > 0) continue;
                return 0.0;
            }
            if (FastReader.IIllIlIIIl(llIIllllIllIIIl, lIlIIlIl[8])) {
                llIIllllIllIIIl = IIlIllllIllIIIl.read();
                double IIIIllllIllIIIl = 1.0;
                while (FastReader.lIIIllIIIl(IIlIllllIllIIIl.isSpaceChar(llIIllllIllIIIl) ? 1 : 0)) {
                    if (!FastReader.IlIIllIIIl(llIIllllIllIIIl, lIlIIlIl[9]) || FastReader.IIllIlIIIl(llIIllllIllIIIl, lIlIIlIl[10])) {
                        return lIIIllllIllIIIl * Math.pow(10.0, IIlIllllIllIIIl.nextInt());
                    }
                    if (!FastReader.lIllIlIIIl(llIIllllIllIIIl, lIlIIlIl[5]) || FastReader.IIIIllIIIl(llIIllllIllIIIl, lIlIIlIl[6])) {
                        throw new InputMismatchException();
                    }
                    lIIIllllIllIIIl += (double)(llIIllllIllIIIl - lIlIIlIl[5]) * (IIIIllllIllIIIl /= 10.0);
                    llIIllllIllIIIl = IIlIllllIllIIIl.read();
                    "".length();
                    if (" ".length() << " ".length() <= " ".length() << (" ".length() << " ".length())) continue;
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
            FastReader lIllIlllIllIIIl;
            int IIllIlllIllIIIl = lIllIlllIllIIIl.read();
            while (FastReader.llllIlIIIl(lIllIlllIllIIIl.isSpaceChar(IIllIlllIllIIIl) ? 1 : 0)) {
                IIllIlllIllIIIl = lIllIlllIllIIIl.read();
                "".length();
                if (" ".length() << (" ".length() << " ".length()) > -" ".length()) continue;
                return (char)((0x29 ^ 2) & ~(0x19 ^ 0x32));
            }
            return (char)var1_1;
        }

        /*
         * WARNING - void declaration
         */
        public String next() {
            void var2_2;
            FastReader IIIlIlllIllIIIl;
            int lllIIlllIllIIIl = IIIlIlllIllIIIl.read();
            while (FastReader.llllIlIIIl(IIIlIlllIllIIIl.isSpaceChar(lllIIlllIllIIIl) ? 1 : 0)) {
                lllIIlllIllIIIl = IIIlIlllIllIIIl.read();
                "".length();
                if (" ".length() << (" ".length() << " ".length()) >= -" ".length()) continue;
                return null;
            }
            StringBuilder IllIIlllIllIIIl = new StringBuilder();
            do {
                IllIIlllIllIIIl.appendCodePoint(lllIIlllIllIIIl);
                "".length();
            } while (!FastReader.llllIlIIIl(IIIlIlllIllIIIl.isSpaceChar(lllIIlllIllIIIl = IIIlIlllIllIIIl.read()) ? 1 : 0));
            return String.valueOf(var2_2);
        }

        public boolean isSpaceChar(int IlIIIlllIllIIIl) {
            int n;
            FastReader llIIIlllIllIIIl;
            if (FastReader.llIIllIIIl(llIIIlllIllIIIl.filter)) {
                return llIIIlllIllIIIl.filter.isSpaceChar(IlIIIlllIllIIIl);
            }
            if (!(FastReader.IlIIllIIIl(IlIIIlllIllIIIl, lIlIIlIl[11]) && FastReader.IlIIllIIIl(IlIIIlllIllIIIl, lIlIIlIl[7]) && FastReader.IlIIllIIIl(IlIIIlllIllIIIl, lIlIIlIl[12]) && FastReader.IlIIllIIIl(IlIIIlllIllIIIl, lIlIIlIl[13]) && !FastReader.IIllIlIIIl(IlIIIlllIllIIIl, lIlIIlIl[1]))) {
                n = lIlIIlIl[3];
                "".length();
                if (-" ".length() > -" ".length()) {
                    return ((0x2A ^ 0x1B) & ~(0x16 ^ 0x27)) != 0;
                }
            } else {
                n = lIlIIlIl[2];
            }
            return n != 0;
        }

        static {
            FastReader.llIlIlIIIl();
            FastReader.IlIlIlIIIl();
        }

        private static void IlIlIlIIIl() {
            IIlIIlIl = new String[lIlIIlIl[3]];
            FastReader.IIlIIlIl[FastReader.lIlIIlIl[2]] = FastReader.lIIlIlIIIl("zrYJoGoOYO8=", "WmJwT");
        }

        private static String lIIlIlIIIl(String lIlllIllIllIIIl, String IIlllIllIllIIIl) {
            try {
                SecretKeySpec llIllIllIllIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IIlllIllIllIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                Cipher IlIllIllIllIIIl = Cipher.getInstance("Blowfish");
                IlIllIllIllIIIl.init(lIlIIlIl[14], llIllIllIllIIIl);
                return new String(IlIllIllIllIIIl.doFinal(Base64.getDecoder().decode(lIlllIllIllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lIIllIllIllIIIl) {
                lIIllIllIllIIIl.printStackTrace();
                return null;
            }
        }

        private static void llIlIlIIIl() {
            lIlIIlIl = new int[15];
            FastReader.lIlIIlIl[0] = " ".length() << ((0xD6 ^ 0xBF ^ (6 ^ 0x1D) << (" ".length() << " ".length())) << " ".length());
            FastReader.lIlIIlIl[1] = -" ".length();
            FastReader.lIlIIlIl[2] = (0x7F ^ 0x78) << " ".length() & ~((0x94 ^ 0x93) << " ".length());
            FastReader.lIlIIlIl[3] = " ".length();
            FastReader.lIlIIlIl[4] = (0x4E ^ 0x53) << " ".length() ^ (0x5D ^ 0x4A);
            FastReader.lIlIIlIl[5] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
            FastReader.lIlIIlIl[6] = 0xFA ^ 0x91 ^ (0x97 ^ 0xBE) << " ".length();
            FastReader.lIlIIlIl[7] = (0x8D ^ 0x88) << " ".length();
            FastReader.lIlIIlIl[8] = (0x5B ^ 0x4C) << " ".length();
            FastReader.lIlIIlIl[9] = (0x79 ^ 4) << " ".length() ^ 54 + 88 - 51 + 68;
            FastReader.lIlIIlIl[10] = 0x48 ^ 0xD;
            FastReader.lIlIIlIl[11] = " ".length() << ((0x12 ^ 0x2F) << " ".length() ^ 121 + 76 - 143 + 73);
            FastReader.lIlIIlIl[12] = (0x18 ^ 0x4D) << " ".length() ^ 39 + 70 - 78 + 136;
            FastReader.lIlIIlIl[13] = 0x8D ^ 0x84;
            FastReader.lIlIIlIl[14] = " ".length() << " ".length();
        }

        private static boolean IIllIlIIIl(int n, int n2) {
            return n == n2;
        }

        private static boolean lIllIlIIIl(int n, int n2) {
            return n >= n2;
        }

        private static boolean IIIIllIIIl(int n, int n2) {
            return n > n2;
        }

        private static boolean llIIllIIIl(Object object) {
            return object != null;
        }

        private static boolean llllIlIIIl(int n) {
            return n != 0;
        }

        private static boolean lIIIllIIIl(int n) {
            return n == 0;
        }

        private static boolean IlllIlIIIl(int n) {
            return n <= 0;
        }

        private static boolean IlIIllIIIl(int n, int n2) {
            return n != n2;
        }

        public static interface SpaceCharFilter {
            public boolean isSpaceChar(int var1);
        }
    }
}

