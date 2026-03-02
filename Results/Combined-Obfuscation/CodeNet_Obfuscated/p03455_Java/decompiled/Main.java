/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.NoSuchElementException;

public class Main {
    private static String[] IIIllIllIl;
    private static int[] llIllIllIl;

    public Main() {
        Main IlllllIllllllll;
    }

    public static void main(String[] stringArray) {
        FS IlIlllIllllllll = new FS();
        int lIIlllIllllllll = IlIlllIllllllll.nextInt();
        int IIIlllIllllllll = IlIlllIllllllll.nextInt();
        if (Main.IIIllIlIIlIl(lIIlllIllllllll % llIllIllIl[0], llIllIllIl[1]) && Main.IIIllIlIIlIl(IIIlllIllllllll % llIllIllIl[0], llIllIllIl[1])) {
            System.out.println(IIIllIllIl[llIllIllIl[2]]);
            "".length();
            if (-"   ".length() > 0) {
                return;
            }
        } else {
            System.out.println(IIIllIllIl[llIllIllIl[1]]);
        }
    }

    static {
        Main.lllIlIlIIlIl();
        Main.lIllIIlIIlIl();
    }

    private static void lIllIIlIIlIl() {
        IIIllIllIl = new String[llIllIllIl[0]];
        Main.IIIllIllIl[Main.llIllIllIl[2]] = Main.IIllIIlIIlIl("Ii0F", "mIauj");
        Main.IIIllIllIl[Main.llIllIllIl[1]] = Main.IIllIIlIIlIl("CTQ2Og==", "LBSTW");
    }

