// 
// Decompiled by Procyon v0.5.36
// 

package DEOBFUSCATED-NAMES;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.client.event.ClientChatReceivedEvent;

public class gp
{
    private static boolean e;
    private static long s;
    
    @SubscribeEvent
    public void o(final ClientChatReceivedEvent c) {
        if (!gp.e || !ay.e() || ax.a) {
            return;
        }
        if (ay.str(c.message.func_150260_c()).startsWith(str.c52)) {
            c.setCanceled(true);
            gp.e = false;
            this.f();
        }
    }
    
    public static void gp() {
        gc.am(str.co3 + str.c54 + str.c18, 1);
        if (gp.e) {
            gc.am(str.co2 + str.c53, 0);
            return;
        }
        ay.mc.field_71439_g.func_71165_d("/" + str.c18);
        gp.e = true;
        gp.s = System.currentTimeMillis();
    }
    
    private void f() {
        int p = (int)(System.currentTimeMillis() - gp.s) - 20;
        if (p < 0) {
            p = 0;
        }
        gc.am(str.c55 + " " + str.c51 + ": " + p + str.c56, 0);
        rs();
    }
    
    public static void rs() {
        gp.e = false;
        gp.s = 0L;
    }
    
    static {
        gp.e = false;
        gp.s = 0L;
    }
}
