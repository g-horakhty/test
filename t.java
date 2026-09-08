/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.game.Sprite
 */
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.game.Sprite;

public final class t {
    public z var_z_a;
    public z var_z_b;
    public boolean var_boolean_a;
    public boolean var_boolean_b;
    public boolean var_boolean_c;
    public byte var_byte_a;
    public byte var_byte_b;
    public byte var_byte_c = 1;
    public byte d = (byte)100;
    public short var_short_a;
    public byte e;
    public long var_long_a = System.currentTimeMillis();
    public long var_long_b;
    public byte f;

    public t(byte by, byte by2) {
        this.var_z_a = z.a("animal20", "/newsprite/");
        this.var_z_b = z.a("animal21", "/newsprite/");
        this.e = w.var_byte_arr_h[1];
    }

    public final void a(Graphics graphics, int n2, int n3) {
        int n4;
        z z2;
        if (!this.var_boolean_a) {
            z2 = this.var_z_b;
            n4 = 0;
        } else {
            z2 = this.var_z_b;
            n4 = 1;
        }
        z2.var_int_c = n4;
        this.var_z_b.a(n2 + 230, n3 + 90);
        this.var_z_a.a(n2 + 220, n3 + 80);
        this.var_z_a.a(graphics);
        this.var_z_b.a(graphics);
        if (this.c()) {
            this.void_a();
        }
    }

    public final void a(Graphics graphics, Sprite sprite, Sprite sprite2) {
        if (this.var_boolean_b) {
            if (this.var_byte_a != 10) {
                int n2;
                int n3;
                Sprite sprite3;
                sprite.setFrame(1);
                sprite.setPosition(this.var_z_b.c(), this.var_z_b.d() - this.var_byte_a);
                sprite.paint(graphics);
                sprite2.setFrame(10);
                sprite2.setPosition(sprite.getX() + sprite.getWidth(), sprite.getY());
                sprite2.paint(graphics);
                if (w.var_byte_arr_e[1] / 10 != 0) {
                    sprite2.setFrame(w.var_byte_arr_e[1] / 10);
                    sprite2.setPosition(sprite.getX() + sprite.getWidth() + sprite2.getWidth(), sprite.getY());
                    sprite2.paint(graphics);
                    sprite2.setFrame(w.var_byte_arr_e[1] % 10);
                    sprite3 = sprite2;
                    n3 = sprite.getX() + sprite.getWidth();
                    n2 = sprite2.getWidth() * 2;
                } else {
                    sprite2.setFrame(w.var_byte_arr_e[1] % 10);
                    sprite3 = sprite2;
                    n3 = sprite.getX() + sprite.getWidth();
                    n2 = sprite2.getWidth();
                }
                sprite3.setPosition(n3 + n2, sprite.getY());
                sprite2.paint(graphics);
                this.var_byte_a = (byte)(this.var_byte_a + 1);
                return;
            }
            this.var_byte_a = 0;
            this.var_boolean_b = false;
        }
    }

    public final void a(Graphics graphics, byte by, Sprite sprite) {
        if (this.var_boolean_c) {
            if (this.var_byte_b != 10) {
                int n2;
                int n3;
                Sprite sprite2;
                sprite.setFrame(10);
                sprite.setPosition(80, 30 - this.var_byte_b);
                sprite.paint(graphics);
                if (by / 10 != 0) {
                    sprite.setFrame(by / 10);
                    sprite.setPosition(80 + sprite.getWidth(), 30 - this.var_byte_b);
                    sprite.paint(graphics);
                    sprite.setFrame(by % 10);
                    sprite2 = sprite;
                    n3 = 80;
                    n2 = sprite.getWidth() * 2;
                } else {
                    sprite.setFrame(by % 10);
                    sprite2 = sprite;
                    n3 = 80;
                    n2 = sprite.getWidth();
                }
                sprite2.setPosition(n3 + n2, 30 - this.var_byte_b);
                sprite.paint(graphics);
                this.var_byte_b = (byte)(this.var_byte_b + 1);
                return;
            }
            this.var_byte_b = 0;
            this.var_boolean_c = false;
        }
    }

    public final boolean boolean_a() {
        if (!this.var_boolean_a) {
            if (this.var_short_a == 0 && !this.var_boolean_a) {
                this.var_short_a = w.var_byte_arr_g[1];
            }
            this.var_long_b = System.currentTimeMillis();
            if (this.var_long_b - this.var_long_a >= 1000L) {
                this.var_long_a = this.var_long_b;
                if (this.d != 0) {
                    this.var_byte_c = (byte)(this.var_byte_c - 1);
                    if (this.var_byte_c == 0) {
                        this.var_byte_c = 1;
                        this.d = (byte)(this.d - 1);
                        if (this.d < 0) {
                            this.d = 0;
                        }
                    }
                }
                if (this.d != 0) {
                    this.var_short_a = (short)(this.var_short_a - 1);
                    if (this.var_short_a < 0) {
                        this.var_short_a = 0;
                    }
                    if (this.var_short_a == 0) {
                        this.var_boolean_a = true;
                    }
                }
            }
        }
        return this.e <= 0;
    }

    private void void_a() {
        this.var_z_a.boolean_a();
    }

    public final boolean boolean_b() {
        if (this.d < 50) {
            this.d = (byte)100;
            return true;
        }
        return false;
    }

    private boolean c() {
        if (this.f > 2) {
            this.f = 0;
            return true;
        }
        this.f = (byte)(this.f + 1);
        return false;
    }

    public final int int_a() {
        return this.var_z_b.c();
    }

    public final int int_b() {
        return this.var_z_b.d();
    }
}

