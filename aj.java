/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 *  javax.microedition.lcdui.game.Sprite
 */
import java.util.Random;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.game.Sprite;

public final class aj {
    public w var_w_a;
    public Graphics var_javax_microedition_lcdui_Graphics_a;
    public Image var_javax_microedition_lcdui_Image_a;
    public ak var_ak_a;
    public u var_u_a;
    public t var_t_a;
    public ae var_ae_a;
    public n var_n_a;
    public boolean var_boolean_a;
    public boolean var_boolean_b;
    public Sprite var_javax_microedition_lcdui_game_Sprite_a;
    public Sprite var_javax_microedition_lcdui_game_Sprite_b;
    public Sprite var_javax_microedition_lcdui_game_Sprite_c;
    public Sprite var_javax_microedition_lcdui_game_Sprite_d;
    public Sprite var_javax_microedition_lcdui_game_Sprite_e;
    public Sprite var_javax_microedition_lcdui_game_Sprite_f;
    public Sprite var_javax_microedition_lcdui_game_Sprite_g;
    public Sprite var_javax_microedition_lcdui_game_Sprite_h;
    public Sprite var_javax_microedition_lcdui_game_Sprite_i;
    public Sprite var_javax_microedition_lcdui_game_Sprite_j;
    public Sprite var_javax_microedition_lcdui_game_Sprite_k;
    public Sprite var_javax_microedition_lcdui_game_Sprite_l;
    public Sprite var_javax_microedition_lcdui_game_Sprite_m;
    public Sprite n;
    public Sprite o;
    public Sprite p;
    public Sprite q;
    public Sprite r;
    public Sprite s;
    public Sprite t;
    public Sprite u;
    public z var_z_a;
    public Sprite v;
    public Sprite w;
    public Sprite x;
    public Sprite y;
    public Sprite z;
    public Sprite A;
    public Sprite B;
    public Sprite C;
    public Sprite D;
    public Sprite E;
    public Sprite F;
    public Sprite G;
    public Sprite H;
    public Sprite I;
    public Sprite J;
    public Vector var_java_util_Vector_a;
    public Vector var_java_util_Vector_b;
    public Vector var_java_util_Vector_c;
    public byte var_byte_a;
    public byte var_byte_b;
    public byte var_byte_c;
    public int var_int_a;
    public int var_int_b;
    public int var_int_c;
    public int var_int_d;
    public int var_int_e;
    public int var_int_f;
    public short var_short_a;
    public int var_int_g;
    public byte[] var_byte_arr_a;
    public byte[] var_byte_arr_b;
    public boolean var_boolean_c;
    public short[] var_short_arr_a;
    public long var_long_a;
    public long var_long_b;
    public byte var_byte_d;
    public boolean var_boolean_d;
    public short var_short_b;
    public short var_short_c;
    public boolean var_boolean_e;
    public boolean var_boolean_f;
    public boolean var_boolean_g;
    public boolean var_boolean_h;
    public boolean var_boolean_i;
    public boolean var_boolean_j;
    public boolean var_boolean_k;
    public byte var_byte_e;
    public boolean var_boolean_l;
    public int var_int_h;
    public byte var_byte_f;
    public byte[] var_byte_arr_c;
    public int var_int_i;
    public long var_long_c;
    public long var_long_d;
    public byte var_byte_g;
    public byte var_byte_h;
    public int var_int_j;
    public int var_int_k;
    public boolean var_boolean_m;
    public byte var_byte_i;

    public aj(w w2, Graphics graphics) {
        new Random();
        this.var_boolean_a = true;
        this.var_boolean_b = false;
        this.var_java_util_Vector_a = new Vector();
        this.var_java_util_Vector_b = new Vector();
        this.var_java_util_Vector_c = new Vector();
        this.var_byte_c = 1;
        this.var_int_e = 200;
        this.var_int_f = 0;
        this.var_short_a = 0;
        this.var_int_g = 50000;
        this.var_byte_arr_a = new byte[]{6, 22, 41, 12, 25, 35};
        this.var_byte_arr_b = new byte[]{3, 9, 3, 8, 10, 5};
        this.var_boolean_c = true;
        this.var_byte_d = (byte)35;
        this.var_byte_arr_c = new byte[2];
        this.var_byte_g = 1;
        this.var_byte_h = 1;
        this.var_w_a = w2;
        this.var_javax_microedition_lcdui_Graphics_a = graphics;
        this.b();
        byte by = 0;
        byte by2 = by;
        while (by2 < w.var_byte_a) {
            this.var_java_util_Vector_a.addElement(new ah(by, this.var_javax_microedition_lcdui_game_Sprite_d, this.var_javax_microedition_lcdui_game_Sprite_f, this.var_javax_microedition_lcdui_game_Sprite_g, this.var_javax_microedition_lcdui_game_Sprite_h));
            by2 = (byte)(by + 1);
        }
        this.g();
        if (this.var_boolean_b) {
            by = 0;
            byte by3 = by;
            while (by3 < 20) {
                byte by4;
                int n2;
                short[] sArray;
                short[] sArray2;
                Vector vector;
                if (by < 16) {
                    vector = this.var_java_util_Vector_c;
                    short[] sArray3 = new short[3];
                    sArray3[0] = 0;
                    sArray2 = sArray3;
                    sArray = sArray3;
                    n2 = 1;
                    by4 = by;
                } else {
                    vector = this.var_java_util_Vector_c;
                    short[] sArray4 = new short[3];
                    sArray4[0] = 2;
                    sArray2 = sArray4;
                    sArray = sArray4;
                    n2 = 1;
                    by4 = by - 16;
                }
                sArray2[n2] = by4;
                sArray[2] = 1;
                vector.addElement(sArray);
                by3 = (byte)(by + 1);
            }
        }
    }

