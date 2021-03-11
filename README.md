<h1>comento_API</h1>
<h3>1주차 개발 환경 셋팅</h3>

1. [JDK 1.8 설치]

2. [Eclipse, Spring 다운로드 및 설치]

3. [톰캣 설정]

4. [Hello World 출력]

<img src="https://s3.us-west-2.amazonaws.com/secure.notion-static.com/3571e253-6959-4ad9-b1e0-8a186dde843b/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAT73L2G45O3KS52Y5%2F20210304%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20210304T064849Z&X-Amz-Expires=86400&X-Amz-Signature=25099d485df161d98b89890b18c113fbcbb9d1283fcb81b62e67dac809d847d7&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22" width="500">


5. [mariaDB, mySql WorkBench 설치 및 샘플 DB 구축]

<img src="https://s3.us-west-2.amazonaws.com/secure.notion-static.com/8b6243fb-e68c-4552-b34b-13c395b95ae2/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAT73L2G45O3KS52Y5%2F20210304%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20210304T064939Z&X-Amz-Expires=86400&X-Amz-Signature=21dcf531b6196aea71d3998001a41f4977f42d48edb6455b84b49cf986b02634&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22" width="500">



<img src="https://s3.us-west-2.amazonaws.com/secure.notion-static.com/4f52c231-df95-42f5-b838-ee6496ea73d4/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAT73L2G45O3KS52Y5%2F20210304%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20210304T064753Z&X-Amz-Expires=86400&X-Amz-Signature=5fc2d59be9af78976c6a2a0ad82494fc1a9b79f98b18394517ddc0de8cebef6d&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22" width="500">


6. [스프링, Mariadb, MyBatis 연동, 데이터 조회]


<img src="https://s3.us-west-2.amazonaws.com/secure.notion-static.com/8d440e90-7dd8-454a-b804-51ca04309ebf/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAT73L2G45O3KS52Y5%2F20210304%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20210304T063549Z&X-Amz-Expires=86400&X-Amz-Signature=0a69bbda2882be4cc39dac2d091e1a9348cd0fd365b338c42d5202c8151fceba&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22" width="500">


<h1> 2주차 API 가이드 문서 초안 작성 </h1>

<h4>1.HTTP (Hypertext Transfer Protocol)</h4>
하이퍼텍스트 (Hyper Text란 컴퓨터 화면이나 전자 기기에서 볼 수 있는 있는 텍스트(데이터))문서를 교환하기 위한 규약이다.

<h4>2.HTTP의 특징</h4>

- HTTP 메시지는 HTTP 서버와 HTTP 클라이언트에 의해서 해석된다.<br>
- TCP/IP를 이용하는 응용 프로토콜(application protocol)<br>
- HTTP는 연결 상태를 유지하지 않는 비연결성 프로토콜 <br>
💬 클라이언트와 서버가 한 번 연결을 맺은 후, 클 라이언트 요청에 대해 서버가 응답을 마치면 맺었던 연결을 끊어 버리는 성질<br>
💬 stateless: server side에 client와 server의 동작, 상태정보를 저장하지 않는 형태, server의 응답이 client와의 세션 상태와 독립적임<br>
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
 Q <br> 
 API를 설계 할때 Path Variable과 Query Parameter  둘 중 하나를 선택해야하나요? 아니면 혼용해도 괜찮은가요? <br>
 네트워크 대해서 어느정도 지식이 있어야 할까요?<br>
 협업시 주의해할 점이 있다면 무엇일까요?<br>
