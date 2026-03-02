/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {
    private static int[] lIlllIIl;

    public Main() {
        Main IIllllIIIIIlIIl;
    }

    public static void main(String[] stringArray) {
        FastScanner IIIlllIIIIIlIIl = new FastScanner();
        int lllIllIIIIIlIIl = IIIlllIIIIIlIIl.nextInt();
        String IllIllIIIIIlIIl = IIIlllIIIIIlIIl.next();
        if (Main.lIIIlIIIIl(IllIllIIIIIlIIl.length(), lllIllIIIIIlIIl)) {
            System.out.println(IllIllIIIIIlIIl);
            "".length();
            if (" ".length() == -" ".length()) {
                return;
            }
        } else {
            System.out.println(IllIllIIIIIlIIl.substring(lIlllIIl[0], lllIllIIIIIlIIl) + "...");
        }
    }

    static {
        Main.IIIIlIIIIl();
    }

    private static void IIIIlIIIIl() {
        lIlllIIl = new int[1];
        Main.lIlllIIl[0] = (0xDE ^ 0x9D) & ~(0x1B ^ 0x58);
    }

    private static boolean lIIIlIIIIl(int n, int n2) {
        return n <= n2;
    }

    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[lllIlIIl[0]];
        private int ptr = lllIlIIl[1];
        private int buflen = lllIlIIl[1];
        private static int[] lllIlIIl;

        FastScanner() {
            FastScanner IlIllllIIIIlIIl;
        }

        private boolean hasNextByte() {
            FastScanner lllIlllIIIIlIIl;
            if (FastScanner.lIIllllll(lllIlllIIIIlIIl.ptr, lllIlllIIIIlIIl.buflen)) {
                return lllIlIIl[2];
            }
            lllIlllIIIIlIIl.ptr = lllIlIIl[1];
            try {
                lllIlllIIIIlIIl.buflen = lllIlllIIIIlIIl.in.read(lllIlllIIIIlIIl.buffer);
                "".length();
            }
            catch (IOException IllIlllIIIIlIIl) {
                IllIlllIIIIlIIl.printStackTrace();
            }
            if (((0x28 ^ 0x3D ^ (0x57 ^ 0x6C) << " ".length()) & ((0x63 ^ 0x42) << " ".length() ^ (0x19 ^ 0x38) ^ -" ".length())) == " ".length() << (" ".length() << " ".length())) {
                return ((0x37 ^ 4 ^ (0x87 ^ 0xB6) << " ".length()) & ((0x18 ^ 0x17) << (" ".length() << (" ".length() << " ".length())) ^ 61 + 105 - 164 + 159 ^ -" ".length())) != 0;
            }
            if (FastScanner.lllllllll(lllIlllIIIIlIIl.buflen)) {
                return lllIlIIl[1];
            }
            return lllIlIIl[2];
        }

        private int readByte() {
            FastScanner IIlIlllIIIIlIIl;
            if (FastScanner.IIIIIIIIIl(IIlIlllIIIIlIIl.hasNextByte() ? 1 : 0)) {
                int n = IIlIlllIIIIlIIl.ptr;
                IIlIlllIIIIlIIl.ptr = n + lllIlIIl[2];
                return IIlIlllIIIIlIIl.buffer[n];
            }
            return lllIlIIl[3];
        }

        private static boolean isPrintableChar(int IlIIlllIIIIlIIl) {
            int n;
            if (FastScanner.IlIIIIIIIl(lllIlIIl[4], IlIIlllIIIIlIIl) && FastScanner.IlIIIIIIIl(IlIIlllIIIIlIIl, lllIlIIl[5])) {
                n = lllIlIIl[2];
                "".length();
                if (-"  ".length() > 0) {
                    return ((9 ^ 0x3E ^ (0x8A ^ 0x8D) << "   ".length()) << " ".length() & (((0x5A ^ 0x4D) << " ".length() ^ (0x5F ^ 0x7E)) << " ".length() ^ -" ".length())) != 0;
                }
            } else {
                n = lllIlIIl[1];
            }
            return n != 0;
        }

        public boolean hasNext() {
            FastScanner IIIIlllIIIIlIIl;
            while (FastScanner.IIIIIIIIIl(IIIIlllIIIIlIIl.hasNextByte() ? 1 : 0) && FastScanner.lIlIIIIIIl(FastScanner.isPrintableChar(IIIIlllIIIIlIIl.buffer[IIIIlllIIIIlIIl.ptr]) ? 1 : 0)) {
                IIIIlllIIIIlIIl.ptr += lllIlIIl[2];
                "".length();
                if (null == null) continue;
                return (((0xFF ^ 0xB4) << " ".length() ^ 71 + 24 - -21 + 25) & (97 + 104 - 62 + 12 ^ (0x46 ^ 0x65) << (" ".length() << " ".length()) ^ -" ".length())) != 0;
            }
            return this.hasNextByte();
        }

        /*
         * WARNING - void declaration
         */
        public String next() {
            void var1_1;
            FastScanner IIllIllIIIIlIIl;
            if (FastScanner.lIlIIIIIIl(IIllIllIIIIlIIl.hasNext() ? 1 : 0)) {
                throw new NoSuchElementException();
            }
            StringBuilder llIlIllIIIIlIIl = new StringBuilder();
            int IlIlIllIIIIlIIl = IIllIllIIIIlIIl.readByte();
            while (FastScanner.IIIIIIIIIl(FastScanner.isPrintableChar(IlIlIllIIIIlIIl) ? 1 : 0)) {
                llIlIllIIIIlIIl.appendCodePoint(IlIlIllIIIIlIIl);
                "".length();
                IlIlIllIIIIlIIl = IIllIllIIIIlIIl.readByte();
                "".length();
                if (null == null) continue;
                return null;
            }
            return String.valueOf(var1_1);
        }

        public long nextLong() {
            FastScanner lIlIIllIIIIlIIl;
            if (FastScanner.lIlIIIIIIl(lIlIIllIIIIlIIl.hasNext() ? 1 : 0)) {
                throw new NoSuchElementException();
            }
            long IIlIIllIIIIlIIl = 0L;
            int llIIIllIIIIlIIl = lllIlIIl[1];
            int IlIIIllIIIIlIIl = lIlIIllIIIIlIIl.readByte();
            if (FastScanner.lllIIIIIIl(IlIIIllIIIIlIIl, lllIlIIl[6])) {
                llIIIllIIIIlIIl = lllIlIIl[2];
                IlIIIllIIIIlIIl = lIlIIllIIIIlIIl.readByte();
            }
            if (!FastScanner.IIIlIIIIIl(IlIIIllIIIIlIIl, lllIlIIl[7]) || FastScanner.lIIllllll(lllIlIIl[8], IlIIIllIIIIlIIl)) {
                throw new NumberFormatException();
            }
            do {
                if (FastScanner.IlIIIIIIIl(lllIlIIl[7], IlIIIllIIIIlIIl) && FastScanner.IlIIIIIIIl(IlIIIllIIIIlIIl, lllIlIIl[8])) {
                    IIlIIllIIIIlIIl *= 10L;
                    IIlIIllIIIIlIIl += (long)(IlIIIllIIIIlIIl - lllIlIIl[7]);
                    "".length();
                    if ("   ".length() != "   ".length()) {
                        return 0L;
                    }
                } else {
                    if (!FastScanner.lIIlIIIIIl(IlIIIllIIIIlIIl, lllIlIIl[3]) || FastScanner.lIlIIIIIIl(FastScanner.isPrintableChar(IlIIIllIIIIlIIl) ? 1 : 0)) {
                        long l;
                        if (FastScanner.IIIIIIIIIl(llIIIllIIIIlIIl)) {
                            l = -IIlIIllIIIIlIIl;
                            "".length();
                            if (" ".length() <= -" ".length()) {
                                return 0L;
                            }
                        } else {
                            l = IIlIIllIIIIlIIl;
                        }
                        return l;
                    }
                    throw new NumberFormatException();
                }
                int n = this.readByte();
                "".length();
            } while (" ".length() << " ".length() != 0);
            return 0L;
        }

        /*
         * WARNING - void declaration
         */
        public int nextInt() {
            void var1_1;
            FastScanner lllllIlIIIIlIIl;
            long IllllIlIIIIlIIl = lllllIlIIIIlIIl.nextLong();
            if (!FastScanner.llIlIIIIIl(FastScanner.IlIlIIIIIl(IllllIlIIIIlIIl, Integer.MIN_VALUE)) || FastScanner.IIllIIIIIl(FastScanner.IlIlIIIIIl(IllllIlIIIIlIIl, Integer.MAX_VALUE))) {
                throw new NumberFormatException();
            }
            return (int)var1_1;
        }

        public double nextDouble() {
            FastScanner IIlllIlIIIIlIIl;
            return Double.parseDouble(IIlllIlIIIIlIIl.next());
        }

        static {
            FastScanner.IIIllllll();
        }

        private static void IIIllllll() {
            lllIlIIl = new int[9];
            FastScanner.lllIlIIl[0] = " ".length() << (("   ".length() ^ "   ".length() << " ".length()) << " ".length());
            FastScanner.lllIlIIl[1] = " ".length() << ("   ".length() << " ".length()) & ~(" ".length() << ("   ".length() << " ".length()));
            FastScanner.lllIlIIl[2] = " ".length();
            FastScanner.lllIlIIl[3] = -" ".length();
            FastScanner.lllIlIIl[4] = 0xB1 ^ 0x90;
            FastScanner.lllIlIIl[5] = (0xC ^ 0x33) << " ".length();
            FastScanner.lllIlIIl[6] = 49 + 121 - 51 + 16 ^ (0x14 ^ 0x41) << " ".length();
            FastScanner.lllIlIIl[7] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
            FastScanner.lllIlIIl[8] = 0x9B ^ 0xA2;
        }

        private static boolean lllIIIIIIl(int n, int n2) {
            return n == n2;
        }

        private static boolean IIIlIIIIIl(int n, int n2) {
            return n >= n2;
        }

        private static boolean lIIllllll(int n, int n2) {
            return n < n2;
        }

        private static boolean IlIIIIIIIl(int n, int n2) {
            return n <= n2;
        }

        private static boolean IIIIIIIIIl(int n) {
            return n != 0;
        }

        private static boolean lIlIIIIIIl(int n) {
            return n == 0;
        }

        private static boolean llIlIIIIIl(int n) {
            return n >= 0;
        }

        private static boolean lllllllll(int n) {
            return n <= 0;
        }

        private static boolean IIllIIIIIl(int n) {
            return n > 0;
        }

        private static boolean lIIlIIIIIl(int n, int n2) {
            return n != n2;
        }

        private static int IlIlIIIIIl(long l, long l2) {
            return l == l2 ? 0 : (l < l2 ? -1 : 1);
        }
    }
}

