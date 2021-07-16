// 
// Decompiled by Procyon v0.5.36
// 

package DEOBFUSCATED-NAMES;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import java.util.Iterator;
import net.minecraft.tileentity.TileEntityEnderChest;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.tileentity.TileEntity;
import java.awt.Color;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import keystrokesmod.bb;

public class ce extends bb
{
    public static ap a;
    public static ap b;
    public static ap c;
    public static cb d;
    
    public ce() {
        super(new char[] { 'C', 'h', 'e', 's', 't', 'E', 'S', 'P' }, bb.render, 0);
        ce.a = new ap(new char[] { 'R', 'e', 'd' }, 0.0, 0.0, 255.0, 1.0);
        ce.b = new ap(new char[] { 'G', 'r', 'e', 'e', 'n' }, 0.0, 0.0, 255.0, 1.0);
        ce.c = new ap(new char[] { 'B', 'l', 'u', 'e' }, 255.0, 0.0, 255.0, 1.0);
        ce.d = new cb(new char[] { 'R', 'a', 'i', 'n', 'b', 'o', 'w' }, false);
        this.registerSetting(ce.a);
        this.registerSetting(ce.b);
        this.registerSetting(ce.c);
        this.registerSetting(ce.d);
    }
    
    @SubscribeEvent
    public void o(final RenderWorldLastEvent ev) {
        if (!ay.e() || ax.a) {
            return;
        }
        final int rgb = ce.d.isToggled() ? ay.gc(2L, 0L) : new Color((int)ce.a.getInput(), (int)ce.b.getInput(), (int)ce.c.getInput()).getRGB();
        for (final TileEntity te : ce.mc.field_71441_e.field_147482_g) {
            if (te instanceof TileEntityChest || te instanceof TileEntityEnderChest) {
                ru.re(te.func_174877_v(), rgb, true);
            }
        }
    }
}
