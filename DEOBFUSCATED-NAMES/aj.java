// 
// Decompiled by Procyon v0.5.36
// 

package DEOBFUSCATED-NAMES;

import keystrokesmod.bb;

public class aj extends bb
{
    public static ap p;
    public static cb r;
    public static cb v;
    
    public aj() {
        super(new char[] { 'A', 'u', 't', 'o', 'C', 'o', 'n', 'f', 'i', 'g' }, bb.client, 0);
        this.registerSetting(aj.p = new ap(new char[] { 'P', 'i', 'n', 'g' }, 30.0, 0.0, 300.0, 10.0));
        this.registerSetting(aj.r = new cb(new char[] { 'C', 'o', 'n', 'f', 'i', 'g', 'u', 'r', 'e', ' ', 'R', 'e', 'a', 'c', 'h' }, true));
        this.registerSetting(aj.v = new cb(new char[] { 'C', 'o', 'n', 'f', 'i', 'g', 'u', 'r', 'e', ' ', 'V', 'e', 'l', 'o', 'c', 'i', 't', 'y' }, true));
    }
    
    @Override
    public void onEnable() {
        this.conf();
        this.disable();
    }
    
    private void conf() {
        final boolean hyp = ay.isHyp();
        if (aj.r.isToggled()) {
            a8.f.disable();
            if (hyp) {
                if (aj.p.getInput() < 50.0) {
                    a8.a.setValue(3.3);
                    a8.b.setValue(3.5);
                }
                else if (aj.p.getInput() < 150.0) {
                    a8.a.setValue(3.5);
                    a8.b.setValue(3.7);
                }
                else {
                    a8.a.setValue(3.7);
                    a8.b.setValue(4.0);
                }
            }
            else if (aj.p.getInput() < 50.0) {
                a8.a.setValue(3.1);
                a8.b.setValue(3.3);
            }
            else if (aj.p.getInput() < 150.0) {
                a8.a.setValue(3.2);
                a8.b.setValue(3.4);
            }
            else {
                a8.a.setValue(3.3);
                a8.b.setValue(3.5);
            }
        }
        if (aj.v.isToggled()) {
            af.c.setValue(100.0);
            if (hyp) {
                if (aj.p.getInput() < 50.0) {
                    af.a.setValue(95.0);
                    af.b.setValue(100.0);
                }
                else if (aj.p.getInput() < 150.0) {
                    af.a.setValue(90.0);
                    af.b.setValue(100.0);
                }
                else {
                    af.a.setValue(85.0);
                    af.b.setValue(98.0);
                }
            }
            else {
                af.b.setValue(100.0);
                if (aj.p.getInput() < 50.0) {
                    af.a.setValue(98.0);
                }
                else if (aj.p.getInput() < 150.0) {
                    af.a.setValue(96.0);
                }
                else {
                    af.a.setValue(94.0);
                }
            }
        }
    }
}
