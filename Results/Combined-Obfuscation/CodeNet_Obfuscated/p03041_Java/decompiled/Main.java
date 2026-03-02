/*
 * Decompiled with CFR 0.152.
 */
public class Main {
    private static int[] llIIIIIll;

    public Main() {
        Main llllIlIIlIllIl;
    }

    public static void main(String[] stringArray) {
        FastScanner IIIlIlIIlIllIl = new FastScanner();
        int lllIIlIIlIllIl = IIIlIlIIlIllIl.nextInt();
        int IllIIlIIlIllIl = IIIlIlIIlIllIl.nextInt();
        String lIlIIlIIlIllIl = IIIlIlIIlIllIl.next();
        char[] IIlIIlIIlIllIl = lIlIIlIIlIllIl.toCharArray();
        int n = IllIIlIIlIllIl - llIIIIIll[0];
        IIlIIlIIlIllIl[n] = (char)(IIlIIlIIlIllIl[n] + llIIIIIll[1]);
        String llIIIlIIlIllIl = new String(IIlIIlIIlIllIl);
        System.out.println(llIIIlIIlIllIl);
    }

    static {
        Main.lllIIIlIlIl();
    }

    private static void lllIIIlIlIl() {
        llIIIIIll = new int[2];
        Main.llIIIIIll[0] = " ".length();
        Main.llIIIIIll[1] = " ".length() << (0x65 ^ 0x60);
    }

    static class ex {
        int v;
        int q;

        public ex(int IlIIllIIlIllIl, int lIIIllIIlIllIl) {
            ex llIIllIIlIllIl;
            llIIllIIlIllIl.v = lIIIllIIlIllIl;
            llIIllIIlIllIl.q = IlIIllIIlIllIl;
        }
    }
}

