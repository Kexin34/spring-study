## 常用依赖
```xml
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-webmvc</artifactId>
    <version>5.2.0.RELEASE</version>
</dependency>
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-jdbc</artifactId>
    <version>5.2.0.RELEASE</version>
</dependency>
```
## 注解说明
- @Autowired ：自动装备通过类型。名字
    如果Autowired不能唯一自动装配上属性，则需要通过 @Qualifier(value="xxx")
- @Nullable字段标记了这个注解，说明这个字段可以为null；
- @Resource： 自动装备通过类型。类型
  
- @Component: 组件，放在类上，说明这个类被Spring管理了，就是bean！
