// 
// Decompiled by Procyon v0.5.36
// 

package DEOBFUSCATED-NAMES;

import org.lwjgl.input.Mouse;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.MouseEvent;
import java.awt.AWTException;
import java.awt.Robot;
import keystrokesmod.bb;

public class cs extends bb
{
    public static dc a;
    public static ap b;
    public static cb L;
    public static cb R;
    public static cb c;
    public static cb d;
    public static cb e;
    public static cb f;
    private Robot bot;
    private boolean ignNL;
    private boolean ignNR;
    
    public cs() {
        super(new char[] { 'C', 'l', 'i', 'c', 'k', 'A', 's', 's', 'i', 's', 't' }, bb.combat, 0);
        this.ignNL = false;
        this.ignNR = false;
        this.registerSetting(cs.a = new dc(new String(new char[] { 'B', 'o', 'o', 's', 't', ' ', 'y', 'o', 'u', 'r', ' ', 'C', 'P', 'S', '.' })));
        this.registerSetting(cs.b = new ap(new char[] { 'C', 'h', 'a', 'n', 'c', 'e' }, 80.0, 0.0, 100.0, 1.0));
        this.registerSetting(cs.L = new cb(new char[] { 'L', 'e', 'f', 't', ' ', 'c', 'l', 'i', 'c', 'k' }, true));
        this.registerSetting(cs.d = new cb(new char[] { 'W', 'e', 'a', 'p', 'o', 'n', ' ', 'o', 'n', 'l', 'y' }, true));
        this.registerSetting(cs.e = new cb(new char[] { 'O', 'n', 'l', 'y', ' ', 'w', 'h', 'i', 'l', 'e', ' ', 't', 'a', 'r', 'g', 'e', 't', 'i', 'n', 'g' }, false));
        this.registerSetting(cs.R = new cb(new char[] { 'R', 'i', 'g', 'h', 't', ' ', 'c', 'l', 'i', 'c', 'k' }, false));
        this.registerSetting(cs.c = new cb(new char[] { 'B', 'l', 'o', 'c', 'k', 's', ' ', 'o', 'n', 'l', 'y' }, true));
        this.registerSetting(cs.f = new cb(new char[] { 'A', 'b', 'o', 'v', 'e', ' ', '5', ' ', 'c', 'p', 's' }, false));
    }
    
    @Override
    public void onEnable() {
        try {
            this.bot = new Robot();
        }
        catch (AWTException e) {
            this.disable();
        }
    }
    
    @Override
    public void onDisable() {
        this.ignNL = false;
        this.ignNR = false;
        this.bot = null;
    }
    
    @SubscribeEvent(priority = EventPriority.HIGH)
    public void e(final MouseEvent ev) {
        if (ev.button < 0 || !ev.buttonstate || cs.b.getInput() == 0.0 || !ay.e()) {
            return;
        }
        if (cs.mc.field_71462_r != null || cs.mc.field_71439_g.func_70113_ah()) {
            this.fix(0);
            this.fix(1);
            return;
        }
        if (ev.button == 0 && cs.L.isToggled()) {
            if (this.ignNL) {
                this.ignNL = false;
            }
            else {
                if (cs.d.isToggled() && !ay.wpn()) {
                    return;
                }
                if (cs.e.isToggled() && (cs.mc.field_71476_x == null || cs.mc.field_71476_x.field_72308_g == null)) {
                    return;
                }
                if (cs.b.getInput() != 100.0) {
                    final double ch = Math.random();
                    if (ch >= cs.b.getInput() / 100.0) {
                        this.fix(0);
                        return;
                    }
                }
                this.bot.mouseRelease(16);
                this.bot.mousePress(16);
                this.ignNL = true;
            }
        }
        else if (ev.button == 1 && cs.R.isToggled()) {
            if (this.ignNR) {
                this.ignNR = false;
            }
            else {
                if (cs.c.isToggled()) {
                    final ItemStack item = cs.mc.field_71439_g.func_70694_bm();
                    if (item == null || !(item.func_77973_b() instanceof ItemBlock)) {
                        this.fix(1);
                        return;
                    }
                }
                if (cs.f.isToggled() && cl.i() <= 5) {
                    this.fix(1);
                    return;
                }
                if (cs.b.getInput() != 100.0) {
                    final double ch = Math.random();
                    if (ch >= cs.b.getInput() / 100.0) {
                        this.fix(1);
                        return;
                    }
                }
                this.bot.mouseRelease(4);
                this.bot.mousePress(4);
                this.ignNR = true;
            }
        }
        this.fix(0);
        this.fix(1);
    }
    
    private void fix(final int t) {
        if (t == 0) {
            if (this.ignNL && !Mouse.isButtonDown(0)) {
                this.bot.mouseRelease(16);
            }
        }
        else if (t == 1 && this.ignNR && !Mouse.isButtonDown(1)) {
            this.bot.mouseRelease(4);
        }
    }
}
