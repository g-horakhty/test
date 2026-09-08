/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 *  javax.microedition.lcdui.game.Sprite
 */
import com.auer.title.GameMidlet;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.game.Sprite;

public final class k {
    private long var_long_a;
    private boolean var_boolean_b;
    public w var_w_a;
    public Graphics var_javax_microedition_lcdui_Graphics_a;
    private int var_int_a;
    public Sprite var_javax_microedition_lcdui_game_Sprite_a;
    public Sprite var_javax_microedition_lcdui_game_Sprite_b;
    public Sprite c;
    public Sprite d;
    public Image var_javax_microedition_lcdui_Image_a;
    public boolean var_boolean_a;
    public z var_z_a;

    public k(w w2, Graphics graphics) {
        this.var_w_a = w2;
        this.var_javax_microedition_lcdui_Graphics_a = graphics;
        w2.setFullScreenMode(true);
        graphics.setClip(0, 0, w2.getWidth(), w2.getHeight());
        this.var_long_a = 33L;
        this.b();
    }

    private void b() {
        try {
            this.var_javax_microedition_lcdui_game_Sprite_a = new Sprite(Image.createImage((String)"/title.png"));
            this.var_javax_microedition_lcdui_game_Sprite_a.setPosition((w.var_int_c - this.var_javax_microedition_lcdui_game_Sprite_a.getWidth()) / 2, (w.var_int_d - this.var_javax_microedition_lcdui_game_Sprite_a.getHeight()) / 2);
            this.var_javax_microedition_lcdui_Image_a = Image.createImage((String)"/menu_1.png");
            this.var_javax_microedition_lcdui_game_Sprite_b = new Sprite(this.var_javax_microedition_lcdui_Image_a, this.var_javax_microedition_lcdui_Image_a.getWidth() / 2, this.var_javax_microedition_lcdui_Image_a.getHeight() / 5);
            this.var_javax_microedition_lcdui_Image_a = Image.createImage((String)"/menu_2.png");
            this.c = new Sprite(this.var_javax_microedition_lcdui_Image_a, this.var_javax_microedition_lcdui_Image_a.getWidth() / 2, this.var_javax_microedition_lcdui_Image_a.getHeight() / 4);
            this.d = new Sprite(Image.createImage((String)"/point.png"));
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
        }
        w.var_g_a = new g("/sounds/title.mid", "audio/midi");
        w.var_g_a.var_boolean_a = true;
        w.var_g_a.b(w.int_a());
        w.var_g_a.a(1);
        this.var_boolean_a = true;
    }

    public final void a() {
        while (!this.var_boolean_b) {
            this.c();
            this.a(this.var_javax_microedition_lcdui_Graphics_a);
            try {
                Thread.sleep(this.var_long_a);
            }
            catch (InterruptedException interruptedException) {}
        }
    }

    /*
     * Unable to fully structure code
     */
    private void c() {
        block17: {
            block16: {
                if (!this.var_boolean_a) break block16;
                switch (this.var_w_a.getKeyStates()) {
                    case -1: 
                    case 50: {
                        --this.var_int_a;
                        if (this.var_int_a >= 0) ** GOTO lbl43
                        this.var_int_a = 4;
                        break block17;
                    }
                    case -2: 
                    case 56: {
                        ++this.var_int_a;
                        if (this.var_int_a <= 4) ** GOTO lbl43
                        this.var_int_a = 0;
                        break block17;
                    }
                    case -3: {
                        break block17;
                    }
                    case -4: {
                        break block17;
                    }
                    case -5: 
                    case 53: {
                        if (this.var_int_a != 0) ** GOTO lbl26
                        this.var_boolean_b = true;
                        w.var_g_a.a();
                        w.var_g_a = null;
                        System.gc();
                        ab.var_int_a = 4;
                        break block17;
lbl26:
                        // 1 sources

                        if (this.var_int_a != 1) ** GOTO lbl34
                        if (!y.boolean_a("save")) ** GOTO lbl43
                        this.var_boolean_b = true;
                        w.var_g_a.a();
                        System.gc();
                        ab.var_int_a = 5;
                        break block17;
lbl34:
                        // 1 sources

                        if (this.var_int_a != 2) ** GOTO lbl38
                        this.var_boolean_a = false;
                        this.var_int_a = 0;
                        break block17;
lbl38:
                        // 1 sources

                        if (this.var_int_a != 3) ** GOTO lbl41
                        this.d();
                        break block17;
lbl41:
                        // 1 sources

                        if (this.var_int_a == 4) {
                            k.e();
                        }
                    }
lbl43:
                    // 7 sources

                    default: {
                        return;
                    }
                }
            }
            switch (this.var_w_a.getKeyStates()) {
                case -1: 
                case 50: {
                    --this.var_int_a;
                    if (this.var_int_a >= 0) break;
                    v0 = this;
                    v1 = 4;
                    ** GOTO lbl72
                }
                case -2: 
                case 56: {
                    ++this.var_int_a;
                    if (this.var_int_a <= 3) break;
                    ** GOTO lbl70
                }
                case -5: 
                case 53: {
                    if (this.var_int_a == 0) {
                        var1_1 = new aa(this.var_w_a, this.var_javax_microedition_lcdui_Graphics_a, w.var_g_a);
                        var1_1.a();
                        return;
                    }
                    if (this.var_int_a == 1) {
                        new p(this).a();
                        return;
                    }
                    if (this.var_int_a == 2) {
                        new al(this.var_w_a, this.var_javax_microedition_lcdui_Graphics_a).a();
                        return;
                    }
                    if (this.var_int_a != 3) break;
                    this.var_boolean_a = true;
lbl70:
                    // 2 sources

                    v0 = this;
                    v1 = 0;
lbl72:
                    // 2 sources

                    v0.var_int_a = v1;
                }
            }
        }
    }

