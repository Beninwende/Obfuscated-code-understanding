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
    private static String[] Ill;
    private static int[] lll;

    public Main() {
        Main IIIIIllllIlllIl;
    }

    public static void main(String[] stringArray) {
        Scanner IllIlIlllIlllIl = new Scanner(System.in);
        int lIlIlIlllIlllIl = IllIlIlllIlllIl.nextInt();
        int[] IIlIlIlllIlllIl = new int[lll[0]];
        int llIIlIlllIlllIl = lll[1];
        while (Main.lIlll(llIIlIlllIlllIl, lll[0])) {
            IIlIlIlllIlllIl[llIIlIlllIlllIl] = lIlIlIlllIlllIl % lll[2];
            lIlIlIlllIlllIl /= lll[2];
            ++llIIlIlllIlllIl;
            "".length();
            if (" ".length() << " ".length() != 0) continue;
            return;
        }
        llIIlIlllIlllIl = IIlIlIlllIlllIl[lll[3]];
        int IlIIlIlllIlllIl = IIlIlIlllIlllIl[lll[4]];
        int lIIIlIlllIlllIl = IIlIlIlllIlllIl[lll[5]];
        int IIIIlIlllIlllIl = IIlIlIlllIlllIl[lll[1]];
        int llllIIlllIlllIl = lll[5];
        int IlllIIlllIlllIl = lll[1];
        switch (llllIIlllIlllIl) {
            case 1: {
                IlllIIlllIlllIl = llIIlIlllIlllIl + IlIIlIlllIlllIl + lIIIlIlllIlllIl + IIIIlIlllIlllIl;
                if (Main.Illll(IlllIIlllIlllIl, lll[6])) {
                    System.out.println(llIIlIlllIlllIl + "+" + IlIIlIlllIlllIl + "+" + lIIIlIlllIlllIl + "+" + IIIIlIlllIlllIl + "=7");
                    "".length();
                    if (-" ".length() <= " ".length() << " ".length()) break;
                    return;
                }
            }
            case 2: {
                IlllIIlllIlllIl = llIIlIlllIlllIl - IlIIlIlllIlllIl + lIIIlIlllIlllIl + IIIIlIlllIlllIl;
                if (Main.Illll(IlllIIlllIlllIl, lll[6])) {
                    System.out.println(llIIlIlllIlllIl + "-" + IlIIlIlllIlllIl + "+" + lIIIlIlllIlllIl + "+" + IIIIlIlllIlllIl + "=7");
                    "".length();
                    if (-"  ".length() < 0) break;
                    return;
                }
            }
            case 3: {
                IlllIIlllIlllIl = llIIlIlllIlllIl - IlIIlIlllIlllIl + lIIIlIlllIlllIl - IIIIlIlllIlllIl;
                if (Main.Illll(IlllIIlllIlllIl, lll[6])) {
                    System.out.println(llIIlIlllIlllIl + "-" + IlIIlIlllIlllIl + "+" + lIIIlIlllIlllIl + "-" + IIIIlIlllIlllIl + "=7");
                    "".length();
                    if (" ".length() >= ((80 + 165 - 238 + 166 ^ (0x2E ^ 0x69) << " ".length()) & (0x54 ^ 1 ^ (0x10 ^ 0x2B) << " ".length() ^ -" ".length()))) break;
                    return;
                }
            }
            case 4: {
                IlllIIlllIlllIl = llIIlIlllIlllIl - IlIIlIlllIlllIl - lIIIlIlllIlllIl + IIIIlIlllIlllIl;
                if (Main.Illll(IlllIIlllIlllIl, lll[6])) {
                    System.out.println(llIIlIlllIlllIl + "-" + IlIIlIlllIlllIl + "-" + lIIIlIlllIlllIl + "+" + IIIIlIlllIlllIl + "=7");
                    "".length();
                    if (-(" ".length() << (" ".length() << " ".length()) ^ " ".length()) < 0) break;
                    return;
                }
            }
            case 5: {
                IlllIIlllIlllIl = llIIlIlllIlllIl - IlIIlIlllIlllIl - lIIIlIlllIlllIl - IIIIlIlllIlllIl;
                if (Main.Illll(IlllIIlllIlllIl, lll[6])) {
                    System.out.println(llIIlIlllIlllIl + "-" + IlIIlIlllIlllIl + "-" + lIIIlIlllIlllIl + "-" + IIIIlIlllIlllIl + "=7");
                    "".length();
                    if (" ".length() << " ".length() != 0) break;
                    return;
                }
            }
            case 6: {
                IlllIIlllIlllIl = llIIlIlllIlllIl + IlIIlIlllIlllIl - lIIIlIlllIlllIl + IIIIlIlllIlllIl;
                if (Main.Illll(IlllIIlllIlllIl, lll[6])) {
                    System.out.println(llIIlIlllIlllIl + "+" + IlIIlIlllIlllIl + "-" + lIIIlIlllIlllIl + "+" + IIIIlIlllIlllIl + "=7");
                    "".length();
                    if ("   ".length() == "   ".length()) break;
                    return;
                }
            }
            case 7: {
                IlllIIlllIlllIl = llIIlIlllIlllIl + IlIIlIlllIlllIl + lIIIlIlllIlllIl - IIIIlIlllIlllIl;
                if (Main.Illll(IlllIIlllIlllIl, lll[6])) {
                    System.out.println(llIIlIlllIlllIl + "+" + IlIIlIlllIlllIl + "+" + lIIIlIlllIlllIl + "-" + IIIIlIlllIlllIl + "=7");
                    "".length();
                    if (-(0xAE ^ 0xAA) < 0) break;
                    return;
                }
            }
            case 8: {
                IlllIIlllIlllIl = llIIlIlllIlllIl + IlIIlIlllIlllIl - lIIIlIlllIlllIl - IIIIlIlllIlllIl;
                if (Main.Illll(IlllIIlllIlllIl, lll[6])) {
                    System.out.println(llIIlIlllIlllIl + "+" + IlIIlIlllIlllIl + "-" + lIIIlIlllIlllIl + "-" + IIIIlIlllIlllIl + "=7");
                    "".length();
                    if ((((0x4E ^ 0x53) << " ".length() ^ (0xDD ^ 0xC0)) << " ".length() & (((0x2A ^ 9) << (" ".length() << " ".length()) ^ 136 + 44 - 77 + 68) << " ".length() ^ -" ".length())) <= 0) break;
                    return;
                }
            }
            default: {
                System.out.println(Ill[lll[1]]);
            }
        }
    }

    static {
        Main.IIlll();
        Main.llIll();
    }

    private static void llIll() {
        Ill = new String[lll[5]];
        Main.Ill[Main.lll[1]] = Main.IlIll("MPGVLxbmfhgOT5Ink9FpRQ==", "smGnm");
    }

    private static String IlIll(String lIIlIIlllIlllIl, String IIIlIIlllIlllIl) {
        try {
            SecretKeySpec lllIIIlllIlllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IIIlIIlllIlllIl.getBytes(StandardCharsets.UTF_8)), lll[7]), "DES");
            Cipher IllIIIlllIlllIl = Cipher.getInstance("DES");
            IllIIIlllIlllIl.init(lll[4], lllIIIlllIlllIl);
            return new String(IllIIIlllIlllIl.doFinal(Base64.getDecoder().decode(lIIlIIlllIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIIIlllIlllIl) {
            lIlIIIlllIlllIl.printStackTrace();
            return null;
        }
    }

    private static void IIlll() {
        lll = new int[8];
        Main.lll[0] = " ".length() << (" ".length() << " ".length());
        Main.lll[1] = (0x8E ^ 0x81) << (" ".length() << " ".length()) & ~((0x56 ^ 0x59) << (" ".length() << " ".length()));
        Main.lll[2] = (0x49 ^ 0x4C) << " ".length();
        Main.lll[3] = "   ".length();
        Main.lll[4] = " ".length() << " ".length();
        Main.lll[5] = " ".length();
        Main.lll[6] = 0x90 ^ 0x97;
        Main.lll[7] = " ".length() << "   ".length();
    }

    private static boolean Illll(int n, int n2) {
        return n == n2;
    }

    private static boolean lIlll(int n, int n2) {
        return n < n2;
    }
}

