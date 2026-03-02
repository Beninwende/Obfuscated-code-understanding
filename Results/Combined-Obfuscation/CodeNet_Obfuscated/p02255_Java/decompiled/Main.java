/*
 * Decompiled with CFR 0.152.
 */
import java.util.Scanner;

public class Main {
    private static int[] IIIlIIlIIl;

    public Main() {
        Main llIIlllIllIIl;
    }

    public static void main(String[] stringArray) {
        int IllIIllIllIIl;
        int IlIlIllIllIIl;
        Scanner llIlIllIllIIl = new Scanner(System.in);
        while (Main.IIlIIlIIIIIl(IIIlIIlIIl[0], IlIlIllIllIIl = llIlIllIllIIl.nextInt()) && !Main.lIlIIlIIIIIl(IlIlIllIllIIl, IIIlIIlIIl[1])) {
        }
        int[] lllIIllIllIIl = new int[IlIlIllIllIIl];
        int lIIlIllIllIIl = IIIlIIlIIl[2];
        while (Main.lIlIIlIIIIIl(lIIlIllIllIIl, IlIlIllIllIIl)) {
            do {
                lllIIllIllIIl[lIIlIllIllIIl] = llIlIllIllIIl.nextInt();
            } while (Main.IIlIIlIIIIIl(IIIlIIlIIl[2], lllIIllIllIIl[lIIlIllIllIIl]) && !Main.lIlIIlIIIIIl(lllIIllIllIIl[lIIlIllIllIIl], IIIlIIlIIl[3]));
            ++lIIlIllIllIIl;
            "".length();
            if ("   ".length() != 0) continue;
            return;
        }
        lIIlIllIllIIl = IIIlIIlIIl[0];
        while (Main.IllIIlIIIIIl(lIIlIllIllIIl, IlIlIllIllIIl - IIIlIIlIIl[0])) {
            IllIIllIllIIl = lllIIllIllIIl[lIIlIllIllIIl];
            int IIIlIllIllIIl = lIIlIllIllIIl - IIIlIIlIIl[0];
            int lIlIIllIllIIl = IIIlIIlIIl[2];
            while (Main.lIlIIlIIIIIl(lIlIIllIllIIl, IlIlIllIllIIl - IIIlIIlIIl[0])) {
                System.out.print(lllIIllIllIIl[lIlIIllIllIIl] + " ");
                ++lIlIIllIllIIl;
                "".length();
                if (-(0x38 ^ 0x4B ^ (0x2B ^ 0x10) << " ".length()) < 0) continue;
                return;
            }
            System.out.print(lllIIllIllIIl[IlIlIllIllIIl - IIIlIIlIIl[0]]);
            System.out.println();
            while (Main.lllIIlIIIIIl(IIIlIllIllIIl) && Main.IIIlIlIIIIIl(lllIIllIllIIl[IIIlIllIllIIl], IllIIllIllIIl)) {
                lllIIllIllIIl[IIIlIllIllIIl + Main.IIIlIIlIIl[0]] = lllIIllIllIIl[IIIlIllIllIIl];
                --IIIlIllIllIIl;
                "".length();
                if ((0x1D ^ 0x18) > 0) continue;
                return;
            }
            lllIIllIllIIl[IIIlIllIllIIl + Main.IIIlIIlIIl[0]] = IllIIllIllIIl;
            ++lIIlIllIllIIl;
            "".length();
            if ("   ".length() != 0) continue;
            return;
        }
        IllIIllIllIIl = IIIlIIlIIl[2];
        while (Main.lIlIIlIIIIIl(IllIIllIllIIl, IlIlIllIllIIl - IIIlIIlIIl[0])) {
            System.out.print(lllIIllIllIIl[IllIIllIllIIl] + " ");
            ++IllIIllIllIIl;
            "".length();
            if ("   ".length() == "   ".length()) continue;
            return;
        }
        System.out.print(lllIIllIllIIl[IlIlIllIllIIl - IIIlIIlIIl[0]]);
        System.out.println();
    }

    static {
        Main.llIIIlIIIIIl();
    }

    private static void llIIIlIIIIIl() {
        IIIlIIlIIl = new int[4];
        Main.IIIlIIlIIl[0] = " ".length();
        Main.IIIlIIlIIl[1] = ((0x77 ^ 0x64) << (" ".length() << " ".length()) ^ (0xC2 ^ 0x97)) << (" ".length() << " ".length());
        Main.IIIlIIlIIl[2] = (" ".length() << (" ".length() << " ".length()) ^ (0x23 ^ 0x2C)) & ((0xF1 ^ 0x94) << " ".length() ^ 60 + 75 - 9 + 67 ^ -" ".length());
        Main.IIIlIIlIIl[3] = (5 ^ 0x4E ^ (0x23 ^ 0x38) << " ".length()) << "   ".length();
    }

    private static boolean IIlIIlIIIIIl(int n, int n2) {
        return n >= n2;
    }

    private static boolean lIlIIlIIIIIl(int n, int n2) {
        return n < n2;
    }

    private static boolean IllIIlIIIIIl(int n, int n2) {
        return n <= n2;
    }

    private static boolean IIIlIlIIIIIl(int n, int n2) {
        return n > n2;
    }

    private static boolean lllIIlIIIIIl(int n) {
        return n >= 0;
    }
}

