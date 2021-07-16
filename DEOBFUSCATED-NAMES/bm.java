// 
// Decompiled by Procyon v0.5.36
// 

package DEOBFUSCATED-NAMES;

import java.awt.Color;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public class bm extends b
{
    private boolean h;
    private boolean isBinding;
    private m3 p;
    private int o;
    private int x;
    private int y;
    
    public bm(final m3 b, final int o) {
        this.p = b;
        this.x = b.c4t.gx() + b.c4t.gw();
        this.y = b.c4t.gy() + b.o;
        this.o = o;
    }
    
    @Override
    public void so(final int n) {
        this.o = n;
    }
    
    @Override
    public void r3nd3r() {
        GL11.glPushMatrix();
        GL11.glScaled(0.5, 0.5, 0.5);
        if (this.p.mod instanceof aj) {
            this.dr(new String(new char[] { 'A', 'u', 't', 'o', '-', 'c', 'o', 'n', 'f', 'i', 'g', 'u', 'r', 'e', ' ', 'm', 'o', 'd', 'u', 'l', 'e', 's', '.' }));
            GL11.glPopMatrix();
            return;
        }
        this.dr(this.isBinding ? bs.binding : (bs.bind + ": " + Keyboard.getKeyName(this.p.mod.getKeycode())));
        GL11.glPopMatrix();
    }
    
    @Override
    public void uu(final int x, final int y) {
        this.h = this.i(x, y);
        this.y = this.p.c4t.gy() + this.o;
        this.x = this.p.c4t.gx();
    }
    
    @Override
    public void onCl1ck(final int x, final int y, final int b) {
        if (this.i(x, y) && b == 0 && this.p.po) {
            this.isBinding = !this.isBinding;
        }
    }
    
    @Override
    public void ky(final char t, final int keybind) {
        if (this.p.mod.g3tN4m3().equalsIgnoreCase(new String(new char[] { 'A', 'u', 't', 'o', 'C', 'o', 'n', 'f', 'i', 'g' }))) {
            return;
        }
        if (this.isBinding) {
            if (keybind == 11) {
                if (this.p.mod instanceof au) {
                    this.p.mod.setbind(54);
                }
                else {
                    this.p.mod.setbind(0);
                }
            }
            else {
                this.p.mod.setbind(keybind);
            }
            this.isBinding = false;
        }
    }
    
    public boolean i(final int x, final int y) {
        return x > this.x && x < this.x + this.p.c4t.gw() && y > this.y - 1 && y < this.y + 12;
    }
    
    @Override
    public int gh() {
        return 16;
    }
    
    private void dr(final String s) {
        Minecraft.func_71410_x().field_71466_p.func_175063_a(s, (float)((this.p.c4t.gx() + 4) * 2), (float)((this.p.c4t.gy() + this.o + 3) * 2), Color.HSBtoRGB(System.currentTimeMillis() % 3750L / 3750.0f, 0.8f, 0.8f));
    }
}
