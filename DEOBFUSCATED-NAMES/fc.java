// 
// Decompiled by Procyon v0.5.36
// 

package DEOBFUSCATED-NAMES;

import net.minecraftforge.client.event.MouseEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import java.awt.Color;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import org.lwjgl.input.Keyboard;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;
import net.minecraft.client.entity.EntityOtherPlayerMP;
import keystrokesmod.bb;

public class fc extends bb
{
    public static ap a;
    public static cb b;
    private final double toRad = 0.017453292519943295;
    public static EntityOtherPlayerMP en;
    private int[] lcc;
    private float[] sAng;
    
    public fc() {
        super(new char[] { 'F', 'r', 'e', 'e', 'c', 'a', 'm' }, bb.player, 0);
        this.lcc = new int[] { Integer.MAX_VALUE, 0 };
        this.sAng = new float[] { 0.0f, 0.0f };
        this.registerSetting(fc.a = new ap(new char[] { 'S', 'p', 'e', 'e', 'd' }, 2.5, 0.5, 10.0, 0.5));
        this.registerSetting(fc.b = new cb(new char[] { 'D', 'i', 's', 'a', 'b', 'l', 'e', ' ', 'o', 'n', ' ', 'd', 'a', 'm', 'a', 'g', 'e' }, true));
    }
    
    @Override
    public void onEnable() {
        if (!fc.mc.field_71439_g.field_70122_E) {
            this.disable();
            return;
        }
        (fc.en = new EntityOtherPlayerMP((World)fc.mc.field_71441_e, fc.mc.field_71439_g.func_146103_bH())).func_82149_j((Entity)fc.mc.field_71439_g);
        this.sAng[0] = (fc.en.field_70759_as = fc.mc.field_71439_g.field_70759_as);
        this.sAng[1] = fc.mc.field_71439_g.field_70125_A;
        fc.en.func_70016_h(0.0, 0.0, 0.0);
        fc.en.func_82142_c(true);
        fc.mc.field_71441_e.func_73027_a(-8008, (Entity)fc.en);
        fc.mc.func_175607_a((Entity)fc.en);
    }
    
    @Override
    public void onDisable() {
        if (fc.en != null) {
            fc.mc.func_175607_a((Entity)fc.mc.field_71439_g);
            final EntityPlayerSP field_71439_g = fc.mc.field_71439_g;
            final EntityPlayerSP field_71439_g2 = fc.mc.field_71439_g;
            final float n = this.sAng[0];
            field_71439_g2.field_70759_as = n;
            field_71439_g.field_70177_z = n;
            fc.mc.field_71439_g.field_70125_A = this.sAng[1];
            fc.mc.field_71441_e.func_72900_e((Entity)fc.en);
            fc.en = null;
        }
        this.lcc = new int[] { Integer.MAX_VALUE, 0 };
        final int rg = 1;
        final int x = fc.mc.field_71439_g.field_70176_ah;
        final int z = fc.mc.field_71439_g.field_70164_aj;
        for (int x2 = -1; x2 <= 1; ++x2) {
            for (int z2 = -1; z2 <= 1; ++z2) {
                final int a = x + x2;
                final int b = z + z2;
                fc.mc.field_71441_e.func_147458_c(a * 16, 0, b * 16, a * 16 + 15, 256, b * 16 + 15);
            }
        }
    }
    
