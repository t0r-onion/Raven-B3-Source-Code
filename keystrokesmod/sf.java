// 
// Decompiled by Procyon v0.5.36
// 

package keystrokesmod;

import DEOBFUSCATED-NAMES.str;
import java.util.TimerTask;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.input.Mouse;
import net.minecraft.util.MovingObjectPosition;
import net.minecraftforge.client.event.MouseEvent;
import java.util.Iterator;
import DEOBFUSCATED-NAMES.ay;
import DEOBFUSCATED-NAMES.b9;
import net.minecraft.init.Blocks;
import java.util.Arrays;
import net.minecraft.util.BlockPos;
import net.minecraft.block.state.IBlockState;
import java.util.List;
import java.util.Timer;
import DEOBFUSCATED-NAMES.ap;
import DEOBFUSCATED-NAMES.dc;

public class sf extends bb
{
    public static dc a;
    public static dc d;
    public static ap b;
    public static ap c;
    private Timer t;
    private final List<String> m;
    private IBlockState f;
    private static final List<BlockPos> f_p;
    private final String c1;
    private final String c2;
    private final String c3;
    private final String c4;
    private final String c5;
    
    public sf() {
        super(new char[] { 'S', 'u', 'm', 'o', ' ', 'F', 'e', 'n', 'c', 'e', 's' }, bb.minigames, 0);
        this.m = Arrays.asList(new String(new char[] { 'S', 'u', 'm', 'o' }), new String(new char[] { 'S', 'p', 'a', 'c', 'e', ' ', 'M', 'i', 'n', 'e' }), new String(new char[] { 'W', 'h', 'i', 't', 'e', ' ', 'C', 'r', 'y', 's', 't', 'a', 'l' }));
        this.f = Blocks.field_180407_aO.func_176223_P();
        this.c1 = new String(new char[] { 'M', 'o', 'd', 'e', ':', ' ', 'S', 'u', 'm', 'o', ' ', 'D', 'u', 'e', 'l' });
        this.c2 = new String(new char[] { 'O', 'a', 'k', ' ', 'f', 'e', 'n', 'c', 'e' });
        this.c3 = new String(new char[] { 'L', 'e', 'a', 'v', 'e', 's' });
        this.c4 = new String(new char[] { 'G', 'l', 'a', 's', 's' });
        this.c5 = new String(new char[] { 'B', 'a', 'r', 'r', 'i', 'e', 'r' });
        this.registerSetting(sf.a = new dc(new String(new char[] { 'F', 'e', 'n', 'c', 'e', 's', ' ', 'f', 'o', 'r', ' ', 'H', 'y', 'p', 'i', 'x', 'e', 'l', ' ', 's', 'u', 'm', 'o', '.' })));
        this.registerSetting(sf.b = new ap(new char[] { 'F', 'e', 'n', 'c', 'e', ' ', 'h', 'e', 'i', 'g', 'h', 't' }, 4.0, 1.0, 6.0, 1.0));
        this.registerSetting(sf.c = new ap(new char[] { 'B', 'l', 'o', 'c', 'k', ' ', 't', 'y', 'p', 'e' }, 1.0, 1.0, 4.0, 1.0));
        this.registerSetting(sf.d = new dc(ay.md + this.c2));
    }
    
    @Override
    public void onEnable() {
        (this.t = new Timer()).scheduleAtFixedRate(this.t(), 0L, 500L);
    }
    
    @Override
    public void onDisable() {
        if (this.t != null) {
            this.t.cancel();
            this.t.purge();
            this.t = null;
        }
        for (final BlockPos p : sf.f_p) {
            for (int i = 0; i < sf.b.getInput(); ++i) {
                final BlockPos p2 = new BlockPos(p.func_177958_n(), p.func_177956_o() + i, p.func_177952_p());
                if (sf.mc.field_71441_e.func_180495_p(p2).func_177230_c() == this.f) {
                    sf.mc.field_71441_e.func_175656_a(p2, Blocks.field_150350_a.func_176223_P());
                }
            }
        }
    }
    
    @SubscribeEvent
    public void m(final MouseEvent e) {
        if (e.buttonstate && (e.button == 0 || e.button == 1) && ay.e() && this.is()) {
            final MovingObjectPosition mop = sf.mc.field_71476_x;
            if (mop != null && mop.field_72313_a == MovingObjectPosition.MovingObjectType.BLOCK) {
                final int x = mop.func_178782_a().func_177958_n();
                final int z = mop.func_178782_a().func_177952_p();
                for (final BlockPos pos : sf.f_p) {
                    if (pos.func_177958_n() == x && pos.func_177952_p() == z) {
                        e.setCanceled(true);
                        if (e.button == 0) {
                            ay.rsa();
                        }
                        Mouse.poll();
                        break;
                    }
                }
            }
        }
    }
    
