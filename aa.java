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

public final class aa {
    private long var_long_a;
    private boolean var_boolean_a;
    public w var_w_a;
    public Graphics var_javax_microedition_lcdui_Graphics_a;
    public g var_g_a;
    private Sprite var_javax_microedition_lcdui_game_Sprite_a;
    private Sprite b;
    private short var_short_a;

    public aa(w w2, Graphics graphics, g g2) {
        this.var_w_a = w2;
        this.var_javax_microedition_lcdui_Graphics_a = graphics;
        this.var_g_a = g2;
        w2.setFullScreenMode(true);
        this.var_long_a = 33L;
        this.b();
        this.c();
    }

    private void b() {
        try {
            this.var_javax_microedition_lcdui_game_Sprite_a = new Sprite(Image.createImage((String)"/images/volume.png"));
            Image image = Image.createImage((String)"/images/volume_bar.png");
            this.b = new Sprite(image, image.getWidth() / 6, image.getHeight());
            System.gc();
            return;
        }
        catch (IOException iOException) {
            System.err.println("Failed loading images!");
            return;
        }
    }

    private void c() {
        this.var_short_a = (short)(w.int_a() / 20);
        if (this.var_short_a > 5 || this.var_short_a < 0) {
            this.var_short_a = (short)2;
        }
        this.var_javax_microedition_lcdui_game_Sprite_a.setPosition((this.var_w_a.getWidth() - this.var_javax_microedition_lcdui_game_Sprite_a.getWidth()) / 2, (this.var_w_a.getHeight() - this.var_javax_microedition_lcdui_game_Sprite_a.getHeight()) / 2);
    }

    public final void a() {
        while (!this.var_boolean_a) {
            this.d();
            this.a(this.var_javax_microedition_lcdui_Graphics_a);
            try {
                Thread.sleep(this.var_long_a);
            }
            catch (InterruptedException interruptedException) {}
        }
    }

    private void d() {
        switch (this.var_w_a.getKeyStates()) {
            case -1: {
                return;
            }
            case -2: {
                return;
            }
            case -3: 
            case 52: {
                this.var_short_a = (short)(this.var_short_a - 1);
                if (this.var_short_a < 0) {
                    this.var_short_a = 0;
                }
                w.a(this.var_short_a * 20);
                this.var_g_a.b(w.int_a());
                return;
            }
            case -4: 
            case 54: {
                this.var_short_a = (short)(this.var_short_a + 1);
                if (this.var_short_a > 5) {
                    this.var_short_a = (short)5;
                }
                w.a(this.var_short_a * 20);
                this.var_g_a.b(w.int_a());
                return;
            }
            case -5: 
            case 53: {
                this.var_boolean_a = true;
            }
        }
    }

    private void a(Graphics graphics) {
        this.var_javax_microedition_lcdui_game_Sprite_a.paint(graphics);
        for (int i2 = 0; i2 <= this.var_short_a; ++i2) {
            this.b.setFrame(i2);
            this.b.setPosition(this.var_javax_microedition_lcdui_game_Sprite_a.getX() + 40 + i2 * this.b.getWidth(), this.var_javax_microedition_lcdui_game_Sprite_a.getY() + 2);
            this.b.paint(graphics);
        }
        this.var_w_a.flushGraphics();
    }
}

