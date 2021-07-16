// 
// Decompiled by Procyon v0.5.36
// 

package DEOBFUSCATED-NAMES;

import net.minecraft.util.IChatComponent;
import net.minecraft.util.ChatComponentText;
import keystrokesmod.bb;

public class fs extends bb
{
    public static dc a;
    public static String msg;
    public static final String c1;
    public static final String c2;
    public static final String c3;
    public static final String c4;
    
    public fs() {
        super(new char[] { 'F', 'a', 'k', 'e', ' ', 'C', 'h', 'a', 't' }, bb.other, 0);
        this.registerSetting(fs.a = new dc(ay.uf(str.c67) + ": " + fs.c1 + " [" + fs.c2 + "]"));
    }
    
    @Override
    public void onEnable() {
        if (fs.msg.contains("\\n")) {
            final String[] split2;
            final String[] split = split2 = fs.msg.split("\\\\n");
            for (final String s : split2) {
                this.sm(s);
            }
        }
        else {
            this.sm(fs.msg);
        }
        this.disable();
    }
    
    private void sm(final String txt) {
        fs.mc.field_71439_g.func_145747_a((IChatComponent)new ChatComponentText(ay.r(txt)));
    }
    
    static {
        fs.msg = new String(new char[] { '&', 'e', 'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'f', 'a', 'k', 'e', ' ', 'c', 'h', 'a', 't', ' ', 'm', 'e', 's', 's', 'a', 'g', 'e', '.' });
        c1 = new String(new char[] { 'f', 'a', 'k', 'e', 'c', 'h', 'a', 't' });
        c2 = new String(new char[] { 'm', 's', 'g' });
        c3 = new String(new char[] { 'M', 'e', 's', 's', 'a', 'g', 'e', ' ', 's', 'e', 't', '!' });
        c4 = new String(new char[] { '&', 'c', 'I', 'n', 'v', 'a', 'l', 'i', 'd', ' ', 'm', 'e', 's', 's', 'a', 'g', 'e', '.' });
    }
}
