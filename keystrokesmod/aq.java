// 
// Decompiled by Procyon v0.5.36
// 

package keystrokesmod;

import net.minecraft.client.gui.GuiButton;
import java.awt.Color;
import net.minecraft.client.gui.FontRenderer;
import java.io.IOException;
import DEOBFUSCATED-NAMES.ru;
import DEOBFUSCATED-NAMES.str;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraftforge.fml.client.config.GuiButtonExt;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import java.util.Iterator;
import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import DEOBFUSCATED-NAMES.ay;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraft.client.gui.GuiScreen;
import DEOBFUSCATED-NAMES.m2;
import DEOBFUSCATED-NAMES.b9;
import DEOBFUSCATED-NAMES.cb;

public static class aq extends bb
{
    public static cb ep;
    public static cb sh;
    public static cb al;
    private static int hudX;
    private static int hudY;
    
    public aq() {
        super(new char[] { 'H', 'U', 'D' }, bb.render, 0);
        this.registerSetting(aq.ep = new cb(new char[] { 'E', 'd', 'i', 't', ' ', 'p', 'o', 's', 'i', 't', 'i', 'o', 'n' }, false));
        this.registerSetting(aq.sh = new cb(new char[] { 'D', 'r', 'o', 'p', ' ', 's', 'h', 'a', 'd', 'o', 'w' }, true));
        this.registerSetting(aq.al = new cb(new char[] { 'A', 'l', 'p', 'h', 'a', 'b', 'e', 't', 'i', 'c', 'a', 'l', ' ', 's', 'o', 'r', 't' }, false));
    }
    
    @Override
    public void onEnable() {
        m2.sort();
    }
    
    @Override
    public void guiButtonToggled(final cb b) {
        if (b == aq.ep) {
            aq.ep.disable();
            aq.mc.func_147108_a((GuiScreen)new aq());
        }
        else if (b == aq.al) {
            m2.sort();
        }
    }
    
    @SubscribeEvent
    public void a(final TickEvent.RenderTickEvent ev) {
        if (ev.phase == TickEvent.Phase.END && ay.e()) {
            if (aq.mc.field_71462_r != null || aq.mc.field_71474_y.field_74330_P) {
                return;
            }
            int y = aq.hudY;
            int del = 0;
            final List<bb> en = new ArrayList<bb>(m2.enModsList);
            for (final bb m : en) {
                if (m.isEnabled()) {
                    if (m == this) {
                        continue;
                    }
                    aq.mc.field_71466_p.func_175065_a(m.g3tN4m3(), (float)aq.hudX, (float)y, ay.gc(2L, del), aq.sh.isToggled());
                    y += aq.mc.field_71466_p.field_78288_b + 2;
                    del -= 120;
                }
            }
        }
    }
    
    static {
        aq.hudX = 5;
        aq.hudY = 70;
    }
    
    static class eh extends GuiScreen
    {
        final String a;
        GuiButtonExt rp;
        boolean d;
        int miX;
        int miY;
        int maX;
        int maY;
        int aX;
        int aY;
        int laX;
        int laY;
        int lmX;
        int lmY;
        
        eh() {
            ((aq)this).a = new String(new char[] { 'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', 'n', '-', 'E', 'x', 'a', 'm', 'p', 'l', 'e', '-', 'H', 'U', 'D' });
            ((aq)this).d = false;
            ((aq)this).miX = 0;
            ((aq)this).miY = 0;
            ((aq)this).maX = 0;
            ((aq)this).maY = 0;
            ((aq)this).aX = 5;
            ((aq)this).aY = 70;
            ((aq)this).laX = 0;
            ((aq)this).laY = 0;
            ((aq)this).lmX = 0;
            ((aq)this).lmY = 0;
        }
        
        public void func_73866_w_() {
            super.func_73866_w_();
            ((aq)this).field_146292_n.add(((aq)this).rp = new GuiButtonExt(1, ((aq)this).field_146294_l - 90, 5, 85, 20, new String(new char[] { 'R', 'e', 's', 'e', 't', ' ', 'p', 'o', 's', 'i', 't', 'i', 'o', 'n' })));
            ((aq)this).aX = aq.hudX;
            ((aq)this).aY = aq.hudY;
        }
        
        public void func_73863_a(final int mX, final int mY, final float pt) {
            aq.func_73734_a(0, 0, ((aq)this).field_146294_l, ((aq)this).field_146295_m, -1308622848);
            final int miX = ((aq)this).aX;
            final int miY = ((aq)this).aY;
            final int maX = miX + 50;
            final int maY = miY + 32;
            super.d(((aq)this).field_146297_k.field_71466_p, ((aq)this).a);
            ((aq)this).miX = miX;
            ((aq)this).miY = miY;
            ((aq)this).maX = maX;
            ((aq)this).maY = maY;
            aq.hudX = miX;
            aq.hudY = miY;
            final ScaledResolution res = new ScaledResolution(((aq)this).field_146297_k);
            final int x = res.func_78326_a() / 2 - 84;
            final int y = res.func_78328_b() / 2 - 20;
            ru.dct(str.edit_hud_pos, '-', x, y, 2L, 0L, true, ((aq)this).field_146297_k.field_71466_p);
            try {
                ((aq)this).func_146269_k();
            }
            catch (IOException ex) {}
            super.func_73863_a(mX, mY, pt);
        }
        
        private void d(final FontRenderer fr, final String t) {
            final int x = ((aq)this).miX;
            int y = ((aq)this).miY;
            for (final String s : t.split("-")) {
                fr.func_175065_a(s, (float)x, (float)y, Color.white.getRGB(), aq.sh.isToggled());
                y += fr.field_78288_b + 2;
            }
        }
        
        protected void func_146273_a(final int mX, final int mY, final int b, final long t) {
            super.func_146273_a(mX, mY, b, t);
            if (b != 0) {
                return;
            }
            if (((aq)this).d) {
                ((aq)this).aX = ((aq)this).laX + (mX - ((aq)this).lmX);
                ((aq)this).aY = ((aq)this).laY + (mY - ((aq)this).lmY);
            }
            else if (mX > ((aq)this).miX && mX < ((aq)this).maX && mY > ((aq)this).miY && mY < ((aq)this).maY) {
                ((aq)this).d = true;
                ((aq)this).lmX = mX;
                ((aq)this).lmY = mY;
                ((aq)this).laX = ((aq)this).aX;
                ((aq)this).laY = ((aq)this).aY;
            }
        }
        
        protected void func_146286_b(final int mX, final int mY, final int s) {
            super.func_146286_b(mX, mY, s);
            if (s == 0) {
                ((aq)this).d = false;
            }
        }
        
        public void func_146284_a(final GuiButton b) {
            if (b == ((aq)this).rp) {
                ((aq)this).aX = (aq.hudX = 5);
                ((aq)this).aY = (aq.hudY = 70);
            }
        }
        
        public boolean func_73868_f() {
            return false;
        }
    }
}
