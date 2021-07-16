// 
// Decompiled by Procyon v0.5.36
// 

package DEOBFUSCATED-NAMES;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraft.client.Minecraft;
import java.lang.reflect.Field;
import keystrokesmod.bb;

public class ld extends bb
{
    public static dc a;
    private Field l;
    
    public ld() {
        super(new char[] { 'D', 'e', 'l', 'a', 'y', ' ', 'R', 'e', 'm', 'o', 'v', 'e', 'r' }, bb.combat, 0);
        this.l = null;
        this.registerSetting(ld.a = new dc(new String(new char[] { 'G', 'i', 'v', 'e', 's', ' ', 'y', 'o', 'u', ' ', '1', '.', '7', ' ', 'h', 'i', 't', 'r', 'e', 'g', '.' })));
    }
    
    @Override
    public void onEnable() {
        try {
            this.l = Minecraft.class.getDeclaredField(new String(new char[] { 'f', 'i', 'e', 'l', 'd', '_', '7', '1', '4', '2', '9', '_', 'W' }));
        }
        catch (Exception er) {
            try {
                this.l = Minecraft.class.getDeclaredField(new String(new char[] { 'l', 'e', 'f', 't', 'C', 'l', 'i', 'c', 'k', 'C', 'o', 'u', 'n', 't', 'e', 'r' }));
            }
            catch (Exception ex) {}
        }
        if (this.l != null) {
            this.l.setAccessible(true);
        }
        else {
            this.disable();
        }
    }
    
    @SubscribeEvent
    public void a(final TickEvent.PlayerTickEvent b) {
        if (ay.e() && this.l != null) {
            if (!ld.mc.field_71415_G || ld.mc.field_71439_g.field_71075_bZ.field_75098_d) {
                return;
            }
            try {
                this.l.set(ld.mc, 0);
            }
            catch (IllegalAccessException ex) {}
            catch (IndexOutOfBoundsException ex2) {}
        }
    }
}
