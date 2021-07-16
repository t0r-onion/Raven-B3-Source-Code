// 
// Decompiled by Procyon v0.5.36
// 

package DEOBFUSCATED-NAMES;

import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.renderer.GlStateManager;
import java.awt.Color;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.util.AxisAlignedBB;
import org.lwjgl.opengl.GL11;
import net.minecraft.util.BlockPos;
import net.minecraft.client.Minecraft;

public class ru
{
    public static final int rc = -1089466352;
    private static final double p2 = 6.283185307179586;
    private static Minecraft mc;
    public static boolean ring_c;
    
    public static void re(final BlockPos bp, final int color, final boolean shade) {
        if (bp == null) {
            return;
        }
        final double x = bp.func_177958_n() - ru.mc.func_175598_ae().field_78730_l;
        final double y = bp.func_177956_o() - ru.mc.func_175598_ae().field_78731_m;
        final double z = bp.func_177952_p() - ru.mc.func_175598_ae().field_78728_n;
        GL11.glBlendFunc(770, 771);
        GL11.glEnable(3042);
        GL11.glLineWidth(2.0f);
        GL11.glDisable(3553);
        GL11.glDisable(2929);
        GL11.glDepthMask(false);
        final float a = (color >> 24 & 0xFF) / 255.0f;
        final float r = (color >> 16 & 0xFF) / 255.0f;
        final float g = (color >> 8 & 0xFF) / 255.0f;
        final float b = (color & 0xFF) / 255.0f;
        GL11.glColor4d((double)r, (double)g, (double)b, (double)a);
        RenderGlobal.func_181561_a(new AxisAlignedBB(x, y, z, x + 1.0, y + 1.0, z + 1.0));
        if (shade) {
            dbb(new AxisAlignedBB(x, y, z, x + 1.0, y + 1.0, z + 1.0), r, g, b);
        }
        GL11.glEnable(3553);
        GL11.glEnable(2929);
        GL11.glDepthMask(true);
        GL11.glDisable(3042);
    }
    
