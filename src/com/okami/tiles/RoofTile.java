package com.okami.tiles;

import java.awt.image.BufferedImage;

public class RoofTile extends Tile {
		
	public RoofTile(int x, int y, BufferedImage sprite) {
		super(x, y, sprite);
		layer = 2;
	}
}
