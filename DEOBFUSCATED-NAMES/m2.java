// 
// Decompiled by Procyon v0.5.36
// 

package DEOBFUSCATED-NAMES;

import java.util.Collections;
import java.util.function.Function;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ArrayList;
import keystrokesmod.bb$category;
import keystrokesmod.ca;
import keystrokesmod.sf;
import keystrokesmod.bi;
import keystrokesmod.xr;
import keystrokesmod.aq;
import keystrokesmod.bf;
import keystrokesmod.ao;
import keystrokesmod.bb;
import java.util.List;

public class m2
{
    static List<bb> modsList;
    static List<bb> enModsList;
    public static bb nhm;
    public static bb aa;
    public static bb as;
    public static bb an;
    public static bb ns;
    public static bb a;
    public static bb hb;
    public static bb a8;
    public static bb aq;
    public static bb t;
    public static bb ao;
    public static bb nf;
    public static bb ec;
    public static bb pe;
    public static bb sw;
    public static bb kp;
    
    public void r3g1st3r() {
        this.r(m2.a = new a());
        this.r(new al());
        this.r(new dl());
        this.r(new cs());
        this.r(new ld());
        this.r(m2.hb = new hb());
        this.r(m2.a8 = new a8());
        this.r(new ra());
        this.r(new af());
        this.r(new bh());
        this.r(new bo());
        this.r(m2.ao = new ao());
        this.r(new az());
        this.r(m2.kp = new kp());
        this.r(m2.ns = new ns());
        this.r(new ak());
        this.r(new sr());
        this.r(new sm());
        this.r(m2.t = new t());
        this.r(new vc());
        this.r(new ar());
        this.r(new ae());
        this.r(new bf());
        this.r(new ff());
        this.r(m2.aa = new aa());
        this.r(new fc());
        this.r(m2.nf = new nf());
        this.r(m2.sw = new sw());
        this.r(m2.an = new an());
        this.r(m2.as = new as());
        this.r(new ch());
        this.r(new ce());
        this.r(new nm());
        this.r(m2.pe = new pe());
        this.r(new tr());
        this.r(m2.aq = new aq());
        this.r(new xr());
        this.r(new bi());
        this.r(new ds());
        this.r(new mm());
        this.r(new sf());
        this.r(new ca.cw());
        this.r(new ca.ct());
        this.r((bb)new ca());
        this.r(new ca.sp());
        this.r(new fs());
        this.r(m2.nhm = new nhm());
        this.r(m2.ec = new ec());
        this.r(new wb());
        this.r(new aj());
        this.r(new cd());
        this.r(new au());
        this.r(new ax());
        this.defEn();
    }
    
    private void defEn() {
        m2.an.enable();
    }
    
    private void r(final bb m) {
        m2.modsList.add(m);
    }
    
    public List<bb> listofmods() {
        return m2.modsList;
    }
    
    public List<bb> inCateg(final bb$category categ) {
        final List<bb> categML = new ArrayList<bb>();
        for (final bb mod : this.listofmods()) {
            if (mod.moduleCategory().equals(categ)) {
                categML.add(mod);
            }
        }
        return categML;
    }
    
    public static void sort() {
        if (keystrokesmod.aq.al.isToggled()) {
            Collections.sort(m2.enModsList, Comparator.comparing((Function<? super bb, ? extends Comparable>)bb::g3tN4m3));
        }
        else {
            Collections.sort(m2.enModsList, (o1, o2) -> ay.mc.field_71466_p.func_78256_a(o2.g3tN4m3()) - ay.mc.field_71466_p.func_78256_a(o1.g3tN4m3()));
        }
    }
    
    static {
        m2.modsList = new ArrayList<bb>();
        m2.enModsList = new ArrayList<bb>();
    }
}
