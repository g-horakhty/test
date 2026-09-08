/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 *  javax.microedition.lcdui.game.Sprite
 */
import java.util.Random;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.game.Sprite;

public final class ah {
    public Sprite var_javax_microedition_lcdui_game_Sprite_a;
    public Sprite var_javax_microedition_lcdui_game_Sprite_b;
    public Sprite var_javax_microedition_lcdui_game_Sprite_c;
    public Sprite var_javax_microedition_lcdui_game_Sprite_d;
    public Sprite var_javax_microedition_lcdui_game_Sprite_e;
    public Random var_java_util_Random_a = new Random();
    public int var_int_a;
    public int var_int_b;
    public int var_int_c;
    public long var_long_a;
    public long var_long_b;
    public byte var_byte_a;
    public byte var_byte_b = (byte)-1;
    public boolean var_boolean_a;
    public boolean var_boolean_b;
    public boolean var_boolean_c;
    public byte var_byte_c;
    public byte var_byte_d;
    public boolean var_boolean_d = true;
    public boolean var_boolean_e;
    public boolean var_boolean_f;
    public boolean var_boolean_g;
    public boolean var_boolean_h = true;
    public byte var_byte_e = (byte)100;
    public short var_short_a;
    public short var_short_b;
    public byte var_byte_f;
    public byte var_byte_g = (byte)(60 + this.var_int_a);
    public byte var_byte_h = (byte)(60 + this.var_int_a);
    public byte var_byte_i = (byte)(60 + this.var_int_a);
    public short var_short_c = (short)10;
    public short var_short_d = (short)10;
    public short var_short_e = (short)10;
    public boolean var_boolean_i;
    public boolean var_boolean_j;
    public short var_short_f;
    public short var_short_g;
    public short var_short_h = 0;
    public byte var_byte_j;
    public byte k;
    public byte l;
    public byte m;

    public ah(int n2, Sprite sprite, Sprite sprite2, Sprite sprite3, Sprite sprite4) {
        this.var_int_a = n2;
        this.var_javax_microedition_lcdui_game_Sprite_a = sprite;
        this.var_javax_microedition_lcdui_game_Sprite_b = sprite2;
        this.var_javax_microedition_lcdui_game_Sprite_c = sprite3;
        this.var_javax_microedition_lcdui_game_Sprite_e = sprite4;
        this.var_int_b = 84 - 29 * (n2 % 4) + 27 * (n2 / 4);
        this.var_int_c = 142 + 14 * (n2 % 4) + 14 * (n2 / 4);
    }

    public final void a(byte[] byArray, byte[] byArray2, Graphics graphics, int n2, int n3) {
        byte by;
        block24: {
            int n4;
            Sprite sprite;
            block21: {
                ah ah2;
                block22: {
                    block23: {
                        block19: {
                            block20: {
                                int n5;
                                Sprite sprite2;
                                int n6;
                                Sprite sprite3;
                                if (this.var_boolean_c) {
                                    sprite3 = this.var_javax_microedition_lcdui_game_Sprite_a;
                                    n6 = 1;
                                } else if (!this.var_boolean_h && this.var_byte_a != 4 && this.var_byte_b != -1) {
                                    sprite3 = this.var_javax_microedition_lcdui_game_Sprite_a;
                                    n6 = 2;
                                } else {
                                    sprite3 = this.var_javax_microedition_lcdui_game_Sprite_a;
                                    n6 = 0;
                                }
                                sprite3.setFrame(n6);
                                this.var_javax_microedition_lcdui_game_Sprite_a.setPosition(n2 + this.var_int_b, n3 + this.var_int_c);
                                this.var_javax_microedition_lcdui_game_Sprite_a.paint(graphics);
                                if (this.var_javax_microedition_lcdui_game_Sprite_d != null) {
                                    this.var_javax_microedition_lcdui_game_Sprite_d.setPosition(this.var_javax_microedition_lcdui_game_Sprite_a.getX() + (this.var_javax_microedition_lcdui_game_Sprite_a.getWidth() - this.var_javax_microedition_lcdui_game_Sprite_d.getWidth()) / 2, this.var_javax_microedition_lcdui_game_Sprite_a.getY() + 20 - this.var_javax_microedition_lcdui_game_Sprite_d.getHeight());
                                    this.var_javax_microedition_lcdui_game_Sprite_d.paint(graphics);
                                }
                                if (this.var_boolean_j) {
                                    sprite2 = this.var_javax_microedition_lcdui_game_Sprite_b;
                                    n5 = 0;
                                } else {
                                    sprite2 = this.var_javax_microedition_lcdui_game_Sprite_b;
                                    n5 = 1;
                                }
                                sprite2.setFrame(n5);
                                if (this.var_byte_c <= 0 || this.var_byte_d <= 0) break block19;
                                if (!this.var_boolean_i) break block20;
                                sprite = this.var_javax_microedition_lcdui_game_Sprite_e;
                                n4 = 1;
                                break block21;
                            }
                            ah2 = this;
                            break block22;
                        }
                        if (this.var_byte_c <= 0) break block23;
                        sprite = this.var_javax_microedition_lcdui_game_Sprite_e;
                        n4 = 1;
                        break block21;
                    }
                    if (this.var_byte_d <= 0) break block24;
                    ah2 = this;
                }
                sprite = ah2.var_javax_microedition_lcdui_game_Sprite_e;
                n4 = 0;
            }
            sprite.setFrame(n4);
        }
        byte by2 = by = 0;
        while (by2 < this.var_byte_d) {
            this.var_javax_microedition_lcdui_game_Sprite_c.setPosition(n2 + this.var_int_b + byArray[by], n3 + this.var_int_c + byArray2[by]);
            this.var_javax_microedition_lcdui_game_Sprite_c.paint(graphics);
            by2 = (byte)(by + 1);
        }
        byte by3 = by = 0;
        while (by3 < this.var_byte_c) {
            this.var_javax_microedition_lcdui_game_Sprite_b.setPosition(n2 + this.var_int_b + byArray[by + 3], n3 + this.var_int_c + byArray2[by + 3]);
            this.var_javax_microedition_lcdui_game_Sprite_b.paint(graphics);
            by3 = (byte)(by + 1);
        }
        if (this.var_byte_c > 0 || this.var_byte_d > 0) {
            this.var_javax_microedition_lcdui_game_Sprite_e.setPosition(n2 + this.var_int_b + 17, n3 + this.var_int_c - 23);
            this.var_javax_microedition_lcdui_game_Sprite_e.paint(graphics);
        }
        if (this.boolean_b()) {
            boolean bl;
            ah ah3;
            if (this.var_byte_c > 0 && this.var_byte_d > 0) {
                boolean bl2;
                ah ah4;
                if (this.var_boolean_i) {
                    ah4 = this;
                    bl2 = false;
                } else {
                    ah4 = this;
                    bl2 = ah4.var_boolean_i = true;
                }
            }
            if (this.var_boolean_j) {
                ah3 = this;
                bl = false;
            } else {
                ah3 = this;
                bl = true;
            }
            ah3.var_boolean_j = bl;
        }
    }

