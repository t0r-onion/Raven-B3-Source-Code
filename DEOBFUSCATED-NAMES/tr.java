// 
// Decompiled by Procyon v0.5.36
// 

package DEOBFUSCATED-NAMES;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import java.util.Iterator;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import java.awt.Color;
import keystrokesmod.bb;

public class tr extends bb
{
    public static cb a;
    public static ap b;
    public static ap c;
    public static ap d;
    public static cb e;
    public static ap f;
    private boolean g;
    private int rgb_c;
    
    public tr() {
        super(new char[] { 'T', 'r', 'a', 'c', 'e', 'r', 's' }, bb.render, 0);
        this.rgb_c = 0;
        this.registerSetting(tr.a = new cb(new char[] { 'S', 'h', 'o', 'w', ' ', 'i', 'n', 'v', 'i', 's' }, true));
        this.registerSetting(tr.f = new ap(new char[] { 'L', 'i', 'n', 'e', ' ', 'W', 'i', 'd', 't', 'h' }, 1.0, 1.0, 5.0, 1.0));
        this.registerSetting(tr.b = new ap(new char[] { 'R', 'e', 'd' }, 0.0, 0.0, 255.0, 1.0));
        this.registerSetting(tr.c = new ap(new char[] { 'G', 'r', 'e', 'e', 'n' }, 255.0, 0.0, 255.0, 1.0));
        this.registerSetting(tr.d = new ap(new char[] { 'B', 'l', 'u', 'e' }, 0.0, 0.0, 255.0, 1.0));
        this.registerSetting(tr.e = new cb(new char[] { 'R', 'a', 'i', 'n', 'b', 'o', 'w' }, false));
    }
    
    @Override
    public void onEnable() {
        this.g = tr.mc.field_71474_y.field_74336_f;
        if (this.g) {
            tr.mc.field_71474_y.field_74336_f = false;
        }
    }
    
    @Override
    public void onDisable() {
        tr.mc.field_71474_y.field_74336_f = this.g;
    }
    
    @Override
    public void update() {
        if (tr.mc.field_71474_y.field_74336_f) {
            tr.mc.field_71474_y.field_74336_f = false;
        }
    }
    
    @Override
    public void guiUpdate() {
        this.rgb_c = new Color((int)tr.b.getInput(), (int)tr.c.getInput(), (int)tr.d.getInput()).getRGB();
    }
    
    @SubscribeEvent
    public void o(final RenderWorldLastEvent ev) {
        if (!ay.e()) {
            return;
        }
        final int rgb = tr.e.isToggled() ? ay.gc(2L, 0L) : this.rgb_c;
        if (w.dbg) {
            for (final Entity en : tr.mc.field_71441_e.field_72996_f) {
                if (en instanceof EntityLivingBase && en != tr.mc.field_71439_g) {
                    ru.dtl(en, rgb, (float)tr.f.getInput());
                }
            }
        }
        else {
            for (final EntityPlayer en2 : tr.mc.field_71441_e.field_73010_i) {
                if (en2 != tr.mc.field_71439_g && en2.field_70725_aQ == 0) {
                    if (!tr.a.isToggled() && en2.func_82150_aj()) {
                        continue;
                    }
                    if (an.bot((Entity)en2)) {
                        continue;
                    }
                    ru.dtl((Entity)en2, rgb, (float)tr.f.getInput());
                }
            }
        }
    }
}
