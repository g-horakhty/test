/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;

public final class o {
    public o(DataInputStream dataInputStream) {
        this.a(dataInputStream);
    }

    private void a(DataInputStream dataInputStream) {
        try {
            dataInputStream.readByte();
            dataInputStream.readShort();
            dataInputStream.readShort();
            dataInputStream.readShort();
            dataInputStream.readShort();
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return;
        }
    }
}

