// 
// Decompiled by Procyon v0.5.36
// 

package DEOBFUSCATED-NAMES;

import net.minecraft.client.gui.GuiButton;
import java.util.Iterator;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.client.gui.inventory.GuiInventory;
import java.awt.Color;
import java.util.concurrent.TimeUnit;
import keystrokesmod.bb$category;
import keystrokesmod.bb;
import keystrokesmod.cm;
import java.util.ArrayList;
import net.minecraft.client.gui.GuiTextField;
import net.minecraftforge.fml.client.config.GuiButtonExt;
import net.minecraft.client.gui.ScaledResolution;
import java.util.concurrent.ScheduledFuture;
import net.minecraft.client.gui.GuiScreen;

public class m extends GuiScreen
{
    private ScheduledFuture sf;
    private am aT;
    private am aL;
    private am aE;
    private am aR;
    private ScaledResolution sr;
    private GuiButtonExt s;
    private GuiTextField c;
    public static ArrayList<cm> c4tL1st;
    
    public m() {
        m.c4tL1st = new ArrayList<cm>();
        int y = 5;
        bb$category[] values;
        for (int length = ((bb[])(values = (bb$category[])bb.values())).length, i = 0; i < length; ++i) {
            final bb$category c = values[i];
            final cm f = (cm)new DEOBFUSCATED-NAMES.cm((bb)c);
            ((DEOBFUSCATED-NAMES.cm)f).y(y);
            m.c4tL1st.add(f);
            y += 20;
        }
    }
    
    public void initMain() {
        final am at = new am(500.0f);
        this.aR = at;
        this.aE = at;
        (this.aT = at).start();
        final am al;
        this.sf = w.gE().schedule(() -> {
            al = new am(650.0f);
            (this.aL = al).start();
        }, 650L, TimeUnit.MILLISECONDS);
    }
    
    public void func_73866_w_() {
        super.func_73866_w_();
        this.sr = new ScaledResolution(this.field_146297_k);
        (this.c = new GuiTextField(1, this.field_146297_k.field_71466_p, 22, this.field_146295_m - 100, 150, 20)).func_146203_f(256);
        this.field_146292_n.add(this.s = new GuiButtonExt(2, 22, this.field_146295_m - 70, 150, 20, str.c20));
        this.s.field_146125_m = cd.a;
    }
    
    public void func_73863_a(final int x, final int y, final float p) {
        func_73734_a(0, 0, this.field_146294_l, this.field_146295_m, (int)(this.aR.getValueFloat(0.0f, 0.7f, 2) * 255.0f) << 24);
        final int h = this.field_146295_m / 4;
        final int wd = this.field_146294_l / 2;
        final int w_c = 30 - this.aT.getValueInt(0, 30, 3);
        this.func_73732_a(this.field_146289_q, "r", wd + 1 - w_c, h - 25, ay.gc(2L, 1500L));
        this.func_73732_a(this.field_146289_q, "a", wd - w_c, h - 15, ay.gc(2L, 1200L));
        this.func_73732_a(this.field_146289_q, "v", wd - w_c, h - 5, ay.gc(2L, 900L));
        this.func_73732_a(this.field_146289_q, "e", wd - w_c, h + 5, ay.gc(2L, 600L));
        this.func_73732_a(this.field_146289_q, "n", wd - w_c, h + 15, ay.gc(2L, 300L));
        this.func_73732_a(this.field_146289_q, "b3", wd + 1 + w_c, h + 30, ay.gc(2L, 0L));
        this.func_73728_b(wd - 10 - w_c, h - 30, h + 43, Color.white.getRGB());
        this.func_73728_b(wd + 10 + w_c, h - 30, h + 43, Color.white.getRGB());
        if (this.aL != null) {
            final int w_c2 = this.aL.getValueInt(0, 20, 2);
            this.func_73730_a(wd - 10, wd - 10 + w_c2, h - 29, -1);
            this.func_73730_a(wd + 10, wd + 10 - w_c2, h + 42, -1);
        }
        for (final cm c : m.c4tL1st) {
            ((DEOBFUSCATED-NAMES.cm)c).rf(this.field_146289_q);
            ((DEOBFUSCATED-NAMES.cm)c).up(x, y);
            for (final keystrokesmod.b m : ((DEOBFUSCATED-NAMES.cm)c).gc()) {
                ((b)m).uu(x, y);
            }
        }
        GuiInventory.func_147046_a(this.field_146294_l + 15 - this.aE.getValueInt(0, 40, 2), this.field_146295_m - 10, 40, (float)(this.field_146294_l - 25 - x), (float)(this.field_146295_m - 50 - y), (EntityLivingBase)this.field_146297_k.field_71439_g);
        if (cd.a) {
            if (!this.s.field_146125_m) {
                this.s.field_146125_m = true;
            }
            int r = cd.m.isToggled() ? cd.an.getValueInt(0, 200, 2) : 200;
            if (cd.b) {
                r = 200 - r;
                if (r == 0) {
                    cd.b = false;
                    cd.a = false;
                    this.s.field_146125_m = false;
                }
            }
            func_73734_a(0, 0, r, this.field_146295_m, -1089466352);
            this.func_73730_a(0, r - 1, this.field_146295_m - 345, -1);
            this.func_73730_a(0, r - 1, this.field_146295_m - 115, -1);
            func_73734_a(r - 1, 0, r, this.field_146295_m, -1);
            gc.rc(this.field_146289_q, this.field_146295_m, r, this.sr.func_78325_e());
            final int x2 = r - 178;
            this.c.field_146209_f = x2;
            this.s.field_146128_h = x2;
            this.c.func_146194_f();
            super.func_73863_a(x, y, p);
        }
        else if (cd.b) {
            cd.b = false;
        }
    }
    
