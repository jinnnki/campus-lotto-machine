package com.multicampus.lottomachine.controller;

import com.multicampus.lottomachine.service.LottoMachineService;
import com.multicampus.lottomachine.view.LottoMachineView;

/**로또 프로그램 컨트롤러 : 프로그램의 분기를 처리 */ 
public class LottoMachineController {
	private LottoMachineService lottoService = new LottoMachineService();	//로또 서비스 처리
	private LottoMachineView lottoView = new LottoMachineView();			//로또 뷰 처리
	public void showProgramMenu(){
//		lottoView.showProgramMenu();
	}
	/** 사용자 입력값과 당첨번호를 비교해 보여주는 프로그램*/
	public void showResultLottoWinning(String input) {
		lottoService.setLottoNumber(input);	/** 사용자 입력값 셋팅, 사용자 입력값 보여주기 */ 
//		lottoView.showCustomerSetting(lottoService.getCustomerNumbers()); //TreeSet값이 들어가야함
		
//		//당첨번호를 생성하고, 사용자 입력값이랑 비교, 결과 보여주기
//		lottoService.checkLottoNumber();
//		lottoView.showWinningResult(lottoService.getWinningResult());
	}
}
