package com.multicampus.lottomachine.service;

import java.util.TreeSet;

import com.multicampus.lottomachine.domain.CustomerLottoNumbers;
import com.multicampus.lottomachine.domain.ResultLottoNumber;

public class LottoMachineService {
	//사용자 입력번호  1,2,3,4,5,6 (6개) -default
	//	당첨 번호 : (1,2,3,4,5,6 +7) (7개) ->
	//	- 보너스 번호 없이 (1단계), 보너스번호 있다(2단계)
	//	당첨결과 번호 : 6개 ->
	private CustomerLottoNumbers customNumbers;	/** 사용자 값을 받는 로또 모델*/
	private WinningLottoNumbers winningNumbers;
	private ResultLottoNumber resultNumbers;
	/**사용자 입력된 로또 값을 데이터에 입력*/
	public void setLottoNumber(String input) {
		customNumbers = new CustomerLottoNumbers(input); //객체생성 동시에 input값 셋팅 
	}
	/** 입력된 사용자 값을 가져오기 */
	public TreeSet<Integer> getCustomerNumbers() {
		return customNumbers.getNumbers();
	}
	
	public void checkLottoNumber() {
		// 랜덤 로또 만들기 
		winningNumbers = new WinningLottoNumbers();
		System.out.println(winningNumbers.getNumbers());
		//결과 트리셋 만들기 
		resultNumbers = new ResultLottoNumber(customNumbers.getNumbers(), winningNumbers.getNumbers());
		System.out.println(resultNumbers.getNumbers());
		System.out.println(resultNumbers.getResultNumber());
	}
	

	public TreeSet<Integer> getCustomerNumber(){
		return customNumbers.getNumbers();
	}
	public TreeSet<Integer> getResultNumbers() {
		return resultNumbers.getNumbers();
	}
	public int getResultIntNumber() {	//당첨 개수
		return resultNumbers.getResultNumber();	
	}
}
