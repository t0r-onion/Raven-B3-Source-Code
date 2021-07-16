// 
// Decompiled by Procyon v0.5.36
// 

package DEOBFUSCATED-NAMES;

import java.io.IOException;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;

public class gsk extends GuiScreen
{
    private static final String[] cn2;
    private GuiButton b1;
    private GuiButton b2;
    private GuiButton b3;
    private GuiButton b4;
    private boolean d;
    private int lx;
    private int ly;
    
    public gsk() {
        this.d = false;
    }
    
    public void func_73866_w_() {
        final keystrokesmod.ks st = (keystrokesmod.ks)w.d2();
        this.field_146292_n.add(this.b1 = new GuiButton(0, this.field_146294_l / 2 - 70, this.field_146295_m / 2 - 28, 140, 20, "Mod: " + (ks.e ? "Enabled" : "Disabled")));
        this.field_146292_n.add(this.b2 = new GuiButton(1, this.field_146294_l / 2 - 70, this.field_146295_m / 2 - 6, 140, 20, "Text color: " + gsk.cn2[ks.c]));
        this.field_146292_n.add(this.b3 = new GuiButton(2, this.field_146294_l / 2 - 70, this.field_146295_m / 2 + 16, 140, 20, "Show mouse buttons: " + (ks.d ? "On" : "Off")));
        this.field_146292_n.add(this.b4 = new GuiButton(3, this.field_146294_l / 2 - 70, this.field_146295_m / 2 + 38, 140, 20, "Outline: " + (ks.f ? "On" : "Off")));
    }
    
    public void func_73863_a(final int mouseX, final int mouseY, final float partialTicks) {
        w.e2().renderKeystrokes();
        super.func_73863_a(mouseX, mouseY, partialTicks);
    }
    
    protected void func_146284_a(final GuiButton button) {
        final keystrokesmod.ks st = (keystrokesmod.ks)w.d2();
        if (button == this.b1) {
            ks.e = !ks.e;
            this.b1.field_146126_j = "Mod: " + (ks.e ? "Enabled" : "Disabled");
        }
        else if (button == this.b2) {
            ks.c = ((ks.c == 6) ? 0 : (ks.c + 1));
            this.b2.field_146126_j = "Text color: " + gsk.cn2[ks.c];
        }
        else if (button == this.b3) {
            ks.d = !ks.d;
            this.b3.field_146126_j = "Show mouse buttons: " + (ks.d ? "On" : "Off");
        }
        else if (button == this.b4) {
            ks.f = !ks.f;
            this.b4.field_146126_j = "Outline: " + (ks.f ? "On" : "Off");
        }
    }
    
    protected void func_73864_a(final int mouseX, final int mouseY, final int button) {
        try {
            super.func_73864_a(mouseX, mouseY, button);
        }
        catch (IOException ex) {}
        if (button == 0) {
            cl.aL();
            final keystrokesmod.ks st = (keystrokesmod.ks)w.d2();
            final int startX = ks.a;
            final int startY = ks.b;
            final int endX = startX + 74;
            final int endY = startY + (ks.d ? 74 : 50);
            if (mouseX >= startX && mouseX <= endX && mouseY >= startY && mouseY <= endY) {
                this.d = true;
                this.lx = mouseX;
                this.ly = mouseY;
            }
        }
        else if (button == 1) {
            cl.aR();
        }
    }
    
    protected void func_146286_b(final int mouseX, final int mouseY, final int action) {
        super.func_146286_b(mouseX, mouseY, action);
        this.d = false;
    }
    
    protected void func_146273_a(final int mouseX, final int mouseY, final int lastButtonClicked, final long timeSinceMouseClick) {
        super.func_146273_a(mouseX, mouseY, lastButtonClicked, timeSinceMouseClick);
        if (!this.d) {
            return;
        }
        final keystrokesmod.ks st = (keystrokesmod.ks)w.d2();
        ks.a = ks.a + mouseX - this.lx;
        ks.b = ks.b + mouseY - this.ly;
        this.lx = mouseX;
        this.ly = mouseY;
    }
    
    public boolean func_73868_f() {
        return false;
    }
    
    public void func_146281_b() {
        cn.sc();
    }
    
    static {
        cn2 = new String[] { "White", "Red", "Green", "Blue", "Yellow", "Purple", "Rainbow" };
    }
}
