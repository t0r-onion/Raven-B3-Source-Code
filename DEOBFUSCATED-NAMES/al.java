// 
// Decompiled by Procyon v0.5.36
// 

package DEOBFUSCATED-NAMES;

import java.util.Iterator;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import keystrokesmod.bb;

public class al extends bb
{
    public static ap a;
    public static ap b;
    public static ap c;
    public static cb d;
    public static cb e;
    public static cb f;
    public static cb g;
    
    public al() {
        super(new char[] { 'A', 'i', 'm', 'A', 's', 's', 'i', 's', 't' }, bb.combat, 0);
        this.registerSetting(al.a = new ap(new char[] { 'S', 'p', 'e', 'e', 'd' }, 45.0, 1.0, 100.0, 1.0));
        this.registerSetting(al.b = new ap(new char[] { 'F', 'O', 'V' }, 90.0, 15.0, 180.0, 1.0));
        this.registerSetting(al.c = new ap(new char[] { 'D', 'i', 's', 't', 'a', 'n', 'c', 'e' }, 4.5, 1.0, 10.0, 0.5));
        this.registerSetting(al.d = new cb(new char[] { 'C', 'l', 'i', 'c', 'k', ' ', 'a', 'i', 'm' }, true));
        this.registerSetting(al.e = new cb(new char[] { 'W', 'e', 'a', 'p', 'o', 'n', ' ', 'o', 'n', 'l', 'y' }, false));
        this.registerSetting(al.f = new cb(new char[] { 'A', 'i', 'm', ' ', 'i', 'n', 'v', 'i', 's' }, false));
        this.registerSetting(al.g = new cb(new char[] { 'B', 'l', 'a', 't', 'a', 'n', 't', ' ', 'm', 'o', 'd', 'e' }, false));
    }
    
    @Override
    public void update() {
        if (al.mc.field_71462_r != null || !al.mc.field_71415_G) {
            return;
        }
        if (al.e.isToggled() && !ay.wpn()) {
            return;
        }
        if (al.d.isToggled() && !ay.ilc()) {
            return;
        }
        final Entity en = this.gE();
        if (en != null) {
            if (w.dbg) {
                ay.sm(this.g3tN4m3() + " &e" + en.func_70005_c_());
            }
            if (al.g.isToggled()) {
                ay.aim(en, 0.0f, false);
            }
            else {
                final double n = ay.n(en);
                if (n > 1.0 || n < -1.0) {
                    final float val = (float)(-(n / (101.0 - al.a.getInput())));
                    final EntityPlayerSP field_71439_g = al.mc.field_71439_g;
                    field_71439_g.field_70177_z += val;
                }
            }
        }
    }
    
    public Entity gE() {
        final int fov = (int)al.b.getInput();
        for (final EntityPlayer en : al.mc.field_71441_e.field_73010_i) {
            if (en != al.mc.field_71439_g && en.field_70725_aQ == 0) {
                if (!al.f.isToggled() && en.func_82150_aj()) {
                    continue;
                }
                if (al.mc.field_71439_g.func_70032_d((Entity)en) > al.c.getInput()) {
                    continue;
                }
                if (an.bot((Entity)en)) {
                    continue;
                }
                if (!al.g.isToggled() && !ay.fov((Entity)en, (float)fov)) {
                    continue;
                }
                return (Entity)en;
            }
        }
        return null;
    }
}
