/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    private static int[] IlIIlIIlIl;

    Main() {
        Main lllllIlIIlIl;
    }

    public static void main(String[] stringArray) {
        BufferedReader llIllIlIIlIl = new BufferedReader(new InputStreamReader(System.in));
        try {
            String IlIllIlIIlIl = llIllIlIIlIl.readLine();
            int lIIllIlIIlIl = Integer.parseInt(IlIllIlIIlIl);
            if (!Main.llllIlIIlIIl(lIIllIlIIlIl, IlIIlIIlIl[0]) || Main.IIIIllIIlIIl(lIIllIlIIlIl, IlIIlIIlIl[1])) {
                throw new IllegalArgumentException();
            }
            System.out.println((int)Math.pow(lIIllIlIIlIl, 3.0));
        }
        catch (NumberFormatException IlIllIlIIlIl) {
            IlIllIlIIlIl.printStackTrace();
            "".length();
            if (-(0xC6 ^ 0xC3) >= 0) {
                return;
            }
        }
        catch (IllegalArgumentException IlIllIlIIlIl) {
            IlIllIlIIlIl.printStackTrace();
            "".length();
            if (-" ".length() > 0) {
                return;
            }
        }
        catch (IOException IlIllIlIIlIl) {
            IlIllIlIIlIl.printStackTrace();
        }
        "".length();
        if (" ".length() >= " ".length() << (" ".length() << " ".length())) {
            return;
        }
    }

    static {
        Main.IlllIlIIlIIl();
    }

    private static void IlllIlIIlIIl() {
        IlIIlIIlIl = new int[2];
        Main.IlIIlIIlIl[0] = " ".length();
        Main.IlIIlIIlIl[1] = ((0x74 ^ 0x5B) << (" ".length() << " ".length()) ^ 27 + 128 - 146 + 156) << (" ".length() << " ".length());
    }

    private static boolean llllIlIIlIIl(int n, int n2) {
        return n >= n2;
    }

    private static boolean IIIIllIIlIIl(int n, int n2) {
        return n > n2;
    }
}

