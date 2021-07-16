// 
// Decompiled by Procyon v0.5.36
// 

package DEOBFUSCATED-NAMES;

import net.minecraft.client.settings.KeyBinding;
import java.lang.reflect.InvocationTargetException;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import java.lang.reflect.Method;
import keystrokesmod.bb;

public class dl extends bb
{
    public static dc a;
    public static ap b;
    public static ap c;
    public static cb d;
    public static cb e;
    private boolean l_c;
    private boolean l_r;
    private Method rcm;
    
    public dl() {
        super(new char[] { 'B', 'u', 'r', 's', 't', 'C', 'l', 'i', 'c', 'k', 'e', 'r' }, bb.combat, 0);
        this.l_c = false;
        this.l_r = false;
        this.rcm = null;
        this.registerSetting(dl.a = new dc(new String(new char[] { 'A', 'r', 't', 'i', 'f', 'i', 'c', 'i', 'a', 'l', ' ', 'd', 'r', 'a', 'g', 'c', 'l', 'i', 'c', 'k', 'i', 'n', 'g', '.' })));
        this.registerSetting(dl.b = new ap(new char[] { 'C', 'l', 'i', 'c', 'k', 's' }, 0.0, 0.0, 50.0, 1.0));
        this.registerSetting(dl.c = new ap(new char[] { 'D', 'e', 'l', 'a', 'y', ' ', '(', 'm', 's', ')' }, 5.0, 1.0, 40.0, 1.0));
        this.registerSetting(dl.d = new cb(new char[] { 'D', 'e', 'l', 'a', 'y', ' ', 'r', 'a', 'n', 'd', 'o', 'm', 'i', 'z', 'e', 'r' }, true));
        this.registerSetting(dl.e = new cb(new char[] { 'P', 'l', 'a', 'c', 'e', ' ', 'w', 'h', 'e', 'n', ' ', 'b', 'l', 'o', 'c', 'k' }, false));
        try {
            this.rcm = dl.mc.getClass().getDeclaredMethod(new String(new char[] { 'f', 'u', 'n', 'c', '_', '1', '4', '7', '1', '2', '1', '_', 'a', 'g' }), (Class<?>[])new Class[0]);
        }
        catch (NoSuchMethodException er) {
            try {
                this.rcm = dl.mc.getClass().getDeclaredMethod(new String(new char[] { 'r', 'i', 'g', 'h', 't', 'C', 'l', 'i', 'c', 'k', 'M', 'o', 'u', 's', 'e' }), (Class<?>[])new Class[0]);
            }
            catch (NoSuchMethodException ex) {}
        }
        if (this.rcm != null) {
            this.rcm.setAccessible(true);
        }
    }
    
    @Override
    public void onEnable() {
        if (dl.b.getInput() == 0.0 || dl.mc.field_71462_r != null || !dl.mc.field_71415_G) {
            this.disable();
            return;
        }
        int cl;
        int del;
        int i;
        int realDel;
        w.gE().execute(() -> {
            try {
                cl = (int)dl.b.getInput();
                del = (int)dl.c.getInput();
                i = 0;
                while (i < cl * 2 && this.isEnabled()) {
                    if (!ay.e()) {
                        break;
                    }
                    else if (dl.mc.field_71462_r == null) {
                        if (!dl.mc.field_71415_G) {
                            break;
                        }
                        else {
                            if (i % 2 == 0) {
                                this.l_c = true;
                                if (del != 0) {
                                    realDel = del;
                                    if (dl.d.isToggled()) {
                                        realDel += ay.rand().nextInt(25) * (ay.rand().nextBoolean() ? -1 : 1);
                                        if (realDel <= 0) {
                                            realDel = del / 3 - realDel;
                                        }
                                    }
                                    Thread.sleep(realDel);
                                }
                            }
                            else {
                                this.l_r = true;
                            }
                            ++i;
                        }
                    }
                    else {
                        break;
                    }
                }
                this.disable();
            }
            catch (InterruptedException ex) {}
        });
    }
    
    @Override
    public void onDisable() {
        this.l_c = false;
        this.l_r = false;
    }
    
    @SubscribeEvent
    public void r(final TickEvent.RenderTickEvent ev) {
        if (ay.e()) {
            if (this.l_c) {
                this.c(true);
                this.l_c = false;
            }
            else if (this.l_r) {
                this.c(false);
                this.l_r = false;
            }
        }
    }
    
    private void c(final boolean st) {
        final boolean r = dl.e.isToggled() && dl.mc.field_71439_g.func_70694_bm() != null && dl.mc.field_71439_g.func_70694_bm().func_77973_b() instanceof ItemBlock;
        if (r) {
            try {
                this.rcm.invoke(dl.mc, new Object[0]);
            }
            catch (InvocationTargetException | IllegalAccessException ex) {}
        }
        else {
            final int key = dl.mc.field_71474_y.field_74312_F.func_151463_i();
            KeyBinding.func_74510_a(key, st);
            if (st) {
                KeyBinding.func_74507_a(key);
            }
        }
        ay.sc(r ? 1 : 0, st);
    }
}
