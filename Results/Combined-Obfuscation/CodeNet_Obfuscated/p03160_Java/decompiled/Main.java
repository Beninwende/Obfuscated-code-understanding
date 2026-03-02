/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Main {
    static int[] minCostFrom;
    private static int[] IIlIllllIl;

    public Main() {
        Main lIllIIlIlIlllll;
    }

    /*
     * WARNING - void declaration
     */
    static int solve(int lllIIIlIlIlllll, int[] IllIIIlIlIlllll) {
        void var4_4;
        void var3_3;
        int lIlIIIlIlIlllll = IllIIIlIlIlllll.length;
        if (Main.IllllIIlIlIl(lllIIIlIlIlllll, lIlIIIlIlIlllll)) {
            return IIlIllllIl[0];
        }
        if (Main.lllllIIlIlIl(lllIIIlIlIlllll, lIlIIIlIlIlllll - IIlIllllIl[1])) {
            return IIlIllllIl[2];
        }
        if (Main.IIIIIlIlIlIl(minCostFrom[lllIIIlIlIlllll], IIlIllllIl[3])) {
            return minCostFrom[lllIIIlIlIlllll];
        }
        int IIlIIIlIlIlllll = IIlIllllIl[0];
        int llIIIIlIlIlllll = IIlIllllIl[0];
        if (Main.lIIIIlIlIlIl(lllIIIlIlIlllll + IIlIllllIl[1], lIlIIIlIlIlllll)) {
            IIlIIIlIlIlllll = Math.abs(IllIIIlIlIlllll[lllIIIlIlIlllll] - IllIIIlIlIlllll[lllIIIlIlIlllll + IIlIllllIl[1]]) + Main.solve(lllIIIlIlIlllll + IIlIllllIl[1], IllIIIlIlIlllll);
        }
        if (Main.lIIIIlIlIlIl(lllIIIlIlIlllll + IIlIllllIl[4], lIlIIIlIlIlllll)) {
            llIIIIlIlIlllll = Math.abs(IllIIIlIlIlllll[lllIIIlIlIlllll] - IllIIIlIlIlllll[lllIIIlIlIlllll + IIlIllllIl[4]]) + Main.solve(lllIIIlIlIlllll + IIlIllllIl[4], IllIIIlIlIlllll);
        }
        Main.minCostFrom[var0] = Math.min((int)var3_3, (int)var4_4);
        return Main.minCostFrom[var0];
    }

    public static void main(String[] stringArray) throws Exception {
        Foster IlllllIIlIlllll = new Foster();
        PrintWriter lIllllIIlIlllll = new PrintWriter(System.out);
        int IIllllIIlIlllll = IlllllIIlIlllll.nextInt();
        minCostFrom = new int[IIllllIIlIlllll];
        Arrays.fill(minCostFrom, IIlIllllIl[3]);
        int[] llIlllIIlIlllll = IlllllIIlIlllll.intArray(IIllllIIlIlllll);
        lIllllIIlIlllll.println(Main.solve(IIlIllllIl[2], llIlllIIlIlllll));
        lIllllIIlIlllll.close();
    }

    static {
        Main.IIlllIIlIlIl();
    }

    private static void IIlllIIlIlIl() {
        IIlIllllIl = new int[5];
        Main.IIlIllllIl[0] = 11297856 + 166692240 - 115868283 + 0xF00FF44 + (233686970 + 102335905 - -88320325 + 101603727) - -(40286417 + 0xFFDCFF - 6150735 + 33174506) + (274571083 + 111438055 - 80290913 + 184994 << (" ".length() << " ".length()));
        Main.IIlIllllIl[1] = " ".length();
        Main.IIlIllllIl[2] = (108 + 54 - 127 + 124 ^ (0x91 ^ 0xBC) << (" ".length() << " ".length())) << " ".length() & ((0xC ^ 0x17 ^ "   ".length() << (" ".length() << (" ".length() << " ".length()))) << " ".length() ^ -" ".length());
        Main.IIlIllllIl[3] = -" ".length();
        Main.IIlIllllIl[4] = " ".length() << " ".length();
    }

    private static boolean lllllIIlIlIl(int n, int n2) {
        return n == n2;
    }

    private static boolean IllllIIlIlIl(int n, int n2) {
        return n >= n2;
    }

    private static boolean lIIIIlIlIlIl(int n, int n2) {
        return n < n2;
    }

    private static boolean IIIIIlIlIlIl(int n, int n2) {
        return n != n2;
    }

    static class Foster {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(lIlIllllIl[IllIllllIl[0]]);
        private static String[] lIlIllllIl;
        private static int[] IllIllllIl;

        Foster() {
            Foster lIIlIlIIlIlllll;
        }

        String next() {
            Foster IllIIlIIlIlllll;
            while (Foster.IllIIlIlIlIl(IllIIlIIlIlllll.st.hasMoreTokens() ? 1 : 0)) {
                try {
                    IllIIlIIlIlllll.st = new StringTokenizer(IllIIlIIlIlllll.br.readLine());
                    "".length();
                }
                catch (IOException lIlIIlIIlIlllll) {
                    lIlIIlIIlIlllll.printStackTrace();
                    "".length();
                    if (-(0x64 ^ 0x60) <= 0) continue;
                    return null;
                }
                if (" ".length() >= 0) continue;
                return null;
            }
            return this.st.nextToken();
        }

        int nextInt() {
            Foster llIIIlIIlIlllll;
            return Integer.parseInt(llIIIlIIlIlllll.next());
        }

        long nextLong() {
            Foster lIIIIlIIlIlllll;
            return Long.parseLong(lIIIIlIIlIlllll.next());
        }

        double nextDouble() {
            Foster lllllIIIlIlllll;
            return Double.parseDouble(lllllIIIlIlllll.next());
        }

        /*
         * WARNING - void declaration
         */
        int[] intArray(int lIIllIIIlIlllll) {
            void var2_2;
            int[] IIIllIIIlIlllll = new int[lIIllIIIlIlllll];
            int lllIlIIIlIlllll = IllIllllIl[0];
            while (Foster.lllIIlIlIlIl(lllIlIIIlIlllll, lIIllIIIlIlllll)) {
                Foster IlIllIIIlIlllll;
                IIIllIIIlIlllll[lllIlIIIlIlllll] = IlIllIIIlIlllll.nextInt();
                ++lllIlIIIlIlllll;
                "".length();
                if (" ".length() < "   ".length()) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        long[] longArray(int lIIIlIIIlIlllll) {
            void var2_2;
            long[] IIIIlIIIlIlllll = new long[lIIIlIIIlIlllll];
            int llllIIIIlIlllll = IllIllllIl[0];
            while (Foster.lllIIlIlIlIl(llllIIIIlIlllll, lIIIlIIIlIlllll)) {
                Foster IlIIlIIIlIlllll;
                IIIIlIIIlIlllll[llllIIIIlIlllll] = IlIIlIIIlIlllll.nextLong();
                ++llllIIIIlIlllll;
                "".length();
                if ("   ".length() >= 0) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        int[] getBits(int llIlIIIIlIlllll) {
            void var2_2;
            int[] IlIlIIIIlIlllll = new int[IllIllllIl[1]];
            int lIIlIIIIlIlllll = IllIllllIl[0];
            while (Foster.lllIIlIlIlIl(lIIlIIIIlIlllll, IllIllllIl[1])) {
                if (Foster.IIIlIlIlIlIl(IllIllllIl[2] << lIIlIIIIlIlllll & llIlIIIIlIlllll)) {
                    IlIlIIIIlIlllll[lIIlIIIIlIlllll] = IllIllllIl[2];
                }
                ++lIIlIIIIlIlllll;
                "".length();
                if (" ".length() << " ".length() <= " ".length() << " ".length()) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        static long pow(long ... lIlIIIIIlIlllll) {
            void var3_2;
            long IIlIIIIIlIlllll = Long.MAX_VALUE;
            if (Foster.IlIlIlIlIlIl(lIlIIIIIlIlllll.length, IllIllllIl[3])) {
                IIlIIIIIlIlllll = lIlIIIIIlIlllll[IllIllllIl[4]];
            }
            long llIIIIIIlIlllll = 1L;
            while (Foster.llIlIlIlIlIl(Foster.lIIlIlIlIlIl(lIlIIIIIlIlllll[IllIllllIl[2]], 0L))) {
                if (Foster.IllIIlIlIlIl(Foster.lIIlIlIlIlIl(lIlIIIIIlIlllll[IllIllllIl[2]] & 1L, 1L))) {
                    llIIIIIIlIlllll = llIIIIIIlIlllll * lIlIIIIIlIlllll[IllIllllIl[0]] % IIlIIIIIlIlllll;
                }
                int n = IllIllllIl[2];
                lIlIIIIIlIlllll[n] = lIlIIIIIlIlllll[n] / 2L;
                lIlIIIIIlIlllll[Foster.IllIllllIl[0]] = lIlIIIIIlIlllll[IllIllllIl[0]] * lIlIIIIIlIlllll[IllIllllIl[0]] % IIlIIIIIlIlllll;
                "".length();
                if (null == null) continue;
                return 0L;
            }
            return (long)var3_2;
        }

        static void print(Object ... lIllllllIIlllll) {
            Object[] IIllllllIIlllll = lIllllllIIlllll;
            int llIlllllIIlllll = IIllllllIIlllll.length;
            int IlIlllllIIlllll = IllIllllIl[0];
            while (Foster.lllIIlIlIlIl(IlIlllllIIlllll, llIlllllIIlllll)) {
                Object lIIlllllIIlllll = IIllllllIIlllll[IlIlllllIIlllll];
                System.err.print(String.valueOf(lIIlllllIIlllll) + " ");
                ++IlIlllllIIlllll;
                "".length();
                if (" ".length() << " ".length() > 0) continue;
                return;
            }
        }

        static void println(Object ... llIIllllIIlllll) {
            Object[] IlIIllllIIlllll = llIIllllIIlllll;
            int lIIIllllIIlllll = IlIIllllIIlllll.length;
            int IIIIllllIIlllll = IllIllllIl[0];
            while (Foster.lllIIlIlIlIl(IIIIllllIIlllll, lIIIllllIIlllll)) {
                Object llllIlllIIlllll = IlIIllllIIlllll[IIIIllllIIlllll];
                System.err.print(String.valueOf(llllIlllIIlllll) + " ");
                ++IIIIllllIIlllll;
                "".length();
                if (-" ".length() < " ".length() << " ".length()) continue;
                return;
            }
            System.err.println();
        }

        static void watch(Object ... llIIIlllIIlllll) throws Exception {
            int IlIIIlllIIlllll = IllIllllIl[2];
            Object[] lIIIIlllIIlllll = llIIIlllIIlllll;
            int IIIIIlllIIlllll = lIIIIlllIIlllll.length;
            int lllllIllIIlllll = IllIllllIl[0];
            while (Foster.lllIIlIlIlIl(lllllIllIIlllll, IIIIIlllIIlllll)) {
                Object IllllIllIIlllll = lIIIIlllIIlllll[lllllIllIIlllll];
                int lIlllIllIIlllll = IllIllllIl[0];
                if (Foster.IIIlIlIlIlIl(IllllIllIIlllll.getClass().isArray() ? 1 : 0)) {
                    String IIlllIllIIlllll;
                    String llIllIllIIlllll = IIlllIllIIlllll = IllllIllIIlllll.getClass().getName().toString();
                    int IlIllIllIIlllll = IllIllllIl[5];
                    switch (llIllIllIIlllll.hashCode()) {
                        case 2894: {
                            if (!Foster.IIIlIlIlIlIl(llIllIllIIlllll.equals(lIlIllllIl[IllIllllIl[2]]) ? 1 : 0)) break;
                            IlIllIllIIlllll = IllIllllIl[0];
                            "".length();
                            if (" ".length() << (" ".length() << " ".length()) > ((0x22 ^ 0x3D) << " ".length() & ~((0xB8 ^ 0xA7) << " ".length()))) break;
                            return;
                        }
                        case 90345: {
                            if (!Foster.IIIlIlIlIlIl(llIllIllIIlllll.equals(lIlIllllIl[IllIllllIl[4]]) ? 1 : 0)) break;
                            IlIllIllIIlllll = IllIllllIl[2];
                            "".length();
                            if (" ".length() > 0) break;
                            return;
                        }
                        case 2895: {
                            if (!Foster.IIIlIlIlIlIl(llIllIllIIlllll.equals(lIlIllllIl[IllIllllIl[3]]) ? 1 : 0)) break;
                            IlIllIllIIlllll = IllIllllIl[4];
                            "".length();
                            if ("   ".length() <= "   ".length()) break;
                            return;
                        }
                        case 90346: {
                            if (!Foster.IIIlIlIlIlIl(llIllIllIIlllll.equals(lIlIllllIl[IllIllllIl[6]]) ? 1 : 0)) break;
                            IlIllIllIIlllll = IllIllllIl[3];
                            "".length();
                            if (" ".length() > 0) break;
                            return;
                        }
                        case 2889: {
                            if (!Foster.IIIlIlIlIlIl(llIllIllIIlllll.equals(lIlIllllIl[IllIllllIl[7]]) ? 1 : 0)) break;
                            IlIllIllIIlllll = IllIllllIl[6];
                            "".length();
                            if ((((0xC2 ^ 0xC5) << (" ".length() << " ".length()) ^ (0x18 ^ 0x1D)) << " ".length() & (((0x39 ^ 0x18) << " ".length() ^ (0x77 ^ 0x2C)) << " ".length() ^ -" ".length())) >= 0) break;
                            return;
                        }
                        case 90340: {
                            if (!Foster.IIIlIlIlIlIl(llIllIllIIlllll.equals(lIlIllllIl[IllIllllIl[8]]) ? 1 : 0)) break;
                            IlIllIllIIlllll = IllIllllIl[7];
                            "".length();
                            if (" ".length() << (" ".length() << " ".length()) > ((1 ^ 4) << "   ".length() & ~((0x35 ^ 0x30) << "   ".length()))) break;
                            return;
                        }
                        case 428310454: {
                            if (!Foster.IIIlIlIlIlIl(llIllIllIIlllll.equals(lIlIllllIl[IllIllllIl[9]]) ? 1 : 0)) break;
                            IlIllIllIIlllll = IllIllllIl[8];
                            "".length();
                            if (" ".length() << (" ".length() << " ".length()) != " ".length()) break;
                            return;
                        }
                        case 890781521: {
                            if (!Foster.IIIlIlIlIlIl(llIllIllIIlllll.equals(lIlIllllIl[IllIllllIl[10]]) ? 1 : 0)) break;
                            IlIllIllIIlllll = IllIllllIl[9];
                            "".length();
                            if (-"  ".length() < 0) break;
                            return;
                        }
                        case 2888: {
                            if (!Foster.IIIlIlIlIlIl(llIllIllIIlllll.equals(lIlIllllIl[IllIllllIl[11]]) ? 1 : 0)) break;
                            IlIllIllIIlllll = IllIllllIl[10];
                            "".length();
                            if (" ".length() << " ".length() >= " ".length()) break;
                            return;
                        }
                        case 90339: {
                            if (!Foster.IIIlIlIlIlIl(llIllIllIIlllll.equals(lIlIllllIl[IllIllllIl[12]]) ? 1 : 0)) break;
                            IlIllIllIIlllll = IllIllllIl[11];
                        }
                    }
                    switch (IlIllIllIIlllll) {
                        case 0: {
                            Object lIIllIllIIlllll = (int[])IllllIllIIlllll;
                            Object[] objectArray = new Object[IllIllllIl[2]];
                            objectArray[Foster.IllIllllIl[0]] = IlIIIlllIIlllll + " : " + Arrays.toString(lIIllIllIIlllll);
                            Foster.println(objectArray);
                            "".length();
                            if (" ".length() != 0) break;
                            return;
                        }
                        case 1: {
                            Object lIIllIllIIlllll = (int[][])IllllIllIIlllll;
                            Object[] objectArray = new Object[IllIllllIl[2]];
                            objectArray[Foster.IllIllllIl[0]] = IlIIIlllIIlllll + " : " + Arrays.deepToString(lIIllIllIIlllll);
                            Foster.println(objectArray);
                            "".length();
                            if ("   ".length() >= 0) break;
                            return;
                        }
                        case 2: {
                            Object lIIllIllIIlllll = (long[])IllllIllIIlllll;
                            Object[] objectArray = new Object[IllIllllIl[2]];
                            objectArray[Foster.IllIllllIl[0]] = IlIIIlllIIlllll + " : " + Arrays.toString((long[])lIIllIllIIlllll);
                            Foster.println(objectArray);
                            "".length();
                            if (" ".length() << " ".length() != " ".length()) break;
                            return;
                        }
                        case 3: {
                            Object lIIllIllIIlllll = (long[][])IllllIllIIlllll;
                            Object[] objectArray = new Object[IllIllllIl[2]];
                            objectArray[Foster.IllIllllIl[0]] = IlIIIlllIIlllll + " : " + Arrays.deepToString(lIIllIllIIlllll);
                            Foster.println(objectArray);
                            "".length();
                            if (null == null) break;
                            return;
                        }
                        case 4: {
                            Object lIIllIllIIlllll = (double[])IllllIllIIlllll;
                            Object[] objectArray = new Object[IllIllllIl[2]];
                            objectArray[Foster.IllIllllIl[0]] = IlIIIlllIIlllll + " : " + Arrays.toString((double[])lIIllIllIIlllll);
                            Foster.println(objectArray);
                            "".length();
                            if (null == null) break;
                            return;
                        }
                        case 5: {
                            Object lIIllIllIIlllll = (double[][])IllllIllIIlllll;
                            Object[] objectArray = new Object[IllIllllIl[2]];
                            objectArray[Foster.IllIllllIl[0]] = IlIIIlllIIlllll + " : " + Arrays.deepToString(lIIllIllIIlllll);
                            Foster.println(objectArray);
                            "".length();
                            if (" ".length() < " ".length() << " ".length()) break;
                            return;
                        }
                        case 6: {
                            Object lIIllIllIIlllll = (String[])IllllIllIIlllll;
                            Object[] objectArray = new Object[IllIllllIl[2]];
                            objectArray[Foster.IllIllllIl[0]] = IlIIIlllIIlllll + " : " + Arrays.toString((Object[])lIIllIllIIlllll);
                            Foster.println(objectArray);
                            "".length();
                            if (" ".length() << (" ".length() << " ".length()) > (((7 ^ 0x28) << (" ".length() << " ".length()) ^ 55 + 146 - 178 + 164) << (" ".length() << " ".length()) & (((0x45 ^ 0x54) << "   ".length() ^ 100 + 17 - -13 + 13) << (" ".length() << " ".length()) ^ -" ".length()))) break;
                            return;
                        }
                        case 7: {
                            Object lIIllIllIIlllll = (String[][])IllllIllIIlllll;
                            Object[] objectArray = new Object[IllIllllIl[2]];
                            objectArray[Foster.IllIllllIl[0]] = IlIIIlllIIlllll + " : " + Arrays.deepToString(lIIllIllIIlllll);
                            Foster.println(objectArray);
                            "".length();
                            if (" ".length() << " ".length() >= 0) break;
                            return;
                        }
                        case 8: {
                            Object lIIllIllIIlllll = (char[])IllllIllIIlllll;
                            Object[] objectArray = new Object[IllIllllIl[2]];
                            objectArray[Foster.IllIllllIl[0]] = IlIIIlllIIlllll + " : " + Arrays.toString((char[])lIIllIllIIlllll);
                            Foster.println(objectArray);
                            "".length();
                            if (-((0x98 ^ 0x9F) << "   ".length() ^ (0x4A ^ 0x45) << (" ".length() << " ".length())) <= 0) break;
                            return;
                        }
                        case 9: {
                            Object lIIllIllIIlllll = (char[][])IllllIllIIlllll;
                            Object[] objectArray = new Object[IllIllllIl[2]];
                            objectArray[Foster.IllIllllIl[0]] = IlIIIlllIIlllll + " : " + Arrays.deepToString(lIIllIllIIlllll);
                            Foster.println(objectArray);
                            "".length();
                            if (null == null) break;
                            return;
                        }
                        default: {
                            Object[] objectArray = new Object[IllIllllIl[2]];
                            objectArray[Foster.IllIllllIl[0]] = IlIIIlllIIlllll + " : type not identified";
                            Foster.println(objectArray);
                        }
                    }
                    lIlllIllIIlllll = IllIllllIl[2];
                }
                if (Foster.IIllIlIlIlIl(IllllIllIIlllll.getClass(), ArrayList.class)) {
                    Object[] objectArray = new Object[IllIllllIl[2]];
                    objectArray[Foster.IllIllllIl[0]] = IlIIIlllIIlllll + " : LIST = " + String.valueOf(IllllIllIIlllll);
                    Foster.println(objectArray);
                    lIlllIllIIlllll = IllIllllIl[2];
                }
                if (Foster.IIllIlIlIlIl(IllllIllIIlllll.getClass(), TreeSet.class)) {
                    Object[] objectArray = new Object[IllIllllIl[2]];
                    objectArray[Foster.IllIllllIl[0]] = IlIIIlllIIlllll + " : SET = " + String.valueOf(IllllIllIIlllll);
                    Foster.println(objectArray);
                    lIlllIllIIlllll = IllIllllIl[2];
                }
                if (Foster.IIllIlIlIlIl(IllllIllIIlllll.getClass(), TreeMap.class)) {
                    Object[] objectArray = new Object[IllIllllIl[2]];
                    objectArray[Foster.IllIllllIl[0]] = IlIIIlllIIlllll + " : MAP = " + String.valueOf(IllllIllIIlllll);
                    Foster.println(objectArray);
                    lIlllIllIIlllll = IllIllllIl[2];
                }
                if (Foster.IIllIlIlIlIl(IllllIllIIlllll.getClass(), HashMap.class)) {
                    Object[] objectArray = new Object[IllIllllIl[2]];
                    objectArray[Foster.IllIllllIl[0]] = IlIIIlllIIlllll + " : MAP = " + String.valueOf(IllllIllIIlllll);
                    Foster.println(objectArray);
                    lIlllIllIIlllll = IllIllllIl[2];
                }
                if (Foster.IIllIlIlIlIl(IllllIllIIlllll.getClass(), LinkedList.class)) {
                    Object[] objectArray = new Object[IllIllllIl[2]];
                    objectArray[Foster.IllIllllIl[0]] = IlIIIlllIIlllll + " : LIST = " + String.valueOf(IllllIllIIlllll);
                    Foster.println(objectArray);
                    lIlllIllIIlllll = IllIllllIl[2];
                }
                if (Foster.IIllIlIlIlIl(IllllIllIIlllll.getClass(), PriorityQueue.class)) {
                    Object[] objectArray = new Object[IllIllllIl[2]];
                    objectArray[Foster.IllIllllIl[0]] = IlIIIlllIIlllll + " : PQ = " + String.valueOf(IllllIllIIlllll);
                    Foster.println(objectArray);
                    lIlllIllIIlllll = IllIllllIl[2];
                }
                if (Foster.IllIIlIlIlIl(lIlllIllIIlllll)) {
                    Object[] objectArray = new Object[IllIllllIl[2]];
                    objectArray[Foster.IllIllllIl[0]] = IlIIIlllIIlllll + " = " + String.valueOf(IllllIllIIlllll);
                    Foster.println(objectArray);
                }
                ++IlIIIlllIIlllll;
                ++lllllIllIIlllll;
                "".length();
                if (null == null) continue;
                return;
            }
        }

        static {
            Foster.lIlIIlIlIlIl();
            Foster.IIlIIlIlIlIl();
        }

        private static void IIlIIlIlIlIl() {
            lIlIllllIl = new String[IllIllllIl[13]];
            Foster.lIlIllllIl[Foster.IllIllllIl[0]] = Foster.lIlllIIlIlIl("EseDXCy83RY=", "fnaIE");
            Foster.lIlIllllIl[Foster.IllIllllIl[2]] = Foster.IlIIIlIlIlIl("n3o2FkD/xyE=", "APeyZ");
            Foster.lIlIllllIl[Foster.IllIllllIl[4]] = Foster.IlIIIlIlIlIl("pW5V3LcpwY0=", "Atlxa");
            Foster.lIlIllllIl[Foster.IllIllllIl[3]] = Foster.llIIIlIlIlIl("Dyk=", "TcKKH");
            Foster.lIlIllllIl[Foster.IllIllllIl[6]] = Foster.IlIIIlIlIlIl("GzyBjXnXXqo=", "wLcMa");
            Foster.lIlIllllIl[Foster.IllIllllIl[7]] = Foster.lIlllIIlIlIl("qNqFdREXg3w=", "GJoFx");
            Foster.lIlIllllIl[Foster.IllIllllIl[8]] = Foster.llIIIlIlIlIl("IzUM", "xnHIv");
            Foster.lIlIllllIl[Foster.IllIllllIl[9]] = Foster.IlIIIlIlIlIl("eWbtpnbiXa0rmjl85dGf9bupMI09WnbW", "aQQUz");
            Foster.lIlIllllIl[Foster.IllIllllIl[10]] = Foster.IlIIIlIlIlIl("saKfJZvnMP07JiVv2BsnmVyL4WwkdIbQ", "sSaMC");
            Foster.lIlIllllIl[Foster.IllIllllIl[11]] = Foster.llIIIlIlIlIl("CAU=", "SFnhv");
            Foster.lIlIllllIl[Foster.IllIllllIl[12]] = Foster.llIIIlIlIlIl("DQkL", "VRHAT");
        }

        /*
         * Unable to fully structure code
         */
        private static String llIIIlIlIlIl(String llllIIllIIlllll, String IlllIIllIIlllll) {
            llllIIllIIlllll = new String(Base64.getDecoder().decode(llllIIllIIlllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            lIllIIllIIlllll = new StringBuilder();
            IIllIIllIIlllll = IlllIIllIIlllll.toCharArray();
            llIlIIllIIlllll = Foster.IllIllllIl[0];
            lIIIIIllIIlllll = llllIIllIIlllll.toCharArray();
            IlIIIIllIIlllll = lIIIIIllIIlllll.length;
            llIIIIllIIlllll = Foster.IllIllllIl[0];
            "".length();
            if (-"   ".length() < 0) ** GOTO lbl19
            return null;
lbl-1000:
            // 1 sources

            {
                IlIlIIllIIlllll = lIIIIIllIIlllll[llIIIIllIIlllll];
                lIllIIllIIlllll.append((char)(IlIlIIllIIlllll ^ IIllIIllIIlllll[llIlIIllIIlllll % IIllIIllIIlllll.length]));
                "".length();
                ++llIlIIllIIlllll;
                ++llIIIIllIIlllll;
lbl19:
                // 2 sources

                ** while (!Foster.lIllIlIlIlIl((int)llIIIIllIIlllll, (int)IlIIIIllIIlllll))
            }
lbl20:
            // 1 sources

            return String.valueOf(lIllIIllIIlllll);
        }

        private static String lIlllIIlIlIl(String IIllllIlIIlllll, String llIlllIlIIlllll) {
            try {
                SecretKeySpec IlIlllIlIIlllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIlllIlIIlllll.getBytes(StandardCharsets.UTF_8)), IllIllllIl[10]), "DES");
                Cipher lIIlllIlIIlllll = Cipher.getInstance("DES");
                lIIlllIlIIlllll.init(IllIllllIl[4], IlIlllIlIIlllll);
                return new String(lIIlllIlIIlllll.doFinal(Base64.getDecoder().decode(IIllllIlIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception IIIlllIlIIlllll) {
                IIIlllIlIIlllll.printStackTrace();
                return null;
            }
        }

        private static String IlIIIlIlIlIl(String llllIlIlIIlllll, String IlllIlIlIIlllll) {
            try {
                SecretKeySpec lIllIlIlIIlllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IlllIlIlIIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                Cipher IIllIlIlIIlllll = Cipher.getInstance("Blowfish");
                IIllIlIlIIlllll.init(IllIllllIl[4], lIllIlIlIIlllll);
                return new String(IIllIlIlIIlllll.doFinal(Base64.getDecoder().decode(llllIlIlIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llIlIlIlIIlllll) {
                llIlIlIlIIlllll.printStackTrace();
                return null;
            }
        }

        private static void lIlIIlIlIlIl() {
            IllIllllIl = new int[14];
            Foster.IllIllllIl[0] = (5 ^ 0x10) << " ".length() & ~((0x89 ^ 0x9C) << " ".length());
            Foster.IllIllllIl[1] = (0x60 ^ 0x31) << " ".length() ^ 33 + 150 - 30 + 36;
            Foster.IllIllllIl[2] = " ".length();
            Foster.IllIllllIl[3] = "   ".length();
            Foster.IllIllllIl[4] = " ".length() << " ".length();
            Foster.IllIllllIl[5] = -" ".length();
            Foster.IllIllllIl[6] = " ".length() << (" ".length() << " ".length());
            Foster.IllIllllIl[7] = 0xC4 ^ 0xC1;
            Foster.IllIllllIl[8] = "   ".length() << " ".length();
            Foster.IllIllllIl[9] = 0x94 ^ 0x93;
            Foster.IllIllllIl[10] = " ".length() << "   ".length();
            Foster.IllIllllIl[11] = (0xBE ^ 0xAD) << "   ".length() ^ 6 + 10 - -49 + 80;
            Foster.IllIllllIl[12] = (0x2A ^ 0x2F) << " ".length();
            Foster.IllIllllIl[13] = (0x30 ^ 0x1D) << (" ".length() << " ".length()) ^ 34 + 105 - -32 + 20;
        }

        private static boolean IlIlIlIlIlIl(int n, int n2) {
            return n == n2;
        }

        private static boolean lIllIlIlIlIl(int n, int n2) {
            return n >= n2;
        }

        private static boolean lllIIlIlIlIl(int n, int n2) {
            return n < n2;
        }

        private static boolean IIllIlIlIlIl(Object object, Object object2) {
            return object == object2;
        }

        private static boolean IIIlIlIlIlIl(int n) {
            return n != 0;
        }

        private static boolean IllIIlIlIlIl(int n) {
            return n == 0;
        }

        private static boolean llIlIlIlIlIl(int n) {
            return n > 0;
        }

        private static int lIIlIlIlIlIl(long l, long l2) {
            return l == l2 ? 0 : (l < l2 ? -1 : 1);
        }
    }
}

