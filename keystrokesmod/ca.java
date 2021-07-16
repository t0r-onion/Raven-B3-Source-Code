// 
// Decompiled by Procyon v0.5.36
// 

package keystrokesmod;

import java.util.Iterator;
import DEOBFUSCATED-NAMES.an;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import DEOBFUSCATED-NAMES.ay;
import DEOBFUSCATED-NAMES.str;
import net.minecraft.entity.Entity;
import DEOBFUSCATED-NAMES.cb;
import DEOBFUSCATED-NAMES.dc;
import net.minecraft.util.Vec3;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.client.entity.EntityPlayerSP;
import DEOBFUSCATED-NAMES.b9;
import DEOBFUSCATED-NAMES.ap;

public static class ca
{
    public static class cw extends bb
    {
        public static ap a;
        private boolean b;
        
        public cw() {
            super(new char[] { 'E', 'x', 't', 'r', 'a', ' ', 'B', 'o', 'b', 'b', 'i', 'n', 'g' }, bb.fun, 0);
            this.registerSetting(cw.a = new ap(new char[] { 'L', 'e', 'v', 'e', 'l' }, 1.0, 0.0, 8.0, 0.1));
        }
        
        @Override
        public void onEnable() {
            if (!(this.b = cw.mc.field_71474_y.field_74336_f)) {
                cw.mc.field_71474_y.field_74336_f = true;
            }
        }
        
        @Override
        public void onDisable() {
            cw.mc.field_71474_y.field_74336_f = this.b;
        }
        
        @Override
        public void update() {
            if (!cw.mc.field_71474_y.field_74336_f) {
                cw.mc.field_71474_y.field_74336_f = true;
            }
            if (cw.mc.field_71439_g.field_71158_b.field_78900_b != 0.0f || cw.mc.field_71439_g.field_71158_b.field_78902_a != 0.0f) {
                final EntityPlayerSP field_71439_g = cw.mc.field_71439_g;
                field_71439_g.field_71109_bG += (float)(cw.a.getInput() / 2.0);
            }
        }
    }
    
    public static class ct extends bb
    {
        public static ap a;
        
        public ct() {
            super(new char[] { 'F', 'l', 'a', 'm', 'e', ' ', 'T', 'r', 'a', 'i', 'l' }, bb.fun, 0);
        }
        
        @Override
        public void update() {
            final Vec3 vec = ct.mc.field_71439_g.func_70040_Z();
            final double x = ct.mc.field_71439_g.field_70165_t - vec.field_72450_a * 2.0;
            final double y = ct.mc.field_71439_g.field_70163_u + (ct.mc.field_71439_g.func_70047_e() - 0.2);
            final double z = ct.mc.field_71439_g.field_70161_v - vec.field_72449_c * 2.0;
            ct.mc.field_71439_g.field_70170_p.func_175688_a(EnumParticleTypes.FLAME, x, y, z, 0.0, 0.0, 0.0, new int[] { 0 });
        }
    }
    
    public static class sl extends bb
    {
        public static dc f;
        public static ap r;
        public static cb b;
        public static cb d;
        public static cb e;
        private boolean s;
        
        public sl() {
            super(new char[] { 'S', 'l', 'y', 'P', 'o', 'r', 't' }, bb.fun, 0);
            ((ca)this).s = false;
            ((ca)this).registerSetting(ca.f = new dc(new String(new char[] { 'T', 'e', 'l', 'e', 'p', 'o', 'r', 't', ' ', 'b', 'e', 'h', 'i', 'n', 'd', ' ', 'e', 'n', 'e', 'm', 'i', 'e', 's', '.' })));
            ((ca)this).registerSetting(ca.r = new ap(new char[] { 'R', 'a', 'n', 'g', 'e' }, 6.0, 2.0, 15.0, 1.0));
            ((ca)this).registerSetting(ca.e = new cb(new char[] { 'A', 'i', 'm' }, true));
            ((ca)this).registerSetting(ca.b = new cb(new char[] { 'P', 'l', 'a', 'y', ' ', 's', 'o', 'u', 'n', 'd' }, true));
            ((ca)this).registerSetting(ca.d = new cb(new char[] { 'P', 'l', 'a', 'y', 'e', 'r', 's', ' ', 'o', 'n', 'l', 'y' }, true));
        }
        
        @Override
        public void onEnable() {
            final Entity en = super.ge();
            if (en != null) {
                super.tp(en);
            }
            ((ca)this).disable();
        }
        
        private void tp(final Entity en) {
            if (ca.b.isToggled()) {
                ca.mc.field_71439_g.func_85030_a(str.c50, 1.0f, 1.0f);
            }
            final Vec3 vec = en.func_70040_Z();
            final double x = en.field_70165_t - vec.field_72450_a * 2.5;
            final double z = en.field_70161_v - vec.field_72449_c * 2.5;
            ca.mc.field_71439_g.func_70107_b(x, ca.mc.field_71439_g.field_70163_u, z);
            if (ca.e.isToggled()) {
                ay.aim(en, 0.0f, false);
            }
        }
        
        private Entity ge() {
            Entity en = null;
            final double r = Math.pow(ca.r.getInput(), 2.0);
            double dist = r + 1.0;
            for (final Entity ent : ca.mc.field_71441_e.field_72996_f) {
                if (ent != ca.mc.field_71439_g && ent instanceof EntityLivingBase) {
                    if (((EntityLivingBase)ent).field_70725_aQ != 0) {
                        continue;
                    }
                    if (ca.d.isToggled() && !(ent instanceof EntityPlayer)) {
                        continue;
                    }
                    if (an.bot(ent)) {
                        continue;
                    }
                    final double d = ca.mc.field_71439_g.func_70068_e(ent);
                    if (d > r) {
                        continue;
                    }
                    if (dist < d) {
                        continue;
                    }
                    dist = d;
                    en = ent;
                }
            }
            return en;
        }
    }
    
    public static class sp extends bb
    {
        public static ap a;
        public static ap b;
        private float yaw;
        
        public sp() {
            super(new char[] { 'S', 'p', 'i', 'n' }, bb.fun, 0);
            this.registerSetting(sp.a = new ap(new char[] { 'R', 'o', 't', 'a', 't', 'i', 'o', 'n' }, 360.0, 30.0, 360.0, 1.0));
            this.registerSetting(sp.b = new ap(new char[] { 'S', 'p', 'e', 'e', 'd' }, 25.0, 1.0, 60.0, 1.0));
        }
        
        @Override
        public void onEnable() {
            this.yaw = sp.mc.field_71439_g.field_70177_z;
        }
        
        @Override
        public void onDisable() {
            this.yaw = 0.0f;
        }
        
        @Override
        public void update() {
            final double left = this.yaw + sp.a.getInput() - sp.mc.field_71439_g.field_70177_z;
            if (left < sp.b.getInput()) {
                final EntityPlayerSP field_71439_g = sp.mc.field_71439_g;
                field_71439_g.field_70177_z += (float)left;
                this.disable();
            }
            else {
                final EntityPlayerSP field_71439_g2 = sp.mc.field_71439_g;
                field_71439_g2.field_70177_z += (float)sp.b.getInput();
                if (sp.mc.field_71439_g.field_70177_z >= this.yaw + sp.a.getInput()) {
                    this.disable();
                }
            }
        }
    }
}
