// 
// Decompiled by Procyon v0.5.36
// 

package DEOBFUSCATED-NAMES;

import net.minecraft.client.entity.EntityPlayerSP;
import keystrokesmod.bb;

public class ff extends bb
{
    public static dc dc;
    public static ap a;
    public static cb b;
    
    public ff() {
        super(new char[] { 'F', 'a', 'l', 'l', 'S', 'p', 'e', 'e', 'd' }, bb.player, 0);
        this.registerSetting(ff.dc = new dc(new String(new char[] { 'V', 'a', 'n', 'i', 'l', 'l', 'a', ' ', 'm', 'a', 'x', ':', ' ', '3', '.', '9', '2' })));
        this.registerSetting(ff.a = new ap(new char[] { 'M', 'o', 't', 'i', 'o', 'n' }, 5.0, 0.0, 8.0, 0.1));
        this.registerSetting(ff.b = new cb(new char[] { 'D', 'i', 's', 'a', 'b', 'l', 'e', ' ', 'X', 'Z', ' ', 'm', 'o', 't', 'i', 'o', 'n' }, true));
    }
    
    @Override
    public void update() {
        if (ff.mc.field_71439_g.field_70143_R >= 2.5) {
            if (m2.ao.isEnabled() || m2.nf.isEnabled()) {
                return;
            }
            if (ff.mc.field_71439_g.field_71075_bZ.field_75098_d || ff.mc.field_71439_g.field_71075_bZ.field_75100_b) {
                return;
            }
            if (ff.mc.field_71439_g.func_70617_f_() || ff.mc.field_71439_g.func_70090_H() || ff.mc.field_71439_g.func_180799_ab()) {
                return;
            }
            ff.mc.field_71439_g.field_70181_x = -ff.a.getInput();
            if (ff.b.isToggled()) {
                final EntityPlayerSP field_71439_g = ff.mc.field_71439_g;
                final EntityPlayerSP field_71439_g2 = ff.mc.field_71439_g;
                final double n = 0.0;
                field_71439_g2.field_70179_y = n;
                field_71439_g.field_70159_w = n;
            }
        }
    }
}