    public aj(w w2, Graphics graphics, boolean bl) {
        byte by;
        new Random();
        this.var_boolean_a = true;
        this.var_boolean_b = false;
        this.var_java_util_Vector_a = new Vector();
        this.var_java_util_Vector_b = new Vector();
        this.var_java_util_Vector_c = new Vector();
        this.var_byte_c = 1;
        this.var_int_e = 200;
        this.var_int_f = 0;
        this.var_short_a = 0;
        this.var_int_g = 50000;
        this.var_byte_arr_a = new byte[]{6, 22, 41, 12, 25, 35};
        this.var_byte_arr_b = new byte[]{3, 9, 3, 8, 10, 5};
        this.var_boolean_c = true;
        this.var_byte_d = (byte)35;
        this.var_byte_arr_c = new byte[2];
        this.var_byte_g = 1;
        this.var_byte_h = 1;
        this.var_w_a = w2;
        this.var_javax_microedition_lcdui_Graphics_a = graphics;
        this.b();
        int n2 = 0;
        int[] nArray = w.var_y_a.int_arr_a();
        ++n2;
        w.var_byte_a = (byte)nArray[0];
        ++n2;
        this.var_short_a = (short)nArray[1];
        ++n2;
        this.var_int_g = nArray[2];
        ++n2;
        this.var_int_f = nArray[3];
        ++n2;
        this.var_int_e = nArray[4];
        ++n2;
        this.var_byte_h = (byte)nArray[5];
        ++n2;
        this.var_byte_g = (byte)nArray[6];
        ++n2;
        this.var_byte_i = (byte)nArray[7];
        ++n2;
        byte by2 = by = 0;
        while (by2 < w.var_byte_a) {
            boolean bl2;
            ah ah2;
            this.var_java_util_Vector_a.addElement(new ah(by, this.var_javax_microedition_lcdui_game_Sprite_d, this.var_javax_microedition_lcdui_game_Sprite_f, this.var_javax_microedition_lcdui_game_Sprite_g, this.var_javax_microedition_lcdui_game_Sprite_h));
            ((ah)this.var_java_util_Vector_a.elementAt((int)by)).var_byte_b = (byte)nArray[n2++];
            ((ah)this.var_java_util_Vector_a.elementAt((int)by)).var_byte_a = (byte)nArray[n2++];
            ((ah)this.var_java_util_Vector_a.elementAt((int)by)).var_short_b = (short)nArray[n2++];
            ((ah)this.var_java_util_Vector_a.elementAt((int)by)).var_byte_e = (byte)nArray[n2++];
            ((ah)this.var_java_util_Vector_a.elementAt((int)by)).m = (byte)nArray[n2++];
            ((ah)this.var_java_util_Vector_a.elementAt((int)by)).var_byte_f = (byte)nArray[n2++];
            if (((ah)this.var_java_util_Vector_a.elementAt((int)by)).var_byte_b != -1) {
                byte by3;
                ah ah3;
                ((ah)this.var_java_util_Vector_a.elementAt((int)by)).var_short_a = (short)(w.var_short_arr_a[((ah)this.var_java_util_Vector_a.elementAt((int)by)).var_byte_b] / 4);
                if (((ah)this.var_java_util_Vector_a.elementAt((int)by)).var_byte_a == 0) {
                    ah3 = (ah)this.var_java_util_Vector_a.elementAt(by);
                    by3 = 0;
                } else {
                    ah3 = (ah)this.var_java_util_Vector_a.elementAt(by);
                    by3 = (byte)(((ah)this.var_java_util_Vector_a.elementAt((int)by)).var_byte_b + 1);
                }
                ah3.a(by3, ((ah)this.var_java_util_Vector_a.elementAt((int)by)).var_byte_a);
                ((ah)this.var_java_util_Vector_a.elementAt((int)by)).var_boolean_a = true;
                if (((ah)this.var_java_util_Vector_a.elementAt((int)by)).var_byte_a == 4) {
                    ((ah)this.var_java_util_Vector_a.elementAt((int)by)).var_boolean_e = true;
                }
                ah2 = (ah)this.var_java_util_Vector_a.elementAt(by);
                bl2 = false;
            } else {
                ah2 = (ah)this.var_java_util_Vector_a.elementAt(by);
                bl2 = true;
            }
            ah2.var_boolean_d = bl2;
            by2 = (byte)(by + 1);
        }
        int n3 = ++n2;
        ++n2;
        if (nArray[n3] == 1) {
            this.var_ak_a = new ak();
        }
        if (nArray[n2++] == 1) {
            this.var_ae_a = new ae(this.var_byte_h, this.var_byte_g);
        }
        if (nArray[n2++] == 1) {
            this.var_t_a = new t(this.var_byte_h, this.var_byte_g);
        }
        if (nArray[n2++] == 1) {
            this.var_n_a = new n();
        }
        if (nArray[n2++] == 1) {
            this.var_u_a = new u(this.var_byte_h, this.var_byte_g);
        }
        ++n2;
        if (this.var_ak_a != null) {
            this.var_ak_a.var_byte_b = (byte)nArray[n2++];
            ++n2;
            ++n2;
            ++n2;
        }
        if (this.var_ae_a != null) {
            this.var_ae_a.var_byte_d = (byte)nArray[n2++];
            int n4 = ++n2;
            this.var_ae_a.var_short_a = (short)nArray[n4];
            int n5 = ++n2;
            ++n2;
            this.var_ae_a.e = (byte)nArray[n5];
            if (this.var_ae_a.var_short_a == 0) {
                this.var_ae_a.var_boolean_b = true;
            }
        }
        if (this.var_t_a != null) {
            this.var_t_a.d = (byte)nArray[n2++];
            int n6 = ++n2;
            this.var_t_a.var_short_a = (short)nArray[n6];
            int n7 = ++n2;
            ++n2;
            this.var_t_a.e = (byte)nArray[n7];
            if (this.var_t_a.var_short_a == 0) {
                this.var_t_a.var_boolean_a = true;
            }
        }
        if (this.var_n_a != null) {
            boolean bl3;
            n n8;
            this.var_n_a.var_byte_d = (byte)nArray[n2++];
            this.var_n_a.var_byte_e = (byte)nArray[n2++];
            this.var_n_a.var_short_a = (short)nArray[n2++];
            this.var_n_a.void_b();
            if (this.var_n_a.var_byte_e == 3) {
                n8 = this.var_n_a;
                bl3 = true;
            } else {
                n8 = this.var_n_a;
                bl3 = false;
            }
            n8.var_boolean_a = bl3;
            ++n2;
        }
        if (this.var_u_a != null) {
            this.var_u_a.d = (byte)nArray[n2++];
            int n9 = ++n2;
            this.var_u_a.var_short_a = (short)nArray[n9];
            int n10 = ++n2;
            ++n2;
            this.var_u_a.e = (byte)nArray[n10];
            if (this.var_u_a.var_short_a == 0) {
                this.var_u_a.var_boolean_a = true;
            }
        }
        short[] sArray = new short[3];
        while (true) {
            int n11 = ++n2;
            sArray[0] = (short)nArray[n11];
            int n12 = ++n2;
            sArray[1] = (short)nArray[n12];
            int n13 = ++n2;
            ++n2;
            sArray[2] = (short)nArray[n13];
            if (sArray[0] == -1 && sArray[1] == -1 && sArray[2] == -1) break;
            this.var_java_util_Vector_b.addElement(new short[]{sArray[0], sArray[1], sArray[2]});
        }
        while (true) {
            int n14 = ++n2;
            sArray[0] = (short)nArray[n14];
            int n15 = ++n2;
            sArray[1] = (short)nArray[n15];
            int n16 = ++n2;
            ++n2;
            sArray[2] = (short)nArray[n16];
            if (sArray[0] == -1 && sArray[1] == -1 && sArray[2] == -1) break;
            this.var_java_util_Vector_c.addElement(new short[]{sArray[0], sArray[1], sArray[2]});
        }
        this.g();
    }

    private void b() {
        try {
            System.gc();
            this.var_javax_microedition_lcdui_game_Sprite_a = new Sprite(Image.createImage((String)"/background.png"));
            this.var_int_a = (w.var_int_c - this.var_javax_microedition_lcdui_game_Sprite_a.getWidth()) / 2;
            this.var_int_b = (w.var_int_d - this.var_javax_microedition_lcdui_game_Sprite_a.getHeight()) / 2;
            this.var_javax_microedition_lcdui_game_Sprite_b = new Sprite(Image.createImage((String)"/house.png"));
            this.var_javax_microedition_lcdui_game_Sprite_c = new Sprite(Image.createImage((String)"/doghouse.png"));
            this.var_javax_microedition_lcdui_Image_a = Image.createImage((String)"/farmland.png");
            this.var_javax_microedition_lcdui_game_Sprite_d = new Sprite(this.var_javax_microedition_lcdui_Image_a, this.var_javax_microedition_lcdui_Image_a.getWidth() / 3, this.var_javax_microedition_lcdui_Image_a.getHeight());
            this.var_javax_microedition_lcdui_game_Sprite_e = new Sprite(Image.createImage((String)"/placard.png"));
            this.var_javax_microedition_lcdui_Image_a = Image.createImage((String)"/bug.png");
            this.var_javax_microedition_lcdui_game_Sprite_f = new Sprite(this.var_javax_microedition_lcdui_Image_a, this.var_javax_microedition_lcdui_Image_a.getWidth() / 2, this.var_javax_microedition_lcdui_Image_a.getHeight());
            this.var_javax_microedition_lcdui_game_Sprite_g = new Sprite(Image.createImage((String)"/grass.png"));
            this.var_javax_microedition_lcdui_Image_a = Image.createImage((String)"/badTip.png");
            this.var_javax_microedition_lcdui_game_Sprite_h = new Sprite(this.var_javax_microedition_lcdui_Image_a, this.var_javax_microedition_lcdui_Image_a.getWidth() / 2, this.var_javax_microedition_lcdui_Image_a.getHeight());
            this.var_javax_microedition_lcdui_game_Sprite_i = new Sprite(Image.createImage((String)"/underWhite.png"));
            this.var_javax_microedition_lcdui_game_Sprite_i.setPosition(5, 15);
            this.var_javax_microedition_lcdui_game_Sprite_j = new Sprite(Image.createImage((String)"/expWord.png"));
            this.var_javax_microedition_lcdui_game_Sprite_j.setPosition(this.var_javax_microedition_lcdui_game_Sprite_i.getX() + 3, this.var_javax_microedition_lcdui_game_Sprite_i.getY() + 5);
            this.var_javax_microedition_lcdui_game_Sprite_k = new Sprite(Image.createImage((String)"/expBarWhite.png"));
            this.var_javax_microedition_lcdui_game_Sprite_k.setPosition(this.var_javax_microedition_lcdui_game_Sprite_i.getX() + 42, this.var_javax_microedition_lcdui_game_Sprite_i.getY() + 6);
            this.var_javax_microedition_lcdui_Image_a = Image.createImage((String)"/expBarBlue.png");
            this.var_javax_microedition_lcdui_game_Sprite_l = new Sprite(this.var_javax_microedition_lcdui_Image_a, this.var_javax_microedition_lcdui_Image_a.getWidth() / 3, this.var_javax_microedition_lcdui_Image_a.getHeight());
            this.var_javax_microedition_lcdui_Image_a = Image.createImage((String)"/expNumber.png");
            this.var_javax_microedition_lcdui_game_Sprite_m = new Sprite(this.var_javax_microedition_lcdui_Image_a, this.var_javax_microedition_lcdui_Image_a.getWidth() / 11, this.var_javax_microedition_lcdui_Image_a.getHeight());
            this.n = new Sprite(Image.createImage((String)"/levelIcon.png"));
            this.n.setPosition(this.var_javax_microedition_lcdui_game_Sprite_i.getX() + 107, this.var_javax_microedition_lcdui_game_Sprite_i.getY() + 4);
            this.var_javax_microedition_lcdui_Image_a = Image.createImage((String)"/levelNumber.png");
            this.o = new Sprite(this.var_javax_microedition_lcdui_Image_a, this.var_javax_microedition_lcdui_Image_a.getWidth() / 10, this.var_javax_microedition_lcdui_Image_a.getHeight());
            this.p = new Sprite(Image.createImage((String)"/moneyIcon.png"));
            this.p.setPosition(this.var_javax_microedition_lcdui_game_Sprite_i.getX() + 6, this.var_javax_microedition_lcdui_game_Sprite_i.getY() + 23);
            this.var_javax_microedition_lcdui_Image_a = Image.createImage((String)"/moneyNumber.png");
            this.q = new Sprite(this.var_javax_microedition_lcdui_Image_a, this.var_javax_microedition_lcdui_Image_a.getWidth() / 11, this.var_javax_microedition_lcdui_Image_a.getHeight());
            this.var_javax_microedition_lcdui_Image_a = Image.createImage((String)"/addExpNum.png");
            this.r = new Sprite(this.var_javax_microedition_lcdui_Image_a, this.var_javax_microedition_lcdui_Image_a.getWidth() / 11, this.var_javax_microedition_lcdui_Image_a.getHeight());
            this.s = new Sprite(Image.createImage((String)"/dayWord.png"));
            this.s.setPosition(this.var_javax_microedition_lcdui_game_Sprite_i.getX() + 125, this.var_javax_microedition_lcdui_game_Sprite_i.getY() + 35);
            this.var_javax_microedition_lcdui_Image_a = Image.createImage((String)"/dayNum.png");
            this.t = new Sprite(this.var_javax_microedition_lcdui_Image_a, this.var_javax_microedition_lcdui_Image_a.getWidth() / 10, this.var_javax_microedition_lcdui_Image_a.getHeight());
            this.var_javax_microedition_lcdui_Image_a = Image.createImage((String)"/iconWord.png");
            this.u = new Sprite(this.var_javax_microedition_lcdui_Image_a, this.var_javax_microedition_lcdui_Image_a.getWidth() / 5, this.var_javax_microedition_lcdui_Image_a.getHeight());
            this.u.setPosition(this.var_javax_microedition_lcdui_game_Sprite_i.getX() + 125, this.var_javax_microedition_lcdui_game_Sprite_i.getY() + 5);
            this.I = new Sprite(Image.createImage((String)"/gift.png"));
            this.I.setPosition((w.var_int_c - this.I.getWidth()) / 2, (w.var_int_d - this.I.getHeight()) / 2);
            this.var_javax_microedition_lcdui_Image_a = Image.createImage((String)"/interface_market/feed.png");
            this.J = new Sprite(this.var_javax_microedition_lcdui_Image_a, this.var_javax_microedition_lcdui_Image_a.getWidth() / 3, this.var_javax_microedition_lcdui_Image_a.getHeight() / 2);
            this.J.setPosition(this.I.getX() + 46, this.I.getY() + 28);
            this.J.setFrame(5);
            this.var_javax_microedition_lcdui_Image_a = Image.createImage((String)"/back.png");
            this.v = new Sprite(this.var_javax_microedition_lcdui_Image_a, this.var_javax_microedition_lcdui_Image_a.getWidth() / 2, this.var_javax_microedition_lcdui_Image_a.getHeight());
            this.var_javax_microedition_lcdui_Image_a = null;
            System.gc();
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return;
        }
    }

