/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.NoSuchElementException;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Main {
    private static String[] lllIIll;
    private static int[] IlIlIll;

    public Main() {
        Main lIllIIlllIllIIl;
    }

    public static void main(String[] stringArray) {
        FS IIIlIIlllIllIIl = new FS();
        int lllIIIlllIllIIl = IIIlIIlllIllIIl.nextInt();
        String IllIIIlllIllIIl = IIIlIIlllIllIIl.next();
        if (Main.IIIIlllIl(lllIIIlllIllIIl % IlIlIll[0], IlIlIll[1])) {
            System.out.println(lllIIll[IlIlIll[2]]);
            return;
        }
        int lIlIIIlllIllIIl = IlIlIll[2];
        while (Main.lIIIlllIl(lIlIIIlllIllIIl, lllIIIlllIllIIl / IlIlIll[0])) {
            if (Main.IlIIlllIl(IllIIIlllIllIIl.charAt(lIlIIIlllIllIIl), IllIIIlllIllIIl.charAt(lIlIIIlllIllIIl + lllIIIlllIllIIl / IlIlIll[0]))) {
                System.out.println(lllIIll[IlIlIll[1]]);
                return;
            }
            ++lIlIIIlllIllIIl;
            "".length();
            if (-"  ".length() < 0) continue;
            return;
        }
        System.out.println(lllIIll[IlIlIll[0]]);
    }

    static {
        Main.llllIllIl();
        Main.lIlIIllIl();
    }

    private static void lIlIIllIl() {
        lllIIll = new String[IlIlIll[3]];
        Main.lllIIll[Main.IlIlIll[2]] = Main.IlIIIllIl("OLGcsQfQaS4=", "QGVoA");
        Main.lllIIll[Main.IlIlIll[1]] = Main.llIIIllIl("oFrkIB8vVn0=", "dtZzt");
        Main.lllIIll[Main.IlIlIll[0]] = Main.IIlIIllIl("NBIw", "mwCUH");
    }

    private static String IlIIIllIl(String IIIIIIlllIllIIl, String llllllIllIllIIl) {
        try {
            SecretKeySpec IlllllIllIllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllIllIllIIl.getBytes(StandardCharsets.UTF_8)), IlIlIll[4]), "DES");
            Cipher lIllllIllIllIIl = Cipher.getInstance("DES");
            lIllllIllIllIIl.init(IlIlIll[0], IlllllIllIllIIl);
            return new String(lIllllIllIllIIl.doFinal(Base64.getDecoder().decode(IIIIIIlllIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIllllIllIllIIl) {
            IIllllIllIllIIl.printStackTrace();
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IIlIIllIl(String IlllIlIllIllIIl, String lIllIlIllIllIIl) {
        IlllIlIllIllIIl = new String(Base64.getDecoder().decode(IlllIlIllIllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder IIllIlIllIllIIl = new StringBuilder();
        char[] llIlIlIllIllIIl = lIllIlIllIllIIl.toCharArray();
        int IlIlIlIllIllIIl = IlIlIll[2];
        char[] IIIIIlIllIllIIl = IlllIlIllIllIIl.toCharArray();
        int lIIIIlIllIllIIl = IIIIIlIllIllIIl.length;
        int IlIIIlIllIllIIl = IlIlIll[2];
        "".length();
        while (!Main.llIIlllIl(IlIIIlIllIllIIl, lIIIIlIllIllIIl)) {
            char lIIlIlIllIllIIl = IIIIIlIllIllIIl[IlIIIlIllIllIIl];
            IIllIlIllIllIIl.append((char)(lIIlIlIllIllIIl ^ llIlIlIllIllIIl[IlIlIlIllIllIIl % llIlIlIllIllIIl.length]));
            "".length();
            ++IlIlIlIllIllIIl;
            ++IlIIIlIllIllIIl;
        }
        return String.valueOf(IIllIlIllIllIIl);
    }

    private static String llIIIllIl(String llIllIIllIllIIl, String IlIllIIllIllIIl) {
        try {
            SecretKeySpec lIIllIIllIllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IlIllIIllIllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher IIIllIIllIllIIl = Cipher.getInstance("Blowfish");
            IIIllIIllIllIIl.init(IlIlIll[0], lIIllIIllIllIIl);
            return new String(IIIllIIllIllIIl.doFinal(Base64.getDecoder().decode(llIllIIllIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIlIIllIllIIl) {
            lllIlIIllIllIIl.printStackTrace();
            return null;
        }
    }

    private static void llllIllIl() {
        IlIlIll = new int[5];
        Main.IlIlIll[0] = " ".length() << " ".length();
        Main.IlIlIll[1] = " ".length();
        Main.IlIlIll[2] = (1 ^ 0x36 ^ (0x46 ^ 0x4B) << " ".length()) & ((0x69 ^ 0x7A) << (" ".length() << " ".length()) ^ (0xD8 ^ 0xB9) ^ -" ".length());
        Main.IlIlIll[3] = "   ".length();
        Main.IlIlIll[4] = " ".length() << "   ".length();
    }

    private static boolean IIIIlllIl(int n, int n2) {
        return n == n2;
    }

    private static boolean llIIlllIl(int n, int n2) {
        return n >= n2;
    }

    private static boolean lIIIlllIl(int n, int n2) {
        return n < n2;
    }

    private static boolean IlIIlllIl(int n, int n2) {
        return n != n2;
    }

    static class FS {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[lIIlIll[0]];
        private int ptr = lIIlIll[1];
        private int buflen = lIIlIll[1];
        private static int[] lIIlIll;

        FS() {
            FS lIlIIIIIIlllIIl;
        }

        private boolean hasNextByte() {
            FS IlIIIIIIIlllIIl;
            if (FS.lllIIllIl(IlIIIIIIIlllIIl.ptr, IlIIIIIIIlllIIl.buflen)) {
                return lIIlIll[2];
            }
            IlIIIIIIIlllIIl.ptr = lIIlIll[1];
            try {
                IlIIIIIIIlllIIl.buflen = IlIIIIIIIlllIIl.in.read(IlIIIIIIIlllIIl.buffer);
                "".length();
            }
            catch (IOException lIIIIIIIIlllIIl) {
                lIIIIIIIIlllIIl.printStackTrace();
            }
            if (-" ".length() > 0) {
                return (" ".length() << ("   ".length() << (0x7F ^ 0x7A) ^ (0x1F ^ 0x7A)) & (" ".length() << (0x42 ^ 0x69 ^ (0x6C ^ 0x7B) << " ".length()) ^ -" ".length())) != 0;
            }
            if (FS.IIIlIllIl(IlIIIIIIIlllIIl.buflen)) {
                return lIIlIll[1];
            }
            return lIIlIll[2];
        }

        private int readByte() {
            int n;
            FS lllllllllIllIIl;
            if (FS.lIIlIllIl(lllllllllIllIIl.hasNextByte() ? 1 : 0)) {
                int n2 = lllllllllIllIIl.ptr;
                lllllllllIllIIl.ptr = n2 + lIIlIll[2];
                n = lllllllllIllIIl.buffer[n2];
                "".length();
                if (-" ".length() == ((0x5F ^ 8 ^ (0x19 ^ 0x1C) << (" ".length() << (" ".length() << " ".length()))) << " ".length() & ((0x13 ^ 0x5E ^ (0x24 ^ 1) << " ".length()) << " ".length() ^ -" ".length()) & ((0x69 ^ 0x44 ^ (3 ^ 0x12) << " ".length()) << (" ".length() << " ".length()) & ((0xB ^ 0xE ^ (0x70 ^ 0x75) << " ".length()) << (" ".length() << " ".length()) ^ -" ".length()) ^ -" ".length()))) {
                    return ((0xA ^ 0x33) << " ".length() ^ (0xC0 ^ 0xA3)) & (27 + 6 - 7 + 129 ^ (0x70 ^ 0x35) << " ".length() ^ -" ".length());
                }
            } else {
                n = lIIlIll[3];
            }
            return n;
        }

        private boolean isPrintableChar(int lIlllllllIllIIl) {
            int n;
            if (FS.IlIlIllIl(lIIlIll[4], lIlllllllIllIIl) && FS.IlIlIllIl(lIlllllllIllIIl, lIIlIll[5])) {
                n = lIIlIll[2];
                "".length();
                if ((" ".length() & (" ".length() ^ -" ".length())) != 0) {
                    return (((4 ^ 0x57) << " ".length() ^ 46 + 48 - -35 + 54) << " ".length() & ((0x24 ^ 0x7B ^ (4 ^ 0x23) << " ".length()) << " ".length() ^ -" ".length())) != 0;
                }
            } else {
                n = lIIlIll[1];
            }
            return n != 0;
        }

        private void skipUnprintable() {
            FS llIllllllIllIIl;
            while (FS.lIIlIllIl(llIllllllIllIIl.hasNextByte() ? 1 : 0) && FS.llIlIllIl(llIllllllIllIIl.isPrintableChar(llIllllllIllIIl.buffer[llIllllllIllIIl.ptr]) ? 1 : 0)) {
                llIllllllIllIIl.ptr += lIIlIll[2];
                "".length();
                if (((0x99 ^ 0x86 ^ (0x6A ^ 0x6F) << (" ".length() << (" ".length() << " ".length()))) & ((0x92 ^ 0xB1) << (" ".length() << " ".length()) ^ 55 + 75 - 0 + 65 ^ -" ".length())) == 0) continue;
                return;
            }
        }

        public boolean hasNext() {
            FS lIIllllllIllIIl;
            lIIllllllIllIIl.skipUnprintable();
            return this.hasNextByte();
        }

        /*
         * WARNING - void declaration
         */
        public String next() {
            void var1_1;
            FS lIlIlllllIllIIl;
            if (FS.llIlIllIl(lIlIlllllIllIIl.hasNext() ? 1 : 0)) {
                throw new NoSuchElementException();
            }
            StringBuilder IIlIlllllIllIIl = new StringBuilder();
            int llIIlllllIllIIl = lIlIlllllIllIIl.readByte();
            while (FS.lIIlIllIl(lIlIlllllIllIIl.isPrintableChar(llIIlllllIllIIl) ? 1 : 0)) {
                IIlIlllllIllIIl.appendCodePoint(llIIlllllIllIIl);
                "".length();
                llIIlllllIllIIl = lIlIlllllIllIIl.readByte();
                "".length();
                if ("   ".length() > 0) continue;
                return null;
            }
            return String.valueOf(var1_1);
        }

        public int nextInt() {
            FS lIIIlllllIllIIl;
            return (int)lIIIlllllIllIIl.nextLong();
        }

        public long nextLong() {
            FS IIllIllllIllIIl;
            if (FS.llIlIllIl(IIllIllllIllIIl.hasNext() ? 1 : 0)) {
                throw new NoSuchElementException();
            }
            long llIlIllllIllIIl = 0L;
            int IlIlIllllIllIIl = lIIlIll[1];
            int lIIlIllllIllIIl = IIllIllllIllIIl.readByte();
            if (FS.IIllIllIl(lIIlIllllIllIIl, lIIlIll[6])) {
                IlIlIllllIllIIl = lIIlIll[2];
                lIIlIllllIllIIl = IIllIllllIllIIl.readByte();
            }
            if (!FS.lIllIllIl(lIIlIllllIllIIl, lIIlIll[7]) || FS.lllIIllIl(lIIlIll[8], lIIlIllllIllIIl)) {
                throw new NumberFormatException();
            }
            do {
                if (FS.IlIlIllIl(lIIlIll[7], lIIlIllllIllIIl) && FS.IlIlIllIl(lIIlIllllIllIIl, lIIlIll[8])) {
                    llIlIllllIllIIl *= 10L;
                    llIlIllllIllIIl += (long)(lIIlIllllIllIIl - lIIlIll[7]);
                    "".length();
                    if (-" ".length() >= " ".length() << " ".length()) {
                        return 0L;
                    }
                } else {
                    if (!FS.IlllIllIl(lIIlIllllIllIIl, lIIlIll[3]) || FS.llIlIllIl(IIllIllllIllIIl.isPrintableChar(lIIlIllllIllIIl) ? 1 : 0)) {
                        long l;
                        if (FS.lIIlIllIl(IlIlIllllIllIIl)) {
                            l = -llIlIllllIllIIl;
                            "".length();
                            if (((0x29 ^ 0x36 ^ (0xA9 ^ 0x8A) << " ".length()) & (0x22 ^ 0x7D ^ "   ".length() << " ".length() ^ -" ".length())) == "   ".length()) {
                                return 0L;
                            }
                        } else {
                            l = llIlIllllIllIIl;
                        }
                        return l;
                    }
                    throw new NumberFormatException();
                }
                int n = this.readByte();
                "".length();
            } while (null == null);
            return 0L;
        }

        static {
            FS.IllIIllIl();
        }

        private static void IllIIllIl() {
            lIIlIll = new int[9];
            FS.lIIlIll[0] = " ".length() << ((0x39 ^ 0x3C) << " ".length());
            FS.lIIlIll[1] = (0xAD ^ 0x86) << " ".length() & ~((0x60 ^ 0x4B) << " ".length());
            FS.lIIlIll[2] = " ".length();
            FS.lIIlIll[3] = -" ".length();
            FS.lIIlIll[4] = 0x7A ^ 0x5B;
            FS.lIIlIll[5] = (0x3F ^ 0) << " ".length();
            FS.lIIlIll[6] = (0x20 ^ 0x7F) << " ".length() ^ 85 + 121 - 179 + 120;
            FS.lIIlIll[7] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
            FS.lIIlIll[8] = 0xA9 ^ 0x90;
        }

        private static boolean IIllIllIl(int n, int n2) {
            return n == n2;
        }

        private static boolean lIllIllIl(int n, int n2) {
            return n >= n2;
        }

        private static boolean lllIIllIl(int n, int n2) {
            return n < n2;
        }

        private static boolean IlIlIllIl(int n, int n2) {
            return n <= n2;
        }

        private static boolean lIIlIllIl(int n) {
            return n != 0;
        }

        private static boolean llIlIllIl(int n) {
            return n == 0;
        }

        private static boolean IIIlIllIl(int n) {
            return n <= 0;
        }

        private static boolean IlllIllIl(int n, int n2) {
            return n != n2;
        }
    }
}

