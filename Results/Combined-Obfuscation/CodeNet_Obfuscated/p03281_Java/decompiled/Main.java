/*
 * Decompiled with CFR 0.152.
 */
import java.io.InputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    private static int[] IlllIIIIIl;

    public Main() {
        Main llIIllIlIIlll;
    }

    public static void main(String[] stringArray) {
        InputStream lIllIlIlIIlll = System.in;
        PrintStream IIllIlIlIIlll = System.out;
        Scanner llIlIlIlIIlll = new Scanner(lIllIlIlIIlll);
        PrintWriter IlIlIlIlIIlll = new PrintWriter(IIllIlIlIIlll);
        B lIIlIlIlIIlll = new B();
        lIIlIlIlIIlll.solve(IlllIIIIIl[0], llIlIlIlIIlll, IlIlIlIlIIlll);
        IlIlIlIlIIlll.close();
    }

    static {
        Main.lllIllIIlll();
    }

    private static void lllIllIIlll() {
        IlllIIIIIl = new int[1];
        Main.IlllIIIIIl[0] = " ".length();
    }

    static class B {
        private static int[] IIIIlIIIIl;

        B() {
            B lllIIlIlIIlll;
        }

        public void solve(int n, Scanner IlIIIlIlIIlll, PrintWriter lIIIIlIlIIlll) {
            int IIIIIlIlIIlll = Integer.parseInt(IlIIIlIlIIlll.next());
            int lllllIIlIIlll = IIIIlIIIIl[0];
            while (B.lIIlllIIlll(IIIIIlIlIIlll)) {
                if (B.IlIlllIIlll(IIIIIlIlIIlll % IIIIlIIIIl[1])) {
                    if (B.llIlllIIlll(IIIIIlIlIIlll % IIIIlIIIIl[2]) && B.llIlllIIlll(IIIIIlIlIIlll % IIIIlIIIIl[3]) && B.llIlllIIlll(IIIIIlIlIIlll % IIIIlIIIIl[4])) {
                        ++lllllIIlIIlll;
                    }
                    if (B.llIlllIIlll(IIIIIlIlIIlll % IIIIlIIIIl[2]) && B.llIlllIIlll(IIIIIlIlIIlll % IIIIlIIIIl[3]) && B.llIlllIIlll(IIIIIlIlIIlll % IIIIlIIIIl[5])) {
                        ++lllllIIlIIlll;
                    }
                    if (B.llIlllIIlll(IIIIIlIlIIlll % IIIIlIIIIl[2]) && B.llIlllIIlll(IIIIIlIlIIlll % IIIIlIIIIl[3]) && B.llIlllIIlll(IIIIIlIlIIlll % IIIIlIIIIl[6])) {
                        ++lllllIIlIIlll;
                    }
                    if (B.llIlllIIlll(IIIIIlIlIIlll % IIIIlIIIIl[7]) && B.llIlllIIlll(IIIIIlIlIIlll % IIIIlIIIIl[3])) {
                        ++lllllIIlIIlll;
                    }
                    if (B.llIlllIIlll(IIIIIlIlIIlll % IIIIlIIIIl[7]) && B.llIlllIIlll(IIIIIlIlIIlll % IIIIlIIIIl[4])) {
                        ++lllllIIlIIlll;
                    }
                }
                --IIIIIlIlIIlll;
                "".length();
                if (" ".length() << " ".length() >= 0) continue;
                return;
            }
            lIIIIlIlIIlll.println(lllllIIlIIlll);
        }

        static {
            B.IIIlllIIlll();
        }

        private static void IIIlllIIlll() {
            IIIIlIIIIl = new int[8];
            B.IIIIlIIIIl[0] = (0x1D ^ 0x36 ^ (0x76 ^ 0x7B) << " ".length()) & (116 + 26 - 11 + 56 ^ (0x79 ^ 0x3C) << " ".length() ^ -" ".length());
            B.IIIIlIIIIl[1] = " ".length() << " ".length();
            B.IIIIlIIIIl[2] = "   ".length();
            B.IIIIlIIIIl[3] = 0xBC ^ 0xB9;
            B.IIIIlIIIIl[4] = 0xBE ^ 0xC7 ^ (0xA8 ^ 0x97) << " ".length();
            B.IIIIlIIIIl[5] = 0xD9 ^ 0x8A ^ (0x90 ^ 0x9B) << "   ".length();
            B.IIIIlIIIIl[6] = 0x3A ^ 0x37;
            B.IIIIlIIIIl[7] = 0x39 ^ 0x22;
        }

        private static boolean IlIlllIIlll(int n) {
            return n != 0;
        }

        private static boolean llIlllIIlll(int n) {
            return n == 0;
        }

        private static boolean lIIlllIIlll(int n) {
            return n > 0;
        }
    }
}

