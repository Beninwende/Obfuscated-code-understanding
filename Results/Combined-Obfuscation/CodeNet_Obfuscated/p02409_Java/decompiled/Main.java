/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Main {
    private static String[] lllIIIlll;
    private static int[] IIIlIIlll;

    public Main() {
        Main lIIlIllIIIlIIl;
    }

    public static void main(String[] stringArray) throws IOException {
        int llIllIlIIIlIIl = IIIlIIlll[0];
        int IlIllIlIIIlIIl = IIIlIIlll[0];
        int lIIllIlIIIlIIl = IIIlIIlll[0];
        int IIIllIlIIIlIIl = IIIlIIlll[0];
        int lllIlIlIIIlIIl = IIIlIIlll[0];
        int[][] IllIlIlIIIlIIl = new int[IIIlIIlll[1]][IIIlIIlll[2]];
        int[][] lIlIlIlIIIlIIl = new int[IIIlIIlll[1]][IIIlIIlll[2]];
        int[][] IIlIlIlIIIlIIl = new int[IIIlIIlll[1]][IIIlIIlll[2]];
        int[][] llIIlIlIIIlIIl = new int[IIIlIIlll[1]][IIIlIIlll[2]];
        BufferedReader IlIIlIlIIIlIIl = new BufferedReader(new InputStreamReader(System.in));
        llIllIlIIIlIIl = Integer.parseInt(IlIIlIlIIIlIIl.readLine());
        int lIIIlIlIIIlIIl = IIIlIIlll[0];
        while (Main.lIIIlIlIIll(lIIIlIlIIIlIIl, llIllIlIIIlIIl)) {
            String[] IIIIlIlIIIlIIl = IlIIlIlIIIlIIl.readLine().split(lllIIIlll[IIIlIIlll[0]]);
            IlIllIlIIIlIIl = Integer.parseInt(IIIIlIlIIIlIIl[IIIlIIlll[0]]);
            lIIllIlIIIlIIl = Integer.parseInt(IIIIlIlIIIlIIl[IIIlIIlll[3]]) - IIIlIIlll[3];
            IIIllIlIIIlIIl = Integer.parseInt(IIIIlIlIIIlIIl[IIIlIIlll[4]]) - IIIlIIlll[3];
            lllIlIlIIIlIIl = Integer.parseInt(IIIIlIlIIIlIIl[IIIlIIlll[1]]);
            if (Main.lIIIlIlIIll(IIIlIIlll[0], IlIllIlIIIlIIl) && Main.lIIIlIlIIll(IlIllIlIIIlIIl, IIIlIIlll[5]) && Main.IlIIlIlIIll(IIIlIIlll[0], lIIllIlIIIlIIl) && Main.lIIIlIlIIll(lIIllIlIIIlIIl, IIIlIIlll[1]) && Main.IlIIlIlIIll(IIIlIIlll[0], IIIllIlIIIlIIl) && Main.lIIIlIlIIll(IIIllIlIIIlIIl, IIIlIIlll[2])) {
                if (Main.llIIlIlIIll(IlIllIlIIIlIIl, IIIlIIlll[3])) {
                    int[] nArray = IllIlIlIIIlIIl[lIIllIlIIIlIIl];
                    int n = IIIllIlIIIlIIl;
                    nArray[n] = nArray[n] + lllIlIlIIIlIIl;
                }
                if (Main.llIIlIlIIll(IlIllIlIIIlIIl, IIIlIIlll[4])) {
                    int[] nArray = lIlIlIlIIIlIIl[lIIllIlIIIlIIl];
                    int n = IIIllIlIIIlIIl;
                    nArray[n] = nArray[n] + lllIlIlIIIlIIl;
                }
                if (Main.llIIlIlIIll(IlIllIlIIIlIIl, IIIlIIlll[1])) {
                    int[] nArray = IIlIlIlIIIlIIl[lIIllIlIIIlIIl];
                    int n = IIIllIlIIIlIIl;
                    nArray[n] = nArray[n] + lllIlIlIIIlIIl;
                }
                if (Main.llIIlIlIIll(IlIllIlIIIlIIl, IIIlIIlll[6])) {
                    int[] nArray = llIIlIlIIIlIIl[lIIllIlIIIlIIl];
                    int n = IIIllIlIIIlIIl;
                    nArray[n] = nArray[n] + lllIlIlIIIlIIl;
                }
            }
            ++lIIIlIlIIIlIIl;
            "".length();
            if ((((0x80 ^ 0x9F) << "   ".length() ^ 133 + 129 - 203 + 140) & (87 + 80 - 109 + 93 ^ (0x80 ^ 0x95) << "   ".length() ^ -" ".length())) < " ".length()) continue;
            return;
        }
        lIIIlIlIIIlIIl = IIIlIIlll[3];
        while (Main.lIIIlIlIIll(lIIIlIlIIIlIIl, IIIlIIlll[5])) {
            int llllIIlIIIlIIl;
            int IIIIlIlIIIlIIl;
            if (Main.llIIlIlIIll(lIIIlIlIIIlIIl, IIIlIIlll[3])) {
                IIIIlIlIIIlIIl = IIIlIIlll[0];
                while (Main.lIIIlIlIIll(IIIIlIlIIIlIIl, IIIlIIlll[1])) {
                    llllIIlIIIlIIl = IIIlIIlll[0];
                    while (Main.lIIIlIlIIll(llllIIlIIIlIIl, IIIlIIlll[2])) {
                        if (Main.IIlIlIlIIll(llllIIlIIIlIIl, IIIlIIlll[7])) {
                            System.out.print(" " + IllIlIlIIIlIIl[IIIIlIlIIIlIIl][llllIIlIIIlIIl]);
                            "".length();
                            if ((((0xB8 ^ 0xA9) << " ".length() ^ (0x6E ^ 0x17)) & (42 + 185 - 175 + 155 ^ (0x7A ^ 0x5F) << (" ".length() << " ".length()) ^ -" ".length())) < 0) {
                                return;
                            }
                        } else {
                            System.out.println(" " + IllIlIlIIIlIIl[IIIIlIlIIIlIIl][llllIIlIIIlIIl]);
                        }
                        ++llllIIlIIIlIIl;
                        "".length();
                        if (" ".length() == " ".length()) continue;
                        return;
                    }
                    ++IIIIlIlIIIlIIl;
                    "".length();
                    if (" ".length() << (" ".length() << " ".length()) > "   ".length()) continue;
                    return;
                }
                System.out.println(lllIIIlll[IIIlIIlll[3]]);
            }
            if (Main.llIIlIlIIll(lIIIlIlIIIlIIl, IIIlIIlll[4])) {
                IIIIlIlIIIlIIl = IIIlIIlll[0];
                while (Main.lIIIlIlIIll(IIIIlIlIIIlIIl, IIIlIIlll[1])) {
                    llllIIlIIIlIIl = IIIlIIlll[0];
                    while (Main.lIIIlIlIIll(llllIIlIIIlIIl, IIIlIIlll[2])) {
                        if (Main.IIlIlIlIIll(llllIIlIIIlIIl, IIIlIIlll[7])) {
                            System.out.print(" " + lIlIlIlIIIlIIl[IIIIlIlIIIlIIl][llllIIlIIIlIIl]);
                            "".length();
                            if (((0x12 ^ 0x3B) << " ".length() & ~((0x38 ^ 0x11) << " ".length())) != 0) {
                                return;
                            }
                        } else {
                            System.out.println(" " + lIlIlIlIIIlIIl[IIIIlIlIIIlIIl][llllIIlIIIlIIl]);
                        }
                        ++llllIIlIIIlIIl;
                        "".length();
                        if (" ".length() >= 0) continue;
                        return;
                    }
                    ++IIIIlIlIIIlIIl;
                    "".length();
                    if (null == null) continue;
                    return;
                }
                System.out.println(lllIIIlll[IIIlIIlll[4]]);
            }
            if (Main.llIIlIlIIll(lIIIlIlIIIlIIl, IIIlIIlll[1])) {
                IIIIlIlIIIlIIl = IIIlIIlll[0];
                while (Main.lIIIlIlIIll(IIIIlIlIIIlIIl, IIIlIIlll[1])) {
                    llllIIlIIIlIIl = IIIlIIlll[0];
                    while (Main.lIIIlIlIIll(llllIIlIIIlIIl, IIIlIIlll[2])) {
                        if (Main.IIlIlIlIIll(llllIIlIIIlIIl, IIIlIIlll[7])) {
                            System.out.print(" " + IIlIlIlIIIlIIl[IIIIlIlIIIlIIl][llllIIlIIIlIIl]);
                            "".length();
                            if (" ".length() << " ".length() > " ".length() << (" ".length() << " ".length())) {
                                return;
                            }
                        } else {
                            System.out.println(" " + IIlIlIlIIIlIIl[IIIIlIlIIIlIIl][llllIIlIIIlIIl]);
                        }
                        ++llllIIlIIIlIIl;
                        "".length();
                        if (" ".length() <= " ".length() << (" ".length() << " ".length())) continue;
                        return;
                    }
                    ++IIIIlIlIIIlIIl;
                    "".length();
                    if (-" ".length() <= (((0xAE ^ 0xB9) << (" ".length() << " ".length()) ^ (0x56 ^ 0x21)) << " ".length() & (((0x12 ^ 9) << " ".length() ^ (0xA1 ^ 0xBC)) << " ".length() ^ -" ".length()))) continue;
                    return;
                }
                System.out.println(lllIIIlll[IIIlIIlll[1]]);
            }
            if (Main.llIIlIlIIll(lIIIlIlIIIlIIl, IIIlIIlll[6])) {
                IIIIlIlIIIlIIl = IIIlIIlll[0];
                while (Main.lIIIlIlIIll(IIIIlIlIIIlIIl, IIIlIIlll[1])) {
                    llllIIlIIIlIIl = IIIlIIlll[0];
                    while (Main.lIIIlIlIIll(llllIIlIIIlIIl, IIIlIIlll[2])) {
                        if (Main.IIlIlIlIIll(llllIIlIIIlIIl, IIIlIIlll[7])) {
                            System.out.print(" " + llIIlIlIIIlIIl[IIIIlIlIIIlIIl][llllIIlIIIlIIl]);
                            "".length();
                            if ("   ".length() == ((0x34 ^ 0x1B) << " ".length() & ~((7 ^ 0x28) << " ".length()))) {
                                return;
                            }
                        } else {
                            System.out.println(" " + llIIlIlIIIlIIl[IIIIlIlIIIlIIl][llllIIlIIIlIIl]);
                        }
                        ++llllIIlIIIlIIl;
                        "".length();
                        if (" ".length() > -" ".length()) continue;
                        return;
                    }
                    ++IIIIlIlIIIlIIl;
                    "".length();
                    if (null == null) continue;
                    return;
                }
            }
            ++lIIIlIlIIIlIIl;
            "".length();
            if ((0x80 ^ 0x85) != 0) continue;
            return;
        }
    }

    static {
        Main.IIIIlIlIIll();
        Main.llllIIlIIll();
    }

    private static void llllIIlIIll() {
        lllIIIlll = new String[IIIlIIlll[6]];
        Main.lllIIIlll[Main.IIIlIIlll[0]] = Main.lIllIIlIIll("Tw==", "oClWU");
        Main.lllIIIlll[Main.IIIlIIlll[3]] = Main.lIllIIlIIll("SXJza1JJcnNrUklyc2tSSXJza1I=", "jQPHq");
        Main.lllIIIlll[Main.IIIlIIlll[4]] = Main.lIllIIlIIll("SXJFaUdJckVpR0lyRWlHSXJFaUc=", "jQfJd");
        Main.lllIIIlll[Main.IIIlIIlll[1]] = Main.IlllIIlIIll("xCSwoiVrvN/EJLCiJWu834AXcxLVSQcx", "HuKGD");
    }

    /*
     * Unable to fully structure code
     */
    private static String lIllIIlIIll(String lIlIIIlIIIlIIl, String IIlIIIlIIIlIIl) {
        lIlIIIlIIIlIIl = new String(Base64.getDecoder().decode(lIlIIIlIIIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        llIIIIlIIIlIIl = new StringBuilder();
        IlIIIIlIIIlIIl = IIlIIIlIIIlIIl.toCharArray();
        lIIIIIlIIIlIIl = Main.IIIlIIlll[0];
        lllIllIIIIlIIl = lIlIIIlIIIlIIl.toCharArray();
        IIIlllIIIIlIIl = lllIllIIIIlIIl.length;
        lIIlllIIIIlIIl = Main.IIIlIIlll[0];
        "".length();
        if (" ".length() << (" ".length() << " ".length()) >= " ".length()) ** GOTO lbl19
        return null;
lbl-1000:
        // 1 sources

        {
            IIIIIIlIIIlIIl = lllIllIIIIlIIl[lIIlllIIIIlIIl];
            llIIIIlIIIlIIl.append((char)(IIIIIIlIIIlIIl ^ IlIIIIlIIIlIIl[lIIIIIlIIIlIIl % IlIIIIlIIIlIIl.length]));
            "".length();
            ++lIIIIIlIIIlIIl;
            ++lIIlllIIIIlIIl;
lbl19:
            // 2 sources

            ** while (!Main.lIlIlIlIIll((int)lIIlllIIIIlIIl, (int)IIIlllIIIIlIIl))
        }
lbl20:
        // 1 sources

        return String.valueOf(llIIIIlIIIlIIl);
    }

    private static String IlllIIlIIll(String IlIIllIIIIlIIl, String lIIIllIIIIlIIl) {
        try {
            SecretKeySpec IIIIllIIIIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIIllIIIIlIIl.getBytes(StandardCharsets.UTF_8)), IIIlIIlll[8]), "DES");
            Cipher llllIlIIIIlIIl = Cipher.getInstance("DES");
            llllIlIIIIlIIl.init(IIIlIIlll[4], IIIIllIIIIlIIl);
            return new String(llllIlIIIIlIIl.doFinal(Base64.getDecoder().decode(IlIIllIIIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IlllIlIIIIlIIl) {
            IlllIlIIIIlIIl.printStackTrace();
            return null;
        }
    }

    private static void IIIIlIlIIll() {
        IIIlIIlll = new int[9];
        Main.IIIlIIlll[0] = (76 + 111 - 94 + 66 ^ (0x12 ^ 0x3B) << (" ".length() << " ".length())) & ((0xAD ^ 0xA2) << (" ".length() << " ".length()) ^ (0x80 ^ 0x87) ^ -" ".length());
        Main.IIIlIIlll[1] = "   ".length();
        Main.IIIlIIlll[2] = (0x3D ^ 0x38) << " ".length();
        Main.IIIlIIlll[3] = " ".length();
        Main.IIIlIIlll[4] = " ".length() << " ".length();
        Main.IIIlIIlll[5] = 0x87 ^ 0x82;
        Main.IIIlIIlll[6] = " ".length() << (" ".length() << " ".length());
        Main.IIIlIIlll[7] = (0x8E ^ 0xAB) << " ".length() ^ (0x2E ^ 0x6D);
        Main.IIIlIIlll[8] = " ".length() << "   ".length();
    }

    private static boolean llIIlIlIIll(int n, int n2) {
        return n == n2;
    }

    private static boolean lIlIlIlIIll(int n, int n2) {
        return n >= n2;
    }

    private static boolean lIIIlIlIIll(int n, int n2) {
        return n < n2;
    }

    private static boolean IlIIlIlIIll(int n, int n2) {
        return n <= n2;
    }

    private static boolean IIlIlIlIIll(int n, int n2) {
        return n != n2;
    }
}

