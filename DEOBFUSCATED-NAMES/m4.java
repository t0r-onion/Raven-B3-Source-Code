// 
// Decompiled by Procyon v0.5.36
// 

package DEOBFUSCATED-NAMES;

import org.lwjgl.opengl.GL11;
import net.minecraft.client.gui.Gui;
import java.awt.Color;
import org.lwjgl.input.Mouse;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.Minecraft;

public class m4
{
    private static String[] a;
    private Minecraft b;
    private int c;
    private int d;
    private int e;
    private List<Long> f;
    private boolean g;
    private long h;
    private int i;
    private double j;
    
    public m4(final int k, final int l, final int m) {
        this.b = Minecraft.func_71410_x();
        this.f = new ArrayList<Long>();
        this.g = true;
        this.h = 0L;
        this.i = 255;
        this.j = 1.0;
        this.c = k;
        this.d = l;
        this.e = m;
    }
    
    public void n(final int o, final int p, final int color) {
        final boolean r = Mouse.isButtonDown(this.c);
        final String s = m4.a[this.c];
        if (r != this.g) {
            this.g = r;
            this.h = System.currentTimeMillis();
            if (r) {
                this.f.add(this.h);
            }
        }
        if (r) {
            this.i = Math.min(255, (int)(2L * (System.currentTimeMillis() - this.h)));
            this.j = Math.max(0.0, 1.0 - (System.currentTimeMillis() - this.h) / 20.0);
        }
        else {
            this.i = Math.max(0, 255 - (int)(2L * (System.currentTimeMillis() - this.h)));
            this.j = Math.min(1.0, (System.currentTimeMillis() - this.h) / 20.0);
        }
        final int t = color >> 16 & 0xFF;
        final int u = color >> 8 & 0xFF;
        final int v = color & 0xFF;
        final int c = new Color(t, u, v).getRGB();
        Gui.func_73734_a(o + this.d, p + this.e, o + this.d + 34, p + this.e + 22, 2013265920 + (this.i << 16) + (this.i << 8) + this.i);
        if (ks.f) {
            Gui.func_73734_a(o + this.d, p + this.e, o + this.d + 34, p + this.e + 1, c);
            Gui.func_73734_a(o + this.d, p + this.e + 21, o + this.d + 34, p + this.e + 22, c);
            Gui.func_73734_a(o + this.d, p + this.e, o + this.d + 1, p + this.e + 22, c);
            Gui.func_73734_a(o + this.d + 33, p + this.e, o + this.d + 34, p + this.e + 22, c);
        }
        this.b.field_71466_p.func_78276_b(s, o + this.d + 8, p + this.e + 4, -16777216 + ((int)(t * this.j) << 16) + ((int)(u * this.j) << 8) + (int)(v * this.j));
        final String w = cl.f() + " CPS";
        final String x = cl.i() + " CPS";
        final int y = this.b.field_71466_p.func_78256_a(w);
        final int z = this.b.field_71466_p.func_78256_a(x);
        final boolean a2 = this.c == 0;
        final int b2 = a2 ? y : z;
        GL11.glScalef(0.5f, 0.5f, 0.5f);
        this.b.field_71466_p.func_78276_b(a2 ? w : x, (o + this.d + 17) * 2 - b2 / 2, (p + this.e + 14) * 2, -16777216 + ((int)(255.0 * this.j) << 16) + ((int)(255.0 * this.j) << 8) + (int)(255.0 * this.j));
        GL11.glScalef(2.0f, 2.0f, 2.0f);
    }
    
    static {
        m4.a = new String[] { "LMB", "RMB" };
    }
}
