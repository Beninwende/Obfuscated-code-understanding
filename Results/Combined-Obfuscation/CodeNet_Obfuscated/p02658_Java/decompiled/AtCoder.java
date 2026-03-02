/*
 * Decompiled with CFR 0.152.
 */
import java.io.PrintWriter;

class AtCoder {
    final double N;
    final double D;

    AtCoder(FastScanner IllllIIIIIlIlll) {
        AtCoder lllllIIIIIlIlll;
        lllllIIIIIlIlll.N = IllllIIIIIlIlll.nextDouble();
        lllllIIIIIlIlll.D = IllllIIIIIlIlll.nextDouble();
    }

    void solve(PrintWriter IIIllIIIIIlIlll) {
        AtCoder lIIllIIIIIlIlll;
        IIIllIIIIIlIlll.println((int)Math.ceil(lIIllIIIIIlIlll.N / (2.0 * lIIllIIIIIlIlll.D + 1.0)));
    }
}

