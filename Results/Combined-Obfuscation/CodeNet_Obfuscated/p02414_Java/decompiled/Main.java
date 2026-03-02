/*
 * Decompiled with CFR 0.152.
 */
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Scanner;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Main {
    private static String[] IIIlIllIll;
    private static int[] lIllIllIll;
    private static int[] llllIllIll;

    public Main() {
        Main lIlIlIIIlIIlIll;
    }

    public static void main(String[] stringArray) {
        Scanner IlIIIIIIlIIlIll = new Scanner(System.in);
        String lIIIIIIIlIIlIll = IIIlIllIll[lIllIllIll[llllIllIll[0]]];
        String[] IIIIIIIIlIIlIll = new String[lIllIllIll[llllIllIll[1]]];
        int llllllllIIIlIll = lIllIllIll[llllIllIll[0]];
        int IlllllllIIIlIll = lIllIllIll[llllIllIll[0]];
        int lIllllllIIIlIll = lIllIllIll[llllIllIll[0]];
        int IIllllllIIIlIll = lIllIllIll[llllIllIll[2]];
        lIIIIIIIlIIlIll = IlIIIIIIlIIlIll.nextLine();
        IIIIIIIIlIIlIll = lIIIIIIIlIIlIll.split(IIIlIllIll[lIllIllIll[llllIllIll[2]]]);
        llllllllIIIlIll = Integer.parseInt(IIIIIIIIlIIlIll[lIllIllIll[llllIllIll[0]]]);
        IlllllllIIIlIll = Integer.parseInt(IIIIIIIIlIIlIll[lIllIllIll[llllIllIll[2]]]);
        lIllllllIIIlIll = Integer.parseInt(IIIIIIIIlIIlIll[lIllIllIll[llllIllIll[3]]]);
        if (!(Main.llIIIlIlIIll(Main.IllIlIIlIIll(lIllIllIll[llllIllIll[2]], llllllllIIIlIll) ? 1 : 0) && Main.llIIIlIlIIll(Main.IllIlIIlIIll(llllllllIIIlIll, lIllIllIll[llllIllIll[4]]) ? 1 : 0) && Main.llIIIlIlIIll(Main.IllIlIIlIIll(lIllIllIll[llllIllIll[2]], IlllllllIIIlIll) ? 1 : 0) && Main.llIIIlIlIIll(Main.IllIlIIlIIll(IlllllllIIIlIll, lIllIllIll[llllIllIll[4]]) ? 1 : 0) && Main.llIIIlIlIIll(Main.IllIlIIlIIll(lIllIllIll[llllIllIll[2]], lIllllllIIIlIll) ? 1 : 0) && !Main.llIIIlIlIIll(Main.lllIlIIlIIll(lIllllllIIIlIll, lIllIllIll[llllIllIll[4]]) ? 1 : 0))) {
            IIllllllIIIlIll = lIllIllIll[llllIllIll[0]];
        }
        if (Main.llIIIlIlIIll(Main.IIIllIIlIIll(IIllllllIIIlIll, lIllIllIll[llllIllIll[2]]) ? 1 : 0)) {
            int llIIllllIIIlIll;
            String llIlllllIIIlIll = IIIlIllIll[lIllIllIll[llllIllIll[3]]];
            String[] IlIlllllIIIlIll = new String[IlllllllIIIlIll];
            int[][] lIIlllllIIIlIll = new int[llllllllIIIlIll][IlllllllIIIlIll];
            String[] IIIlllllIIIlIll = new String[lIllllllIIIlIll];
            int[][] lllIllllIIIlIll = new int[IlllllllIIIlIll][lIllllllIIIlIll];
            long[][] IllIllllIIIlIll = new long[llllllllIIIlIll][lIllllllIIIlIll];
            String[] lIlIllllIIIlIll = new String[llllllllIIIlIll];
            int IIlIllllIIIlIll = lIllIllIll[llllIllIll[0]];
            block0: while (Main.llIIIlIlIIll(Main.lIIllIIlIIll(IIlIllllIIIlIll, llllllllIIIlIll) ? 1 : 0)) {
                llIlllllIIIlIll = IlIIIIIIlIIlIll.nextLine();
                IlIlllllIIIlIll = llIlllllIIIlIll.split(IIIlIllIll[lIllIllIll[llllIllIll[1]]]);
                llIIllllIIIlIll = lIllIllIll[llllIllIll[0]];
                while (Main.llIIIlIlIIll(Main.lIIllIIlIIll(llIIllllIIIlIll, IlllllllIIIlIll) ? 1 : 0)) {
                    lIIlllllIIIlIll[IIlIllllIIIlIll][llIIllllIIIlIll] = Integer.parseInt(IlIlllllIIIlIll[llIIllllIIIlIll]);
                    if (!Main.llIIIlIlIIll(Main.IlIllIIlIIll(lIIlllllIIIlIll[IIlIllllIIIlIll][llIIllllIIIlIll]) ? 1 : 0) || Main.llIIIlIlIIll(Main.lllIlIIlIIll(lIIlllllIIIlIll[IIlIllllIIIlIll][llIIllllIIIlIll], lIllIllIll[llllIllIll[5]]) ? 1 : 0)) {
                        IIllllllIIIlIll = lIllIllIll[llllIllIll[0]];
                        "".length();
                        "".length();
                        if (!Main.IIlIIlIlIIll(-(llllIllIll[6] ^ llllIllIll[0] ^ (llllIllIll[7] ^ llllIllIll[8]) << " ".length()))) break block0;
                        return;
                    }
                    ++llIIllllIIIlIll;
                    "".length();
                    "".length();
                    if (!Main.lIlIIlIlIIll(" ".length() << (" ".length() << " ".length()), " ".length())) continue;
                    return;
                }
                ++IIlIllllIIIlIll;
                "".length();
                "".length();
                if (!Main.IllIIlIlIIll(null)) continue;
                return;
            }
            if (Main.llIIIlIlIIll(Main.IIIllIIlIIll(IIllllllIIIlIll, lIllIllIll[llllIllIll[2]]) ? 1 : 0)) {
                IIlIllllIIIlIll = lIllIllIll[llllIllIll[0]];
                block2: while (Main.llIIIlIlIIll(Main.lIIllIIlIIll(IIlIllllIIIlIll, IlllllllIIIlIll) ? 1 : 0)) {
                    llIlllllIIIlIll = IlIIIIIIlIIlIll.nextLine();
                    IIIlllllIIIlIll = llIlllllIIIlIll.split(IIIlIllIll[lIllIllIll[llllIllIll[9]]]);
                    llIIllllIIIlIll = lIllIllIll[llllIllIll[0]];
                    while (Main.llIIIlIlIIll(Main.lIIllIIlIIll(llIIllllIIIlIll, lIllllllIIIlIll) ? 1 : 0)) {
                        lllIllllIIIlIll[IIlIllllIIIlIll][llIIllllIIIlIll] = Integer.parseInt(IIIlllllIIIlIll[llIIllllIIIlIll]);
                        if (!Main.llIIIlIlIIll(Main.IlIllIIlIIll(lllIllllIIIlIll[IIlIllllIIIlIll][llIIllllIIIlIll]) ? 1 : 0) || Main.llIIIlIlIIll(Main.lllIlIIlIIll(lllIllllIIIlIll[IIlIllllIIIlIll][llIIllllIIIlIll], lIllIllIll[llllIllIll[5]]) ? 1 : 0)) {
                            IIllllllIIIlIll = lIllIllIll[llllIllIll[0]];
                            "".length();
                            "".length();
                            if (!Main.lllIIlIlIIll(-" ".length(), "   ".length())) break block2;
                            return;
                        }
                        ++llIIllllIIIlIll;
                        "".length();
                        "".length();
                        if (!Main.IIIlIlIlIIll("   ".length())) continue;
                        return;
                    }
                    ++IIlIllllIIIlIll;
                    "".length();
                    "".length();
                    if (!Main.IllIIlIlIIll(null)) continue;
                    return;
                }
            }
            if (Main.llIIIlIlIIll(Main.IIIllIIlIIll(IIllllllIIIlIll, lIllIllIll[llllIllIll[2]]) ? 1 : 0)) {
                IIlIllllIIIlIll = lIllIllIll[llllIllIll[0]];
                while (Main.llIIIlIlIIll(Main.lIIllIIlIIll(IIlIllllIIIlIll, llllllllIIIlIll) ? 1 : 0)) {
                    lIlIllllIIIlIll[IIlIllllIIIlIll] = IIIlIllIll[lIllIllIll[llllIllIll[10]]];
                    llIIllllIIIlIll = lIllIllIll[llllIllIll[0]];
                    while (Main.llIIIlIlIIll(Main.lIIllIIlIIll(llIIllllIIIlIll, lIllllllIIIlIll) ? 1 : 0)) {
                        int IlIIllllIIIlIll = lIllIllIll[llllIllIll[0]];
                        while (Main.llIIIlIlIIll(Main.lIIllIIlIIll(IlIIllllIIIlIll, IlllllllIIIlIll) ? 1 : 0)) {
                            long[] lArray = IllIllllIIIlIll[IIlIllllIIIlIll];
                            int n = llIIllllIIIlIll;
                            lArray[n] = lArray[n] + (long)(lIIlllllIIIlIll[IIlIllllIIIlIll][IlIIllllIIIlIll] * lllIllllIIIlIll[IlIIllllIIIlIll][llIIllllIIIlIll]);
                            ++IlIIllllIIIlIll;
                            "".length();
                            "".length();
                            if (!Main.lIIlIlIlIIll(" ".length())) continue;
                            return;
                        }
                        if (Main.llIIIlIlIIll(Main.llIllIIlIIll(llIIllllIIIlIll) ? 1 : 0)) {
                            int n = IIlIllllIIIlIll;
                            lIlIllllIIIlIll[n] = lIlIllllIIIlIll[n] + IllIllllIIIlIll[IIlIllllIIIlIll][llIIllllIIIlIll];
                            "".length();
                            "".length();
                            if (Main.IlIlIlIlIIll("   ".length(), " ".length())) {
                                return;
                            }
                        } else {
                            int n = IIlIllllIIIlIll;
                            lIlIllllIIIlIll[n] = lIlIllllIIIlIll[n] + " " + IllIllllIIIlIll[IIlIllllIIIlIll][llIIllllIIIlIll];
                        }
                        ++llIIllllIIIlIll;
                        "".length();
                        "".length();
                        if (!Main.llIlIlIlIIll(" ".length())) continue;
                        return;
                    }
                    System.out.println(lIlIllllIIIlIll[IIlIllllIIIlIll]);
                    ++IIlIllllIIIlIll;
                    "".length();
                    "".length();
                    if (!Main.IllIIlIlIIll(null)) continue;
                    return;
                }
            }
        }
    }

    static {
        Main.IlIIIlIlIIll();
        Main.lIlllIIlIIll();
        Main.llIIlIIlIIll();
    }

    private static void llIIlIIlIIll() {
        lIllIllIll = new int[llllIllIll[11]];
        Main.lIllIllIll[Main.llllIllIll[0]] = (llllIllIll[12] ^ llllIllIll[13]) & (llllIllIll[14] ^ llllIllIll[15] ^ llllIllIll[16]);
        Main.lIllIllIll[Main.llllIllIll[1]] = "   ".length();
        Main.lIllIllIll[Main.llllIllIll[2]] = " ".length();
        Main.lIllIllIll[Main.llllIllIll[3]] = " ".length() << " ".length();
        Main.lIllIllIll[Main.llllIllIll[4]] = (llllIllIll[17] ^ llllIllIll[18]) << (" ".length() << " ".length());
        Main.lIllIllIll[Main.llllIllIll[5]] = llllIllIll[19] + llllIllIll[20] - llllIllIll[21] + llllIllIll[22] << (" ".length() << (" ".length() << " ".length()));
        Main.lIllIllIll[Main.llllIllIll[9]] = " ".length() << (" ".length() << " ".length());
        Main.lIllIllIll[Main.llllIllIll[10]] = (llllIllIll[14] ^ llllIllIll[23]) << " ".length() ^ (llllIllIll[24] ^ llllIllIll[25]);
    }

    private static boolean IIIllIIlIIll(int n, int n2) {
        boolean bl;
        if (Main.IlIlIlIlIIll(n, n2)) {
            bl = llllIllIll[1];
            "".length();
            if (null != null) {
                return ((0x8E ^ 0xC3) & ~(0xE6 ^ 0xAB)) != 0;
            }
        } else {
            bl = llllIllIll[0];
        }
        return bl;
    }

    private static boolean lIIllIIlIIll(int n, int n2) {
        boolean bl;
        if (Main.IIllIlIlIIll(n, n2)) {
            bl = llllIllIll[1];
            "".length();
            if (-" ".length() > -" ".length()) {
                return (((0x33 ^ 0x1E) << (" ".length() << " ".length()) ^ 102 + 38 - -20 + 1) << " ".length() & ((98 + 166 - 90 + 37 ^ (0x64 ^ 7) << " ".length()) << " ".length() ^ -" ".length())) != 0;
            }
        } else {
            bl = llllIllIll[0];
        }
        return bl;
    }

    private static boolean IllIlIIlIIll(int n, int n2) {
        boolean bl;
        if (Main.lIlIIlIlIIll(n, n2)) {
            bl = llllIllIll[1];
            "".length();
            if (" ".length() << " ".length() < ((0x52 ^ 1 ^ " ".length() << "   ".length()) & ((0x9F ^ 0xA6) << (" ".length() << " ".length()) ^ 20 + 164 - 155 + 162 ^ -" ".length()))) {
                return ((0x6F ^ 0x44 ^ (0xDC ^ 0xC1) << " ".length()) << " ".length() & (((0x2A ^ 0x23) << "   ".length() ^ (0x54 ^ 0xD)) << " ".length() ^ -" ".length())) != 0;
            }
        } else {
            bl = llllIllIll[0];
        }
        return bl;
    }

    private static boolean lllIlIIlIIll(int n, int n2) {
        boolean bl;
        if (Main.lIllIlIlIIll(n, n2)) {
            bl = llllIllIll[1];
            "".length();
            if (null != null) {
                return ((0xBC ^ 0xB9) << "   ".length() & ~((0x65 ^ 0x60) << "   ".length())) != 0;
            }
        } else {
            bl = llllIllIll[0];
        }
        return bl;
    }

    private static boolean llIllIIlIIll(int n) {
        boolean bl;
        if (Main.IIIlIlIlIIll(n)) {
            bl = llllIllIll[1];
            "".length();
            if (null != null) {
                return ((0xB8 ^ 0xA3) << " ".length() & ~((0x44 ^ 0x5F) << " ".length())) != 0;
            }
        } else {
            bl = llllIllIll[0];
        }
        return bl;
    }

    private static boolean IlIllIIlIIll(int n) {
        boolean bl;
        if (Main.IIlIIlIlIIll(n)) {
            bl = llllIllIll[1];
            "".length();
            if (null != null) {
                return ((4 ^ 0x1D ^ " ".length() << (" ".length() << " ".length())) & ((0x99 ^ 0x9C) << (" ".length() << (" ".length() << " ".length())) ^ (0x51 ^ 0x1C) ^ -" ".length())) != 0;
            }
        } else {
            bl = llllIllIll[0];
        }
        return bl;
    }

    private static void lIlllIIlIIll() {
        IIIlIllIll = new String[llllIllIll[9]];
        Main.IIIlIllIll[Main.llllIllIll[0]] = Main.lIIIlIIlIIll("tw5bWpwfLm8=", "jDZqx");
        Main.IIIlIllIll[Main.llllIllIll[1]] = Main.lIIIlIIlIIll("9x7fxcZW3Cc=", "XUuRY");
        Main.IIIlIllIll[Main.llllIllIll[2]] = Main.IIlllIIlIIll("", "IMFmi");
        Main.IIIlIllIll[Main.llllIllIll[3]] = Main.lIIIlIIlIIll("Ju55bCiH2lg=", "vPSKH");
        Main.IIIlIllIll[Main.llllIllIll[4]] = Main.lIIIlIIlIIll("bNt8i3IP2yE=", "GTbuM");
        Main.IIIlIllIll[Main.llllIllIll[5]] = Main.IIlllIIlIIll("", "jFzkd");
    }

    /*
     * Unable to fully structure code
     */
    private static String IIlllIIlIIll(String lIIlllIlIIIlIll, String IIIlllIlIIIlIll) {
        lIIlllIlIIIlIll = new String(Base64.getDecoder().decode(lIIlllIlIIIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        lllIllIlIIIlIll = new StringBuilder();
        IllIllIlIIIlIll = IIIlllIlIIIlIll.toCharArray();
        lIlIllIlIIIlIll = Main.llllIllIll[0];
        llIlIlIlIIIlIll = lIIlllIlIIIlIll.toCharArray();
        IIllIlIlIIIlIll = llIlIlIlIIIlIll.length;
        lIllIlIlIIIlIll = Main.llllIllIll[0];
        "".length();
        if ("   ".length() > -" ".length()) ** GOTO lbl19
        return null;
lbl-1000:
        // 1 sources

        {
            IIlIllIlIIIlIll = llIlIlIlIIIlIll[lIllIlIlIIIlIll];
            lllIllIlIIIlIll.append((char)(IIlIllIlIIIlIll ^ IllIllIlIIIlIll[lIlIllIlIIIlIll % IllIllIlIIIlIll.length]));
            "".length();
            ++lIlIllIlIIIlIll;
            ++lIllIlIlIIIlIll;
lbl19:
            // 2 sources

            ** while (!Main.lllIIlIlIIll((int)lIllIlIlIIIlIll, (int)IIllIlIlIIIlIll))
        }
lbl20:
        // 1 sources

        return String.valueOf(lllIllIlIIIlIll);
    }

    private static String lIIIlIIlIIll(String IllIIlIlIIIlIll, String lIlIIlIlIIIlIll) {
        try {
            SecretKeySpec IIlIIlIlIIIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIIlIlIIIlIll.getBytes(StandardCharsets.UTF_8)), llllIllIll[11]), "DES");
            Cipher llIIIlIlIIIlIll = Cipher.getInstance("DES");
            llIIIlIlIIIlIll.init(llllIllIll[2], IIlIIlIlIIIlIll);
            return new String(llIIIlIlIIIlIll.doFinal(Base64.getDecoder().decode(IllIIlIlIIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IlIIIlIlIIIlIll) {
            IlIIIlIlIIIlIll.printStackTrace();
            return null;
        }
    }

    private static void IlIIIlIlIIll() {
        llllIllIll = new int[26];
        Main.llllIllIll[0] = (0x85 ^ 0x8E) << "   ".length() & ~((0x29 ^ 0x22) << "   ".length());
        Main.llllIllIll[1] = " ".length();
        Main.llllIllIll[2] = " ".length() << " ".length();
        Main.llllIllIll[3] = "   ".length();
        Main.llllIllIll[4] = " ".length() << (" ".length() << " ".length());
        Main.llllIllIll[5] = (0x3A ^ 7) << " ".length() ^ 14 + 31 - 19 + 101;
        Main.llllIllIll[6] = 0x98 ^ 0xBF;
        Main.llllIllIll[7] = (0xA2 ^ 0x91) << " ".length();
        Main.llllIllIll[8] = 0xEC ^ 0x9B;
        Main.llllIllIll[9] = "   ".length() << " ".length();
        Main.llllIllIll[10] = "   ".length() << "   ".length() ^ (0x5D ^ 0x42);
        Main.llllIllIll[11] = " ".length() << "   ".length();
        Main.llllIllIll[12] = 0xEB ^ 0x88;
        Main.llllIllIll[13] = (0x91 ^ 0xBA) << " ".length();
        Main.llllIllIll[14] = (0x9B ^ 0x94) << (" ".length() << " ".length()) ^ (0x7D ^ 0x4C);
        Main.llllIllIll[15] = (0x59 ^ 0x28 ^ (0x63 ^ 0x58) << " ".length()) << "   ".length();
        Main.llllIllIll[16] = -" ".length();
        Main.llllIllIll[17] = (0xA7 ^ 0xB4) << " ".length() ^ (0x2E ^ 0x5B);
        Main.llllIllIll[18] = (0x35 ^ 0x1A ^ (0x53 ^ 0x56) << " ".length()) << " ".length();
        Main.llllIllIll[19] = 2 + 12 - -112 + 29;
        Main.llllIllIll[20] = 129 + 5 - 108 + 145;
        Main.llllIllIll[21] = (" ".length() << (0xE ^ 0xB)) + ((0xAB ^ 0xAE) << (" ".length() << " ".length())) - (0xB ^ 2) + ((0xAE ^ 0xB5) << (" ".length() << " ".length()));
        Main.llllIllIll[22] = " ".length() + (0x64 ^ 0xD) - (0xE4 ^ 0xBB) + ((0x71 ^ 0x1A) << " ".length()) << " ".length();
        Main.llllIllIll[23] = (0x18 ^ 0x15 ^ (0x64 ^ 0x6F) << " ".length()) << " ".length();
        Main.llllIllIll[24] = 0xAB ^ 0x96;
        Main.llllIllIll[25] = (0x9A ^ 0xBD) << " ".length();
    }

    private static boolean IlIlIlIlIIll(int n, int n2) {
        return n == n2;
    }

    private static boolean lllIIlIlIIll(int n, int n2) {
        return n >= n2;
    }

    private static boolean IIllIlIlIIll(int n, int n2) {
        return n < n2;
    }

    private static boolean lIlIIlIlIIll(int n, int n2) {
        return n <= n2;
    }

    private static boolean lIllIlIlIIll(int n, int n2) {
        return n > n2;
    }

    private static boolean IllIIlIlIIll(Object object) {
        return object != null;
    }

    private static boolean llIIIlIlIIll(int n) {
        return n != 0;
    }

    private static boolean IIIlIlIlIIll(int n) {
        return n == 0;
    }

    private static boolean IIlIIlIlIIll(int n) {
        return n >= 0;
    }

    private static boolean lIIlIlIlIIll(int n) {
        return n < 0;
    }

    private static boolean llIlIlIlIIll(int n) {
        return n <= 0;
    }
}

