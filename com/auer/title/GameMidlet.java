/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Display
 *  javax.microedition.midlet.MIDlet
 */
package com.auer.title;

import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;

public class GameMidlet
extends MIDlet {
    private w var_w_a;
    public static GameMidlet var_com_auer_title_GameMidlet_a;

    public GameMidlet() {
        var_com_auer_title_GameMidlet_a = this;
    }

    public void startApp() {
        if (this.var_w_a == null) {
            if (TrialOnLaunches.expirationOnLaunches(this)) {
                return;
            }
            TrialOnLaunches.lshjavaCheckedExpiration();
            this.var_w_a = new w(Display.getDisplay((MIDlet)this));
        }
    }

    public void pauseApp() {
    }

    public void destroyApp(boolean bl) {
    }

    public final void a() {
        this.destroyApp(true);
        this.notifyDestroyed();
    }
}

