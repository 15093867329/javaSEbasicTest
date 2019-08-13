package com.zlc08.tesk;

import java.util.Arrays;

/**
* @ClassName: MultiChoice
* @Description: 多选类
* @author neuedu_ZLC
* @date 2019年8月12日 下午7:36:29
*
*/
public class MultiChoice extends Question {
	// 选项
	String[] optiosn;
	// 多选标准答案
	int[] answers;
	// 构造器
	public MultiChoice(String text,String[] optiosn, int[] answers) {
		this.text = text;
		this.optiosn = optiosn;
		this.answers = answers;
	}
	@Override
	public boolean check(int[] as) {
		// 判断是否为null
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