    /*
     * Unable to fully structure code
     */
    private static String IIllIIlIIlIl(String IlllIlIllllllll, String lIllIlIllllllll) {
        IlllIlIllllllll = new String(Base64.getDecoder().decode(IlllIlIllllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        IIllIlIllllllll = new StringBuilder();
        llIlIlIllllllll = lIllIlIllllllll.toCharArray();
        IlIlIlIllllllll = Main.llIllIllIl[2];
        IIIIIlIllllllll = IlllIlIllllllll.toCharArray();
        lIIIIlIllllllll = IIIIIlIllllllll.length;
        IlIIIlIllllllll = Main.llIllIllIl[2];
        "".length();
        if ((((158 ^ 185) << " ".length() ^ (122 ^ 111)) & (248 ^ 145 ^ (157 ^ 132) << " ".length() ^ -" ".length())) <= 0) ** GOTO lbl19
        return null;
lbl-1000:
        // 1 sources

        {
            lIIlIlIllllllll = IIIIIlIllllllll[IlIIIlIllllllll];
            IIllIlIllllllll.append((char)(lIIlIlIllllllll ^ llIlIlIllllllll[IlIlIlIllllllll % llIlIlIllllllll.length]));
            "".length();
            ++IlIlIlIllllllll;
            ++IlIIIlIllllllll;
lbl19:
            // 2 sources

            ** while (!Main.lIIllIlIIlIl((int)IlIIIlIllllllll, (int)lIIIIlIllllllll))
        }
lbl20:
        // 1 sources

        return String.valueOf(IIllIlIllllllll);
    }

    private static void lllIlIlIIlIl() {
        llIllIllIl = new int[3];
        Main.llIllIllIl[0] = " ".length() << " ".length();
        Main.llIllIllIl[1] = " ".length();
        Main.llIllIllIl[2] = (0x66 ^ 0x59 ^ (0xB8 ^ 0xBF) << "   ".length()) << (" ".length() << " ".length()) & (((0x3A ^ 0x15) << (" ".length() << " ".length()) ^ 13 + 92 - 98 + 180) << (" ".length() << " ".length()) ^ -" ".length());
    }

    private static boolean IIIllIlIIlIl(int n, int n2) {
        return n == n2;
    }

    private static boolean lIIllIlIIlIl(int n, int n2) {
        return n >= n2;
    }

    static class FS {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[IlIllIllIl[0]];
        private int ptr = IlIllIllIl[1];
        private int buflen = IlIllIllIl[1];
        private static int[] IlIllIllIl;

        FS() {
            FS IllIlllllllllll;
        }

        private boolean hasNextByte() {
            FS llIIlllllllllll;
            if (FS.llllIIlIIlIl(llIIlllllllllll.ptr, llIIlllllllllll.buflen)) {
                return IlIllIllIl[2];
            }
            llIIlllllllllll.ptr = IlIllIllIl[1];
            try {
                llIIlllllllllll.buflen = llIIlllllllllll.in.read(llIIlllllllllll.buffer);
                "".length();
            }
            catch (IOException IlIIlllllllllll) {
                IlIIlllllllllll.printStackTrace();
            }
            if (((0x42 ^ 0x4D) << (" ".length() << " ".length()) & ~((0x92 ^ 0x9D) << (" ".length() << " ".length()))) > 0) {
                return ((0x19 ^ 0x12) << " ".length() & ~((0x13 ^ 0x18) << " ".length())) != 0;
            }
            if (FS.IIIIlIlIIlIl(llIIlllllllllll.buflen)) {
                return IlIllIllIl[1];
            }
            return IlIllIllIl[2];
        }

        private int readByte() {
            int n;
            FS IIIIlllllllllll;
            if (FS.lIIIlIlIIlIl(IIIIlllllllllll.hasNextByte() ? 1 : 0)) {
                int n2 = IIIIlllllllllll.ptr;
                IIIIlllllllllll.ptr = n2 + IlIllIllIl[2];
                n = IIIIlllllllllll.buffer[n2];
                "".length();
                if ("   ".length() <= ((0xAF ^ 0xA6 ^ (0x93 ^ 0x9E) << " ".length() & ~((0xCF ^ 0xC2) << " ".length())) << " ".length() & ((0x75 ^ 0x78 ^ " ".length() << (" ".length() << " ".length())) << " ".length() ^ -" ".length()))) {
                    return ((0xB7 ^ 0x8C) << (" ".length() << " ".length()) ^ 149 + 94 - 172 + 122) << " ".length() & ((0x16 ^ 0x77 ^ (0xBF ^ 0xAC) << (" ".length() << " ".length())) << " ".length() ^ -" ".length());
                }
            } else {
                n = IlIllIllIl[3];
            }
            return n;
        }

        private boolean isPrintableChar(int IlllIllllllllll) {
            int n;
            if (FS.IlIIlIlIIlIl(IlIllIllIl[4], IlllIllllllllll) && FS.IlIIlIlIIlIl(IlllIllllllllll, IlIllIllIl[5])) {
                n = IlIllIllIl[2];
                "".length();
                if (" ".length() >= " ".length() << (" ".length() << " ".length())) {
                    return (((0xB8 ^ 0x89) << " ".length() ^ (0x25 ^ 0x42)) << (" ".length() << " ".length()) & ((0xC ^ 0x11 ^ "   ".length() << "   ".length()) << (" ".length() << " ".length()) ^ -" ".length())) != 0;
                }
            } else {
                n = IlIllIllIl[1];
            }
            return n != 0;
        }

        private void skipUnprintable() {
            FS IIllIllllllllll;
            while (FS.lIIIlIlIIlIl(IIllIllllllllll.hasNextByte() ? 1 : 0) && FS.llIIlIlIIlIl(IIllIllllllllll.isPrintableChar(IIllIllllllllll.buffer[IIllIllllllllll.ptr]) ? 1 : 0)) {
                IIllIllllllllll.ptr += IlIllIllIl[2];
                "".length();
                if (" ".length() > (" ".length() << (" ".length() << " ".length()) & (" ".length() << (" ".length() << " ".length()) ^ -" ".length()))) continue;
                return;
            }
        }

        public boolean hasNext() {
            FS IlIlIllllllllll;
            IlIlIllllllllll.skipUnprintable();
            return this.hasNextByte();
        }

        /*
         * WARNING - void declaration
         */
        public String next() {
            void var1_1;
            FS IllIIllllllllll;
            if (FS.llIIlIlIIlIl(IllIIllllllllll.hasNext() ? 1 : 0)) {
                throw new NoSuchElementException();
            }
            StringBuilder lIlIIllllllllll = new StringBuilder();
            int IIlIIllllllllll = IllIIllllllllll.readByte();
            while (FS.lIIIlIlIIlIl(IllIIllllllllll.isPrintableChar(IIlIIllllllllll) ? 1 : 0)) {
                lIlIIllllllllll.appendCodePoint(IIlIIllllllllll);
                "".length();
                IIlIIllllllllll = IllIIllllllllll.readByte();
                "".length();
                if (" ".length() << " ".length() > 0) continue;
                return null;
            }
            return String.valueOf(var1_1);
        }

        public int nextInt() {
            FS IlIIIllllllllll;
            return (int)IlIIIllllllllll.nextLong();
        }

        public long nextLong() {
            FS lIlllIlllllllll;
            if (FS.llIIlIlIIlIl(lIlllIlllllllll.hasNext() ? 1 : 0)) {
                throw new NoSuchElementException();
            }
            long IIlllIlllllllll = 0L;
            int llIllIlllllllll = IlIllIllIl[1];
            int IlIllIlllllllll = lIlllIlllllllll.readByte();
            if (FS.IIlIlIlIIlIl(IlIllIlllllllll, IlIllIllIl[6])) {
                llIllIlllllllll = IlIllIllIl[2];
                IlIllIlllllllll = lIlllIlllllllll.readByte();
            }
            if (!FS.lIlIlIlIIlIl(IlIllIlllllllll, IlIllIllIl[7]) || FS.llllIIlIIlIl(IlIllIllIl[8], IlIllIlllllllll)) {
                throw new NumberFormatException();
            }
            do {
                if (FS.IlIIlIlIIlIl(IlIllIllIl[7], IlIllIlllllllll) && FS.IlIIlIlIIlIl(IlIllIlllllllll, IlIllIllIl[8])) {
                    IIlllIlllllllll *= 10L;
                    IIlllIlllllllll += (long)(IlIllIlllllllll - IlIllIllIl[7]);
                    "".length();
                    if ("   ".length() <= 0) {
                        return 0L;
                    }
                } else {
                    if (!FS.IllIlIlIIlIl(IlIllIlllllllll, IlIllIllIl[3]) || FS.llIIlIlIIlIl(lIlllIlllllllll.isPrintableChar(IlIllIlllllllll) ? 1 : 0)) {
                        long l;
                        if (FS.lIIIlIlIIlIl(llIllIlllllllll)) {
                            l = -IIlllIlllllllll;
                            "".length();
                            if (null != null) {
                                return 0L;
                            }
                        } else {
                            l = IIlllIlllllllll;
                        }
                        return l;
                    }
                    throw new NumberFormatException();
                }
                int n = this.readByte();
                "".length();
            } while (((0x16 ^ 0xF) << " ".length() & ~((0x52 ^ 0x4B) << " ".length())) <= 0);
            return 0L;
        }

        static {
            FS.IlllIIlIIlIl();
        }

        private static void IlllIIlIIlIl() {
            IlIllIllIl = new int[9];
            FS.IlIllIllIl[0] = " ".length() << ((0x66 ^ 0x63) << " ".length());
            FS.IlIllIllIl[1] = (0xAF ^ 0x84) & ~(0x33 ^ 0x18);
            FS.IlIllIllIl[2] = " ".length();
            FS.IlIllIllIl[3] = -" ".length();
            FS.IlIllIllIl[4] = 139 + 46 - 164 + 154 ^ (0x38 ^ 0x7F) << " ".length();
            FS.IlIllIllIl[5] = (0x5D ^ 0x16 ^ (0x3B ^ 0x26) << (" ".length() << " ".length())) << " ".length();
            FS.IlIllIllIl[6] = 112 + 19 - 28 + 30 ^ (0x21 ^ 0x34) << "   ".length();
            FS.IlIllIllIl[7] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
            FS.IlIllIllIl[8] = 0x7A ^ 0x43;
        }

        private static boolean IIlIlIlIIlIl(int n, int n2) {
            return n == n2;
        }

        private static boolean lIlIlIlIIlIl(int n, int n2) {
            return n >= n2;
        }

        private static boolean llllIIlIIlIl(int n, int n2) {
            return n < n2;
        }

        private static boolean IlIIlIlIIlIl(int n, int n2) {
            return n <= n2;
        }

        private static boolean lIIIlIlIIlIl(int n) {
            return n != 0;
        }

        private static boolean llIIlIlIIlIl(int n) {
            return n == 0;
        }

        private static boolean IIIIlIlIIlIl(int n) {
            return n <= 0;
        }

        private static boolean IllIlIlIIlIl(int n, int n2) {
            return n != n2;
        }
    }
}

