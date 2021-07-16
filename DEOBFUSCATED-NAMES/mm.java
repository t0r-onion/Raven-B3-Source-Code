// 
// Decompiled by Procyon v0.5.36
// 

package DEOBFUSCATED-NAMES;

import java.util.ArrayList;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.item.Item;
import java.util.Iterator;
import java.awt.Color;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemSword;
import net.minecraft.entity.Entity;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraft.entity.player.EntityPlayer;
import java.util.List;
import keystrokesmod.bb;

public class mm extends bb
{
    public static cb a;
    public static cb b;
    public static cb c;
    private static List<EntityPlayer> mur;
    private static List<EntityPlayer> det;
    private final String c1;
    private final String c2;
    private final String c3;
    private final String c4;
    private final String c5;
    private final String c6;
    private final String c7;
    
    public mm() {
        super(new char[] { 'M', 'u', 'r', 'd', 'e', 'r', ' ', 'M', 'y', 's', 't', 'e', 'r', 'y' }, bb.minigames, 0);
        this.c1 = new String(new char[] { 'M', 'U', 'R', 'D', 'E', 'R' });
        this.c2 = new String(new char[] { 'M', 'Y', 'S', 'T', 'E', 'R', 'Y' });
        this.c3 = new String(new char[] { 'R', 'o', 'l', 'e', ':' });
        this.c4 = new String(new char[] { '&', '7', '[', '&', 'c', 'A', 'L', 'E', 'R', 'T', '&', '7', ']' });
        this.c5 = new String(new char[] { 'n', 'o', 't', 'e', '.', 'p', 'l', 'i', 'n', 'g' });
        this.c6 = new String(new char[] { 'i', 's', ' ', 'a', ' ', 'm', 'u', 'r', 'd', 'e', 'r', 'e', 'r', '!' });
        this.c7 = new String(new char[] { 'h', 'a', 's', ' ', 'a', ' ', 'b', 'o', 'w', '!' });
        this.registerSetting(mm.a = new cb(new char[] { 'A', 'l', 'e', 'r', 't' }, true));
        this.registerSetting(mm.b = new cb(new char[] { 'S', 'e', 'a', 'r', 'c', 'h', ' ', 'd', 'e', 't', 'e', 'c', 't', 'i', 'v', 'e', 's' }, true));
        this.registerSetting(mm.c = new cb(new char[] { 'A', 'n', 'n', 'o', 'u', 'n', 'c', 'e', ' ', 'm', 'u', 'r', 'd', 'e', 'r', 'e', 'r' }, false));
    }
    
    @SubscribeEvent
    public void o(final RenderWorldLastEvent e) {
        if (!ay.e()) {
            return;
        }
        if (m2.pe.isEnabled()) {
            m2.pe.disable();
        }
        if (!this.imm()) {
            this.c();
            return;
        }
        for (final EntityPlayer en : mm.mc.field_71441_e.field_73010_i) {
            if (en != mm.mc.field_71439_g && !en.func_82150_aj()) {
                if (an.bot((Entity)en)) {
                    continue;
                }
                if (en.func_70694_bm() != null && en.func_70694_bm().func_82837_s()) {
                    final Item i = en.func_70694_bm().func_77973_b();
                    if (i instanceof ItemSword || i instanceof ItemAxe || en.func_70694_bm().func_82833_r().contains("aKnife")) {
                        if (!mm.mur.contains(en)) {
                            mm.mur.add(en);
                            if (mm.a.isToggled()) {
                                mm.mc.field_71439_g.func_85030_a(this.c5, 1.0f, 1.0f);
                                ay.sm(this.c4 + " &e" + en.func_70005_c_() + " &3" + this.c6);
                            }
                            if (mm.c.isToggled()) {
                                mm.mc.field_71439_g.func_71165_d(en.func_70005_c_() + " " + this.c6);
                            }
                        }
                        else if (i instanceof ItemBow && mm.b.isToggled() && !mm.det.contains(en)) {
                            mm.det.add(en);
                            if (mm.a.isToggled()) {
                                ay.sm(this.c4 + " &e" + en.func_70005_c_() + " &3" + this.c7);
                            }
                            if (mm.c.isToggled()) {
                                mm.mc.field_71439_g.func_71165_d(en.func_70005_c_() + " " + this.c7);
                            }
                        }
                    }
                }
                int rgb = Color.green.getRGB();
                if (mm.mur.contains(en)) {
                    rgb = Color.red.getRGB();
                }
                else if (mm.det.contains(en)) {
                    rgb = Color.orange.getRGB();
                }
                ru.ee((Entity)en, 2, 0.0, 0.0, rgb, false);
            }
        }
    }
    
    private boolean imm() {
        if (ay.isHyp()) {
            if (mm.mc.field_71439_g.func_96123_co() == null || mm.mc.field_71439_g.func_96123_co().func_96539_a(1) == null) {
                return false;
            }
            final String d = mm.mc.field_71439_g.func_96123_co().func_96539_a(1).func_96678_d();
            if (!d.contains(this.c1) && !d.contains(this.c2)) {
                return false;
            }
            for (final String l : ay.gsl()) {
                final String s = ay.str(l);
                if (s.contains(this.c3)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private void c() {
        mm.mur.clear();
        mm.det.clear();
    }
    
    static {
        mm.mur = new ArrayList<EntityPlayer>();
        mm.det = new ArrayList<EntityPlayer>();
    }
}
