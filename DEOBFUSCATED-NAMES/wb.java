// 
// Decompiled by Procyon v0.5.36
// 

package DEOBFUSCATED-NAMES;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Items;
import net.minecraft.block.Block;
import net.minecraft.util.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import keystrokesmod.bb;

public class wb extends bb
{
    public static dc a;
    private boolean handling;
    
    public wb() {
        super(new char[] { 'W', 'a', 't', 'e', 'r', ' ', 'b', 'u', 'c', 'k', 'e', 't' }, bb.other, 0);
        this.registerSetting(wb.a = new dc(new String(new char[] { 'C', 'r', 'e', 'd', 'i', 't', 's', ':', ' ', 'a', 'y', 'c', 'y' })));
    }
    
    @SubscribeEvent
    public void onTick(final TickEvent.ClientTickEvent ev) {
        if (ev.phase == TickEvent.Phase.END || !ay.e() || wb.mc.func_147113_T()) {
            return;
        }
        if (this.inPosition() && this.holdWaterBucket()) {
            this.handling = true;
        }
        if (this.handling) {
            this.mlg();
            if (wb.mc.field_71439_g.field_70122_E || wb.mc.field_71439_g.field_70181_x > 0.0) {
                this.reset();
            }
        }
    }
    
    private boolean inPosition() {
        if (wb.mc.field_71439_g.field_70181_x < -0.6 && !wb.mc.field_71439_g.field_70122_E && !wb.mc.field_71439_g.field_71075_bZ.field_75100_b && !wb.mc.field_71439_g.field_71075_bZ.field_75098_d && !this.handling) {
            final BlockPos playerPos = wb.mc.field_71439_g.func_180425_c();
            for (int i = 1; i < 3; ++i) {
                final BlockPos blockPos = playerPos.func_177979_c(i);
                final Block block = wb.mc.field_71441_e.func_180495_p(blockPos).func_177230_c();
                if (block.func_176212_b((IBlockAccess)wb.mc.field_71441_e, blockPos, EnumFacing.UP)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    private boolean holdWaterBucket() {
        if (this.containsItem(wb.mc.field_71439_g.func_70694_bm(), Items.field_151131_as)) {
            return true;
        }
        for (int i = 0; i < InventoryPlayer.func_70451_h(); ++i) {
            if (this.containsItem(wb.mc.field_71439_g.field_71071_by.field_70462_a[i], Items.field_151131_as)) {
                wb.mc.field_71439_g.field_71071_by.field_70461_c = i;
                return true;
            }
        }
        return false;
    }
    
    private void mlg() {
        final ItemStack heldItem = wb.mc.field_71439_g.func_70694_bm();
        if (this.containsItem(heldItem, Items.field_151131_as) && wb.mc.field_71439_g.field_70125_A >= 70.0f) {
            final MovingObjectPosition object = wb.mc.field_71476_x;
            if (object.field_72313_a == MovingObjectPosition.MovingObjectType.BLOCK && object.field_178784_b == EnumFacing.UP) {
                wb.mc.field_71442_b.func_78769_a((EntityPlayer)wb.mc.field_71439_g, (World)wb.mc.field_71441_e, heldItem);
            }
        }
    }
    
    private void reset() {
        final ItemStack heldItem = wb.mc.field_71439_g.func_70694_bm();
        if (this.containsItem(heldItem, Items.field_151133_ar)) {
            wb.mc.field_71442_b.func_78769_a((EntityPlayer)wb.mc.field_71439_g, (World)wb.mc.field_71441_e, heldItem);
        }
        this.handling = false;
    }
    
    private boolean containsItem(final ItemStack itemStack, final Item item) {
        return itemStack != null && itemStack.func_77973_b() == item;
    }
}
