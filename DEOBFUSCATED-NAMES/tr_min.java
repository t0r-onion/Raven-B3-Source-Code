// 
// Decompiled by Procyon v0.5.36
// 

package DEOBFUSCATED-NAMES;

import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.AbstractInsnNode;
import java.util.Iterator;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.ClassNode;

public class tr_min implements it
{
    private static final String c1;
    private static final String c2;
    private static final String c3;
    
    @Override
    public String[] getClassName() {
        return new String[] { tr_min.c1 };
    }
    
    @Override
    public void transform(final ClassNode c, final String t) {
        for (final MethodNode m : c.methods) {
            final String n = this.mmn(c, m);
            if (n.equalsIgnoreCase(tr_min.c2) || n.equalsIgnoreCase(tr_min.c3)) {
                final AbstractInsnNode[] arr = m.instructions.toArray();
                for (int i = 0; i < arr.length; ++i) {
                    final AbstractInsnNode ins = arr[i];
                    if (i == 39) {
                        m.instructions.insert(ins, this.h());
                    }
                    else if (i >= 40 && i <= 45) {
                        m.instructions.remove(ins);
                    }
                    else if (i == 46) {
                        break;
                    }
                }
                break;
            }
        }
    }
    
    private InsnList h() {
        final InsnList i = new InsnList();
        i.add((AbstractInsnNode)new MethodInsnNode(184, ct.cl, "gmo", "()V", false));
        return i;
    }
    
    static {
        c1 = new String(new char[] { 'n', 'e', 't', '.', 'm', 'i', 'n', 'e', 'c', 'r', 'a', 'f', 't', '.', 'c', 'l', 'i', 'e', 'n', 't', '.', 'M', 'i', 'n', 'e', 'c', 'r', 'a', 'f', 't' });
        c2 = new String(new char[] { 'r', 'u', 'n', 'T', 'i', 'c', 'k' });
        c3 = new String(new char[] { 'f', 'u', 'n', 'c', '_', '7', '1', '4', '0', '7', '_', 'l' });
    }
}
