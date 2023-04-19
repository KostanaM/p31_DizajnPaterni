package koki;

public enum proba {
	
	Plava(100), Crvena(500), Zelena(300), Zuta(710);

	private int udeo;

	private proba(int udeo) {
		this.udeo = udeo;
	}

	public int getUdeo() {
		return udeo;
	}

	

	
	
}
