#!/sbin/env bash

main_class=com.javaIntro.JDBCIntro.JDBCIntro
current_path=$(cat "$HOME/dev/Java/LearningJava/JDBCIntro/classpath.txt")
java -cp "$current_path" $main_class

