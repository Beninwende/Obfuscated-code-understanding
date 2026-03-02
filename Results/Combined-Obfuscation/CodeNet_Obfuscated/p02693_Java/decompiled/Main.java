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
import java.util.Base64;
import java.util.NoSuchElementException;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Main {
    private static final FastWriter out;
    private static FastScanner in;
    static ArrayList<Integer>[] adj;
    private static long e97;
    private static String[] lIlIlllIl;
    private static int[] IllIlllIl;

    public Main() {
        Main IlIIIIllIlllIl;
    }

    public static void main(String[] stringArray) throws IOException {
        String string;
        in = new FastScanner();
        int lIllllIlIlllIl = in.intNext();
        int IIllllIlIlllIl = in.intNext();
        int llIlllIlIlllIl = in.intNext();
        int IlIlllIlIlllIl = IIllllIlIlllIl / lIllllIlIlllIl * lIllllIlIlllIl;
        if (Main.IllllIIIlIl(IlIlllIlIlllIl, IIllllIlIlllIl)) {
            IlIlllIlIlllIl += lIllllIlIlllIl;
        }
        if (Main.lllllIIIlIl(IlIlllIlIlllIl, llIlllIlIlllIl)) {
            string = lIlIlllIl[IllIlllIl[0]];
            "".length();
            if (-((0x2A ^ 0x33) << (" ".length() << " ".length()) ^ "   ".length() << (0x8E ^ 0x8B)) > 0) {
                return;
            }
        } else {
            string = lIlIlllIl[IllIlllIl[1]];
        }
        out.println(string);
        "".length();
        out.close();
    }

    static {
        Main.lIlllIIIlIl();
        Main.IIlllIIIlIl();
        out = new FastWriter();
        e97 = 1000000007L;
    }

    private static void IIlllIIIlIl() {
        lIlIlllIl = new String[IllIlllIl[2]];
        Main.lIlIlllIl[Main.IllIlllIl[0]] = Main.llIllIIIlIl("PBM=", "sXJUS");
        Main.lIlIlllIl[Main.IllIlllIl[1]] = Main.llIllIIIlIl("PSA=", "sgMtU");
    }

    /*
     * Unable to fully structure code
     */
    private static String llIllIIIlIl(String IIIIllIlIlllIl, String llllIlIlIlllIl) {
        IIIIllIlIlllIl = new String(Base64.getDecoder().decode(IIIIllIlIlllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        IlllIlIlIlllIl = new StringBuilder();
        lIllIlIlIlllIl = llllIlIlIlllIl.toCharArray();
        IIllIlIlIlllIl = Main.IllIlllIl[0];
        IlIIIlIlIlllIl = IIIIllIlIlllIl.toCharArray();
        llIIIlIlIlllIl = IlIIIlIlIlllIl.length;
        IIlIIlIlIlllIl = Main.IllIlllIl[0];
        "".length();
        if (((79 ^ 68) << "   ".length() & ~((107 ^ 96) << "   ".length())) >= ("   ".length() << (57 ^ 60) & ~("   ".length() << (184 ^ 189)))) ** GOTO lbl19
        return null;
lbl-1000:
        // 1 sources

        {
            llIlIlIlIlllIl = IlIIIlIlIlllIl[IIlIIlIlIlllIl];
            IlllIlIlIlllIl.append((char)(llIlIlIlIlllIl ^ lIllIlIlIlllIl[IIllIlIlIlllIl % lIllIlIlIlllIl.length]));
            "".length();
            ++IIllIlIlIlllIl;
            ++IIlIIlIlIlllIl;
lbl19:
            // 2 sources

            ** while (!Main.IIIIIlIIlIl((int)IIlIIlIlIlllIl, (int)llIIIlIlIlllIl))
        }
lbl20:
        // 1 sources

        return String.valueOf(IlllIlIlIlllIl);
    }

    private static void lIlllIIIlIl() {
        IllIlllIl = new int[3];
        Main.IllIlllIl[0] = (0x6E ^ 0x45 ^ (0x6F ^ 0x70) << " ".length()) & ((0xC ^ 0x5F) << " ".length() ^ 9 + 81 - 35 + 124 ^ -" ".length());
        Main.IllIlllIl[1] = " ".length();
        Main.IllIlllIl[2] = " ".length() << " ".length();
    }

    private static boolean IIIIIlIIlIl(int n, int n2) {
        return n >= n2;
    }

    private static boolean IllllIIIlIl(int n, int n2) {
        return n < n2;
    }

    private static boolean lllllIIIlIl(int n, int n2) {
        return n <= n2;
    }

    static class FastScanner {
        private InputStream sin;
        private final byte[] buffer;
        private int ptr;
        private int buflen;
        private static int[] lIIllllIl;

        public FastScanner() {
            FastScanner IIlIlIIlIlllIl;
            IIlIlIIlIlllIl.sin = System.in;
            IIlIlIIlIlllIl.buffer = new byte[lIIllllIl[0]];
            IIlIlIIlIlllIl.ptr = lIIllllIl[1];
            IIlIlIIlIlllIl.buflen = lIIllllIl[1];
        }

        public FastScanner(String llllIIIlIlllIl) throws FileNotFoundException {
            FastScanner IIIIlIIlIlllIl;
            IIIIlIIlIlllIl.sin = System.in;
            IIIIlIIlIlllIl.buffer = new byte[lIIllllIl[0]];
            IIIIlIIlIlllIl.ptr = lIIllllIl[1];
            IIIIlIIlIlllIl.buflen = lIIllllIl[1];
            File IlllIIIlIlllIl = new File(llllIIIlIlllIl);
            IIIIlIIlIlllIl.sin = new FileInputStream(IlllIIIlIlllIl);
        }

        private boolean hasNextByte() {
            FastScanner llIlIIIlIlllIl;
            if (FastScanner.llIIIlIIlIl(llIlIIIlIlllIl.ptr, llIlIIIlIlllIl.buflen)) {
                return lIIllllIl[2];
            }
            llIlIIIlIlllIl.ptr = lIIllllIl[1];
            try {
                llIlIIIlIlllIl.buflen = llIlIIIlIlllIl.sin.read(llIlIIIlIlllIl.buffer);
                "".length();
            }
            catch (IOException IlIlIIIlIlllIl) {
                IlIlIIIlIlllIl.printStackTrace();
            }
            if (" ".length() > " ".length()) {
                return ((0x6D ^ 0x52 ^ (0x75 ^ 0x62) << (" ".length() << " ".length())) & (0x50 ^ 0x19 ^ (0xB3 ^ 0xA6) << " ".length() ^ -" ".length())) != 0;
            }
            if (FastScanner.IIlIIlIIlIl(llIlIIIlIlllIl.buflen)) {
                return lIIllllIl[1];
            }
            return lIIllllIl[2];
        }

        private int readByte() {
            FastScanner IIIlIIIlIlllIl;
            if (FastScanner.lIlIIlIIlIl(IIIlIIIlIlllIl.hasNextByte() ? 1 : 0)) {
                int n = IIIlIIIlIlllIl.ptr;
                IIIlIIIlIlllIl.ptr = n + lIIllllIl[2];
                return IIIlIIIlIlllIl.buffer[n];
            }
            return lIIllllIl[3];
        }

        private static boolean isPrintableChar(int IllIIIIlIlllIl) {
            int n;
            if (FastScanner.IllIIlIIlIl(lIIllllIl[4], IllIIIIlIlllIl) && FastScanner.IllIIlIIlIl(IllIIIIlIlllIl, lIIllllIl[5])) {
                n = lIIllllIl[2];
                "".length();
                if (((0x8A ^ 0x81) << " ".length() & ~((0x3A ^ 0x31) << " ".length())) != 0) {
                    return ((0x9C ^ 0xA9) & ~(0xA5 ^ 0x90)) != 0;
                }
            } else {
                n = lIIllllIl[1];
            }
            return n != 0;
        }

        public boolean hasNext() {
            FastScanner IIlIIIIlIlllIl;
            while (FastScanner.lIlIIlIIlIl(IIlIIIIlIlllIl.hasNextByte() ? 1 : 0) && FastScanner.lllIIlIIlIl(FastScanner.isPrintableChar(IIlIIIIlIlllIl.buffer[IIlIIIIlIlllIl.ptr]) ? 1 : 0)) {
                IIlIIIIlIlllIl.ptr += lIIllllIl[2];
                "".length();
                if (null == null) continue;
                return ("   ".length() & ("   ".length() ^ -" ".length())) != 0;
            }
            return this.hasNextByte();
        }

        /*
         * WARNING - void declaration
         */
        public String next() {
            void var1_1;
            FastScanner IIIIIIIlIlllIl;
            if (FastScanner.lllIIlIIlIl(IIIIIIIlIlllIl.hasNext() ? 1 : 0)) {
                throw new NoSuchElementException();
            }
            StringBuilder lllllllIIlllIl = new StringBuilder();
            int IllllllIIlllIl = IIIIIIIlIlllIl.readByte();
            while (FastScanner.lIlIIlIIlIl(FastScanner.isPrintableChar(IllllllIIlllIl) ? 1 : 0)) {
                lllllllIIlllIl.appendCodePoint(IllllllIIlllIl);
                "".length();
                IllllllIIlllIl = IIIIIIIlIlllIl.readByte();
                "".length();
                if (" ".length() << " ".length() > 0) continue;
                return null;
            }
            return String.valueOf(var1_1);
        }

        public long longNext() {
            FastScanner lIIllllIIlllIl;
            if (FastScanner.lllIIlIIlIl(lIIllllIIlllIl.hasNext() ? 1 : 0)) {
                throw new NoSuchElementException();
            }
            long IIIllllIIlllIl = 0L;
            int lllIlllIIlllIl = lIIllllIl[1];
            int IllIlllIIlllIl = lIIllllIIlllIl.readByte();
            if (FastScanner.IIIlIlIIlIl(IllIlllIIlllIl, lIIllllIl[6])) {
                lllIlllIIlllIl = lIIllllIl[2];
                IllIlllIIlllIl = lIIllllIIlllIl.readByte();
            }
            if (!FastScanner.lIIlIlIIlIl(IllIlllIIlllIl, lIIllllIl[7]) || FastScanner.llIIIlIIlIl(lIIllllIl[8], IllIlllIIlllIl)) {
                throw new NumberFormatException();
            }
            do {
                if (FastScanner.IllIIlIIlIl(lIIllllIl[7], IllIlllIIlllIl) && FastScanner.IllIIlIIlIl(IllIlllIIlllIl, lIIllllIl[8])) {
                    IIIllllIIlllIl *= 10L;
                    IIIllllIIlllIl += (long)(IllIlllIIlllIl - lIIllllIl[7]);
                    "".length();
                    if (" ".length() << (" ".length() << " ".length()) == -" ".length()) {
                        return 0L;
                    }
                } else {
                    if (!FastScanner.IlIlIlIIlIl(IllIlllIIlllIl, lIIllllIl[3]) || !FastScanner.lIlIIlIIlIl(FastScanner.isPrintableChar(IllIlllIIlllIl) ? 1 : 0) || FastScanner.IIIlIlIIlIl(IllIlllIIlllIl, lIIllllIl[9])) {
                        long l;
                        if (FastScanner.lIlIIlIIlIl(lllIlllIIlllIl)) {
                            l = -IIIllllIIlllIl;
                            "".length();
                            if (-" ".length() >= " ".length() << " ".length()) {
                                return 0L;
                            }
                        } else {
                            l = IIIllllIIlllIl;
                        }
                        return l;
                    }
                    throw new NumberFormatException();
                }
                int n = this.readByte();
                "".length();
            } while (((0x72 ^ 0x79) << "   ".length() & ~((0x8A ^ 0x81) << "   ".length())) == 0);
            return 0L;
        }

        /*
         * WARNING - void declaration
         */
        public int intNext() {
            void var1_1;
            FastScanner llIIlllIIlllIl;
            long IlIIlllIIlllIl = llIIlllIIlllIl.longNext();
            if (!FastScanner.IIllIlIIlIl(FastScanner.llIlIlIIlIl(IlIIlllIIlllIl, Integer.MIN_VALUE)) || FastScanner.lIllIlIIlIl(FastScanner.llIlIlIIlIl(IlIIlllIIlllIl, Integer.MAX_VALUE))) {
                throw new NumberFormatException();
            }
            return (int)var1_1;
        }

        public double doubleNext() {
            FastScanner IIIIlllIIlllIl;
            return Double.parseDouble(IIIIlllIIlllIl.next());
        }

        /*
         * WARNING - void declaration
         */
        public long[] nextLongArray(int IlIlIllIIlllIl) {
            void var2_2;
            long[] lIIlIllIIlllIl = new long[IlIlIllIIlllIl];
            int IIIlIllIIlllIl = lIIllllIl[1];
            while (FastScanner.llIIIlIIlIl(IIIlIllIIlllIl, IlIlIllIIlllIl)) {
                FastScanner llIlIllIIlllIl;
                lIIlIllIIlllIl[IIIlIllIIlllIl] = llIlIllIIlllIl.longNext();
                ++IIIlIllIIlllIl;
                "".length();
                if (((0x3E ^ 0x2D ^ (0xDA ^ 0xC5) << " ".length()) << " ".length() & (((0x76 ^ 0x4F) << " ".length() ^ (0x3E ^ 0x61)) << " ".length() ^ -" ".length())) < " ".length()) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        public int[] nextIntArray(int IlIIIllIIlllIl) {
            void var2_2;
            int[] lIIIIllIIlllIl = new int[IlIIIllIIlllIl];
            int IIIIIllIIlllIl = lIIllllIl[1];
            while (FastScanner.llIIIlIIlIl(IIIIIllIIlllIl, IlIIIllIIlllIl)) {
                FastScanner llIIIllIIlllIl;
                lIIIIllIIlllIl[IIIIIllIIlllIl] = llIIIllIIlllIl.intNext();
                ++IIIIIllIIlllIl;
                "".length();
                if (-" ".length() <= "   ".length()) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        public ArrayList<Integer>[] getAdj(int IIlllIlIIlllIl) {
            void var2_2;
            ArrayList[] llIllIlIIlllIl = new ArrayList[IIlllIlIIlllIl + lIIllllIl[2]];
            int IlIllIlIIlllIl = lIIllllIl[2];
            while (FastScanner.IllIIlIIlIl(IlIllIlIIlllIl, IIlllIlIIlllIl)) {
                llIllIlIIlllIl[IlIllIlIIlllIl] = new ArrayList();
                ++IlIllIlIIlllIl;
                "".length();
                if (null == null) continue;
                return null;
            }
            return var2_2;
        }

        public ArrayList<Integer>[] adjacencyList(int IlIIlIlIIlllIl, int lIIIlIlIIlllIl) throws IOException {
            FastScanner llIIlIlIIlllIl;
            adj = llIIlIlIIlllIl.getAdj(IlIIlIlIIlllIl);
            int IIIIlIlIIlllIl = lIIllllIl[1];
            while (FastScanner.llIIIlIIlIl(IIIIlIlIIlllIl, lIIIlIlIIlllIl)) {
                int llllIIlIIlllIl = llIIlIlIIlllIl.intNext();
                int IlllIIlIIlllIl = llIIlIlIIlllIl.intNext();
                adj[llllIIlIIlllIl].add(IlllIIlIIlllIl);
                "".length();
                adj[IlllIIlIIlllIl].add(llllIIlIIlllIl);
                "".length();
                ++IIIIlIlIIlllIl;
                "".length();
                if (-" ".length() <= -" ".length()) continue;
                return null;
            }
            return adj;
        }

        static {
            FastScanner.IlIIIlIIlIl();
        }

        private static void IlIIIlIIlIl() {
            lIIllllIl = new int[10];
            FastScanner.lIIllllIl[0] = " ".length() << (((0x8D ^ 0x88) << (" ".length() << (" ".length() << " ".length())) ^ (0x37 ^ 0x62)) << " ".length());
            FastScanner.lIIllllIl[1] = ((0xBC ^ 0x9B) << " ".length() ^ (0x32 ^ 0x1F)) & (0x8E ^ 0x99 ^ (0xAC ^ 0xB1) << (" ".length() << " ".length()) ^ -" ".length());
            FastScanner.lIIllllIl[2] = " ".length();
            FastScanner.lIIllllIl[3] = -" ".length();
            FastScanner.lIIllllIl[4] = 0x76 ^ 0x57;
            FastScanner.lIIllllIl[5] = (0xBE ^ 0x81) << " ".length();
            FastScanner.lIIllllIl[6] = 0x27 ^ 0xA;
            FastScanner.lIIllllIl[7] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
            FastScanner.lIIllllIl[8] = 0x60 ^ 0x59;
            FastScanner.lIIllllIl[9] = ((0x3D ^ 0x32) << (" ".length() << " ".length()) ^ (0x42 ^ 0x63)) << " ".length();
        }

        private static boolean IIIlIlIIlIl(int n, int n2) {
            return n == n2;
        }

        private static boolean lIIlIlIIlIl(int n, int n2) {
            return n >= n2;
        }

        private static boolean llIIIlIIlIl(int n, int n2) {
            return n < n2;
        }

        private static boolean IllIIlIIlIl(int n, int n2) {
            return n <= n2;
        }

        private static boolean lIlIIlIIlIl(int n) {
            return n != 0;
        }

        private static boolean lllIIlIIlIl(int n) {
            return n == 0;
        }

        private static boolean IIllIlIIlIl(int n) {
            return n >= 0;
        }

        private static boolean IIlIIlIIlIl(int n) {
            return n <= 0;
        }

        private static boolean lIllIlIIlIl(int n) {
            return n > 0;
        }

        private static boolean IlIlIlIIlIl(int n, int n2) {
            return n != n2;
        }

        private static int llIlIlIIlIl(long l, long l2) {
            return l == l2 ? 0 : (l < l2 ? -1 : 1);
        }
    }

    static class FastWriter {
        private static final int IO_BUFFERS;
        private final StringBuilder out = new StringBuilder(IlIllllIl[0]);
        private static String[] lllIlllIl;
        private static int[] IlIllllIl;

        public FastWriter() {
            FastWriter IlllIlIIIlllIl;
        }

        public FastWriter p(Object IlIlIlIIIlllIl) {
            FastWriter llIlIlIIIlllIl;
            llIlIlIIIlllIl.out.append(IlIlIlIIIlllIl);
            "".length();
            return this;
        }

        public FastWriter p(String lIlIIlIIIlllIl, Object ... IIlIIlIIIlllIl) {
            FastWriter IllIIlIIIlllIl;
            IllIIlIIIlllIl.out.append(String.format(lIlIIlIIIlllIl, IIlIIlIIIlllIl));
            "".length();
            return this;
        }

        public FastWriter pp(Object ... IIlllIIIIlllIl) {
            FastWriter lIlllIIIIlllIl;
            Object[] llIllIIIIlllIl = IIlllIIIIlllIl;
            int IlIllIIIIlllIl = llIllIIIIlllIl.length;
            int lIIllIIIIlllIl = IlIllllIl[1];
            while (FastWriter.lIIIllIIlIl(lIIllIIIIlllIl, IlIllIIIIlllIl)) {
                Object IIIllIIIIlllIl = llIllIIIIlllIl[lIIllIIIIlllIl];
                lIlllIIIIlllIl.out.append(IIIllIIIIlllIl).append(lllIlllIl[IlIllllIl[1]]);
                "".length();
                ++lIIllIIIIlllIl;
                "".length();
                if (-" ".length() >= -" ".length()) continue;
                return null;
            }
            lIlllIIIIlllIl.out.append(lllIlllIl[IlIllllIl[2]]);
            "".length();
            return this;
        }

        public FastWriter println(Object IIlIlIIIIlllIl) {
            FastWriter lIlIlIIIIlllIl;
            lIlIlIIIIlllIl.out.append(IIlIlIIIIlllIl).append(lllIlllIl[IlIllllIl[3]]);
            "".length();
            return this;
        }

        public void toFile(String llllIIIIIlllIl) throws IOException {
            FastWriter IIIIlIIIIlllIl;
            BufferedWriter IlllIIIIIlllIl = new BufferedWriter(new FileWriter(llllIIIIIlllIl));
            IlllIIIIIlllIl.write(String.valueOf(IIIIlIIIIlllIl.out));
            IlllIIIIIlllIl.close();
        }

        public void close() throws IOException {
            FastWriter IIllIIIIIlllIl;
            System.out.print(IIllIIIIIlllIl.out);
        }

        static {
            FastWriter.IIIIllIIlIl();
            FastWriter.llllIlIIlIl();
            IO_BUFFERS = IlIllllIl[0];
        }

        private static void llllIlIIlIl() {
            lllIlllIl = new String[IlIllllIl[4]];
            FastWriter.lllIlllIl[FastWriter.IlIllllIl[1]] = FastWriter.lIIIIlIIlIl("ReimD6JIAfM=", "CycaC");
            FastWriter.lllIlllIl[FastWriter.IlIllllIl[2]] = FastWriter.lIIIIlIIlIl("GQ3Yzbk82D0=", "ulFCg");
            FastWriter.lllIlllIl[FastWriter.IlIllllIl[3]] = FastWriter.IlllIlIIlIl("YA==", "jKXEJ");
        }

        /*
         * Unable to fully structure code
         */
        private static String IlllIlIIlIl(String IlIIIIIIIlllIl, String lIIIIIIIIlllIl) {
            IlIIIIIIIlllIl = new String(Base64.getDecoder().decode(IlIIIIIIIlllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            IIIIIIIIIlllIl = new StringBuilder();
            lllllllllIllIl = lIIIIIIIIlllIl.toCharArray();
            IllllllllIllIl = FastWriter.IlIllllIl[1];
            IIlIlllllIllIl = IlIIIIIIIlllIl.toCharArray();
            lIlIlllllIllIl = IIlIlllllIllIl.length;
            IllIlllllIllIl = FastWriter.IlIllllIl[1];
            "".length();
            if (" ".length() > 0) ** GOTO lbl19
            return null;
lbl-1000:
            // 1 sources

            {
                lIlllllllIllIl = IIlIlllllIllIl[IllIlllllIllIl];
                IIIIIIIIIlllIl.append((char)(lIlllllllIllIl ^ lllllllllIllIl[IllllllllIllIl % lllllllllIllIl.length]));
                "".length();
                ++IllllllllIllIl;
                ++IllIlllllIllIl;
lbl19:
                // 2 sources

                ** while (!FastWriter.IlIIllIIlIl((int)IllIlllllIllIl, (int)lIlIlllllIllIl))
            }
lbl20:
            // 1 sources

            return String.valueOf(IIIIIIIIIlllIl);
        }

        private static String lIIIIlIIlIl(String llllIllllIllIl, String IlllIllllIllIl) {
            try {
                SecretKeySpec lIllIllllIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IlllIllllIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                Cipher IIllIllllIllIl = Cipher.getInstance("Blowfish");
                IIllIllllIllIl.init(IlIllllIl[3], lIllIllllIllIl);
                return new String(IIllIllllIllIl.doFinal(Base64.getDecoder().decode(llllIllllIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llIlIllllIllIl) {
                llIlIllllIllIl.printStackTrace();
                return null;
            }
        }

        private static void IIIIllIIlIl() {
            IlIllllIl = new int[5];
            FastWriter.IlIllllIl[0] = " ".length() << ((0 ^ 0x25) << " ".length() ^ (0xDE ^ 0x85));
            FastWriter.IlIllllIl[1] = (0xDB ^ 0x8A) & ~(0x4D ^ 0x1C);
            FastWriter.IlIllllIl[2] = " ".length();
            FastWriter.IlIllllIl[3] = " ".length() << " ".length();
            FastWriter.IlIllllIl[4] = "   ".length();
        }

        private static boolean IlIIllIIlIl(int n, int n2) {
            return n >= n2;
        }

        private static boolean lIIIllIIlIl(int n, int n2) {
            return n < n2;
        }
    }
}

