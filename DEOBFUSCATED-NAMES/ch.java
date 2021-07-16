// 
// Decompiled by Procyon v0.5.36
// 

package DEOBFUSCATED-NAMES;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.opengl.GL11;
import net.minecraftforge.client.event.RenderPlayerEvent;
import keystrokesmod.bb;

public class ch extends bb
{
    public ch() {
        super(new char[] { 'C', 'h', 'a', 'm', 's' }, bb.render, 0);
    }
    
    @SubscribeEvent
    public void r1(final RenderPlayerEvent.Pre e) {
        if (e.entity == ch.mc.field_71439_g) {
            return;
        }
        GL11.glEnable(32823);
        GL11.glPolygonOffset(1.0f, -1100000.0f);
    }
    
    @SubscribeEvent
    public void r2(final RenderPlayerEvent.Post e) {
        if (e.entity == ch.mc.field_71439_g) {
            return;
        }
        GL11.glDisable(32823);
        GL11.glPolygonOffset(1.0f, 1100000.0f);
    }
}
