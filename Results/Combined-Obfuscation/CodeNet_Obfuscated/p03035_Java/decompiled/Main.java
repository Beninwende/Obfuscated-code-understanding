/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {
    private static int[] lIIIlIlll;

    public Main() {
        Main IIlIlIIIllIIIl;
    }

    public static void main(String[] stringArray) {
        FS IIIIlIIIllIIIl = new FS();
        int llllIIIIllIIIl = IIIIlIIIllIIIl.nextInt();
        int IlllIIIIllIIIl = IIIIlIIIllIIIl.nextInt();
        if (Main.llIIlllIIll(llllIIIIllIIIl, lIIIlIlll[0])) {
            IlllIIIIllIIIl = lIIIlIlll[1];
            "".length();
            if (-" ".length() > "   ".length()) {
                return;
            }
        } else if (Main.llIIlllIIll(llllIIIIllIIIl, lIIIlIlll[2])) {
            IlllIIIIllIIIl /= lIIIlIlll[3];
        }
        System.out.println(IlllIIIIllIIIl);
    }

    public static void solver() {
    }

    static {
        Main.IlIIlllIIll();
    }

    private static void IlIIlllIIll() {
        lIIIlIlll = new int[4];
        Main.lIIIlIlll[0] = (0x31 ^ 0x1E) << " ".length() ^ (0x59 ^ 2);
        Main.lIIIlIlll[1] = " ".length() << ("   ".length() << " ".length()) & (" ".length() << ("   ".length() << " ".length()) ^ -" ".length());
        Main.lIIIlIlll[2] = "   ".length() << (" ".length() << " ".length());
        Main.lIIIlIlll[3] = " ".length() << " ".length();
    }

    private static boolean llIIlllIIll(int n, int n2) {
        return n <= n2;
    }

    static class FS {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[llIIlIlll[0]];
        private int ptr = llIIlIlll[1];
        private int buflen = llIIlIlll[1];
        private static int[] llIIlIlll;

        FS() {
            FS IIIlIIIIllIIIl;
        }

        private boolean hasNextByte() {
            FS lIlIIIIIllIIIl;
            if (FS.lIlIlllIIll(lIlIIIIIllIIIl.ptr, lIlIIIIIllIIIl.buflen)) {
                return llIIlIlll[2];
            }
            lIlIIIIIllIIIl.ptr = llIIlIlll[1];
            try {
                lIlIIIIIllIIIl.buflen = lIlIIIIIllIIIl.in.read(lIlIIIIIllIIIl.buffer);
                "".length();
            }
            catch (IOException IIlIIIIIllIIIl) {
                IIlIIIIIllIIIl.printStackTrace();
            }
            if (" ".length() != " ".length()) {
                return ((0x6C ^ 0x73) & ~(0xB2 ^ 0xAD) & ~((0x87 ^ 0x92) << " ".length() & ~((0xA6 ^ 0xB3) << " ".length()))) != 0;
            }
            if (FS.IllIlllIIll(lIlIIIIIllIIIl.buflen)) {
                return llIIlIlll[1];
            }
            return llIIlIlll[2];
        }

        private int readByte() {
            int n;
            FS IlIIIIIIllIIIl;
            if (FS.lllIlllIIll(IlIIIIIIllIIIl.hasNextByte() ? 1 : 0)) {
                int n2 = IlIIIIIIllIIIl.ptr;
                IlIIIIIIllIIIl.ptr = n2 + llIIlIlll[2];
                n = IlIIIIIIllIIIl.buffer[n2];
                "".length();
                if (" ".length() << " ".length() < 0) {
                    return " ".length() << "   ".length() & (" ".length() << "   ".length() ^ -" ".length());
                }
            } else {
                n = llIIlIlll[3];
            }
            return n;
        }

        private boolean isPrintableChar(int IIIIIIIIllIIIl) {
            int n;
            if (FS.IIIllllIIll(llIIlIlll[4], IIIIIIIIllIIIl) && FS.IIIllllIIll(IIIIIIIIllIIIl, llIIlIlll[5])) {
                n = llIIlIlll[2];
                "".length();
                if (((0xAB ^ 0x94 ^ (3 ^ 8) << " ".length()) << " ".length() & ((" ".length() << (0x67 ^ 0x62) ^ (0x8D ^ 0x84)) << " ".length() ^ -" ".length())) != 0) {
                    return (((0x8A ^ 0x8F) << (" ".length() << (" ".length() << " ".length())) ^ (0x44 ^ 0x51)) & (43 + 122 - 50 + 14 ^ (0x2E ^ 0x1F) << (" ".length() << " ".length()) ^ -" ".length())) != 0;
                }
            } else {
                n = llIIlIlll[1];
            }
            return n != 0;
        }

        private void skipUnprintable() {
            FS IlllllllIlIIIl;
            while (FS.lllIlllIIll(IlllllllIlIIIl.hasNextByte() ? 1 : 0) && FS.lIIllllIIll(IlllllllIlIIIl.isPrintableChar(IlllllllIlIIIl.buffer[IlllllllIlIIIl.ptr]) ? 1 : 0)) {
                IlllllllIlIIIl.ptr += llIIlIlll[2];
                "".length();
                if (null == null) continue;
                return;
            }
        }

        public boolean hasNext() {
            FS IIllllllIlIIIl;
            IIllllllIlIIIl.skipUnprintable();
            return this.hasNextByte();
        }

        /*
         * WARNING - void declaration
         */
        public String next() {
            void var1_1;
            FS IIIlllllIlIIIl;
            if (FS.lIIllllIIll(IIIlllllIlIIIl.hasNext() ? 1 : 0)) {
                throw new NoSuchElementException();
            }
            StringBuilder lllIllllIlIIIl = new StringBuilder();
            int IllIllllIlIIIl = IIIlllllIlIIIl.readByte();
            while (FS.lllIlllIIll(IIIlllllIlIIIl.isPrintableChar(IllIllllIlIIIl) ? 1 : 0)) {
                lllIllllIlIIIl.appendCodePoint(IllIllllIlIIIl);
                "".length();
                IllIllllIlIIIl = IIIlllllIlIIIl.readByte();
                "".length();
                if (null == null) continue;
                return null;
            }
            return String.valueOf(var1_1);
        }

        public int nextInt() {
            FS IIlIllllIlIIIl;
            return (int)IIlIllllIlIIIl.nextLong();
        }

        public long nextLong() {
            FS llllIlllIlIIIl;
            if (FS.lIIllllIIll(llllIlllIlIIIl.hasNext() ? 1 : 0)) {
                throw new NoSuchElementException();
            }
            long IlllIlllIlIIIl = 0L;
            int lIllIlllIlIIIl = llIIlIlll[1];
            int IIllIlllIlIIIl = llllIlllIlIIIl.readByte();
            if (FS.IlIllllIIll(IIllIlllIlIIIl, llIIlIlll[6])) {
                lIllIlllIlIIIl = llIIlIlll[2];
                IIllIlllIlIIIl = llllIlllIlIIIl.readByte();
            }
            if (!FS.llIllllIIll(IIllIlllIlIIIl, llIIlIlll[7]) || FS.lIlIlllIIll(llIIlIlll[8], IIllIlllIlIIIl)) {
                throw new NumberFormatException();
            }
            do {
                if (FS.IIIllllIIll(llIIlIlll[7], IIllIlllIlIIIl) && FS.IIIllllIIll(IIllIlllIlIIIl, llIIlIlll[8])) {
                    IlllIlllIlIIIl *= 10L;
                    IlllIlllIlIIIl += (long)(IIllIlllIlIIIl - llIIlIlll[7]);
                    "".length();
                    if ("   ".length() == 0) {
                        return 0L;
                    }
                } else {
                    if (!FS.IIlllllIIll(IIllIlllIlIIIl, llIIlIlll[3]) || FS.lIIllllIIll(llllIlllIlIIIl.isPrintableChar(IIllIlllIlIIIl) ? 1 : 0)) {
                        long l;
                        if (FS.lllIlllIIll(lIllIlllIlIIIl)) {
                            l = -IlllIlllIlIIIl;
                            "".length();
                            if (" ".length() << " ".length() <= 0) {
                                return 0L;
                            }
                        } else {
                            l = IlllIlllIlIIIl;
                        }
                        return l;
                    }
                    throw new NumberFormatException();
                }
                int n = this.readByte();
                "".length();
            } while (" ".length() << (" ".length() << " ".length()) >= 0);
            return 0L;
        }

        static {
            FS.IIlIlllIIll();
        }

        private static void IIlIlllIIll() {
            llIIlIlll = new int[9];
            FS.llIIlIlll[0] = " ".length() << ((0xE ^ 0xB) << " ".length());
            FS.llIIlIlll[1] = (0x9B ^ 0xA2) & ~(0x35 ^ 0xC);
            FS.llIIlIlll[2] = " ".length();
            FS.llIIlIlll[3] = -" ".length();
            FS.llIIlIlll[4] = 0x25 ^ 4;
            FS.llIIlIlll[5] = (9 ^ 0x36) << " ".length();
            FS.llIIlIlll[6] = 0x68 ^ 0x45 ^ (0x29 ^ 0x20) << " ".length() & ~((0x24 ^ 0x2D) << " ".length());
            FS.llIIlIlll[7] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
            FS.llIIlIlll[8] = 0x8E ^ 0xC5 ^ (0x60 ^ 0x59) << " ".length();
        }

        private static boolean IlIllllIIll(int n, int n2) {
            return n == n2;
        }

        private static boolean llIllllIIll(int n, int n2) {
            return n >= n2;
        }

        private static boolean lIlIlllIIll(int n, int n2) {
            return n < n2;
        }

        private static boolean IIIllllIIll(int n, int n2) {
            return n <= n2;
        }

        private static boolean lllIlllIIll(int n) {
            return n != 0;
        }

        private static boolean lIIllllIIll(int n) {
            return n == 0;
        }

        private static boolean IllIlllIIll(int n) {
            return n <= 0;
        }

        private static boolean IIlllllIIll(int n, int n2) {
            return n != n2;
        }
    }
}

