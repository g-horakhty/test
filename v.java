/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 *  javax.microedition.lcdui.game.Sprite
 */
import java.io.IOException;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.game.Sprite;

public final class v {
    private long var_long_a;
    private boolean var_boolean_a;
    public w var_w_a;
    public Graphics var_javax_microedition_lcdui_Graphics_a;
    private short var_short_a = (short)111;
    private Sprite[] var_javax_microedition_lcdui_game_Sprite_arr_a;
    private Sprite[] var_javax_microedition_lcdui_game_Sprite_arr_b;
    private Sprite var_javax_microedition_lcdui_game_Sprite_a;
    private short var_short_b = 0;
    public g var_g_a;
    private short var_short_c = (short)90;
    private short var_short_d;
    private short var_short_e = (short)10;
    private boolean var_boolean_b = false;
    private boolean var_boolean_c = false;
    private boolean var_boolean_d = false;
    private boolean var_boolean_e = false;
    private boolean var_boolean_f = false;
    private boolean var_boolean_g = false;
    private short var_short_f;
    private short var_short_g = 0;
    private short h = 0;

    public v(w w2, Graphics graphics) {
        this.var_w_a = w2;
        this.var_javax_microedition_lcdui_Graphics_a = graphics;
        w2.setFullScreenMode(true);
        this.var_long_a = 33L;
        this.b();
        this.c();
    }

    private void b() {
        this.var_javax_microedition_lcdui_game_Sprite_arr_b = new Sprite[7];
        this.var_javax_microedition_lcdui_game_Sprite_arr_a = new Sprite[3];
        try {
            this.var_javax_microedition_lcdui_game_Sprite_arr_a[0] = new Sprite(Image.createImage((String)"/images/auerlogo_1.png"));
            this.var_javax_microedition_lcdui_game_Sprite_arr_a[1] = new Sprite(Image.createImage((String)"/images/auerlogo_2.png"));
            this.var_javax_microedition_lcdui_game_Sprite_arr_a[2] = new Sprite(Image.createImage((String)"/images/auerlogo_3.png"));
            Image image = Image.createImage((String)"/images/e7playlogo_1.png");
            for (int i2 = 0; i2 < 6; ++i2) {
                this.var_javax_microedition_lcdui_game_Sprite_arr_b[i2] = new Sprite(image, image.getWidth() / 6, image.getHeight());
            }
            this.var_javax_microedition_lcdui_game_Sprite_arr_b[6] = new Sprite(Image.createImage((String)"/images/e7playlogo_2.png"));
            this.var_g_a = new g("/sounds/logo.mid", "audio/midi");
            this.var_javax_microedition_lcdui_game_Sprite_a = new Sprite(Image.createImage((String)"/images/chinaLogo.png"));
            System.gc();
            return;
        }
        catch (IOException iOException) {
            System.err.println("Failed loading images!");
            return;
        }
    }

