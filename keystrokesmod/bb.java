// 
// Decompiled by Procyon v0.5.36
// 

package keystrokesmod;

import DEOBFUSCATED-NAMES.cb;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.common.MinecraftForge;
import org.lwjgl.input.Keyboard;
import java.util.Iterator;
import DEOBFUSCATED-NAMES.m2;
import net.minecraft.client.Minecraft;
import java.util.ArrayList;

public enum bb
{
    protected ArrayList<b9> v;
    private String n;
    private bb moduleCategory;
    private boolean enabled;
    private int keycode;
    protected static Minecraft mc;
    private boolean p;
    
    public bb(final char[] moduleName, final bb moduleCategory, final int keycode) {
        this.p = false;
        this.n = new String(moduleName);
        this.moduleCategory = moduleCategory;
        this.keycode = keycode;
        this.enabled = false;
        bb.mc = Minecraft.func_71410_x();
        this.v = new ArrayList<b9>();
    }
    
    public static bb getModule(final Class<? extends bb> a) {
        for (final bb module : m2.modsList) {
            if (module.getClass() == a) {
                return module;
            }
        }
        return null;
    }
    
    public bb(final String n, final bb moduleCategory) {
        this.p = false;
        this.n = n;
        this.moduleCategory = moduleCategory;
        this.keycode = 0;
        this.enabled = false;
    }
    
    public void keybind() {
        if (this.keycode == 0) {
            return;
        }
        if (!this.p && Keyboard.isKeyDown(this.keycode)) {
            this.toggle();
            this.p = true;
        }
        else if (!Keyboard.isKeyDown(this.keycode)) {
            this.p = false;
        }
    }
    
    public void enable() {
        this.setEnabled(true);
        m2.enModsList.add(this);
        if (m2.aq.isEnabled()) {
            m2.sort();
        }
        MinecraftForge.EVENT_BUS.register((Object)this);
        FMLCommonHandler.instance().bus().register((Object)this);
        this.onEnable();
    }
    
    public void disable() {
        this.setEnabled(false);
        m2.enModsList.remove(this);
        MinecraftForge.EVENT_BUS.unregister((Object)this);
        FMLCommonHandler.instance().bus().unregister((Object)this);
        this.onDisable();
    }
    
    public void setEnabled(final boolean enabled) {
        this.enabled = enabled;
    }
    
    public String g3tN4m3() {
        return this.n;
    }
    
    public ArrayList<b9> v() {
        return this.v;
    }
    
    public void registerSetting(final DEOBFUSCATED-NAMES.b9 Setting) {
        this.v.add((b9)Setting);
    }
    
    public bb moduleCategory() {
        return this.moduleCategory;
    }
    
    public boolean isEnabled() {
        return this.enabled;
    }
    
    public void onEnable() {
    }
    
    public void onDisable() {
    }
    
    public void toggle() {
        if (this.isEnabled()) {
            this.disable();
        }
        else {
            this.enable();
        }
    }
    
    public void update() {
    }
    
    public void guiUpdate() {
    }
    
    public void guiButtonToggled(final cb b) {
    }
    
    public int getKeycode() {
        return this.keycode;
    }
    
    public void setbind(final int keybind) {
        this.keycode = keybind;
    }
    
    public enum category
    {
        public static final bb combat;
        public static final bb movement;
        public static final bb player;
        public static final bb world;
        public static final bb render;
        public static final bb minigames;
        public static final bb fun;
        public static final bb other;
        public static final bb client;
        
        public static bb[] values() {
            return bb.$VALUES.clone();
        }
        
        public static bb valueOf(final String name) {
            return Enum.valueOf(bb.class, name);
        }
        
        static {
            bb.combat = new bb("combat", 0);
            bb.movement = new bb("movement", 1);
            bb.player = new bb("player", 2);
            bb.world = new bb("world", 3);
            bb.render = new bb("render", 4);
            bb.minigames = new bb("minigames", 5);
            bb.fun = new bb("fun", 6);
            bb.other = new bb("other", 7);
            bb.client = new bb("client", 8);
            bb.$VALUES = new bb[] { bb.combat, bb.movement, bb.player, bb.world, bb.render, bb.minigames, bb.fun, bb.other, bb.client };
        }
    }
}
