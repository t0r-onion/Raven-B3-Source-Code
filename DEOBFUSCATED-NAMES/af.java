// 
// Decompiled by Procyon v0.5.36
// 

package DEOBFUSCATED-NAMES;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.entity.EntityPlayerSP;
import org.lwjgl.input.Keyboard;
import net.minecraftforge.event.entity.living.LivingEvent;
import keystrokesmod.bb;

public class af extends bb
{
    public static ap a;
    public static ap b;
    public static ap c;
    public static cb d;
    public static cb e;
    
    public af() {
        super(new char[] { 'V', 'e', 'l', 'o', 'c', 'i', 't', 'y' }, bb.combat, 0);
        this.registerSetting(af.a = new ap(new char[] { 'H', 'o', 'r', 'i', 'z', 'o', 'n', 't', 'a', 'l' }, 90.0, 0.0, 100.0, 1.0));
        this.registerSetting(af.b = new ap(new char[] { 'V', 'e', 'r', 't', 'i', 'c', 'a', 'l' }, 100.0, 0.0, 100.0, 1.0));
        this.registerSetting(af.c = new ap(new char[] { 'C', 'h', 'a', 'n', 'c', 'e' }, 100.0, 0.0, 100.0, 1.0));
        this.registerSetting(af.d = new cb(new char[] { 'O', 'n', 'l', 'y', ' ', 'w', 'h', 'i', 'l', 'e', ' ', 't', 'a', 'r', 'g', 'e', 't', 'i', 'n', 'g' }, false));
        this.registerSetting(af.e = new cb(new char[] { 'D', 'i', 's', 'a', 'b', 'l', 'e', ' ', 'w', 'h', 'i', 'l', 'e', ' ', 'h', 'o', 'l', 'd', 'i', 'n', 'g', ' ', 'S' }, false));
    }
    
    @SubscribeEvent
    public void c(final LivingEvent.LivingUpdateEvent ev) {
        if (ay.e() && af.mc.field_71439_g.field_70738_aO > 0 && af.mc.field_71439_g.field_70737_aN == af.mc.field_71439_g.field_70738_aO) {
            if (af.d.isToggled() && (af.mc.field_71476_x == null || af.mc.field_71476_x.field_72308_g == null)) {
                return;
            }
            if (af.e.isToggled() && Keyboard.isKeyDown(af.mc.field_71474_y.field_74368_y.func_151463_i())) {
                return;
            }
            if (af.c.getInput() != 100.0) {
                final double ch = Math.random();
                if (ch >= af.c.getInput() / 100.0) {
                    return;
                }
            }
            if (af.a.getInput() != 100.0) {
                final EntityPlayerSP field_71439_g = af.mc.field_71439_g;
                field_71439_g.field_70159_w *= af.a.getInput() / 100.0;
                final EntityPlayerSP field_71439_g2 = af.mc.field_71439_g;
                field_71439_g2.field_70179_y *= af.a.getInput() / 100.0;
            }
            if (af.b.getInput() != 100.0) {
                final EntityPlayerSP field_71439_g3 = af.mc.field_71439_g;
                field_71439_g3.field_70181_x *= af.b.getInput() / 100.0;
            }
        }
    }
}
