// 
// Decompiled by Procyon v0.5.36
// 

package DEOBFUSCATED-NAMES;

import keystrokesmod.bb;

public class ec extends bb
{
    private static final String m1;
    private static final String m2;
    private static final String m3;
    private static final String m4;
    private static int m3s;
    private boolean m3t;
    public static cb a;
    public static cb b;
    public static ap c;
    public static dc d;
    
    public ec() {
        super(new char[] { 'S', 't', 'r', 'i', 'n', 'g', ' ', 'E', 'n', 'c', 'r', 'y', 'p', 't' }, bb.other, 0);
        this.m3t = false;
        this.registerSetting(ec.a = new cb(new char[] { 'I', 'g', 'n', 'o', 'r', 'e', ' ', 'd', 'e', 'b', 'u', 'g' }, false));
        this.registerSetting(ec.b = new cb(new char[] { 'I', 'g', 'n', 'o', 'r', 'e', ' ', 'a', 'l', 'l', ' ', 'G', 'U', 'I' }, false));
        this.registerSetting(ec.c = new ap(new char[] { 'V', 'a', 'l', 'u', 'e' }, 1.0, 1.0, 4.0, 1.0));
        this.registerSetting(ec.d = new dc(ay.md + ec.m1));
    }
    
    @Override
    public void onEnable() {
        if (ec.c.getInput() == 3.0) {
            ec.m3s = ay.rand().nextInt(10) - 5;
            if (ec.m3s == 0) {
                ec.m3s = 1;
            }
        }
    }
    
    @Override
    public void guiUpdate() {
        switch ((int)ec.c.getInput()) {
            case 1: {
                this.m3t = false;
                ec.d.setDesc(ay.md + ec.m1);
                break;
            }
            case 2: {
                this.m3t = false;
                ec.d.setDesc(ay.md + ec.m2);
                break;
            }
            case 3: {
                if (!this.m3t) {
                    ec.m3s = ay.rand().nextInt(10) - 5;
                    if (ec.m3s == 0) {
                        ec.m3s = 1;
                    }
                }
                this.m3t = true;
                ec.d.setDesc(ay.md + ec.m3);
                break;
            }
            case 4: {
                this.m3t = false;
                ec.d.setDesc(ay.md + ec.m4);
                break;
            }
        }
    }
    
    public static String r(final String s) {
        if (ec.mc.field_71462_r instanceof m) {
            return s;
        }
        if (ec.a.isToggled() && ec.mc.field_71474_y.field_74330_P) {
            return s;
        }
        if (ec.b.isToggled() && ec.mc.field_71462_r != null) {
            return s;
        }
        if (ec.c.getInput() == 1.0) {
            String s2 = "";
            String s3 = "";
            boolean w = false;
            for (int i = 0; i < s.length(); ++i) {
                final String c = Character.toString(s.charAt(i));
                if (c.equals("§")) {
                    w = true;
                    s3 += c;
                }
                else if (w) {
                    w = false;
                    s3 += c;
                }
                else {
                    s2 = s2 + s3 + "§" + "k" + c;
                    s3 = "";
                }
            }
            return s2;
        }
        if (ec.c.getInput() == 2.0) {
            return (s.length() > 3) ? s.substring(0, 3) : s;
        }
        if (ec.c.getInput() == 3.0) {
            String s2 = "";
            for (int j = 0; j < s.length(); ++j) {
                final char c2 = (char)(s.charAt(j) + ec.m3s);
                s2 += c2;
            }
            return s2;
        }
        return "";
    }
    
    static {
        m1 = new String(new char[] { '&', 'k' });
        m2 = new String(new char[] { '3', ' ', 'c', 'h', 'a', 'r' });
        m3 = new String(new char[] { 'C', 'h', 'a', 'r', ' ', 's', 'h', 'i', 'f', 't' });
        m4 = new String(new char[] { 'B', 'l', 'a', 'n', 'k' });
        ec.m3s = 1;
    }
}
