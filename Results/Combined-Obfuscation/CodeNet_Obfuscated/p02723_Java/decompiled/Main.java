/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.InputMismatchException;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Main {
    private static String[] IllIlIIll;
    private static int[] lllIlIIll;

    public Main() {
        Main IlIlllIlIlIlIl;
    }

    public static void main(String[] stringArray) {
        InputReader lIlIllIlIlIlIl = new InputReader(System.in);
        OutputWriter IIlIllIlIlIlIl = new OutputWriter(System.out);
        StringBuilder llIIllIlIlIlIl = new StringBuilder();
        String IlIIllIlIlIlIl = lIlIllIlIlIlIl.String();
        if (Main.IIlllIIllIl(IlIIllIlIlIlIl.charAt(lllIlIIll[0]), IlIIllIlIlIlIl.charAt(lllIlIIll[1])) && Main.IIlllIIllIl(IlIIllIlIlIlIl.charAt(lllIlIIll[2]), IlIIllIlIlIlIl.charAt(lllIlIIll[3]))) {
            Object[] objectArray = new Object[lllIlIIll[4]];
            objectArray[Main.lllIlIIll[5]] = IllIlIIll[lllIlIIll[5]];
            IIlIllIlIlIlIl.println(objectArray);
            "".length();
            if ("   ".length() < 0) {
                return;
            }
        } else {
            Object[] objectArray = new Object[lllIlIIll[4]];
            objectArray[Main.lllIlIIll[5]] = IllIlIIll[lllIlIIll[4]];
            IIlIllIlIlIlIl.println(objectArray);
        }
    }

    static {
        Main.llIllIIllIl();
        Main.IlIllIIllIl();
    }

    private static void IlIllIIllIl() {
        IllIlIIll = new String[lllIlIIll[0]];
        Main.IllIlIIll[Main.lllIlIIll[5]] = Main.IIIllIIllIl("LQEq", "tdYni");
        Main.IllIlIIll[Main.lllIlIIll[4]] = Main.lIIllIIllIl("ocmUm7geguc=", "LiNQP");
    }

    private static String lIIllIIllIl(String lIllIlIlIlIlIl, String IIllIlIlIlIlIl) {
        try {
            SecretKeySpec llIlIlIlIlIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IIllIlIlIlIlIl.getBytes(StandardCharsets.UTF_8)), lllIlIIll[6]), "DES");
            Cipher IlIlIlIlIlIlIl = Cipher.getInstance("DES");
            IlIlIlIlIlIlIl.init(lllIlIIll[0], llIlIlIlIlIlIl);
            return new String(IlIlIlIlIlIlIl.doFinal(Base64.getDecoder().decode(lIllIlIlIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIlIlIlIlIlIl) {
            lIIlIlIlIlIlIl.printStackTrace();
            return null;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static String IIIllIIllIl(String llIllIIlIlIlIl, String IlIllIIlIlIlIl) {
        llIllIIlIlIlIl = new String(Base64.getDecoder().decode(llIllIIlIlIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        lIIllIIlIlIlIl = new StringBuilder();
        IIIllIIlIlIlIl = IlIllIIlIlIlIl.toCharArray();
        lllIlIIlIlIlIl = Main.lllIlIIll[5];
        lIllIIIlIlIlIl = llIllIIlIlIlIl.toCharArray();
        IlllIIIlIlIlIl = lIllIIIlIlIlIl.length;
        llllIIIlIlIlIl = Main.lllIlIIll[5];
        "".length();
        if (((221 ^ 166 ^ (179 ^ 140) << " ".length()) << (" ".length() << " ".length()) & ((21 + 135 - 118 + 101 ^ (11 ^ 76) << " ".length()) << (" ".length() << " ".length()) ^ -" ".length())) != -" ".length()) ** GOTO lbl19
        return null;
lbl-1000:
        // 1 sources

        {
            IllIlIIlIlIlIl = lIllIIIlIlIlIl[llllIIIlIlIlIl];
            lIIllIIlIlIlIl.append((char)(IllIlIIlIlIlIl ^ IIIllIIlIlIlIl[lllIlIIlIlIlIl % IIIllIIlIlIlIl.length]));
            "".length();
            ++lllIlIIlIlIlIl;
            ++llllIIIlIlIlIl;
lbl19:
            // 2 sources

            ** while (!Main.lIlllIIllIl((int)llllIIIlIlIlIl, (int)IlllIIIlIlIlIl))
        }
lbl20:
        // 1 sources

        return String.valueOf(lIIllIIlIlIlIl);
    }

    private static void llIllIIllIl() {
        lllIlIIll = new int[7];
        Main.lllIlIIll[0] = " ".length() << " ".length();
        Main.lllIlIIll[1] = "   ".length();
        Main.lllIlIIll[2] = " ".length() << (" ".length() << " ".length());
        Main.lllIlIIll[3] = (0xC1 ^ 0x82) << " ".length() ^ 103 + 44 - 65 + 49;
        Main.lllIlIIll[4] = " ".length();
        Main.lllIlIIll[5] = ((0x39 ^ 0x70) << " ".length() ^ 28 + 75 - 7 + 35) & ((0x9D ^ 0x92) << " ".length() ^ (0x6E ^ 0x61) ^ -" ".length());
        Main.lllIlIIll[6] = " ".length() << "   ".length();
    }

    private static boolean IIlllIIllIl(int n, int n2) {
        return n == n2;
    }

    private static boolean lIlllIIllIl(int n, int n2) {
        return n >= n2;
    }

    private static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[IllllIIll[0]];
        private int curChar;
        private int numChars;
        private SpaceCharFilter filter;
        private static int[] IllllIIll;

        public InputReader(InputStream IlllIlIllIIlIl) {
            InputReader llllIlIllIIlIl;
            llllIlIllIIlIl.stream = IlllIlIllIIlIl;
        }

        public int read() {
            block5: {
                InputReader llIlIlIllIIlIl;
                if (InputReader.IllIllIllIl(llIlIlIllIIlIl.numChars, IllllIIll[1])) {
                    throw new InputMismatchException();
                }
                if (!InputReader.lllIllIllIl(llIlIlIllIIlIl.curChar, llIlIlIllIIlIl.numChars)) break block5;
                llIlIlIllIIlIl.curChar = IllllIIll[2];
                try {
                    llIlIlIllIIlIl.numChars = llIlIlIllIIlIl.stream.read(llIlIlIllIIlIl.buf);
                    "".length();
                }
                catch (IOException IlIlIlIllIIlIl) {
                    throw new InputMismatchException();
                }
                if ("   ".length() != "   ".length()) {
                    return (0x12 ^ 0x15 ^ (0x6F ^ 0x60) << (" ".length() << " ".length())) & (81 + 137 - 108 + 39 ^ (0xE ^ 0x59) << " ".length() ^ -" ".length());
                }
                if (InputReader.IIIlllIllIl(llIlIlIllIIlIl.numChars)) {
                    return IllllIIll[1];
                }
            }
            int n = this.curChar;
            this.curChar = n + IllllIIll[3];
            return this.buf[n];
        }

        /*
         * WARNING - void declaration
         */
        public int Int() {
            void var2_2;
            void var3_3;
            InputReader lIlIIlIllIIlIl;
            int IIlIIlIllIIlIl = lIlIIlIllIIlIl.read();
            while (InputReader.lIIlllIllIl(lIlIIlIllIIlIl.isSpaceChar(IIlIIlIllIIlIl) ? 1 : 0)) {
                IIlIIlIllIIlIl = lIlIIlIllIIlIl.read();
                "".length();
                if (null == null) continue;
                return ((0xA7 ^ 0xA0) << "   ".length() ^ (0x7A ^ 0x6D)) & ((0x73 ^ 0x7E) << (" ".length() << " ".length()) ^ (0x5D ^ 0x46) ^ -" ".length());
            }
            int llIIIlIllIIlIl = IllllIIll[3];
            if (InputReader.IllIllIllIl(IIlIIlIllIIlIl, IllllIIll[4])) {
                llIIIlIllIIlIl = IllllIIll[1];
                IIlIIlIllIIlIl = lIlIIlIllIIlIl.read();
            }
            int IlIIIlIllIIlIl = IllllIIll[2];
            do {
                if (!InputReader.lllIllIllIl(IIlIIlIllIIlIl, IllllIIll[5]) || InputReader.IlIlllIllIl(IIlIIlIllIIlIl, IllllIIll[6])) {
                    throw new InputMismatchException();
                }
                IlIIIlIllIIlIl *= IllllIIll[7];
                IlIIIlIllIIlIl += IIlIIlIllIIlIl - IllllIIll[5];
            } while (!InputReader.lIIlllIllIl(lIlIIlIllIIlIl.isSpaceChar(IIlIIlIllIIlIl = lIlIIlIllIIlIl.read()) ? 1 : 0));
            return (int)(var3_3 * var2_2);
        }

        /*
         * WARNING - void declaration
         */
        public String String() {
            void var2_2;
            InputReader IllllIIllIIlIl;
            int lIlllIIllIIlIl = IllllIIllIIlIl.read();
            while (InputReader.lIIlllIllIl(IllllIIllIIlIl.isSpaceChar(lIlllIIllIIlIl) ? 1 : 0)) {
                lIlllIIllIIlIl = IllllIIllIIlIl.read();
                "".length();
                if (-(0x1F ^ 0x1B) <= 0) continue;
                return null;
            }
            StringBuilder IIlllIIllIIlIl = new StringBuilder();
            do {
                IIlllIIllIIlIl.appendCodePoint(lIlllIIllIIlIl);
                "".length();
            } while (!InputReader.lIIlllIllIl(IllllIIllIIlIl.isSpaceChar(lIlllIIllIIlIl = IllllIIllIIlIl.read()) ? 1 : 0));
            return String.valueOf(var2_2);
        }

        /*
         * WARNING - void declaration
         */
        public double Double() {
            void var2_2;
            void var3_3;
            InputReader IllIlIIllIIlIl;
            int lIlIlIIllIIlIl = IllIlIIllIIlIl.read();
            while (InputReader.lIIlllIllIl(IllIlIIllIIlIl.isSpaceChar(lIlIlIIllIIlIl) ? 1 : 0)) {
                lIlIlIIllIIlIl = IllIlIIllIIlIl.read();
                "".length();
                if (null == null) continue;
                return 0.0;
            }
            int IIlIlIIllIIlIl = IllllIIll[3];
            if (InputReader.IllIllIllIl(lIlIlIIllIIlIl, IllllIIll[4])) {
                IIlIlIIllIIlIl = IllllIIll[1];
                lIlIlIIllIIlIl = IllIlIIllIIlIl.read();
            }
            double llIIlIIllIIlIl = 0.0;
            while (InputReader.llIlllIllIl(IllIlIIllIIlIl.isSpaceChar(lIlIlIIllIIlIl) ? 1 : 0) && InputReader.IIllllIllIl(lIlIlIIllIIlIl, IllllIIll[8])) {
                if (!InputReader.IIllllIllIl(lIlIlIIllIIlIl, IllllIIll[9]) || InputReader.IllIllIllIl(lIlIlIIllIIlIl, IllllIIll[10])) {
                    return llIIlIIllIIlIl * Math.pow(10.0, IllIlIIllIIlIl.Int());
                }
                if (!InputReader.lllIllIllIl(lIlIlIIllIIlIl, IllllIIll[5]) || InputReader.IlIlllIllIl(lIlIlIIllIIlIl, IllllIIll[6])) {
                    throw new InputMismatchException();
                }
                llIIlIIllIIlIl *= 10.0;
                llIIlIIllIIlIl += (double)(lIlIlIIllIIlIl - IllllIIll[5]);
                lIlIlIIllIIlIl = IllIlIIllIIlIl.read();
                "".length();
                if (" ".length() << (" ".length() << " ".length()) == " ".length() << (" ".length() << " ".length())) continue;
                return 0.0;
            }
            if (InputReader.IllIllIllIl(lIlIlIIllIIlIl, IllllIIll[8])) {
                lIlIlIIllIIlIl = IllIlIIllIIlIl.read();
                double IlIIlIIllIIlIl = 1.0;
                while (InputReader.llIlllIllIl(IllIlIIllIIlIl.isSpaceChar(lIlIlIIllIIlIl) ? 1 : 0)) {
                    if (!InputReader.IIllllIllIl(lIlIlIIllIIlIl, IllllIIll[9]) || InputReader.IllIllIllIl(lIlIlIIllIIlIl, IllllIIll[10])) {
                        return llIIlIIllIIlIl * Math.pow(10.0, IllIlIIllIIlIl.Int());
                    }
                    if (!InputReader.lllIllIllIl(lIlIlIIllIIlIl, IllllIIll[5]) || InputReader.IlIlllIllIl(lIlIlIIllIIlIl, IllllIIll[6])) {
                        throw new InputMismatchException();
                    }
                    llIIlIIllIIlIl += (double)(lIlIlIIllIIlIl - IllllIIll[5]) * (IlIIlIIllIIlIl /= 10.0);
                    lIlIlIIllIIlIl = IllIlIIllIIlIl.read();
                    "".length();
                    if (-"  ".length() < 0) continue;
                    return 0.0;
                }
            }
            return (double)(var3_3 * (double)var2_2);
        }

        /*
         * WARNING - void declaration
         */
        public long Long() {
            void var2_2;
            void var3_3;
            InputReader lIllIIIllIIlIl;
            int IIllIIIllIIlIl = lIllIIIllIIlIl.read();
            while (InputReader.lIIlllIllIl(lIllIIIllIIlIl.isSpaceChar(IIllIIIllIIlIl) ? 1 : 0)) {
                IIllIIIllIIlIl = lIllIIIllIIlIl.read();
                "".length();
                if (-(0x9F ^ 0x9B) <= 0) continue;
                return 0L;
            }
            int llIlIIIllIIlIl = IllllIIll[3];
            if (InputReader.IllIllIllIl(IIllIIIllIIlIl, IllllIIll[4])) {
                llIlIIIllIIlIl = IllllIIll[1];
                IIllIIIllIIlIl = lIllIIIllIIlIl.read();
            }
            long IlIlIIIllIIlIl = 0L;
            do {
                if (!InputReader.lllIllIllIl(IIllIIIllIIlIl, IllllIIll[5]) || InputReader.IlIlllIllIl(IIllIIIllIIlIl, IllllIIll[6])) {
                    throw new InputMismatchException();
                }
                IlIlIIIllIIlIl *= 10L;
                IlIlIIIllIIlIl += (long)(IIllIIIllIIlIl - IllllIIll[5]);
            } while (!InputReader.lIIlllIllIl(lIllIIIllIIlIl.isSpaceChar(IIllIIIllIIlIl = lIllIIIllIIlIl.read()) ? 1 : 0));
            return (long)(var3_3 * (long)var2_2);
        }

        public boolean isSpaceChar(int IllIIIIllIIlIl) {
            int n;
            InputReader lllIIIIllIIlIl;
            if (InputReader.lIllllIllIl(lllIIIIllIIlIl.filter)) {
                return lllIIIIllIIlIl.filter.isSpaceChar(IllIIIIllIIlIl);
            }
            if (!(InputReader.IIllllIllIl(IllIIIIllIIlIl, IllllIIll[11]) && InputReader.IIllllIllIl(IllIIIIllIIlIl, IllllIIll[7]) && InputReader.IIllllIllIl(IllIIIIllIIlIl, IllllIIll[12]) && InputReader.IIllllIllIl(IllIIIIllIIlIl, IllllIIll[13]) && !InputReader.IllIllIllIl(IllIIIIllIIlIl, IllllIIll[1]))) {
                n = IllllIIll[3];
                "".length();
                if ("   ".length() < 0) {
                    return ("   ".length() << (0x3D ^ 0x1E ^ (0x89 ^ 0x9A) << " ".length()) & ("   ".length() << ((0x8D ^ 0x9A) << " ".length() ^ (0x12 ^ 0x39)) ^ -" ".length())) != 0;
                }
            } else {
                n = IllllIIll[2];
            }
            return n != 0;
        }

        public String next() {
            InputReader IIlIIIIllIIlIl;
            return IIlIIIIllIIlIl.String();
        }

        static {
            InputReader.lIlIllIllIl();
        }

        private static void lIlIllIllIl() {
            IllllIIll = new int[14];
            InputReader.IllllIIll[0] = " ".length() << (((0xA6 ^ 0x97) << " ".length() ^ (0x71 ^ 0x16)) << " ".length());
            InputReader.IllllIIll[1] = -" ".length();
            InputReader.IllllIIll[2] = (0x29 ^ 0x2C) << " ".length() & ~((0xAF ^ 0xAA) << " ".length());
            InputReader.IllllIIll[3] = " ".length();
            InputReader.IllllIIll[4] = 0x91 ^ 0xBC;
            InputReader.IllllIIll[5] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
            InputReader.IllllIIll[6] = 124 + 55 - 170 + 132 ^ (0x3C ^ 0x11) << (" ".length() << " ".length());
            InputReader.IllllIIll[7] = (0x7E ^ 0x7B) << " ".length();
            InputReader.IllllIIll[8] = ((0x41 ^ 0x48) << " ".length() ^ (0xA7 ^ 0xA2)) << " ".length();
            InputReader.IllllIIll[9] = 0xE3 ^ 0x86;
            InputReader.IllllIIll[10] = 0x7D ^ 0x38;
            InputReader.IllllIIll[11] = " ".length() << ((0x33 ^ 2) << " ".length() ^ (0xCD ^ 0xAA));
            InputReader.IllllIIll[12] = 0x1C ^ 0x11;
            InputReader.IllllIIll[13] = 0x67 ^ 0x6E;
        }

        private static boolean IllIllIllIl(int n, int n2) {
            return n == n2;
        }

        private static boolean lllIllIllIl(int n, int n2) {
            return n >= n2;
        }

        private static boolean IlIlllIllIl(int n, int n2) {
            return n > n2;
        }

        private static boolean lIllllIllIl(Object object) {
            return object != null;
        }

        private static boolean lIIlllIllIl(int n) {
            return n != 0;
        }

        private static boolean llIlllIllIl(int n) {
            return n == 0;
        }

        private static boolean IIIlllIllIl(int n) {
            return n <= 0;
        }

        private static boolean IIllllIllIl(int n, int n2) {
            return n != n2;
        }

        public static interface SpaceCharFilter {
            public boolean isSpaceChar(int var1);
        }
    }

    private static class OutputWriter {
        private final PrintWriter writer;
        private static int[] IIlllIIll;

        public OutputWriter(OutputStream IlIlIIlllIIlIl) {
            OutputWriter llIlIIlllIIlIl;
            llIlIIlllIIlIl.writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(IlIlIIlllIIlIl)));
        }

        public OutputWriter(Writer IllIIIlllIIlIl) {
            OutputWriter lllIIIlllIIlIl;
            lllIIIlllIIlIl.writer = new PrintWriter(IllIIIlllIIlIl);
        }

        public void print(Object ... lIIIIIlllIIlIl) {
            OutputWriter IlIIIIlllIIlIl;
            int IIIIIIlllIIlIl = IIlllIIll[0];
            while (OutputWriter.llIIllIllIl(IIIIIIlllIIlIl, lIIIIIlllIIlIl.length)) {
                if (OutputWriter.IIlIllIllIl(IIIIIIlllIIlIl)) {
                    IlIIIIlllIIlIl.writer.print(IIlllIIll[1]);
                }
                IlIIIIlllIIlIl.writer.print(lIIIIIlllIIlIl[IIIIIIlllIIlIl]);
                ++IIIIIIlllIIlIl;
                "".length();
                if (" ".length() << (" ".length() << " ".length()) > " ".length()) continue;
                return;
            }
            IlIIIIlllIIlIl.writer.flush();
        }

        public void println(Object ... IIllllIllIIlIl) {
            OutputWriter lIllllIllIIlIl;
            lIllllIllIIlIl.print(IIllllIllIIlIl);
            lIllllIllIIlIl.writer.println();
            lIllllIllIIlIl.writer.flush();
        }

        public void close() {
            OutputWriter IlIlllIllIIlIl;
            IlIlllIllIIlIl.writer.close();
        }

        public void flush() {
            OutputWriter IIIlllIllIIlIl;
            IIIlllIllIIlIl.writer.flush();
        }

        static {
            OutputWriter.IlIIllIllIl();
        }

        private static void IlIIllIllIl() {
            IIlllIIll = new int[2];
            OutputWriter.IIlllIIll[0] = (0x30 ^ 0xF ^ (0x20 ^ 0x1B) << " ".length()) & ((1 ^ 0xC) << (" ".length() << (" ".length() << " ".length())) ^ 152 + 84 - 169 + 86 ^ -" ".length());
            OutputWriter.IIlllIIll[1] = " ".length() << (0x34 ^ 0x31);
        }

        private static boolean llIIllIllIl(int n, int n2) {
            return n < n2;
        }

        private static boolean IIlIllIllIl(int n) {
            return n != 0;
        }
    }
}

