# springboot-dubbo

##1. 首先安装Zookeper
我这里安装的是：[zookeeper-3.4.14](`https://zookeeper.apache.org/releases.html#download`)，windows安装可参考这篇博客：[在win10下安装配置Zookeeper教程](`https://blog.csdn.net/sndayYU/article/details/89236159`)，并启动bin目录下的client和server。

##2. 从github上拉取dubbo-admin代码

地址：`https://github.com/apache/dubbo-admin.git`
![项目目录结构](https://img-blog.csdnimg.cn/2020070611512542.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2xpbm1lbmdtZW5nXzEzMTQ=,size_16,color_FFFFFF,t_70)

运行`DubboAdminApplication.java`即可。默认用户名和密码为root，自定义的话，可以修改`application.properties`里面的`spring.root.password`的值。
正常启动后访问：http://localhost:7001/，用户名和密码为root。登录可以看到：
![在这里插入图片描述](https://img-blog.csdnimg.cn/20200706115501246.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2xpbm1lbmdtZW5nXzEzMTQ=,size_16,color_FFFFFF,t_70)

这里我已经启动了项目，所以统计那里可以显示出服务的数量。

##3. 拉取github代码

地址：`https://github.com/linmengmeng-1314/springboot-dubbo.git`

依次启动provider-consumer，其中api项目会自动安装，如果provider和consumer引用api报错时，可以使用maven install安装api项目。

访问[http://localhost:9090/hi](`http://localhost:9090/hi`),可以看到返回为：Hello Dubbo