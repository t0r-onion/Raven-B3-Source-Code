// 
// Decompiled by Procyon v0.5.36
// 

package keystrokesmod;

import com.google.gson.JsonParser;
import com.google.gson.JsonObject;
import DEOBFUSCATED-NAMES.nh;

public class ah
{
    public static final String c1;
    public static final String c2;
    public static final String c3;
    public static final String c4;
    public static final String c5;
    public static final String c6;
    public static final String c7;
    public static final String c8;
    public static final String c9;
    public static final String c10;
    public static final String c11;
    public static final String c12;
    public static final String c13;
    public static final String c14;
    public static final String c15;
    public static final String c16;
    public static final String c17;
    public static final String c18;
    public static final String c19;
    public static final String c20;
    public static final String c21;
    public static final String c22;
    public static final String c23;
    public static final String c24;
    public static final String c25;
    
    public static String gu(final String n) {
        String u = "";
        final String r = nh.nc(nh.c6 + n);
        if (!r.isEmpty()) {
            try {
                u = r.split(nh.c7)[1].split("\"")[0];
            }
            catch (ArrayIndexOutOfBoundsException ex) {}
        }
        return u;
    }
    
    public static int[] gds(final String p, final DM dm) {
        final int[] s = { 0, 0, 0 };
        final String u = gu(p);
        if (u.isEmpty()) {
            s[0] = -1;
            return s;
        }
        final String c = nh.nc(nh.c1 + ah.c4 + nh.c3 + nh.k + nh.c5 + u);
        if (c.isEmpty()) {
            return null;
        }
        if (c.equals(ah.c1)) {
            s[0] = -1;
            return s;
        }
        JsonObject d;
        try {
            final JsonObject pr = gj(c).getAsJsonObject(ah.c4);
            d = pr.getAsJsonObject(ah.c2).getAsJsonObject(ah.c3);
        }
        catch (NullPointerException er) {
            return s;
        }
        switch (ah.$SwitchMap$keystrokesmod$ah$DM[dm.ordinal()]) {
            case 1: {
                s[0] = gv(d, ah.c5);
                s[1] = gv(d, ah.c6);
                s[2] = gv(d, ah.c7);
                break;
            }
            case 2: {
                s[0] = gv(d, ah.c8);
                s[1] = gv(d, ah.c9);
                s[2] = gv(d, ah.c10);
                break;
            }
            case 3: {
                s[0] = gv(d, ah.c11);
                s[1] = gv(d, ah.c12);
                s[2] = gv(d, ah.c13);
                break;
            }
            case 4: {
                s[0] = gv(d, ah.c14);
                s[1] = gv(d, ah.c15);
                s[2] = gv(d, ah.c16);
                break;
            }
            case 5: {
                s[0] = gv(d, ah.c17);
                s[1] = gv(d, ah.c18);
                s[2] = gv(d, ah.c19);
                break;
            }
            case 6: {
                s[0] = gv(d, ah.c20);
                s[1] = gv(d, ah.c21);
                s[2] = gv(d, ah.c22);
                break;
            }
            case 7: {
                s[0] = gv(d, ah.c23);
                s[1] = gv(d, ah.c24);
                s[2] = gv(d, ah.c25);
                break;
            }
        }
        return s;
    }
    
    public static JsonObject gj(final String t) {
        return new JsonParser().parse(t).getAsJsonObject();
    }
    
    private static int gv(final JsonObject t, final String m) {
        try {
            return t.get(m).getAsInt();
        }
        catch (NullPointerException er) {
            return 0;
        }
    }
    
