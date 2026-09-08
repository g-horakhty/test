/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Alert
 *  javax.microedition.lcdui.Command
 *  javax.microedition.lcdui.CommandListener
 *  javax.microedition.lcdui.Display
 *  javax.microedition.lcdui.Displayable
 *  javax.microedition.lcdui.Form
 *  javax.microedition.lcdui.Ticker
 *  javax.microedition.midlet.MIDlet
 */
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Ticker;
import javax.microedition.midlet.MIDlet;

public class TrialOnLaunches
implements CommandListener {
    public static byte[] b = new byte[]{115, 111, 103, 111, 121, 111, 46, 99, 110};
    static final String s = new String(b);
    protected static String _statusMessage;
    private static Alert _alert;
    private static Display _display;
    private static Displayable _displayable;
    private static boolean _isCheckedExpiration;
    protected static MIDlet _originalMidlet;
    protected static Command _okCommand;
    public static boolean stopFlag;
    public static byte a;

    static {
        _alert = null;
        _display = null;
        _displayable = null;
        _isCheckedExpiration = false;
        stopFlag = true;
        a = 0;
    }

    protected static void log(String s2) {
        _statusMessage = s2;
    }

    public static void clearIsCheckedExpiration() {
        _isCheckedExpiration = false;
        _display = null;
        _displayable = null;
        _alert = null;
    }

    public static void lshjavaCheckedExpiration() {
        if (_display != null && _displayable != null) {
            if (_alert != null) {
                _display.setCurrent(_alert, _displayable);
            } else {
                _display.setCurrent(_displayable);
            }
        }
        _isCheckedExpiration = true;
    }

    public static void setCurrent(Display display, Alert alert, Displayable displayable) {
        if (!_isCheckedExpiration) {
            _display = display;
            _displayable = displayable;
            _alert = alert;
        } else {
            display.setCurrent(alert, displayable);
        }
    }

    public static void setCurrent(Display display, Displayable displayable) {
        if (!_isCheckedExpiration) {
            _display = display;
            _displayable = displayable;
            _alert = null;
        } else {
            display.setCurrent(displayable);
        }
    }

    public void commandAction(Command command, Displayable displayable) {
        if (command.getCommandType() == 4) {
            a = 1;
        }
        stopFlag = false;
    }

    public static void displayMessage(String string) {
        Form form = new Form("\u641c\u72d7\u6e38\u6e29\u99a8\u63d0\u793a!");
        form.append(string);
        form.addCommand(new Command("\u6469\u6258", 4, 1));
        form.addCommand(new Command("\u7d22\u8bfa", 2, 1));
        form.setCommandListener((CommandListener)new TrialOnLaunches());
        form.setTicker(new Ticker(s));
        Display.getDisplay((MIDlet)_originalMidlet).setCurrent((Displayable)form);
    }

    public static boolean expirationOnLaunches(MIDlet mIDlet) {
        _originalMidlet = mIDlet;
        TrialOnLaunches.displayMessage("\u672c\u6e38\u620f\u7531LSHJAVA\u79fb\u690d,\u8bf7\u9009\u62e9\u624b\u673a\u673a\u578b!\u66f4\u591a\u72ec\u5bb6\u79fb\u690d,\u7834\u89e3\u6e38\u620f\u8bf7\u767b\u9646\u624b\u6e38\u5206\u4eab\u95e8\u6237\u641c\u72d7\u6e38--SOGOYO.CN.");
        while (stopFlag) {
        }
        return false;
    }
}

