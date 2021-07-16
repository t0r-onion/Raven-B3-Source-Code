// 
// Decompiled by Procyon v0.5.36
// 

package keystrokesmod;

import java.awt.Color;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import DEOBFUSCATED-NAMES.str;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraft.item.ItemStack;
import java.util.Iterator;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemBlock;
import DEOBFUSCATED-NAMES.ay;
import net.minecraft.entity.item.EntityArmorStand;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.client.gui.GuiScreen;
import DEOBFUSCATED-NAMES.b9;
import net.minecraft.util.BlockPos;
import DEOBFUSCATED-NAMES.cb;
import DEOBFUSCATED-NAMES.dc;

public static class bi extends bb
{
    public static dc a;
    public static cb ep;
    private static final int rgb;
    private final String bd;
    private final String g1t;
    private final String g2t;
    private final String qt;
    private final String t1;
    private final String t2;
    private final String t3;
    private final String t4;
    private static int hudX;
    private static int hudY;
    private String en;
    private BlockPos g1p;
    private BlockPos g2p;
    private boolean q;
    private double d1;
    private double d2;
    private int blc;
    
    public bi() {
        super(new char[] { 'B', 'r', 'i', 'd', 'g', 'e', ' ', 'I', 'n', 'f', 'o' }, bb.minigames, 0);
        this.bd = new String(new char[] { 't', 'h', 'e', ' ', 'b', 'r', 'i', 'd' });
        this.g1t = new String(new char[] { 'D', 'e', 'f', 'e', 'n', 'd', '!' });
        this.g2t = new String(new char[] { 'J', 'u', 'm', 'p', ' ', 'i', 'n', ' ', 't', 'o', ' ', 's', 'c', 'o', 'r', 'e', '!' });
        this.qt = new String(new char[] { 'F', 'i', 'r', 's', 't', ' ', 'p', 'l', 'a', 'y', 'e', 'r', ' ', 't', 'o', ' ', 's', 'c', 'o', 'r', 'e', ' ', '5', ' ', 'g', 'o', 'a', 'l', 's', ' ', 'w', 'i', 'n', 's' });
        this.t1 = new String(new char[] { 'E', 'n', 'e', 'm', 'y', ':', ' ' });
        this.t2 = new String(new char[] { 'D', 'i', 's', 't', 'a', 'n', 'c', 'e', ' ', 't', 'o', ' ', 'g', 'o', 'a', 'l', ':', ' ' });
        this.t3 = new String(new char[] { 'E', 'n', 'e', 'm', 'y', ' ', 'd', 'i', 's', 't', 'a', 'n', 'c', 'e', ' ', 't', 'o', ' ', 'g', 'o', 'a', 'l', ':', ' ' });
        this.t4 = new String(new char[] { 'B', 'l', 'o', 'c', 'k', 's', ':', ' ' });
        this.en = "";
        this.g1p = null;
        this.g2p = null;
        this.q = false;
        this.d1 = 0.0;
        this.d2 = 0.0;
        this.blc = 0;
        this.registerSetting(bi.a = new dc(new String(new char[] { 'O', 'n', 'l', 'y', ' ', 'f', 'o', 'r', ' ', 's', 'o', 'l', 'o', 's', '.' })));
        this.registerSetting(bi.ep = new cb(new char[] { 'E', 'd', 'i', 't', ' ', 'p', 'o', 's', 'i', 't', 'i', 'o', 'n' }, false));
    }
    
    @Override
    public void onDisable() {
        this.rv();
    }
    
    @Override
    public void guiButtonToggled(final cb b) {
        if (b == bi.ep) {
            bi.ep.disable();
            bi.mc.func_147108_a((GuiScreen)new bi());
        }
    }
    
