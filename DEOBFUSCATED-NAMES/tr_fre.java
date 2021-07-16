// 
// Decompiled by Procyon v0.5.36
// 

package DEOBFUSCATED-NAMES;

import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.VarInsnNode;
import org.objectweb.asm.tree.InsnList;
import java.util.Iterator;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.ClassNode;

public class tr_fre implements it
{
    private static final String c1;
    private static final String c2;
    private static final String c3;
    private static final String c4;
    private static final String c5;
    private static final String c6;
    
    @Override
    public String[] getClassName() {
        return new String[] { tr_fre.c1 };
    }
    
    @Override
    public void transform(final ClassNode c, final String t) {
        for (final MethodNode m : c.methods) {
            final String n = this.mmn(c, m);
            if (n.equalsIgnoreCase(tr_fre.c2) || n.equalsIgnoreCase(tr_fre.c3) || n.equalsIgnoreCase(tr_fre.c4) || n.equalsIgnoreCase(tr_fre.c5)) {
                m.instructions.insertBefore(m.instructions.getFirst(), this.h());
            }
        }
    }
    
    private InsnList h() {
        final InsnList i = new InsnList();
        i.add((AbstractInsnNode)new VarInsnNode(25, 1));
        i.add((AbstractInsnNode)new MethodInsnNode(184, ct.cl, "r", tr_fre.c6, false));
        i.add((AbstractInsnNode)new VarInsnNode(58, 1));
        return i;
    }
    
    static {
        c1 = new String(new char[] { 'n', 'e', 't', '.', 'm', 'i', 'n', 'e', 'c', 'r', 'a', 'f', 't', '.', 'c', 'l', 'i', 'e', 'n', 't', '.', 'g', 'u', 'i', '.', 'F', 'o', 'n', 't', 'R', 'e', 'n', 'd', 'e', 'r', 'e', 'r' });
        c2 = new String(new char[] { 'r', 'e', 'n', 'd', 'e', 'r', 'S', 't', 'r', 'i', 'n', 'g', 'A', 't', 'P', 'o', 's' });
        c3 = new String(new char[] { 'f', 'u', 'n', 'c', '_', '7', '8', '2', '5', '5', '_', 'a' });
        c4 = new String(new char[] { 'g', 'e', 't', 'S', 't', 'r', 'i', 'n', 'g', 'W', 'i', 'd', 't', 'h' });
        c5 = new String(new char[] { 'f', 'u', 'n', 'c', '_', '7', '8', '2', '5', '6', '_', 'a' });
        c6 = new String(new char[] { '(', 'L', 'j', 'a', 'v', 'a', '/', 'l', 'a', 'n', 'g', '/', 'S', 't', 'r', 'i', 'n', 'g', ';', ')', 'L', 'j', 'a', 'v', 'a', '/', 'l', 'a', 'n', 'g', '/', 'S', 't', 'r', 'i', 'n', 'g', ';' });
    }
}
