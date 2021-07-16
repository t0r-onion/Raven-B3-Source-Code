// 
// Decompiled by Procyon v0.5.36
// 

package DEOBFUSCATED-NAMES;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import keystrokesmod.bb;

public class sr extends bb
{
    public static cb a;
    
    public sr() {
        super(new char[] { 'S', 'p', 'r', 'i', 'n', 't' }, bb.movement, 0);
        this.registerSetting(sr.a = new cb(new char[] { 'O', 'm', 'n', 'i', 'S', 'p', 'r', 'i', 'n', 't' }, false));
    }
    
    @SubscribeEvent
    public void p(final TickEvent.PlayerTickEvent e) {
        if (ay.e() && sr.mc.field_71415_G) {
            final EntityPlayerSP p = sr.mc.field_71439_g;
            if (sr.a.isToggled()) {
                if (ay.im() && p.func_71024_bL().func_75116_a() > 6) {
                    p.func_70031_b(true);
                }
            }
            else {
                KeyBinding.func_74510_a(sr.mc.field_71474_y.field_151444_V.func_151463_i(), true);
            }
        }
    }
}
