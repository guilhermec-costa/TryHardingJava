#!/sbin/env bash

dependencies=(
    "./"
    "target/classes"
    "lib/h2-2.2.224.jar"
)

main_class=com.javaIntro.JDBCIntro.JDBCIntro
dependencies_string=""
dependencies_length=${#dependencies[@]}

for ((i=0; i<=$dependencies_length; i++)); do
    if [[ $i -eq 0 ]]; then
        dependencies_string+="${dependencies[$i]}"
        continue
    fi

    dependencies_string+=":${dependencies[$i]}"
done
#
echo $dependencies_string
java -cp $dependencies_string $main_class