    public TimerTask t() {
        final TimerTask t = (TimerTask)new sf(this);
        return t;
    }
    
    private boolean is() {
        if (ay.isHyp()) {
            for (final String l : ay.gsl()) {
                final String s = ay.str(l);
                if (s.startsWith(str.c33)) {
                    if (this.m.contains(s.substring(5))) {
                        return true;
                    }
                    continue;
                }
                else {
                    if (s.equals(this.c1)) {
                        return true;
                    }
                    continue;
                }
            }
        }
        return false;
    }
    
    @Override
    public void guiUpdate() {
        switch ((int)sf.c.getInput()) {
            case 1: {
                this.f = Blocks.field_180407_aO.func_176223_P();
                sf.d.setDesc(ay.md + this.c2);
                break;
            }
            case 2: {
                this.f = Blocks.field_150362_t.func_176223_P();
                sf.d.setDesc(ay.md + this.c3);
                break;
            }
            case 3: {
                this.f = Blocks.field_150359_w.func_176223_P();
                sf.d.setDesc(ay.md + this.c4);
                break;
            }
            case 4: {
                this.f = Blocks.field_180401_cv.func_176223_P();
                sf.d.setDesc(ay.md + this.c5);
                break;
            }
        }
    }
    
    static {
        f_p = Arrays.asList(new BlockPos(9, 65, -2), new BlockPos(9, 65, -1), new BlockPos(9, 65, 0), new BlockPos(9, 65, 1), new BlockPos(9, 65, 2), new BlockPos(9, 65, 3), new BlockPos(8, 65, 3), new BlockPos(8, 65, 4), new BlockPos(8, 65, 5), new BlockPos(7, 65, 5), new BlockPos(7, 65, 6), new BlockPos(7, 65, 7), new BlockPos(6, 65, 7), new BlockPos(5, 65, 7), new BlockPos(5, 65, 8), new BlockPos(4, 65, 8), new BlockPos(3, 65, 8), new BlockPos(3, 65, 9), new BlockPos(2, 65, 9), new BlockPos(1, 65, 9), new BlockPos(0, 65, 9), new BlockPos(-1, 65, 9), new BlockPos(-2, 65, 9), new BlockPos(-3, 65, 9), new BlockPos(-3, 65, 8), new BlockPos(-4, 65, 8), new BlockPos(-5, 65, 8), new BlockPos(-5, 65, 7), new BlockPos(-6, 65, 7), new BlockPos(-7, 65, 7), new BlockPos(-7, 65, 6), new BlockPos(-7, 65, 5), new BlockPos(-8, 65, 5), new BlockPos(-8, 65, 4), new BlockPos(-8, 65, 3), new BlockPos(-9, 65, 3), new BlockPos(-9, 65, 2), new BlockPos(-9, 65, 1), new BlockPos(-9, 65, 0), new BlockPos(-9, 65, -1), new BlockPos(-9, 65, -2), new BlockPos(-9, 65, -3), new BlockPos(-8, 65, -3), new BlockPos(-8, 65, -4), new BlockPos(-8, 65, -5), new BlockPos(-7, 65, -5), new BlockPos(-7, 65, -6), new BlockPos(-7, 65, -7), new BlockPos(-6, 65, -7), new BlockPos(-5, 65, -7), new BlockPos(-5, 65, -8), new BlockPos(-4, 65, -8), new BlockPos(-3, 65, -8), new BlockPos(-3, 65, -9), new BlockPos(-2, 65, -9), new BlockPos(-1, 65, -9), new BlockPos(0, 65, -9), new BlockPos(1, 65, -9), new BlockPos(2, 65, -9), new BlockPos(3, 65, -9), new BlockPos(3, 65, -8), new BlockPos(4, 65, -8), new BlockPos(5, 65, -8), new BlockPos(5, 65, -7), new BlockPos(6, 65, -7), new BlockPos(7, 65, -7), new BlockPos(7, 65, -6), new BlockPos(7, 65, -5), new BlockPos(8, 65, -5), new BlockPos(8, 65, -4), new BlockPos(8, 65, -3), new BlockPos(9, 65, -3));
    }
}
