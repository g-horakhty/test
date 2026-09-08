/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import java.io.DataInputStream;
import java.io.IOException;
import javax.microedition.lcdui.Graphics;

public final class e {
    public boolean var_boolean_a;
    public o[] var_o_arr_a;
    public short[] var_short_arr_a;
    public short[] b;
    public short[] c;
    public byte[] var_byte_arr_a;

    public e(DataInputStream dataInputStream) {
        this.a(dataInputStream);
    }

    private void a(DataInputStream dataInputStream) {
        try {
            int n2;
            dataInputStream.readShort();
            this.var_boolean_a = dataInputStream.readBoolean();
            dataInputStream.readInt();
            dataInputStream.readByte();
            dataInputStream.readByte();
            short s2 = dataInputStream.readShort();
            if (s2 > 0) {
                this.var_o_arr_a = new o[s2];
                for (n2 = 0; n2 < this.var_o_arr_a.length; ++n2) {
                    this.var_o_arr_a[n2] = new o(dataInputStream);
                }
            }
            this.var_short_arr_a = new short[dataInputStream.readShort()];
            this.c = new short[this.var_short_arr_a.length];
            this.b = new short[this.var_short_arr_a.length];
            this.var_byte_arr_a = new byte[this.var_short_arr_a.length];
            for (n2 = 0; n2 < this.var_short_arr_a.length; ++n2) {
                this.var_short_arr_a[n2] = dataInputStream.readShort();
                this.b[n2] = dataInputStream.readShort();
                this.c[n2] = dataInputStream.readShort();
                this.var_byte_arr_a[n2] = dataInputStream.readByte();
            }
            return;
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return;
        }
    }

    public final void a(Graphics graphics, z z2, int n2, int n3, int n4) {
        for (int i2 = this.var_short_arr_a.length - 1; i2 >= 0; --i2) {
            f f2 = z2.var_f_arr_a[this.var_short_arr_a[i2]];
            f2.a(graphics, z2, n2, n3, this.b[i2], this.c[i2], n4, this.var_byte_arr_a[i2]);
        }
    }

    static {
        int[] nArray = new int[]{0, 0xFFFFFF, 0xFF0000, 255, 65280, 0xFFFF00};
    }
}

