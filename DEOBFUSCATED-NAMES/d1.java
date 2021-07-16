// 
// Decompiled by Procyon v0.5.36
// 

package DEOBFUSCATED-NAMES;

import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;
import java.awt.Color;

public class d1 extends b
{
    private final int c;
    private dc desc;
    private m3 p;
    private int o;
    private int x;
    private int y;
    
    public d1(final dc desc, final m3 b, final int o) {
        this.c = new Color(226, 83, 47).getRGB();
        this.desc = desc;
        this.p = b;
        this.x = b.c4t.gx() + b.c4t.gw();
        this.y = b.c4t.gy() + b.o;
        this.o = o;
    }
    
    @Override
    public void r3nd3r() {
        GL11.glPushMatrix();
        GL11.glScaled(0.5, 0.5, 0.5);
        Minecraft.func_71410_x().field_71466_p.func_175065_a(this.desc.getDesc(), (float)((this.p.c4t.gx() + 4) * 2), (float)((this.p.c4t.gy() + this.o + 4) * 2), this.c, true);
        GL11.glPopMatrix();
    }
    
    @Override
    public void so(final int n) {
        this.o = n;
    }
}
