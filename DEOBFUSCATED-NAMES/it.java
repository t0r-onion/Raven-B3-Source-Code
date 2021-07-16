// 
// Decompiled by Procyon v0.5.36
// 

package DEOBFUSCATED-NAMES;

import net.minecraftforge.fml.common.asm.transformers.deobf.FMLDeobfuscatingRemapper;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.Opcodes;

public interface it extends Opcodes
{
    String[] getClassName();
    
    void transform(final ClassNode p0, final String p1);
    
    default String mmn(final ClassNode cn, final MethodNode mn) {
        return FMLDeobfuscatingRemapper.INSTANCE.mapMethodName(cn.name, mn.name, mn.desc);
    }
}
