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
		System.out.println("=============欢迎进入================");
		System.out.println("==========这是一个RPG游戏=============");
		System.out.println("1.开始游戏...");
		System.out.println("2.游戏规则...");
		System.out.println("3.结束游戏...");
		System.out.println("4.查看角色...");
		System.out.println("请输入您想进行的操作（1-4）：");
		int nextInt = scanner.nextInt();
		switch (nextInt) {
		case 1:
			// 开始游戏
			createNewGame();
			break;
		case 2:
			//游戏规则
			gameRules();
			welcome();
			break;
		case 3:
			// 结束游戏
			gameVoer();
			break;
		case 4:
			// 查看角色
			break;
		default:
			System.out.println("输入有误请重新输入");
			welcome();
		    break;
		}
	}
	// 创建开始游戏的方法
	public static void createNewGame() {
		GameTask[] task = {};
	    @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
	    System.out.println("请输入您的角色名:");
	    String name = scanner.next();
	    System.out.println("1.人类2.精灵3.兽人4.矮人5.元素");
	    int race = scanner.nextInt();
	    // 构建游戏角色
	    GameTask gameTask = new GameTask();
	    gameTask.name = name;
	    gameTask.race = race;
	    GameTask[] copyOf = Arrays.copyOf(task,task.length+1);
	    copyOf[copyOf.length-1] = gameTask;
	    if(copyOf != null) {
	    	System.out.println("创建成功");
	    	System.out.println("您的角色名："+gameTask.name);
	    	System.out.println("您角色的种族是："+gameTask.race);
	    	int power = gameTask.getPower();
	    	System.out.println("英雄力量为："+power);
	    	int agile = gameTask.getAgile();
	    	System.out.println("英雄敏捷为："+agile);
	    	int physicalStrength = gameTask.getPhysicalStrength();
	    	System.out.println("英雄体力为："+physicalStrength);
	    	int inwelligence = gameTask.getInwelligence();
	    	System.out.println("英雄智力为："+inwelligence);
	    	int wisdom = gameTask.getWisdom();
	    	System.out.println("英雄智慧为："+wisdom);
	    	int life = gameTask.getLife();
	    	System.out.println("英雄生命为："+life);
	    	int magic = gameTask.getMagic();
	    	System.out.println("英雄魔法值为："+magic);
	    	
	    }
	    welcome();
	}
	// 创建游戏规则的方法
	public static void gameRules() {
		System.out.println("《游戏规则》");
	}
	// 结束游戏的方法
	public static void gameVoer() {
		System.exit(0);
	}
	
    
}
