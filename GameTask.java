package com.neuedu.test;

import java.util.Random;
/**
 * @author neuedu_zlc
 * @version 1.0
 * @since 20190807
 * */
public class GameTask {
    

	// 姓名
	public String name;
	// 性别
	public char sex;
	// 种族
	public int race;
	// 职业
	public String occupation;
	// 力量
	public short power;
	// 敏捷
	public short agile;
	// 体力
	public short physicalStrength;
	// 智力
	public short inwelligence;
	// 智慧
	public short wisdom;
	// 生命值
	public short life;
	// 魔法值
	public short magic;
	// 生成随机力量值
	public int getPower() {
		Random random = new Random();
		int nextInt = random.nextInt(10000);
		return nextInt;
	}
	// 生成随机敏捷值
	public int getAgile() {
		Random random = new Random();
		int nextInt = random.nextInt(10000);
		return nextInt;
	}
	// 生成随机体力值
	public int getPhysicalStrength() {
		Random random = new Random();
		int nextInt = random.nextInt(10000);
		return nextInt;
	}
	// 生成随机智力值
	public int getInwelligence() {
		Random random = new Random();
		int nextInt = random.nextInt(10000);
		return nextInt;
	}
	// 生成随机智慧值
	public int getWisdom() {
		Random random = new Random();
		int nextInt = random.nextInt(10000);
		return nextInt;
	}
	// 生成随机生命值
	public int getLife() {
		Random random = new Random();
		int nextInt = random.nextInt(100000);
		return nextInt;
	}
	// 生成随机魔法值
	public int getMagic() {
		Random random = new Random();
		int nextInt = random.nextInt(100000);
		return nextInt;
	}
}