    private void c() {
        for (int i2 = 0; i2 < 6; ++i2) {
            this.var_javax_microedition_lcdui_game_Sprite_arr_b[i2].setFrame(i2);
        }
        this.var_javax_microedition_lcdui_game_Sprite_arr_a[0].setPosition((this.var_w_a.getWidth() - this.var_short_a) / 2, (this.var_w_a.getHeight() - this.var_javax_microedition_lcdui_game_Sprite_arr_a[0].getHeight()) / 2);
        this.var_javax_microedition_lcdui_game_Sprite_arr_a[1].setPosition(this.var_javax_microedition_lcdui_game_Sprite_arr_a[0].getX() + 44, this.var_javax_microedition_lcdui_game_Sprite_arr_a[0].getY() + 3);
        this.var_javax_microedition_lcdui_game_Sprite_arr_a[2].setPosition(this.var_javax_microedition_lcdui_game_Sprite_arr_a[0].getX() + 44, this.var_javax_microedition_lcdui_game_Sprite_arr_a[0].getY() + 15);
        this.var_javax_microedition_lcdui_game_Sprite_arr_b[0].setPosition((this.var_w_a.getWidth() - this.var_short_c) / 2, this.var_w_a.getHeight());
        this.var_javax_microedition_lcdui_game_Sprite_arr_b[1].setPosition((this.var_w_a.getWidth() - this.var_short_c) / 2 + 15, this.var_w_a.getHeight());
        this.var_javax_microedition_lcdui_game_Sprite_arr_b[2].setPosition((this.var_w_a.getWidth() - this.var_short_c) / 2 + 28, this.var_w_a.getHeight());
        this.var_javax_microedition_lcdui_game_Sprite_arr_b[3].setPosition((this.var_w_a.getWidth() - this.var_short_c) / 2 + 47, this.var_w_a.getHeight());
        this.var_javax_microedition_lcdui_game_Sprite_arr_b[4].setPosition((this.var_w_a.getWidth() - this.var_short_c) / 2 + 58, this.var_w_a.getHeight());
        this.var_javax_microedition_lcdui_game_Sprite_arr_b[5].setPosition((this.var_w_a.getWidth() - this.var_short_c) / 2 + 73, this.var_w_a.getHeight());
        this.var_short_g = 0;
        this.var_g_a.b(w.int_a());
        this.var_short_d = (short)(this.var_w_a.getHeight() - 30);
    }

    public final void a() {
        while (!this.var_boolean_a) {
            this.a(this.var_javax_microedition_lcdui_Graphics_a);
            try {
                Thread.sleep(this.var_long_a);
            }
            catch (InterruptedException interruptedException) {}
        }
    }

