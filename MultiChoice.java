package com.zlc08.tesk;

import java.util.Arrays;

/**
* @ClassName: MultiChoice
* @Description: ��ѡ��
* @author neuedu_ZLC
* @date 2019��8��12�� ����7:36:29
*
*/
public class MultiChoice extends Question {
	// ѡ��
	String[] optiosn;
	// ��ѡ��׼��
	int[] answers;
	// ������
	public MultiChoice(String text,String[] optiosn, int[] answers) {
		this.text = text;
		this.optiosn = optiosn;
		this.answers = answers;
	}
	@Override
	public boolean check(int[] as) {
		// �ж��Ƿ�Ϊnull
		if(answers != null && as.length == answers.length) {
			Arrays.sort(as);
			for(int i=0;i<as.length;i++) {
				if(as[i] != answers[i]) {
					return false;
				}
			}
		}
		return true;
	}
    
}
