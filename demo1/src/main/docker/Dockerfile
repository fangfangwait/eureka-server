FROM java:8
VOLUME /tmp
ADD demo1-0.0.1-SNAPSHOT.jar demo1.jar
RUN bash -c 'touch /demo1.jar'
EXPOSE 8012
ENTRYPOINT [ "java",  "-jar", "/demo1.jar", "--spring.profiles.active=dev"]

#FROM：选择的jdk
#EXPOSE 是端口号和server.port=8082一致
#ADD：第一个jar是打包的项目名 第二个是别名

#FROM java:8
#EXPOSE 8092
#
##指定了临时文件目录为/tmp。其效果是在主机 /var/lib/docker 目录下创建了一个临时文件，并链接到容器的/tmp,
##/tmp目录用来持久化到 Docker 数据文件夹，因为 Spring Boot 使用的内嵌 Tomcat 容器默认使用/tmp作为工作目录
#VOLUME /tmp
#ADD demo1-0.0.2.jar  /app.jar
#RUN bash -c 'touch /app.jar'
#RUN cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime && echo 'Asia/Shanghai' >/etc/timezone
#ENTRYPOINT ["java","-jar","/app.jar","--spring.profiles.active=dev"]