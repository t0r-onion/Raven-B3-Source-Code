// 
// Decompiled by Procyon v0.5.36
// 

package DEOBFUSCATED-NAMES;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import java.lang.reflect.Field;
import keystrokesmod.bb;

public class aa extends bb
{
    public static ap a;
    public static cb b;
    public static Field r;
    
    public aa() {
        super(new char[] { 'F', 'a', 's', 't', 'P', 'l', 'a', 'c', 'e' }, bb.player, 0);
        this.registerSetting(aa.a = new ap(new char[] { 'D', 'e', 'l', 'a', 'y' }, 0.0, 0.0, 4.0, 1.0));
        this.registerSetting(aa.b = new cb(new char[] { 'B', 'l', 'o', 'c', 'k', 's', ' ', 'o', 'n', 'l', 'y' }, true));
        try {
            aa.r = aa.mc.getClass().getDeclaredField(new String(new char[] { 'f', 'i', 'e', 'l', 'd', '_', '7', '1', '4', '6', '7', '_', 'a', 'c' }));
        }
        catch (Exception er) {
            try {
                aa.r = aa.mc.getClass().getDeclaredField(new String(new char[] { 'r', 'i', 'g', 'h', 't', 'C', 'l', 'i', 'c', 'k', 'D', 'e', 'l', 'a', 'y', 'T', 'i', 'm', 'e', 'r' }));
            }
            catch (Exception ex) {}
        }
        if (aa.r != null) {
            aa.r.setAccessible(true);
        }
    }
    
    @Override
    public void onEnable() {
        if (aa.r == null) {
            this.disable();
        }
    }
    
    @SubscribeEvent
    public void a(final TickEvent.PlayerTickEvent e) {
        if (e.phase != TickEvent.Phase.END) {
            return;
        }
        if (ay.e() && aa.mc.field_71415_G && aa.r != null) {
            if (aa.b.isToggled()) {
                final ItemStack item = aa.mc.field_71439_g.func_70694_bm();
                if (item == null || !(item.func_77973_b() instanceof ItemBlock)) {
                    return;
                }
            }
            try {
                final int c = (int)aa.a.getInput();
                if (c == 0) {
                    aa.r.set(aa.mc, 0);
                }
                else {
                    if (c == 4) {
                        return;
                    }
                    final int d = aa.r.getInt(aa.mc);
                    if (d == 4) {
                        aa.r.set(aa.mc, c);
                    }
                }
            }
            catch (IllegalAccessException ex) {}
            catch (IndexOutOfBoundsException ex2) {}
        }
    }
    
    static {
        aa.r = null;
    }
}
