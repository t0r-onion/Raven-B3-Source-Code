// 
// Decompiled by Procyon v0.5.36
// 

package DEOBFUSCATED-NAMES;

import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.client.event.DrawBlockHighlightEvent;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemBlock;
import org.lwjgl.input.Mouse;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MovingObjectPosition;
import keystrokesmod.bb;

public class ae extends bb
{
    public static dc ds;
    public static cb a;
    public static cb b;
    public static ap c;
    private double lfd;
    private final int d = 25;
    private long l;
    private int f;
    private MovingObjectPosition lm;
    private BlockPos lp;
    
    public ae() {
        super(new char[] { 'A', 'u', 't', 'o', 'P', 'l', 'a', 'c', 'e' }, bb.player, 0);
        this.lfd = 0.0;
        this.l = 0L;
        this.f = 0;
        this.lm = null;
        this.lp = null;
        this.registerSetting(ae.ds = new dc(new String(new char[] { 'F', 'D', ':', ' ', 'F', 'P', 'S', '/', '8', '0' })));
        this.registerSetting(ae.c = new ap(new char[] { 'F', 'r', 'a', 'm', 'e', ' ', 'd', 'e', 'l', 'a', 'y' }, 8.0, 0.0, 30.0, 1.0));
        this.registerSetting(ae.a = new cb(new char[] { 'H', 'o', 'l', 'd', ' ', 'r', 'i', 'g', 'h', 't' }, true));
    }
    
    @Override
    public void guiUpdate() {
        if (this.lfd != ae.c.getInput()) {
            this.rv();
        }
        this.lfd = ae.c.getInput();
    }
    
    @Override
    public void onDisable() {
        if (ae.a.isToggled()) {
            this.rd(4);
        }
        this.rv();
    }
    
    @Override
    public void update() {
        if (ae.a.isToggled() && Mouse.isButtonDown(1) && !ae.mc.field_71439_g.field_71075_bZ.field_75100_b && !m2.aa.isEnabled()) {
            final ItemStack i = ae.mc.field_71439_g.func_70694_bm();
            if (i == null || !(i.func_77973_b() instanceof ItemBlock)) {
                return;
            }
            this.rd((ae.mc.field_71439_g.field_70181_x > 0.0) ? 1 : 1000);
        }
    }
    
    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public void bh(final DrawBlockHighlightEvent ev) {
        if (ay.e()) {
            if (ae.mc.field_71462_r != null || ae.mc.field_71439_g.field_71075_bZ.field_75100_b) {
                return;
            }
            final ItemStack i = ae.mc.field_71439_g.func_70694_bm();
            if (i == null || !(i.func_77973_b() instanceof ItemBlock)) {
                return;
            }
            final MovingObjectPosition m = ae.mc.field_71476_x;
            if (m == null || m.field_72313_a != MovingObjectPosition.MovingObjectType.BLOCK || m.field_178784_b == EnumFacing.UP || m.field_178784_b == EnumFacing.DOWN) {
                return;
            }
            if (this.lm != null && this.f < ae.c.getInput()) {
                ++this.f;
                return;
            }
            this.lm = m;
            final BlockPos pos = m.func_178782_a();
            if (this.lp != null && pos.func_177958_n() == this.lp.func_177958_n() && pos.func_177956_o() == this.lp.func_177956_o() && pos.func_177952_p() == this.lp.func_177952_p()) {
                return;
            }
            final Block b = ae.mc.field_71441_e.func_180495_p(pos).func_177230_c();
            if (b == null || b == Blocks.field_150350_a || b instanceof BlockLiquid) {
                return;
            }
            if (ae.a.isToggled() && !Mouse.isButtonDown(1)) {
                return;
            }
            final long n = System.currentTimeMillis();
            if (n - this.l < 25L) {
                return;
            }
            this.l = n;
            if (ae.mc.field_71442_b.func_178890_a(ae.mc.field_71439_g, ae.mc.field_71441_e, i, pos, m.field_178784_b, m.field_72307_f)) {
                ay.sc(1, true);
                ae.mc.field_71439_g.func_71038_i();
                ae.mc.func_175597_ag().func_78444_b();
                ay.sc(1, false);
                this.lp = pos;
                this.f = 0;
            }
        }
    }
    
    private void rd(final int i) {
        try {
            if (aa.r != null) {
                aa.r.set(ae.mc, i);
            }
        }
        catch (IllegalAccessException ex) {}
        catch (IndexOutOfBoundsException ex2) {}
    }
    
    private void rv() {
        this.lp = null;
        this.lm = null;
        this.f = 0;
    }
}
