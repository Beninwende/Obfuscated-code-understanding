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
import java.util.NoSuchElementException;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Main {
    static FastScanner sc;
    static PrintWriter out;
    static String S;
    static int n;
    static boolean[][] seen;
    static int[][] field;
    static final int mod;
    private static int[] llllllIIIl;
    private static String[] lIIIIIlIIl;
    private static int[] llIIIIlIIl;

    public Main() {
        Main llIIllllIIlIl;
    }

    public static void main(String[] stringArray) {
        int IlllIlllIIlIl = sc.nextInt();
        int lIllIlllIIlIl = sc.nextInt();
        int IIllIlllIIlIl = sc.nextInt();
        out.println(IIllIlllIIlIl + " " + IlllIlllIIlIl + " " + lIllIlllIIlIl);
        out.flush();
    }

    static {
        Main.lllIIIIIIIIl();
        Main.lIlIIIIIIIIl();
        Main.IIIllllllll();
        mod = llllllIIIl[llIIIIlIIl[0]];
        sc = new FastScanner();
        out = new PrintWriter(System.out);
    }

    private static void IIIllllllll() {
        llllllIIIl = new int[llIIIIlIIl[1]];
        Main.llllllIIIl[Main.llIIIIlIIl[0]] = (llIIIIlIIl[2] + llIIIIlIIl[3] - llIIIIlIIl[4] + llIIIIlIIl[5] << lIIIIIlIIl[llIIIIlIIl[0]].length()) + (llIIIIlIIl[6] + llIIIIlIIl[7] - llIIIIlIIl[8] + llIIIIlIIl[9]) - (llIIIIlIIl[10] + llIIIIlIIl[11] - llIIIIlIIl[12] + llIIIIlIIl[13]) + (llIIIIlIIl[14] + llIIIIlIIl[15] - llIIIIlIIl[16] + llIIIIlIIl[17]);
    }

    private static void lIlIIIIIIIIl() {
        lIIIIIlIIl = new String[llIIIIlIIl[1]];
        Main.lIIIIIlIIl[Main.llIIIIlIIl[0]] = Main.llIllllllll("HyH4r3ef9Ng=", "wLgZa");
    }

    private static String llIllllllll(String IIlIIlllIIlIl, String llIIIlllIIlIl) {
        try {
            SecretKeySpec IlIIIlllIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIIlllIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIIIlllIIlIl = Cipher.getInstance("Blowfish");
            lIIIIlllIIlIl.init(llIIIIlIIl[18], IlIIIlllIIlIl);
            return new String(lIIIIlllIIlIl.doFinal(Base64.getDecoder().decode(IIlIIlllIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIIIIlllIIlIl) {
            IIIIIlllIIlIl.printStackTrace();
            return null;
        }
    }

    private static void lllIIIIIIIIl() {
        llIIIIlIIl = new int[19];
        Main.llIIIIlIIl[0] = (0xA5 ^ 0x8E) << " ".length() & ~((0xB2 ^ 0x99) << " ".length());
        Main.llIIIIlIIl[1] = " ".length();
        Main.llIIIIlIIl[2] = 616359 + 518385 - 888473 + 616700 << (0x89 ^ 0x8C);
        Main.llIIIIlIIl[3] = 213657238 + 300901898 - 472130440 + 419063709;
        Main.llIIIIlIIl[4] = 373992701 + 322293110 - 528337821 + 214000501;
        Main.llIIIIlIIl[5] = (38267266 + 6649568 - -7518941 + 825406 << (" ".length() << " ".length())) + (35831768 + 29815198 - 27780463 + 6533218 << "   ".length()) - (69339769 + 55000448 - 77299765 + 204064619) + (3867449 + 9573525 - 8537476 + 5527293 << (" ".length() << " ".length()));
        Main.llIIIIlIIl[6] = 28393438 + 29604463 - 49592548 + 44149690 + (63967162 + 5364254 - -29112810 + 213985) - (127025852 + 95419898 - 87918949 + 14952662) + (33065137 + 24109401 - 50845581 + 44060256 << " ".length()) << " ".length();
        Main.llIIIIlIIl[7] = (101734 + 1257477 - 523428 + 1023472 << "   ".length()) + (10112575 + 12698025 - 4177562 + 1549895) - (9887203 + 17358821 - 15591727 + 9226586) + (7967773 + 9329013 - 7785614 + 1240675) << " ".length();
        Main.llIIIIlIIl[8] = 42797938 + 54207540 - 40006160 + 2279859;
        Main.llIIIIlIIl[9] = 6894412 + 5735623 - 12233781 + 12070715 << " ".length();
        Main.llIIIIlIIl[10] = 110035346 + 13632732 - 91645899 + 147536440;
        Main.llIIIIlIIl[11] = 38742885 + 39062527 - 46285003 + 13111160 << (" ".length() << " ".length());
        Main.llIIIIlIIl[12] = 51783862 + 112797382 - 60591151 + 59160288;
        Main.llIIIIlIIl[13] = 24318458 + 1858950 - 6504926 + 16568321;
        Main.llIIIIlIIl[14] = 24813292 + 16948892 - 31318800 + 51105745;
        Main.llIIIIlIIl[15] = 122608 + 6185940 - 1740348 + 2188827 + (122087 + 3229583 - 1429217 + 4028880) - (2242800 + 2212574 - 2155512 + 3656337 << " ".length()) + (5629030 + 6079428 - 5604121 + 1841456) << " ".length();
        Main.llIIIIlIIl[16] = (222719 + 176330 - 147851 + 50885 << (0x2F ^ 0x2A)) + (6476500 + 5379068 - 8896530 + 5001391) - -(1122542 + 190195 - -821850 + 49399) + (702040 + 1557121 - 947097 + 1022725 << (" ".length() << " ".length()));
        Main.llIIIIlIIl[17] = 27445377 + 19105810 - 28067798 + 10235312;
        Main.llIIIIlIIl[18] = " ".length() << " ".length();
    }

    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[IIIIIIlIIl[IIlIIIlIIl[0]]];
        private int ptr = IIIIIIlIIl[IIlIIIlIIl[1]];
        private int buflen = IIIIIIlIIl[IIlIIIlIIl[1]];
        private static int[] IIIIIIlIIl;
        private static String[] IlIIIIlIIl;
        private static int[] IIlIIIlIIl;

        FastScanner() {
            FastScanner IlIllIllIIlIl;
        }

        private boolean hasNextByte() {
            FastScanner IllIlIllIIlIl;
            if (FastScanner.IlIlIIIIIIIl(FastScanner.IlIllllllll(IllIlIllIIlIl.ptr, IllIlIllIIlIl.buflen) ? 1 : 0)) {
                return IIIIIIlIIl[IIlIIIlIIl[2]];
            }
            IllIlIllIIlIl.ptr = IIIIIIlIIl[IIlIIIlIIl[1]];
            try {
                IllIlIllIIlIl.buflen = IllIlIllIIlIl.in.read(IllIlIllIIlIl.buffer);
                IlIIIIlIIl[IIlIIIlIIl[0]].length();
                "".length();
            }
            catch (IOException lIlIlIllIIlIl) {
                lIlIlIllIIlIl.printStackTrace();
            }
            if (FastScanner.llIlIIIIIIIl(IlIIIIlIIl[IIlIIIlIIl[1]].length())) {
                return ((IIlIIIlIIl[3] ^ IIlIIIlIIl[4] ^ (IIlIIIlIIl[5] ^ IIlIIIlIIl[6]) << IlIIIIlIIl[IIlIIIlIIl[2]].length()) << (IlIIIIlIIl[IIlIIIlIIl[7]].length() << IlIIIIlIIl[IIlIIIlIIl[8]].length()) & ((IIlIIIlIIl[9] ^ IIlIIIlIIl[10] ^ (IIlIIIlIIl[11] ^ IIlIIIlIIl[12]) << (IlIIIIlIIl[IIlIIIlIIl[13]].length() << (IlIIIIlIIl[IIlIIIlIIl[14]].length() << IlIIIIlIIl[IIlIIIlIIl[15]].length()))) << (IlIIIIlIIl[IIlIIIlIIl[16]].length() << IlIIIIlIIl[IIlIIIlIIl[17]].length()) ^ -IlIIIIlIIl[IIlIIIlIIl[18]].length())) != 0;
            }
            if (FastScanner.IlIlIIIIIIIl(FastScanner.Illllllllll(IllIlIllIIlIl.buflen) ? 1 : 0)) {
                return IIIIIIlIIl[IIlIIIlIIl[1]];
            }
            return IIIIIIlIIl[IIlIIIlIIl[2]];
        }

        private int readByte() {
            FastScanner lIIIlIllIIlIl;
            if (FastScanner.IlIlIIIIIIIl(FastScanner.lllllllllll(lIIIlIllIIlIl.hasNextByte() ? 1 : 0) ? 1 : 0)) {
                int n = lIIIlIllIIlIl.ptr;
                lIIIlIllIIlIl.ptr = n + IIIIIIlIIl[IIlIIIlIIl[2]];
                return lIIIlIllIIlIl.buffer[n];
            }
            return IIIIIIlIIl[IIlIIIlIIl[7]];
        }

        private static boolean isPrintableChar(int IlllIIllIIlIl) {
            int n;
            if (FastScanner.IlIlIIIIIIIl(FastScanner.IIIIIIIIIIIl(IIIIIIlIIl[IIlIIIlIIl[8]], IlllIIllIIlIl) ? 1 : 0) && FastScanner.IlIlIIIIIIIl(FastScanner.IIIIIIIIIIIl(IlllIIllIIlIl, IIIIIIlIIl[IIlIIIlIIl[13]]) ? 1 : 0)) {
                n = IIIIIIlIIl[IIlIIIlIIl[2]];
                "".length();
                "".length();
                if (FastScanner.IIllIIIIIIIl(" ".length() << (" ".length() << " ".length()), -" ".length())) {
                    return ((IIlIIIlIIl[19] ^ IIlIIIlIIl[20]) << " ".length() & ((IIlIIIlIIl[21] ^ IIlIIIlIIl[22]) << " ".length() ^ IIlIIIlIIl[23])) != 0;
                }
            } else {
                n = IIIIIIlIIl[IIlIIIlIIl[1]];
            }
            return n != 0;
        }

        private void skipUnprintable() {
            FastScanner llIlIIllIIlIl;
            while (FastScanner.IlIlIIIIIIIl(FastScanner.lllllllllll(llIlIIllIIlIl.hasNextByte() ? 1 : 0) ? 1 : 0) && FastScanner.IlIlIIIIIIIl(FastScanner.lIIIIIIIIIIl(FastScanner.isPrintableChar(llIlIIllIIlIl.buffer[llIlIIllIIlIl.ptr]) ? 1 : 0) ? 1 : 0)) {
                llIlIIllIIlIl.ptr += IIIIIIlIIl[IIlIIIlIIl[2]];
                "".length();
                "".length();
                if (!FastScanner.lIllIIIIIIIl(" ".length(), " ".length())) continue;
                return;
            }
        }

        public boolean hasNext() {
            FastScanner IIIlIIllIIlIl;
            IIIlIIllIIlIl.skipUnprintable();
            return this.hasNextByte();
        }

        /*
         * WARNING - void declaration
         */
        public String next() {
            void var1_1;
            FastScanner llIIIIllIIlIl;
            if (FastScanner.IlIlIIIIIIIl(FastScanner.lIIIIIIIIIIl(llIIIIllIIlIl.hasNext() ? 1 : 0) ? 1 : 0)) {
                throw new NoSuchElementException();
            }
            StringBuilder IlIIIIllIIlIl = new StringBuilder();
            int lIIIIIllIIlIl = llIIIIllIIlIl.readByte();
            while (FastScanner.IlIlIIIIIIIl(FastScanner.lllllllllll(FastScanner.isPrintableChar(lIIIIIllIIlIl) ? 1 : 0) ? 1 : 0)) {
                IlIIIIllIIlIl.appendCodePoint(lIIIIIllIIlIl);
                "".length();
                lIIIIIllIIlIl = llIIIIllIIlIl.readByte();
                "".length();
                "".length();
                if (!FastScanner.IlllIIIIIIIl("   ".length(), -" ".length())) continue;
                return null;
            }
            return String.valueOf(var1_1);
        }

        public long nextLong() {
            FastScanner lIIlllIlIIlIl;
            if (FastScanner.IlIlIIIIIIIl(FastScanner.lIIIIIIIIIIl(lIIlllIlIIlIl.hasNext() ? 1 : 0) ? 1 : 0)) {
                throw new NoSuchElementException();
            }
            long IIIlllIlIIlIl = 0L;
            int lllIllIlIIlIl = IIIIIIlIIl[IIlIIIlIIl[1]];
            int IllIllIlIIlIl = lIIlllIlIIlIl.readByte();
            if (FastScanner.IlIlIIIIIIIl(FastScanner.IlIIIIIIIIIl(IllIllIlIIlIl, IIIIIIlIIl[IIlIIIlIIl[14]]) ? 1 : 0)) {
                lllIllIlIIlIl = IIIIIIlIIl[IIlIIIlIIl[2]];
                IllIllIlIIlIl = lIIlllIlIIlIl.readByte();
            }
            if (!FastScanner.IlIlIIIIIIIl(FastScanner.llIIIIIIIIIl(IllIllIlIIlIl, IIIIIIlIIl[IIlIIIlIIl[15]]) ? 1 : 0) || FastScanner.IlIlIIIIIIIl(FastScanner.IlIllllllll(IIIIIIlIIl[IIlIIIlIIl[16]], IllIllIlIIlIl) ? 1 : 0)) {
                throw new NumberFormatException();
            }
            do {
                if (FastScanner.IlIlIIIIIIIl(FastScanner.IIIIIIIIIIIl(IIIIIIlIIl[IIlIIIlIIl[15]], IllIllIlIIlIl) ? 1 : 0) && FastScanner.IlIlIIIIIIIl(FastScanner.IIIIIIIIIIIl(IllIllIlIIlIl, IIIIIIlIIl[IIlIIIlIIl[16]]) ? 1 : 0)) {
                    IIIlllIlIIlIl *= 10L;
                    IIIlllIlIIlIl += (long)(IllIllIlIIlIl - IIIIIIlIIl[IIlIIIlIIl[15]]);
                    "".length();
                    "".length();
                    if (FastScanner.llllIIIIIIIl("   ".length(), " ".length() << (" ".length() << " ".length()))) {
                        return 0L;
                    }
                } else {
                    if (!FastScanner.IlIlIIIIIIIl(FastScanner.IIlIIIIIIIIl(IllIllIlIIlIl, IIIIIIlIIl[IIlIIIlIIl[7]]) ? 1 : 0) || FastScanner.IlIlIIIIIIIl(FastScanner.lIIIIIIIIIIl(FastScanner.isPrintableChar(IllIllIlIIlIl) ? 1 : 0) ? 1 : 0)) {
                        long l;
                        if (FastScanner.IlIlIIIIIIIl(FastScanner.lllllllllll(lllIllIlIIlIl) ? 1 : 0)) {
                            l = -IIIlllIlIIlIl;
                            "".length();
                            "".length();
                            if (FastScanner.IIIIlIIIIIIl(" ".length() << " ".length())) {
                                return 0L;
                            }
                        } else {
                            l = IIIlllIlIIlIl;
                        }
                        return l;
                    }
                    throw new NumberFormatException();
                }
                int n = this.readByte();
                "".length();
                "".length();
            } while (!FastScanner.IIIIlIIIIIIl(" ".length()));
            return 0L;
        }

        public int nextInt() {
            FastScanner IIIIllIlIIlIl;
            return (int)IIIIllIlIIlIl.nextLong();
        }

        public double nextDouble() {
            FastScanner lIllIlIlIIlIl;
            return Double.parseDouble(lIllIlIlIIlIl.next());
        }

        /*
         * WARNING - void declaration
         */
        public int[] nextIntArray(int lllIIlIlIIlIl, boolean IllIIlIlIIlIl) {
            void var3_4;
            if (FastScanner.IlIlIIIIIIIl(FastScanner.lllllllllll(IllIIlIlIIlIl ? 1 : 0) ? 1 : 0)) {
                int[] lIlIIlIlIIlIl = new int[lllIIlIlIIlIl + IIIIIIlIIl[IIlIIIlIIl[2]]];
                int IIlIIlIlIIlIl = IIIIIIlIIl[IIlIIIlIIl[2]];
                while (FastScanner.IlIlIIIIIIIl(FastScanner.IIIIIIIIIIIl(IIlIIlIlIIlIl, lllIIlIlIIlIl) ? 1 : 0)) {
                    lIlIIlIlIIlIl[IIlIIlIlIIlIl] = sc.nextInt();
                    ++IIlIIlIlIIlIl;
                    "".length();
                    "".length();
                    if (!FastScanner.IlIlIIIIIIIl("   ".length() << " ".length() & ("   ".length() << " ".length() ^ IIlIIIlIIl[23]))) continue;
                    return null;
                }
                return lIlIIlIlIIlIl;
            }
            int[] lIlIIlIlIIlIl = new int[lllIIlIlIIlIl];
            int IIlIIlIlIIlIl = IIIIIIlIIl[IIlIIIlIIl[1]];
            while (FastScanner.IlIlIIIIIIIl(FastScanner.IlIllllllll(IIlIIlIlIIlIl, lllIIlIlIIlIl) ? 1 : 0)) {
                lIlIIlIlIIlIl[IIlIIlIlIIlIl] = sc.nextInt();
                ++IIlIIlIlIIlIl;
                "".length();
                "".length();
                if (!FastScanner.lIllIIIIIIIl(-" ".length(), -" ".length())) continue;
                return null;
            }
            return var3_4;
        }

        /*
         * WARNING - void declaration
         */
        public long[] nextLongArray(int llIllIIlIIlIl, boolean IlIllIIlIIlIl) {
            void var3_4;
            if (FastScanner.IlIlIIIIIIIl(FastScanner.lllllllllll(IlIllIIlIIlIl ? 1 : 0) ? 1 : 0)) {
                long[] lIIllIIlIIlIl = new long[llIllIIlIIlIl + IIIIIIlIIl[IIlIIIlIIl[2]]];
                int IIIllIIlIIlIl = IIIIIIlIIl[IIlIIIlIIl[2]];
                while (FastScanner.IlIlIIIIIIIl(FastScanner.IIIIIIIIIIIl(IIIllIIlIIlIl, llIllIIlIIlIl) ? 1 : 0)) {
                    lIIllIIlIIlIl[IIIllIIlIIlIl] = sc.nextLong();
                    ++IIIllIIlIIlIl;
                    "".length();
                    "".length();
                    if (!FastScanner.IIIIlIIIIIIl(" ".length())) continue;
                    return null;
                }
                return lIIllIIlIIlIl;
            }
            long[] lIIllIIlIIlIl = new long[llIllIIlIIlIl];
            int IIIllIIlIIlIl = IIIIIIlIIl[IIlIIIlIIl[1]];
            while (FastScanner.IlIlIIIIIIIl(FastScanner.IlIllllllll(IIIllIIlIIlIl, llIllIIlIIlIl) ? 1 : 0)) {
                lIIllIIlIIlIl[IIIllIIlIIlIl] = sc.nextLong();
                ++IIIllIIlIIlIl;
                "".length();
                "".length();
                if (!FastScanner.IlIlIIIIIIIl((IIlIIIlIIl[24] ^ IIlIIIlIIl[25]) & (IIlIIIlIIl[7] ^ IIlIIIlIIl[26] ^ IIlIIIlIIl[23]))) continue;
                return null;
            }
            return var3_4;
        }

        static {
            FastScanner.lIIlIIIIIIIl();
            FastScanner.IIIlIIIIIIIl();
            FastScanner.lIIllllllll();
        }

        private static void lIIllllllll() {
            IIIIIIlIIl = new int[IIlIIIlIIl[17]];
            FastScanner.IIIIIIlIIl[FastScanner.IIlIIIlIIl[0]] = IlIIIIlIIl[IIlIIIlIIl[27]].length() << ((IIlIIIlIIl[28] ^ IIlIIIlIIl[29] ^ (IIlIIIlIIl[30] ^ IIlIIIlIIl[31]) << IlIIIIlIIl[IIlIIIlIIl[32]].length()) << IlIIIIlIIl[IIlIIIlIIl[33]].length());
            FastScanner.IIIIIIlIIl[FastScanner.IIlIIIlIIl[1]] = (IIlIIIlIIl[34] ^ IIlIIIlIIl[35] ^ (IIlIIIlIIl[36] ^ IIlIIIlIIl[8]) << (IlIIIIlIIl[IIlIIIlIIl[20]].length() << IlIIIIlIIl[IIlIIIlIIl[34]].length())) & ((IIlIIIlIIl[0] ^ IIlIIIlIIl[29]) << IlIIIIlIIl[IIlIIIlIIl[37]].length() ^ IIlIIIlIIl[38] + IIlIIIlIIl[39] - IIlIIIlIIl[40] + IIlIIIlIIl[41] ^ -IlIIIIlIIl[IIlIIIlIIl[42]].length());
            FastScanner.IIIIIIlIIl[FastScanner.IIlIIIlIIl[2]] = IlIIIIlIIl[IIlIIIlIIl[43]].length();
            FastScanner.IIIIIIlIIl[FastScanner.IIlIIIlIIl[7]] = -IlIIIIlIIl[IIlIIIlIIl[44]].length();
            FastScanner.IIIIIIlIIl[FastScanner.IIlIIIlIIl[8]] = IIlIIIlIIl[8] ^ IIlIIIlIIl[45] ^ (IIlIIIlIIl[46] ^ IIlIIIlIIl[47]) << IlIIIIlIIl[IIlIIIlIIl[48]].length();
            FastScanner.IIIIIIlIIl[FastScanner.IIlIIIlIIl[13]] = (IIlIIIlIIl[11] ^ IIlIIIlIIl[24]) << IlIIIIlIIl[IIlIIIlIIl[49]].length();
            FastScanner.IIIIIIlIIl[FastScanner.IIlIIIlIIl[14]] = IIlIIIlIIl[50] ^ IIlIIIlIIl[51] ^ (IIlIIIlIIl[52] ^ IIlIIIlIIl[16]) << IlIIIIlIIl[IIlIIIlIIl[53]].length();
            FastScanner.IIIIIIlIIl[FastScanner.IIlIIIlIIl[15]] = IlIIIIlIIl[IIlIIIlIIl[54]].length() << (IlIIIIlIIl[IIlIIIlIIl[55]].length() << (IlIIIIlIIl[IIlIIIlIIl[56]].length() << IlIIIIlIIl[IIlIIIlIIl[57]].length()));
            FastScanner.IIIIIIlIIl[FastScanner.IIlIIIlIIl[16]] = IIlIIIlIIl[58] ^ IIlIIIlIIl[59] ^ IlIIIIlIIl[IIlIIIlIIl[60]].length() << IlIIIIlIIl[IIlIIIlIIl[3]].length();
        }

        private static boolean IlIIIIIIIIIl(int n, int n2) {
            boolean bl;
            if (FastScanner.llllIIIIIIIl(n, n2)) {
                bl = IIlIIIlIIl[1];
                "".length();
                if (((0x27 ^ 0x2C) << (" ".length() << " ".length()) & ~((0xA9 ^ 0xA2) << (" ".length() << " ".length()))) != 0) {
                    return ((0x58 ^ 0x4B) << (" ".length() << " ".length()) & ~((0x76 ^ 0x65) << (" ".length() << " ".length()))) != 0;
                }
            } else {
                bl = IIlIIIlIIl[0];
            }
            return bl;
        }

        private static boolean llIIIIIIIIIl(int n, int n2) {
            boolean bl;
            if (FastScanner.lIIIlIIIIIIl(n, n2)) {
                bl = IIlIIIlIIl[1];
                "".length();
                if (((111 + 69 - 121 + 68 ^ (0xD5 ^ 0xC0) << (" ".length() << " ".length())) << " ".length() & ((0xF ^ 0x18 ^ (0x76 ^ 0x79) << (" ".length() << " ".length())) << " ".length() ^ -" ".length())) != 0) {
                    return ((81 + 156 - 17 + 7 ^ (0xBA ^ 0xAD) << "   ".length()) & (0xB6 ^ 0x8B ^ (0x70 ^ 0x43) << " ".length() ^ -" ".length())) != 0;
                }
            } else {
                bl = IIlIIIlIIl[0];
            }
            return bl;
        }

        private static boolean IlIllllllll(int n, int n2) {
            boolean bl;
            if (FastScanner.IlllIIIIIIIl(n, n2)) {
                bl = IIlIIIlIIl[1];
                "".length();
                if (-"   ".length() >= 0) {
                    return ((0xDD ^ 0xA6 ^ (0x82 ^ 0x97) << (" ".length() << " ".length())) & ((0x85 ^ 0xC2) << " ".length() ^ 141 + 78 - 80 + 22 ^ -" ".length())) != 0;
                }
            } else {
                bl = IIlIIIlIIl[0];
            }
            return bl;
        }

        private static boolean IIIIIIIIIIIl(int n, int n2) {
            boolean bl;
            if (FastScanner.IIllIIIIIIIl(n, n2)) {
                bl = IIlIIIlIIl[1];
                "".length();
                if ("   ".length() < "   ".length()) {
                    return ((7 ^ 0x4C ^ (0x1B ^ 0x38) << " ".length()) << " ".length() & ((60 + 110 - 151 + 136 ^ (0xE6 ^ 0xAD) << " ".length()) << " ".length() ^ -" ".length())) != 0;
                }
            } else {
                bl = IIlIIIlIIl[0];
            }
            return bl;
        }

        private static boolean lllllllllll(int n) {
            boolean bl;
            if (FastScanner.IlIlIIIIIIIl(n)) {
                bl = IIlIIIlIIl[1];
                "".length();
                if (-" ".length() > 0) {
                    return ((0xAC ^ 0x9B) & ~(0x7A ^ 0x4D)) != 0;
                }
            } else {
                bl = IIlIIIlIIl[0];
            }
            return bl;
        }

        private static boolean lIIIIIIIIIIl(int n) {
            boolean bl;
            if (FastScanner.IIIIlIIIIIIl(n)) {
                bl = IIlIIIlIIl[1];
                "".length();
                if (((0x82 ^ 0xB9 ^ (0x5E ^ 0x5B) << "   ".length()) << " ".length() & (((0x61 ^ 0x44) << (" ".length() << " ".length()) ^ 43 + 134 - 135 + 93) << " ".length() ^ -" ".length())) != 0) {
                    return ((17 + 49 - 2 + 79 ^ (0xB ^ 0x1A) << "   ".length()) & (0xB7 ^ 0x8C ^ (5 ^ 0xA) << (" ".length() << " ".length()) ^ -" ".length())) != 0;
                }
            } else {
                bl = IIlIIIlIIl[0];
            }
            return bl;
        }

        private static boolean Illllllllll(int n) {
            boolean bl;
            if (FastScanner.IlIIlIIIIIIl(n)) {
                bl = IIlIIIlIIl[1];
                "".length();
                if ((((0xB0 ^ 0x8B) << " ".length() ^ (0x4E ^ 0x3D)) << "   ".length() & ((0x67 ^ 0x36 ^ (0xBA ^ 0xAF) << (" ".length() << " ".length())) << "   ".length() ^ -" ".length())) < ((0xBC ^ 0xA3 ^ (0xD3 ^ 0xC2) << (" ".length() << " ".length())) & (0xE2 ^ 0xB3 ^ (0xA8 ^ 0xAD) << " ".length() ^ -" ".length()))) {
                    return ((0x70 ^ 0x4D ^ (0x8B ^ 0x8E) << " ".length()) & (0x31 ^ 0x36 ^ "   ".length() << (" ".length() << (" ".length() << " ".length())) ^ -" ".length())) != 0;
                }
            } else {
                bl = IIlIIIlIIl[0];
            }
            return bl;
        }

        private static boolean IIlIIIIIIIIl(int n, int n2) {
            boolean bl;
            if (FastScanner.lIllIIIIIIIl(n, n2)) {
                bl = IIlIIIlIIl[1];
                "".length();
                if (" ".length() >= "   ".length()) {
                    return ((27 + 52 - 26 + 126 ^ (0x67 ^ 0x3C) << " ".length()) << (" ".length() << (" ".length() << " ".length())) & ((" ".length() << (" ".length() << (" ".length() << " ".length())) ^ (0x6B ^ 0x7E)) << (" ".length() << (" ".length() << " ".length())) ^ -" ".length())) != 0;
                }
            } else {
                bl = IIlIIIlIIl[0];
            }
            return bl;
        }

        private static void IIIlIIIIIIIl() {
            IlIIIIlIIl = new String[IIlIIIlIIl[61]];
            FastScanner.IlIIIIlIIl[FastScanner.IIlIIIlIIl[0]] = FastScanner.IIlllllllll("", "IVEgv");
            FastScanner.IlIIIIlIIl[FastScanner.IIlIIIlIIl[1]] = FastScanner.lIlllllllll("LHV7pauI+vE=", "xAgGi");
            FastScanner.IlIIIIlIIl[FastScanner.IIlIIIlIIl[2]] = FastScanner.IllIIIIIIIIl("o1Qjg9ISBPk=", "fdXYG");
            FastScanner.IlIIIIlIIl[FastScanner.IIlIIIlIIl[7]] = FastScanner.IIlllllllll("ZA==", "DaoQL");
            FastScanner.IlIIIIlIIl[FastScanner.IIlIIIlIIl[8]] = FastScanner.IIlllllllll("Qg==", "bQZCY");
            FastScanner.IlIIIIlIIl[FastScanner.IIlIIIlIIl[13]] = FastScanner.lIlllllllll("j2AOvg8NKVM=", "tCiek");
            FastScanner.IlIIIIlIIl[FastScanner.IIlIIIlIIl[14]] = FastScanner.lIlllllllll("loUJ3DdqzOY=", "uWson");
            FastScanner.IlIIIIlIIl[FastScanner.IIlIIIlIIl[15]] = FastScanner.IIlllllllll("Tg==", "noGrB");
            FastScanner.IlIIIIlIIl[FastScanner.IIlIIIlIIl[16]] = FastScanner.IIlllllllll("Sg==", "jbvUo");
            FastScanner.IlIIIIlIIl[FastScanner.IIlIIIlIIl[17]] = FastScanner.lIlllllllll("0NOn4dfoKts=", "XvUdL");
            FastScanner.IlIIIIlIIl[FastScanner.IIlIIIlIIl[18]] = FastScanner.lIlllllllll("MSpS97FgmuY=", "QzBwu");
            FastScanner.IlIIIIlIIl[FastScanner.IIlIIIlIIl[27]] = FastScanner.IIlllllllll("UA==", "pCvRP");
            FastScanner.IlIIIIlIIl[FastScanner.IIlIIIlIIl[32]] = FastScanner.IIlllllllll("Tg==", "nyQli");
            FastScanner.IlIIIIlIIl[FastScanner.IIlIIIlIIl[33]] = FastScanner.lIlllllllll("wEhSjCwL1aU=", "FVbZW");
            FastScanner.IlIIIIlIIl[FastScanner.IIlIIIlIIl[20]] = FastScanner.IllIIIIIIIIl("nfvO/0mjdqM=", "UPeXm");
            FastScanner.IlIIIIlIIl[FastScanner.IIlIIIlIIl[34]] = FastScanner.lIlllllllll("7JvBxMhsoZs=", "UBqmC");
            FastScanner.IlIIIIlIIl[FastScanner.IIlIIIlIIl[37]] = FastScanner.IIlllllllll("QQ==", "aTpGN");
            FastScanner.IlIIIIlIIl[FastScanner.IIlIIIlIIl[42]] = FastScanner.IllIIIIIIIIl("zZ0TDp8DWjE=", "aTnnX");
            FastScanner.IlIIIIlIIl[FastScanner.IIlIIIlIIl[43]] = FastScanner.IIlllllllll("QQ==", "aHyKO");
            FastScanner.IlIIIIlIIl[FastScanner.IIlIIIlIIl[44]] = FastScanner.lIlllllllll("5Q7VG0S5gYY=", "oENWK");
            FastScanner.IlIIIIlIIl[FastScanner.IIlIIIlIIl[48]] = FastScanner.IllIIIIIIIIl("G2EdwGKMPT0=", "RKHhr");
            FastScanner.IlIIIIlIIl[FastScanner.IIlIIIlIIl[49]] = FastScanner.IllIIIIIIIIl("/MtwOb+vEsw=", "ACwPd");
            FastScanner.IlIIIIlIIl[FastScanner.IIlIIIlIIl[53]] = FastScanner.IIlllllllll("SA==", "hmzgb");
            FastScanner.IlIIIIlIIl[FastScanner.IIlIIIlIIl[54]] = FastScanner.lIlllllllll("LtYyAG5SE/k=", "XikIv");
            FastScanner.IlIIIIlIIl[FastScanner.IIlIIIlIIl[55]] = FastScanner.IIlllllllll("SA==", "hhmeU");
            FastScanner.IlIIIIlIIl[FastScanner.IIlIIIlIIl[56]] = FastScanner.IllIIIIIIIIl("hIH9hIW0GVI=", "dRqIw");
            FastScanner.IlIIIIlIIl[FastScanner.IIlIIIlIIl[57]] = FastScanner.IIlllllllll("SQ==", "iRAZf");
            FastScanner.IlIIIIlIIl[FastScanner.IIlIIIlIIl[60]] = FastScanner.IllIIIIIIIIl("2Qii/L5N9QI=", "Qucfa");
            FastScanner.IlIIIIlIIl[FastScanner.IIlIIIlIIl[3]] = FastScanner.IllIIIIIIIIl("QCr0A5c9ghM=", "CAhwS");
        }

        /*
         * Unable to fully structure code
         */
        private static String IIlllllllll(String llIIIllIIIlIl, String IlIIIllIIIlIl) {
            llIIIllIIIlIl = new String(Base64.getDecoder().decode(llIIIllIIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            lIIIIllIIIlIl = new StringBuilder();
            IIIIIllIIIlIl = IlIIIllIIIlIl.toCharArray();
            lllllIlIIIlIl = FastScanner.IIlIIIlIIl[0];
            lIlIlIlIIIlIl = llIIIllIIIlIl.toCharArray();
            IllIlIlIIIlIl = lIlIlIlIIIlIl.length;
            lllIlIlIIIlIl = FastScanner.IIlIIIlIIl[0];
            "".length();
            if (" ".length() << " ".length() > 0) ** GOTO lbl19
            return null;
lbl-1000:
            // 1 sources

            {
                IllllIlIIIlIl = lIlIlIlIIIlIl[lllIlIlIIIlIl];
                lIIIIllIIIlIl.append((char)(IllllIlIIIlIl ^ IIIIIllIIIlIl[lllllIlIIIlIl % IIIIIllIIIlIl.length]));
                "".length();
                ++lllllIlIIIlIl;
                ++lllIlIlIIIlIl;
lbl19:
                // 2 sources

                ** while (!FastScanner.lIIIlIIIIIIl((int)lllIlIlIIIlIl, (int)IllIlIlIIIlIl))
            }
lbl20:
            // 1 sources

            return String.valueOf(lIIIIllIIIlIl);
        }

        private static String IllIIIIIIIIl(String IIIIlIlIIIlIl, String llllIIlIIIlIl) {
            try {
                SecretKeySpec IlllIIlIIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllIIlIIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                Cipher lIllIIlIIIlIl = Cipher.getInstance("Blowfish");
                lIllIIlIIIlIl.init(IIlIIIlIIl[2], IlllIIlIIIlIl);
                return new String(lIllIIlIIIlIl.doFinal(Base64.getDecoder().decode(IIIIlIlIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception IIllIIlIIIlIl) {
                IIllIIlIIIlIl.printStackTrace();
                return null;
            }
        }

        private static String lIlllllllll(String llIIIIlIIIlIl, String IlIIIIlIIIlIl) {
            try {
                SecretKeySpec lIIIIIlIIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IlIIIIlIIIlIl.getBytes(StandardCharsets.UTF_8)), IIlIIIlIIl[16]), "DES");
                Cipher IIIIIIlIIIlIl = Cipher.getInstance("DES");
                IIIIIIlIIIlIl.init(IIlIIIlIIl[2], lIIIIIlIIIlIl);
                return new String(IIIIIIlIIIlIl.doFinal(Base64.getDecoder().decode(llIIIIlIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllIIIIlIl) {
                llllllIIIIlIl.printStackTrace();
                return null;
            }
        }

        private static void lIIlIIIIIIIl() {
            IIlIIIlIIl = new int[62];
            FastScanner.IIlIIIlIIl[0] = (0x9C ^ 0xB9) & ~(0xBC ^ 0x99);
            FastScanner.IIlIIIlIIl[1] = " ".length();
            FastScanner.IIlIIIlIIl[2] = " ".length() << " ".length();
            FastScanner.IIlIIIlIIl[3] = ((0x32 ^ 0x2B) << (" ".length() << " ".length()) ^ (0x12 ^ 0x71)) << (" ".length() << " ".length());
            FastScanner.IIlIIIlIIl[4] = 0xC2 ^ 0xB3;
            FastScanner.IIlIIIlIIl[5] = (0x61 ^ 0x52) << (" ".length() << " ".length());
            FastScanner.IIlIIIlIIl[6] = 27 + 44 - 20 + 142;
            FastScanner.IIlIIIlIIl[7] = "   ".length();
            FastScanner.IIlIIIlIIl[8] = " ".length() << (" ".length() << " ".length());
            FastScanner.IIlIIIlIIl[9] = 13 + 13 - -64 + 55;
            FastScanner.IIlIIIlIIl[10] = (0x5F ^ 0x6E) << (" ".length() << " ".length());
            FastScanner.IIlIIIlIIl[11] = (0x7D ^ 0x72) << (" ".length() << (" ".length() << " ".length())) ^ 4 + 72 - -3 + 92;
            FastScanner.IIlIIIlIIl[12] = (0x8A ^ 0x81 ^ (0x9A ^ 0x93) << (" ".length() << " ".length())) << " ".length();
            FastScanner.IIlIIIlIIl[13] = 87 + 46 - -22 + 8 ^ (0xFD ^ 0xAE) << " ".length();
            FastScanner.IIlIIIlIIl[14] = "   ".length() << " ".length();
            FastScanner.IIlIIIlIIl[15] = 0xA1 ^ 0xA6;
            FastScanner.IIlIIIlIIl[16] = " ".length() << "   ".length();
            FastScanner.IIlIIIlIIl[17] = 0x45 ^ 0x4C;
            FastScanner.IIlIIIlIIl[18] = (0x2C ^ 0x29) << " ".length();
            FastScanner.IIlIIIlIIl[19] = (0xD ^ 0x2A) << " ".length() ^ (0xD5 ^ 0xBE);
            FastScanner.IIlIIIlIIl[20] = (0x36 ^ 0x31) << " ".length();
            FastScanner.IIlIIIlIIl[21] = (0x75 ^ 0x62) + (0xF8 ^ 0xA9) - ((0x62 ^ 0x67) << (" ".length() << " ".length())) + (0xF ^ 0x54);
            FastScanner.IIlIIIlIIl[22] = ((0xB3 ^ 0xBC) << (" ".length() << " ".length()) ^ (0x2C ^ 0x31)) << (" ".length() << " ".length());
            FastScanner.IIlIIIlIIl[23] = -" ".length();
            FastScanner.IIlIIIlIIl[24] = (0 ^ 0x4F ^ (0xAB ^ 0x80) << " ".length()) << (" ".length() << " ".length());
            FastScanner.IIlIIIlIIl[25] = 151 + 32 - 89 + 103 ^ (0xD3 ^ 0x92) << " ".length();
            FastScanner.IIlIIIlIIl[26] = " ".length() << (0xFE ^ 0xA9 ^ (0x7B ^ 0x52) << " ".length());
            FastScanner.IIlIIIlIIl[27] = (0x99 ^ 0xAC) << " ".length() ^ (0xA ^ 0x6B);
            FastScanner.IIlIIIlIIl[28] = (0xAF ^ 0xA2) << "   ".length();
            FastScanner.IIlIIIlIIl[29] = 0x4A ^ 0x19;
            FastScanner.IIlIIIlIIl[30] = (0xF6 ^ 0xA3) << " ".length();
            FastScanner.IIlIIIlIIl[31] = 126 + 122 - 115 + 44 + (0x30 ^ 0x79) - ((0x87 ^ 0xA2) << (" ".length() << " ".length())) + (0x23 ^ 0x6C);
            FastScanner.IIlIIIlIIl[32] = "   ".length() << (" ".length() << " ".length());
            FastScanner.IIlIIIlIIl[33] = "   ".length() << (" ".length() << (" ".length() << " ".length())) ^ (0x3B ^ 6);
            FastScanner.IIlIIIlIIl[34] = 0x69 ^ 0x66;
            FastScanner.IIlIIIlIIl[35] = ((0x2C ^ 0x39) << (" ".length() << " ".length()) ^ (0x54 ^ 9)) << "   ".length();
            FastScanner.IIlIIIlIIl[36] = 0x51 ^ 0x4E;
            FastScanner.IIlIIIlIIl[37] = " ".length() << (" ".length() << (" ".length() << " ".length()));
            FastScanner.IIlIIIlIIl[38] = ((0xB4 ^ 0x81) << " ".length() ^ (0xFC ^ 0x89)) << " ".length();
            FastScanner.IIlIIIlIIl[39] = ((0x4C ^ 0x6F) << " ".length() ^ 96 + 21 - 104 + 114) << " ".length();
            FastScanner.IIlIIIlIIl[40] = ((0x56 ^ 0x53) << "   ".length() ^ (0x2E ^ 0xD)) << "   ".length();
            FastScanner.IIlIIIlIIl[41] = 8 ^ 0x3D;
            FastScanner.IIlIIIlIIl[42] = (0xA8 ^ 0x9F) << " ".length() ^ 30 + 21 - 8 + 84;
            FastScanner.IIlIIIlIIl[43] = (0x68 ^ 0x5B ^ (0x30 ^ 0x2D) << " ".length()) << " ".length();
            FastScanner.IIlIIIlIIl[44] = (0x5F ^ 0x7E) << " ".length() ^ (0x7A ^ 0x2B);
            FastScanner.IIlIIIlIIl[45] = 0x1A ^ 0x3D ^ (0xC9 ^ 0xC0) << "   ".length();
            FastScanner.IIlIIIlIIl[46] = (0xC ^ 0x47) << " ".length();
            FastScanner.IIlIIIlIIl[47] = 156 + 104 - 84 + 3;
            FastScanner.IIlIIIlIIl[48] = (65 + 39 - 91 + 130 ^ (0x76 ^ 0x33) << " ".length()) << (" ".length() << " ".length());
            FastScanner.IIlIIIlIIl[49] = (0x15 ^ 0x7E) << " ".length() ^ 146 + 112 - 195 + 132;
            FastScanner.IIlIIIlIIl[50] = 118 + 19 - 93 + 141;
            FastScanner.IIlIIIlIIl[51] = (0xC7 ^ 0xA6) << " ".length();
            FastScanner.IIlIIIlIIl[52] = (0x11 ^ 0x14) << " ".length() ^ (0x24 ^ 0xD);
            FastScanner.IIlIIIlIIl[53] = (0xA0 ^ 0xAB) << " ".length();
            FastScanner.IIlIIIlIIl[54] = 0x2D ^ 0x3C ^ "   ".length() << " ".length();
            FastScanner.IIlIIIlIIl[55] = "   ".length() << "   ".length();
            FastScanner.IIlIIIlIIl[56] = 0x10 ^ 9;
            FastScanner.IIlIIIlIIl[57] = (0xB7 ^ 0xBA) << " ".length();
            FastScanner.IIlIIIlIIl[58] = (0xC1 ^ 0xBA) << " ".length();
            FastScanner.IIlIIIlIIl[59] = 6 + 79 - -33 + 59 + (0x22 ^ 0x55) - (135 + 113 - 215 + 110) + ((0x9D ^ 0x8A) << " ".length());
            FastScanner.IIlIIIlIIl[60] = 0x79 ^ 0x7C ^ (0x41 ^ 0x4E) << " ".length();
            FastScanner.IIlIIIlIIl[61] = 0x78 ^ 0x65;
        }

        private static boolean llllIIIIIIIl(int n, int n2) {
            return n == n2;
        }

        private static boolean lIIIlIIIIIIl(int n, int n2) {
            return n >= n2;
        }

        private static boolean IlllIIIIIIIl(int n, int n2) {
            return n < n2;
        }

        private static boolean IIllIIIIIIIl(int n, int n2) {
            return n <= n2;
        }

        private static boolean IlIlIIIIIIIl(int n) {
            return n != 0;
        }

        private static boolean IIIIlIIIIIIl(int n) {
            return n == 0;
        }

        private static boolean llIlIIIIIIIl(int n) {
            return n < 0;
        }

        private static boolean IlIIlIIIIIIl(int n) {
            return n <= 0;
        }

        private static boolean lIllIIIIIIIl(int n, int n2) {
            return n != n2;
        }
    }
}

