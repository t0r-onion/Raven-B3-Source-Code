// 
// Decompiled by Procyon v0.5.36
// 

package DEOBFUSCATED-NAMES;

import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import java.util.Iterator;
import net.minecraft.entity.player.EntityPlayer;
import keystrokesmod.ah;
import java.util.ArrayList;
import java.util.List;
import keystrokesmod.bb;

public class ds extends bb
{
    public static ap m;
    public static dc cm;
    public static cb a;
    public static cb b;
    public static String nk;
    private String ign;
    private String en;
    private static final String[] thr_lvl;
    private List<String> q;
    
    public ds() {
        super(new char[] { 'D', 'u', 'e', 'l', 's', ' ', 'S', 't', 'a', 't', 's' }, bb.minigames, 0);
        this.ign = "";
        this.en = "";
        this.q = new ArrayList<String>();
        this.registerSetting(ds.m = new ap(new char[] { 'V', 'a', 'l', 'u', 'e' }, 1.0, 1.0, 7.0, 1.0));
        this.registerSetting(ds.cm = new dc(ay.md + new String(new char[] { 'O', 'V', 'E', 'R', 'A', 'L', 'L' })));
        this.registerSetting(ds.a = new cb(new char[] { 'S', 'e', 'n', 'd', ' ', 'i', 'g', 'n', ' ', 'o', 'n', ' ', 'j', 'o', 'i', 'n' }, false));
        this.registerSetting(ds.b = new cb(new char[] { 'T', 'h', 'r', 'e', 'a', 't', ' ', 'L', 'e', 'v', 'e', 'l' }, true));
    }
    
    @Override
    public void onEnable() {
        if (ds.mc.field_71439_g != null) {
            this.ign = ds.mc.field_71439_g.func_70005_c_();
        }
        else {
            this.disable();
        }
    }
    
    @Override
    public void onDisable() {
        this.en = "";
        this.q.clear();
    }
    
    @Override
    public void guiUpdate() {
        ds.cm.setDesc(ay.md + ah.DM.values()[(int)(ds.m.getInput() - 1.0)].name());
    }
    
    @Override
    public void update() {
        if (this.id() && this.en.isEmpty()) {
            final List<EntityPlayer> pl = (List<EntityPlayer>)ds.mc.field_71441_e.field_73010_i;
            pl.remove(ds.mc.field_71439_g);
            for (final EntityPlayer p : pl) {
                final String n = p.func_70005_c_();
                if (!n.equals(this.ign) && !n.equals(ds.nk) && !this.q.contains(n) && p.func_145748_c_().func_150260_c().contains("§k")) {
                    this.ef(n);
                    break;
                }
            }
        }
    }
    
    @SubscribeEvent
    public void o(final ClientChatReceivedEvent c) {
        if (!ay.e() || !this.id()) {
            return;
        }
        final String s = ay.str(c.message.func_150260_c());
        if (s.contains(" ")) {
            final String[] sp = s.split(" ");
            if (sp.length == 4 && sp[1].equals(str.c36) && sp[2].equals(str.c14) && sp[3].equals(str.c15)) {
                final String n = sp[0];
                if (!n.equals(this.ign) && !n.equals(ds.nk) && this.en.isEmpty()) {
                    this.q.remove(n);
                    this.ef(n);
                }
            }
            else if (sp.length == 3 && sp[1].equals(str.c36) && sp[2].equals(str.c39)) {
                final String n = sp[0];
                if (this.en.equals(n)) {
                    this.en = "";
                }
                this.q.add(n);
            }
        }
    }
    
    @SubscribeEvent
    public void w(final EntityJoinWorldEvent j) {
        if (j.entity == ds.mc.field_71439_g) {
            this.en = "";
            this.q.clear();
        }
    }
    
