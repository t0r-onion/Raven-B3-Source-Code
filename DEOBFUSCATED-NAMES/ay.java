// 
// Decompiled by Procyon v0.5.36
// 

package DEOBFUSCATED-NAMES;

import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemSword;
import net.minecraft.util.BlockPos;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.potion.Potion;
import java.util.Iterator;
import java.util.Collection;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.scoreboard.Team;
import net.minecraft.scoreboard.ScorePlayerTeam;
import com.google.common.collect.Lists;
import com.google.common.collect.Iterables;
import net.minecraft.scoreboard.Score;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.util.StringUtils;
import java.awt.Color;
import net.minecraft.util.MathHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C03PacketPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.util.Timer;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ChatComponentText;
import java.nio.ByteBuffer;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.common.MinecraftForge;
import org.lwjgl.input.Mouse;
import net.minecraftforge.client.event.MouseEvent;
import java.lang.reflect.Field;
import net.minecraft.client.Minecraft;
import java.util.Random;

public class ay
{
    private static final Random rand;
    public static final Minecraft mc;
    public static final String s = "§";
    public static final String pr;
    public static final String md;
    public static final String hp;
    private static Field t;
    private static Field g;
    private static Field f;
    private static Field h;
    
    public static void su() {
        try {
            ay.t = Minecraft.class.getDeclaredField(new String(new char[] { 'f', 'i', 'e', 'l', 'd', '_', '7', '1', '4', '2', '8', '_', 'T' }));
        }
        catch (Exception er) {
            try {
                ay.t = Minecraft.class.getDeclaredField(new String(new char[] { 't', 'i', 'm', 'e', 'r' }));
            }
            catch (Exception ex) {}
        }
        if (ay.t != null) {
            ay.t.setAccessible(true);
        }
        try {
            ay.g = MouseEvent.class.getDeclaredField(new String(new char[] { 'b', 'u', 't', 't', 'o', 'n' }));
            ay.f = MouseEvent.class.getDeclaredField(new String(new char[] { 'b', 'u', 't', 't', 'o', 'n', 's', 't', 'a', 't', 'e' }));
            ay.h = Mouse.class.getDeclaredField(new String(new char[] { 'b', 'u', 't', 't', 'o', 'n', 's' }));
        }
        catch (Exception ex2) {}
    }
    
    public static void sc(final int t, final boolean s) {
        if (ay.g == null || ay.f == null || ay.h == null) {
            return;
        }
        final MouseEvent m = new MouseEvent();
        try {
            ay.g.setAccessible(true);
            ay.g.set(m, t);
            ay.f.setAccessible(true);
            ay.f.set(m, s);
            MinecraftForge.EVENT_BUS.post((Event)m);
            ay.h.setAccessible(true);
            final ByteBuffer bf = (ByteBuffer)ay.h.get(null);
            ay.h.setAccessible(false);
            bf.put(t, (byte)(s ? 1 : 0));
        }
        catch (IllegalAccessException ex) {}
    }
    
    public static void sm(final String txt) {
        if (!e()) {
            return;
        }
        final String m = r(ay.pr + " " + txt);
        ay.mc.field_71439_g.func_145747_a((IChatComponent)new ChatComponentText(m));
    }
    
    public static String r(final String txt) {
        return txt.replaceAll("&", "§");
    }
    
    public static void b(final ap c, final ap d) {
        if (c.getInput() > d.getInput()) {
            final double p = c.getInput();
            c.setValue(d.getInput());
            d.setValue(p);
        }
    }
    
    public static double mmVal(final ap a, final ap b, final Random r) {
        return (a.getInput() == b.getInput()) ? a.getInput() : (a.getInput() + r.nextDouble() * (b.getInput() - a.getInput()));
    }
    
    public static boolean e() {
        return ay.mc.field_71439_g != null && ay.mc.field_71441_e != null;
    }
    
    public static boolean isHyp() {
        return !ay.mc.func_71356_B() && ay.mc.func_147104_D().field_78845_b.toLowerCase().contains(ay.hp);
    }
    
    public static int f() {
        return ay.mc.func_147114_u().func_175102_a(ay.mc.field_71439_g.func_110124_au()).func_178853_c();
    }
    
    public static Timer gt() {
        try {
            return (Timer)ay.t.get(ay.mc);
        }
        catch (IllegalAccessException | IndexOutOfBoundsException ex2) {
            final Exception ex;
            final Exception er = ex;
            return null;
        }
    }
    
    public static void rt() {
        try {
            gt().field_74278_d = 1.0f;
        }
        catch (NullPointerException ex) {}
    }
    
    public static Random rand() {
        return ay.rand;
    }
    
    public static boolean im() {
        return ay.mc.field_71439_g.field_70701_bs != 0.0f || ay.mc.field_71439_g.field_70702_br != 0.0f;
    }
    