    public static void ee(final Entity e, final int type, final double expand, final double shift, int color, final boolean damage) {
        if (e == null || !(e instanceof EntityLivingBase)) {
            return;
        }
        final double x = e.field_70142_S + (e.field_70165_t - e.field_70142_S) * ay.gt().field_74281_c - ru.mc.func_175598_ae().field_78730_l;
        final double y = e.field_70137_T + (e.field_70163_u - e.field_70137_T) * ay.gt().field_74281_c - ru.mc.func_175598_ae().field_78731_m;
        final double z = e.field_70136_U + (e.field_70161_v - e.field_70136_U) * ay.gt().field_74281_c - ru.mc.func_175598_ae().field_78728_n;
        final float d = (float)expand / 40.0f;
        if (e instanceof EntityPlayer && damage && ((EntityPlayer)e).field_70737_aN != 0) {
            color = Color.RED.getRGB();
        }
        GlStateManager.func_179094_E();
        if (type == 3) {
            GL11.glTranslated(x, y - 0.2, z);
            GL11.glRotated((double)(-ru.mc.func_175598_ae().field_78735_i), 0.0, 1.0, 0.0);
            GlStateManager.func_179097_i();
            GL11.glScalef(0.03f + d, 0.03f + d, 0.03f + d);
            final int outline = Color.black.getRGB();
            Gui.func_73734_a(-20, -1, -26, 75, outline);
            Gui.func_73734_a(20, -1, 26, 75, outline);
            Gui.func_73734_a(-20, -1, 21, 5, outline);
            Gui.func_73734_a(-20, 70, 21, 75, outline);
            if (color != 0) {
                Gui.func_73734_a(-21, 0, -25, 74, color);
                Gui.func_73734_a(21, 0, 25, 74, color);
                Gui.func_73734_a(-21, 0, 24, 4, color);
                Gui.func_73734_a(-21, 71, 25, 74, color);
            }
            else {
                final int st = ay.gc(2L, 0L);
                final int en = ay.gc(2L, 1000L);
                dGR(-21, 0, -25, 74, st, en);
                dGR(21, 0, 25, 74, st, en);
                Gui.func_73734_a(-21, 0, 21, 4, en);
                Gui.func_73734_a(-21, 71, 21, 74, st);
            }
            GlStateManager.func_179126_j();
        }
        else if (type == 4) {
            final EntityLivingBase en2 = (EntityLivingBase)e;
            final double r = en2.func_110143_aJ() / en2.func_110138_aP();
            final int b = (int)(74.0 * r);
            final int hc = (r < 0.3) ? Color.red.getRGB() : ((r < 0.5) ? Color.orange.getRGB() : ((r < 0.7) ? Color.yellow.getRGB() : Color.green.getRGB()));
            GL11.glTranslated(x, y - 0.2, z);
            GL11.glRotated((double)(-ru.mc.func_175598_ae().field_78735_i), 0.0, 1.0, 0.0);
            GlStateManager.func_179097_i();
            GL11.glScalef(0.03f + d, 0.03f + d, 0.03f + d);
            final int left = (int)(21.0 + shift * 2.0);
            Gui.func_73734_a(left, -1, left + 5, 75, Color.black.getRGB());
            Gui.func_73734_a(left + 1, b, left + 4, 74, Color.darkGray.getRGB());
            Gui.func_73734_a(left + 1, 0, left + 4, b, hc);
            GlStateManager.func_179126_j();
        }
        else if (type == 6) {
            d3p(x, y, z, 0.699999988079071, 45, 1.5f, color, color == 0);
        }
        else {
            if (color == 0) {
                color = ay.gc(2L, 0L);
            }
            final float a = (color >> 24 & 0xFF) / 255.0f;
            final float r2 = (color >> 16 & 0xFF) / 255.0f;
            final float g = (color >> 8 & 0xFF) / 255.0f;
            final float b2 = (color & 0xFF) / 255.0f;
            if (type == 5) {
                GL11.glTranslated(x, y - 0.2, z);
                GL11.glRotated((double)(-ru.mc.func_175598_ae().field_78735_i), 0.0, 1.0, 0.0);
                GlStateManager.func_179097_i();
                GL11.glScalef(0.03f + d, 0.03f, 0.03f + d);
                final int base = 95;
                d2p(0.0, 95.0, 10, 3, Color.black.getRGB());
                for (int i = 0; i < 6; ++i) {
                    d2p(0.0, 95 + (10 - i), 3, 4, Color.black.getRGB());
                }
                for (int i = 0; i < 7; ++i) {
                    d2p(0.0, 95 + (10 - i), 2, 4, color);
                }
                d2p(0.0, 95.0, 8, 3, color);
                GlStateManager.func_179126_j();
            }
            else {
                final AxisAlignedBB bbox = e.func_174813_aQ().func_72314_b(0.1 + expand, 0.1 + expand, 0.1 + expand);
                final AxisAlignedBB axis = new AxisAlignedBB(bbox.field_72340_a - e.field_70165_t + x, bbox.field_72338_b - e.field_70163_u + y, bbox.field_72339_c - e.field_70161_v + z, bbox.field_72336_d - e.field_70165_t + x, bbox.field_72337_e - e.field_70163_u + y, bbox.field_72334_f - e.field_70161_v + z);
                GL11.glBlendFunc(770, 771);
                GL11.glEnable(3042);
                GL11.glDisable(3553);
                GL11.glDisable(2929);
                GL11.glDepthMask(false);
                GL11.glLineWidth(2.0f);
                GL11.glColor4f(r2, g, b2, a);
                if (type == 1) {
                    RenderGlobal.func_181561_a(axis);
                }
                else if (type == 2) {
                    dbb(axis, r2, g, b2);
                }
                GL11.glEnable(3553);
                GL11.glEnable(2929);
                GL11.glDepthMask(true);
                GL11.glDisable(3042);
            }
        }
        GlStateManager.func_179121_F();
    }
    
