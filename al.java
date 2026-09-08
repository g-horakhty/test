/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import com.auer.title.GameMidlet;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class al {
    private long var_long_a;
    private boolean var_boolean_a;
    public w var_w_a;
    public Graphics var_javax_microedition_lcdui_Graphics_a;
    private short var_short_a;
    private Image var_javax_microedition_lcdui_Image_a;

    public al(w w2, Graphics graphics) {
        this.var_w_a = w2;
        this.var_javax_microedition_lcdui_Graphics_a = graphics;
        w2.setFullScreenMode(true);
        this.var_long_a = 33L;
        this.b();
        this.var_short_a = (short)(w2.getHeight() / 2);
    }

    private void b() {
        this.var_javax_microedition_lcdui_Image_a = Image.createImage((int)this.var_w_a.getWidth(), (int)this.var_w_a.getHeight());
        Graphics graphics = this.var_javax_microedition_lcdui_Image_a.getGraphics();
        for (int i2 = 0; i2 <= this.var_w_a.getHeight() / 10; ++i2) {
            graphics.setColor(this.var_w_a.var_int_e - i2 * (this.var_w_a.var_int_e - this.var_w_a.var_int_h) / (this.var_w_a.getHeight() / 10), this.var_w_a.var_int_f - i2 * (this.var_w_a.var_int_f - this.var_w_a.var_int_i) / (this.var_w_a.getHeight() / 10), this.var_w_a.var_int_g - i2 * (this.var_w_a.var_int_g - this.var_w_a.j) / (this.var_w_a.getHeight() / 10));
            graphics.fillRect(0, i2 * 10, this.var_w_a.getWidth(), 10);
        }
    }

    public final void a() {
        while (!this.var_boolean_a) {
            this.c();
            this.d();
            this.a(this.var_javax_microedition_lcdui_Graphics_a);
            try {
                Thread.sleep(this.var_long_a);
            }
            catch (InterruptedException interruptedException) {}
        }
    }

    private void c() {
        if (this.var_w_a.getHeight() + (this.var_w_a.var_java_lang_String_arr_a.length + this.var_w_a.var_java_lang_String_arr_b.length) * this.var_javax_microedition_lcdui_Graphics_a.getFont().getHeight() - this.var_short_a <= 0) {
            this.var_boolean_a = true;
        }
    }

    private void d() {
        switch (this.var_w_a.getKeyStates()) {
            case -7: 
            case -6: 
            case -5: 
            case -4: 
            case -3: 
            case -2: 
            case -1: 
            case 35: 
            case 42: 
            case 48: 
            case 49: 
            case 50: 
            case 51: 
            case 52: 
            case 53: 
            case 54: 
            case 55: 
            case 56: 
            case 57: {
                this.var_boolean_a = true;
            }
        }
    }

    private void a(Graphics graphics) {
        int n2;
        graphics.setColor(0, 0, 0);
        graphics.fillRect(0, 0, this.var_w_a.getWidth(), this.var_w_a.getHeight());
        graphics.drawImage(this.var_javax_microedition_lcdui_Image_a, 0, 0, 20);
        graphics.setColor(255, 255, 255);
        for (n2 = 0; n2 < 2; ++n2) {
            if (this.var_w_a.getHeight() + n2 * graphics.getFont().getHeight() - this.var_short_a <= -10 || this.var_w_a.getHeight() + n2 * graphics.getFont().getHeight() - this.var_short_a >= this.var_w_a.getHeight()) continue;
            graphics.drawString(this.var_w_a.var_java_lang_String_arr_a[n2], this.var_w_a.getWidth() / 2, this.var_w_a.getHeight() + n2 * graphics.getFont().getHeight() - this.var_short_a, 17);
        }
        if (this.var_w_a.getHeight() + 2 * graphics.getFont().getHeight() - this.var_short_a > -10 && this.var_w_a.getHeight() + 2 * graphics.getFont().getHeight() - this.var_short_a < this.var_w_a.getHeight()) {
            graphics.drawString("\u7248\u672c\uff1a" + GameMidlet.var_com_auer_title_GameMidlet_a.getAppProperty("MIDlet-Version"), this.var_w_a.getWidth() / 2, this.var_w_a.getHeight() + 2 * graphics.getFont().getHeight() - this.var_short_a, 17);
        }
        for (n2 = 2; n2 < this.var_w_a.var_java_lang_String_arr_a.length; ++n2) {
            if (this.var_w_a.getHeight() + n2 * graphics.getFont().getHeight() - this.var_short_a <= -10 || this.var_w_a.getHeight() + n2 * graphics.getFont().getHeight() - this.var_short_a >= this.var_w_a.getHeight()) continue;
            graphics.drawString(this.var_w_a.var_java_lang_String_arr_a[n2], this.var_w_a.getWidth() / 2, this.var_w_a.getHeight() + (n2 + 1) * graphics.getFont().getHeight() - this.var_short_a, 17);
        }
        for (n2 = 0; n2 < this.var_w_a.var_java_lang_String_arr_b.length; ++n2) {
            if (this.var_w_a.getHeight() + (this.var_w_a.var_java_lang_String_arr_a.length + n2) * graphics.getFont().getHeight() - this.var_short_a <= -10 || this.var_w_a.getHeight() + (this.var_w_a.var_java_lang_String_arr_a.length + n2) * graphics.getFont().getHeight() - this.var_short_a >= this.var_w_a.getHeight()) continue;
            graphics.drawString(this.var_w_a.var_java_lang_String_arr_b[n2], this.var_w_a.getWidth() / 2, this.var_w_a.getHeight() + (this.var_w_a.var_java_lang_String_arr_a.length + n2 + 2) * graphics.getFont().getHeight() - this.var_short_a, 17);
        }
        this.var_short_a = (short)(this.var_short_a + 4);
        this.var_w_a.flushGraphics();
    }
}

