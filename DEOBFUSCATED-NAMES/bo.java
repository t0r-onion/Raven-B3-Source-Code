// 
// Decompiled by Procyon v0.5.36
// 

package DEOBFUSCATED-NAMES;

import keystrokesmod.bb;

public class bo extends bb
{
    public static dc c;
    public static ap a;
    public static ap b;
    private int i;
    private boolean t;
    
    public bo() {
        super(new char[] { 'B', 'o', 'o', 's', 't' }, bb.movement, 0);
        this.i = 0;
        this.t = false;
        this.registerSetting(bo.c = new dc(new String(new char[] { '2', '0', ' ', 't', 'i', 'c', 'k', 's', ' ', 'a', 'r', 'e', ' ', 'i', 'n', ' ', '1', ' ', 's', 'e', 'c', 'o', 'n', 'd' })));
        this.registerSetting(bo.a = new ap(new char[] { 'M', 'u', 'l', 't', 'i', 'p', 'l', 'i', 'e', 'r' }, 2.0, 1.0, 3.0, 0.05));
        this.registerSetting(bo.b = new ap(new char[] { 'T', 'i', 'm', 'e', ' ', '(', 't', 'i', 'c', 'k', 's', ')' }, 15.0, 1.0, 80.0, 1.0));
    }
    
    @Override
    public void onEnable() {
        if (m2.t.isEnabled()) {
            this.t = true;
            m2.t.disable();
        }
    }
    
    @Override
    public void onDisable() {
        this.i = 0;
        if (ay.gt().field_74278_d != 1.0f) {
            ay.rt();
        }
        if (this.t) {
            m2.t.enable();
        }
        this.t = false;
    }
    
    @Override
    public void update() {
        if (this.i == 0) {
            this.i = bo.mc.field_71439_g.field_70173_aa;
        }
        ay.gt().field_74278_d = (float)bo.a.getInput();
        if (this.i == bo.mc.field_71439_g.field_70173_aa - bo.b.getInput()) {
            ay.rt();
            this.disable();
        }
    }
}