    public static void dbb(final AxisAlignedBB abb, final float r, final float g, final float b) {
        final float a = 0.25f;
        final Tessellator ts = Tessellator.func_178181_a();
        final WorldRenderer vb = ts.func_178180_c();
        vb.func_181668_a(7, DefaultVertexFormats.field_181706_f);
        vb.func_181662_b(abb.field_72340_a, abb.field_72338_b, abb.field_72339_c).func_181666_a(r, g, b, a).func_181675_d();
        vb.func_181662_b(abb.field_72340_a, abb.field_72337_e, abb.field_72339_c).func_181666_a(r, g, b, a).func_181675_d();
        vb.func_181662_b(abb.field_72336_d, abb.field_72338_b, abb.field_72339_c).func_181666_a(r, g, b, a).func_181675_d();
        vb.func_181662_b(abb.field_72336_d, abb.field_72337_e, abb.field_72339_c).func_181666_a(r, g, b, a).func_181675_d();
        vb.func_181662_b(abb.field_72336_d, abb.field_72338_b, abb.field_72334_f).func_181666_a(r, g, b, a).func_181675_d();
        vb.func_181662_b(abb.field_72336_d, abb.field_72337_e, abb.field_72334_f).func_181666_a(r, g, b, a).func_181675_d();
        vb.func_181662_b(abb.field_72340_a, abb.field_72338_b, abb.field_72334_f).func_181666_a(r, g, b, a).func_181675_d();
        vb.func_181662_b(abb.field_72340_a, abb.field_72337_e, abb.field_72334_f).func_181666_a(r, g, b, a).func_181675_d();
        ts.func_78381_a();
        vb.func_181668_a(7, DefaultVertexFormats.field_181706_f);
        vb.func_181662_b(abb.field_72336_d, abb.field_72337_e, abb.field_72339_c).func_181666_a(r, g, b, a).func_181675_d();
        vb.func_181662_b(abb.field_72336_d, abb.field_72338_b, abb.field_72339_c).func_181666_a(r, g, b, a).func_181675_d();
        vb.func_181662_b(abb.field_72340_a, abb.field_72337_e, abb.field_72339_c).func_181666_a(r, g, b, a).func_181675_d();
        vb.func_181662_b(abb.field_72340_a, abb.field_72338_b, abb.field_72339_c).func_181666_a(r, g, b, a).func_181675_d();
        vb.func_181662_b(abb.field_72340_a, abb.field_72337_e, abb.field_72334_f).func_181666_a(r, g, b, a).func_181675_d();
        vb.func_181662_b(abb.field_72340_a, abb.field_72338_b, abb.field_72334_f).func_181666_a(r, g, b, a).func_181675_d();
        vb.func_181662_b(abb.field_72336_d, abb.field_72337_e, abb.field_72334_f).func_181666_a(r, g, b, a).func_181675_d();
        vb.func_181662_b(abb.field_72336_d, abb.field_72338_b, abb.field_72334_f).func_181666_a(r, g, b, a).func_181675_d();
        ts.func_78381_a();
        vb.func_181668_a(7, DefaultVertexFormats.field_181706_f);
        vb.func_181662_b(abb.field_72340_a, abb.field_72337_e, abb.field_72339_c).func_181666_a(r, g, b, a).func_181675_d();
        vb.func_181662_b(abb.field_72336_d, abb.field_72337_e, abb.field_72339_c).func_181666_a(r, g, b, a).func_181675_d();
        vb.func_181662_b(abb.field_72336_d, abb.field_72337_e, abb.field_72334_f).func_181666_a(r, g, b, a).func_181675_d();
        vb.func_181662_b(abb.field_72340_a, abb.field_72337_e, abb.field_72334_f).func_181666_a(r, g, b, a).func_181675_d();
        vb.func_181662_b(abb.field_72340_a, abb.field_72337_e, abb.field_72339_c).func_181666_a(r, g, b, a).func_181675_d();
        vb.func_181662_b(abb.field_72340_a, abb.field_72337_e, abb.field_72334_f).func_181666_a(r, g, b, a).func_181675_d();
        vb.func_181662_b(abb.field_72336_d, abb.field_72337_e, abb.field_72334_f).func_181666_a(r, g, b, a).func_181675_d();
        vb.func_181662_b(abb.field_72336_d, abb.field_72337_e, abb.field_72339_c).func_181666_a(r, g, b, a).func_181675_d();
        ts.func_78381_a();
        vb.func_181668_a(7, DefaultVertexFormats.field_181706_f);
        vb.func_181662_b(abb.field_72340_a, abb.field_72338_b, abb.field_72339_c).func_181666_a(r, g, b, a).func_181675_d();
        vb.func_181662_b(abb.field_72336_d, abb.field_72338_b, abb.field_72339_c).func_181666_a(r, g, b, a).func_181675_d();
        vb.func_181662_b(abb.field_72336_d, abb.field_72338_b, abb.field_72334_f).func_181666_a(r, g, b, a).func_181675_d();
        vb.func_181662_b(abb.field_72340_a, abb.field_72338_b, abb.field_72334_f).func_181666_a(r, g, b, a).func_181675_d();
        vb.func_181662_b(abb.field_72340_a, abb.field_72338_b, abb.field_72339_c).func_181666_a(r, g, b, a).func_181675_d();
        vb.func_181662_b(abb.field_72340_a, abb.field_72338_b, abb.field_72334_f).func_181666_a(r, g, b, a).func_181675_d();
        vb.func_181662_b(abb.field_72336_d, abb.field_72338_b, abb.field_72334_f).func_181666_a(r, g, b, a).func_181675_d();
        vb.func_181662_b(abb.field_72336_d, abb.field_72338_b, abb.field_72339_c).func_181666_a(r, g, b, a).func_181675_d();
        ts.func_78381_a();
        vb.func_181668_a(7, DefaultVertexFormats.field_181706_f);
        vb.func_181662_b(abb.field_72340_a, abb.field_72338_b, abb.field_72339_c).func_181666_a(r, g, b, a).func_181675_d();
        vb.func_181662_b(abb.field_72340_a, abb.field_72337_e, abb.field_72339_c).func_181666_a(r, g, b, a).func_181675_d();
        vb.func_181662_b(abb.field_72340_a, abb.field_72338_b, abb.field_72334_f).func_181666_a(r, g, b, a).func_181675_d();
        vb.func_181662_b(abb.field_72340_a, abb.field_72337_e, abb.field_72334_f).func_181666_a(r, g, b, a).func_181675_d();
        vb.func_181662_b(abb.field_72336_d, abb.field_72338_b, abb.field_72334_f).func_181666_a(r, g, b, a).func_181675_d();
        vb.func_181662_b(abb.field_72336_d, abb.field_72337_e, abb.field_72334_f).func_181666_a(r, g, b, a).func_181675_d();
        vb.func_181662_b(abb.field_72336_d, abb.field_72338_b, abb.field_72339_c).func_181666_a(r, g, b, a).func_181675_d();
        vb.func_181662_b(abb.field_72336_d, abb.field_72337_e, abb.field_72339_c).func_181666_a(r, g, b, a).func_181675_d();
        ts.func_78381_a();
        vb.func_181668_a(7, DefaultVertexFormats.field_181706_f);
        vb.func_181662_b(abb.field_72340_a, abb.field_72337_e, abb.field_72334_f).func_181666_a(r, g, b, a).func_181675_d();
        vb.func_181662_b(abb.field_72340_a, abb.field_72338_b, abb.field_72334_f).func_181666_a(r, g, b, a).func_181675_d();
        vb.func_181662_b(abb.field_72340_a, abb.field_72337_e, abb.field_72339_c).func_181666_a(r, g, b, a).func_181675_d();
        vb.func_181662_b(abb.field_72340_a, abb.field_72338_b, abb.field_72339_c).func_181666_a(r, g, b, a).func_181675_d();
        vb.func_181662_b(abb.field_72336_d, abb.field_72337_e, abb.field_72339_c).func_181666_a(r, g, b, a).func_181675_d();
        vb.func_181662_b(abb.field_72336_d, abb.field_72338_b, abb.field_72339_c).func_181666_a(r, g, b, a).func_181675_d();
        vb.func_181662_b(abb.field_72336_d, abb.field_72337_e, abb.field_72334_f).func_181666_a(r, g, b, a).func_181675_d();
        vb.func_181662_b(abb.field_72336_d, abb.field_72338_b, abb.field_72334_f).func_181666_a(r, g, b, a).func_181675_d();
        ts.func_78381_a();
    }
    