    private void a(Graphics graphics) {
        block18: {
            short s2;
            block22: {
                v v2;
                v v3;
                block20: {
                    block23: {
                        block21: {
                            block19: {
                                block17: {
                                    if (this.var_short_g != 0) break block17;
                                    graphics.setColor(255, 255, 255);
                                    graphics.fillRect(0, 0, this.var_w_a.getWidth(), this.var_w_a.getHeight());
                                    this.var_javax_microedition_lcdui_game_Sprite_arr_a[0].paint(graphics);
                                    if (this.var_short_b > 5) {
                                        this.var_javax_microedition_lcdui_game_Sprite_arr_a[1].paint(graphics);
                                    }
                                    if (this.var_short_b > 6) {
                                        this.var_javax_microedition_lcdui_game_Sprite_arr_a[2].paint(graphics);
                                    }
                                    boolean bl = false;
                                    this.var_short_b = v.a(this.var_short_b, 8);
                                    try {
                                        Thread.sleep(100L);
                                    }
                                    catch (InterruptedException interruptedException) {}
                                    if (this.var_short_b == 0) {
                                        this.var_short_g = 1;
                                    }
                                    break block18;
                                }
                                if (this.var_short_g != 1) break block19;
                                this.var_javax_microedition_lcdui_game_Sprite_arr_a[0].paint(graphics);
                                this.var_javax_microedition_lcdui_game_Sprite_arr_a[1].paint(graphics);
                                this.var_javax_microedition_lcdui_game_Sprite_arr_a[2].paint(graphics);
                                if (this.var_short_f > 20) {
                                    this.var_short_g = (short)2;
                                    this.h = (short)3;
                                }
                                v3 = this;
                                break block20;
                            }
                            if (this.var_short_g != 2) break block21;
                            boolean bl = false;
                            this.var_short_b = v.a(this.var_short_b, 10);
                            if (this.var_short_b != 0) break block18;
                            this.var_short_g = this.h;
                            this.var_g_a.a(1);
                            v2 = this;
                            s2 = 0;
                            break block22;
                        }
                        if (this.var_short_g != 3) break block23;
                        graphics.setColor(255, 255, 255);
                        graphics.fillRect(0, 0, this.var_w_a.getWidth(), this.var_w_a.getHeight());
                        this.var_javax_microedition_lcdui_game_Sprite_arr_b[0].move(0, (int)(-this.var_short_e));
                        this.a(this.var_javax_microedition_lcdui_game_Sprite_arr_b[0], true);
                        this.var_javax_microedition_lcdui_game_Sprite_arr_b[0].paint(graphics);
                        if (this.var_javax_microedition_lcdui_game_Sprite_arr_b[0].getY() < this.var_short_d) {
                            this.var_javax_microedition_lcdui_game_Sprite_arr_b[1].move(0, (int)(-this.var_short_e));
                            this.b(this.var_javax_microedition_lcdui_game_Sprite_arr_b[1], true);
                            this.var_javax_microedition_lcdui_game_Sprite_arr_b[1].paint(graphics);
                        }
                        if (this.var_javax_microedition_lcdui_game_Sprite_arr_b[1].getY() < this.var_short_d) {
                            this.var_javax_microedition_lcdui_game_Sprite_arr_b[2].move(0, (int)(-this.var_short_e));
                            this.c(this.var_javax_microedition_lcdui_game_Sprite_arr_b[2], true);
                            this.var_javax_microedition_lcdui_game_Sprite_arr_b[2].paint(graphics);
                        }
                        if (this.var_javax_microedition_lcdui_game_Sprite_arr_b[2].getY() < this.var_short_d) {
                            this.var_javax_microedition_lcdui_game_Sprite_arr_b[3].move(0, (int)(-this.var_short_e));
                            this.d(this.var_javax_microedition_lcdui_game_Sprite_arr_b[3], true);
                            this.var_javax_microedition_lcdui_game_Sprite_arr_b[3].paint(graphics);
                        }
                        if (this.var_javax_microedition_lcdui_game_Sprite_arr_b[3].getY() < this.var_short_d) {
                            this.var_javax_microedition_lcdui_game_Sprite_arr_b[4].move(0, (int)(-this.var_short_e));
                            this.e(this.var_javax_microedition_lcdui_game_Sprite_arr_b[4], true);
                            this.var_javax_microedition_lcdui_game_Sprite_arr_b[4].paint(graphics);
                        }
                        if (this.var_javax_microedition_lcdui_game_Sprite_arr_b[4].getY() < this.var_short_d) {
                            this.var_javax_microedition_lcdui_game_Sprite_arr_b[5].move(0, (int)(-this.var_short_e));
                            this.f(this.var_javax_microedition_lcdui_game_Sprite_arr_b[5], true);
                            this.var_javax_microedition_lcdui_game_Sprite_arr_b[5].paint(graphics);
                        }
                        if (!this.var_boolean_g) break block18;
                        this.var_javax_microedition_lcdui_game_Sprite_arr_b[6].setPosition(this.var_javax_microedition_lcdui_game_Sprite_arr_b[0].getX(), this.var_javax_microedition_lcdui_game_Sprite_arr_b[0].getY() + this.var_javax_microedition_lcdui_game_Sprite_arr_b[0].getHeight() + 2);
                        this.var_javax_microedition_lcdui_game_Sprite_arr_b[6].paint(graphics);
                        if (this.var_short_f > 20) {
                            this.var_short_g = (short)4;
                            this.var_short_f = 0;
                        }
                        v3 = this;
                        break block20;
                    }
                    if (this.var_short_g != 4) break block18;
                    this.var_javax_microedition_lcdui_game_Sprite_a.setPosition((w.var_int_c - this.var_javax_microedition_lcdui_game_Sprite_a.getWidth()) / 2, w.var_int_d - this.var_javax_microedition_lcdui_game_Sprite_a.getHeight());
                    this.var_javax_microedition_lcdui_game_Sprite_a.paint(graphics);
                    if (this.var_short_f > 20) {
                        this.d();
                        this.var_short_f = 0;
                    }
                    v3 = this;
                }
                v2 = v3;
                s2 = (short)(v3.var_short_f + 1);
            }
            v2.var_short_f = s2;
        }
        this.var_w_a.flushGraphics();
    }

    private void a(Sprite sprite, boolean bl) {
        int n2 = (this.var_w_a.getHeight() - sprite.getHeight()) / 2 - this.var_short_e;
        if (bl) {
            if (sprite.getY() < n2) {
                sprite.setPosition((this.var_w_a.getWidth() - this.var_short_c) / 2, n2 + this.var_short_e);
                this.var_boolean_b = true;
            }
            if (this.var_boolean_b) {
                sprite.setPosition((this.var_w_a.getWidth() - this.var_short_c) / 2, n2 + this.var_short_e);
            }
        }
    }

