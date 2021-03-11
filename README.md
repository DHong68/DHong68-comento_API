<h1>comento_API</h1>
<h3>1주차 개발 환경 셋팅</h3>

1. [JDK 1.8 설치]

2. [Eclipse, Spring 다운로드 및 설치]

3. [톰캣 설정]

4. [Hello World 출력]
![helloworld](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/3571e253-6959-4ad9-b1e0-8a186dde843b/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAT73L2G45O3KS52Y5%2F20210304%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20210304T064849Z&X-Amz-Expires=86400&X-Amz-Signature=25099d485df161d98b89890b18c113fbcbb9d1283fcb81b62e67dac809d847d7&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22)

5. [mariaDB, mySql WorkBench 설치 및 샘플 DB 구축]

![mariaDB](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/8b6243fb-e68c-4552-b34b-13c395b95ae2/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAT73L2G45O3KS52Y5%2F20210304%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20210304T064939Z&X-Amz-Expires=86400&X-Amz-Signature=21dcf531b6196aea71d3998001a41f4977f42d48edb6455b84b49cf986b02634&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22)

![DB구축](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/4f52c231-df95-42f5-b838-ee6496ea73d4/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAT73L2G45O3KS52Y5%2F20210304%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20210304T064753Z&X-Amz-Expires=86400&X-Amz-Signature=5fc2d59be9af78976c6a2a0ad82494fc1a9b79f98b18394517ddc0de8cebef6d&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22)

6. [스프링, Mariadb, MyBatis 연동, 데이터 조회]

![결과](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/8d440e90-7dd8-454a-b804-51ca04309ebf/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAT73L2G45O3KS52Y5%2F20210304%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20210304T063549Z&X-Amz-Expires=86400&X-Amz-Signature=0a69bbda2882be4cc39dac2d091e1a9348cd0fd365b338c42d5202c8151fceba&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22)


<h3>2차 프론트엔드 개발자와 백엔드 개발자의 협업 이해하기 </h3>

<h5>HTTP (Hypertext Transfer Protocol)</h5>
하이퍼텍스트 (Hyper Text란 컴퓨터 화면이나 전자 기기에서 볼 수 있는 있는 텍스트(데이터))문서를 교환하기 위한 규약

![](https://bytesofgigabytes.com/IMAGES/Networking/HTTPcommuncation/http%20communication.png)

HTTP 응답 코드
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


 

①② 사용자가 웹 브라우저를 통해 찾고 싶은 웹 페이지의 URL 주소를 입력

![](http://www.codns.com/image/url11.png)

③ 사용자가 입력한 URL 주소 중에서 도메인 네임(domain name) 부분을 DNS 서버에서 검색한다.

④ DNS 서버에서 해당 도메인 네임에 해당하는 IP 주소를 찾아 사용자가 입력한 URL 정보와 함께 전달한다.

⑤⑥ 웹 페이지 URL 정보와 전달받은 IP 주소는 HTTP 프로토콜을 사용하여 HTTP 요청 메시지를 생성한다.

이렇게 생성된 HTTP 요청 메시지는 TCP 프로토콜을 사용하여 인터넷을 거쳐 해당 IP 주소의 컴퓨터로 전송한다.
 
⑦ 이렇게 도착한 HTTP 요청 메시지는 HTTP 프로토콜을 사용하여 웹 페이지 URL 정보로 변환한다.

⑧ 웹 서버는 도착한 웹 페이지 URL 정보에 해당하는 데이터를 검색한다.

⑨⑩ 검색된 웹 페이지 데이터는 또 다시 HTTP 프로토콜을 사용하여 HTTP 응답 메시지를 생성한다.

이렇게 생성된 HTTP 응답 메시지는 TCP 프로토콜을 사용하여 인터넷을 거쳐 원래 컴퓨터로 전송된다.
 
⑪ 도착한 HTTP 응답 메시지는 HTTP 프로토콜을 사용하여 웹 페이지 데이터로 변환된다

⑫ 변환된 웹 페이지 데이터는 웹 브라우저에 의해 출력되어 사용자가 볼 수 있게 된다




💡Rest
URI를 통하여 이렇듯 REST는 URI를 이용해 명시된 자원(resource)에 접근하고,
자원(resource)에 어떠한 조작(CRUD)을 할 지 HTTP 메서드로 나타내는 방법이다.

💡RESTful이란
RESTful은 일반적으로 REST라는 아키텍처를 구현하는 웹 서비스를 나타내기 위해 사용되는 용어이다.
‘REST API’를 제공하는 웹 서비스를 ‘RESTful’하다고 할 수 있다.
RESTful은 REST를 REST답게 쓰기 위한 방법으로, 누군가가 공식적으로 발표한 것이 아니다.
즉, REST 원리를 따르는 시스템은 RESTful이란 용어로 지칭된다.

RESTful의 목적
이해하기 쉽고 사용하기 쉬운 REST API를 만드는 것
RESTful한 API를 구현하는 근본적인 목적이 성능 향상에 있는 것이 아니라 일관적인 컨벤션을 통한 API의 이해도 및 호환성을 높이는 것이 주 동기이니, 
성능이 중요한 상황에서는 굳이 RESTful한 API를 구현할 필요는 없다.
RESTful 하지 못한 경우
Ex1) CRUD 기능을 모두 POST로만 처리하는 API
Ex2) route에 resource, id 외의 정보가 들어가는 경우(/students/updateName)


🔗 참고
 http://tcpschool.com/webbasic/works 
 https://gmlwjd9405.github.io/2018/09/21/rest-and-restful.html
 https://joshua1988.github.io/web-development/http-part1/
 https://nesoy.github.io/articles/2017-02/REST
 http://www.codns.com/b/B05-195


* Q 
 Path Variable과 Query Parameter 혼용해서 작성해도 괜찮을까요?
 네트워크 부분에 대해서 어느정도 지식이 있어야 할까요? 
