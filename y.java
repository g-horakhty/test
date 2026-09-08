/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.rms.RecordStore
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import javax.microedition.rms.RecordStore;

public final class y {
    private RecordStore a = null;

    public final void a(int[] nArray) {
        try {
            y.void_a("save");
            this.a = RecordStore.openRecordStore((String)"save", (boolean)true);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            for (int i2 = 0; i2 < nArray.length; ++i2) {
                dataOutputStream.writeInt(nArray[i2]);
            }
            this.a.addRecord(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.toByteArray().length);
            dataOutputStream.close();
            byteArrayOutputStream.close();
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
        }
        this.void_a();
    }

    public final int[] int_arr_a() {
        int[] nArray;
        try {
            this.a = RecordStore.openRecordStore((String)"save", (boolean)false);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.a.getRecord(1));
            DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
            int n2 = dataInputStream.readInt();
            nArray = new int[n2];
            for (int i2 = 0; i2 < nArray.length - 1; ++i2) {
                nArray[i2] = dataInputStream.readInt();
            }
            dataInputStream.close();
            byteArrayInputStream.close();
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            nArray = new int[1];
        }
        this.void_a();
        return nArray;
    }

    private void void_a() {
        try {
            this.a.closeRecordStore();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private static void void_a(String string) {
        try {
            RecordStore.deleteRecordStore((String)string);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static boolean boolean_a(String string) {
        String[] stringArray = RecordStore.listRecordStores();
        if (stringArray != null) {
            for (int i2 = 0; i2 < stringArray.length; ++i2) {
                if (!stringArray[i2].equals(string)) continue;
                return true;
            }
        }
        return false;
    }
}

