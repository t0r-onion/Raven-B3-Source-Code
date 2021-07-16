// 
// Decompiled by Procyon v0.5.36
// 

package DEOBFUSCATED-NAMES;

import java.awt.Color;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import java.io.IOException;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraft.client.Minecraft;

public class kr
{
    private static final int[] a;
    private Minecraft mc;
    private ke[] b;
    private m4[] c;
    
    public kr() {
        this.mc = Minecraft.func_71410_x();
        this.b = new ke[4];
        this.c = new m4[2];
        this.b[0] = new ke(this.mc.field_71474_y.field_74351_w, 26, 2);
        this.b[1] = new ke(this.mc.field_71474_y.field_74368_y, 26, 26);
        this.b[2] = new ke(this.mc.field_71474_y.field_74370_x, 2, 26);
        this.b[3] = new ke(this.mc.field_71474_y.field_74366_z, 50, 26);
        this.c[0] = new m4(0, 2, 50);
        this.c[1] = new m4(1, 38, 50);
    }
    
    @SubscribeEvent
    public void d(final TickEvent.RenderTickEvent e) {
        if (this.mc.field_71462_r != null) {
            if (this.mc.field_71462_r instanceof gsk) {
                try {
                    this.mc.field_71462_r.func_146269_k();
                }
                catch (IOException ex) {}
            }
            return;
        }
        if (!this.mc.field_71415_G || this.mc.field_71474_y.field_74330_P) {
            return;
        }
        this.renderKeystrokes();
    }
    
    public void renderKeystrokes() {
        final keystrokesmod.ks f = (keystrokesmod.ks)w.d2();
        if (!ks.e) {
            return;
        }
        int x = ks.a;
        int y = ks.b;
        final int g = this.getColor(ks.c);
        final boolean h = ks.d;
        final ScaledResolution res = new ScaledResolution(this.mc);
        final int width = 74;
        final int height = h ? 74 : 50;
        if (x < 0) {
            ks.a = 0;
            x = ks.a;
        }
        else if (x > res.func_78326_a() - width) {
            ks.a = res.func_78326_a() - width;
            x = ks.a;
        }
        if (y < 0) {
            ks.b = 0;
            y = ks.b;
        }
        else if (y > res.func_78328_b() - height) {
            ks.b = res.func_78328_b() - height;
            y = ks.b;
        }
        this.drawMovementKeys(x, y, g);
        if (h) {
            this.drawMouseButtons(x, y, g);
        }
    }
    
    private int getColor(final int index) {
        if (index == 6) {
            return Color.getHSBColor(System.currentTimeMillis() % 3750L / 3750.0f, 1.0f, 1.0f).getRGB();
        }
        return kr.a[index];
    }
    
    private void drawMovementKeys(final int x, final int y, final int textColor) {
        for (final keystrokesmod.ke key : this.b) {
            ((ke)key).renderKey(x, y, textColor);
        }
    }
    
    private void drawMouseButtons(final int x, final int y, final int textColor) {
        for (final keystrokesmod.m4 button : this.c) {
            ((m4)button).n(x, y, textColor);
        }
    }
    
    static {
        a = new int[] { 16777215, 16711680, 65280, 255, 16776960, 11141290 };
    }
}
