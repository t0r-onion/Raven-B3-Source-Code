// 
// Decompiled by Procyon v0.5.36
// 

package DEOBFUSCATED-NAMES;

import java.util.ArrayList;
import java.util.Iterator;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.Entity;
import net.minecraftforge.client.event.MouseEvent;
import java.util.List;

public class cl
{
    private static List<Long> a;
    private static List<Long> b;
    public static long LL;
    public static long LR;
    
    @SubscribeEvent
    public void c(final MouseEvent d) {
        if (!d.buttonstate) {
            return;
        }
        if (d.button == 0) {
            aL();
            if (w.dbg && w.mc.field_71476_x != null) {
                final Entity en = w.mc.field_71476_x.field_72308_g;
                if (en == null) {
                    return;
                }
                ay.sm(str.bar);
                ay.sm("n: " + en.func_70005_c_());
                ay.sm("rn: " + en.func_70005_c_().replace("§", "%"));
                ay.sm("d: " + en.func_145748_c_().func_150260_c());
                ay.sm("rd: " + en.func_145748_c_().func_150260_c().replace("§", "%"));
                ay.sm("b?: " + an.bot(en));
            }
        }
        else if (d.button == 1) {
            aR();
        }
    }
    
    public static void aL() {
        cl.a.add(cl.LL = System.currentTimeMillis());
    }
    
    public static void aR() {
        cl.b.add(cl.LR = System.currentTimeMillis());
    }
    
    public static int f() {
        final Iterator<Long> g = cl.a.iterator();
        while (g.hasNext()) {
            if (g.next() < System.currentTimeMillis() - 1000L) {
                g.remove();
            }
        }
        return cl.a.size();
    }
    
    public static int i() {
        final Iterator<Long> j = cl.b.iterator();
        while (j.hasNext()) {
            if (j.next() < System.currentTimeMillis() - 1000L) {
                j.remove();
            }
        }
        return cl.b.size();
    }
    
    static {
        cl.a = new ArrayList<Long>();
        cl.b = new ArrayList<Long>();
        cl.LL = 0L;
        cl.LR = 0L;
    }
}
