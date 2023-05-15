package com.multicampus.lottomachine.service;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.TreeSet;

public class AppService {
	
	public BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public TreeSet<Integer> customerNumber = new TreeSet<Integer>();
	public TreeSet<Integer> winNumber = new TreeSet<Integer>();
	public TreeSet<Integer> resultNmeber = new TreeSet<Integer>();
	
	/**로또 머신 프로그램 시작 */
	public void start(){
		
		//TODO 1. 숫자를 6개 받는다 - TreeSet에 저장	
		while(customerNumber.size()<6) {
			try {
				customerNumber.add(Integer.parseInt(br.readLine()));
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("사용자 입력번호 : "+customerNumber);
		//TODO 2. 난수를 생성한다 - Random 사용, 역시 TreeSet에 저장
		//겹치면 안된다.. 이 부분 수정필요
		Random rd = new Random();
		for(int i=0;i<6;i++) {
			winNumber.add(rd.nextInt(45)+1);
		}
		
		System.out.println("로또 번호 : "+winNumber);
		//TODO 3. 몇개가 당첨되었는지 확인
		for(Integer number:customerNumber) {
			if(winNumber.contains(number)) {
				resultNmeber.add(number);
			}
		}
		
		System.out.println("당첨번호 : "+resultNmeber);
		System.out.println("프로그램 종료");
	}
}