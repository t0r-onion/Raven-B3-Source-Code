// 
// Decompiled by Procyon v0.5.36
// 

package DEOBFUSCATED-NAMES;

import net.minecraft.client.gui.GuiScreen;
import keystrokesmod.bb;

public class au extends bb
{
    public static final int bind = 54;
    public static ap a;
    public static dc b;
    
    public au() {
        super(new char[] { 'G', 'u', 'i' }, bb.client, 54);
        this.registerSetting(au.a = new ap(new char[] { 'T', 'h', 'e', 'm', 'e' }, 3.0, 1.0, 3.0, 1.0));
        this.registerSetting(au.b = new dc(ay.md + "b" + 3));
    }
    
    @Override
    public void onEnable() {
        if (ay.e() && au.mc.field_71462_r != aw.b) {
            au.mc.func_147108_a((GuiScreen)aw.b);
            aw.b.initMain();
        }
        this.disable();
    }
    
    @Override
    public void guiUpdate() {
        switch ((int)au.a.getInput()) {
            case 1: {
                au.b.setDesc(ay.md + "b" + 1);
                break;
            }
            case 2: {
                au.b.setDesc(ay.md + "b" + 2);
                break;
            }
            case 3: {
                au.b.setDesc(ay.md + "b" + 3);
                break;
            }
        }
    }
}
