// 
// Decompiled by Procyon v0.5.36
// 

package DEOBFUSCATED-NAMES;

import net.minecraft.client.renderer.RenderGlobal;
import org.lwjgl.opengl.GL11;
import net.minecraft.util.AxisAlignedBB;
import java.util.List;
import net.minecraft.util.Vec3;
import net.minecraft.entity.item.EntityItemFrame;
import java.util.Iterator;
import java.awt.Color;
import net.minecraft.entity.item.EntityArmorStand;
import net.minecraft.entity.EntityLivingBase;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.client.event.MouseEvent;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.entity.Entity;
import keystrokesmod.bb;

public class hb extends bb
{
    public static ap a;
    public static cb b;
    private static Entity pE;
    private static MovingObjectPosition mv;
    
    public hb() {
        super(new char[] { 'H', 'i', 't', 'B', 'o', 'x' }, bb.combat, 0);
        this.registerSetting(hb.a = new ap(new char[] { 'M', 'u', 'l', 't', 'i', 'p', 'l', 'i', 'e', 'r' }, 1.2, 1.0, 5.0, 0.05));
        this.registerSetting(hb.b = new cb(new char[] { 'S', 'h', 'o', 'w', ' ', 'n', 'e', 'w', ' ', 'h', 'i', 't', 'b', 'o', 'x' }, false));
    }
    
    @Override
    public void update() {
        gmo(1.0f);
    }
    
    @SubscribeEvent
    public void m(final MouseEvent e) {
        if (!ay.e() || m2.a8.isEnabled()) {
            return;
        }
        if (e.button == 0 && e.buttonstate && hb.mv != null) {
            hb.mc.field_71476_x = hb.mv;
        }
    }
    
    @SubscribeEvent
    public void r1(final RenderWorldLastEvent e) {
        if (!hb.b.isToggled() || !ay.e()) {
            return;
        }
        for (final Entity en : hb.mc.field_71441_e.field_72996_f) {
            if (en != hb.mc.field_71439_g && en instanceof EntityLivingBase && ((EntityLivingBase)en).field_70725_aQ == 0 && !(en instanceof EntityArmorStand) && !en.func_82150_aj()) {
                this.rh(en, Color.WHITE);
            }
        }
    }
    
    public static double exp(final Entity en) {
        if (!m2.hb.isEnabled() || an.bot(en)) {
            return 1.0;
        }
        return hb.a.getInput();
    }
    
    public static void gmo(final float partialTicks) {
        if (hb.mc.func_175606_aa() != null && hb.mc.field_71441_e != null) {
            hb.mc.field_147125_j = null;
            hb.pE = null;
            final double d0 = 3.0;
            hb.mv = hb.mc.func_175606_aa().func_174822_a(d0, partialTicks);
            double d2 = d0;
            final Vec3 vec3 = hb.mc.func_175606_aa().func_174824_e(partialTicks);
            if (hb.mv != null) {
                d2 = hb.mv.field_72307_f.func_72438_d(vec3);
            }
            final Vec3 vec4 = hb.mc.func_175606_aa().func_70676_i(partialTicks);
            final Vec3 vec5 = vec3.func_72441_c(vec4.field_72450_a * d0, vec4.field_72448_b * d0, vec4.field_72449_c * d0);
            Vec3 vec6 = null;
            final float f1 = 1.0f;
            final List list = hb.mc.field_71441_e.func_72839_b(hb.mc.func_175606_aa(), hb.mc.func_175606_aa().func_174813_aQ().func_72321_a(vec4.field_72450_a * d0, vec4.field_72448_b * d0, vec4.field_72449_c * d0).func_72314_b((double)f1, (double)f1, (double)f1));
            double d3 = d2;
            for (int i = 0; i < list.size(); ++i) {
                final Entity entity = list.get(i);
                if (entity.func_70067_L()) {
                    final float ex = (float)(entity.func_70111_Y() * exp(entity));
                    final AxisAlignedBB ax = entity.func_174813_aQ().func_72314_b((double)ex, (double)ex, (double)ex);
                    final MovingObjectPosition mop = ax.func_72327_a(vec3, vec5);
                    if (ax.func_72318_a(vec3)) {
                        if (0.0 < d3 || d3 == 0.0) {
                            hb.pE = entity;
                            vec6 = ((mop == null) ? vec3 : mop.field_72307_f);
                            d3 = 0.0;
                        }
                    }
                    else if (mop != null) {
                        final double d4 = vec3.func_72438_d(mop.field_72307_f);
                        if (d4 < d3 || d3 == 0.0) {
                            if (entity == hb.mc.func_175606_aa().field_70154_o && !entity.canRiderInteract()) {
                                if (d3 == 0.0) {
                                    hb.pE = entity;
                                    vec6 = mop.field_72307_f;
                                }
                            }
                            else {
                                hb.pE = entity;
                                vec6 = mop.field_72307_f;
                                d3 = d4;
                            }
                        }
                    }
                }
            }
            if (hb.pE != null && (d3 < d2 || hb.mv == null)) {
                hb.mv = new MovingObjectPosition(hb.pE, vec6);
                if (hb.pE instanceof EntityLivingBase || hb.pE instanceof EntityItemFrame) {
                    hb.mc.field_147125_j = hb.pE;
                }
            }
        }
    }
    
    private void rh(final Entity e, final Color c) {
        if (e == null || !(e instanceof EntityLivingBase)) {
            return;
        }
        final double x = e.field_70142_S + (e.field_70165_t - e.field_70142_S) * ay.gt().field_74281_c - hb.mc.func_175598_ae().field_78730_l;
        final double y = e.field_70137_T + (e.field_70163_u - e.field_70137_T) * ay.gt().field_74281_c - hb.mc.func_175598_ae().field_78731_m;
        final double z = e.field_70136_U + (e.field_70161_v - e.field_70136_U) * ay.gt().field_74281_c - hb.mc.func_175598_ae().field_78728_n;
        final float ex = (float)(e.func_70111_Y() * hb.a.getInput());
        final AxisAlignedBB bbox = e.func_174813_aQ().func_72314_b((double)ex, (double)ex, (double)ex);
        final AxisAlignedBB axis = new AxisAlignedBB(bbox.field_72340_a - e.field_70165_t + x, bbox.field_72338_b - e.field_70163_u + y, bbox.field_72339_c - e.field_70161_v + z, bbox.field_72336_d - e.field_70165_t + x, bbox.field_72337_e - e.field_70163_u + y, bbox.field_72334_f - e.field_70161_v + z);
        GL11.glBlendFunc(770, 771);
        GL11.glEnable(3042);
        GL11.glDisable(3553);
        GL11.glDisable(2929);
        GL11.glDepthMask(false);
        GL11.glLineWidth(2.0f);
        GL11.glColor3d((double)c.getRed(), (double)c.getGreen(), (double)c.getBlue());
        RenderGlobal.func_181561_a(axis);
        GL11.glEnable(3553);
        GL11.glEnable(2929);
        GL11.glDepthMask(true);
        GL11.glDisable(3042);
    }
}
