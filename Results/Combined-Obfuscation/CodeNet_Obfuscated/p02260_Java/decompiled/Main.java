/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.NoSuchElementException;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Main {
    private static String[] lllllIIIl;
    private static int[] IlIIIlIIl;

    public Main() {
        Main IlIIllIIlIIlll;
    }

    public static void main(String[] stringArray) {
        FastScanner IlIlIlIIlIIlll = new FastScanner();
        int lIIlIlIIlIIlll = IlIlIlIIlIIlll.nextInt();
        int[] IIIlIlIIlIIlll = new int[lIIlIlIIlIIlll];
        int lllIIlIIlIIlll = IlIIIlIIl[0];
        int IllIIlIIlIIlll = IlIIIlIIl[0];
        while (Main.llIIlIllll(IllIIlIIlIIlll, lIIlIlIIlIIlll)) {
            IIIlIlIIlIIlll[IllIIlIIlIIlll] = IlIlIlIIlIIlll.nextInt();
            ++IllIIlIIlIIlll;
            "".length();
            if (" ".length() << (" ".length() << " ".length()) == " ".length() << (" ".length() << " ".length())) continue;
            return;
        }
        IllIIlIIlIIlll = IlIIIlIIl[0];
        while (Main.llIIlIllll(IllIIlIIlIIlll, lIIlIlIIlIIlll)) {
            int lIlIIlIIlIIlll = IllIIlIIlIIlll;
            int IIlIIlIIlIIlll = IllIIlIIlIIlll;
            while (Main.llIIlIllll(IIlIIlIIlIIlll, lIIlIlIIlIIlll)) {
                if (Main.llIIlIllll(IIIlIlIIlIIlll[IIlIIlIIlIIlll], IIIlIlIIlIIlll[lIlIIlIIlIIlll])) {
                    lIlIIlIIlIIlll = IIlIIlIIlIIlll;
                }
                ++IIlIIlIIlIIlll;
                "".length();
                if (-"   ".length() < 0) continue;
                return;
            }
            if (Main.IIlIlIllll(IIIlIlIIlIIlll[IllIIlIIlIIlll], IIIlIlIIlIIlll[lIlIIlIIlIIlll])) {
                ++lllIIlIIlIIlll;
            }
            IIlIIlIIlIIlll = IIIlIlIIlIIlll[IllIIlIIlIIlll];
            IIIlIlIIlIIlll[IllIIlIIlIIlll] = IIIlIlIIlIIlll[lIlIIlIIlIIlll];
            IIIlIlIIlIIlll[lIlIIlIIlIIlll] = IIlIIlIIlIIlll;
            ++IllIIlIIlIIlll;
            "".length();
            if (" ".length() == " ".length()) continue;
            return;
        }
        System.out.println(Main.parseArray(IIIlIlIIlIIlll));
        System.out.println(lllIIlIIlIIlll);
    }

    /*
     * WARNING - void declaration
     */
    static String parseArray(int[] IIIIIlIIlIIlll) {
        void var1_1;
        StringBuilder lllllIIIlIIlll = new StringBuilder();
        int IllllIIIlIIlll = IlIIIlIIl[0];
        while (Main.llIIlIllll(IllllIIIlIIlll, IIIIIlIIlIIlll.length)) {
            if (Main.lIlIlIllll(IllllIIIlIIlll)) {
                lllllIIIlIIlll.append(lllllIIIl[IlIIIlIIl[0]]);
                "".length();
            }
            lllllIIIlIIlll.append(IIIIIlIIlIIlll[IllllIIIlIIlll]);
            "".length();
            ++IllllIIIlIIlll;
            "".length();
            if ("   ".length() != 0) continue;
            return null;
        }
        return String.valueOf(var1_1);
    }

    static {
        Main.IlIIlIllll();
        Main.lIIIlIllll();
    }

    private static void lIIIlIllll() {
        lllllIIIl = new String[IlIIIlIIl[1]];
        Main.lllllIIIl[Main.IlIIIlIIl[0]] = Main.IIlIIIllll("7QeALyeigfU=", "jYdBI");
    }

    private static String IIlIIIllll(String lIIllIIIlIIlll, String IIIllIIIlIIlll) {
        try {
            SecretKeySpec lllIlIIIlIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IIIllIIIlIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher IllIlIIIlIIlll = Cipher.getInstance("Blowfish");
            IllIlIIIlIIlll.init(IlIIIlIIl[2], lllIlIIIlIIlll);
            return new String(IllIlIIIlIIlll.doFinal(Base64.getDecoder().decode(lIIllIIIlIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIlIIIlIIlll) {
            lIlIlIIIlIIlll.printStackTrace();
            return null;
        }
    }

    private static void IlIIlIllll() {
        IlIIIlIIl = new int[3];
        Main.IlIIIlIIl[0] = (0x20 ^ 0x35) & ~(0x34 ^ 0x21);
        Main.IlIIIlIIl[1] = " ".length();
        Main.IlIIIlIIl[2] = " ".length() << " ".length();
    }

    private static boolean llIIlIllll(int n, int n2) {
        return n < n2;
    }

    private static boolean lIlIlIllll(int n) {
        return n > 0;
    }

    private static boolean IIlIlIllll(int n, int n2) {
        return n != n2;
    }

    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[lIIIIlIIl[0]];
        private int ptr = lIIIIlIIl[1];
        private int buflen = lIIIIlIIl[1];
        private static int[] lIIIIlIIl;

        FastScanner() {
            FastScanner IIIIlllIlIIlll;
        }

        private boolean hasNextByte() {
            FastScanner lIllIllIlIIlll;
            if (FastScanner.IllIIIllll(lIllIllIlIIlll.ptr, lIllIllIlIIlll.buflen)) {
                return lIIIIlIIl[2];
            }
            lIllIllIlIIlll.ptr = lIIIIlIIl[1];
            try {
                lIllIllIlIIlll.buflen = lIllIllIlIIlll.in.read(lIllIllIlIIlll.buffer);
                "".length();
            }
            catch (IOException IIllIllIlIIlll) {
                IIllIllIlIIlll.printStackTrace();
            }
            if (-" ".length() > " ".length()) {
                return ((9 ^ 0x5C) & ~(0x23 ^ 0x76)) != 0;
            }
            if (FastScanner.lllIIIllll(lIllIllIlIIlll.buflen)) {
                return lIIIIlIIl[1];
            }
            return lIIIIlIIl[2];
        }

        private int readByte() {
            FastScanner IlIlIllIlIIlll;
            if (FastScanner.IIIlIIllll(IlIlIllIlIIlll.hasNextByte() ? 1 : 0)) {
                int n = IlIlIllIlIIlll.ptr;
                IlIlIllIlIIlll.ptr = n + lIIIIlIIl[2];
                return IlIlIllIlIIlll.buffer[n];
            }
            return lIIIIlIIl[3];
        }

        private static boolean isPrintableChar(int IIIlIllIlIIlll) {
            int n;
            if (FastScanner.lIIlIIllll(lIIIIlIIl[4], IIIlIllIlIIlll) && FastScanner.lIIlIIllll(IIIlIllIlIIlll, lIIIIlIIl[5])) {
                n = lIIIIlIIl[2];
                "".length();
                if (" ".length() <= 0) {
                    return ("   ".length() & ("   ".length() ^ -" ".length())) != 0;
                }
            } else {
                n = lIIIIlIIl[1];
            }
            return n != 0;
        }

        public boolean hasNext() {
            FastScanner IllIIllIlIIlll;
            while (FastScanner.IIIlIIllll(IllIIllIlIIlll.hasNextByte() ? 1 : 0) && FastScanner.IlIlIIllll(FastScanner.isPrintableChar(IllIIllIlIIlll.buffer[IllIIllIlIIlll.ptr]) ? 1 : 0)) {
                IllIIllIlIIlll.ptr += lIIIIlIIl[2];
                "".length();
                if (" ".length() << " ".length() == " ".length() << " ".length()) continue;
                return (((0xA8 ^ 0x9D) & ~(0x9C ^ 0xA9) ^ (0xF ^ 0xA)) & (99 + 52 - 84 + 66 ^ " ".length() << (0x95 ^ 0x92) ^ -" ".length())) != 0;
            }
            return this.hasNextByte();
        }

        /*
         * WARNING - void declaration
         */
        public String next() {
            void var1_1;
            FastScanner IlIIIllIlIIlll;
            if (FastScanner.IlIlIIllll(IlIIIllIlIIlll.hasNext() ? 1 : 0)) {
                throw new NoSuchElementException();
            }
            StringBuilder lIIIIllIlIIlll = new StringBuilder();
            int IIIIIllIlIIlll = IlIIIllIlIIlll.readByte();
            while (FastScanner.IIIlIIllll(FastScanner.isPrintableChar(IIIIIllIlIIlll) ? 1 : 0)) {
                lIIIIllIlIIlll.appendCodePoint(IIIIIllIlIIlll);
                "".length();
                IIIIIllIlIIlll = IlIIIllIlIIlll.readByte();
                "".length();
                if (null == null) continue;
                return null;
            }
            return String.valueOf(var1_1);
        }

        public long nextLong() {
            FastScanner llIllIlIlIIlll;
            if (FastScanner.IlIlIIllll(llIllIlIlIIlll.hasNext() ? 1 : 0)) {
                throw new NoSuchElementException();
            }
            long IlIllIlIlIIlll = 0L;
            int lIIllIlIlIIlll = lIIIIlIIl[1];
            int IIIllIlIlIIlll = llIllIlIlIIlll.readByte();
            if (FastScanner.llIlIIllll(IIIllIlIlIIlll, lIIIIlIIl[6])) {
                lIIllIlIlIIlll = lIIIIlIIl[2];
                IIIllIlIlIIlll = llIllIlIlIIlll.readByte();
            }
            if (!FastScanner.IIllIIllll(IIIllIlIlIIlll, lIIIIlIIl[7]) || FastScanner.IllIIIllll(lIIIIlIIl[8], IIIllIlIlIIlll)) {
                throw new NumberFormatException();
            }
            do {
                if (FastScanner.lIIlIIllll(lIIIIlIIl[7], IIIllIlIlIIlll) && FastScanner.lIIlIIllll(IIIllIlIlIIlll, lIIIIlIIl[8])) {
                    IlIllIlIlIIlll *= 10L;
                    IlIllIlIlIIlll += (long)(IIIllIlIlIIlll - lIIIIlIIl[7]);
                    "".length();
                    if (null != null) {
                        return 0L;
                    }
                } else {
                    if (!FastScanner.lIllIIllll(IIIllIlIlIIlll, lIIIIlIIl[3]) || FastScanner.IlIlIIllll(FastScanner.isPrintableChar(IIIllIlIlIIlll) ? 1 : 0)) {
                        long l;
                        if (FastScanner.IIIlIIllll(lIIllIlIlIIlll)) {
                            l = -IlIllIlIlIIlll;
                            "".length();
                            if (" ".length() << " ".length() < " ".length()) {
                                return 0L;
                            }
                        } else {
                            l = IlIllIlIlIIlll;
                        }
                        return l;
                    }
                    throw new NumberFormatException();
                }
                int n = this.readByte();
                "".length();
            } while (" ".length() << (" ".length() << " ".length()) >= " ".length());
            return 0L;
        }

        /*
         * WARNING - void declaration
         */
        public int nextInt() {
            void var1_1;
            FastScanner lIlIlIlIlIIlll;
            long IIlIlIlIlIIlll = lIlIlIlIlIIlll.nextLong();
            if (!FastScanner.llllIIllll(FastScanner.IlllIIllll(IIlIlIlIlIIlll, Integer.MIN_VALUE)) || FastScanner.IIIIlIllll(FastScanner.IlllIIllll(IIlIlIlIlIIlll, Integer.MAX_VALUE))) {
                throw new NumberFormatException();
            }
            return (int)var1_1;
        }

        public double nextDouble() {
            FastScanner IlIIlIlIlIIlll;
            return Double.parseDouble(IlIIlIlIlIIlll.next());
        }

        static {
            FastScanner.lIlIIIllll();
        }

        private static void lIlIIIllll() {
            lIIIIlIIl = new int[9];
            FastScanner.lIIIIlIIl[0] = " ".length() << ((11 + 115 - 32 + 69 ^ (0xFD ^ 0xAE) << " ".length()) << " ".length());
            FastScanner.lIIIIlIIl[1] = (0x66 ^ 0x77) << (" ".length() << " ".length()) & ~((0x70 ^ 0x61) << (" ".length() << " ".length()));
            FastScanner.lIIIIlIIl[2] = " ".length();
            FastScanner.lIIIIlIIl[3] = -" ".length();
            FastScanner.lIIIIlIIl[4] = 0x49 ^ 0x28 ^ " ".length() << ("   ".length() << " ".length());
            FastScanner.lIIIIlIIl[5] = (0x2A ^ 0x15) << " ".length();
            FastScanner.lIIIIlIIl[6] = 0x1B ^ 0x36;
            FastScanner.lIIIIlIIl[7] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
            FastScanner.lIIIIlIIl[8] = (0x17 ^ 0x30) << " ".length() ^ (0x51 ^ 0x26);
        }

        private static boolean llIlIIllll(int n, int n2) {
            return n == n2;
        }

        private static boolean IIllIIllll(int n, int n2) {
            return n >= n2;
        }

        private static boolean IllIIIllll(int n, int n2) {
            return n < n2;
        }

        private static boolean lIIlIIllll(int n, int n2) {
            return n <= n2;
        }

        private static boolean IIIlIIllll(int n) {
            return n != 0;
        }

        private static boolean IlIlIIllll(int n) {
            return n == 0;
        }

        private static boolean llllIIllll(int n) {
            return n >= 0;
        }

        private static boolean lllIIIllll(int n) {
            return n <= 0;
        }

        private static boolean IIIIlIllll(int n) {
            return n > 0;
        }

        private static boolean lIllIIllll(int n, int n2) {
            return n != n2;
        }

        private static int IlllIIllll(long l, long l2) {
            return l == l2 ? 0 : (l < l2 ? -1 : 1);
        }
    }
}

