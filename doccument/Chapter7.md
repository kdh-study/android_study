# 7장 리소스 활용 및 스마트폰 크기 호환성

## 7.1. 안드로이드 리소스

- 안드로이드에서 다양한 리소스에 대해 알아보자 
    <pre>
    app
        src
            main    
                res -> 리소스 경로 </pre>

### 7.1.1. 리소스 종류

> res 하위로 폴더 형태

- drawable : 이미지, 이미지 관련 XML, 그림을 표현한 XML
- layout : 화면 UI를 정의한 레이아웃 XML
- values : 문자열, 색상, 크기 등 여러가지 값
- menu : 액티비티의 메뉴를 구성하기 위한 XML
- xml : 특정 폴더가 지정되어 있지 않은 기타 XML
- anim : 애니메이션을 위한 XML
- raw : 바이트 단위로 직접 이용되는 이진 파일
- mipmap : 앱 아이콘 이미지

### 7.1.2. 다양한 리소스 활용

#### 7.1.2.1 애니메이션 리소스

- 고정 애니메이션의 경우, 항상 동일하게 움직이므로 리소스 파일(.xml)을 이용
- res -> anim 폴더

    ``` xml
    <!-- 파일 작성시 -->
    <set>              <!-- anim에서 최상위 root 태그 -->
        <scale />      <!-- 크기 변경 -->
        <rotate />     <!-- 회전 조절-->
         <alpha />     <!-- 투명도 조절 -->
         <translate /> <!-- 이동 조절 -->
    </set>
    ``` 

- 태그 공통 속성
  - duration: 지속 시간 2000 -> 2초
  - startOffset: 시작한 후 얼마 후부터 적용할지 결정 0 -> 바로 , 500 -> 0.5초
  - repeatCount: 반복 횟수 infinite - 무한 반복, 2 -> 2회 
  - repeatMode: 반복 방향 restart - 그대로, reverse - 반대 방향

- 태그 주요 속성
    - scale
      - fromXScale : x축 방향 시작 배율 0 -> 안보임, 2 -> 2배 
      - toXScale : x축 방향 끝 배율
      - fromYScale : y축 방향 시작 배율
      - toYScale : y축 방향 끝 배율
      - pivotX : 확대 축소 x축 기준점, 50% 중앙
      - pivotY : 확대 축소 y축 기준점, 50% 중앙
    - rotate
      - fromDegrees :회전 시작 각도
      - toDegrees :	회전 끝 각도
      - pivotX : 확대 축소 x축 기준점, 50% 중앙
      - pivotY : 확대 축소 y축 기준점, 50% 중앙
    - alpha
      - fromAlpha : 시작 투명도
      - toAlpha : 끝 투명도
    - rotate
      - fromDegrees : 회전 시작 각도
      - toDegrees : 회전 끝 각도
      - pivotX : 확대 축소 x축 기준점
      - pivotY : 확대 축소 y축 기준점

    ``` java
    //사용 예시
    Animation anim = AnimationUtils.loadAnimation(this, R.anim.in); // 해당 .xml 파일명 
    imageView.startAnimation(anim); // startAnimation 통해 실행
    ``` 

     ``` java
     //제어
    Animation anim = AnimationUtils.loadAnimation(this, R.anim.in);
    anim.setAnimationListener(new Animation.AnimationListener() {
    // in 시작시 
    @Override
    public void onAnimationStart(Animation animation) {
    }
    // in 종료시 
    @Override
    public void onAnimationEnd(Animation animation) {
    }
    // in 반복시
    @Override
    public void onAnimationRepeat(Animation animation) {
    }
    });
    imageView.startAnimation(anim);
    ``` 
    
#### 7.1.2.2 색상, 크기 리소스

- vakues 폴더 하위 통칭 -> 파일명이 아닌 태크의 속성 값으로 자바에서 식별 
  - 문자열 : strings.xml 	
  - 색상 : colors.xml		
  - 스타일 : styles.xml		
  - 배열 : arrays.xml		
  - 크기 : dimens.xml	


#### 7.1.2.3 스타일 리소스

#### 7.1.2.4 테마 리소스