<h1>comento_API</h1>
<h3>1주차 개발 환경 셋팅</h3>

1. [JDK 1.8 설치]

2. [Eclipse, Spring 다운로드 및 설치]

3. [톰캣 설정]

4. [Hello World 출력]


 <img src="/img/(5).png" width="600" height="200">

5. [mariaDB, mySql WorkBench 설치 및 샘플 DB 구축]


<img src="/img/(8).png" width="600" height="200">

<img src="/img/(6).png" width="600" height="200">



6. [스프링, Mariadb, MyBatis 연동, 데이터 조회]

<img src="/img/(7).png" width="600" height="200">


<h1> 2주차 API 가이드 문서 초안 작성 </h1>

<h4>1.HTTP (Hypertext Transfer Protocol)</h4>
하이퍼텍스트 (Hyper Text란 컴퓨터 화면이나 전자 기기에서 볼 수 있는 있는 텍스트(데이터))문서를 교환하기 위한 규약이다.

<h4>2.HTTP의 특징</h4>

- HTTP 메시지는 HTTP 서버와 HTTP 클라이언트에 의해서 해석된다.<br>
- TCP/IP를 이용하는 응용 프로토콜(application protocol)<br>
- HTTP는 연결 상태를 유지하지 않는 비연결성 프로토콜 <br>
💬 클라이언트와 서버가 한 번 연결을 맺은 후, 클 라이언트 요청에 대해 서버가 응답을 마치면 맺었던 연결을 끊어 버리는 성질<br>
💬 stateless: server side에 client와 server의 동작, 상태정보를 저장하지 않는 형태, server의 응답이 client와의 세션 상태와 독립적<br>
- HTTP는 연결을 유지하지 않는 프로토콜이기 떄문에 요청/응답(request/response) 방식이다

예를들면, 클라이언트(client) 즉, 사용자가 브라우저를 통해서 어떠한 서비스를 url을 통하거나 다른 것을 통해서 요청(request)을 하면
서버에서는 해당 요청사항에 맞는 결과를 찾아서 사용자에게 응답(response)하는 형태로 동작한다.
<img src="https://camo.githubusercontent.com/3bbfd974922b47fe054d8a9e4d28a4664bd938a70c57e456dcb5becaa1d565d3/68747470733a2f2f62797465736f666769676162797465732e636f6d2f494d414745532f4e6574776f726b696e672f48545450636f6d6d756e636174696f6e2f68747470253230636f6d6d756e69636174696f6e2e706e67" width="500">

- 요청 : client -> server
- 응답 : server -> client


<h4>3.HTTP 주요 Method</h4>

| HTTP Method |     설명     |
|:-----------:|:-----------:|
| GET  |  존재하는 자원에 대한 요청 |
| POST | 새로운 자원을 생성  | 
| PUT |  존재하는 자원에 대한 변경 | 
| DELETE |  존재하는 자원에 대한 삭제  | 


<h4>4.HTTP 응답 코드</h4>

| 상태코드 |     내용      |
|:-----------:|:-----------:|
| 200 |  성공 |
| 201 |  자원생성요청 성공  | 

| 상태코드 |     내용      |
|:-----------:|:-----------:|
| 400|  클라이언트의 요청 부적절 |
| 401 | 클라이언트가 권한이 없는 자원(Resource)를 요청  | 
| 403 | 보호된 자원을 요청  | 
| 405 | 클라이언트가 요청한 리소스에서는 사용 불가능한 Method를 이용  | 

| 상태코드 |     내용      |
|:-----------:|:-----------:|
| 301 |  클라이언트가 요청한 리소스에 대한 URI가 변경 됨 |
| 500 | 서버에 문제 발생 | 


<h4> :monocle_face:웹의 동작 방식</h4>

①② 사용자가 웹 브라우저를 통해 찾고 싶은 웹 페이지의 URL 주소를 입력

<img src="https://joshua1988.github.io/images/posts/web/http/url-structure.png" width="500">

③ 사용자가 입력한 URL 주소 중에서 도메인 네임(domain name) 부분을 DNS 서버에서 검색한다.

④ DNS 서버에서 해당 도메인 네임에 해당하는 IP 주소를 찾아 사용자가 입력한 URL 정보와 함께 전달한다.

⑤⑥ 웹 페이지 URL 정보와 전달받은 IP 주소는 HTTP 프로토콜을 사용하여 HTTP 요청 메시지를 생성한다.

이렇게 생성된 HTTP 요청 메시지는 TCP 프로토콜을 사용하여 인터넷을 거쳐 해당 IP 주소의 컴퓨터로 전송한다.
 
⑦ 이렇게 도착한 HTTP 요청 메시지는 HTTP 프로토콜을 사용하여 웹 페이지 URL 정보로 변환한다.

⑧ 웹 서버는 도착한 웹 페이지 URL 정보에 해당하는 데이터를 검색한다.

