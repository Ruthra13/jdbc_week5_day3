package model;

public class Skill
{
	private Long skilld;
	private String skillName;
	
	
	
	public Skill() {
		super();
	}


	public Skill(Long skilld, String skillName) {
		super();
		this.skilld = skilld;
		this.skillName = skillName;
	}
	
	
	public Long getSkilld() {
		return skilld;
	}
	public void setSkilld(Long skilld) {
		this.skilld = skilld;
	}
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	
	
}
