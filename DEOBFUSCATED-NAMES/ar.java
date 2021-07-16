// 
// Decompiled by Procyon v0.5.36
// 

package DEOBFUSCATED-NAMES;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import keystrokesmod.bb;

public class ar extends bb
{
    public static cb b;
    private boolean c;
    
    public ar() {
        super(new char[] { 'A', 'u', 't', 'o', 'J', 'u', 'm', 'p' }, bb.player, 0);
        this.c = false;
        this.registerSetting(ar.b = new cb(new char[] { 'C', 'a', 'n', 'c', 'e', 'l', ' ', 'w', 'h', 'e', 'n', ' ', 's', 'h', 'i', 'f', 't', 'i', 'n', 'g' }, true));
    }
    
    @Override
    public void onDisable() {
        this.ju(this.c = false);
    }
    
    @SubscribeEvent
    public void p(final TickEvent.PlayerTickEvent e) {
        if (!ay.e()) {
            return;
        }
        if (ar.mc.field_71439_g.field_70122_E && (!ar.b.isToggled() || !ar.mc.field_71439_g.func_70093_af())) {
            if (ar.mc.field_71441_e.func_72945_a((Entity)ar.mc.field_71439_g, ar.mc.field_71439_g.func_174813_aQ().func_72317_d(ar.mc.field_71439_g.field_70159_w / 3.0, -1.0, ar.mc.field_71439_g.field_70179_y / 3.0)).isEmpty()) {
                this.ju(this.c = true);
            }
            else if (this.c) {
                this.ju(this.c = false);
            }
        }
        else if (this.c) {
            this.ju(this.c = false);
        }
    }
    
    private void ju(final boolean ju) {
        KeyBinding.func_74510_a(ar.mc.field_71474_y.field_74314_A.func_151463_i(), ju);
    }
}
