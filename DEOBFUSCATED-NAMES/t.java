// 
// Decompiled by Procyon v0.5.36
// 

package DEOBFUSCATED-NAMES;

import keystrokesmod.bb;

public class t extends bb
{
    public static ap a;
    public static cb b;
    
    public t() {
        super(new char[] { 'T', 'i', 'm', 'e', 'r' }, bb.movement, 0);
        t.a = new ap(new char[] { 'S', 'p', 'e', 'e', 'd' }, 1.0, 0.5, 2.5, 0.01);
        t.b = new cb(new char[] { 'S', 't', 'r', 'a', 'f', 'e', ' ', 'o', 'n', 'l', 'y' }, false);
        this.registerSetting(t.a);
        this.registerSetting(t.b);
    }
    
    @Override
    public void update() {
        if (!(t.mc.field_71462_r instanceof m)) {
            if (t.b.isToggled() && t.mc.field_71439_g.field_70702_br == 0.0f) {
                ay.rt();
                return;
            }
            ay.gt().field_74278_d = (float)t.a.getInput();
        }
        else {
            ay.rt();
        }
    }
    
    @Override
    public void onDisable() {
        ay.rt();
    }
}
