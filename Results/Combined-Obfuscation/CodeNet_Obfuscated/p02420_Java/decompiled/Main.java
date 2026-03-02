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
    private static String[] IllIIlIl;
    private static int[] lllIIlIl;

    public Main() {
        Main llIlllIlIllIIIl;
    }

    public static void main(String[] stringArray) {
        block16: {
            Scanner IIIIllIlIllIIIl = new Scanner(System.in);
            do {
                int lIIlIlIlIllIIIl;
                String llllIlIlIllIIIl;
                if (Main.IIIlllIIIl((llllIlIlIllIIIl = IIIIllIlIllIIIl.nextLine()).equals(IllIIlIl[lllIIlIl[0]]) ? 1 : 0)) {
                    "".length();
                    if (" ".length() << (" ".length() << " ".length()) <= " ".length() << " ".length()) {
                        return;
                    }
                    break block16;
                }
                String[] IlllIlIlIllIIIl = llllIlIlIllIIIl.split(IllIIlIl[lllIIlIl[1]]);
                int lIllIlIlIllIIIl = llllIlIlIllIIIl.length();
                String[] IIllIlIlIllIIIl = new String[lIllIlIlIllIIIl];
                int llIlIlIlIllIIIl = Integer.parseInt(IIIIllIlIllIIIl.nextLine());
                int IlIlIlIlIllIIIl22 = lllIIlIl[0];
                while (Main.lIIlllIIIl(IlIlIlIlIllIIIl22, llIlIlIlIllIIIl)) {
                    lIIlIlIlIllIIIl = Integer.parseInt(IIIIllIlIllIIIl.nextLine());
                    if (Main.IlIlllIIIl(IlIlIlIlIllIIIl22 % lllIIlIl[2])) {
                        IIIlIlIlIllIIIl = lllIIlIl[0];
                        lllIIlIlIllIIIl = lIIlIlIlIllIIIl;
                        while (Main.lIIlllIIIl(IIIlIlIlIllIIIl, lIllIlIlIllIIIl)) {
                            if (Main.llIlllIIIl(lllIIlIlIllIIIl, lIllIlIlIllIIIl)) {
                                lllIIlIlIllIIIl = lllIIlIl[0];
                            }
                            IIllIlIlIllIIIl[IIIlIlIlIllIIIl] = IlllIlIlIllIIIl[lllIIlIlIllIIIl];
                            ++IIIlIlIlIllIIIl;
                            ++lllIIlIlIllIIIl;
                            "".length();
                            if ("   ".length() > -" ".length()) continue;
                            return;
                        }
                        "".length();
                        if (" ".length() << " ".length() >= " ".length() << (" ".length() << " ".length())) {
                            return;
                        }
                    } else {
                        IIIlIlIlIllIIIl = lllIIlIl[0];
                        lllIIlIlIllIIIl = lIIlIlIlIllIIIl;
                        while (Main.lIIlllIIIl(IIIlIlIlIllIIIl, lIllIlIlIllIIIl)) {
                            if (Main.llIlllIIIl(lllIIlIlIllIIIl, lIllIlIlIllIIIl)) {
                                lllIIlIlIllIIIl = lllIIlIl[0];
                            }
                            IlllIlIlIllIIIl[IIIlIlIlIllIIIl] = IIllIlIlIllIIIl[lllIIlIlIllIIIl];
                            ++IIIlIlIlIllIIIl;
                            ++lllIIlIlIllIIIl;
                            "".length();
                            if (-" ".length() < 0) continue;
                            return;
                        }
                    }
                    ++IlIlIlIlIllIIIl22;
                    "".length();
                    if ("   ".length() <= " ".length() << (" ".length() << " ".length())) continue;
                    return;
                }
                StringBuilder IlIlIlIlIllIIIl22 = new StringBuilder();
                if (Main.IlIlllIIIl(llIlIlIlIllIIIl % lllIIlIl[2])) {
                    lIIlIlIlIllIIIl = lllIIlIl[0];
                    while (Main.lIIlllIIIl(lIIlIlIlIllIIIl, lIllIlIlIllIIIl)) {
                        IlIlIlIlIllIIIl22.append(IlllIlIlIllIIIl[lIIlIlIlIllIIIl]);
                        "".length();
                        ++lIIlIlIlIllIIIl;
                        "".length();
                        if (" ".length() > 0) continue;
                        return;
                    }
                    "".length();
                    if ("   ".length() == 0) {
                        return;
                    }
                } else {
                    lIIlIlIlIllIIIl = lllIIlIl[0];
                    while (Main.lIIlllIIIl(lIIlIlIlIllIIIl, lIllIlIlIllIIIl)) {
                        IlIlIlIlIllIIIl22.append(IIllIlIlIllIIIl[lIIlIlIlIllIIIl]);
                        "".length();
                        ++lIIlIlIlIllIIIl;
                        "".length();
                        if ("   ".length() > 0) continue;
                        return;
                    }
                }
                System.out.println(String.valueOf(IlIlIlIlIllIIIl22));
                "".length();
            } while ("   ".length() != 0);
            return;
        }
    }

    static {
        Main.lllIllIIIl();
        Main.IllIllIIIl();
    }

    private static void IllIllIIIl() {
        IllIIlIl = new String[lllIIlIl[2]];
        Main.IllIIlIl[Main.lllIIlIl[0]] = Main.IIlIllIIIl("TA==", "aviaE");
        Main.IllIIlIl[Main.lllIIlIl[1]] = Main.lIlIllIIIl("JE9eQt/YE/s=", "muJxz");
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IIlIllIIIl(String lIlllIIlIllIIIl, String IIlllIIlIllIIIl) {
        lIlllIIlIllIIIl = new String(Base64.getDecoder().decode(lIlllIIlIllIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIllIIlIllIIIl = new StringBuilder();
        char[] IlIllIIlIllIIIl = IIlllIIlIllIIIl.toCharArray();
        int lIIllIIlIllIIIl = lllIIlIl[0];
        char[] llllIIIlIllIIIl = lIlllIIlIllIIIl.toCharArray();
        int IIIIlIIlIllIIIl = llllIIIlIllIIIl.length;
        int lIIIlIIlIllIIIl = lllIIlIl[0];
        "".length();
        while (!Main.IIllllIIIl(lIIIlIIlIllIIIl, IIIIlIIlIllIIIl)) {
            char IIIllIIlIllIIIl = llllIIIlIllIIIl[lIIIlIIlIllIIIl];
            llIllIIlIllIIIl.append((char)(IIIllIIlIllIIIl ^ IlIllIIlIllIIIl[lIIllIIlIllIIIl % IlIllIIlIllIIIl.length]));
            "".length();
            ++lIIllIIlIllIIIl;
            ++lIIIlIIlIllIIIl;
        }
        return String.valueOf(llIllIIlIllIIIl);
    }

    private static String lIlIllIIIl(String IlIlIIIlIllIIIl, String lIIlIIIlIllIIIl) {
        try {
            SecretKeySpec IIIlIIIlIllIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIlIIIlIllIIIl.getBytes(StandardCharsets.UTF_8)), lllIIlIl[3]), "DES");
            Cipher lllIIIIlIllIIIl = Cipher.getInstance("DES");
            lllIIIIlIllIIIl.init(lllIIlIl[2], IIIlIIIlIllIIIl);
            return new String(lllIIIIlIllIIIl.doFinal(Base64.getDecoder().decode(IlIlIIIlIllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IllIIIIlIllIIIl) {
            IllIIIIlIllIIIl.printStackTrace();
            return null;
        }
    }

    private static void lllIllIIIl() {
        lllIIlIl = new int[4];
        Main.lllIIlIl[0] = (0x17 ^ 0x32) & ~(0x53 ^ 0x76);
        Main.lllIIlIl[1] = " ".length();
        Main.lllIIlIl[2] = " ".length() << " ".length();
        Main.lllIIlIl[3] = " ".length() << "   ".length();
    }

    private static boolean llIlllIIIl(int n, int n2) {
        return n == n2;
    }

    private static boolean IIllllIIIl(int n, int n2) {
        return n >= n2;
    }

    private static boolean lIIlllIIIl(int n, int n2) {
        return n < n2;
    }

    private static boolean IIIlllIIIl(int n) {
        return n != 0;
    }

    private static boolean IlIlllIIIl(int n) {
        return n == 0;
    }
}