    private void b(Sprite sprite, boolean bl) {
        int n2 = (this.var_w_a.getHeight() - sprite.getHeight()) / 2 - this.var_short_e;
        if (bl) {
            if (sprite.getY() < n2) {
                sprite.setPosition((this.var_w_a.getWidth() - this.var_short_c) / 2 + 15, n2 + this.var_short_e);
                this.var_boolean_c = true;
            }
            if (this.var_boolean_c) {
                sprite.setPosition((this.var_w_a.getWidth() - this.var_short_c) / 2 + 15, n2 + this.var_short_e);
            }
        }
    }

    private void c(Sprite sprite, boolean bl) {
        int n2 = (this.var_w_a.getHeight() - sprite.getHeight()) / 2 - this.var_short_e;
        if (bl) {
            if (sprite.getY() < n2) {
                sprite.setPosition((this.var_w_a.getWidth() - this.var_short_c) / 2 + 28, n2 + this.var_short_e);
                this.var_boolean_d = true;
            }
            if (this.var_boolean_d) {
                sprite.setPosition((this.var_w_a.getWidth() - this.var_short_c) / 2 + 28, n2 + this.var_short_e);
            }
        }
    }

    private void d(Sprite sprite, boolean bl) {
        int n2 = (this.var_w_a.getHeight() - sprite.getHeight()) / 2 - this.var_short_e;
        if (bl) {
            if (sprite.getY() < n2) {
                sprite.setPosition((this.var_w_a.getWidth() - this.var_short_c) / 2 + 47, n2 + this.var_short_e);
                this.var_boolean_e = true;
            }
            if (this.var_boolean_e) {
                sprite.setPosition((this.var_w_a.getWidth() - this.var_short_c) / 2 + 47, n2 + this.var_short_e);
            }
        }
    }

    private void e(Sprite sprite, boolean bl) {
        int n2 = (this.var_w_a.getHeight() - sprite.getHeight()) / 2 - this.var_short_e;
        if (bl) {
            if (sprite.getY() < n2) {
                sprite.setPosition((this.var_w_a.getWidth() - this.var_short_c) / 2 + 58, n2 + this.var_short_e);
                this.var_boolean_f = true;
            }
            if (this.var_boolean_f) {
                sprite.setPosition((this.var_w_a.getWidth() - this.var_short_c) / 2 + 58, n2 + this.var_short_e);
            }
        }
    }

    private void f(Sprite sprite, boolean bl) {
        int n2 = (this.var_w_a.getHeight() - sprite.getHeight()) / 2 - this.var_short_e;
        if (bl) {
            if (sprite.getY() < n2) {
                sprite.setPosition((this.var_w_a.getWidth() - this.var_short_c) / 2 + 73, n2 + this.var_short_e);
                this.var_boolean_g = true;
            }
            if (this.var_boolean_g) {
                sprite.setPosition((this.var_w_a.getWidth() - this.var_short_c) / 2 + 73, n2 + this.var_short_e);
            }
        }
    }

    private static short a(int n2, int n3) {
        if (++n2 >= n3) {
            n2 = 0;
        }
        return (short)n2;
    }

    private void d() {
        this.var_boolean_a = true;
        ab.var_int_a = 3;
        if (this.var_javax_microedition_lcdui_game_Sprite_arr_a != null) {
            this.var_javax_microedition_lcdui_game_Sprite_arr_a = null;
        }
        if (this.var_g_a != null) {
            this.var_g_a.a();
            this.var_g_a = null;
        }
        for (int i2 = 0; i2 < 6; ++i2) {
            if (this.var_javax_microedition_lcdui_game_Sprite_arr_b[i2] == null) continue;
            this.var_javax_microedition_lcdui_game_Sprite_arr_b[i2] = null;
        }
        System.gc();
    }
}