    public final void void_a() {
        while (!this.var_boolean_d) {
            this.var_long_a = System.currentTimeMillis();
            this.t();
            this.c();
            this.h();
            this.d();
            this.o();
            this.var_w_a.flushGraphics();
            this.var_long_b = System.currentTimeMillis() - this.var_long_a;
            try {
                if (this.var_long_b < (long)this.var_byte_d) {
                    Thread.sleep((long)this.var_byte_d - this.var_long_b);
                    continue;
                }
                Thread.sleep(1L);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
    }

    private void c() {
        this.i();
        this.m();
        this.l();
        this.k();
        this.j();
        if (this.var_boolean_a) {
            this.I.paint(this.var_javax_microedition_lcdui_Graphics_a);
            this.J.paint(this.var_javax_microedition_lcdui_Graphics_a);
        }
    }

    private void d() {
        block34: {
            block33: {
                if (this.var_boolean_e) {
                    this.var_short_b = (short)(this.var_short_b - 8);
                    this.var_z_a.a(2);
                    this.var_boolean_e = false;
                }
                if (this.var_boolean_a) {
                    switch (this.var_w_a.getKeyStates()) {
                        case -5: {
                            this.var_byte_e = aj.a(this.var_java_util_Vector_b, new short[]{1, 5});
                            if (this.var_byte_e != -1) {
                                this.var_short_arr_a = (short[])this.var_java_util_Vector_b.elementAt(this.var_byte_e);
                                this.var_short_arr_a[2] = (short)(this.var_short_arr_a[2] + 1);
                                this.var_java_util_Vector_b.setElementAt(this.var_short_arr_a, this.var_byte_e);
                            } else {
                                this.var_java_util_Vector_b.addElement(new short[]{1, 5, 1});
                            }
                            this.var_boolean_a = false;
                            this.I = null;
                            this.J = null;
                        }
                    }
                    return;
                }
                if (this.var_z_a == null) break block33;
                if (this.var_z_a.var_byte_b != 0) break block34;
                switch (this.var_w_a.getKeyStates()) {
                    case -3: {
                        this.var_short_b = this.var_short_b - 1 < 0 ? (short)7 : (short)(this.var_short_b - 1);
                        break block34;
                    }
                    case -4: {
                        this.var_short_b = this.var_short_b + 1 > 7 ? (short)0 : (short)(this.var_short_b + 1);
                        break block34;
                    }
                    case -5: {
                        this.var_short_b = (short)(this.var_short_b + 8);
                        this.var_boolean_e = true;
                        break block34;
                    }
                    case 49: {
                        this.var_short_b = 0;
                        break block34;
                    }
                    case 50: {
                        this.var_short_b = 1;
                        break block34;
                    }
                    case 51: {
                        this.var_short_b = (short)2;
                        break block34;
                    }
                    case 52: {
                        this.var_short_b = (short)3;
                        break block34;
                    }
                    case 53: {
                        this.var_short_b = (short)4;
                        break block34;
                    }
                    case 54: {
                        this.var_short_b = (short)5;
                        break block34;
                    }
                    case 55: {
                        this.var_short_b = (short)6;
                        break block34;
                    }
                    case 56: {
                        this.var_short_b = (short)7;
                        break block34;
                    }
                    case -6: {
                        new r(this).a();
                        this.var_boolean_j = true;
                        this.var_boolean_g = false;
                        this.var_boolean_f = false;
                        System.gc();
                    }
                    default: {
                        return;
                    }
                }
            }
            switch (this.var_short_b) {
                case 0: {
                    new h(this, 0).a();
                    this.r();
                    if (!this.var_boolean_i) break;
                    new ad(this).a();
                    break;
                }
                case 1: {
                    new j(this).a();
                    if (!this.var_boolean_g) break;
                    new ag(this).a();
                    this.r();
                    if (!this.var_boolean_i) break;
                    new ad(this).a();
                    break;
                }
                case 2: {
                    new h(this, 1).a();
                    this.r();
                    if (!this.var_boolean_i) break;
                    new ad(this).a();
                    break;
                }
                case 3: {
                    new h(this, 2).a();
                    this.r();
                    if (!this.var_boolean_i) break;
                    new ad(this).a();
                    break;
                }
                case 4: {
                    new h(this, 3).a();
                    this.r();
                    if (!this.var_boolean_i) break;
                    new ad(this).a();
                    break;
                }
                case 5: {
                    new c(this).a();
                    if (!this.var_boolean_g) break;
                    if (this.var_short_b == 0) {
                        new m(this).a();
                        this.r();
                        if (!this.var_boolean_i) break;
                        new ad(this).a();
                        break;
                    }
                    if (this.var_short_b != 1) break;
                    new b(this).a();
                    this.r();
                    break;
                }
                case 6: {
                    new d(this).a();
                    if (!this.var_boolean_g) break;
                    new a(this).a();
                    this.var_boolean_g = false;
                    break;
                }
                case 7: {
                    do {
                        new l(this).a();
                        if (!this.var_boolean_g) continue;
                        new q(this).void_a();
                        this.var_boolean_g = false;
                    } while (this.var_boolean_h);
                }
            }
            this.var_short_b = 0;
            System.gc();
        }
    }

    private void e() {
        this.var_byte_f = w.var_byte_a;
        if (this.var_byte_f == 24) {
            this.var_byte_f = (byte)23;
        }
        this.var_int_h = this.var_w_a.getKeyStates();
        if (this.var_boolean_l) {
            this.var_int_h = -2;
            this.var_boolean_l = false;
        }
        switch (this.var_int_h) {
            case -1: 
            case 50: {
                if (this.var_short_b - 1 < 0) {
                    this.var_short_b = this.var_byte_f;
                    return;
                }
                this.var_short_b = (short)(this.var_short_b - 1);
                return;
            }
            case -2: 
            case 56: {
                if (this.var_short_b + 1 > this.var_byte_f) {
                    this.var_short_b = 0;
                    return;
                }
                this.var_short_b = (short)(this.var_short_b + 1);
                return;
            }
            case -3: 
            case 52: {
                if (this.var_short_b - 4 < 0) {
                    return;
                }
                this.var_short_b = (short)(this.var_short_b - 4);
                return;
            }
            case -4: 
            case 54: {
                if (this.var_short_b + 4 > this.var_byte_f) {
                    return;
                }
                this.var_short_b = (short)(this.var_short_b + 4);
                return;
            }
            case -5: {
                if (this.var_short_b == w.var_byte_a) {
                    this.var_boolean_i = true;
                    this.var_boolean_j = true;
                } else {
                    this.var_boolean_e = true;
                    this.var_boolean_f = true;
                    this.var_boolean_l = true;
                }
                if (w.var_g_a == null) break;
                w.var_g_a.a(1);
                return;
            }
            case -7: {
                byte by;
                this.var_boolean_j = true;
                byte by2 = by = 0;
                while (by2 < w.var_byte_a) {
                    ((ah)this.var_java_util_Vector_a.elementAt(by)).void_a();
                    by2 = (byte)(by + 1);
                }
                return;
            }
            case -6: {
                new r(this).a();
                this.var_boolean_j = true;
                this.var_boolean_g = false;
                this.var_boolean_f = false;
                System.gc();
            }
        }
    }

    private void f() {
        switch (this.var_w_a.getKeyStates()) {
            case -3: {
                if (this.var_short_b == 2) {
                    if (this.var_u_a != null) {
                        this.var_short_b = 1;
                        return;
                    }
                    if (this.var_ae_a != null) {
                        this.var_short_b = (short)3;
                        return;
                    }
                    if (this.var_ak_a == null) break;
                    this.var_short_b = 0;
                    return;
                }
                if (this.var_short_b == 4) {
                    if (this.var_ae_a != null) {
                        this.var_short_b = (short)3;
                        return;
                    }
                    if (this.var_u_a != null) {
                        this.var_short_b = 1;
                        return;
                    }
                    if (this.var_ak_a == null) break;
                    this.var_short_b = 0;
                    return;
                }
                if (this.var_short_b != 1 && this.var_short_b != 3 || this.var_ak_a == null) break;
                this.var_short_b = 0;
                return;
            }
            case -4: {
                if (this.var_short_b == 1) {
                    if (this.var_t_a != null) {
                        this.var_short_b = (short)2;
                        return;
                    }
                    if (this.var_n_a == null) break;
                    this.var_short_b = (short)4;
                    return;
                }
                if (this.var_short_b == 3) {
                    if (this.var_n_a != null) {
                        this.var_short_b = (short)4;
                        return;
                    }
                    if (this.var_t_a == null) break;
                    this.var_short_b = (short)2;
                    return;
                }
                if (this.var_short_b != 0) break;
                if (this.var_u_a != null) {
                    this.var_short_b = 1;
                    return;
                }
                if (this.var_t_a != null) {
                    this.var_short_b = (short)2;
                    return;
                }
                if (this.var_ae_a != null) {
                    this.var_short_b = (short)3;
                    return;
                }
                if (this.var_n_a == null) break;
                this.var_short_b = (short)4;
                return;
            }
            case -1: {
                if (this.var_short_b == 3) {
                    if (this.var_u_a != null) {
                        this.var_short_b = 1;
                        return;
                    }
                    if (this.var_t_a == null) break;
                    this.var_short_b = (short)2;
                    return;
                }
                if (this.var_short_b != 4) break;
                if (this.var_t_a != null) {
                    this.var_short_b = (short)2;
                    return;
                }
                if (this.var_u_a == null) break;
                this.var_short_b = 1;
                return;
            }
            case -2: {
                if (this.var_short_b == 1) {
                    if (this.var_ae_a != null) {
                        this.var_short_b = (short)3;
                        return;
                    }
                    if (this.var_n_a == null) break;
                    this.var_short_b = (short)4;
                    return;
                }
                if (this.var_short_b != 2) break;
                if (this.var_n_a != null) {
                    this.var_short_b = (short)4;
                    return;
                }
                if (this.var_ae_a == null) break;
                this.var_short_b = (short)3;
                return;
            }
            case -5: {
                this.var_boolean_e = true;
                this.var_boolean_f = true;
                if (w.var_g_a == null) break;
                w.var_g_a.a(1);
                return;
            }
            case -7: {
                this.var_boolean_j = true;
                this.var_boolean_g = false;
                this.var_boolean_f = false;
                this.s();
                return;
            }
            case -6: {
                new r(this).a();
                this.var_boolean_j = true;
                this.var_boolean_g = false;
                this.var_boolean_f = false;
                System.gc();
            }
        }
    }

    private void g() {
        this.var_int_c = 84 - 29 * (w.var_byte_a % 4) + 27 * (w.var_byte_a / 4) + 17;
        this.var_int_d = 142 + 14 * (w.var_byte_a % 4) + 14 * (w.var_byte_a / 4) - 3;
    }

    private void h() {
        this.v.setFrame(0);
        this.v.setPosition(0, w.var_int_d - 10 - this.v.getHeight());
        this.v.paint(this.var_javax_microedition_lcdui_Graphics_a);
        this.v.setFrame(1);
        this.v.setPosition(w.var_int_c - this.v.getWidth(), w.var_int_d - 10 - this.v.getHeight());
        this.v.paint(this.var_javax_microedition_lcdui_Graphics_a);
    }

    private void i() {
        this.var_javax_microedition_lcdui_game_Sprite_a.setPosition(this.var_int_a, this.var_int_b);
        this.var_javax_microedition_lcdui_game_Sprite_a.paint(this.var_javax_microedition_lcdui_Graphics_a);
        this.var_javax_microedition_lcdui_game_Sprite_b.setPosition(this.var_javax_microedition_lcdui_game_Sprite_a.getX() + 142, this.var_javax_microedition_lcdui_game_Sprite_a.getY() + 10);
        this.var_javax_microedition_lcdui_game_Sprite_b.paint(this.var_javax_microedition_lcdui_Graphics_a);
        this.var_javax_microedition_lcdui_game_Sprite_c.setPosition(this.var_javax_microedition_lcdui_game_Sprite_a.getX() + 78, this.var_javax_microedition_lcdui_game_Sprite_a.getY() + 62);
        this.var_javax_microedition_lcdui_game_Sprite_c.paint(this.var_javax_microedition_lcdui_Graphics_a);
    }

    private void j() {
        if (this.var_z_a == null) {
            this.var_z_a = z.a("interface001", "/newsprite/");
            this.var_z_a.a(1);
            this.var_z_a.a((w.var_int_c - this.var_z_a.int_a()) / 2, w.var_int_d - this.var_z_a.int_b() - 10);
        }
        if (this.var_z_a.var_byte_b == 0) {
            this.var_z_a.var_int_c = this.var_short_b;
        } else if (this.var_z_a.var_byte_b == 1) {
            if (this.var_z_a.boolean_a()) {
                this.var_z_a.a(0);
            }
        } else if (this.var_z_a.var_byte_b == 2 && this.var_z_a.boolean_a()) {
            this.var_z_a = null;
        }
        if (this.var_z_a != null) {
            this.var_z_a.a(this.var_javax_microedition_lcdui_Graphics_a);
        }
    }

    private void k() {
        byte by;
        int n2;
        int n3;
        byte by2;
        aj aj2;
        byte by3;
        int n4;
        int n5;
        byte by4;
        aj aj3;
        this.var_javax_microedition_lcdui_game_Sprite_i.paint(this.var_javax_microedition_lcdui_Graphics_a);
        this.var_javax_microedition_lcdui_game_Sprite_j.paint(this.var_javax_microedition_lcdui_Graphics_a);
        this.var_javax_microedition_lcdui_game_Sprite_k.paint(this.var_javax_microedition_lcdui_Graphics_a);
        this.a(this.var_int_f, this.var_int_e, (byte)12, this.var_javax_microedition_lcdui_game_Sprite_k.getX() + 1, this.var_javax_microedition_lcdui_game_Sprite_k.getY() + 1, this.var_javax_microedition_lcdui_game_Sprite_l);
        this.var_byte_arr_c[0] = this.a(this.var_int_f);
        this.a(this.var_int_f, this.var_javax_microedition_lcdui_game_Sprite_k.getX() + 2, this.var_javax_microedition_lcdui_game_Sprite_k.getY() + 3, this.var_byte_arr_c[0], this.var_javax_microedition_lcdui_game_Sprite_m);
        this.var_javax_microedition_lcdui_game_Sprite_m.setFrame(10);
        this.var_javax_microedition_lcdui_game_Sprite_m.setPosition(this.var_javax_microedition_lcdui_game_Sprite_k.getX() + 2 + (this.var_byte_arr_c[0] + 1) * this.var_javax_microedition_lcdui_game_Sprite_m.getWidth(), this.var_javax_microedition_lcdui_game_Sprite_k.getY() + 3);
        this.var_javax_microedition_lcdui_game_Sprite_m.paint(this.var_javax_microedition_lcdui_Graphics_a);
        this.var_byte_arr_c[1] = this.a(this.var_int_e);
        this.a(this.var_int_e, this.var_javax_microedition_lcdui_game_Sprite_k.getX() + 2 + (this.var_byte_arr_c[0] + 2) * this.var_javax_microedition_lcdui_game_Sprite_m.getWidth(), this.var_javax_microedition_lcdui_game_Sprite_k.getY() + 3, this.var_byte_arr_c[1], this.var_javax_microedition_lcdui_game_Sprite_m);
        this.n.paint(this.var_javax_microedition_lcdui_Graphics_a);
        this.var_byte_arr_c[0] = this.a(this.var_short_a);
        this.a(this.var_short_a, this.var_byte_arr_c[0], this.n, this.o);
        this.p.paint(this.var_javax_microedition_lcdui_Graphics_a);
        this.var_byte_arr_c[0] = this.b(this.var_int_g);
        this.b(this.var_int_g, this.p.getX() + 22, this.p.getY() + 2, this.var_byte_arr_c[0], this.q);
        this.s.paint(this.var_javax_microedition_lcdui_Graphics_a);
        if (this.var_byte_h / 10 != 0) {
            aj3 = this;
            by4 = this.var_byte_h;
            n5 = this.s.getX() + 2;
            n4 = this.s.getY() + 2;
            by3 = 1;
        } else {
            aj3 = this;
            by4 = this.var_byte_h;
            n5 = this.s.getX() + 2;
            n4 = this.s.getY() + 2;
            by3 = 0;
        }
        aj3.a(by4, n5, n4, by3, this.t);
        if (this.var_byte_g / 10 != 0) {
            aj2 = this;
            by2 = this.var_byte_g;
            n3 = this.s.getX() + 19;
            n2 = this.s.getY() + 2;
            by = 1;
        } else {
            aj2 = this;
            by2 = this.var_byte_g;
            n3 = this.s.getX() + 19;
            n2 = this.s.getY() + 2;
            by = 0;
        }
        aj2.a(by2, n3, n2, by, this.t);
        this.u.setFrame((int)this.var_byte_i);
        this.u.setPosition(this.var_javax_microedition_lcdui_game_Sprite_i.getX() + 125, this.var_javax_microedition_lcdui_game_Sprite_i.getY() + 5);
        this.u.paint(this.var_javax_microedition_lcdui_Graphics_a);
    }

    private void l() {
        byte by;
        byte by2 = by = 0;
        while (by2 < w.var_byte_a) {
            ((ah)this.var_java_util_Vector_a.elementAt(by)).a(this.var_byte_arr_a, this.var_byte_arr_b, this.var_javax_microedition_lcdui_Graphics_a, this.var_int_a, this.var_int_b);
            by2 = (byte)(by + 1);
        }
        if (w.var_byte_a < 24) {
            this.var_javax_microedition_lcdui_game_Sprite_e.setPosition(this.var_int_a + this.var_int_c, this.var_int_b + this.var_int_d);
            this.var_javax_microedition_lcdui_game_Sprite_e.paint(this.var_javax_microedition_lcdui_Graphics_a);
        }
    }

    private void m() {
        if (this.var_ak_a != null) {
            this.var_ak_a.a(this.var_javax_microedition_lcdui_Graphics_a, this.var_int_a, this.var_int_b);
        }
        if (this.var_ae_a != null) {
            this.var_ae_a.a(this.var_javax_microedition_lcdui_Graphics_a, this.var_int_a, this.var_int_b);
        }
        if (this.var_t_a != null) {
            this.var_t_a.a(this.var_javax_microedition_lcdui_Graphics_a, this.var_int_a, this.var_int_b);
        }
        if (this.var_n_a != null) {
            this.var_n_a.a(this.var_javax_microedition_lcdui_Graphics_a, this.var_int_a, this.var_int_b);
        }
        if (this.var_u_a != null) {
            this.var_u_a.a(this.var_javax_microedition_lcdui_Graphics_a, this.var_int_a, this.var_int_b);
        }
    }

    private byte a(int n2) {
        byte by = 0;
        this.var_int_i = n2;
        aj aj2 = this;
        aj aj3 = aj2;
        aj aj4 = aj2;
        while (true) {
            aj4.var_int_i = aj3.var_int_i / 10;
            if (this.var_int_i == 0) break;
            by = (byte)(by + 1);
            aj4 = this;
            aj3 = this;
        }
        return by;
    }

    private byte b(int n2) {
        byte by = 0;
        this.var_int_i = n2;
        aj aj2 = this;
        while (true) {
            aj2.var_int_i /= 10;
            if (this.var_int_i == 0) break;
            if (((by = (byte)(by + 1)) - 2) % 4 == 0 && this.var_int_i / 10 != 0) {
                by = (byte)(by + 1);
            }
            aj2 = this;
        }
        return by;
    }

    private void a(int n2, int n3, int n4, byte by, Sprite sprite) {
        byte by2;
        byte by3 = by2 = 0;
        while (by3 <= by) {
            sprite.setFrame(n2 % 10);
            sprite.setPosition(n3 + (by - by2) * sprite.getWidth(), n4);
            sprite.paint(this.var_javax_microedition_lcdui_Graphics_a);
            n2 /= 10;
            by3 = (byte)(by2 + 1);
        }
    }

    private void a(int n2, byte by, Sprite sprite, Sprite sprite2) {
        this.a(n2, sprite.getX() + (sprite.getWidth() - sprite2.getWidth() * (by + 1)) / 2, sprite.getY() + (sprite.getHeight() - sprite2.getHeight()) / 2, by, sprite2);
    }

    private void b(int n2, int n3, int n4, byte by, Sprite sprite) {
        byte by2;
        int n5 = 0;
        byte by3 = 0;
        byte by4 = by2 = 0;
        while (by4 <= by) {
            by3 = (byte)(3 + n5 * 4);
            if (by2 == by3) {
                sprite.setFrame(10);
                sprite.setPosition(n3 + (by - by2) * sprite.getWidth(), n4);
                sprite.paint(this.var_javax_microedition_lcdui_Graphics_a);
                n5 = (byte)(n5 + 1);
            } else {
                sprite.setFrame(n2 % 10);
                sprite.setPosition(n3 + (by - by2) * sprite.getWidth(), n4);
                sprite.paint(this.var_javax_microedition_lcdui_Graphics_a);
                n2 /= 10;
            }
            by4 = (byte)(by2 + 1);
        }
    }

    private void a(int n2, int n3, byte by, int n4, int n5, Sprite sprite) {
        int n6 = 0;
        byte by2 = (byte)n6;
        while (by2 < n2 * by / n3) {
            int n7;
            Sprite sprite2;
            if (n6 == 0) {
                sprite2 = sprite;
                n7 = 0;
            } else if (n6 == n2 * by / n3 - 1) {
                sprite2 = sprite;
                n7 = 2;
            } else {
                sprite2 = sprite;
                n7 = 1;
            }
            sprite2.setFrame(n7);
            sprite.setPosition(n4 + n6 * sprite.getWidth(), n5);
            sprite.paint(this.var_javax_microedition_lcdui_Graphics_a);
            by2 = (byte)(n6 + 1);
        }
    }

    private static byte a(Vector vector, short[] sArray) {
        byte by;
        byte by2 = by = 0;
        while (by2 < vector.size()) {
            short[] sArray2 = (short[])vector.elementAt(by);
            if (sArray2[0] == sArray[0] && sArray2[1] == sArray[1]) {
                return by;
            }
            by2 = (byte)(by + 1);
        }
        return -1;
    }

    private boolean boolean_a() {
        if (this.var_byte_c > this.var_byte_b) {
            this.var_byte_b = (byte)(this.var_byte_b + 1);
            return false;
        }
        this.var_byte_b = 0;
        return true;
    }

    private void n() {
        this.var_boolean_e = false;
        this.var_boolean_f = false;
        this.var_boolean_g = false;
        this.var_boolean_j = false;
        this.var_boolean_k = false;
        this.var_boolean_h = false;
        this.var_boolean_i = false;
    }

    private void o() {
        int n2;
        if (this.var_long_c == 0L) {
            this.var_long_c = System.currentTimeMillis();
        }
        this.var_long_d = System.currentTimeMillis();
        if (this.var_long_d - this.var_long_c >= 120000L) {
            this.var_long_c = this.var_long_d;
            this.var_byte_g = (byte)(this.var_byte_g + 1);
            if (this.var_byte_g == 31) {
                this.var_byte_g = 1;
                this.var_byte_h = (byte)(this.var_byte_h + 1);
                if (this.var_byte_h == 13) {
                    this.var_byte_h = 1;
                }
            }
            if (this.var_ae_a != null) {
                this.var_ae_a.e = (byte)(this.var_ae_a.e - 1);
            }
            if (this.var_t_a != null) {
                this.var_t_a.e = (byte)(this.var_t_a.e - 1);
            }
            if (this.var_u_a != null) {
                this.var_u_a.e = (byte)(this.var_u_a.e - 1);
            }
        }
        if (this.var_boolean_m) {
            new i(this).a();
            this.var_boolean_m = false;
        }
        byte by = (byte)(n2 = 0);
        while (by < this.var_java_util_Vector_a.size()) {
            ((ah)this.var_java_util_Vector_a.elementAt(n2)).void_b();
            by = (byte)(n2 + 1);
        }
        n2 = 0;
        byte by2 = (byte)n2;
        while (by2 < this.var_java_util_Vector_a.size()) {
            if (((ah)this.var_java_util_Vector_a.elementAt((int)n2)).var_byte_a == 4) {
                if (this.var_ak_a == null) {
                    if (((ah)this.var_java_util_Vector_a.elementAt(n2)).boolean_a() && ((ah)this.var_java_util_Vector_a.elementAt((int)n2)).var_byte_b > -1) {
                        new s(this, ((ah)this.var_java_util_Vector_a.elementAt((int)n2)).var_byte_b).a();
                        break;
                    }
                } else if (this.var_ak_a.var_byte_b == 0 && ((ah)this.var_java_util_Vector_a.elementAt(n2)).boolean_a() && ((ah)this.var_java_util_Vector_a.elementAt((int)n2)).var_byte_b > -1) {
                    new s(this, ((ah)this.var_java_util_Vector_a.elementAt((int)n2)).var_byte_b).a();
                    break;
                }
            }
            by2 = (byte)(n2 + 1);
        }
        if (this.var_ak_a != null) {
            this.var_ak_a.void_a();
        }
        if (this.var_ae_a != null && this.var_ae_a.boolean_a()) {
            this.var_ae_a = null;
        }
        if (this.var_t_a != null && this.var_t_a.boolean_a()) {
            this.var_t_a = null;
        }
        if (this.var_n_a != null) {
            this.var_n_a.void_a();
        }
        if (this.var_u_a != null && this.var_u_a.boolean_a()) {
            this.var_u_a = null;
        }
        this.u();
    }

    private void p() {
        try {
            this.w = new Sprite(Image.createImage((String)"/interface_state/stateBar.png"));
            this.var_javax_microedition_lcdui_Image_a = Image.createImage((String)"/interface_state/stateName.png");
            this.x = new Sprite(this.var_javax_microedition_lcdui_Image_a, this.var_javax_microedition_lcdui_Image_a.getWidth(), this.var_javax_microedition_lcdui_Image_a.getHeight() / 16);
            this.var_javax_microedition_lcdui_Image_a = Image.createImage((String)"/interface_state/stateIcon.png");
            this.y = new Sprite(this.var_javax_microedition_lcdui_Image_a, this.var_javax_microedition_lcdui_Image_a.getWidth() / 4, this.var_javax_microedition_lcdui_Image_a.getHeight() / 4);
            this.var_javax_microedition_lcdui_Image_a = Image.createImage((String)"/interface_state/stateYellow.png");
            this.z = new Sprite(this.var_javax_microedition_lcdui_Image_a, this.var_javax_microedition_lcdui_Image_a.getWidth() / 3, this.var_javax_microedition_lcdui_Image_a.getHeight());
            this.var_javax_microedition_lcdui_Image_a = Image.createImage((String)"/interface_state/stateGreen.png");
            this.A = new Sprite(this.var_javax_microedition_lcdui_Image_a, this.var_javax_microedition_lcdui_Image_a.getWidth() / 3, this.var_javax_microedition_lcdui_Image_a.getHeight());
            this.B = new Sprite(Image.createImage((String)"/interface_state/stateSeason.png"));
            this.var_javax_microedition_lcdui_Image_a = Image.createImage((String)"/interface_state/stateSeasonNum.png");
            this.C = new Sprite(this.var_javax_microedition_lcdui_Image_a, this.var_javax_microedition_lcdui_Image_a.getWidth() / 10, this.var_javax_microedition_lcdui_Image_a.getHeight());
            this.var_javax_microedition_lcdui_Image_a = Image.createImage((String)"/interface_state/stateMinute.png");
            this.D = new Sprite(this.var_javax_microedition_lcdui_Image_a, this.var_javax_microedition_lcdui_Image_a.getWidth(), this.var_javax_microedition_lcdui_Image_a.getHeight() / 4);
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return;
        }
    }

    private void q() {
        try {
            this.E = new Sprite(Image.createImage((String)"/interface_state/stateFeedBar.png"));
            this.F = new Sprite(Image.createImage((String)"/interface_state/stateGrowBar.png"));
            this.G = new Sprite(Image.createImage((String)"/interface_state/stateLife.png"));
            this.var_javax_microedition_lcdui_Image_a = Image.createImage((String)"/interface_state/stateIconA.png");
            this.H = new Sprite(this.var_javax_microedition_lcdui_Image_a, this.var_javax_microedition_lcdui_Image_a.getWidth() / 5, this.var_javax_microedition_lcdui_Image_a.getHeight());
            this.var_javax_microedition_lcdui_Image_a = Image.createImage((String)"/interface_state/stateYellow.png");
            this.z = new Sprite(this.var_javax_microedition_lcdui_Image_a, this.var_javax_microedition_lcdui_Image_a.getWidth() / 3, this.var_javax_microedition_lcdui_Image_a.getHeight());
            this.var_javax_microedition_lcdui_Image_a = Image.createImage((String)"/interface_state/stateGreen.png");
            this.A = new Sprite(this.var_javax_microedition_lcdui_Image_a, this.var_javax_microedition_lcdui_Image_a.getWidth() / 3, this.var_javax_microedition_lcdui_Image_a.getHeight());
            this.var_javax_microedition_lcdui_Image_a = Image.createImage((String)"/interface_state/stateSeasonNum.png");
            this.C = new Sprite(this.var_javax_microedition_lcdui_Image_a, this.var_javax_microedition_lcdui_Image_a.getWidth() / 10, this.var_javax_microedition_lcdui_Image_a.getHeight());
            this.var_javax_microedition_lcdui_Image_a = Image.createImage((String)"/interface_state/stateMinute.png");
            this.D = new Sprite(this.var_javax_microedition_lcdui_Image_a, this.var_javax_microedition_lcdui_Image_a.getWidth(), this.var_javax_microedition_lcdui_Image_a.getHeight() / 4);
            this.var_javax_microedition_lcdui_Image_a = null;
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return;
        }
    }

    private void r() {
        this.w = null;
        this.x = null;
        this.y = null;
        this.z = null;
        this.A = null;
        this.B = null;
        this.C = null;
        this.D = null;
        this.E = null;
        this.F = null;
        this.G = null;
        this.H = null;
    }

    private void a(int n2, int n3) {
        if (this.var_short_b != w.var_byte_a && ((ah)this.var_java_util_Vector_a.elementAt((int)this.var_short_b)).var_byte_b != -1) {
            int n4;
            aj aj2;
            this.w.setPosition(n2 - 30, n3 - this.w.getWidth());
            this.w.paint(this.var_javax_microedition_lcdui_Graphics_a);
            this.x.setFrame((int)((ah)this.var_java_util_Vector_a.elementAt((int)this.var_short_b)).var_byte_b);
            this.x.setPosition(this.w.getX() + 42, this.w.getY() + 1);
            this.x.paint(this.var_javax_microedition_lcdui_Graphics_a);
            this.y.setFrame((int)((ah)this.var_java_util_Vector_a.elementAt((int)this.var_short_b)).var_byte_b);
            this.y.setPosition(this.w.getX() + 1, this.w.getY() + 42);
            this.y.paint(this.var_javax_microedition_lcdui_Graphics_a);
            if (w.var_byte_arr_a[((ah)this.var_java_util_Vector_a.elementAt((int)this.var_short_b)).var_byte_b] != 1) {
                this.B.setPosition(this.w.getX() + 35, this.w.getY() + 29);
                this.B.paint(this.var_javax_microedition_lcdui_Graphics_a);
                this.C.setFrame((int)((ah)this.var_java_util_Vector_a.elementAt((int)this.var_short_b)).var_byte_f);
                this.C.setPosition(this.B.getX() + 16, this.B.getY() + 1);
                this.C.paint(this.var_javax_microedition_lcdui_Graphics_a);
                this.C.setFrame((int)w.var_byte_arr_a[((ah)this.var_java_util_Vector_a.elementAt((int)this.var_short_b)).var_byte_b]);
                this.C.setPosition(this.B.getX() + 50, this.B.getY() + 1);
                this.C.paint(this.var_javax_microedition_lcdui_Graphics_a);
            }
            this.a(((ah)this.var_java_util_Vector_a.elementAt((int)this.var_short_b)).var_byte_e, 100, (byte)12, this.w.getX() + 20, this.w.getY() + 15, this.z);
            if (((ah)this.var_java_util_Vector_a.elementAt((int)this.var_short_b)).var_byte_a == 4) {
                aj2 = this;
                n4 = ((ah)this.var_java_util_Vector_a.elementAt((int)this.var_short_b)).var_short_a * 4;
            } else {
                aj2 = this;
                n4 = ((ah)this.var_java_util_Vector_a.elementAt((int)this.var_short_b)).var_short_a * (((ah)this.var_java_util_Vector_a.elementAt((int)this.var_short_b)).var_byte_a + 1) - ((ah)this.var_java_util_Vector_a.elementAt((int)this.var_short_b)).var_short_b;
            }
            aj2.a(n4, ((ah)this.var_java_util_Vector_a.elementAt((int)this.var_short_b)).var_short_a * 4, (byte)12, this.w.getX() + 20, this.w.getY() + 45, this.A);
            this.a(((ah)this.var_java_util_Vector_a.elementAt((int)this.var_short_b)).var_byte_e, this.w.getX() + 25, this.w.getY() + 16, (byte)2, this.var_javax_microedition_lcdui_game_Sprite_m);
            this.var_javax_microedition_lcdui_game_Sprite_m.setFrame(10);
            this.var_javax_microedition_lcdui_game_Sprite_m.setPosition(this.w.getX() + 25 + 3 * this.var_javax_microedition_lcdui_game_Sprite_m.getWidth(), this.w.getY() + 16);
            this.var_javax_microedition_lcdui_game_Sprite_m.paint(this.var_javax_microedition_lcdui_Graphics_a);
            this.a(100, this.w.getX() + 25 + 4 * this.var_javax_microedition_lcdui_game_Sprite_m.getWidth(), this.w.getY() + 16, (byte)2, this.var_javax_microedition_lcdui_game_Sprite_m);
            if (((ah)this.var_java_util_Vector_a.elementAt((int)this.var_short_b)).var_byte_a == 4) {
                this.D.setFrame(2);
                this.D.setPosition(this.w.getX() + 25, this.w.getY() + 45);
                this.D.paint(this.var_javax_microedition_lcdui_Graphics_a);
                this.a(w.var_byte_arr_c[((ah)this.var_java_util_Vector_a.elementAt((int)this.var_short_b)).var_byte_b], this.D.getX() + this.D.getWidth() / 2, this.D.getY(), (byte)1, this.var_javax_microedition_lcdui_game_Sprite_m);
                this.D.setFrame(3);
                this.D.setPosition(this.D.getX() + this.D.getWidth(), this.D.getY());
                this.D.paint(this.var_javax_microedition_lcdui_Graphics_a);
                this.a(((ah)this.var_java_util_Vector_a.elementAt((int)this.var_short_b)).var_byte_e * w.var_byte_arr_c[((ah)this.var_java_util_Vector_a.elementAt((int)this.var_short_b)).var_byte_b] / 100 - ((ah)this.var_java_util_Vector_a.elementAt((int)this.var_short_b)).m, this.D.getX() + this.D.getWidth() / 2, this.D.getY(), (byte)1, this.var_javax_microedition_lcdui_game_Sprite_m);
                return;
            }
            this.a((((ah)this.var_java_util_Vector_a.elementAt((int)this.var_short_b)).var_short_a * (3 - ((ah)this.var_java_util_Vector_a.elementAt((int)this.var_short_b)).var_byte_a) + ((ah)this.var_java_util_Vector_a.elementAt((int)this.var_short_b)).var_short_b) / 60, this.w.getX() + 25, this.w.getY() + 45, (byte)1, this.var_javax_microedition_lcdui_game_Sprite_m);
            this.D.setFrame(0);
            this.D.setPosition(this.w.getX() + 25 + 2 * this.var_javax_microedition_lcdui_game_Sprite_m.getWidth(), this.w.getY() + 45);
            this.D.paint(this.var_javax_microedition_lcdui_Graphics_a);
        }
    }

    private void b(int n2, int n3) {
        block9: {
            int n4;
            Sprite sprite;
            block6: {
                block8: {
                    block7: {
                        block5: {
                            if (this.var_short_b == 0) {
                                this.E.setPosition(n2 - 30, n3 - this.E.getHeight());
                                this.E.paint(this.var_javax_microedition_lcdui_Graphics_a);
                                this.a(this.var_ak_a.var_byte_b, 100, (byte)12, this.E.getX() + 20, this.E.getY() + 15, this.z);
                                this.a(this.var_ak_a.var_byte_b, this.E.getX() + 25, this.E.getY() + 16, (byte)2, this.var_javax_microedition_lcdui_game_Sprite_m);
                                this.var_javax_microedition_lcdui_game_Sprite_m.setFrame(10);
                                this.var_javax_microedition_lcdui_game_Sprite_m.setPosition(this.E.getX() + 25 + 3 * this.var_javax_microedition_lcdui_game_Sprite_m.getWidth(), this.E.getY() + 16);
                                this.var_javax_microedition_lcdui_game_Sprite_m.paint(this.var_javax_microedition_lcdui_Graphics_a);
                                this.a(100, this.E.getX() + 25 + 4 * this.var_javax_microedition_lcdui_game_Sprite_m.getWidth(), this.E.getY() + 16, (byte)2, this.var_javax_microedition_lcdui_game_Sprite_m);
                                return;
                            }
                            this.E.setPosition(n2 - 30, n3 - this.E.getHeight() - this.F.getHeight());
                            this.E.paint(this.var_javax_microedition_lcdui_Graphics_a);
                            this.F.setPosition(n2 - 30, n3 - this.F.getHeight());
                            this.F.paint(this.var_javax_microedition_lcdui_Graphics_a);
                            this.G.setPosition(this.F.getX() + 48, this.F.getY() + 1);
                            if (this.var_short_b != 4) {
                                this.G.paint(this.var_javax_microedition_lcdui_Graphics_a);
                            }
                            if (this.var_short_b != 1 || this.var_u_a == null) break block5;
                            this.a(this.var_u_a.d, 100, (byte)12, this.E.getX() + 20, this.E.getY() + 15, this.z);
                            this.a(w.var_byte_arr_g[3] - this.var_u_a.var_short_a, w.var_byte_arr_g[3], (byte)12, this.F.getX() + 20, this.F.getY() + 15, this.A);
                            this.H.setPosition(this.F.getX() + 1, this.F.getY() + 14);
                            this.H.paint(this.var_javax_microedition_lcdui_Graphics_a);
                            this.a(this.var_u_a.e, this.G.getX() + 26, this.G.getY(), (byte)1, this.C);
                            this.a(this.var_u_a.d, this.E.getX() + 25, this.E.getY() + 16, (byte)2, this.var_javax_microedition_lcdui_game_Sprite_m);
                            this.a(this.var_u_a.var_short_a / 60, this.F.getX() + 25, this.F.getY() + 16, (byte)1, this.var_javax_microedition_lcdui_game_Sprite_m);
                            sprite = this.H;
                            n4 = 4;
                            break block6;
                        }
                        if (this.var_short_b != 2 || this.var_t_a == null) break block7;
                        this.a(this.var_t_a.d, 100, (byte)12, this.E.getX() + 20, this.E.getY() + 15, this.z);
                        this.a(w.var_byte_arr_g[1] - this.var_t_a.var_short_a, w.var_byte_arr_g[1], (byte)12, this.F.getX() + 20, this.F.getY() + 15, this.A);
                        this.H.setPosition(this.F.getX() + 1, this.F.getY() + 14);
                        this.H.paint(this.var_javax_microedition_lcdui_Graphics_a);
                        this.a(this.var_t_a.e, this.G.getX() + 26, this.G.getY(), (byte)1, this.C);
                        this.a(this.var_t_a.d, this.E.getX() + 25, this.E.getY() + 16, (byte)2, this.var_javax_microedition_lcdui_game_Sprite_m);
                        this.a(this.var_t_a.var_short_a / 60, this.F.getX() + 25, this.F.getY() + 16, (byte)1, this.var_javax_microedition_lcdui_game_Sprite_m);
                        sprite = this.H;
                        n4 = 2;
                        break block6;
                    }
                    if (this.var_short_b != 3 || this.var_ae_a == null) break block8;
                    this.a(this.var_ae_a.var_byte_d, 100, (byte)12, this.E.getX() + 20, this.E.getY() + 15, this.z);
                    this.a(w.var_byte_arr_g[0] - this.var_ae_a.var_short_a, w.var_byte_arr_g[0], (byte)12, this.F.getX() + 20, this.F.getY() + 15, this.A);
                    this.H.setPosition(this.F.getX() + 1, this.F.getY() + 14);
                    this.H.paint(this.var_javax_microedition_lcdui_Graphics_a);
                    this.a(this.var_ae_a.e, this.G.getX() + 26, this.G.getY(), (byte)1, this.C);
                    this.a(this.var_ae_a.var_byte_d, this.E.getX() + 25, this.E.getY() + 16, (byte)2, this.var_javax_microedition_lcdui_game_Sprite_m);
                    this.a(this.var_ae_a.var_short_a / 60, this.F.getX() + 25, this.F.getY() + 16, (byte)1, this.var_javax_microedition_lcdui_game_Sprite_m);
                    sprite = this.H;
                    n4 = 1;
                    break block6;
                }
                if (this.var_short_b != 4 || this.var_n_a == null) break block9;
                this.a(this.var_n_a.var_byte_d, 100, (byte)12, this.E.getX() + 20, this.E.getY() + 15, this.z);
                this.a(w.var_byte_arr_g[2] - this.var_n_a.var_short_a, w.var_byte_arr_g[2], (byte)12, this.F.getX() + 20, this.F.getY() + 15, this.A);
                this.a(this.var_n_a.var_byte_d, this.E.getX() + 25, this.E.getY() + 16, (byte)2, this.var_javax_microedition_lcdui_game_Sprite_m);
                this.a(this.var_n_a.var_short_a / 60, this.F.getX() + 25, this.F.getY() + 16, (byte)1, this.var_javax_microedition_lcdui_game_Sprite_m);
                sprite = this.H;
                n4 = 3;
            }
            sprite.setFrame(n4);
        }
        this.var_javax_microedition_lcdui_game_Sprite_m.setFrame(10);
        this.var_javax_microedition_lcdui_game_Sprite_m.setPosition(this.E.getX() + 25 + 3 * this.var_javax_microedition_lcdui_game_Sprite_m.getWidth(), this.E.getY() + 16);
        this.var_javax_microedition_lcdui_game_Sprite_m.paint(this.var_javax_microedition_lcdui_Graphics_a);
        this.a(100, this.E.getX() + 25 + this.var_javax_microedition_lcdui_game_Sprite_m.getWidth() * 4, this.E.getY() + 16, (byte)2, this.var_javax_microedition_lcdui_game_Sprite_m);
        this.D.setFrame(0);
        this.D.setPosition(this.F.getX() + 25 + 3 * this.var_javax_microedition_lcdui_game_Sprite_m.getWidth(), this.F.getY() + 16);
        this.D.paint(this.var_javax_microedition_lcdui_Graphics_a);
        this.H.setPosition(this.F.getX() + 1, this.F.getY() + 14);
        this.H.paint(this.var_javax_microedition_lcdui_Graphics_a);
    }

    private void s() {
        if (this.var_u_a != null) {
            this.var_u_a.var_boolean_c = false;
            this.var_u_a.var_boolean_b = false;
            this.var_u_a.var_byte_b = 0;
            this.var_u_a.var_byte_a = 0;
            return;
        }
        if (this.var_t_a != null) {
            this.var_t_a.var_boolean_c = false;
            this.var_t_a.var_boolean_b = false;
            this.var_t_a.var_byte_b = 0;
            this.var_t_a.var_byte_a = 0;
            return;
        }
        if (this.var_ae_a != null) {
            this.var_ae_a.var_boolean_a = false;
            this.var_ae_a.var_boolean_c = false;
            this.var_ae_a.var_byte_b = 0;
            this.var_ae_a.var_byte_a = 0;
            return;
        }
        if (this.var_n_a != null) {
            this.var_n_a.var_boolean_c = false;
            this.var_n_a.var_boolean_b = false;
            this.var_n_a.var_byte_b = 0;
            this.var_n_a.var_byte_a = 0;
        }
    }

    private void a(Sprite sprite) {
        block10: {
            int n2;
            block9: {
                int n3;
                int n4;
                int n5;
                block11: {
                    aj aj2;
                    block12: {
                        block7: {
                            block8: {
                                block6: {
                                    int n6;
                                    block5: {
                                        aj aj3;
                                        block4: {
                                            this.var_int_j = sprite.getX();
                                            if (this.var_int_j - (w.var_int_c - sprite.getWidth()) / 2 >= this.var_javax_microedition_lcdui_game_Sprite_a.getX()) break block4;
                                            aj3 = this;
                                            n6 = this.var_javax_microedition_lcdui_game_Sprite_a.getX() + (w.var_int_c - sprite.getWidth()) / 2;
                                            break block5;
                                        }
                                        if (this.var_int_j + sprite.getWidth() + (w.var_int_c - sprite.getWidth()) / 2 <= this.var_javax_microedition_lcdui_game_Sprite_a.getX() + this.var_javax_microedition_lcdui_game_Sprite_a.getWidth()) break block6;
                                        aj3 = this;
                                        n6 = this.var_javax_microedition_lcdui_game_Sprite_a.getX() + this.var_javax_microedition_lcdui_game_Sprite_a.getWidth() - sprite.getWidth() - (w.var_int_c - sprite.getWidth()) / 2;
                                    }
                                    aj3.var_int_j = n6;
                                }
                                this.var_int_k = sprite.getY();
                                if (!this.var_w_a.var_boolean_b) break block7;
                                if (this.var_int_k - (w.var_int_d - 10 - sprite.getHeight()) / 2 >= this.var_javax_microedition_lcdui_game_Sprite_a.getY()) break block8;
                                aj2 = this;
                                n2 = this.var_javax_microedition_lcdui_game_Sprite_a.getY() + (w.var_int_d - 10 - sprite.getHeight()) / 2;
                                break block9;
                            }
                            if (this.var_int_k + sprite.getHeight() + (w.var_int_d - 10 - sprite.getHeight()) / 2 <= this.var_javax_microedition_lcdui_game_Sprite_a.getY() + this.var_javax_microedition_lcdui_game_Sprite_a.getHeight()) break block10;
                            aj2 = this;
                            n5 = this.var_javax_microedition_lcdui_game_Sprite_a.getY() + this.var_javax_microedition_lcdui_game_Sprite_a.getHeight() - sprite.getHeight();
                            n4 = w.var_int_d;
                            n3 = 10;
                            break block11;
                        }
                        if (this.var_int_k - (w.var_int_d - 20 - sprite.getHeight()) / 2 >= this.var_javax_microedition_lcdui_game_Sprite_a.getY()) break block12;
                        aj2 = this;
                        n2 = this.var_javax_microedition_lcdui_game_Sprite_a.getY() + (w.var_int_d - 20 - sprite.getHeight()) / 2;
                        break block9;
                    }
                    if (this.var_int_k + sprite.getHeight() + (w.var_int_d - 20 - sprite.getHeight()) / 2 <= this.var_javax_microedition_lcdui_game_Sprite_a.getY() + this.var_javax_microedition_lcdui_game_Sprite_a.getHeight()) break block10;
                    aj2 = this;
                    n5 = this.var_javax_microedition_lcdui_game_Sprite_a.getY() + this.var_javax_microedition_lcdui_game_Sprite_a.getHeight() - sprite.getHeight();
                    n4 = w.var_int_d;
                    n3 = 20;
                }
                n2 = n5 - (n4 - n3 - sprite.getHeight()) / 2;
            }
            aj2.var_int_k = n2;
        }
        this.var_javax_microedition_lcdui_game_Sprite_a.move(((w.var_int_c - sprite.getWidth()) / 2 - this.var_int_j) / 4, ((w.var_int_d - sprite.getHeight()) / 2 - this.var_int_k) / 4);
        this.var_int_a = this.var_javax_microedition_lcdui_game_Sprite_a.getX();
        this.var_int_b = this.var_javax_microedition_lcdui_game_Sprite_a.getY();
    }

    private void t() {
        this.var_javax_microedition_lcdui_Graphics_a.setColor(0, 0, 0);
        this.var_javax_microedition_lcdui_Graphics_a.fillRect(0, 0, w.var_int_c, 340);
    }

    private void u() {
        int n2;
        aj aj2;
        if (this.var_int_f >= this.var_int_e) {
            this.var_short_a = (short)(this.var_short_a + 1);
            if (this.var_short_a % 10 == 0 && this.var_short_a < 50) {
                this.var_boolean_m = true;
            }
            this.v();
        }
        if (this.var_short_a / 10 == 0) {
            aj2 = this;
            n2 = 0;
        } else if (this.var_short_a / 10 == 1) {
            aj2 = this;
            n2 = 1;
        } else if (this.var_short_a / 10 == 2) {
            aj2 = this;
            n2 = 2;
        } else if (this.var_short_a / 10 == 3) {
            aj2 = this;
            n2 = 3;
        } else {
            aj2 = this;
            n2 = 4;
        }
        aj2.var_byte_i = n2;
    }

    private void v() {
        this.var_int_e = (this.var_short_a + 1) * (this.var_short_a + 2) * 100;
    }

    public static void void_a(aj aj2) {
        aj2.p();
    }

    public static void b(aj aj2) {
        aj2.n();
    }

    public static void c(aj aj2) {
        aj2.t();
    }

    public static void d(aj aj2) {
        aj2.h();
    }

    public static void e(aj aj2) {
        aj2.o();
    }

    public static void a(aj aj2, Sprite sprite) {
        aj2.a(sprite);
    }

    public static void f(aj aj2) {
        aj2.i();
    }

    public static void g(aj aj2) {
        aj2.m();
    }

    public static void h(aj aj2) {
        aj2.l();
    }

    public static void i(aj aj2) {
        aj2.k();
    }

    public static void a(aj aj2, int n2, int n3) {
        aj2.a(n2, n3);
    }

    public static boolean boolean_a(aj aj2) {
        return aj2.boolean_a();
    }

    public static void j(aj aj2) {
        aj2.e();
    }

    public static byte a(aj aj2, int n2) {
        return aj2.a(n2);
    }

    public static void a(aj aj2, int n2, int n3, int n4, byte by, Sprite sprite) {
        aj2.a(n2, n3, n4, by, sprite);
    }

    public static void k(aj aj2) {
        aj2.q();
    }

    public static void b(aj aj2, int n2, int n3) {
        aj2.b(n2, n3);
    }

    public static void l(aj aj2) {
        aj2.f();
    }

    public static byte a(aj aj2, Vector vector, short[] sArray) {
        return aj.a(vector, sArray);
    }

    public static void m(aj aj2) {
        aj2.g();
    }
}