    @Override
    public void update() {
        if (this.en.isEmpty() || !this.ibd()) {
            return;
        }
        EntityPlayer enem = null;
        for (final Entity e : bi.mc.field_71441_e.field_72996_f) {
            if (e instanceof EntityPlayer) {
                if (!e.func_70005_c_().equals(this.en)) {
                    continue;
                }
                enem = (EntityPlayer)e;
            }
            else {
                if (!(e instanceof EntityArmorStand)) {
                    continue;
                }
                if (e.func_70005_c_().contains(this.g1t)) {
                    this.g1p = e.func_180425_c();
                }
                else {
                    if (!e.func_70005_c_().contains(this.g2t)) {
                        continue;
                    }
                    this.g2p = e.func_180425_c();
                }
            }
        }
        if (this.g1p != null && this.g2p != null) {
            this.d1 = ay.rnd(bi.mc.field_71439_g.func_70011_f((double)this.g2p.func_177958_n(), (double)this.g2p.func_177956_o(), (double)this.g2p.func_177952_p()) - 1.4, 1);
            if (this.d1 < 0.0) {
                this.d1 = 0.0;
            }
            this.d2 = ((enem == null) ? 0.0 : ay.rnd(enem.func_70011_f((double)this.g1p.func_177958_n(), (double)this.g1p.func_177956_o(), (double)this.g1p.func_177952_p()) - 1.4, 1));
            if (this.d2 < 0.0) {
                this.d2 = 0.0;
            }
        }
        int blc2 = 0;
        for (int i = 0; i < 9; ++i) {
            final ItemStack stack = bi.mc.field_71439_g.field_71071_by.func_70301_a(i);
            if (stack != null && stack.func_77973_b() instanceof ItemBlock && ((ItemBlock)stack.func_77973_b()).field_150939_a.equals(Blocks.field_150406_ce)) {
                blc2 += stack.field_77994_a;
            }
        }
        this.blc = blc2;
    }
    
    @SubscribeEvent
    public void a(final TickEvent.RenderTickEvent ev) {
        if (ev.phase == TickEvent.Phase.END && ay.e() && this.ibd()) {
            if (bi.mc.field_71462_r != null || bi.mc.field_71474_y.field_74330_P) {
                return;
            }
            bi.mc.field_71466_p.func_175065_a(this.t1 + this.en, (float)bi.hudX, (float)bi.hudY, bi.rgb, true);
            bi.mc.field_71466_p.func_175065_a(this.t2 + this.d1, (float)bi.hudX, (float)(bi.hudY + 11), bi.rgb, true);
            bi.mc.field_71466_p.func_175065_a(this.t3 + this.d2, (float)bi.hudX, (float)(bi.hudY + 22), bi.rgb, true);
            bi.mc.field_71466_p.func_175065_a(this.t4 + this.blc, (float)bi.hudX, (float)(bi.hudY + 33), bi.rgb, true);
        }
    }
    
    @SubscribeEvent
    public void o(final ClientChatReceivedEvent c) {
        if (ay.e()) {
            final String s = ay.str(c.message.func_150260_c());
            if (s.startsWith(" ")) {
                if (s.contains(this.qt)) {
                    this.q = true;
                }
                else if (this.q && s.contains(str.c62 + ":")) {
                    String n = s.split(":")[1].trim();
                    if (n.contains("[")) {
                        n = n.split("] ")[1];
                    }
                    this.en = n;
                    this.q = false;
                }
            }
        }
    }
    
    @SubscribeEvent
    public void w(final EntityJoinWorldEvent j) {
        if (j.entity == bi.mc.field_71439_g) {
            this.rv();
        }
    }
    
    private boolean ibd() {
        if (ay.isHyp()) {
            for (final String s : ay.gsl()) {
                final String s2 = s.toLowerCase();
                if (s2.contains(str.c70) && s2.contains(this.bd)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private void rv() {
        this.en = "";
        this.q = false;
        this.g1p = null;
        this.g2p = null;
        this.d1 = 0.0;
        this.d2 = 0.0;
        this.blc = 0;
    }
    
    static {
        rgb = new Color(0, 200, 200).getRGB();
        bi.hudX = 5;
        bi.hudY = 70;
    }
}
