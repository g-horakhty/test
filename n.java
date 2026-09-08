/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.game.Sprite
 */
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.game.Sprite;

public final class n {
    public z var_z_a;
    public byte var_byte_a;
    public byte var_byte_b;
    public byte var_byte_c = 1;
    public byte var_byte_d = (byte)100;
    public short var_short_a;
    public boolean var_boolean_a;
    public boolean var_boolean_b;
    public boolean var_boolean_c;
    public boolean var_boolean_d;
    public byte var_byte_e;
    public long var_long_a = System.currentTimeMillis();
    public long var_long_b;
    public byte f;
    public boolean var_boolean_e;
    public byte g;
    public byte h;
    public byte i;

    public n() {
        this.var_z_a = z.a("animal40", "/newsprite/");
    }

    public final void a(Graphics graphics, int n2, int n3) {
        this.var_z_a.a(n2 + 218 + this.g, n3 + 117 + this.h);
        this.var_z_a.a(graphics);
        if (this.boolean_b()) {
            this.c();
        }
    }

    public final void a(Graphics graphics, Sprite sprite, Sprite sprite2) {
        if (this.var_boolean_b) {
            if (this.var_byte_a != 10) {
                int n2;
                int n3;
                Sprite sprite3;
                sprite.setFrame(2);
                sprite.setPosition(this.var_z_a.c(), this.var_z_a.d() - this.var_byte_a);
                sprite.paint(graphics);
                sprite2.setFrame(10);
                sprite2.setPosition(sprite.getX() + sprite.getWidth(), sprite.getY());
                sprite2.paint(graphics);
                if (w.var_byte_arr_e[2] / 10 != 0) {
                    sprite2.setFrame(w.var_byte_arr_e[2] / 10);
                    sprite2.setPosition(sprite.getX() + sprite.getWidth() + sprite2.getWidth(), sprite.getY());
                    sprite2.paint(graphics);
                    sprite2.setFrame(w.var_byte_arr_e[2] % 10);
                    sprite3 = sprite2;
                    n3 = sprite.getX() + sprite.getWidth();
                    n2 = sprite2.getWidth() * 2;
                } else {
                    sprite2.setFrame(w.var_byte_arr_e[2] % 10);
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

    public final void void_a() {
        if (!this.var_boolean_a && !this.var_boolean_d) {
            if (this.var_short_a == 0 && !this.var_boolean_a) {
                this.var_short_a = w.var_byte_arr_g[2];
            }
            this.var_long_b = System.currentTimeMillis();
            if (this.var_long_b - this.var_long_a >= 1000L) {
                this.var_long_a = this.var_long_b;
                if (this.var_byte_d != 0) {
                    this.var_byte_c = (byte)(this.var_byte_c - 1);
                    if (this.var_byte_c == 0) {
                        this.var_byte_c = 1;
                        this.var_byte_d = (byte)(this.var_byte_d - 1);
                        if (this.var_byte_d < 0) {
                            this.var_byte_d = 0;
                        }
                    }
                }
                if (this.var_byte_d != 0 && this.var_byte_e != 3) {
                    this.var_short_a = (short)(this.var_short_a - 1);
                    if (this.var_short_a < 0) {
                        this.var_short_a = 0;
                    }
                    if (this.var_short_a == 0) {
                        this.var_byte_e = (byte)(this.var_byte_e + 1);
                        this.void_b();
                    }
                }
                if (this.var_byte_e == 3 && !this.var_boolean_a) {
                    this.var_boolean_a = true;
                }
            }
        }
    }

    public final void void_b() {
        block4: {
            byte by;
            block3: {
                n n2;
                block2: {
                    this.h = 0;
                    this.g = 0;
                    this.var_z_a = z.a("animal4" + this.var_byte_e, "/newsprite/");
                    if (this.var_byte_e != 1) break block2;
                    n2 = this;
                    by = 1;
                    break block3;
                }
                if (this.var_byte_e != 2) break block4;
                n2 = this;
                by = 0;
            }
            n2.f = by;
            this.var_z_a.a(this.f);
        }
    }

    private void c() {
        block17: {
            block22: {
                block28: {
                    int n2;
                    block24: {
                        int n3;
                        n n4;
                        block27: {
                            n n5;
                            block26: {
                                block25: {
                                    block23: {
                                        block18: {
                                            block21: {
                                                int n6;
                                                block20: {
                                                    n n7;
                                                    block19: {
                                                        block16: {
                                                            if (this.var_byte_e != 0) break block16;
                                                            if (this.var_z_a.boolean_a()) {
                                                                return;
                                                            }
                                                            break block17;
                                                        }
                                                        if (this.var_byte_e != 1) break block18;
                                                        if (this.f != 0) break block19;
                                                        n n8 = this;
                                                        n7 = n8;
                                                        n6 = n8.g - 3;
                                                        break block20;
                                                    }
                                                    if (this.f != 1) break block21;
                                                    n n9 = this;
                                                    n7 = n9;
                                                    n6 = n9.g + 3;
                                                }
                                                n7.g = (byte)n6;
                                            }
                                            if (this.var_z_a.boolean_a()) {
                                                if (this.var_boolean_e) {
                                                    this.f = (byte)(this.f + 1);
                                                    if (this.f > 1) {
                                                        this.f = 0;
                                                    }
                                                    this.var_z_a.a(this.f);
                                                    this.var_boolean_e = false;
                                                    return;
                                                }
                                                this.var_boolean_e = true;
                                                return;
                                            }
                                            break block17;
                                        }
                                        if (this.var_byte_e != 2) break block22;
                                        if (this.f != 0) break block23;
                                        this.g = (byte)(this.g - 2);
                                        n n10 = this;
                                        n4 = n10;
                                        n2 = n10.h + 2;
                                        break block24;
                                    }
                                    if (this.f != 1) break block25;
                                    this.g = (byte)(this.g + 2);
                                    n n11 = this;
                                    n4 = n11;
                                    n2 = n11.h + 2;
                                    break block24;
                                }
                                if (this.f != 2) break block26;
                                n n12 = this;
                                n5 = n12;
                                n3 = n12.g + 2;
                                break block27;
                            }
                            if (this.f != 3) break block28;
                            n n13 = this;
                            n5 = n13;
                            n3 = n13.g - 2;
                        }
                        n5.g = (byte)n3;
                        n n14 = this;
                        n4 = n14;
                        n2 = n14.h - 2;
                    }
                    n4.h = (byte)n2;
                }
                if (this.var_z_a.boolean_a()) {
                    if (this.var_boolean_e) {
                        this.f = (byte)(this.f + 1);
                        if (this.f > 3) {
                            this.f = 0;
                        }
                        this.var_z_a.a(this.f);
                        this.var_boolean_e = false;
                        return;
                    }
                    this.var_boolean_e = true;
                    return;
                }
                break block17;
            }
            if (this.var_byte_e == 3) {
                this.var_z_a.boolean_a();
            }
        }
    }

    public final boolean boolean_a() {
        if (this.var_byte_d < 50) {
            this.var_byte_d = (byte)100;
            return true;
        }
        return false;
    }

    private boolean boolean_b() {
        if (this.i > 2) {
            this.i = 0;
            return true;
        }
        this.i = (byte)(this.i + 1);
        return false;
    }

    public final int int_a() {
        return this.var_z_a.c();
    }

    public final int int_b() {
        return this.var_z_a.d();
    }
}

