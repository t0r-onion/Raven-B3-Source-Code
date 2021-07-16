// 
// Decompiled by Procyon v0.5.36
// 

package DEOBFUSCATED-NAMES;

import java.util.ArrayList;
import java.util.Arrays;
import java.awt.Color;
import org.lwjgl.opengl.GL11;
import net.minecraft.client.gui.FontRenderer;
import keystrokesmod.ah;
import java.util.List;
import net.minecraft.client.Minecraft;

public class gc
{
    private static final Minecraft mc;
    private static boolean f;
    private static boolean u;
    private static final List<Integer> cs;
    private static int ccs;
    private static int lccs;
    public static List<String> rs;
    private static final String invSyn;
    private static final String invCom;
    private static final String c1;
    
    public static void rCMD(final String c) {
        if (c.isEmpty()) {
            return;
        }
        final String cm = c.toLowerCase();
        final boolean hasArgs = c.contains(" ");
        final String[] args = (String[])(hasArgs ? c.split(" ") : null);
        if (cm.startsWith(str.c13.toLowerCase())) {
            if (!hasArgs) {
                am(gc.invSyn, 1);
                return;
            }
            if (args.length != 2) {
                am(gc.invSyn, 1);
                return;
            }
            am(str.c17 + str.c18, 1);
            final String k = args[1];
            final String s2;
            w.gE().execute(() -> {
                if (nh.vk(s2)) {
                    nh.k = s2;
                    am(str.co1 + str.c16 + "!", 0);
                    cn.sc2();
                }
                else {
                    am(str.co2 + str.c12 + " " + str.c11 + ".", 0);
                }
            });
        }
        else if (cm.startsWith(str.c47)) {
            if (!hasArgs) {
                am(gc.invSyn, 1);
                return;
            }
            if (args.length != 2) {
                am(gc.invSyn, 1);
                return;
            }
            ds.nk = args[1];
            am(str.co1 + str.c48, 1);
            am("\"" + ds.nk + "\"", 0);
        }
        else if (cm.startsWith("c" + str.c49)) {
            if (!hasArgs) {
                am(gc.invSyn, 1);
                return;
            }
            if (args.length != 2) {
                am(gc.invSyn, 1);
                return;
            }
            nhm.n = args[1];
            am(str.co1 + ay.uf(str.c49) + str.c48.substring(4), 1);
            am("\"" + nhm.n + "\"", 0);
        }
        else if (cm.startsWith(fs.c1)) {
            if (!hasArgs) {
                am(gc.invSyn, 1);
                return;
            }
            final String msg = c.replaceFirst(fs.c1, "").substring(1);
            if (msg.isEmpty() || msg.equals("\\n")) {
                am(fs.c4, 1);
                return;
            }
            fs.msg = msg;
            am(str.co1 + fs.c3, 1);
        }
        else if (cm.startsWith(ah.c3.toLowerCase())) {
            if (!hasArgs) {
                am(gc.invSyn, 1);
                return;
            }
            if (args.length != 2) {
                am(gc.invSyn, 1);
                return;
            }
            if (nh.k.isEmpty()) {
                am(str.co2 + str.c21 + " " + str.c22 + "!", 1);
                am(str.c23, 0);
                return;
            }
            final String n = args[1];
            am(str.c31, 1);
            final String s3;
            final int[] s;
            String string;
            final StringBuilder sb;
            double wlr;
            w.gE().execute(() -> {
                s = ah.gds(s3, ah.DM.OVERALL);
                if (s != null) {
                    if (s[0] == -1) {
                        new StringBuilder().append(str.co2);
                        if (s3.length() > 16) {
                            string = s3.substring(0, 16) + "...";
                        }
                        else {
                            string = s3;
                        }
                        am(sb.append(string).append(" ").append(str.c25).toString(), 0);
                    }
                    else {
                        wlr = ((s[1] != 0) ? ay.rnd(s[0] / (double)s[1], 2) : s[0]);
                        am(str.co4 + s3 + " " + ah.c2 + ":", 1);
                        am(str.c26 + " " + s[0], 0);
                        am(str.c27 + " " + s[1], 0);
                        am(str.c28 + " " + wlr, 0);
                        am(str.c29 + " " + s[2], 0);
                        am(str.c57 + ": " + ds.gtl(s[0], s[1], wlr, s[2]).substring(2), 0);
                    }
                }
                else {
                    am(str.co2 + str.c24, 0);
                }
            });
        }
        else if (cm.startsWith(str.c51)) {
            gp.gp();
        }
        else if (cm.startsWith(str.c30)) {
            gc.rs.clear();
        }
        else if (cm.startsWith(str.c64.toLowerCase())) {
            w.dbg = !w.dbg;
            am(str.c64 + " " + (w.dbg ? str.c65 : str.c66) + ".", 1);
        }
        else if (cm.startsWith(str.c42) || cm.startsWith("?")) {
            am(str.co4 + str.c43, 1);
            am("1 " + str.c45, 0);
            am("2 " + str.c44, 0);
            am("3 " + str.c47 + " [" + str.c49 + "]", 0);
            am("4 " + str.c51, 0);
            am(str.co4 + gc.c1, 0);
            am("1 c" + str.c49 + " [" + str.c49 + "]", 0);
            am("2 " + fs.c1 + " [" + fs.c2 + "]", 0);
        }
        else if (cm.startsWith(str.f5)) {
            am(str.co4 + str.f6, 1);
            am(str.f7, 0);
            am(str.f8, 0);
            am(str.f9, 0);
            am(str.f10, 0);
        }
        else if (cm.equals(str.f1)) {
            if (gc.u) {
                return;
            }
            int i;
            w.gE().execute(() -> {
                gc.u = true;
                for (i = 0; i < 4; ++i) {
                    if (i == 0) {
                        am(str.co4 + str.f2, 1);
                    }
                    else if (i == 1) {
                        am(str.co1 + str.f3, 0);
                    }
                    else if (i == 2) {
                        am(str.co4 + str.f2, 0);
                    }
                    else if (i == 3) {
                        am(str.co1 + str.f4, 0);
                    }
                    try {
                        Thread.sleep(500L);
                    }
                    catch (InterruptedException ex) {}
                }
                gc.u = false;
            });
        }
        else {
            am(gc.invCom + " (" + ((cm.length() > 5) ? (cm.substring(0, 5) + "...") : cm) + ")", 1);
        }
    }
    
