// 
// Decompiled by Procyon v0.5.36
// 

package DEOBFUSCATED-NAMES;

import org.lwjgl.input.Mouse;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.MovementInput;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemBlock;
import net.minecraft.entity.Entity;
import net.minecraft.client.Minecraft;

public class ev
{
    private static final Minecraft mc;
    
    public static String r(String s) {
        if (m2.nhm.isEnabled()) {
            s = nhm.r(s);
        }
        if (m2.as.isEnabled()) {
            s = as.r(s);
        }
        if (m2.ec.isEnabled()) {
            s = ec.r(s);
        }
        return s;
    }
    
    public static boolean edg(final Entity en) {
        if (en != ev.mc.field_71439_g || !ev.mc.field_71439_g.field_70122_E) {
            return false;
        }
        if (m2.sw.isEnabled() && !sw.a.isToggled()) {
            if (sw.b.isToggled()) {
                final ItemStack i = ev.mc.field_71439_g.func_70694_bm();
                if (i == null || !(i.func_77973_b() instanceof ItemBlock)) {
                    return ev.mc.field_71439_g.func_70093_af();
                }
            }
            return true;
        }
        return ev.mc.field_71439_g.func_70093_af();
    }
    
    public static void sl() {
        if (m2.ns.isEnabled()) {
            ns.sl();
            return;
        }
        final MovementInput field_71158_b = ev.mc.field_71439_g.field_71158_b;
        field_71158_b.field_78902_a *= 0.2f;
        final MovementInput field_71158_b2 = ev.mc.field_71439_g.field_71158_b;
        field_71158_b2.field_78900_b *= 0.2f;
    }
    
    public static void sl2(final Entity en) {
        if (m2.kp.isEnabled()) {
            kp.sl(en);
            return;
        }
        final EntityPlayerSP field_71439_g = ev.mc.field_71439_g;
        field_71439_g.field_70159_w *= 0.6;
        final EntityPlayerSP field_71439_g2 = ev.mc.field_71439_g;
        field_71439_g2.field_70179_y *= 0.6;
    }
    
    public static void gmo() {
        if (m2.a.isEnabled() && a.p.isToggled() && Mouse.isButtonDown(0) && a8.call()) {
            return;
        }
        ev.mc.field_71460_t.func_78473_a(1.0f);
    }
    
    static {
        mc = Minecraft.func_71410_x();
    }
}
