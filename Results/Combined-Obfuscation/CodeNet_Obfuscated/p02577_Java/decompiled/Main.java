/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.InputMismatchException;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Main {
    private static String[] IIIlIIIlIl;
    private static int[] IlIlIIIlIl;

    public Main() {
        Main lIIIlllIllIl;
    }

    public static void main(String[] stringArray) {
        String string;
        InputReader IIlIIllIllIl = new InputReader(System.in);
        PrintWriter llIIIllIllIl = new PrintWriter(System.out);
        char[] IlIIIllIllIl = IIlIIllIllIl.readString().toCharArray();
        int lIIIIllIllIl = IlIlIIIlIl[0];
        Object IIIIIllIllIl = IlIIIllIllIl;
        int lllllIlIllIl = ((char[])IIIIIllIllIl).length;
        int IllllIlIllIl = IlIlIIIlIl[0];
        while (Main.llIIlIIIlIIl(IllllIlIllIl, lllllIlIllIl)) {
            char lIlllIlIllIl = IIIIIllIllIl[IllllIlIllIl];
            lIIIIllIllIl += lIlllIlIllIl - IlIlIIIlIl[1];
            ++IllllIlIllIl;
            "".length();
            if (-" ".length() <= 0) continue;
            return;
        }
        if (Main.lIlIlIIIlIIl(lIIIIllIllIl % IlIlIIIlIl[2])) {
            string = IIIlIIIlIl[IlIlIIIlIl[0]];
            "".length();
            if (("   ".length() << (" ".length() << (" ".length() << " ".length())) & ("   ".length() << (" ".length() << (" ".length() << " ".length())) ^ -" ".length())) != 0) {
                return;
            }
        } else {
            string = IIIlIIIlIl[IlIlIIIlIl[3]];
        }
        IIIIIllIllIl = string;
        llIIIllIllIl.println((String)IIIIIllIllIl);
        llIIIllIllIl.close();
    }

    static {
        Main.IlIIlIIIlIIl();
        Main.IIIlIIIIlIIl();
    }

    private static void IIIlIIIIlIIl() {
        IIIlIIIlIl = new String[IlIlIIIlIl[4]];
        Main.IIIlIIIlIl[Main.IlIlIIIlIl[0]] = Main.IllIIIIIlIIl("t9iJLNrAn4A=", "yjNww");
        Main.IIIlIIIlIl[Main.IlIlIIIlIl[3]] = Main.lllIIIIIlIIl("Hig=", "PGEfd");
    }

    private static String IllIIIIIlIIl(String IIlIlIlIllIl, String llIIlIlIllIl) {
        try {
            SecretKeySpec IlIIlIlIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIlIlIllIl.getBytes(StandardCharsets.UTF_8)), IlIlIIIlIl[5]), "DES");
            Cipher lIIIlIlIllIl = Cipher.getInstance("DES");
            lIIIlIlIllIl.init(IlIlIIIlIl[4], IlIIlIlIllIl);
            return new String(lIIIlIlIllIl.doFinal(Base64.getDecoder().decode(IIlIlIlIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllIIlIllIl) {
            llllIIlIllIl.printStackTrace();
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String lllIIIIIlIIl(String lIllllIIllIl, String IIllllIIllIl) {
        lIllllIIllIl = new String(Base64.getDecoder().decode(lIllllIIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIlllIIllIl = new StringBuilder();
        char[] IlIlllIIllIl = IIllllIIllIl.toCharArray();
        int lIIlllIIllIl = IlIlIIIlIl[0];
        char[] llllIlIIllIl = lIllllIIllIl.toCharArray();
        int IIIIllIIllIl = llllIlIIllIl.length;
        int lIIIllIIllIl = IlIlIIIlIl[0];
        "".length();
        while (!Main.IllIlIIIlIIl(lIIIllIIllIl, IIIIllIIllIl)) {
            char IIIlllIIllIl = llllIlIIllIl[lIIIllIIllIl];
            llIlllIIllIl.append((char)(IIIlllIIllIl ^ IlIlllIIllIl[lIIlllIIllIl % IlIlllIIllIl.length]));
            "".length();
            ++lIIlllIIllIl;
            ++lIIIllIIllIl;
        }
        return String.valueOf(llIlllIIllIl);
    }

    private static void IlIIlIIIlIIl() {
        IlIlIIIlIl = new int[6];
        Main.IlIlIIIlIl[0] = ((0x38 ^ 0x13) << (" ".length() << " ".length()) ^ 63 + 99 - 147 + 142) << " ".length() & (((0x23 ^ 0x2E) << "   ".length() ^ (0xD4 ^ 0x8D)) << " ".length() ^ -" ".length());
        Main.IlIlIIIlIl[1] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
        Main.IlIlIIIlIl[2] = 0x20 ^ 0x29;
        Main.IlIlIIIlIl[3] = " ".length();
        Main.IlIlIIIlIl[4] = " ".length() << " ".length();
        Main.IlIlIIIlIl[5] = " ".length() << "   ".length();
    }

    private static boolean IllIlIIIlIIl(int n, int n2) {
        return n >= n2;
    }

    private static boolean llIIlIIIlIIl(int n, int n2) {
        return n < n2;
    }

    private static boolean lIlIlIIIlIIl(int n) {
        return n == 0;
    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[lIIlIIIlIl[0]];
        private int curChar;
        private int numChars;
        private SpaceCharFilter filter;
        private static String[] lllIIIIlIl;
        private static int[] lIIlIIIlIl;

        public InputReader(InputStream lIllIllIllIl) {
            InputReader IlllIllIllIl;
            IlllIllIllIl.stream = lIllIllIllIl;
        }

        public int read() {
            block5: {
                InputReader IlIllIlIllIl;
                if (InputReader.llIlIIIIlIIl(IlIllIlIllIl.numChars, lIIlIIIlIl[1])) {
                    throw new InputMismatchException();
                }
                if (!InputReader.IIllIIIIlIIl(IlIllIlIllIl.curChar, IlIllIlIllIl.numChars)) break block5;
                IlIllIlIllIl.curChar = lIIlIIIlIl[2];
                try {
                    IlIllIlIllIl.numChars = IlIllIlIllIl.stream.read(IlIllIlIllIl.buf);
                    "".length();
                }
                catch (IOException lIIllIlIllIl) {
                    throw new InputMismatchException();
                }
                if ("   ".length() <= 0) {
                    return (0xD ^ 0x66 ^ (0xA1 ^ 0xAE) << "   ".length()) << (" ".length() << " ".length()) & ((0x49 ^ 0x6A ^ "   ".length() << (" ".length() << (" ".length() << " ".length()))) << (" ".length() << " ".length()) ^ -" ".length());
                }
                if (InputReader.lIllIIIIlIIl(IlIllIlIllIl.numChars)) {
                    return lIIlIIIlIl[1];
                }
            }
            int n = this.curChar;
            this.curChar = n + lIIlIIIlIl[3];
            return this.buf[n];
        }

        /*
         * WARNING - void declaration
         */
        public String nextLine() {
            void var2_2;
            InputReader IIIIlIlIllIl;
            BufferedReader llllIIlIllIl = new BufferedReader(new InputStreamReader(IIIIlIlIllIl.stream));
            String lIllIIlIllIl = lllIIIIlIl[lIIlIIIlIl[2]];
            try {
                lIllIIlIllIl = llllIIlIllIl.readLine();
                "".length();
            }
            catch (IOException IIllIIlIllIl) {
                IIllIIlIllIl.printStackTrace();
            }
            if (((0x23 ^ 0x12) << " ".length() & ~((0x50 ^ 0x61) << " ".length())) > " ".length()) {
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
            InputReader IllIIIlIllIl;
            int lIlIIIlIllIl = IllIIIlIllIl.read();
            while (InputReader.IlllIIIIlIIl(IllIIIlIllIl.isSpaceChar(lIlIIIlIllIl) ? 1 : 0)) {
                lIlIIIlIllIl = IllIIIlIllIl.read();
                "".length();
                if (null == null) continue;
                return (4 ^ 0xB) << (" ".length() << " ".length()) & ~((0x90 ^ 0x9F) << (" ".length() << " ".length()));
            }
            int IIlIIIlIllIl = lIIlIIIlIl[3];
            if (InputReader.llIlIIIIlIIl(lIlIIIlIllIl, lIIlIIIlIl[4])) {
                IIlIIIlIllIl = lIIlIIIlIl[1];
                lIlIIIlIllIl = IllIIIlIllIl.read();
            }
            int llIIIIlIllIl = lIIlIIIlIl[2];
            do {
                if (!InputReader.IIllIIIIlIIl(lIlIIIlIllIl, lIIlIIIlIl[5]) || InputReader.llllIIIIlIIl(lIlIIIlIllIl, lIIlIIIlIl[6])) {
                    throw new InputMismatchException();
                }
                llIIIIlIllIl *= lIIlIIIlIl[7];
                llIIIIlIllIl += lIlIIIlIllIl - lIIlIIIlIl[5];
            } while (!InputReader.IlllIIIIlIIl(IllIIIlIllIl.isSpaceChar(lIlIIIlIllIl = IllIIIlIllIl.read()) ? 1 : 0));
            return (int)(var3_3 * var2_2);
        }

        /*
         * WARNING - void declaration
         */
        public long nextLong() {
            void var2_2;
            void var3_3;
            InputReader IlIlIlIIllIl;
            int lIIlIlIIllIl = IlIlIlIIllIl.read();
            while (InputReader.IlllIIIIlIIl(IlIlIlIIllIl.isSpaceChar(lIIlIlIIllIl) ? 1 : 0)) {
                lIIlIlIIllIl = IlIlIlIIllIl.read();
                "".length();
                if (null == null) continue;
                return 0L;
            }
            int IIIlIlIIllIl = lIIlIIIlIl[3];
            if (InputReader.llIlIIIIlIIl(lIIlIlIIllIl, lIIlIIIlIl[4])) {
                IIIlIlIIllIl = lIIlIIIlIl[1];
                lIIlIlIIllIl = IlIlIlIIllIl.read();
            }
            long lllIIlIIllIl = 0L;
            do {
                if (!InputReader.IIllIIIIlIIl(lIIlIlIIllIl, lIIlIIIlIl[5]) || InputReader.llllIIIIlIIl(lIIlIlIIllIl, lIIlIIIlIl[6])) {
                    throw new InputMismatchException();
                }
                lllIIlIIllIl *= 10L;
                lllIIlIIllIl += (long)(lIIlIlIIllIl - lIIlIIIlIl[5]);
            } while (!InputReader.IlllIIIIlIIl(IlIlIlIIllIl.isSpaceChar(lIIlIlIIllIl = IlIlIlIIllIl.read()) ? 1 : 0));
            return (long)(var3_3 * (long)var2_2);
        }

        /*
         * WARNING - void declaration
         */
        public double nextDouble() {
            void var2_2;
            void var3_3;
            InputReader lllIlIIIllIl;
            int IllIlIIIllIl = lllIlIIIllIl.read();
            while (InputReader.IlllIIIIlIIl(lllIlIIIllIl.isSpaceChar(IllIlIIIllIl) ? 1 : 0)) {
                IllIlIIIllIl = lllIlIIIllIl.read();
                "".length();
                if (" ".length() << (" ".length() << " ".length()) > -" ".length()) continue;
                return 0.0;
            }
            int lIlIlIIIllIl = lIIlIIIlIl[3];
            if (InputReader.llIlIIIIlIIl(IllIlIIIllIl, lIIlIIIlIl[4])) {
                lIlIlIIIllIl = lIIlIIIlIl[1];
                IllIlIIIllIl = lllIlIIIllIl.read();
            }
            double IIlIlIIIllIl = 0.0;
            while (InputReader.IIIIlIIIlIIl(lllIlIIIllIl.isSpaceChar(IllIlIIIllIl) ? 1 : 0) && InputReader.lIIIlIIIlIIl(IllIlIIIllIl, lIIlIIIlIl[8])) {
                if (!InputReader.lIIIlIIIlIIl(IllIlIIIllIl, lIIlIIIlIl[9]) || InputReader.llIlIIIIlIIl(IllIlIIIllIl, lIIlIIIlIl[10])) {
                    return IIlIlIIIllIl * Math.pow(10.0, lllIlIIIllIl.nextInt());
                }
                if (!InputReader.IIllIIIIlIIl(IllIlIIIllIl, lIIlIIIlIl[5]) || InputReader.llllIIIIlIIl(IllIlIIIllIl, lIIlIIIlIl[6])) {
                    throw new InputMismatchException();
                }
                IIlIlIIIllIl *= 10.0;
                IIlIlIIIllIl += (double)(IllIlIIIllIl - lIIlIIIlIl[5]);
                IllIlIIIllIl = lllIlIIIllIl.read();
                "".length();
                if (((5 ^ 2) & ~(0x7B ^ 0x7C)) == 0) continue;
                return 0.0;
            }
            if (InputReader.llIlIIIIlIIl(IllIlIIIllIl, lIIlIIIlIl[8])) {
                IllIlIIIllIl = lllIlIIIllIl.read();
                double llIIlIIIllIl = 1.0;
                while (InputReader.IIIIlIIIlIIl(lllIlIIIllIl.isSpaceChar(IllIlIIIllIl) ? 1 : 0)) {
                    if (!InputReader.lIIIlIIIlIIl(IllIlIIIllIl, lIIlIIIlIl[9]) || InputReader.llIlIIIIlIIl(IllIlIIIllIl, lIIlIIIlIl[10])) {
                        return IIlIlIIIllIl * Math.pow(10.0, lllIlIIIllIl.nextInt());
                    }
                    if (!InputReader.IIllIIIIlIIl(IllIlIIIllIl, lIIlIIIlIl[5]) || InputReader.llllIIIIlIIl(IllIlIIIllIl, lIIlIIIlIl[6])) {
                        throw new InputMismatchException();
                    }
                    IIlIlIIIllIl += (double)(IllIlIIIllIl - lIIlIIIlIl[5]) * (llIIlIIIllIl /= 10.0);
                    IllIlIIIllIl = lllIlIIIllIl.read();
                    "".length();
                    if (" ".length() << (" ".length() << " ".length()) > " ".length() << " ".length()) continue;
                    return 0.0;
                }
            }
            return (double)(var3_3 * (double)var2_2);
        }

        /*
         * WARNING - void declaration
         */
        public String readString() {
            void var2_2;
            InputReader llllIIIIllIl;
            int IlllIIIIllIl = llllIIIIllIl.read();
            while (InputReader.IlllIIIIlIIl(llllIIIIllIl.isSpaceChar(IlllIIIIllIl) ? 1 : 0)) {
                IlllIIIIllIl = llllIIIIllIl.read();
                "".length();
                if (((0xAE ^ 0xA5) << "   ".length() & ~((0x72 ^ 0x79) << "   ".length())) == 0) continue;
                return null;
            }
            StringBuilder lIllIIIIllIl = new StringBuilder();
            do {
                lIllIIIIllIl.appendCodePoint(IlllIIIIllIl);
                "".length();
            } while (!InputReader.IlllIIIIlIIl(llllIIIIllIl.isSpaceChar(IlllIIIIllIl = llllIIIIllIl.read()) ? 1 : 0));
            return String.valueOf(var2_2);
        }

        public boolean isSpaceChar(int lIIlIIIIllIl) {
            int n;
            InputReader IlIlIIIIllIl;
            if (InputReader.IIlIlIIIlIIl(IlIlIIIIllIl.filter)) {
                return IlIlIIIIllIl.filter.isSpaceChar(lIIlIIIIllIl);
            }
            if (!(InputReader.lIIIlIIIlIIl(lIIlIIIIllIl, lIIlIIIlIl[11]) && InputReader.lIIIlIIIlIIl(lIIlIIIIllIl, lIIlIIIlIl[7]) && InputReader.lIIIlIIIlIIl(lIIlIIIIllIl, lIIlIIIlIl[12]) && InputReader.lIIIlIIIlIIl(lIIlIIIIllIl, lIIlIIIlIl[13]) && !InputReader.llIlIIIIlIIl(lIIlIIIIllIl, lIIlIIIlIl[1]))) {
                n = lIIlIIIlIl[3];
                "".length();
                if (" ".length() << " ".length() < 0) {
                    return (((0xC ^ 0x23) << (" ".length() << " ".length()) ^ 3 + 40 - -51 + 69) << " ".length() & (((0x6F ^ 0x26) << " ".length() ^ 49 + 93 - 123 + 122) << " ".length() ^ -" ".length())) != 0;
                }
            } else {
                n = lIIlIIIlIl[2];
            }
            return n != 0;
        }

        public String next() {
            InputReader lllIIIIIllIl;
            return lllIIIIIllIl.readString();
        }

        static {
            InputReader.IlIlIIIIlIIl();
            InputReader.lIIlIIIIlIIl();
        }

        private static void lIIlIIIIlIIl() {
            lllIIIIlIl = new String[lIIlIIIlIl[3]];
            InputReader.lllIIIIlIl[InputReader.lIIlIIIlIl[2]] = InputReader.lIlIIIIIlIIl("Yk3vqDisiKU=", "vNXzC");
        }

        private static String lIlIIIIIlIIl(String IlIIIIIIllIl, String lIIIIIIIllIl) {
            try {
                SecretKeySpec IIIIIIIIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIIIIIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                Cipher llllllllIlIl = Cipher.getInstance("Blowfish");
                llllllllIlIl.init(lIIlIIIlIl[14], IIIIIIIIllIl);
                return new String(llllllllIlIl.doFinal(Base64.getDecoder().decode(IlIIIIIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception IlllllllIlIl) {
                IlllllllIlIl.printStackTrace();
                return null;
            }
        }

        private static void IlIlIIIIlIIl() {
            lIIlIIIlIl = new int[15];
            InputReader.lIIlIIIlIl[0] = 173 + 107 - 171 + 76 ^ (0xA ^ 0x25) << (" ".length() << " ".length());
            InputReader.lIIlIIIlIl[1] = -" ".length();
            InputReader.lIIlIIIlIl[2] = ((0x8E ^ 0xB9) << " ".length() ^ (0x56 ^ 0x2B)) << (" ".length() << " ".length()) & ((169 + 24 - 180 + 200 ^ (0x68 ^ 0xB) << " ".length()) << (" ".length() << " ".length()) ^ -" ".length());
            InputReader.lIIlIIIlIl[3] = " ".length();
            InputReader.lIIlIIIlIl[4] = 93 + 64 - 33 + 67 ^ (0x5F ^ 0x16) << " ".length();
            InputReader.lIIlIIIlIl[5] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
            InputReader.lIIlIIIlIl[6] = 113 + 95 - 118 + 89 ^ (0xD1 ^ 0x94) << " ".length();
            InputReader.lIIlIIIlIl[7] = (7 ^ 2) << " ".length();
            InputReader.lIIlIIIlIl[8] = (0x37 ^ 0x20) << " ".length();
            InputReader.lIIlIIIlIl[9] = 0x22 ^ 0x7D ^ (0x1F ^ 2) << " ".length();
            InputReader.lIIlIIIlIl[10] = (0xB1 ^ 0xBC) << "   ".length() ^ (0x7C ^ 0x51);
            InputReader.lIIlIIIlIl[11] = " ".length() << (0x78 ^ 0x7D);
            InputReader.lIIlIIIlIl[12] = " ".length() << (0x7C ^ 0x7B) ^ 7 + 119 - 6 + 21;
            InputReader.lIIlIIIlIl[13] = "   ".length() ^ (0x69 ^ 0x6C) << " ".length();
            InputReader.lIIlIIIlIl[14] = " ".length() << " ".length();
        }

        private static boolean llIlIIIIlIIl(int n, int n2) {
            return n == n2;
        }

        private static boolean IIllIIIIlIIl(int n, int n2) {
            return n >= n2;
        }

        private static boolean llllIIIIlIIl(int n, int n2) {
            return n > n2;
        }

        private static boolean IIlIlIIIlIIl(Object object) {
            return object != null;
        }

        private static boolean IlllIIIIlIIl(int n) {
            return n != 0;
        }

        private static boolean IIIIlIIIlIIl(int n) {
            return n == 0;
        }

        private static boolean lIllIIIIlIIl(int n) {
            return n <= 0;
        }

        private static boolean lIIIlIIIlIIl(int n, int n2) {
            return n != n2;
        }

        public static interface SpaceCharFilter {
            public boolean isSpaceChar(int var1);
        }
    }
}

