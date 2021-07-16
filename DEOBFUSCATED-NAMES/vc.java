// 
// Decompiled by Procyon v0.5.36
// 

package DEOBFUSCATED-NAMES;

import keystrokesmod.bb;

public class vc extends bb
{
    public static ap a;
    
    public vc() {
        super(new char[] { 'V', 'C', 'l', 'i', 'p' }, bb.movement, 0);
        this.registerSetting(vc.a = new ap(new char[] { 'D', 'i', 's', 't', 'a', 'c', 'e' }, 2.0, -10.0, 10.0, 0.5));
    }
    
    @Override
    public void onEnable() {
        if (vc.a.getInput() != 0.0) {
            vc.mc.field_71439_g.func_70107_b(vc.mc.field_71439_g.field_70165_t, vc.mc.field_71439_g.field_70163_u + vc.a.getInput(), vc.mc.field_71439_g.field_70161_v);
        }
        this.disable();
    }
}
