/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.microedition.lcdui.Image;

public final class ac {
    public static byte[] var_byte_arr_a;
    public short[] var_short_arr_a;
    public byte var_byte_a;
    public byte var_byte_b;
    public byte[] var_byte_arr_b;
    public Image var_javax_microedition_lcdui_Image_a;
    public byte c;
    public static Class var_java_lang_Class_a;

    private ac(DataInputStream dataInputStream, String string) {
        this.a(dataInputStream, string);
    }

    private void a(DataInputStream dataInputStream, String string) {
        try {
            int n2;
            int n3;
            byte[] byArray = new byte[12];
            dataInputStream.read(byArray);
            String string2 = string + "images/" + dataInputStream.readUTF();
            int n4 = dataInputStream.readShort() * 4;
            if (n4 > 0) {
                this.var_short_arr_a = new short[n4];
                for (n3 = 0; n3 < this.var_short_arr_a.length; ++n3) {
                    this.var_short_arr_a[n3] = dataInputStream.readShort();
                }
            }
            n3 = 0;
            byte[] byArray2 = null;
            if (dataInputStream.readBoolean()) {
                n3 = dataInputStream.readInt();
                byArray2 = new byte[dataInputStream.readInt()];
                for (int i2 = 0; i2 < byArray2.length; ++i2) {
                    byArray2[i2] = dataInputStream.readByte();
                }
            }
            try {
                Image image;
                ac ac2;
                Object object;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byteArrayOutputStream.write(byArray);
                InputStream inputStream = string2.getClass().getResourceAsStream(string2);
                n2 = 0;
                while ((n2 = inputStream.read()) != -1) {
                    byteArrayOutputStream.write(n2);
                }
                inputStream.close();
                byteArrayOutputStream.write(var_byte_arr_a);
                if (byArray2 == null) {
                    object = byteArrayOutputStream.toByteArray();
                    ac2 = this;
                    image = Image.createImage((byte[])object, (int)0, (int)((byte[])object).length);
                } else {
                    ai ai2 = new ai();
                    object = ai2;
                    ai2.a(byteArrayOutputStream.toByteArray(), n3, byArray2);
                    ac2 = this;
                    image = ((ai)object).javax_microedition_lcdui_Image_a();
                }
                ac2.var_javax_microedition_lcdui_Image_a = image;
                byteArrayOutputStream.close();
            }
            catch (IOException iOException) {
                System.out.println(string2 + " \u5716\u7247\u627e\u4e0d\u5230");
            }
            this.var_byte_a = dataInputStream.readByte();
            this.var_byte_b = dataInputStream.readByte();
            if (this.var_byte_a == 0) {
                this.var_byte_a = 1;
            }
            if (this.var_byte_b == 0) {
                this.var_byte_b = 1;
            }
            this.var_javax_microedition_lcdui_Image_a.getWidth();
            if (dataInputStream.readBoolean()) {
                int n5 = this.var_javax_microedition_lcdui_Image_a.getWidth() / this.var_byte_a;
                int n6 = this.var_javax_microedition_lcdui_Image_a.getHeight() / this.var_byte_b;
                this.var_byte_arr_b = new byte[n6 * n5];
                for (n2 = 0; n2 < n6; ++n2) {
                    for (int i3 = 0; i3 < n5; ++i3) {
                        this.var_byte_arr_b[n2 * n5 + i3] = dataInputStream.readByte();
                    }
                }
            }
            this.c = dataInputStream.readByte();
            if (this.c == 4) {
                this.var_javax_microedition_lcdui_Image_a = Image.createImage((Image)this.var_javax_microedition_lcdui_Image_a, (int)0, (int)0, (int)this.var_javax_microedition_lcdui_Image_a.getWidth(), (int)this.var_javax_microedition_lcdui_Image_a.getHeight(), (int)2);
            }
            return;
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return;
        }
    }

    public final int a(int n2) {
        return this.var_short_arr_a[n2 * 4];
    }

    public final int b(int n2) {
        return this.var_short_arr_a[n2 * 4 + 1];
    }

    public final int c(int n2) {
        return this.var_short_arr_a[n2 * 4 + 2];
    }

    public final int d(int n2) {
        return this.var_short_arr_a[n2 * 4 + 3];
    }

    public static ac a(String string, String string2) {
        InputStream inputStream = (var_java_lang_Class_a == null ? (var_java_lang_Class_a = ac.a("ac")) : var_java_lang_Class_a).getResourceAsStream((string2 = string2 + "imagecontent/") + string);
        if (inputStream != null) {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            ac ac2 = new ac(dataInputStream, string2);
            try {
                dataInputStream.close();
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
            return ac2;
        }
        System.out.println("imagecontent error " + string2 + string);
        return null;
    }

    public static ac b(String string, String string2) {
        try {
            InputStream inputStream = (var_java_lang_Class_a == null ? (var_java_lang_Class_a = ac.a("ac")) : var_java_lang_Class_a).getResourceAsStream(string2 + "imagecontent.lis");
            if (inputStream != null) {
                Object object;
                DataInputStream dataInputStream = new DataInputStream(inputStream);
                int n2 = 0;
                while (dataInputStream.available() > 0) {
                    object = dataInputStream.readUTF();
                    n2 = dataInputStream.readInt();
                    if (!((String)object).equals(string)) continue;
                    break;
                }
                dataInputStream.close();
                dataInputStream = new DataInputStream((var_java_lang_Class_a == null ? (var_java_lang_Class_a = ac.a("ac")) : var_java_lang_Class_a).getResourceAsStream(string2 + "imagecontent.bin"));
                dataInputStream.skip(n2);
                object = new ac(dataInputStream, string2);
                dataInputStream.close();
                return object;
            }
            System.out.println("imagecontent error " + string);
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
        }
        return null;
    }

    private static Class a(String string) {
        try {
            return Class.forName(string);
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new NoClassDefFoundError(classNotFoundException.getMessage());
        }
    }

    static {
        var_byte_arr_a = new byte[]{0, 0, 0, 0, 73, 69, 78, 68, -82, 66, 96, -126};
    }
}

