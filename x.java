/*
 * Decompiled with CFR 0.152.
 */
public final class x {
    private static int[] a;

    private static void a() {
        a = new int[256];
        for (int i2 = 0; i2 < 256; ++i2) {
            int n2 = i2;
            for (int i3 = 0; i3 < 8; ++i3) {
                n2 = (n2 & 1) == 1 ? 0xEDB88320 ^ n2 >>> 1 : n2 >>> 1;
            }
            x.a[i2] = n2;
        }
    }

    private static int b(byte[] byArray, int n2, int n3) {
        int n4 = -1;
        if (a == null) {
            x.a();
        }
        for (int i2 = n2; i2 < n3 + n2; ++i2) {
            n4 = a[(n4 ^ byArray[i2]) & 0xFF] ^ n4 >>> 8;
        }
        return n4;
    }

    public static int a(byte[] byArray, int n2, int n3) {
        return ~x.b(byArray, n2, n3);
    }
}

