// 
// Decompiled by Procyon v0.5.36
// 

package DEOBFUSCATED-NAMES;

import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;
import java.awt.Color;
import keystrokesmod.bb;

public class kk extends b
{
    private final int c;
    private bb mod;
    private cb cl1ckbUtt0n;
    private m3 p;
    private int o;
    private int x;
    private int y;
    
    public kk(final bb mod, final cb op, final m3 b, final int o) {
        this.c = new Color(20, 255, 0).getRGB();
        this.mod = mod;
        this.cl1ckbUtt0n = op;
        this.p = b;
        this.x = b.c4t.gx() + b.c4t.gw();
        this.y = b.c4t.gy() + b.o;
        this.o = o;
    }
    
    public static void e() {
        GL11.glDisable(2929);
        GL11.glDisable(3553);
        GL11.glBlendFunc(770, 771);
        GL11.glDepthMask(true);
        GL11.glEnable(2848);
        GL11.glHint(3154, 4354);
        GL11.glHint(3155, 4354);
    }
    
    public static void d() {
        GL11.glEnable(3553);
        GL11.glEnable(2929);
        GL11.glDisable(2848);
        GL11.glHint(3154, 4352);
        GL11.glHint(3155, 4352);
    }
    
    public static void d(final float x, final float y, final float x1, final float y1, final int c) {
        e();
        b(c);
        d(x, y, x1, y1);
        d();
    }
    
    public static void d(final float x, final float y, final float x1, final float y1) {
        GL11.glBegin(7);
        GL11.glVertex2f(x, y1);
        GL11.glVertex2f(x1, y1);
        GL11.glVertex2f(x1, y);
        GL11.glVertex2f(x, y);
        GL11.glEnd();
    }
    
    public static void b(final int h) {
        final float a1pha = (h >> 24 & 0xFF) / 350.0f;
        GL11.glColor4f(0.0f, 0.0f, 0.0f, a1pha);
    }
    
    @Override
    public void r3nd3r() {
        GL11.glPushMatrix();
        GL11.glScaled(0.5, 0.5, 0.5);
        Minecraft.func_71410_x().field_71466_p.func_175065_a(this.cl1ckbUtt0n.isToggled() ? ("[+]  " + this.cl1ckbUtt0n.get()) : ("[-]  " + this.cl1ckbUtt0n.get()), (float)((this.p.c4t.gx() + 4) * 2), (float)((this.p.c4t.gy() + this.o + 4) * 2), this.cl1ckbUtt0n.isToggled() ? this.c : -1, false);
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
    }
    
    @Override
    public void onCl1ck(final int x, final int y, final int b) {
        if (this.i(x, y) && b == 0 && this.p.po) {
            this.cl1ckbUtt0n.toggle();
            this.mod.guiButtonToggled(this.cl1ckbUtt0n);
        }
    }
    
    public boolean i(final int x, final int y) {
        return x > this.x && x < this.x + this.p.c4t.gw() && y > this.y && y < this.y + 11;
    }
}