    public static void dtl(final Entity e, final int color, final float lw) {
        if (e == null) {
            return;
        }
        final double x = e.field_70142_S + (e.field_70165_t - e.field_70142_S) * ay.gt().field_74281_c - ru.mc.func_175598_ae().field_78730_l;
        final double y = e.func_70047_e() + e.field_70137_T + (e.field_70163_u - e.field_70137_T) * ay.gt().field_74281_c - ru.mc.func_175598_ae().field_78731_m;
        final double z = e.field_70136_U + (e.field_70161_v - e.field_70136_U) * ay.gt().field_74281_c - ru.mc.func_175598_ae().field_78728_n;
        final float a = (color >> 24 & 0xFF) / 255.0f;
        final float r = (color >> 16 & 0xFF) / 255.0f;
        final float g = (color >> 8 & 0xFF) / 255.0f;
        final float b = (color & 0xFF) / 255.0f;
        GL11.glPushMatrix();
        GL11.glEnable(3042);
        GL11.glEnable(2848);
        GL11.glDisable(2929);
        GL11.glDisable(3553);
        GL11.glBlendFunc(770, 771);
        GL11.glEnable(3042);
        GL11.glLineWidth(lw);
        GL11.glColor4f(r, g, b, a);
        GL11.glBegin(2);
        GL11.glVertex3d(0.0, (double)ru.mc.field_71439_g.func_70047_e(), 0.0);
        GL11.glVertex3d(x, y, z);
        GL11.glEnd();
        GL11.glDisable(3042);
        GL11.glEnable(3553);
        GL11.glEnable(2929);
        GL11.glDisable(2848);
        GL11.glDisable(3042);
        GL11.glPopMatrix();
    }
    
