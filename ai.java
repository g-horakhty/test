/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;

public final class ai {
    private byte[] var_byte_arr_a;
    private int var_int_a;
    private int b;
    private int c;

    private void a(byte[] byArray) {
        this.var_byte_arr_a = byArray;
        this.void_a();
    }

    public final void a(byte[] byArray, int n2, byte[] byArray2) {
        for (int i2 = 0; i2 < byArray2.length; ++i2) {
            byArray[n2 + i2] = byArray2[i2];
        }
        this.a(byArray);
    }

    public final Image javax_microedition_lcdui_Image_a() {
        this.b();
        Image image = Image.createImage((byte[])this.var_byte_arr_a, (int)0, (int)this.var_byte_arr_a.length);
        this.var_byte_arr_a = null;
        return image;
    }

    private void void_a() {
        int n2 = 8;
        int n3 = 0;
        while (this.var_byte_arr_a[n2 + 4] != 80 || this.var_byte_arr_a[n2 + 5] != 76 || this.var_byte_arr_a[n2 + 6] != 84 || this.var_byte_arr_a[n2 + 7] != 69) {
            n3 = this.a(n2);
            n2 += 8 + n3 + 4;
        }
        n3 = this.a(n2);
        this.c = n3 / 3;
        this.var_int_a = n2 + 8;
        this.b = n2 + 8 + n3;
    }

    private int a(int n2) {
        return (this.var_byte_arr_a[n2] & 0xFF) << 24 | (this.var_byte_arr_a[n2 + 1] & 0xFF) << 16 | (this.var_byte_arr_a[n2 + 2] & 0xFF) << 8 | this.var_byte_arr_a[n2 + 3] & 0xFF;
    }

    private void b() {
        int n2 = x.a(this.var_byte_arr_a, this.var_int_a - 4, this.c * 3 + 4);
        this.var_byte_arr_a[this.b] = (byte)(n2 >> 24 & 0xFF);
        this.var_byte_arr_a[this.b + 1] = (byte)(n2 >> 16 & 0xFF);
        this.var_byte_arr_a[this.b + 2] = (byte)(n2 >> 8 & 0xFF);
        this.var_byte_arr_a[this.b + 3] = (byte)(n2 & 0xFF);
    }
}

