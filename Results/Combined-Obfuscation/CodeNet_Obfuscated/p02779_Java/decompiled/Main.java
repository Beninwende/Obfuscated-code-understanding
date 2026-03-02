/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashSet;
import java.util.NoSuchElementException;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

class Main {
    private static String[] IllIlIlIl;
    private static int[] IIlllIlIl;

    Main() {
        Main IIllIlIlIlIIll;
    }

    public static void main(String[] stringArray) {
        FastScanner IllIIlIlIlIIll = new FastScanner();
        PrintWriter lIlIIlIlIlIIll = new PrintWriter(System.out);
        try {
            new Solver(IllIIlIlIlIIll, lIlIIlIlIlIIll).run();
            lIlIIlIlIlIIll.flush();
            lIlIIlIlIlIIll.close();
            IllIlIlIl[IIlllIlIl[0]].length();
            "".length();
        }
        catch (Throwable IIlIIlIlIlIIll) {
            try {
                lIlIIlIlIlIIll.close();
                IllIlIlIl[IIlllIlIl[2]].length();
                "".length();
            }
            catch (Throwable llIIIlIlIlIIll) {
                IIlIIlIlIlIIll.addSuppressed(llIIIlIlIlIIll);
            }
            if (Main.lllIIlIlIIl(IllIlIlIl[IIlllIlIl[3]].length() << (IllIlIlIl[IIlllIlIl[4]].length() << IllIlIlIl[IIlllIlIl[5]].length()), IllIlIlIl[IIlllIlIl[6]].length())) {
                return;
            }
            throw IIlIIlIlIlIIll;
        }
        if (Main.IllIIlIlIIl(IllIlIlIl[IIlllIlIl[1]].length())) {
            return;
        }
    }

    static {
        Main.lIlIIlIlIIl();
        Main.llIllIIlIIl();
    }

    private static void llIllIIlIIl() {
        IllIlIlIl = new String[IIlllIlIl[7]];
        Main.IllIlIlIl[Main.IIlllIlIl[0]] = Main.IllIlIIlIIl("", "GlecU");
        Main.IllIlIlIl[Main.IIlllIlIl[1]] = Main.IllIlIIlIIl("WHBk", "xPDWk");
        Main.IllIlIlIl[Main.IIlllIlIl[2]] = Main.lllIlIIlIIl("sVJy6HNOKyE=", "fljSj");
        Main.IllIlIlIl[Main.IIlllIlIl[3]] = Main.IllIlIIlIIl("RQ==", "eCsxa");
        Main.IllIlIlIl[Main.IIlllIlIl[4]] = Main.lllIlIIlIIl("14SV4ymU1qQ=", "foXHI");
        Main.IllIlIlIl[Main.IIlllIlIl[5]] = Main.IlIllIIlIIl("SEhO/9DEoL4=", "jgjTa");
        Main.IllIlIlIl[Main.IIlllIlIl[6]] = Main.IlIllIIlIIl("oZVDJxIitr8=", "FlbNV");
    }