    public static void dGR(int left, int top, int right, int bottom, final int startColor, final int endColor) {
        if (left < right) {
            final int i = left;
            left = right;
            right = i;
        }
        if (top < bottom) {
            final int j = top;
            top = bottom;
            bottom = j;
        }
        final float f = (startColor >> 24 & 0xFF) / 255.0f;
        final float f2 = (startColor >> 16 & 0xFF) / 255.0f;
        final float f3 = (startColor >> 8 & 0xFF) / 255.0f;
        final float f4 = (startColor & 0xFF) / 255.0f;
        final float f5 = (endColor >> 24 & 0xFF) / 255.0f;
        final float f6 = (endColor >> 16 & 0xFF) / 255.0f;
        final float f7 = (endColor >> 8 & 0xFF) / 255.0f;
        final float f8 = (endColor & 0xFF) / 255.0f;
        GlStateManager.func_179090_x();
        GlStateManager.func_179147_l();
        GlStateManager.func_179118_c();
        GlStateManager.func_179120_a(770, 771, 1, 0);
        GlStateManager.func_179103_j(7425);
        final Tessellator tessellator = Tessellator.func_178181_a();
        final WorldRenderer worldrenderer = tessellator.func_178180_c();
        worldrenderer.func_181668_a(7, DefaultVertexFormats.field_181706_f);
        worldrenderer.func_181662_b((double)right, (double)top, 0.0).func_181666_a(f2, f3, f4, f).func_181675_d();
        worldrenderer.func_181662_b((double)left, (double)top, 0.0).func_181666_a(f2, f3, f4, f).func_181675_d();
        worldrenderer.func_181662_b((double)left, (double)bottom, 0.0).func_181666_a(f6, f7, f8, f5).func_181675_d();
        worldrenderer.func_181662_b((double)right, (double)bottom, 0.0).func_181666_a(f6, f7, f8, f5).func_181675_d();
        tessellator.func_78381_a();
        GlStateManager.func_179103_j(7424);
        GlStateManager.func_179084_k();
        GlStateManager.func_179141_d();
        GlStateManager.func_179098_w();
    }
    
