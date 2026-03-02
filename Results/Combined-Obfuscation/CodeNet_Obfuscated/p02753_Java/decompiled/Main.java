/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Main {
    static BufferedReader br;
    private static String[] Il;
    private static int[] ll;

    public Main() {
        Main llIlIllIIllllIl;
    }

    static int cin() throws Exception {
        return Integer.valueOf(br.readLine());
    }

    /*
     * WARNING - void declaration
     */
    static int[] split() throws Exception {
        void var1_1;
        String[] lllIIllIIllllIl = br.readLine().split(Il[ll[0]]);
        int[] IllIIllIIllllIl = new int[lllIIllIIllllIl.length];
        int lIlIIllIIllllIl = ll[0];
        while (Main.Illl(lIlIIllIIllllIl, lllIIllIIllllIl.length)) {
            IllIIllIIllllIl[lIlIIllIIllllIl] = Integer.valueOf(lllIIllIIllllIl[lIlIIllIIllllIl]);
            ++lIlIIllIIllllIl;
            "".length();
            if ((0x27 ^ 0x20 ^ " ".length() << " ".length()) > 0) continue;
            return null;
        }
        return var1_1;
    }

    static void kMarsh(String[] IllIlIlIIllllIl) {
        int IIllIIlIIllllIl;
        int lIllIIlIIllllIl;
        int IlllIIlIIllllIl;
        int llllIIlIIllllIl;
        int IIIIlIlIIllllIl;
        int lIIIlIlIIllllIl22;
        int lIlIlIlIIllllIl = IllIlIlIIllllIl.length;
        int IIlIlIlIIllllIl = IllIlIlIIllllIl[ll[0]].length();
        char[][] llIIlIlIIllllIl = new char[lIlIlIlIIllllIl][IIlIlIlIIllllIl];
        int IlIIlIlIIllllIl22 = ll[0];
        while (Main.Illl(IlIIlIlIIllllIl22, lIlIlIlIIllllIl)) {
            lIIIlIlIIllllIl22 = ll[0];
            while (Main.Illl(lIIIlIlIIllllIl22, IIlIlIlIIllllIl)) {
                llIIlIlIIllllIl[IlIIlIlIIllllIl22][lIIIlIlIIllllIl22] = IllIlIlIIllllIl[IlIIlIlIIllllIl22].charAt(lIIIlIlIIllllIl22);
                ++lIIIlIlIIllllIl22;
                "".length();
                if ("   ".length() == "   ".length()) continue;
                return;
            }
            ++IlIIlIlIIllllIl22;
            "".length();
            if (" ".length() << (" ".length() << " ".length()) >= " ".length() << (" ".length() << " ".length())) continue;
            return;
        }
        int[][] IlIIlIlIIllllIl22 = new int[IIlIlIlIIllllIl][lIlIlIlIIllllIl];
        lIIIlIlIIllllIl22 = ll[0];
        while (Main.Illl(lIIIlIlIIllllIl22, IIlIlIlIIllllIl)) {
            IIIIlIlIIllllIl = ll[0];
            while (Main.Illl(IIIIlIlIIllllIl, lIlIlIlIIllllIl)) {
                llllIIlIIllllIl = lIlIlIlIIllllIl;
                IlllIIlIIllllIl = IIIIlIlIIllllIl;
                while (Main.Illl(IlllIIlIIllllIl, lIlIlIlIIllllIl)) {
                    if (Main.llll(llIIlIlIIllllIl[IlllIIlIIllllIl][lIIIlIlIIllllIl22], ll[1])) {
                        llllIIlIIllllIl = IlllIIlIIllllIl;
                        "".length();
                        if (-"  ".length() <= 0) break;
                        return;
                    }
                    ++IlllIIlIIllllIl;
                    "".length();
                    if (-" ".length() < " ".length()) continue;
                    return;
                }
                IlIIlIlIIllllIl22[lIIIlIlIIllllIl22][IIIIlIlIIllllIl] = llllIIlIIllllIl;
                ++IIIIlIlIIllllIl;
                "".length();
                if (" ".length() << (" ".length() << " ".length()) > 0) continue;
                return;
            }
            ++lIIIlIlIIllllIl22;
            "".length();
            if (((0x7D ^ 0x4C) << " ".length() & ~((0xBD ^ 0x8C) << " ".length())) == 0) continue;
            return;
        }
        boolean[][][] lIIIlIlIIllllIl22 = new boolean[lIlIlIlIIllllIl][IIlIlIlIIllllIl][IIlIlIlIIllllIl];
        IIIIlIlIIllllIl = ll[0];
        while (Main.Illl(IIIIlIlIIllllIl, lIlIlIlIIllllIl)) {
            llllIIlIIllllIl = ll[0];
            while (Main.Illl(llllIIlIIllllIl, IIlIlIlIIllllIl)) {
                IlllIIlIIllllIl = llllIIlIIllllIl;
                while (Main.Illl(IlllIIlIIllllIl, IIlIlIlIIllllIl)) {
                    int n;
                    if (Main.llll(llIIlIlIIllllIl[IIIIlIlIIllllIl][IlllIIlIIllllIl], ll[1])) {
                        n = ll[0];
                        "".length();
                        if (" ".length() << " ".length() < " ".length() << " ".length()) {
                            return;
                        }
                    } else {
                        n = ll[2];
                    }
                    lIllIIlIIllllIl = n;
                    IIllIIlIIllllIl = ll[2];
                    if (Main.IIIIl(IlllIIlIIllllIl, llllIIlIIllllIl)) {
                        IIllIIlIIllllIl = lIIIlIlIIllllIl22[IIIIlIlIIllllIl][llllIIlIIllllIl][IlllIIlIIllllIl - ll[2]];
                    }
                    if (!Main.lIIIl(lIllIIlIIllllIl) || Main.IlIIl(IIllIIlIIllllIl)) {
                        lIIIlIlIIllllIl22[IIIIlIlIIllllIl][llllIIlIIllllIl][IlllIIlIIllllIl] = ll[0];
                        "".length();
                        if (-" ".length() > 0) {
                            return;
                        }
                    } else {
                        lIIIlIlIIllllIl22[IIIIlIlIIllllIl][llllIIlIIllllIl][IlllIIlIIllllIl] = ll[2];
                    }
                    ++IlllIIlIIllllIl;
                    "".length();
                    if (((0x9A ^ 0x8D ^ "   ".length() << "   ".length()) << (" ".length() << " ".length()) & (((0x4B ^ 6) << " ".length() ^ 40 + 115 - 15 + 9) << (" ".length() << " ".length()) ^ -" ".length())) < " ".length()) continue;
                    return;
                }
                ++llllIIlIIllllIl;
                "".length();
                if (" ".length() << (" ".length() << " ".length()) > ((0xA9 ^ 0xA0) & ~(0x8B ^ 0x82))) continue;
                return;
            }
            ++IIIIlIlIIllllIl;
            "".length();
            if (null == null) continue;
            return;
        }
        IIIIlIlIIllllIl = ll[0];
        llllIIlIIllllIl = ll[0];
        while (Main.Illl(llllIIlIIllllIl, lIlIlIlIIllllIl)) {
            IlllIIlIIllllIl = ll[0];
            while (Main.Illl(IlllIIlIIllllIl, IIlIlIlIIllllIl)) {
                if (Main.llll(llIIlIlIIllllIl[llllIIlIIllllIl][IlllIIlIIllllIl], ll[1])) {
                    "".length();
                    if (" ".length() << (" ".length() << " ".length()) <= 0) {
                        return;
                    }
                } else {
                    lIllIIlIIllllIl = IlIIlIlIIllllIl22[IlllIIlIIllllIl][llllIIlIIllllIl] - ll[2];
                    IIllIIlIIllllIl = IlllIIlIIllllIl + ll[2];
                    while (Main.Illl(IIllIIlIIllllIl, IIlIlIlIIllllIl)) {
                        if (Main.llll(llIIlIlIIllllIl[llllIIlIIllllIl][IIllIIlIIllllIl], ll[1])) {
                            "".length();
                            if (" ".length() << " ".length() > 0) break;
                            return;
                        }
                        int llIlIIlIIllllIl = IlIIlIlIIllllIl22[IIllIIlIIllllIl][llllIIlIIllllIl] - ll[2];
                        int IlIlIIlIIllllIl = Math.min(lIllIIlIIllllIl, llIlIIlIIllllIl);
                        if (Main.llll(IlIlIIlIIllllIl, llllIIlIIllllIl)) {
                            "".length();
                            if ("   ".length() > " ".length() << (" ".length() << " ".length())) {
                                return;
                            }
                        } else if (Main.IlIIl(lIIIlIlIIllllIl22[IlIlIIlIIllllIl][IlllIIlIIllllIl][IIllIIlIIllllIl])) {
                            "".length();
                            if (-(0xA0 ^ 0xA4) > 0) {
                                return;
                            }
                        } else {
                            int lIIlIIlIIllllIl = ll[3] * (IlIlIIlIIllllIl - llllIIlIIllllIl + IIllIIlIIllllIl - IlllIIlIIllllIl);
                            IIIIlIlIIllllIl = Math.max(IIIIlIlIIllllIl, lIIlIIlIIllllIl);
                        }
                        ++IIllIIlIIllllIl;
                        "".length();
                        if ((0x13 ^ 0x16) > 0) continue;
                        return;
                    }
                }
                ++IlllIIlIIllllIl;
                "".length();
                if ("   ".length() > ((0x21 ^ 8) << " ".length() & ~((0x64 ^ 0x4D) << " ".length()))) continue;
                return;
            }
            ++llllIIlIIllllIl;
            "".length();
            if ("   ".length() != 0) continue;
            return;
        }
        if (Main.lIIIl(IIIIlIlIIllllIl)) {
            System.out.println(IIIIlIlIIllllIl);
            "".length();
            if (" ".length() << (" ".length() << " ".length()) == "   ".length()) {
                return;
            }
        } else {
            System.out.println(Il[ll[2]]);
        }
    }

    public static void main(String[] stringArray) throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        String IIlIIIlIIllllIl = br.readLine();
        int llIIIIlIIllllIl = ll[0];
        int IlIIIIlIIllllIl = ll[0];
        int lIIIIIlIIllllIl = ll[0];
        while (Main.Illl(lIIIIIlIIllllIl, ll[4])) {
            int n;
            int n2;
            if (Main.llll(IIlIIIlIIllllIl.charAt(lIIIIIlIIllllIl), ll[5])) {
                n2 = ll[2];
                "".length();
                if (" ".length() > "   ".length()) {
                    return;
                }
            } else {
                n2 = ll[0];
            }
            IlIIIIlIIllllIl += n2;
            if (Main.llll(IIlIIIlIIllllIl.charAt(lIIIIIlIIllllIl), ll[6])) {
                n = ll[2];
                "".length();
                if ("   ".length() < -" ".length()) {
                    return;
                }
            } else {
                n = ll[0];
            }
            llIIIIlIIllllIl += n;
            ++lIIIIIlIIllllIl;
            "".length();
            if (null == null) continue;
            return;
        }
        if (!Main.IIIIl(IlIIIIlIIllllIl, ll[4]) || Main.llll(llIIIIlIIllllIl, ll[4])) {
            System.out.println(Il[ll[3]]);
            "".length();
            if (((0x54 ^ 0x47) & ~(0x6F ^ 0x7C)) != ((0x3E ^ 1) & ~(0x41 ^ 0x7E))) {
                return;
            }
        } else {
            System.out.println(Il[ll[4]]);
        }
    }

    static {
        Main.lIll();
        Main.IIll();
    }

    private static void IIll() {
        Il = new String[ll[7]];
        Main.Il[Main.ll[0]] = Main.IlIl("bg==", "NBzON");
        Main.Il[Main.ll[2]] = Main.IlIl("CAYUBCcSAgYHMQ==", "akdkT");
        Main.Il[Main.ll[3]] = Main.llIl("+oHzYQLf10Y=", "cqAjx");
        Main.Il[Main.ll[4]] = Main.IlIl("LDAJ", "uUzJe");
    }

    /*
     * Unable to fully structure code
     */
    private static String IlIl(String lllIllIIIllllIl, String IllIllIIIllllIl) {
        lllIllIIIllllIl = new String(Base64.getDecoder().decode(lllIllIIIllllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        lIlIllIIIllllIl = new StringBuilder();
        IIlIllIIIllllIl = IllIllIIIllllIl.toCharArray();
        llIIllIIIllllIl = Main.ll[0];
        lIIlIlIIIllllIl = lllIllIIIllllIl.toCharArray();
        IlIlIlIIIllllIl = lIIlIlIIIllllIl.length;
        llIlIlIIIllllIl = Main.ll[0];
        "".length();
        if (("   ".length() & ~"   ".length()) == 0) ** GOTO lbl19
        return null;
lbl-1000:
        // 1 sources

        {
            IlIIllIIIllllIl = lIIlIlIIIllllIl[llIlIlIIIllllIl];
            lIlIllIIIllllIl.append((char)(IlIIllIIIllllIl ^ IIlIllIIIllllIl[llIIllIIIllllIl % IIlIllIIIllllIl.length]));
            "".length();
            ++llIIllIIIllllIl;
            ++llIlIlIIIllllIl;
lbl19:
            // 2 sources

            ** while (!Main.llIIl((int)llIlIlIIIllllIl, (int)IlIlIlIIIllllIl))
        }
lbl20:
        // 1 sources

        return String.valueOf(lIlIllIIIllllIl);
    }

    private static String llIl(String IIlIIlIIIllllIl, String llIIIlIIIllllIl) {
        try {
            SecretKeySpec IlIIIlIIIllllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIIlIIIllllIl.getBytes(StandardCharsets.UTF_8)), ll[8]), "DES");
            Cipher lIIIIlIIIllllIl = Cipher.getInstance("DES");
            lIIIIlIIIllllIl.init(ll[3], IlIIIlIIIllllIl);
            return new String(lIIIIlIIIllllIl.doFinal(Base64.getDecoder().decode(IIlIIlIIIllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIIIIlIIIllllIl) {
            IIIIIlIIIllllIl.printStackTrace();
            return null;
        }
    }

    private static void lIll() {
        ll = new int[9];
        Main.ll[0] = "   ".length() << "   ".length() & ("   ".length() << "   ".length() ^ -" ".length());
        Main.ll[1] = ((0x50 ^ 9) << " ".length() ^ 185 + 106 - 253 + 151) << "   ".length();
        Main.ll[2] = " ".length();
        Main.ll[3] = " ".length() << " ".length();
        Main.ll[4] = "   ".length();
        Main.ll[5] = 0xF0 ^ 0x91 ^ " ".length() << (0x89 ^ 0x8C);
        Main.ll[6] = (0xA1 ^ 0x80) << " ".length();
        Main.ll[7] = " ".length() << (" ".length() << " ".length());
        Main.ll[8] = " ".length() << "   ".length();
    }

    private static boolean llll(int n, int n2) {
        return n == n2;
    }

    private static boolean llIIl(int n, int n2) {
        return n >= n2;
    }

    private static boolean Illl(int n, int n2) {
        return n < n2;
    }

    private static boolean lIIIl(int n) {
        return n != 0;
    }

    private static boolean IlIIl(int n) {
        return n == 0;
    }

    private static boolean IIIIl(int n, int n2) {
        return n != n2;
    }
}

