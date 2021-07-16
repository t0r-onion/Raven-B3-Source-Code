// 
// Decompiled by Procyon v0.5.36
// 

package keystrokesmod;

import DEOBFUSCATED-NAMES.ay;
import DEOBFUSCATED-NAMES.b9;
import DEOBFUSCATED-NAMES.ap;
import DEOBFUSCATED-NAMES.dc;

public class ao extends bb
{
    private final ao vanFly;
    private final GliFly gliFly;
    public static dc dc;
    public static ap a;
    public static ap b;
    private static final String c1;
    private static final String c2;
    
    public ao() {
        super(new char[] { 'F', 'l', 'y' }, bb.movement, 0);
        this.vanFly = new ao(this);
        this.gliFly = new GliFly();
        this.registerSetting(ao.a = new ap(new char[] { 'V', 'a', 'l', 'u', 'e' }, 1.0, 1.0, 2.0, 1.0));
        this.registerSetting(ao.dc = new dc(ay.md + ao.c1));
        this.registerSetting(ao.b = new ap(new char[] { 'S', 'p', 'e', 'e', 'd' }, 2.0, 1.0, 5.0, 0.1));
    }
    
    @Override
    public void onEnable() {
        switch ((int)ao.a.getInput()) {
            case 1: {
                this.vanFly.onEnable();
                break;
            }
            case 2: {
                this.gliFly.onEnable();
                break;
            }
        }
    }
    
    @Override
    public void onDisable() {
        switch ((int)ao.a.getInput()) {
            case 1: {
                this.vanFly.onDisable();
                break;
            }
            case 2: {
                this.gliFly.onDisable();
                break;
            }
        }
    }
    
    @Override
    public void update() {
        switch ((int)ao.a.getInput()) {
            case 1: {
                this.vanFly.update();
                break;
            }
            case 2: {
                this.gliFly.update();
                break;
            }
        }
    }
    
    @Override
    public void guiUpdate() {
        switch ((int)ao.a.getInput()) {
            case 1: {
                ao.dc.setDesc(ay.md + ao.c1);
                break;
            }
            case 2: {
                ao.dc.setDesc(ay.md + ao.c2);
                break;
            }
        }
    }
    
    static {
        c1 = new String(new char[] { 'V', 'a', 'n', 'i', 'l', 'l', 'a' });
        c2 = new String(new char[] { 'G', 'l', 'i', 'd', 'e' });
    }
    
    class VanFly
    {
        private final float dfs = 0.05f;
        
        VanFly(final ao this$0) {
            ((ao)this).this$0 = this$0;
            ((ao)this).dfs = 0.05f;
        }
        
        public void onEnable() {
        }
        
        public void onDisable() {
            if (bb.mc.field_71439_g.field_71075_bZ.field_75100_b) {
                bb.mc.field_71439_g.field_71075_bZ.field_75100_b = false;
            }
            bb.mc.field_71439_g.field_71075_bZ.func_75092_a(0.05f);
        }
        
        public void update() {
            bb.mc.field_71439_g.field_70181_x = 0.0;
            bb.mc.field_71439_g.field_71075_bZ.func_75092_a((float)(0.05000000074505806 * ao.b.getInput()));
            bb.mc.field_71439_g.field_71075_bZ.field_75100_b = true;
        }
    }
    
    class GliFly
    {
        boolean opf;
        
        GliFly() {
            this.opf = false;
        }
        
        public void onEnable() {
        }
        
        public void onDisable() {
            this.opf = false;
        }
        
        public void update() {
            if (bb.mc.field_71439_g.field_71158_b.field_78900_b > 0.0f) {
                if (!this.opf) {
                    this.opf = true;
                    if (bb.mc.field_71439_g.field_70122_E) {
                        bb.mc.field_71439_g.func_70664_aZ();
                    }
                }
                else {
                    if (bb.mc.field_71439_g.field_70122_E || bb.mc.field_71439_g.field_70123_F) {
                        ao.this.disable();
                        return;
                    }
                    final double s = 1.94 * ao.b.getInput();
                    final double r = Math.toRadians(bb.mc.field_71439_g.field_70177_z + 90.0f);
                    bb.mc.field_71439_g.field_70159_w = s * Math.cos(r);
                    bb.mc.field_71439_g.field_70179_y = s * Math.sin(r);
                }
            }
        }
    }
}