⑨⑩ 검색된 웹 페이지 데이터는 또 다시 HTTP 프로토콜을 사용하여 HTTP 응답 메시지를 생성한다.

이렇게 생성된 HTTP 응답 메시지는 TCP 프로토콜을 사용하여 인터넷을 거쳐 원래 컴퓨터로 전송된다.
 
⑪ 도착한 HTTP 응답 메시지는 HTTP 프로토콜을 사용하여 웹 페이지 데이터로 변환된다.

⑫ 변환된 웹 페이지 데이터는 웹 브라우저에 의해 출력되어 사용자가 볼 수 있게 된다.

<h4>💡1.REST</h4>
URI를 통하여 이렇듯 REST는 URI를 이용해 명시된 자원(resource)에 접근하고,
자원(resource)에 어떠한 조작(CRUD)을 할 지 HTTP 메서드로 나타내는 방법이다.

<h4>💡2.RESTful이란</h4>
RESTful은 일반적으로 REST라는 아키텍처를 구현하는 웹 서비스를 나타내기 위해 사용되는 용어이다.
‘REST API’를 제공하는 웹 서비스를 ‘RESTful’하다고 할 수 있다.
RESTful은 REST를 REST답게 쓰기 위한 방법으로, 누군가가 공식적으로 발표한 것이 아니다.
즉, REST 원리를 따르는 시스템은 RESTful이란 용어로 지칭된다.<br>

<h5>💡3.RESTful의 목적</h5>
이해하기 쉽고 사용하기 쉬운 REST API를 만드는 것이다.
RESTful한 API를 구현하는 근본적인 목적이 성능 향상에 있는 것이 아니라 일관적인 컨벤션을 통한 API의 이해도 및 호환성을 높이는 것이 주 동기이니,
성능이 중요한 상황에서는 굳이 RESTful한 API를 구현할 필요는 없다.<br>
RESTful 하지 못한 경우<br>
① CRUD 기능을 모두 POST로만 처리하는 API <br>
② route에 resource, id 외의 정보가 들어가는 경우(/students/updateName)<br>

⚡️초안 1.0.0 <br>
https://docs.google.com/uc?export=download&id=1tPVji5022tyR5ADzIyZu0xyCkx_cnO2S

<br>
<h5>🔗참조</h5>
 http://tcpschool.com/webbasic/works <br>
 https://gmlwjd9405.github.io/2018/09/21/rest-and-restful.html <br>
 https://joshua1988.github.io/web-development/http-part1/ <br>
 https://nesoy.github.io/articles/2017-02/REST <br>
 http://www.codns.com/b/B05-195 <br>
 https://velog.io/@makeitcloud/란-Stateless-Stateful-이란<br>
 https://joshua1988.github.io/web-development/http-part1/<br>
 https://victorydntmd.tistory.com/286<br>
 https://toma0912.tistory.com/69<br>
 
 
 <h1> 3주차 스프링 부트를 기반으로 간단한 API 만들기  </h1>
 
 1. 스프링 부트 환경 설정<br>
**File > New > Project > Spring Boot > Spring Starter Project** 를 클릭하여 프로젝트 생성<br>
Maven/java8<br>
Spring Boot Devtools, Spring Web, MyBatis Framework <br>
또는 <br>
<https://start.spring.io><br>
프로젝트 셋팅 <br>
**2) Pom.xml 수정**
- Dependency에는 DB 관련 내용을 포함.Lombok,mariadb,jstl 추가 
- **부트 버전은 2.2.2 수정 

**3)application.properties 수정** ( src/main/resources )

```:application.properties

server.port = 8031
server.servlet.contextPath=/
 
spring.mvc.view.prefix=/WEB-INF/views/ 
spring.mvc.view.suffix=.jsp 

devtools.livereload.enabled=true 

spring.datasource.driver-class-name=org.mariadb.jdbc.Driver 
spring.datasource.url=jdbc:mariadb://127.0.0.1:3306/statistc
spring.datasource.username=root
spring.datasource.password=*****

```

2.통계(SW활용현황) API를 위한 DB, Table 생성


3.[20년도 로그인 수 API] 스프링부트, mybatis, mariadb 연동
 


 <h1> 4주차 스프링 부트를 기반으로 간단한 API 만들기  </h1>
 
1. 년도별 접속자수 조회 <br>
<img src="/img/(13).png" width="600" height="200">
<br>
2. 월별 접속자수 조회 <br>
<img src="/img/(11).png" width="600" height="200">
<br>
3.부서별 월 접속자수 조회<br>
<img src="/img/(3).png" width="600" height="200">
<br>
4.일별 접속자수 조회<br>
<img src="/img/(12).png" width="600" height="200">
<br>
5.하루 평균 접속자수 조회<br>
<img src="/img/(2).png" width="600" height="200">
6.게시글 수 조회<br>
<img src="/img/(4).png" width="600" height="200">
 <br>
7.공휴일을 제외한 월 접속자수 조회<br>
<img src="/img/Untitled.png" width="600" height="200">
<br>
 