    @Override
    public void update() {
        if (fc.b.isToggled() && fc.mc.field_71439_g.field_70737_aN != 0) {
            this.disable();
            return;
        }
        fc.mc.field_71439_g.func_70031_b(false);
        fc.mc.field_71439_g.field_70701_bs = 0.0f;
        fc.mc.field_71439_g.field_70702_br = 0.0f;
        final EntityOtherPlayerMP en = fc.en;
        final EntityOtherPlayerMP en2 = fc.en;
        final float field_70177_z = fc.mc.field_71439_g.field_70177_z;
        en2.field_70759_as = field_70177_z;
        en.field_70177_z = field_70177_z;
        fc.en.field_70125_A = fc.mc.field_71439_g.field_70125_A;
        final double s = 0.215 * fc.a.getInput();
        if (Keyboard.isKeyDown(fc.mc.field_71474_y.field_74351_w.func_151463_i())) {
            final double rad = fc.en.field_70759_as * 0.017453292519943295;
            final double dx = -1.0 * Math.sin(rad) * s;
            final double dz = Math.cos(rad) * s;
            final EntityOtherPlayerMP en3 = fc.en;
            en3.field_70165_t += dx;
            final EntityOtherPlayerMP en4 = fc.en;
            en4.field_70161_v += dz;
        }
        if (Keyboard.isKeyDown(fc.mc.field_71474_y.field_74368_y.func_151463_i())) {
            final double rad = fc.en.field_70759_as * 0.017453292519943295;
            final double dx = -1.0 * Math.sin(rad) * s;
            final double dz = Math.cos(rad) * s;
            final EntityOtherPlayerMP en5 = fc.en;
            en5.field_70165_t -= dx;
            final EntityOtherPlayerMP en6 = fc.en;
            en6.field_70161_v -= dz;
        }
        if (Keyboard.isKeyDown(fc.mc.field_71474_y.field_74370_x.func_151463_i())) {
            final double rad = (fc.en.field_70759_as - 90.0f) * 0.017453292519943295;
            final double dx = -1.0 * Math.sin(rad) * s;
            final double dz = Math.cos(rad) * s;
            final EntityOtherPlayerMP en7 = fc.en;
            en7.field_70165_t += dx;
            final EntityOtherPlayerMP en8 = fc.en;
            en8.field_70161_v += dz;
        }
        if (Keyboard.isKeyDown(fc.mc.field_71474_y.field_74366_z.func_151463_i())) {
            final double rad = (fc.en.field_70759_as + 90.0f) * 0.017453292519943295;
            final double dx = -1.0 * Math.sin(rad) * s;
            final double dz = Math.cos(rad) * s;
            final EntityOtherPlayerMP en9 = fc.en;
            en9.field_70165_t += dx;
            final EntityOtherPlayerMP en10 = fc.en;
            en10.field_70161_v += dz;
        }
        if (Keyboard.isKeyDown(fc.mc.field_71474_y.field_74314_A.func_151463_i())) {
            final EntityOtherPlayerMP en11 = fc.en;
            en11.field_70163_u += 0.93 * s;
        }
        if (Keyboard.isKeyDown(fc.mc.field_71474_y.field_74311_E.func_151463_i())) {
            final EntityOtherPlayerMP en12 = fc.en;
            en12.field_70163_u -= 0.93 * s;
        }
        fc.mc.field_71439_g.func_70095_a(false);
        if (this.lcc[0] != Integer.MAX_VALUE && (this.lcc[0] != fc.en.field_70176_ah || this.lcc[1] != fc.en.field_70164_aj)) {
            final int x = fc.en.field_70176_ah;
            final int z = fc.en.field_70164_aj;
            fc.mc.field_71441_e.func_147458_c(x * 16, 0, z * 16, x * 16 + 15, 256, z * 16 + 15);
        }
        this.lcc[0] = fc.en.field_70176_ah;
        this.lcc[1] = fc.en.field_70164_aj;
    }
    
    @SubscribeEvent
    public void re(final RenderWorldLastEvent e) {
        if (ay.e()) {
            final EntityPlayerSP field_71439_g = fc.mc.field_71439_g;
            final EntityPlayerSP field_71439_g2 = fc.mc.field_71439_g;
            final float n = 700.0f;
            field_71439_g2.field_71164_i = n;
            field_71439_g.field_71155_g = n;
            ru.ee((Entity)fc.mc.field_71439_g, 1, 0.0, 0.0, Color.green.getRGB(), false);
            ru.ee((Entity)fc.mc.field_71439_g, 2, 0.0, 0.0, Color.green.getRGB(), false);
        }
    }
    
    @SubscribeEvent
    public void m(final MouseEvent e) {
        if (ay.e() && e.button != -1) {
            e.setCanceled(true);
        }
    }
    
    static {
        fc.en = null;
    }
}
