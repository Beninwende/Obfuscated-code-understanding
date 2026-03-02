/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.NoSuchElementException;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Main {
    static FastScanner sc;
    private static int[] llIllIll;

    public Main() {
        Main IIlIllIIIIIIIIl;
    }

    public static void main(String[] stringArray) {
        int llIlIlIIIIIIIIl = sc.nextInt();
        int IlIlIlIIIIIIIIl = sc.nextInt();
        int lIIlIlIIIIIIIIl = sc.nextInt();
        int[] IIIlIlIIIIIIIIl = new int[IlIlIlIIIIIIIIl];
        int lllIIlIIIIIIIIl = llIllIll[0];
        while (Main.lIlIIlllIl(lllIIlIIIIIIIIl, IlIlIlIIIIIIIIl)) {
            IIIlIlIIIIIIIIl[lllIIlIIIIIIIIl] = sc.nextInt();
            ++lllIIlIIIIIIIIl;
            "".length();
            if (-"  ".length() <= 0) continue;
            return;
        }
        lllIIlIIIIIIIIl = llIllIll[0];
        int IllIIlIIIIIIIIl = llIllIll[0];
        while (Main.lIlIIlllIl(IllIIlIIIIIIIIl, llIlIlIIIIIIIIl)) {
            int lIlIIlIIIIIIIIl = lIIlIlIIIIIIIIl;
            int IIlIIlIIIIIIIIl = llIllIll[0];
            while (Main.lIlIIlllIl(IIlIIlIIIIIIIIl, IlIlIlIIIIIIIIl)) {
                lIlIIlIIIIIIIIl += sc.nextInt() * IIIlIlIIIIIIIIl[IIlIIlIIIIIIIIl];
                ++IIlIIlIIIIIIIIl;
                "".length();
                if (-" ".length() <= 0) continue;
                return;
            }
            if (Main.IIIlIlllIl(lIlIIlIIIIIIIIl)) {
                ++lllIIlIIIIIIIIl;
            }
            ++IllIIlIIIIIIIIl;
            "".length();
            if (((0x74 ^ 0x25 ^ (0x14 ^ 0xB) << (" ".length() << " ".length())) << " ".length() & ((0xD9 ^ 0x9E ^ (0xAC ^ 0x99) << " ".length()) << " ".length() ^ -" ".length())) == 0) continue;
            return;
        }
        System.out.println(lllIIlIIIIIIIIl);
    }

    static {
        Main.lIIIIlllIl();
        sc = new FastScanner();
    }

    private static void lIIIIlllIl() {
        llIllIll = new int[1];
        Main.llIllIll[0] = "   ".length() << "   ".length() & ("   ".length() << "   ".length() ^ -" ".length());
    }

    private static boolean lIlIIlllIl(int n, int n2) {
        return n < n2;
    }

    private static boolean IIIlIlllIl(int n) {
        return n > 0;
    }

    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[lIIIIlll[0]];
        private int ptr = lIIIIlll[1];
        private int buflen = lIIIIlll[1];
        private static int[] lIIIIlll;

        FastScanner() {
            FastScanner IIlllIIIIIIIIIl;
        }

        private boolean hasNextByte() {
            FastScanner lIIllIIIIIIIIIl;
            if (FastScanner.lIIlIlllIl(lIIllIIIIIIIIIl.ptr, lIIllIIIIIIIIIl.buflen)) {
                return lIIIIlll[2];
            }
            lIIllIIIIIIIIIl.ptr = lIIIIlll[1];
            try {
                lIIllIIIIIIIIIl.buflen = lIIllIIIIIIIIIl.in.read(lIIllIIIIIIIIIl.buffer);
                "".length();
            }
            catch (IOException IIIllIIIIIIIIIl) {
                IIIllIIIIIIIIIl.printStackTrace();
            }
            if ((" ".length() << ("   ".length() << " ".length()) & ~(" ".length() << ("   ".length() << " ".length()))) <= -" ".length()) {
                return ((0x60 ^ 0x7D) & ~(0x78 ^ 0x65)) != 0;
            }
            if (FastScanner.IlIlIlllIl(lIIllIIIIIIIIIl.buflen)) {
                return lIIIIlll[1];
            }
            return lIIIIlll[2];
        }

        private int readByte() {
            FastScanner IllIlIIIIIIIIIl;
            if (FastScanner.llIlIlllIl(IllIlIIIIIIIIIl.hasNextByte() ? 1 : 0)) {
                int n = IllIlIIIIIIIIIl.ptr;
                IllIlIIIIIIIIIl.ptr = n + lIIIIlll[2];
                return IllIlIIIIIIIIIl.buffer[n];
            }
            return lIIIIlll[3];
        }

        private static boolean isPrintableChar(int IIlIlIIIIIIIIIl) {
            int n;
            if (FastScanner.IIllIlllIl(lIIIIlll[4], IIlIlIIIIIIIIIl) && FastScanner.IIllIlllIl(IIlIlIIIIIIIIIl, lIIIIlll[5])) {
                n = lIIIIlll[2];
                "".length();
                if (null != null) {
                    return ((0x50 ^ 0x4B) & ~(0x29 ^ 0x32)) != 0;
                }
            } else {
                n = lIIIIlll[1];
            }
            return n != 0;
        }

        private void skipUnprintable() {
            FastScanner IlIIlIIIIIIIIIl;
            while (FastScanner.llIlIlllIl(IlIIlIIIIIIIIIl.hasNextByte() ? 1 : 0) && FastScanner.lIllIlllIl(FastScanner.isPrintableChar(IlIIlIIIIIIIIIl.buffer[IlIIlIIIIIIIIIl.ptr]) ? 1 : 0)) {
                IlIIlIIIIIIIIIl.ptr += lIIIIlll[2];
                "".length();
                if ((" ".length() << (0x80 ^ 0x85) & ~(" ".length() << (0x67 ^ 0x62))) < "   ".length()) continue;
                return;
            }
        }

        public boolean hasNext() {
            FastScanner IIIIlIIIIIIIIIl;
            IIIIlIIIIIIIIIl.skipUnprintable();
            return this.hasNextByte();
        }

        /*
         * WARNING - void declaration
         */
        public String next() {
            void var1_1;
            FastScanner IIllIIIIIIIIIIl;
            if (FastScanner.lIllIlllIl(IIllIIIIIIIIIIl.hasNext() ? 1 : 0)) {
                throw new NoSuchElementException();
            }
            StringBuilder llIlIIIIIIIIIIl = new StringBuilder();
            int IlIlIIIIIIIIIIl = IIllIIIIIIIIIIl.readByte();
            while (FastScanner.llIlIlllIl(FastScanner.isPrintableChar(IlIlIIIIIIIIIIl) ? 1 : 0)) {
                llIlIIIIIIIIIIl.appendCodePoint(IlIlIIIIIIIIIIl);
                "".length();
                IlIlIIIIIIIIIIl = IIllIIIIIIIIIIl.readByte();
                "".length();
                if (" ".length() << " ".length() != 0) continue;
                return null;
            }
            return String.valueOf(var1_1);
        }

        public long nextLong() {
            FastScanner lIlIIIIIIIIIIIl;
            if (FastScanner.lIllIlllIl(lIlIIIIIIIIIIIl.hasNext() ? 1 : 0)) {
                throw new NoSuchElementException();
            }
            long IIlIIIIIIIIIIIl = 0L;
            int llIIIIIIIIIIIIl = lIIIIlll[1];
            int IlIIIIIIIIIIIIl = lIlIIIIIIIIIIIl.readByte();
            if (FastScanner.llllIlllIl(IlIIIIIIIIIIIIl, lIIIIlll[6])) {
                llIIIIIIIIIIIIl = lIIIIlll[2];
                IlIIIIIIIIIIIIl = lIlIIIIIIIIIIIl.readByte();
            }
            if (!FastScanner.IIIIllllIl(IlIIIIIIIIIIIIl, lIIIIlll[7]) || FastScanner.lIIlIlllIl(lIIIIlll[8], IlIIIIIIIIIIIIl)) {
                throw new NumberFormatException();
            }
            do {
                if (FastScanner.IIllIlllIl(lIIIIlll[7], IlIIIIIIIIIIIIl) && FastScanner.IIllIlllIl(IlIIIIIIIIIIIIl, lIIIIlll[8])) {
                    IIlIIIIIIIIIIIl *= 10L;
                    IIlIIIIIIIIIIIl += (long)(IlIIIIIIIIIIIIl - lIIIIlll[7]);
                    "".length();
                    if (" ".length() << " ".length() <= 0) {
                        return 0L;
                    }
                } else {
                    if (!FastScanner.lIIIllllIl(IlIIIIIIIIIIIIl, lIIIIlll[3]) || FastScanner.lIllIlllIl(FastScanner.isPrintableChar(IlIIIIIIIIIIIIl) ? 1 : 0)) {
                        long l;
                        if (FastScanner.llIlIlllIl(llIIIIIIIIIIIIl)) {
                            l = -IIlIIIIIIIIIIIl;
                            "".length();
                            if ("   ".length() < 0) {
                                return 0L;
                            }
                        } else {
                            l = IIlIIIIIIIIIIIl;
                        }
                        return l;
                    }
                    throw new NumberFormatException();
                }
                int n = this.readByte();
                "".length();
            } while ((0xB ^ 0xE) > 0);
            return 0L;
        }

        public int nextInt() {
            FastScanner IIIIIIIIIIIIIIl;
            return (int)IIIIIIIIIIIIIIl.nextLong();
        }

        static {
            FastScanner.IllIIlllIl();
        }

        private static void IllIIlllIl() {
            lIIIIlll = new int[9];
            FastScanner.lIIIIlll[0] = " ".length() << ((0x74 ^ 9 ^ (0x4A ^ 0x45) << "   ".length()) << " ".length());
            FastScanner.lIIIIlll[1] = " ".length() << " ".length() & ~(" ".length() << " ".length());
            FastScanner.lIIIIlll[2] = " ".length();
            FastScanner.lIIIIlll[3] = -" ".length();
            FastScanner.lIIIIlll[4] = 0x62 ^ 0x51 ^ (0xC9 ^ 0xC0) << " ".length();
            FastScanner.lIIIIlll[5] = (42 + 121 - 102 + 72 ^ (0x16 ^ 0x4B) << " ".length()) << " ".length();
            FastScanner.lIIIIlll[6] = 0x68 ^ 0x45;
            FastScanner.lIIIIlll[7] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
            FastScanner.lIIIIlll[8] = (0x4C ^ 0x75) << " ".length() ^ (0x18 ^ 0x53);
        }

        private static boolean llllIlllIl(int n, int n2) {
            return n == n2;
        }

        private static boolean IIIIllllIl(int n, int n2) {
            return n >= n2;
        }

        private static boolean lIIlIlllIl(int n, int n2) {
            return n < n2;
        }

        private static boolean IIllIlllIl(int n, int n2) {
            return n <= n2;
        }

        private static boolean llIlIlllIl(int n) {
            return n != 0;
        }

        private static boolean lIllIlllIl(int n) {
            return n == 0;
        }

        private static boolean IlIlIlllIl(int n) {
            return n <= 0;
        }

        private static boolean lIIIllllIl(int n, int n2) {
            return n != n2;
        }
    }

    static class TreeList<E>
    extends ArrayList<E> {
        Comparator<? super E> comparator;
        private static int[] IIlllIll;

        TreeList(Comparator<? super E> IIIIIlllllllll) {
            TreeList lIIIIlllllllll;
            lIIIIlllllllll.comparator = IIIIIlllllllll;
        }

        @Override
        public boolean add(E IIlIlIllllllll) {
            TreeList lIlIlIllllllll;
            int llIIlIllllllll = IIlllIll[0];
            int IlIIlIllllllll = lIlIlIllllllll.size() - IIlllIll[1];
            int lIIIlIllllllll = IIlllIll[0];
            if (TreeList.lllIIlllIl(lIlIlIllllllll.size())) {
                super.add(IIlIlIllllllll);
                "".length();
                return IIlllIll[1];
            }
            if (TreeList.IlIlIlllIl(lIlIlIllllllll.comparator.compare(IIlIlIllllllll, lIlIlIllllllll.get(IIlllIll[0])))) {
                lIIIlIllllllll = IIlllIll[0];
                "".length();
                if (-"   ".length() >= 0) {
                    return ((0x59 ^ 0xA ^ (0x30 ^ 1) << " ".length()) << " ".length() & (((0xAE ^ 0xA1) << (" ".length() << (" ".length() << " ".length())) ^ 104 + 126 - 151 + 114) << " ".length() ^ -" ".length())) != 0;
                }
            } else if (TreeList.IlllIlllIl(lIlIlIllllllll.comparator.compare(IIlIlIllllllll, lIlIlIllllllll.get(IlIIlIllllllll)))) {
                lIIIlIllllllll = IlIIlIllllllll + IIlllIll[1];
                "".length();
                if ("   ".length() < ((0xA4 ^ 0xA3 ^ " ".length() << " ".length()) << " ".length() & ((81 + 132 - 105 + 39 ^ (0x8C ^ 0xC7) << " ".length()) << " ".length() ^ -" ".length()))) {
                    return (((0x95 ^ 0xB0) << (" ".length() << " ".length()) ^ 99 + 56 - 147 + 181) & ((0x9D ^ 0x80) << "   ".length() ^ 142 + 150 - 130 + 31 ^ -" ".length())) != 0;
                }
            } else {
                while (TreeList.IIlIllllIl(llIIlIllllllll, IlIIlIllllllll)) {
                    if (!TreeList.lIlIllllIl(IlIIlIllllllll, llIIlIllllllll + IIlllIll[1]) || TreeList.IllIllllIl(IlIIlIllllllll, llIIlIllllllll)) {
                        lIIIlIllllllll = IlIIlIllllllll;
                        "".length();
                        if ((0x24 ^ 0xF ^ (0x9B ^ 0x8C) << " ".length()) > 0) break;
                        return ((0x3A ^ 0x11 ^ (0x7D ^ 0x70) << (" ".length() << " ".length())) & ((0x7B ^ 0x16) << " ".length() ^ 118 + 122 - 239 + 196 ^ -" ".length())) != 0;
                    }
                    int IIIIlIllllllll = (llIIlIllllllll + IlIIlIllllllll) / IIlllIll[2];
                    if (TreeList.IlllIlllIl(lIlIlIllllllll.comparator.compare(IIlIlIllllllll, lIlIlIllllllll.get(IIIIlIllllllll)))) {
                        llIIlIllllllll = IIIIlIllllllll;
                        "".length();
                        if (null != null) {
                            return (((0x7D ^ 0x78) << (" ".length() << " ".length()) ^ (0x9D ^ 0x82)) << (" ".length() << " ".length()) & (((0xEE ^ 0xB5) << " ".length() ^ 0 + 168 - 63 + 84) << (" ".length() << " ".length()) ^ -" ".length())) != 0;
                        }
                    } else {
                        IlIIlIllllllll = IIIIlIllllllll;
                    }
                    "".length();
                    if (" ".length() > ("   ".length() << (" ".length() << (" ".length() << " ".length())) & ~("   ".length() << (" ".length() << (" ".length() << " ".length()))))) continue;
                    return ((0xA7 ^ 0xB8) << " ".length() & ~((0x4C ^ 0x53) << " ".length())) != 0;
                }
            }
            super.add(lIIIlIllllllll, IIlIlIllllllll);
            return IIlllIll[1];
        }

        static {
            TreeList.IlIIIlllIl();
        }

        private static void IlIIIlllIl() {
            IIlllIll = new int[3];
            TreeList.IIlllIll[0] = (0x5A ^ 0x51 ^ (0x56 ^ 0x63) << " ".length()) & (" ".length() << " ".length() ^ (0xC6 ^ 0xA5) ^ -" ".length());
            TreeList.IIlllIll[1] = " ".length();
            TreeList.IIlllIll[2] = " ".length() << " ".length();
        }

        private static boolean IllIllllIl(int n, int n2) {
            return n == n2;
        }

        private static boolean IIlIllllIl(int n, int n2) {
            return n <= n2;
        }

        private static boolean lllIIlllIl(int n) {
            return n == 0;
        }

        private static boolean IlIlIlllIl(int n) {
            return n < 0;
        }

        private static boolean IlllIlllIl(int n) {
            return n > 0;
        }

        private static boolean lIlIllllIl(int n, int n2) {
            return n != n2;
        }
    }

    static class BigInt
    extends BigInteger {
        BigInteger MOD;
        static BigInt ZERO;
        static BigInt ONE;
        static BigInt TEN;
        private static String[] IllllIll;
        private static int[] IlIIIlll;

        public BigInt(long IlIlllIlllllll) {
            super(Long.toString(IlIlllIlllllll));
            BigInt llIlllIlllllll;
            llIlllIlllllll.MOD = new BigInteger(IllllIll[IlIIIlll[0]]);
        }

        public BigInt(BigInteger IllIllIlllllll) {
            super(IllIllIlllllll.toByteArray());
            BigInt lllIllIlllllll;
            lllIllIlllllll.MOD = new BigInteger(IllllIll[IlIIIlll[1]]);
        }

        /*
         * WARNING - void declaration
         */
        @Override
        public BigInt pow(int IlIIllIlllllll) {
            void var1_1;
            return new BigInt(super.pow((int)var1_1));
        }

        /*
         * WARNING - void declaration
         */
        public BigInt[] divideAndRemainder(long IlllIlIlllllll) {
            void var1_1;
            BigInt llllIlIlllllll;
            return llllIlIlllllll.divideAndRemainder(new BigInt((long)var1_1));
        }

        /*
         * WARNING - void declaration
         */
        public BigInt[] divideAndRemainder(BigInt IIIlIlIlllllll) {
            void var2_2;
            BigInt lIIlIlIlllllll;
            BigInt[] lllIIlIlllllll = new BigInt[IlIIIlll[2]];
            BigInteger[] IllIIlIlllllll = super.divideAndRemainder(IIIlIlIlllllll);
            lllIIlIlllllll[BigInt.IlIIIlll[0]] = new BigInt(IllIIlIlllllll[IlIIIlll[0]]);
            lllIIlIlllllll[BigInt.IlIIIlll[1]] = new BigInt(IllIIlIlllllll[IlIIIlll[1]]);
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        public BigInt mod(long IlIIIlIlllllll) {
            void var1_1;
            BigInt llIIIlIlllllll;
            return llIIIlIlllllll.mod(new BigInt((long)var1_1));
        }

        /*
         * WARNING - void declaration
         */
        public BigInt mod(BigInt IllllIIlllllll) {
            void var1_1;
            return new BigInt(super.mod((BigInteger)var1_1));
        }

        public BigInt mod() {
            return new BigInt(super.mod(this.MOD));
        }

        /*
         * WARNING - void declaration
         */
        public BigInt add(long IIIllIIlllllll) {
            void var1_1;
            BigInt lIIllIIlllllll;
            return lIIllIIlllllll.add(new BigInt((long)var1_1));
        }

        /*
         * WARNING - void declaration
         */
        public BigInt add(BigInt IIlIlIIlllllll) {
            void var1_1;
            return new BigInt(super.add((BigInteger)var1_1));
        }

        /*
         * WARNING - void declaration
         */
        public BigInt subtract(long IIIIlIIlllllll) {
            void var1_1;
            BigInt lIIIlIIlllllll;
            return lIIIlIIlllllll.subtract(new BigInt((long)var1_1));
        }

        /*
         * WARNING - void declaration
         */
        public BigInt subtract(BigInt IIllIIIlllllll) {
            void var1_1;
            return new BigInt(super.subtract((BigInteger)var1_1));
        }

        /*
         * WARNING - void declaration
         */
        public BigInt multiply(long IIIlIIIlllllll) {
            void var1_1;
            BigInt lIIlIIIlllllll;
            return lIIlIIIlllllll.multiply(new BigInt((long)var1_1));
        }

        /*
         * WARNING - void declaration
         */
        public BigInt multiply(BigInt IIlIIIIlllllll) {
            void var1_1;
            return new BigInt(super.multiply((BigInteger)var1_1));
        }

        /*
         * WARNING - void declaration
         */
        public BigInt divide(long IIIIIIIlllllll) {
            void var1_1;
            BigInt lIIIIIIlllllll;
            return lIIIIIIlllllll.divide(new BigInt((long)var1_1));
        }

        /*
         * WARNING - void declaration
         */
        public BigInt divide(BigInt IIlllllIllllll) {
            void var1_1;
            return new BigInt(super.divide((BigInteger)var1_1));
        }

        @Override
        public BigInt abs() {
            return new BigInt(super.abs());
        }

        static {
            BigInt.lIIlllllIl();
            BigInt.IIIlllllIl();
            ZERO = new BigInt(0L);
            ONE = new BigInt(1L);
            TEN = new BigInt(10L);
        }

        private static void IIIlllllIl() {
            IllllIll = new String[IlIIIlll[2]];
            BigInt.IllllIll[BigInt.IlIIIlll[0]] = BigInt.IIlIIlllIl("pKeeWmj+8v/qrUrQjN/E1Q==", "cNTjT");
            BigInt.IllllIll[BigInt.IlIIIlll[1]] = BigInt.lllIllllIl("wvHWcJoKYHSvhavuaJl6NQ==", "JsfPz");
        }

        private static String IIlIIlllIl(String IlllIllIllllll, String lIllIllIllllll) {
            try {
                SecretKeySpec IIllIllIllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIllIllIllllll.getBytes(StandardCharsets.UTF_8)), IlIIIlll[3]), "DES");
                Cipher llIlIllIllllll = Cipher.getInstance("DES");
                llIlIllIllllll.init(IlIIIlll[2], IIllIllIllllll);
                return new String(llIlIllIllllll.doFinal(Base64.getDecoder().decode(IlllIllIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception IlIlIllIllllll) {
                IlIlIllIllllll.printStackTrace();
                return null;
            }
        }

        private static String lllIllllIl(String lIIIIllIllllll, String IIIIIllIllllll) {
            try {
                SecretKeySpec lllllIlIllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IIIIIllIllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                Cipher IllllIlIllllll = Cipher.getInstance("Blowfish");
                IllllIlIllllll.init(IlIIIlll[2], lllllIlIllllll);
                return new String(IllllIlIllllll.doFinal(Base64.getDecoder().decode(lIIIIllIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lIlllIlIllllll) {
                lIlllIlIllllll.printStackTrace();
                return null;
            }
        }

        private static void lIIlllllIl() {
            IlIIIlll = new int[4];
            BigInt.IlIIIlll[0] = " ".length() << ((0xB5 ^ 0xBA) << (" ".length() << " ".length()) ^ (0xBA ^ 0x83)) & (" ".length() << ((0x9B ^ 0xBE) << (" ".length() << " ".length()) ^ 69 + 66 - 99 + 109) ^ -" ".length());
            BigInt.IlIIIlll[1] = " ".length();
            BigInt.IlIIIlll[2] = " ".length() << " ".length();
            BigInt.IlIIIlll[3] = " ".length() << "   ".length();
        }
    }

    static class Debugger {
        static long startTime;
        static boolean on;
        private static int[] lllllIll;

        Debugger() {
            Debugger IIlIIlllllllll;
        }

        static void start() {
            startTime = System.currentTimeMillis();
        }

        static void printTime() {
            if (Debugger.IlIIllllIl(on ? 1 : 0)) {
                System.out.println("(" + (System.currentTimeMillis() - startTime) + "ms)");
            }
        }

        static void toggle() {
            int n;
            if (Debugger.llIIllllIl(on ? 1 : 0)) {
                n = lllllIll[0];
                "".length();
                if ("   ".length() <= -" ".length()) {
                    return;
                }
            } else {
                n = lllllIll[1];
            }
            on = n;
        }

        static {
            Debugger.llIIIlllIl();
            on = lllllIll[0];
        }

        private static void llIIIlllIl() {
            lllllIll = new int[2];
            Debugger.lllllIll[0] = " ".length();
            Debugger.lllllIll[1] = (" ".length() << " ".length() ^ (0x3E ^ 0x7F)) & ("   ".length() << (" ".length() << " ".length()) ^ (0x3B ^ 0x74) ^ -" ".length());
        }

        private static boolean IlIIllllIl(int n) {
            return n != 0;
        }

        private static boolean llIIllllIl(int n) {
            return n == 0;
        }
    }
}

