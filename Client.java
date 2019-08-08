package com.neuedu.test;

import java.util.Scanner;
import java.util.Arrays;

/**
 * @author neuedu_zlc
 * @version 1.0
 * @since 20190807
 * */
public class Client {
	public static void main(String[] args) {
		welcome();
	}
	public static void welcome() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("=============��ӭ����================");
		System.out.println("==========����һ��RPG��Ϸ=============");
		System.out.println("1.��ʼ��Ϸ...");
		System.out.println("2.��Ϸ����...");
		System.out.println("3.������Ϸ...");
		System.out.println("4.�鿴��ɫ...");
		System.out.println("������������еĲ�����1-4����");
		int nextInt = scanner.nextInt();
		switch (nextInt) {
		case 1:
			// ��ʼ��Ϸ
			createNewGame();
			break;
		case 2:
			//��Ϸ����
			gameRules();
			welcome();
			break;
		case 3:
			// ������Ϸ
			gameVoer();
			break;
		case 4:
			// �鿴��ɫ
			break;
		default:
			System.out.println("������������������");
			welcome();
		    break;
		}
	}
	// ������ʼ��Ϸ�ķ���
	public static void createNewGame() {
		GameTask[] task = {};
	    @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
	    System.out.println("���������Ľ�ɫ��:");
	    String name = scanner.next();
	    System.out.println("1.����2.����3.����4.����5.Ԫ��");
	    int race = scanner.nextInt();
	    // ������Ϸ��ɫ
	    GameTask gameTask = new GameTask();
	    gameTask.name = name;
	    gameTask.race = race;
	    GameTask[] copyOf = Arrays.copyOf(task,task.length+1);
	    copyOf[copyOf.length-1] = gameTask;
	    if(copyOf != null) {
	    	System.out.println("�����ɹ�");
	    	System.out.println("���Ľ�ɫ����"+gameTask.name);
	    	System.out.println("����ɫ�������ǣ�"+gameTask.race);
	    	int power = gameTask.getPower();
	    	System.out.println("Ӣ������Ϊ��"+power);
	    	int agile = gameTask.getAgile();
	    	System.out.println("Ӣ������Ϊ��"+agile);
	    	int physicalStrength = gameTask.getPhysicalStrength();
	    	System.out.println("Ӣ������Ϊ��"+physicalStrength);
	    	int inwelligence = gameTask.getInwelligence();
	    	System.out.println("Ӣ������Ϊ��"+inwelligence);
	    	int wisdom = gameTask.getWisdom();
	    	System.out.println("Ӣ���ǻ�Ϊ��"+wisdom);
	    	int life = gameTask.getLife();
	    	System.out.println("Ӣ������Ϊ��"+life);
	    	int magic = gameTask.getMagic();
	    	System.out.println("Ӣ��ħ��ֵΪ��"+magic);
	    	
	    }
	    welcome();
	}
	// ������Ϸ����ķ���
	public static void gameRules() {
		System.out.println("����Ϸ����");
	}
	// ������Ϸ�ķ���
	public static void gameVoer() {
		System.exit(0);
	}
	
    
}
