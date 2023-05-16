package com.multicampus.lottomachine.service;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.TreeSet;

import com.multicampus.lottomachine.controller.LottoMachineController;
import com.multicampus.lottomachine.exception.DuplicationNubersException;
import com.multicampus.lottomachine.exception.NumberOutOfBoundException;

/** 로또머신 프로그램 */
public class AppService {
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private LottoMachineController lottoController = new LottoMachineController();
	private String input; // 사용자 값을 입력 받는 변수

	/**
	 * 로또 머신 프로그램 시작 1. 프로그램은 사용자가 종료할 때까지 계속 진행된다. - 종료Q를 누르면 프로그램 종료 - 6개의 번호 입력,
	 * 번호는 1~45까지 가능
	 */
	public void start() {
		while (true) {
			try {
				lottoController.showProgramMenu();
				input = br.readLine(); /** 사용자 입력받기, 6개를 한꺼번에 받는다. */
				lottoController.showResultLottoWinning(input); /** 로또 프로그램에 사용자 값을 전달 */
			} catch (NumberOutOfBoundException e) { /** 1~45를 넘겼을 때 에러 */
				System.out.println(e.getMessage());
			} catch (NumberFormatException e) { /** 숫자가 아닌 값을 입력 */
				System.out.println(e.getMessage());
			} catch (DuplicationNubersException e) { /** 중복된 값을 넣었을 때 에러 */
				System.out.println(e.getMessage());
			} catch (NullPointerException e) { /** 사용자값이 Null인데 get요청 했을 때 에러 */
				System.out.println(e.getMessage());
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}

	}
}