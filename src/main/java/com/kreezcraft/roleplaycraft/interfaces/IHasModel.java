package com.kreezcraft.roleplaycraft.interfaces;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public interface IHasModel {

	@SideOnly(Side.CLIENT)
	public void registerModels();

}
