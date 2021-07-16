// 
// Decompiled by Procyon v0.5.36
// 

package DEOBFUSCATED-NAMES;

import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import keystrokesmod.bb;

public class kp extends bb
{
    public static dc a;
    public static ap b;
    public static cb c;
    
    public kp() {
        super(new char[] { 'K', 'e', 'e', 'p', 'S', 'p', 'r', 'i', 'n', 't' }, bb.movement, 0);
        this.registerSetting(kp.a = new dc(new String(new char[] { 'D', 'e', 'f', 'a', 'u', 'l', 't', ' ', 'i', 's', ' ', '4', '0', '%', ' ', 'm', 'o', 't', 'i', 'o', 'n', ' ', 'r', 'e', 'd', 'u', 'c', 't', 'i', 'o', 'n', '.' })));
        this.registerSetting(kp.b = new ap(new char[] { 'S', 'l', 'o', 'w', ' ', '%' }, 40.0, 0.0, 40.0, 1.0));
        this.registerSetting(kp.c = new cb(new char[] { 'O', 'n', 'l', 'y', ' ', 'r', 'e', 'd', 'u', 'c', 'e', ' ', 'r', 'e', 'a', 'c', 'h', ' ', 'h', 'i', 't', 's' }, false));
    }
    
    public static void sl(final Entity en) {
        if (kp.c.isToggled() && m2.a8.isEnabled() && !kp.mc.field_71439_g.field_71075_bZ.field_75098_d) {
            final double dist = kp.mc.field_71476_x.field_72307_f.func_72438_d(kp.mc.func_175606_aa().func_174824_e(1.0f));
            double val;
            if (dist > 3.0) {
                val = (100.0 - (float)kp.b.getInput()) / 100.0;
            }
            else {
                val = 0.6;
            }
            final EntityPlayerSP field_71439_g = kp.mc.field_71439_g;
            field_71439_g.field_70159_w *= val;
            final EntityPlayerSP field_71439_g2 = kp.mc.field_71439_g;
            field_71439_g2.field_70179_y *= val;
            return;
        }
        final double val2 = (100.0 - (float)kp.b.getInput()) / 100.0;
        final EntityPlayerSP field_71439_g3 = kp.mc.field_71439_g;
        field_71439_g3.field_70159_w *= val2;
        final EntityPlayerSP field_71439_g4 = kp.mc.field_71439_g;
        field_71439_g4.field_70179_y *= val2;
    }
}
