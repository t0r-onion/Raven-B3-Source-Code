// 
// Decompiled by Procyon v0.5.36
// 

package DEOBFUSCATED-NAMES;

import java.math.RoundingMode;
import java.math.BigDecimal;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;
import java.awt.Color;
import net.minecraft.client.gui.Gui;

public class dg extends b
{
    private ap v;
    private m3 p;
    private int o;
    private int x;
    private int y;
    private boolean d;
    private double w;
    private final int msl = 84;
    
    public dg(final ap v, final m3 b, final int o) {
        this.d = false;
        this.v = v;
        this.p = b;
        this.x = b.c4t.gx() + b.c4t.gw();
        this.y = b.c4t.gy() + b.o;
        this.o = o;
    }
    
    @Override
    public void r3nd3r() {
        Gui.func_73734_a(this.p.c4t.gx() + 4, this.p.c4t.gy() + this.o + 11, this.p.c4t.gx() + 4 + this.p.c4t.gw() - 8, this.p.c4t.gy() + this.o + 15, -12302777);
        final int l = this.p.c4t.gx() + 4;
        int r = this.p.c4t.gx() + 4 + (int)this.w;
        if (r - l > 84) {
            r = l + 84;
        }
        Gui.func_73734_a(l, this.p.c4t.gy() + this.o + 11, r, this.p.c4t.gy() + this.o + 15, Color.getHSBColor(System.currentTimeMillis() % 11000L / 11000.0f, 0.75f, 0.9f).getRGB());
        GL11.glPushMatrix();
        GL11.glScaled(0.5, 0.5, 0.5);
        Minecraft.func_71410_x().field_71466_p.func_175063_a(this.v.get() + ": " + this.v.getInput(), (float)(int)((this.p.c4t.gx() + 4) * 2.0f), (float)(int)((this.p.c4t.gy() + this.o + 3) * 2.0f), -1);
        GL11.glPopMatrix();
    }
    
    @Override
    public void so(final int n) {
        this.o = n;
    }
    
    @Override
    public void uu(final int x, final int y) {
        this.y = this.p.c4t.gy() + this.o;
        this.x = this.p.c4t.gx();
        final double d = Math.min(this.p.c4t.gw() - 8, Math.max(0, x - this.x));
        this.w = (this.p.c4t.gw() - 8) * (this.v.getInput() - this.v.g3ti()) / (this.v.g3ta() - this.v.g3ti());
        if (this.d) {
            if (d == 0.0) {
                this.v.setValue(this.v.g3ti());
            }
            else {
                final double n = r(d / (this.p.c4t.gw() - 8) * (this.v.g3ta() - this.v.g3ti()) + this.v.g3ti(), 2);
                this.v.setValue(n);
            }
        }
    }
    
    private static double r(final double v, final int p) {
        if (p < 0) {
            return 0.0;
        }
        BigDecimal bd = new BigDecimal(v);
        bd = bd.setScale(p, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
    
    @Override
    public void onCl1ck(final int x, final int y, final int b) {
        if (this.u(x, y) && b == 0 && this.p.po) {
            this.d = true;
        }
        if (this.i(x, y) && b == 0 && this.p.po) {
            this.d = true;
        }
    }
    
    @Override
    public void mr(final int x, final int y, final int m) {
        this.d = false;
    }
    
    public boolean u(final int x, final int y) {
        return x > this.x && x < this.x + (this.p.c4t.gw() / 2 + 1) && y > this.y && y < this.y + 16;
    }
    
    public boolean i(final int x, final int y) {
        return x > this.x + this.p.c4t.gw() / 2 && x < this.x + this.p.c4t.gw() && y > this.y && y < this.y + 16;
    }
}
