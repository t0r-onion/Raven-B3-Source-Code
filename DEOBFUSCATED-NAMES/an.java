// 
// Decompiled by Procyon v0.5.36
// 

package DEOBFUSCATED-NAMES;

import net.minecraft.entity.Entity;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraft.entity.player.EntityPlayer;
import java.util.HashMap;
import keystrokesmod.bb;

public class an extends bb
{
    private static final HashMap<EntityPlayer, Long> newEnt;
    private final long ms = 4000L;
    public static cb a;
    
    public an() {
        super(new char[] { 'A', 'n', 't', 'i', 'B', 'o', 't' }, bb.world, 0);
        this.registerSetting(an.a = new cb(new char[] { 'W', 'a', 'i', 't', ' ', '8', '0', ' ', 't', 'i', 'c', 'k', 's' }, false));
    }
    
    @Override
    public void onDisable() {
        an.newEnt.clear();
    }
    
    @SubscribeEvent
    public void w(final EntityJoinWorldEvent j) {
        if (an.a.isToggled() && j.entity instanceof EntityPlayer && j.entity != an.mc.field_71439_g) {
            an.newEnt.put((EntityPlayer)j.entity, System.currentTimeMillis());
        }
    }
    
    @Override
    public void update() {
        if (an.a.isToggled() && !an.newEnt.isEmpty()) {
            final long now = System.currentTimeMillis();
            an.newEnt.values().removeIf(e -> e < now - 4000L);
        }
    }
    
    public static boolean bot(final Entity en) {
        if (fc.en != null && fc.en == en) {
            return true;
        }
        if (!m2.an.isEnabled()) {
            return false;
        }
        if (!ay.isHyp()) {
            return false;
        }
        if (an.a.isToggled() && !an.newEnt.isEmpty() && an.newEnt.containsKey(en)) {
            return true;
        }
        if (en.func_70005_c_().startsWith("§c")) {
            return true;
        }
        final String n = en.func_145748_c_().func_150260_c();
        if (n.contains("§")) {
            if (n.contains(str.c46 + " ")) {
                return true;
            }
        }
        else {
            if (n.isEmpty() && en.func_70005_c_().isEmpty()) {
                return true;
            }
            if (n.length() == 10) {
                int num = 0;
                int let = 0;
                for (final char c : n.toCharArray()) {
                    if (Character.isLetter(c)) {
                        if (Character.isUpperCase(c)) {
                            return false;
                        }
                        ++let;
                    }
                    else {
                        if (!Character.isDigit(c)) {
                            return false;
                        }
                        ++num;
                    }
                }
                if (num >= 2 && let >= 2) {
                    return true;
                }
            }
        }
        return false;
    }
    
    static {
        newEnt = new HashMap<EntityPlayer, Long>();
    }
}
