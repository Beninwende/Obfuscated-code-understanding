/*
 * Decompiled with CFR 0.152.
 */
import java.util.Scanner;

public class Main {
    private static int[] IllIIllll;

    public Main() {
        Main lllIlIIlIIIIIl;
    }

    public static void main(String[] stringArray) {
        Main IIlIlIIlIIIIIl = new Main();
        Scanner llIIlIIlIIIIIl = new Scanner(System.in);
        IIlIlIIlIIIIIl.solve(llIIlIIlIIIIIl);
        llIIlIIlIIIIIl.close();
    }

    void solve(Scanner llllIIIlIIIIIl) {
        int IlllIIIlIIIIIl = llllIIIlIIIIIl.nextInt();
        int lIllIIIlIIIIIl = IllIIllll[0];
        if (Main.lIllllIlIll(IlllIIIlIIIIIl)) {
            System.out.println(IllIIllll[0]);
            "".length();
            if ("   ".length() > "   ".length()) {
                return;
            }
        } else if (Main.IlllllIlIll(IlllIIIlIIIIIl, IllIIllll[1])) {
            System.out.println(IllIIllll[1]);
            "".length();
            if (" ".length() != " ".length()) {
                return;
            }
        } else if (Main.llllllIlIll(IlllIIIlIIIIIl, IllIIllll[1]) && Main.IIIIIIllIll(IlllIIIlIIIIIl, IllIIllll[2])) {
            System.out.println(IllIIllll[3]);
            "".length();
            if (-" ".length() >= " ".length() << " ".length()) {
                return;
            }
        } else if (Main.llllllIlIll(IlllIIIlIIIIIl, IllIIllll[2]) && Main.IIIIIIllIll(IlllIIIlIIIIIl, IllIIllll[4])) {
            System.out.println(IllIIllll[5]);
            "".length();
            if (" ".length() << " ".length() != " ".length() << " ".length()) {
                return;
            }
        } else if (Main.llllllIlIll(IlllIIIlIIIIIl, IllIIllll[4]) && Main.IIIIIIllIll(IlllIIIlIIIIIl, IllIIllll[6])) {
            System.out.println(IllIIllll[7]);
            "".length();
            if (-"  ".length() > 0) {
                return;
            }
        } else if (Main.llllllIlIll(IlllIIIlIIIIIl, IllIIllll[6]) && Main.IIIIIIllIll(IlllIIIlIIIIIl, IllIIllll[8])) {
            System.out.println(IllIIllll[9]);
            "".length();
            if (" ".length() << " ".length() > " ".length() << " ".length()) {
                return;
            }
        } else if (Main.llllllIlIll(IlllIIIlIIIIIl, IllIIllll[8]) && Main.IIIIIIllIll(IlllIIIlIIIIIl, IllIIllll[10])) {
            System.out.println(IllIIllll[11]);
            "".length();
            if (null != null) {
                return;
            }
        } else if (Main.llllllIlIll(IlllIIIlIIIIIl, IllIIllll[10]) && Main.IIIIIIllIll(IlllIIIlIIIIIl, IllIIllll[12])) {
            System.out.println(IllIIllll[13]);
        }
    }

    static {
        Main.IIllllIlIll();
    }

    private static void IIllllIlIll() {
        IllIIllll = new int[14];
        Main.IllIIllll[0] = (0x1B ^ 0x20) & ~(0x67 ^ 0x5C);
        Main.IllIIllll[1] = " ".length();
        Main.IllIIllll[2] = "   ".length();
        Main.IllIIllll[3] = " ".length() << " ".length();
        Main.IllIIllll[4] = (0xB0 ^ 0xB5) << (" ".length() << (" ".length() << " ".length())) ^ (0x7B ^ 0x2C);
        Main.IllIIllll[5] = " ".length() << (" ".length() << " ".length());
        Main.IllIIllll[6] = 0x79 ^ 0x76;
        Main.IllIIllll[7] = " ".length() << "   ".length();
        Main.IllIIllll[8] = 0xB1 ^ 0xAE;
        Main.IllIIllll[9] = " ".length() << (" ".length() << (" ".length() << " ".length()));
        Main.IllIIllll[10] = 0x61 ^ 0x5E;
        Main.IllIIllll[11] = " ".length() << (0xBB ^ 0xBE);
        Main.IllIIllll[12] = (0x36 ^ 0x2F) << (" ".length() << " ".length());
        Main.IllIIllll[13] = " ".length() << ("   ".length() << " ".length());
    }

    private static boolean IlllllIlIll(int n, int n2) {
        return n == n2;
    }

    private static boolean IIIIIIllIll(int n, int n2) {
        return n <= n2;
    }

    private static boolean llllllIlIll(int n, int n2) {
        return n > n2;
    }

    private static boolean lIllllIlIll(int n) {
        return n == 0;
    }
}

