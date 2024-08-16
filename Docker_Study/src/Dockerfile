# MySQL 공식 이미지를 기본 이미지로 사용
FROM mysql:8.0

# 환경 변수 설정
ENV MYSQL_ROOT_PASSWORD=0000
ENV MYSQL_DATABASE=myapp
ENV MYSQL_USER=user
ENV MYSQL_PASSWORD=0000

# SQL 스크립트를 도커 이미지 내부로 복사
COPY ./sql_scripts/ /docker-entrypoint-initdb.d/

# MySQL이 사용할 포트 설정 (기본값은 3306)
EXPOSE 3306
