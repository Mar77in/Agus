package main;

import Obstaculos.*;

public abstract class Visitor {
	
	protected gameObject objeto;
	
	public abstract boolean visitGrass(Grass g);
}
