/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.NoSuchElementException;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Main {
    private static final FastWriter out;
    private static FastScanner in;
    static ArrayList<Integer>[] adj;
    private static long e97;
    private static int[] IIllIIlIll;

    public Main() {
        Main IIIIlllIIlllIll;
    }

    public static void main(String[] stringArray) throws IOException {
        in = new FastScanner();
        long IIllIllIIlllIll = in.longNext();
        long llIlIllIIlllIll = in.longNext();
        long IlIlIllIIlllIll = in.longNext();
        if (Main.IlIlIIIIIIll(Main.lIIlIIIIIIll(IIllIllIIlllIll, IlIlIllIIlllIll))) {
            IIllIllIIlllIll -= IlIlIllIIlllIll;
            "".length();
            if (null != null) {
                return;
            }
        } else {
            IlIlIllIIlllIll -= IIllIllIIlllIll;
            IIllIllIIlllIll = 0L;
            llIlIllIIlllIll = Main.max(0L, llIlIllIIlllIll - IlIlIllIIlllIll);
        }
        Object[] objectArray = new Object[IIllIIlIll[0]];
        objectArray[Main.IIllIIlIll[1]] = IIllIllIIlllIll;
        objectArray[Main.IIllIIlIll[2]] = llIlIllIIlllIll;
        out.pp(objectArray);
        "".length();
        out.close();
    }

    /*
     * WARNING - void declaration
     */
    private static long max(long lllIIllIIlllIll, long IllIIllIIlllIll) {
        long l;
        if (Main.IIllIIIIIIll(Main.llIlIIIIIIll(lllIIllIIlllIll, IllIIllIIlllIll))) {
            l = lllIIllIIlllIll;
            "".length();
            if (" ".length() << " ".length() == -" ".length()) {
                return 0L;
            }
        } else {
            void var2_1;
            l = var2_1;
        }
        return l;
    }

    static {
        Main.IIIlIIIIIIll();
        out = new FastWriter();
        e97 = 1000000007L;
    }

    private static void IIIlIIIIIIll() {
        IIllIIlIll = new int[3];
        Main.IIllIIlIll[0] = " ".length() << " ".length();
        Main.IIllIIlIll[1] = (0x35 ^ 0x52 ^ (0x80 ^ 0xA3) << " ".length()) << " ".length() & (((0xBB ^ 0xA0) << (" ".length() << " ".length()) ^ (0x39 ^ 0x74)) << " ".length() ^ -" ".length());
        Main.IIllIIlIll[2] = " ".length();
    }

    private static boolean IlIlIIIIIIll(int n) {
        return n >= 0;
    }

    private static boolean IIllIIIIIIll(int n) {
        return n > 0;
    }

    private static int lIIlIIIIIIll(long l, long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    private static int llIlIIIIIIll(long l, long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    static class FastScanner {
        private InputStream sin;
        private final byte[] buffer;
        private int ptr;
        private int buflen;
        private static int[] IIIIlIlIll;

        public FastScanner() {
            FastScanner IIIIIllIIlllIll;
            IIIIIllIIlllIll.sin = System.in;
            IIIIIllIIlllIll.buffer = new byte[IIIIlIlIll[0]];
            IIIIIllIIlllIll.ptr = IIIIlIlIll[1];
            IIIIIllIIlllIll.buflen = IIIIlIlIll[1];
        }

        public FastScanner(String llIllIlIIlllIll) throws FileNotFoundException {
            FastScanner IIlllIlIIlllIll;
            IIlllIlIIlllIll.sin = System.in;
            IIlllIlIIlllIll.buffer = new byte[IIIIlIlIll[0]];
            IIlllIlIIlllIll.ptr = IIIIlIlIll[1];
            IIlllIlIIlllIll.buflen = IIIIlIlIll[1];
            File IlIllIlIIlllIll = new File(llIllIlIIlllIll);
            IIlllIlIIlllIll.sin = new FileInputStream(IlIllIlIIlllIll);
        }

        private boolean hasNextByte() {
            FastScanner lllIlIlIIlllIll;
            if (FastScanner.lIlIlIIIIIll(lllIlIlIIlllIll.ptr, lllIlIlIIlllIll.buflen)) {
                return IIIIlIlIll[2];
            }
            lllIlIlIIlllIll.ptr = IIIIlIlIll[1];
            try {
                lllIlIlIIlllIll.buflen = lllIlIlIIlllIll.sin.read(lllIlIlIIlllIll.buffer);
                "".length();
            }
            catch (IOException IllIlIlIIlllIll) {
                IllIlIlIIlllIll.printStackTrace();
            }
            if (-" ".length() >= " ".length() << (" ".length() << " ".length())) {
                return (" ".length() << ("   ".length() << " ".length()) & ~(" ".length() << ("   ".length() << " ".length()))) != 0;
            }
            if (FastScanner.IllIlIIIIIll(lllIlIlIIlllIll.buflen)) {
                return IIIIlIlIll[1];
            }
            return IIIIlIlIll[2];
        }

        private int readByte() {
            FastScanner IIlIlIlIIlllIll;
            if (FastScanner.lllIlIIIIIll(IIlIlIlIIlllIll.hasNextByte() ? 1 : 0)) {
                int n = IIlIlIlIIlllIll.ptr;
                IIlIlIlIIlllIll.ptr = n + IIIIlIlIll[2];
                return IIlIlIlIIlllIll.buffer[n];
            }
            return IIIIlIlIll[3];
        }

        private static boolean isPrintableChar(int IlIIlIlIIlllIll) {
            int n;
            if (FastScanner.IIIllIIIIIll(IIIIlIlIll[4], IlIIlIlIIlllIll) && FastScanner.IIIllIIIIIll(IlIIlIlIIlllIll, IIIIlIlIll[5])) {
                n = IIIIlIlIll[2];
                "".length();
                if (((0x76 ^ 5 ^ (0x76 ^ 0x7B) << "   ".length()) << " ".length() & (((0xA4 ^ 0xA1) << (" ".length() << (" ".length() << " ".length())) ^ (0x6F ^ 0x24)) << " ".length() ^ -" ".length())) >= "   ".length()) {
                    return ((0x78 ^ 0x39 ^ (0x95 ^ 0xA0) << " ".length()) << " ".length() & (((0x8E ^ 0x8B) << (" ".length() << (" ".length() << " ".length())) ^ (0xCA ^ 0xB1)) << " ".length() ^ -" ".length())) != 0;
                }
            } else {
                n = IIIIlIlIll[1];
            }
            return n != 0;
        }

        public boolean hasNext() {
            FastScanner IIIIlIlIIlllIll;
            while (FastScanner.lllIlIIIIIll(IIIIlIlIIlllIll.hasNextByte() ? 1 : 0) && FastScanner.lIIllIIIIIll(FastScanner.isPrintableChar(IIIIlIlIIlllIll.buffer[IIIIlIlIIlllIll.ptr]) ? 1 : 0)) {
                IIIIlIlIIlllIll.ptr += IIIIlIlIll[2];
                "".length();
                if ("   ".length() > " ".length() << " ".length()) continue;
                return (((0xAB ^ 0xBC) << (" ".length() << " ".length()) ^ (0xB3 ^ 0xC4)) << " ".length() & ((37 + 15 - 15 + 96 ^ (0x77 ^ 0x20) << " ".length()) << " ".length() ^ -" ".length())) != 0;
            }
            return this.hasNextByte();
        }

        /*
         * WARNING - void declaration
         */
        public String next() {
            void var1_1;
            FastScanner IIllIIlIIlllIll;
            if (FastScanner.lIIllIIIIIll(IIllIIlIIlllIll.hasNext() ? 1 : 0)) {
                throw new NoSuchElementException();
            }
            StringBuilder llIlIIlIIlllIll = new StringBuilder();
            int IlIlIIlIIlllIll = IIllIIlIIlllIll.readByte();
            while (FastScanner.lllIlIIIIIll(FastScanner.isPrintableChar(IlIlIIlIIlllIll) ? 1 : 0)) {
                llIlIIlIIlllIll.appendCodePoint(IlIlIIlIIlllIll);
                "".length();
                IlIlIIlIIlllIll = IIllIIlIIlllIll.readByte();
                "".length();
                if (((0xB2 ^ 0x85) << " ".length() ^ (0x6A ^ 1)) > 0) continue;
                return null;
            }
            return String.valueOf(var1_1);
        }

        public long longNext() {
            FastScanner lIlIIIlIIlllIll;
            if (FastScanner.lIIllIIIIIll(lIlIIIlIIlllIll.hasNext() ? 1 : 0)) {
                throw new NoSuchElementException();
            }
            long IIlIIIlIIlllIll = 0L;
            int llIIIIlIIlllIll = IIIIlIlIll[1];
            int IlIIIIlIIlllIll = lIlIIIlIIlllIll.readByte();
            if (FastScanner.IlIllIIIIIll(IlIIIIlIIlllIll, IIIIlIlIll[6])) {
                llIIIIlIIlllIll = IIIIlIlIll[2];
                IlIIIIlIIlllIll = lIlIIIlIIlllIll.readByte();
            }
            if (!FastScanner.llIllIIIIIll(IlIIIIlIIlllIll, IIIIlIlIll[7]) || FastScanner.lIlIlIIIIIll(IIIIlIlIll[8], IlIIIIlIIlllIll)) {
                throw new NumberFormatException();
            }
            do {
                if (FastScanner.IIIllIIIIIll(IIIIlIlIll[7], IlIIIIlIIlllIll) && FastScanner.IIIllIIIIIll(IlIIIIlIIlllIll, IIIIlIlIll[8])) {
                    IIlIIIlIIlllIll *= 10L;
                    IIlIIIlIIlllIll += (long)(IlIIIIlIIlllIll - IIIIlIlIll[7]);
                    "".length();
                    if (" ".length() == ((0xC8 ^ 0x99 ^ (4 ^ 0x2F) << " ".length()) & (0xDC ^ 0x9B ^ " ".length() << ("   ".length() << " ".length()) ^ -" ".length()))) {
                        return 0L;
                    }
                } else {
                    if (!FastScanner.IIlllIIIIIll(IlIIIIlIIlllIll, IIIIlIlIll[3]) || !FastScanner.lllIlIIIIIll(FastScanner.isPrintableChar(IlIIIIlIIlllIll) ? 1 : 0) || FastScanner.IlIllIIIIIll(IlIIIIlIIlllIll, IIIIlIlIll[9])) {
                        long l;
                        if (FastScanner.lllIlIIIIIll(llIIIIlIIlllIll)) {
                            l = -IIlIIIlIIlllIll;
                            "".length();
                            if (null != null) {
                                return 0L;
                            }
                        } else {
                            l = IIlIIIlIIlllIll;
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
        public int intNext() {
            void var1_1;
            FastScanner llllllIIIlllIll;
            long IlllllIIIlllIll = llllllIIIlllIll.longNext();
            if (!FastScanner.IllllIIIIIll(FastScanner.lIlllIIIIIll(IlllllIIIlllIll, Integer.MIN_VALUE)) || FastScanner.lllllIIIIIll(FastScanner.lIlllIIIIIll(IlllllIIIlllIll, Integer.MAX_VALUE))) {
                throw new NumberFormatException();
            }
            return (int)var1_1;
        }

        public double doubleNext() {
            FastScanner IIllllIIIlllIll;
            return Double.parseDouble(IIllllIIIlllIll.next());
        }

        /*
         * WARNING - void declaration
         */
        public long[] nextLongArray(int IllIllIIIlllIll) {
            void var2_2;
            long[] lIlIllIIIlllIll = new long[IllIllIIIlllIll];
            int IIlIllIIIlllIll = IIIIlIlIll[1];
            while (FastScanner.lIlIlIIIIIll(IIlIllIIIlllIll, IllIllIIIlllIll)) {
                FastScanner lllIllIIIlllIll;
                lIlIllIIIlllIll[IIlIllIIIlllIll] = lllIllIIIlllIll.longNext();
                ++IIlIllIIIlllIll;
                "".length();
                if ((" ".length() << (" ".length() << (" ".length() << " ".length())) & ~(" ".length() << (" ".length() << (" ".length() << " ".length())))) == 0) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        public int[] nextIntArray(int IlllIlIIIlllIll) {
            void var2_2;
            int[] lIllIlIIIlllIll = new int[IlllIlIIIlllIll];
            int IIllIlIIIlllIll = IIIIlIlIll[1];
            while (FastScanner.lIlIlIIIIIll(IIllIlIIIlllIll, IlllIlIIIlllIll)) {
                FastScanner llllIlIIIlllIll;
                lIllIlIIIlllIll[IIllIlIIIlllIll] = llllIlIIIlllIll.intNext();
                ++IIllIlIIIlllIll;
                "".length();
                if (-" ".length() == -" ".length()) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        public ArrayList<Integer>[] getAdj(int IIIlIlIIIlllIll) {
            void var2_2;
            ArrayList[] lllIIlIIIlllIll = new ArrayList[IIIlIlIIIlllIll + IIIIlIlIll[2]];
            int IllIIlIIIlllIll = IIIIlIlIll[2];
            while (FastScanner.IIIllIIIIIll(IllIIlIIIlllIll, IIIlIlIIIlllIll)) {
                lllIIlIIIlllIll[IllIIlIIIlllIll] = new ArrayList();
                ++IllIIlIIIlllIll;
                "".length();
                if (" ".length() << " ".length() > ((0x14 ^ 0x75) & ~(3 ^ 0x62))) continue;
                return null;
            }
            return var2_2;
        }

        public ArrayList<Integer>[] adjacencyList(int IllllIIIIlllIll, int lIlllIIIIlllIll) throws IOException {
            FastScanner lllllIIIIlllIll;
            adj = lllllIIIIlllIll.getAdj(IllllIIIIlllIll);
            int IIlllIIIIlllIll = IIIIlIlIll[1];
            while (FastScanner.lIlIlIIIIIll(IIlllIIIIlllIll, lIlllIIIIlllIll)) {
                int llIllIIIIlllIll = lllllIIIIlllIll.intNext();
                int IlIllIIIIlllIll = lllllIIIIlllIll.intNext();
                adj[llIllIIIIlllIll].add(IlIllIIIIlllIll);
                "".length();
                adj[IlIllIIIIlllIll].add(llIllIIIIlllIll);
                "".length();
                ++IIlllIIIIlllIll;
                "".length();
                if (null == null) continue;
                return null;
            }
            return adj;
        }

        static {
            FastScanner.IIlIlIIIIIll();
        }

        private static void IIlIlIIIIIll() {
            IIIIlIlIll = new int[10];
            FastScanner.IIIIlIlIll[0] = " ".length() << ((98 + 0 - 72 + 111 ^ (0x5C ^ 0x7F) << (" ".length() << " ".length())) << " ".length());
            FastScanner.IIIIlIlIll[1] = ((0x57 ^ 0x46) << " ".length() ^ (8 ^ 0x25)) & ((3 ^ 0x5C) << " ".length() ^ 1 + 67 - 56 + 165 ^ -" ".length());
            FastScanner.IIIIlIlIll[2] = " ".length();
            FastScanner.IIIIlIlIll[3] = -" ".length();
            FastScanner.IIIIlIlIll[4] = " ".length() << " ".length() ^ (0xB ^ 0x28);
            FastScanner.IIIIlIlIll[5] = (0x55 ^ 0x6A) << " ".length();
            FastScanner.IIIIlIlIll[6] = 0x70 ^ 0x5D;
            FastScanner.IIIIlIlIll[7] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
            FastScanner.IIIIlIlIll[8] = 0x61 ^ 0x58;
            FastScanner.IIIIlIlIll[9] = (0x23 ^ 0x3E) << " ".length();
        }

        private static boolean IlIllIIIIIll(int n, int n2) {
            return n == n2;
        }

        private static boolean llIllIIIIIll(int n, int n2) {
            return n >= n2;
        }

        private static boolean lIlIlIIIIIll(int n, int n2) {
            return n < n2;
        }

        private static boolean IIIllIIIIIll(int n, int n2) {
            return n <= n2;
        }

        private static boolean lllIlIIIIIll(int n) {
            return n != 0;
        }

        private static boolean lIIllIIIIIll(int n) {
            return n == 0;
        }

        private static boolean IllllIIIIIll(int n) {
            return n >= 0;
        }

        private static boolean IllIlIIIIIll(int n) {
            return n <= 0;
        }

        private static boolean lllllIIIIIll(int n) {
            return n > 0;
        }

        private static boolean IIlllIIIIIll(int n, int n2) {
            return n != n2;
        }

        private static int lIlllIIIIIll(long l, long l2) {
            return l == l2 ? 0 : (l < l2 ? -1 : 1);
        }
    }

    static class FastWriter {
        private static final int IO_BUFFERS;
        private final StringBuilder out = new StringBuilder(lIIIlIlIll[0]);
        private static String[] IlllIIlIll;
        private static int[] lIIIlIlIll;

        public FastWriter() {
            FastWriter IlIllllllIllIll;
        }

        public FastWriter p(Object IllIlllllIllIll) {
            FastWriter lllIlllllIllIll;
            lllIlllllIllIll.out.append(IllIlllllIllIll);
            "".length();
            return this;
        }

        public FastWriter p(String lIIIlllllIllIll, Object ... IIIIlllllIllIll) {
            FastWriter IlIIlllllIllIll;
            IlIIlllllIllIll.out.append(String.format(lIIIlllllIllIll, IIIIlllllIllIll));
            "".length();
            return this;
        }

        public FastWriter pp(Object ... IIIlIllllIllIll) {
            FastWriter lIIlIllllIllIll;
            Object[] lllIIllllIllIll = IIIlIllllIllIll;
            int IllIIllllIllIll = lllIIllllIllIll.length;
            int lIlIIllllIllIll = lIIIlIlIll[1];
            while (FastWriter.lIIIIlIIIIll(lIlIIllllIllIll, IllIIllllIllIll)) {
                Object IIlIIllllIllIll = lllIIllllIllIll[lIlIIllllIllIll];
                lIIlIllllIllIll.out.append(IIlIIllllIllIll).append(IlllIIlIll[lIIIlIlIll[1]]);
                "".length();
                ++lIlIIllllIllIll;
                "".length();
                if (-"  ".length() < 0) continue;
                return null;
            }
            lIIlIllllIllIll.out.append(IlllIIlIll[lIIIlIlIll[2]]);
            "".length();
            return this;
        }

        public FastWriter println(Object IIIIIllllIllIll) {
            FastWriter lIIIIllllIllIll;
            lIIIIllllIllIll.out.append(IIIIIllllIllIll).append(IlllIIlIll[lIIIlIlIll[3]]);
            "".length();
            return this;
        }

        public void toFile(String llIllIlllIllIll) throws IOException {
            FastWriter IIlllIlllIllIll;
            BufferedWriter IlIllIlllIllIll = new BufferedWriter(new FileWriter(llIllIlllIllIll));
            IlIllIlllIllIll.write(String.valueOf(IIlllIlllIllIll.out));
            IlIllIlllIllIll.close();
        }

        public void close() throws IOException {
            FastWriter IIIllIlllIllIll;
            System.out.print(IIIllIlllIllIll.out);
        }

        static {
            FastWriter.IIIIIlIIIIll();
            FastWriter.llIIlIIIIIll();
            IO_BUFFERS = lIIIlIlIll[0];
        }

        private static void llIIlIIIIIll() {
            IlllIIlIll = new String[lIIIlIlIll[4]];
            FastWriter.IlllIIlIll[FastWriter.lIIIlIlIll[1]] = FastWriter.lIllIIIIIIll("5iAXHnYmpDI=", "vUoDK");
            FastWriter.IlllIIlIll[FastWriter.lIIIlIlIll[2]] = FastWriter.IIIIlIIIIIll("qnnEOmrVWC4=", "kurwi");
            FastWriter.IlllIIlIll[FastWriter.lIIIlIlIll[3]] = FastWriter.IlIIlIIIIIll("Xg==", "TjDcz");
        }

        /*
         * Unable to fully structure code
         */
        private static String IlIIlIIIIIll(String IlllIIlllIllIll, String lIllIIlllIllIll) {
            IlllIIlllIllIll = new String(Base64.getDecoder().decode(IlllIIlllIllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            IIllIIlllIllIll = new StringBuilder();
            llIlIIlllIllIll = lIllIIlllIllIll.toCharArray();
            IlIlIIlllIllIll = FastWriter.lIIIlIlIll[1];
            IIIIIIlllIllIll = IlllIIlllIllIll.toCharArray();
            lIIIIIlllIllIll = IIIIIIlllIllIll.length;
            IlIIIIlllIllIll = FastWriter.lIIIlIlIll[1];
            "".length();
            if (" ".length() >= 0) ** GOTO lbl19
            return null;
lbl-1000:
            // 1 sources

            {
                lIIlIIlllIllIll = IIIIIIlllIllIll[IlIIIIlllIllIll];
                IIllIIlllIllIll.append((char)(lIIlIIlllIllIll ^ llIlIIlllIllIll[IlIlIIlllIllIll % llIlIIlllIllIll.length]));
                "".length();
                ++IlIlIIlllIllIll;
                ++IlIIIIlllIllIll;
lbl19:
                // 2 sources

                ** while (!FastWriter.IlIIIlIIIIll((int)IlIIIIlllIllIll, (int)lIIIIIlllIllIll))
            }
lbl20:
            // 1 sources

            return String.valueOf(IIllIIlllIllIll);
        }

        private static String IIIIlIIIIIll(String llIlllIllIllIll, String IlIlllIllIllIll) {
            try {
                SecretKeySpec lIIlllIllIllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IlIlllIllIllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                Cipher IIIlllIllIllIll = Cipher.getInstance("Blowfish");
                IIIlllIllIllIll.init(lIIIlIlIll[3], lIIlllIllIllIll);
                return new String(IIIlllIllIllIll.doFinal(Base64.getDecoder().decode(llIlllIllIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllIllIllIllIll) {
                lllIllIllIllIll.printStackTrace();
                return null;
            }
        }

        private static String lIllIIIIIIll(String IlllIlIllIllIll, String lIllIlIllIllIll) {
            try {
                SecretKeySpec IIllIlIllIllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIllIlIllIllIll.getBytes(StandardCharsets.UTF_8)), lIIIlIlIll[5]), "DES");
                Cipher llIlIlIllIllIll = Cipher.getInstance("DES");
                llIlIlIllIllIll.init(lIIIlIlIll[3], IIllIlIllIllIll);
                return new String(llIlIlIllIllIll.doFinal(Base64.getDecoder().decode(IlllIlIllIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception IlIlIlIllIllIll) {
                IlIlIlIllIllIll.printStackTrace();
                return null;
            }
        }

        private static void IIIIIlIIIIll() {
            lIIIlIlIll = new int[6];
            FastWriter.lIIIlIlIll[0] = " ".length() << (0x7F ^ 0x6E);
            FastWriter.lIIIlIlIll[1] = (0xF5 ^ 0xB4) & ~(0x23 ^ 0x62);
            FastWriter.lIIIlIlIll[2] = " ".length();
            FastWriter.lIIIlIlIll[3] = " ".length() << " ".length();
            FastWriter.lIIIlIlIll[4] = "   ".length();
            FastWriter.lIIIlIlIll[5] = " ".length() << "   ".length();
        }

        private static boolean IlIIIlIIIIll(int n, int n2) {
            return n >= n2;
        }

        private static boolean lIIIIlIIIIll(int n, int n2) {
            return n < n2;
        }
    }
}

