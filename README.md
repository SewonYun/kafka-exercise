# kafka-exercise

jdk version: 17 temurin

---

<aside>
💡 본 문서에서는 카프카와 레디스를 이용하여 데이터 파이프라인을 설계하는 방법을 Java Spring 예시를 통해 설명합니다.
</aside>
[kafka stater documentation](https://kafka.apache.org/documentation/#gettingStarted)

---
**시나리오**

다음과 같은 시나리오를 가정합니다.

- **데이터 소스:** 웹사이트 방문 로그
- **처리:** 방문 로그에서 IP 주소, 페이지 조회 정보 추출
- **저장:** 추출된 정보를 데이터 웨어하우스에 저장
- **통계:** 데이터 웨어하우스에 저장된 데이터를 통계에 적합한 스키마로 가공
- **구성:** 쿠버네티스 를 활용하여 카프카 의 분산 처리 테스트를 합니다.


---

# Mono repository style git structure( - feature 개발 목표)
<h2>Producer</h2>
    Kakfa client
<h2>Broker</h2>
    Apache Kafaka (version),
    Clustering (Zookeeper),
    Topic (partition),
    Offset,
    Commit,
    Failover,
    Trusted event persistence (kafka default value change to  version)
<h2>Consumer</h2>
    Kakfa client,
    Consumer group,
    Stream,
    Redis Cache
<h2>Data Warehouse</h2>
    Mysql,
    JPA transaction

---
![Screenshot_20240313_100408_Noteshelf](https://github.com/SewonYun/kafka-exercise/assets/11643989/903c15b2-d59d-4927-ab42-89d9fc07383d)
<img width="1348" alt="스크린샷 2024-03-21 오전 1 37 57" src="https://github.com/SewonYun/kafka-exercise/assets/11643989/ecda1c24-406f-415c-88d4-3e24dfcf607e">


