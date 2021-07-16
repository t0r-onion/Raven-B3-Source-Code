// 
// Decompiled by Procyon v0.5.36
// 

package DEOBFUSCATED-NAMES;

import keystrokesmod.bb;

public class nhm extends bb
{
    public static dc a;
    public static String n;
    
    public nhm() {
        super(new char[] { 'N', 'a', 'm', 'e', ' ', 'H', 'i', 'd', 'e', 'r' }, bb.other, 0);
        this.registerSetting(nhm.a = new dc(ay.uf(str.c67) + ": c" + str.c49 + " [" + str.c49 + "]"));
    }
    
    public static String r(String s) {
        if (nhm.mc.field_71439_g != null) {
            s = (ds.nk.isEmpty() ? s.replace(nhm.mc.field_71439_g.func_70005_c_(), nhm.n) : s.replace(ds.nk, nhm.n));
        }
        return s;
    }
    
    static {
        nhm.n = new String(new char[] { 'r', 'a', 'v', 'e', 'n' });
    }
}
