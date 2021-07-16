// 
// Decompiled by Procyon v0.5.36
// 

package DEOBFUSCATED-NAMES;

import net.minecraft.util.MovementInput;
import keystrokesmod.bb;

public class ns extends bb
{
    public static dc a;
    public static dc c;
    public static ap b;
    
    public ns() {
        super(new char[] { 'N', 'o', 'S', 'l', 'o', 'w' }, bb.movement, 0);
        this.registerSetting(ns.a = new dc(new String(new char[] { 'D', 'e', 'f', 'a', 'u', 'l', 't', ' ', 'i', 's', ' ', '8', '0', '%', ' ', 'm', 'o', 't', 'i', 'o', 'n', ' ', 'r', 'e', 'd', 'u', 'c', 't', 'i', 'o', 'n', '.' })));
        this.registerSetting(ns.c = new dc(new String(new char[] { 'H', 'y', 'p', 'i', 'x', 'e', 'l', ' ', 'm', 'a', 'x', ':', ' ', '2', '2', '%' })));
        this.registerSetting(ns.b = new ap(new char[] { 'S', 'l', 'o', 'w', ' ', '%' }, 80.0, 0.0, 80.0, 1.0));
    }
    
    public static void sl() {
        final float val = (100.0f - (float)ns.b.getInput()) / 100.0f;
        final MovementInput field_71158_b = ns.mc.field_71439_g.field_71158_b;
        field_71158_b.field_78902_a *= val;
        final MovementInput field_71158_b2 = ns.mc.field_71439_g.field_71158_b;
        field_71158_b2.field_78900_b *= val;
    }
}
