/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.StringTokenizer;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Main {
    private static int[] IIlIIIll;

    public Main() {
        Main IlIllIlIIIlIIIl;
    }

    public static void main(String[] stringArray) throws Exception {
        PrintWriter IllIlIlIIIlIIIl = new PrintWriter(System.out);
        FastScanner lIlIlIlIIIlIIIl = new FastScanner();
        int IIlIlIlIIIlIIIl = IIlIIIll[0];
        while (Main.IlIIIIIlIl(IIlIlIlIIIlIIIl--)) {
            Main.solve(IllIlIlIIIlIIIl, lIlIlIlIIIlIIIl);
            "".length();
            if (" ".length() >= 0) continue;
            return;
        }
        IllIlIlIIIlIIIl.close();
    }

    private static void solve(PrintWriter IIllIIlIIIlIIIl, FastScanner llIlIIlIIIlIIIl) {
        long IlIlIIlIIIlIIIl = llIlIIlIIIlIIIl.ni();
        long lIIlIIlIIIlIIIl = llIlIIlIIIlIIIl.ni();
        long IIIlIIlIIIlIIIl = llIlIIlIIIlIIIl.ni();
        long lllIIIlIIIlIIIl = llIlIIlIIIlIIIl.ni();
        long IllIIIlIIIlIIIl = 0L;
        if (Main.IIlIIIIlIl(Main.llIIIIIlIl(IlIlIIlIIIlIIIl, 0L)) && Main.IIlIIIIlIl(Main.llIIIIIlIl(lIIlIIlIIIlIIIl, 0L)) && Main.IIlIIIIlIl(Main.llIIIIIlIl(IIIlIIlIIIlIIIl, 0L)) && Main.IIlIIIIlIl(Main.llIIIIIlIl(lllIIIlIIIlIIIl, 0L))) {
            IllIIIlIIIlIIIl = lIIlIIlIIIlIIIl * lllIIIlIIIlIIIl;
            "".length();
            if (" ".length() <= 0) {
                return;
            }
        } else if (Main.lIlIIIIlIl(Main.llIIIIIlIl(IlIlIIlIIIlIIIl, 0L)) && Main.IIlIIIIlIl(Main.llIIIIIlIl(lIIlIIlIIIlIIIl, 0L)) && Main.IIlIIIIlIl(Main.llIIIIIlIl(IIIlIIlIIIlIIIl, 0L)) && Main.IIlIIIIlIl(Main.llIIIIIlIl(lllIIIlIIIlIIIl, 0L))) {
            IllIIIlIIIlIIIl = lIIlIIlIIIlIIIl * lllIIIlIIIlIIIl;
            "".length();
            if (" ".length() << (" ".length() << " ".length()) == 0) {
                return;
            }
        } else if (Main.IIlIIIIlIl(Main.llIIIIIlIl(IlIlIIlIIIlIIIl, 0L)) && Main.IIlIIIIlIl(Main.llIIIIIlIl(lIIlIIlIIIlIIIl, 0L)) && Main.lIlIIIIlIl(Main.llIIIIIlIl(IIIlIIlIIIlIIIl, 0L)) && Main.IIlIIIIlIl(Main.llIIIIIlIl(lllIIIlIIIlIIIl, 0L))) {
            IllIIIlIIIlIIIl = lIIlIIlIIIlIIIl * lllIIIlIIIlIIIl;
            "".length();
            if (-" ".length() < -" ".length()) {
                return;
            }
        } else if (Main.lIlIIIIlIl(Main.llIIIIIlIl(IlIlIIlIIIlIIIl, 0L)) && Main.lIlIIIIlIl(Main.llIIIIIlIl(lIIlIIlIIIlIIIl, 0L)) && Main.lIlIIIIlIl(Main.llIIIIIlIl(IIIlIIlIIIlIIIl, 0L)) && Main.lIlIIIIlIl(Main.llIIIIIlIl(lllIIIlIIIlIIIl, 0L))) {
            IllIIIlIIIlIIIl = IlIlIIlIIIlIIIl * IIIlIIlIIIlIIIl;
            "".length();
            if (-" ".length() > " ".length() << " ".length()) {
                return;
            }
        } else if (Main.lIlIIIIlIl(Main.llIIIIIlIl(IlIlIIlIIIlIIIl, 0L)) && Main.lIlIIIIlIl(Main.llIIIIIlIl(lIIlIIlIIIlIIIl, 0L)) && Main.lIlIIIIlIl(Main.llIIIIIlIl(IIIlIIlIIIlIIIl, 0L)) && Main.IIlIIIIlIl(Main.llIIIIIlIl(lllIIIlIIIlIIIl, 0L))) {
            IllIIIlIIIlIIIl = IlIlIIlIIIlIIIl * IIIlIIlIIIlIIIl;
            "".length();
            if (((0x25 ^ 0x2C) & ~(0xCD ^ 0xC4)) != 0) {
                return;
            }
        } else if (Main.lIlIIIIlIl(Main.llIIIIIlIl(IlIlIIlIIIlIIIl, 0L)) && Main.IIlIIIIlIl(Main.llIIIIIlIl(lIIlIIlIIIlIIIl, 0L)) && Main.lIlIIIIlIl(Main.llIIIIIlIl(IIIlIIlIIIlIIIl, 0L)) && Main.lIlIIIIlIl(Main.llIIIIIlIl(lllIIIlIIIlIIIl, 0L))) {
            IllIIIlIIIlIIIl = IlIlIIlIIIlIIIl * IIIlIIlIIIlIIIl;
            "".length();
            if ("   ".length() < -" ".length()) {
                return;
            }
        } else if (Main.IIlIIIIlIl(Main.llIIIIIlIl(IlIlIIlIIIlIIIl, 0L)) && Main.IIlIIIIlIl(Main.llIIIIIlIl(lIIlIIlIIIlIIIl, 0L)) && Main.lIlIIIIlIl(Main.llIIIIIlIl(IIIlIIlIIIlIIIl, 0L)) && Main.lIlIIIIlIl(Main.llIIIIIlIl(lllIIIlIIIlIIIl, 0L))) {
            IllIIIlIIIlIIIl = IlIlIIlIIIlIIIl * lllIIIlIIIlIIIl;
            "".length();
            if ((14 + 146 - 31 + 36 ^ (0x9E ^ 0x9B) << (0x2B ^ 0x2E)) <= 0) {
                return;
            }
        } else if (Main.IIlIIIIlIl(Main.llIIIIIlIl(IlIlIIlIIIlIIIl, 0L)) && Main.IIlIIIIlIl(Main.llIIIIIlIl(lIIlIIlIIIlIIIl, 0L)) && Main.lIlIIIIlIl(Main.llIIIIIlIl(IIIlIIlIIIlIIIl, 0L)) && Main.IIlIIIIlIl(Main.llIIIIIlIl(lllIIIlIIIlIIIl, 0L))) {
            IllIIIlIIIlIIIl = lIIlIIlIIIlIIIl * lllIIIlIIIlIIIl;
            "".length();
            if (" ".length() << " ".length() < -" ".length()) {
                return;
            }
        } else if (Main.lIlIIIIlIl(Main.llIIIIIlIl(IlIlIIlIIIlIIIl, 0L)) && Main.IIlIIIIlIl(Main.llIIIIIlIl(lIIlIIlIIIlIIIl, 0L)) && Main.lIlIIIIlIl(Main.llIIIIIlIl(IIIlIIlIIIlIIIl, 0L)) && Main.lIlIIIIlIl(Main.llIIIIIlIl(lllIIIlIIIlIIIl, 0L))) {
            IllIIIlIIIlIIIl = IlIlIIlIIIlIIIl * IIIlIIlIIIlIIIl;
            "".length();
            if (-" ".length() > " ".length() << (" ".length() << " ".length())) {
                return;
            }
        } else if (Main.lIlIIIIlIl(Main.llIIIIIlIl(IlIlIIlIIIlIIIl, 0L)) && Main.lIlIIIIlIl(Main.llIIIIIlIl(lIIlIIlIIIlIIIl, 0L)) && Main.IIlIIIIlIl(Main.llIIIIIlIl(IIIlIIlIIIlIIIl, 0L)) && Main.IIlIIIIlIl(Main.llIIIIIlIl(lllIIIlIIIlIIIl, 0L))) {
            IllIIIlIIIlIIIl = lIIlIIlIIIlIIIl * IIIlIIlIIIlIIIl;
            "".length();
            if (-(0x18 ^ 0x1C) >= 0) {
                return;
            }
        } else if (Main.lIlIIIIlIl(Main.llIIIIIlIl(IlIlIIlIIIlIIIl, 0L)) && Main.lIlIIIIlIl(Main.llIIIIIlIl(lIIlIIlIIIlIIIl, 0L)) && Main.lIlIIIIlIl(Main.llIIIIIlIl(IIIlIIlIIIlIIIl, 0L)) && Main.IIlIIIIlIl(Main.llIIIIIlIl(lllIIIlIIIlIIIl, 0L))) {
            IllIIIlIIIlIIIl = IlIlIIlIIIlIIIl * IIIlIIlIIIlIIIl;
            "".length();
            if (" ".length() << " ".length() <= (((0xF ^ 2) << (" ".length() << " ".length()) ^ (0xE3 ^ 0xC4)) & (3 ^ 0x3C ^ (0x69 ^ 0x62) << (" ".length() << " ".length()) ^ -" ".length()))) {
                return;
            }
        } else if (Main.lIlIIIIlIl(Main.llIIIIIlIl(IlIlIIlIIIlIIIl, 0L)) && Main.IIlIIIIlIl(Main.llIIIIIlIl(lIIlIIlIIIlIIIl, 0L)) && Main.IIlIIIIlIl(Main.llIIIIIlIl(IIIlIIlIIIlIIIl, 0L)) && Main.IIlIIIIlIl(Main.llIIIIIlIl(lllIIIlIIIlIIIl, 0L))) {
            IllIIIlIIIlIIIl = lIIlIIlIIIlIIIl * lllIIIlIIIlIIIl;
            "".length();
            if (" ".length() << (" ".length() << " ".length()) != " ".length() << (" ".length() << " ".length())) {
                return;
            }
        } else if (Main.lIlIIIIlIl(Main.llIIIIIlIl(IlIlIIlIIIlIIIl, 0L)) && Main.IIlIIIIlIl(Main.llIIIIIlIl(lIIlIIlIIIlIIIl, 0L)) && Main.lIlIIIIlIl(Main.llIIIIIlIl(IIIlIIlIIIlIIIl, 0L)) && Main.IIlIIIIlIl(Main.llIIIIIlIl(lllIIIlIIIlIIIl, 0L))) {
            IllIIIlIIIlIIIl = Math.max(IlIlIIlIIIlIIIl * IIIlIIlIIIlIIIl, lIIlIIlIIIlIIIl * lllIIIlIIIlIIIl);
        }
        IIllIIlIIIlIIIl.print(IllIIIlIIIlIIIl);
    }

    static <T> void deb(T llIIIIlIIIlIIIl, int IlIIIIlIIIlIIIl) {
        System.out.print(llIIIIlIIIlIIIl);
        if (Main.IllIIIIlIl(IlIIIIlIIIlIIIl)) {
            System.out.println();
        }
    }

    static {
        Main.lIIIIIIlIl();
    }

    private static void lIIIIIIlIl() {
        IIlIIIll = new int[1];
        Main.IIlIIIll[0] = " ".length();
    }

    private static boolean IllIIIIlIl(int n) {
        return n == 0;
    }

    private static boolean IIlIIIIlIl(int n) {
        return n >= 0;
    }

    private static boolean lIlIIIIlIl(int n) {
        return n < 0;
    }

    private static boolean IlIIIIIlIl(int n) {
        return n > 0;
    }

    private static int llIIIIIlIl(long l, long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(lIlIIIll[IllIIIll[0]]);
        private static String[] lIlIIIll;
        private static int[] IllIIIll;

        FastScanner() {
            FastScanner IIIlllIIIIlIIIl;
        }

        public String ne() {
            FastScanner lIlIllIIIIlIIIl;
            while (FastScanner.llIlIIIlIl(lIlIllIIIIlIIIl.st.hasMoreElements() ? 1 : 0)) {
                try {
                    lIlIllIIIIlIIIl.st = new StringTokenizer(lIlIllIIIIlIIIl.br.readLine());
                    "".length();
                }
                catch (IOException IIlIllIIIIlIIIl) {
                    IIlIllIIIIlIIIl.printStackTrace();
                    "".length();
                    if ("   ".length() > 0) continue;
                    return null;
                }
                if (-" ".length() != " ".length() << " ".length()) continue;
                return null;
            }
            return this.st.nextToken();
        }

        public String ne(int n) {
            try {
                FastScanner lIIIllIIIIlIIIl;
                return lIIIllIIIIlIIIl.br.readLine();
            }
            catch (IOException IIIIllIIIIlIIIl) {
                IIIIllIIIIlIIIl.printStackTrace();
                return lIlIIIll[IllIIIll[1]];
            }
        }

        int ni() {
            FastScanner IlllIlIIIIlIIIl;
            return Integer.parseInt(IlllIlIIIIlIIIl.ne());
        }

        long nl() {
            FastScanner IIllIlIIIIlIIIl;
            return Long.parseLong(IIllIlIIIIlIIIl.ne());
        }

        double nd() {
            FastScanner IlIlIlIIIIlIIIl;
            return Double.parseDouble(IlIlIlIIIIlIIIl.ne());
        }

        static {
            FastScanner.IlIlIIIlIl();
            FastScanner.lIIlIIIlIl();
        }

        private static void lIIlIIIlIl() {
            lIlIIIll = new String[IllIIIll[2]];
            FastScanner.lIlIIIll[FastScanner.IllIIIll[0]] = FastScanner.lllIIIIlIl("", "aKGJH");
            FastScanner.lIlIIIll[FastScanner.IllIIIll[1]] = FastScanner.IIIlIIIlIl("lF+mzpIE0Gg+gqn/HD8Jz+OzTTaYfEPA", "tPYes");
        }

        private static String IIIlIIIlIl(String lIlIIlIIIIlIIIl, String IIlIIlIIIIlIIIl) {
            try {
                SecretKeySpec llIIIlIIIIlIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IIlIIlIIIIlIIIl.getBytes(StandardCharsets.UTF_8)), IllIIIll[3]), "DES");
                Cipher IlIIIlIIIIlIIIl = Cipher.getInstance("DES");
                IlIIIlIIIIlIIIl.init(IllIIIll[2], llIIIlIIIIlIIIl);
                return new String(IlIIIlIIIIlIIIl.doFinal(Base64.getDecoder().decode(lIlIIlIIIIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lIIIIlIIIIlIIIl) {
                lIIIIlIIIIlIIIl.printStackTrace();
                return null;
            }
        }

        /*
         * Unable to fully structure code
         */
        private static String lllIIIIlIl(String llIIlIIIIIlIIIl, String IlIIlIIIIIlIIIl) {
            llIIlIIIIIlIIIl = new String(Base64.getDecoder().decode(llIIlIIIIIlIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            lIIIlIIIIIlIIIl = new StringBuilder();
            IIIIlIIIIIlIIIl = IlIIlIIIIIlIIIl.toCharArray();
            llllIIIIIIlIIIl = FastScanner.IllIIIll[0];
            lIlIIIIIIIlIIIl = llIIlIIIIIlIIIl.toCharArray();
            IllIIIIIIIlIIIl = lIlIIIIIIIlIIIl.length;
            lllIIIIIIIlIIIl = FastScanner.IllIIIll[0];
            "".length();
            if (" ".length() << (" ".length() << " ".length()) != 0) ** GOTO lbl19
            return null;
lbl-1000:
            // 1 sources

            {
                IlllIIIIIIlIIIl = lIlIIIIIIIlIIIl[lllIIIIIIIlIIIl];
                lIIIlIIIIIlIIIl.append((char)(IlllIIIIIIlIIIl ^ IIIIlIIIIIlIIIl[llllIIIIIIlIIIl % IIIIlIIIIIlIIIl.length]));
                "".length();
                ++llllIIIIIIlIIIl;
                ++lllIIIIIIIlIIIl;
lbl19:
                // 2 sources

                ** while (!FastScanner.IIllIIIlIl((int)lllIIIIIIIlIIIl, (int)IllIIIIIIIlIIIl))
            }
lbl20:
            // 1 sources

            return String.valueOf(lIIIlIIIIIlIIIl);
        }

        private static void IlIlIIIlIl() {
            IllIIIll = new int[4];
            FastScanner.IllIIIll[0] = (0x69 ^ 0x44) << " ".length() & ~((0x75 ^ 0x58) << " ".length());
            FastScanner.IllIIIll[1] = " ".length();
            FastScanner.IllIIIll[2] = " ".length() << " ".length();
            FastScanner.IllIIIll[3] = " ".length() << "   ".length();
        }

        private static boolean IIllIIIlIl(int n, int n2) {
            return n >= n2;
        }

        private static boolean llIlIIIlIl(int n) {
            return n == 0;
        }
    }
}

