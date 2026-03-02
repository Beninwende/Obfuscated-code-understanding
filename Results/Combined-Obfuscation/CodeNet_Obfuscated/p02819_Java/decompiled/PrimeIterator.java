/*
 * Decompiled with CFR 0.152.
 */
import java.util.BitSet;
import java.util.NoSuchElementException;
import java.util.PrimitiveIterator;

class PrimeIterator
implements Iterable<Integer>,
PrimitiveIterator.OfInt {
    BitSet bitset;
    private int currentvalue = IllIIlllIl[0];
    private int limit;
    private static int[] IllIIlllIl;

    public PrimeIterator(int lIIllllIIllllll) {
        PrimeIterator IlIllllIIllllll;
        IlIllllIIllllll.bitset = new BitSet(lIIllllIIllllll + IllIIlllIl[1]);
        IlIllllIIllllll.limit = lIIllllIIllllll;
        IlIllllIIllllll.construct();
    }

    private final void construct() {
        int llllIllIIllllll;
        int llIlIllIIllllll;
        int IIllIllIIllllll;
        int lIllIllIIllllll;
        PrimeIterator lIIIlllIIllllll;
        int IIIIlllIIllllll = (int)Math.sqrt((double)lIIIlllIIllllll.limit + 0.5);
        int IlllIllIIllllll = IllIIlllIl[1];
        while (PrimeIterator.IlIllllIIlIl(IlllIllIIllllll, IllIIlllIl[2])) {
            lIllIllIIllllll = IlllIllIIllllll;
            while (PrimeIterator.IlIllllIIlIl(lIllIllIIllllll, IIIIlllIIllllll)) {
                IIllIllIIllllll = lIllIllIIllllll * lIllIllIIllllll;
                llIlIllIIllllll = IllIIlllIl[1];
                while (PrimeIterator.IlIllllIIlIl(llIlIllIIllllll, IIIIlllIIllllll) && PrimeIterator.IlIllllIIlIl(llllIllIIllllll = IllIIlllIl[3] * llIlIllIIllllll * llIlIllIIllllll + IIllIllIIllllll, lIIIlllIIllllll.limit)) {
                    lIIIlllIIllllll.bitset.flip(llllIllIIllllll);
                    ++llIlIllIIllllll;
                    "".length();
                    if (-" ".length() < " ".length() << " ".length()) continue;
                    return;
                }
                llIlIllIIllllll = lIllIllIIllllll + IllIIlllIl[1];
                while (PrimeIterator.IlIllllIIlIl(llIlIllIIllllll, IIIIlllIIllllll) && PrimeIterator.IlIllllIIlIl(llllIllIIllllll = IllIIlllIl[4] * llIlIllIIllllll * llIlIllIIllllll - IIllIllIIllllll, lIIIlllIIllllll.limit)) {
                    lIIIlllIIllllll.bitset.flip(llllIllIIllllll);
                    llIlIllIIllllll += 2;
                    "".length();
                    if (" ".length() == " ".length()) continue;
                    return;
                }
                lIllIllIIllllll += 6;
                "".length();
                if (" ".length() << (" ".length() << " ".length()) >= " ".length()) continue;
                return;
            }
            IlllIllIIllllll += 4;
            "".length();
            if ((((0x9F ^ 0x96) << "   ".length() ^ (0xA3 ^ 0xBC)) & (18 + 24 - -92 + 93 ^ (8 ^ 0x25) << (" ".length() << " ".length()) ^ -" ".length())) < " ".length()) continue;
            return;
        }
        IlllIllIIllllll = IllIIlllIl[5];
        while (PrimeIterator.IlIllllIIlIl(IlllIllIIllllll, IllIIlllIl[3])) {
            lIllIllIIllllll = IlllIllIIllllll;
            while (PrimeIterator.IlIllllIIlIl(lIllIllIIllllll, IIIIlllIIllllll)) {
                IIllIllIIllllll = lIllIllIIllllll * lIllIllIIllllll;
                llIlIllIIllllll = IllIIlllIl[1];
                while (PrimeIterator.IlIllllIIlIl(llIlIllIIllllll, IIIIlllIIllllll) && PrimeIterator.IlIllllIIlIl(llllIllIIllllll = IllIIlllIl[4] * llIlIllIIllllll * llIlIllIIllllll + IIllIllIIllllll, lIIIlllIIllllll.limit)) {
                    lIIIlllIIllllll.bitset.flip(llllIllIIllllll);
                    llIlIllIIllllll += 2;
                    "".length();
                    if (null == null) continue;
                    return;
                }
                llIlIllIIllllll = lIllIllIIllllll + IllIIlllIl[1];
                while (PrimeIterator.IlIllllIIlIl(llIlIllIIllllll, IIIIlllIIllllll) && PrimeIterator.IlIllllIIlIl(llllIllIIllllll = IllIIlllIl[4] * llIlIllIIllllll * llIlIllIIllllll - IIllIllIIllllll, lIIIlllIIllllll.limit)) {
                    lIIIlllIIllllll.bitset.flip(llllIllIIllllll);
                    llIlIllIIllllll += 2;
                    "".length();
                    if (" ".length() << " ".length() != " ".length() << (" ".length() << " ".length())) continue;
                    return;
                }
                lIllIllIIllllll += 6;
                "".length();
                if (" ".length() != " ".length() << (" ".length() << " ".length())) continue;
                return;
            }
            IlllIllIIllllll += 2;
            "".length();
            if (" ".length() << " ".length() > 0) continue;
            return;
        }
        IlllIllIIllllll = IllIIlllIl[4];
        while (PrimeIterator.IlIllllIIlIl(IlllIllIIllllll, IIIIlllIIllllll)) {
            lIllIllIIllllll = IlllIllIIllllll * IlllIllIIllllll;
            IIllIllIIllllll = IllIIlllIl[1];
            while (PrimeIterator.IlIllllIIlIl(IIllIllIIllllll, IllIIlllIl[5])) {
                llIlIllIIllllll = IIllIllIIllllll;
                while (PrimeIterator.IlIllllIIlIl(llIlIllIIllllll, IIIIlllIIllllll) && PrimeIterator.IlIllllIIlIl(llllIllIIllllll = IllIIlllIl[3] * llIlIllIIllllll * llIlIllIIllllll + lIllIllIIllllll, lIIIlllIIllllll.limit)) {
                    lIIIlllIIllllll.bitset.flip(llllIllIIllllll);
                    llIlIllIIllllll += 3;
                    "".length();
                    if (" ".length() << (" ".length() << " ".length()) > -" ".length()) continue;
                    return;
                }
                ++IIllIllIIllllll;
                "".length();
                if (" ".length() != " ".length() << " ".length()) continue;
                return;
            }
            IlllIllIIllllll += 6;
            "".length();
            if ("   ".length() >= ((0xFC ^ 0xAD) & ~(0x65 ^ 0x34))) continue;
            return;
        }
        llllIllIIllllll = IllIIlllIl[2];
        while (PrimeIterator.IlIllllIIlIl(llllIllIIllllll, IIIIlllIIllllll) && PrimeIterator.llIllllIIlIl(llllIllIIllllll, IllIIlllIl[6])) {
            lIllIllIIllllll = IlllIllIIllllll = llllIllIIllllll * llllIllIIllllll;
            while (PrimeIterator.IlIllllIIlIl(lIllIllIIllllll, lIIIlllIIllllll.limit)) {
                lIIIlllIIllllll.bitset.clear(lIllIllIIllllll);
                lIllIllIIllllll += IlllIllIIllllll;
                "".length();
                if (" ".length() != 0) continue;
                return;
            }
            llllIllIIllllll = lIIIlllIIllllll.bitset.nextSetBit(llllIllIIllllll + IllIIlllIl[1]);
            "".length();
            if (-"  ".length() <= 0) continue;
            return;
        }
        lIIIlllIIllllll.bitset.set(IllIIlllIl[5]);
        lIIIlllIIllllll.bitset.set(IllIIlllIl[4]);
    }

    @Override
    public boolean hasNext() {
        int n;
        PrimeIterator IIIlIllIIllllll;
        int lllIIllIIllllll = IIIlIllIIllllll.getNextValue();
        if (PrimeIterator.IlIllllIIlIl(IllIIlllIl[0], lllIIllIIllllll) && PrimeIterator.IlIllllIIlIl(lllIIllIIllllll, IIIlIllIIllllll.limit)) {
            n = IllIIlllIl[1];
            "".length();
            if ((((6 ^ 0x21) << " ".length() ^ (0x9D ^ 0xB0)) & ((0xF6 ^ 0x97) << " ".length() ^ 64 + 73 - -9 + 15 ^ -" ".length())) != 0) {
                return ((7 ^ 0x32 ^ " ".length() << (0x6A ^ 0x6F)) << (" ".length() << " ".length()) & (((0xBA ^ 0xBD) << " ".length() ^ (0x76 ^ 0x6D)) << (" ".length() << " ".length()) ^ -" ".length())) != 0;
            }
        } else {
            n = IllIIlllIl[0];
        }
        return n != 0;
    }

    private int getNextValue() {
        PrimeIterator lIlIIllIIllllll;
        return lIlIIllIIllllll.bitset.nextSetBit(this.currentvalue + IllIIlllIl[1]);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int nextInt() {
        void var1_1;
        PrimeIterator IlIIIllIIllllll;
        int lIIIIllIIllllll = IlIIIllIIllllll.getNextValue();
        if (!PrimeIterator.IIlllllIIlIl(lIIIIllIIllllll) || PrimeIterator.lIlllllIIlIl(IlIIIllIIllllll.limit, lIIIIllIIllllll)) {
            throw new NoSuchElementException();
        }
        this.currentvalue = var1_1;
        return this.currentvalue;
    }

    public PrimitiveIterator.OfInt iterator() {
        PrimeIterator lllllIlIIllllll;
        return lllllIlIIllllll;
    }

    public BitSet getClonedBitSet() {
        PrimeIterator lIlllIlIIllllll;
        return (BitSet)lIlllIlIIllllll.bitset.clone();
    }

    static {
        PrimeIterator.lIIllllIIlIl();
    }

    private static void lIIllllIIlIl() {
        IllIIlllIl = new int[7];
        PrimeIterator.IllIIlllIl[0] = (23 + 43 - -15 + 50 ^ (0x8C ^ 0x99) << "   ".length()) << " ".length() & (((0x1E ^ 0x11) << " ".length() ^ (0x9D ^ 0xA8)) << " ".length() ^ -" ".length());
        PrimeIterator.IllIIlllIl[1] = " ".length();
        PrimeIterator.IllIIlllIl[2] = 0xD ^ 8;
        PrimeIterator.IllIIlllIl[3] = " ".length() << (" ".length() << " ".length());
        PrimeIterator.IllIIlllIl[4] = "   ".length();
        PrimeIterator.IllIIlllIl[5] = " ".length() << " ".length();
        PrimeIterator.IllIIlllIl[6] = -" ".length();
    }

    private static boolean lIlllllIIlIl(int n, int n2) {
        return n < n2;
    }

    private static boolean IlIllllIIlIl(int n, int n2) {
        return n <= n2;
    }

    private static boolean IIlllllIIlIl(int n) {
        return n >= 0;
    }

    private static boolean llIllllIIlIl(int n, int n2) {
        return n != n2;
    }
}