    private static String IlIllIIlIIl(String IlIllIIlIlIIll, String lIIllIIlIlIIll) {
        try {
            SecretKeySpec IIIllIIlIlIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIllIIlIlIIll.getBytes(StandardCharsets.UTF_8)), IIlllIlIl[8]), "DES");
            Cipher lllIlIIlIlIIll = Cipher.getInstance("DES");
            lllIlIIlIlIIll.init(IIlllIlIl[2], IIIllIIlIlIIll);
            return new String(lllIlIIlIlIIll.doFinal(Base64.getDecoder().decode(IlIllIIlIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IllIlIIlIlIIll) {
            IllIlIIlIlIIll.printStackTrace();
            return null;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static String IllIlIIlIIl(String IIIlIIIlIlIIll, String lllIIIIlIlIIll) {
        IIIlIIIlIlIIll = new String(Base64.getDecoder().decode(IIIlIIIlIlIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        IllIIIIlIlIIll = new StringBuilder();
        lIlIIIIlIlIIll = lllIIIIlIlIIll.toCharArray();
        IIlIIIIlIlIIll = Main.IIlllIlIl[0];
        IlIllllIIlIIll = IIIlIIIlIlIIll.toCharArray();
        llIllllIIlIIll = IlIllllIIlIIll.length;
        IIlllllIIlIIll = Main.IIlllIlIl[0];
        "".length();
        if (("   ".length() << " ".length() & ~("   ".length() << " ".length())) == 0) ** GOTO lbl19
        return null;
lbl-1000:
        // 1 sources

        {
            llIIIIIlIlIIll = IlIllllIIlIIll[IIlllllIIlIIll];
            IllIIIIlIlIIll.append((char)(llIIIIIlIlIIll ^ lIlIIIIlIlIIll[IIlIIIIlIlIIll % lIlIIIIlIlIIll.length]));
            "".length();
            ++IIlIIIIlIlIIll;
            ++IIlllllIIlIIll;
lbl19:
            // 2 sources

            ** while (!Main.IIIlIlIlIIl((int)IIlllllIIlIIll, (int)llIllllIIlIIll))
        }
lbl20:
        // 1 sources

        return String.valueOf(IllIIIIlIlIIll);
    }

    private static String lllIlIIlIIl(String lIlIlllIIlIIll, String IIlIlllIIlIIll) {
        try {
            SecretKeySpec llIIlllIIlIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IIlIlllIIlIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher IlIIlllIIlIIll = Cipher.getInstance("Blowfish");
            IlIIlllIIlIIll.init(IIlllIlIl[2], llIIlllIIlIIll);
            return new String(IlIIlllIIlIIll.doFinal(Base64.getDecoder().decode(lIlIlllIIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIIlllIIlIIll) {
            lIIIlllIIlIIll.printStackTrace();
            return null;
        }
    }

    private static void lIlIIlIlIIl() {
        IIlllIlIl = new int[9];
        Main.IIlllIlIl[0] = (0xE3 ^ 0x88 ^ (0x29 ^ 0x22) << (" ".length() << " ".length())) & (0x94 ^ 0x83 ^ (0xA1 ^ 0xA4) << (" ".length() << (" ".length() << " ".length())) ^ -" ".length());
        Main.IIlllIlIl[1] = " ".length();
        Main.IIlllIlIl[2] = " ".length() << " ".length();
        Main.IIlllIlIl[3] = "   ".length();
        Main.IIlllIlIl[4] = " ".length() << (" ".length() << " ".length());
        Main.IIlllIlIl[5] = 100 + 56 - 5 + 34 ^ (0xE ^ 0x21) << (" ".length() << " ".length());
        Main.IIlllIlIl[6] = "   ".length() << " ".length();
        Main.IIlllIlIl[7] = 0x86 ^ 0x81;
        Main.IIlllIlIl[8] = " ".length() << "   ".length();
    }

    private static boolean IIIlIlIlIIl(int n, int n2) {
        return n >= n2;
    }

    private static boolean lllIIlIlIIl(int n, int n2) {
        return n < n2;
    }

    private static boolean IllIIlIlIIl(int n) {
        return n < 0;
    }

    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[lIlIlIlIl[lIlllIlIl[0]]];
        private int ptr = lIlIlIlIl[lIlllIlIl[1]];
        private int buflen = lIlIlIlIl[lIlllIlIl[1]];
        private static int[] lIlIlIlIl;
        private static String[] IlIllIlIl;
        private static int[] lIlllIlIl;

        public FastScanner() {
            FastScanner lIIIIllIIlIIll;
        }

        private boolean hasNextByte() {
            FastScanner lIlllIlIIlIIll;
            if (FastScanner.llIlIlIlIIl(FastScanner.llIlIIIlIIl(lIlllIlIIlIIll.ptr, lIlllIlIIlIIll.buflen) ? 1 : 0)) {
                return lIlIlIlIl[lIlllIlIl[2]];
            }
            lIlllIlIIlIIll.ptr = lIlIlIlIl[lIlllIlIl[1]];
            try {
                lIlllIlIIlIIll.buflen = lIlllIlIIlIIll.in.read(lIlllIlIIlIIll.buffer);
                IlIllIlIl[lIlllIlIl[0]].length();
                "".length();
            }
            catch (IOException IIlllIlIIlIIll) {
                IIlllIlIIlIIll.printStackTrace();
            }
            if (FastScanner.IIllIlIlIIl(-IlIllIlIl[lIlllIlIl[1]].length(), IlIllIlIl[lIlllIlIl[2]].length())) {
                return ((lIlllIlIl[3] ^ lIlllIlIl[4]) & (lIlllIlIl[5] ^ lIlllIlIl[6] ^ lIlllIlIl[7])) != 0;
            }
            if (FastScanner.llIlIlIlIIl(FastScanner.IIllIIIlIIl(lIlllIlIIlIIll.buflen) ? 1 : 0)) {
                return lIlIlIlIl[lIlllIlIl[1]];
            }
            return lIlIlIlIl[lIlllIlIl[2]];
        }

        private int readByte() {
            FastScanner IIIllIlIIlIIll;
            if (FastScanner.llIlIlIlIIl(FastScanner.lIllIIIlIIl(IIIllIlIIlIIll.hasNextByte() ? 1 : 0) ? 1 : 0)) {
                int n = IIIllIlIIlIIll.ptr;
                IIIllIlIIlIIll.ptr = n + lIlIlIlIl[lIlllIlIl[2]];
                return IIIllIlIIlIIll.buffer[n];
            }
            return lIlIlIlIl[lIlllIlIl[8]];
        }

        private boolean isPrintableChar(int lIlIlIlIIlIIll) {
            int n;
            if (FastScanner.llIlIlIlIIl(FastScanner.IlllIIIlIIl(lIlIlIlIl[lIlllIlIl[9]], lIlIlIlIIlIIll) ? 1 : 0) && FastScanner.llIlIlIlIIl(FastScanner.IlllIIIlIIl(lIlIlIlIIlIIll, lIlIlIlIl[lIlllIlIl[10]]) ? 1 : 0)) {
                n = lIlIlIlIl[lIlllIlIl[2]];
                IlIllIlIl[lIlllIlIl[8]].length();
                "".length();
                if (FastScanner.lIllIlIlIIl(IlIllIlIl[lIlllIlIl[9]].length() << (IlIllIlIl[lIlllIlIl[10]].length() << IlIllIlIl[lIlllIlIl[11]].length()))) {
                    return ((lIlllIlIl[12] ^ lIlllIlIl[13]) << IlIllIlIl[lIlllIlIl[14]].length() & ((lIlllIlIl[15] ^ lIlllIlIl[16]) << IlIllIlIl[lIlllIlIl[17]].length() ^ lIlllIlIl[7])) != 0;
                }
            } else {
                n = lIlIlIlIl[lIlllIlIl[1]];
            }
            return n != 0;
        }

        public boolean hasNext() {
            FastScanner IlIIlIlIIlIIll;
            while (FastScanner.llIlIlIlIIl(FastScanner.lIllIIIlIIl(IlIIlIlIIlIIll.hasNextByte() ? 1 : 0) ? 1 : 0) && FastScanner.llIlIlIlIIl(FastScanner.llllIIIlIIl(IlIIlIlIIlIIll.isPrintableChar(IlIIlIlIIlIIll.buffer[IlIIlIlIIlIIll.ptr]) ? 1 : 0) ? 1 : 0)) {
                IlIIlIlIIlIIll.ptr += lIlIlIlIl[lIlllIlIl[2]];
                IlIllIlIl[lIlllIlIl[18]].length();
                "".length();
                if (!FastScanner.IIllIlIlIIl(IlIllIlIl[lIlllIlIl[19]].length(), IlIllIlIl[lIlllIlIl[20]].length() << (IlIllIlIl[lIlllIlIl[21]].length() << IlIllIlIl[lIlllIlIl[22]].length()))) continue;
                return ((lIlllIlIl[23] + lIlllIlIl[1] - lIlllIlIl[24] + lIlllIlIl[25] ^ (lIlllIlIl[26] ^ lIlllIlIl[27]) << (IlIllIlIl[lIlllIlIl[28]].length() << IlIllIlIl[lIlllIlIl[29]].length())) << (IlIllIlIl[lIlllIlIl[30]].length() << (IlIllIlIl[lIlllIlIl[31]].length() << IlIllIlIl[lIlllIlIl[32]].length())) & (((lIlllIlIl[33] ^ lIlllIlIl[34]) << IlIllIlIl[lIlllIlIl[27]].length() ^ (lIlllIlIl[35] ^ lIlllIlIl[36])) << (IlIllIlIl[lIlllIlIl[37]].length() << (IlIllIlIl[lIlllIlIl[38]].length() << IlIllIlIl[lIlllIlIl[39]].length())) ^ -IlIllIlIl[lIlllIlIl[40]].length())) != 0;
            }
            return this.hasNextByte();
        }

        /*
         * WARNING - void declaration
         */
        public String next() {
            void var1_1;
            FastScanner lIllIIlIIlIIll;
            if (FastScanner.llIlIlIlIIl(FastScanner.llllIIIlIIl(lIllIIlIIlIIll.hasNext() ? 1 : 0) ? 1 : 0)) {
                throw new NoSuchElementException();
            }
            StringBuilder IIllIIlIIlIIll = new StringBuilder();
            int llIlIIlIIlIIll = lIllIIlIIlIIll.readByte();
            while (FastScanner.llIlIlIlIIl(FastScanner.lIllIIIlIIl(lIllIIlIIlIIll.isPrintableChar(llIlIIlIIlIIll) ? 1 : 0) ? 1 : 0)) {
                IIllIIlIIlIIll.appendCodePoint(llIlIIlIIlIIll);
                IlIllIlIl[lIlllIlIl[41]].length();
                llIlIIlIIlIIll = lIllIIlIIlIIll.readByte();
                IlIllIlIl[lIlllIlIl[42]].length();
                "".length();
                if (!FastScanner.IlllIlIlIIl(IlIllIlIl[lIlllIlIl[3]].length() << IlIllIlIl[lIlllIlIl[43]].length(), IlIllIlIl[lIlllIlIl[44]].length() << IlIllIlIl[lIlllIlIl[45]].length())) continue;
                return null;
            }
            return String.valueOf(var1_1);
        }

        public long nextLong() {
            FastScanner llIIIIlIIlIIll;
            if (FastScanner.llIlIlIlIIl(FastScanner.llllIIIlIIl(llIIIIlIIlIIll.hasNext() ? 1 : 0) ? 1 : 0)) {
                throw new NoSuchElementException();
            }
            long IlIIIIlIIlIIll = 0L;
            int lIIIIIlIIlIIll = lIlIlIlIl[lIlllIlIl[1]];
            int IIIIIIlIIlIIll = llIIIIlIIlIIll.readByte();
            if (FastScanner.llIlIlIlIIl(FastScanner.IIIIlIIlIIl(IIIIIIlIIlIIll, lIlIlIlIl[lIlllIlIl[11]]) ? 1 : 0)) {
                lIIIIIlIIlIIll = lIlIlIlIl[lIlllIlIl[2]];
                IIIIIIlIIlIIll = llIIIIlIIlIIll.readByte();
            }
            if (!FastScanner.llIlIlIlIIl(FastScanner.lIIIlIIlIIl(IIIIIIlIIlIIll, lIlIlIlIl[lIlllIlIl[14]]) ? 1 : 0) || FastScanner.llIlIlIlIIl(FastScanner.llIlIIIlIIl(lIlIlIlIl[lIlllIlIl[17]], IIIIIIlIIlIIll) ? 1 : 0)) {
                throw new NumberFormatException();
            }
            do {
                if (FastScanner.llIlIlIlIIl(FastScanner.IlllIIIlIIl(lIlIlIlIl[lIlllIlIl[14]], IIIIIIlIIlIIll) ? 1 : 0) && FastScanner.llIlIlIlIIl(FastScanner.IlllIIIlIIl(IIIIIIlIIlIIll, lIlIlIlIl[lIlllIlIl[17]]) ? 1 : 0)) {
                    IlIIIIlIIlIIll *= 10L;
                    IlIIIIlIIlIIll += (long)(IIIIIIlIIlIIll - lIlIlIlIl[lIlllIlIl[14]]);
                    IlIllIlIl[lIlllIlIl[46]].length();
                    "".length();
                    if (FastScanner.llllIlIlIIl(null)) {
                        return 0L;
                    }
                } else {
                    if (!FastScanner.llIlIlIlIIl(FastScanner.IlIIlIIlIIl(IIIIIIlIIlIIll, lIlIlIlIl[lIlllIlIl[8]]) ? 1 : 0) || FastScanner.llIlIlIlIIl(FastScanner.llllIIIlIIl(llIIIIlIIlIIll.isPrintableChar(IIIIIIlIIlIIll) ? 1 : 0) ? 1 : 0)) {
                        long l;
                        if (FastScanner.llIlIlIlIIl(FastScanner.lIllIIIlIIl(lIIIIIlIIlIIll) ? 1 : 0)) {
                            l = -IlIIIIlIIlIIll;
                            IlIllIlIl[lIlllIlIl[47]].length();
                            "".length();
                            if (FastScanner.IIllIlIlIIl(IlIllIlIl[lIlllIlIl[48]].length() << (IlIllIlIl[lIlllIlIl[49]].length() << IlIllIlIl[lIlllIlIl[50]].length()), (lIlllIlIl[26] ^ lIlllIlIl[51]) << (IlIllIlIl[lIlllIlIl[52]].length() << IlIllIlIl[lIlllIlIl[53]].length()) & ((lIlllIlIl[54] ^ lIlllIlIl[55]) << (IlIllIlIl[lIlllIlIl[56]].length() << IlIllIlIl[lIlllIlIl[57]].length()) ^ lIlllIlIl[7]))) {
                                return 0L;
                            }
                        } else {
                            l = IlIIIIlIIlIIll;
                        }
                        return l;
                    }
                    throw new NumberFormatException();
                }
                int n = this.readByte();
                IlIllIlIl[lIlllIlIl[58]].length();
                "".length();
            } while (!FastScanner.llIlIlIlIIl((lIlllIlIl[59] + lIlllIlIl[42] - lIlllIlIl[60] + lIlllIlIl[14] ^ (lIlllIlIl[61] ^ lIlllIlIl[62]) << IlIllIlIl[lIlllIlIl[63]].length()) << (IlIllIlIl[lIlllIlIl[64]].length() << IlIllIlIl[lIlllIlIl[65]].length()) & ((lIlllIlIl[62] + lIlllIlIl[40] - lIlllIlIl[34] + lIlllIlIl[66] ^ (lIlllIlIl[9] ^ lIlllIlIl[67]) << IlIllIlIl[lIlllIlIl[68]].length()) << (IlIllIlIl[lIlllIlIl[69]].length() << IlIllIlIl[lIlllIlIl[23]].length()) ^ -IlIllIlIl[lIlllIlIl[70]].length())));
            return 0L;
        }

        /*
         * WARNING - void declaration
         */
        public int nextInt() {
            void var1_1;
            FastScanner lIIlllIIIlIIll;
            long IIIlllIIIlIIll = lIIlllIIIlIIll.nextLong();
            if (!FastScanner.llIlIlIlIIl(FastScanner.IIlIlIIlIIl(FastScanner.llIIlIIlIIl(IIIlllIIIlIIll, Integer.MIN_VALUE)) ? 1 : 0) || FastScanner.llIlIlIlIIl(FastScanner.lIlIlIIlIIl(FastScanner.llIIlIIlIIl(IIIlllIIIlIIll, Integer.MAX_VALUE)) ? 1 : 0)) {
                throw new NumberFormatException();
            }
            return (int)var1_1;
        }

        public double nextDouble() {
            FastScanner IIlIllIIIlIIll;
            return Double.parseDouble(IIlIllIIIlIIll.next());
        }

        /*
         * WARNING - void declaration
         */
        public int[] nextIntArray(int lIllIlIIIlIIll) {
            void var2_2;
            int[] IIllIlIIIlIIll = new int[lIllIlIIIlIIll];
            int llIlIlIIIlIIll = lIlIlIlIl[lIlllIlIl[1]];
            while (FastScanner.llIlIlIlIIl(FastScanner.llIlIIIlIIl(llIlIlIIIlIIll, lIllIlIIIlIIll) ? 1 : 0)) {
                FastScanner IlllIlIIIlIIll;
                IIllIlIIIlIIll[llIlIlIIIlIIll] = IlllIlIIIlIIll.nextInt();
                ++llIlIlIIIlIIll;
                IlIllIlIl[lIlllIlIl[71]].length();
                "".length();
                if (!FastScanner.IIIIllIlIIl(-(lIlllIlIl[1] ^ lIlllIlIl[10]))) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        public long[] nextLongArray(int lIIIIlIIIlIIll) {
            void var2_2;
            long[] IIIIIlIIIlIIll = new long[lIIIIlIIIlIIll];
            int lllllIIIIlIIll = lIlIlIlIl[lIlllIlIl[1]];
            while (FastScanner.llIlIlIlIIl(FastScanner.llIlIIIlIIl(lllllIIIIlIIll, lIIIIlIIIlIIll) ? 1 : 0)) {
                FastScanner IlIIIlIIIlIIll;
                IIIIIlIIIlIIll[lllllIIIIlIIll] = IlIIIlIIIlIIll.nextLong();
                ++lllllIIIIlIIll;
                IlIllIlIl[lIlllIlIl[72]].length();
                "".length();
                if (!FastScanner.llllIlIlIIl(null)) continue;
                return null;
            }
            return var2_2;
        }

        static {
            FastScanner.IlIlIlIlIIl();
            FastScanner.lIIlIlIlIIl();
            FastScanner.IlIlIIIlIIl();
        }

        private static void IlIlIIIlIIl() {
            lIlIlIlIl = new int[lIlllIlIl[18]];
            FastScanner.lIlIlIlIl[FastScanner.lIlllIlIl[0]] = IlIllIlIl[lIlllIlIl[4]].length() << ((lIlllIlIl[51] ^ lIlllIlIl[72]) << IlIllIlIl[lIlllIlIl[26]].length());
            FastScanner.lIlIlIlIl[FastScanner.lIlllIlIl[1]] = (lIlllIlIl[73] ^ lIlllIlIl[13]) & (lIlllIlIl[74] ^ lIlllIlIl[75] ^ lIlllIlIl[7]);
            FastScanner.lIlIlIlIl[FastScanner.lIlllIlIl[2]] = IlIllIlIl[lIlllIlIl[76]].length();
            FastScanner.lIlIlIlIl[FastScanner.lIlllIlIl[8]] = -IlIllIlIl[lIlllIlIl[77]].length();
            FastScanner.lIlIlIlIl[FastScanner.lIlllIlIl[9]] = lIlllIlIl[78] ^ lIlllIlIl[79];
            FastScanner.lIlIlIlIl[FastScanner.lIlllIlIl[10]] = (lIlllIlIl[57] ^ lIlllIlIl[42]) << IlIllIlIl[lIlllIlIl[51]].length();
            FastScanner.lIlIlIlIl[FastScanner.lIlllIlIl[11]] = lIlllIlIl[80] ^ lIlllIlIl[81];
            FastScanner.lIlIlIlIl[FastScanner.lIlllIlIl[14]] = IlIllIlIl[lIlllIlIl[82]].length() << (IlIllIlIl[lIlllIlIl[83]].length() << (IlIllIlIl[lIlllIlIl[34]].length() << IlIllIlIl[lIlllIlIl[61]].length()));
            FastScanner.lIlIlIlIl[FastScanner.lIlllIlIl[17]] = lIlllIlIl[84] + lIlllIlIl[44] - lIlllIlIl[44] + lIlllIlIl[28] ^ (lIlllIlIl[85] ^ lIlllIlIl[86]) << IlIllIlIl[lIlllIlIl[87]].length();
        }

        private static boolean IIIIlIIlIIl(int n, int n2) {
            boolean bl;
            if (FastScanner.IIllIlIlIIl(n, n2)) {
                bl = lIlllIlIl[1];
                "".length();
                if (" ".length() << " ".length() < " ".length() << " ".length()) {
                    return (((0xB9 ^ 0xAE) << " ".length() ^ (0xF2 ^ 0x81)) & ((0x7A ^ 0x4D) << (" ".length() << " ".length()) ^ 53 + 9 - -32 + 35 ^ -" ".length())) != 0;
                }
            } else {
                bl = lIlllIlIl[0];
            }
            return bl;
        }

        private static boolean lIIIlIIlIIl(int n, int n2) {
            boolean bl;
            if (FastScanner.lIIIllIlIIl(n, n2)) {
                bl = lIlllIlIl[1];
                "".length();
                if (" ".length() << " ".length() > " ".length() << " ".length()) {
                    return (((0x6B ^ 0x76) << " ".length() ^ "   ".length()) & ((0x6E ^ 0x3B) << " ".length() ^ 119 + 32 - 120 + 116 ^ -" ".length())) != 0;
                }
            } else {
                bl = lIlllIlIl[0];
            }
            return bl;
        }

        private static boolean llIlIIIlIIl(int n, int n2) {
            boolean bl;
            if (FastScanner.IlIIllIlIIl(n, n2)) {
                bl = lIlllIlIl[1];
                "".length();
                if ("   ".length() < -" ".length()) {
                    return ((0x2C ^ 0x79 ^ (0xA6 ^ 0x95) << " ".length()) & ((0x1F ^ 0x42) << " ".length() ^ 3 + 90 - 12 + 56 ^ -" ".length())) != 0;
                }
            } else {
                bl = lIlllIlIl[0];
            }
            return bl;
        }

        private static boolean IlllIIIlIIl(int n, int n2) {
            boolean bl;
            if (FastScanner.llIIllIlIIl(n, n2)) {
                bl = lIlllIlIl[1];
                "".length();
                if (null != null) {
                    return ((103 + 74 - 162 + 168 ^ (0x42 ^ 0x51) << "   ".length()) << " ".length() & ((101 + 2 - 26 + 94 ^ (0xE6 ^ 0xC7) << (" ".length() << " ".length())) << " ".length() ^ -" ".length())) != 0;
                }
            } else {
                bl = lIlllIlIl[0];
            }
            return bl;
        }

        private static boolean lIllIIIlIIl(int n) {
            boolean bl;
            if (FastScanner.llIlIlIlIIl(n)) {
                bl = lIlllIlIl[1];
                "".length();
                if (-(0x8E ^ 0x8A) >= 0) {
                    return ((0xE8 ^ 0xC5) & ~(0x13 ^ 0x3E)) != 0;
                }
            } else {
                bl = lIlllIlIl[0];
            }
            return bl;
        }

        private static boolean llllIIIlIIl(int n) {
            boolean bl;
            if (FastScanner.lIllIlIlIIl(n)) {
                bl = lIlllIlIl[1];
                "".length();
                if (-"  ".length() > 0) {
                    return ((0xB6 ^ 0x91 ^ "   ".length() << " ".length()) & (0x53 ^ 0x20 ^ (0x98 ^ 0xB1) << " ".length() ^ -" ".length())) != 0;
                }
            } else {
                bl = lIlllIlIl[0];
            }
            return bl;
        }

        private static boolean IIlIlIIlIIl(int n) {
            boolean bl;
            if (FastScanner.IIIIllIlIIl(n)) {
                bl = lIlllIlIl[1];
                "".length();
                if (" ".length() << " ".length() == " ".length() << (" ".length() << " ".length())) {
                    return ((0x97 ^ 0xA6) << " ".length() & ~((0x59 ^ 0x68) << " ".length())) != 0;
                }
            } else {
                bl = lIlllIlIl[0];
            }
            return bl;
        }

        private static boolean IIllIIIlIIl(int n) {
            boolean bl;
            if (FastScanner.IIlIllIlIIl(n)) {
                bl = lIlllIlIl[1];
                "".length();
                if (-" ".length() > "   ".length()) {
                    return ((0x5B ^ 0x56) << (" ".length() << " ".length()) & ~((0x63 ^ 0x6E) << (" ".length() << " ".length()))) != 0;
                }
            } else {
                bl = lIlllIlIl[0];
            }
            return bl;
        }

        private static boolean lIlIlIIlIIl(int n) {
            boolean bl;
            if (FastScanner.lIlIllIlIIl(n)) {
                bl = lIlllIlIl[1];
                "".length();
                if ((((0x48 ^ 0x55) << " ".length() ^ (0xBC ^ 0x8F)) << (" ".length() << " ".length()) & ((1 + 114 - 86 + 154 ^ (0x67 ^ 0x38) << " ".length()) << (" ".length() << " ".length()) ^ -" ".length())) != 0) {
                    return ((168 + 161 - 262 + 110 ^ (0x77 ^ 0x50) << (" ".length() << " ".length())) << " ".length() & (((0xB2 ^ 0x8D) << " ".length() ^ (0x75 ^ 0x26)) << " ".length() ^ -" ".length())) != 0;
                }
            } else {
                bl = lIlllIlIl[0];
            }
            return bl;
        }

        private static boolean IlIIlIIlIIl(int n, int n2) {
            boolean bl;
            if (FastScanner.IlllIlIlIIl(n, n2)) {
                bl = lIlllIlIl[1];
                "".length();
                if (" ".length() < " ".length()) {
                    return (" ".length() << (0x3C ^ 0x19 ^ " ".length() << (0x63 ^ 0x66)) & (" ".length() << (0xDE ^ 0x9B ^ " ".length() << ("   ".length() << " ".length())) ^ -" ".length())) != 0;
                }
            } else {
                bl = lIlllIlIl[0];
            }
            return bl;
        }

        private static int llIIlIIlIIl(long l, long l2) {
            return FastScanner.IllIllIlIIl(l, l2);
        }

        private static void lIIlIlIlIIl() {
            IlIllIlIl = new String[lIlllIlIl[88]];
            FastScanner.IlIllIlIl[FastScanner.lIlllIlIl[0]] = FastScanner.lllllIIlIIl("ylgGGDhDCww=", "rlfrd");
            FastScanner.IlIllIlIl[FastScanner.lIlllIlIl[1]] = FastScanner.IIIIIlIlIIl("iPAOi7VSlJU=", "APLPX");
            FastScanner.IlIllIlIl[FastScanner.lIlllIlIl[2]] = FastScanner.IIIIIlIlIIl("6VdC5+I8Kn8=", "UStcR");
            FastScanner.IlIllIlIl[FastScanner.lIlllIlIl[8]] = FastScanner.lIIIIlIlIIl("", "SKzPu");
            FastScanner.IlIllIlIl[FastScanner.lIlllIlIl[9]] = FastScanner.IIIIIlIlIIl("wmL62xNcPnw=", "HXokM");
            FastScanner.IlIllIlIl[FastScanner.lIlllIlIl[10]] = FastScanner.lIIIIlIlIIl("VQ==", "udPWx");
            FastScanner.IlIllIlIl[FastScanner.lIlllIlIl[11]] = FastScanner.IIIIIlIlIIl("pqbYr49GCcY=", "pjYml");
            FastScanner.IlIllIlIl[FastScanner.lIlllIlIl[14]] = FastScanner.lIIIIlIlIIl("cA==", "PMhlO");
            FastScanner.IlIllIlIl[FastScanner.lIlllIlIl[17]] = FastScanner.lIIIIlIlIIl("Sw==", "kKdLr");
            FastScanner.IlIllIlIl[FastScanner.lIlllIlIl[18]] = FastScanner.lIIIIlIlIIl("", "tIYiu");
            FastScanner.IlIllIlIl[FastScanner.lIlllIlIl[19]] = FastScanner.lIIIIlIlIIl("aw==", "KrRzT");
            FastScanner.IlIllIlIl[FastScanner.lIlllIlIl[20]] = FastScanner.lIIIIlIlIIl("bw==", "OfoeM");
            FastScanner.IlIllIlIl[FastScanner.lIlllIlIl[21]] = FastScanner.lllllIIlIIl("zum/JfrQjXM=", "hhsdw");
            FastScanner.IlIllIlIl[FastScanner.lIlllIlIl[22]] = FastScanner.lllllIIlIIl("37g2mPdr54c=", "KCswe");
            FastScanner.IlIllIlIl[FastScanner.lIlllIlIl[28]] = FastScanner.lIIIIlIlIIl("SQ==", "idmit");
            FastScanner.IlIllIlIl[FastScanner.lIlllIlIl[29]] = FastScanner.lIIIIlIlIIl("TQ==", "mbLgb");
            FastScanner.IlIllIlIl[FastScanner.lIlllIlIl[30]] = FastScanner.lllllIIlIIl("9EuAbv9HF6g=", "XpkFG");
            FastScanner.IlIllIlIl[FastScanner.lIlllIlIl[31]] = FastScanner.IIIIIlIlIIl("by4IAOkg2/U=", "eZkhf");
            FastScanner.IlIllIlIl[FastScanner.lIlllIlIl[32]] = FastScanner.lllllIIlIIl("LPXLuWJiSSU=", "mJslO");
            FastScanner.IlIllIlIl[FastScanner.lIlllIlIl[27]] = FastScanner.lllllIIlIIl("/sd/daWv8iw=", "nTewe");
            FastScanner.IlIllIlIl[FastScanner.lIlllIlIl[37]] = FastScanner.lIIIIlIlIIl("Vg==", "vfYCI");
            FastScanner.IlIllIlIl[FastScanner.lIlllIlIl[38]] = FastScanner.IIIIIlIlIIl("KmZicHWzEI4=", "igyeR");
            FastScanner.IlIllIlIl[FastScanner.lIlllIlIl[39]] = FastScanner.lllllIIlIIl("o/AG+Od1c/Y=", "NQmGr");
            FastScanner.IlIllIlIl[FastScanner.lIlllIlIl[40]] = FastScanner.lIIIIlIlIIl("Ug==", "rbKws");
            FastScanner.IlIllIlIl[FastScanner.lIlllIlIl[41]] = FastScanner.IIIIIlIlIIl("DmfjAl+umBE=", "MZQyw");
            FastScanner.IlIllIlIl[FastScanner.lIlllIlIl[42]] = FastScanner.lIIIIlIlIIl("", "HHVGV");
            FastScanner.IlIllIlIl[FastScanner.lIlllIlIl[3]] = FastScanner.lIIIIlIlIIl("YQ==", "AMPMG");
            FastScanner.IlIllIlIl[FastScanner.lIlllIlIl[43]] = FastScanner.lllllIIlIIl("4v3jYAIfUXA=", "bTfJQ");
            FastScanner.IlIllIlIl[FastScanner.lIlllIlIl[44]] = FastScanner.lllllIIlIIl("3m2wzTIFasM=", "UYPIp");
            FastScanner.IlIllIlIl[FastScanner.lIlllIlIl[45]] = FastScanner.lIIIIlIlIIl("Rw==", "gNOwQ");
            FastScanner.IlIllIlIl[FastScanner.lIlllIlIl[46]] = FastScanner.lllllIIlIIl("G2dwlL8W4c4=", "GcXxa");
            FastScanner.IlIllIlIl[FastScanner.lIlllIlIl[47]] = FastScanner.lIIIIlIlIIl("", "aRAHL");
            FastScanner.IlIllIlIl[FastScanner.lIlllIlIl[48]] = FastScanner.lllllIIlIIl("Gr7nyrmKccE=", "QnleO");
            FastScanner.IlIllIlIl[FastScanner.lIlllIlIl[49]] = FastScanner.lllllIIlIIl("mHzk0NnlODc=", "AFOCc");
            FastScanner.IlIllIlIl[FastScanner.lIlllIlIl[50]] = FastScanner.IIIIIlIlIIl("Rwbi1yv886U=", "RDVMS");
            FastScanner.IlIllIlIl[FastScanner.lIlllIlIl[52]] = FastScanner.lIIIIlIlIIl("eg==", "ZXQGV");
            FastScanner.IlIllIlIl[FastScanner.lIlllIlIl[53]] = FastScanner.lllllIIlIIl("MQP/MOQme8k=", "cQuzc");
            FastScanner.IlIllIlIl[FastScanner.lIlllIlIl[56]] = FastScanner.lIIIIlIlIIl("Vg==", "vhxHA");
            FastScanner.IlIllIlIl[FastScanner.lIlllIlIl[57]] = FastScanner.lllllIIlIIl("my1bw9rEoAY=", "HlxZE");
            FastScanner.IlIllIlIl[FastScanner.lIlllIlIl[58]] = FastScanner.IIIIIlIlIIl("bi397K702rc=", "lqwbi");
            FastScanner.IlIllIlIl[FastScanner.lIlllIlIl[63]] = FastScanner.lllllIIlIIl("Sw3Y5lwwMmw=", "SZncp");
            FastScanner.IlIllIlIl[FastScanner.lIlllIlIl[64]] = FastScanner.IIIIIlIlIIl("sYX9C9AEK+g=", "trpRk");
            FastScanner.IlIllIlIl[FastScanner.lIlllIlIl[65]] = FastScanner.lllllIIlIIl("7sQGXF4KIAY=", "EpxaA");
            FastScanner.IlIllIlIl[FastScanner.lIlllIlIl[68]] = FastScanner.IIIIIlIlIIl("tj0uJljlt6o=", "ETgIs");
            FastScanner.IlIllIlIl[FastScanner.lIlllIlIl[69]] = FastScanner.lIIIIlIlIIl("aw==", "KjRbu");
            FastScanner.IlIllIlIl[FastScanner.lIlllIlIl[23]] = FastScanner.IIIIIlIlIIl("B6ZNMDbRZHE=", "mhVEc");
            FastScanner.IlIllIlIl[FastScanner.lIlllIlIl[70]] = FastScanner.lIIIIlIlIIl("cw==", "SStmF");
            FastScanner.IlIllIlIl[FastScanner.lIlllIlIl[71]] = FastScanner.IIIIIlIlIIl("1ptpjZ6M21c=", "ucDMz");
            FastScanner.IlIllIlIl[FastScanner.lIlllIlIl[72]] = FastScanner.IIIIIlIlIIl("bhOTK90Mqbw=", "RmNly");
            FastScanner.IlIllIlIl[FastScanner.lIlllIlIl[4]] = FastScanner.lIIIIlIlIIl("VA==", "tUZML");
            FastScanner.IlIllIlIl[FastScanner.lIlllIlIl[26]] = FastScanner.IIIIIlIlIIl("+RN0t6UzmQQ=", "Qbhpn");
            FastScanner.IlIllIlIl[FastScanner.lIlllIlIl[76]] = FastScanner.IIIIIlIlIIl("3uVZGwvOlOs=", "pCWLR");
            FastScanner.IlIllIlIl[FastScanner.lIlllIlIl[77]] = FastScanner.lllllIIlIIl("ia3md82CWm4=", "oUcIO");
            FastScanner.IlIllIlIl[FastScanner.lIlllIlIl[51]] = FastScanner.lIIIIlIlIIl("aA==", "HsqRx");
            FastScanner.IlIllIlIl[FastScanner.lIlllIlIl[82]] = FastScanner.IIIIIlIlIIl("gqEGdmt/mT0=", "fOjxl");
            FastScanner.IlIllIlIl[FastScanner.lIlllIlIl[83]] = FastScanner.lllllIIlIIl("jHZ0hBuWAkg=", "TOWqp");
            FastScanner.IlIllIlIl[FastScanner.lIlllIlIl[34]] = FastScanner.IIIIIlIlIIl("tTFlZRbVakk=", "Ikdha");
            FastScanner.IlIllIlIl[FastScanner.lIlllIlIl[61]] = FastScanner.lIIIIlIlIIl("RA==", "dcfaZ");
            FastScanner.IlIllIlIl[FastScanner.lIlllIlIl[87]] = FastScanner.IIIIIlIlIIl("lFSfF8DLGsY=", "zyiIb");
        }

        private static String IIIIIlIlIIl(String lIIlIllllIIIll, String IIIlIllllIIIll) {
            try {
                SecretKeySpec lllIIllllIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IIIlIllllIIIll.getBytes(StandardCharsets.UTF_8)), lIlllIlIl[17]), "DES");
                Cipher IllIIllllIIIll = Cipher.getInstance("DES");
                IllIIllllIIIll.init(lIlllIlIl[2], lllIIllllIIIll);
                return new String(IllIIllllIIIll.doFinal(Base64.getDecoder().decode(lIIlIllllIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lIlIIllllIIIll) {
                lIlIIllllIIIll.printStackTrace();
                return null;
            }
        }

        /*
         * Unable to fully structure code
         */
        private static String lIIIIlIlIIl(String lllIlIlllIIIll, String IllIlIlllIIIll) {
            lllIlIlllIIIll = new String(Base64.getDecoder().decode(lllIlIlllIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            lIlIlIlllIIIll = new StringBuilder();
            IIlIlIlllIIIll = IllIlIlllIIIll.toCharArray();
            llIIlIlllIIIll = FastScanner.lIlllIlIl[0];
            lIIlIIlllIIIll = lllIlIlllIIIll.toCharArray();
            IlIlIIlllIIIll = lIIlIIlllIIIll.length;
            llIlIIlllIIIll = FastScanner.lIlllIlIl[0];
            "".length();
            if ("   ".length() != 0) ** GOTO lbl19
            return null;
lbl-1000:
            // 1 sources

            {
                IlIIlIlllIIIll = lIIlIIlllIIIll[llIlIIlllIIIll];
                lIlIlIlllIIIll.append((char)(IlIIlIlllIIIll ^ IIlIlIlllIIIll[llIIlIlllIIIll % IIlIlIlllIIIll.length]));
                "".length();
                ++llIIlIlllIIIll;
                ++llIlIIlllIIIll;
lbl19:
                // 2 sources

                ** while (!FastScanner.lIIIllIlIIl((int)llIlIIlllIIIll, (int)IlIlIIlllIIIll))
            }
lbl20:
            // 1 sources

            return String.valueOf(lIlIlIlllIIIll);
        }

        private static String lllllIIlIIl(String IIlIIIlllIIIll, String llIIIIlllIIIll) {
            try {
                SecretKeySpec IlIIIIlllIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIIIlllIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                Cipher lIIIIIlllIIIll = Cipher.getInstance("Blowfish");
                lIIIIIlllIIIll.init(lIlllIlIl[2], IlIIIIlllIIIll);
                return new String(lIIIIIlllIIIll.doFinal(Base64.getDecoder().decode(IIlIIIlllIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception IIIIIIlllIIIll) {
                IIIIIIlllIIIll.printStackTrace();
                return null;
            }
        }

        private static void IlIlIlIlIIl() {
            lIlllIlIl = new int[89];
            FastScanner.lIlllIlIl[0] = ((0x2C ^ 0x2B) << (0x12 ^ 0x17) ^ 178 + 196 - 251 + 74) & ((0x3E ^ 0x29) << "   ".length() ^ 6 + 31 - 16 + 136 ^ -" ".length());
            FastScanner.lIlllIlIl[1] = " ".length();
            FastScanner.lIlllIlIl[2] = " ".length() << " ".length();
            FastScanner.lIlllIlIl[3] = ((0x73 ^ 0x26) << " ".length() ^ 58 + 150 - 135 + 94) << " ".length();
            FastScanner.lIlllIlIl[4] = (0x8B ^ 0x90) << " ".length() ^ (0x56 ^ 0x51);
            FastScanner.lIlllIlIl[5] = (0x52 ^ 0x57) << (" ".length() << (" ".length() << " ".length()));
            FastScanner.lIlllIlIl[6] = 0xCE ^ 0xB5;
            FastScanner.lIlllIlIl[7] = -" ".length();
            FastScanner.lIlllIlIl[8] = "   ".length();
            FastScanner.lIlllIlIl[9] = " ".length() << (" ".length() << " ".length());
            FastScanner.lIlllIlIl[10] = 0xA7 ^ 0x8E ^ (0x10 ^ 0x1B) << (" ".length() << " ".length());
            FastScanner.lIlllIlIl[11] = "   ".length() << " ".length();
            FastScanner.lIlllIlIl[12] = ((0x4A ^ 0x75) << (" ".length() << " ".length()) ^ 62 + 136 - 171 + 130) << " ".length();
            FastScanner.lIlllIlIl[13] = 5 + 173 - 116 + 137;
            FastScanner.lIlllIlIl[14] = 0x28 ^ 0x2F;
            FastScanner.lIlllIlIl[15] = 66 + 50 - 58 + 119 ^ (0x6F ^ 0x5E) << (" ".length() << " ".length());
            FastScanner.lIlllIlIl[16] = (0 ^ 0x47 ^ " ".length() << ("   ".length() << " ".length())) << (" ".length() << (" ".length() << " ".length()));
            FastScanner.lIlllIlIl[17] = " ".length() << "   ".length();
            FastScanner.lIlllIlIl[18] = 0x71 ^ 0x78;
            FastScanner.lIlllIlIl[19] = (0x4D ^ 0x74 ^ (0x45 ^ 0x4A) << (" ".length() << " ".length())) << " ".length();
            FastScanner.lIlllIlIl[20] = 0x4E ^ 0x45;
            FastScanner.lIlllIlIl[21] = "   ".length() << (" ".length() << " ".length());
            FastScanner.lIlllIlIl[22] = 0x4F ^ 0x42;
            FastScanner.lIlllIlIl[23] = 0x23 ^ 0x5E ^ (0x56 ^ 0x53) << (" ".length() << (" ".length() << " ".length()));
            FastScanner.lIlllIlIl[24] = -(0x22 ^ 0x36);
            FastScanner.lIlllIlIl[25] = 0x99 ^ 0xA6;
            FastScanner.lIlllIlIl[26] = (0x47 ^ 0x3A ^ (0x15 ^ 0xC) << (" ".length() << " ".length())) << " ".length();
            FastScanner.lIlllIlIl[27] = 0x6C ^ 0x7F;
            FastScanner.lIlllIlIl[28] = (166 + 41 - 38 + 12 ^ (0x1E ^ 0x47) << " ".length()) << " ".length();
            FastScanner.lIlllIlIl[29] = 127 + 140 - 237 + 113 ^ " ".length() << (0x42 ^ 0x45);
            FastScanner.lIlllIlIl[30] = " ".length() << (" ".length() << (" ".length() << " ".length()));
            FastScanner.lIlllIlIl[31] = (0xB8 ^ 0xB3) << (" ".length() << " ".length()) ^ (0x1A ^ 0x27);
            FastScanner.lIlllIlIl[32] = ((0x88 ^ 0x81) << (" ".length() << " ".length()) ^ (0x7E ^ 0x53)) << " ".length();
            FastScanner.lIlllIlIl[33] = (0x3A ^ 0x3D) & ~(0xB8 ^ 0xBF) ^ (0x61 ^ 0x5C);
            FastScanner.lIlllIlIl[34] = (" ".length() << (" ".length() << " ".length()) ^ "   ".length()) << "   ".length();
            FastScanner.lIlllIlIl[35] = (0x10 ^ 0x1D) << "   ".length();
            FastScanner.lIlllIlIl[36] = 0xF ^ 0x6C ^ " ".length() << (" ".length() << " ".length());
            FastScanner.lIlllIlIl[37] = (0xAF ^ 0xAA) << (" ".length() << " ".length());
            FastScanner.lIlllIlIl[38] = 0x15 ^ 0;
            FastScanner.lIlllIlIl[39] = (4 ^ 0x31 ^ (0x39 ^ 0x26) << " ".length()) << " ".length();
            FastScanner.lIlllIlIl[40] = (0xE8 ^ 0xC5) << (" ".length() << " ".length()) ^ 114 + 112 - 184 + 121;
            FastScanner.lIlllIlIl[41] = "   ".length() << "   ".length();
            FastScanner.lIlllIlIl[42] = 0x41 ^ 0x58;
            FastScanner.lIlllIlIl[43] = 1 ^ 0x1A;
            FastScanner.lIlllIlIl[44] = (0 ^ 0x67 ^ "   ".length() << (0x9A ^ 0x9F)) << (" ".length() << " ".length());
            FastScanner.lIlllIlIl[45] = 7 ^ 0x1A;
            FastScanner.lIlllIlIl[46] = (0x19 ^ 0x16) << " ".length();
            FastScanner.lIlllIlIl[47] = 0x34 ^ 0x2B;
            FastScanner.lIlllIlIl[48] = " ".length() << (0x45 ^ 0x40);
            FastScanner.lIlllIlIl[49] = (0x97 ^ 0x8C) << (" ".length() << " ".length()) ^ (0x35 ^ 0x78);
            FastScanner.lIlllIlIl[50] = (58 + 175 - 190 + 136 ^ (0xE7 ^ 0xB6) << " ".length()) << " ".length();
            FastScanner.lIlllIlIl[51] = (0x7A ^ 0x37) << " ".length() ^ 118 + 123 - 200 + 134;
            FastScanner.lIlllIlIl[52] = 0x86 ^ 0xA5;
            FastScanner.lIlllIlIl[53] = (0xCC ^ 0xC5) << (" ".length() << " ".length());
            FastScanner.lIlllIlIl[54] = ((0x3A ^ 0x1F) << " ".length()) + ((0x32 ^ 0x3B) << " ".length()) - (0x61 ^ 0x42) + ((0x85 ^ 0x90) << (" ".length() << " ".length()));
            FastScanner.lIlllIlIl[55] = (0xDB ^ 0x8A ^ (0x83 ^ 0x86) << (" ".length() << " ".length())) << " ".length();
            FastScanner.lIlllIlIl[56] = 0x37 ^ 0x46 ^ (6 ^ 0x13) << (" ".length() << " ".length());
            FastScanner.lIlllIlIl[57] = (0x11 ^ 0x7C ^ (0xFE ^ 0xC1) << " ".length()) << " ".length();
            FastScanner.lIlllIlIl[58] = " ".length() ^ (0x30 ^ 0x23) << " ".length();
            FastScanner.lIlllIlIl[59] = (0x7B ^ 0x72) << "   ".length();
            FastScanner.lIlllIlIl[60] = -(0x16 ^ 0x2D ^ (0x58 ^ 0x5F) << (" ".length() << " ".length()));
            FastScanner.lIlllIlIl[61] = 0x12 ^ 0x2B;
            FastScanner.lIlllIlIl[62] = ((0x5C ^ 1) << " ".length() ^ 2 + 87 - 45 + 85) << " ".length();
            FastScanner.lIlllIlIl[63] = (0x4B ^ 0x4E) << "   ".length();
            FastScanner.lIlllIlIl[64] = " ".length() << ("   ".length() << " ".length()) ^ (0x3F ^ 0x56);
            FastScanner.lIlllIlIl[65] = (0x29 ^ 0x3C) << " ".length();
            FastScanner.lIlllIlIl[66] = (0x26 ^ 3 ^ (0x5E ^ 0x5B) << (" ".length() << " ".length())) << " ".length();
            FastScanner.lIlllIlIl[67] = 0x41 ^ 0x6C ^ (0xBE ^ 0x83) << " ".length();
            FastScanner.lIlllIlIl[68] = (0x2B ^ 0x26) << (" ".length() << " ".length()) ^ (0x5F ^ 0x40);
            FastScanner.lIlllIlIl[69] = ((0xF8 ^ 0xBF) << " ".length() ^ 5 + 123 - 16 + 21) << (" ".length() << " ".length());
            FastScanner.lIlllIlIl[70] = ((0x1B ^ 0x1E) << " ".length() ^ (0x32 ^ 0x2F)) << " ".length();
            FastScanner.lIlllIlIl[71] = 0xB0 ^ 0x9F;
            FastScanner.lIlllIlIl[72] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
            FastScanner.lIlllIlIl[73] = (" ".length() << ("   ".length() << " ".length()) ^ (0x43 ^ 0xE)) << (" ".length() << (" ".length() << " ".length()));
            FastScanner.lIlllIlIl[74] = (0x5B ^ 0x4E ^ " ".length() << " ".length()) << (" ".length() << " ".length());
            FastScanner.lIlllIlIl[75] = 0x1A ^ 0x51;
            FastScanner.lIlllIlIl[76] = (0x60 ^ 0x49) << (" ".length() << " ".length()) ^ 11 + 17 - -90 + 33;
            FastScanner.lIlllIlIl[77] = ((0xB0 ^ 0x9D) & ~(0x73 ^ 0x5E) ^ (0x10 ^ 0x1D)) << (" ".length() << " ".length());
            FastScanner.lIlllIlIl[78] = (0x71 ^ 0x3E) << " ".length();
            FastScanner.lIlllIlIl[79] = 65 + 11 - -15 + 100;
            FastScanner.lIlllIlIl[80] = (0x20 ^ 7) << (" ".length() << " ".length());
            FastScanner.lIlllIlIl[81] = 115 + 159 - 176 + 79;
            FastScanner.lIlllIlIl[82] = (0x63 ^ 0x4A ^ (0x11 ^ 8) << " ".length()) << " ".length();
            FastScanner.lIlllIlIl[83] = 0x9E ^ 0xA9;
            FastScanner.lIlllIlIl[84] = ((0x53 ^ 0x5A) << (" ".length() << (" ".length() << " ".length()))) + (0xD8 ^ 0xAD) - (7 + 48 - 16 + 184) + (0x74 ^ 0x1B);
            FastScanner.lIlllIlIl[85] = (0x37 ^ 0x2E) + ("   ".length() << ("   ".length() << " ".length())) - ((0xBC ^ 0x9B) << (" ".length() << " ".length())) + ((0xDF ^ 0x8A) << " ".length());
            FastScanner.lIlllIlIl[86] = (0x68 ^ 0x3D) << " ".length();
            FastScanner.lIlllIlIl[87] = (0x44 ^ 0x59) << " ".length();
            FastScanner.lIlllIlIl[88] = 0xF8 ^ 0xC3;
        }

        private static boolean IIllIlIlIIl(int n, int n2) {
            return n == n2;
        }

        private static boolean lIIIllIlIIl(int n, int n2) {
            return n >= n2;
        }

        private static boolean IlIIllIlIIl(int n, int n2) {
            return n < n2;
        }

        private static boolean llIIllIlIIl(int n, int n2) {
            return n <= n2;
        }

        private static boolean llllIlIlIIl(Object object) {
            return object != null;
        }

        private static boolean llIlIlIlIIl(int n) {
            return n != 0;
        }

        private static boolean lIllIlIlIIl(int n) {
            return n == 0;
        }

        private static boolean IIIIllIlIIl(int n) {
            return n >= 0;
        }

        private static boolean IIlIllIlIIl(int n) {
            return n <= 0;
        }

        private static boolean lIlIllIlIIl(int n) {
            return n > 0;
        }

        private static boolean IlllIlIlIIl(int n, int n2) {
            return n != n2;
        }

        private static int IllIllIlIIl(long l, long l2) {
            return l == l2 ? 0 : (l < l2 ? -1 : 1);
        }
    }

    static class Solver {
        final FastScanner sc;
        final PrintWriter writer;
        private static String[] lllIlIlIl;
        private static int[] llIllIlIl;

        Solver(FastScanner IIllIIllIlIIll, PrintWriter llIlIIllIlIIll) {
            Solver lIllIIllIlIIll;
            lIllIIllIlIIll.sc = IIllIIllIlIIll;
            lIllIIllIlIIll.writer = llIlIIllIlIIll;
        }

        void run() {
            Solver lIlIIIllIlIIll;
            int IIlIIIllIlIIll = lIlIIIllIlIIll.sc.nextInt();
            HashSet<Integer> llIIIIllIlIIll = new HashSet<Integer>();
            int IlIIIIllIlIIll = llIllIlIl[0];
            while (Solver.llIIIlIlIIl(IlIIIIllIlIIll, IIlIIIllIlIIll)) {
                int lIIIIIllIlIIll = lIlIIIllIlIIll.sc.nextInt();
                if (Solver.IIlIIlIlIIl(llIIIIllIlIIll.contains(lIIIIIllIlIIll) ? 1 : 0)) {
                    lIlIIIllIlIIll.writer.println(lllIlIlIl[llIllIlIl[0]]);
                    return;
                }
                llIIIIllIlIIll.add(lIIIIIllIlIIll);
                "".length();
                ++IlIIIIllIlIIll;
                "".length();
                if ("   ".length() >= 0) continue;
                return;
            }
            lIlIIIllIlIIll.writer.println(lllIlIlIl[llIllIlIl[1]]);
        }

        static {
            Solver.IlIIIlIlIIl();
            Solver.lIIllIIlIIl();
        }

        private static void lIIllIIlIIl() {
            lllIlIlIl = new String[llIllIlIl[2]];
            Solver.lllIlIlIl[Solver.llIllIlIl[0]] = Solver.IIIllIIlIIl("cEz0KYJJaPw=", "qzsSy");
            Solver.lllIlIlIl[Solver.llIllIlIl[1]] = Solver.IIIllIIlIIl("r0kyc9/L6j8=", "mLNmA");
        }

        private static String IIIllIIlIIl(String IIllllIlIlIIll, String llIlllIlIlIIll) {
            try {
                SecretKeySpec IlIlllIlIlIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIlllIlIlIIll.getBytes(StandardCharsets.UTF_8)), llIllIlIl[3]), "DES");
                Cipher lIIlllIlIlIIll = Cipher.getInstance("DES");
                lIIlllIlIlIIll.init(llIllIlIl[2], IlIlllIlIlIIll);
                return new String(lIIlllIlIlIIll.doFinal(Base64.getDecoder().decode(IIllllIlIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception IIIlllIlIlIIll) {
                IIIlllIlIlIIll.printStackTrace();
                return null;
            }
        }

        private static void IlIIIlIlIIl() {
            llIllIlIl = new int[4];
            Solver.llIllIlIl[0] = (0xAA ^ 0xA7) << " ".length() & ~((0xA2 ^ 0xAF) << " ".length());
            Solver.llIllIlIl[1] = " ".length();
            Solver.llIllIlIl[2] = " ".length() << " ".length();
            Solver.llIllIlIl[3] = " ".length() << "   ".length();
        }

        private static boolean llIIIlIlIIl(int n, int n2) {
            return n < n2;
        }

        private static boolean IIlIIlIlIIl(int n) {
            return n != 0;
        }
    }

    static class MOD {
        private static final int MOD;
        private static int[] lIIllIlIl;

        MOD() {
            MOD llIlIlllIlIIll;
        }

        static long plus(long IIIlIlllIlIIll, long lllIIlllIlIIll) {
            long l;
            IIIlIlllIlIIll %= 1000000007L;
            long l2 = lllIIlllIlIIll % 1000000007L;
            return (l + l2) % 1000000007L;
        }

        static long sub(long IIlIIlllIlIIll, long llIIIlllIlIIll) {
            long l;
            IIlIIlllIlIIll %= 1000000007L;
            long l2 = llIIIlllIlIIll % 1000000007L;
            return (l - l2 + 1000000007L) % 1000000007L;
        }

        static long multi(long IIIIIlllIlIIll, long lllllIllIlIIll) {
            long l;
            IIIIIlllIlIIll %= 1000000007L;
            long l2 = lllllIllIlIIll % 1000000007L;
            return l * l2 % 1000000007L;
        }

        static long div(long IIlllIllIlIIll, long llIllIllIlIIll) {
            long l;
            IIlllIllIlIIll %= 1000000007L;
            long l2 = llIllIllIlIIll % 1000000007L;
            return l * Main$MOD.pow(l2, 1000000005L) % 1000000007L;
        }

        /*
         * WARNING - void declaration
         */
        static long pow(long IllIlIllIlIIll, long lIlIlIllIlIIll) {
            void var2_1;
            long l;
            if (Main$MOD.IllllIIlIIl(Main$MOD.lIlllIIlIIl(lIlIlIllIlIIll, 0L))) {
                return 1L;
            }
            if (Main$MOD.IllllIIlIIl(Main$MOD.lIlllIIlIIl(lIlIlIllIlIIll % 2L, 0L))) {
                long IIlIlIllIlIIll = lIlIlIllIlIIll / 2L;
                long llIIlIllIlIIll = Main$MOD.pow(IllIlIllIlIIll, IIlIlIllIlIIll);
                return llIIlIllIlIIll * llIIlIllIlIIll % 1000000007L;
            }
            return l * Main$MOD.pow(l, (long)(var2_1 - 1L)) % 1000000007L;
        }

        static {
            Main$MOD.IIlllIIlIIl();
            MOD = lIIllIlIl[0];
        }

        private static void IIlllIIlIIl() {
            lIIllIlIl = new int[1];
            Main$MOD.lIIllIlIl[0] = 923908739 + 206952179 - 263726370 + 132865459;
        }

        private static boolean IllllIIlIIl(int n) {
            return n == 0;
        }

        private static int lIlllIIlIIl(long l, long l2) {
            return l == l2 ? 0 : (l < l2 ? -1 : 1);
        }
    }
}

