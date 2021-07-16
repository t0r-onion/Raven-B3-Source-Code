// 
// Decompiled by Procyon v0.5.36
// 

package DEOBFUSCATED-NAMES;

import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.settings.KeyBinding;
import org.lwjgl.input.Keyboard;
import net.minecraft.client.gui.GuiChat;
import keystrokesmod.bb;

public class az extends bb
{
    public az() {
        super(new char[] { 'I', 'n', 'v', 'M', 'o', 'v', 'e' }, bb.movement, 0);
    }
    
    @Override
    public void update() {
        if (az.mc.field_71462_r != null) {
            if (az.mc.field_71462_r instanceof GuiChat) {
                return;
            }
            final KeyBinding field_74351_w = az.mc.field_71474_y.field_74351_w;
            KeyBinding.func_74510_a(az.mc.field_71474_y.field_74351_w.func_151463_i(), Keyboard.isKeyDown(az.mc.field_71474_y.field_74351_w.func_151463_i()));
            final KeyBinding field_74368_y = az.mc.field_71474_y.field_74368_y;
            KeyBinding.func_74510_a(az.mc.field_71474_y.field_74368_y.func_151463_i(), Keyboard.isKeyDown(az.mc.field_71474_y.field_74368_y.func_151463_i()));
            final KeyBinding field_74366_z = az.mc.field_71474_y.field_74366_z;
            KeyBinding.func_74510_a(az.mc.field_71474_y.field_74366_z.func_151463_i(), Keyboard.isKeyDown(az.mc.field_71474_y.field_74366_z.func_151463_i()));
            final KeyBinding field_74370_x = az.mc.field_71474_y.field_74370_x;
            KeyBinding.func_74510_a(az.mc.field_71474_y.field_74370_x.func_151463_i(), Keyboard.isKeyDown(az.mc.field_71474_y.field_74370_x.func_151463_i()));
            final KeyBinding field_74314_A = az.mc.field_71474_y.field_74314_A;
            KeyBinding.func_74510_a(az.mc.field_71474_y.field_74314_A.func_151463_i(), Keyboard.isKeyDown(az.mc.field_71474_y.field_74314_A.func_151463_i()));
            if (Keyboard.isKeyDown(208) && az.mc.field_71439_g.field_70125_A < 90.0f) {
                final EntityPlayerSP field_71439_g = az.mc.field_71439_g;
                field_71439_g.field_70125_A += 6.0f;
            }
            if (Keyboard.isKeyDown(200) && az.mc.field_71439_g.field_70125_A > -90.0f) {
                final EntityPlayerSP field_71439_g2 = az.mc.field_71439_g;
                field_71439_g2.field_70125_A -= 6.0f;
            }
            if (Keyboard.isKeyDown(205)) {
                final EntityPlayerSP field_71439_g3 = az.mc.field_71439_g;
                field_71439_g3.field_70177_z += 6.0f;
            }
            if (Keyboard.isKeyDown(203)) {
                final EntityPlayerSP field_71439_g4 = az.mc.field_71439_g;
                field_71439_g4.field_70177_z -= 6.0f;
            }
        }
    }
}
