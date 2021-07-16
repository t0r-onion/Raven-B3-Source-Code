// 
// Decompiled by Procyon v0.5.36
// 

package DEOBFUSCATED-NAMES;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import keystrokesmod.bb;

public class sw extends bb
{
    public static cb a;
    public static cb b;
    private static boolean c;
    private static boolean d;
    
    public sw() {
        super(new char[] { 'S', 'a', 'f', 'e', 'W', 'a', 'l', 'k' }, bb.player, 0);
        this.registerSetting(sw.a = new cb(new char[] { 'S', 'h', 'i', 'f', 't' }, false));
        this.registerSetting(sw.b = new cb(new char[] { 'B', 'l', 'o', 'c', 'k', 's', ' ', 'o', 'n', 'l', 'y' }, true));
    }
    
    @Override
    public void onDisable() {
        if (sw.a.isToggled() && ay.eob()) {
            this.sh(false);
        }
        sw.c = false;
        sw.d = false;
    }
    
    @SubscribeEvent
    public void p(final TickEvent.PlayerTickEvent e) {
        if (!ay.e() || !sw.a.isToggled()) {
            return;
        }
        if (sw.mc.field_71439_g.field_70122_E) {
            if (ay.eob()) {
                if (sw.b.isToggled()) {
                    final ItemStack i = sw.mc.field_71439_g.func_70694_bm();
                    if (i == null || !(i.func_77973_b() instanceof ItemBlock)) {
                        if (sw.d) {
                            this.sh(sw.d = false);
                        }
                        return;
                    }
                }
                this.sh(sw.d = true);
                sw.c = true;
            }
            else if (sw.d) {
                this.sh(sw.d = false);
            }
        }
        if (sw.c && sw.mc.field_71439_g.field_71075_bZ.field_75100_b) {
            this.sh(false);
            sw.c = false;
        }
    }
    
    private void sh(final boolean sh) {
        KeyBinding.func_74510_a(sw.mc.field_71474_y.field_74311_E.func_151463_i(), sh);
    }
    
    static {
        sw.c = false;
        sw.d = false;
    }
}
