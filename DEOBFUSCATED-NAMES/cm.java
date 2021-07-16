// 
// Decompiled by Procyon v0.5.36
// 

package DEOBFUSCATED-NAMES;

import org.lwjgl.opengl.GL11;
import net.minecraft.client.gui.Gui;
import java.awt.Color;
import net.minecraft.client.gui.FontRenderer;
import java.util.Iterator;
import keystrokesmod.bb;
import keystrokesmod.b;
import java.util.ArrayList;

public class cm
{
    public ArrayList<b> c;
    public bb categoryName;
    private boolean categoryOpened;
    private int k;
    private int y;
    private int x;
    private int bh;
    private boolean id;
    public int xx;
    public int yy;
    public boolean n4m;
    public String pvp;
    public boolean pin;
    private int chromaSpeed;
    
    public cm(final bb category) {
        this.n4m = false;
        this.pin = false;
        this.c = new ArrayList<b>();
        this.categoryName = category;
        this.k = 92;
        this.x = 5;
        this.y = 5;
        this.bh = 13;
        this.xx = 0;
        this.categoryOpened = false;
        this.id = false;
        this.chromaSpeed = 3;
        int tY = this.bh + 3;
        for (final bb mod : w.c.getm0dmanager().inCateg(this.categoryName)) {
            final keystrokesmod.m3 b = (keystrokesmod.m3)new m3(mod, this, tY);
            this.c.add((b)b);
            tY += 16;
        }
    }
    
    public cm(final String d) {
        this.n4m = false;
        this.pin = false;
        this.c = new ArrayList<b>();
        this.k = 92;
        this.x = 5;
        this.y = 5;
        this.bh = 13;
        this.xx = 0;
        this.categoryOpened = false;
        this.id = false;
        final int tY = this.bh;
        this.pvp = d;
        this.n4m = true;
    }
    
    public ArrayList<b> gc() {
        return this.c;
    }
    
    public void x(final int n) {
        this.x = n;
    }
    
    public void y(final int y) {
        this.y = y;
    }
    
    public void d(final boolean d) {
        this.id = d;
    }
    
    public boolean p() {
        return this.pin;
    }
    
    public void cv(final boolean on) {
        this.pin = on;
    }
    
    public boolean fv() {
        return this.categoryOpened;
    }
    
    public void oo(final boolean on) {
        this.categoryOpened = on;
    }
    
    public void rf(final FontRenderer renderer) {
        this.k = 92;
        if (!this.c.isEmpty() && this.categoryOpened) {
            int h = 0;
            for (final b c : this.c) {
                h += ((DEOBFUSCATED-NAMES.b)c).gh();
            }
            Gui.func_73734_a(this.x - 2, this.y, this.x + this.k + 2, this.y + this.bh + h + 4, new Color(0, 0, 0, 110).getRGB());
        }
        kk.d((float)(this.x - 2), (float)this.y, (float)(this.x + this.k + 2), (float)(this.y + this.bh + 3), -1);
        renderer.func_175065_a(this.n4m ? this.pvp : this.categoryName.name(), (float)(this.x + 2), (float)(this.y + 4), Color.getHSBColor(System.currentTimeMillis() % (7500L / this.chromaSpeed) / (7500.0f / this.chromaSpeed), 1.0f, 1.0f).getRGB(), false);
        if (this.n4m) {
            return;
        }
        GL11.glPushMatrix();
        renderer.func_175065_a(this.categoryOpened ? "-" : "+", (float)(this.x + 80), (float)(this.y + 4.5), Color.white.getRGB(), false);
        GL11.glPopMatrix();
        if (this.categoryOpened && !this.c.isEmpty()) {
            for (final b c2 : this.c) {
                ((DEOBFUSCATED-NAMES.b)c2).r3nd3r();
            }
        }
    }
    
    public void r3nd3r() {
        int o = this.bh + 3;
        for (final b c : this.c) {
            ((DEOBFUSCATED-NAMES.b)c).so(o);
            o += ((DEOBFUSCATED-NAMES.b)c).gh();
        }
    }
    
    public int gx() {
        return this.x;
    }
    
    public int gy() {
        return this.y;
    }
    
    public int gw() {
        return this.k;
    }
    
    public void up(final int x, final int y) {
        if (this.id) {
            this.x(x - this.xx);
            this.y(y - this.yy);
        }
    }
    
    public boolean i(final int x, final int y) {
        return x >= this.x + 92 - 13 && x <= this.x + this.k && y >= this.y + 2.0f && y <= this.y + this.bh + 1;
    }
    
    public boolean d(final int x, final int y) {
        return x >= this.x + 77 && x <= this.x + this.k - 6 && y >= this.y + 2.0f && y <= this.y + this.bh + 1;
    }
    
    public boolean v(final int x, final int y) {
        return x >= this.x && x <= this.x + this.k && y >= this.y && y <= this.y + this.bh;
    }
}
