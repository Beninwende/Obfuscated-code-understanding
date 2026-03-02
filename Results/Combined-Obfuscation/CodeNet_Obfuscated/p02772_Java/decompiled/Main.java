/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import java.util.NoSuchElementException;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Main {
    private static int[] IIIIlIIl;

    public Main() {
        Main IlllIIlIlIIlIIl;
    }

    public static void main(String[] stringArray) {
        InputStream IIIlIIlIlIIlIIl = System.in;
        PrintStream lllIIIlIlIIlIIl = System.out;
        Scanner IllIIIlIlIIlIIl = new Scanner(IIIlIIlIlIIlIIl);
        PrintWriter lIlIIIlIlIIlIIl = new PrintWriter(lllIIIlIlIIlIIl);
        BPapersPlease IIlIIIlIlIIlIIl = new BPapersPlease();
        IIlIIIlIlIIlIIl.solve(IIIIlIIl[0], IllIIIlIlIIlIIl, lIlIIIlIlIIlIIl);
        lIlIIIlIlIIlIIl.close();
    }

    static {
        Main.lIllIllll();
    }

    private static void lIllIllll() {
        IIIIlIIl = new int[1];
        Main.IIIIlIIl[0] = " ".length();
    }

    static class Scanner {
        private final InputStream in;
        private final byte[] buffer;
        private int ptr;
        private int buflen;
        private static int[] lIIIlIIl;

        public Scanner(InputStream lllllIIllIIlIIl) {
            Scanner IIIIIlIllIIlIIl;
            IIIIIlIllIIlIIl.in = lllllIIllIIlIIl;
            IIIIIlIllIIlIIl.buffer = new byte[lIIIlIIl[0]];
            IIIIIlIllIIlIIl.ptr = lIIIlIIl[1];
            IIIIIlIllIIlIIl.buflen = lIIIlIIl[1];
        }

        private boolean hasNextByte() {
            Scanner IIlllIIllIIlIIl;
            if (Scanner.IlIIIllll(IIlllIIllIIlIIl.ptr, IIlllIIllIIlIIl.buflen)) {
                return lIIIlIIl[2];
            }
            IIlllIIllIIlIIl.ptr = lIIIlIIl[1];
            try {
                IIlllIIllIIlIIl.buflen = IIlllIIllIIlIIl.in.read(IIlllIIllIIlIIl.buffer);
                "".length();
            }
            catch (IOException llIllIIllIIlIIl) {
                llIllIIllIIlIIl.printStackTrace();
            }
            if (null != null) {
                return ((0x64 ^ 0x75) << " ".length() & ~((0x53 ^ 0x42) << " ".length())) != 0;
            }
            if (Scanner.llIIIllll(IIlllIIllIIlIIl.buflen)) {
                return lIIIlIIl[1];
            }
            return lIIIlIIl[2];
        }

        private byte readByte() {
            Scanner lIIllIIllIIlIIl;
            if (Scanner.IIlIIllll(lIIllIIllIIlIIl.hasNextByte() ? 1 : 0)) {
                int n = lIIllIIllIIlIIl.ptr;
                lIIllIIllIIlIIl.ptr = n + lIIIlIIl[2];
                return lIIllIIllIIlIIl.buffer[n];
            }
            return lIIIlIIl[3];
        }

        private boolean isPrintableChar(byte lllIlIIllIIlIIl) {
            int n;
            if (Scanner.lIlIIllll(lIIIlIIl[4], lllIlIIllIIlIIl) && Scanner.lIlIIllll(lllIlIIllIIlIIl, lIIIlIIl[5])) {
                n = lIIIlIIl[2];
                "".length();
                if ("   ".length() == " ".length() << (" ".length() << " ".length())) {
                    return ((0x8D ^ 0xBC) << " ".length() & ~((0x34 ^ 5) << " ".length())) != 0;
                }
            } else {
                n = lIIIlIIl[1];
            }
            return n != 0;
        }

        private void skipUnprintable() {
            Scanner lIlIlIIllIIlIIl;
            while (Scanner.IIlIIllll(lIlIlIIllIIlIIl.hasNextByte() ? 1 : 0) && Scanner.IllIIllll(lIlIlIIllIIlIIl.isPrintableChar(lIlIlIIllIIlIIl.buffer[lIlIlIIllIIlIIl.ptr]) ? 1 : 0)) {
                lIlIlIIllIIlIIl.ptr += lIIIlIIl[2];
                "".length();
                if (" ".length() << " ".length() < "   ".length()) continue;
                return;
            }
        }

        public boolean hasNext() {
            Scanner llIIlIIllIIlIIl;
            llIIlIIllIIlIIl.skipUnprintable();
            return this.hasNextByte();
        }

        public int nextInt() {
            Scanner IlllIIIllIIlIIl;
            if (Scanner.IllIIllll(IlllIIIllIIlIIl.hasNext() ? 1 : 0)) {
                throw new NoSuchElementException();
            }
            int lIllIIIllIIlIIl = lIIIlIIl[1];
            int IIllIIIllIIlIIl = lIIIlIIl[1];
            byte llIlIIIllIIlIIl = IlllIIIllIIlIIl.readByte();
            if (Scanner.lllIIllll(llIlIIIllIIlIIl, lIIIlIIl[6])) {
                IIllIIIllIIlIIl = lIIIlIIl[2];
                llIlIIIllIIlIIl = IlllIIIllIIlIIl.readByte();
            }
            if (!Scanner.IIIlIllll(llIlIIIllIIlIIl, lIIIlIIl[7]) || Scanner.IlIIIllll(lIIIlIIl[8], llIlIIIllIIlIIl)) {
                throw new NumberFormatException();
            }
            do {
                if (Scanner.lIlIIllll(lIIIlIIl[7], llIlIIIllIIlIIl) && Scanner.lIlIIllll(llIlIIIllIIlIIl, lIIIlIIl[8])) {
                    lIllIIIllIIlIIl *= lIIIlIIl[9];
                    lIllIIIllIIlIIl += llIlIIIllIIlIIl - lIIIlIIl[7];
                    "".length();
                    if ("   ".length() == 0) {
                        return (0x7C ^ 0x51) << " ".length() & ~((0x13 ^ 0x3E) << " ".length());
                    }
                } else {
                    if (!Scanner.lIIlIllll(llIlIIIllIIlIIl, lIIIlIIl[3]) || Scanner.IllIIllll(IlllIIIllIIlIIl.isPrintableChar(llIlIIIllIIlIIl) ? 1 : 0)) {
                        int n;
                        if (Scanner.IIlIIllll(IIllIIIllIIlIIl)) {
                            n = -lIllIIIllIIlIIl;
                            "".length();
                            if (null != null) {
                                return ((0x43 ^ 0x54) << " ".length() ^ (0x2A ^ 0x1D)) << " ".length() & ((29 + 76 - -25 + 3 ^ (0x56 ^ 0x71) << (" ".length() << " ".length())) << " ".length() ^ -" ".length());
                            }
                        } else {
                            n = lIllIIIllIIlIIl;
                        }
                        return n;
                    }
                    throw new NumberFormatException();
                }
                byte by = this.readByte();
                "".length();
            } while ("   ".length() > -" ".length());
            return ((0x63 ^ 0x38) << " ".length() ^ 61 + 32 - -14 + 58) & ((0x32 ^ 0x25) << (" ".length() << " ".length()) ^ (0x6B ^ 0x24) ^ -" ".length());
        }

        static {
            Scanner.lIIIIllll();
        }

        private static void lIIIIllll() {
            lIIIlIIl = new int[10];
            Scanner.lIIIlIIl[0] = " ".length() << ((0x7A ^ 0x17 ^ (3 ^ 0xE) << "   ".length()) << " ".length());
            Scanner.lIIIlIIl[1] = (0x65 ^ 0x2E ^ (0x6A ^ 0x57) << " ".length()) << " ".length() & (((6 ^ 0xF) << (" ".length() << " ".length()) ^ (0x5F ^ 0x4A)) << " ".length() ^ -" ".length());
            Scanner.lIIIlIIl[2] = " ".length();
            Scanner.lIIIlIIl[3] = -" ".length();
            Scanner.lIIIlIIl[4] = (0x50 ^ 0x5F) << (" ".length() << " ".length()) ^ (0x33 ^ 0x2E);
            Scanner.lIIIlIIl[5] = (0x50 ^ 0x6F) << " ".length();
            Scanner.lIIIlIIl[6] = 0x32 ^ 0x1F;
            Scanner.lIIIlIIl[7] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
            Scanner.lIIIlIIl[8] = 0x85 ^ 0xBC;
            Scanner.lIIIlIIl[9] = (72 + 28 - -32 + 3 ^ (0x72 ^ 0x33) << " ".length()) << " ".length();
        }

        private static boolean lllIIllll(int n, int n2) {
            return n == n2;
        }

        private static boolean IIIlIllll(int n, int n2) {
            return n >= n2;
        }

        private static boolean IlIIIllll(int n, int n2) {
            return n < n2;
        }

        private static boolean lIlIIllll(int n, int n2) {
            return n <= n2;
        }

        private static boolean IIlIIllll(int n) {
            return n != 0;
        }

        private static boolean IllIIllll(int n) {
            return n == 0;
        }

        private static boolean llIIIllll(int n) {
            return n <= 0;
        }

        private static boolean lIIlIllll(int n, int n2) {
            return n != n2;
        }
    }

    static class BPapersPlease {
        private static String[] lIllIIIl;
        private static int[] IlIIlIIl;

        BPapersPlease() {
            BPapersPlease llllIllIlIIlIIl;
        }

        public void solve(int n, Scanner lllIIllIlIIlIIl, PrintWriter IllIIllIlIIlIIl) {
            String lIlIIllIlIIlIIl = lIllIIIl[IlIIlIIl[0]];
            int IIlIIllIlIIlIIl = lllIIllIlIIlIIl.nextInt();
            ArrayList<Integer> llIIIllIlIIlIIl = new ArrayList<Integer>();
            while (BPapersPlease.llIlIllll(lllIIllIlIIlIIl.hasNext() ? 1 : 0)) {
                llIIIllIlIIlIIl.add(lllIIllIlIIlIIl.nextInt());
                "".length();
                "".length();
                if (" ".length() < "   ".length()) continue;
                return;
            }
            Iterator IlIIIllIlIIlIIl = llIIIllIlIIlIIl.iterator();
            while (BPapersPlease.llIlIllll(IlIIIllIlIIlIIl.hasNext() ? 1 : 0)) {
                int lIIIIllIlIIlIIl = (Integer)IlIIIllIlIIlIIl.next();
                if (BPapersPlease.IIllIllll(lIIIIllIlIIlIIl % IlIIlIIl[1]) && BPapersPlease.llIlIllll(lIIIIllIlIIlIIl % IlIIlIIl[2]) && BPapersPlease.llIlIllll(lIIIIllIlIIlIIl % IlIIlIIl[3])) {
                    lIlIIllIlIIlIIl = lIllIIIl[IlIIlIIl[4]];
                }
                "".length();
                if (" ".length() << " ".length() >= " ".length()) continue;
                return;
            }
            IllIIllIlIIlIIl.println(lIlIIllIlIIlIIl);
        }

        static {
            BPapersPlease.IlIlIllll();
            BPapersPlease.IIIIIllll();
        }

        private static void IIIIIllll() {
            lIllIIIl = new String[IlIIlIIl[1]];
            BPapersPlease.lIllIIIl[BPapersPlease.IlIIlIIl[0]] = BPapersPlease.lllllIlll("COSWzayNmNfocgM2/M/YJg==", "yrcah");
            BPapersPlease.lIllIIIl[BPapersPlease.IlIIlIIl[4]] = BPapersPlease.lllllIlll("BdwiAJqqU+4=", "daikX");
        }

        private static String lllllIlll(String IIlllIlIlIIlIIl, String llIllIlIlIIlIIl) {
            try {
                SecretKeySpec IlIllIlIlIIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIllIlIlIIlIIl.getBytes(StandardCharsets.UTF_8)), IlIIlIIl[5]), "DES");
                Cipher lIIllIlIlIIlIIl = Cipher.getInstance("DES");
                lIIllIlIlIIlIIl.init(IlIIlIIl[1], IlIllIlIlIIlIIl);
                return new String(lIIllIlIlIIlIIl.doFinal(Base64.getDecoder().decode(IIlllIlIlIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception IIIllIlIlIIlIIl) {
                IIIllIlIlIIlIIl.printStackTrace();
                return null;
            }
        }

        private static void IlIlIllll() {
            IlIIlIIl = new int[6];
            BPapersPlease.IlIIlIIl[0] = (39 + 53 - -4 + 63 ^ (0x4C ^ 0x2F) << " ".length()) & (132 + 141 - 61 + 19 ^ (4 ^ 0x5B) << " ".length() ^ -" ".length());
            BPapersPlease.IlIIlIIl[1] = " ".length() << " ".length();
            BPapersPlease.IlIIlIIl[2] = "   ".length();
            BPapersPlease.IlIIlIIl[3] = 0xA ^ 0xF;
            BPapersPlease.IlIIlIIl[4] = " ".length();
            BPapersPlease.IlIIlIIl[5] = " ".length() << "   ".length();
        }

        private static boolean llIlIllll(int n) {
            return n != 0;
        }

        private static boolean IIllIllll(int n) {
            return n == 0;
        }
    }
}

