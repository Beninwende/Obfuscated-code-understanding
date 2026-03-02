/*
 * Decompiled with CFR 0.152.
 */
public class Main {
    public Main() {
        Main lIllllIlIIlIIl;
    }

    public static void main(String[] stringArray) {
        FastScanner IllIllIlIIlIIl = new FastScanner();
        long lIlIllIlIIlIIl = IllIllIlIIlIIl.nextLong();
        int IIlIllIlIIlIIl = Long.toString(lIlIllIlIIlIIl).length();
        long llIIllIlIIlIIl = 1L;
        while (Main.IIIIIIlIIll(Main.lIllllIIIll(llIIllIlIIlIIl * llIIllIlIIlIIl, lIlIllIlIIlIIl))) {
            if (Main.lIIIIIlIIll(Main.lIllllIIIll(lIlIllIlIIlIIl % llIIllIlIIlIIl, 0L))) {
                "".length();
                if (null != null) {
                    return;
                }
            } else {
                long IlIIllIlIIlIIl = lIlIllIlIIlIIl / llIIllIlIIlIIl;
                int lIIIllIlIIlIIl = Math.max(Long.toString(llIIllIlIIlIIl).length(), Long.toString(IlIIllIlIIlIIl).length());
                if (Main.IlIIIIlIIll(IIlIllIlIIlIIl, lIIIllIlIIlIIl)) {
                    IIlIllIlIIlIIl = lIIIllIlIIlIIl;
                }
            }
            ++llIIllIlIIlIIl;
            "".length();
            if ("   ".length() >= " ".length()) continue;
            return;
        }
        System.out.println(IIlIllIlIIlIIl);
    }

    private static boolean IlIIIIlIIll(int n, int n2) {
        return n > n2;
    }

    private static boolean lIIIIIlIIll(int n) {
        return n != 0;
    }

    private static boolean IIIIIIlIIll(int n) {
        return n <= 0;
    }

    private static int lIllllIIIll(long l, long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }
}

