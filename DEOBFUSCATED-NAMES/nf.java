// 
// Decompiled by Procyon v0.5.36
// 

package DEOBFUSCATED-NAMES;

import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C03PacketPlayer;
import keystrokesmod.bb;

public class nf extends bb
{
    public nf() {
        super(new char[] { 'N', 'o', 'F', 'a', 'l', 'l' }, bb.player, 0);
    }
    
    @Override
    public void update() {
        if (nf.mc.field_71439_g.field_70143_R > 2.5) {
            nf.mc.field_71439_g.field_71174_a.func_147297_a((Packet)new C03PacketPlayer(true));
        }
    }
}
