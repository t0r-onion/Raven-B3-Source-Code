// 
// Decompiled by Procyon v0.5.36
// 

package DEOBFUSCATED-NAMES;

import net.minecraft.client.settings.KeyBinding;
import keystrokesmod.bb;

public class bh extends bb
{
    public static ap a;
    private final double bspd = 0.0025;
    
    public bh() {
        super(new char[] { 'B', 'h', 'o', 'p' }, bb.movement, 0);
        this.registerSetting(bh.a = new ap(new char[] { 'S', 'p', 'e', 'e', 'd' }, 2.0, 1.0, 15.0, 0.2));
    }
    
    @Override
    public void update() {
        if (m2.ao.isEnabled() || !ay.im() || bh.mc.field_71439_g.func_70090_H()) {
            return;
        }
        KeyBinding.func_74510_a(bh.mc.field_71474_y.field_74314_A.func_151463_i(), false);
        bh.mc.field_71439_g.field_70145_X = true;
        if (bh.mc.field_71439_g.field_70122_E) {
            bh.mc.field_71439_g.func_70664_aZ();
        }
        bh.mc.field_71439_g.func_70031_b(true);
        final double spd = 0.0025 * bh.a.getInput();
        final double m = (float)(Math.sqrt(bh.mc.field_71439_g.field_70159_w * bh.mc.field_71439_g.field_70159_w + bh.mc.field_71439_g.field_70179_y * bh.mc.field_71439_g.field_70179_y) + spd);
        ay.ss2(m);
    }
}
