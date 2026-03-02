/*
 * Decompiled with CFR 0.152.
 */
import java.io.PrintWriter;

class AtCoder {
    final double N;
    final double D;

    AtCoder(FastScanner IlIllllIIIlIlll) {
        AtCoder llIllllIIIlIlll;
        llIllllIIIlIlll.N = IlIllllIIIlIlll.nextDouble();
        llIllllIIIlIlll.D = IlIllllIIIlIlll.nextDouble();
    }

    void solve(PrintWriter IllIlllIIIlIlll) {
        AtCoder lllIlllIIIlIlll;
        IllIlllIIIlIlll.println((int)Math.ceil(lllIlllIIIlIlll.N / (2.0 * lllIlllIIIlIlll.D + 1.0)));
    }
}

