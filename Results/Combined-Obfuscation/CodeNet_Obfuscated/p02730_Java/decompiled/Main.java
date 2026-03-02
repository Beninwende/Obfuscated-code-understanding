/*
 * Decompiled with CFR 0.152.
 */
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Scanner;
import java.util.Stack;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

class Main {
    private static String[] IllIIIIIll;
    private static int[] llIlIIIIll;
    private static int[] lIllIIIIll;

    Main() {
        Main llIlIIIllIIllll;
    }

    static boolean isStrongAnagram(String lIlllllIlIIllll) {
        int n;
        int IIlllllIlIIllll = lIlllllIlIIllll.length();
        int llIllllIlIIllll = (IIlllllIlIIllll - llIlIIIIll[lIllIIIIll[0]]) / llIlIIIIll[lIllIIIIll[1]];
        if (Main.llIIIIIIllIl(Main.llIIllllIlIl((int)(llIllllIlIIllll % llIlIIIIll[lIllIIIIll[1]]), (int)llIlIIIIll[lIllIIIIll[0]]) ? 1 : 0)) {
            n = llIlIIIIll[lIllIIIIll[0]];
            "".length();
            "".length();
            if (Main.IIlIIIIIllIl(" ".length() << (" ".length() << " ".length()), " ".length())) {
                return ((lIllIIIIll[2] ^ lIllIIIIll[3]) << (" ".length() << " ".length()) & ((lIllIIIIll[4] ^ lIllIIIIll[5]) << (" ".length() << " ".length()) ^ lIllIIIIll[6])) != 0;
            }
        } else {
            n = llIlIIIIll[lIllIIIIll[7]];
        }
        int IlIllllIlIIllll = n;
        int lIIllllIlIIllll = (llIllllIlIIllll - llIlIIIIll[lIllIIIIll[0]]) / llIlIIIIll[lIllIIIIll[1]];
        if (Main.llIIIIIIllIl(Main.IIlIllllIlIl((int)IlIllllIlIIllll) ? 1 : 0)) {
            ++lIIllllIlIIllll;
        }
        int IIIllllIlIIllll = (IIlllllIlIIllll + llIlIIIIll[lIllIIIIll[0]]) / llIlIIIIll[lIllIIIIll[1]];
        int lllIlllIlIIllll = IIIllllIlIIllll + lIIllllIlIIllll;
        Stack<Character> IllIlllIlIIllll = new Stack<Character>();
        Stack<Character> lIlIlllIlIIllll = new Stack<Character>();
        int IlIIlllIlIIllll = llIlIIIIll[lIllIIIIll[7]];
        while (Main.llIIIIIIllIl(Main.lIlIllllIlIl((int)IlIIlllIlIIllll, (int)IIlllllIlIIllll) ? 1 : 0)) {
            char IIlIlllIlIIllll = lIlllllIlIIllll.charAt(IlIIlllIlIIllll);
            if (Main.llIIIIIIllIl(Main.lIlIllllIlIl((int)IlIIlllIlIIllll, (int)llIllllIlIIllll) ? 1 : 0)) {
                IllIlllIlIIllll.push(Character.valueOf(IIlIlllIlIIllll));
                "".length();
                if (Main.llIIIIIIllIl(Main.lIlIllllIlIl((int)IlIIlllIlIIllll, (int)lIIllllIlIIllll) ? 1 : 0)) {
                    lIlIlllIlIIllll.push(Character.valueOf(IIlIlllIlIIllll));
                    "".length();
                    "".length();
                    "".length();
                    if (Main.lIlIIIIIllIl(null)) {
                        return (("   ".length() ^ (lIllIIIIll[8] ^ lIllIIIIll[9]) << " ".length()) << (" ".length() << " ".length()) & (((lIllIIIIll[10] ^ lIllIIIIll[11]) << " ".length() ^ lIllIIIIll[12] + lIllIIIIll[13] - lIllIIIIll[14] + lIllIIIIll[15]) << (" ".length() << " ".length()) ^ -" ".length())) != 0;
                    }
                } else if ((!Main.llIIIIIIllIl(Main.IIIlllllIlIl((int)IlIllllIlIIllll) ? 1 : 0) || Main.llIIIIIIllIl(Main.lIIlllllIlIl((int)IlIIlllIlIIllll, (int)lIIllllIlIIllll) ? 1 : 0)) && Main.llIIIIIIllIl(Main.llIlllllIlIl((int)IIlIlllIlIIllll, (int)(llIIlllIlIIllll = ((Character)lIlIlllIlIIllll.pop()).charValue())) ? 1 : 0)) {
                    return llIlIIIIll[lIllIIIIll[7]];
                }
            } else if (Main.llIIIIIIllIl(Main.llIIllllIlIl((int)IlIIlllIlIIllll, (int)llIllllIlIIllll) ? 1 : 0)) {
                if (Main.llIIIIIIllIl(Main.IIlIllllIlIl((int)(lIlIlllIlIIllll.isEmpty() ? 1 : 0)) ? 1 : 0)) {
                    return llIlIIIIll[lIllIIIIll[7]];
                }
            } else {
                llIIlllIlIIllll = ((Character)IllIlllIlIIllll.pop()).charValue();
                if (Main.llIIIIIIllIl(Main.llIlllllIlIl((int)IIlIlllIlIIllll, (int)llIIlllIlIIllll) ? 1 : 0)) {
                    return llIlIIIIll[lIllIIIIll[7]];
                }
                if (Main.llIIIIIIllIl(Main.IIllllllIlIl((int)IlIIlllIlIIllll, (int)IIIllllIlIIllll) ? 1 : 0)) {
                    if (Main.llIIIIIIllIl(Main.lIlIllllIlIl((int)IlIIlllIlIIllll, (int)lllIlllIlIIllll) ? 1 : 0)) {
                        lIlIlllIlIIllll.push(Character.valueOf(IIlIlllIlIIllll));
                        "".length();
                        "".length();
                        "".length();
                        if (Main.lllIIIIIllIl(" ".length() & (" ".length() ^ lIllIIIIll[6]), " ".length())) {
                            return ((lIllIIIIll[16] ^ lIllIIIIll[17]) << (" ".length() << " ".length()) & ((lIllIIIIll[18] ^ lIllIIIIll[19]) << (" ".length() << " ".length()) ^ lIllIIIIll[6])) != 0;
                        }
                    } else if ((!Main.llIIIIIIllIl(Main.IIIlllllIlIl((int)IlIllllIlIIllll) ? 1 : 0) || Main.llIIIIIIllIl(Main.lIIlllllIlIl((int)IlIIlllIlIIllll, (int)lllIlllIlIIllll) ? 1 : 0)) && Main.llIIIIIIllIl(Main.llIlllllIlIl((int)IIlIlllIlIIllll, (int)(llIIlllIlIIllll = ((Character)lIlIlllIlIIllll.pop()).charValue())) ? 1 : 0)) {
                        return llIlIIIIll[lIllIIIIll[7]];
                    }
                }
            }
            ++IlIIlllIlIIllll;
            "".length();
            "".length();
            if (!Main.IIIlIIIIllIl(" ".length() << " ".length())) continue;
            return ((lIllIIIIll[20] ^ lIllIIIIll[21]) & (lIllIIIIll[22] ^ lIllIIIIll[23] ^ lIllIIIIll[6])) != 0;
        }
        if (!Main.llIIIIIIllIl(Main.IIIlllllIlIl((int)(IllIlllIlIIllll.isEmpty() ? 1 : 0)) ? 1 : 0) || Main.llIIIIIIllIl(Main.IIlIllllIlIl((int)(lIlIlllIlIIllll.isEmpty() ? 1 : 0)) ? 1 : 0)) {
            return llIlIIIIll[lIllIIIIll[7]];
        }
        return llIlIIIIll[lIllIIIIll[0]];
    }

