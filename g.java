/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.media.Manager
 *  javax.microedition.media.MediaException
 *  javax.microedition.media.Player
 *  javax.microedition.media.control.VolumeControl
 */
import java.io.IOException;
import java.io.InputStream;
import javax.microedition.media.Manager;
import javax.microedition.media.MediaException;
import javax.microedition.media.Player;
import javax.microedition.media.control.VolumeControl;

public final class g {
    private Player var_javax_microedition_media_Player_a;
    private Player b;
    private InputStream var_java_io_InputStream_a;
    private VolumeControl var_javax_microedition_media_control_VolumeControl_a;
    public boolean var_boolean_a;

    public g(String string, String string2) {
        block3: {
            this.var_boolean_a = false;
            try {
                this.var_java_io_InputStream_a = this.getClass().getResourceAsStream(string);
                this.var_java_io_InputStream_a.mark(0);
                this.var_javax_microedition_media_Player_a = Manager.createPlayer((InputStream)this.var_java_io_InputStream_a, (String)string2);
                this.var_javax_microedition_media_Player_a.prefetch();
                break block3;
            }
            catch (IOException iOException) {
            }
            catch (MediaException mediaException) {}
            System.out.println("Loading Media files failed !");
        }
        this.b = this.var_javax_microedition_media_Player_a;
        this.var_javax_microedition_media_control_VolumeControl_a = (VolumeControl)this.b.getControl("javax.microedition.media.control.VolumeControl");
    }

    public final boolean a(int n2) {
        if (this.var_boolean_a && this.b.getState() != 400) {
            this.b.setLoopCount(-1);
        }
        try {
            if (this.b.getState() != 400) {
                this.b.start();
            } else {
                this.b.stop();
                this.b.setMediaTime(0L);
                this.b.start();
            }
        }
        catch (MediaException mediaException) {
            System.out.println("Playing media files failed !" + n2);
        }
        return true;
    }

    public final boolean a() {
        if (this.b != null && this.b.getState() != 0) {
            try {
                this.b.stop();
                this.b.close();
            }
            catch (MediaException mediaException) {
                System.out.println("Stopping media files failed !");
            }
        }
        return true;
    }

    public final boolean b(int n2) {
        if (this.b != null && n2 >= 0 && n2 <= 100) {
            if (this.var_javax_microedition_media_control_VolumeControl_a != null) {
                this.var_javax_microedition_media_control_VolumeControl_a.setLevel(n2);
                return true;
            }
            this.var_javax_microedition_media_control_VolumeControl_a = (VolumeControl)this.b.getControl("javax.microedition.media.control.VolumeControl");
            this.var_javax_microedition_media_control_VolumeControl_a.setLevel(n2);
            return true;
        }
        return false;
    }
}

