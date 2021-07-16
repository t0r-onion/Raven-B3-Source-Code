// 
// Decompiled by Procyon v0.5.36
// 

package DEOBFUSCATED-NAMES;

import java.util.Iterator;
import net.minecraft.client.gui.GuiScreen;
import keystrokesmod.bb;

public class ax extends bb
{
    public static boolean a;
    
    public ax() {
        super(new char[] { 'S', 'e', 'l', 'f', ' ', 'D', 'e', 's', 't', 'r', 'u', 'c', 't' }, bb.client, 0);
    }
    
    @Override
    public void onEnable() {
        ax.mc.func_147108_a((GuiScreen)null);
        ax.a = true;
        final m2 a = aw.a;
        for (final bb m : m2.modsList) {
            if (m == this) {
                continue;
            }
            m.disable();
        }
        this.disable();
    }
    
    static {
        ax.a = false;
    }
}
