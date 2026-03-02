/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class Main {
    private static int[] IlllllIll;

    public Main() {
        Main lllllIIIlIlIIl;
    }

    public static void main(String[] stringArray) {
        FastScanner IIIllIIIlIlIIl = new FastScanner();
        PrintWriter lllIlIIIlIlIIl = new PrintWriter(System.out);
        int IllIlIIIlIlIIl = IIIllIIIlIlIIl.nextInt();
        int lIlIlIIIlIlIIl = IIIllIIIlIlIIl.nextInt();
        int IIlIlIIIlIlIIl = IlllllIll[0];
        int llIIlIIIlIlIIl = IlllllIll[1];
        while (Main.IlllIlIIIll(IIlIlIIIlIlIIl, lIlIlIIIlIlIIl)) {
            IIlIlIIIlIlIIl += IllIlIIIlIlIIl - IlllllIll[0];
            ++llIIlIIIlIlIIl;
            "".length();
            if (-((0x2C ^ 0x25) << (" ".length() << (" ".length() << " ".length())) ^ 15 + 77 - -12 + 45) < 0) continue;
            return;
        }
        lllIlIIIlIlIIl.println(llIIlIIIlIlIIl);
        lllIlIIIlIlIIl.close();
    }

    static {
        Main.llIlIlIIIll();
    }

    private static void llIlIlIIIll() {
        IlllllIll = new int[2];
        Main.IlllllIll[0] = " ".length();
        Main.IlllllIll[1] = ((0x3E ^ 0xF) << " ".length() ^ (0x36 ^ 0x47)) << (" ".length() << " ".length()) & ((0xB ^ 0x28 ^ "   ".length() << (" ".length() << (" ".length() << " ".length()))) << (" ".length() << " ".length()) ^ -" ".length());
    }

    private static boolean IlllIlIIIll(int n, int n2) {
        return n < n2;
    }

    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[IIIIIIlll[0]];
        private int ptr = IIIIIIlll[1];
        private int buflen = IIIIIIlll[1];
        private static int[] IIIIIIlll;

        FastScanner() {
            FastScanner lIllIIIIlIlIIl;
        }

        private boolean hasNextByte() {
            FastScanner IlIlIIIIlIlIIl;
            if (FastScanner.lIllIlIIIll(IlIlIIIIlIlIIl.ptr, IlIlIIIIlIlIIl.buflen)) {
                return IIIIIIlll[2];
            }
            IlIlIIIIlIlIIl.ptr = IIIIIIlll[1];
            try {
                IlIlIIIIlIlIIl.buflen = IlIlIIIIlIlIIl.in.read(IlIlIIIIlIlIIl.buffer);
                "".length();
            }
            catch (IOException lIIlIIIIlIlIIl) {
                lIIlIIIIlIlIIl.printStackTrace();
            }
            if (-(0x29 ^ 0x2C) >= 0) {
                return ("   ".length() << (" ".length() << " ".length()) & ~("   ".length() << (" ".length() << " ".length()))) != 0;
            }
            if (FastScanner.llllIlIIIll(IlIlIIIIlIlIIl.buflen)) {
                return IIIIIIlll[1];
            }
            return IIIIIIlll[2];
        }

        private int readByte() {
            FastScanner lllIIIIIlIlIIl;
            if (FastScanner.IIIIllIIIll(lllIIIIIlIlIIl.hasNextByte() ? 1 : 0)) {
                int n = lllIIIIIlIlIIl.ptr;
                lllIIIIIlIlIIl.ptr = n + IIIIIIlll[2];
                return lllIIIIIlIlIIl.buffer[n];
            }
            return IIIIIIlll[3];
        }

        private static boolean isPrintableChar(int lIlIIIIIlIlIIl) {
            int n;
            if (FastScanner.lIIIllIIIll(IIIIIIlll[4], lIlIIIIIlIlIIl) && FastScanner.lIIIllIIIll(lIlIIIIIlIlIIl, IIIIIIlll[5])) {
                n = IIIIIIlll[2];
                "".length();
                if (" ".length() << " ".length() != " ".length() << " ".length()) {
                    return ((0x7B ^ 0x36) & ~(8 ^ 0x45)) != 0;
                }
            } else {
                n = IIIIIIlll[1];
            }
            return n != 0;
        }

        public boolean hasNext() {
            FastScanner llIIIIIIlIlIIl;
            while (FastScanner.IIIIllIIIll(llIIIIIIlIlIIl.hasNextByte() ? 1 : 0) && FastScanner.IlIIllIIIll(FastScanner.isPrintableChar(llIIIIIIlIlIIl.buffer[llIIIIIIlIlIIl.ptr]) ? 1 : 0)) {
                llIIIIIIlIlIIl.ptr += IIIIIIlll[2];
                "".length();
                if (" ".length() << " ".length() <= "   ".length()) continue;
                return ((0xCF ^ 0x9E ^ (0x5A ^ 0x4D) << (" ".length() << " ".length())) << (" ".length() << " ".length()) & ((0x4B ^ 0x30 ^ (0xB ^ 0x30) << " ".length()) << (" ".length() << " ".length()) ^ -" ".length())) != 0;
            }
            return this.hasNextByte();
        }

        /*
         * WARNING - void declaration
         */
        public String next() {
            void var1_1;
            FastScanner llllllllIIlIIl;
            if (FastScanner.IlIIllIIIll(llllllllIIlIIl.hasNext() ? 1 : 0)) {
                throw new NoSuchElementException();
            }
            StringBuilder IlllllllIIlIIl = new StringBuilder();
            int lIllllllIIlIIl = llllllllIIlIIl.readByte();
            while (FastScanner.IIIIllIIIll(FastScanner.isPrintableChar(lIllllllIIlIIl) ? 1 : 0)) {
                IlllllllIIlIIl.appendCodePoint(lIllllllIIlIIl);
                "".length();
                lIllllllIIlIIl = llllllllIIlIIl.readByte();
                "".length();
                if ("   ".length() < " ".length() << (" ".length() << " ".length())) continue;
                return null;
            }
            return String.valueOf(var1_1);
        }

        public long nextLong() {
            FastScanner IIIlllllIIlIIl;
            if (FastScanner.IlIIllIIIll(IIIlllllIIlIIl.hasNext() ? 1 : 0)) {
                throw new NoSuchElementException();
            }
            long lllIllllIIlIIl = 0L;
            int IllIllllIIlIIl = IIIIIIlll[1];
            int lIlIllllIIlIIl = IIIlllllIIlIIl.readByte();
            if (FastScanner.llIIllIIIll(lIlIllllIIlIIl, IIIIIIlll[6])) {
                IllIllllIIlIIl = IIIIIIlll[2];
                lIlIllllIIlIIl = IIIlllllIIlIIl.readByte();
            }
            if (!FastScanner.IIlIllIIIll(lIlIllllIIlIIl, IIIIIIlll[7]) || FastScanner.lIllIlIIIll(IIIIIIlll[8], lIlIllllIIlIIl)) {
                throw new NumberFormatException();
            }
            do {
                if (FastScanner.lIIIllIIIll(IIIIIIlll[7], lIlIllllIIlIIl) && FastScanner.lIIIllIIIll(lIlIllllIIlIIl, IIIIIIlll[8])) {
                    lllIllllIIlIIl *= 10L;
                    lllIllllIIlIIl += (long)(lIlIllllIIlIIl - IIIIIIlll[7]);
                    "".length();
                    if ("   ".length() <= 0) {
                        return 0L;
                    }
                } else {
                    if (!FastScanner.lIlIllIIIll(lIlIllllIIlIIl, IIIIIIlll[3]) || FastScanner.IlIIllIIIll(FastScanner.isPrintableChar(lIlIllllIIlIIl) ? 1 : 0)) {
                        long l;
                        if (FastScanner.IIIIllIIIll(IllIllllIIlIIl)) {
                            l = -lllIllllIIlIIl;
                            "".length();
                            if (("   ".length() << " ".length() & ~("   ".length() << " ".length())) != 0) {
                                return 0L;
                            }
                        } else {
                            l = lllIllllIIlIIl;
                        }
                        return l;
                    }
                    throw new NumberFormatException();
                }
                int n = this.readByte();
                "".length();
            } while ((0x7F ^ 0x7A) != 0);
            return 0L;
        }

        /*
         * WARNING - void declaration
         */
        public int nextInt() {
            void var1_1;
            FastScanner IlIIllllIIlIIl;
            long lIIIllllIIlIIl = IlIIllllIIlIIl.nextLong();
            if (!FastScanner.lllIllIIIll(FastScanner.IllIllIIIll(lIIIllllIIlIIl, Integer.MIN_VALUE)) || FastScanner.IIIlllIIIll(FastScanner.IllIllIIIll(lIIIllllIIlIIl, Integer.MAX_VALUE))) {
                throw new NumberFormatException();
            }
            return (int)var1_1;
        }

        public double nextDouble() {
            FastScanner llllIlllIIlIIl;
            return Double.parseDouble(llllIlllIIlIIl.next());
        }

        static {
            FastScanner.IIllIlIIIll();
        }

        private static void IIllIlIIIll() {
            IIIIIIlll = new int[9];
            FastScanner.IIIIIIlll[0] = " ".length() << ((0xB5 ^ 0xB0) << " ".length());
            FastScanner.IIIIIIlll[1] = ((0x62 ^ 0x6D) << " ".length() & ~((0x1D ^ 0x12) << " ".length()) ^ (0xE2 ^ 0xB7)) & ((0x50 ^ 0x79) << " ".length() ^ (0xC2 ^ 0xC5) ^ -" ".length());
            FastScanner.IIIIIIlll[2] = " ".length();
            FastScanner.IIIIIIlll[3] = -" ".length();
            FastScanner.IIIIIIlll[4] = (0x5E ^ 0x61) << " ".length() ^ (0x61 ^ 0x3E);
            FastScanner.IIIIIIlll[5] = (0x8B ^ 0xB4) << " ".length();
            FastScanner.IIIIIIlll[6] = 0xFD ^ 0xA2 ^ (0x63 ^ 0x5A) << " ".length();
            FastScanner.IIIIIIlll[7] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
            FastScanner.IIIIIIlll[8] = (0x99 ^ 0xB0) << " ".length() ^ (0x42 ^ 0x29);
        }

        private static boolean llIIllIIIll(int n, int n2) {
            return n == n2;
        }

        private static boolean IIlIllIIIll(int n, int n2) {
            return n >= n2;
        }

        private static boolean lIllIlIIIll(int n, int n2) {
            return n < n2;
        }

        private static boolean lIIIllIIIll(int n, int n2) {
            return n <= n2;
        }

        private static boolean IIIIllIIIll(int n) {
            return n != 0;
        }

        private static boolean IlIIllIIIll(int n) {
            return n == 0;
        }

        private static boolean lllIllIIIll(int n) {
            return n >= 0;
        }

        private static boolean llllIlIIIll(int n) {
            return n <= 0;
        }

        private static boolean IIIlllIIIll(int n) {
            return n > 0;
        }

        private static boolean lIlIllIIIll(int n, int n2) {
            return n != n2;
        }

        private static int IllIllIIIll(long l, long l2) {
            return l == l2 ? 0 : (l < l2 ? -1 : 1);
        }
    }
}

