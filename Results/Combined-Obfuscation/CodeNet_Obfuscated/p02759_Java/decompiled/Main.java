/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class Main {
    private static int[] llIIllll;

    public Main() {
        Main llIlIllllIllll;
    }

    public static void main(String[] stringArray) {
        InputStream lIlIIllllIllll = System.in;
        PrintStream IIlIIllllIllll = System.out;
        Scanner llIIIllllIllll = new Scanner(lIlIIllllIllll);
        PrintWriter IlIIIllllIllll = new PrintWriter(IIlIIllllIllll);
        ADuplexPrinting lIIIIllllIllll = new ADuplexPrinting();
        lIIIIllllIllll.solve(llIIllll[0], llIIIllllIllll, IlIIIllllIllll);
        IlIIIllllIllll.close();
    }

    static {
        Main.IIlIllIIll();
    }

    private static void IIlIllIIll() {
        llIIllll = new int[1];
        Main.llIIllll[0] = " ".length();
    }

    static class Scanner {
        private final InputStream in;
        private final byte[] buffer;
        private int ptr;
        private int buflen;
        private static int[] IllIllll;

        public Scanner(InputStream lIIIlIlllIllll) {
            Scanner IlIIlIlllIllll;
            IlIIlIlllIllll.in = lIIIlIlllIllll;
            IlIIlIlllIllll.buffer = new byte[IllIllll[0]];
            IlIIlIlllIllll.ptr = IllIllll[1];
            IlIIlIlllIllll.buflen = IllIllll[1];
        }

        private boolean hasNextByte() {
            Scanner IlllIIlllIllll;
            if (Scanner.lllIllIIll(IlllIIlllIllll.ptr, IlllIIlllIllll.buflen)) {
                return IllIllll[2];
            }
            IlllIIlllIllll.ptr = IllIllll[1];
            try {
                IlllIIlllIllll.buflen = IlllIIlllIllll.in.read(IlllIIlllIllll.buffer);
                "".length();
            }
            catch (IOException lIllIIlllIllll) {
                lIllIIlllIllll.printStackTrace();
            }
            if (null != null) {
                return ((0x73 ^ 0x7A) << "   ".length() & ~((0x3B ^ 0x32) << "   ".length())) != 0;
            }
            if (Scanner.IIIlllIIll(IlllIIlllIllll.buflen)) {
                return IllIllll[1];
            }
            return IllIllll[2];
        }

        private byte readByte() {
            Scanner llIlIIlllIllll;
            if (Scanner.lIIlllIIll(llIlIIlllIllll.hasNextByte() ? 1 : 0)) {
                int n = llIlIIlllIllll.ptr;
                llIlIIlllIllll.ptr = n + IllIllll[2];
                return llIlIIlllIllll.buffer[n];
            }
            return IllIllll[3];
        }

        private boolean isPrintableChar(byte lIIlIIlllIllll) {
            int n;
            if (Scanner.IlIlllIIll(IllIllll[4], lIIlIIlllIllll) && Scanner.IlIlllIIll(lIIlIIlllIllll, IllIllll[5])) {
                n = IllIllll[2];
                "".length();
                if (-" ".length() == " ".length() << " ".length()) {
                    return (((2 ^ 0x57) << " ".length() ^ 109 + 3 - 21 + 86) & ((0x4E ^ 0x4B) << (" ".length() << " ".length()) ^ (0xBE ^ 0xB1) ^ -" ".length())) != 0;
                }
            } else {
                n = IllIllll[1];
            }
            return n != 0;
        }

        private void skipUnprintable() {
            Scanner lllIIIlllIllll;
            while (Scanner.lIIlllIIll(lllIIIlllIllll.hasNextByte() ? 1 : 0) && Scanner.llIlllIIll(lllIIIlllIllll.isPrintableChar(lllIIIlllIllll.buffer[lllIIIlllIllll.ptr]) ? 1 : 0)) {
                lllIIIlllIllll.ptr += IllIllll[2];
                "".length();
                if (-" ".length() <= " ".length() << (" ".length() << " ".length())) continue;
                return;
            }
        }

        public boolean hasNext() {
            Scanner lIlIIIlllIllll;
            lIlIIIlllIllll.skipUnprintable();
            return this.hasNextByte();
        }

        public int nextInt() {
            Scanner IIIIIIlllIllll;
            if (Scanner.llIlllIIll(IIIIIIlllIllll.hasNext() ? 1 : 0)) {
                throw new NoSuchElementException();
            }
            int llllllIllIllll = IllIllll[1];
            int IlllllIllIllll = IllIllll[1];
            byte lIllllIllIllll = IIIIIIlllIllll.readByte();
            if (Scanner.IIllllIIll(lIllllIllIllll, IllIllll[6])) {
                IlllllIllIllll = IllIllll[2];
                lIllllIllIllll = IIIIIIlllIllll.readByte();
            }
            if (!Scanner.lIllllIIll(lIllllIllIllll, IllIllll[7]) || Scanner.lllIllIIll(IllIllll[8], lIllllIllIllll)) {
                throw new NumberFormatException();
            }
            do {
                if (Scanner.IlIlllIIll(IllIllll[7], lIllllIllIllll) && Scanner.IlIlllIIll(lIllllIllIllll, IllIllll[8])) {
                    llllllIllIllll *= IllIllll[9];
                    llllllIllIllll += lIllllIllIllll - IllIllll[7];
                    "".length();
                    if (" ".length() << (" ".length() << " ".length()) == " ".length()) {
                        return (119 + 92 - 192 + 108 ^ (0x18 ^ 0x25) << " ".length()) << " ".length() & ((136 + 69 - 68 + 14 ^ (0x45 ^ 0xC) << " ".length()) << " ".length() ^ -" ".length());
                    }
                } else {
                    if (!Scanner.IlllllIIll(lIllllIllIllll, IllIllll[3]) || Scanner.llIlllIIll(IIIIIIlllIllll.isPrintableChar(lIllllIllIllll) ? 1 : 0)) {
                        int n;
                        if (Scanner.lIIlllIIll(IlllllIllIllll)) {
                            n = -llllllIllIllll;
                            "".length();
                            if ("   ".length() == " ".length() << (" ".length() << " ".length())) {
                                return (" ".length() << ("   ".length() << " ".length()) ^ (0x20 ^ 0x69)) << (" ".length() << " ".length()) & (((0x81 ^ 0x88) << " ".length() ^ (0x4E ^ 0x55)) << (" ".length() << " ".length()) ^ -" ".length());
                            }
                        } else {
                            n = llllllIllIllll;
                        }
                        return n;
                    }
                    throw new NumberFormatException();
                }
                byte by = this.readByte();
                "".length();
            } while (((0x11 ^ 0x38) & ~(0x84 ^ 0xAD)) == 0);
            return (0x3B ^ 0x64) & ~(0x75 ^ 0x2A);
        }

        static {
            Scanner.IllIllIIll();
        }

        private static void IllIllIIll() {
            IllIllll = new int[10];
            Scanner.IllIllll[0] = " ".length() << (((0x55 ^ 0x68) << " ".length() ^ 125 + 84 - 82 + 0) << " ".length());
            Scanner.IllIllll[1] = (55 + 52 - -68 + 80 ^ (0x74 ^ 0x71) << (0x18 ^ 0x1D)) & ((0x55 ^ 0x3C) << " ".length() ^ 35 + 2 - -7 + 97 ^ -" ".length());
            Scanner.IllIllll[2] = " ".length();
            Scanner.IllIllll[3] = -" ".length();
            Scanner.IllIllll[4] = (0xEC ^ 0xB1) << " ".length() ^ 116 + 6 - 101 + 134;
            Scanner.IllIllll[5] = ((0x5C ^ 0x17) << " ".length() ^ 21 + 1 - -132 + 15) << " ".length();
            Scanner.IllIllll[6] = 0x17 ^ 0x58 ^ (0x7A ^ 0x4B) << " ".length();
            Scanner.IllIllll[7] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
            Scanner.IllIllll[8] = 0x89 ^ 0x98 ^ (0x68 ^ 0x6D) << "   ".length();
            Scanner.IllIllll[9] = ((0x53 ^ 2) << " ".length() ^ 46 + 69 - -11 + 41) << " ".length();
        }

        private static boolean IIllllIIll(int n, int n2) {
            return n == n2;
        }

        private static boolean lIllllIIll(int n, int n2) {
            return n >= n2;
        }

        private static boolean lllIllIIll(int n, int n2) {
            return n < n2;
        }

        private static boolean IlIlllIIll(int n, int n2) {
            return n <= n2;
        }

        private static boolean lIIlllIIll(int n) {
            return n != 0;
        }

        private static boolean llIlllIIll(int n) {
            return n == 0;
        }

        private static boolean IIIlllIIll(int n) {
            return n <= 0;
        }

        private static boolean IlllllIIll(int n, int n2) {
            return n != n2;
        }
    }

    static class ADuplexPrinting {
        private static int[] IIlIllll;

        ADuplexPrinting() {
            ADuplexPrinting lllllIlllIllll;
        }

        public void solve(int n, Scanner IlIllIlllIllll, PrintWriter lIIllIlllIllll) {
            int n2;
            int IIIllIlllIllll = IlIllIlllIllll.nextInt();
            if (ADuplexPrinting.lIlIllIIll(IIIllIlllIllll % IIlIllll[0])) {
                n2 = IIIllIlllIllll / IIlIllll[0];
                "".length();
                if ("   ".length() <= (((0 ^ 0x17) << " ".length() ^ (6 ^ 0x37)) << " ".length() & ((0 ^ 0x7B ^ (0xDD ^ 0xC4) << (" ".length() << " ".length())) << " ".length() ^ -" ".length()))) {
                    return;
                }
            } else {
                n2 = IIIllIlllIllll / IIlIllll[0] + IIlIllll[1];
            }
            int lllIlIlllIllll = n2;
            lIIllIlllIllll.println(lllIlIlllIllll);
        }

        static {
            ADuplexPrinting.IIlIllIIll();
        }

        private static void IIlIllIIll() {
            IIlIllll = new int[2];
            ADuplexPrinting.IIlIllll[0] = " ".length() << " ".length();
            ADuplexPrinting.IIlIllll[1] = " ".length();
        }

        private static boolean lIlIllIIll(int n) {
            return n == 0;
        }
    }
}

