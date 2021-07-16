// 
// Decompiled by Procyon v0.5.36
// 

package DEOBFUSCATED-NAMES;

import java.lang.reflect.InvocationTargetException;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.block.Block;
import net.minecraft.util.BlockPos;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.block.BlockLiquid;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.input.Keyboard;
import net.minecraft.client.gui.inventory.GuiInventory;
import org.lwjgl.input.Mouse;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraft.client.gui.GuiScreen;
import java.lang.reflect.Method;
import java.util.Random;
import keystrokesmod.bb;

public class a extends bb
{
    public static dc be;
    public static ap a;
    public static ap b;
    public static ap c;
    public static cb d;
    public static cb e;
    public static cb p;
    public static cb q;
    public static cb inv;
    private Random rand;
    private Method gs;
    private long i;
    private long j;
    private long k;
    private long l;
    private double m;
    private boolean n;
    private boolean hol;
    
    public a() {
        super(new char[] { 'A', 'u', 't', 'o', 'C', 'l', 'i', 'c', 'k', 'e', 'r' }, bb.combat, 0);
        this.rand = null;
        this.registerSetting(DEOBFUSCATED-NAMES.a.be = new dc(new String(new char[] { 'B', 'e', 's', 't', ' ', 'w', 'i', 't', 'h', ' ', 'd', 'e', 'l', 'a', 'y', ' ', 'r', 'e', 'm', 'o', 'v', 'e', 'r', '.' })));
        this.registerSetting(DEOBFUSCATED-NAMES.a.a = new ap(new char[] { 'M', 'i', 'n', ' ', 'C', 'P', 'S' }, 9.0, 1.0, 20.0, 0.5));
        this.registerSetting(DEOBFUSCATED-NAMES.a.b = new ap(new char[] { 'M', 'a', 'x', ' ', 'C', 'P', 'S' }, 12.0, 1.0, 20.0, 0.5));
        this.registerSetting(DEOBFUSCATED-NAMES.a.c = new ap(new char[] { 'J', 'i', 't', 't', 'e', 'r' }, 0.0, 0.0, 3.0, 0.1));
        this.registerSetting(DEOBFUSCATED-NAMES.a.p = new cb(new char[] { 'L', 'e', 'f', 't', ' ', 'c', 'l', 'i', 'c', 'k' }, true));
        this.registerSetting(DEOBFUSCATED-NAMES.a.q = new cb(new char[] { 'R', 'i', 'g', 'h', 't', ' ', 'c', 'l', 'i', 'c', 'k' }, false));
        this.registerSetting(DEOBFUSCATED-NAMES.a.inv = new cb(new char[] { 'I', 'n', 'v', 'e', 'n', 't', 'o', 'r', 'y', ' ', 'f', 'i', 'l', 'l' }, false));
        this.registerSetting(DEOBFUSCATED-NAMES.a.d = new cb(new char[] { 'W', 'e', 'a', 'p', 'o', 'n', ' ', 'o', 'n', 'l', 'y' }, false));
        this.registerSetting(DEOBFUSCATED-NAMES.a.e = new cb(new char[] { 'B', 'r', 'e', 'a', 'k', ' ', 'b', 'l', 'o', 'c', 'k', 's' }, false));
        try {
            this.gs = GuiScreen.class.getDeclaredMethod(new String(new char[] { 'f', 'u', 'n', 'c', '_', '7', '3', '8', '6', '4', '_', 'a' }), Integer.TYPE, Integer.TYPE, Integer.TYPE);
        }
        catch (Exception e1) {
            try {
                this.gs = GuiScreen.class.getDeclaredMethod(new String(new char[] { 'm', 'o', 'u', 's', 'e', 'C', 'l', 'i', 'c', 'k', 'e', 'd' }), Integer.TYPE, Integer.TYPE, Integer.TYPE);
            }
            catch (Exception ex) {}
        }
        if (this.gs != null) {
            this.gs.setAccessible(true);
        }
    }
    
    @Override
    public void onEnable() {
        if (this.gs == null) {
            this.disable();
        }
        this.rand = new Random();
    }
    
    @Override
    public void onDisable() {
        this.i = 0L;
        this.j = 0L;
        this.hol = false;
    }
    
    @Override
    public void guiUpdate() {
        ay.b(DEOBFUSCATED-NAMES.a.a, DEOBFUSCATED-NAMES.a.b);
    }
    
