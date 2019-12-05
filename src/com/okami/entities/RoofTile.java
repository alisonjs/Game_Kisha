package com.okami.entities;

import java.awt.image.BufferedImage;

public class RoofTile extends Tile {
	
	public RoofTile(int x, int y){
		super(x, y, ROOF_TILE);
	}
	
	public RoofTile(int x, int y, BufferedImage sprite) {
		super(x, y, sprite);
	}
}
