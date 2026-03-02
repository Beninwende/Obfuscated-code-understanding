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
    private static int[] IlIlIlIll;

    public Main() {
        Main IlIlIllIlllIIl;
    }

    public static void main(String[] stringArray) {
        long lllllIlIlllIIl;
        InputReader llIIIllIlllIIl = new InputReader(System.in);
        OutputWriter IlIIIllIlllIIl = new OutputWriter(System.out);
        StringBuilder lIIIIllIlllIIl = new StringBuilder();
        long IIIIIllIlllIIl = llIIIllIlllIIl.Long();
        if (Main.IlllIllllIl(Main.llIlIllllIl(IIIIIllIlllIIl, Math.abs(IIIIIllIlllIIl - (lllllIlIlllIIl = llIIIllIlllIIl.Long()))))) {
            Object[] objectArray = new Object[IlIlIlIll[0]];
            objectArray[Main.IlIlIlIll[1]] = IIIIIllIlllIIl;
            IlIIIllIlllIIl.println(objectArray);
            "".length();
            if ("   ".length() <= -" ".length()) {
                return;
            }
        } else if (Main.llllIllllIl(Main.llIlIllllIl(IIIIIllIlllIIl % lllllIlIlllIIl, 0L))) {
            Object[] objectArray = new Object[IlIlIlIll[0]];
            objectArray[Main.IlIlIlIll[1]] = IlIlIlIll[1];
            IlIIIllIlllIIl.println(objectArray);
            "".length();
            if (null != null) {
                return;
            }
        } else {
            long IllllIlIlllIIl = IIIIIllIlllIIl % lllllIlIlllIIl;
            Object[] objectArray = new Object[IlIlIlIll[0]];
            objectArray[Main.IlIlIlIll[1]] = Math.min(IllllIlIlllIIl, Math.abs(IllllIlIlllIIl - lllllIlIlllIIl));
            IlIIIllIlllIIl.println(objectArray);
        }
    }

    static {
        Main.IIlIIllllIl();
    }

    private static void IIlIIllllIl() {
        IlIlIlIll = new int[2];
        Main.IlIlIlIll[0] = " ".length();
        Main.IlIlIlIll[1] = ((0x73 ^ 0x62) << (" ".length() << " ".length()) ^ (0xFD ^ 0x90)) & (0xC ^ 0x5B ^ (0x65 ^ 0x5A) << " ".length() ^ -" ".length());
    }

    private static boolean llllIllllIl(int n) {
        return n == 0;
    }

    private static boolean IlllIllllIl(int n) {
        return n <= 0;
    }

    private static int llIlIllllIl(long l, long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    private static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[llIlIlIll[llIIllIll[0]]];
        private int curChar;
        private int numChars;
        private SpaceCharFilter filter;
        private static int[] llIlIlIll;
        private static int[] llIIllIll;

        public InputReader(InputStream IIIIIIIIlllIIl) {
            InputReader lIIIIIIIlllIIl;
            lIIIIIIIlllIIl.stream = IIIIIIIIlllIIl;
        }

        public int read() {
            block5: {
                InputReader llIlllllIllIIl;
                if (InputReader.llIllllllIl(InputReader.IllIIllllIl(llIlllllIllIIl.numChars, llIlIlIll[llIIllIll[1]]) ? 1 : 0)) {
                    throw new InputMismatchException();
                }
                if (!InputReader.llIllllllIl(InputReader.IIIlIllllIl(llIlllllIllIIl.curChar, llIlllllIllIIl.numChars) ? 1 : 0)) break block5;
                llIlllllIllIIl.curChar = llIlIlIll[llIIllIll[2]];
                try {
                    llIlllllIllIIl.numChars = llIlllllIllIIl.stream.read(llIlllllIllIIl.buf);
                    "".length();
                    "".length();
                }
                catch (IOException IlIlllllIllIIl) {
                    throw new InputMismatchException();
                }
                if (InputReader.IIlllllllIl("   ".length(), " ".length())) {
                    return " ".length() & (" ".length() ^ llIIllIll[3]);
                }
                if (InputReader.llIllllllIl(InputReader.IlIlIllllIl(llIlllllIllIIl.numChars) ? 1 : 0)) {
                    return llIlIlIll[llIIllIll[1]];
                }
            }
            int n = this.curChar;
            this.curChar = n + llIlIlIll[llIIllIll[4]];
            return this.buf[n];
        }

        /*
         * WARNING - void declaration
         */
        public int Int() {
            void var2_2;
            void var3_3;
            InputReader llIIllllIllIIl;
            int IlIIllllIllIIl = llIIllllIllIIl.read();
            while (InputReader.llIllllllIl(InputReader.IIllIllllIl(llIIllllIllIIl.isSpaceChar(IlIIllllIllIIl) ? 1 : 0) ? 1 : 0)) {
                IlIIllllIllIIl = llIIllllIllIIl.read();
                "".length();
                "".length();
                if (!InputReader.lIlllllllIl(" ".length() << (" ".length() << " ".length()))) continue;
                return (llIIllIll[5] ^ llIIllIll[6] ^ "   ".length() << "   ".length()) & ("   ".length() << (" ".length() << (" ".length() << " ".length())) ^ (llIIllIll[7] ^ llIIllIll[8]) ^ -" ".length());
            }
            int lIIIllllIllIIl = llIlIlIll[llIIllIll[4]];
            if (InputReader.llIllllllIl(InputReader.IllIIllllIl(IlIIllllIllIIl, llIlIlIll[llIIllIll[9]]) ? 1 : 0)) {
                lIIIllllIllIIl = llIlIlIll[llIIllIll[1]];
                IlIIllllIllIIl = llIIllllIllIIl.read();
            }
            int IIIIllllIllIIl = llIlIlIll[llIIllIll[2]];
            do {
                if (!InputReader.llIllllllIl(InputReader.IIIlIllllIl(IlIIllllIllIIl, llIlIlIll[llIIllIll[10]]) ? 1 : 0) || InputReader.llIllllllIl(InputReader.lIllIllllIl(IlIIllllIllIIl, llIlIlIll[llIIllIll[11]]) ? 1 : 0)) {
                    throw new InputMismatchException();
                }
                IIIIllllIllIIl *= llIlIlIll[llIIllIll[12]];
                IIIIllllIllIIl += IlIIllllIllIIl - llIlIlIll[llIIllIll[10]];
            } while (!InputReader.llIllllllIl(InputReader.IIllIllllIl(llIIllllIllIIl.isSpaceChar(IlIIllllIllIIl = llIIllllIllIIl.read()) ? 1 : 0) ? 1 : 0));
            return (int)(var3_3 * var2_2);
        }

        /*
         * WARNING - void declaration
         */
        public String String() {
            void var2_2;
            InputReader IIIlIlllIllIIl;
            int lllIIlllIllIIl = IIIlIlllIllIIl.read();
            while (InputReader.llIllllllIl(InputReader.IIllIllllIl(IIIlIlllIllIIl.isSpaceChar(lllIIlllIllIIl) ? 1 : 0) ? 1 : 0)) {
                lllIIlllIllIIl = IIIlIlllIllIIl.read();
                "".length();
                "".length();
                if (!InputReader.IllllllllIl((llIIllIll[13] ^ llIIllIll[14]) << " ".length() & ((llIIllIll[15] ^ llIIllIll[16]) << " ".length() ^ llIIllIll[3]))) continue;
                return null;
            }
            StringBuilder IllIIlllIllIIl = new StringBuilder();
            do {
                IllIIlllIllIIl.appendCodePoint(lllIIlllIllIIl);
                "".length();
            } while (!InputReader.llIllllllIl(InputReader.IIllIllllIl(IIIlIlllIllIIl.isSpaceChar(lllIIlllIllIIl = IIIlIlllIllIIl.read()) ? 1 : 0) ? 1 : 0));
            return String.valueOf(var2_2);
        }

        /*
         * WARNING - void declaration
         */
        public double Double() {
            void var2_2;
            void var3_3;
            InputReader lIlllIllIllIIl;
            int IIlllIllIllIIl = lIlllIllIllIIl.read();
            while (InputReader.llIllllllIl(InputReader.IIllIllllIl(lIlllIllIllIIl.isSpaceChar(IIlllIllIllIIl) ? 1 : 0) ? 1 : 0)) {
                IIlllIllIllIIl = lIlllIllIllIIl.read();
                "".length();
                "".length();
                if (!InputReader.lllllllllIl((llIIllIll[17] ^ llIIllIll[18]) << " ".length() & ((llIIllIll[19] ^ llIIllIll[20]) << " ".length() ^ llIIllIll[3]))) continue;
                return 0.0;
            }
            int llIllIllIllIIl = llIlIlIll[llIIllIll[4]];
            if (InputReader.llIllllllIl(InputReader.IllIIllllIl(IIlllIllIllIIl, llIlIlIll[llIIllIll[9]]) ? 1 : 0)) {
                llIllIllIllIIl = llIlIlIll[llIIllIll[1]];
                IIlllIllIllIIl = lIlllIllIllIIl.read();
            }
            double IlIllIllIllIIl = 0.0;
            while (InputReader.llIllllllIl(InputReader.IIIIlllllIl(lIlllIllIllIIl.isSpaceChar(IIlllIllIllIIl) ? 1 : 0) ? 1 : 0) && InputReader.llIllllllIl(InputReader.lIIIlllllIl(IIlllIllIllIIl, llIlIlIll[llIIllIll[21]]) ? 1 : 0)) {
                if (!InputReader.llIllllllIl(InputReader.lIIIlllllIl(IIlllIllIllIIl, llIlIlIll[llIIllIll[22]]) ? 1 : 0) || InputReader.llIllllllIl(InputReader.IllIIllllIl(IIlllIllIllIIl, llIlIlIll[llIIllIll[23]]) ? 1 : 0)) {
                    return IlIllIllIllIIl * Math.pow(10.0, lIlllIllIllIIl.Int());
                }
                if (!InputReader.llIllllllIl(InputReader.IIIlIllllIl(IIlllIllIllIIl, llIlIlIll[llIIllIll[10]]) ? 1 : 0) || InputReader.llIllllllIl(InputReader.lIllIllllIl(IIlllIllIllIIl, llIlIlIll[llIIllIll[11]]) ? 1 : 0)) {
                    throw new InputMismatchException();
                }
                IlIllIllIllIIl *= 10.0;
                IlIllIllIllIIl += (double)(IIlllIllIllIIl - llIlIlIll[llIIllIll[10]]);
                IIlllIllIllIIl = lIlllIllIllIIl.read();
                "".length();
                "".length();
                if (!InputReader.lIlllllllIl(" ".length() << (" ".length() << " ".length()))) continue;
                return 0.0;
            }
            if (InputReader.llIllllllIl(InputReader.IllIIllllIl(IIlllIllIllIIl, llIlIlIll[llIIllIll[21]]) ? 1 : 0)) {
                IIlllIllIllIIl = lIlllIllIllIIl.read();
                double lIIllIllIllIIl = 1.0;
                while (InputReader.llIllllllIl(InputReader.IIIIlllllIl(lIlllIllIllIIl.isSpaceChar(IIlllIllIllIIl) ? 1 : 0) ? 1 : 0)) {
                    if (!InputReader.llIllllllIl(InputReader.lIIIlllllIl(IIlllIllIllIIl, llIlIlIll[llIIllIll[22]]) ? 1 : 0) || InputReader.llIllllllIl(InputReader.IllIIllllIl(IIlllIllIllIIl, llIlIlIll[llIIllIll[23]]) ? 1 : 0)) {
                        return IlIllIllIllIIl * Math.pow(10.0, lIlllIllIllIIl.Int());
                    }
                    if (!InputReader.llIllllllIl(InputReader.IIIlIllllIl(IIlllIllIllIIl, llIlIlIll[llIIllIll[10]]) ? 1 : 0) || InputReader.llIllllllIl(InputReader.lIllIllllIl(IIlllIllIllIIl, llIlIlIll[llIIllIll[11]]) ? 1 : 0)) {
                        throw new InputMismatchException();
                    }
                    IlIllIllIllIIl += (double)(IIlllIllIllIIl - llIlIlIll[llIIllIll[10]]) * (lIIllIllIllIIl /= 10.0);
                    IIlllIllIllIIl = lIlllIllIllIIl.read();
                    "".length();
                    "".length();
                    if (!InputReader.lIIIIIIIIll((llIIllIll[24] ^ llIIllIll[25]) & (llIIllIll[26] ^ llIIllIll[27] ^ llIIllIll[3]), (llIIllIll[28] ^ llIIllIll[29]) << " ".length() & ((llIIllIll[30] ^ llIIllIll[31]) << " ".length() ^ llIIllIll[3]))) continue;
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
            InputReader llllIIllIllIIl;
            int IlllIIllIllIIl = llllIIllIllIIl.read();
            while (InputReader.llIllllllIl(InputReader.IIllIllllIl(llllIIllIllIIl.isSpaceChar(IlllIIllIllIIl) ? 1 : 0) ? 1 : 0)) {
                IlllIIllIllIIl = llllIIllIllIIl.read();
                "".length();
                "".length();
                if (!InputReader.IlIIIIIIIll(" ".length() << (" ".length() << " ".length()), " ".length() << (" ".length() << " ".length()))) continue;
                return 0L;
            }
            int lIllIIllIllIIl = llIlIlIll[llIIllIll[4]];
            if (InputReader.llIllllllIl(InputReader.IllIIllllIl(IlllIIllIllIIl, llIlIlIll[llIIllIll[9]]) ? 1 : 0)) {
                lIllIIllIllIIl = llIlIlIll[llIIllIll[1]];
                IlllIIllIllIIl = llllIIllIllIIl.read();
            }
            long IIllIIllIllIIl = 0L;
            do {
                if (!InputReader.llIllllllIl(InputReader.IIIlIllllIl(IlllIIllIllIIl, llIlIlIll[llIIllIll[10]]) ? 1 : 0) || InputReader.llIllllllIl(InputReader.lIllIllllIl(IlllIIllIllIIl, llIlIlIll[llIIllIll[11]]) ? 1 : 0)) {
                    throw new InputMismatchException();
                }
                IIllIIllIllIIl *= 10L;
                IIllIIllIllIIl += (long)(IlllIIllIllIIl - llIlIlIll[llIIllIll[10]]);
            } while (!InputReader.llIllllllIl(InputReader.IIllIllllIl(llllIIllIllIIl.isSpaceChar(IlllIIllIllIIl = llllIIllIllIIl.read()) ? 1 : 0) ? 1 : 0));
            return (long)(var3_3 * (long)var2_2);
        }

        public boolean isSpaceChar(int IIlIIIllIllIIl) {
            int n;
            InputReader lIlIIIllIllIIl;
            if (InputReader.llIllllllIl(InputReader.IlIIlllllIl(lIlIIIllIllIIl.filter) ? 1 : 0)) {
                return lIlIIIllIllIIl.filter.isSpaceChar(IIlIIIllIllIIl);
            }
            if (!(InputReader.llIllllllIl(InputReader.lIIIlllllIl(IIlIIIllIllIIl, llIlIlIll[llIIllIll[32]]) ? 1 : 0) && InputReader.llIllllllIl(InputReader.lIIIlllllIl(IIlIIIllIllIIl, llIlIlIll[llIIllIll[12]]) ? 1 : 0) && InputReader.llIllllllIl(InputReader.lIIIlllllIl(IIlIIIllIllIIl, llIlIlIll[llIIllIll[33]]) ? 1 : 0) && InputReader.llIllllllIl(InputReader.lIIIlllllIl(IIlIIIllIllIIl, llIlIlIll[llIIllIll[16]]) ? 1 : 0) && !InputReader.llIllllllIl(InputReader.IllIIllllIl(IIlIIIllIllIIl, llIlIlIll[llIIllIll[1]]) ? 1 : 0))) {
                n = llIlIlIll[llIIllIll[4]];
                "".length();
                "".length();
                if (InputReader.IllllllllIl(-"  ".length())) {
                    return ((llIIllIll[34] ^ llIIllIll[29] ^ (llIIllIll[35] ^ llIIllIll[36]) << (" ".length() << " ".length())) & (llIIllIll[37] + llIIllIll[38] - llIIllIll[39] + llIIllIll[40] ^ (llIIllIll[41] ^ llIIllIll[42]) << (" ".length() << " ".length()) ^ -" ".length())) != 0;
                }
            } else {
                n = llIlIlIll[llIIllIll[2]];
            }
            return n != 0;
        }

        public String next() {
            InputReader IIIIIIllIllIIl;
            return IIIIIIllIllIIl.String();
        }

        static {
            InputReader.IlIllllllIl();
            InputReader.lIlIIllllIl();
        }

        private static void lIlIIllllIl() {
            llIlIlIll = new int[llIIllIll[43]];
            InputReader.llIlIlIll[InputReader.llIIllIll[0]] = " ".length() << ((llIIllIll[44] ^ llIIllIll[6] ^ (llIIllIll[45] ^ llIIllIll[46]) << " ".length()) << " ".length());
            InputReader.llIlIlIll[InputReader.llIIllIll[1]] = -" ".length();
            InputReader.llIlIlIll[InputReader.llIIllIll[2]] = " ".length() << "   ".length() & (" ".length() << "   ".length() ^ -" ".length());
            InputReader.llIlIlIll[InputReader.llIIllIll[4]] = " ".length();
            InputReader.llIlIlIll[InputReader.llIIllIll[9]] = llIIllIll[47] ^ llIIllIll[48];
            InputReader.llIlIlIll[InputReader.llIIllIll[10]] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
            InputReader.llIlIlIll[InputReader.llIIllIll[11]] = llIIllIll[49] ^ llIIllIll[50] ^ (llIIllIll[51] ^ llIIllIll[52]) << "   ".length();
            InputReader.llIlIlIll[InputReader.llIIllIll[12]] = (llIIllIll[53] ^ llIIllIll[14]) << " ".length();
            InputReader.llIlIlIll[InputReader.llIIllIll[21]] = (llIIllIll[54] ^ llIIllIll[55] ^ (llIIllIll[56] ^ llIIllIll[57]) << " ".length()) << " ".length();
            InputReader.llIlIlIll[InputReader.llIIllIll[22]] = (llIIllIll[58] ^ llIIllIll[45]) << (" ".length() << " ".length()) ^ (llIIllIll[59] ^ llIIllIll[40]);
            InputReader.llIlIlIll[InputReader.llIIllIll[23]] = llIIllIll[60] + llIIllIll[61] - llIIllIll[62] + llIIllIll[9] ^ " ".length() << (llIIllIll[63] ^ llIIllIll[28]);
            InputReader.llIlIlIll[InputReader.llIIllIll[32]] = " ".length() << (llIIllIll[64] + llIIllIll[65] - llIIllIll[66] + llIIllIll[67] ^ (llIIllIll[68] ^ llIIllIll[69]) << " ".length());
            InputReader.llIlIlIll[InputReader.llIIllIll[33]] = llIIllIll[70] ^ llIIllIll[71];
            InputReader.llIlIlIll[InputReader.llIIllIll[16]] = llIIllIll[72] ^ llIIllIll[59];
        }

        private static boolean IllIIllllIl(int n, int n2) {
            boolean bl;
            if (InputReader.IIlllllllIl(n, n2)) {
                bl = llIIllIll[1];
                "".length();
                if (" ".length() < 0) {
                    return ((0x15 ^ 0x56) & ~(0x3C ^ 0x7F)) != 0;
                }
            } else {
                bl = llIIllIll[0];
            }
            return bl;
        }

        private static boolean IIIlIllllIl(int n, int n2) {
            boolean bl;
            if (InputReader.lIlIIIIIIll(n, n2)) {
                bl = llIIllIll[1];
                "".length();
                if ("   ".length() < " ".length() << " ".length()) {
                    return (" ".length() << ("   ".length() << " ".length()) & (" ".length() << ("   ".length() << " ".length()) ^ -" ".length())) != 0;
                }
            } else {
                bl = llIIllIll[0];
            }
            return bl;
        }

        private static boolean lIllIllllIl(int n, int n2) {
            boolean bl;
            if (InputReader.IllIIIIIIll(n, n2)) {
                bl = llIIllIll[1];
                "".length();
                if (((0x3D ^ 0x64) & ~(0x63 ^ 0x3A)) > ((0x85 ^ 0xC4) & ~(0x68 ^ 0x29))) {
                    return ((0x42 ^ 3) & ~(0x26 ^ 0x67)) != 0;
                }
            } else {
                bl = llIIllIll[0];
            }
            return bl;
        }

        private static boolean IlIIlllllIl(Object object) {
            boolean bl;
            if (InputReader.lllIIIIIIll(object)) {
                bl = llIIllIll[1];
                "".length();
                if (" ".length() << " ".length() == " ".length()) {
                    return ((62 + 127 - -17 + 11 ^ (0x2B ^ 0xE) << (" ".length() << " ".length())) & (53 + 57 - -8 + 19 ^ (0xF ^ 0x3E) << (" ".length() << " ".length()) ^ -" ".length())) != 0;
                }
            } else {
                bl = llIIllIll[0];
            }
            return bl;
        }

        private static boolean IIllIllllIl(int n) {
            boolean bl;
            if (InputReader.llIllllllIl(n)) {
                bl = llIIllIll[1];
                "".length();
                if ("   ".length() < 0) {
                    return ((0x69 ^ 0x4A) & ~(0x4C ^ 0x6F)) != 0;
                }
            } else {
                bl = llIIllIll[0];
            }
            return bl;
        }

        private static boolean IIIIlllllIl(int n) {
            boolean bl;
            if (InputReader.lIlllllllIl(n)) {
                bl = llIIllIll[1];
                "".length();
                if (" ".length() < ((0x5E ^ 0x75) << " ".length() & ~((0x83 ^ 0xA8) << " ".length()))) {
                    return ((0x91 ^ 0xBE) << " ".length() & ~((0x68 ^ 0x47) << " ".length())) != 0;
                }
            } else {
                bl = llIIllIll[0];
            }
            return bl;
        }

        private static boolean IlIlIllllIl(int n) {
            boolean bl;
            if (InputReader.IIIlIIIIIll(n)) {
                bl = llIIllIll[1];
                "".length();
                if (" ".length() << " ".length() != " ".length() << " ".length()) {
                    return ((" ".length() << (" ".length() << " ".length()) ^ (0xE3 ^ 0xA8)) & (0x61 ^ 0x10 ^ (0x2A ^ 0x35) << " ".length() ^ -" ".length())) != 0;
                }
            } else {
                bl = llIIllIll[0];
            }
            return bl;
        }

        private static boolean lIIIlllllIl(int n, int n2) {
            boolean bl;
            if (InputReader.lIIIIIIIIll(n, n2)) {
                bl = llIIllIll[1];
                "".length();
                if (-" ".length() > 0) {
                    return ((0x20 ^ 0x37) << " ".length() & ~((0x64 ^ 0x73) << " ".length())) != 0;
                }
            } else {
                bl = llIIllIll[0];
            }
            return bl;
        }

        private static void IlIllllllIl() {
            llIIllIll = new int[73];
            InputReader.llIIllIll[0] = ((0x4E ^ 0x45) << " ".length() ^ (0xA3 ^ 0xA4)) << (" ".length() << " ".length()) & ((102 + 67 - 121 + 103 ^ (0x10 ^ 0x53) << " ".length()) << (" ".length() << " ".length()) ^ -" ".length());
            InputReader.llIIllIll[1] = " ".length();
            InputReader.llIIllIll[2] = " ".length() << " ".length();
            InputReader.llIIllIll[3] = -" ".length();
            InputReader.llIIllIll[4] = "   ".length();
            InputReader.llIIllIll[5] = (0xA0 ^ 0x83) << (" ".length() << " ".length());
            InputReader.llIIllIll[6] = (0xE8 ^ 0xB5) + ((0xB9 ^ 0xA0) << (" ".length() << " ".length())) - -"   ".length() + "   ".length();
            InputReader.llIIllIll[7] = ((0x69 ^ 0x42) << (" ".length() << " ".length())) + (0x35 ^ 0x30) - (0x85 ^ 0xAC) + (0x34 ^ 0x7D);
            InputReader.llIIllIll[8] = (0x7E ^ 0x27) << " ".length();
            InputReader.llIIllIll[9] = " ".length() << (" ".length() << " ".length());
            InputReader.llIIllIll[10] = 0x96 ^ 0x83 ^ " ".length() << (" ".length() << (" ".length() << " ".length()));
            InputReader.llIIllIll[11] = "   ".length() << " ".length();
            InputReader.llIIllIll[12] = 0x4A ^ 0x4D;
            InputReader.llIIllIll[13] = (0xA1 ^ 0x8A) << (" ".length() << " ".length()) ^ 56 + 177 - 220 + 186;
            InputReader.llIIllIll[14] = (0x2E ^ 0xD) << " ".length();
            InputReader.llIIllIll[15] = " ".length() << (82 + 191 - 128 + 48 ^ (0xA0 ^ 0x91) << (" ".length() << " ".length()));
            InputReader.llIIllIll[16] = 0x48 ^ 0x45;
            InputReader.llIIllIll[17] = " ".length() << ("   ".length() << " ".length());
            InputReader.llIIllIll[18] = (0xC ^ 0x1F) << (" ".length() << " ".length()) ^ (0x32 ^ 0x35);
            InputReader.llIIllIll[19] = ((9 ^ 4) << (" ".length() << " ".length()) ^ (9 ^ 0x28)) << "   ".length();
            InputReader.llIIllIll[20] = 137 + 127 - 201 + 100;
            InputReader.llIIllIll[21] = " ".length() << "   ".length();
            InputReader.llIIllIll[22] = 0x97 ^ 0x9E;
            InputReader.llIIllIll[23] = ((0xB9 ^ 0x9A) << " ".length() ^ (0x1E ^ 0x5D)) << " ".length();
            InputReader.llIIllIll[24] = (0x68 ^ 0x79) << " ".length();
            InputReader.llIIllIll[25] = (0xDF ^ 0x84) << " ".length() ^ 99 + 125 - 185 + 126;
            InputReader.llIIllIll[26] = ((0x3E ^ 0x23) << " ".length() ^ (0x9D ^ 0xAA)) << "   ".length();
            InputReader.llIIllIll[27] = (0x11 ^ 0x16) << (" ".length() << (" ".length() << " ".length())) ^ (0x14 ^ 0x3D);
            InputReader.llIIllIll[28] = (0xD1 ^ 0x82) << " ".length();
            InputReader.llIIllIll[29] = ((0x13 ^ 4) << (" ".length() << " ".length())) + (0x68 ^ 0x25) - ((0x52 ^ 1) << " ".length()) + (" ".length() << (0x2A ^ 0x2D));
            InputReader.llIIllIll[30] = ((0x38 ^ 1) << " ".length() ^ (0xDC ^ 0x97)) << (" ".length() << " ".length());
            InputReader.llIIllIll[31] = 54 + 160 - 156 + 121 + ((0xAE ^ 0x97) << " ".length()) - (0x19 ^ 0x62) + (0xBB ^ 0xAC);
            InputReader.llIIllIll[32] = 0x98 ^ 0x93;
            InputReader.llIIllIll[33] = "   ".length() << (" ".length() << " ".length());
            InputReader.llIIllIll[34] = (0x72 ^ 0x7B ^ (0x89 ^ 0xB4) << " ".length()) << " ".length();
            InputReader.llIIllIll[35] = (78 + 1 - -56 + 10 ^ (0xCF ^ 0x8A) << " ".length()) << " ".length();
            InputReader.llIIllIll[36] = 109 + 120 - 112 + 28 ^ (0x5F ^ 0x74) << (" ".length() << " ".length());
            InputReader.llIIllIll[37] = 0x60 ^ 0x21;
            InputReader.llIIllIll[38] = 13 + 114 - -77 + 29 ^ (0x7C ^ 0x6F) << "   ".length();
            InputReader.llIIllIll[39] = (0x2B ^ 0x24) + ((5 ^ 0x1A) << (" ".length() << " ".length())) - (" ".length() << (0x2C ^ 0x29)) + (" ".length() << (0x6E ^ 0x6B));
            InputReader.llIIllIll[40] = (0x6A ^ 0x59) << " ".length();
            InputReader.llIIllIll[41] = (0x5F ^ 0x4E) << (" ".length() << " ".length());
            InputReader.llIIllIll[42] = 0x3E ^ 0x4B;
            InputReader.llIIllIll[43] = (0x17 ^ 0x6C ^ (0xBB ^ 0xA4) << (" ".length() << " ".length())) << " ".length();
            InputReader.llIIllIll[44] = (0x65 ^ 0x68) << (" ".length() << (" ".length() << " ".length()));
            InputReader.llIIllIll[45] = ((0xC5 ^ 0xC2) << "   ".length()) + ((0xF1 ^ 0xC2) << " ".length()) - ((0xA0 ^ 0x81) << (" ".length() << " ".length())) + (0x28 ^ 0x4D);
            InputReader.llIIllIll[46] = (" ".length() << (" ".length() << (" ".length() << " ".length())) ^ (0x89 ^ 0xA2)) << " ".length();
            InputReader.llIIllIll[47] = (0x81 ^ 0x8E ^ (0x95 ^ 0x80) << (" ".length() << " ".length())) << " ".length();
            InputReader.llIIllIll[48] = 115 + 143 - 147 + 44;
            InputReader.llIIllIll[49] = (0x6C ^ 0x15) << " ".length();
            InputReader.llIIllIll[50] = (0 ^ 0x63) + (4 + 80 - 58 + 101) - ((0x40 ^ 0x69) << " ".length()) + "   ".length();
            InputReader.llIIllIll[51] = (0x4B ^ 0x44) << " ".length() ^ (0xE7 ^ 0x82);
            InputReader.llIIllIll[52] = (0x92 ^ 0x95) << (" ".length() << (" ".length() << " ".length()));
            InputReader.llIIllIll[53] = 0x74 ^ 0x37;
            InputReader.llIIllIll[54] = ((0x69 ^ 0x46) << (" ".length() << " ".length()) ^ 106 + 26 - 92 + 139) << (" ".length() << (" ".length() << " ".length()));
            InputReader.llIIllIll[55] = 35 + 103 - 29 + 64;
            InputReader.llIIllIll[56] = (0xB4 ^ 0xB3) << (" ".length() << " ".length());
            InputReader.llIIllIll[57] = (0x80 ^ 0xC3) << " ".length() ^ 108 + 130 - 137 + 90;
            InputReader.llIIllIll[58] = (0x80 ^ 0xBD) << " ".length();
            InputReader.llIIllIll[59] = 0xB7 ^ 0xA0;
            InputReader.llIIllIll[60] = (66 + 24 - 0 + 51 ^ (0x32 ^ 0x79) << " ".length()) << (" ".length() << " ".length());
            InputReader.llIIllIll[61] = (0x20 ^ 0x4B ^ " ".length() << ("   ".length() << " ".length())) << (" ".length() << " ".length());
            InputReader.llIIllIll[62] = 0x2E ^ 0x4F ^ (0x6C ^ 0x77) << " ".length();
            InputReader.llIIllIll[63] = ((9 ^ 0) << " ".length()) + (0x6F ^ 0x40) - -(0x6A ^ 0x5F) + (0x49 ^ 0x62);
            InputReader.llIIllIll[64] = "   ".length() << (9 + 109 - 110 + 119 ^ (0xBF ^ 0x82) << " ".length());
            InputReader.llIIllIll[65] = (0x8D ^ 0xA8) + ((0x42 ^ 0x5B) << (" ".length() << " ".length())) - (0x6E ^ 0x1D) + (0x59 ^ 0x2A);
            InputReader.llIIllIll[66] = (0xEB ^ 0xA8) << " ".length();
            InputReader.llIIllIll[67] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
            InputReader.llIIllIll[68] = " ".length() << "   ".length() ^ (0x39 ^ 0x52);
            InputReader.llIIllIll[69] = ((0x40 ^ 0x7D) << " ".length() ^ 100 + 87 - 60 + 0) << "   ".length();
            InputReader.llIIllIll[70] = (0xC2 ^ 0x9D) << " ".length();
            InputReader.llIIllIll[71] = 55 + 35 - 79 + 168;
            InputReader.llIIllIll[72] = (0x4E ^ 0x41) << " ".length();
        }

        private static boolean IIlllllllIl(int n, int n2) {
            return n == n2;
        }

        private static boolean lIlIIIIIIll(int n, int n2) {
            return n >= n2;
        }

        private static boolean IlIIIIIIIll(int n, int n2) {
            return n < n2;
        }

        private static boolean IllIIIIIIll(int n, int n2) {
            return n > n2;
        }

        private static boolean lllIIIIIIll(Object object) {
            return object != null;
        }

        private static boolean llIllllllIl(int n) {
            return n != 0;
        }

        private static boolean lIlllllllIl(int n) {
            return n == 0;
        }

        private static boolean lllllllllIl(int n) {
            return n < 0;
        }

        private static boolean IIIlIIIIIll(int n) {
            return n <= 0;
        }

        private static boolean IllllllllIl(int n) {
            return n > 0;
        }

        private static boolean lIIIIIIIIll(int n, int n2) {
            return n != n2;
        }

        public static interface SpaceCharFilter {
            public boolean isSpaceChar(int var1);
        }
    }

    private static class OutputWriter {
        private final PrintWriter writer;
        private static int[] lIllIlIll;
        private static String[] IlIIllIll;
        private static int[] IllIllIll;

        public OutputWriter(OutputStream lllIlllIIllIIl) {
            OutputWriter IIIllllIIllIIl;
            IIIllllIIllIIl.writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(lllIlllIIllIIl)));
        }

        public OutputWriter(Writer lIIIlllIIllIIl) {
            OutputWriter IlIIlllIIllIIl;
            IlIIlllIIllIIl.writer = new PrintWriter(lIIIlllIIllIIl);
        }

        public void print(Object ... IlIlIllIIllIIl) {
            OutputWriter llIlIllIIllIIl;
            int lIIlIllIIllIIl = lIllIlIll[IllIllIll[0]];
            while (OutputWriter.llIlIIIIIll(OutputWriter.lllIIllllIl(lIIlIllIIllIIl, IlIlIllIIllIIl.length) ? 1 : 0)) {
                if (OutputWriter.llIlIIIIIll(OutputWriter.lIIlIllllIl(lIIlIllIIllIIl) ? 1 : 0)) {
                    llIlIllIIllIIl.writer.print(lIllIlIll[IllIllIll[1]]);
                }
                llIlIllIIllIIl.writer.print(IlIlIllIIllIIl[lIIlIllIIllIIl]);
                ++lIIlIllIIllIIl;
                IlIIllIll[IllIllIll[0]].length();
                "".length();
                if (!OutputWriter.IIllIIIIIll(-IlIIllIll[IllIllIll[1]].length())) continue;
                return;
            }
            llIlIllIIllIIl.writer.flush();
        }

        public void println(Object ... IlIIIllIIllIIl) {
            OutputWriter llIIIllIIllIIl;
            llIIIllIIllIIl.print(IlIIIllIIllIIl);
            llIIIllIIllIIl.writer.println();
            llIIIllIIllIIl.writer.flush();
        }

        public void close() {
            OutputWriter IllllIlIIllIIl;
            IllllIlIIllIIl.writer.close();
        }

        public void flush() {
            OutputWriter llIllIlIIllIIl;
            llIllIlIIllIIl.writer.flush();
        }

        static {
            OutputWriter.IlIlIIIIIll();
            OutputWriter.lIIllllllIl();
            OutputWriter.IIlIIllllIl();
        }

        private static void IIlIIllllIl() {
            lIllIlIll = new int[IllIllIll[2]];
            OutputWriter.lIllIlIll[OutputWriter.IllIllIll[0]] = (IllIllIll[3] ^ IllIllIll[4]) << IlIIllIll[IllIllIll[2]].length() & ((IllIllIll[5] ^ IllIllIll[6]) << IlIIllIll[IllIllIll[4]].length() ^ IllIllIll[7]);
            OutputWriter.lIllIlIll[OutputWriter.IllIllIll[1]] = IlIIllIll[IllIllIll[8]].length() << (IllIllIll[9] ^ IllIllIll[10] ^ (IllIllIll[11] ^ IllIllIll[12]) << (IlIIllIll[IllIllIll[13]].length() << IlIIllIll[IllIllIll[14]].length()));
        }

        private static boolean lllIIllllIl(int n, int n2) {
            boolean bl;
            if (OutputWriter.lIllIIIIIll(n, n2)) {
                bl = IllIllIll[1];
                "".length();
                if (" ".length() << (" ".length() << " ".length()) < -" ".length()) {
                    return ((208 + 75 - 243 + 215 ^ (0x90 ^ 0x87) << "   ".length()) & (1 ^ 0x4C ^ (0x3E ^ 0x3B) << " ".length() ^ -" ".length())) != 0;
                }
            } else {
                bl = IllIllIll[0];
            }
            return bl;
        }

        private static boolean lIIlIllllIl(int n) {
            boolean bl;
            if (OutputWriter.llIlIIIIIll(n)) {
                bl = IllIllIll[1];
                "".length();
                if (((0x15 ^ 0x28) & ~(0x25 ^ 0x18)) >= "   ".length()) {
                    return ((0xD5 ^ 0xC6) << (" ".length() << " ".length()) & ~((0x24 ^ 0x37) << (" ".length() << " ".length()))) != 0;
                }
            } else {
                bl = IllIllIll[0];
            }
            return bl;
        }

        private static void lIIllllllIl() {
            IlIIllIll = new String[IllIllIll[15]];
            OutputWriter.IlIIllIll[OutputWriter.IllIllIll[0]] = OutputWriter.IllIlllllIl("", "bVXbm");
            OutputWriter.IlIIllIll[OutputWriter.IllIllIll[1]] = OutputWriter.IllIlllllIl("aA==", "HGVlk");
            OutputWriter.IlIIllIll[OutputWriter.IllIllIll[2]] = OutputWriter.IllIlllllIl("Wg==", "zLYwz");
            OutputWriter.IlIIllIll[OutputWriter.IllIllIll[4]] = OutputWriter.IllIlllllIl("Vw==", "wNuYr");
            OutputWriter.IlIIllIll[OutputWriter.IllIllIll[8]] = OutputWriter.IllIlllllIl("UQ==", "qYDcr");
            OutputWriter.IlIIllIll[OutputWriter.IllIllIll[13]] = OutputWriter.IIIllllllIl("Lzlkby2oNBo=", "HZYub");
            OutputWriter.IlIIllIll[OutputWriter.IllIllIll[14]] = OutputWriter.IllIlllllIl("Sg==", "joOPm");
        }

        private static String IIIllllllIl(String IIllIIlIIllIIl, String llIlIIlIIllIIl) {
            try {
                SecretKeySpec IlIlIIlIIllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIlIIlIIllIIl.getBytes(StandardCharsets.UTF_8)), IllIllIll[16]), "DES");
                Cipher lIIlIIlIIllIIl = Cipher.getInstance("DES");
                lIIlIIlIIllIIl.init(IllIllIll[2], IlIlIIlIIllIIl);
                return new String(lIIlIIlIIllIIl.doFinal(Base64.getDecoder().decode(IIllIIlIIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception IIIlIIlIIllIIl) {
                IIIlIIlIIllIIl.printStackTrace();
                return null;
            }
        }

        /*
         * Unable to fully structure code
         */
        private static String IllIlllllIl(String IlIlllIIIllIIl, String lIIlllIIIllIIl) {
            IlIlllIIIllIIl = new String(Base64.getDecoder().decode(IlIlllIIIllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            IIIlllIIIllIIl = new StringBuilder();
            lllIllIIIllIIl = lIIlllIIIllIIl.toCharArray();
            IllIllIIIllIIl = OutputWriter.IllIllIll[0];
            IIllIlIIIllIIl = IlIlllIIIllIIl.toCharArray();
            lIllIlIIIllIIl = IIllIlIIIllIIl.length;
            IlllIlIIIllIIl = OutputWriter.IllIllIll[0];
            "".length();
            if (" ".length() != " ".length() << (" ".length() << " ".length())) ** GOTO lbl19
            return null;
lbl-1000:
            // 1 sources

            {
                lIlIllIIIllIIl = IIllIlIIIllIIl[IlllIlIIIllIIl];
                IIIlllIIIllIIl.append((char)(lIlIllIIIllIIl ^ lllIllIIIllIIl[IllIllIIIllIIl % lllIllIIIllIIl.length]));
                "".length();
                ++IllIllIIIllIIl;
                ++IlllIlIIIllIIl;
lbl19:
                // 2 sources

                ** while (!OutputWriter.IlllIIIIIll((int)IlllIlIIIllIIl, (int)lIllIlIIIllIIl))
            }
lbl20:
            // 1 sources

            return String.valueOf(IIIlllIIIllIIl);
        }

        private static void IlIlIIIIIll() {
            IllIllIll = new int[17];
            OutputWriter.IllIllIll[0] = (0x9F ^ 0xC6) & ~(0x7A ^ 0x23);
            OutputWriter.IllIllIll[1] = " ".length();
            OutputWriter.IllIllIll[2] = " ".length() << " ".length();
            OutputWriter.IllIllIll[3] = (0x7C ^ 0x79) << "   ".length();
            OutputWriter.IllIllIll[4] = "   ".length();
            OutputWriter.IllIllIll[5] = (0x6A ^ 0x4D) << (" ".length() << " ".length());
            OutputWriter.IllIllIll[6] = (0xF0 ^ 0x85) + ((0x44 ^ 0x4D) << (" ".length() << " ".length())) - (0xBE ^ 0xC3) + (3 + 44 - -32 + 76);
            OutputWriter.IllIllIll[7] = -" ".length();
            OutputWriter.IllIllIll[8] = " ".length() << (" ".length() << " ".length());
            OutputWriter.IllIllIll[9] = 0x53 ^ 0x74 ^ (0x5A ^ 0x43) << (" ".length() << " ".length());
            OutputWriter.IllIllIll[10] = (0x6E ^ 0x5B) << " ".length();
            OutputWriter.IllIllIll[11] = (0x35 ^ 0x24) << " ".length() ^ (0x5E ^ 0x39);
            OutputWriter.IllIllIll[12] = ((0x93 ^ 0xB4) << " ".length() ^ (0xEF ^ 0x86)) << " ".length();
            OutputWriter.IllIllIll[13] = 0x81 ^ 0x84;
            OutputWriter.IllIllIll[14] = "   ".length() << " ".length();
            OutputWriter.IllIllIll[15] = (0x38 ^ 0x1F) << " ".length() ^ (0x4A ^ 3);
            OutputWriter.IllIllIll[16] = " ".length() << "   ".length();
        }

        private static boolean IlllIIIIIll(int n, int n2) {
            return n >= n2;
        }

        private static boolean lIllIIIIIll(int n, int n2) {
            return n < n2;
        }

        private static boolean llIlIIIIIll(int n) {
            return n != 0;
        }

        private static boolean IIllIIIIIll(int n) {
            return n >= 0;
        }
    }
}