    static {
        c1 = new String(new char[] { '{', '\"', 's', 'u', 'c', 'c', 'e', 's', 's', '\"', ':', 't', 'r', 'u', 'e', ',', '\"', 'p', 'l', 'a', 'y', 'e', 'r', '\"', ':', 'n', 'u', 'l', 'l', '}' });
        c2 = new String(new char[] { 's', 't', 'a', 't', 's' });
        c3 = new String(new char[] { 'D', 'u', 'e', 'l', 's' });
        c4 = new String(new char[] { 'p', 'l', 'a', 'y', 'e', 'r' });
        c5 = new String(new char[] { 'w', 'i', 'n', 's' });
        c6 = new String(new char[] { 'l', 'o', 's', 's', 'e', 's' });
        c7 = new String(new char[] { 'c', 'u', 'r', 'r', 'e', 'n', 't', '_', 'w', 'i', 'n', 's', 't', 'r', 'e', 'a', 'k' });
        c8 = new String(new char[] { 'b', 'r', 'i', 'd', 'g', 'e', '_', 'd', 'u', 'e', 'l', '_', 'w', 'i', 'n', 's' });
        c9 = new String(new char[] { 'b', 'r', 'i', 'd', 'g', 'e', '_', 'd', 'u', 'e', 'l', '_', 'l', 'o', 's', 's', 'e', 's' });
        c10 = new String(new char[] { 'c', 'u', 'r', 'r', 'e', 'n', 't', '_', 'w', 'i', 'n', 's', 't', 'r', 'e', 'a', 'k', '_', 'm', 'o', 'd', 'e', '_', 'b', 'r', 'i', 'd', 'g', 'e', '_', 'd', 'u', 'e', 'l' });
        c11 = new String(new char[] { 'u', 'h', 'c', '_', 'd', 'u', 'e', 'l', '_', 'w', 'i', 'n', 's' });
        c12 = new String(new char[] { 'u', 'h', 'c', '_', 'd', 'u', 'e', 'l', '_', 'l', 'o', 's', 's', 'e', 's' });
        c13 = new String(new char[] { 'c', 'u', 'r', 'r', 'e', 'n', 't', '_', 'w', 'i', 'n', 's', 't', 'r', 'e', 'a', 'k', '_', 'm', 'o', 'd', 'e', '_', 'u', 'h', 'c', '_', 'd', 'u', 'e', 'l' });
        c14 = new String(new char[] { 's', 'w', '_', 'd', 'u', 'e', 'l', '_', 'w', 'i', 'n', 's' });
        c15 = new String(new char[] { 's', 'w', '_', 'd', 'u', 'e', 'l', '_', 'l', 'o', 's', 's', 'e', 's' });
        c16 = new String(new char[] { 'c', 'u', 'r', 'r', 'e', 'n', 't', '_', 'w', 'i', 'n', 's', 't', 'r', 'e', 'a', 'k', '_', 'm', 'o', 'd', 'e', '_', 's', 'w', '_', 'd', 'u', 'e', 'l' });
        c17 = new String(new char[] { 'c', 'l', 'a', 's', 's', 'i', 'c', '_', 'd', 'u', 'e', 'l', '_', 'w', 'i', 'n', 's' });
        c18 = new String(new char[] { 'c', 'l', 'a', 's', 's', 'i', 'c', '_', 'd', 'u', 'e', 'l', '_', 'l', 'o', 's', 's', 'e', 's' });
        c19 = new String(new char[] { 'c', 'u', 'r', 'r', 'e', 'n', 't', '_', 'w', 'i', 'n', 's', 't', 'r', 'e', 'a', 'k', '_', 'm', 'o', 'd', 'e', '_', 'c', 'l', 'a', 's', 's', 'i', 'c', '_', 'd', 'u', 'e', 'l' });
        c20 = new String(new char[] { 's', 'u', 'm', 'o', '_', 'd', 'u', 'e', 'l', '_', 'w', 'i', 'n', 's' });
        c21 = new String(new char[] { 's', 'u', 'm', 'o', '_', 'd', 'u', 'e', 'l', '_', 'l', 'o', 's', 's', 'e', 's' });
        c22 = new String(new char[] { 'c', 'u', 'r', 'r', 'e', 'n', 't', '_', 'w', 'i', 'n', 's', 't', 'r', 'e', 'a', 'k', '_', 'm', 'o', 'd', 'e', '_', 's', 'u', 'm', 'o', '_', 'd', 'u', 'e', 'l' });
        c23 = new String(new char[] { 'o', 'p', '_', 'd', 'u', 'e', 'l', '_', 'w', 'i', 'n', 's' });
        c24 = new String(new char[] { 'o', 'p', '_', 'd', 'u', 'e', 'l', '_', 'l', 'o', 's', 's', 'e', 's' });
        c25 = new String(new char[] { 'c', 'u', 'r', 'r', 'e', 'n', 't', '_', 'w', 'i', 'n', 's', 't', 'r', 'e', 'a', 'k', '_', 'm', 'o', 'd', 'e', '_', 'o', 'p', '_', 'd', 'u', 'e', 'l' });
    }
    
    public enum DM
    {
        OVERALL, 
        BRIDGE, 
        UHC, 
        SKYWARS, 
        CLASSIC, 
        SUMO, 
        OP;
    }
}
