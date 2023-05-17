package com.multicampus.lottomachine.domain;

import java.util.TreeSet;

/** 사용자의 입력값과 결과값을 비교해 당첨 번호만 저장하는 함수 
 *1단계. 비교 메서드 구현, 당첨번호, 당첨번호 개수 구현  
 *2단계.	당첨통계 - 별도의 모델에 구현할 예정 HAS A? 를 써야 할까? 
 */

public class ResultLottoNumber implements LottoNumbers {
	private TreeSet<Integer> resultNumbers = new TreeSet<Integer>();
	private TreeSet<Integer> customerNumbers;
	private TreeSet<Integer> winningNumbers;
	
	public ResultLottoNumber(TreeSet<Integer> customNumbers,TreeSet<Integer> winningNumbers ) {
		this.customerNumbers = customNumbers;
		this.winningNumbers = winningNumbers;
		this.setNumbers();
	}
	
	@Override
	public TreeSet<Integer> getNumbers() {
		if(customerNumbers==null || winningNumbers == null) {
			throw new NullPointerException("사용자 입력이나 당첨번호가 없습니다. 결과값을 반환할 수 없습니다.");
		}
		return this.resultNumbers;
	}

	@Override
	public void setNumbers() {
		for(Integer number:this.customerNumbers) {
			if(this.winningNumbers.contains(number)) {
				this.resultNumbers.add(number);
			}
		}
	}
	
	public int getResultNumber() {
		return this.resultNumbers.size();
	}
	
}
