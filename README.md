# rest-spring-kafka
Descargar kafka para windows:
https://kafka.apache.org/downloads

Después extraer en C:\ de esta manera C:\kafka
Lanzar estos dos comandos:

cd C:\kafka

bin\windows\zookeeper-server-start.bat config\zookeeper.properties

Con Zookeeper ejecutándose, necesitamos agregar el wmic archivo ejecutable que usa Kafka en nuestro sistema PATH:
set PATH=C:\Windows\System32\wbem\;%PATH%;

Lanza estos comandos en un nuevo cmd:

cd C:\kafka

bin\windows\kafka-server-start.bat config\server.properties

