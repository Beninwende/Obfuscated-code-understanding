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
    private static String[] IlIIIlIlIl;
    private static int[] llIIIlIlIl;

    public Main() {
        Main llIlllllIIIl;
    }

    public static void main(String[] stringArray) throws NumberFormatException, IOException {
        BufferedReader llIIllllIIIl = new BufferedReader(new InputStreamReader(System.in));
        int IlIIllllIIIl = Integer.parseInt(llIIllllIIIl.readLine());
        String[] lIIIllllIIIl = llIIllllIIIl.readLine().split(IlIIIlIlIl[llIIIlIlIl[0]]);
        int[] IIIIllllIIIl = new int[IlIIllllIIIl];
        int llllIlllIIIl = llIIIlIlIl[0];
        while (Main.llIlIllIlIIl(llllIlllIIIl, IlIIllllIIIl)) {
            IIIIllllIIIl[llllIlllIIIl] = Integer.parseInt(lIIIllllIIIl[llllIlllIIIl]);
            ++llllIlllIIIl;
            "".length();
            if ("   ".length() != " ".length() << (" ".length() << " ".length())) continue;
            return;
        }
        llllIlllIIIl = Integer.parseInt(llIIllllIIIl.readLine());
        lIIIllllIIIl = llIIllllIIIl.readLine().split(IlIIIlIlIl[llIIIlIlIl[1]]);
        int[] IlllIlllIIIl = new int[llllIlllIIIl];
        int lIllIlllIIIl = llIIIlIlIl[0];
        while (Main.llIlIllIlIIl(lIllIlllIIIl, llllIlllIIIl)) {
            IlllIlllIIIl[lIllIlllIIIl] = Integer.parseInt(lIIIllllIIIl[lIllIlllIIIl]);
            ++lIllIlllIIIl;
            "".length();
            if (-(0x21 ^ 0x25) <= 0) continue;
            return;
        }
        System.out.println(Main.method(IIIIllllIIIl, IlllIlllIIIl));
    }

    /*
     * WARNING - void declaration
     */
    static int method(int[] IllIIlllIIIl, int[] lIlIIlllIIIl) {
        void var2_3;
        if (Main.llIlIllIlIIl(IllIIlllIIIl.length, lIlIIlllIIIl.length)) {
            int[] IIlIIlllIIIl = IllIIlllIIIl;
            IllIIlllIIIl = lIlIIlllIIIl;
            lIlIIlllIIIl = IIlIIlllIIIl;
        }
        int IIlIIlllIIIl = llIIIlIlIl[0];
        int llIIIlllIIIl = IllIIlllIIIl.length / llIIIlIlIl[2];
        int IlIIIlllIIIl = llIIIlIlIl[0];
        while (Main.llIlIllIlIIl(IlIIIlllIIIl, lIlIIlllIIIl.length)) {
            if (Main.IIllIllIlIIl(lIlIIlllIIIl[IlIIIlllIIIl], IllIIlllIIIl[llIIIlllIIIl * llIIIlIlIl[3]])) {
                if (Main.IIllIllIlIIl(lIlIIlllIIIl[IlIIIlllIIIl], IllIIlllIIIl[llIIIlllIIIl * llIIIlIlIl[4]])) {
                    lIIIIlllIIIl = IllIIlllIIIl[llIIIlllIIIl * llIIIlIlIl[4]];
                    while (Main.llIlIllIlIIl(lIIIIlllIIIl, IllIIlllIIIl.length)) {
                        if (Main.lIllIllIlIIl(lIlIIlllIIIl[IlIIIlllIIIl], IllIIlllIIIl[lIIIIlllIIIl])) {
                            ++IIlIIlllIIIl;
                            "".length();
                            if (-(" ".length() << (" ".length() << (" ".length() << " ".length())) ^ (0xC6 ^ 0xC3) << (" ".length() << " ".length())) <= 0) break;
                            return ((0x8F ^ 0xBE) << " ".length() ^ (0x39 ^ 8)) & ((0x57 ^ 0x58) << (" ".length() << " ".length()) ^ (0x67 ^ 8) ^ -" ".length());
                        }
                        ++lIIIIlllIIIl;
                        "".length();
                        if ("   ".length() >= " ".length()) continue;
                        return (0xB5 ^ 0xBC) << " ".length() & ~((6 ^ 0xF) << " ".length());
                    }
                    "".length();
                    if ("   ".length() < 0) {
                        return (0x94 ^ 0xBF) << " ".length() & ~((0x19 ^ 0x32) << " ".length());
                    }
                } else if (Main.llIlIllIlIIl(lIlIIlllIIIl[IlIIIlllIIIl], IllIIlllIIIl[llIIIlllIIIl * llIIIlIlIl[4]])) {
                    lIIIIlllIIIl = llIIIlllIIIl * llIIIlIlIl[3];
                    while (Main.llIlIllIlIIl(lIIIIlllIIIl, llIIIlllIIIl * llIIIlIlIl[4])) {
                        if (Main.lIllIllIlIIl(lIlIIlllIIIl[IlIIIlllIIIl], IllIIlllIIIl[lIIIIlllIIIl])) {
                            ++IIlIIlllIIIl;
                            "".length();
                            if ("   ".length() != 0) break;
                            return " ".length() << (" ".length() << (" ".length() << " ".length())) & (" ".length() << (" ".length() << (" ".length() << " ".length())) ^ -" ".length());
                        }
                        ++lIIIIlllIIIl;
                        "".length();
                        if (" ".length() != 0) continue;
                        return (0x4A ^ 0x67) & ~(0 ^ 0x2D);
                    }
                    "".length();
                    if ("   ".length() > "   ".length()) {
                        return (" ".length() << (" ".length() << " ".length()) ^ (0xA9 ^ 0xA0)) << " ".length() & (((0x2C ^ 1) << " ".length() ^ (0x5D ^ 0xA)) << " ".length() ^ -" ".length());
                    }
                } else if (Main.lIllIllIlIIl(IllIIlllIIIl[llIIIlllIIIl * llIIIlIlIl[4]], lIlIIlllIIIl[IlIIIlllIIIl])) {
                    ++IIlIIlllIIIl;
                    "".length();
                    if (" ".length() << (" ".length() << " ".length()) == " ".length() << " ".length()) {
                        return (0x92 ^ 0x83 ^ (0xA3 ^ 0xB4) << " ".length() & ~((0x4F ^ 0x58) << " ".length())) << " ".length() & ((124 + 51 - 48 + 6 ^ (0x80 ^ 0xA5) << (" ".length() << " ".length())) << " ".length() ^ -" ".length());
                    }
                }
            } else if (Main.llIlIllIlIIl(lIlIIlllIIIl[IlIIIlllIIIl], IllIIlllIIIl[llIIIlllIIIl * llIIIlIlIl[3]])) {
                if (Main.IIllIllIlIIl(lIlIIlllIIIl[IlIIIlllIIIl], IllIIlllIIIl[llIIIlllIIIl])) {
                    lIIIIlllIIIl = IllIIlllIIIl[llIIIlllIIIl + llIIIlIlIl[1]];
                    while (Main.llIlIllIlIIl(lIIIIlllIIIl, llIIIlllIIIl * llIIIlIlIl[3])) {
                        if (Main.lIllIllIlIIl(lIlIIlllIIIl[IlIIIlllIIIl], IllIIlllIIIl[lIIIIlllIIIl])) {
                            ++IIlIIlllIIIl;
                            "".length();
                            if (" ".length() << " ".length() > 0) break;
                            return (0x34 ^ 0x5F ^ (0xA7 ^ 0x90) << " ".length()) << " ".length() & ((77 + 12 - -89 + 1 ^ (0xFA ^ 0xA1) << " ".length()) << " ".length() ^ -" ".length());
                        }
                        ++lIIIIlllIIIl;
                        "".length();
                        if (((0x2C ^ 5) << " ".length() & ~((0x4B ^ 0x62) << " ".length())) < "   ".length()) continue;
                        return (0xE4 ^ 0xB5) & ~(0x40 ^ 0x11);
                    }
                    "".length();
                    if (-" ".length() >= " ".length() << " ".length()) {
                        return (0x9B ^ 0x9E) << (" ".length() << " ".length()) & ~((0x5D ^ 0x58) << (" ".length() << " ".length()));
                    }
                } else if (Main.llIlIllIlIIl(lIlIIlllIIIl[IlIIIlllIIIl], IllIIlllIIIl[llIIIlllIIIl])) {
                    lIIIIlllIIIl = llIIIlIlIl[0];
                    while (Main.llIlIllIlIIl(lIIIIlllIIIl, llIIIlllIIIl)) {
                        if (Main.lIllIllIlIIl(lIlIIlllIIIl[IlIIIlllIIIl], IllIIlllIIIl[lIIIIlllIIIl])) {
                            ++IIlIIlllIIIl;
                            "".length();
                            if (null == null) break;
                            return (0xBB ^ 0x82) & ~(0x10 ^ 0x29);
                        }
                        ++lIIIIlllIIIl;
                        "".length();
                        if ((0x50 ^ 0x77 ^ (0x71 ^ 0x60) << " ".length()) > 0) continue;
                        return ("   ".length() << (" ".length() << (" ".length() << " ".length())) ^ "   ".length()) & (26 + 137 - 21 + 3 ^ (0x97 ^ 0xC6) << " ".length() ^ -" ".length());
                    }
                    "".length();
                    if (null != null) {
                        return (0x87 ^ 0xC2) & ~(0x34 ^ 0x71);
                    }
                } else if (Main.lIllIllIlIIl(IllIIlllIIIl[llIIIlllIIIl], lIlIIlllIIIl[IlIIIlllIIIl])) {
                    ++IIlIIlllIIIl;
                    "".length();
                    if (" ".length() << (" ".length() << " ".length()) == 0) {
                        return ("   ".length() ^ (0xAD ^ 0xA0) << (" ".length() << " ".length())) & (95 + 96 - 124 + 80 ^ (3 ^ 0x2A) << (" ".length() << " ".length()) ^ -" ".length());
                    }
                }
            } else if (Main.lIllIllIlIIl(IllIIlllIIIl[IllIIlllIIIl.length / llIIIlIlIl[3]], lIlIIlllIIIl[IlIIIlllIIIl])) {
                ++IIlIIlllIIIl;
            }
            ++IlIIIlllIIIl;
            "".length();
            if (-(0xFB ^ 0xB6 ^ (0xA9 ^ 0xA0) << "   ".length()) < 0) continue;
            return "   ".length() & ("   ".length() ^ -" ".length());
        }
        return (int)var2_3;
    }

    static {
        Main.IlIlIllIlIIl();
        Main.lIIlIllIlIIl();
    }

    private static void lIIlIllIlIIl() {
        IlIIIlIlIl = new String[llIIIlIlIl[3]];
        Main.IlIIIlIlIl[Main.llIIIlIlIl[0]] = Main.lllIIllIlIIl("cf3PUbjksN0=", "kdNZq");
        Main.IlIIIlIlIl[Main.llIIIlIlIl[1]] = Main.IIIlIllIlIIl("OLVWYvp3VJg=", "AsvIj");
    }

    private static String lllIIllIlIIl(String IIlllIllIIIl, String llIllIllIIIl) {
        try {
            SecretKeySpec IlIllIllIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIllIllIIIl.getBytes(StandardCharsets.UTF_8)), llIIIlIlIl[5]), "DES");
            Cipher lIIllIllIIIl = Cipher.getInstance("DES");
            lIIllIllIIIl.init(llIIIlIlIl[3], IlIllIllIIIl);
            return new String(lIIllIllIIIl.doFinal(Base64.getDecoder().decode(IIlllIllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIIllIllIIIl) {
            IIIllIllIIIl.printStackTrace();
            return null;
        }
    }

    private static String IIIlIllIlIIl(String llllIIllIIIl, String IlllIIllIIIl) {
        try {
            SecretKeySpec lIllIIllIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IlllIIllIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher IIllIIllIIIl = Cipher.getInstance("Blowfish");
            IIllIIllIIIl.init(llIIIlIlIl[3], lIllIIllIIIl);
            return new String(IIllIIllIIIl.doFinal(Base64.getDecoder().decode(llllIIllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIlIIllIIIl) {
            llIlIIllIIIl.printStackTrace();
            return null;
        }
    }

    private static void IlIlIllIlIIl() {
        llIIIlIlIl = new int[6];
        Main.llIIIlIlIl[0] = (0x30 ^ 0x2B ^ (0x25 ^ 0x2C) << (" ".length() << " ".length())) & ((0x44 ^ 0x4D) << "   ".length() ^ (0x34 ^ 0x43) ^ -" ".length());
        Main.llIIIlIlIl[1] = " ".length();
        Main.llIIIlIlIl[2] = " ".length() << (" ".length() << " ".length());
        Main.llIIIlIlIl[3] = " ".length() << " ".length();
        Main.llIIIlIlIl[4] = "   ".length();
        Main.llIIIlIlIl[5] = " ".length() << "   ".length();
    }

    private static boolean lIllIllIlIIl(int n, int n2) {
        return n == n2;
    }

    private static boolean llIlIllIlIIl(int n, int n2) {
        return n < n2;
    }

    private static boolean IIllIllIlIIl(int n, int n2) {
        return n > n2;
    }
}

