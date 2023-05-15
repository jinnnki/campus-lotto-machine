# campus-lotto-machine

# 모델
사용자 입력번호  1,2,3,4,5,6 (6개) -default
당첨 번호 : (1,2,3,4,5,6 +7) (7개) ->
- 보너스 번호 없이 (1단계), 보너스번호 있다(2단계)
당첨결과 번호 : 6개 ->뷰

# 컨트롤러
 Lotto 컨트롤러 1 메서드 3개
controller -> LottoService -> LottoModel1,2,3
1. 사용자 입력 처리
- 사용자 입력 처리 서비스 & 입력한 숫자를 보여주는 뷰
2. 당첨번호 생성 -> 난수 발생하는 컨트롤러
- 당첨번호 생성 서비스 & 당청번호 보여주는 뷰
3. 당첨번호 비교 컨트롤러
- 몇개 당첨 됬는지 확인하는 서비스 & 당첨 상금 보여주는 뷰
- 당첨통계 입력하는 서비스 (2단계)
4. 당첨통계 보여주는 컨트롤러(2단계)

# 서비스
1. 사용자 입력을 처리하는 Service -> 입력받는 모델
* 입력은 번호를 6개 한꺼번에 받기
- 수동 1장(1단계), 수동 5장(2단계), 자동+수동(3단계)
- 유효성 1~45까지 입력하는지, 6개 번호 중복없이 입력하는지  -> 에러처리(1단계)
2. 난수 발생하는 컨트롤러 -> 당첨번호 모델
- 보너스 번호 없이 (1단계) : 6개난수를 발생시켜서 당첨번호에 저장
3. 당첨비교하는 컨트롤러 -> 당첨결과 모델
