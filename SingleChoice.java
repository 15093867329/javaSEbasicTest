package com.zlc08.tesk;

/**
* @ClassName: SingleChoice
* @Description: 单选类
* @author neuedu_ZLC
* @date 2019年8月12日 下午7:39:45
*
*/
public class SingleChoice extends Question {
	// 选项
	String[] optiosn;
	// 单选标准答案
	int answer;
	// 构造器
	public SingleChoice(String text,String[] optiosn, int answer) {
		this.text = text;
		this.optiosn = optiosn;
		this.answer = answer;
	}
	@Override
	public boolean check(int[] answers) {
		return this.answer == answers[0];
	}

}
