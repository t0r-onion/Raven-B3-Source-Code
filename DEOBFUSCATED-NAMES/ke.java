// 
// Decompiled by Procyon v0.5.36
// 

package DEOBFUSCATED-NAMES;

import net.minecraft.client.gui.Gui;
import java.awt.Color;
import org.lwjgl.input.Keyboard;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.client.Minecraft;

public class ke
{
    private Minecraft a;
    private KeyBinding b;
    private int c;
    private int d;
    private boolean e;
    private long f;
    private int g;
    private double h;
    
    public ke(final KeyBinding i, final int j, final int k) {
        this.a = Minecraft.func_71410_x();
        this.e = true;
        this.f = 0L;
        this.g = 255;
        this.h = 1.0;
        this.b = i;
        this.c = j;
        this.d = k;
    }
    
    public void renderKey(final int l, final int m, final int color) {
        final boolean o = this.b.func_151470_d();
        final String p = Keyboard.getKeyName(this.b.func_151463_i());
        if (o != this.e) {
            this.e = o;
            this.f = System.currentTimeMillis();
        }
        if (o) {
            this.g = Math.min(255, (int)(2L * (System.currentTimeMillis() - this.f)));
            this.h = Math.max(0.0, 1.0 - (System.currentTimeMillis() - this.f) / 20.0);
        }
        else {
            this.g = Math.max(0, 255 - (int)(2L * (System.currentTimeMillis() - this.f)));
            this.h = Math.min(1.0, (System.currentTimeMillis() - this.f) / 20.0);
        }
        final int q = color >> 16 & 0xFF;
        final int r = color >> 8 & 0xFF;
        final int s = color & 0xFF;
        final int c = new Color(q, r, s).getRGB();
        Gui.func_73734_a(l + this.c, m + this.d, l + this.c + 22, m + this.d + 22, 2013265920 + (this.g << 16) + (this.g << 8) + this.g);
        if (ks.f) {
            Gui.func_73734_a(l + this.c, m + this.d, l + this.c + 22, m + this.d + 1, c);
            Gui.func_73734_a(l + this.c, m + this.d + 21, l + this.c + 22, m + this.d + 22, c);
            Gui.func_73734_a(l + this.c, m + this.d, l + this.c + 1, m + this.d + 22, c);
            Gui.func_73734_a(l + this.c + 21, m + this.d, l + this.c + 22, m + this.d + 22, c);
        }
        this.a.field_71466_p.func_78276_b(p, l + this.c + 8, m + this.d + 8, -16777216 + ((int)(q * this.h) << 16) + ((int)(r * this.h) << 8) + (int)(s * this.h));
    }
}
