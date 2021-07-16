// 
// Decompiled by Procyon v0.5.36
// 

package DEOBFUSCATED-NAMES;

import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;
import java.util.Iterator;
import java.awt.Color;
import java.util.ArrayList;
import keystrokesmod.bb;

public class m3 extends b
{
    private final int c1;
    private final int c2;
    public bb mod;
    public cm c4t;
    public int o;
    private ArrayList<keystrokesmod.b> sn;
    public boolean po;
    
    public m3(final bb mod, final cm p, final int o) {
        this.c1 = new Color(0, 85, 255).getRGB();
        this.c2 = new Color(154, 2, 255).getRGB();
        this.mod = mod;
        this.c4t = p;
        this.o = o;
        this.sn = new ArrayList<keystrokesmod.b>();
        this.po = false;
        int y = o + 12;
        if (!mod.v().isEmpty()) {
            for (final keystrokesmod.b9 v : mod.v()) {
                if (v instanceof ap) {
                    final ap n = (ap)v;
                    final keystrokesmod.dg s = (keystrokesmod.dg)new dg(n, this, y);
                    this.sn.add((keystrokesmod.b)s);
                    y += 12;
                }
                else if (v instanceof cb) {
                    final keystrokesmod.cb b = (keystrokesmod.cb)v;
                    final keystrokesmod.kk c = (keystrokesmod.kk)new kk(mod, (cb)b, this, y);
                    this.sn.add((keystrokesmod.b)c);
                    y += 12;
                }
                else {
                    if (!(v instanceof dc)) {
                        continue;
                    }
                    final keystrokesmod.dc d = (keystrokesmod.dc)v;
                    final keystrokesmod.d1 m = (keystrokesmod.d1)new d1((dc)d, this, y);
                    this.sn.add((keystrokesmod.b)m);
                    y += 12;
                }
            }
        }
        this.sn.add((keystrokesmod.b)new bm(this, y));
    }
    
    @Override
    public void so(final int n) {
        this.o = n;
        int y = this.o + 16;
        for (final keystrokesmod.b co : this.sn) {
            ((b)co).so(y);
            if (co instanceof dg) {
                y += 16;
            }
            else {
                if (!(co instanceof kk) && !(co instanceof bm) && !(co instanceof d1)) {
                    continue;
                }
                y += 12;
            }
        }
    }
    
    public static void e() {
        GL11.glDisable(2929);
        GL11.glEnable(3042);
        GL11.glDisable(3553);
        GL11.glBlendFunc(770, 771);
        GL11.glDepthMask(true);
        GL11.glEnable(2848);
        GL11.glHint(3154, 4354);
        GL11.glHint(3155, 4354);
    }
    
    public static void f() {
        GL11.glEnable(3553);
        GL11.glDisable(3042);
        GL11.glEnable(2929);
        GL11.glDisable(2848);
        GL11.glHint(3154, 4352);
        GL11.glHint(3155, 4352);
        GL11.glEdgeFlag(true);
    }
    
    public static void g(final int h) {
        float a = 0.0f;
        float r = 0.0f;
        float g = 0.0f;
        float b = 0.0f;
        if (au.a.getInput() == 1.0) {
            a = (h >> 14 & 0xFF) / 255.0f;
            r = (h >> 5 & 0xFF) / 255.0f;
            g = (h >> 5 & 0xFF) / 2155.0f;
            b = (float)(h & 0xFF);
        }
        else if (au.a.getInput() == 2.0) {
            a = (h >> 14 & 0xFF) / 255.0f;
            r = (h >> 5 & 0xFF) / 2155.0f;
            g = (h >> 5 & 0xFF) / 255.0f;
            b = (float)(h & 0xFF);
        }
        else if (au.a.getInput() == 3.0) {}
        GL11.glColor4f(r, g, b, a);
    }
    
    public static void v(final float x, final float y, final float x1, final float y1, final int t, final int b) {
        e();
        GL11.glShadeModel(7425);
        GL11.glBegin(7);
        g(t);
        GL11.glVertex2f(x, y1);
        GL11.glVertex2f(x1, y1);
        g(b);
        GL11.glVertex2f(x1, y);
        GL11.glVertex2f(x, y);
        GL11.glEnd();
        GL11.glShadeModel(7424);
        f();
    }
    
    @Override
    public void r3nd3r() {
        v((float)this.c4t.gx(), (float)(this.c4t.gy() + this.o), (float)(this.c4t.gx() + this.c4t.gw()), (float)(this.c4t.gy() + 15 + this.o), this.mod.isEnabled() ? this.c2 : -12829381, this.mod.isEnabled() ? this.c2 : -12302777);
        GL11.glPushMatrix();
        final int button_rgb = (au.a.getInput() == 3.0) ? (this.mod.isEnabled() ? this.c1 : Color.lightGray.getRGB()) : Color.lightGray.getRGB();
        Minecraft.func_71410_x().field_71466_p.func_175063_a(this.mod.g3tN4m3(), (float)(this.c4t.gx() + this.c4t.gw() / 2 - Minecraft.func_71410_x().field_71466_p.func_78256_a(this.mod.g3tN4m3()) / 2), (float)(this.c4t.gy() + this.o + 4), button_rgb);
        GL11.glPopMatrix();
        if (this.po && !this.sn.isEmpty()) {
            for (final keystrokesmod.b c : this.sn) {
                ((b)c).r3nd3r();
            }
        }
    }
    
    @Override
    public int gh() {
        if (this.po) {
            int h = 16;
            for (final keystrokesmod.b c : this.sn) {
                if (c instanceof dg) {
                    h += 16;
                }
                else {
                    if (!(c instanceof kk) && !(c instanceof bm) && !(c instanceof d1)) {
                        continue;
                    }
                    h += 12;
                }
            }
            return h;
        }
        return 16;
    }
    
    @Override
    public void uu(final int x, final int y) {
        if (!this.sn.isEmpty()) {
            for (final keystrokesmod.b c : this.sn) {
                ((b)c).uu(x, y);
            }
        }
    }
    
    @Override
    public void onCl1ck(final int x, final int y, final int b) {
        if (this.ii(x, y) && b == 0) {
            this.mod.toggle();
        }
        if (this.ii(x, y) && b == 1) {
            this.po = !this.po;
            this.c4t.r3nd3r();
        }
        for (final keystrokesmod.b c : this.sn) {
            ((b)c).onCl1ck(x, y, b);
        }
    }
    
    @Override
    public void mr(final int x, final int y, final int m) {
        for (final keystrokesmod.b c : this.sn) {
            ((b)c).mr(x, y, m);
        }
    }
    
    @Override
    public void ky(final char t, final int k) {
        for (final keystrokesmod.b c : this.sn) {
            ((b)c).ky(t, k);
        }
    }
    
    public boolean ii(final int x, final int y) {
        return x > this.c4t.gx() && x < this.c4t.gx() + this.c4t.gw() && y > this.c4t.gy() + this.o && y < this.c4t.gy() + 16 + this.o;
    }
}