    public static void main(String[] stringArray) {
        Scanner IlIIIllIlIIllll = new Scanner(System.in);
        PrintWriter lIIIIllIlIIllll = new PrintWriter(System.out);
        String IIIIIllIlIIllll = IlIIIllIlIIllll.next();
        if (Main.llIIIIIIllIl(Main.isStrongAnagram(IIIIIllIlIIllll) ? 1 : 0)) {
            lIIIIllIlIIllll.println(IllIIIIIll[llIlIIIIll[lIllIIIIll[7]]]);
            "".length();
            if (null != null) {
                return;
            }
        } else {
            lIIIIllIlIIllll.println(IllIIIIIll[llIlIIIIll[lIllIIIIll[0]]]);
        }
        lIIIIllIlIIllll.flush();
    }

    static {
        Main.IlIIIIIIllIl();
        Main.IlIlllllIlIl();
        Main.IIIIllllIlIl();
    }

    private static void IIIIllllIlIl() {
        llIlIIIIll = new int[lIllIIIIll[24]];
        Main.llIlIIIIll[Main.lIllIIIIll[0]] = " ".length();
        Main.llIlIIIIll[Main.lIllIIIIll[1]] = " ".length() << " ".length();
        Main.llIlIIIIll[Main.lIllIIIIll[7]] = ("   ".length() << "   ".length() ^ (lIllIIIIll[25] ^ lIllIIIIll[26])) & ((lIllIIIIll[27] ^ lIllIIIIll[28]) << " ".length() ^ (lIllIIIIll[29] ^ lIllIIIIll[30]) ^ -" ".length());
    }

