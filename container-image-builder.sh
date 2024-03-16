#!/bin/bash

# 하위 디렉토리 목록
directories=("producer" "consumer" "warehouse")

# 각 디렉토리 빌드
for directory in "${directories[@]}"
do
  echo "Building project in directory: $directory-img"
  cd ./$directory
  ./gradlew build
  docker build -t "$directory" --no-cache .
  cd ../
done

echo "All projects built successfully!"

exit
