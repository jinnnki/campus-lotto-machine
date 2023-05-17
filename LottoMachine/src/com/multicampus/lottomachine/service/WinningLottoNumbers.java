package com.multicampus.lottomachine.service;

import java.util.Random;
import java.util.TreeSet;

import com.multicampus.lottomachine.domain.LottoNumbers;

public class WinningLottoNumbers implements LottoNumbers{
	private final TreeSet<Integer> winningNumbers =new TreeSet<>(); // 당첨번호가 들어갈 treeset, 재정의 불가
	public WinningLottoNumbers() {//파라미터 필요 없음. 기본 생성자 씀
		setNumbers();	//랜덤함수 생성 호출
	}
	@Override
	public TreeSet<Integer> getNumbers() {
		return this.winningNumbers;
	}
	@Override
	public void setNumbers() {
//		winningNumbers=null; --final때문에 재정의 불가
		Random rd = new Random();
		for(int i = 0 ; winningNumbers.size() <6 ; i++) {
			winningNumbers.add(rd.nextInt(45)+1);
		}
	}
}
