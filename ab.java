/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

public final class ab
implements Runnable {
    private long var_long_a;
    private boolean var_boolean_a;
    public w var_w_a;
    public Graphics var_javax_microedition_lcdui_Graphics_a;
    public static int var_int_a;

    public ab(w w2, Graphics graphics) {
        this.var_w_a = w2;
        this.var_javax_microedition_lcdui_Graphics_a = graphics;
        if (w2.var_boolean_a) {
            var_int_a = 4;
            w.var_int_b = 2;
        }
    }

    public final void a() {
        this.var_boolean_a = false;
        Thread thread = new Thread(this);
        thread.start();
    }

    public final void run() {
        while (!this.var_boolean_a) {
            this.b();
            try {
                Thread.sleep(this.var_long_a);
            }
            catch (InterruptedException interruptedException) {}
        }
    }

    private void b() {
        switch (var_int_a) {
            case 0: {
                af af2 = new af(this.var_w_a, this.var_javax_microedition_lcdui_Graphics_a);
                af2.a();
                break;
            }
            case 1: {
                v v2 = new v(this.var_w_a, this.var_javax_microedition_lcdui_Graphics_a);
                v2.a();
                this.var_w_a.void_a();
                break;
            }
            case 3: {
                k k2 = new k(this.var_w_a, this.var_javax_microedition_lcdui_Graphics_a);
                k2.a();
                this.var_w_a.void_a();
                break;
            }
            case 4: {
                w.var_byte_a = (byte)7;
                aj aj2 = new aj(this.var_w_a, this.var_javax_microedition_lcdui_Graphics_a);
                try {
                    aj2.void_a();
                }
                catch (Exception exception) {
                    Exception exception2 = exception;
                    exception.printStackTrace();
                }
                break;
            }
            case 5: {
                aj aj3 = new aj(this.var_w_a, this.var_javax_microedition_lcdui_Graphics_a, true);
                try {
                    aj3.void_a();
                    break;
                }
                catch (Exception exception) {
                    Exception exception3 = exception;
                    exception.printStackTrace();
                }
            }
        }
        System.gc();
    }
}

