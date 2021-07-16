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

public class pe extends bb
{
    public static dc g;
    public static ap a;
    public static ap b;
    public static ap c;
    public static ap i;
    public static ap j;
    public static cb d;
    public static cb f;
    public static cb h;
    public static cb t1;
    public static cb t2;
    public static cb t3;
    public static cb t4;
    public static cb t5;
    public static cb t6;
    private int rgb_c;
    
    public pe() {
        super(new char[] { 'P', 'l', 'a', 'y', 'e', 'r', 'E', 'S', 'P' }, bb.render, 0);
        this.rgb_c = 0;
        this.registerSetting(pe.a = new ap(new char[] { 'R', 'e', 'd' }, 0.0, 0.0, 255.0, 1.0));
        this.registerSetting(pe.b = new ap(new char[] { 'G', 'r', 'e', 'e', 'n' }, 255.0, 0.0, 255.0, 1.0));
        this.registerSetting(pe.c = new ap(new char[] { 'B', 'l', 'u', 'e' }, 0.0, 0.0, 255.0, 1.0));
        this.registerSetting(pe.d = new cb(new char[] { 'R', 'a', 'i', 'n', 'b', 'o', 'w' }, false));
        this.registerSetting(pe.g = new dc(new String(new char[] { 'E', 'S', 'P', ' ', 'T', 'y', 'p', 'e', 's' })));
        this.registerSetting(pe.t3 = new cb(new char[] { '2', 'D' }, false));
        this.registerSetting(pe.t5 = new cb(new char[] { 'A', 'r', 'r', 'o', 'w' }, false));
        this.registerSetting(pe.t1 = new cb(new char[] { 'B', 'o', 'x' }, false));
        this.registerSetting(pe.t4 = new cb(new char[] { 'H', 'e', 'a', 'l', 't', 'h' }, true));
        this.registerSetting(pe.t6 = new cb(new char[] { 'R', 'i', 'n', 'g' }, false));
        this.registerSetting(pe.t2 = new cb(new char[] { 'S', 'h', 'a', 'd', 'e', 'd' }, false));
        this.registerSetting(pe.i = new ap(new char[] { 'E', 'x', 'p', 'a', 'n', 'd' }, 0.0, -0.3, 2.0, 0.1));
        this.registerSetting(pe.j = new ap(new char[] { 'X', '-', 'S', 'h', 'i', 'f', 't' }, 0.0, -35.0, 10.0, 1.0));
        this.registerSetting(pe.f = new cb(new char[] { 'S', 'h', 'o', 'w', ' ', 'i', 'n', 'v', 'i', 's' }, true));
        this.registerSetting(pe.h = new cb(new char[] { 'R', 'e', 'd', ' ', 'o', 'n', ' ', 'd', 'a', 'm', 'a', 'g', 'e' }, true));
    }
    
    @Override
    public void onDisable() {
        ru.ring_c = false;
    }
    
    @Override
    public void guiUpdate() {
        this.rgb_c = new Color((int)pe.a.getInput(), (int)pe.b.getInput(), (int)pe.c.getInput()).getRGB();
    }
    
    @SubscribeEvent
    public void r1(final RenderWorldLastEvent e) {
        if (!ay.e()) {
            return;
        }
        final int rgb = pe.d.isToggled() ? 0 : this.rgb_c;
        if (w.dbg) {
            for (final Entity en : pe.mc.field_71441_e.field_72996_f) {
                if (en instanceof EntityLivingBase && en != pe.mc.field_71439_g) {
                    this.r(en, rgb);
                }
            }
        }
        else {
            for (final EntityPlayer en2 : pe.mc.field_71441_e.field_73010_i) {
                if (en2 != pe.mc.field_71439_g && en2.field_70725_aQ == 0) {
                    if (!pe.f.isToggled() && en2.func_82150_aj()) {
                        continue;
                    }
                    if (an.bot((Entity)en2)) {
                        continue;
                    }
                    this.r((Entity)en2, rgb);
                }
            }
        }
    }
    
    private void r(final Entity en, final int rgb) {
        if (pe.t1.isToggled()) {
            ru.ee(en, 1, pe.i.getInput(), pe.j.getInput(), rgb, pe.h.isToggled());
        }
        if (pe.t2.isToggled()) {
            ru.ee(en, 2, pe.i.getInput(), pe.j.getInput(), rgb, pe.h.isToggled());
        }
        if (pe.t3.isToggled()) {
            ru.ee(en, 3, pe.i.getInput(), pe.j.getInput(), rgb, pe.h.isToggled());
        }
        if (pe.t4.isToggled()) {
            ru.ee(en, 4, pe.i.getInput(), pe.j.getInput(), rgb, pe.h.isToggled());
        }
        if (pe.t5.isToggled()) {
            ru.ee(en, 5, pe.i.getInput(), pe.j.getInput(), rgb, pe.h.isToggled());
        }
        if (pe.t6.isToggled()) {
            ru.ee(en, 6, pe.i.getInput(), pe.j.getInput(), rgb, pe.h.isToggled());
        }
    }
}