    public final void a(Graphics graphics, int n2, int n3, Sprite sprite, Sprite sprite2) {
        if (this.var_boolean_f && this.var_short_h >= 0) {
            if (this.var_short_f != 10) {
                int n4;
                int n5;
                Sprite sprite3;
                sprite.setFrame((int)this.var_short_g);
                sprite.setPosition(n2 + this.var_int_b, n3 + this.var_int_c - this.var_short_f);
                sprite.paint(graphics);
                sprite2.setFrame(10);
                sprite2.setPosition(sprite.getX() + sprite.getWidth(), sprite.getY());
                sprite2.paint(graphics);
                if (this.var_short_h / 10 != 0) {
                    sprite2.setFrame(this.var_short_h / 10);
                    sprite2.setPosition(sprite.getX() + sprite.getWidth() + sprite2.getWidth(), sprite.getY());
                    sprite2.paint(graphics);
                    sprite2.setFrame(this.var_short_h % 10);
                    sprite3 = sprite2;
                    n5 = sprite.getX() + sprite.getWidth();
                    n4 = sprite2.getWidth() * 2;
                } else {
                    sprite2.setFrame(this.var_short_h % 10);
                    sprite3 = sprite2;
                    n5 = sprite.getX() + sprite.getWidth();
                    n4 = sprite2.getWidth();
                }
                sprite3.setPosition(n5 + n4, sprite.getY());
                sprite2.paint(graphics);
                this.var_short_f = (short)(this.var_short_f + 1);
                return;
            }
            this.var_short_h = 0;
            this.var_short_f = 0;
            this.var_boolean_f = false;
        }
    }

