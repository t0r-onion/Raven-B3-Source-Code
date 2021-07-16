// 
// Decompiled by Procyon v0.5.36
// 

package DEOBFUSCATED-NAMES;

import keystrokesmod.bb;

public class cd extends bb
{
    public static boolean a;
    public static boolean b;
    public static am an;
    public static cb m;
    
    public cd() {
        super(new char[] { 'C', 'o', 'm', 'm', 'a', 'n', 'd', ' ', 'l', 'i', 'n', 'e' }, bb.client, 0);
        this.registerSetting(cd.m = new cb(new char[] { 'A', 'n', 'i', 'm', 'a', 't', 'e' }, true));
    }
    
    @Override
    public void onEnable() {
        gc.setccs();
        cd.a = true;
        cd.b = false;
        (cd.an = new am(500.0f)).start();
    }
    
    @Override
    public void onDisable() {
        cd.b = true;
        if (cd.an != null) {
            cd.an.start();
        }
        gc.od();
    }
    
    static {
        cd.a = false;
        cd.b = false;
    }
}
