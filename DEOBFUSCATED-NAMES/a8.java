// 
// Decompiled by Procyon v0.5.36
// 

package DEOBFUSCATED-NAMES;

import net.minecraft.util.AxisAlignedBB;
import java.util.List;
import net.minecraft.entity.item.EntityItemFrame;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.input.Mouse;
import net.minecraftforge.client.event.MouseEvent;
import keystrokesmod.bb;

public class a8 extends bb
{
    public static ap a;
    public static ap b;
    public static cb c;
    public static cb d;
    public static cb e;
    public static cb f;
    
    public a8() {
        super(new char[] { 'R', 'e', 'a', 'c', 'h' }, bb.combat, 0);
        this.registerSetting(a8.a = new ap(new char[] { 'M', 'i', 'n' }, 3.1, 3.0, 6.0, 0.05));
        this.registerSetting(a8.b = new ap(new char[] { 'M', 'a', 'x' }, 3.3, 3.0, 6.0, 0.05));
        this.registerSetting(a8.c = new cb(new char[] { 'W', 'e', 'a', 'p', 'o', 'n', ' ', 'o', 'n', 'l', 'y' }, false));
        this.registerSetting(a8.d = new cb(new char[] { 'M', 'o', 'v', 'i', 'n', 'g', ' ', 'o', 'n', 'l', 'y' }, false));
        this.registerSetting(a8.e = new cb(new char[] { 'S', 'p', 'r', 'i', 'n', 't', ' ', 'o', 'n', 'l', 'y' }, false));
        this.registerSetting(a8.f = new cb(new char[] { 'H', 'i', 't', ' ', 't', 'h', 'r', 'o', 'u', 'g', 'h', ' ', 'b', 'l', 'o', 'c', 'k', 's' }, false));
    }
    
    @Override
    public void guiUpdate() {
        ay.b(a8.a, a8.b);
    }
    
    @SubscribeEvent
    public void e(final MouseEvent ev) {
        if (ev.button < 0 || !ev.buttonstate || !ay.e() || (m2.a.isEnabled() && DEOBFUSCATED-NAMES.a.p.isToggled() && Mouse.isButtonDown(0))) {
            return;
        }
        call();
    }
    
    public static boolean call() {
        if (!ay.e()) {
            return false;
        }
        if (a8.c.isToggled() && !ay.wpn()) {
            return false;
        }
        if (a8.d.isToggled() && a8.mc.field_71439_g.field_70701_bs == 0.0 && a8.mc.field_71439_g.field_70702_br == 0.0) {
            return false;
        }
        if (a8.e.isToggled() && !a8.mc.field_71439_g.func_70051_ag()) {
            return false;
        }
        if (!a8.f.isToggled() && a8.mc.field_71476_x != null) {
            final BlockPos p = a8.mc.field_71476_x.func_178782_a();
            if (p != null && a8.mc.field_71441_e.func_180495_p(p).func_177230_c() != Blocks.field_150350_a) {
                return false;
            }
        }
        final double r = ay.mmVal(a8.a, a8.b, ay.rand());
        final Object[] o = zz(r, 0.0);
        if (o == null) {
            return false;
        }
        final Entity en = (Entity)o[0];
        a8.mc.field_71476_x = new MovingObjectPosition(en, (Vec3)o[1]);
        a8.mc.field_147125_j = en;
        return true;
    }
    
    private static Object[] zz(double zzD, final double zzE) {
        if (!m2.a8.isEnabled()) {
            zzD = (a8.mc.field_71442_b.func_78749_i() ? 6.0 : 3.0);
        }
        final Entity zz2 = a8.mc.func_175606_aa();
        Entity entity = null;
        if (zz2 == null) {
            return null;
        }
        a8.mc.field_71424_I.func_76320_a("pick");
        final Vec3 zz3 = zz2.func_174824_e(1.0f);
        final Vec3 zz4 = zz2.func_70676_i(1.0f);
        final Vec3 zz5 = zz3.func_72441_c(zz4.field_72450_a * zzD, zz4.field_72448_b * zzD, zz4.field_72449_c * zzD);
        Vec3 zz6 = null;
        final List zz7 = a8.mc.field_71441_e.func_72839_b(zz2, zz2.func_174813_aQ().func_72321_a(zz4.field_72450_a * zzD, zz4.field_72448_b * zzD, zz4.field_72449_c * zzD).func_72314_b(1.0, 1.0, 1.0));
        double zz8 = zzD;
        for (int zz9 = 0; zz9 < zz7.size(); ++zz9) {
            final Entity zz10 = zz7.get(zz9);
            if (zz10.func_70067_L()) {
                final float ex = (float)(zz10.func_70111_Y() * hb.exp(zz10));
                AxisAlignedBB zz11 = zz10.func_174813_aQ().func_72314_b((double)ex, (double)ex, (double)ex);
                zz11 = zz11.func_72314_b(zzE, zzE, zzE);
                final MovingObjectPosition zz12 = zz11.func_72327_a(zz3, zz5);
                if (zz11.func_72318_a(zz3)) {
                    if (0.0 < zz8 || zz8 == 0.0) {
                        entity = zz10;
                        zz6 = ((zz12 == null) ? zz3 : zz12.field_72307_f);
                        zz8 = 0.0;
                    }
                }
                else if (zz12 != null) {
                    final double zz13 = zz3.func_72438_d(zz12.field_72307_f);
                    if (zz13 < zz8 || zz8 == 0.0) {
                        if (zz10 == zz2.field_70154_o) {
                            if (zz8 == 0.0) {
                                entity = zz10;
                                zz6 = zz12.field_72307_f;
                            }
                        }
                        else {
                            entity = zz10;
                            zz6 = zz12.field_72307_f;
                            zz8 = zz13;
                        }
                    }
                }
            }
        }
        if (zz8 < zzD && !(entity instanceof EntityLivingBase) && !(entity instanceof EntityItemFrame)) {
            entity = null;
        }
        a8.mc.field_71424_I.func_76319_b();
        if (entity == null || zz6 == null) {
            return null;
        }
        return new Object[] { entity, zz6 };
    }
}