    public static void am(final String m, final int t) {
        if (t == 1 || t == 2) {
            gc.rs.add("");
        }
        gc.rs.add(m);
        if (t == 2 || t == 3) {
            gc.rs.add("");
        }
    }
    
    public static void rc(final FontRenderer fr, final int h, final int w, final int s) {
        final int x = w - 195;
        final int y = h - 130;
        final int sY = h - 345;
        final int sH = 230;
        GL11.glEnable(3089);
        final int mw = w * s;
        GL11.glScissor(0, gc.mc.field_71440_d - (sY + sH) * s, mw - ((mw < 2) ? 0 : 2), sH * s - 2);
        ru.db(1000, 1000, gc.ccs);
        rss(fr, gc.rs, x, y);
        GL11.glDisable(3089);
    }
    
    private static void rss(final FontRenderer fr, final List<String> rs, final int x, int y) {
        if (gc.f) {
            gc.f = false;
            am(str.c40, 0);
            am(str.c41, 0);
        }
        if (rs.isEmpty()) {
            return;
        }
        for (int i = rs.size() - 1; i >= 0; --i) {
            String s = rs.get(i);
            int c = -1;
            if (s.contains(str.co1)) {
                s = s.replace(str.co1, "");
                c = Color.green.getRGB();
            }
            else if (s.contains(str.co2)) {
                s = s.replace(str.co2, "");
                c = Color.red.getRGB();
            }
            else if (s.contains(str.co4)) {
                s = s.replace(str.co4, "");
                c = Color.yellow.getRGB();
            }
            fr.func_78276_b(s, x, y, c);
            y -= fr.field_78288_b + 5;
        }
    }
    
    public static void setccs() {
        int val = ay.rand().nextInt(gc.cs.size());
        if (val == gc.lccs) {
            val += ((val == 3) ? -3 : 1);
        }
        gc.lccs = val;
        gc.ccs = gc.cs.get(val);
    }
    
    public static void od() {
        gp.rs();
    }
    
    static {
        mc = Minecraft.func_71410_x();
        gc.f = true;
        gc.u = false;
        cs = Arrays.asList(new Color(170, 107, 148, 50).getRGB(), new Color(122, 158, 134, 50).getRGB(), new Color(16, 16, 16, 50).getRGB(), new Color(64, 114, 148, 50).getRGB());
        gc.ccs = 0;
        gc.lccs = -1;
        gc.rs = new ArrayList<String>();
        invSyn = new String(new char[] { '&', 'c', 'I', 'n', 'v', 'a', 'l', 'i', 'd', ' ', 's', 'y', 'n', 't', 'a', 'x', '.' });
        invCom = new String(new char[] { '&', 'c', 'I', 'n', 'v', 'a', 'l', 'i', 'd', ' ', 'c', 'o', 'm', 'm', 'a', 'n', 'd', '.' });
        c1 = new String(new char[] { 'M', 'o', 'd', 'u', 'l', 'e', '-', 's', 'p', 'e', 'c', 'i', 'f', 'i', 'c', ':' });
    }
}
