# 3장  사용자 인터페이스

## 3.2. 뷰 아키텍처
- 뷰 클래스 라이브러리 ex) Button, TextView, EditText, ImageView, Spinner, ListView ...등
- 뷰 클레스의 구조

### 3.2.1 뷰의 계층구조
- 소프트웨어 모델 : `DOM(Doccument Object Model)`
- 패턴(Pattern): `Gof 다자인패턴의 Composite 패턴`
- 계층 구조 트리(tree)의 맨위에 위치한 루트(root)뷰와 그 밑의 가지에 위치한 자식뷰
### > view
>> ViewGroup
> >
>> TextView
