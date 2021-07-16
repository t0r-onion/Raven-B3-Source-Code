// 
// Decompiled by Procyon v0.5.36
// 

package DEOBFUSCATED-NAMES;

import keystrokesmod.bb;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
import net.minecraft.client.Minecraft;

public class cn
{
    private static Minecraft mc;
    
    public static void sc() {
        try {
            final File file = new File(cn.mc.field_71412_D + File.separator + "keystrokesmod", "config");
            if (!file.exists()) {
                file.getParentFile().mkdirs();
                file.createNewFile();
            }
            final FileWriter writer = new FileWriter(file, false);
            writer.write(ks.a + "\n" + ks.b + "\n" + ks.c + "\n" + ks.d + "\n" + ks.e + "\n" + ks.f);
            writer.close();
        }
        catch (Throwable e) {
            e.printStackTrace();
        }
    }
    
    public static void lc() {
        try {
            final File file = new File(cn.mc.field_71412_D + File.separator + "keystrokesmod", "config");
            if (!file.exists()) {
                return;
            }
            final BufferedReader reader = new BufferedReader(new FileReader(file));
            int i = 0;
            String line;
            while ((line = reader.readLine()) != null) {
                switch (++i) {
                    case 1: {
                        ks.a = Integer.parseInt(line);
                        continue;
                    }
                    case 2: {
                        ks.b = Integer.parseInt(line);
                        continue;
                    }
                    case 3: {
                        ks.c = Integer.parseInt(line);
                        continue;
                    }
                    case 4: {
                        ks.d = Boolean.parseBoolean(line);
                        continue;
                    }
                    case 5: {
                        ks.e = Boolean.parseBoolean(line);
                        continue;
                    }
                    case 6: {
                        ks.f = Boolean.parseBoolean(line);
                        continue;
                    }
                    default: {
                        continue;
                    }
                }
            }
            reader.close();
        }
        catch (Throwable e) {
            e.printStackTrace();
        }
    }
    
    public static void sc2() {
        try {
            final File file = new File(cn.mc.field_71412_D + File.separator + "keystrokes", "config");
            if (!file.exists()) {
                file.getParentFile().mkdirs();
                file.createNewFile();
            }
            final FileWriter writer = new FileWriter(file, false);
            writer.write(str.c32 + " " + nh.k + "\n");
            writer.write(ab.theme + "\n" + ab.r1 + "\n" + ab.r2 + "\n" + ab.r3 + "\n" + ab.r4 + "\n" + ab.r5 + "\n" + ab.r6 + "\n" + ab.r7 + "\n" + ab.v1 + "\n" + ab.v2 + "\n" + ab.v3 + "\n" + ab.v4 + "\n" + ab.au1 + "\n" + ab.au2 + "\n" + ab.au3 + "\n" + ab.au4 + "\n" + ab.au5 + "\n" + ab.au6 + "\n" + ab.au7 + "\n" + ab.au8 + "\n" + ab.au9);
            writer.close();
        }
        catch (Throwable t) {}
    }
    
    public static void lc2() {
        try {
            final File file = new File(cn.mc.field_71412_D + File.separator + "keystrokes", "config");
            if (!file.exists()) {
                return;
            }
            final BufferedReader reader = new BufferedReader(new FileReader(file));
            int i = -1;
            String line;
            while ((line = reader.readLine()) != null) {
                switch (++i) {
                    case 0: {
                        nh.k = line.split(": ")[1];
                        continue;
                    }
                    case 1: {
                        au.a.setValue(Double.parseDouble(line));
                        continue;
                    }
                    case 2: {
                        a8.a.setValue(Double.parseDouble(line));
                        continue;
                    }
                    case 3: {
                        a8.b.setValue(Double.parseDouble(line));
                        continue;
                    }
                    case 4: {
                        a8.c.setEnabled(Boolean.parseBoolean(line));
                        continue;
                    }
                    case 5: {
                        a8.d.setEnabled(Boolean.parseBoolean(line));
                        continue;
                    }
                    case 6: {
                        a8.e.setEnabled(Boolean.parseBoolean(line));
                        continue;
                    }
                    case 7: {
                        a8.f.setEnabled(Boolean.parseBoolean(line));
                        continue;
                    }
                    case 8: {
                        bb.getModule(a8.class).setbind(Integer.parseInt(line));
                        continue;
                    }
                    case 9: {
                        af.a.setValue(Double.parseDouble(line));
                        continue;
                    }
                    case 10: {
                        af.b.setValue(Double.parseDouble(line));
                        continue;
                    }
                    case 11: {
                        af.c.setValue(Double.parseDouble(line));
                        continue;
                    }
                    case 12: {
                        bb.getModule(af.class).setbind(Integer.parseInt(line));
                        continue;
                    }
                    case 13: {
                        a.a.setValue(Double.parseDouble(line));
                        continue;
                    }
                    case 14: {
                        a.b.setValue(Double.parseDouble(line));
                        continue;
                    }
                    case 15: {
                        a.c.setValue(Double.parseDouble(line));
                        continue;
                    }
                    case 16: {
                        a.d.setEnabled(Boolean.parseBoolean(line));
                        continue;
                    }
                    case 17: {
                        a.e.setEnabled(Boolean.parseBoolean(line));
                        continue;
                    }
                    case 18: {
                        a.inv.setEnabled(Boolean.parseBoolean(line));
                        continue;
                    }
                    case 19: {
                        a.p.setEnabled(Boolean.parseBoolean(line));
                        continue;
                    }
                    case 20: {
                        a.q.setEnabled(Boolean.parseBoolean(line));
                        continue;
                    }
                    case 21: {
                        bb.getModule(a.class).setbind(Integer.parseInt(line));
                        continue;
                    }
                    default: {
                        continue;
                    }
                }
            }
            reader.close();
            w.gE().execute(() -> {
                if (!nh.vk(nh.k)) {
                    nh.k = "";
                }
            });
        }
        catch (Throwable e) {
            sc2();
        }
    }
    
    static {
        cn.mc = Minecraft.func_71410_x();
    }
}
