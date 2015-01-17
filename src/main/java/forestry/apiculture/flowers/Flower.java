/*******************************************************************************
 * Copyright (c) 2011-2014 SirSengir.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v3
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl-3.0.txt
 *
 * Various Contributors including, but not limited to:
 * SirSengir (original work), CovertJaguar, Player, Binnie, MysteriousAges
 ******************************************************************************/
package forestry.apiculture.flowers;

import forestry.core.utils.StackUtils;
import net.minecraft.item.ItemStack;

final class Flower implements Comparable<Flower> {

	public final ItemStack item;
	public final Double weight;
	public final boolean isPlantable;

	public Flower(ItemStack item, double weight, boolean isPlantable) {
		this.item = item;
		this.weight = weight;
		this.isPlantable = isPlantable;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof Flower))
			return false;
		return StackUtils.isIdenticalItem(this.item, ((Flower) obj).item) && this.isPlantable == ((Flower) obj).isPlantable;
	}

	@Override
	public int compareTo(Flower other) {
		return this.weight.compareTo(other.weight);
	}
}
