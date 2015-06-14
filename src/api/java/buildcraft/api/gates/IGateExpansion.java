/** Copyright (c) 2011-2015, SpaceToad and the BuildCraft Team http://www.mod-buildcraft.com
 *
 * The BuildCraft API is distributed under the terms of the MIT License. Please check the contents of the license, which
 * should be located as "LICENSE.API" in the BuildCraft source code distribution. */
package buildcraft.api.gates;

import net.minecraft.tileentity.TileEntity;

public interface IGateExpansion {

    String getUniqueIdentifier();

    String getDisplayName();

    GateExpansionController makeController(TileEntity pipeTile);

    // void registerBlockOverlay(TextureAtlasSpriteRegister iconRegister);

    // void registerItemOverlay(TextureAtlasSpriteRegister iconRegister);

    // TextureAtlasSprite getOverlayBlock();

    // TextureAtlasSprite getOverlayItem();
}