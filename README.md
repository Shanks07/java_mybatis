# java_mybatis
mybatis_reference


1.将jar包全部拷贝到 web-inf 下面的lib中，目的是将别人写好的class文件引入本项目，方便调用
2.将properties 和config.xml 项目连接数据库和日志配置的文件拷贝到src
3.新建mapper包，新建和数据库表对应的XXXMapper.java和XXXMapper.xml
4.XXXmapper java文件提供空的数据库的方法
5.XXXMapper XML文件注意以下对应
    5.1 namespace 和完整的 mapper类名对应
    5.2 class 和完整的数据库对应的类名对应
    5.3 select标签和查询方法对应，id对应方法名，resultMap对应基础全字段的结果集

6. jdbc properties配置文件参考数据库界面的内容填写好连接字符串，主机名 端口号，数据库名 用户名 密码

7. 参考dao 编写mapper接口初始化和方法调用

8. 参考XXS 将对应XXDao做成成员变量。并调用dao的对应方法实现功能，如果需要web调用
对应case选项调用 XXS中的方法