    public static void aim(final Entity en, final float ps, final boolean pc) {
        if (en == null) {
            return;
        }
        final float[] t = gr(en);
        if (t != null) {
            final float y = t[0];
            final float p = t[1] + 4.0f + ps;
            if (pc) {
                ay.mc.func_147114_u().func_147297_a((Packet)new C03PacketPlayer.C05PacketPlayerLook(y, p, ay.mc.field_71439_g.field_70122_E));
            }
            else {
                ay.mc.field_71439_g.field_70177_z = y;
                ay.mc.field_71439_g.field_70125_A = p;
            }
        }
    }
    
    public static float[] gr(final Entity q) {
        if (q == null) {
            return null;
        }
        final double diffX = q.field_70165_t - ay.mc.field_71439_g.field_70165_t;
        double diffY;
        if (q instanceof EntityLivingBase) {
            final EntityLivingBase en = (EntityLivingBase)q;
            diffY = en.field_70163_u + en.func_70047_e() * 0.9 - (ay.mc.field_71439_g.field_70163_u + ay.mc.field_71439_g.func_70047_e());
        }
        else {
            diffY = (q.func_174813_aQ().field_72338_b + q.func_174813_aQ().field_72337_e) / 2.0 - (ay.mc.field_71439_g.field_70163_u + ay.mc.field_71439_g.func_70047_e());
        }
        final double diffZ = q.field_70161_v - ay.mc.field_71439_g.field_70161_v;
        final double dist = MathHelper.func_76133_a(diffX * diffX + diffZ * diffZ);
        final float yaw = (float)(Math.atan2(diffZ, diffX) * 180.0 / 3.141592653589793) - 90.0f;
        final float pitch = (float)(-(Math.atan2(diffY, dist) * 180.0 / 3.141592653589793));
        return new float[] { ay.mc.field_71439_g.field_70177_z + MathHelper.func_76142_g(yaw - ay.mc.field_71439_g.field_70177_z), ay.mc.field_71439_g.field_70125_A + MathHelper.func_76142_g(pitch - ay.mc.field_71439_g.field_70125_A) };
    }
    
    public static double n(final Entity en) {
        return ((ay.mc.field_71439_g.field_70177_z - m(en)) % 360.0 + 540.0) % 360.0 - 180.0;
    }
    
    public static float m(final Entity ent) {
        final double x = ent.field_70165_t - ay.mc.field_71439_g.field_70165_t;
        final double z = ent.field_70161_v - ay.mc.field_71439_g.field_70161_v;
        final double yaw = Math.atan2(x, z) * 57.2957795;
        return (float)(yaw * -1.0);
    }
    
    public static boolean fov(final Entity entity, float fov) {
        fov *= 0.5;
        final double v = ((ay.mc.field_71439_g.field_70177_z - m(entity)) % 360.0 + 540.0) % 360.0 - 180.0;
        return (v > 0.0 && v < fov) || (-fov < v && v < 0.0);
    }
    
    public static void ss(final double s, final boolean m) {
        if (m && !im()) {
            return;
        }
        ay.mc.field_71439_g.field_70159_w = -Math.sin(gd()) * s;
        ay.mc.field_71439_g.field_70179_y = Math.cos(gd()) * s;
    }
    
    public static void ss2(final double s) {
        double forward = ay.mc.field_71439_g.field_71158_b.field_78900_b;
        double strafe = ay.mc.field_71439_g.field_71158_b.field_78902_a;
        float yaw = ay.mc.field_71439_g.field_70177_z;
        if (forward == 0.0 && strafe == 0.0) {
            ay.mc.field_71439_g.field_70159_w = 0.0;
            ay.mc.field_71439_g.field_70179_y = 0.0;
        }
        else {
            if (forward != 0.0) {
                if (strafe > 0.0) {
                    yaw += ((forward > 0.0) ? -45 : 45);
                }
                else if (strafe < 0.0) {
                    yaw += ((forward > 0.0) ? 45 : -45);
                }
                strafe = 0.0;
                if (forward > 0.0) {
                    forward = 1.0;
                }
                else if (forward < 0.0) {
                    forward = -1.0;
                }
            }
            final double rad = Math.toRadians(yaw + 90.0f);
            final double sin = Math.sin(rad);
            final double cos = Math.cos(rad);
            ay.mc.field_71439_g.field_70159_w = forward * s * cos + strafe * s * sin;
            ay.mc.field_71439_g.field_70179_y = forward * s * sin - strafe * s * cos;
        }
    }
    
    public static float gd() {
        float yw = ay.mc.field_71439_g.field_70177_z;
        if (ay.mc.field_71439_g.field_70701_bs < 0.0f) {
            yw += 180.0f;
        }
        float f;
        if (ay.mc.field_71439_g.field_70701_bs < 0.0f) {
            f = -0.5f;
        }
        else if (ay.mc.field_71439_g.field_70701_bs > 0.0f) {
            f = 0.5f;
        }
        else {
            f = 1.0f;
        }
        if (ay.mc.field_71439_g.field_70702_br > 0.0f) {
            yw -= 90.0f * f;
        }
        if (ay.mc.field_71439_g.field_70702_br < 0.0f) {
            yw += 90.0f * f;
        }
        yw *= 0.017453292f;
        return yw;
    }
    
