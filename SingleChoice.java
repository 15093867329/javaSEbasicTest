package com.zlc08.tesk;

/**
* @ClassName: SingleChoice
* @Description: ��ѡ��
* @author neuedu_ZLC
* @date 2019��8��12�� ����7:39:45
*
*/
public class SingleChoice extends Question {
	// ѡ��
	String[] optiosn;
	// ��ѡ��׼��
	int answer;
	// ������
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