    public static void db(final int w, final int h, final int r) {
        final int c = (r == -1) ? -1089466352 : r;
        Gui.func_73734_a(0, 0, w, h, c);
    }
    
    public static void dct(final String text, final char lineSplit, int x, int y, final long s, final long shift, final boolean rect, final FontRenderer fontRenderer) {
        final int bX = x;
        int l = 0;
        long r = 0L;
        for (int i = 0; i < text.length(); ++i) {
            final char c = text.charAt(i);
            if (c == lineSplit) {
                ++l;
                x = bX;
                y += fontRenderer.field_78288_b + 5;
                r = shift * l;
            }
            else {
                fontRenderer.func_175065_a(String.valueOf(c), (float)x, (float)y, ay.gc(s, r), rect);
                x += fontRenderer.func_78263_a(c);
                if (c != ' ') {
                    r -= 90L;
                }
            }
        }
    }
    
    public static void d2p(final double x, final double y, final int radius, final int sides, final int color) {
        final float a = (color >> 24 & 0xFF) / 255.0f;
        final float r = (color >> 16 & 0xFF) / 255.0f;
        final float g = (color >> 8 & 0xFF) / 255.0f;
        final float b = (color & 0xFF) / 255.0f;
        final Tessellator tessellator = Tessellator.func_178181_a();
        final WorldRenderer worldrenderer = tessellator.func_178180_c();
        GlStateManager.func_179147_l();
        GlStateManager.func_179090_x();
        GlStateManager.func_179120_a(770, 771, 1, 0);
        GlStateManager.func_179131_c(r, g, b, a);
        worldrenderer.func_181668_a(6, DefaultVertexFormats.field_181705_e);
        for (int i = 0; i < sides; ++i) {
            final double angle = 6.283185307179586 * i / sides + Math.toRadians(180.0);
            worldrenderer.func_181662_b(x + Math.sin(angle) * radius, y + Math.cos(angle) * radius, 0.0).func_181675_d();
        }
        tessellator.func_78381_a();
        GlStateManager.func_179098_w();
        GlStateManager.func_179084_k();
    }
    
    public static void d3p(final double x, final double y, final double z, final double radius, final int sides, final float lineWidth, final int color, final boolean chroma) {
        final float a = (color >> 24 & 0xFF) / 255.0f;
        final float r = (color >> 16 & 0xFF) / 255.0f;
        final float g = (color >> 8 & 0xFF) / 255.0f;
        final float b = (color & 0xFF) / 255.0f;
        ru.mc.field_71460_t.func_175072_h();
        GL11.glDisable(3553);
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        GL11.glDisable(2929);
        GL11.glEnable(2848);
        GL11.glDepthMask(false);
        GL11.glLineWidth(lineWidth);
        if (!chroma) {
            GL11.glColor4f(r, g, b, a);
        }
        GL11.glBegin(1);
        long d = 0L;
        final long ed = 15000L / sides;
        final long hed = ed / 2L;
        for (int i = 0; i < sides * 2; ++i) {
            if (chroma) {
                if (i % 2 != 0) {
                    if (i == 47) {
                        d = hed;
                    }
                    d += ed;
                }
                final int c = ay.gc(2L, d);
                final float r2 = (c >> 16 & 0xFF) / 255.0f;
                final float g2 = (c >> 8 & 0xFF) / 255.0f;
                final float b2 = (c & 0xFF) / 255.0f;
                GL11.glColor3f(r2, g2, b2);
            }
            final double angle = 6.283185307179586 * i / sides + Math.toRadians(180.0);
            GL11.glVertex3d(x + Math.cos(angle) * radius, y, z + Math.sin(angle) * radius);
        }
        GL11.glEnd();
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.glDepthMask(true);
        GL11.glDisable(2848);
        GL11.glEnable(2929);
        GL11.glDisable(3042);
        GL11.glEnable(3553);
        ru.mc.field_71460_t.func_180436_i();
    }
    
    static {
        ru.mc = Minecraft.func_71410_x();
        ru.ring_c = false;
    }
}
