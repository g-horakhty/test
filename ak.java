/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

public final class ak {
    public z var_z_a;
    public z var_z_b;
    public byte var_byte_a = (byte)5;
    public byte var_byte_b = (byte)100;
    public long var_long_a = System.currentTimeMillis();
    public long var_long_b;
    public byte c;
    public boolean var_boolean_a;
    public byte d;

    public ak() {
        this.var_z_a = z.a("animal00", "/newsprite/");
        this.var_z_b = z.a("animal01", "/newsprite/");
    }

    public final void a(Graphics graphics, int n2, int n3) {
        int n4;
        z z2;
        if (this.var_byte_b == 0) {
            z2 = this.var_z_b;
            n4 = 0;
        } else {
            z2 = this.var_z_b;
            n4 = 1;
        }
        z2.var_int_c = n4;
        this.var_z_b.a(n2 + 35, n3 + 92);
        this.var_z_a.a(n2 + 95 + this.c, n3 + 90);
        this.var_z_a.a(graphics);
        this.var_z_b.a(graphics);
        if (this.boolean_b()) {
            this.void_b();
        }
    }

    public final void void_a() {
        this.var_long_b = System.currentTimeMillis();
        if (this.var_long_b - this.var_long_a >= 1000L) {
            this.var_long_a = this.var_long_b;
            this.var_byte_a = (byte)(this.var_byte_a - 1);
            if (this.var_byte_a == 0) {
                this.var_byte_a = (byte)5;
                this.var_byte_b = (byte)(this.var_byte_b - 1);
                if (this.var_byte_b < 0) {
                    this.var_byte_b = 0;
                }
            }
        }
    }

    private void void_b() {
        int n2;
        ak ak2;
        if (this.var_z_a.var_byte_b == 1) {
            ak ak3 = this;
            ak2 = ak3;
            n2 = ak3.c + 4;
        } else {
            ak ak4 = this;
            ak2 = ak4;
            n2 = ak4.c - 4;
        }
        ak2.c = (byte)n2;
        if (this.var_z_a.boolean_a()) {
            boolean bl;
            ak ak5;
            if (this.var_boolean_a) {
                int n3;
                z z2;
                if (this.var_z_a.var_byte_b == 1) {
                    z2 = this.var_z_a;
                    n3 = 0;
                } else {
                    z2 = this.var_z_a;
                    n3 = 1;
                }
                z2.a(n3);
                ak5 = this;
                bl = false;
            } else {
                ak5 = this;
                bl = true;
            }
            ak5.var_boolean_a = bl;
        }
    }

    public final boolean boolean_a() {
        if (this.var_byte_b < 50) {
            this.var_byte_b = (byte)100;
            return true;
        }
        return false;
    }

    private boolean boolean_b() {
        if (this.d > 2) {
            this.d = 0;
            return true;
        }
        this.d = (byte)(this.d + 1);
        return false;
    }

    public final int int_a() {
        return this.var_z_b.c();
    }

    public final int int_b() {
        return this.var_z_b.d();
    }
}

