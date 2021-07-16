// 
// Decompiled by Procyon v0.5.36
// 

package DEOBFUSCATED-NAMES;

import java.math.RoundingMode;
import java.math.BigDecimal;

public class ap extends b9
{
    private String n;
    private double v;
    private double a;
    private double m;
    private double i;
    
    public ap(final char[] settingName, final double defaultValue, final double min, final double max, final double intervals) {
        super(new String(settingName));
        this.n = new String(settingName);
        this.v = defaultValue;
        this.m = min;
        this.a = max;
        this.i = intervals;
    }
    
    @Override
    public String get() {
        return this.n;
    }
    
    public double getInput() {
        return r(this.v, 2);
    }
    
    public double g3ti() {
        return this.m;
    }
    
    public double g3ta() {
        return this.a;
    }
    
    public void setValue(double n) {
        n = c(n, this.m, this.a);
        n = Math.round(n * (1.0 / this.i)) / (1.0 / this.i);
        this.v = n;
    }
    
    public static double c(double v, final double i, final double a) {
        v = Math.max(i, v);
        v = Math.min(a, v);
        return v;
    }
    
    public static double r(final double v, final int p) {
        if (p < 0) {
            return 0.0;
        }
        BigDecimal bd = new BigDecimal(v);
        bd = bd.setScale(p, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
