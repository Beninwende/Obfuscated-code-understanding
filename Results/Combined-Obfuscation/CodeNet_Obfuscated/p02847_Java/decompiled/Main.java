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
import java.util.Arrays;
import java.util.Base64;
import java.util.InputMismatchException;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Main {
    private static String[] IIIIlllIl;
    private static int[] IIlIlllIl;

    public Main() {
        Main lIllIlIIllllIl;
    }

    public static void main(String[] stringArray) {
        InputStream IlIIIIIIllllIl = System.in;
        PrintStream lIIIIIIIllllIl = System.out;
        FastReader IIIIIIIIllllIl = new FastReader(IlIIIIIIllllIl);
        PrintWriter llllllllIlllIl = new PrintWriter(lIIIIIIIllllIl);
        String[] stringArray2 = new String[IIlIlllIl[0]];
        stringArray2[Main.IIlIlllIl[1]] = IIIIlllIl[IIlIlllIl[1]];
        stringArray2[Main.IIlIlllIl[2]] = IIIIlllIl[IIlIlllIl[2]];
        stringArray2[Main.IIlIlllIl[3]] = IIIIlllIl[IIlIlllIl[3]];
        stringArray2[Main.IIlIlllIl[4]] = IIIIlllIl[IIlIlllIl[4]];
        stringArray2[Main.IIlIlllIl[5]] = IIIIlllIl[IIlIlllIl[5]];
        stringArray2[Main.IIlIlllIl[6]] = IIIIlllIl[IIlIlllIl[6]];
        stringArray2[Main.IIlIlllIl[7]] = IIIIlllIl[IIlIlllIl[7]];
        String[] lIllllllIlllIl = stringArray2;
        String llIlllllIlllIl = IIIIIIIIllllIl.next();
        int IlllllllIlllIl = IIlIlllIl[1];
        while (Main.IIIllIIIlIl(IlllllllIlllIl, IIlIlllIl[0])) {
            if (Main.lIIllIIIlIl(llIlllllIlllIl.equals(lIllllllIlllIl[IlllllllIlllIl]) ? 1 : 0)) {
                "".length();
                if (null == null) break;
                return;
            }
            ++IlllllllIlllIl;
            "".length();
            if (null == null) continue;
            return;
        }
        llllllllIlllIl.println(IIlIlllIl[0] - IlllllllIlllIl);
        llllllllIlllIl.close();
    }

    static {
        Main.lllIlIIIlIl();
        Main.lIllIIIIlIl();
    }

    private static void lIllIIIIlIl() {
        IIIIlllIl = new String[IIlIlllIl[0]];
        Main.IIIIlllIl[Main.IIlIlllIl[1]] = Main.lIIlIIIIlIl("OjEC", "idLsa");
        Main.IIIIlllIl[Main.IIlIlllIl[2]] = Main.llIlIIIIlIl("jqauHnhip/k=", "CYONo");
        Main.IIIIlllIl[Main.IIlIlllIl[3]] = Main.lIIlIIIIlIl("DAYg", "XSeXt");
        Main.IIIIlllIl[Main.IIlIlllIl[4]] = Main.llIlIIIIlIl("0YBw+RVdlXM=", "nmqGj");
        Main.IIIIlllIl[Main.IIlIlllIl[5]] = Main.llIlIIIIlIl("9gSjZZvdKmM=", "aHSlS");
        Main.IIIIlllIl[Main.IIlIlllIl[6]] = Main.llIlIIIIlIl("3dpaNFOyOzM=", "ngwKP");
        Main.IIIIlllIl[Main.IIlIlllIl[7]] = Main.llIlIIIIlIl("/fS1Ce/4MvU=", "dfTYl");
    }

    private static String llIlIIIIlIl(String IlllIlllIlllIl, String lIllIlllIlllIl) {
        try {
            SecretKeySpec IIllIlllIlllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIllIlllIlllIl.getBytes(StandardCharsets.UTF_8)), IIlIlllIl[8]), "DES");
            Cipher llIlIlllIlllIl = Cipher.getInstance("DES");
            llIlIlllIlllIl.init(IIlIlllIl[3], IIllIlllIlllIl);
            return new String(llIlIlllIlllIl.doFinal(Base64.getDecoder().decode(IlllIlllIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IlIlIlllIlllIl) {
            IlIlIlllIlllIl.printStackTrace();
            return null;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static String lIIlIIIIlIl(String IIlllIllIlllIl, String llIllIllIlllIl) {
        IIlllIllIlllIl = new String(Base64.getDecoder().decode(IIlllIllIlllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        IlIllIllIlllIl = new StringBuilder();
        lIIllIllIlllIl = llIllIllIlllIl.toCharArray();
        IIIllIllIlllIl = Main.IIlIlllIl[1];
        IlllIIllIlllIl = IIlllIllIlllIl.toCharArray();
        llllIIllIlllIl = IlllIIllIlllIl.length;
        IIIIlIllIlllIl = Main.IIlIlllIl[1];
        "".length();
        if (-" ".length() <= 0) ** GOTO lbl19
        return null;
lbl-1000:
        // 1 sources

        {
            lllIlIllIlllIl = IlllIIllIlllIl[IIIIlIllIlllIl];
            IlIllIllIlllIl.append((char)(lllIlIllIlllIl ^ lIIllIllIlllIl[IIIllIllIlllIl % lIIllIllIlllIl.length]));
            "".length();
            ++IIIllIllIlllIl;
            ++IIIIlIllIlllIl;
lbl19:
            // 2 sources

            ** while (!Main.IlIllIIIlIl((int)IIIIlIllIlllIl, (int)llllIIllIlllIl))
        }
lbl20:
        // 1 sources

        return String.valueOf(IlIllIllIlllIl);
    }

    private static void lllIlIIIlIl() {
        IIlIlllIl = new int[9];
        Main.IIlIlllIl[0] = (0xBA ^ 0x93) << " ".length() ^ (0x12 ^ 0x47);
        Main.IIlIlllIl[1] = ((0x6B ^ 0x62) << " ".length() ^ (0xBA ^ 0x81)) & (90 + 66 - 65 + 52 ^ (0xEE ^ 0xBD) << " ".length() ^ -" ".length());
        Main.IIlIlllIl[2] = " ".length();
        Main.IIlIlllIl[3] = " ".length() << " ".length();
        Main.IIlIlllIl[4] = "   ".length();
        Main.IIlIlllIl[5] = " ".length() << (" ".length() << " ".length());
        Main.IIlIlllIl[6] = 0x5B ^ 0x5E;
        Main.IIlIlllIl[7] = "   ".length() << " ".length();
        Main.IIlIlllIl[8] = " ".length() << "   ".length();
    }

    private static boolean IlIllIIIlIl(int n, int n2) {
        return n >= n2;
    }

    private static boolean IIIllIIIlIl(int n, int n2) {
        return n < n2;
    }

    private static boolean lIIllIIIlIl(int n) {
        return n != 0;
    }

    public static class FastReader {
        private InputStream stream;
        private byte[] buf = new byte[llIIlllIl[0]];
        private int curChar;
        private int numChars;
        private SpaceCharFilter filter;
        private static String[] lIIIlllIl;
        private static int[] llIIlllIl;

        public FastReader(InputStream lIIIIllIllllIl) {
            FastReader IlIIIllIllllIl;
            IlIIIllIllllIl.stream = lIIIIllIllllIl;
        }

        public int read() {
            block5: {
                FastReader IllllIlIllllIl;
                if (FastReader.llllIIIIlIl(IllllIlIllllIl.numChars, llIIlllIl[1])) {
                    throw new InputMismatchException();
                }
                if (!FastReader.IIIIlIIIlIl(IllllIlIllllIl.curChar, IllllIlIllllIl.numChars)) break block5;
                IllllIlIllllIl.curChar = llIIlllIl[2];
                try {
                    IllllIlIllllIl.numChars = IllllIlIllllIl.stream.read(IllllIlIllllIl.buf);
                    "".length();
                }
                catch (IOException lIlllIlIllllIl) {
                    throw new InputMismatchException();
                }
                if (-((0xD4 ^ 0xC7) << (" ".length() << " ".length()) ^ (0xCD ^ 0x84)) >= 0) {
                    return (0x98 ^ 0xB7 ^ (7 ^ 2) << "   ".length()) << " ".length() & (((0x13 ^ 0x42) << " ".length() ^ 40 + 107 - 101 + 119) << " ".length() ^ -" ".length());
                }
                if (FastReader.lIIIlIIIlIl(IllllIlIllllIl.numChars)) {
                    return llIIlllIl[1];
                }
            }
            int n = this.curChar;
            this.curChar = n + llIIlllIl[3];
            return this.buf[n];
        }

        /*
         * WARNING - void declaration
         */
        public String nextLine() {
            void var2_2;
            BufferedReader lIIllIlIllllIl = new BufferedReader(new InputStreamReader(System.in));
            String IIIllIlIllllIl = lIIIlllIl[llIIlllIl[2]];
            try {
                IIIllIlIllllIl = lIIllIlIllllIl.readLine();
                "".length();
            }
            catch (IOException lllIlIlIllllIl) {
                lllIlIlIllllIl.printStackTrace();
            }
            if (" ".length() << " ".length() >= "   ".length()) {
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
            FastReader IlIIlIlIllllIl;
            int lIIIlIlIllllIl = IlIIlIlIllllIl.read();
            while (FastReader.IlIIlIIIlIl(IlIIlIlIllllIl.isSpaceChar(lIIIlIlIllllIl) ? 1 : 0)) {
                lIIIlIlIllllIl = IlIIlIlIllllIl.read();
                "".length();
                if (" ".length() << (" ".length() << " ".length()) == " ".length() << (" ".length() << " ".length())) continue;
                return (0xAC ^ 0xAB) << (" ".length() << " ".length()) & ~((0x8B ^ 0x8C) << (" ".length() << " ".length()));
            }
            int IIIIlIlIllllIl = llIIlllIl[3];
            if (FastReader.llllIIIIlIl(lIIIlIlIllllIl, llIIlllIl[4])) {
                IIIIlIlIllllIl = llIIlllIl[1];
                lIIIlIlIllllIl = IlIIlIlIllllIl.read();
            }
            int llllIIlIllllIl = llIIlllIl[2];
            do {
                if (!FastReader.IIIIlIIIlIl(lIIIlIlIllllIl, llIIlllIl[5]) || FastReader.llIIlIIIlIl(lIIIlIlIllllIl, llIIlllIl[6])) {
                    throw new InputMismatchException();
                }
                llllIIlIllllIl *= llIIlllIl[7];
                llllIIlIllllIl += lIIIlIlIllllIl - llIIlllIl[5];
            } while (!FastReader.IlIIlIIIlIl(IlIIlIlIllllIl.isSpaceChar(lIIIlIlIllllIl = IlIIlIlIllllIl.read()) ? 1 : 0));
            return (int)(var3_3 * var2_2);
        }

        /*
         * WARNING - void declaration
         */
        public long nextLong() {
            void var2_2;
            void var3_3;
            FastReader IlIlIIlIllllIl;
            int lIIlIIlIllllIl = IlIlIIlIllllIl.read();
            while (FastReader.IlIIlIIIlIl(IlIlIIlIllllIl.isSpaceChar(lIIlIIlIllllIl) ? 1 : 0)) {
                lIIlIIlIllllIl = IlIlIIlIllllIl.read();
                "".length();
                if (((0x3A ^ 0x3D) << "   ".length() & ~((0x5B ^ 0x5C) << "   ".length())) >= ((0xB9 ^ 0xB2) << "   ".length() & ~((0x21 ^ 0x2A) << "   ".length()))) continue;
                return 0L;
            }
            int IIIlIIlIllllIl = llIIlllIl[3];
            if (FastReader.llllIIIIlIl(lIIlIIlIllllIl, llIIlllIl[4])) {
                IIIlIIlIllllIl = llIIlllIl[1];
                lIIlIIlIllllIl = IlIlIIlIllllIl.read();
            }
            long lllIIIlIllllIl = 0L;
            do {
                if (!FastReader.IIIIlIIIlIl(lIIlIIlIllllIl, llIIlllIl[5]) || FastReader.llIIlIIIlIl(lIIlIIlIllllIl, llIIlllIl[6])) {
                    throw new InputMismatchException();
                }
                lllIIIlIllllIl *= 10L;
                lllIIIlIllllIl += (long)(lIIlIIlIllllIl - llIIlllIl[5]);
            } while (!FastReader.IlIIlIIIlIl(IlIlIIlIllllIl.isSpaceChar(lIIlIIlIllllIl = IlIlIIlIllllIl.read()) ? 1 : 0));
            return (long)(var3_3 * (long)var2_2);
        }

        /*
         * WARNING - void declaration
         */
        public double nextDouble() {
            void var2_2;
            void var3_3;
            FastReader lIIIIIlIllllIl;
            int IIIIIIlIllllIl = lIIIIIlIllllIl.read();
            while (FastReader.IlIIlIIIlIl(lIIIIIlIllllIl.isSpaceChar(IIIIIIlIllllIl) ? 1 : 0)) {
                IIIIIIlIllllIl = lIIIIIlIllllIl.read();
                "".length();
                if ((" ".length() << "   ".length() & (" ".length() << "   ".length() ^ -" ".length())) <= 0) continue;
                return 0.0;
            }
            int llllllIIllllIl = llIIlllIl[3];
            if (FastReader.llllIIIIlIl(IIIIIIlIllllIl, llIIlllIl[4])) {
                llllllIIllllIl = llIIlllIl[1];
                IIIIIIlIllllIl = lIIIIIlIllllIl.read();
            }
            double IlllllIIllllIl = 0.0;
            while (FastReader.IIlIlIIIlIl(lIIIIIlIllllIl.isSpaceChar(IIIIIIlIllllIl) ? 1 : 0) && FastReader.lIlIlIIIlIl(IIIIIIlIllllIl, llIIlllIl[8])) {
                if (!FastReader.lIlIlIIIlIl(IIIIIIlIllllIl, llIIlllIl[9]) || FastReader.llllIIIIlIl(IIIIIIlIllllIl, llIIlllIl[10])) {
                    return IlllllIIllllIl * Math.pow(10.0, lIIIIIlIllllIl.nextInt());
                }
                if (!FastReader.IIIIlIIIlIl(IIIIIIlIllllIl, llIIlllIl[5]) || FastReader.llIIlIIIlIl(IIIIIIlIllllIl, llIIlllIl[6])) {
                    throw new InputMismatchException();
                }
                IlllllIIllllIl *= 10.0;
                IlllllIIllllIl += (double)(IIIIIIlIllllIl - llIIlllIl[5]);
                IIIIIIlIllllIl = lIIIIIlIllllIl.read();
                "".length();
                if (-" ".length() == -" ".length()) continue;
                return 0.0;
            }
            if (FastReader.llllIIIIlIl(IIIIIIlIllllIl, llIIlllIl[8])) {
                IIIIIIlIllllIl = lIIIIIlIllllIl.read();
                double lIllllIIllllIl = 1.0;
                while (FastReader.IIlIlIIIlIl(lIIIIIlIllllIl.isSpaceChar(IIIIIIlIllllIl) ? 1 : 0)) {
                    if (!FastReader.lIlIlIIIlIl(IIIIIIlIllllIl, llIIlllIl[9]) || FastReader.llllIIIIlIl(IIIIIIlIllllIl, llIIlllIl[10])) {
                        return IlllllIIllllIl * Math.pow(10.0, lIIIIIlIllllIl.nextInt());
                    }
                    if (!FastReader.IIIIlIIIlIl(IIIIIIlIllllIl, llIIlllIl[5]) || FastReader.llIIlIIIlIl(IIIIIIlIllllIl, llIIlllIl[6])) {
                        throw new InputMismatchException();
                    }
                    IlllllIIllllIl += (double)(IIIIIIlIllllIl - llIIlllIl[5]) * (lIllllIIllllIl /= 10.0);
                    IIIIIIlIllllIl = lIIIIIlIllllIl.read();
                    "".length();
                    if (-"   ".length() < 0) continue;
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
            FastReader IlIlllIIllllIl;
            int lIIlllIIllllIl = IlIlllIIllllIl.read();
            while (FastReader.IlIIlIIIlIl(IlIlllIIllllIl.isSpaceChar(lIIlllIIllllIl) ? 1 : 0)) {
                lIIlllIIllllIl = IlIlllIIllllIl.read();
                "".length();
                if (" ".length() << (" ".length() << " ".length()) == " ".length() << (" ".length() << " ".length())) continue;
                return (char)((0x93 ^ 0xA4 ^ (0x85 ^ 0xB4) << " ".length()) & ((0x42 ^ 0x5F) << " ".length() ^ (0xF5 ^ 0x9A) ^ -" ".length()));
            }
            return (char)var1_1;
        }

        /*
         * WARNING - void declaration
         */
        public String next() {
            void var2_2;
            FastReader lIlIllIIllllIl;
            int IIlIllIIllllIl = lIlIllIIllllIl.read();
            while (FastReader.IlIIlIIIlIl(lIlIllIIllllIl.isSpaceChar(IIlIllIIllllIl) ? 1 : 0)) {
                IIlIllIIllllIl = lIlIllIIllllIl.read();
                "".length();
                if (" ".length() << " ".length() == " ".length() << " ".length()) continue;
                return null;
            }
            StringBuilder llIIllIIllllIl = new StringBuilder();
            do {
                llIIllIIllllIl.appendCodePoint(IIlIllIIllllIl);
                "".length();
            } while (!FastReader.IlIIlIIIlIl(lIlIllIIllllIl.isSpaceChar(IIlIllIIllllIl = lIlIllIIllllIl.read()) ? 1 : 0));
            return String.valueOf(var2_2);
        }

        public boolean isSpaceChar(int llllIlIIllllIl) {
            int n;
            FastReader IIIIllIIllllIl;
            if (FastReader.IllIlIIIlIl(IIIIllIIllllIl.filter)) {
                return IIIIllIIllllIl.filter.isSpaceChar(llllIlIIllllIl);
            }
            if (!(FastReader.lIlIlIIIlIl(llllIlIIllllIl, llIIlllIl[11]) && FastReader.lIlIlIIIlIl(llllIlIIllllIl, llIIlllIl[7]) && FastReader.lIlIlIIIlIl(llllIlIIllllIl, llIIlllIl[12]) && FastReader.lIlIlIIIlIl(llllIlIIllllIl, llIIlllIl[13]) && !FastReader.llllIIIIlIl(llllIlIIllllIl, llIIlllIl[1]))) {
                n = llIIlllIl[3];
                "".length();
                if ("   ".length() < 0) {
                    return (((0x51 ^ 0x4E) << (" ".length() << " ".length()) ^ (3 ^ 0x48)) & ((0x8D ^ 0x86) << " ".length() ^ (0x19 ^ 0x38) ^ -" ".length())) != 0;
                }
            } else {
                n = llIIlllIl[2];
            }
            return n != 0;
        }

        static {
            FastReader.IlllIIIIlIl();
            FastReader.IIllIIIIlIl();
        }

        private static void IIllIIIIlIl() {
            lIIIlllIl = new String[llIIlllIl[3]];
            FastReader.lIIIlllIl[FastReader.llIIlllIl[2]] = FastReader.IlIlIIIIlIl("", "kflRW");
        }

        /*
         * Unable to fully structure code
         */
        private static String IlIlIIIIlIl(String IllllIIIllllIl, String lIlllIIIllllIl) {
            IllllIIIllllIl = new String(Base64.getDecoder().decode(IllllIIIllllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            IIlllIIIllllIl = new StringBuilder();
            llIllIIIllllIl = lIlllIIIllllIl.toCharArray();
            IlIllIIIllllIl = FastReader.llIIlllIl[2];
            IIIIlIIIllllIl = IllllIIIllllIl.toCharArray();
            lIIIlIIIllllIl = IIIIlIIIllllIl.length;
            IlIIlIIIllllIl = FastReader.llIIlllIl[2];
            "".length();
            if (" ".length() << (" ".length() << " ".length()) <= " ".length() << (" ".length() << " ".length())) ** GOTO lbl19
            return null;
lbl-1000:
            // 1 sources

            {
                lIIllIIIllllIl = IIIIlIIIllllIl[IlIIlIIIllllIl];
                IIlllIIIllllIl.append((char)(lIIllIIIllllIl ^ llIllIIIllllIl[IlIllIIIllllIl % llIllIIIllllIl.length]));
                "".length();
                ++IlIllIIIllllIl;
                ++IlIIlIIIllllIl;
lbl19:
                // 2 sources

                ** while (!FastReader.IIIIlIIIlIl((int)IlIIlIIIllllIl, (int)lIIIlIIIllllIl))
            }
lbl20:
            // 1 sources

            return String.valueOf(IIlllIIIllllIl);
        }

        private static void IlllIIIIlIl() {
            llIIlllIl = new int[14];
            FastReader.llIIlllIl[0] = " ".length() << (((7 ^ 0xC) << (" ".length() << (" ".length() << " ".length())) ^ 51 + 21 - 52 + 161) << " ".length());
            FastReader.llIIlllIl[1] = -" ".length();
            FastReader.llIIlllIl[2] = ((0xB8 ^ 0xBD) << "   ".length() ^ (0xB9 ^ 0x8C)) << " ".length() & (("   ".length() << (" ".length() << " ".length()) ^ (0x94 ^ 0x85)) << " ".length() ^ -" ".length());
            FastReader.llIIlllIl[3] = " ".length();
            FastReader.llIIlllIl[4] = 0x13 ^ 0x3E;
            FastReader.llIIlllIl[5] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
            FastReader.llIIlllIl[6] = 0x63 ^ 0x5A;
            FastReader.llIIlllIl[7] = (0xD0 ^ 0x97 ^ (0x58 ^ 0x79) << " ".length()) << " ".length();
            FastReader.llIIlllIl[8] = (179 + 70 - 189 + 155 ^ "   ".length() << ("   ".length() << " ".length())) << " ".length();
            FastReader.llIIlllIl[9] = 0x45 ^ 0x20;
            FastReader.llIIlllIl[10] = 0xF7 ^ 0xB2;
            FastReader.llIIlllIl[11] = " ".length() << (0x1B ^ 0x1E);
            FastReader.llIIlllIl[12] = 0xEE ^ 0x9D ^ (0x70 ^ 0x4F) << " ".length();
            FastReader.llIIlllIl[13] = 0x9E ^ 0x97;
        }

        private static boolean llllIIIIlIl(int n, int n2) {
            return n == n2;
        }

        private static boolean IIIIlIIIlIl(int n, int n2) {
            return n >= n2;
        }

        private static boolean llIIlIIIlIl(int n, int n2) {
            return n > n2;
        }

        private static boolean IllIlIIIlIl(Object object) {
            return object != null;
        }

        private static boolean IlIIlIIIlIl(int n) {
            return n != 0;
        }

        private static boolean IIlIlIIIlIl(int n) {
            return n == 0;
        }

        private static boolean lIIIlIIIlIl(int n) {
            return n <= 0;
        }

        private static boolean lIlIlIIIlIl(int n, int n2) {
            return n != n2;
        }

        public static interface SpaceCharFilter {
            public boolean isSpaceChar(int var1);
        }
    }
}

