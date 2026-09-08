/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class z {
    public short var_short_a;
    public short var_short_b;
    public ac[] var_ac_arr_a;
    public e[] var_e_arr_a;
    public f[] var_f_arr_a;
    public boolean var_boolean_a;
    public short[][] var_short_arr_arr_a;
    public short[][] var_short_arr_arr_b;
    public short[][] var_short_arr_arr_c;
    public int var_int_a;
    public int var_int_b;
    public int var_int_c;
    public short[] var_short_arr_a;
    public short[] var_short_arr_b;
    public short[] var_short_arr_c;
    public boolean var_boolean_b;
    public boolean var_boolean_c;
    public boolean var_boolean_d;
    public boolean var_boolean_e;
    public byte var_byte_a;
    public Image var_javax_microedition_lcdui_Image_a;
    public Graphics var_javax_microedition_lcdui_Graphics_a;
    public int[] var_int_arr_a;
    public int var_int_d;
    public int var_int_e;
    public byte var_byte_b;
    public static Class var_java_lang_Class_a;

    private z(DataInputStream dataInputStream, String string, boolean bl) {
        block3: {
            block4: {
                z z2;
                block2: {
                    this.var_short_a = (short)100;
                    this.var_short_b = (short)100;
                    this.var_boolean_b = true;
                    this.var_boolean_e = true;
                    this.var_int_d = -1;
                    this.var_int_e = 0;
                    this.a(dataInputStream, string, bl);
                    if (this.var_short_arr_arr_a == null) break block2;
                    this.a(0);
                    if (this.var_short_arr_a.length != 0) break block3;
                    this.var_short_arr_a = new short[this.var_e_arr_a.length];
                    for (int i2 = 0; i2 < this.var_short_arr_a.length; ++i2) {
                        this.var_short_arr_a[i2] = (short)i2;
                    }
                    z2 = this;
                    break block4;
                }
                this.var_short_arr_a = new short[this.var_e_arr_a.length];
                for (int i3 = 0; i3 < this.var_short_arr_a.length; ++i3) {
                    this.var_short_arr_a[i3] = (short)i3;
                }
                z2 = this;
            }
            z2.var_short_arr_b = null;
            this.var_short_arr_c = null;
        }
    }

    private void a(DataInputStream dataInputStream, String string, boolean bl) {
        try {
            int n2;
            this.var_short_a = dataInputStream.readShort();
            this.var_short_b = dataInputStream.readShort();
            this.var_ac_arr_a = new ac[dataInputStream.readByte()];
            for (n2 = 0; n2 < this.var_ac_arr_a.length; ++n2) {
                ac ac2;
                int n3;
                ac[] acArray;
                if (bl) {
                    acArray = this.var_ac_arr_a;
                    n3 = n2;
                    ac2 = ac.b(String.valueOf(dataInputStream.readInt()), string);
                } else {
                    acArray = this.var_ac_arr_a;
                    n3 = n2;
                    ac2 = ac.a(String.valueOf(dataInputStream.readInt()), string);
                }
                acArray[n3] = ac2;
            }
            this.var_f_arr_a = new f[dataInputStream.readShort()];
            for (n2 = 0; n2 < this.var_f_arr_a.length; ++n2) {
                this.var_f_arr_a[n2] = new f(dataInputStream);
            }
            this.var_e_arr_a = new e[dataInputStream.readShort()];
            for (n2 = 0; n2 < this.var_e_arr_a.length; ++n2) {
                this.var_e_arr_a[n2] = new e(dataInputStream);
            }
            this.var_boolean_a = dataInputStream.readBoolean();
            byte by = dataInputStream.readByte();
            n2 = by;
            if (by > 0) {
                this.var_short_arr_arr_a = new short[n2][];
                this.var_short_arr_arr_b = new short[n2][];
                this.var_short_arr_arr_c = new short[n2][];
                for (int i2 = 0; i2 < n2; ++i2) {
                    dataInputStream.readUTF();
                    short s2 = dataInputStream.readShort();
                    if (s2 <= 0) continue;
                    short[] sArray = new short[s2];
                    short[] sArray2 = new short[sArray.length];
                    short[] sArray3 = new short[sArray.length];
                    for (int i3 = 0; i3 < sArray.length; ++i3) {
                        sArray[i3] = dataInputStream.readShort();
                        sArray2[i3] = dataInputStream.readShort();
                        sArray3[i3] = dataInputStream.readShort();
                    }
                    this.var_short_arr_arr_a[i2] = sArray;
                    this.var_short_arr_arr_b[i2] = sArray2;
                    this.var_short_arr_arr_c[i2] = sArray3;
                }
            }
            return;
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return;
        }
    }

    public final void a(int n2) {
        this.var_byte_b = (byte)n2;
        if (this.var_short_arr_arr_a != null) {
            this.var_short_arr_a = this.var_short_arr_arr_a[n2];
            this.var_short_arr_b = this.var_short_arr_arr_b[n2];
            this.var_short_arr_c = this.var_short_arr_arr_c[n2];
            this.var_int_c = 0;
        }
    }

    public final boolean boolean_a() {
        int n2 = this.var_int_c + 1;
        this.var_int_c = n2 % this.var_short_arr_a.length;
        return n2 >= this.var_short_arr_a.length;
    }

    private e e_a() {
        try {
            return this.var_e_arr_a[this.var_short_arr_a[this.var_int_c]];
        }
        catch (Exception exception) {
            System.out.println(this.var_e_arr_a.length + " " + this.var_short_arr_a.length + " " + this.var_int_c);
            return null;
        }
    }

    public final void a(int n2, int n3) {
        this.var_int_a = n2;
        this.var_int_b = n3;
    }

    private void a(Graphics graphics, int n2, int n3) {
        if (this.var_boolean_b) {
            int n4;
            int n5;
            z z2;
            Graphics graphics2;
            e e2;
            n2 += this.f();
            n3 += this.g();
            graphics.getClipX();
            graphics.getClipY();
            graphics.getClipWidth();
            graphics.getClipHeight();
            e e3 = this.e_a();
            if (this.var_boolean_e && (e3.var_boolean_a || this.var_boolean_d)) {
                this.void_a();
                this.var_javax_microedition_lcdui_Graphics_a.fillRect(0, 0, this.var_javax_microedition_lcdui_Image_a.getWidth(), this.var_javax_microedition_lcdui_Image_a.getHeight());
            }
            if (this.var_boolean_e && (e3.var_boolean_a || this.var_boolean_d)) {
                e2 = e3;
                graphics2 = this.var_javax_microedition_lcdui_Graphics_a;
                z2 = this;
                n5 = n2;
                n4 = n3;
            } else {
                e2 = e3;
                graphics2 = graphics;
                z2 = this;
                n5 = this.var_int_a + n2;
                n4 = this.var_int_b + n3;
            }
            e2.a(graphics2, z2, n5, n4, this.var_int_e);
            if (this.var_boolean_e && (e3.var_boolean_a || this.var_boolean_d)) {
                this.var_javax_microedition_lcdui_Image_a.getRGB(this.var_int_arr_a, 0, (int)this.var_short_a, 0, 0, (int)this.var_short_a, (int)this.var_short_b);
                for (int i2 = 0; i2 < this.var_int_arr_a.length; ++i2) {
                    int n6;
                    int n7;
                    int[] nArray;
                    int n8 = this.var_int_arr_a[i2];
                    if (n8 == -16777216) {
                        nArray = this.var_int_arr_a;
                        n7 = i2;
                        n6 = 0;
                    } else if (this.var_boolean_c) {
                        if (this.var_byte_a == 0) {
                            nArray = this.var_int_arr_a;
                            n7 = i2;
                            n6 = this.var_int_d | this.var_int_arr_a[i2];
                        } else {
                            if (this.var_byte_a != 1) continue;
                            nArray = this.var_int_arr_a;
                            n7 = i2;
                            n6 = this.var_int_d & this.var_int_arr_a[i2];
                        }
                    } else {
                        nArray = this.var_int_arr_a;
                        n7 = i2;
                        n6 = this.var_int_d;
                    }
                    nArray[n7] = n6;
                }
                graphics.drawRGB(this.var_int_arr_a, 0, this.var_javax_microedition_lcdui_Image_a.getWidth(), this.var_int_a, this.var_int_b, this.var_javax_microedition_lcdui_Image_a.getWidth(), this.var_javax_microedition_lcdui_Image_a.getHeight(), true);
            }
        }
    }

    public final void a(Graphics graphics) {
        this.a(graphics, 0, 0);
    }

    private void void_a() {
        if (this.var_javax_microedition_lcdui_Image_a == null) {
            this.var_javax_microedition_lcdui_Image_a = Image.createImage((int)this.var_short_a, (int)this.var_short_b);
            this.var_javax_microedition_lcdui_Graphics_a = this.var_javax_microedition_lcdui_Image_a.getGraphics();
            this.var_int_arr_a = new int[this.var_short_a * this.var_short_b];
        }
    }

    public final int int_a() {
        if (this.boolean_b()) {
            return this.var_short_b;
        }
        return this.var_short_a;
    }

    public final int int_b() {
        if (this.boolean_b()) {
            return this.var_short_a;
        }
        return this.var_short_b;
    }

    private boolean boolean_b() {
        return this.var_int_e == 4 || this.var_int_e == 7 || this.var_int_e == 6 || this.var_int_e == 5;
    }

    public final int c() {
        return this.var_int_a + this.f();
    }

    public final int d() {
        return this.var_int_b + this.g();
    }

    private int f() {
        if (this.var_short_arr_b != null) {
            return this.var_short_arr_b[this.var_int_c];
        }
        return 0;
    }

    private int g() {
        if (this.var_short_arr_c != null) {
            return this.var_short_arr_c[this.var_int_c];
        }
        return 0;
    }

    public final int e() {
        return this.var_short_arr_a.length;
    }

    public static z a(String string, String string2) {
        InputStream inputStream = (var_java_lang_Class_a == null ? (var_java_lang_Class_a = z.a("z")) : var_java_lang_Class_a).getResourceAsStream(string2 + string);
        if (inputStream != null) {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            z z2 = new z(dataInputStream, string2, false);
            try {
                dataInputStream.close();
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
            return z2;
        }
        System.out.println("newsprite error " + string);
        return null;
    }

    private static Class a(String string) {
        try {
            return Class.forName(string);
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new NoClassDefFoundError(classNotFoundException.getMessage());
        }
    }
}