    private static void IlIlllllIlIl() {
        IllIIIIIll = new String[lIllIIIIll[7]];
        Main.IllIIIIIll[Main.lIllIIIIll[0]] = Main.llIIIlllIlIl("EQId", "HgnFg");
        Main.IllIIIIIll[Main.lIllIIIIll[1]] = Main.IIlIIlllIlIl("ImE2t7bXiw8=", "oUMCZ");
    }

    private static String IIlIIlllIlIl(String IIIllIlIlIIllll, String lllIlIlIlIIllll) {
        try {
            SecretKeySpec IllIlIlIlIIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIlIlIlIIllll.getBytes(StandardCharsets.UTF_8)), lIllIIIIll[31]), "DES");
            Cipher lIlIlIlIlIIllll = Cipher.getInstance("DES");
            lIlIlIlIlIIllll.init(lIllIIIIll[7], IllIlIlIlIIllll);
            return new String(lIlIlIlIlIIllll.doFinal(Base64.getDecoder().decode(IIIllIlIlIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIlIlIlIlIIllll) {
            IIlIlIlIlIIllll.printStackTrace();
            return null;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static String llIIIlllIlIl(String IlIIIIlIlIIllll, String lIIIIIlIlIIllll) {
        IlIIIIlIlIIllll = new String(Base64.getDecoder().decode(IlIIIIlIlIIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        IIIIIIlIlIIllll = new StringBuilder();
        llllllIIlIIllll = lIIIIIlIlIIllll.toCharArray();
        IlllllIIlIIllll = Main.lIllIIIIll[0];
        IIlIllIIlIIllll = IlIIIIlIlIIllll.toCharArray();
        lIlIllIIlIIllll = IIlIllIIlIIllll.length;
        IllIllIIlIIllll = Main.lIllIIIIll[0];
        "".length();
        if (" ".length() << (" ".length() << " ".length()) != " ".length()) ** GOTO lbl19
        return null;
lbl-1000:
        // 1 sources

        {
            lIllllIIlIIllll = IIlIllIIlIIllll[IllIllIIlIIllll];
            IIIIIIlIlIIllll.append((char)(lIllllIIlIIllll ^ llllllIIlIIllll[IlllllIIlIIllll % llllllIIlIIllll.length]));
            "".length();
            ++IlllllIIlIIllll;
            ++IllIllIIlIIllll;
lbl19:
            // 2 sources

            ** while (!Main.llIlIIIIllIl((int)IllIllIIlIIllll, (int)lIlIllIIlIIllll))
        }
lbl20:
        // 1 sources

        return String.valueOf(IIIIIIlIlIIllll);
    }

    private static void IlIIIIIIllIl() {
        lIllIIIIll = new int[32];
        Main.lIllIIIIll[0] = (0xD9 ^ 0xC0 ^ (0x97 ^ 0x88) << " ".length()) & (" ".length() << ("   ".length() << " ".length()) ^ (0x62 ^ 5) ^ -" ".length()) & ("   ".length() << ((0x8D ^ 0x94) << " ".length() ^ (0xF1 ^ 0xC6)) & ("   ".length() << (91 + 109 - 194 + 177 ^ (0xA ^ 0x53) << " ".length()) ^ -" ".length()) ^ -" ".length());
        Main.lIllIIIIll[1] = " ".length();
        Main.lIllIIIIll[2] = (0x44 ^ 0x23) + (0x43 ^ 0x72) - (18 + 45 - -34 + 40) + ((0xB4 ^ 0xBB) << "   ".length());
        Main.lIllIIIIll[3] = (0xC ^ 0x63 ^ (0x77 ^ 0x64) << " ".length()) << " ".length();
        Main.lIllIIIIll[4] = (0xED ^ 0xB4) << " ".length();
        Main.lIllIIIIll[5] = 76 + 118 - 186 + 131 + (0xA9 ^ 0xB8) - ((0x26 ^ 0x2B) << (" ".length() << " ".length())) + (0x67 ^ 0x58);
        Main.lIllIIIIll[6] = -" ".length();
        Main.lIllIIIIll[7] = " ".length() << " ".length();
        Main.lIllIIIIll[8] = 122 + 53 - 94 + 82;
        Main.lIllIIIIll[9] = (0x94 ^ 0x81) << "   ".length();
        Main.lIllIIIIll[10] = 129 + 201 - 254 + 145;
        Main.lIllIIIIll[11] = " ".length() << (0xF0 ^ 0x81 ^ (0xB5 ^ 0x8E) << " ".length());
        Main.lIllIIIIll[12] = 0x57 ^ 0x24;
        Main.lIllIIIIll[13] = 0x90 ^ 0x97;
        Main.lIllIIIIll[14] = ((0xA6 ^ 0xBB) << (" ".length() << " ".length()) ^ (0x12 ^ 0x61)) << "   ".length();
        Main.lIllIIIIll[15] = 0xAE ^ 0xC3;
        Main.lIllIIIIll[16] = (0x8B ^ 0x90 ^ (0x53 ^ 0x5C) << " ".length()) << (0x2A ^ 0x77 ^ (6 ^ 0xD) << "   ".length());
        Main.lIllIIIIll[17] = 131 + 57 - 132 + 113;
        Main.lIllIIIIll[18] = ((6 ^ 1) << (" ".length() << " ".length()) ^ (0x59 ^ 0x1E)) << " ".length();
        Main.lIllIIIIll[19] = (0x74 ^ 0x15) + (" ".length() << (0x4E ^ 0x49)) - ((0xA8 ^ 0x87) << " ".length()) + ((0x43 ^ 0x4C) << (" ".length() << " ".length()));
        Main.lIllIIIIll[20] = ((0xA5 ^ 0xAE) << " ".length() ^ (0xFD ^ 0xAC)) << " ".length();
        Main.lIllIIIIll[21] = ((0x99 ^ 0x82) << " ".length()) + ("   ".length() << (0x2A ^ 0x2F)) - ((0xE3 ^ 0xC0) << " ".length()) + (0x7C ^ 0xF);
        Main.lIllIIIIll[22] = (0x8F ^ 0xAC) << (" ".length() << " ".length());
        Main.lIllIIIIll[23] = 180 + 33 - 185 + 165;
        Main.lIllIIIIll[24] = "   ".length();
        Main.lIllIIIIll[25] = 0x3C ^ 0x77;
        Main.lIllIIIIll[26] = "   ".length() << (" ".length() << " ".length());
        Main.lIllIIIIll[27] = 0x7B ^ 0x64;
        Main.lIllIIIIll[28] = "   ".length() << " ".length();
        Main.lIllIIIIll[29] = (0x6E ^ 0x63 ^ (0x1A ^ 0x11) << " ".length()) << " ".length();
        Main.lIllIIIIll[30] = 0xC9 ^ 0x92;
        Main.lIllIIIIll[31] = " ".length() << "   ".length();
    }

    private static boolean lllIIIIIllIl(int n, int n2) {
        return n == n2;
    }

    private static boolean llIlIIIIllIl(int n, int n2) {
        return n >= n2;
    }

    private static boolean IIlIIIIIllIl(int n, int n2) {
        return n <= n2;
    }

    private static boolean lIlIIIIIllIl(Object object) {
        return object != null;
    }

    private static boolean llIIIIIIllIl(int n) {
        return n != 0;
    }

    private static boolean IIIlIIIIllIl(int n) {
        return n < 0;
    }
}

