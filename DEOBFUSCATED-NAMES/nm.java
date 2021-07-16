// 
// Decompiled by Procyon v0.5.36
// 

package DEOBFUSCATED-NAMES;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.renderer.Tessellator;
import org.lwjgl.opengl.GL11;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.client.event.RenderLivingEvent;
import keystrokesmod.bb;

public class nm extends bb
{
    public static ap a;
    public static cb b;
    public static cb c;
    public static cb d;
    public static cb rm;
    public static cb e;
    
    public nm() {
        super(new char[] { 'N', 'a', 'm', 'e', 't', 'a', 'g', 's' }, bb.render, 0);
        this.registerSetting(nm.a = new ap(new char[] { 'O', 'f', 'f', 's', 'e', 't' }, 0.0, -40.0, 40.0, 1.0));
        this.registerSetting(nm.b = new cb(new char[] { 'R', 'e', 'c', 't' }, true));
        this.registerSetting(nm.c = new cb(new char[] { 'S', 'h', 'o', 'w', ' ', 'h', 'e', 'a', 'l', 't', 'h' }, true));
        this.registerSetting(nm.d = new cb(new char[] { 'S', 'h', 'o', 'w', ' ', 'i', 'n', 'v', 'i', 's' }, true));
        this.registerSetting(nm.rm = new cb(new char[] { 'R', 'e', 'm', 'o', 'v', 'e', ' ', 't', 'a', 'g', 's' }, false));
    }
    
    @SubscribeEvent
    public void r(final RenderLivingEvent.Specials.Pre e) {
        if (nm.rm.isToggled()) {
            e.setCanceled(true);
            return;
        }
        if (e.entity instanceof EntityPlayer && e.entity != nm.mc.field_71439_g && e.entity.field_70725_aQ == 0) {
            final EntityPlayer en = (EntityPlayer)e.entity;
            if (!nm.d.isToggled() && en.func_82150_aj()) {
                return;
            }
            if (an.bot((Entity)en) || en.getDisplayNameString().isEmpty()) {
                return;
            }
            e.setCanceled(true);
            String str = en.func_145748_c_().func_150254_d();
            if (nm.c.isToggled()) {
                final double r = en.func_110143_aJ() / en.func_110138_aP();
                final String h = ((r < 0.3) ? "§c" : ((r < 0.5) ? "§6" : ((r < 0.7) ? "§e" : "§a"))) + ay.rnd(en.func_110143_aJ(), 1);
                str = str + " " + h;
            }
            GlStateManager.func_179094_E();
            GlStateManager.func_179109_b((float)e.x + 0.0f, (float)e.y + en.field_70131_O + 0.5f, (float)e.z);
            GL11.glNormal3f(0.0f, 1.0f, 0.0f);
            GlStateManager.func_179114_b(-nm.mc.func_175598_ae().field_78735_i, 0.0f, 1.0f, 0.0f);
            GlStateManager.func_179114_b(nm.mc.func_175598_ae().field_78732_j, 1.0f, 0.0f, 0.0f);
            final float f1 = 0.02666667f;
            GlStateManager.func_179152_a(-f1, -f1, f1);
            if (en.func_70093_af()) {
                GlStateManager.func_179109_b(0.0f, 9.374999f, 0.0f);
            }
            GlStateManager.func_179140_f();
            GlStateManager.func_179132_a(false);
            GlStateManager.func_179097_i();
            GlStateManager.func_179147_l();
            GlStateManager.func_179120_a(770, 771, 1, 0);
            final Tessellator tessellator = Tessellator.func_178181_a();
            final WorldRenderer worldrenderer = tessellator.func_178180_c();
            final int i = (int)(-nm.a.getInput());
            final int j = nm.mc.field_71466_p.func_78256_a(str) / 2;
            GlStateManager.func_179090_x();
            if (nm.b.isToggled()) {
                worldrenderer.func_181668_a(7, DefaultVertexFormats.field_181706_f);
                worldrenderer.func_181662_b((double)(-j - 1), (double)(-1 + i), 0.0).func_181666_a(0.0f, 0.0f, 0.0f, 0.25f).func_181675_d();
                worldrenderer.func_181662_b((double)(-j - 1), (double)(8 + i), 0.0).func_181666_a(0.0f, 0.0f, 0.0f, 0.25f).func_181675_d();
                worldrenderer.func_181662_b((double)(j + 1), (double)(8 + i), 0.0).func_181666_a(0.0f, 0.0f, 0.0f, 0.25f).func_181675_d();
                worldrenderer.func_181662_b((double)(j + 1), (double)(-1 + i), 0.0).func_181666_a(0.0f, 0.0f, 0.0f, 0.25f).func_181675_d();
                tessellator.func_78381_a();
            }
            GlStateManager.func_179098_w();
            nm.mc.field_71466_p.func_78276_b(str, -nm.mc.field_71466_p.func_78256_a(str) / 2, i, -1);
            GlStateManager.func_179126_j();
            GlStateManager.func_179132_a(true);
            GlStateManager.func_179145_e();
            GlStateManager.func_179084_k();
            GlStateManager.func_179131_c(1.0f, 1.0f, 1.0f, 1.0f);
            GlStateManager.func_179121_F();
        }
    }
}
