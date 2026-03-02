/*
 * Decompiled with CFR 0.152.
 */
import java.util.Scanner;

class Main {
    private static int[] IlIllIIlIl;

    Main() {
        Main llIlllIllIIl;
    }

    public static void main(String[] stringArray) {
        Scanner IIIIllIllIIl = new Scanner(System.in);
        Stack IlllIlIllIIl = new Stack();
        String llllIlIllIIl = IIIIllIllIIl.nextLine();
        char[] lIllIlIllIIl = llllIlIllIIl.toCharArray();
        int IIllIlIllIIl = llllIlIllIIl.length();
        int llIlIlIllIIl = IlIllIIlIl[0];
        int IlIlIlIllIIl = IlIllIIlIl[0];
        while (Main.IllIIIlIlIIl(IlIlIlIllIIl, IIllIlIllIIl)) {
            llIlIlIllIIl = IlIllIIlIl[0];
            int lIIlIlIllIIl = IlIllIIlIl[0];
            while (Main.IllIIIlIlIIl(IlIlIlIllIIl, IIllIlIllIIl) && Main.lllIIIlIlIIl(lIllIlIllIIl[IlIlIlIllIIl], IlIllIIlIl[1]) && Main.IIIlIIlIlIIl(lIllIlIllIIl[IlIlIlIllIIl], IlIllIIlIl[2])) {
                llIlIlIllIIl *= IlIllIIlIl[3];
                llIlIlIllIIl += lIllIlIllIIl[IlIlIlIllIIl] - IlIllIIlIl[2];
                ++IlIlIlIllIIl;
                lIIlIlIllIIl = IlIllIIlIl[4];
                "".length();
                if (-(0x62 ^ 0x67) < 0) continue;
                return;
            }
            if (Main.lIIlIIlIlIIl(lIIlIlIllIIl)) {
                --IlIlIlIllIIl;
                IlllIlIllIIl.push(llIlIlIllIIl);
                "".length();
                if (" ".length() << (" ".length() << " ".length()) <= 0) {
                    return;
                }
            } else if (!Main.IlIlIIlIlIIl(lIllIlIllIIl[IlIlIlIllIIl], IlIllIIlIl[5]) || !Main.IlIlIIlIlIIl(lIllIlIllIIl[IlIlIlIllIIl], IlIllIIlIl[6]) || !Main.IlIlIIlIlIIl(lIllIlIllIIl[IlIlIlIllIIl], IlIllIIlIl[7]) || Main.llIlIIlIlIIl(lIllIlIllIIl[IlIlIlIllIIl], IlIllIIlIl[8])) {
                int IIIlIlIllIIl = IlllIlIllIIl.pop();
                int lllIIlIllIIl = IlllIlIllIIl.pop();
                switch (lIllIlIllIIl[IlIlIlIllIIl]) {
                    case '+': {
                        IlllIlIllIIl.push(lllIIlIllIIl + IIIlIlIllIIl);
                        "".length();
                        if (-"   ".length() <= 0) break;
                        return;
                    }
                    case '-': {
                        IlllIlIllIIl.push(lllIIlIllIIl - IIIlIlIllIIl);
                        "".length();
                        if (" ".length() << (" ".length() << " ".length()) > " ".length()) break;
                        return;
                    }
                    case '*': {
                        IlllIlIllIIl.push(lllIIlIllIIl * IIIlIlIllIIl);
                        "".length();
                        if (null == null) break;
                        return;
                    }
                    case '/': {
                        IlllIlIllIIl.push(lllIIlIllIIl / IIIlIlIllIIl);
                        "".length();
                        if (-(124 + 129 - 166 + 54 ^ 127 + 115 - 201 + 96) <= 0) break;
                        return;
                    }
                }
            }
            ++IlIlIlIllIIl;
            "".length();
            if (" ".length() << " ".length() != "   ".length()) continue;
            return;
        }
        System.out.println(IlllIlIllIIl.pop());
    }

    static {
        Main.lIlIIIlIlIIl();
    }

    private static void lIlIIIlIlIIl() {
        IlIllIIlIl = new int[9];
        Main.IlIllIIlIl[0] = (0xCC ^ 0xC3 ^ (0x27 ^ 8) << " ".length()) & ((0xA7 ^ 0xA2) << (" ".length() << " ".length()) ^ (0x1E ^ 0x5B) ^ -" ".length());
        Main.IlIllIIlIl[1] = 0xE6 ^ 0xA9 ^ (0xA2 ^ 0x99) << " ".length();
        Main.IlIllIIlIl[2] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
        Main.IlIllIIlIl[3] = (0xE ^ 0xB) << " ".length();
        Main.IlIllIIlIl[4] = " ".length();
        Main.IlIllIIlIl[5] = 0x73 ^ 0x58;
        Main.IlIllIIlIl[6] = 0x38 ^ 0x15;
        Main.IlIllIIlIl[7] = (0x31 ^ 0 ^ (0x17 ^ 0x1E) << (" ".length() << " ".length())) << " ".length();
        Main.IlIllIIlIl[8] = 0x55 ^ 0x7A;
    }

    private static boolean llIlIIlIlIIl(int n, int n2) {
        return n == n2;
    }

    private static boolean IIIlIIlIlIIl(int n, int n2) {
        return n >= n2;
    }

    private static boolean IllIIIlIlIIl(int n, int n2) {
        return n < n2;
    }

    private static boolean lllIIIlIlIIl(int n, int n2) {
        return n <= n2;
    }

    private static boolean lIIlIIlIlIIl(int n) {
        return n != 0;
    }

    private static boolean IlIlIIlIlIIl(int n, int n2) {
        return n != n2;
    }
}

