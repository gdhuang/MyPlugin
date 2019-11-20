# setup
- brew install groovy

  - groovyConsole

- brew install gradle

- issue 
  - gradle 5.6/groovy 2.5 not compatible with jdk 13

    * switch jdk version: in .bash_profile, export JAVA_HOME=`/usr/libexec/java_home -v 1.8`
    * specify jdk version for gradle: in gradle.properties, add org.gradle.java.home=/Library/Java/JavaVirtualMachines/jdk1.8.0_211.jdk/Contents/Home


# gradle project

## Create a plugin project
- git clone https://github.com/gdhuang/MyPlugin

- cd MyPlugin; gradle init
  - project name: Greeting
    package: org.example
![myplugin](./myplugin.png)

  * go through build.gradle and add maven publish
  * go through GreetingPlugin
  * unit test and unit test

* git clone https://github.com/gdhuang/MyProject
  gradle greeting


## Write task type
- git checkout a (you might need git clean -fd and git stash)
- check build.gradle in functional test resource
- create GreetingTask.java
  - properties and getter/setter
  - @TaskAction

ref: https://github.com/gdhuang/MyPlugin/commit/2112d341f004a4ca45e29cafbf387fd1bac758f1

## DSL
- git checkout b
- check build.gradle in functional test resource
- create GreetingExtension.java
  - property hello and getter/setter
  - add Person.java for nested DSL
  
- add GreetingExtension to project's extension container.
  
ref: https://github.com/gdhuang/MyPlugin/commit/1e34cf9ff811a25c4558f91fdc8a0a28d99e7375

## Named DSL 
- git checkout c
- check build.gradle in functional test resource
- create domain object, Person, with property name
- create NamedDomainObjectContainer<person> and
  add it to Project's extensions
- register task for each person  

ref: https://github.com/gdhuang/MyPlugin/commit/a4699b6f3dbe05408a1ec94f57e9e2166f75e4c5

## React to plugins
- git checkout d
- check unit test
- add sourceSet functionalTest for Java plugin

ref: https://github.com/gdhuang/MyPlugin/commit/b5476f5d7125fbb1a2f028ccc087e2254bda1c5d
