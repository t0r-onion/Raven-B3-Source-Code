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

public class tr_ent implements it
{
    private static final String c1;
    private static final String c2;
    private static final String c3;
    private static final String c4;
    
    @Override
    public String[] getClassName() {
        return new String[] { tr_ent.c1 };
    }
    
    @Override
    public void transform(final ClassNode c, final String t) {
        for (final MethodNode m : c.methods) {
            final String n = this.mmn(c, m);
            if (n.equalsIgnoreCase(tr_ent.c2) || n.equalsIgnoreCase(tr_ent.c3)) {
                final AbstractInsnNode[] arr = m.instructions.toArray();
                for (int i = 0; i < arr.length; ++i) {
                    final AbstractInsnNode ins = arr[i];
                    if (i >= 99 && i <= 117) {
                        m.instructions.remove(ins);
                    }
                    else if (i == 118) {
                        m.instructions.insertBefore(ins, this.h());
                        break;
                    }
                }
                break;
            }
        }
    }
    
    private InsnList h() {
        final InsnList i = new InsnList();
        i.add((AbstractInsnNode)new VarInsnNode(25, 0));
        i.add((AbstractInsnNode)new MethodInsnNode(184, ct.cl, "edg", tr_ent.c4, false));
        i.add((AbstractInsnNode)new VarInsnNode(54, 19));
        return i;
    }
    
    static {
        c1 = new String(new char[] { 'n', 'e', 't', '.', 'm', 'i', 'n', 'e', 'c', 'r', 'a', 'f', 't', '.', 'e', 'n', 't', 'i', 't', 'y', '.', 'E', 'n', 't', 'i', 't', 'y' });
        c2 = new String(new char[] { 'm', 'o', 'v', 'e', 'E', 'n', 't', 'i', 't', 'y' });
        c3 = new String(new char[] { 'f', 'u', 'n', 'c', '_', '7', '0', '0', '9', '1', '_', 'd' });
        c4 = new String(new char[] { '(', 'L', 'n', 'e', 't', '/', 'm', 'i', 'n', 'e', 'c', 'r', 'a', 'f', 't', '/', 'e', 'n', 't', 'i', 't', 'y', '/', 'E', 'n', 't', 'i', 't', 'y', ';', ')', 'Z' });
    }
}
