package com.neuedu.test;

import java.util.Random;
/**
 * @author neuedu_zlc
 * @version 1.0
 * @since 20190807
 * */
public class GameTask {
    

	// ����
	public String name;
	// �Ա�
	public char sex;
	// ����
	public int race;
	// ְҵ
	public String occupation;
	// ����
	public short power;
	// ����
	public short agile;
	// ����
	public short physicalStrength;
	// ����
	public short inwelligence;
	// �ǻ�
	public short wisdom;
	// ����ֵ
	public short life;
	// ħ��ֵ
	public short magic;
	// �����������ֵ
	public int getPower() {
		Random random = new Random();
		int nextInt = random.nextInt(10000);
		return nextInt;
	}
	// �����������ֵ
	public int getAgile() {
		Random random = new Random();
		int nextInt = random.nextInt(10000);
		return nextInt;
	}
	// �����������ֵ
	public int getPhysicalStrength() {
		Random random = new Random();
		int nextInt = random.nextInt(10000);
		return nextInt;
	}
	// �����������ֵ
	public int getInwelligence() {
		Random random = new Random();
		int nextInt = random.nextInt(10000);
		return nextInt;
	}
	// ��������ǻ�ֵ
	public int getWisdom() {
		Random random = new Random();
		int nextInt = random.nextInt(10000);
		return nextInt;
	}
	// �����������ֵ
	public int getLife() {
		Random random = new Random();
		int nextInt = random.nextInt(100000);
		return nextInt;
	}
	// �������ħ��ֵ
	public int getMagic() {
		Random random = new Random();
		int nextInt = random.nextInt(100000);
		return nextInt;
	}
}
