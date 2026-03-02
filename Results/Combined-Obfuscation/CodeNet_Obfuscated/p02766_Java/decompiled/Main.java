/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class Main {
    private static int[] IllIllIIll;

    public Main() {
        Main lIIllIlllIIIlll;
    }

    public static void main(String[] stringArray) {
        InputStream llIIlIlllIIIlll = System.in;
        PrintStream IlIIlIlllIIIlll = System.out;
        Scanner lIIIlIlllIIIlll = new Scanner(llIIlIlllIIIlll);
        PrintWriter IIIIlIlllIIIlll = new PrintWriter(IlIIlIlllIIIlll);
        BDigits llllIIlllIIIlll = new BDigits();
        llllIIlllIIIlll.solve(IllIllIIll[0], lIIIlIlllIIIlll, IIIIlIlllIIIlll);
        IIIIlIlllIIIlll.close();
    }

    static {
        Main.IIIIllIlllIl();
    }

    private static void IIIIllIlllIl() {
        IllIllIIll = new int[1];
        Main.IllIllIIll[0] = " ".length();
    }

    static class Scanner {
        private final InputStream in;
        private final byte[] buffer;
        private int ptr;
        private int buflen;
        private static int[] IlIlllIIll;

        public Scanner(InputStream llIIllIllIIIlll) {
            Scanner IIlIllIllIIIlll;
            IIlIllIllIIIlll.in = llIIllIllIIIlll;
            IIlIllIllIIIlll.buffer = new byte[IlIlllIIll[0]];
            IIlIllIllIIIlll.ptr = IlIlllIIll[1];
            IIlIllIllIIIlll.buflen = IlIlllIIll[1];
        }

        private boolean hasNextByte() {
            Scanner IIIIllIllIIIlll;
            if (Scanner.IIlIllIlllIl(IIIIllIllIIIlll.ptr, IIIIllIllIIIlll.buflen)) {
                return IlIlllIIll[2];
            }
            IIIIllIllIIIlll.ptr = IlIlllIIll[1];
            try {
                IIIIllIllIIIlll.buflen = IIIIllIllIIIlll.in.read(IIIIllIllIIIlll.buffer);
                "".length();
            }
            catch (IOException llllIlIllIIIlll) {
                llllIlIllIIIlll.printStackTrace();
            }
            if (" ".length() >= " ".length() << " ".length()) {
                return ((0x99 ^ 0xAC) & ~(0xB1 ^ 0x84)) != 0;
            }
            if (Scanner.lIlIllIlllIl(IIIIllIllIIIlll.buflen)) {
                return IlIlllIIll[1];
            }
            return IlIlllIIll[2];
        }

        private byte readByte() {
            Scanner lIllIlIllIIIlll;
            if (Scanner.IllIllIlllIl(lIllIlIllIIIlll.hasNextByte() ? 1 : 0)) {
                int n = lIllIlIllIIIlll.ptr;
                lIllIlIllIIIlll.ptr = n + IlIlllIIll[2];
                return lIllIlIllIIIlll.buffer[n];
            }
            return IlIlllIIll[3];
        }

        private boolean isPrintableChar(byte llIlIlIllIIIlll) {
            int n;
            if (Scanner.lllIllIlllIl(IlIlllIIll[4], llIlIlIllIIIlll) && Scanner.lllIllIlllIl(llIlIlIllIIIlll, IlIlllIIll[5])) {
                n = IlIlllIIll[2];
                "".length();
                if (-"  ".length() > 0) {
                    return ((84 + 90 - 62 + 17 ^ (0x64 ^ 0x2D) << " ".length()) & (0x1C ^ 0x75 ^ (0xB9 ^ 0x84) << " ".length() ^ -" ".length())) != 0;
                }
            } else {
                n = IlIlllIIll[1];
            }
            return n != 0;
        }

        private void skipUnprintable() {
            Scanner lIIlIlIllIIIlll;
            while (Scanner.IllIllIlllIl(lIIlIlIllIIIlll.hasNextByte() ? 1 : 0) && Scanner.IIIlllIlllIl(lIIlIlIllIIIlll.isPrintableChar(lIIlIlIllIIIlll.buffer[lIIlIlIllIIIlll.ptr]) ? 1 : 0)) {
                lIIlIlIllIIIlll.ptr += IlIlllIIll[2];
                "".length();
                if ((((0x3B ^ 0x2A) << "   ".length() ^ 2 + 42 - -57 + 34) & ((5 ^ 0x32) << " ".length() ^ (0xED ^ 0x8C) ^ -" ".length())) == 0) continue;
                return;
            }
        }

        public boolean hasNext() {
            Scanner lllIIlIllIIIlll;
            lllIIlIllIIIlll.skipUnprintable();
            return this.hasNextByte();
        }

        public long nextLong() {
            Scanner IlIIIlIllIIIlll;
            if (Scanner.IIIlllIlllIl(IlIIIlIllIIIlll.hasNext() ? 1 : 0)) {
                throw new NoSuchElementException();
            }
            long lIIIIlIllIIIlll = 0L;
            int IIIIIlIllIIIlll = IlIlllIIll[1];
            byte lllllIIllIIIlll = IlIIIlIllIIIlll.readByte();
            if (Scanner.lIIlllIlllIl(lllllIIllIIIlll, IlIlllIIll[6])) {
                IIIIIlIllIIIlll = IlIlllIIll[2];
                lllllIIllIIIlll = IlIIIlIllIIIlll.readByte();
            }
            if (!Scanner.IlIlllIlllIl(lllllIIllIIIlll, IlIlllIIll[7]) || Scanner.IIlIllIlllIl(IlIlllIIll[8], lllllIIllIIIlll)) {
                throw new NumberFormatException();
            }
            do {
                if (Scanner.lllIllIlllIl(IlIlllIIll[7], lllllIIllIIIlll) && Scanner.lllIllIlllIl(lllllIIllIIIlll, IlIlllIIll[8])) {
                    lIIIIlIllIIIlll *= 10L;
                    lIIIIlIllIIIlll += (long)(lllllIIllIIIlll - IlIlllIIll[7]);
                    "".length();
                    if ((0x9A ^ 0x9F) <= 0) {
                        return 0L;
                    }
                } else {
                    if (!Scanner.llIlllIlllIl(lllllIIllIIIlll, IlIlllIIll[3]) || Scanner.IIIlllIlllIl(IlIIIlIllIIIlll.isPrintableChar(lllllIIllIIIlll) ? 1 : 0)) {
                        long l;
                        if (Scanner.IllIllIlllIl(IIIIIlIllIIIlll)) {
                            l = -lIIIIlIllIIIlll;
                            "".length();
                            if (-(3 ^ 7) > 0) {
                                return 0L;
                            }
                        } else {
                            l = lIIIIlIllIIIlll;
                        }
                        return l;
                    }
                    throw new NumberFormatException();
                }
                byte by = this.readByte();
                "".length();
            } while (" ".length() << " ".length() > -" ".length());
            return 0L;
        }

        static {
            Scanner.llIIllIlllIl();
        }

        private static void llIIllIlllIl() {
            IlIlllIIll = new int[9];
            Scanner.IlIlllIIll[0] = " ".length() << ((0x78 ^ 0x7D) << " ".length());
            Scanner.IlIlllIIll[1] = (0x44 ^ 0x5D) << " ".length() & ~((0x41 ^ 0x58) << " ".length());
            Scanner.IlIlllIIll[2] = " ".length();
            Scanner.IlIlllIIll[3] = -" ".length();
            Scanner.IlIlllIIll[4] = (0xD ^ 0x12) << (" ".length() << " ".length()) ^ (0x40 ^ 0x1D);
            Scanner.IlIlllIIll[5] = ((0x22 ^ 0x3B) << (" ".length() << " ".length()) ^ (0xE9 ^ 0xB2)) << " ".length();
            Scanner.IlIlllIIll[6] = 132 + 132 - 85 + 0 ^ (0x48 ^ 7) << " ".length();
            Scanner.IlIlllIIll[7] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
            Scanner.IlIlllIIll[8] = 0x91 ^ 0xA8;
        }

        private static boolean lIIlllIlllIl(int n, int n2) {
            return n == n2;
        }

        private static boolean IlIlllIlllIl(int n, int n2) {
            return n >= n2;
        }

        private static boolean IIlIllIlllIl(int n, int n2) {
            return n < n2;
        }

        private static boolean lllIllIlllIl(int n, int n2) {
            return n <= n2;
        }

        private static boolean IllIllIlllIl(int n) {
            return n != 0;
        }

        private static boolean IIIlllIlllIl(int n) {
            return n == 0;
        }

        private static boolean lIlIllIlllIl(int n) {
            return n <= 0;
        }

        private static boolean llIlllIlllIl(int n, int n2) {
            return n != n2;
        }
    }

    static class BDigits {
        BDigits() {
            BDigits lIllIIlllIIIlll;
        }

        public void solve(int n, Scanner IllIIIlllIIIlll, PrintWriter lIlIIIlllIIIlll) {
            BDigits lllIIIlllIIIlll;
            long IIlIIIlllIIIlll = IllIIIlllIIIlll.nextLong();
            long llIIIIlllIIIlll = IllIIIlllIIIlll.nextLong();
            lIlIIIlllIIIlll.println(lllIIIlllIIIlll.convert(IIlIIIlllIIIlll, llIIIIlllIIIlll));
        }

        /*
         * WARNING - void declaration
         */
        long convert(long lIllllIllIIIlll, long IIllllIllIIIlll) {
            void var7_4;
            long llIlllIllIIIlll = 0L;
            long IlIlllIllIIIlll = 0L;
            while (BDigits.IlIIllIlllIl(BDigits.lIIIllIlllIl(lIllllIllIIIlll, 0L))) {
                long lIIlllIllIIIlll = lIllllIllIIIlll % IIllllIllIIIlll;
                lIllllIllIIIlll /= IIllllIllIIIlll;
                ++IlIlllIllIIIlll;
                "".length();
                if ((("   ".length() << (" ".length() << " ".length()) ^ (0x87 ^ 0xAA)) << " ".length() & (((0x92 ^ 0xA5) << " ".length() ^ (0xDE ^ 0x91)) << " ".length() ^ -" ".length())) == 0) continue;
                return 0L;
            }
            return (long)var7_4;
        }

        private static boolean IlIIllIlllIl(int n) {
            return n > 0;
        }

        private static int lIIIllIlllIl(long l, long l2) {
            return l == l2 ? 0 : (l < l2 ? -1 : 1);
        }
    }
}

