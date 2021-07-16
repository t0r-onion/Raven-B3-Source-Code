// 
// Decompiled by Procyon v0.5.36
// 

package DEOBFUSCATED-NAMES;

import keystrokesmod.bb;

public class sm extends bb
{
    public static cb a;
    public static cb b;
    public static cb c;
    
    public sm() {
        super(new char[] { 'S', 't', 'o', 'p', ' ', 'M', 'o', 't', 'i', 'o', 'n' }, bb.movement, 0);
        this.registerSetting(sm.a = new cb(new char[] { 'S', 't', 'o', 'p', ' ', 'X' }, true));
        this.registerSetting(sm.b = new cb(new char[] { 'S', 't', 'o', 'p', ' ', 'Y' }, true));
        this.registerSetting(sm.c = new cb(new char[] { 'S', 't', 'o', 'p', ' ', 'Z' }, true));
    }
    
    @Override
    public void onEnable() {
        if (sm.a.isToggled()) {
            sm.mc.field_71439_g.field_70159_w = 0.0;
        }
        if (sm.b.isToggled()) {
            sm.mc.field_71439_g.field_70181_x = 0.0;
        }
        if (sm.c.isToggled()) {
            sm.mc.field_71439_g.field_70179_y = 0.0;
        }
        this.disable();
    }
}
