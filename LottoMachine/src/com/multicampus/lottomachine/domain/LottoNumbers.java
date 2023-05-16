package com.multicampus.lottomachine.domain;

import java.util.TreeSet;

public interface LottoNumbers {
	public TreeSet<Integer> getNumbers();	/** 로또 넘버 가져오기 */
	public void setNumbers();				/** 로또 넘버 셋팅하기 */
}