    public static double gs() {
        return Math.sqrt(ay.mc.field_71439_g.field_70159_w * ay.mc.field_71439_g.field_70159_w + ay.mc.field_71439_g.field_70179_y * ay.mc.field_71439_g.field_70179_y);
    }
    
    public static double gbps(final Entity en, final int d) {
        final double x = en.field_70165_t - en.field_70169_q;
        final double z = en.field_70161_v - en.field_70166_s;
        final double sp = Math.sqrt(x * x + z * z) * 20.0;
        return rnd(sp, d);
    }
    
    public static boolean ilc() {
        if (m2.a.isEnabled()) {
            if (a.p.isToggled() && Mouse.isButtonDown(0)) {
                return true;
            }
        }
        else if (cl.f() > 1 && System.currentTimeMillis() - cl.LL < 300L) {
            return true;
        }
        return false;
    }
    
    public static int gc(final long speed, final long... delay) {
        final long time = System.currentTimeMillis() + ((delay.length > 0) ? delay[0] : 0L);
        return Color.getHSBColor(time % (15000L / speed) / (15000.0f / speed), 1.0f, 1.0f).getRGB();
    }
    
    public static double rnd(final double n, final int d) {
        if (d == 0) {
            return (double)Math.round(n);
        }
        final double p = Math.pow(10.0, d);
        return Math.round(n * p) / p;
    }
    
    public static String str(final String s) {
        final char[] n = StringUtils.func_76338_a(s).toCharArray();
        final StringBuilder v = new StringBuilder();
        for (final char c : n) {
            if (c < '\u007f' && c > '\u0014') {
                v.append(c);
            }
        }
        return v.toString();
    }
    
    public static List<String> gsl() {
        final List<String> lines = new ArrayList<String>();
        if (ay.mc.field_71441_e == null) {
            return lines;
        }
        final Scoreboard scoreboard = ay.mc.field_71441_e.func_96441_U();
        if (scoreboard == null) {
            return lines;
        }
        final ScoreObjective objective = scoreboard.func_96539_a(1);
        if (objective == null) {
            return lines;
        }
        Collection<Score> scores = (Collection<Score>)scoreboard.func_96534_i(objective);
        final List<Score> list = new ArrayList<Score>();
        for (final Score input : scores) {
            if (input != null && input.func_96653_e() != null && !input.func_96653_e().startsWith("#")) {
                list.add(input);
            }
        }
        if (list.size() > 15) {
            scores = (Collection<Score>)Lists.newArrayList(Iterables.skip((Iterable)list, scores.size() - 15));
        }
        else {
            scores = list;
        }
        for (final Score score : scores) {
            final ScorePlayerTeam team = scoreboard.func_96509_i(score.func_96653_e());
            lines.add(ScorePlayerTeam.func_96667_a((Team)team, score.func_96653_e()));
        }
        return lines;
    }
    
    public static void rsa() {
        final EntityPlayerSP p = ay.mc.field_71439_g;
        final int armSwingEnd = p.func_70644_a(Potion.field_76422_e) ? (6 - (1 + p.func_70660_b(Potion.field_76422_e).func_76458_c()) * 1) : (p.func_70644_a(Potion.field_76419_f) ? (6 + (1 + p.func_70660_b(Potion.field_76419_f).func_76458_c()) * 2) : 6);
        if (!p.field_82175_bq || p.field_110158_av >= armSwingEnd / 2 || p.field_110158_av < 0) {
            p.field_110158_av = -1;
            p.field_82175_bq = true;
        }
    }
    
    public static String uf(final String s) {
        return s.substring(0, 1).toUpperCase() + s.substring(1);
    }
    
    public static boolean eob() {
        final double x = ay.mc.field_71439_g.field_70165_t;
        final double y = ay.mc.field_71439_g.field_70163_u - 1.0;
        final double z = ay.mc.field_71439_g.field_70161_v;
        final BlockPos p = new BlockPos(MathHelper.func_76128_c(x), MathHelper.func_76128_c(y), MathHelper.func_76128_c(z));
        return ay.mc.field_71441_e.func_175623_d(p);
    }
    
    public static boolean wpn() {
        if (ay.mc.field_71439_g.func_71045_bC() == null) {
            return false;
        }
        final Item item = ay.mc.field_71439_g.func_71045_bC().func_77973_b();
        return item instanceof ItemSword || item instanceof ItemAxe;
    }
    
    static {
        rand = new Random();
        mc = Minecraft.func_71410_x();
        pr = new String(new char[] { '&', '7', '[', '&', 'd', 'R', '&', '7', ']', '&', 'r' });
        md = new String(new char[] { 'M', 'o', 'd', 'e', ':', ' ' });
        hp = new String(new char[] { 'h', 'y', 'p', 'i', 'x', 'e', 'l', '.', 'n', 'e', 't' });
        ay.t = null;
        ay.g = null;
        ay.f = null;
        ay.h = null;
    }
}
