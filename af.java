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

public final class af {
    private long var_long_a;
    private boolean var_boolean_a;
    public w var_w_a;
    public Graphics var_javax_microedition_lcdui_Graphics_a;
    private Sprite var_javax_microedition_lcdui_game_Sprite_a;
    private Sprite var_javax_microedition_lcdui_game_Sprite_b;
    private short var_short_a;
    private short var_short_b;

    public af(w w2, Graphics graphics) {
        this.var_w_a = w2;
        this.var_javax_microedition_lcdui_Graphics_a = graphics;
        w2.setFullScreenMode(true);
        this.var_long_a = 33L;
        this.b();
        this.c();
    }

    private void b() {
        try {
            this.var_javax_microedition_lcdui_game_Sprite_a = new Sprite(Image.createImage((String)"/images/musicbg.png"));
            Image image = Image.createImage((String)"/images/onoff.png");
            this.var_javax_microedition_lcdui_game_Sprite_b = new Sprite(image, image.getWidth(), image.getHeight() / 2);
            System.gc();
            return;
        }
        catch (IOException iOException) {
            System.err.println("Failed loading images!");
            return;
        }
    }

    private void c() {
        this.var_javax_microedition_lcdui_game_Sprite_a.setPosition((this.var_w_a.getWidth() - this.var_javax_microedition_lcdui_game_Sprite_a.getWidth()) / 2, (this.var_w_a.getHeight() - this.var_javax_microedition_lcdui_game_Sprite_a.getHeight()) / 2);
        this.var_javax_microedition_lcdui_game_Sprite_b.setFrame(0);
        this.var_javax_microedition_lcdui_game_Sprite_b.setPosition(this.var_javax_microedition_lcdui_game_Sprite_a.getX() + 22, this.var_javax_microedition_lcdui_game_Sprite_a.getY() + 50);
        this.var_short_a = 0;
    }

    public final void a() {
        while (!this.var_boolean_a) {
            this.d();
            this.f();
            this.a(this.var_javax_microedition_lcdui_Graphics_a);
            try {
                Thread.sleep(this.var_long_a);
            }
            catch (InterruptedException interruptedException) {}
        }
    }

    private void d() {
        switch (this.var_w_a.getKeyStates()) {
            case -1: 
            case 50: {
                this.var_short_a = (short)(this.var_short_a - 1);
                if (this.var_short_a >= 0) break;
                this.var_short_a = 1;
                return;
            }
            case -2: 
            case 56: {
                this.var_short_a = (short)(this.var_short_a + 1);
                if (this.var_short_a <= 1) break;
                this.var_short_a = 0;
                return;
            }
            case -3: {
                return;
            }
            case -4: {
                return;
            }
            case -5: 
            case 53: {
                this.e();
            }
        }
    }

    private void e() {
        if (this.var_short_a == 0) {
            this.var_short_b = (short)2;
            w.a(this.var_short_b * 20);
        } else if (this.var_short_a == 1) {
            this.var_short_b = 0;
            w.a(this.var_short_b * 20);
        }
        this.g();
    }

    private void f() {
        block4: {
            int n2;
            int n3;
            int n4;
            Sprite sprite;
            block3: {
                block2: {
                    if (this.var_short_a != 0) break block2;
                    this.var_javax_microedition_lcdui_game_Sprite_b.setFrame(0);
                    sprite = this.var_javax_microedition_lcdui_game_Sprite_b;
                    n4 = this.var_javax_microedition_lcdui_game_Sprite_a.getX() + 22;
                    n3 = this.var_javax_microedition_lcdui_game_Sprite_a.getY();
                    n2 = 50;
                    break block3;
                }
                if (this.var_short_a != 1) break block4;
                this.var_javax_microedition_lcdui_game_Sprite_b.setFrame(1);
                sprite = this.var_javax_microedition_lcdui_game_Sprite_b;
                n4 = this.var_javax_microedition_lcdui_game_Sprite_a.getX() + 22;
                n3 = this.var_javax_microedition_lcdui_game_Sprite_a.getY();
                n2 = 64;
            }
            sprite.setPosition(n4, n3 + n2);
        }
    }

    private void a(Graphics graphics) {
        graphics.setColor(255, 255, 255);
        graphics.fillRect(0, 0, this.var_w_a.getWidth(), this.var_w_a.getHeight());
        this.var_javax_microedition_lcdui_game_Sprite_a.paint(graphics);
        this.var_javax_microedition_lcdui_game_Sprite_b.paint(graphics);
        this.var_w_a.flushGraphics();
    }

    private void g() {
        this.var_boolean_a = true;
        ab.var_int_a = 1;
        System.gc();
    }
}

