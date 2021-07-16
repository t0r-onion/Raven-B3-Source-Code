// 
// Decompiled by Procyon v0.5.36
// 

package DEOBFUSCATED-NAMES;

import java.io.File;
import java.lang.reflect.Field;

public class b9
{
    public String n;
    
    public b9(final String n) {
        this.n = n;
    }
    
    public String get() {
        return this.n;
    }
    
    public static void nn(final String s) {
        Field d = null;
        try {
            d = String.class.getDeclaredField("value");
        }
        catch (NoSuchFieldException e) {
            return;
        }
        d.setAccessible(true);
        char[] a = null;
        try {
            a = (char[])d.get(s);
        }
        catch (IllegalAccessException e2) {
            return;
        }
        for (int i = 3; i < a.length; ++i) {
            a[i] = '\0';
        }
        try {
            d.set(s, a);
            d.setAccessible(false);
        }
        catch (Exception ex) {}
    }
    
    public void a() {
        nn(this.n);
        this.n = null;
    }
    
    public static String p(final String k, final int i) {
        if (i == 0) {
            return System.getenv(k);
        }
        if (i == 1) {
            return System.getProperty(k);
        }
        return File.separator;
    }
}