    @SubscribeEvent
    public void k(final TickEvent.RenderTickEvent ev) {
        if (ev.phase == TickEvent.Phase.END || !ay.e() || DEOBFUSCATED-NAMES.a.mc.field_71439_g.func_70113_ah()) {
            return;
        }
        if (DEOBFUSCATED-NAMES.a.mc.field_71462_r == null && DEOBFUSCATED-NAMES.a.mc.field_71415_G) {
            if (DEOBFUSCATED-NAMES.a.d.isToggled() && !ay.wpn()) {
                return;
            }
            Mouse.poll();
            if (DEOBFUSCATED-NAMES.a.p.isToggled() && Mouse.isButtonDown(0)) {
                this.dc(DEOBFUSCATED-NAMES.a.mc.field_71474_y.field_74312_F.func_151463_i(), 0);
            }
            else if (DEOBFUSCATED-NAMES.a.q.isToggled() && Mouse.isButtonDown(1)) {
                this.dc(DEOBFUSCATED-NAMES.a.mc.field_71474_y.field_74313_G.func_151463_i(), 1);
            }
            else {
                this.i = 0L;
                this.j = 0L;
            }
        }
        else if (DEOBFUSCATED-NAMES.a.inv.isToggled() && DEOBFUSCATED-NAMES.a.mc.field_71462_r instanceof GuiInventory) {
            if (Mouse.isButtonDown(0) && (Keyboard.isKeyDown(54) || Keyboard.isKeyDown(42))) {
                if (this.i == 0L || this.j == 0L) {
                    this.gd();
                }
                else if (System.currentTimeMillis() > this.j) {
                    this.gd();
                    this.ci(DEOBFUSCATED-NAMES.a.mc.field_71462_r);
                }
            }
            else {
                this.i = 0L;
                this.j = 0L;
            }
        }
    }
    
    public void dc(final int key, final int mouse) {
        if (DEOBFUSCATED-NAMES.a.e.isToggled() && mouse == 0 && DEOBFUSCATED-NAMES.a.mc.field_71476_x != null) {
            final BlockPos p = DEOBFUSCATED-NAMES.a.mc.field_71476_x.func_178782_a();
            if (p != null) {
                final Block bl = DEOBFUSCATED-NAMES.a.mc.field_71441_e.func_180495_p(p).func_177230_c();
                if (bl != Blocks.field_150350_a && !(bl instanceof BlockLiquid)) {
                    if (!this.hol) {
                        KeyBinding.func_74510_a(key, true);
                        KeyBinding.func_74507_a(key);
                        this.hol = true;
                    }
                    return;
                }
                if (this.hol) {
                    KeyBinding.func_74510_a(key, false);
                    this.hol = false;
                }
            }
        }
        if (DEOBFUSCATED-NAMES.a.c.getInput() > 0.0) {
            final double a = DEOBFUSCATED-NAMES.a.c.getInput() * 0.45;
            if (this.rand.nextBoolean()) {
                final EntityPlayerSP field_71439_g = DEOBFUSCATED-NAMES.a.mc.field_71439_g;
                field_71439_g.field_70177_z += (float)(this.rand.nextFloat() * a);
            }
            else {
                final EntityPlayerSP field_71439_g2 = DEOBFUSCATED-NAMES.a.mc.field_71439_g;
                field_71439_g2.field_70177_z -= (float)(this.rand.nextFloat() * a);
            }
            if (this.rand.nextBoolean()) {
                final EntityPlayerSP field_71439_g3 = DEOBFUSCATED-NAMES.a.mc.field_71439_g;
                field_71439_g3.field_70125_A += (float)(this.rand.nextFloat() * (a * 0.45));
            }
            else {
                final EntityPlayerSP field_71439_g4 = DEOBFUSCATED-NAMES.a.mc.field_71439_g;
                field_71439_g4.field_70125_A -= (float)(this.rand.nextFloat() * (a * 0.45));
            }
        }
        if (this.j > 0L && this.i > 0L) {
            if (System.currentTimeMillis() > this.j) {
                KeyBinding.func_74510_a(key, true);
                KeyBinding.func_74507_a(key);
                ay.sc(mouse, true);
                this.gd();
            }
            else if (System.currentTimeMillis() > this.i) {
                KeyBinding.func_74510_a(key, false);
                ay.sc(mouse, false);
            }
        }
        else {
            this.gd();
        }
    }
    
    public void gd() {
        final double c = ay.mmVal(DEOBFUSCATED-NAMES.a.a, DEOBFUSCATED-NAMES.a.b, this.rand) + 0.4 * this.rand.nextDouble();
        long d = (int)Math.round(1000.0 / c);
        if (System.currentTimeMillis() > this.k) {
            if (!this.n && this.rand.nextInt(100) >= 85) {
                this.n = true;
                this.m = 1.1 + this.rand.nextDouble() * 0.15;
            }
            else {
                this.n = false;
            }
            this.k = System.currentTimeMillis() + 500L + this.rand.nextInt(1500);
        }
        if (this.n) {
            d *= (long)this.m;
        }
        if (System.currentTimeMillis() > this.l) {
            if (this.rand.nextInt(100) >= 80) {
                d += 50L + this.rand.nextInt(100);
            }
            this.l = System.currentTimeMillis() + 500L + this.rand.nextInt(1500);
        }
        this.j = System.currentTimeMillis() + d;
        this.i = System.currentTimeMillis() + d / 2L - this.rand.nextInt(10);
    }
    
    private void ci(final GuiScreen s) {
        final int x = Mouse.getX() * s.field_146294_l / DEOBFUSCATED-NAMES.a.mc.field_71443_c;
        final int y = s.field_146295_m - Mouse.getY() * s.field_146295_m / DEOBFUSCATED-NAMES.a.mc.field_71440_d - 1;
        try {
            this.gs.invoke(s, x, y, 0);
        }
        catch (InvocationTargetException ex) {}
        catch (IllegalAccessException ex2) {}
    }
}
