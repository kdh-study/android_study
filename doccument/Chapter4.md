# 4장 레이아웃을 활용한 다양한 뷰 배치

## 속성 크기 기입 참고


- 대부분에 크기는 dp 권장

- 이유 : 시스템에서 스마트폰의 화면에 dpi에 따라 논리적인 크기를 계산해서 적용 -> 다양한 크기 호환

- 문자열의 경우는 sp 권장



## 3장 참고 공통 속성 기능 

- margin -> 해당 태그 객체의 외부 

<pre>
        
  <-->  │  view  | <-->
                                           
  android : margin       = "24pb"  ←↑↓→ 전방향 외부
  android : marginLeft   = "24pb"  ←  
  android : marginRight  = "24pb"  →
  android : marginTop    = "24pb"  ↑
  android : marginBottom = "24pb"  ↓

</pre>




- padding -> 해당 태그 객체의 내부 

<pre>

  <-->  |  view  | <-->

  android : paddingLeft   = "24pb"  ←
  android : paddingRight  = "24pb"  → 
  android : paddingTop    = "24pb"  ↑
  android : paddingBottom = "24pb"  ↓

</pre>