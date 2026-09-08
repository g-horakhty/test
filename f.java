/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import java.io.DataInputStream;
import javax.microedition.lcdui.Graphics;

public final class f {
    public byte var_byte_a;
    public short var_short_a;

    public f(DataInputStream dataInputStream) {
        this.a(dataInputStream);
    }

    private void a(DataInputStream dataInputStream) {
        try {
            this.var_byte_a = dataInputStream.readByte();
            this.var_short_a = dataInputStream.readShort();
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return;
        }
    }

    public final void a(Graphics graphics, z z2, int n2, int n3, int n4, int n5, int n6, int n7) {
        int n8;
        int n9;
        int n10;
        int n11;
        ac ac2;
        int n12;
        int n13;
        block14: {
            int n14;
            block18: {
                int n15;
                block16: {
                    block21: {
                        block20: {
                            block19: {
                                block17: {
                                    block15: {
                                        block13: {
                                            n13 = n4;
                                            n12 = n5;
                                            ac2 = z2.var_ac_arr_a[this.var_byte_a];
                                            n11 = ac2.a(this.var_short_a);
                                            n10 = ac2.b(this.var_short_a);
                                            n9 = ac2.c(this.var_short_a);
                                            n8 = ac2.d(this.var_short_a);
                                            if (n6 != 2) break block13;
                                            n13 = f.a(n7) ? z2.int_a() - n4 - n8 : z2.int_a() - n4 - n9;
                                            break block14;
                                        }
                                        if (n6 != 5) break block15;
                                        n15 = f.a(n7) ? z2.int_a() - n5 - n9 : z2.int_a() - n5 - n8;
                                        break block16;
                                    }
                                    if (n6 != 3) break block17;
                                    if (f.a(n7)) {
                                        n13 = z2.int_a() - n4 - n8;
                                        n14 = z2.int_b() - n5 - n9;
                                    } else {
                                        n13 = z2.int_a() - n4 - n9;
                                        n14 = z2.int_b() - n5 - n8;
                                    }
                                    break block18;
                                }
                                if (n6 != 6) break block19;
                                if (f.a(n7)) {
                                    n13 = n5;
                                    n14 = z2.int_b() - n8 - n4;
                                } else {
                                    n13 = n5;
                                    n14 = z2.int_b() - n9 - n4;
                                }
                                break block18;
                            }
                            if (n6 != 7) break block20;
                            if (f.a(n7)) {
                                n13 = z2.int_a() - n5 - n9;
                                n14 = z2.int_b() - n4 - n8;
                            } else {
                                n13 = z2.int_a() - n5 - n8;
                                n14 = z2.int_b() - n4 - n9;
                            }
                            break block18;
                        }
                        if (n6 != 1) break block21;
                        if (f.a(n7)) {
                            n13 = n4;
                            n14 = z2.int_b() - n5 - n9;
                        } else {
                            n13 = n4;
                            n14 = z2.int_b() - n5 - n8;
                        }
                        break block18;
                    }
                    if (n6 != 4) break block14;
                    if (f.a(n7)) {
                        // empty if block
                    }
                    n15 = n5;
                }
                n13 = n15;
                n14 = n4;
            }
            n12 = n14;
        }
        n6 = f.a(n7, n6);
        int n16 = n13 + n2;
        int n17 = n12 + n3;
        if (f.a(n6) ? f.a(graphics, n16, n17, n8, n9) : f.a(graphics, n16, n17, n9, n8)) {
            graphics.drawRegion(ac2.var_javax_microedition_lcdui_Image_a, n11, n10, n9, n8, n6, n16, n17, 0);
        }
    }

    private static boolean a(int n2) {
        return n2 == 4 || n2 == 7 || n2 == 6 || n2 == 5;
    }

    private static int a(int n2, int n3) {
        switch (n2) {
            case 0: {
                return n3;
            }
            case 5: {
                switch (n3) {
                    case 0: {
                        return n2;
                    }
                    case 5: {
                        return 3;
                    }
                    case 3: {
                        return 6;
                    }
                    case 6: {
                        return 0;
                    }
                    case 2: {
                        return 4;
                    }
                    case 7: {
                        return 2;
                    }
                    case 1: {
                        return 7;
                    }
                    case 4: {
                        return 1;
                    }
                }
                break;
            }
            case 3: {
                switch (n3) {
                    case 0: {
                        return n2;
                    }
                    case 5: {
                        return 6;
                    }
                    case 3: {
                        return 0;
                    }
                    case 6: {
                        return 5;
                    }
                    case 2: {
                        return 1;
                    }
                    case 7: {
                        return 4;
                    }
                    case 1: {
                        return 2;
                    }
                    case 4: {
                        return 7;
                    }
                }
                break;
            }
            case 6: {
                switch (n3) {
                    case 0: {
                        return n2;
                    }
                    case 5: {
                        return 0;
                    }
                    case 3: {
                        return 5;
                    }
                    case 6: {
                        return 3;
                    }
                    case 2: {
                        return 7;
                    }
                    case 7: {
                        return 1;
                    }
                    case 1: {
                        return 4;
                    }
                    case 4: {
                        return 2;
                    }
                }
                break;
            }
            case 2: {
                switch (n3) {
                    case 0: {
                        return n2;
                    }
                    case 5: {
                        return 7;
                    }
                    case 3: {
                        return 1;
                    }
                    case 6: {
                        return 4;
                    }
                    case 2: {
                        return 0;
                    }
                    case 7: {
                        return 5;
                    }
                    case 1: {
                        return 3;
                    }
                    case 4: {
                        return 6;
                    }
                }
                break;
            }
            case 7: {
                switch (n3) {
                    case 0: {
                        return n2;
                    }
                    case 5: {
                        return 4;
                    }
                    case 3: {
                        return 2;
                    }
                    case 6: {
                        return 7;
                    }
                    case 2: {
                        return 6;
                    }
                    case 7: {
                        return 0;
                    }
                    case 1: {
                        return 5;
                    }
                    case 4: {
                        return 3;
                    }
                }
                break;
            }
            case 1: {
                switch (n3) {
                    case 0: {
                        return n2;
                    }
                    case 5: {
                        return 4;
                    }
                    case 3: {
                        return 2;
                    }
                    case 6: {
                        return 7;
                    }
                    case 2: {
                        return 3;
                    }
                    case 7: {
                        return 6;
                    }
                    case 1: {
                        return 0;
                    }
                    case 4: {
                        return 5;
                    }
                }
                break;
            }
            case 4: {
                switch (n3) {
                    case 0: {
                        return n2;
                    }
                    case 5: {
                        return 2;
                    }
                    case 3: {
                        return 7;
                    }
                    case 6: {
                        return 1;
                    }
                    case 2: {
                        return 5;
                    }
                    case 7: {
                        return 3;
                    }
                    case 1: {
                        return 6;
                    }
                    case 4: {
                        return 0;
                    }
                }
            }
        }
        return 0;
    }

    private static boolean a(Graphics graphics, int n2, int n3, int n4, int n5) {
        return n2 >= graphics.getClipX() - n4 && n2 < graphics.getClipX() + graphics.getClipWidth() && n3 >= graphics.getClipY() - n5 && n3 < graphics.getClipY() + graphics.getClipHeight();
    }
}