    private void ef(final String n) {
        this.en = n;
        if (ds.a.isToggled()) {
            ay.sm(str.co4 + str.c62 + " " + str.c63 + ": " + str.co3 + n);
        }
        if (nh.k.isEmpty()) {
            ay.sm(str.co2 + str.c21 + " " + str.c22 + "!");
            return;
        }
        final ah.DM dm = ah.DM.values()[(int)(ds.m.getInput() - 1.0)];
        final ah.DM dm2;
        final int[] s;
        double wlr;
        w.gE().execute(() -> {
            s = ah.gds(n, dm2);
            if (s != null) {
                if (s[0] == -1) {
                    ay.sm(str.co3 + n + " " + str.co4 + str.c37);
                }
                else {
                    wlr = ((s[1] != 0) ? ay.rnd(s[0] / (double)s[1], 2) : s[0]);
                    ay.sm(str.bar);
                    if (dm2 != ah.DM.OVERALL) {
                        ay.sm(str.co4 + ay.md + str.co3 + dm2.name());
                    }
                    ay.sm(str.co4 + str.c62 + ": " + str.co3 + n);
                    ay.sm(str.co4 + str.c26 + " " + str.co3 + s[0]);
                    ay.sm(str.co4 + str.c27 + " " + str.co3 + s[1]);
                    ay.sm(str.co4 + str.c28 + " " + str.co3 + wlr);
                    ay.sm(str.co4 + str.c38 + " " + str.co3 + s[2]);
                    if (ds.b.isToggled()) {
                        ay.sm(str.co4 + str.c57 + ": " + str.co3 + gtl(s[0], s[1], wlr, s[2]));
                    }
                    ay.sm(str.bar);
                }
            }
            else {
                ay.sm(str.co2 + str.c24);
            }
        });
    }
    
    private boolean id() {
        if (ay.isHyp()) {
            int l = 0;
            for (final String s : ay.gsl()) {
                if (s.contains(str.c33)) {
                    ++l;
                }
                else {
                    if (!s.contains(str.c34) || !s.contains(str.c35)) {
                        continue;
                    }
                    ++l;
                }
            }
            return l == 2;
        }
        return false;
    }
    
    public static String gtl(final int w, final int l, final double wlr, final int ws) {
        int t = 0;
        final int m = w + l;
        if (m <= 13) {
            t += 2;
        }
        if (ws >= 30) {
            t += 9;
        }
        else if (ws >= 15) {
            t += 7;
        }
        else if (ws >= 8) {
            t += 5;
        }
        else if (ws >= 4) {
            t += 3;
        }
        else if (ws >= 1) {
            ++t;
        }
        if (wlr >= 20.0) {
            t += 8;
        }
        else if (wlr >= 10.0) {
            t += 5;
        }
        else if (wlr >= 5.0) {
            t += 4;
        }
        else if (wlr >= 3.0) {
            t += 2;
        }
        else if (wlr >= 0.8) {
            ++t;
        }
        if (w >= 20000) {
            t += 4;
        }
        else if (w >= 10000) {
            t += 3;
        }
        else if (w >= 5000) {
            t += 2;
        }
        else if (w >= 1000) {
            ++t;
        }
        if (l == 0) {
            if (w == 0) {
                t += 3;
            }
            else {
                t += 4;
            }
        }
        else if (l <= 10 && wlr >= 4.0) {
            t += 2;
        }
        String thr;
        if (t == 0) {
            thr = ds.thr_lvl[4];
        }
        else if (t <= 3) {
            thr = ds.thr_lvl[3];
        }
        else if (t <= 6) {
            thr = ds.thr_lvl[2];
        }
        else if (t <= 10) {
            thr = ds.thr_lvl[1];
        }
        else {
            thr = ds.thr_lvl[0];
        }
        return thr;
    }
    
    static {
        ds.nk = "";
        thr_lvl = new String[] { "&4" + str.c58 + " " + str.c59, "&c" + str.c59, "&6" + str.c60, "&a" + str.c61, "&2" + str.c58 + " " + str.c61 };
    }
}
