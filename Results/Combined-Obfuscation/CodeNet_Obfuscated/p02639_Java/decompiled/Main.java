/*
 * Decompiled with CFR 0.152.
 */
import java.io.PrintWriter;

public class Main {
    private static int[] IlIlIIIlll;

    public Main() {
        Main lllIlIllllIIIll;
    }

    public static void main(String[] stringArray) {
        FastScanner llllIIllllIIIll = new FastScanner();
        PrintWriter IlllIIllllIIIll = new PrintWriter(System.out);
        long lIllIIllllIIIll = llllIIllllIIIll.nextLong();
        long IIllIIllllIIIll = llllIIllllIIIll.nextLong();
        long llIlIIllllIIIll = llllIIllllIIIll.nextLong();
        long IlIlIIllllIIIll = llllIIllllIIIll.nextLong();
        long lIIlIIllllIIIll = llllIIllllIIIll.nextLong();
        if (Main.IlIIIlIIlIll(Main.lIIIIlIIlIll(lIllIIllllIIIll, 1L))) {
            IlllIIllllIIIll.print(IlIlIIIlll[0]);
            IlllIIllllIIIll.flush();
            return;
        }
        if (Main.IlIIIlIIlIll(Main.lIIIIlIIlIll(IIllIIllllIIIll, 2L))) {
            IlllIIllllIIIll.print(IlIlIIIlll[1]);
            IlllIIllllIIIll.flush();
            return;
        }
        if (Main.IlIIIlIIlIll(Main.lIIIIlIIlIll(llIlIIllllIIIll, 3L))) {
            IlllIIllllIIIll.print(IlIlIIIlll[2]);
            IlllIIllllIIIll.flush();
            return;
        }
        if (Main.IlIIIlIIlIll(Main.lIIIIlIIlIll(IlIlIIllllIIIll, 4L))) {
            IlllIIllllIIIll.print(IlIlIIIlll[3]);
            IlllIIllllIIIll.flush();
            return;
        }
        if (Main.IlIIIlIIlIll(Main.lIIIIlIIlIll(lIIlIIllllIIIll, 5L))) {
            IlllIIllllIIIll.print(IlIlIIIlll[4]);
            IlllIIllllIIIll.flush();
            return;
        }
        IlllIIllllIIIll.flush();
    }

    static {
        Main.IIIIIlIIlIll();
    }

    private static void IIIIIlIIlIll() {
        IlIlIIIlll = new int[5];
        Main.IlIlIIIlll[0] = " ".length();
        Main.IlIlIIIlll[1] = " ".length() << " ".length();
        Main.IlIlIIIlll[2] = "   ".length();
        Main.IlIlIIIlll[3] = " ".length() << (" ".length() << " ".length());
        Main.IlIlIIIlll[4] = 0x30 ^ 0x35;
    }

    private static boolean IlIIIlIIlIll(int n) {
        return n != 0;
    }

    private static int lIIIIlIIlIll(long l, long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }
}

