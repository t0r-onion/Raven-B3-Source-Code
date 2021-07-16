// 
// Decompiled by Procyon v0.5.36
// 

package DEOBFUSCATED-NAMES;

import java.util.Collection;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.ClassReader;
import com.google.common.collect.ArrayListMultimap;
import keystrokesmod.tw.tr.it;
import com.google.common.collect.Multimap;
import net.minecraft.launchwrapper.IClassTransformer;

public class ct implements IClassTransformer
{
    public static String cl;
    private final Multimap<String, it> m;
    
    public ct() {
        this.m = (Multimap<String, it>)ArrayListMultimap.create();
        this.r(new tr_fre());
        this.r(new tr_gur());
        this.r(new tr_eps());
        this.r(new tr_ent());
        this.r(new tr_epl());
        this.r(new tr_min());
    }
    
    private void r(final DEOBFUSCATED-NAMES.it t) {
        for (final String c : t.getClassName()) {
            this.m.put((Object)c, (Object)t);
        }
    }
    
    public byte[] transform(final String n1, final String n2, final byte[] b) {
        if (b == null) {
            return null;
        }
        final Collection<it> tr = (Collection<it>)this.m.get((Object)n2);
        if (tr.isEmpty()) {
            return b;
        }
        final ClassReader r = new ClassReader(b);
        final ClassNode n3 = new ClassNode();
        r.accept((ClassVisitor)n3, 8);
        tr.forEach(transformer -> transformer.transform(n3, n2));
        final ClassWriter w = new ClassWriter(3);
        try {
            n3.accept((ClassVisitor)w);
        }
        catch (Throwable t) {}
        return w.toByteArray();
    }
    
    static {
        ct.cl = new String(new char[] { 'k', 'e', 'y', 's', 't', 'r', 'o', 'k', 'e', 's', 'm', 'o', 'd', '/', 't', 'w', '/', 'e', 'v' });
    }
}
