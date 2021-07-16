// 
// Decompiled by Procyon v0.5.36
// 

package keystrokesmod;

import DEOBFUSCATED-NAMES.ru;
import java.awt.Color;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import java.util.Iterator;
import java.util.Collection;
import DEOBFUSCATED-NAMES.ay;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import java.util.TimerTask;
import java.util.ArrayList;
import DEOBFUSCATED-NAMES.b9;
import net.minecraft.util.BlockPos;
import java.util.List;
import java.util.Timer;
import DEOBFUSCATED-NAMES.cb;
import DEOBFUSCATED-NAMES.ap;

public class xr extends bb
{
    public static ap r;
    public static cb a;
    public static cb b;
    public static cb c;
    public static cb d;
    public static cb e;
    public static cb f;
    public static cb g;
    public static cb h;
    private Timer t;
    private List<BlockPos> ren;
    private final long per = 200L;
    
    public xr() {
        super(new char[] { 'X', 'r', 'a', 'y' }, bb.render, 0);
        this.registerSetting(xr.r = new ap(new char[] { 'R', 'a', 'n', 'g', 'e' }, 20.0, 5.0, 50.0, 1.0));
        this.registerSetting(xr.a = new cb(new char[] { 'I', 'r', 'o', 'n' }, true));
        this.registerSetting(xr.b = new cb(new char[] { 'G', 'o', 'l', 'd' }, true));
        this.registerSetting(xr.c = new cb(new char[] { 'D', 'i', 'a', 'm', 'o', 'n', 'd' }, true));
        this.registerSetting(xr.d = new cb(new char[] { 'E', 'm', 'e', 'r', 'a', 'l', 'd' }, true));
        this.registerSetting(xr.e = new cb(new char[] { 'L', 'a', 'p', 'i', 's' }, true));
        this.registerSetting(xr.f = new cb(new char[] { 'R', 'e', 'd', 's', 't', 'o', 'n', 'e' }, true));
        this.registerSetting(xr.g = new cb(new char[] { 'C', 'o', 'a', 'l' }, true));
        this.registerSetting(xr.h = new cb(new char[] { 'S', 'p', 'a', 'w', 'n', 'e', 'r' }, true));
    }
    
    @Override
    public void onEnable() {
        this.ren = new ArrayList<BlockPos>();
        (this.t = new Timer()).scheduleAtFixedRate(this.t(), 0L, 200L);
    }
    
    @Override
    public void onDisable() {
        if (this.t != null) {
            this.t.cancel();
            this.t.purge();
            this.t = null;
        }
    }
    
    private TimerTask t() {
        final TimerTask t = new TimerTask() {
            @Override
            public void run() {
                keystrokesmod.xr.this.ren.clear();
                int y;
                for (int ra = y = (int)keystrokesmod.xr.r.getInput(); y >= -ra; --y) {
                    for (int x = -ra; x <= ra; ++x) {
                        for (int z = -ra; z <= ra; ++z) {
                            final BlockPos p = new BlockPos(bb.mc.field_71439_g.field_70165_t + x, bb.mc.field_71439_g.field_70163_u + y, bb.mc.field_71439_g.field_70161_v + z);
                            final Block bl = bb.mc.field_71441_e.func_180495_p(p).func_177230_c();
                            if ((keystrokesmod.xr.a.isToggled() && bl.equals(Blocks.field_150366_p)) || (keystrokesmod.xr.b.isToggled() && bl.equals(Blocks.field_150352_o)) || (keystrokesmod.xr.c.isToggled() && bl.equals(Blocks.field_150482_ag)) || (keystrokesmod.xr.d.isToggled() && bl.equals(Blocks.field_150412_bA)) || (keystrokesmod.xr.e.isToggled() && bl.equals(Blocks.field_150369_x)) || (keystrokesmod.xr.f.isToggled() && bl.equals(Blocks.field_150450_ax)) || (keystrokesmod.xr.g.isToggled() && bl.equals(Blocks.field_150365_q)) || (keystrokesmod.xr.h.isToggled() && bl.equals(Blocks.field_150474_ac))) {
                                keystrokesmod.xr.this.ren.add(p);
                            }
                        }
                    }
                }
            }
        };
        return t;
    }
    
    @SubscribeEvent
    public void orl(final RenderWorldLastEvent ev) {
        if (ay.e() && !this.ren.isEmpty()) {
            final List<BlockPos> tRen = new ArrayList<BlockPos>(this.ren);
            for (final BlockPos p : tRen) {
                this.dr(p);
            }
        }
    }
    
    private void dr(final BlockPos p) {
        final int[] rgb = this.c(xr.mc.field_71441_e.func_180495_p(p).func_177230_c());
        if (rgb[0] + rgb[1] + rgb[2] != 0) {
            ru.re(p, new Color(rgb[0], rgb[1], rgb[2]).getRGB(), true);
        }
    }
    
    private int[] c(final Block b) {
        int red = 0;
        int green = 0;
        int blue = 0;
        if (b.equals(Blocks.field_150366_p)) {
            red = 255;
            green = 255;
            blue = 255;
        }
        else if (b.equals(Blocks.field_150352_o)) {
            red = 255;
            green = 255;
        }
        else if (b.equals(Blocks.field_150482_ag)) {
            green = 220;
            blue = 255;
        }
        else if (b.equals(Blocks.field_150412_bA)) {
            red = 35;
            green = 255;
        }
        else if (b.equals(Blocks.field_150369_x)) {
            green = 50;
            blue = 255;
        }
        else if (b.equals(Blocks.field_150450_ax)) {
            red = 255;
        }
        else if (b.equals(Blocks.field_150474_ac)) {
            red = 30;
            blue = 135;
        }
        return new int[] { red, green, blue };
    }
}
