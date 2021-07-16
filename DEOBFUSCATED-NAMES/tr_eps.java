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

public class tr_eps implements it
{
    private static final String c1;
    private static final String c2;
    private static final String c3;
    
    @Override
    public String[] getClassName() {
        return new String[] { tr_eps.c1 };
    }
    
    @Override
    public void transform(final ClassNode c, final String t) {
        for (final MethodNode m : c.methods) {
            final String n = this.mmn(c, m);
            if (n.equalsIgnoreCase(tr_eps.c2) || n.equalsIgnoreCase(tr_eps.c3)) {
                final AbstractInsnNode[] arr = m.instructions.toArray();
                for (int i = 0; i < arr.length; ++i) {
                    final AbstractInsnNode ins = arr[i];
                    if (i == 243) {
                        m.instructions.insert(ins, this.h());
                    }
                    else if (i >= 244 && i <= 261) {
                        m.instructions.remove(ins);
                    }
                    else if (i == 262) {
                        break;
                    }
                }
                break;
            }
        }
    }
    
    private InsnList h() {
        final InsnList i = new InsnList();
        i.add((AbstractInsnNode)new MethodInsnNode(184, ct.cl, "sl", "()V", false));
        return i;
    }
    
    static {
        c1 = new String(new char[] { 'n', 'e', 't', '.', 'm', 'i', 'n', 'e', 'c', 'r', 'a', 'f', 't', '.', 'c', 'l', 'i', 'e', 'n', 't', '.', 'e', 'n', 't', 'i', 't', 'y', '.', 'E', 'n', 't', 'i', 't', 'y', 'P', 'l', 'a', 'y', 'e', 'r', 'S', 'P' });
        c2 = new String(new char[] { 'o', 'n', 'L', 'i', 'v', 'i', 'n', 'g', 'U', 'p', 'd', 'a', 't', 'e' });
        c3 = new String(new char[] { 'f', 'u', 'n', 'c', '_', '7', '0', '6', '3', '6', '_', 'd' });
    }
}
