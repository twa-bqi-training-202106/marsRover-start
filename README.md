# checkstyle-demo
1. checkstyle插件和初始化git pre-commit脚本配置在checkstyle.gradle中，在build.gradle中apply
2. checkstyle规则和pre-commit脚本在config/checkstyle目录中
3. 代码pull到本地后，需要执行./gradlew clean build来初始化git pre-commit脚本
