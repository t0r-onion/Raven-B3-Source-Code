// 
// Decompiled by Procyon v0.5.36
// 

package keystrokesmod;

import net.minecraft.network.Packet;
import net.minecraft.util.EnumFacing;
import net.minecraft.network.play.client.C07PacketPlayerDigging;
import net.minecraft.init.Blocks;
import java.util.TimerTask;
import DEOBFUSCATED-NAMES.b9;
import net.minecraft.util.BlockPos;
import java.util.Timer;
import DEOBFUSCATED-NAMES.ap;

public class bf extends bb
{
    public static ap r;
    private Timer t;
    private BlockPos m;
    private final long per = 600L;
    
    public bf() {
        super(new char[] { 'B', 'e', 'd', 'A', 'u', 'r', 'a' }, bb.player, 0);
        this.m = null;
        this.registerSetting(bf.r = new ap(new char[] { 'R', 'a', 'n', 'g', 'e' }, 5.0, 2.0, 10.0, 1.0));
    }
    
    @Override
    public void onEnable() {
        (this.t = new Timer()).scheduleAtFixedRate(this.t(), 0L, 600L);
    }
    
    @Override
    public void onDisable() {
        if (this.t != null) {
            this.t.cancel();
            this.t.purge();
            this.t = null;
        }
        this.m = null;
    }
    
    public TimerTask t() {
        final TimerTask t = new TimerTask() {
            @Override
            public void run() {
                int y;
                for (int ra = y = (int)keystrokesmod.bf.r.getInput(); y >= -ra; --y) {
                    for (int x = -ra; x <= ra; ++x) {
                        for (int z = -ra; z <= ra; ++z) {
                            final BlockPos p = new BlockPos(bb.mc.field_71439_g.field_70165_t + x, bb.mc.field_71439_g.field_70163_u + y, bb.mc.field_71439_g.field_70161_v + z);
                            final boolean bed = bb.mc.field_71441_e.func_180495_p(p).func_177230_c() == Blocks.field_150324_C;
                            if (keystrokesmod.bf.this.m == p) {
                                if (!bed) {
                                    keystrokesmod.bf.this.m = null;
                                }
                            }
                            else if (bed) {
                                keystrokesmod.bf.this.mi(p);
                                keystrokesmod.bf.this.m = p;
                                break;
                            }
                        }
                    }
                }
            }
        };
        return t;
    }
    
    private void mi(final BlockPos p) {
        bf.mc.field_71439_g.field_71174_a.func_147297_a((Packet)new C07PacketPlayerDigging(C07PacketPlayerDigging.Action.START_DESTROY_BLOCK, p, EnumFacing.NORTH));
        bf.mc.field_71439_g.field_71174_a.func_147297_a((Packet)new C07PacketPlayerDigging(C07PacketPlayerDigging.Action.STOP_DESTROY_BLOCK, p, EnumFacing.NORTH));
    }
}
