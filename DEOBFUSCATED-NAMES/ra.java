// 
// Decompiled by Procyon v0.5.36
// 

package DEOBFUSCATED-NAMES;

import java.util.Iterator;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFishingRod;
import net.minecraftforge.client.event.MouseEvent;
import keystrokesmod.bb;

public class ra extends bb
{
    public static ap a;
    public static ap b;
    public static cb c;
    
    public ra() {
        super(new char[] { 'R', 'o', 'd', 'A', 'i', 'm', 'b', 'o', 't' }, bb.combat, 0);
        this.registerSetting(ra.a = new ap(new char[] { 'F', 'O', 'V' }, 90.0, 15.0, 360.0, 1.0));
        this.registerSetting(ra.b = new ap(new char[] { 'D', 'i', 's', 't', 'a', 'n', 'c', 'e' }, 4.5, 1.0, 10.0, 0.5));
        this.registerSetting(ra.c = new cb(new char[] { 'A', 'i', 'm', ' ', 'i', 'n', 'v', 'i', 's' }, false));
    }
    
    @SubscribeEvent
    public void x(final MouseEvent ev) {
        if (ev.button != 1 || !ev.buttonstate || !ay.e() || ra.mc.field_71462_r != null) {
            return;
        }
        if (ra.mc.field_71439_g.func_71045_bC() != null && ra.mc.field_71439_g.func_71045_bC().func_77973_b() instanceof ItemFishingRod && ra.mc.field_71439_g.field_71104_cf == null) {
            final Entity en = this.gE();
            if (en != null) {
                ev.setCanceled(true);
                ay.aim(en, -7.0f, true);
                ra.mc.field_71442_b.func_78769_a((EntityPlayer)ra.mc.field_71439_g, (World)ra.mc.field_71441_e, ra.mc.field_71439_g.func_71045_bC());
            }
        }
    }
    
    public Entity gE() {
        final int f = (int)ra.a.getInput();
        for (final EntityPlayer en : ra.mc.field_71441_e.field_73010_i) {
            if (en != ra.mc.field_71439_g && en.field_70725_aQ == 0) {
                if (!ra.c.isToggled() && en.func_82150_aj()) {
                    continue;
                }
                if (ra.mc.field_71439_g.func_70032_d((Entity)en) > ra.b.getInput()) {
                    continue;
                }
                if (an.bot((Entity)en)) {
                    continue;
                }
                if (!ay.fov((Entity)en, (float)f)) {
                    continue;
                }
                return (Entity)en;
            }
        }
        return null;
    }
}
