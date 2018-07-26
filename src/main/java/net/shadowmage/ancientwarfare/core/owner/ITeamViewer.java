package net.shadowmage.ancientwarfare.core.owner;

import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.UUID;

public interface ITeamViewer {
	boolean areTeamMates(World world, UUID player1, UUID player2, String playerName1, String playerName2);

	boolean areFriendly(World world, UUID player1, @Nullable UUID player2, String playerName1, String playerName2);
}
