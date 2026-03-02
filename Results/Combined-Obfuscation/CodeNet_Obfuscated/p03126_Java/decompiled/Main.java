/*
 * Decompiled with CFR 0.152.
 */
import java.util.Scanner;

public class Main {
    private static int[] IIlIlIIlIl;

    public Main() {
        Main llllIIlIIlIl;
    }

    public static void main(String[] stringArray) {
        int IIllllIIIlIl;
        Scanner IIlIIIlIIlIl = new Scanner(System.in);
        int llIIIIlIIlIl = IIlIIIlIIlIl.nextInt();
        int IlIIIIlIIlIl = IIlIIIlIIlIl.nextInt();
        int[] lIIIIIlIIlIl = new int[llIIIIlIIlIl];
        int[][] IIIIIIlIIlIl = new int[llIIIIlIIlIl][IlIIIIlIIlIl];
        int llllllIIIlIl = IIlIlIIlIl[0];
        int IlllllIIIlIl = IIlIlIIlIl[1];
        int lIllllIIIlIl = IIlIlIIlIl[1];
        while (Main.IlIIllIIlIIl(lIllllIIIlIl, llIIIIlIIlIl)) {
            lIIIIIlIIlIl[lIllllIIIlIl] = IIlIIIlIIlIl.nextInt();
            IIllllIIIlIl = IIlIlIIlIl[1];
            while (Main.IlIIllIIlIIl(IIllllIIIlIl, lIIIIIlIIlIl[lIllllIIIlIl])) {
                IIIIIIlIIlIl[lIllllIIIlIl][IIllllIIIlIl] = IIlIIIlIIlIl.nextInt();
                ++IIllllIIIlIl;
                "".length();
                if (null == null) continue;
                return;
            }
            ++lIllllIIIlIl;
            "".length();
            if (((0x58 ^ 0x5F) << "   ".length() & ~((0x9B ^ 0x9C) << "   ".length())) != "   ".length()) continue;
            return;
        }
        if (Main.llIIllIIlIIl(llIIIIlIIlIl, IIlIlIIlIl[0])) {
            lIllllIIIlIl = IIlIlIIlIl[1];
            while (Main.IlIIllIIlIIl(lIllllIIIlIl, IlIIIIlIIlIl)) {
                IIllllIIIlIl = IIlIlIIlIl[0];
                block3: while (Main.IlIIllIIlIIl(IIllllIIIlIl, llIIIIlIIlIl)) {
                    int llIlllIIIlIl = IIlIlIIlIl[1];
                    while (Main.IlIIllIIlIIl(llIlllIIIlIl, lIIIIIlIIlIl[IIllllIIIlIl])) {
                        if (Main.IIlIllIIlIIl(IIIIIIlIIlIl[IIlIlIIlIl[1]][lIllllIIIlIl], IIIIIIlIIlIl[IIllllIIIlIl][llIlllIIIlIl])) {
                            ++llllllIIIlIl;
                            "".length();
                            if (" ".length() << (" ".length() << " ".length()) > " ".length()) break;
                            return;
                        }
                        if (Main.lIlIllIIlIIl(IIIIIIlIIlIl[IIlIlIIlIl[1]][lIllllIIIlIl], IIIIIIlIIlIl[IIllllIIIlIl][IlIIIIlIIlIl - IIlIlIIlIl[0]]) && Main.IIlIllIIlIIl(llIlllIIIlIl, IlIIIIlIIlIl - IIlIlIIlIl[0])) {
                            llllllIIIlIl = IIlIlIIlIl[1];
                            "".length();
                            if ("   ".length() != 0) break block3;
                            return;
                        }
                        ++llIlllIIIlIl;
                        "".length();
                        if (((0 ^ 0x21) << " ".length() & ~((0x67 ^ 0x46) << " ".length())) != "   ".length()) continue;
                        return;
                    }
                    ++IIllllIIIlIl;
                    "".length();
                    if ("   ".length() != 0) continue;
                    return;
                }
                if (Main.IIlIllIIlIIl(llllllIIIlIl, llIIIIlIIlIl)) {
                    ++IlllllIIIlIl;
                }
                llllllIIIlIl = IIlIlIIlIl[0];
                ++lIllllIIIlIl;
                "".length();
                if (" ".length() << " ".length() > 0) continue;
                return;
            }
        }
        if (Main.IIlIllIIlIIl(llIIIIlIIlIl, IIlIlIIlIl[0])) {
            IlllllIIIlIl = lIIIIIlIIlIl[IIlIlIIlIl[1]];
        }
        System.out.println(IlllllIIIlIl);
    }

    static {
        Main.lIIIllIIlIIl();
    }

    private static void lIIIllIIlIIl() {
        IIlIlIIlIl = new int[2];
        Main.IIlIlIIlIl[0] = " ".length();
        Main.IIlIlIIlIl[1] = (0x7B ^ 0x70) << " ".length() & ~((0xA2 ^ 0xA9) << " ".length());
    }

    private static boolean IIlIllIIlIIl(int n, int n2) {
        return n == n2;
    }

    private static boolean IlIIllIIlIIl(int n, int n2) {
        return n < n2;
    }

    private static boolean llIIllIIlIIl(int n, int n2) {
        return n > n2;
    }

    private static boolean lIlIllIIlIIl(int n, int n2) {
        return n != n2;
    }
}

