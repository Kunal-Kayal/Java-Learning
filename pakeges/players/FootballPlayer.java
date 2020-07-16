package pakeges.players;

public class FootballPlayer {
    public String name;
    private float hight;
	public float getHight() {
		return hight;
	}
	public void setHight(float hight) {
		if(hight>5)
		   this.hight = hight;
		else
		   System.out.println(name + " is not selected due to hight is "+hight);
	}
    
}
