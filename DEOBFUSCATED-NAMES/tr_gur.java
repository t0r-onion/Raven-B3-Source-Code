// 
// Decompiled by Procyon v0.5.36
// 

package DEOBFUSCATED-NAMES;

import java.util.ListIterator;
import java.util.Iterator;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.ClassNode;

public class tr_gur implements it
{
    private static final String c1;
    private static final String c2;
    private static final String c3;
    private static final String c4;
    private static final String c5;
    private static final String c6;
    private static final String c7;
    
    @Override
    public String[] getClassName() {
        return new String[] { tr_gur.c1 };
    }
    
    @Override
    public void transform(final ClassNode c, final String t) {
        for (final MethodNode m : c.methods) {
            final String n = this.mmn(c, m);
            if (n.equalsIgnoreCase(tr_gur.c2) || n.equalsIgnoreCase(tr_gur.c3)) {
                final ListIterator<AbstractInsnNode> i = (ListIterator<AbstractInsnNode>)m.instructions.iterator();
                while (i.hasNext()) {
                    final AbstractInsnNode ne = i.next();
                    if (ne instanceof MethodInsnNode) {
                        final MethodInsnNode mn = (MethodInsnNode)ne;
                        if ((!mn.owner.equals(tr_gur.c4) && !mn.owner.equals("eu")) || (!mn.name.equals(tr_gur.c5) && !mn.name.equals("e")) || !mn.desc.equals(tr_gur.c6)) {
                            continue;
                        }
                        i.add(this.h());
                    }
                }
                break;
            }
        }
    }
    
    private AbstractInsnNode h() {
        return (AbstractInsnNode)new MethodInsnNode(184, ct.cl, "r", tr_gur.c7, false);
    }
    
    static {
        c1 = new String(new char[] { 'n', 'e', 't', '.', 'm', 'i', 'n', 'e', 'c', 'r', 'a', 'f', 't', '.', 'c', 'l', 'i', 'e', 'n', 't', '.', 'g', 'u', 'i', '.', 'G', 'u', 'i', 'U', 't', 'i', 'l', 'R', 'e', 'n', 'd', 'e', 'r', 'C', 'o', 'm', 'p', 'o', 'n', 'e', 'n', 't', 's' });
        c2 = new String(new char[] { 's', 'p', 'l', 'i', 't', 'T', 'e', 'x', 't' });
        c3 = new String(new char[] { 'f', 'u', 'n', 'c', '_', '1', '7', '8', '9', '0', '8', '_', 'a' });
        c4 = new String(new char[] { 'n', 'e', 't', '/', 'm', 'i', 'n', 'e', 'c', 'r', 'a', 'f', 't', '/', 'u', 't', 'i', 'l', '/', 'I', 'C', 'h', 'a', 't', 'C', 'o', 'm', 'p', 'o', 'n', 'e', 'n', 't' });
        c5 = new String(new char[] { 'g', 'e', 't', 'U', 'n', 'f', 'o', 'r', 'm', 'a', 't', 't', 'e', 'd', 'T', 'e', 'x', 't', 'F', 'o', 'r', 'C', 'h', 'a', 't' });
        c6 = new String(new char[] { '(', ')', 'L', 'j', 'a', 'v', 'a', '/', 'l', 'a', 'n', 'g', '/', 'S', 't', 'r', 'i', 'n', 'g', ';' });
        c7 = new String(new char[] { '(', 'L', 'j', 'a', 'v', 'a', '/', 'l', 'a', 'n', 'g', '/', 'S', 't', 'r', 'i', 'n', 'g', ';', ')', 'L', 'j', 'a', 'v', 'a', '/', 'l', 'a', 'n', 'g', '/', 'S', 't', 'r', 'i', 'n', 'g', ';' });
    }
}
