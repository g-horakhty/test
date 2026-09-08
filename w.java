/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Display
 *  javax.microedition.lcdui.Displayable
 *  javax.microedition.lcdui.Graphics
 */
import com.hellomoto.fullscreen.game.GAMECANVAS;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;

public final class w
extends GAMECANVAS {
    public static Display var_javax_microedition_lcdui_Display_a;
    public Graphics var_javax_microedition_lcdui_Graphics_a;
    public int var_int_a;
    public static int var_int_b;
    public boolean var_boolean_a;
    private int l;
    public static int var_int_c;
    public static int var_int_d;
    public String[] var_java_lang_String_arr_a;
    public String[] var_java_lang_String_arr_b;
    public int var_int_e;
    public int var_int_f;
    public int var_int_g;
    public int var_int_h;
    public int var_int_i;
    public int j;
    public static byte var_byte_a;
    public static byte var_byte_b;
    public static byte var_byte_c;
    public static byte var_byte_d;
    public static g var_g_a;
    public static final short[] var_short_arr_a;
    public static final byte[] var_byte_arr_a;
    public static final byte[] var_byte_arr_b;
    public static final short[] var_short_arr_b;
    public static final short[] var_short_arr_c;
    public static final byte[] var_byte_arr_c;
    public static final byte[] var_byte_arr_d;
    public static final int[] var_int_arr_a;
    public static final int[] var_int_arr_b;
    public static final byte[] var_byte_arr_e;
    public static final byte[] var_byte_arr_f;
    public static final byte[] var_byte_arr_g;
    public static final byte[] var_byte_arr_h;
    public static final byte[] var_byte_arr_i;
    public static final int[] var_int_arr_c;
    public static y var_y_a;
    public boolean var_boolean_b;
    public int k;

    public w(Display display) {
        block5: {
            int n2;
            block3: {
                block4: {
                    block2: {
                        super(false);
                        this.var_java_lang_String_arr_a = new String[]{"DEFAULT"};
                        this.var_java_lang_String_arr_b = new String[]{"DEFAULT"};
                        this.var_int_e = 162;
                        this.var_int_f = 71;
                        this.var_int_g = 16;
                        this.var_int_h = 29;
                        this.var_int_i = 14;
                        this.j = 6;
                        this.var_boolean_b = false;
                        this.k = 0;
                        var_javax_microedition_lcdui_Display_a = display;
                        this.b();
                        var_javax_microedition_lcdui_Display_a.setCurrent((Displayable)this);
                        this.var_javax_microedition_lcdui_Graphics_a = this.getGraphics();
                        this.setFullScreenMode(true);
                        var_int_c = this.getWidth();
                        var_int_d = this.getHeight();
                        if (var_int_c != 240) break block2;
                        var_byte_b = (byte)4;
                        n2 = 4;
                        break block3;
                    }
                    if (var_int_c != 176) break block4;
                    var_byte_b = (byte)4;
                    n2 = 4;
                    break block3;
                }
                if (var_int_c != 128) break block5;
                var_byte_b = (byte)2;
                n2 = 3;
            }
            var_byte_c = (byte)n2;
        }
        var_byte_d = (byte)(var_byte_b * var_byte_c);
        var_y_a = new y();
        ab ab2 = new ab(this, this.var_javax_microedition_lcdui_Graphics_a);
        ab2.a();
    }

    private void b() {
        InputStream inputStream = ((Object)((Object)this)).getClass().getResourceAsStream("/set");
        if (inputStream == null) {
            return;
        }
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        try {
            int n2;
            this.var_boolean_a = dataInputStream.readBoolean();
            this.l = dataInputStream.readInt();
            this.l = TrialOnLaunches.a;
            var_int_c = dataInputStream.readInt();
            var_int_d = dataInputStream.readInt();
            if (this.var_boolean_b) {
                var_int_d -= 10;
            }
            int n3 = dataInputStream.readInt();
            this.var_java_lang_String_arr_a = new String[n3];
            for (n2 = 0; n2 < n3; ++n2) {
                this.var_java_lang_String_arr_a[n2] = dataInputStream.readUTF();
            }
            n3 = dataInputStream.readInt();
            this.var_java_lang_String_arr_b = new String[n3];
            for (n2 = 0; n2 < n3; ++n2) {
                this.var_java_lang_String_arr_b[n2] = dataInputStream.readUTF();
            }
            this.var_int_e = dataInputStream.readInt();
            this.var_int_f = dataInputStream.readInt();
            this.var_int_g = dataInputStream.readInt();
            this.var_int_h = dataInputStream.readInt();
            this.var_int_i = dataInputStream.readInt();
            this.j = dataInputStream.readInt();
            inputStream.close();
            dataInputStream.close();
            return;
        }
        catch (IOException iOException) {
            System.err.println("read screen size error!!");
            iOException.printStackTrace();
            return;
        }
    }

    public final void void_a() {
        this.var_int_a = 0;
    }

    private boolean boolean_a() {
        if (this.k++ > 1) {
            if (this.var_int_a != 0) {
                this.k = 0;
            }
            return true;
        }
        return false;
    }

    public final int getKeyStates() {
        int n2 = this.var_int_a;
        this.var_int_a = 0;
        if (this.boolean_a()) {
            if (this.l == 0) {
                switch (n2) {
                    case -1: {
                        return -1;
                    }
                    case -2: {
                        return -2;
                    }
                    case -3: {
                        return -3;
                    }
                    case -4: {
                        return -4;
                    }
                    case -5: {
                        return -5;
                    }
                    case -6: {
                        return -6;
                    }
                    case -7: {
                        return -7;
                    }
                }
            } else if (this.l == 1) {
                switch (n2) {
                    case -1: {
                        return -1;
                    }
                    case -6: {
                        return -2;
                    }
                    case -2: {
                        return -3;
                    }
                    case -5: {
                        return -4;
                    }
                    case -20: {
                        return -5;
                    }
                    case -21: {
                        return -6;
                    }
                    case -22: {
                        return -7;
                    }
                }
            } else if (this.l == 2) {
                switch (n2) {
                    case -1: {
                        return -1;
                    }
                    case -2: {
                        return -2;
                    }
                    case -3: {
                        return -3;
                    }
                    case -4: {
                        return -4;
                    }
                    case -5: {
                        return -5;
                    }
                    case -21: {
                        return -6;
                    }
                    case -22: {
                        return -7;
                    }
                }
            } else if (this.l == 3) {
                switch (n2) {
                    case -1: {
                        return -1;
                    }
                    case -2: {
                        return -2;
                    }
                    case -3: {
                        return -3;
                    }
                    case -4: {
                        return -4;
                    }
                    case -5: {
                        return -5;
                    }
                    case -7: {
                        return -6;
                    }
                    case -6: {
                        return -7;
                    }
                }
            } else if (this.l == 4) {
                switch (n2) {
                    case -1: {
                        return -1;
                    }
                    case -2: {
                        return -2;
                    }
                    case -3: {
                        return -3;
                    }
                    case -4: {
                        return -4;
                    }
                    case -5: {
                        return -5;
                    }
                    case -10: {
                        return -6;
                    }
                    case -11: {
                        return -7;
                    }
                }
            }
            switch (n2) {
                case 48: {
                    return 48;
                }
                case 49: {
                    return 49;
                }
                case 50: {
                    return 50;
                }
                case 51: {
                    return 51;
                }
                case 52: {
                    return 52;
                }
                case 53: {
                    return 53;
                }
                case 54: {
                    return 54;
                }
                case 55: {
                    return 55;
                }
                case 56: {
                    return 56;
                }
                case 57: {
                    return 57;
                }
                case 35: {
                    return 35;
                }
                case 42: {
                    return 42;
                }
            }
        }
        return n2;
    }

    public final void KEYPRESSED(int n2) {
        this.var_int_a = n2;
    }

    public final void KEYREPEATED(int n2) {
        this.var_int_a = n2;
    }

    public static boolean a(int n2) {
        if (n2 <= 100 && n2 >= 0) {
            var_int_b = n2;
            return true;
        }
        return false;
    }

    public static int int_a() {
        return var_int_b;
    }

    static {
        var_int_b = 100;
        var_byte_a = (byte)7;
        var_short_arr_a = new short[]{120, 240, 360, 300, 360, 360, 360, 420, 540, 540, 840, 900, 480, 480, 540, 300};
        var_byte_arr_a = new byte[]{1, 1, 1, 2, 2, 2, 3, 3, 3, 3, 3, 4, 3, 3, 4, 1};
        var_byte_arr_b = new byte[]{0, 2, 4, 7, 10, 13, 17, 21, 25, 29, 33, 38, 42, 45, 49, 53};
        var_short_arr_b = new short[]{200, 500, 800, 950, 1100, 1250, 1550, 1800, 1975, 2150, 3350, 4125, 4600, 5200, 6850, 300};
        var_short_arr_c = new short[]{13, 28, 34, 68, 70, 86, 126, 165, 165, 168, 240, 344, 291, 303, 676, 38};
        var_byte_arr_c = new byte[]{36, 42, 54, 35, 39, 36, 31, 28, 30, 33, 34, 30, 40, 48, 46, 47};
        var_byte_arr_d = new byte[]{40, 40, 40, 45, 45, 45, 50, 50, 51, 52, 54, 55, 50, 70, 60, 75};
        var_int_arr_a = new int[]{100000, 80000, 130000, 100000, 150000};
        var_int_arr_b = new int[]{80, 200, 180000, 500};
        var_byte_arr_e = new byte[]{50, 54, 1, 40};
        var_byte_arr_f = new byte[]{40, 50, 90, 40};
        var_byte_arr_g = new byte[]{40, 40, 120, 50};
        var_byte_arr_h = new byte[]{10, 15, 0, 10};
        var_byte_arr_i = new byte[]{0, 10, 20, 30, 40, 0};
        var_int_arr_c = new int[]{4000, 40, 60, 60, 120, 500};
    }
}