    public final void a(Graphics graphics, byte by, Sprite sprite) {
        if (this.var_boolean_g && by >= 0) {
            if (this.var_byte_j != 10) {
                int n2;
                int n3;
                Sprite sprite2;
                sprite.setFrame(10);
                sprite.setPosition(80, 30 - this.var_byte_j);
                sprite.paint(graphics);
                if (by / 10 != 0) {
                    sprite.setFrame(by / 10);
                    sprite.setPosition(80 + sprite.getWidth(), 30 - this.var_byte_j);
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
                sprite2.setPosition(n3 + n2, 30 - this.var_byte_j);
                sprite.paint(graphics);
                this.var_byte_j = (byte)(this.var_byte_j + 1);
                return;
            }
            this.var_byte_j = 0;
            this.var_boolean_g = false;
        }
    }

    public final void void_a() {
        this.var_byte_j = 0;
        this.var_boolean_g = false;
        this.var_short_f = 0;
        this.var_boolean_f = false;
    }

    private boolean boolean_b() {
        if (10 > this.k) {
            this.k = (byte)(this.k + 1);
            return false;
        }
        this.k = 0;
        return true;
    }

    public final void a(byte by) {
        this.var_short_a = (short)(w.var_short_arr_a[by] / 4);
        this.var_byte_f = 1;
        this.var_byte_e = (byte)100;
        this.var_byte_b = by;
        this.var_byte_a = 0;
        this.var_boolean_h = true;
    }

    public final void void_b() {
        if (this.var_boolean_a) {
            this.var_long_b = System.currentTimeMillis();
            if (this.var_long_b - this.var_long_a >= 1000L) {
                this.var_long_a = this.var_long_b;
                if (!this.var_boolean_c) {
                    this.var_byte_g = (byte)(this.var_byte_g - 1);
                    if (this.var_byte_g == 0) {
                        this.var_byte_g = (byte)(60 + this.var_int_a);
                        if ((Math.abs(this.var_java_util_Random_a.nextInt()) + this.var_int_a) % 3 == 0) {
                            this.var_boolean_c = true;
                        }
                    }
                } else if (this.var_byte_a < 4 && (this.var_short_c = (short)(this.var_short_c - 1)) == 0) {
                    this.var_short_c = (short)10;
                    this.var_byte_e = (byte)(this.var_byte_e - 1);
                    if (this.var_byte_e < 10) {
                        this.var_byte_e = (byte)10;
                    }
                }
                if (this.var_byte_a > 0 && this.var_byte_a < 4) {
                    if (this.var_byte_c != 0 && (this.var_short_e = (short)(this.var_short_e - 1)) == 0) {
                        this.var_short_e = (short)20;
                        this.var_byte_e = (byte)(this.var_byte_e - this.var_byte_c);
                        if (this.var_byte_e < 10) {
                            this.var_byte_e = (byte)10;
                        }
                    }
                    if (this.var_byte_d != 0 && (this.var_short_d = (short)(this.var_short_d - 1)) == 0) {
                        this.var_short_d = (short)20;
                        this.var_byte_e = (byte)(this.var_byte_e - this.var_byte_d);
                        if (this.var_byte_e < 10) {
                            this.var_byte_e = (byte)10;
                        }
                    }
                    if ((this.var_byte_h = (byte)(this.var_byte_h - 1)) == 0) {
                        this.var_byte_h = (byte)(60 + this.var_int_a);
                        if ((Math.abs(this.var_java_util_Random_a.nextInt()) + this.var_int_a) % 5 == 0) {
                            this.var_byte_d = (byte)(this.var_byte_d + 1);
                        }
                        if (this.var_byte_d > 3) {
                            this.var_byte_d = (byte)3;
                        }
                    }
                    if ((this.var_byte_i = (byte)(this.var_byte_i - 1)) == 0) {
                        this.var_byte_i = (byte)(60 + this.var_int_a);
                        if ((Math.abs(this.var_java_util_Random_a.nextInt()) + this.var_int_a) % 5 == 0) {
                            this.var_byte_c = (byte)(this.var_byte_c + 1);
                        }
                        if (this.var_byte_c > 3) {
                            this.var_byte_c = (byte)3;
                        }
                    }
                }
                this.var_short_b = (short)(this.var_short_b - 1);
                if (this.var_short_b <= 0) {
                    this.var_short_b = 0;
                    if (this.var_byte_a < 4) {
                        this.var_byte_a = (byte)(this.var_byte_a + 1);
                        if (this.var_byte_a == 4) {
                            this.var_boolean_e = true;
                            this.var_boolean_a = false;
                        } else {
                            this.var_short_b = this.var_short_a;
                            this.var_boolean_h = true;
                        }
                        this.a((byte)(this.var_byte_b + 1), this.var_byte_a);
                    }
                }
            }
        }
    }

    public final void a(byte by, byte by2) {
        block5: {
            try {
                this.var_javax_microedition_lcdui_game_Sprite_d = null;
                if (by == 0) {
                    this.var_javax_microedition_lcdui_game_Sprite_d = new Sprite(Image.createImage((String)"/appear_plant/plant000.png"));
                    break block5;
                }
                if (by == 17) {
                    this.var_javax_microedition_lcdui_game_Sprite_d = new Sprite(Image.createImage((String)"/appear_plant/plant170.png"));
                    break block5;
                }
                if (by / 10 != 0) {
                    this.var_javax_microedition_lcdui_game_Sprite_d = new Sprite(Image.createImage((String)("/appear_plant/plant" + by + by2 + ".png")));
                    break block5;
                }
                this.var_javax_microedition_lcdui_game_Sprite_d = new Sprite(Image.createImage((String)("/appear_plant/plant0" + by + by2 + ".png")));
                return;
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
    }

    public final boolean boolean_a() {
        if (this.m < 9) {
            if (this.l > 120) {
                this.l = 0;
                if ((Math.abs(this.var_java_util_Random_a.nextInt()) + this.var_int_a) % 50 == 0) {
                    this.m = (byte)(this.m + 3);
                    return true;
                }
            } else {
                this.l = (byte)(this.l + 1);
            }
        }
        return false;
    }

    public final int a(int n2) {
        return n2 + this.var_int_b;
    }

    public final int b(int n2) {
        return n2 + this.var_int_c;
    }
}

