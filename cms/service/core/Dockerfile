FROM hseeberger/scala-sbt:11.0.4_1.3.5_2.12.10

WORKDIR /app
COPY . /app
RUN sbt package

EXPOSE 9000

CMD ["sbt", "run"]