    private void d() {
        try {
            GameMidlet.var_com_auer_title_GameMidlet_a.platformRequest("http://game.e7play.com/");
            k.e();
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return;
        }
    }

    private static void e() {
        w.var_g_a.a();
        GameMidlet.var_com_auer_title_GameMidlet_a.a();
        System.gc();
    }

    private void a(Graphics graphics) {
        graphics.setColor(0, 0, 0);
        graphics.fillRect(0, 0, this.var_w_a.getWidth(), this.var_w_a.getHeight());
        this.var_javax_microedition_lcdui_game_Sprite_a.paint(graphics);
        if (this.var_boolean_a) {
            byte by = 0;
            byte by2 = by;
            while (by2 < 5) {
                int n2;
                Sprite sprite;
                if (by == this.var_int_a) {
                    sprite = this.var_javax_microedition_lcdui_game_Sprite_b;
                    n2 = by * 2 + 1;
                } else {
                    sprite = this.var_javax_microedition_lcdui_game_Sprite_b;
                    n2 = by * 2;
                }
                sprite.setFrame(n2);
                this.var_javax_microedition_lcdui_game_Sprite_b.setPosition(this.var_javax_microedition_lcdui_game_Sprite_a.getX() + (w.var_int_c - this.var_javax_microedition_lcdui_game_Sprite_b.getWidth()) / 2, this.var_javax_microedition_lcdui_game_Sprite_a.getY() + 148 + by * this.var_javax_microedition_lcdui_game_Sprite_b.getHeight());
                this.var_javax_microedition_lcdui_game_Sprite_b.paint(graphics);
                if (by == this.var_int_a) {
                    this.d.setPosition(this.var_javax_microedition_lcdui_game_Sprite_b.getX() - 17, this.var_javax_microedition_lcdui_game_Sprite_b.getY() - 4);
                }
                by2 = (byte)(by + 1);
            }
        } else {
            byte by = 0;
            byte by3 = by;
            while (by3 < 4) {
                int n3;
                Sprite sprite;
                if (by == this.var_int_a) {
                    sprite = this.c;
                    n3 = by * 2 + 1;
                } else {
                    sprite = this.c;
                    n3 = by * 2;
                }
                sprite.setFrame(n3);
                this.c.setPosition(this.var_javax_microedition_lcdui_game_Sprite_a.getX() + (w.var_int_c - this.var_javax_microedition_lcdui_game_Sprite_b.getWidth()) / 2, this.var_javax_microedition_lcdui_game_Sprite_a.getY() + 148 + by * this.c.getHeight());
                this.c.paint(graphics);
                if (by == this.var_int_a) {
                    this.d.setPosition(this.c.getX() - 17, this.c.getY() - 4);
                }
                by3 = (byte)(by + 1);
            }
        }
        this.d.paint(graphics);
        this.var_w_a.flushGraphics();
    }

    public static long a(k k2) {
        return k2.var_long_a;
    }
}

