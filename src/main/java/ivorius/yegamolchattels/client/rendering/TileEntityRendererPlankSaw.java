/***************************************************************************************************
 * Copyright (c) 2014, Lukas Tenbrink.
 * http://lukas.axxim.net
 **************************************************************************************************/

package ivorius.yegamolchattels.client.rendering;

import ivorius.ivtoolkit.blocks.IvMultiBlockRenderHelper;
import ivorius.yegamolchattels.YeGamolChattels;
import ivorius.yegamolchattels.blocks.TileEntityPlankSaw;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class TileEntityRendererPlankSaw extends TileEntitySpecialRenderer
{
    public ModelBase model;
    public ResourceLocation texture;

    public TileEntityRendererPlankSaw()
    {
        model = new ModelGrindstoneBase();
        texture = new ResourceLocation(YeGamolChattels.MODID, YeGamolChattels.filePathTextures + "grindstoneBase.png");
    }

    @Override
    public void renderTileEntityAt(TileEntity tileentity, double d, double d1, double d2, float f)
    {
        renderTileEntityPlankSawAt((TileEntityPlankSaw) tileentity, d, d1, d2, f);
    }

    public void renderTileEntityPlankSawAt(TileEntityPlankSaw tileEntity, double d, double d1, double d2, float f)
    {
        if (tileEntity.isParent())
        {
            GL11.glPushMatrix();
            IvMultiBlockRenderHelper.transformFor(tileEntity, d, d1, d2);
            GL11.glPushMatrix();
            GL11.glRotatef(180.0f, 1.0f, 0.0f, 0.0f);

            Entity emptyEntity = new EntityArrow(tileEntity.getWorldObj());

            bindTexture(texture);
            GL11.glTranslated(0.0f, -1.0f, 0.0f);
            GL11.glScalef(2.0f, 1.0f, 1.0f);
            model.render(emptyEntity, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);

            GL11.glPopMatrix();

            if (tileEntity.containedItem != null)
            {
                GL11.glPushMatrix();
                GL11.glScaled(1.8, 1.8, 1.8);

                EntityItem var3 = new EntityItem(tileEntity.getWorldObj(), 0.0D, 0.0D, 0.0D, tileEntity.containedItem);
                var3.hoverStart = 0.0F;

                if (!RenderManager.instance.options.fancyGraphics)
                    GL11.glDisable(GL11.GL_CULL_FACE);

                RenderItem.renderInFrame = true;
                RenderManager.instance.renderEntityWithPosYaw(var3, 0.0D, 0.0D, 0.0D, 0.0F, 0.0F);
                RenderItem.renderInFrame = false;

                if (!RenderManager.instance.options.fancyGraphics)
                    GL11.glEnable(GL11.GL_CULL_FACE);

                GL11.glPopMatrix();
            }

            GL11.glPopMatrix();
        }
    }
}
