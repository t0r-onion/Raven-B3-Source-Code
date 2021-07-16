// 
// Decompiled by Procyon v0.5.36
// 

package DEOBFUSCATED-NAMES;

import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.VarInsnNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.AbstractInsnNode;
import java.util.Iterator;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.ClassNode;

public class tr_epl implements it
{
    private static final String c1;
    private static final String c2;
    private static final String c3;
    private static final String c4;
    
    @Override
    public String[] getClassName() {
        return new String[] { tr_epl.c1 };
    }
    
    @Override
    public void transform(final ClassNode c, final String t) {
        for (final MethodNode m : c.methods) {
            final String n = this.mmn(c, m);
            if (n.equalsIgnoreCase(tr_epl.c2) || n.equalsIgnoreCase(tr_epl.c3)) {
                final AbstractInsnNode[] arr = m.instructions.toArray();
                for (int i = 0; i < arr.length; ++i) {
                    final AbstractInsnNode ins = arr[i];
                    if (i == 232) {
                        m.instructions.insert(ins, this.h());
                    }
                    else if (i >= 233 && i <= 248) {
                        m.instructions.remove(ins);
                    }
                    else if (i == 249) {
                        break;
                    }
                }
                break;
            }
        }
    }
    
    private InsnList h() {
        final InsnList i = new InsnList();
        i.add((AbstractInsnNode)new VarInsnNode(25, 1));
        i.add((AbstractInsnNode)new MethodInsnNode(184, ct.cl, "sl2", tr_epl.c4, false));
        return i;
    }
    
    static {
        c1 = new String(new char[] { 'n', 'e', 't', '.', 'm', 'i', 'n', 'e', 'c', 'r', 'a', 'f', 't', '.', 'e', 'n', 't', 'i', 't', 'y', '.', 'p', 'l', 'a', 'y', 'e', 'r', '.', 'E', 'n', 't', 'i', 't', 'y', 'P', 'l', 'a', 'y', 'e', 'r' });
        c2 = new String(new char[] { 'a', 't', 't', 'a', 'c', 'k', 'T', 'a', 'r', 'g', 'e', 't', 'E', 'n', 't', 'i', 't', 'y', 'W', 'i', 't', 'h', 'C', 'u', 'r', 'r', 'e', 'n', 't', 'I', 't', 'e', 'm' });
        c3 = new String(new char[] { 'f', 'u', 'n', 'c', '_', '7', '1', '0', '5', '9', '_', 'n' });
        c4 = new String(new char[] { '(', 'L', 'n', 'e', 't', '/', 'm', 'i', 'n', 'e', 'c', 'r', 'a', 'f', 't', '/', 'e', 'n', 't', 'i', 't', 'y', '/', 'E', 'n', 't', 'i', 't', 'y', ';', ')', 'V' });
    }
}
