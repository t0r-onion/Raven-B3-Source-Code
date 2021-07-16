// 
// Decompiled by Procyon v0.5.36
// 

package DEOBFUSCATED-NAMES;

import org.lwjgl.input.Keyboard;
import keystrokesmod.bb;

public class ak extends bb
{
    public static dc dc;
    public static ap a;
    public static cb b;
    
    public ak() {
        super(new char[] { 'S', 'p', 'e', 'e', 'd' }, bb.movement, 0);
        this.registerSetting(ak.dc = new dc(new String(new char[] { 'H', 'y', 'p', 'i', 'x', 'e', 'l', ' ', 'm', 'a', 'x', ':', ' ', '1', '.', '1', '3' })));
        this.registerSetting(ak.a = new ap(new char[] { 'S', 'p', 'e', 'e', 'd' }, 1.2, 1.0, 1.5, 0.01));
        this.registerSetting(ak.b = new cb(new char[] { 'S', 't', 'r', 'a', 'f', 'e', ' ', 'o', 'n', 'l', 'y' }, false));
    }
    
    @Override
    public void update() {
        final double csp = ay.gs();
        if (csp == 0.0) {
            return;
        }
        if (!ak.mc.field_71439_g.field_70122_E || ak.mc.field_71439_g.field_71075_bZ.field_75100_b) {
            return;
        }
        if (ak.b.isToggled() && ak.mc.field_71439_g.field_70702_br == 0.0f) {
            return;
        }
        if (ak.mc.field_71439_g.field_70737_aN == ak.mc.field_71439_g.field_70738_aO && ak.mc.field_71439_g.field_70738_aO > 0) {
            return;
        }
        if (Keyboard.isKeyDown(ak.mc.field_71474_y.field_74314_A.func_151463_i())) {
            return;
        }
        final double val = ak.a.getInput() - (ak.a.getInput() - 1.0) * 0.5;
        ay.ss(csp * val, true);
    }
}
