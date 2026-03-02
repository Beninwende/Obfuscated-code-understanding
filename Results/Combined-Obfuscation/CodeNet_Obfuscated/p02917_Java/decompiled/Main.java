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
    private static int[] IlllIllll;

    public Main() {
        Main IlIIllIIIIIIIl;
    }

    public static void main(String[] stringArray) throws Exception {
        Foster IlIlIlIIIIIIIl = new Foster();
        PrintWriter lIIlIlIIIIIIIl = new PrintWriter(System.out);
        int IIIlIlIIIIIIIl = IlIlIlIIIIIIIl.nextInt();
        int[] lllIIlIIIIIIIl = IlIlIlIIIIIIIl.intArray(IIIlIlIIIIIIIl - IlllIllll[0]);
        int[] IllIIlIIIIIIIl = new int[IIIlIlIIIIIIIl];
        IllIIlIIIIIIIl[Main.IlllIllll[1]] = lllIIlIIIIIIIl[IlllIllll[1]];
        IllIIlIIIIIIIl[IIIlIlIIIIIIIl - Main.IlllIllll[0]] = lllIIlIIIIIIIl[IIIlIlIIIIIIIl - IlllIllll[2]];
        int lIlIIlIIIIIIIl22 = IlllIllll[1];
        while (Main.lIllIIllIll(lIlIIlIIIIIIIl22, IIIlIlIIIIIIIl - IlllIllll[2])) {
            IllIIlIIIIIIIl[lIlIIlIIIIIIIl22 + Main.IlllIllll[0]] = Math.min(lllIIlIIIIIIIl[lIlIIlIIIIIIIl22], lllIIlIIIIIIIl[lIlIIlIIIIIIIl22 + IlllIllll[0]]);
            ++lIlIIlIIIIIIIl22;
            "".length();
            if (" ".length() << " ".length() == " ".length() << " ".length()) continue;
            return;
        }
        long lIlIIlIIIIIIIl22 = 0L;
        int IIlIIlIIIIIIIl = IlllIllll[1];
        while (Main.lIllIIllIll(IIlIIlIIIIIIIl, IIIlIlIIIIIIIl)) {
            lIlIIlIIIIIIIl22 += (long)IllIIlIIIIIIIl[IIlIIlIIIIIIIl];
            ++IIlIIlIIIIIIIl;
            "".length();
            if (" ".length() << " ".length() != " ".length()) continue;
            return;
        }
        lIIlIlIIIIIIIl.println(lIlIIlIIIIIIIl22);
        lIIlIlIIIIIIIl.close();
    }

    static {
        Main.IIllIIllIll();
    }

    private static void IIllIIllIll() {
        IlllIllll = new int[3];
        Main.IlllIllll[0] = " ".length();
        Main.IlllIllll[1] = (0x51 ^ 0x58) << (" ".length() << " ".length()) & ~((0x99 ^ 0x90) << (" ".length() << " ".length()));
        Main.IlllIllll[2] = " ".length() << " ".length();
    }

    private static boolean lIllIIllIll(int n, int n2) {
        return n < n2;
    }

    static class Foster {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(lIllIllll[llllIllll[0]]);
        private static String[] lIllIllll;
        private static int[] llllIllll;

        Foster() {
            Foster IllllIIIIIIIIl;
        }

        String next() {
            Foster llIllIIIIIIIIl;
            while (Foster.IlIIlIllIll(llIllIIIIIIIIl.st.hasMoreTokens() ? 1 : 0)) {
                try {
                    llIllIIIIIIIIl.st = new StringTokenizer(llIllIIIIIIIIl.br.readLine());
                    "".length();
                }
                catch (IOException IlIllIIIIIIIIl) {
                    IlIllIIIIIIIIl.printStackTrace();
                    "".length();
                    if (("   ".length() << (" ".length() << " ".length()) & ~("   ".length() << (" ".length() << " ".length()))) < " ".length() << (" ".length() << " ".length())) continue;
                    return null;
                }
                if (-" ".length() < "   ".length()) continue;
                return null;
            }
            return this.st.nextToken();
        }

        int nextInt() {
            Foster IIIllIIIIIIIIl;
            return Integer.parseInt(IIIllIIIIIIIIl.next());
        }

        long nextLong() {
            Foster IllIlIIIIIIIIl;
            return Long.parseLong(IllIlIIIIIIIIl.next());
        }

        double nextDouble() {
            Foster IIlIlIIIIIIIIl;
            return Double.parseDouble(IIlIlIIIIIIIIl.next());
        }

        /*
         * WARNING - void declaration
         */
        int[] intArray(int IlllIIIIIIIIIl) {
            void var2_2;
            int[] lIllIIIIIIIIIl = new int[IlllIIIIIIIIIl];
            int IIllIIIIIIIIIl = llllIllll[0];
            while (Foster.llIIlIllIll(IIllIIIIIIIIIl, IlllIIIIIIIIIl)) {
                Foster llllIIIIIIIIIl;
                lIllIIIIIIIIIl[IIllIIIIIIIIIl] = llllIIIIIIIIIl.nextInt();
                ++IIllIIIIIIIIIl;
                "".length();
                if ("   ".length() != 0) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        long[] longArray(int IllIIIIIIIIIIl) {
            void var2_2;
            long[] lIlIIIIIIIIIIl = new long[IllIIIIIIIIIIl];
            int IIlIIIIIIIIIIl = llllIllll[0];
            while (Foster.llIIlIllIll(IIlIIIIIIIIIIl, IllIIIIIIIIIIl)) {
                Foster lllIIIIIIIIIIl;
                lIlIIIIIIIIIIl[IIlIIIIIIIIIIl] = lllIIIIIIIIIIl.nextLong();
                ++IIlIIIIIIIIIIl;
                "".length();
                if (null == null) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        int[] getBits(int IIIIIIIIIIIIIl) {
            void var2_2;
            int[] lllllllllllll = new int[llllIllll[1]];
            int Illllllllllll = llllIllll[0];
            while (Foster.llIIlIllIll(Illllllllllll, llllIllll[1])) {
                if (Foster.IIlIlIllIll(llllIllll[2] << Illllllllllll & IIIIIIIIIIIIIl)) {
                    lllllllllllll[Illllllllllll] = llllIllll[2];
                }
                ++Illllllllllll;
                "".length();
                if (" ".length() << (" ".length() << " ".length()) != -" ".length()) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        static long pow(long ... IlIllllllllll) {
            void var3_2;
            long lIIllllllllll = Long.MAX_VALUE;
            if (Foster.IllIlIllIll(IlIllllllllll.length, llllIllll[3])) {
                lIIllllllllll = IlIllllllllll[llllIllll[4]];
            }
            long IIIllllllllll = 1L;
            while (Foster.lllIlIllIll(Foster.lIlIlIllIll(IlIllllllllll[llllIllll[2]], 0L))) {
                if (Foster.IlIIlIllIll(Foster.lIlIlIllIll(IlIllllllllll[llllIllll[2]] & 1L, 1L))) {
                    IIIllllllllll = IIIllllllllll * IlIllllllllll[llllIllll[0]] % lIIllllllllll;
                }
                int n = llllIllll[2];
                IlIllllllllll[n] = IlIllllllllll[n] / 2L;
                IlIllllllllll[Foster.llllIllll[0]] = IlIllllllllll[llllIllll[0]] * IlIllllllllll[llllIllll[0]] % lIIllllllllll;
                "".length();
                if ("   ".length() != 0) continue;
                return 0L;
            }
            return (long)var3_2;
        }

        void print(Object ... IlIIlllllllll) {
            Object[] lIIIlllllllll = IlIIlllllllll;
            int IIIIlllllllll = lIIIlllllllll.length;
            int llllIllllllll = llllIllll[0];
            while (Foster.llIIlIllIll(llllIllllllll, IIIIlllllllll)) {
                Object IlllIllllllll = lIIIlllllllll[llllIllllllll];
                System.out.print(String.valueOf(IlllIllllllll) + " ");
                ++llllIllllllll;
                "".length();
                if (" ".length() << " ".length() != -" ".length()) continue;
                return;
            }
        }

        void println(Object ... IIIlIllllllll) {
            Object[] lllIIllllllll = IIIlIllllllll;
            int IllIIllllllll = lllIIllllllll.length;
            int lIlIIllllllll = llllIllll[0];
            while (Foster.llIIlIllIll(lIlIIllllllll, IllIIllllllll)) {
                Object IIlIIllllllll = lllIIllllllll[lIlIIllllllll];
                System.out.print(String.valueOf(IIlIIllllllll) + " ");
                ++lIlIIllllllll;
                "".length();
                if (null == null) continue;
                return;
            }
            System.out.println();
        }

        void watch(Object ... IllIlIlllllll) throws Exception {
            int lIlIlIlllllll = llllIllll[2];
            Object[] IIlIlIlllllll = IllIlIlllllll;
            int llIIlIlllllll = IIlIlIlllllll.length;
            int IlIIlIlllllll = llllIllll[0];
            while (Foster.llIIlIllIll(IlIIlIlllllll, llIIlIlllllll)) {
                Foster lllIlIlllllll;
                Object lIIIlIlllllll = IIlIlIlllllll[IlIIlIlllllll];
                int IIIIlIlllllll = llllIllll[0];
                if (Foster.IIlIlIllIll(lIIIlIlllllll.getClass().isArray() ? 1 : 0)) {
                    String llllIIlllllll;
                    String IlllIIlllllll = llllIIlllllll = lIIIlIlllllll.getClass().getName().toString();
                    int lIllIIlllllll = llllIllll[5];
                    switch (IlllIIlllllll.hashCode()) {
                        case 2894: {
                            if (!Foster.IIlIlIllIll(IlllIIlllllll.equals(lIllIllll[llllIllll[2]]) ? 1 : 0)) break;
                            lIllIIlllllll = llllIllll[0];
                            "".length();
                            if ("   ".length() != 0) break;
                            return;
                        }
                        case 90345: {
                            if (!Foster.IIlIlIllIll(IlllIIlllllll.equals(lIllIllll[llllIllll[4]]) ? 1 : 0)) break;
                            lIllIIlllllll = llllIllll[2];
                            "".length();
                            if (null == null) break;
                            return;
                        }
                        case 2895: {
                            if (!Foster.IIlIlIllIll(IlllIIlllllll.equals(lIllIllll[llllIllll[3]]) ? 1 : 0)) break;
                            lIllIIlllllll = llllIllll[4];
                            "".length();
                            if (" ".length() != 0) break;
                            return;
                        }
                        case 90346: {
                            if (!Foster.IIlIlIllIll(IlllIIlllllll.equals(lIllIllll[llllIllll[6]]) ? 1 : 0)) break;
                            lIllIIlllllll = llllIllll[3];
                            "".length();
                            if ("   ".length() > 0) break;
                            return;
                        }
                        case 2889: {
                            if (!Foster.IIlIlIllIll(IlllIIlllllll.equals(lIllIllll[llllIllll[7]]) ? 1 : 0)) break;
                            lIllIIlllllll = llllIllll[6];
                            "".length();
                            if (" ".length() << (" ".length() << " ".length()) > "   ".length()) break;
                            return;
                        }
                        case 90340: {
                            if (!Foster.IIlIlIllIll(IlllIIlllllll.equals(lIllIllll[llllIllll[8]]) ? 1 : 0)) break;
                            lIllIIlllllll = llllIllll[7];
                            "".length();
                            if (-((0xB3 ^ 0xA2) << "   ".length() ^ (0x99 ^ 0xBA) << (" ".length() << " ".length())) < 0) break;
                            return;
                        }
                        case 428310454: {
                            if (!Foster.IIlIlIllIll(IlllIIlllllll.equals(lIllIllll[llllIllll[9]]) ? 1 : 0)) break;
                            lIllIIlllllll = llllIllll[8];
                            "".length();
                            if (" ".length() << (" ".length() << " ".length()) > " ".length()) break;
                            return;
                        }
                        case 890781521: {
                            if (!Foster.IIlIlIllIll(IlllIIlllllll.equals(lIllIllll[llllIllll[10]]) ? 1 : 0)) break;
                            lIllIIlllllll = llllIllll[9];
                            "".length();
                            if (null == null) break;
                            return;
                        }
                        case 2888: {
                            if (!Foster.IIlIlIllIll(IlllIIlllllll.equals(lIllIllll[llllIllll[11]]) ? 1 : 0)) break;
                            lIllIIlllllll = llllIllll[10];
                            "".length();
                            if (" ".length() < "   ".length()) break;
                            return;
                        }
                        case 90339: {
                            if (!Foster.IIlIlIllIll(IlllIIlllllll.equals(lIllIllll[llllIllll[12]]) ? 1 : 0)) break;
                            lIllIIlllllll = llllIllll[11];
                        }
                    }
                    switch (lIllIIlllllll) {
                        case 0: {
                            Object IIllIIlllllll = (int[])lIIIlIlllllll;
                            Object[] objectArray = new Object[llllIllll[2]];
                            objectArray[Foster.llllIllll[0]] = lIlIlIlllllll + " : " + Arrays.toString(IIllIIlllllll);
                            lllIlIlllllll.println(objectArray);
                            "".length();
                            if (" ".length() << " ".length() != 0) break;
                            return;
                        }
                        case 1: {
                            Object IIllIIlllllll = (int[][])lIIIlIlllllll;
                            Object[] objectArray = new Object[llllIllll[2]];
                            objectArray[Foster.llllIllll[0]] = lIlIlIlllllll + " : " + Arrays.deepToString(IIllIIlllllll);
                            lllIlIlllllll.println(objectArray);
                            "".length();
                            if ("   ".length() > 0) break;
                            return;
                        }
                        case 2: {
                            Object IIllIIlllllll = (long[])lIIIlIlllllll;
                            Object[] objectArray = new Object[llllIllll[2]];
                            objectArray[Foster.llllIllll[0]] = lIlIlIlllllll + " : " + Arrays.toString((long[])IIllIIlllllll);
                            lllIlIlllllll.println(objectArray);
                            "".length();
                            if (null == null) break;
                            return;
                        }
                        case 3: {
                            Object IIllIIlllllll = (long[][])lIIIlIlllllll;
                            Object[] objectArray = new Object[llllIllll[2]];
                            objectArray[Foster.llllIllll[0]] = lIlIlIlllllll + " : " + Arrays.deepToString(IIllIIlllllll);
                            lllIlIlllllll.println(objectArray);
                            "".length();
                            if (" ".length() << (" ".length() << " ".length()) != (((0x31 ^ 0x22) << " ".length() ^ (0x59 ^ 0x44)) & ((0 ^ 0x47) << " ".length() ^ 172 + 56 - 104 + 57 ^ -" ".length()))) break;
                            return;
                        }
                        case 4: {
                            Object IIllIIlllllll = (double[])lIIIlIlllllll;
                            Object[] objectArray = new Object[llllIllll[2]];
                            objectArray[Foster.llllIllll[0]] = lIlIlIlllllll + " : " + Arrays.toString((double[])IIllIIlllllll);
                            lllIlIlllllll.println(objectArray);
                            "".length();
                            if (-" ".length() <= "   ".length()) break;
                            return;
                        }
                        case 5: {
                            Object IIllIIlllllll = (double[][])lIIIlIlllllll;
                            Object[] objectArray = new Object[llllIllll[2]];
                            objectArray[Foster.llllIllll[0]] = lIlIlIlllllll + " : " + Arrays.deepToString(IIllIIlllllll);
                            lllIlIlllllll.println(objectArray);
                            "".length();
                            if (-" ".length() <= (((0x4B ^ 0x76) << (" ".length() << " ".length()) ^ 132 + 120 - 232 + 171) & ((6 ^ 0x73) << " ".length() ^ 59 + 44 - 59 + 117 ^ -" ".length()))) break;
                            return;
                        }
                        case 6: {
                            Object IIllIIlllllll = (String[])lIIIlIlllllll;
                            Object[] objectArray = new Object[llllIllll[2]];
                            objectArray[Foster.llllIllll[0]] = lIlIlIlllllll + " : " + Arrays.toString((Object[])IIllIIlllllll);
                            lllIlIlllllll.println(objectArray);
                            "".length();
                            if (-" ".length() < 0) break;
                            return;
                        }
                        case 7: {
                            Object IIllIIlllllll = (String[][])lIIIlIlllllll;
                            Object[] objectArray = new Object[llllIllll[2]];
                            objectArray[Foster.llllIllll[0]] = lIlIlIlllllll + " : " + Arrays.deepToString(IIllIIlllllll);
                            lllIlIlllllll.println(objectArray);
                            "".length();
                            if (" ".length() << " ".length() == " ".length() << " ".length()) break;
                            return;
                        }
                        case 8: {
                            Object IIllIIlllllll = (char[])lIIIlIlllllll;
                            Object[] objectArray = new Object[llllIllll[2]];
                            objectArray[Foster.llllIllll[0]] = lIlIlIlllllll + " : " + Arrays.toString((char[])IIllIIlllllll);
                            lllIlIlllllll.println(objectArray);
                            "".length();
                            if (((0xFF ^ 0xA8) & ~(0x27 ^ 0x70)) >= -" ".length()) break;
                            return;
                        }
                        case 9: {
                            Object IIllIIlllllll = (char[][])lIIIlIlllllll;
                            Object[] objectArray = new Object[llllIllll[2]];
                            objectArray[Foster.llllIllll[0]] = lIlIlIlllllll + " : " + Arrays.deepToString(IIllIIlllllll);
                            lllIlIlllllll.println(objectArray);
                            "".length();
                            if (-"  ".length() <= 0) break;
                            return;
                        }
                        default: {
                            Object[] objectArray = new Object[llllIllll[2]];
                            objectArray[Foster.llllIllll[0]] = lIlIlIlllllll + " : type not identified";
                            lllIlIlllllll.println(objectArray);
                        }
                    }
                    IIIIlIlllllll = llllIllll[2];
                }
                if (Foster.IIIllIllIll(lIIIlIlllllll.getClass(), ArrayList.class)) {
                    Object[] objectArray = new Object[llllIllll[2]];
                    objectArray[Foster.llllIllll[0]] = lIlIlIlllllll + " : LIST = " + String.valueOf(lIIIlIlllllll);
                    lllIlIlllllll.println(objectArray);
                    IIIIlIlllllll = llllIllll[2];
                }
                if (Foster.IIIllIllIll(lIIIlIlllllll.getClass(), TreeSet.class)) {
                    Object[] objectArray = new Object[llllIllll[2]];
                    objectArray[Foster.llllIllll[0]] = lIlIlIlllllll + " : SET = " + String.valueOf(lIIIlIlllllll);
                    lllIlIlllllll.println(objectArray);
                    IIIIlIlllllll = llllIllll[2];
                }
                if (Foster.IIIllIllIll(lIIIlIlllllll.getClass(), TreeMap.class)) {
                    Object[] objectArray = new Object[llllIllll[2]];
                    objectArray[Foster.llllIllll[0]] = lIlIlIlllllll + " : MAP = " + String.valueOf(lIIIlIlllllll);
                    lllIlIlllllll.println(objectArray);
                    IIIIlIlllllll = llllIllll[2];
                }
                if (Foster.IIIllIllIll(lIIIlIlllllll.getClass(), HashMap.class)) {
                    Object[] objectArray = new Object[llllIllll[2]];
                    objectArray[Foster.llllIllll[0]] = lIlIlIlllllll + " : MAP = " + String.valueOf(lIIIlIlllllll);
                    lllIlIlllllll.println(objectArray);
                    IIIIlIlllllll = llllIllll[2];
                }
                if (Foster.IIIllIllIll(lIIIlIlllllll.getClass(), LinkedList.class)) {
                    Object[] objectArray = new Object[llllIllll[2]];
                    objectArray[Foster.llllIllll[0]] = lIlIlIlllllll + " : LIST = " + String.valueOf(lIIIlIlllllll);
                    lllIlIlllllll.println(objectArray);
                    IIIIlIlllllll = llllIllll[2];
                }
                if (Foster.IIIllIllIll(lIIIlIlllllll.getClass(), PriorityQueue.class)) {
                    Object[] objectArray = new Object[llllIllll[2]];
                    objectArray[Foster.llllIllll[0]] = lIlIlIlllllll + " : PQ = " + String.valueOf(lIIIlIlllllll);
                    lllIlIlllllll.println(objectArray);
                    IIIIlIlllllll = llllIllll[2];
                }
                if (Foster.IlIIlIllIll(IIIIlIlllllll)) {
                    Object[] objectArray = new Object[llllIllll[2]];
                    objectArray[Foster.llllIllll[0]] = lIlIlIlllllll + " = " + String.valueOf(lIIIlIlllllll);
                    lllIlIlllllll.println(objectArray);
                }
                ++lIlIlIlllllll;
                ++IlIIlIlllllll;
                "".length();
                if (-" ".length() == -" ".length()) continue;
                return;
            }
        }

        static {
            Foster.lIIIlIllIll();
            Foster.IIIIlIllIll();
        }

        private static void IIIIlIllIll() {
            lIllIllll = new String[llllIllll[13]];
            Foster.lIllIllll[Foster.llllIllll[0]] = Foster.IIllIIllIll("GJ8QXIRvNEY=", "tiger");
            Foster.lIllIllll[Foster.llllIllll[2]] = Foster.IIllIIllIll("pyVrcWd3eIQ=", "HkkJQ");
            Foster.lIllIllll[Foster.llllIllll[4]] = Foster.IlllIIllIll("kk1rUIiMeOA=", "Fynai");
            Foster.lIllIllll[Foster.llllIllll[3]] = Foster.IIllIIllIll("/dw8RMXP1Yo=", "CCjpp");
            Foster.lIllIllll[Foster.llllIllll[6]] = Foster.llllIIllIll("LTYg", "vmjNs");
            Foster.lIllIllll[Foster.llllIllll[7]] = Foster.IIllIIllIll("iLPmuFjQATY=", "dYMxW");
            Foster.lIllIllll[Foster.llllIllll[8]] = Foster.IIllIIllIll("GArSBpLSN24=", "HKJXx");
            Foster.lIllIllll[Foster.llllIllll[9]] = Foster.IIllIIllIll("ypc4uIF9MMrWSZAcegyFNMivbFwOdcWF", "SzNvd");
            Foster.lIllIllll[Foster.llllIllll[10]] = Foster.IIllIIllIll("OmUvkWjskPtLdQsL/WDELy4Svu+q2VNI", "UKHpg");
            Foster.lIllIllll[Foster.llllIllll[11]] = Foster.IIllIIllIll("283rPTwvYTw=", "jaYGZ");
            Foster.lIllIllll[Foster.llllIllll[12]] = Foster.IlllIIllIll("s9w6GDRzoig=", "oGImv");
        }

        private static String IIllIIllIll(String lllIIIlllllll, String IllIIIlllllll) {
            try {
                SecretKeySpec lIlIIIlllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IllIIIlllllll.getBytes(StandardCharsets.UTF_8)), llllIllll[10]), "DES");
                Cipher IIlIIIlllllll = Cipher.getInstance("DES");
                IIlIIIlllllll.init(llllIllll[4], lIlIIIlllllll);
                return new String(IIlIIIlllllll.doFinal(Base64.getDecoder().decode(lllIIIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llIIIIlllllll) {
                llIIIIlllllll.printStackTrace();
                return null;
            }
        }

        /*
         * Enabled aggressive block sorting
         */
        private static String llllIIllIll(String lIlIllIllllll, String IIlIllIllllll) {
            lIlIllIllllll = new String(Base64.getDecoder().decode(lIlIllIllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            StringBuilder llIIllIllllll = new StringBuilder();
            char[] IlIIllIllllll = IIlIllIllllll.toCharArray();
            int lIIIllIllllll = llllIllll[0];
            char[] lllIIlIllllll = lIlIllIllllll.toCharArray();
            int IIIlIlIllllll = lllIIlIllllll.length;
            int lIIlIlIllllll = llllIllll[0];
            "".length();
            while (!Foster.lIIllIllIll(lIIlIlIllllll, IIIlIlIllllll)) {
                char IIIIllIllllll = lllIIlIllllll[lIIlIlIllllll];
                llIIllIllllll.append((char)(IIIIllIllllll ^ IlIIllIllllll[lIIIllIllllll % IlIIllIllllll.length]));
                "".length();
                ++lIIIllIllllll;
                ++lIIlIlIllllll;
            }
            return String.valueOf(llIIllIllllll);
        }

        private static String IlllIIllIll(String IlIIIlIllllll, String lIIIIlIllllll) {
            try {
                SecretKeySpec IIIIIlIllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIIIlIllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                Cipher lllllIIllllll = Cipher.getInstance("Blowfish");
                lllllIIllllll.init(llllIllll[4], IIIIIlIllllll);
                return new String(lllllIIllllll.doFinal(Base64.getDecoder().decode(IlIIIlIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception IllllIIllllll) {
                IllllIIllllll.printStackTrace();
                return null;
            }
        }

        private static void lIIIlIllIll() {
            llllIllll = new int[14];
            Foster.llllIllll[0] = (0x13 ^ 0x52 ^ (0x29 ^ 0xE) << " ".length()) << (" ".length() << " ".length()) & (((0x7D ^ 0x6E) << (" ".length() << " ".length()) ^ (0x7A ^ 0x39)) << (" ".length() << " ".length()) ^ -" ".length());
            Foster.llllIllll[1] = 0x66 ^ 7 ^ (0xFF ^ 0xC0) << " ".length();
            Foster.llllIllll[2] = " ".length();
            Foster.llllIllll[3] = "   ".length();
            Foster.llllIllll[4] = " ".length() << " ".length();
            Foster.llllIllll[5] = -" ".length();
            Foster.llllIllll[6] = " ".length() << (" ".length() << " ".length());
            Foster.llllIllll[7] = 0x51 ^ 0x4A ^ (0x38 ^ 0x37) << " ".length();
            Foster.llllIllll[8] = "   ".length() << " ".length();
            Foster.llllIllll[9] = (0x5F ^ 0x40) << " ".length() ^ (0xB3 ^ 0x8A);
            Foster.llllIllll[10] = " ".length() << "   ".length();
            Foster.llllIllll[11] = 0x17 ^ 0x1E;
            Foster.llllIllll[12] = (0xBE ^ 0xBB) << " ".length();
            Foster.llllIllll[13] = 0x86 ^ 0x8D;
        }

        private static boolean IllIlIllIll(int n, int n2) {
            return n == n2;
        }

        private static boolean lIIllIllIll(int n, int n2) {
            return n >= n2;
        }

        private static boolean llIIlIllIll(int n, int n2) {
            return n < n2;
        }

        private static boolean IIIllIllIll(Object object, Object object2) {
            return object == object2;
        }

        private static boolean IIlIlIllIll(int n) {
            return n != 0;
        }

        private static boolean IlIIlIllIll(int n) {
            return n == 0;
        }

        private static boolean lllIlIllIll(int n) {
            return n > 0;
        }

        private static int lIlIlIllIll(long l, long l2) {
            return l == l2 ? 0 : (l < l2 ? -1 : 1);
        }
    }
}

