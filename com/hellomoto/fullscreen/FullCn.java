/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.game.GameCanvas
 */
package com.hellomoto.fullscreen;

import javax.microedition.lcdui.game.GameCanvas;

public abstract class FullCn
extends GameCanvas {
    boolean setFullScreen;
    int[] codes;
    int[] CodeFrom;
    int[] CodeTo;
    int n;

    protected FullCn() {
        super(false);
        this.Init();
    }

    protected FullCn(boolean flag) {
        super(flag);
        this.Init();
    }

    private void Init() {
        this.setFullScreen = true;
        this.n = 7;
        this.codes = new int[13];
        this.CodeFrom = new int[]{-6, -7, -3, -4, -2, -5, 0, -202, -202, -202, -202, -202, -202, -202, -202, -202, -202, -202, -202, -202, -202};
        this.CodeTo = new int[]{-21, -22, -2, -5, -6, -20, -23, -202, -202, -202, -202, -202, -202, -202, -202, -202, -202, -202, -202, -202, -202};
        this.setFullScreenMode(this.setFullScreen);
        for (int i2 = 0; i2 < 13; ++i2) {
            this.codes[i2] = i2 != 0 && i2 != 3 && i2 != 4 && i2 != 7 ? this.keyCodeConvert(super.getKeyCode(i2)) : 0;
        }
    }

    private int keyCodeConvert(int i2) {
        for (int j2 = 0; j2 < this.n; ++j2) {
            if (this.CodeFrom[j2] != i2) continue;
            return this.CodeTo[j2];
        }
        return i2;
    }

    protected void keyPressed(int i2) {
        this.KEYPRESSED(this.keyCodeConvert(i2));
    }

    protected void keyReleased(int i2) {
        this.KEYRELEASED(this.keyCodeConvert(i2));
    }

    protected void keyRepeated(int i2) {
        this.KEYREPEATED(this.keyCodeConvert(i2));
    }

    protected void KEYPRESSED(int i2) {
    }

    protected void KEYRELEASED(int i2) {
    }

    protected void KEYREPEATED(int i2) {
    }

    public int getGameAction(int i2) {
        boolean flag = false;
        for (int k2 = 0; k2 < this.n; ++k2) {
            if (this.CodeTo[k2] != i2) continue;
            flag = true;
            int j2 = super.getGameAction(this.CodeFrom[k2]);
            if (j2 == 0) continue;
            return j2;
        }
        return flag ? 0 : super.getGameAction(i2);
    }

    public int getKeyCode(int i2) {
        return this.codes[i2] == 0 ? super.getKeyCode(i2) : this.codes[i2];
    }

    public String getKeyName(int i2) {
        for (int j2 = 0; j2 < this.n; ++j2) {
            if (this.CodeTo[j2] != i2) continue;
            return super.getKeyName(this.CodeFrom[j2]);
        }
        return super.getKeyName(i2);
    }

    public int getWidth() {
        return 240;
    }

    public int getHeight() {
        return 320;
    }

    protected void sizeChanged(int i2, int j2) {
        this.setFullScreenMode(this.setFullScreen);
    }
}