    public void func_73864_a(final int x, final int y, final int m) {
        for (final cm c4t : m.c4tL1st) {
            if (((DEOBFUSCATED-NAMES.cm)c4t).v(x, y) && !((DEOBFUSCATED-NAMES.cm)c4t).i(x, y) && !((DEOBFUSCATED-NAMES.cm)c4t).d(x, y) && m == 0) {
                ((DEOBFUSCATED-NAMES.cm)c4t).d(true);
                ((DEOBFUSCATED-NAMES.cm)c4t).xx = x - ((DEOBFUSCATED-NAMES.cm)c4t).gx();
                ((DEOBFUSCATED-NAMES.cm)c4t).yy = y - ((DEOBFUSCATED-NAMES.cm)c4t).gy();
            }
            if (((DEOBFUSCATED-NAMES.cm)c4t).d(x, y) && m == 0) {
                ((DEOBFUSCATED-NAMES.cm)c4t).oo(!((DEOBFUSCATED-NAMES.cm)c4t).fv());
            }
            if (((DEOBFUSCATED-NAMES.cm)c4t).i(x, y) && m == 0) {
                ((DEOBFUSCATED-NAMES.cm)c4t).cv(!((DEOBFUSCATED-NAMES.cm)c4t).p());
            }
            if (((DEOBFUSCATED-NAMES.cm)c4t).fv() && !((DEOBFUSCATED-NAMES.cm)c4t).gc().isEmpty()) {
                for (final keystrokesmod.b c : ((DEOBFUSCATED-NAMES.cm)c4t).gc()) {
                    ((b)c).onCl1ck(x, y, m);
                }
            }
        }
        if (cd.a) {
            this.c.func_146192_a(x, y, m);
            super.func_73864_a(x, y, m);
        }
    }
    
    public void func_146286_b(final int x, final int y, final int s) {
        if (s == 0) {
            for (final cm c4t : m.c4tL1st) {
                ((DEOBFUSCATED-NAMES.cm)c4t).d(false);
            }
            for (final cm c4t : m.c4tL1st) {
                if (((DEOBFUSCATED-NAMES.cm)c4t).fv() && !((DEOBFUSCATED-NAMES.cm)c4t).gc().isEmpty()) {
                    for (final keystrokesmod.b c : ((DEOBFUSCATED-NAMES.cm)c4t).gc()) {
                        ((b)c).mr(x, y, s);
                    }
                }
            }
        }
    }
    
    public void func_73869_a(final char t, final int k) {
        if (k == 1) {
            this.field_146297_k.func_147108_a((GuiScreen)null);
            return;
        }
        for (final cm c4t : m.c4tL1st) {
            if (((DEOBFUSCATED-NAMES.cm)c4t).fv() && k != 1 && !((DEOBFUSCATED-NAMES.cm)c4t).gc().isEmpty()) {
                for (final keystrokesmod.b c : ((DEOBFUSCATED-NAMES.cm)c4t).gc()) {
                    ((b)c).ky(t, k);
                }
            }
        }
        if (cd.a) {
            final String cm = this.c.func_146179_b();
            if (k == 28 && !cm.isEmpty()) {
                gc.rCMD(this.c.func_146179_b());
                this.c.func_146180_a("");
                return;
            }
            this.c.func_146201_a(t, k);
        }
    }
    
    public void func_146284_a(final GuiButton b) {
        if (b == this.s) {
            gc.rCMD(this.c.func_146179_b());
            this.c.func_146180_a("");
        }
    }
    
    public void func_146281_b() {
        ab.ss();
        this.aL = null;
        if (this.sf != null) {
            this.sf.cancel(true);
            this.sf = null;
        }
    }
    
    public boolean func_73868_f() {
        return false;
    }
}
